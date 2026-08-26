package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Property;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertController;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.gms.cast.framework.media.zzq;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView$CameraGLThread$$ExternalSyntheticOutline0;
import org.telegram.messenger.camera.CameraView$VideoRecorder$$ExternalSyntheticOutline0;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretVoicePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.FlashViews;

public class InstantCameraView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] ALLOW_BIG_CAMERA_WHITELIST = {285904780, -1394191079};
    public boolean allowSendingWhileRecording;
    public float animationTranslationY;
    public AnimatorSet animatorSet;
    public final org.telegram.messenger.camera.Size aspectRatio;
    public boolean bothCameras;
    public final LinearLayout buttonsLayout;
    public final int buttonsSizePx;
    public Camera2Session camera2SessionCurrent;
    public final Camera2Session[] camera2Sessions;
    public final AnonymousClass2 cameraContainer;
    public AnonymousClass7 cameraFile;
    public volatile boolean cameraReady;
    public CameraSession cameraSession;
    public final int[] cameraTexture;
    public float cameraTextureAlpha;
    public volatile boolean cameraTextureAvailable;
    public CameraGLThread cameraThread;
    public boolean cancelled;
    public final int currentAccount;
    public final Delegate delegate;
    public TLRPC.InputEncryptedFile encryptedFile;
    public TLRPC.InputFile file;
    public ValueAnimator finishZoomTransition;
    public Bitmap firstFrameThumb;
    public final FlashViews.ImageViewInvertable flashButton;
    public RLottieDrawable flashOffDrawable;
    public RLottieDrawable flashOnDrawable;
    public final FlashViews flashViews;
    public boolean flashing;
    public boolean flipAnimationInProgress;
    public boolean frontFlashing;
    public boolean isFrontface;
    public boolean isInPinchToZoomTouchMode;
    public final boolean isSecretChat;
    public byte[] iv;
    public byte[] key;
    public Bitmap lastBitmap;
    public final float[] mMVPMatrix;
    public final float[] mSTMatrix;
    public boolean maybePinchToZoomTouchMode;
    public final float[] moldSTMatrix;
    public AnimatorSet muteAnimation;
    public final ImageView muteImageView;
    public boolean needDrawFlickerStub;
    public final int[] oldCameraTexture;
    public org.telegram.messenger.camera.Size oldTexturePreviewSize;
    public FloatBuffer oldTextureTextureBuffer;
    public boolean opened;
    public final ProfileActivity.AnonymousClass1 paint;
    public float panTranslationY;
    public final View parentView;
    public org.telegram.messenger.camera.Size pictureSize;
    public float pinchScale;
    public float pinchStartDistance;
    public int pointerId1;
    public int pointerId2;
    public final int[] position;
    public File previewFile;
    public final org.telegram.messenger.camera.Size[] previewSize;
    public float progress;
    public Timer progressTimer;
    public long recordPlusTime;
    public long recordStartTime;
    public long recordedTime;
    public boolean recording;
    public final int recordingGuid;
    public final RectF rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public float scaleX;
    public float scaleY;
    public CameraInfo selectedCamera;
    public boolean setVisibilityFromPause;
    public long size;
    public volatile int surfaceIndex;
    public final FlashViews.ImageViewInvertable switchCameraButton;
    public RLottieDrawable switchCameraDrawable;
    public FloatBuffer textureBuffer;
    public final ChatActivity.AnonymousClass69 textureOverlayView;
    public TextureView textureView;
    public int textureViewSize;
    public boolean updateTextureViewSize;
    public final boolean useCamera2;
    public FloatBuffer vertexBuffer;
    public VideoEditedInfo videoEditedInfo;
    public VideoRecorder videoEncoder;
    public VideoPlayer videoPlayer;
    public Boolean wasFlashing;

    public final class AnonymousClass2 extends InstantViewCameraContainer {
        public AnonymousClass2(Context context) {
            super(context);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            InstantCameraView.this.invalidate();
        }

        @Override
        public final void setRotationY(float f) {
            super.setRotationY(f);
            InstantCameraView.this.invalidate();
        }
    }

    public final class AnonymousClass7 extends File {
        @Override
        public final boolean delete() {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file");
            }
            return super.delete();
        }
    }

    public final class AnonymousClass9 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final InstantCameraView this$0;

        public AnonymousClass9(InstantCameraView instantCameraView, int i) {
            this.$r8$classId = i;
            this.this$0 = instantCameraView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    InstantCameraView instantCameraView = this.this$0;
                    if (animator.equals(instantCameraView.animatorSet)) {
                        instantCameraView.hideCamera(true);
                        instantCameraView.setVisibilityFromPause = false;
                        instantCameraView.setVisibility(4);
                    }
                    break;
                case 1:
                    InstantCameraView instantCameraView2 = this.this$0;
                    if (animator.equals(instantCameraView2.muteAnimation)) {
                        instantCameraView2.muteAnimation = null;
                    }
                    break;
                default:
                    InstantCameraView instantCameraView3 = this.this$0;
                    if (instantCameraView3.finishZoomTransition != null) {
                        instantCameraView3.finishZoomTransition = null;
                    }
                    break;
            }
        }
    }

    public final class AudioBufferInfo {
        public boolean last;
        public int lastWroteBuffer;
        public int results;
        public final ByteBuffer[] buffer = new ByteBuffer[10];
        public final long[] offset = new long[10];
        public final int[] read = new int[10];

        public AudioBufferInfo() {
            for (int i = 0; i < 10; i++) {
                this.buffer[i] = ByteBuffer.allocateDirect(2048);
                this.buffer[i].order(ByteOrder.nativeOrder());
            }
        }
    }

    public final class CameraGLThread extends DispatchQueue {
        public Integer cameraId;
        public final SurfaceTexture[] cameraSurface;
        public Object currentSession;
        public int drawProgram;
        public EGL10 egl10;
        public EGLContext eglContext;
        public EGLDisplay eglDisplay;
        public EGLSurface eglSurface;
        public boolean initied;
        public int positionHandle;
        public boolean recording;
        public int surfaceHeight;
        public final SurfaceTexture surfaceTexture;
        public int surfaceWidth;
        public int textureHandle;
        public int textureMatrixHandle;
        public int vertexMatrixHandle;

        public CameraGLThread(SurfaceTexture surfaceTexture, int i, int i2) {
            super("CameraGLThread");
            this.cameraSurface = new SurfaceTexture[2];
            this.cameraId = 0;
            this.surfaceTexture = surfaceTexture;
            this.surfaceWidth = i;
            this.surfaceHeight = i2;
        }

        public final void finish() {
            EGLContext eGLContext;
            if (this.cameraSurface != null) {
                for (int i = 0; i < 2; i++) {
                    SurfaceTexture surfaceTexture = this.cameraSurface[i];
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        this.cameraSurface[i] = null;
                    }
                }
            }
            InstantCameraView.this.cameraTextureAvailable = false;
            if (this.eglSurface != null && (eGLContext = this.eglContext) != null) {
                if (!eGLContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                    EGL10 egl10 = this.egl10;
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = this.eglSurface;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
                }
                int[] iArr = InstantCameraView.this.cameraTexture;
                if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                    GLES20.glDeleteTextures(1, iArr, 0);
                    InstantCameraView.this.cameraTexture[0] = Integer.MIN_VALUE;
                }
                int[] iArr2 = InstantCameraView.this.cameraTexture;
                if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                    GLES20.glDeleteTextures(1, iArr2, 1);
                    InstantCameraView.this.cameraTexture[1] = Integer.MIN_VALUE;
                }
            }
            if (this.eglSurface != null) {
                EGL10 egl11 = this.egl10;
                EGLDisplay eGLDisplay2 = this.eglDisplay;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl11.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext2 = this.eglContext;
            if (eGLContext2 != null) {
                this.egl10.eglDestroyContext(this.eglDisplay, eGLContext2);
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay3 = this.eglDisplay;
            if (eGLDisplay3 != null) {
                this.egl10.eglTerminate(eGLDisplay3);
                this.eglDisplay = null;
            }
        }

        @Override
        public final void handleMessage(Message message) {
            boolean z;
            int currentOrientation;
            Object obj;
            boolean z2;
            VideoRecorder videoRecorder;
            int worldAngle;
            final int i = 0;
            final int i2 = 1;
            int i3 = message.what;
            if (i3 != 0) {
                if (i3 == 1) {
                    finish();
                    if (this.recording && ((!((z2 = (obj = message.obj) instanceof SendOptions)) || ((SendOptions) obj).ttl != -2) && (videoRecorder = InstantCameraView.this.videoEncoder) != null)) {
                        videoRecorder.stopRecording(message.arg1, z2 ? (SendOptions) obj : null);
                    }
                    Looper looperMyLooper = Looper.myLooper();
                    if (looperMyLooper != null) {
                        looperMyLooper.quit();
                        return;
                    }
                    return;
                }
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        InstantCameraView instantCameraView = InstantCameraView.this;
                        instantCameraView.surfaceIndex = 1 - instantCameraView.surfaceIndex;
                        updateScale();
                        InstantCameraView instantCameraView2 = InstantCameraView.this;
                        float f = (1.0f / instantCameraView2.scaleX) / 2.0f;
                        float f2 = (1.0f / instantCameraView2.scaleY) / 2.0f;
                        float f3 = 0.5f - f;
                        float f4 = 0.5f - f2;
                        float f5 = f + 0.5f;
                        float f6 = f2 + 0.5f;
                        instantCameraView2.textureBuffer = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(32));
                        InstantCameraView.this.textureBuffer.put(new float[]{f3, f4, f5, f4, f3, f6, f5, f6}).position(0);
                        return;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera set gl renderer session");
                    }
                    Object obj2 = message.obj;
                    Object obj3 = this.currentSession;
                    if (obj3 != obj2) {
                        this.currentSession = obj2;
                        return;
                    }
                    if (obj3 instanceof CameraSession) {
                        worldAngle = ((CameraSession) obj3).getWorldAngle();
                    } else {
                        worldAngle = obj3 instanceof Camera2Session ? ((Camera2Session) obj3).getWorldAngle() : 0;
                    }
                    Matrix.setIdentityM(InstantCameraView.this.mMVPMatrix, 0);
                    if (worldAngle != 0) {
                        Matrix.rotateM(InstantCameraView.this.mMVPMatrix, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                }
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.egl10.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.cameraSurface[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(InstantCameraView.this.moldSTMatrix);
                    this.cameraSurface[0].setOnFrameAvailableListener(null);
                    this.cameraSurface[0].release();
                    InstantCameraView instantCameraView3 = InstantCameraView.this;
                    int[] iArr = instantCameraView3.oldCameraTexture;
                    int[] iArr2 = instantCameraView3.cameraTexture;
                    iArr[0] = iArr2[0];
                    instantCameraView3.cameraTextureAlpha = 0.0f;
                    iArr2[0] = 0;
                    instantCameraView3.oldTextureTextureBuffer = instantCameraView3.textureBuffer.duplicate();
                    InstantCameraView instantCameraView4 = InstantCameraView.this;
                    instantCameraView4.oldTexturePreviewSize = instantCameraView4.previewSize[0];
                }
                this.cameraId = Integer.valueOf(this.cameraId.intValue() + 1);
                InstantCameraView.this.cameraReady = false;
                GLES20.glGenTextures(1, InstantCameraView.this.cameraTexture, 0);
                GLES20.glBindTexture(36197, InstantCameraView.this.cameraTexture[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.cameraSurface[0] = new SurfaceTexture(InstantCameraView.this.cameraTexture[0]);
                this.cameraSurface[0].setOnFrameAvailableListener(new FilterGLThread$$ExternalSyntheticLambda8(this, 1));
                InstantCameraView instantCameraView5 = InstantCameraView.this;
                SurfaceTexture surfaceTexture2 = this.cameraSurface[0];
                instantCameraView5.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(instantCameraView5, i, surfaceTexture2, 23));
                updateScale();
                InstantCameraView instantCameraView6 = InstantCameraView.this;
                float f7 = (1.0f / instantCameraView6.scaleX) / 2.0f;
                float f8 = (1.0f / instantCameraView6.scaleY) / 2.0f;
                float f9 = 0.5f - f7;
                float f10 = 0.5f - f8;
                float f11 = f7 + 0.5f;
                float f12 = f8 + 0.5f;
                instantCameraView6.textureBuffer = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(32));
                InstantCameraView.this.textureBuffer.put(new float[]{f9, f10, f11, f10, f9, f12, f11, f12}).position(0);
                return;
            }
            int i4 = message.arg1;
            int i5 = message.arg2;
            boolean z3 = (i5 & 1) != 0;
            boolean z4 = (i5 & 2) != 0;
            if (this.initied) {
                if (!this.eglContext.equals(this.egl10.eglGetCurrentContext()) || !this.eglSurface.equals(this.egl10.eglGetCurrentSurface(12377))) {
                    EGL10 egl11 = this.egl10;
                    EGLDisplay eGLDisplay2 = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (!egl11.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.eglContext)) {
                        if (BuildVars.LOGS_ENABLED) {
                            CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                            return;
                        }
                        return;
                    }
                }
                if (z3) {
                    this.cameraSurface[0].updateTexImage();
                }
                if (z4) {
                    this.cameraSurface[1].updateTexImage();
                }
                if (this.recording) {
                    z = false;
                } else {
                    InstantCameraView instantCameraView7 = InstantCameraView.this;
                    if (instantCameraView7.videoEncoder == null) {
                        instantCameraView7.videoEncoder = instantCameraView7.new VideoRecorder();
                    }
                    InstantCameraView instantCameraView8 = InstantCameraView.this;
                    if (instantCameraView8.videoEncoder.started) {
                        if (!instantCameraView8.cameraReady) {
                            InstantCameraView.this.cameraReady = true;
                            AndroidUtilities.runOnUIThread(new Runnable(this) {
                                public final InstantCameraView.CameraGLThread f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void run() {
                                    switch (i) {
                                        case 0:
                                            InstantCameraView.this.textureOverlayView.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                            break;
                                        default:
                                            InstantCameraView instantCameraView9 = InstantCameraView.this;
                                            if (instantCameraView9.textureView != null) {
                                                Bitmap bitmap = instantCameraView9.firstFrameThumb;
                                                if (bitmap != null) {
                                                    bitmap.recycle();
                                                    instantCameraView9.firstFrameThumb = null;
                                                }
                                                instantCameraView9.firstFrameThumb = instantCameraView9.textureView.getBitmap();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                    InstantCameraView instantCameraView9 = InstantCameraView.this;
                    instantCameraView9.videoEncoder.startRecording(instantCameraView9.cameraFile, EGL14.eglGetCurrentContext());
                    Object obj4 = this.currentSession;
                    if (obj4 instanceof CameraSession) {
                        currentOrientation = ((CameraSession) obj4).getCurrentOrientation();
                    } else {
                        currentOrientation = obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                    }
                    if (currentOrientation == 90 || currentOrientation == 270) {
                        InstantCameraView instantCameraView10 = InstantCameraView.this;
                        float f13 = instantCameraView10.scaleX;
                        instantCameraView10.scaleX = instantCameraView10.scaleY;
                        instantCameraView10.scaleY = f13;
                    }
                    this.recording = true;
                    InstantCameraView.this.updateFlash();
                }
                InstantCameraView instantCameraView11 = InstantCameraView.this;
                if (instantCameraView11.videoEncoder != null && ((instantCameraView11.surfaceIndex == 0 && z3) || (InstantCameraView.this.surfaceIndex == 1 && z4))) {
                    InstantCameraView instantCameraView12 = InstantCameraView.this;
                    VideoRecorder videoRecorder2 = instantCameraView12.videoEncoder;
                    SurfaceTexture surfaceTexture3 = this.cameraSurface[instantCameraView12.surfaceIndex];
                    InstantCameraView instantCameraView13 = InstantCameraView.this;
                    if (instantCameraView13.bothCameras) {
                        i4 = instantCameraView13.surfaceIndex;
                    }
                    Integer numValueOf = Integer.valueOf(i4);
                    long jNanoTime = System.nanoTime();
                    synchronized (videoRecorder2.sync) {
                        try {
                            if (videoRecorder2.ready) {
                                long timestamp = surfaceTexture3.getTimestamp();
                                if (timestamp == 0) {
                                    int i6 = videoRecorder2.zeroTimeStamps + 1;
                                    videoRecorder2.zeroTimeStamps = i6;
                                    if (i6 > 1) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("InstantCamera fix timestamp enabled");
                                        }
                                    }
                                } else {
                                    videoRecorder2.zeroTimeStamps = 0;
                                    jNanoTime = timestamp;
                                }
                                videoRecorder2.handler.sendMessage(videoRecorder2.handler.obtainMessage(2, (int) (jNanoTime >> 32), (int) jNanoTime, numValueOf));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.cameraSurface[InstantCameraView.this.surfaceIndex].getTransformMatrix(InstantCameraView.this.mSTMatrix);
                GLES20.glUseProgram(this.drawProgram);
                GLES20.glActiveTexture(33984);
                InstantCameraView instantCameraView14 = InstantCameraView.this;
                GLES20.glBindTexture(36197, instantCameraView14.cameraTexture[instantCameraView14.surfaceIndex]);
                GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (Buffer) InstantCameraView.this.vertexBuffer);
                GLES20.glEnableVertexAttribArray(this.positionHandle);
                GLES20.glVertexAttribPointer(this.textureHandle, 2, 5126, false, 8, (Buffer) InstantCameraView.this.textureBuffer);
                GLES20.glEnableVertexAttribArray(this.textureHandle);
                GLES20.glUniformMatrix4fv(this.textureMatrixHandle, 1, false, InstantCameraView.this.mSTMatrix, 0);
                GLES20.glUniformMatrix4fv(this.vertexMatrixHandle, 1, false, InstantCameraView.this.mMVPMatrix, 0);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glDisableVertexAttribArray(this.positionHandle);
                GLES20.glDisableVertexAttribArray(this.textureHandle);
                GLES20.glBindTexture(36197, 0);
                GLES20.glUseProgram(0);
                this.egl10.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final InstantCameraView.CameraGLThread f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    InstantCameraView.this.textureOverlayView.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                    break;
                                default:
                                    InstantCameraView instantCameraView15 = InstantCameraView.this;
                                    if (instantCameraView15.textureView != null) {
                                        Bitmap bitmap = instantCameraView15.firstFrameThumb;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            instantCameraView15.firstFrameThumb = null;
                                        }
                                        instantCameraView15.firstFrameThumb = instantCameraView15.textureView.getBitmap();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        }

        public final void requestRender(boolean z, boolean z2) {
            Handler handler = getHandler();
            if (handler != null) {
                sendMessage(handler.obtainMessage(0, this.cameraId.intValue(), (z ? 1 : 0) + (z2 ? 2 : 0)), 0);
            }
        }

        @Override
        public final void run() {
            boolean z = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera start init gl");
            }
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("InstantCamera eglGetDisplay failed "));
                }
                finish();
            } else if (this.egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.egl10.eglChooseConfig(this.eglDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("InstantCamera eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eGLContextEglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    this.eglContext = eGLContextEglCreateContext;
                    if (eGLContextEglCreateContext == null) {
                        if (BuildVars.LOGS_ENABLED) {
                            CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("InstantCamera eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        SurfaceTexture surfaceTexture = this.surfaceTexture;
                        if (surfaceTexture != null) {
                            EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, eGLConfig, surfaceTexture, null);
                            this.eglSurface = eGLSurfaceEglCreateWindowSurface;
                            if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (BuildVars.LOGS_ENABLED) {
                                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("InstantCamera createWindowSurface failed "));
                                }
                                finish();
                            } else {
                                if (this.egl10.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                                    updateScale();
                                    InstantCameraView instantCameraView = InstantCameraView.this;
                                    float f = (1.0f / instantCameraView.scaleX) / 2.0f;
                                    float f2 = (1.0f / instantCameraView.scaleY) / 2.0f;
                                    float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                    float f3 = 0.5f - f;
                                    float f4 = 0.5f - f2;
                                    float f5 = f + 0.5f;
                                    float f6 = f2 + 0.5f;
                                    float[] fArr2 = {f3, f4, f5, f4, f3, f6, f5, f6};
                                    if (instantCameraView.videoEncoder == null) {
                                        instantCameraView.videoEncoder = instantCameraView.new VideoRecorder();
                                    }
                                    FloatBuffer floatBufferM = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(48));
                                    instantCameraView.vertexBuffer = floatBufferM;
                                    floatBufferM.put(fArr).position(0);
                                    FloatBuffer floatBufferM2 = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(32));
                                    instantCameraView.textureBuffer = floatBufferM2;
                                    floatBufferM2.put(fArr2).position(0);
                                    Matrix.setIdentityM(instantCameraView.mSTMatrix, 0);
                                    int iAccess$2300 = InstantCameraView.access$2300(instantCameraView, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                    int iAccess$2301 = InstantCameraView.access$2300(instantCameraView, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                    if (iAccess$2300 == 0 || iAccess$2301 == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed creating shader");
                                        }
                                        finish();
                                    } else {
                                        int iGlCreateProgram = GLES20.glCreateProgram();
                                        this.drawProgram = iGlCreateProgram;
                                        GLES20.glAttachShader(iGlCreateProgram, iAccess$2300);
                                        GLES20.glAttachShader(this.drawProgram, iAccess$2301);
                                        GLES20.glLinkProgram(this.drawProgram);
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                                        if (iArr2[0] == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("InstantCamera failed link shader");
                                            }
                                            GLES20.glDeleteProgram(this.drawProgram);
                                            this.drawProgram = 0;
                                        } else {
                                            this.positionHandle = GLES20.glGetAttribLocation(this.drawProgram, "aPosition");
                                            this.textureHandle = GLES20.glGetAttribLocation(this.drawProgram, "aTextureCoord");
                                            this.vertexMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uMVPMatrix");
                                            this.textureMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uSTMatrix");
                                        }
                                        Matrix.setIdentityM(instantCameraView.mMVPMatrix, 0);
                                        int[] iArr3 = instantCameraView.cameraTexture;
                                        GLES20.glGenTextures(2, iArr3, 0);
                                        for (final int i = 0; i < 2; i++) {
                                            GLES20.glBindTexture(36197, iArr3[i]);
                                            GLES20.glTexParameteri(36197, 10241, 9729);
                                            GLES20.glTexParameteri(36197, 10240, 9729);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr3[i]);
                                            SurfaceTexture[] surfaceTextureArr = this.cameraSurface;
                                            surfaceTextureArr[i] = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                                @Override
                                                public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                    InstantCameraView.CameraGLThread cameraGLThread = this.f$0;
                                                    int i2 = i;
                                                    InstantCameraView.this.cameraTextureAvailable = true;
                                                    cameraGLThread.requestRender(i2 == 0, i2 == 1);
                                                }
                                            });
                                            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(instantCameraView, i, surfaceTextureArr[i], 23));
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera gl initied");
                                        }
                                    }
                                    this.initied = z;
                                    super.run();
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            }
                        } else {
                            finish();
                        }
                    }
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("InstantCamera eglConfig not initialized");
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("InstantCamera eglInitialize failed "));
                }
                finish();
            }
            z = false;
            this.initied = z;
            super.run();
        }

        public final void updateScale() {
            InstantCameraView instantCameraView = InstantCameraView.this;
            if (instantCameraView.previewSize[instantCameraView.surfaceIndex] != null) {
                InstantCameraView instantCameraView2 = InstantCameraView.this;
                int width = instantCameraView2.previewSize[instantCameraView2.surfaceIndex].getWidth();
                InstantCameraView instantCameraView3 = InstantCameraView.this;
                int height = instantCameraView3.previewSize[instantCameraView3.surfaceIndex].getHeight();
                float fMin = this.surfaceWidth / Math.min(width, height);
                int i = (int) (width * fMin);
                int i2 = (int) (height * fMin);
                if (i == i2) {
                    InstantCameraView instantCameraView4 = InstantCameraView.this;
                    instantCameraView4.scaleX = 1.0f;
                    instantCameraView4.scaleY = 1.0f;
                } else if (i > i2) {
                    InstantCameraView instantCameraView5 = InstantCameraView.this;
                    instantCameraView5.scaleX = 1.0f;
                    instantCameraView5.scaleY = i / this.surfaceHeight;
                } else {
                    InstantCameraView instantCameraView6 = InstantCameraView.this;
                    instantCameraView6.scaleX = i2 / this.surfaceWidth;
                    instantCameraView6.scaleY = 1.0f;
                }
                FileLog.d("InstantCamera camera scaleX = " + InstantCameraView.this.scaleX + " scaleY = " + InstantCameraView.this.scaleY);
            }
        }
    }

    public interface Delegate {
        int getClassGuid();

        long getDialogId();

        View getFragmentView();

        Activity getParentActivity();

        boolean isInScheduleMode();

        boolean isSecretChat();

        void sendMedia(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z, int i, int i2, boolean z2, long j);
    }

    public abstract class InstantViewCameraContainer extends FrameLayout {
        public float imageProgress;
        public ImageReceiver imageReceiver;

        public InstantViewCameraContainer(Context context) {
            super(context);
            InstantCameraView.this.setWillNotDraw(false);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            float f = this.imageProgress;
            if (f != 1.0f) {
                float f2 = f + 0.064f;
                this.imageProgress = f2;
                if (f2 > 1.0f) {
                    this.imageProgress = 1.0f;
                }
                invalidate();
            }
            if (this.imageReceiver != null) {
                canvas.save();
                float imageWidth = this.imageReceiver.getImageWidth();
                float f3 = InstantCameraView.this.textureViewSize;
                if (imageWidth != f3) {
                    float imageWidth2 = f3 / this.imageReceiver.getImageWidth();
                    canvas.scale(imageWidth2, imageWidth2);
                }
                canvas.translate(-this.imageReceiver.getImageX(), -this.imageReceiver.getImageY());
                float alpha = this.imageReceiver.getAlpha();
                this.imageReceiver.setAlpha(this.imageProgress);
                this.imageReceiver.draw(canvas);
                this.imageReceiver.setAlpha(alpha);
                canvas.restore();
            }
        }

        public void setImageReceiver(ImageReceiver imageReceiver) {
            if (this.imageReceiver == null) {
                this.imageProgress = 0.0f;
            }
            this.imageReceiver = imageReceiver;
            invalidate();
        }
    }

    public final class SendOptions {
        public final long effectId;
        public final boolean notify;
        public final int scheduleDate;
        public final long stars;
        public final int ttl;

        public SendOptions(long j, int i, int i2, boolean z, long j2) {
            this.notify = z;
            this.scheduleDate = i;
            this.ttl = i2;
            this.effectId = j;
            this.stars = j2;
        }
    }

    public final class VideoRecorder implements Runnable {
        public int alphaHandle;
        public MediaCodec.BufferInfo audioBufferInfo;
        public MediaCodec audioEncoder;
        public AudioRecord audioRecorder;
        public boolean audioStopedByTime;
        public boolean blendEnabled;
        public long desyncTime;
        public int drawProgram;
        public android.opengl.EGLConfig eglConfig;
        public File fileToWrite;
        public boolean firstEncode;
        public boolean firstVideoFrameSincePause;
        public int frameCount;
        public DispatchQueue generateKeyframeThumbsQueue;
        public volatile AlertController.ButtonHandler handler;
        public long lastCommitedFrameTime;
        public MP4Builder mediaMuxer;
        public InstantCameraVideoEncoderOverlayHelper overlayHelper;
        public volatile boolean pauseRecorder;
        public int positionHandle;
        public int prependHeaderSize;
        public int previewSizeHandle;
        public volatile boolean ready;
        public int resolutionHandle;
        public volatile boolean running;
        public volatile int sendWhenDone;
        public volatile SendOptions sendWhenDoneOptions;
        public boolean sentMedia;
        public android.opengl.EGLContext sharedEglContext;
        public boolean skippedFirst;
        public long skippedTime;
        public boolean started;
        public Surface surface;
        public int texelSizeHandle;
        public int textureHandle;
        public int textureMatrixHandle;
        public int vertexMatrixHandle;
        public int videoBitrate;
        public MediaCodec.BufferInfo videoBufferInfo;
        public long videoDiff;
        public MediaCodec videoEncoder;
        public AnonymousClass7 videoFile;
        public int videoHeight;
        public long videoLast;
        public long videoLastDt;
        public int videoWidth;
        public boolean writingToDifferentFile;
        public int zeroTimeStamps;
        public boolean videoConvertFirstWrite = true;
        public android.opengl.EGLDisplay eglDisplay = EGL14.EGL_NO_DISPLAY;
        public android.opengl.EGLContext eglContext = EGL14.EGL_NO_CONTEXT;
        public android.opengl.EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
        public final ArrayList buffersToWrite = new ArrayList();
        public int videoTrackIndex = -5;
        public int audioTrackIndex = -5;
        public long audioStartTime = -1;
        public long currentTimestamp = 0;
        public long lastTimestamp = -1;
        public final Object sync = new Object();
        public long videoFirst = -1;
        public long prevVideoLast = -1;
        public long audioFirst = -1;
        public long audioLast = -1;
        public long audioLastDt = 0;
        public long prevAudioLast = -1;
        public Integer lastCameraId = 0;
        public final ArrayBlockingQueue buffers = new ArrayBlockingQueue(10);
        public final ArrayList keyframeThumbs = new ArrayList();
        public final AnonymousClass1 recorderRunnable = new AnonymousClass1(this, 0);

        public final class AnonymousClass1 implements Runnable {
            public final int $r8$classId;
            public final VideoRecorder this$1;

            public AnonymousClass1(VideoRecorder videoRecorder, int i) {
                this.$r8$classId = i;
                this.this$1 = videoRecorder;
            }

            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InstantCameraView.VideoRecorder.AnonymousClass1.run():void");
            }
        }

        public VideoRecorder() {
        }

        public static void setBluetoothScoOn(boolean z) {
            AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
            if (SharedConfig.recordViaSco && !PermissionRequest.hasPermission("android.permission.BLUETOOTH_CONNECT")) {
                SharedConfig.recordViaSco = false;
                SharedConfig.saveConfig();
            }
            if (!(audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) && z) {
                return;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                try {
                    if (defaultAdapter.getProfileConnectionState(1) != 2) {
                        if (z) {
                            return;
                        }
                    }
                } catch (SecurityException unused) {
                    return;
                } catch (Throwable th) {
                    FileLog.e(th);
                    if (z) {
                        return;
                    }
                    try {
                        if (audioManager.isBluetoothScoOn()) {
                            audioManager.stopBluetoothSco();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
            } else if (z) {
                return;
            }
            if (z && !audioManager.isBluetoothScoOn()) {
                audioManager.startBluetoothSco();
            } else {
                if (z || !audioManager.isBluetoothScoOn()) {
                    return;
                }
                audioManager.stopBluetoothSco();
            }
        }

        public final void didWriteData(AnonymousClass7 anonymousClass7, long j, boolean z) {
            boolean z2 = this.videoConvertFirstWrite;
            InstantCameraView instantCameraView = InstantCameraView.this;
            if (!z2) {
                FileLoader.getInstance(instantCameraView.currentAccount).checkUploadNewDataAvailable(anonymousClass7.toString(), instantCameraView.isSecretChat, j, z ? anonymousClass7.length() : 0L);
                return;
            }
            FileLoader.getInstance(instantCameraView.currentAccount).uploadFile(anonymousClass7.toString(), instantCameraView.isSecretChat, false, 1L, 33554432, false);
            this.videoConvertFirstWrite = false;
            if (z) {
                FileLoader.getInstance(instantCameraView.currentAccount).checkUploadNewDataAvailable(anonymousClass7.toString(), instantCameraView.isSecretChat, j, z ? anonymousClass7.length() : 0L);
            }
        }

        public final void drainEncoder(boolean z) {
            ByteBuffer byteBufferAllocate;
            ByteBuffer byteBufferAllocate2;
            if (z) {
                this.videoEncoder.signalEndOfInputStream();
            }
            while (true) {
                int iDequeueOutputBuffer = this.videoEncoder.dequeueOutputBuffer(this.videoBufferInfo, 10000L);
                byte b = 1;
                if (iDequeueOutputBuffer != -1) {
                    if (iDequeueOutputBuffer != -3) {
                        if (iDequeueOutputBuffer != -2) {
                            if (iDequeueOutputBuffer >= 0) {
                                ByteBuffer outputBuffer = this.videoEncoder.getOutputBuffer(iDequeueOutputBuffer);
                                if (outputBuffer == null) {
                                    throw new RuntimeException(SurfaceContainer$$ExternalSyntheticOutline0.m(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                                }
                                MediaCodec.BufferInfo bufferInfo = this.videoBufferInfo;
                                int i = bufferInfo.size;
                                if (i > 1) {
                                    int i2 = bufferInfo.flags;
                                    if ((i2 & 2) == 0) {
                                        int i3 = this.prependHeaderSize;
                                        if (i3 != 0 && (i2 & 1) != 0) {
                                            bufferInfo.offset += i3;
                                            bufferInfo.size = i - i3;
                                        }
                                        if (this.firstEncode && (i2 & 1) != 0) {
                                            if (bufferInfo.size > 100) {
                                                outputBuffer.position(bufferInfo.offset);
                                                byte[] bArr = new byte[100];
                                                outputBuffer.get(bArr);
                                                int i4 = 0;
                                                for (int i5 = 0; i5 < 96; i5++) {
                                                    if (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 0 && bArr[i5 + 3] == 1 && (i4 = i4 + 1) > 1) {
                                                        MediaCodec.BufferInfo bufferInfo2 = this.videoBufferInfo;
                                                        bufferInfo2.offset += i5;
                                                        bufferInfo2.size -= i5;
                                                        break;
                                                    }
                                                }
                                            }
                                            this.firstEncode = false;
                                        }
                                        InstantCameraView.this.getClass();
                                        long jWriteSampleData = this.mediaMuxer.writeSampleData(this.videoTrackIndex, outputBuffer, this.videoBufferInfo, true);
                                        if (jWriteSampleData != 0 && !this.writingToDifferentFile && InstantCameraView.this.allowSendingWhileRecording) {
                                            didWriteData(this.videoFile, jWriteSampleData, false);
                                        }
                                    } else if (this.videoTrackIndex == -5) {
                                        byte[] bArr2 = new byte[i];
                                        outputBuffer.limit(bufferInfo.offset + i);
                                        outputBuffer.position(this.videoBufferInfo.offset);
                                        outputBuffer.get(bArr2);
                                        int i6 = this.videoBufferInfo.size - 1;
                                        while (true) {
                                            if (i6 < 0 || i6 <= 3) {
                                                byteBufferAllocate = null;
                                                byteBufferAllocate2 = null;
                                                break;
                                            }
                                            if (bArr2[i6] == b && bArr2[i6 - 1] == 0 && bArr2[i6 - 2] == 0) {
                                                int i7 = i6 - 3;
                                                if (bArr2[i7] == 0) {
                                                    byteBufferAllocate = ByteBuffer.allocate(i7);
                                                    byteBufferAllocate2 = ByteBuffer.allocate(this.videoBufferInfo.size - i7);
                                                    byteBufferAllocate.put(bArr2, 0, i7).position(0);
                                                    byteBufferAllocate2.put(bArr2, i7, this.videoBufferInfo.size - i7).position(0);
                                                    break;
                                                }
                                            }
                                            i6--;
                                            b = 1;
                                        }
                                        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.videoWidth, this.videoHeight);
                                        if (byteBufferAllocate != null && byteBufferAllocate2 != null) {
                                            mediaFormatCreateVideoFormat.setByteBuffer("csd-0", byteBufferAllocate);
                                            mediaFormatCreateVideoFormat.setByteBuffer("csd-1", byteBufferAllocate2);
                                        }
                                        this.videoTrackIndex = this.mediaMuxer.addTrack(mediaFormatCreateVideoFormat, false);
                                    }
                                }
                                this.videoEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                if ((this.videoBufferInfo.flags & 4) != 0) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            MediaFormat outputFormat = this.videoEncoder.getOutputFormat();
                            if (this.videoTrackIndex == -5) {
                                this.videoTrackIndex = this.mediaMuxer.addTrack(outputFormat, false);
                                if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                                    this.prependHeaderSize = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!z || this.pauseRecorder) {
                        break;
                    }
                }
            }
            while (true) {
                int iDequeueOutputBuffer2 = this.audioEncoder.dequeueOutputBuffer(this.audioBufferInfo, 0L);
                if (iDequeueOutputBuffer2 == -1) {
                    if (!z) {
                        return;
                    }
                    if ((!this.running && this.sendWhenDone == 0) || this.pauseRecorder) {
                        return;
                    }
                } else if (iDequeueOutputBuffer2 == -3) {
                    continue;
                } else if (iDequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.audioEncoder.getOutputFormat();
                    if (this.audioTrackIndex == -5) {
                        this.audioTrackIndex = this.mediaMuxer.addTrack(outputFormat2, true);
                    }
                } else if (iDequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.audioEncoder.getOutputBuffer(iDequeueOutputBuffer2);
                    if (outputBuffer2 == null) {
                        throw new RuntimeException(SurfaceContainer$$ExternalSyntheticOutline0.m(iDequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                    MediaCodec.BufferInfo bufferInfo3 = this.audioBufferInfo;
                    if ((bufferInfo3.flags & 2) != 0) {
                        bufferInfo3.size = 0;
                    }
                    if (bufferInfo3.size != 0) {
                        InstantCameraView.this.getClass();
                        long jWriteSampleData2 = this.mediaMuxer.writeSampleData(this.audioTrackIndex, outputBuffer2, this.audioBufferInfo, false);
                        if (jWriteSampleData2 != 0 && !this.writingToDifferentFile && InstantCameraView.this.allowSendingWhileRecording) {
                            didWriteData(this.videoFile, jWriteSampleData2, false);
                        }
                        MediaCodec mediaCodec = this.audioEncoder;
                        if (mediaCodec != null) {
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                        }
                    } else {
                        MediaCodec mediaCodec2 = this.audioEncoder;
                        if (mediaCodec2 != null) {
                            mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                        }
                    }
                    if ((this.audioBufferInfo.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }

        public final void finalize() throws Throwable {
            InstantCameraVideoEncoderOverlayHelper instantCameraVideoEncoderOverlayHelper = this.overlayHelper;
            if (instantCameraVideoEncoderOverlayHelper != null) {
                instantCameraVideoEncoderOverlayHelper.destroy();
                this.overlayHelper = null;
            }
            try {
                android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
                if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(this.eglDisplay);
                    this.eglDisplay = EGL14.EGL_NO_DISPLAY;
                    this.eglContext = EGL14.EGL_NO_CONTEXT;
                    this.eglConfig = null;
                }
            } finally {
                super.finalize();
            }
        }

        public final void handleStopRecording(int i, SendOptions sendOptions) {
            boolean z;
            DispatchQueue dispatchQueue;
            VideoEditedInfo videoEditedInfo;
            if (i != 1 || (((videoEditedInfo = InstantCameraView.this.videoEditedInfo) != null && videoEditedInfo.needConvert()) || InstantCameraView.this.delegate.isInScheduleMode())) {
                z = true;
            } else {
                if (!this.sentMedia) {
                    this.sentMedia = true;
                    AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(1, this, sendOptions));
                }
                z = false;
            }
            if (this.running && !this.pauseRecorder) {
                FileLog.d("InstantCamera handleStopRecording running=false");
                this.sendWhenDone = i;
                this.sendWhenDoneOptions = sendOptions;
                this.running = false;
                return;
            }
            try {
                FileLog.d("InstantCamera handleStopRecording drain encoders");
                drainEncoder(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            MediaCodec mediaCodec = this.videoEncoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            MediaCodec mediaCodec2 = this.audioEncoder;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.audioEncoder.release();
                    this.audioEncoder = null;
                    setBluetoothScoOn(false);
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            File file = InstantCameraView.this.previewFile;
            if (file != null) {
                file.delete();
                InstantCameraView.this.previewFile = null;
            }
            if (this.mediaMuxer != null) {
                InstantCameraView.this.getClass();
                try {
                    this.mediaMuxer.finishMovie();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                FileLog.d("InstantCamera handleStopRecording finish muxer");
                if (this.writingToDifferentFile) {
                    if (this.videoFile.exists()) {
                        try {
                            this.videoFile.delete();
                        } catch (Exception e5) {
                            FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + this.videoFile);
                            FileLog.e(e5);
                        }
                    }
                    if (!this.fileToWrite.renameTo(this.videoFile)) {
                        FileLog.e("InstantCamera unable to rename file, try move file");
                        try {
                            AndroidUtilities.copyFile(this.fileToWrite, this.videoFile);
                            this.fileToWrite.delete();
                        } catch (IOException e6) {
                            FileLog.e(e6);
                            FileLog.e("InstantCamera unable to move file");
                        }
                    }
                }
            }
            if (i != 2 && (dispatchQueue = this.generateKeyframeThumbsQueue) != null) {
                dispatchQueue.cleanupQueue();
                this.generateKeyframeThumbsQueue.recycle();
                this.generateKeyframeThumbsQueue = null;
            }
            FileLog.d("InstantCamera handleStopRecording send " + i);
            if (i == 0) {
                FileLoader.getInstance(InstantCameraView.this.currentAccount).cancelFileUpload(this.videoFile.getAbsolutePath(), false);
                try {
                    this.fileToWrite.delete();
                } catch (Throwable unused) {
                }
                try {
                    this.videoFile.delete();
                } catch (Throwable unused2) {
                }
            } else {
                if (z && (i != 1 || !this.sentMedia)) {
                    this.sentMedia = true;
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(this, i, sendOptions, 24));
                }
                AndroidUtilities.runOnUIThread(new InstantCameraView$VideoRecorder$$ExternalSyntheticLambda1(this, 3));
            }
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.eglDisplay);
            }
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglConfig = null;
            this.handler.getClass();
            Looper.myLooper().quit();
            InstantCameraVideoEncoderOverlayHelper instantCameraVideoEncoderOverlayHelper = this.overlayHelper;
            if (instantCameraVideoEncoderOverlayHelper != null) {
                instantCameraVideoEncoderOverlayHelper.destroy();
                this.overlayHelper = null;
            }
            AndroidUtilities.runOnUIThread(new InstantCameraView$VideoRecorder$$ExternalSyntheticLambda1(this, 4));
        }

        public final void prepareEncoder(boolean z) {
            setBluetoothScoOn(true);
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 3584;
                }
                int i = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 4096 : 49152;
                this.buffers.clear();
                for (int i2 = 0; i2 < 3; i2++) {
                    this.buffers.add(new AudioBufferInfo());
                }
                if (z) {
                    this.prevVideoLast = this.videoLast + this.videoLastDt;
                    this.prevAudioLast = this.audioLast + this.audioLastDt;
                    this.firstVideoFrameSincePause = true;
                } else {
                    this.prevVideoLast = -1L;
                    this.prevAudioLast = -1L;
                    this.currentTimestamp = 0L;
                }
                this.lastTimestamp = -1L;
                this.lastCommitedFrameTime = 0L;
                this.audioStartTime = -1L;
                this.audioFirst = -1L;
                this.videoFirst = -1L;
                this.videoLast = -1L;
                this.videoDiff = -1L;
                this.audioLast = -1L;
                this.skippedFirst = false;
                this.skippedTime = 0L;
                AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i);
                this.audioRecorder = audioRecord;
                audioRecord.startRecording();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera initied audio record with channels " + this.audioRecorder.getChannelCount() + " sample rate = " + this.audioRecorder.getSampleRate() + " bufferSize = " + i);
                }
                this.pauseRecorder = false;
                Thread thread = new Thread(this.recorderRunnable);
                thread.setPriority(10);
                thread.start();
                this.audioBufferInfo = new MediaCodec.BufferInfo();
                this.videoBufferInfo = new MediaCodec.BufferInfo();
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "audio/mp4a-latm");
                mediaFormat.setInteger("sample-rate", 48000);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("bitrate", MessagesController.getInstance(InstantCameraView.this.currentAccount).roundAudioBitrate * 1024);
                mediaFormat.setInteger("max-input-size", 20480);
                MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
                this.audioEncoder = mediaCodecCreateEncoderByType;
                mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.audioEncoder.start();
                this.videoEncoder = MediaCodec.createEncoderByType("video/avc");
                this.firstEncode = true;
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.videoWidth, this.videoHeight);
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", this.videoBitrate);
                mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
                this.videoEncoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.surface = this.videoEncoder.createInputSurface();
                this.videoEncoder.start();
                if (!z) {
                    boolean zIsSdCardPath = ImageLoader.isSdCardPath(this.videoFile);
                    this.fileToWrite = this.videoFile;
                    if (zIsSdCardPath) {
                        try {
                            File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                            this.fileToWrite = file;
                            if (file.exists()) {
                                this.fileToWrite.delete();
                            }
                            this.writingToDifferentFile = true;
                        } catch (Throwable th) {
                            FileLog.e(th);
                            this.fileToWrite = this.videoFile;
                            this.writingToDifferentFile = false;
                        }
                    }
                    Mp4Movie mp4Movie = new Mp4Movie();
                    mp4Movie.setCacheFile(this.fileToWrite);
                    mp4Movie.setRotation(0);
                    mp4Movie.setSize(this.videoWidth, this.videoHeight);
                    MP4Builder mP4BuilderCreateMovie = new MP4Builder().createMovie(mp4Movie, InstantCameraView.this.isSecretChat, false);
                    this.mediaMuxer = mP4BuilderCreateMovie;
                    InstantCameraView instantCameraView = InstantCameraView.this;
                    boolean zDeviceIsHigh = SharedConfig.deviceIsHigh();
                    instantCameraView.allowSendingWhileRecording = zDeviceIsHigh;
                    mP4BuilderCreateMovie.setAllowSyncFiles(zDeviceIsHigh);
                }
                AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda1(18, this, z));
                if (this.eglDisplay != EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("EGL already set up");
                }
                android.opengl.EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                this.eglDisplay = eGLDisplayEglGetDisplay;
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("unable to get EGL14 display");
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                    this.eglDisplay = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                if (this.eglContext == EGL14.EGL_NO_CONTEXT) {
                    android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                    if (!EGL14.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        throw new RuntimeException("Unable to find a suitable EGLConfig");
                    }
                    this.eglContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], this.sharedEglContext, new int[]{12440, 2, 12344}, 0);
                    this.eglConfig = eGLConfigArr[0];
                }
                EGL14.eglQueryContext(this.eglDisplay, this.eglContext, 12440, new int[1], 0);
                if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
                    throw new IllegalStateException("surface already created");
                }
                android.opengl.EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, new int[]{12344}, 0);
                this.eglSurface = eGLSurfaceEglCreateWindowSurface;
                if (eGLSurfaceEglCreateWindowSurface == null) {
                    throw new RuntimeException("surface was null");
                }
                if (!EGL14.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                    }
                    throw new RuntimeException("eglMakeCurrent failed");
                }
                GLES20.glBlendFunc(770, 771);
                InstantCameraVideoEncoderOverlayHelper instantCameraVideoEncoderOverlayHelper = this.overlayHelper;
                if (instantCameraVideoEncoderOverlayHelper != null) {
                    instantCameraVideoEncoderOverlayHelper.destroy();
                    this.overlayHelper = null;
                }
                this.overlayHelper = new InstantCameraVideoEncoderOverlayHelper(this.videoWidth, this.videoHeight);
                InstantCameraView instantCameraView2 = InstantCameraView.this;
                org.telegram.messenger.camera.Size size = instantCameraView2.previewSize[0];
                String str = (SharedConfig.deviceIsLow() || !InstantCameraView.allowBigSizeCamera() || (size != null && ((float) Math.max(size.getHeight(), size.getWidth())) * 0.7f < ((float) MessagesController.getInstance(instantCameraView2.currentAccount).roundVideoSize))) ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
                int iAccess$2300 = InstantCameraView.access$2300(InstantCameraView.this, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                int iAccess$2301 = InstantCameraView.access$2300(InstantCameraView.this, 35632, str);
                if (iAccess$2300 == 0 || iAccess$2301 == 0) {
                    return;
                }
                int iGlCreateProgram = GLES20.glCreateProgram();
                this.drawProgram = iGlCreateProgram;
                GLES20.glAttachShader(iGlCreateProgram, iAccess$2300);
                GLES20.glAttachShader(this.drawProgram, iAccess$2301);
                GLES20.glLinkProgram(this.drawProgram);
                int[] iArr2 = new int[1];
                GLES20.glGetProgramiv(this.drawProgram, 35714, iArr2, 0);
                if (iArr2[0] == 0) {
                    GLES20.glDeleteProgram(this.drawProgram);
                    this.drawProgram = 0;
                    return;
                }
                this.positionHandle = GLES20.glGetAttribLocation(this.drawProgram, "aPosition");
                this.textureHandle = GLES20.glGetAttribLocation(this.drawProgram, "aTextureCoord");
                this.previewSizeHandle = GLES20.glGetUniformLocation(this.drawProgram, "preview");
                this.resolutionHandle = GLES20.glGetUniformLocation(this.drawProgram, "resolution");
                this.alphaHandle = GLES20.glGetUniformLocation(this.drawProgram, "alpha");
                this.vertexMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uMVPMatrix");
                this.textureMatrixHandle = GLES20.glGetUniformLocation(this.drawProgram, "uSTMatrix");
                this.texelSizeHandle = GLES20.glGetUniformLocation(this.drawProgram, "texelSize");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public final void run() {
            Looper.prepare();
            synchronized (this.sync) {
                this.handler = new AlertController.ButtonHandler(this);
                this.ready = true;
                this.sync.notify();
            }
            Looper.loop();
            synchronized (this.sync) {
                this.ready = false;
            }
        }

        public final void setupVideoPlayer(File file) {
            int i = 1;
            VideoPlayer videoPlayer = new VideoPlayer(true, false);
            InstantCameraView instantCameraView = InstantCameraView.this;
            instantCameraView.videoPlayer = videoPlayer;
            videoPlayer.delegate = new ChatActivity.AnonymousClass1(this, 23);
            videoPlayer.setTextureView(instantCameraView.textureView);
            instantCameraView.videoPlayer.preparePlayer(Uri.fromFile(file), "other", 0L);
            instantCameraView.videoPlayer.play();
            instantCameraView.videoPlayer.setMute(true);
            Timer timer = instantCameraView.progressTimer;
            if (timer != null) {
                try {
                    timer.cancel();
                    instantCameraView.progressTimer = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            Timer timer2 = new Timer();
            instantCameraView.progressTimer = timer2;
            timer2.schedule(new zzq(instantCameraView, i), 0L, 17L);
            AnimatorSet animatorSet = new AnimatorSet();
            LinearLayout linearLayout = instantCameraView.buttonsLayout;
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(instantCameraView.paint, AnimationProperties.PAINT_ALPHA, 0), ObjectAnimator.ofFloat(instantCameraView.muteImageView, (Property<ImageView, Float>) property, 1.0f));
            animatorSet.setDuration(180L);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.start();
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.eglDisplay);
            }
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglConfig = null;
        }

        public final void startRecording(AnonymousClass7 anonymousClass7, android.opengl.EGLContext eGLContext) {
            if (this.started && this.handler != null && this.handler.getLooper() != null && this.handler.getLooper().getThread() != null && this.handler.getLooper().getThread().isAlive()) {
                this.sharedEglContext = eGLContext;
                this.handler.sendMessage(this.handler.obtainMessage(0, 1, 0));
            }
            this.started = true;
            int i = MessagesController.getInstance(InstantCameraView.this.currentAccount).roundVideoSize;
            int i2 = MessagesController.getInstance(InstantCameraView.this.currentAccount).roundVideoBitrate * 1024;
            AndroidUtilities.runOnUIThread(new InstantCameraView$VideoRecorder$$ExternalSyntheticLambda1(this, 2));
            this.videoFile = anonymousClass7;
            this.videoWidth = i;
            this.videoHeight = i;
            this.videoBitrate = i2;
            this.sharedEglContext = eGLContext;
            synchronized (this.sync) {
                try {
                    if (this.running) {
                        return;
                    }
                    this.running = true;
                    Thread thread = new Thread(this, "TextureMovieEncoder");
                    thread.setPriority(10);
                    thread.start();
                    while (!this.ready) {
                        try {
                            this.sync.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    InstantCameraView.this.getClass();
                    this.keyframeThumbs.clear();
                    this.frameCount = 0;
                    DispatchQueue dispatchQueue = this.generateKeyframeThumbsQueue;
                    if (dispatchQueue != null) {
                        dispatchQueue.cleanupQueue();
                        this.generateKeyframeThumbsQueue.recycle();
                    }
                    this.generateKeyframeThumbsQueue = new DispatchQueue("keyframes_thumb_queue");
                    this.handler.sendMessage(this.handler.obtainMessage(0));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void stopRecording(int i, SendOptions sendOptions) {
            this.handler.sendMessage(this.handler.obtainMessage(1, i, 0, sendOptions));
            AndroidUtilities.runOnUIThread(new InstantCameraView$VideoRecorder$$ExternalSyntheticLambda1(this, 5));
        }
    }

    public InstantCameraView(Context context, Delegate delegate, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.isFrontface = true;
        this.position = new int[2];
        this.cameraTexture = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.oldCameraTexture = new int[1];
        this.cameraTextureAlpha = 1.0f;
        this.previewSize = new org.telegram.messenger.camera.Size[2];
        this.aspectRatio = SharedConfig.roundCamera16to9 ? new org.telegram.messenger.camera.Size(16, 9) : new org.telegram.messenger.camera.Size(4, 3);
        this.useCamera2 = SharedConfig.isUsingCamera2(i);
        this.camera2Sessions = new Camera2Session[2];
        this.mMVPMatrix = new float[16];
        this.mSTMatrix = new float[16];
        this.moldSTMatrix = new float[16];
        this.buttonsSizePx = AndroidUtilities.dp(z ? 24.0f : 28.0f);
        this.resourcesProvider = resourcesProvider;
        this.parentView = delegate.getFragmentView();
        setWillNotDraw(false);
        this.delegate = delegate;
        this.recordingGuid = delegate.getClassGuid();
        this.isSecretChat = delegate.isSecretChat();
        ProfileActivity.AnonymousClass1 anonymousClass1 = new ProfileActivity.AnonymousClass1(this, 1);
        this.paint = anonymousClass1;
        anonymousClass1.setStyle(Paint.Style.STROKE);
        anonymousClass1.setStrokeCap(Paint.Cap.ROUND);
        anonymousClass1.setStrokeWidth(AndroidUtilities.dp(3.0f));
        anonymousClass1.setColor(-1);
        this.rect = new RectF();
        FlashViews flashViews = new FlashViews(getContext(), null, this, null);
        this.flashViews = flashViews;
        flashViews.warmth = 0.5f;
        flashViews.color = FlashViews.getColor(0.5f);
        flashViews.invalidateGradient();
        addView(flashViews.backgroundView, LayoutHelper.createFrame(-1, -1, 119));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.cameraContainer = anonymousClass2;
        anonymousClass2.setOutlineProvider(new PremiumPreviewFragment.AnonymousClass3(this, 3));
        anonymousClass2.setClipToOutline(true);
        anonymousClass2.setWillNotDraw(false);
        int i2 = AndroidUtilities.roundPlayingMessageSize;
        addView(anonymousClass2, new FrameLayout.LayoutParams(i2, i2, 17));
        addView(flashViews.foregroundView, LayoutHelper.createFrame(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonsLayout = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createFrame(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        FlashViews.ImageViewInvertable imageViewInvertable = new FlashViews.ImageViewInvertable(context);
        this.switchCameraButton = imageViewInvertable;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageViewInvertable.setScaleType(scaleType);
        imageViewInvertable.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(imageViewInvertable, LayoutHelper.createLinear(44, 44));
        final int i3 = 0;
        imageViewInvertable.setOnClickListener(new View.OnClickListener(this) {
            public final InstantCameraView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                int i4 = 0;
                switch (i3) {
                    case 0:
                        final InstantCameraView instantCameraView = this.f$0;
                        if (instantCameraView.cameraReady) {
                            if (instantCameraView.useCamera2) {
                                Camera2Session camera2Session = instantCameraView.camera2SessionCurrent;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = instantCameraView.cameraSession;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (instantCameraView.cameraThread != null) {
                                if (!instantCameraView.bothCameras) {
                                    instantCameraView.switchCamera$1();
                                }
                                RLottieDrawable rLottieDrawable = instantCameraView.switchCameraDrawable;
                                if (rLottieDrawable != null) {
                                    rLottieDrawable.setCurrentFrame(0, true, false);
                                    instantCameraView.switchCameraDrawable.start();
                                }
                                instantCameraView.flipAnimationInProgress = true;
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.setDuration(580L);
                                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                                final boolean[] zArr = new boolean[1];
                                final InstantCameraView$$ExternalSyntheticLambda5 instantCameraView$$ExternalSyntheticLambda5 = new InstantCameraView$$ExternalSyntheticLambda5(instantCameraView, i4);
                                InstantCameraView.AnonymousClass2 anonymousClass3 = instantCameraView.cameraContainer;
                                anonymousClass3.setCameraDistance(anonymousClass3.getMeasuredHeight() * 8.0f);
                                ChatActivity.AnonymousClass69 anonymousClass69 = instantCameraView.textureOverlayView;
                                anonymousClass69.setCameraDistance(anonymousClass69.getMeasuredHeight() * 8.0f);
                                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        if (fFloatValue > 0.5f) {
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0]) {
                                                zArr2[0] = true;
                                                instantCameraView$$ExternalSyntheticLambda5.run();
                                            }
                                        }
                                        if (fFloatValue >= 0.5f) {
                                            fFloatValue -= 1.0f;
                                        }
                                        float f = fFloatValue * 180.0f;
                                        InstantCameraView instantCameraView2 = InstantCameraView.this;
                                        instantCameraView2.cameraContainer.setRotationY(f);
                                        instantCameraView2.textureOverlayView.setRotationY(f);
                                    }
                                });
                                valueAnimatorOfFloat.addListener(new EmojiView.AnonymousClass35(instantCameraView, zArr, instantCameraView$$ExternalSyntheticLambda5, 5));
                                valueAnimatorOfFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        InstantCameraView instantCameraView2 = this.f$0;
                        instantCameraView2.flashing = true ^ instantCameraView2.flashing;
                        instantCameraView2.updateFlash();
                        break;
                }
            }
        });
        FlashViews.ImageViewInvertable imageViewInvertable2 = new FlashViews.ImageViewInvertable(context);
        this.flashButton = imageViewInvertable2;
        imageViewInvertable2.setScaleType(scaleType);
        linearLayout.addView(imageViewInvertable2, LayoutHelper.createLinear(44, 44));
        final int i4 = 1;
        imageViewInvertable2.setOnClickListener(new View.OnClickListener(this) {
            public final InstantCameraView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                int i5 = 0;
                switch (i4) {
                    case 0:
                        final InstantCameraView instantCameraView = this.f$0;
                        if (instantCameraView.cameraReady) {
                            if (instantCameraView.useCamera2) {
                                Camera2Session camera2Session = instantCameraView.camera2SessionCurrent;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = instantCameraView.cameraSession;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (instantCameraView.cameraThread != null) {
                                if (!instantCameraView.bothCameras) {
                                    instantCameraView.switchCamera$1();
                                }
                                RLottieDrawable rLottieDrawable = instantCameraView.switchCameraDrawable;
                                if (rLottieDrawable != null) {
                                    rLottieDrawable.setCurrentFrame(0, true, false);
                                    instantCameraView.switchCameraDrawable.start();
                                }
                                instantCameraView.flipAnimationInProgress = true;
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.setDuration(580L);
                                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                                final boolean[] zArr = new boolean[1];
                                final InstantCameraView$$ExternalSyntheticLambda5 instantCameraView$$ExternalSyntheticLambda5 = new InstantCameraView$$ExternalSyntheticLambda5(instantCameraView, i5);
                                InstantCameraView.AnonymousClass2 anonymousClass3 = instantCameraView.cameraContainer;
                                anonymousClass3.setCameraDistance(anonymousClass3.getMeasuredHeight() * 8.0f);
                                ChatActivity.AnonymousClass69 anonymousClass69 = instantCameraView.textureOverlayView;
                                anonymousClass69.setCameraDistance(anonymousClass69.getMeasuredHeight() * 8.0f);
                                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        if (fFloatValue > 0.5f) {
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0]) {
                                                zArr2[0] = true;
                                                instantCameraView$$ExternalSyntheticLambda5.run();
                                            }
                                        }
                                        if (fFloatValue >= 0.5f) {
                                            fFloatValue -= 1.0f;
                                        }
                                        float f = fFloatValue * 180.0f;
                                        InstantCameraView instantCameraView2 = InstantCameraView.this;
                                        instantCameraView2.cameraContainer.setRotationY(f);
                                        instantCameraView2.textureOverlayView.setRotationY(f);
                                    }
                                });
                                valueAnimatorOfFloat.addListener(new EmojiView.AnonymousClass35(instantCameraView, zArr, instantCameraView$$ExternalSyntheticLambda5, 5));
                                valueAnimatorOfFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        InstantCameraView instantCameraView2 = this.f$0;
                        instantCameraView2.flashing = true ^ instantCameraView2.flashing;
                        instantCameraView2.updateFlash();
                        break;
                }
            }
        });
        updateFlash();
        if (!z) {
            imageViewInvertable.setInvert(flashViews.invert);
            ArrayList arrayList = flashViews.invertableViews;
            arrayList.add(imageViewInvertable);
            imageViewInvertable2.setInvert(flashViews.invert);
            arrayList.add(imageViewInvertable2);
        } else if (!resourcesProvider.isDark()) {
            imageViewInvertable.setInvert(0.6f);
            imageViewInvertable2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.muteImageView = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, LayoutHelper.createFrame(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(ColorUtils.setAlphaComponent(-16777216, 40));
        ChatActivity.AnonymousClass69 anonymousClass69 = new ChatActivity.AnonymousClass69(this, getContext(), paint);
        this.textureOverlayView = anonymousClass69;
        int i5 = AndroidUtilities.roundPlayingMessageSize;
        addView(anonymousClass69, new FrameLayout.LayoutParams(i5, i5, 17));
        this.setVisibilityFromPause = false;
        setVisibility(4);
    }

    public static int access$2300(InstantCameraView instantCameraView, int i, String str) {
        instantCameraView.getClass();
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(iGlCreateShader));
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static boolean allowBigSizeCamera() {
        if (SharedConfig.bigCameraForRound || SharedConfig.deviceIsAboveAverage() || Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int iHashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        int i = 0;
        while (true) {
            int[] iArr = ALLOW_BIG_CAMERA_WHITELIST;
            if (i >= 2) {
                return false;
            }
            if (iArr[i] == iHashCode) {
                return true;
            }
            i++;
        }
    }

    public static boolean allowBigSizeCameraDebug() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int iHashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        int i = 0;
        while (true) {
            int[] iArr = ALLOW_BIG_CAMERA_WHITELIST;
            if (i >= 2) {
                return false;
            }
            if (iArr[i] == iHashCode) {
                return true;
            }
            i++;
        }
    }

    public final void cancel(boolean z) {
        Timer timer = this.progressTimer;
        if (timer != null) {
            try {
                timer.cancel();
                this.progressTimer = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.releasePlayer();
            this.videoPlayer = null;
        }
        if (this.textureView == null) {
            return;
        }
        this.cancelled = true;
        this.recording = false;
        this.flashing = false;
        updateFlash();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.recordingGuid), Integer.valueOf(z ? 0 : 6));
        if (this.cameraThread != null) {
            saveLastCameraBitmap$1();
            CameraGLThread cameraGLThread = this.cameraThread;
            Handler handler = cameraGLThread.getHandler();
            if (handler != null) {
                cameraGLThread.sendMessage(handler.obtainMessage(1, 0, 0, new SendOptions(0L, 0, 0, true, 0L)), 0);
            }
            this.cameraThread = null;
        } else {
            VideoRecorder videoRecorder = this.videoEncoder;
            if (videoRecorder != null) {
                videoRecorder.stopRecording(0, new SendOptions(0L, 0, 0, true, 0L));
            }
        }
        if (this.cameraFile != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.cameraFile.delete();
            AutoDeleteMediaTask.unlockFile(this.cameraFile);
            this.cameraFile = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        startAnimation(false, false);
        invalidate();
    }

    public final org.telegram.messenger.camera.Size chooseOptimalSize(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : allowBigSizeCamera() ? 1440 : 1200;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (Math.max(((org.telegram.messenger.camera.Size) arrayList.get(i2)).mHeight, ((org.telegram.messenger.camera.Size) arrayList.get(i2)).mWidth) <= i && Math.min(((org.telegram.messenger.camera.Size) arrayList.get(i2)).mHeight, ((org.telegram.messenger.camera.Size) arrayList.get(i2)).mWidth) >= 320) {
                arrayList2.add((org.telegram.messenger.camera.Size) arrayList.get(i2));
            }
        }
        if (!arrayList2.isEmpty() && allowBigSizeCamera()) {
            Collections.sort(arrayList2, new ChatActivity$$ExternalSyntheticLambda18(13));
            return (org.telegram.messenger.camera.Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean zEqualsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        org.telegram.messenger.camera.Size size = this.aspectRatio;
        return zEqualsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            AnonymousClass7 anonymousClass7 = this.cameraFile;
            if (anonymousClass7 == null || !anonymousClass7.getAbsolutePath().equals(str)) {
                return;
            }
            this.file = (TLRPC.InputFile) objArr[1];
            this.encryptedFile = (TLRPC.InputEncryptedFile) objArr[2];
            this.size = ((Long) objArr[5]).longValue();
            if (this.encryptedFile != null) {
                this.key = (byte[]) objArr[3];
                this.iv = (byte[]) objArr[4];
            }
        }
    }

    public final void finishZoom() {
        float fMin;
        int i = 2;
        if (this.finishZoomTransition != null) {
            return;
        }
        if (this.useCamera2) {
            Camera2Session camera2Session = this.camera2SessionCurrent;
            if (camera2Session == null) {
                return;
            } else {
                fMin = Utilities.clamp(this.pinchScale, camera2Session.getMaxZoom(), this.camera2SessionCurrent.getMinZoom());
            }
        } else {
            fMin = Math.min(1.0f, Math.max(0.0f, this.pinchScale - 1.0f));
        }
        if (fMin > 0.0f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMin, 0.0f);
            this.finishZoomTransition = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 14));
            this.finishZoomTransition.addListener(new AnonymousClass9(this, i));
            this.finishZoomTransition.setDuration(350L);
            this.finishZoomTransition.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.finishZoomTransition.start();
        }
    }

    public View getButtonsLayout() {
        return this.buttonsLayout;
    }

    public InstantViewCameraContainer getCameraContainer() {
        return this.cameraContainer;
    }

    public RectOld getCameraRect() {
        AnonymousClass2 anonymousClass2 = this.cameraContainer;
        int[] iArr = this.position;
        anonymousClass2.getLocationOnScreen(iArr);
        return new RectOld(iArr[0], iArr[1], anonymousClass2.getWidth(), anonymousClass2.getHeight());
    }

    public View getMuteImageView() {
        return this.muteImageView;
    }

    public Paint getPaint() {
        return this.paint;
    }

    public TextureView getTextureView() {
        return this.textureView;
    }

    public final void hideCamera(boolean z) {
        ViewGroup viewGroup;
        if (this.useCamera2) {
            int i = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.camera2Sessions;
                if (i >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i];
                if (camera2Session != null) {
                    camera2Session.destroy(z);
                    camera2SessionArr[i] = null;
                }
                i++;
            }
        } else {
            CameraSession cameraSession = this.cameraSession;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.cameraSession, !z ? new CountDownLatch(1) : null, null);
            }
        }
        AnonymousClass2 anonymousClass2 = this.cameraContainer;
        anonymousClass2.setTranslationX(0.0f);
        this.textureOverlayView.setTranslationX(0.0f);
        this.animationTranslationY = 0.0f;
        updateTranslationY();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.textureView;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.textureView);
        }
        this.textureView = null;
        anonymousClass2.setImageReceiver(null);
    }

    public final boolean initCamera() {
        int i;
        int i2;
        if (this.useCamera2) {
            return true;
        }
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return false;
        }
        CameraInfo cameraInfo = null;
        int i3 = 0;
        while (i3 < cameras.size()) {
            CameraInfo cameraInfo2 = cameras.get(i3);
            if (!cameraInfo2.isFrontface()) {
                cameraInfo = cameraInfo2;
            }
            if ((this.isFrontface && cameraInfo2.isFrontface()) || (!this.isFrontface && !cameraInfo2.isFrontface())) {
                this.selectedCamera = cameraInfo2;
                break;
            }
            i3++;
            cameraInfo = cameraInfo2;
        }
        if (this.selectedCamera == null) {
            this.selectedCamera = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.selectedCamera;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<org.telegram.messenger.camera.Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<org.telegram.messenger.camera.Size> pictureSizes = this.selectedCamera.getPictureSizes();
        org.telegram.messenger.camera.Size sizeChooseOptimalSize = chooseOptimalSize(previewSizes);
        org.telegram.messenger.camera.Size[] sizeArr = this.previewSize;
        sizeArr[0] = sizeChooseOptimalSize;
        org.telegram.messenger.camera.Size sizeChooseOptimalSize2 = chooseOptimalSize(pictureSizes);
        this.pictureSize = sizeChooseOptimalSize2;
        if (sizeArr[0].mWidth != sizeChooseOptimalSize2.mWidth) {
            boolean z = false;
            for (int size = previewSizes.size() - 1; size >= 0; size--) {
                org.telegram.messenger.camera.Size size2 = previewSizes.get(size);
                for (int size3 = pictureSizes.size() - 1; size3 >= 0; size3--) {
                    org.telegram.messenger.camera.Size size4 = pictureSizes.get(size3);
                    int i4 = size2.mWidth;
                    org.telegram.messenger.camera.Size size5 = this.pictureSize;
                    if (i4 >= size5.mWidth && (i2 = size2.mHeight) >= size5.mHeight && i4 == size4.mWidth && i2 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.pictureSize = size4;
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (!z) {
                for (int size6 = previewSizes.size() - 1; size6 >= 0; size6--) {
                    org.telegram.messenger.camera.Size size7 = previewSizes.get(size6);
                    for (int size8 = pictureSizes.size() - 1; size8 >= 0; size8--) {
                        org.telegram.messenger.camera.Size size9 = pictureSizes.get(size8);
                        int i5 = size7.mWidth;
                        if (i5 >= 360 && (i = size7.mHeight) >= 360 && i5 == size9.mWidth && i == size9.mHeight) {
                            sizeArr[0] = size7;
                            this.pictureSize = size9;
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("InstantCamera preview w = ");
            sb.append(sizeArr[0].mWidth);
            sb.append(" h = ");
            ChatObject$Call$$ExternalSyntheticOutline0.m(sb, sizeArr[0].mHeight);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        FlashViews flashViews = this.flashViews;
        if (flashViews != null) {
            flashViews.flashOut();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        AnonymousClass2 anonymousClass2 = this.cameraContainer;
        float x = anonymousClass2.getX();
        float y = anonymousClass2.getY();
        RectF rectF = this.rect;
        rectF.set(x - AndroidUtilities.dp(8.0f), y - AndroidUtilities.dp(8.0f), x + anonymousClass2.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y + anonymousClass2.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.recording) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.recordStartTime) + this.recordPlusTime;
            this.recordedTime = jCurrentTimeMillis;
            this.progress = Math.min(1.0f, jCurrentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.progress != 0.0f) {
            canvas.save();
            if (!this.flipAnimationInProgress) {
                canvas.scale(anonymousClass2.getScaleX(), anonymousClass2.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.progress * 360.0f, false, this.paint);
            canvas.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.updateTextureViewSize) {
            int i3 = ((float) (View.MeasureSpec.getSize(i2) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
            if (i3 != this.textureViewSize) {
                this.textureViewSize = i3;
                ChatActivity.AnonymousClass69 anonymousClass69 = this.textureOverlayView;
                ViewGroup.LayoutParams layoutParams = anonymousClass69.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = anonymousClass69.getLayoutParams();
                int i4 = this.textureViewSize;
                layoutParams2.height = i4;
                layoutParams.width = i4;
                AnonymousClass2 anonymousClass2 = this.cameraContainer;
                ViewGroup.LayoutParams layoutParams3 = anonymousClass2.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = anonymousClass2.getLayoutParams();
                int i5 = this.textureViewSize;
                layoutParams4.height = i5;
                layoutParams3.width = i5;
                ((FrameLayout.LayoutParams) this.muteImageView.getLayoutParams()).topMargin = (this.textureViewSize / 2) - AndroidUtilities.dp(24.0f);
                anonymousClass69.setRoundRadius(this.textureViewSize / 2);
                anonymousClass2.invalidateOutline();
            }
            this.updateTextureViewSize = false;
        }
        super.onMeasure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        FlashViews flashViews = this.flashViews;
        flashViews.backgroundView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        flashViews.foregroundView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getVisibility() != 0) {
            this.animationTranslationY = getMeasuredHeight() / 2.0f;
            updateTranslationY();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VideoPlayer videoPlayer;
        boolean z;
        int i = 1;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.delegate != null && (videoPlayer = this.videoPlayer) != null) {
            ExoPlayerImpl exoPlayerImpl = videoPlayer.player;
            if (exoPlayerImpl != null) {
                exoPlayerImpl.verifyApplicationThread();
                if (exoPlayerImpl.volume == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.videoPlayer.setMute(!z);
            AnimatorSet animatorSet = this.muteAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.muteAnimation = animatorSet2;
            ImageView imageView = this.muteImageView;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, !z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z ? 0.5f : 1.0f));
            this.muteAnimation.addListener(new AnonymousClass9(this, i));
            this.muteAnimation.setDuration(180L);
            this.muteAnimation.setInterpolator(new DecelerateInterpolator());
            this.muteAnimation.start();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.maybePinchToZoomTouchMode && !this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2 && this.finishZoomTransition == null && this.recording) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.pinchScale = 1.0f;
                this.pointerId1 = motionEvent.getPointerId(0);
                this.pointerId2 = motionEvent.getPointerId(1);
                this.isInPinchToZoomTouchMode = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                AnonymousClass2 anonymousClass2 = this.cameraContainer;
                rectF.set(anonymousClass2.getX(), anonymousClass2.getY(), anonymousClass2.getX() + anonymousClass2.getMeasuredWidth(), anonymousClass2.getY() + anonymousClass2.getMeasuredHeight());
                this.maybePinchToZoomTouchMode = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.isInPinchToZoomTouchMode) {
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
                if (this.pointerId1 == motionEvent.getPointerId(i4)) {
                    i2 = i4;
                }
                if (this.pointerId2 == motionEvent.getPointerId(i4)) {
                    i3 = i4;
                }
            }
            if (i2 == -1 || i3 == -1) {
                this.isInPinchToZoomTouchMode = false;
                finishZoom();
                return false;
            }
            float fHypot = ((float) Math.hypot(motionEvent.getX(i3) - motionEvent.getX(i2), motionEvent.getY(i3) - motionEvent.getY(i2))) / this.pinchStartDistance;
            this.pinchScale = fHypot;
            if (!this.useCamera2) {
                this.cameraSession.setZoom(Math.min(1.0f, Math.max(0.0f, fHypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.camera2SessionCurrent;
            if (camera2Session != null) {
                this.camera2SessionCurrent.setZoom(Utilities.clamp(fHypot, camera2Session.getMaxZoom(), this.camera2SessionCurrent.getMinZoom()));
                return true;
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) || (this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.isInPinchToZoomTouchMode) {
            this.isInPinchToZoomTouchMode = false;
            finishZoom();
            return true;
        }
        return true;
    }

    public final void saveLastCameraBitmap$1() {
        Bitmap bitmap = this.textureView.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.textureView.getBitmap(), 50, 50, true);
        this.lastBitmap = bitmapCreateScaledBitmap;
        if (bitmapCreateScaledBitmap != null) {
            Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                this.lastBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void send(int i, int i2, int i3, long j, long j2, boolean z) {
        int i4;
        long j3;
        if (this.textureView == null) {
            return;
        }
        Timer timer = this.progressTimer;
        if (timer != null) {
            try {
                timer.cancel();
                this.progressTimer = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.releasePlayer();
            this.videoPlayer = null;
        }
        int i5 = 4;
        int i6 = this.currentAccount;
        if (i != 4) {
            this.cancelled = this.recordedTime < 800;
            this.recording = false;
            this.flashing = false;
            updateFlash();
            if (!this.cancelled) {
                i5 = i == 3 ? 2 : 5;
            }
            CameraGLThread cameraGLThread = this.cameraThread;
            int i7 = this.recordingGuid;
            if (cameraGLThread != null) {
                NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i7), Integer.valueOf(i5));
                if (this.cancelled) {
                    i4 = 0;
                } else {
                    i4 = i == 3 ? 2 : 1;
                }
                saveLastCameraBitmap$1();
                CameraGLThread cameraGLThread2 = this.cameraThread;
                Handler handler = cameraGLThread2.getHandler();
                if (handler != null) {
                    cameraGLThread2.sendMessage(handler.obtainMessage(1, i4, 0, new SendOptions(j, i2, i3, z, 0L)), 0);
                }
                this.cameraThread = null;
            }
            if (this.cancelled) {
                NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(i7), Boolean.TRUE, Integer.valueOf((int) this.recordedTime));
                startAnimation(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            return;
        }
        VideoRecorder videoRecorder = this.videoEncoder;
        if (videoRecorder != null && this.recordedTime > 800) {
            videoRecorder.stopRecording(1, new SendOptions(j, i2, i3, z, j2));
            return;
        }
        if (BuildVars.DEBUG_VERSION && !this.cameraFile.exists()) {
            FileLog.e(new RuntimeException("file not found :( round video"));
        }
        if (this.videoEditedInfo == null) {
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            this.videoEditedInfo = videoEditedInfo;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
        }
        if (this.videoEditedInfo.needConvert()) {
            this.file = null;
            this.encryptedFile = null;
            this.key = null;
            this.iv = null;
            VideoEditedInfo videoEditedInfo2 = this.videoEditedInfo;
            long j4 = videoEditedInfo2.estimatedDuration;
            double d = j4;
            long j5 = videoEditedInfo2.startTime;
            if (j5 >= 0) {
                j3 = 0;
            } else {
                j5 = 0;
                j3 = 0;
            }
            long j6 = videoEditedInfo2.endTime;
            if (j6 >= j3) {
                j4 = j6;
            }
            long j7 = j4 - j5;
            videoEditedInfo2.estimatedDuration = j7;
            videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j7 / d) * this.size));
            VideoEditedInfo videoEditedInfo3 = this.videoEditedInfo;
            videoEditedInfo3.bitrate = 1000000;
            long j8 = videoEditedInfo3.startTime;
            if (j8 > j3) {
                videoEditedInfo3.startTime = j8 * 1000;
            }
            long j9 = videoEditedInfo3.endTime;
            if (j9 > j3) {
                videoEditedInfo3.endTime = j9 * 1000;
            }
            FileLoader.getInstance(i6).cancelFileUpload(this.cameraFile.getAbsolutePath(), false);
        } else {
            this.videoEditedInfo.estimatedSize = Math.max(1L, this.size);
        }
        VideoEditedInfo videoEditedInfo4 = this.videoEditedInfo;
        videoEditedInfo4.file = this.file;
        videoEditedInfo4.encryptedFile = this.encryptedFile;
        videoEditedInfo4.key = this.key;
        videoEditedInfo4.iv = this.iv;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.cameraFile.getAbsolutePath(), 0, true, 0, 0, 0L);
        photoEntry.ttl = i3;
        photoEntry.effectId = j;
        this.delegate.sendMedia(photoEntry, this.videoEditedInfo, z, i2, 0, false, j2);
        if (i2 != 0) {
            startAnimation(false, false);
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
    }

    public void setInternalPadding(int i) {
        setPadding(0, 0, 0, i);
    }

    public void setIsMessageTransition(boolean z) {
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.buttonsLayout.setAlpha(0.0f);
        AnonymousClass2 anonymousClass2 = this.cameraContainer;
        anonymousClass2.setAlpha(0.0f);
        ChatActivity.AnonymousClass69 anonymousClass69 = this.textureOverlayView;
        anonymousClass69.setAlpha(0.0f);
        ImageView imageView = this.muteImageView;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        anonymousClass2.setScaleX(this.setVisibilityFromPause ? 1.0f : 0.1f);
        anonymousClass2.setScaleY(this.setVisibilityFromPause ? 1.0f : 0.1f);
        anonymousClass69.setScaleX(this.setVisibilityFromPause ? 1.0f : 0.1f);
        anonymousClass69.setScaleY(this.setVisibilityFromPause ? 1.0f : 0.1f);
        if (anonymousClass2.getMeasuredWidth() != 0) {
            anonymousClass2.setPivotX(anonymousClass2.getMeasuredWidth() / 2);
            anonymousClass2.setPivotY(anonymousClass2.getMeasuredHeight() / 2);
            anonymousClass69.setPivotX(anonymousClass69.getMeasuredWidth() / 2);
            anonymousClass69.setPivotY(anonymousClass69.getMeasuredHeight() / 2);
        }
        try {
            if (i == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void showCamera(boolean z) {
        if (this.textureView != null) {
            return;
        }
        if (this.switchCameraDrawable == null) {
            int i = R.raw.roundcamera_flip;
            int i2 = this.buttonsSizePx;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "roundcamera_flip", i2, i2, true, null);
            this.switchCameraDrawable = rLottieDrawable;
            rLottieDrawable.setCurrentFrame(0, true, false);
            this.switchCameraDrawable.setCallback(this.switchCameraButton);
        }
        this.switchCameraButton.setImageDrawable(this.switchCameraDrawable);
        this.textureOverlayView.setAlpha(1.0f);
        this.textureOverlayView.invalidate();
        if (this.lastBitmap == null) {
            try {
                this.lastBitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
        Bitmap bitmap = this.lastBitmap;
        if (bitmap != null) {
            this.textureOverlayView.setImageBitmap(bitmap);
        } else {
            this.textureOverlayView.setImageResource(R.drawable.icplaceholder);
        }
        this.cameraReady = false;
        this.selectedCamera = null;
        if (!z) {
            if (!this.useCamera2) {
                this.isFrontface = true;
            }
            updateFlash();
            this.recordedTime = 0L;
            this.progress = 0.0f;
        }
        this.cancelled = false;
        this.file = null;
        this.encryptedFile = null;
        this.key = null;
        this.iv = null;
        this.needDrawFlickerStub = true;
        if (initCamera()) {
            if (MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().getPlayingMessageObject().isVideo() || MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                } else if (SharedConfig.pauseMusicOnRecord) {
                    MediaController.getInstance().pauseByRewind();
                }
            }
            if (!z) {
                this.cameraFile = new AnonymousClass7(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
            }
            SharedConfig.saveConfig();
            AutoDeleteMediaTask.lockFile(this.cameraFile);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera show round camera " + this.cameraFile.getAbsolutePath());
            }
            if (this.useCamera2) {
                Context context = getContext();
                boolean z2 = MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.bothCameras = z2;
                if (z2) {
                    int i3 = 0;
                    while (i3 < 2) {
                        Camera2Session[] camera2SessionArr = this.camera2Sessions;
                        if (camera2SessionArr[i3] == null) {
                            camera2SessionArr[i3] = Camera2Session.create(i3 == 0, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                            Camera2Session camera2Session = this.camera2Sessions[i3];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.previewSize[i3] = new org.telegram.messenger.camera.Size(this.camera2Sessions[i3].getPreviewWidth(), this.camera2Sessions[i3].getPreviewHeight());
                            }
                        }
                        i3++;
                    }
                    updateFlash();
                    Camera2Session[] camera2SessionArr2 = this.camera2Sessions;
                    boolean z3 = this.isFrontface;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z3 ? 1 : 0];
                    this.camera2SessionCurrent = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z3 ? 1 : 0] == null) {
                        this.bothCameras = false;
                    }
                    if (camera2Session2 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.camera2Sessions;
                    boolean z4 = this.isFrontface;
                    int i4 = !z4 ? 1 : 0;
                    Camera2Session camera2SessionCreate = Camera2Session.create(z4, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                    camera2SessionArr3[i4] = camera2SessionCreate;
                    this.camera2SessionCurrent = camera2SessionCreate;
                    if (camera2SessionCreate == null) {
                        return;
                    }
                    camera2SessionCreate.setRecordingVideo(true);
                    this.previewSize[0] = new org.telegram.messenger.camera.Size(this.camera2SessionCurrent.getPreviewWidth(), this.camera2SessionCurrent.getPreviewHeight());
                }
            }
            TextureView textureView = new TextureView(getContext());
            this.textureView = textureView;
            textureView.setSurfaceTextureListener(new PhotoViewer.AnonymousClass8(this, 1));
            this.cameraContainer.addView(this.textureView, LayoutHelper.createFrame(-1.0f, -1));
            this.updateTextureViewSize = true;
            this.setVisibilityFromPause = z;
            setVisibility(0);
            startAnimation(true, z);
            MediaController.getInstance().requestRecordAudioFocus(true);
        }
    }

    public void startAnimation(boolean z, boolean z2) {
        int i = 5;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.animatorSet.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.instance;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.showTemporary(!z);
        }
        ChatActivity.AnonymousClass69 anonymousClass69 = this.textureOverlayView;
        AnonymousClass2 anonymousClass2 = this.cameraContainer;
        if (z && !this.opened) {
            anonymousClass2.setTranslationX(0.0f);
            anonymousClass69.setTranslationX(0.0f);
            this.animationTranslationY = z2 ? 0.0f : getMeasuredHeight() / 2.0f;
            updateTranslationY();
        }
        this.opened = z;
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
        this.animatorSet = new AnimatorSet();
        float fDp = (z || this.recordedTime <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 1.0f : 0.0f, z ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(i, this, z2));
        AnimatorSet animatorSet2 = this.animatorSet;
        LinearLayout linearLayout = this.buttonsLayout;
        float[] fArr = {z ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.muteImageView, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.paint, AnimationProperties.PAINT_ALPHA, z ? 255 : 0);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(anonymousClass2, (Property<AnonymousClass2, Float>) property, z ? 1.0f : 0.0f);
        float f = z ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(anonymousClass2, (Property<AnonymousClass2, Float>) property2, f);
        float f2 = z ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(anonymousClass2, (Property<AnonymousClass2, Float>) property3, f2);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfInt, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, ObjectAnimator.ofFloat(anonymousClass2, (Property<AnonymousClass2, Float>) property4, fDp), ObjectAnimator.ofFloat(anonymousClass69, (Property<ChatActivity.AnonymousClass69, Float>) property, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(anonymousClass69, (Property<ChatActivity.AnonymousClass69, Float>) property2, z ? 1.0f : 0.1f), ObjectAnimator.ofFloat(anonymousClass69, (Property<ChatActivity.AnonymousClass69, Float>) property3, z ? 1.0f : 0.1f), ObjectAnimator.ofFloat(anonymousClass69, (Property<ChatActivity.AnonymousClass69, Float>) property4, fDp), valueAnimatorOfFloat);
        if (z) {
            setTranslationX(0.0f);
        } else {
            this.animatorSet.addListener(new AnonymousClass9(this, 0));
        }
        this.animatorSet.setDuration(180L);
        this.animatorSet.setInterpolator(new DecelerateInterpolator());
        this.animatorSet.start();
    }

    public final void switchCamera$1() {
        if (!this.useCamera2 || !this.bothCameras) {
            saveLastCameraBitmap$1();
            Bitmap bitmap = this.lastBitmap;
            if (bitmap != null) {
                this.needDrawFlickerStub = false;
                this.textureOverlayView.setImageBitmap(bitmap);
                this.textureOverlayView.setAlpha(1.0f);
            }
        }
        this.isFrontface = !this.isFrontface;
        updateFlash();
        if (!this.useCamera2) {
            CameraSession cameraSession = this.cameraSession;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.cameraSession, null, null);
                this.cameraSession = null;
            }
        } else {
            if (this.bothCameras) {
                this.camera2SessionCurrent = this.camera2Sessions[!this.isFrontface ? 1 : 0];
                CameraGLThread cameraGLThread = this.cameraThread;
                Handler handler = cameraGLThread.getHandler();
                if (handler != null) {
                    cameraGLThread.sendMessage(handler.obtainMessage(4), 0);
                    cameraGLThread.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.camera2SessionCurrent;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.camera2SessionCurrent = null;
                this.camera2Sessions[this.isFrontface ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.camera2Sessions;
            boolean z = this.isFrontface;
            int i = !z ? 1 : 0;
            Camera2Session camera2SessionCreate = Camera2Session.create(z, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i] = camera2SessionCreate;
            this.camera2SessionCurrent = camera2SessionCreate;
            if (camera2SessionCreate == null) {
                return;
            }
            camera2SessionCreate.setRecordingVideo(true);
            this.previewSize[0] = new org.telegram.messenger.camera.Size(this.camera2SessionCurrent.getPreviewWidth(), this.camera2SessionCurrent.getPreviewHeight());
            CameraGLThread cameraGLThread2 = this.cameraThread;
            Camera2Session camera2Session2 = this.camera2SessionCurrent;
            Handler handler2 = cameraGLThread2.getHandler();
            if (handler2 != null) {
                cameraGLThread2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        initCamera();
        this.cameraReady = false;
        CameraGLThread cameraGLThread3 = this.cameraThread;
        Handler handler3 = cameraGLThread3.getHandler();
        if (handler3 != null) {
            cameraGLThread3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void togglePause() {
        if (!this.recording) {
            VideoRecorder videoRecorder = this.videoEncoder;
            if (videoRecorder != null) {
                videoRecorder.handler.sendMessage(videoRecorder.handler.obtainMessage(5));
                hideCamera(false);
                VideoPlayer videoPlayer = this.videoPlayer;
                if (videoPlayer != null) {
                    videoPlayer.releasePlayer();
                    this.videoPlayer = null;
                }
                showCamera(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.lockOrientation(this.delegate.getParentActivity());
                invalidate();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
                return;
            }
            return;
        }
        this.cancelled = this.recordedTime < 800;
        this.recording = false;
        updateFlash();
        if (this.cameraThread != null) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.recordingGuid), Integer.valueOf(this.cancelled ? 4 : 2));
            saveLastCameraBitmap$1();
            CameraGLThread cameraGLThread = this.cameraThread;
            boolean z = this.cancelled;
            int i = z ? 0 : 2;
            int i2 = z ? 0 : -2;
            Handler handler = cameraGLThread.getHandler();
            if (handler != null) {
                cameraGLThread.sendMessage(handler.obtainMessage(1, i, 0, new SendOptions(0L, 0, i2, true, 0L)), 0);
            }
            this.cameraThread = null;
        }
        if (!this.cancelled) {
            VideoRecorder videoRecorder2 = this.videoEncoder;
            videoRecorder2.handler.sendMessage(videoRecorder2.handler.obtainMessage(4));
        } else {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.recordingGuid), Boolean.TRUE, Integer.valueOf((int) this.recordedTime));
            startAnimation(false, false);
            MediaController.getInstance().requestRecordAudioFocus(false);
        }
    }

    public final void updateFlash() {
        boolean z = this.flashing && this.recording && this.isFrontface;
        if (this.frontFlashing != z) {
            this.frontFlashing = z;
            FlashViews flashViews = this.flashViews;
            if (z) {
                flashViews.setScreenBrightness(flashViews.intensity);
                flashViews.flashTo(1.0f, 320L, null);
            } else {
                flashViews.flashOut();
            }
        }
        if (this.useCamera2) {
            Camera2Session camera2Session = this.camera2Sessions[1];
            if (camera2Session != null) {
                camera2Session.setFlash(this.flashing && !this.isFrontface && this.recording);
            }
        } else {
            CameraSession cameraSession = this.cameraSession;
            if (cameraSession != null) {
                cameraSession.setTorchEnabled(this.flashing && !this.isFrontface && this.recording);
            }
        }
        FlashViews.ImageViewInvertable imageViewInvertable = this.flashButton;
        if (imageViewInvertable != null) {
            Boolean bool = this.wasFlashing;
            if (bool == null || bool.booleanValue() != this.flashing) {
                imageViewInvertable.setContentDescription(LocaleController.getString(this.flashing ? R.string.AccDescrCameraFlashOff : R.string.AccDescrCameraFlashOn));
                if (this.flashing) {
                    if (this.flashOffDrawable == null) {
                        int i = R.raw.roundcamera_flash_off;
                        int i2 = this.buttonsSizePx;
                        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "roundcamera_flash_off", i2, i2, true, null);
                        this.flashOffDrawable = rLottieDrawable;
                        rLottieDrawable.setCallback(imageViewInvertable);
                    }
                    imageViewInvertable.setImageDrawable(this.flashOffDrawable);
                    if (this.wasFlashing == null) {
                        RLottieDrawable rLottieDrawable2 = this.flashOffDrawable;
                        rLottieDrawable2.setCurrentFrame(rLottieDrawable2.metaData[0] - 1, true, false);
                    } else {
                        this.flashOffDrawable.setCurrentFrame(0, true, false);
                        this.flashOffDrawable.start();
                    }
                } else {
                    if (this.flashOnDrawable == null) {
                        int i3 = R.raw.roundcamera_flash_on;
                        int i4 = this.buttonsSizePx;
                        RLottieDrawable rLottieDrawable3 = new RLottieDrawable(i3, "roundcamera_flash_on", i4, i4, true, null);
                        this.flashOnDrawable = rLottieDrawable3;
                        rLottieDrawable3.setCallback(imageViewInvertable);
                    }
                    imageViewInvertable.setImageDrawable(this.flashOnDrawable);
                    if (this.wasFlashing == null) {
                        RLottieDrawable rLottieDrawable4 = this.flashOnDrawable;
                        rLottieDrawable4.setCurrentFrame(rLottieDrawable4.metaData[0] - 1, true, false);
                    } else {
                        this.flashOnDrawable.setCurrentFrame(0, true, false);
                        this.flashOnDrawable.start();
                    }
                }
                this.wasFlashing = Boolean.valueOf(this.flashing);
            }
        }
    }

    public final void updateTranslationY() {
        this.textureOverlayView.setTranslationY(this.animationTranslationY + this.panTranslationY);
        this.cameraContainer.setTranslationY(this.animationTranslationY + this.panTranslationY);
    }
}
