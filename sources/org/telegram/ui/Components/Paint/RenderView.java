package org.telegram.ui.Components.Paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.TextureView;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Size;
public class RenderView extends TextureView {
    private Bitmap bitmap;
    private Bitmap blurBitmap;
    private Brush brush;
    private int color;
    private RenderViewDelegate delegate;
    private boolean firstDrawSent;
    private Input input;
    private CanvasInternal internal;
    private Painting painting;
    private DispatchQueue queue;
    private ShapeInput shapeInput;
    private boolean shuttingDown;
    private boolean transformedBitmap;
    private UndoStore undoStore;
    private float weight;

    public interface RenderViewDelegate {

        public final class CC {
            public static void $default$invalidateInputView(RenderViewDelegate renderViewDelegate) {
            }
        }

        void invalidateInputView();

        void onBeganDrawing();

        void onFinishedDrawing(boolean z);

        void onFirstDraw();

        void resetBrush();

        boolean shouldDraw();
    }

    public void selectBrush(Brush brush) {
    }

    public RenderView(Context context, Painting painting, Bitmap bitmap, Bitmap bitmap2, BlurringShader.BlurManager blurManager) {
        super(context);
        setOpaque(false);
        this.bitmap = bitmap;
        this.blurBitmap = bitmap2;
        this.painting = painting;
        painting.setRenderView(this);
        setSurfaceTextureListener(new AnonymousClass1(blurManager));
        this.input = new Input(this);
        this.shapeInput = new ShapeInput(this, new Runnable() {
            @Override
            public final void run() {
                RenderView.this.lambda$new$0();
            }
        });
        this.painting.setDelegate(new Painting.PaintingDelegate() {
            @Override
            public void contentChanged() {
                if (RenderView.this.internal != null) {
                    RenderView.this.internal.scheduleRedraw();
                }
            }

            @Override
            public UndoStore requestUndoStore() {
                return RenderView.this.undoStore;
            }

            @Override
            public DispatchQueue requestDispatchQueue() {
                return RenderView.this.queue;
            }
        });
    }

    public class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        final BlurringShader.BlurManager val$blurManager;

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        AnonymousClass1(BlurringShader.BlurManager blurManager) {
            this.val$blurManager = blurManager;
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (surfaceTexture == null || RenderView.this.internal != null) {
                return;
            }
            RenderView.this.internal = new CanvasInternal(surfaceTexture, this.val$blurManager);
            RenderView.this.internal.setBufferSize(i, i2);
            RenderView.this.updateTransform();
            RenderView.this.post(new Runnable() {
                @Override
                public final void run() {
                    RenderView.AnonymousClass1.this.lambda$onSurfaceTextureAvailable$0();
                }
            });
            if (RenderView.this.painting.isPaused()) {
                RenderView.this.painting.onResume();
            }
        }

        public void lambda$onSurfaceTextureAvailable$0() {
            if (RenderView.this.internal != null) {
                RenderView.this.internal.requestRender();
            }
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (RenderView.this.internal == null) {
                return;
            }
            RenderView.this.internal.setBufferSize(i, i2);
            RenderView.this.updateTransform();
            RenderView.this.internal.requestRender();
            RenderView.this.internal.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    RenderView.AnonymousClass1.this.lambda$onSurfaceTextureSizeChanged$1();
                }
            });
        }

        public void lambda$onSurfaceTextureSizeChanged$1() {
            if (RenderView.this.internal != null) {
                RenderView.this.internal.requestRender();
            }
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (RenderView.this.internal != null && !RenderView.this.shuttingDown) {
                RenderView.this.painting.onPause(new Runnable() {
                    @Override
                    public final void run() {
                        RenderView.AnonymousClass1.this.lambda$onSurfaceTextureDestroyed$2();
                    }
                });
            }
            return true;
        }

        public void lambda$onSurfaceTextureDestroyed$2() {
            RenderView.this.internal.shutdown();
            RenderView.this.internal = null;
        }
    }

    public void lambda$new$0() {
        RenderViewDelegate renderViewDelegate = this.delegate;
        if (renderViewDelegate != null) {
            renderViewDelegate.invalidateInputView();
        }
    }

    public void redraw() {
        CanvasInternal canvasInternal = this.internal;
        if (canvasInternal == null) {
            return;
        }
        canvasInternal.requestRender();
    }

    public boolean onTouch(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        CanvasInternal canvasInternal = this.internal;
        if (canvasInternal != null && canvasInternal.initialized && this.internal.ready) {
            if (this.brush instanceof Brush.Shape) {
                this.shapeInput.process(motionEvent, getScaleX());
            } else {
                this.input.process(motionEvent, getScaleX());
            }
        }
        return true;
    }

    public void onDrawForInput(Canvas canvas) {
        if (this.brush instanceof Brush.Shape) {
            this.shapeInput.dispatchDraw(canvas);
        }
    }

    public void setUndoStore(UndoStore undoStore) {
        this.undoStore = undoStore;
    }

    public void setQueue(DispatchQueue dispatchQueue) {
        this.queue = dispatchQueue;
    }

    public void setDelegate(RenderViewDelegate renderViewDelegate) {
        this.delegate = renderViewDelegate;
    }

    public Painting getPainting() {
        return this.painting;
    }

    public float brushWeightForSize(float f) {
        float f2 = this.painting.getSize().width;
        return (0.00390625f * f2) + (f2 * 0.043945312f * f);
    }

    public int getCurrentColor() {
        return this.color;
    }

    public void setColor(int i) {
        this.color = i;
        if (this.brush instanceof Brush.Shape) {
            this.shapeInput.onColorChange();
        }
    }

    public float getCurrentWeight() {
        return this.weight;
    }

    public void setBrushSize(float f) {
        this.weight = brushWeightForSize(f);
        if (this.brush instanceof Brush.Shape) {
            this.shapeInput.onWeightChange();
        }
    }

    public Brush getCurrentBrush() {
        return this.brush;
    }

    public UndoStore getUndoStore() {
        return this.undoStore;
    }

    public void setBrush(Brush brush) {
        if (this.brush instanceof Brush.Shape) {
            this.shapeInput.stop();
        }
        this.brush = brush;
        updateTransform();
        this.painting.setBrush(this.brush);
        Brush brush2 = this.brush;
        if (brush2 instanceof Brush.Shape) {
            this.shapeInput.start(((Brush.Shape) brush2).getShapeShaderType());
        }
    }

    public void resetBrush() {
        RenderViewDelegate renderViewDelegate = this.delegate;
        if (renderViewDelegate != null) {
            renderViewDelegate.resetBrush();
        }
        this.input.ignoreOnce();
    }

    public void clearShape() {
        ShapeInput shapeInput = this.shapeInput;
        if (shapeInput != null) {
            shapeInput.clear();
        }
    }

    public void updateTransform() {
        if (this.internal == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float width = this.painting != null ? getWidth() / this.painting.getSize().width : 1.0f;
        float f = width > 0.0f ? width : 1.0f;
        Size size = getPainting().getSize();
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f, -f);
        matrix.preTranslate((-size.width) / 2.0f, (-size.height) / 2.0f);
        if (this.brush instanceof Brush.Shape) {
            this.shapeInput.setMatrix(matrix);
        } else {
            this.input.setMatrix(matrix);
        }
        this.painting.setRenderProjection(GLMatrix.MultiplyMat4f(GLMatrix.LoadOrtho(0.0f, this.internal.bufferWidth, 0.0f, this.internal.bufferHeight, -1.0f, 1.0f), GLMatrix.LoadGraphicsMatrix(matrix)));
    }

    public boolean shouldDraw() {
        RenderViewDelegate renderViewDelegate = this.delegate;
        return renderViewDelegate == null || renderViewDelegate.shouldDraw();
    }

    public void onBeganDrawing() {
        RenderViewDelegate renderViewDelegate = this.delegate;
        if (renderViewDelegate != null) {
            renderViewDelegate.onBeganDrawing();
        }
    }

    public void onFinishedDrawing(boolean z) {
        RenderViewDelegate renderViewDelegate = this.delegate;
        if (renderViewDelegate != null) {
            renderViewDelegate.onFinishedDrawing(z);
        }
    }

    public void shutdown() {
        this.shuttingDown = true;
        if (this.internal != null) {
            performInContext(new Runnable() {
                @Override
                public final void run() {
                    RenderView.this.lambda$shutdown$1();
                }
            });
        }
        setVisibility(8);
    }

    public void lambda$shutdown$1() {
        this.painting.cleanResources(this.transformedBitmap);
        this.internal.shutdown();
        this.internal = null;
    }

    public void lambda$clearAll$2() {
        this.painting.setBrush(this.brush);
    }

    public void clearAll() {
        this.input.clear(new Runnable() {
            @Override
            public final void run() {
                RenderView.this.lambda$clearAll$2();
            }
        });
    }

    public class CanvasInternal extends DispatchQueue {
        private final BlurringShader.BlurManager blurManager;
        private int bufferHeight;
        private int bufferWidth;
        private Runnable drawRunnable;
        private EGL10 egl10;
        private EGLContext eglContext;
        private EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private boolean initialized;
        private volatile boolean ready;
        public Runnable safeRequestRender;
        private Runnable scheduledRunnable;
        private SurfaceTexture surfaceTexture;

        public CanvasInternal(SurfaceTexture surfaceTexture, BlurringShader.BlurManager blurManager) {
            super("CanvasInternal");
            this.drawRunnable = new AnonymousClass1();
            this.safeRequestRender = new Runnable() {
                @Override
                public final void run() {
                    RenderView.CanvasInternal.this.lambda$new$0();
                }
            };
            this.blurManager = blurManager;
            this.surfaceTexture = surfaceTexture;
        }

        @Override
        public void run() {
            if (RenderView.this.bitmap == null || RenderView.this.bitmap.isRecycled()) {
                return;
            }
            this.initialized = initGL();
            super.run();
        }

        private boolean initGL() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            }
            if (!this.egl10.eglInitialize(eglGetDisplay, new int[2])) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglInitialize failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            }
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglChooseConfig failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                }
                finish();
                return false;
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                BlurringShader.BlurManager blurManager = this.blurManager;
                EGLContext eglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, blurManager != null ? blurManager.getParentContext() : EGL10.EGL_NO_CONTEXT, iArr2);
                this.eglContext = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglCreateContext failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                    }
                    finish();
                    return false;
                }
                BlurringShader.BlurManager blurManager2 = this.blurManager;
                if (blurManager2 != null) {
                    blurManager2.acquiredContext(eglCreateContext);
                    this.blurManager.attach(this.safeRequestRender);
                }
                SurfaceTexture surfaceTexture = this.surfaceTexture;
                if (surfaceTexture instanceof SurfaceTexture) {
                    EGLSurface eglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, eGLConfig, surfaceTexture, null);
                    this.eglSurface = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("createWindowSurface failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        }
                        finish();
                        return false;
                    } else if (!this.egl10.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        }
                        finish();
                        return false;
                    } else {
                        GLES20.glEnable(3042);
                        GLES20.glDisable(3024);
                        GLES20.glDisable(2960);
                        GLES20.glDisable(2929);
                        RenderView.this.painting.setupShaders();
                        checkBitmap();
                        RenderView.this.painting.setBitmap(RenderView.this.bitmap, RenderView.this.blurBitmap);
                        Utils.HasGLError();
                        return true;
                    }
                }
                finish();
                return false;
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
                return false;
            }
        }

        private void checkBitmap() {
            Size size = RenderView.this.painting.getSize();
            if (RenderView.this.bitmap.getWidth() != size.width || RenderView.this.bitmap.getHeight() != size.height) {
                Bitmap createBitmap = Bitmap.createBitmap((int) size.width, (int) size.height, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(RenderView.this.bitmap, (Rect) null, new RectF(0.0f, 0.0f, size.width, size.height), (Paint) null);
                RenderView.this.bitmap = createBitmap;
                RenderView.this.transformedBitmap = true;
            }
            if (RenderView.this.blurBitmap != null) {
                if (RenderView.this.blurBitmap.getWidth() == size.width && RenderView.this.blurBitmap.getHeight() == size.height) {
                    return;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap((int) size.width, (int) size.height, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap2).drawBitmap(RenderView.this.blurBitmap, (Rect) null, new RectF(0.0f, 0.0f, size.width, size.height), (Paint) null);
                RenderView.this.blurBitmap = createBitmap2;
                RenderView.this.transformedBitmap = true;
            }
        }

        public boolean setCurrentContext() {
            if (this.initialized) {
                if (this.eglContext.equals(this.egl10.eglGetCurrentContext()) && this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                    return true;
                }
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                return egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
            }
            return false;
        }

        public class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override
            public void run() {
                if (!CanvasInternal.this.initialized || RenderView.this.shuttingDown) {
                    return;
                }
                CanvasInternal.this.setCurrentContext();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, CanvasInternal.this.bufferWidth, CanvasInternal.this.bufferHeight);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                RenderView.this.painting.render();
                GLES20.glBlendFunc(1, 771);
                CanvasInternal.this.egl10.eglSwapBuffers(CanvasInternal.this.eglDisplay, CanvasInternal.this.eglSurface);
                if (!RenderView.this.firstDrawSent) {
                    RenderView.this.firstDrawSent = true;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            RenderView.CanvasInternal.AnonymousClass1.this.lambda$run$0();
                        }
                    });
                }
                if (CanvasInternal.this.ready) {
                    return;
                }
                CanvasInternal.this.ready = true;
            }

            public void lambda$run$0() {
                RenderView.this.delegate.onFirstDraw();
            }
        }

        public void setBufferSize(int i, int i2) {
            this.bufferWidth = i;
            this.bufferHeight = i2;
        }

        public void requestRender() {
            postRunnable(this.drawRunnable);
        }

        public void lambda$new$0() {
            Runnable runnable = this.scheduledRunnable;
            if (runnable != null) {
                cancelRunnable(runnable);
                this.scheduledRunnable = null;
            }
            cancelRunnable(this.drawRunnable);
            postRunnable(this.drawRunnable);
        }

        public void scheduleRedraw() {
            Runnable runnable = this.scheduledRunnable;
            if (runnable != null) {
                cancelRunnable(runnable);
                this.scheduledRunnable = null;
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    RenderView.CanvasInternal.this.lambda$scheduleRedraw$1();
                }
            };
            this.scheduledRunnable = runnable2;
            postRunnable(runnable2, 1L);
        }

        public void lambda$scheduleRedraw$1() {
            this.scheduledRunnable = null;
            this.drawRunnable.run();
        }

        public void finish() {
            if (this.eglSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                BlurringShader.BlurManager blurManager = this.blurManager;
                if (blurManager != null) {
                    blurManager.destroyedContext(eGLContext);
                }
                this.egl10.eglDestroyContext(this.eglDisplay, this.eglContext);
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay2 = this.eglDisplay;
            if (eGLDisplay2 != null) {
                this.egl10.eglTerminate(eGLDisplay2);
                this.eglDisplay = null;
            }
            BlurringShader.BlurManager blurManager2 = this.blurManager;
            if (blurManager2 != null) {
                blurManager2.detach(this.safeRequestRender);
            }
        }

        public void shutdown() {
            postRunnable(new Runnable() {
                @Override
                public final void run() {
                    RenderView.CanvasInternal.this.lambda$shutdown$2();
                }
            });
        }

        public void lambda$shutdown$2() {
            finish();
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }

        public Bitmap getTexture(final boolean z, final boolean z2) {
            if (this.initialized) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final Bitmap[] bitmapArr = new Bitmap[1];
                try {
                    postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            RenderView.CanvasInternal.this.lambda$getTexture$3(z, z2, bitmapArr, countDownLatch);
                        }
                    });
                    countDownLatch.await();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                return bitmapArr[0];
            }
            return null;
        }

        public void lambda$getTexture$3(boolean z, boolean z2, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
            Painting.PaintingData paintingData = RenderView.this.painting.getPaintingData(new RectF(0.0f, 0.0f, RenderView.this.painting.getSize().width, RenderView.this.painting.getSize().height), false, z, z2);
            if (paintingData != null) {
                bitmapArr[0] = paintingData.bitmap;
            }
            countDownLatch.countDown();
        }
    }

    public Bitmap getResultBitmap(boolean z, boolean z2) {
        if (this.brush instanceof Brush.Shape) {
            this.shapeInput.stop();
        }
        CanvasInternal canvasInternal = this.internal;
        if (canvasInternal != null) {
            return canvasInternal.getTexture(z, z2);
        }
        return null;
    }

    public void performInContext(final Runnable runnable) {
        CanvasInternal canvasInternal = this.internal;
        if (canvasInternal == null) {
            return;
        }
        canvasInternal.postRunnable(new Runnable() {
            @Override
            public final void run() {
                RenderView.this.lambda$performInContext$3(runnable);
            }
        });
    }

    public void lambda$performInContext$3(Runnable runnable) {
        CanvasInternal canvasInternal = this.internal;
        if (canvasInternal == null || !canvasInternal.initialized) {
            return;
        }
        this.internal.setCurrentContext();
        runnable.run();
    }
}
