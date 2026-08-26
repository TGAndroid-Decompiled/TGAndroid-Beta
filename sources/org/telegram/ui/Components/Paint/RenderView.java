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
import android.view.TextureView;
import androidx.lifecycle.LiveData;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraView$CameraGLThread$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Paint.ShapeInput.CornerPoint;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda10;

public class RenderView extends TextureView {
    public Bitmap bitmap;
    public Bitmap blurBitmap;
    public Brush brush;
    public int color;
    public RenderViewDelegate delegate;
    public boolean firstDrawSent;
    public final Input input;
    public CanvasInternal internal;
    public final Painting painting;
    public final ShapeInput shapeInput;
    public boolean shuttingDown;
    public boolean transformedBitmap;
    public UndoStore undoStore;
    public float weight;

    public final class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        public final BlurringShader.BlurManager val$blurManager;

        public AnonymousClass1(BlurringShader.BlurManager blurManager) {
            this.val$blurManager = blurManager;
        }

        @Override
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (surfaceTexture != null) {
                RenderView renderView = RenderView.this;
                if (renderView.internal != null) {
                    return;
                }
                CanvasInternal canvasInternal = renderView.new CanvasInternal(surfaceTexture, this.val$blurManager);
                renderView.internal = canvasInternal;
                canvasInternal.bufferWidth = i;
                canvasInternal.bufferHeight = i2;
                renderView.updateTransform();
                renderView.post(new RenderView$1$$ExternalSyntheticLambda0(this, 1));
                Painting painting = renderView.painting;
                if (painting.paused) {
                    painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda4(painting, painting.backupSlice, 0));
                    painting.backupSlice = null;
                    painting.paused = false;
                }
            }
        }

        @Override
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            RenderView renderView = RenderView.this;
            if (renderView.internal != null && !renderView.shuttingDown) {
                RenderView$1$$ExternalSyntheticLambda0 renderView$1$$ExternalSyntheticLambda0 = new RenderView$1$$ExternalSyntheticLambda0(this, 2);
                Painting painting = renderView.painting;
                painting.renderView.performInContext(new ChatActionCell$$ExternalSyntheticLambda8(21, painting, renderView$1$$ExternalSyntheticLambda0));
            }
            return true;
        }

        @Override
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            RenderView renderView = RenderView.this;
            CanvasInternal canvasInternal = renderView.internal;
            if (canvasInternal == null) {
                return;
            }
            canvasInternal.bufferWidth = i;
            canvasInternal.bufferHeight = i2;
            renderView.updateTransform();
            CanvasInternal canvasInternal2 = renderView.internal;
            canvasInternal2.postRunnable(canvasInternal2.drawRunnable);
            renderView.internal.postRunnable(new RenderView$1$$ExternalSyntheticLambda0(this, 0));
        }

        @Override
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public final class AnonymousClass2 {
        public AnonymousClass2() {
        }

        public final void contentChanged() {
            CanvasInternal canvasInternal = RenderView.this.internal;
            if (canvasInternal != null) {
                RenderView$CanvasInternal$$ExternalSyntheticLambda1 renderView$CanvasInternal$$ExternalSyntheticLambda1 = canvasInternal.scheduledRunnable;
                if (renderView$CanvasInternal$$ExternalSyntheticLambda1 != null) {
                    canvasInternal.cancelRunnable(renderView$CanvasInternal$$ExternalSyntheticLambda1);
                    canvasInternal.scheduledRunnable = null;
                }
                RenderView$CanvasInternal$$ExternalSyntheticLambda1 renderView$CanvasInternal$$ExternalSyntheticLambda2 = new RenderView$CanvasInternal$$ExternalSyntheticLambda1(canvasInternal, 1);
                canvasInternal.scheduledRunnable = renderView$CanvasInternal$$ExternalSyntheticLambda2;
                canvasInternal.postRunnable(renderView$CanvasInternal$$ExternalSyntheticLambda2, 1L);
            }
        }
    }

    public final class CanvasInternal extends DispatchQueue {
        public final BlurringShader.BlurManager blurManager;
        public int bufferHeight;
        public int bufferWidth;
        public final LiveData.AnonymousClass1 drawRunnable;
        public EGL10 egl10;
        public EGLContext eglContext;
        public EGLDisplay eglDisplay;
        public EGLSurface eglSurface;
        public boolean initialized;
        public volatile boolean ready;
        public final RenderView$CanvasInternal$$ExternalSyntheticLambda1 safeRequestRender;
        public RenderView$CanvasInternal$$ExternalSyntheticLambda1 scheduledRunnable;
        public final SurfaceTexture surfaceTexture;

        public CanvasInternal(SurfaceTexture surfaceTexture, BlurringShader.BlurManager blurManager) {
            super("CanvasInternal");
            this.drawRunnable = new LiveData.AnonymousClass1(this, 28);
            this.safeRequestRender = new RenderView$CanvasInternal$$ExternalSyntheticLambda1(this, 0);
            this.blurManager = blurManager;
            this.surfaceTexture = surfaceTexture;
        }

        public static void access$1300(CanvasInternal canvasInternal) {
            if (canvasInternal.initialized) {
                if (canvasInternal.eglContext.equals(canvasInternal.egl10.eglGetCurrentContext()) && canvasInternal.eglSurface.equals(canvasInternal.egl10.eglGetCurrentSurface(12377))) {
                    return;
                }
                EGL10 egl10 = canvasInternal.egl10;
                EGLDisplay eGLDisplay = canvasInternal.eglDisplay;
                EGLSurface eGLSurface = canvasInternal.eglSurface;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, canvasInternal.eglContext);
            }
        }

        public final void finish() {
            if (this.eglSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext = this.eglContext;
            BlurringShader.BlurManager blurManager = this.blurManager;
            if (eGLContext != null) {
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
            if (blurManager != null) {
                blurManager.detach(this.safeRequestRender);
            }
        }

        @Override
        public final void run() {
            boolean z = false;
            RenderView renderView = RenderView.this;
            Bitmap bitmap = renderView.bitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else if (this.egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr2 = {12440, 2, 12344};
                    BlurringShader.BlurManager blurManager = this.blurManager;
                    EGLContext eGLContextEglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, blurManager != null ? blurManager.getParentContext() : EGL10.EGL_NO_CONTEXT, iArr2);
                    this.eglContext = eGLContextEglCreateContext;
                    if (eGLContextEglCreateContext == null) {
                        if (BuildVars.LOGS_ENABLED) {
                            CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        if (blurManager != null) {
                            blurManager.acquiredContext(eGLContextEglCreateContext);
                            blurManager.attach(this.safeRequestRender);
                        }
                        SurfaceTexture surfaceTexture = this.surfaceTexture;
                        if (surfaceTexture != null) {
                            EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, eGLConfig, surfaceTexture, null);
                            this.eglSurface = eGLSurfaceEglCreateWindowSurface;
                            if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (BuildVars.LOGS_ENABLED) {
                                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.egl10.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                                GLES20.glEnable(3042);
                                GLES20.glDisable(3024);
                                GLES20.glDisable(2960);
                                GLES20.glDisable(2929);
                                Painting painting = renderView.painting;
                                painting.getClass();
                                Map map = ShaderSet.AVAILABLE_SHADERS;
                                HashMap map2 = new HashMap();
                                for (Map.Entry entry : ShaderSet.AVAILABLE_SHADERS.entrySet()) {
                                    Map map3 = (Map) entry.getValue();
                                    map2.put((String) entry.getKey(), new Shader((String) map3.get("vertex"), (String) map3.get("fragment"), (String[]) map3.get("attributes"), (String[]) map3.get("uniforms")));
                                }
                                painting.shaders = DesugarCollections.unmodifiableMap(map2);
                                Size size = painting.size;
                                if (renderView.bitmap.getWidth() != size.width || renderView.bitmap.getHeight() != size.height) {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) size.width, (int) size.height, Bitmap.Config.ARGB_8888);
                                    new Canvas(bitmapCreateBitmap).drawBitmap(renderView.bitmap, (Rect) null, new RectF(0.0f, 0.0f, size.width, size.height), (Paint) null);
                                    renderView.bitmap = bitmapCreateBitmap;
                                    renderView.transformedBitmap = true;
                                }
                                Bitmap bitmap2 = renderView.blurBitmap;
                                if (bitmap2 != null && (bitmap2.getWidth() != size.width || renderView.blurBitmap.getHeight() != size.height)) {
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((int) size.width, (int) size.height, Bitmap.Config.ARGB_8888);
                                    new Canvas(bitmapCreateBitmap2).drawBitmap(renderView.blurBitmap, (Rect) null, new RectF(0.0f, 0.0f, size.width, size.height), (Paint) null);
                                    renderView.blurBitmap = bitmapCreateBitmap2;
                                    renderView.transformedBitmap = true;
                                }
                                Bitmap bitmap3 = renderView.bitmap;
                                Bitmap bitmap4 = renderView.blurBitmap;
                                if (painting.bitmapTexture == null) {
                                    painting.bitmapTexture = new Texture(bitmap3);
                                }
                                if (painting.bitmapBlurTexture == null) {
                                    painting.bitmapBlurTexture = new Texture(bitmap4);
                                }
                                if (painting.masking && painting.originalBitmapTexture == null) {
                                    painting.originalBitmapTexture = new Texture(painting.imageBitmap);
                                }
                                Utils.HasGLError();
                                z = true;
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            }
                        } else {
                            finish();
                        }
                    }
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglConfig not initialized");
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
            this.initialized = z;
            super.run();
        }
    }

    public interface RenderViewDelegate {
        void invalidateInputView();

        void onBeganDrawing();

        void onFinishedDrawing();

        void onFirstDraw();

        void resetBrush();

        boolean shouldDraw();
    }

    public RenderView(Context context, Painting painting, Bitmap bitmap, Bitmap bitmap2, BlurringShader.BlurManager blurManager) {
        super(context);
        setOpaque(false);
        this.bitmap = bitmap;
        this.blurBitmap = bitmap2;
        this.painting = painting;
        painting.renderView = this;
        setSurfaceTextureListener(new AnonymousClass1(blurManager));
        this.input = new Input(this);
        this.shapeInput = new ShapeInput(this, new RenderView$$ExternalSyntheticLambda0(this, 1));
        painting.delegate = new AnonymousClass2();
    }

    public final void clearAll() {
        RenderView$$ExternalSyntheticLambda0 renderView$$ExternalSyntheticLambda0 = new RenderView$$ExternalSyntheticLambda0(this, 0);
        Input input = this.input;
        input.lastLocation = new Point(input.renderView.getPainting().size.width, 0.0d, 1.0d);
        input.canFill = true;
        input.fill(new Brush.Eraser(), false, renderView$$ExternalSyntheticLambda0);
    }

    public final void clearShape() {
        RenderView renderView;
        ShapeInput shapeInput = this.shapeInput;
        if (shapeInput == null || (renderView = shapeInput.renderView) == null || renderView.getPainting() == null || shapeInput.shape == null) {
            return;
        }
        Painting painting = renderView.getPainting();
        painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda0(painting, 0));
        shapeInput.allPoints.clear();
        shapeInput.movingPoints.clear();
        shapeInput.shape = null;
    }

    public Brush getCurrentBrush() {
        return this.brush;
    }

    public int getCurrentColor() {
        return this.color;
    }

    public float getCurrentWeight() {
        return this.weight;
    }

    public Painting getPainting() {
        return this.painting;
    }

    public final Bitmap getResultBitmap(boolean z, boolean z2) {
        if (this.brush instanceof Brush.Shape) {
            this.shapeInput.stop();
        }
        CanvasInternal canvasInternal = this.internal;
        if (canvasInternal == null || !canvasInternal.initialized) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            canvasInternal.postRunnable(new StoriesStorage$$ExternalSyntheticLambda10(canvasInternal, z, z2, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    public UndoStore getUndoStore() {
        return this.undoStore;
    }

    public final void onDrawForInput(Canvas canvas) {
        ShapeInput shapeInput;
        RenderView renderView;
        ArrayList arrayList;
        if (!(this.brush instanceof Brush.Shape) || (renderView = (shapeInput = this.shapeInput).renderView) == null || renderView.getPainting() == null) {
            return;
        }
        Size size = shapeInput.renderView.getPainting().size;
        int i = 0;
        while (true) {
            arrayList = shapeInput.allPoints;
            if (i >= arrayList.size()) {
                break;
            }
            ShapeInput.Point point = (ShapeInput.Point) arrayList.get(i);
            if (point.draw && !point.rotate) {
                shapeInput.drawPoint(canvas, size, point);
            }
            i++;
        }
        Shape shape = shapeInput.shape;
        if (shape != null && shape.rotation != 0.0f) {
            canvas.save();
            Shape shape2 = shapeInput.shape;
            canvas.rotate((float) ((((double) (-shape2.rotation)) / 3.141592653589793d) * 180.0d), (shape2.centerX / size.width) * canvas.getWidth(), (shapeInput.shape.centerY / size.height) * canvas.getHeight());
        }
        Shape shape3 = shapeInput.shape;
        if (shape3 != null && shape3.brush.getShapeShaderType() == 4) {
            float width = (shapeInput.shape.centerX / size.width) * canvas.getWidth();
            float height = (shapeInput.shape.centerY / size.height) * canvas.getHeight();
            float width2 = (shapeInput.shape.middleX / size.width) * canvas.getWidth();
            float height2 = (shapeInput.shape.middleY / size.height) * canvas.getHeight();
            Paint paint = shapeInput.linePaint;
            canvas.drawLine(width, height, width2, height2, paint);
            canvas.drawLine(canvas.getWidth() * (shapeInput.shape.radiusX / size.width), canvas.getHeight() * (shapeInput.shape.radiusY / size.height), canvas.getWidth() * (shapeInput.shape.middleX / size.width), canvas.getHeight() * (shapeInput.shape.middleY / size.height), paint);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ShapeInput.Point point2 = (ShapeInput.Point) arrayList.get(i2);
            if (point2.draw && point2.rotate) {
                shapeInput.drawPoint(canvas, size, point2);
            }
        }
        Shape shape4 = shapeInput.shape;
        if (shape4 == null || shape4.rotation == 0.0f) {
            return;
        }
        canvas.restore();
    }

    public final void onTouch(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Paint.RenderView.onTouch(android.view.MotionEvent):void");
    }

    public final void performInContext(Runnable runnable) {
        CanvasInternal canvasInternal = this.internal;
        if (canvasInternal == null) {
            return;
        }
        canvasInternal.postRunnable(new ChatActionCell$$ExternalSyntheticLambda8(22, this, runnable));
    }

    public void selectBrush(Brush brush) {
    }

    public void setBrush(Brush brush) {
        boolean z = this.brush instanceof Brush.Shape;
        final ShapeInput shapeInput = this.shapeInput;
        if (z) {
            shapeInput.stop();
        }
        this.brush = brush;
        updateTransform();
        this.painting.setBrush(this.brush);
        Brush brush2 = this.brush;
        if (brush2 instanceof Brush.Shape) {
            int shapeShaderType = ((Brush.Shape) brush2).getShapeShaderType();
            RenderView renderView = shapeInput.renderView;
            if (renderView == null || renderView.getPainting() == null) {
                return;
            }
            ArrayList arrayList = shapeInput.allPoints;
            arrayList.clear();
            ArrayList arrayList2 = shapeInput.movingPoints;
            arrayList2.clear();
            if (shapeShaderType >= 0) {
                List list = Brush.Shape.SHAPES_LIST;
                if (shapeShaderType <= list.size()) {
                    shapeInput.shape = new Shape((Brush.Shape) list.get(shapeShaderType));
                    RenderView renderView2 = shapeInput.renderView;
                    Size size = renderView2.getPainting().size;
                    Shape shape = shapeInput.shape;
                    float f = size.width;
                    shape.centerX = f / 2.0f;
                    float f2 = size.height;
                    shape.centerY = f2 / 2.0f;
                    float fMin = Math.min(f, f2) / 5.0f;
                    shape.radiusY = fMin;
                    shape.radiusX = fMin;
                    shapeInput.shape.thickness = renderView2.getCurrentWeight();
                    shapeInput.shape.rounding = AndroidUtilities.dp(32.0f);
                    shapeInput.shape.fill = PersistColorPalette.getInstance(UserConfig.selectedAccount).fillShapes;
                    if (shapeInput.shape.brush.getShapeShaderType() == 4) {
                        Shape shape2 = shapeInput.shape;
                        float f3 = size.width / 2.0f;
                        shape2.radiusX = f3;
                        shape2.centerX = f3;
                        shape2.middleX = f3 + 1.0f;
                        float f4 = size.height;
                        float f5 = f4 / 3.0f;
                        float f6 = 1.0f * f5;
                        shape2.centerY = f6;
                        float f7 = f4 / 2.0f;
                        shape2.middleY = f7;
                        shape2.radiusY = f5 * 2.0f;
                        shape2.arrowTriangleLength = Math.abs(f6 - f7);
                        final ShapeInput.AnonymousClass1 anonymousClass1 = new ShapeInput.AnonymousClass1(shapeInput, 0);
                        arrayList.add(anonymousClass1);
                        final int i = 0;
                        ShapeInput.Point point = new ShapeInput.Point() {
                            @Override
                            public final void set() {
                                switch (i) {
                                    case 0:
                                        Shape shape3 = shapeInput.shape;
                                        float f8 = shape3.middleX;
                                        float f9 = shape3.middleY;
                                        this.x = f8;
                                        this.y = f9;
                                        break;
                                    default:
                                        Shape shape4 = shapeInput.shape;
                                        float f10 = shape4.radiusX;
                                        float f11 = shape4.radiusY;
                                        this.x = f10;
                                        this.y = f11;
                                        break;
                                }
                            }

                            @Override
                            public final void update(float f8, float f9) {
                                switch (i) {
                                    case 0:
                                        Shape shape3 = shapeInput.shape;
                                        shape3.middleX = f8;
                                        shape3.middleY = f9;
                                        this.x = f8;
                                        this.y = f9;
                                        anonymousClass1.set();
                                        break;
                                    default:
                                        Shape shape4 = shapeInput.shape;
                                        shape4.radiusX = f8;
                                        shape4.radiusY = f9;
                                        this.x = f8;
                                        this.y = f9;
                                        anonymousClass1.set();
                                        break;
                                }
                            }
                        };
                        arrayList.add(point);
                        arrayList2.add(point);
                        final int i2 = 1;
                        ShapeInput.Point point2 = new ShapeInput.Point() {
                            @Override
                            public final void set() {
                                switch (i2) {
                                    case 0:
                                        Shape shape3 = shapeInput.shape;
                                        float f8 = shape3.middleX;
                                        float f9 = shape3.middleY;
                                        this.x = f8;
                                        this.y = f9;
                                        break;
                                    default:
                                        Shape shape4 = shapeInput.shape;
                                        float f10 = shape4.radiusX;
                                        float f11 = shape4.radiusY;
                                        this.x = f10;
                                        this.y = f11;
                                        break;
                                }
                            }

                            @Override
                            public final void update(float f8, float f9) {
                                switch (i2) {
                                    case 0:
                                        Shape shape3 = shapeInput.shape;
                                        shape3.middleX = f8;
                                        shape3.middleY = f9;
                                        this.x = f8;
                                        this.y = f9;
                                        anonymousClass1.set();
                                        break;
                                    default:
                                        Shape shape4 = shapeInput.shape;
                                        shape4.radiusX = f8;
                                        shape4.radiusY = f9;
                                        this.x = f8;
                                        this.y = f9;
                                        anonymousClass1.set();
                                        break;
                                }
                            }
                        };
                        arrayList.add(point2);
                        arrayList2.add(point2);
                    }
                    if (shapeInput.shape.brush.getShapeShaderType() == 0) {
                        arrayList.add(new ShapeInput.AnonymousClass1(shapeInput, 1));
                    }
                    if (shapeInput.shape.brush.getShapeShaderType() == 2) {
                        arrayList.add(new ShapeInput.AnonymousClass1(shapeInput, 2));
                    }
                    if (shapeInput.shape.brush.getShapeShaderType() == 1 || shapeInput.shape.brush.getShapeShaderType() == 3) {
                        arrayList.add(shapeInput.new CornerPoint(shapeInput.shape, false, false));
                        arrayList.add(shapeInput.new CornerPoint(shapeInput.shape, true, false));
                        arrayList.add(shapeInput.new CornerPoint(shapeInput.shape, false, true));
                        arrayList.add(shapeInput.new CornerPoint(shapeInput.shape, true, true));
                        arrayList.add(new ShapeInput.AnonymousClass1(shapeInput, 3, false));
                    }
                    if (shapeInput.shape.brush.getShapeShaderType() == 3) {
                        Shape shape3 = shapeInput.shape;
                        shape3.middleX = (shape3.radiusX * 0.8f) + shape3.centerX;
                        shape3.middleY = (shape3.radiusY * 1.2f) + shape3.centerY + shape3.thickness;
                        ShapeInput.AnonymousClass1 anonymousClass2 = new ShapeInput.AnonymousClass1(shapeInput, 4);
                        arrayList.add(anonymousClass2);
                        anonymousClass2.rotate = false;
                        arrayList2.add(anonymousClass2);
                    }
                    shapeInput.center = new ShapeInput.AnonymousClass1(shapeInput, 5, false);
                    if (shapeInput.shape.brush.getShapeShaderType() != 4) {
                        shapeInput.center.draw = false;
                    }
                    ShapeInput.AnonymousClass1 anonymousClass3 = shapeInput.center;
                    anonymousClass3.rotate = false;
                    arrayList2.add(anonymousClass3);
                    arrayList.add(shapeInput.center);
                    renderView2.getPainting().paintShape(shapeInput.shape);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Shape type must be in range from 0 to " + (Brush.Shape.SHAPES_LIST.size() - 1) + ", but got " + shapeShaderType);
        }
    }

    public void setBrushSize(float f) {
        ShapeInput shapeInput;
        Shape shape;
        float f2 = this.painting.size.width;
        this.weight = (f2 * 0.043945312f * f) + (0.00390625f * f2);
        if (!(this.brush instanceof Brush.Shape) || (shape = (shapeInput = this.shapeInput).shape) == null) {
            return;
        }
        float f3 = shape.thickness;
        RenderView renderView = shapeInput.renderView;
        if (f3 != renderView.getCurrentWeight()) {
            shapeInput.shape.thickness = renderView.getCurrentWeight();
            renderView.getPainting().paintShape(shapeInput.shape);
        }
    }

    public void setColor(int i) {
        this.color = i;
        if (this.brush instanceof Brush.Shape) {
            ShapeInput shapeInput = this.shapeInput;
            if (shapeInput.shape != null) {
                shapeInput.renderView.getPainting().paintShape(shapeInput.shape);
            }
        }
    }

    public void setDelegate(RenderViewDelegate renderViewDelegate) {
        this.delegate = renderViewDelegate;
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }

    public void setUndoStore(UndoStore undoStore) {
        this.undoStore = undoStore;
    }

    public final void shutdown() {
        this.shuttingDown = true;
        if (this.internal != null) {
            performInContext(new RenderView$$ExternalSyntheticLambda0(this, 2));
        }
        setVisibility(8);
    }

    public final void updateTransform() {
        if (this.internal == null) {
            return;
        }
        Matrix matrix = new Matrix();
        Painting painting = this.painting;
        float width = painting != null ? getWidth() / painting.size.width : 1.0f;
        if (width <= 0.0f) {
            width = 1.0f;
        }
        Size size = getPainting().size;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(width, -width);
        matrix.preTranslate((-size.width) / 2.0f, (-size.height) / 2.0f);
        if (this.brush instanceof Brush.Shape) {
            ShapeInput shapeInput = this.shapeInput;
            shapeInput.getClass();
            Matrix matrix2 = new Matrix();
            shapeInput.invertMatrix = matrix2;
            matrix.invert(matrix2);
        } else {
            Input input = this.input;
            input.getClass();
            Matrix matrix3 = new Matrix();
            input.invertMatrix = matrix3;
            matrix.invert(matrix3);
        }
        CanvasInternal canvasInternal = this.internal;
        float[] fArrLoadOrtho = GLMatrix.LoadOrtho(canvasInternal.bufferWidth, canvasInternal.bufferHeight);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        painting.renderProjection = GLMatrix.MultiplyMat4f(fArrLoadOrtho, new float[]{fArr[0], fArr[1], 0.0f, 0.0f, fArr[3], fArr[4], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, 1.0f});
    }
}
