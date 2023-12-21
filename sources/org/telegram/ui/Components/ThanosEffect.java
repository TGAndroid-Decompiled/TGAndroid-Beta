package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES31;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.View;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ThanosEffect;
public class ThanosEffect extends TextureView {
    private DrawingThread drawThread;
    private final Choreographer.FrameCallback frameCallback;
    private final ArrayList<ToSet> toSet;

    public static class ToSet {
        public final Bitmap bitmap;
        public final Runnable doneCallback;
        public final Matrix matrix;
        public final Runnable startCallback;
        public final View view;
        public final ArrayList<View> views;

        public ToSet(View view, Runnable runnable) {
            this.view = view;
            this.views = null;
            this.startCallback = null;
            this.doneCallback = runnable;
            this.bitmap = null;
            this.matrix = null;
        }

        public ToSet(ArrayList<View> arrayList, Runnable runnable) {
            this.view = null;
            this.views = arrayList;
            this.startCallback = null;
            this.doneCallback = runnable;
            this.bitmap = null;
            this.matrix = null;
        }

        public ToSet(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
            this.view = null;
            this.views = null;
            this.startCallback = runnable;
            this.doneCallback = runnable2;
            this.matrix = matrix;
            this.bitmap = bitmap;
        }
    }

    public ThanosEffect(Context context) {
        super(context);
        this.frameCallback = new Choreographer.FrameCallback() {
            @Override
            public void doFrame(long j) {
                if (ThanosEffect.this.drawThread != null) {
                    ThanosEffect.this.drawThread.requestDraw();
                    if (ThanosEffect.this.drawThread.running) {
                        Choreographer.getInstance().postFrameCallback(this);
                    }
                }
            }
        };
        this.toSet = new ArrayList<>();
        setOpaque(false);
        setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (ThanosEffect.this.drawThread != null) {
                    ThanosEffect.this.drawThread.kill();
                    ThanosEffect.this.drawThread = null;
                }
                ThanosEffect thanosEffect = ThanosEffect.this;
                final ThanosEffect thanosEffect2 = ThanosEffect.this;
                thanosEffect.drawThread = new DrawingThread(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        ThanosEffect.this.invalidate();
                    }
                }, i, i2);
                if (ThanosEffect.this.toSet.isEmpty()) {
                    return;
                }
                for (int i3 = 0; i3 < ThanosEffect.this.toSet.size(); i3++) {
                    ToSet toSet = (ToSet) ThanosEffect.this.toSet.get(i3);
                    if (toSet.bitmap != null) {
                        ThanosEffect.this.drawThread.animate(toSet.matrix, toSet.bitmap, toSet.startCallback, toSet.doneCallback);
                    } else if (toSet.views != null) {
                        ThanosEffect.this.drawThread.animateGroup(toSet.views, toSet.doneCallback);
                    } else {
                        ThanosEffect.this.drawThread.animate(toSet.view, toSet.doneCallback);
                    }
                }
                ThanosEffect.this.toSet.clear();
                Choreographer.getInstance().postFrameCallback(ThanosEffect.this.frameCallback);
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (ThanosEffect.this.drawThread != null) {
                    ThanosEffect.this.drawThread.resize(i, i2);
                }
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (ThanosEffect.this.drawThread != null) {
                    ThanosEffect.this.drawThread.kill();
                    ThanosEffect.this.drawThread = null;
                    return false;
                }
                return false;
            }
        });
    }

    public void scroll(int i, int i2) {
        DrawingThread drawingThread = this.drawThread;
        if (drawingThread == null || !drawingThread.running) {
            return;
        }
        this.drawThread.scroll(i, i2);
    }

    public void animateGroup(ArrayList<View> arrayList, Runnable runnable) {
        DrawingThread drawingThread = this.drawThread;
        if (drawingThread != null) {
            drawingThread.animateGroup(arrayList, runnable);
            Choreographer.getInstance().postFrameCallback(this.frameCallback);
            return;
        }
        this.toSet.add(new ToSet(arrayList, runnable));
    }

    public void animate(View view, Runnable runnable) {
        DrawingThread drawingThread = this.drawThread;
        if (drawingThread != null) {
            drawingThread.animate(view, runnable);
            Choreographer.getInstance().postFrameCallback(this.frameCallback);
            return;
        }
        this.toSet.add(new ToSet(view, runnable));
    }

    public void animate(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        DrawingThread drawingThread = this.drawThread;
        if (drawingThread != null) {
            drawingThread.animate(matrix, bitmap, runnable, runnable2);
            Choreographer.getInstance().postFrameCallback(this.frameCallback);
            return;
        }
        this.toSet.add(new ToSet(matrix, bitmap, runnable, runnable2));
    }

    public static class DrawingThread extends DispatchQueue {
        private boolean alive;
        private int deltaTimeHandle;
        private int densityHandle;
        private int drawProgram;
        private EGL10 egl;
        private EGLConfig eglConfig;
        private EGLContext eglContext;
        private EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private int gridSizeHandle;
        private int height;
        private final Runnable invalidate;
        private int longevityHandle;
        private int matrixHandle;
        private int particlesCountHandle;
        private final ArrayList<Animation> pendingAnimations;
        private int rectPosHandle;
        private int rectSizeHandle;
        private int resetHandle;
        public volatile boolean running;
        private int seedHandle;
        private int sizeHandle;
        private final SurfaceTexture surfaceTexture;
        private int textureHandle;
        private int timeHandle;
        private final ArrayList<Animation> toAddAnimations;
        private final ArrayList<Animation> toRunStartCallback;
        private int width;

        public DrawingThread(SurfaceTexture surfaceTexture, Runnable runnable, int i, int i2) {
            super("ThanosEffect.DrawingThread", false);
            this.alive = true;
            this.pendingAnimations = new ArrayList<>();
            this.toRunStartCallback = new ArrayList<>();
            this.toAddAnimations = new ArrayList<>();
            this.surfaceTexture = surfaceTexture;
            this.invalidate = runnable;
            this.width = i;
            this.height = i2;
            start();
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                draw();
            } else if (i == 1) {
                resizeInternal(message.arg1, message.arg2);
            } else if (i == 2) {
                killInternal();
            } else if (i == 3) {
                addAnimationInternal((Animation) message.obj);
            } else if (i == 4) {
                for (int i2 = 0; i2 < this.pendingAnimations.size(); i2++) {
                    Animation animation = this.pendingAnimations.get(i2);
                    animation.left += message.arg1;
                    animation.top += message.arg2;
                    animation.invalidateMatrix = true;
                }
            }
        }

        @Override
        public void run() {
            init();
            if (!this.toAddAnimations.isEmpty()) {
                for (int i = 0; i < this.toAddAnimations.size(); i++) {
                    addAnimationInternal(this.toAddAnimations.get(i));
                }
                this.toAddAnimations.clear();
            }
            super.run();
        }

        public void requestDraw() {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(0));
            }
        }

        public void resize(int i, int i2) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(1, i, i2));
            }
        }

        public void scroll(int i, int i2) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(4, i, i2));
            }
        }

        private void resizeInternal(int i, int i2) {
            if (this.alive) {
                this.width = i;
                this.height = i2;
                GLES31.glViewport(0, 0, i, i2);
                GLES31.glUniform2f(this.sizeHandle, i, i2);
            }
        }

        public void kill() {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(2));
            }
        }

        private void killInternal() {
            if (this.alive) {
                this.alive = false;
                for (int i = 0; i < this.pendingAnimations.size(); i++) {
                    this.pendingAnimations.get(i).done(false);
                }
                SurfaceTexture surfaceTexture = this.surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                }
            }
        }

        private void init() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
            this.eglDisplay = eglGetDisplay;
            EGL10 egl102 = this.egl;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                killInternal();
            } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
                killInternal();
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.egl.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    kill();
                    return;
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.eglConfig = eGLConfig;
                EGLContext eglCreateContext = this.egl.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                this.eglContext = eglCreateContext;
                if (eglCreateContext == null) {
                    killInternal();
                    return;
                }
                EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surfaceTexture, null);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == null) {
                    killInternal();
                } else if (!this.egl.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                    killInternal();
                } else {
                    int glCreateShader = GLES31.glCreateShader(35633);
                    int glCreateShader2 = GLES31.glCreateShader(35632);
                    if (glCreateShader == 0 || glCreateShader2 == 0) {
                        killInternal();
                        return;
                    }
                    GLES31.glShaderSource(glCreateShader, RLottieDrawable.readRes(null, R.raw.thanos_vertex) + "\n// " + Math.random());
                    GLES31.glCompileShader(glCreateShader);
                    int[] iArr = new int[1];
                    GLES31.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, compile vertex shader error: " + GLES31.glGetShaderInfoLog(glCreateShader));
                        GLES31.glDeleteShader(glCreateShader);
                        killInternal();
                        return;
                    }
                    GLES31.glShaderSource(glCreateShader2, RLottieDrawable.readRes(null, R.raw.thanos_fragment) + "\n// " + Math.random());
                    GLES31.glCompileShader(glCreateShader2);
                    GLES31.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, compile fragment shader error: " + GLES31.glGetShaderInfoLog(glCreateShader2));
                        GLES31.glDeleteShader(glCreateShader2);
                        killInternal();
                        return;
                    }
                    int glCreateProgram = GLES31.glCreateProgram();
                    this.drawProgram = glCreateProgram;
                    if (glCreateProgram == 0) {
                        killInternal();
                        return;
                    }
                    GLES31.glAttachShader(glCreateProgram, glCreateShader);
                    GLES31.glAttachShader(this.drawProgram, glCreateShader2);
                    GLES31.glTransformFeedbackVaryings(this.drawProgram, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES31.glLinkProgram(this.drawProgram);
                    GLES31.glGetProgramiv(this.drawProgram, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES31.glGetProgramInfoLog(this.drawProgram));
                        killInternal();
                        return;
                    }
                    this.matrixHandle = GLES31.glGetUniformLocation(this.drawProgram, "matrix");
                    this.rectSizeHandle = GLES31.glGetUniformLocation(this.drawProgram, "rectSize");
                    this.rectPosHandle = GLES31.glGetUniformLocation(this.drawProgram, "rectPos");
                    this.resetHandle = GLES31.glGetUniformLocation(this.drawProgram, "reset");
                    this.timeHandle = GLES31.glGetUniformLocation(this.drawProgram, "time");
                    this.deltaTimeHandle = GLES31.glGetUniformLocation(this.drawProgram, "deltaTime");
                    this.particlesCountHandle = GLES31.glGetUniformLocation(this.drawProgram, "particlesCount");
                    this.sizeHandle = GLES31.glGetUniformLocation(this.drawProgram, "size");
                    this.gridSizeHandle = GLES31.glGetUniformLocation(this.drawProgram, "gridSize");
                    this.textureHandle = GLES31.glGetUniformLocation(this.drawProgram, "tex");
                    this.seedHandle = GLES31.glGetUniformLocation(this.drawProgram, "seed");
                    this.densityHandle = GLES31.glGetUniformLocation(this.drawProgram, "dp");
                    this.longevityHandle = GLES31.glGetUniformLocation(this.drawProgram, "longevity");
                    GLES31.glViewport(0, 0, this.width, this.height);
                    GLES31.glEnable(3042);
                    GLES31.glBlendFunc(770, 771);
                    GLES31.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES31.glUseProgram(this.drawProgram);
                    GLES31.glUniform2f(this.sizeHandle, this.width, this.height);
                }
            }
        }

        private float animationHeightPart(Animation animation) {
            int i = 0;
            for (int i2 = 0; i2 < this.pendingAnimations.size(); i2++) {
                i += this.pendingAnimations.get(i2).viewHeight;
            }
            return animation.viewHeight / i;
        }

        private void draw() {
            if (this.alive) {
                GLES31.glClear(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
                int i = 0;
                while (i < this.pendingAnimations.size()) {
                    Animation animation = this.pendingAnimations.get(i);
                    if (animation.firstDraw) {
                        animation.calcParticlesGrid(animationHeightPart(animation));
                        if (animation.startCallback != null) {
                            this.toRunStartCallback.add(animation);
                        }
                    }
                    animation.draw();
                    if (animation.isDead()) {
                        animation.done(true);
                        this.pendingAnimations.remove(i);
                        this.running = !this.pendingAnimations.isEmpty();
                        i--;
                    }
                    i++;
                }
                checkGlErrors();
                this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                for (int i2 = 0; i2 < this.toRunStartCallback.size(); i2++) {
                    AndroidUtilities.runOnUIThread(this.toRunStartCallback.get(i2).startCallback);
                }
                this.toRunStartCallback.clear();
            }
        }

        public void animateGroup(ArrayList<View> arrayList, Runnable runnable) {
            if (this.alive) {
                Animation animation = new Animation(this, arrayList, runnable);
                Handler handler = getHandler();
                this.running = true;
                if (handler == null) {
                    this.toAddAnimations.add(animation);
                } else {
                    handler.sendMessage(handler.obtainMessage(3, animation));
                }
            }
        }

        public void animate(View view, Runnable runnable) {
            if (this.alive) {
                Animation animation = new Animation(view, runnable);
                Handler handler = getHandler();
                this.running = true;
                if (handler == null) {
                    this.toAddAnimations.add(animation);
                } else {
                    handler.sendMessage(handler.obtainMessage(3, animation));
                }
            }
        }

        public void animate(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
            if (this.alive) {
                Animation animation = new Animation(matrix, bitmap, runnable, runnable2);
                Handler handler = getHandler();
                this.running = true;
                if (handler == null) {
                    this.toAddAnimations.add(animation);
                } else {
                    handler.sendMessage(handler.obtainMessage(3, animation));
                }
            }
        }

        private void addAnimationInternal(Animation animation) {
            GLES31.glGenTextures(1, animation.texture, 0);
            GLES20.glBindTexture(3553, animation.texture[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, animation.bitmap, 0);
            GLES20.glBindTexture(3553, 0);
            animation.bitmap.recycle();
            animation.bitmap = null;
            this.pendingAnimations.add(animation);
            this.running = true;
        }

        public class Animation {
            private Bitmap bitmap;
            public final int[] buffer;
            public int currentBuffer;
            public boolean customMatrix;
            public final float density;
            public Runnable doneCallback;
            public boolean firstDraw;
            public final float[] glMatrixValues;
            public int gridHeight;
            public float gridSize;
            public int gridWidth;
            public boolean invalidateMatrix;
            private long lastDrawTime;
            public float left;
            public float longevity;
            public final Matrix matrix;
            public final float[] matrixValues;
            public int particlesCount;
            public final float seed;
            public Runnable startCallback;
            public final int[] texture;
            public float time;
            public float timeScale;
            public float top;
            public int viewHeight;
            public int viewWidth;
            public ArrayList<View> views;

            public Animation(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
                this.views = new ArrayList<>();
                this.lastDrawTime = -1L;
                this.time = 0.0f;
                this.firstDraw = true;
                this.left = 0.0f;
                this.top = 0.0f;
                this.density = AndroidUtilities.density;
                this.longevity = 1.5f;
                this.timeScale = 1.12f;
                this.invalidateMatrix = true;
                this.customMatrix = false;
                this.glMatrixValues = new float[9];
                this.matrixValues = new float[9];
                Matrix matrix2 = new Matrix();
                this.matrix = matrix2;
                this.seed = (float) (Math.random() * 2.0d);
                this.texture = new int[1];
                this.buffer = new int[2];
                float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
                matrix.mapPoints(fArr);
                this.left = fArr[0];
                this.top = fArr[1];
                this.viewWidth = (int) MathUtils.distance(fArr[2], fArr[3], fArr[6], fArr[7]);
                this.viewHeight = (int) MathUtils.distance(fArr[4], fArr[5], fArr[6], fArr[7]);
                this.customMatrix = true;
                matrix2.set(matrix);
                retrieveMatrixValues();
                this.startCallback = runnable;
                this.doneCallback = runnable2;
                this.bitmap = bitmap;
            }

            public Animation(org.telegram.ui.Components.ThanosEffect.DrawingThread r36, final java.util.ArrayList<android.view.View> r37, java.lang.Runnable r38) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ThanosEffect.DrawingThread.Animation.<init>(org.telegram.ui.Components.ThanosEffect$DrawingThread, java.util.ArrayList, java.lang.Runnable):void");
            }

            public static void lambda$new$0(ArrayList arrayList) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).setVisibility(4);
                }
            }

            private void drawChildElement(View view, ChatActivity chatActivity, Canvas canvas, float f, ChatMessageCell chatMessageCell, int i, float f2, float f3) {
                canvas.save();
                float alpha = chatMessageCell.shouldDrawAlphaLayer() ? chatMessageCell.getAlpha() : 1.0f;
                canvas.translate(f2, f3);
                boolean z = true;
                chatMessageCell.setInvalidatesParent(true);
                if (i == 0) {
                    chatMessageCell.drawTime(canvas, alpha, true);
                } else if (i == 1) {
                    chatMessageCell.drawNamesLayout(canvas, alpha);
                } else {
                    chatMessageCell.drawCaptionLayout(canvas, (chatMessageCell.getCurrentPosition() == null || (chatMessageCell.getCurrentPosition().flags & 1) != 0) ? false : false, alpha);
                }
                chatMessageCell.setInvalidatesParent(false);
                canvas.restore();
            }

            public void calcParticlesGrid(float f) {
                int i;
                int i2;
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                int i3 = devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 30000 : 75000 : 55000;
                float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                int clamp = Utilities.clamp((int) ((this.viewWidth * this.viewHeight) / (max * max)), (int) (i3 * f), 10);
                this.particlesCount = clamp;
                float f2 = this.viewWidth / this.viewHeight;
                int round = (int) Math.round(Math.sqrt(clamp / f2));
                this.gridHeight = round;
                this.gridWidth = Math.round(this.particlesCount / round);
                while (true) {
                    i = this.gridWidth;
                    i2 = this.gridHeight;
                    if (i * i2 >= this.particlesCount) {
                        break;
                    } else if (i / i2 < f2) {
                        this.gridWidth = i + 1;
                    } else {
                        this.gridHeight = i2 + 1;
                    }
                }
                this.particlesCount = i * i2;
                this.gridSize = Math.max(this.viewWidth / i, this.viewHeight / i2);
                GLES31.glGenBuffers(2, this.buffer, 0);
                for (int i4 = 0; i4 < 2; i4++) {
                    GLES31.glBindBuffer(34962, this.buffer[i4]);
                    GLES31.glBufferData(34962, this.particlesCount * 28, null, 35048);
                }
            }

            public Animation(android.view.View r8, java.lang.Runnable r9) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ThanosEffect.DrawingThread.Animation.<init>(org.telegram.ui.Components.ThanosEffect$DrawingThread, android.view.View, java.lang.Runnable):void");
            }

            public void lambda$new$1() {
                for (int i = 0; i < this.views.size(); i++) {
                    this.views.get(i).setVisibility(4);
                }
            }

            private void retrieveMatrixValues() {
                this.matrix.getValues(this.matrixValues);
                float[] fArr = this.glMatrixValues;
                float[] fArr2 = this.matrixValues;
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[3];
                fArr[2] = fArr2[6];
                fArr[3] = fArr2[1];
                fArr[4] = fArr2[4];
                fArr[5] = fArr2[7];
                fArr[6] = fArr2[2];
                fArr[7] = fArr2[5];
                fArr[8] = fArr2[8];
                this.invalidateMatrix = false;
            }

            public void draw() {
                double d;
                long nanoTime = System.nanoTime();
                long j = this.lastDrawTime;
                if (j < 0) {
                    d = 0.0d;
                } else {
                    double d2 = nanoTime - j;
                    Double.isNaN(d2);
                    d = d2 / 1.0E9d;
                }
                this.lastDrawTime = nanoTime;
                if (this.invalidateMatrix && !this.customMatrix) {
                    this.matrix.reset();
                    this.matrix.postScale(this.viewWidth, this.viewHeight);
                    this.matrix.postTranslate(this.left, this.top);
                    retrieveMatrixValues();
                }
                double d3 = this.time;
                double d4 = this.timeScale;
                Double.isNaN(d4);
                Double.isNaN(d3);
                this.time = (float) (d3 + (d4 * d));
                GLES31.glUniformMatrix3fv(DrawingThread.this.matrixHandle, 1, false, this.glMatrixValues, 0);
                GLES31.glUniform1f(DrawingThread.this.resetHandle, this.firstDraw ? 1.0f : 0.0f);
                GLES31.glUniform1f(DrawingThread.this.timeHandle, this.time);
                GLES31.glUniform1f(DrawingThread.this.deltaTimeHandle, ((float) d) * this.timeScale);
                GLES31.glUniform1f(DrawingThread.this.particlesCountHandle, this.particlesCount);
                GLES31.glUniform3f(DrawingThread.this.gridSizeHandle, this.gridWidth, this.gridHeight, this.gridSize);
                GLES31.glUniform2f(DrawingThread.this.rectSizeHandle, this.viewWidth, this.viewHeight);
                GLES31.glUniform1f(DrawingThread.this.seedHandle, this.seed);
                GLES31.glUniform2f(DrawingThread.this.rectPosHandle, 0.0f, 0.0f);
                GLES31.glUniform1f(DrawingThread.this.densityHandle, this.density);
                GLES31.glUniform1f(DrawingThread.this.longevityHandle, this.longevity);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.texture[0]);
                GLES31.glUniform1i(DrawingThread.this.textureHandle, 0);
                GLES31.glBindBuffer(34962, this.buffer[this.currentBuffer]);
                GLES31.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES31.glEnableVertexAttribArray(0);
                GLES31.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES31.glEnableVertexAttribArray(1);
                GLES31.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES31.glEnableVertexAttribArray(2);
                GLES31.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES31.glEnableVertexAttribArray(3);
                GLES31.glBindBufferBase(35982, 0, this.buffer[1 - this.currentBuffer]);
                GLES31.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES31.glEnableVertexAttribArray(0);
                GLES31.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES31.glEnableVertexAttribArray(1);
                GLES31.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES31.glEnableVertexAttribArray(2);
                GLES31.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES31.glEnableVertexAttribArray(3);
                GLES31.glBeginTransformFeedback(0);
                GLES31.glDrawArrays(0, 0, this.particlesCount);
                GLES31.glEndTransformFeedback();
                GLES31.glBindBuffer(34962, 0);
                GLES31.glBindBuffer(35982, 0);
                this.firstDraw = false;
                this.currentBuffer = 1 - this.currentBuffer;
            }

            public boolean isDead() {
                return this.time > this.longevity + 0.9f;
            }

            public void done(boolean z) {
                try {
                    GLES31.glDeleteBuffers(2, this.buffer, 0);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (DrawingThread.this.drawProgram != 0) {
                    try {
                        GLES31.glDeleteProgram(DrawingThread.this.drawProgram);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    DrawingThread.this.drawProgram = 0;
                }
                try {
                    GLES31.glDeleteTextures(1, this.texture, 0);
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                if (this.doneCallback != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ThanosEffect.DrawingThread.Animation.this.lambda$done$2();
                        }
                    });
                }
            }

            public void lambda$done$2() {
                for (int i = 0; i < this.views.size(); i++) {
                    this.views.get(i).setVisibility(0);
                }
                Runnable runnable = this.doneCallback;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        private void checkGlErrors() {
            while (true) {
                int glGetError = GLES31.glGetError();
                if (glGetError == 0) {
                    return;
                }
                FileLog.e("thanos gles error " + glGetError);
            }
        }
    }
}
