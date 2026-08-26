package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

public class InstantCameraVideoEncoderOverlayHelper {
    private static final int DOWNSCALED_HEIGHT = 48;
    private static final int DOWNSCALED_WIDTH = 48;
    private static final int TEXTURE_BUFFER_NORMAL_POSITION = 0;
    private static final int TEXTURE_BUFFER_WATERMARK_LOGO_POSITION = 16;
    private static final int TEXTURE_BUFFER_Y_REVERSE_POSITION = 8;
    private static final int TEXTURE_INDEX_DOWN_SAMPLE = 1;
    private static final int TEXTURE_INDEX_DOWN_SAMPLE_TMP = 2;
    private static final int TEXTURE_INDEX_FULL_SAMPLE = 0;
    private static final int TEXTURE_INDEX_WATERMARK_LOGO = 4;
    private static final int TEXTURE_INDEX_WATERMARK_TEXT = 3;
    private static final int VERTEX_BUFFER_NORMAL_POSITION = 0;
    private static final int VERTEX_BUFFER_WATERMARK_LOGO_POSITION = 24;
    private static final int VERTEX_BUFFER_WATERMARK_TEXT_POSITION = 12;
    private final FloatBuffer attributeTextureBuffer;
    private final FloatBuffer attributeVertexBuffer;
    private final int[] glTextures;
    private final int videoHeight;
    private final int videoWidth;
    private final Program programRenderTexture = new Program(R.raw.round_blur_stage_0_frag);
    private final Program programRenderWatermark = new Program(R.raw.round_blur_stage_3_frag);
    private final BlurProgram programRenderBlur = new BlurProgram();
    private final MixProgram programRenderMixed = new MixProgram();
    private int logoFrame = 0;
    private final int[] glFrameBuffers = new int[1];

    public static class BlurProgram extends Program {
        final int uniformOffsetHandle;

        public BlurProgram() {
            super(R.raw.round_blur_stage_1_frag);
            this.uniformOffsetHandle = GLES20.glGetUniformLocation(this.program, "texOffset");
        }
    }

    public static class MixProgram extends Program {
        final int uniformBlurredTextureHandle;
        final int uniformHalfResolutionHandle;

        public MixProgram() {
            super(R.raw.round_blur_stage_2_frag);
            this.uniformBlurredTextureHandle = GLES20.glGetUniformLocation(this.program, "bTexture");
            this.uniformHalfResolutionHandle = GLES20.glGetUniformLocation(this.program, "center");
        }
    }

    public static class Program {
        final int attributePositionHandle;
        final int attributeTextureHandle;
        final int fragmentShader;
        final int program;
        final int uniformTextureHandle;
        final int vertexShader;

        public Program(int i) {
            int iCreateShader = InstantCameraVideoEncoderOverlayHelper.createShader(35633, R.raw.round_blur_vert);
            this.vertexShader = iCreateShader;
            int iCreateShader2 = InstantCameraVideoEncoderOverlayHelper.createShader(35632, i);
            this.fragmentShader = iCreateShader2;
            int iCreateProgram = InstantCameraVideoEncoderOverlayHelper.createProgram(iCreateShader, iCreateShader2);
            this.program = iCreateProgram;
            this.attributePositionHandle = GLES20.glGetAttribLocation(iCreateProgram, "aPosition");
            this.attributeTextureHandle = GLES20.glGetAttribLocation(iCreateProgram, "aTextureCoord");
            this.uniformTextureHandle = GLES20.glGetUniformLocation(iCreateProgram, "sTexture");
        }

        public void destroy() {
            GLES20.glDeleteProgram(this.program);
            GLES20.glDeleteShader(this.vertexShader);
            GLES20.glDeleteShader(this.fragmentShader);
        }
    }

    public InstantCameraVideoEncoderOverlayHelper(int i, int i2) {
        float[] fArr;
        int i3;
        int i4;
        RLottieNative rLottieNative;
        int i5;
        Bitmap bitmap;
        Object obj;
        int[] iArr = new int[5];
        this.glTextures = iArr;
        this.videoWidth = i;
        this.videoHeight = i2;
        float[] fArr2 = new float[232];
        setTextureCords(fArr2, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        setTextureCords(fArr2, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr3 = new float[36];
        setVertexCords(fArr3, 0, -1.0f, 1.0f, 1.0f, -1.0f);
        float[] fArr4 = fArr3;
        GLES20.glGenTextures(5, iArr, 0);
        int i6 = 0;
        for (int i7 = 5; i6 < i7; i7 = 5) {
            GLES20.glBindTexture(3553, this.glTextures[i6]);
            GLES20.glTexParameteri(3553, 10241, i6 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i6 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i8 = 4;
            if (i6 == 4) {
                int iRound = Math.round(i * 0.2f);
                int iRound2 = Math.round((i * 28) / 1536.0f);
                int i9 = (iRound - iRound2) - iRound2;
                Object obj2 = null;
                RLottieNative rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", null);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound, Bitmap.Config.ARGB_8888);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i9 * 8, i9 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                int i10 = 0;
                while (i10 < 8) {
                    int i11 = 0;
                    while (i11 < i8) {
                        int i12 = (i11 * 8) + i10;
                        if (i12 >= 27) {
                            i3 = i9;
                            i4 = i10;
                            i5 = i11;
                            bitmap = bitmapCreateBitmap;
                            obj = obj2;
                            rLottieNative = rLottieNativeCreateFromRawJson;
                        } else {
                            float f = (i11 + 1) / 4.0f;
                            i3 = i9;
                            i4 = i10;
                            rLottieNative = rLottieNativeCreateFromRawJson;
                            i5 = i11;
                            bitmap = bitmapCreateBitmap;
                            setTextureCords(fArr2, (i12 * 8) + 16, i10 / 8.0f, i11 / 4.0f, (i10 + 1) / 8.0f, f);
                            rLottieNative.getFrame(i12 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i3 * i4) - iRound2, (i3 * i5) - iRound2, (Paint) null);
                        }
                        rLottieNativeCreateFromRawJson = rLottieNative;
                        obj2 = obj;
                        bitmapCreateBitmap = bitmap;
                        i10 = i4;
                        i8 = 4;
                        i11 = i5 + 1;
                        i9 = i3;
                    }
                    i10++;
                    obj2 = obj2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i8 = 4;
                }
                RLottieNative rLottieNative2 = rLottieNativeCreateFromRawJson;
                float fM = zzir.m(i9, this.videoWidth, 2.0f, -1.0f);
                float[] fArr5 = fArr4;
                setVertexCords(fArr5, 24, -1.0f, fM, fM, -1.0f);
                GLUtils.texImage2D(3553, 0, bitmapCreateBitmap2, 0);
                bitmapCreateBitmap2.recycle();
                bitmapCreateBitmap.recycle();
                rLottieNative2.recycle();
                fArr = fArr5;
            } else {
                float[] fArr6 = fArr4;
                if (i6 == 3) {
                    int iRound3 = Math.round((i * 372.0f) / 1536.0f);
                    float f2 = (iRound3 / this.videoWidth) * 2.0f;
                    fArr = fArr6;
                    setVertexCords(fArr, 12, 1.0f - f2, f2 - 1.0f, 1.0f, -1.0f);
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
                    fArr = fArr6;
                    GLES20.glTexImage2D(3553, 0, 6408, i6 == 0 ? this.videoWidth : 48, i6 == 0 ? this.videoHeight : 48, 0, 6408, 5121, null);
                }
            }
            i6++;
            fArr4 = fArr;
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, this.glFrameBuffers, 0);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(144).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.attributeVertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr4).position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(928).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.attributeTextureBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
    }

    public static int createProgram(int i, int i2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, i);
        GLES20.glAttachShader(iGlCreateProgram, i2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public static int createShader(int i, int i2) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(iGlCreateShader, AndroidUtilities.readRes(i2));
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        FileLog.e("GlUtils: compile shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    private static void setTextureCords(float[] fArr, int i, float f, float f2, float f3, float f4) {
        fArr[i] = f;
        fArr[i + 1] = f4;
        fArr[i + 2] = f3;
        fArr[i + 3] = f4;
        fArr[i + 4] = f;
        fArr[i + 5] = f2;
        fArr[i + 6] = f3;
        fArr[i + 7] = f2;
    }

    private static void setVertexCords(float[] fArr, int i, float f, float f2, float f3, float f4) {
        fArr[i] = f;
        fArr[i + 1] = f4;
        fArr[i + 2] = 0.0f;
        fArr[i + 3] = f3;
        fArr[i + 4] = f4;
        fArr[i + 5] = 0.0f;
        fArr[i + 6] = f;
        fArr[i + 7] = f2;
        fArr[i + 8] = 0.0f;
        fArr[i + 9] = f3;
        fArr[i + 10] = f2;
        fArr[i + 11] = 0.0f;
    }

    public void bind() {
        GLES20.glBindFramebuffer(36160, this.glFrameBuffers[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[0], 0);
        GLES20.glViewport(0, 0, this.videoWidth, this.videoHeight);
    }

    public void destroy() {
        this.programRenderTexture.destroy();
        this.programRenderBlur.destroy();
        this.programRenderMixed.destroy();
        this.programRenderWatermark.destroy();
        GLES20.glDeleteTextures(5, this.glTextures, 0);
        GLES20.glDeleteFramebuffers(1, this.glFrameBuffers, 0);
    }

    public void render() {
        GLES20.glDisable(3042);
        Program program = this.programRenderTexture;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[1], 0);
        GLES20.glViewport(0, 0, 48, 48);
        GLES20.glUseProgram(program.program);
        GLES20.glVertexAttribPointer(program.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(0));
        GLES20.glEnableVertexAttribArray(program.attributePositionHandle);
        GLES20.glVertexAttribPointer(program.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(0));
        GLES20.glEnableVertexAttribArray(program.attributeTextureHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.glTextures[0]);
        GLES20.glUniform1i(program.uniformTextureHandle, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisableVertexAttribArray(program.attributeTextureHandle);
        GLES20.glDisableVertexAttribArray(program.attributePositionHandle);
        GLES20.glUseProgram(0);
        int i = 0;
        while (true) {
            if (i >= 2) {
                break;
            }
            BlurProgram blurProgram = this.programRenderBlur;
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[i == 0 ? (char) 2 : (char) 1], 0);
            GLES20.glViewport(0, 0, 48, 48);
            GLES20.glUseProgram(blurProgram.program);
            GLES20.glVertexAttribPointer(blurProgram.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(0));
            GLES20.glEnableVertexAttribArray(blurProgram.attributePositionHandle);
            GLES20.glVertexAttribPointer(blurProgram.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(0));
            GLES20.glEnableVertexAttribArray(blurProgram.attributeTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.glTextures[i == 0 ? (char) 1 : (char) 2]);
            GLES20.glUniform1i(blurProgram.uniformTextureHandle, 0);
            int i2 = blurProgram.uniformOffsetHandle;
            float f = 0.0f;
            float f2 = i == 0 ? 0.020833334f : 0.0f;
            if (i == 1) {
                f = 0.020833334f;
            }
            GLES20.glUniform2f(i2, f2, f);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(3553, 0);
            GLES20.glDisableVertexAttribArray(blurProgram.attributeTextureHandle);
            GLES20.glDisableVertexAttribArray(blurProgram.attributePositionHandle);
            GLES20.glUseProgram(0);
            i++;
        }
        MixProgram mixProgram = this.programRenderMixed;
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[1], 0);
        GLES20.glViewport(0, 0, this.videoWidth, this.videoHeight);
        GLES20.glUseProgram(mixProgram.program);
        GLES20.glVertexAttribPointer(mixProgram.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(0));
        GLES20.glEnableVertexAttribArray(mixProgram.attributePositionHandle);
        GLES20.glVertexAttribPointer(mixProgram.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(0));
        GLES20.glEnableVertexAttribArray(mixProgram.attributeTextureHandle);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.glTextures[1]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.glTextures[0]);
        GLES20.glUniform1i(mixProgram.uniformTextureHandle, 0);
        GLES20.glUniform1i(mixProgram.uniformBlurredTextureHandle, 1);
        GLES20.glUniform2f(mixProgram.uniformHalfResolutionHandle, this.videoWidth / 2.0f, this.videoHeight / 2.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisableVertexAttribArray(mixProgram.attributeTextureHandle);
        GLES20.glDisableVertexAttribArray(mixProgram.attributePositionHandle);
        GLES20.glUseProgram(0);
        Program program2 = this.programRenderWatermark;
        GLES20.glEnable(3042);
        GLES20.glUseProgram(program2.program);
        GLES20.glActiveTexture(33984);
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                GLES20.glVertexAttribPointer(program2.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(12));
                GLES20.glEnableVertexAttribArray(program2.attributePositionHandle);
                GLES20.glVertexAttribPointer(program2.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(8));
                GLES20.glEnableVertexAttribArray(program2.attributeTextureHandle);
                GLES20.glBindTexture(3553, this.glTextures[3]);
            } else {
                int i4 = this.logoFrame;
                this.logoFrame = i4 + 1;
                GLES20.glVertexAttribPointer(program2.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(24));
                GLES20.glEnableVertexAttribArray(program2.attributePositionHandle);
                GLES20.glVertexAttribPointer(program2.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(((i4 % 27) * 8) + 16));
                GLES20.glEnableVertexAttribArray(program2.attributeTextureHandle);
                GLES20.glBindTexture(3553, this.glTextures[4]);
            }
            GLES20.glUniform1i(program2.uniformTextureHandle, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(3553, 0);
            GLES20.glDisableVertexAttribArray(program2.attributeTextureHandle);
            GLES20.glDisableVertexAttribArray(program2.attributePositionHandle);
        }
        GLES20.glUseProgram(0);
        GLES20.glDisable(3042);
    }
}
