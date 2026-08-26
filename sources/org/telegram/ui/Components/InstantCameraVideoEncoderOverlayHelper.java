package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraView$VideoRecorder$$ExternalSyntheticOutline0;

public final class InstantCameraVideoEncoderOverlayHelper {
    public final FloatBuffer attributeTextureBuffer;
    public final FloatBuffer attributeVertexBuffer;
    public final int[] glTextures;
    public final int videoHeight;
    public final int videoWidth;
    public final Program programRenderTexture = new Program(R.raw.round_blur_stage_0_frag);
    public final Program programRenderWatermark = new Program(R.raw.round_blur_stage_3_frag);
    public final BlurProgram programRenderBlur = new BlurProgram();
    public final MixProgram programRenderMixed = new MixProgram();
    public int logoFrame = 0;
    public final int[] glFrameBuffers = new int[1];

    public final class BlurProgram extends Program {
        public final int uniformOffsetHandle;

        public BlurProgram() {
            super(R.raw.round_blur_stage_1_frag);
            this.uniformOffsetHandle = GLES20.glGetUniformLocation(this.program, "texOffset");
        }
    }

    public final class MixProgram extends Program {
        public final int uniformBlurredTextureHandle;
        public final int uniformHalfResolutionHandle;

        public MixProgram() {
            super(R.raw.round_blur_stage_2_frag);
            this.uniformBlurredTextureHandle = GLES20.glGetUniformLocation(this.program, "bTexture");
            this.uniformHalfResolutionHandle = GLES20.glGetUniformLocation(this.program, "center");
        }
    }

    public class Program {
        public final int attributePositionHandle;
        public final int attributeTextureHandle;
        public final int fragmentShader;
        public final int program;
        public final int uniformTextureHandle;
        public final int vertexShader;

        public Program(int i) {
            int i2 = R.raw.round_blur_vert;
            int iGlCreateShader = GLES20.glCreateShader(35633);
            int i3 = 0;
            if (iGlCreateShader == 0) {
                iGlCreateShader = 0;
            } else {
                GLES20.glShaderSource(iGlCreateShader, AndroidUtilities.readRes(i2));
                GLES20.glCompileShader(iGlCreateShader);
                int[] iArr = new int[1];
                GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
                if (iArr[0] == 0) {
                    FileLog.e("GlUtils: compile shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                    GLES20.glDeleteShader(iGlCreateShader);
                    iGlCreateShader = 0;
                }
            }
            this.vertexShader = iGlCreateShader;
            int iGlCreateShader2 = GLES20.glCreateShader(35632);
            if (iGlCreateShader2 == 0) {
                iGlCreateShader2 = 0;
            } else {
                GLES20.glShaderSource(iGlCreateShader2, AndroidUtilities.readRes(i));
                GLES20.glCompileShader(iGlCreateShader2);
                int[] iArr2 = new int[1];
                GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr2, 0);
                if (iArr2[0] == 0) {
                    FileLog.e("GlUtils: compile shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader2));
                    GLES20.glDeleteShader(iGlCreateShader2);
                    iGlCreateShader2 = 0;
                }
            }
            this.fragmentShader = iGlCreateShader2;
            int iGlCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
            GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(iGlCreateProgram);
            } else {
                i3 = iGlCreateProgram;
            }
            this.program = i3;
            this.attributePositionHandle = GLES20.glGetAttribLocation(i3, "aPosition");
            this.attributeTextureHandle = GLES20.glGetAttribLocation(i3, "aTextureCoord");
            this.uniformTextureHandle = GLES20.glGetUniformLocation(i3, "sTexture");
        }
    }

    public InstantCameraVideoEncoderOverlayHelper(int i, int i2) {
        Bitmap bitmap;
        Canvas canvas;
        int i3;
        int i4;
        Object obj;
        int[] iArr = new int[5];
        this.glTextures = iArr;
        this.videoWidth = i;
        this.videoHeight = i2;
        float[] fArr = new float[232];
        setTextureCords(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        setTextureCords(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        setVertexCords(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i5 = 0;
        for (int i6 = 5; i5 < i6; i6 = 5) {
            GLES20.glBindTexture(3553, this.glTextures[i5]);
            GLES20.glTexParameteri(3553, 10241, i5 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i5 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i7 = 4;
            if (i5 == 4) {
                int iRound = Math.round(i * 0.2f);
                int iRound2 = Math.round((i * 28) / 1536.0f);
                int i8 = (iRound - iRound2) - iRound2;
                Object obj2 = null;
                RLottieNative rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", null, null, null);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound, Bitmap.Config.ARGB_8888);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i8 * 8, i8 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                int i9 = 0;
                while (i9 < 8) {
                    int i10 = 0;
                    while (i10 < i7) {
                        int i11 = (i10 * 8) + i9;
                        if (i11 >= 27) {
                            Object obj3 = obj2;
                            i4 = i8;
                            obj = obj3;
                            canvas = canvas2;
                            bitmap = bitmapCreateBitmap;
                            i3 = i9;
                        } else {
                            int i12 = (i11 * 8) + 16;
                            bitmap = bitmapCreateBitmap;
                            canvas = canvas2;
                            i3 = i9;
                            i4 = i8;
                            setTextureCords(fArr, i12, i9 / 8.0f, i10 / 4.0f, (i9 + 1) / 8.0f, (i10 + 1) / 4.0f);
                            rLottieNativeCreateFromRawJson.getFrame(i11 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i4 * i3) - iRound2, (i4 * i10) - iRound2, (Paint) null);
                        }
                        i10++;
                        int i13 = i4;
                        obj2 = obj;
                        i8 = i13;
                        bitmapCreateBitmap = bitmap;
                        canvas2 = canvas;
                        i9 = i3;
                        i7 = 4;
                    }
                    i9++;
                    obj2 = obj2;
                    i8 = i8;
                    i7 = 4;
                }
                float fM = zzjd.m(i8, this.videoWidth, 2.0f, -1.0f);
                setVertexCords(fArr2, 24, -1.0f, fM, fM);
                GLUtils.texImage2D(3553, 0, bitmapCreateBitmap2, 0);
                bitmapCreateBitmap2.recycle();
                bitmapCreateBitmap.recycle();
                rLottieNativeCreateFromRawJson.recycle();
            } else if (i5 == 3) {
                int iRound3 = Math.round((i * 372.0f) / 1536.0f);
                float f = (iRound3 / this.videoWidth) * 2.0f;
                setVertexCords(fArr2, 12, 1.0f - f, f - 1.0f, 1.0f);
                Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                if (bitmapFromRaw != null) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, iRound3, iRound3, true);
                    Bitmap bitmapExtractAlpha = bitmapCreateScaledBitmap.extractAlpha();
                    GLUtils.texImage2D(3553, 0, bitmapExtractAlpha, 0);
                    bitmapExtractAlpha.recycle();
                    bitmapCreateScaledBitmap.recycle();
                    bitmapFromRaw.recycle();
                }
            } else {
                GLES20.glTexImage2D(3553, 0, 6408, i5 == 0 ? this.videoWidth : 48, i5 == 0 ? this.videoHeight : 48, 0, 6408, 5121, null);
            }
            i5++;
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, this.glFrameBuffers, 0);
        FloatBuffer floatBufferM = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(144));
        this.attributeVertexBuffer = floatBufferM;
        floatBufferM.put(fArr2).position(0);
        FloatBuffer floatBufferM2 = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(928));
        this.attributeTextureBuffer = floatBufferM2;
        floatBufferM2.put(fArr).position(0);
    }

    public static void setTextureCords(float[] fArr, int i, float f, float f2, float f3, float f4) {
        fArr[i] = f;
        fArr[i + 1] = f4;
        fArr[i + 2] = f3;
        fArr[i + 3] = f4;
        fArr[i + 4] = f;
        fArr[i + 5] = f2;
        fArr[i + 6] = f3;
        fArr[i + 7] = f2;
    }

    public static void setVertexCords(float[] fArr, int i, float f, float f2, float f3) {
        fArr[i] = f;
        fArr[i + 1] = -1.0f;
        fArr[i + 2] = 0.0f;
        fArr[i + 3] = f3;
        fArr[i + 4] = -1.0f;
        fArr[i + 5] = 0.0f;
        fArr[i + 6] = f;
        fArr[i + 7] = f2;
        fArr[i + 8] = 0.0f;
        fArr[i + 9] = f3;
        fArr[i + 10] = f2;
        fArr[i + 11] = 0.0f;
    }

    public final void destroy() {
        Program program = this.programRenderTexture;
        GLES20.glDeleteProgram(program.program);
        GLES20.glDeleteShader(program.vertexShader);
        GLES20.glDeleteShader(program.fragmentShader);
        BlurProgram blurProgram = this.programRenderBlur;
        GLES20.glDeleteProgram(blurProgram.program);
        GLES20.glDeleteShader(blurProgram.vertexShader);
        GLES20.glDeleteShader(blurProgram.fragmentShader);
        MixProgram mixProgram = this.programRenderMixed;
        GLES20.glDeleteProgram(mixProgram.program);
        GLES20.glDeleteShader(mixProgram.vertexShader);
        GLES20.glDeleteShader(mixProgram.fragmentShader);
        Program program2 = this.programRenderWatermark;
        GLES20.glDeleteProgram(program2.program);
        GLES20.glDeleteShader(program2.vertexShader);
        GLES20.glDeleteShader(program2.fragmentShader);
        GLES20.glDeleteTextures(5, this.glTextures, 0);
        GLES20.glDeleteFramebuffers(1, this.glFrameBuffers, 0);
    }
}
