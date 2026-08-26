package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.AtomicFile;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.android.billingclient.api.zzcv;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda8;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda1;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class ThanosEffect extends TextureView {
    public static Boolean nothanos;
    public boolean destroyed;
    public DrawingThread drawThread;
    public final AnonymousClass1 frameCallback;
    public final ArrayList toSet;
    public Runnable whenDone;

    public final class AnonymousClass1 implements Choreographer.FrameCallback {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void doFrame(long j) {
            long j2;
            long j3;
            SpringAnimation springAnimation;
            SpringForce springForce;
            double dAbs;
            int i;
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    DrawingThread drawingThread = ((ThanosEffect) this.this$0).drawThread;
                    if (drawingThread != null) {
                        Handler handler = drawingThread.getHandler();
                        if (handler != null && drawingThread.alive.get()) {
                            handler.sendMessage(handler.obtainMessage(0));
                        }
                        if (((ThanosEffect) this.this$0).drawThread.running) {
                            Choreographer.getInstance().postFrameCallback(this);
                        }
                    }
                    break;
                default:
                    zzcv zzcvVar = (zzcv) ((AtomicFile) this.this$0).mBaseName;
                    zzcvVar.getClass();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    AnimationHandler animationHandler = (AnimationHandler) zzcvVar.zza;
                    animationHandler.getClass();
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = animationHandler.mAnimationCallbacks;
                        if (i2 >= arrayList.size()) {
                            if (animationHandler.mListDirty) {
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                                animationHandler.mListDirty = false;
                            }
                            if (arrayList.size() > 0) {
                                if (animationHandler.mProvider == null) {
                                    animationHandler.mProvider = new AtomicFile(animationHandler.mCallbackDispatcher);
                                }
                                AtomicFile atomicFile = animationHandler.mProvider;
                                ((Choreographer) atomicFile.mNewName).postFrameCallback((AnonymousClass1) atomicFile.mLegacyBackupName);
                            }
                        } else {
                            DynamicAnimation dynamicAnimation = (DynamicAnimation) arrayList.get(i2);
                            if (dynamicAnimation == null) {
                                i = i2;
                            } else {
                                SimpleArrayMap simpleArrayMap = animationHandler.mDelayedCallbackStartTime;
                                Long l = (Long) simpleArrayMap.get(dynamicAnimation);
                                if (l == null) {
                                    j2 = dynamicAnimation.mLastFrameTime;
                                    if (j2 == 0) {
                                        dynamicAnimation.mLastFrameTime = jUptimeMillis;
                                        dynamicAnimation.setPropertyValue(dynamicAnimation.mValue);
                                        i = i2;
                                    } else {
                                        j3 = jUptimeMillis - j2;
                                        dynamicAnimation.mLastFrameTime = jUptimeMillis;
                                        springAnimation = (SpringAnimation) dynamicAnimation;
                                        if (springAnimation.mPendingPosition != Float.MAX_VALUE) {
                                            SpringForce springForce2 = springAnimation.mSpring;
                                            double d = springForce2.mFinalPosition;
                                            long j4 = j3 / 2;
                                            AboutLinkCell.SpringInterpolator springInterpolatorUpdateValues = springForce2.updateValues(springAnimation.mValue, springAnimation.mVelocity, j4);
                                            SpringForce springForce3 = springAnimation.mSpring;
                                            springForce3.mFinalPosition = springAnimation.mPendingPosition;
                                            springAnimation.mPendingPosition = Float.MAX_VALUE;
                                            AboutLinkCell.SpringInterpolator springInterpolatorUpdateValues2 = springForce3.updateValues(springInterpolatorUpdateValues.position, springInterpolatorUpdateValues.velocity, j4);
                                            springAnimation.mValue = springInterpolatorUpdateValues2.position;
                                            springAnimation.mVelocity = springInterpolatorUpdateValues2.velocity;
                                        } else {
                                            AboutLinkCell.SpringInterpolator springInterpolatorUpdateValues3 = springAnimation.mSpring.updateValues(springAnimation.mValue, springAnimation.mVelocity, j3);
                                            springAnimation.mValue = springInterpolatorUpdateValues3.position;
                                            springAnimation.mVelocity = springInterpolatorUpdateValues3.velocity;
                                        }
                                        float fMax = Math.max(springAnimation.mValue, springAnimation.mMinValue);
                                        springAnimation.mValue = fMax;
                                        float fMin = Math.min(fMax, springAnimation.mMaxValue);
                                        springAnimation.mValue = fMin;
                                        float f = springAnimation.mVelocity;
                                        springForce = springAnimation.mSpring;
                                        springForce.getClass();
                                        dAbs = Math.abs(f);
                                        i = i2;
                                        if (dAbs < springForce.mVelocityThreshold) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        float fMin2 = Math.min(dynamicAnimation.mValue, dynamicAnimation.mMaxValue);
                                        dynamicAnimation.mValue = fMin2;
                                        float fMax2 = Math.max(fMin2, dynamicAnimation.mMinValue);
                                        dynamicAnimation.mValue = fMax2;
                                        dynamicAnimation.setPropertyValue(fMax2);
                                        if (z) {
                                            dynamicAnimation.endAnimationInternal(false);
                                        }
                                    }
                                } else if (l.longValue() < jUptimeMillis2) {
                                    simpleArrayMap.remove(dynamicAnimation);
                                    j2 = dynamicAnimation.mLastFrameTime;
                                    if (j2 == 0) {
                                        dynamicAnimation.mLastFrameTime = jUptimeMillis;
                                        dynamicAnimation.setPropertyValue(dynamicAnimation.mValue);
                                        i = i2;
                                    } else {
                                        j3 = jUptimeMillis - j2;
                                        dynamicAnimation.mLastFrameTime = jUptimeMillis;
                                        springAnimation = (SpringAnimation) dynamicAnimation;
                                        if (springAnimation.mPendingPosition != Float.MAX_VALUE) {
                                            SpringForce springForce4 = springAnimation.mSpring;
                                            double d2 = springForce4.mFinalPosition;
                                            long j5 = j3 / 2;
                                            AboutLinkCell.SpringInterpolator springInterpolatorUpdateValues4 = springForce4.updateValues(springAnimation.mValue, springAnimation.mVelocity, j5);
                                            SpringForce springForce5 = springAnimation.mSpring;
                                            springForce5.mFinalPosition = springAnimation.mPendingPosition;
                                            springAnimation.mPendingPosition = Float.MAX_VALUE;
                                            AboutLinkCell.SpringInterpolator springInterpolatorUpdateValues5 = springForce5.updateValues(springInterpolatorUpdateValues4.position, springInterpolatorUpdateValues4.velocity, j5);
                                            springAnimation.mValue = springInterpolatorUpdateValues5.position;
                                            springAnimation.mVelocity = springInterpolatorUpdateValues5.velocity;
                                        } else {
                                            AboutLinkCell.SpringInterpolator springInterpolatorUpdateValues6 = springAnimation.mSpring.updateValues(springAnimation.mValue, springAnimation.mVelocity, j3);
                                            springAnimation.mValue = springInterpolatorUpdateValues6.position;
                                            springAnimation.mVelocity = springInterpolatorUpdateValues6.velocity;
                                        }
                                        float fMax3 = Math.max(springAnimation.mValue, springAnimation.mMinValue);
                                        springAnimation.mValue = fMax3;
                                        float fMin3 = Math.min(fMax3, springAnimation.mMaxValue);
                                        springAnimation.mValue = fMin3;
                                        float f2 = springAnimation.mVelocity;
                                        springForce = springAnimation.mSpring;
                                        springForce.getClass();
                                        dAbs = Math.abs(f2);
                                        i = i2;
                                        if (dAbs < springForce.mVelocityThreshold || Math.abs(fMin3 - ((float) springForce.mFinalPosition)) >= springForce.mValueThreshold) {
                                            z = false;
                                        } else {
                                            springAnimation.mValue = (float) springAnimation.mSpring.mFinalPosition;
                                            springAnimation.mVelocity = 0.0f;
                                            z = true;
                                        }
                                        float fMin4 = Math.min(dynamicAnimation.mValue, dynamicAnimation.mMaxValue);
                                        dynamicAnimation.mValue = fMin4;
                                        float fMax4 = Math.max(fMin4, dynamicAnimation.mMinValue);
                                        dynamicAnimation.mValue = fMax4;
                                        dynamicAnimation.setPropertyValue(fMax4);
                                        if (z) {
                                            dynamicAnimation.endAnimationInternal(false);
                                        }
                                    }
                                } else {
                                    i = i2;
                                }
                            }
                            i2 = i + 1;
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public ThanosEffect(Context context, Runnable runnable) {
        super(context);
        this.frameCallback = new AnonymousClass1(this, 0);
        this.toSet = new ArrayList();
        this.whenDone = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new PhotoViewer.AnonymousClass8(this, 3));
    }

    public static void ensureRunOnUIThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            AndroidUtilities.runOnUIThread(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean supports() {
        if (nothanos == null) {
            nothanos = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("nothanos", false));
        }
        Boolean bool = nothanos;
        return bool == null || !bool.booleanValue();
    }

    public final void cancel(View view) {
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.toSet;
            if (i2 >= arrayList.size()) {
                break;
            }
            ToSet toSet = (ToSet) arrayList.get(i2);
            if (toSet.view == view) {
                Runnable runnable = toSet.doneCallback;
                if (runnable != null) {
                    ensureRunOnUIThread(runnable);
                    toSet.doneCallback = null;
                }
                arrayList.remove(i2);
                i2--;
                z = true;
            }
            i2++;
        }
        if (z) {
            return;
        }
        DrawingThread drawingThread = this.drawThread;
        if (!drawingThread.alive.get()) {
            return;
        }
        Handler handler = drawingThread.getHandler();
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(5, view));
            return;
        }
        while (true) {
            ArrayList arrayList2 = drawingThread.toAddAnimations;
            if (i >= arrayList2.size()) {
                return;
            }
            DrawingThread.Animation animation = (DrawingThread.Animation) arrayList2.get(i);
            if (animation.views.contains(view)) {
                Runnable runnable2 = animation.doneCallback;
                if (runnable2 != null) {
                    ensureRunOnUIThread(runnable2);
                    animation.doneCallback = null;
                }
                arrayList2.remove(i);
                i--;
            }
            i++;
        }
    }

    public final class ToSet {
        public final Bitmap bitmap;
        public Runnable doneCallback;
        public float durationMultiplier;
        public final Matrix matrix;
        public final PollItemMenu$$ExternalSyntheticLambda8 startCallback;
        public final View view;
        public final ArrayList views;

        public ToSet(View view, Runnable runnable) {
            this.durationMultiplier = 1.0f;
            this.view = view;
            this.views = null;
            this.startCallback = null;
            this.doneCallback = runnable;
            this.bitmap = null;
            this.matrix = null;
        }

        public ToSet(ArrayList arrayList, EglRenderer$$ExternalSyntheticLambda6 eglRenderer$$ExternalSyntheticLambda6) {
            this.durationMultiplier = 1.0f;
            this.view = null;
            this.views = arrayList;
            this.startCallback = null;
            this.doneCallback = eglRenderer$$ExternalSyntheticLambda6;
            this.bitmap = null;
            this.matrix = null;
        }

        public ToSet(Matrix matrix, Bitmap bitmap, PollItemMenu$$ExternalSyntheticLambda8 pollItemMenu$$ExternalSyntheticLambda8, QrActivity$5$$ExternalSyntheticLambda1 qrActivity$5$$ExternalSyntheticLambda1) {
            this.durationMultiplier = 1.0f;
            this.view = null;
            this.views = null;
            this.startCallback = pollItemMenu$$ExternalSyntheticLambda8;
            this.doneCallback = qrActivity$5$$ExternalSyntheticLambda1;
            this.matrix = matrix;
            this.bitmap = bitmap;
        }
    }

    public final class DrawingThread extends DispatchQueue {
        public final AtomicBoolean alive;
        public int deltaTimeHandle;
        public int densityHandle;
        public ThanosEffect$2$$ExternalSyntheticLambda0 destroy;
        public int drawProgram;
        public boolean drawnAnimations;
        public EGL10 egl;
        public EGLConfig eglConfig;
        public EGLContext eglContext;
        public EGLDisplay eglDisplay;
        public EGLSurface eglSurface;
        public int gridSizeHandle;
        public int height;
        public boolean isEmulator;
        public int longevityHandle;
        public int matrixHandle;
        public int offsetHandle;
        public int particlesCountHandle;
        public final ArrayList pendingAnimations;
        public int rectPosHandle;
        public int rectSizeHandle;
        public int resetHandle;
        public volatile boolean running;
        public int scaleHandle;
        public int seedHandle;
        public int sizeHandle;
        public final SurfaceTexture surfaceTexture;
        public int textureHandle;
        public int timeHandle;
        public final ArrayList toAddAnimations;
        public final ArrayList toRunStartCallback;
        public int uvOffsetHandle;
        public int width;

        public DrawingThread(SurfaceTexture surfaceTexture, ThanosEffect$2$$ExternalSyntheticLambda0 thanosEffect$2$$ExternalSyntheticLambda0, ThanosEffect$2$$ExternalSyntheticLambda0 thanosEffect$2$$ExternalSyntheticLambda1, int i, int i2) {
            super("ThanosEffect.DrawingThread", false);
            this.alive = new AtomicBoolean(true);
            this.pendingAnimations = new ArrayList();
            this.toRunStartCallback = new ArrayList();
            this.drawnAnimations = false;
            this.toAddAnimations = new ArrayList();
            this.surfaceTexture = surfaceTexture;
            this.destroy = thanosEffect$2$$ExternalSyntheticLambda1;
            this.width = i;
            this.height = i2;
            start();
        }

        public final void addAnimationInternal(Animation animation) {
            int i = 0;
            GLES20.glGenTextures(1, animation.texture, 0);
            GLES20.glBindTexture(3553, animation.texture[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, animation.bitmap, 0);
            GLES20.glBindTexture(3553, 0);
            animation.bitmap.recycle();
            animation.bitmap = null;
            if (animation.isPhotoEditor) {
                ArrayList arrayList = this.pendingAnimations;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Animation) obj).done();
                }
                this.pendingAnimations.clear();
            }
            this.pendingAnimations.add(animation);
            this.running = true;
        }

        public final void animate(View view, float f, Runnable runnable) {
            if (this.alive.get()) {
                Animation animation = new Animation(view, f, runnable);
                getHandler();
                this.running = true;
                postRunnable(new ThanosEffect$DrawingThread$$ExternalSyntheticLambda0(this, animation, 2));
                return;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            ThanosEffect$2$$ExternalSyntheticLambda0 thanosEffect$2$$ExternalSyntheticLambda0 = this.destroy;
            if (thanosEffect$2$$ExternalSyntheticLambda0 != null) {
                AndroidUtilities.runOnUIThread(thanosEffect$2$$ExternalSyntheticLambda0);
                this.destroy = null;
            }
        }

        public final void animateGroup(ArrayList arrayList, Runnable runnable) {
            if (this.alive.get()) {
                Animation animation = new Animation(this, arrayList, runnable);
                this.running = true;
                postRunnable(new ThanosEffect$DrawingThread$$ExternalSyntheticLambda0(this, animation, 0));
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ((View) arrayList.get(i)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            ThanosEffect$2$$ExternalSyntheticLambda0 thanosEffect$2$$ExternalSyntheticLambda0 = this.destroy;
            if (thanosEffect$2$$ExternalSyntheticLambda0 != null) {
                AndroidUtilities.runOnUIThread(thanosEffect$2$$ExternalSyntheticLambda0);
                this.destroy = null;
            }
        }

        public final void draw() {
            int i;
            int i2;
            int i3;
            if (this.alive.get()) {
                GLES20.glClear(16384);
                int i4 = 0;
                int i5 = 0;
                while (i5 < this.pendingAnimations.size()) {
                    Animation animation = (Animation) this.pendingAnimations.get(i5);
                    if (animation.firstDraw) {
                        int i6 = 0;
                        for (int i7 = 0; i7 < this.pendingAnimations.size(); i7++) {
                            i6 += ((Animation) this.pendingAnimations.get(i7)).viewHeight;
                        }
                        float f = animation.viewHeight / i6;
                        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                        int i8 = DrawingThread.this.isEmulator ? 120000 : devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 30000 : 120000 : 60000;
                        if (animation.isPhotoEditor) {
                            i8 /= 2;
                        }
                        float fMax = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                        int iClamp = Utilities.clamp((int) ((animation.viewWidth * animation.viewHeight) / (fMax * fMax)), (int) (i8 * f), 10);
                        animation.particlesCount = iClamp;
                        float f2 = animation.viewWidth / animation.viewHeight;
                        int iRound = (int) Math.round(Math.sqrt(iClamp / f2));
                        animation.gridHeight = iRound;
                        animation.gridWidth = Math.round(animation.particlesCount / iRound);
                        while (true) {
                            i = animation.gridWidth;
                            i2 = animation.gridHeight;
                            i3 = i * i2;
                            if (i3 >= animation.particlesCount) {
                                break;
                            } else if (i / i2 < f2) {
                                animation.gridWidth = i + 1;
                            } else {
                                animation.gridHeight = i2 + 1;
                            }
                        }
                        animation.particlesCount = i3;
                        animation.gridSize = Math.max(animation.viewWidth / i, animation.viewHeight / i2);
                        GLES20.glGenBuffers(2, animation.buffer, 0);
                        for (int i9 = 0; i9 < 2; i9++) {
                            GLES20.glBindBuffer(34962, animation.buffer[i9]);
                            GLES20.glBufferData(34962, animation.particlesCount * 28, null, 35048);
                        }
                        if (animation.startCallback != null) {
                            this.toRunStartCallback.add(animation);
                        }
                    }
                    this.drawnAnimations = true;
                    long jNanoTime = System.nanoTime();
                    long j = animation.lastDrawTime;
                    double d = j < 0 ? 0.0d : (jNanoTime - j) / 1.0E9d;
                    animation.lastDrawTime = jNanoTime;
                    if (animation.invalidateMatrix && !animation.customMatrix) {
                        animation.matrix.reset();
                        animation.matrix.postScale(animation.viewWidth, animation.viewHeight);
                        animation.matrix.postTranslate(animation.left, animation.top);
                        animation.retrieveMatrixValues();
                    }
                    animation.time = (float) ((((double) animation.timeScale) * d) + ((double) animation.time));
                    GLES20.glUniformMatrix3fv(DrawingThread.this.matrixHandle, 1, false, animation.glMatrixValues, 0);
                    GLES20.glUniform1f(DrawingThread.this.resetHandle, animation.firstDraw ? 1.0f : 0.0f);
                    GLES20.glUniform1f(DrawingThread.this.timeHandle, animation.time);
                    GLES20.glUniform1f(DrawingThread.this.deltaTimeHandle, ((float) d) * animation.timeScale);
                    GLES20.glUniform1f(DrawingThread.this.particlesCountHandle, animation.particlesCount);
                    GLES20.glUniform3f(DrawingThread.this.gridSizeHandle, animation.gridWidth, animation.gridHeight, animation.gridSize);
                    GLES20.glUniform2f(DrawingThread.this.offsetHandle, animation.offsetLeft, animation.offsetTop);
                    GLES20.glUniform1f(DrawingThread.this.scaleHandle, animation.isPhotoEditor ? 0.8f : 1.0f);
                    GLES20.glUniform1f(DrawingThread.this.uvOffsetHandle, animation.isPhotoEditor ? 1.0f : 0.6f);
                    GLES20.glUniform2f(DrawingThread.this.rectSizeHandle, animation.viewWidth, animation.viewHeight);
                    GLES20.glUniform1f(DrawingThread.this.seedHandle, animation.seed);
                    GLES20.glUniform2f(DrawingThread.this.rectPosHandle, 0.0f, 0.0f);
                    GLES20.glUniform1f(DrawingThread.this.densityHandle, animation.density);
                    GLES20.glUniform1f(DrawingThread.this.longevityHandle, animation.longevity);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, animation.texture[0]);
                    GLES20.glUniform1i(DrawingThread.this.textureHandle, 0);
                    GLES20.glBindBuffer(34962, animation.buffer[animation.currentBuffer]);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                    GLES20.glEnableVertexAttribArray(2);
                    GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                    GLES20.glEnableVertexAttribArray(3);
                    GLES30.glBindBufferBase(35982, 0, animation.buffer[1 - animation.currentBuffer]);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                    GLES20.glEnableVertexAttribArray(2);
                    GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                    GLES20.glEnableVertexAttribArray(3);
                    GLES30.glBeginTransformFeedback(0);
                    GLES20.glDrawArrays(0, 0, animation.particlesCount);
                    GLES30.glEndTransformFeedback();
                    GLES20.glBindBuffer(34962, 0);
                    GLES20.glBindBuffer(35982, 0);
                    animation.firstDraw = false;
                    animation.currentBuffer = 1 - animation.currentBuffer;
                    if (animation.time > animation.longevity + (animation.isPhotoEditor ? 2.0f : 0.9f)) {
                        animation.done();
                        this.pendingAnimations.remove(i5);
                        this.running = !this.pendingAnimations.isEmpty();
                        i5--;
                    }
                    i5++;
                }
                while (true) {
                    int iGlGetError = GLES20.glGetError();
                    if (iGlGetError == 0) {
                        try {
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            for (int i10 = 0; i10 < this.toRunStartCallback.size(); i10++) {
                                AndroidUtilities.runOnUIThread(((Animation) this.toRunStartCallback.get(i10)).startCallback);
                            }
                            this.toRunStartCallback.clear();
                            while (i4 < this.pendingAnimations.size()) {
                                ((Animation) this.pendingAnimations.get(i4)).done();
                                i4++;
                            }
                            this.pendingAnimations.clear();
                            AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(7));
                            killInternal();
                            return;
                        }
                    }
                    FileLog.e("thanos gles error " + iGlGetError);
                }
                this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                while (i4 < this.toRunStartCallback.size()) {
                    AndroidUtilities.runOnUIThread(((Animation) this.toRunStartCallback.get(i4)).startCallback);
                    i4++;
                }
                this.toRunStartCallback.clear();
                if (this.pendingAnimations.isEmpty() && this.drawnAnimations) {
                    killInternal();
                }
            }
        }

        @Override
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                draw();
                return;
            }
            int i2 = 0;
            if (i == 1) {
                int i3 = message.arg1;
                int i4 = message.arg2;
                if (this.alive.get()) {
                    this.width = i3;
                    this.height = i4;
                    GLES20.glViewport(0, 0, i3, i4);
                    GLES20.glUniform2f(this.sizeHandle, i3, i4);
                }
                draw();
                return;
            }
            if (i == 2) {
                killInternal();
                return;
            }
            if (i == 3) {
                addAnimationInternal((Animation) message.obj);
                return;
            }
            ArrayList arrayList = this.pendingAnimations;
            if (i == 4) {
                while (i2 < arrayList.size()) {
                    Animation animation = (Animation) arrayList.get(i2);
                    animation.offsetLeft += message.arg1;
                    animation.offsetTop += message.arg2;
                    i2++;
                }
                return;
            }
            if (i != 5) {
                return;
            }
            View view = (View) message.obj;
            while (i2 < arrayList.size()) {
                Animation animation2 = (Animation) arrayList.get(i2);
                if (animation2.views.contains(view)) {
                    animation2.done();
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }

        public final void init() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(0);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            EGL10 egl11 = this.egl;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
                killInternal();
                return;
            }
            if (!egl11.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                FileLog.e("ThanosEffect: failed eglInitialize");
                killInternal();
                return;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.egl.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                kill();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.eglConfig = eGLConfig;
            EGLContext eGLContextEglCreateContext = this.egl.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.eglContext = eGLContextEglCreateContext;
            if (eGLContextEglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                killInternal();
                return;
            }
            EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surfaceTexture, null);
            this.eglSurface = eGLSurfaceEglCreateWindowSurface;
            if (eGLSurfaceEglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                killInternal();
                return;
            }
            if (!this.egl.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                FileLog.e("ThanosEffect: failed eglMakeCurrent");
                killInternal();
                return;
            }
            int iGlCreateShader = GLES20.glCreateShader(35633);
            int iGlCreateShader2 = GLES20.glCreateShader(35632);
            if (iGlCreateShader == 0 || iGlCreateShader2 == 0) {
                FileLog.e("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                killInternal();
                return;
            }
            GLES20.glShaderSource(iGlCreateShader, AndroidUtilities.readRes(R.raw.thanos_vertex));
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                FileLog.e("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                killInternal();
                return;
            }
            GLES20.glShaderSource(iGlCreateShader2, AndroidUtilities.readRes(R.raw.thanos_fragment));
            GLES20.glCompileShader(iGlCreateShader2);
            GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
            if (iArr[0] != 1) {
                FileLog.e("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader2));
                GLES20.glDeleteShader(iGlCreateShader2);
                killInternal();
                return;
            }
            int iGlCreateProgram = GLES20.glCreateProgram();
            this.drawProgram = iGlCreateProgram;
            if (iGlCreateProgram == 0) {
                FileLog.e("ThanosEffect: drawProgram == 0");
                killInternal();
                return;
            }
            GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
            GLES20.glAttachShader(this.drawProgram, iGlCreateShader2);
            GLES30.glTransformFeedbackVaryings(this.drawProgram, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
            GLES20.glLinkProgram(this.drawProgram);
            GLES20.glGetProgramiv(this.drawProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.drawProgram));
                killInternal();
                return;
            }
            this.matrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "matrix");
            this.rectSizeHandle = GLES20.glGetUniformLocation(this.drawProgram, "rectSize");
            this.rectPosHandle = GLES20.glGetUniformLocation(this.drawProgram, "rectPos");
            this.resetHandle = GLES20.glGetUniformLocation(this.drawProgram, "reset");
            this.timeHandle = GLES20.glGetUniformLocation(this.drawProgram, "time");
            this.deltaTimeHandle = GLES20.glGetUniformLocation(this.drawProgram, "deltaTime");
            this.particlesCountHandle = GLES20.glGetUniformLocation(this.drawProgram, "particlesCount");
            this.sizeHandle = GLES20.glGetUniformLocation(this.drawProgram, "size");
            this.gridSizeHandle = GLES20.glGetUniformLocation(this.drawProgram, "gridSize");
            this.textureHandle = GLES20.glGetUniformLocation(this.drawProgram, "tex");
            this.seedHandle = GLES20.glGetUniformLocation(this.drawProgram, "seed");
            this.densityHandle = GLES20.glGetUniformLocation(this.drawProgram, "dp");
            this.longevityHandle = GLES20.glGetUniformLocation(this.drawProgram, "longevity");
            this.offsetHandle = GLES20.glGetUniformLocation(this.drawProgram, "offset");
            this.scaleHandle = GLES20.glGetUniformLocation(this.drawProgram, "scale");
            this.uvOffsetHandle = GLES20.glGetUniformLocation(this.drawProgram, "uvOffset");
            GLES20.glViewport(0, 0, this.width, this.height);
            GLES20.glDisable(3042);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glUseProgram(this.drawProgram);
            GLES20.glUniform2f(this.sizeHandle, this.width, this.height);
        }

        public final void kill() {
            if (!this.alive.get()) {
                FileLog.d("ThanosEffect: kill failed, already dead");
                return;
            }
            FileLog.d("ThanosEffect: kill");
            try {
                Handler handler = getHandler();
                if (handler != null) {
                    handler.sendMessage(handler.obtainMessage(2));
                }
            } catch (Exception unused) {
            }
        }

        public final void killInternal() {
            ArrayList arrayList;
            AtomicBoolean atomicBoolean = this.alive;
            if (!atomicBoolean.get()) {
                FileLog.d("ThanosEffect: killInternal failed, already dead");
                return;
            }
            FileLog.d("ThanosEffect: killInternal");
            int i = 0;
            atomicBoolean.set(false);
            while (true) {
                arrayList = this.pendingAnimations;
                if (i >= arrayList.size()) {
                    break;
                }
                ((Animation) arrayList.get(i)).done();
                i++;
            }
            arrayList.clear();
            SurfaceTexture surfaceTexture = this.surfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            ThanosEffect.ensureRunOnUIThread(this.destroy);
            this.destroy = null;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                looperMyLooper.quit();
            }
        }

        @Override
        public final void run() {
            ArrayList arrayList = this.toAddAnimations;
            int i = 0;
            try {
                init();
                if (!arrayList.isEmpty()) {
                    while (i < arrayList.size()) {
                        addAnimationInternal((Animation) arrayList.get(i));
                        i++;
                    }
                    arrayList.clear();
                }
                super.run();
            } catch (Exception e) {
                FileLog.e(e);
                while (i < arrayList.size()) {
                    Animation animation = (Animation) arrayList.get(i);
                    Runnable runnable = animation.startCallback;
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable);
                    }
                    animation.done();
                    i++;
                }
                arrayList.clear();
                AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(6));
                killInternal();
            }
        }

        public final void animate(Matrix matrix, Bitmap bitmap, PollItemMenu$$ExternalSyntheticLambda8 pollItemMenu$$ExternalSyntheticLambda8, Runnable runnable) {
            if (!this.alive.get()) {
                AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(24, pollItemMenu$$ExternalSyntheticLambda8, runnable));
                ThanosEffect.ensureRunOnUIThread(this.destroy);
                this.destroy = null;
            } else {
                Animation animation = new Animation(matrix, bitmap, pollItemMenu$$ExternalSyntheticLambda8, runnable);
                getHandler();
                this.running = true;
                postRunnable(new ThanosEffect$DrawingThread$$ExternalSyntheticLambda0(this, animation, 1));
            }
        }

        public final class Animation {
            public Bitmap bitmap;
            public final int[] buffer;
            public int currentBuffer;
            public final boolean customMatrix;
            public final float density;
            public Runnable doneCallback;
            public boolean firstDraw;
            public final float[] glMatrixValues;
            public int gridHeight;
            public float gridSize;
            public int gridWidth;
            public boolean invalidateMatrix;
            public final boolean isPhotoEditor;
            public long lastDrawTime;
            public final float left;
            public final float longevity;
            public final Matrix matrix;
            public final float[] matrixValues;
            public float offsetLeft;
            public float offsetTop;
            public int particlesCount;
            public final float seed;
            public final Runnable startCallback;
            public final int[] texture;
            public float time;
            public final float timeScale;
            public final float top;
            public final int viewHeight;
            public final int viewWidth;
            public final ArrayList views;

            public Animation(Matrix matrix, Bitmap bitmap, PollItemMenu$$ExternalSyntheticLambda8 pollItemMenu$$ExternalSyntheticLambda8, Runnable runnable) {
                this.views = new ArrayList();
                this.lastDrawTime = -1L;
                this.time = 0.0f;
                this.firstDraw = true;
                this.offsetLeft = 0.0f;
                this.offsetTop = 0.0f;
                this.left = 0.0f;
                this.top = 0.0f;
                this.density = AndroidUtilities.density;
                this.longevity = 1.5f;
                this.timeScale = 1.15f;
                this.invalidateMatrix = true;
                this.customMatrix = false;
                this.glMatrixValues = new float[9];
                this.matrixValues = new float[9];
                Matrix matrix2 = new Matrix();
                this.matrix = matrix2;
                this.seed = (float) (Math.random() * 2.0d);
                this.texture = new int[1];
                this.buffer = new int[2];
                this.isPhotoEditor = true;
                float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
                matrix.mapPoints(fArr);
                this.left = fArr[0];
                this.top = fArr[1];
                this.viewWidth = (int) MathUtils.distance(fArr[2], fArr[3], fArr[6], fArr[7]);
                this.viewHeight = (int) MathUtils.distance(fArr[4], fArr[5], fArr[6], fArr[7]);
                this.customMatrix = true;
                matrix2.set(matrix);
                retrieveMatrixValues();
                this.startCallback = pollItemMenu$$ExternalSyntheticLambda8;
                this.doneCallback = runnable;
                this.longevity = 4.0f;
                this.time = -0.1f;
                this.bitmap = bitmap;
            }

            public static void drawChildElement(Canvas canvas, ChatMessageCell chatMessageCell, int i, float f, float f2) {
                canvas.save();
                float alpha = chatMessageCell.shouldDrawAlphaLayer() ? chatMessageCell.getAlpha() : 1.0f;
                canvas.translate(f, f2);
                chatMessageCell.setInvalidatesParent(true);
                if (i == 0) {
                    chatMessageCell.drawTime(alpha, canvas, true);
                } else if (i == 1) {
                    chatMessageCell.drawNamesLayout(canvas, alpha);
                } else if (i == 2) {
                    chatMessageCell.drawCaptionLayout(alpha, canvas, chatMessageCell.getCurrentPosition() != null && (chatMessageCell.getCurrentPosition().flags & 1) == 0);
                } else if (chatMessageCell.getCurrentPosition() == null || (chatMessageCell.getCurrentPosition().flags & 1) != 0) {
                    chatMessageCell.drawReactionsLayout(canvas, alpha, null);
                    chatMessageCell.drawCommentLayout(canvas, alpha);
                }
                chatMessageCell.setInvalidatesParent(false);
                canvas.restore();
            }

            public final void done() {
                try {
                    GLES20.glDeleteBuffers(2, this.buffer, 0);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                DrawingThread drawingThread = DrawingThread.this;
                int i = drawingThread.drawProgram;
                if (i != 0) {
                    try {
                        GLES20.glDeleteProgram(i);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    drawingThread.drawProgram = 0;
                }
                try {
                    GLES20.glDeleteTextures(1, this.texture, 0);
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                Runnable runnable = this.doneCallback;
                if (runnable != null) {
                    ThanosEffect.ensureRunOnUIThread(runnable);
                    this.doneCallback = null;
                }
            }

            public final void retrieveMatrixValues() {
                Matrix matrix = this.matrix;
                float[] fArr = this.matrixValues;
                matrix.getValues(fArr);
                float f = fArr[0];
                float[] fArr2 = this.glMatrixValues;
                fArr2[0] = f;
                fArr2[1] = fArr[3];
                fArr2[2] = fArr[6];
                fArr2[3] = fArr[1];
                fArr2[4] = fArr[4];
                fArr2[5] = fArr[7];
                fArr2[6] = fArr[2];
                fArr2[7] = fArr[5];
                fArr2[8] = fArr[8];
                this.invalidateMatrix = false;
            }

            public Animation(DrawingThread drawingThread, ArrayList arrayList, Runnable runnable) {
                RecyclerListView recyclerListView;
                ChatActivity.ChatActivityFragmentView chatActivityFragmentView;
                int i;
                float f;
                float f2;
                ArrayList arrayList2;
                int i2;
                float f3;
                float f4;
                ArrayList arrayList3;
                int i3;
                ?? obj = new Object();
                DrawingThread.this = drawingThread;
                ArrayList arrayList4 = new ArrayList();
                obj.views = arrayList4;
                obj.lastDrawTime = -1L;
                obj.time = 0.0f;
                obj.firstDraw = true;
                obj.offsetLeft = 0.0f;
                obj.offsetTop = 0.0f;
                obj.left = 0.0f;
                obj.top = 0.0f;
                obj.density = AndroidUtilities.density;
                obj.longevity = 1.5f;
                obj.timeScale = 1.15f;
                obj.invalidateMatrix = true;
                obj.customMatrix = false;
                obj.glMatrixValues = new float[9];
                obj.matrixValues = new float[9];
                obj.matrix = new Matrix();
                obj.seed = (float) (Math.random() * 2.0d);
                obj.texture = new int[1];
                obj.buffer = new int[2];
                arrayList4.addAll(arrayList);
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                int iMax = Integer.MIN_VALUE;
                int iMax2 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    View view = (View) arrayList.get(i4);
                    iMin = Math.min(iMin, (int) view.getX());
                    iMax2 = Math.max(iMax2, view.getWidth() + ((int) view.getX()));
                    iMin2 = Math.min(iMin2, (int) view.getY());
                    iMax = Math.max(iMax, view.getHeight() + ((int) view.getY()));
                }
                float f5 = iMin2;
                obj.top = f5;
                float f6 = iMin;
                obj.left = f6;
                obj.viewWidth = iMax2 - iMin;
                obj.viewHeight = iMax - iMin2;
                obj.doneCallback = runnable;
                obj.startCallback = new AlertsCreator$$ExternalSyntheticLambda142(arrayList, 3);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    if (arrayList.get(i5) instanceof ChatMessageCell) {
                        ((ChatMessageCell) arrayList.get(i5)).drawingToBitmap = true;
                    }
                }
                obj.bitmap = Bitmap.createBitmap(obj.viewWidth, obj.viewHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(obj.bitmap);
                if (arrayList.size() > 0 && (((View) arrayList.get(0)).getParent() instanceof RecyclerListView)) {
                    RecyclerListView recyclerListView2 = (RecyclerListView) ((View) arrayList.get(0)).getParent();
                    if (recyclerListView2.getParent() instanceof ChatActivity.ChatActivityFragmentView) {
                        ChatActivity.ChatActivityFragmentView chatActivityFragmentView2 = (ChatActivity.ChatActivityFragmentView) recyclerListView2.getParent();
                        ChatActivity chatActivity = chatActivityFragmentView2.getChatActivity();
                        ArrayList arrayList5 = new ArrayList(10);
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        int iSave = canvas.save();
                        int i6 = 0;
                        ?? r1 = obj;
                        while (i6 < 3) {
                            arrayList5.clear();
                            if (i6 != 2 || recyclerListView2.fastScrollAnimationRunning) {
                                recyclerListView = recyclerListView2;
                                int i7 = 0;
                                while (true) {
                                    chatActivityFragmentView = chatActivityFragmentView2;
                                    if (i7 >= arrayList.size()) {
                                        break;
                                    }
                                    View view2 = (View) arrayList.get(i7);
                                    if (view2 instanceof ChatMessageCell) {
                                        ChatMessageCell chatMessageCell = (ChatMessageCell) view2;
                                        if (view2.getY() > recyclerListView.getHeight() || view2.getY() + view2.getHeight() < 0.0f) {
                                            i2 = i7;
                                        } else {
                                            i2 = i7;
                                            if (chatMessageCell.getVisibility() != 4 && chatMessageCell.getVisibility() != 8) {
                                                MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                                                MessageObject.GroupedMessagePosition position = (currentMessagesGroup == null || currentMessagesGroup.positions == null) ? null : currentMessagesGroup.getPosition(chatMessageCell.getMessageObject());
                                                f3 = f5;
                                                if (i6 == 0 && (position != null || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner)) {
                                                    if (position == null || position.last || (position.minX == 0 && position.minY == 0)) {
                                                        if (position == null || position.last) {
                                                            arrayList6.add(chatMessageCell);
                                                        }
                                                        if ((position == null || (position.minX == 0 && position.minY == 0)) && chatMessageCell.hasNameLayout()) {
                                                            arrayList7.add(chatMessageCell);
                                                        }
                                                    }
                                                    if (position != null || chatMessageCell.getTransitionParams().transformGroupToSingleMessage || chatMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                                                        if (position == null || (position.flags & chatMessageCell.captionFlag()) != 0) {
                                                            arrayList8.add(chatMessageCell);
                                                        }
                                                        if (position != null) {
                                                            int i8 = position.flags;
                                                            if ((i8 & 8) != 0 && (i8 & 1) != 0) {
                                                                arrayList9.add(chatMessageCell);
                                                            }
                                                        } else {
                                                            arrayList9.add(chatMessageCell);
                                                        }
                                                    }
                                                }
                                                if (currentMessagesGroup != null) {
                                                    if (i6 == 0) {
                                                        i3 = 1;
                                                        if (currentMessagesGroup.messages.size() != 1) {
                                                        }
                                                    } else {
                                                        i3 = 1;
                                                    }
                                                    if ((i6 != i3 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i6 != 0 || !chatMessageCell.getMessageObject().deleted) && ((i6 != 1 || chatMessageCell.getMessageObject().deleted) && ((i6 != 2 || chatMessageCell.willRemoved) && (i6 == 2 || !chatMessageCell.willRemoved))))) {
                                                        if (!arrayList5.contains(currentMessagesGroup)) {
                                                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                                            transitionParams.left = 0;
                                                            transitionParams.top = 0;
                                                            transitionParams.right = 0;
                                                            transitionParams.bottom = 0;
                                                            transitionParams.pinnedBotton = false;
                                                            transitionParams.pinnedTop = false;
                                                            transitionParams.cell = chatMessageCell;
                                                            arrayList5.add(currentMessagesGroup);
                                                        }
                                                        currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell.isPinnedTop();
                                                        currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell.isPinnedBottom();
                                                        int backgroundDrawableLeft = chatMessageCell.getBackgroundDrawableLeft() + chatMessageCell.getLeft();
                                                        int backgroundDrawableRight = chatMessageCell.getBackgroundDrawableRight() + chatMessageCell.getLeft();
                                                        int backgroundDrawableTop = chatMessageCell.getBackgroundDrawableTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getTop();
                                                        int backgroundDrawableBottom = chatMessageCell.getBackgroundDrawableBottom() + chatMessageCell.getPaddingTop() + chatMessageCell.getTop();
                                                        i6 = i6;
                                                        f4 = f6;
                                                        int iDp = (chatMessageCell.getCurrentPosition().flags & 4) == 0 ? backgroundDrawableTop - AndroidUtilities.dp(10.0f) : backgroundDrawableTop;
                                                        arrayList3 = arrayList6;
                                                        int iDp2 = (chatMessageCell.getCurrentPosition().flags & 8) == 0 ? AndroidUtilities.dp(10.0f) + backgroundDrawableBottom : backgroundDrawableBottom;
                                                        if (chatMessageCell.willRemoved) {
                                                            currentMessagesGroup.transitionParams.cell = chatMessageCell;
                                                        }
                                                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                                        int i9 = transitionParams2.top;
                                                        if (i9 == 0 || iDp < i9) {
                                                            transitionParams2.top = iDp;
                                                        }
                                                        int i10 = transitionParams2.bottom;
                                                        if (i10 == 0 || iDp2 > i10) {
                                                            transitionParams2.bottom = iDp2;
                                                        }
                                                        int i11 = transitionParams2.left;
                                                        if (i11 == 0 || backgroundDrawableLeft < i11) {
                                                            transitionParams2.left = backgroundDrawableLeft;
                                                        }
                                                        int i12 = transitionParams2.right;
                                                        if (i12 == 0 || backgroundDrawableRight > i12) {
                                                            transitionParams2.right = backgroundDrawableRight;
                                                        }
                                                    }
                                                }
                                                i6 = i6;
                                                f4 = f6;
                                                arrayList3 = arrayList6;
                                            }
                                        }
                                        f3 = f5;
                                        f4 = f6;
                                        arrayList3 = arrayList6;
                                    } else {
                                        i2 = i7;
                                        f3 = f5;
                                        f4 = f6;
                                        arrayList3 = arrayList6;
                                    }
                                    i7 = i2 + 1;
                                    arrayList6 = arrayList3;
                                    chatActivityFragmentView2 = chatActivityFragmentView;
                                    f5 = f3;
                                    i6 = i6;
                                    f6 = f4;
                                }
                                i = i6;
                                f = f5;
                                f2 = f6;
                                ArrayList arrayList10 = arrayList6;
                                int i13 = 0;
                                ?? r2 = r1;
                                while (i13 < arrayList5.size()) {
                                    MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) arrayList5.get(i13);
                                    float nonAnimationTranslationX = groupedMessages.transitionParams.cell.getNonAnimationTranslationX(true);
                                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages.transitionParams;
                                    float f7 = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                                    float fDp = transitionParams3.top + transitionParams3.offsetTop;
                                    float f8 = transitionParams3.right + nonAnimationTranslationX + transitionParams3.offsetRight;
                                    int i14 = i13;
                                    float fDp2 = transitionParams3.bottom + transitionParams3.offsetBottom;
                                    if (!transitionParams3.backgroundChangeBounds) {
                                        fDp += transitionParams3.cell.getTranslationY();
                                        fDp2 += groupedMessages.transitionParams.cell.getTranslationY();
                                    }
                                    fDp = fDp < (chatActivity.chatListViewPaddingTop - ((float) chatActivity.chatListViewPaddingVisibleOffset)) - ((float) AndroidUtilities.dp(20.0f)) ? (chatActivity.chatListViewPaddingTop - chatActivity.chatListViewPaddingVisibleOffset) - AndroidUtilities.dp(20.0f) : fDp;
                                    fDp2 = fDp2 > ((float) (AndroidUtilities.dp(20.0f) + recyclerListView.getMeasuredHeight())) ? AndroidUtilities.dp(20.0f) + recyclerListView.getMeasuredHeight() : fDp2;
                                    float f9 = r2.top;
                                    float f10 = fDp - f9;
                                    float f11 = fDp2 - f9;
                                    float f12 = r2.left;
                                    float f13 = f7 - f12;
                                    float f14 = f8 - f12;
                                    boolean z = (groupedMessages.transitionParams.cell.getScaleX() == 1.0f && groupedMessages.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                                    if (z) {
                                        canvas.save();
                                        canvas.scale(groupedMessages.transitionParams.cell.getScaleX(), groupedMessages.transitionParams.cell.getScaleY(), ImageReceiver$$ExternalSyntheticOutline0.m(f14, f13, 2.0f, f13), ImageReceiver$$ExternalSyntheticOutline0.m(f11, f10, 2.0f, f10));
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages.transitionParams;
                                    ArrayList arrayList11 = arrayList8;
                                    ArrayList arrayList12 = arrayList10;
                                    ArrayList arrayList13 = arrayList7;
                                    transitionParams4.cell.drawBackground(canvas, (int) f13, (int) f10, (int) f14, (int) f11, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, chatActivityFragmentView.getKeyboardHeight());
                                    MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages.transitionParams;
                                    transitionParams5.cell = null;
                                    transitionParams5.drawCaptionLayout = groupedMessages.hasCaption;
                                    if (z) {
                                        canvas.restore();
                                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                            View view3 = (View) arrayList.get(i15);
                                            if (view3 instanceof ChatMessageCell) {
                                                ChatMessageCell chatMessageCell2 = (ChatMessageCell) view3;
                                                if (chatMessageCell2.getCurrentMessagesGroup() == groupedMessages) {
                                                    int left = chatMessageCell2.getLeft();
                                                    int top = chatMessageCell2.getTop();
                                                    view3.setPivotX(((f14 - f13) / 2.0f) + (f13 - left));
                                                    view3.setPivotY(((f11 - f10) / 2.0f) + (f10 - top));
                                                }
                                            }
                                        }
                                    }
                                    arrayList10 = arrayList12;
                                    arrayList7 = arrayList13;
                                    i13 = i14 + 1;
                                    arrayList8 = arrayList11;
                                    arrayList5 = arrayList5;
                                    r2 = this;
                                }
                                arrayList2 = arrayList10;
                            } else {
                                recyclerListView = recyclerListView2;
                                i = i6;
                                chatActivityFragmentView = chatActivityFragmentView2;
                                f = f5;
                                f2 = f6;
                                arrayList2 = arrayList6;
                            }
                            i6 = i + 1;
                            arrayList6 = arrayList2;
                            arrayList7 = arrayList7;
                            arrayList8 = arrayList8;
                            chatActivityFragmentView2 = chatActivityFragmentView;
                            f5 = f;
                            f6 = f2;
                            arrayList5 = arrayList5;
                            r1 = this;
                            recyclerListView2 = recyclerListView;
                        }
                        RecyclerListView recyclerListView3 = recyclerListView2;
                        float f15 = f5;
                        float f16 = f6;
                        ArrayList arrayList14 = arrayList6;
                        ArrayList arrayList15 = arrayList7;
                        ArrayList arrayList16 = arrayList8;
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            View view4 = (View) arrayList.get(i16);
                            canvas.save();
                            canvas.translate(view4.getX() - f16, view4.getY() - f15);
                            view4.draw(canvas);
                            if (view4 instanceof ChatMessageCell) {
                                ((ChatMessageCell) view4).drawOutboundsContent(canvas);
                            } else if (view4 instanceof ChatActionCell) {
                                ((ChatActionCell) view4).drawOutboundsContent(canvas);
                            }
                            canvas.restore();
                        }
                        recyclerListView3.getY();
                        float f17 = chatActivity.chatListViewPaddingTop;
                        AndroidUtilities.dp(4.0f);
                        int size = arrayList14.size();
                        if (size > 0) {
                            for (int i17 = 0; i17 < size; i17++) {
                                ChatMessageCell chatMessageCell3 = (ChatMessageCell) arrayList14.get(i17);
                                drawChildElement(canvas, chatMessageCell3, 0, chatMessageCell3.getX() - f16, chatMessageCell3.getY() - f15);
                            }
                            arrayList14.clear();
                        }
                        int size2 = arrayList15.size();
                        if (size2 > 0) {
                            for (int i18 = 0; i18 < size2; i18++) {
                                ChatMessageCell chatMessageCell4 = (ChatMessageCell) arrayList15.get(i18);
                                drawChildElement(canvas, chatMessageCell4, 1, chatMessageCell4.getX() - f16, chatMessageCell4.getY() - f15);
                            }
                            arrayList15.clear();
                        }
                        int size3 = arrayList16.size();
                        if (size3 > 0) {
                            for (int i19 = 0; i19 < size3; i19++) {
                                ChatMessageCell chatMessageCell5 = (ChatMessageCell) arrayList16.get(i19);
                                if (chatMessageCell5.getCurrentPosition() != null || chatMessageCell5.getTransitionParams().animateBackgroundBoundsInner) {
                                    drawChildElement(canvas, chatMessageCell5, 2, chatMessageCell5.getX() - f16, chatMessageCell5.getY() - f15);
                                }
                            }
                            arrayList16.clear();
                        }
                        int size4 = arrayList9.size();
                        if (size4 > 0) {
                            for (int i20 = 0; i20 < size4; i20++) {
                                ChatMessageCell chatMessageCell6 = (ChatMessageCell) arrayList9.get(i20);
                                if (chatMessageCell6.getCurrentPosition() != null || chatMessageCell6.getTransitionParams().animateBackgroundBoundsInner) {
                                    drawChildElement(canvas, chatMessageCell6, 3, chatMessageCell6.getX() - f16, chatMessageCell6.getY() - f15);
                                }
                            }
                            arrayList9.clear();
                        }
                        try {
                            canvas.restoreToCount(iSave);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        for (int i21 = 0; i21 < arrayList.size(); i21++) {
                            if (arrayList.get(i21) instanceof ChatMessageCell) {
                                ((ChatMessageCell) arrayList.get(i21)).drawingToBitmap = false;
                            }
                        }
                    }
                }
            }

            public Animation(View view, float f, Runnable runnable) {
                ChatMessageCell chatMessageCell;
                ArrayList arrayList = new ArrayList();
                this.views = arrayList;
                this.lastDrawTime = -1L;
                this.time = 0.0f;
                this.firstDraw = true;
                this.offsetLeft = 0.0f;
                this.offsetTop = 0.0f;
                this.left = 0.0f;
                this.top = 0.0f;
                this.density = AndroidUtilities.density;
                this.longevity = 1.5f;
                this.timeScale = 1.15f;
                this.invalidateMatrix = true;
                this.customMatrix = false;
                this.glMatrixValues = new float[9];
                this.matrixValues = new float[9];
                this.matrix = new Matrix();
                this.seed = (float) (Math.random() * 2.0d);
                this.texture = new int[1];
                this.buffer = new int[2];
                arrayList.add(view);
                this.viewWidth = view.getWidth();
                int height = view.getHeight();
                this.viewHeight = height;
                this.top = view.getY();
                this.left = 0.0f;
                if (view instanceof BaseCell) {
                    BaseCell baseCell = (BaseCell) view;
                    this.viewWidth = Math.max(1, baseCell.getBoundsRight() - baseCell.getBoundsLeft());
                    this.left = baseCell.getBoundsLeft() + 0.0f;
                }
                this.doneCallback = runnable;
                this.startCallback = new SeekBarView$$ExternalSyntheticLambda1(this, 29);
                this.longevity = 1.5f * f;
                this.timeScale = 1.15f / (((f - 1.0f) / 3.0f) + 1.0f);
                this.bitmap = Bitmap.createBitmap(this.viewWidth, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.bitmap);
                int iSave = canvas.save();
                canvas.translate(-this.left, 0.0f);
                boolean z = view instanceof ChatMessageCell;
                if (z) {
                    ((ChatMessageCell) view).drawingToBitmap = true;
                }
                boolean z2 = view instanceof ChatActionCell;
                if (z2) {
                    ChatActionCell chatActionCell = (ChatActionCell) view;
                    if (chatActionCell.hasGradientService()) {
                        canvas.save();
                        canvas.translate(chatActionCell.sideMenuWidth / 2.0f, view.getPaddingTop());
                        chatActionCell.drawBackground(canvas, true);
                        chatActionCell.drawReactions(canvas, true);
                        canvas.restore();
                    } else if (z) {
                        chatMessageCell = (ChatMessageCell) view;
                        if (chatMessageCell.drawBackgroundInParent()) {
                            canvas.save();
                            canvas.translate(0.0f, view.getPaddingTop());
                            chatMessageCell.drawBackgroundInternal(canvas, true, false);
                            canvas.restore();
                        }
                    }
                } else if (z) {
                    chatMessageCell = (ChatMessageCell) view;
                    if (chatMessageCell.drawBackgroundInParent()) {
                        canvas.save();
                        canvas.translate(0.0f, view.getPaddingTop());
                        chatMessageCell.drawBackgroundInternal(canvas, true, false);
                        canvas.restore();
                    }
                }
                view.draw(canvas);
                if (z) {
                    ChatMessageCell chatMessageCell2 = (ChatMessageCell) view;
                    ImageReceiver avatarImage = chatMessageCell2.getAvatarImage();
                    if (avatarImage != null && avatarImage.getVisible()) {
                        canvas.save();
                        canvas.translate(0.0f, -view.getY());
                        avatarImage.draw(canvas);
                        canvas.restore();
                    }
                    chatMessageCell2.drawingToBitmap = false;
                }
                if (z) {
                    canvas.save();
                    canvas.translate(0.0f, view.getPaddingTop());
                    ((ChatMessageCell) view).drawOutboundsContent(canvas);
                    canvas.restore();
                } else if (z2) {
                    ((ChatActionCell) view).drawOutboundsContent(canvas);
                }
                try {
                    canvas.restoreToCount(iSave);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.left = view.getX() + this.left;
            }
        }
    }
}
