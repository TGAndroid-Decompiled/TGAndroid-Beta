package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

public class InstantCameraVideoEncoderOverlayHelper {
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

    public InstantCameraVideoEncoderOverlayHelper(int i, int i2) throws IOException {
        float[] fArr;
        Bitmap bitmap;
        long j;
        int i3;
        int i4;
        float[] fArr2;
        Bitmap bitmap2;
        Object obj;
        int i5 = i;
        int i6 = 0;
        int[] iArr = new int[5];
        this.glTextures = iArr;
        this.videoWidth = i5;
        this.videoHeight = i2;
        float[] fArr3 = new float[232];
        setTextureCords(fArr3, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        setTextureCords(fArr3, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr4 = new float[36];
        setVertexCords(fArr4, 0, -1.0f, 1.0f, 1.0f, -1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i7 = 0;
        for (int i8 = 5; i7 < i8; i8 = 5) {
            GLES20.glBindTexture(3553, this.glTextures[i7]);
            GLES20.glTexParameteri(3553, 10241, i7 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i7 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i9 = 4;
            if (i7 == 4) {
                int iRound = Math.round(i5 * 0.2f);
                int iRound2 = Math.round((i5 * 28) / 1536.0f);
                int i10 = (iRound - iRound2) - iRound2;
                Object obj2 = null;
                long jCreateWithJson = RLottieDrawable.createWithJson(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", new int[3], null);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound, Bitmap.Config.ARGB_8888);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10 * 8, i10 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                int i11 = 0;
                while (i11 < 8) {
                    int i12 = 0;
                    while (i12 < i9) {
                        int i13 = (i12 * 8) + i11;
                        if (i13 >= 27) {
                            bitmap = bitmapCreateBitmap2;
                            fArr2 = fArr3;
                            j = jCreateWithJson;
                            i3 = i11;
                            bitmap2 = bitmapCreateBitmap;
                            i4 = i10;
                            obj = null;
                        } else {
                            bitmap = bitmapCreateBitmap2;
                            j = jCreateWithJson;
                            float[] fArr5 = fArr3;
                            i3 = i11;
                            i4 = i10;
                            fArr2 = fArr3;
                            bitmap2 = bitmapCreateBitmap;
                            setTextureCords(fArr5, (i13 * 8) + 16, i11 / 8.0f, i12 / 4.0f, (i11 + 1) / 8.0f, (i12 + 1) / 4.0f);
                            RLottieDrawable.getFrame(j, i13 * 2, bitmap2, true);
                            obj = null;
                            canvas.drawBitmap(bitmap2, (i4 * i3) - iRound2, (i4 * i12) - iRound2, (Paint) null);
                        }
                        i12++;
                        i10 = i4;
                        bitmapCreateBitmap = bitmap2;
                        obj2 = obj;
                        fArr3 = fArr2;
                        i11 = i3;
                        i9 = 4;
                        jCreateWithJson = j;
                        bitmapCreateBitmap2 = bitmap;
                    }
                    i11++;
                    fArr3 = fArr3;
                    i9 = 4;
                    jCreateWithJson = jCreateWithJson;
                    bitmapCreateBitmap2 = bitmapCreateBitmap2;
                }
                Bitmap bitmap3 = bitmapCreateBitmap2;
                fArr = fArr3;
                float f = ((i10 / this.videoWidth) * 2.0f) - 1.0f;
                setVertexCords(fArr4, 24, -1.0f, f, f, -1.0f);
                GLUtils.texImage2D(3553, 0, bitmap3, 0);
                bitmap3.recycle();
                bitmapCreateBitmap.recycle();
                RLottieDrawable.destroy(jCreateWithJson);
                i5 = i;
            } else {
                fArr = fArr3;
                if (i7 == 3) {
                    i5 = i;
                    int iRound3 = Math.round((i5 * 372.0f) / 1536.0f);
                    float f2 = (iRound3 / this.videoWidth) * 2.0f;
                    setVertexCords(fArr4, 12, 1.0f - f2, f2 - 1.0f, 1.0f, -1.0f);
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
                    i5 = i;
                    GLES20.glTexImage2D(3553, 0, 6408, i7 == 0 ? this.videoWidth : 48, i7 == 0 ? this.videoHeight : 48, 0, 6408, 5121, null);
                }
            }
            i7++;
            fArr3 = fArr;
            i6 = 0;
        }
        GLES20.glBindTexture(3553, i6);
        GLES20.glGenFramebuffers(1, this.glFrameBuffers, i6);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(144).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.attributeVertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr4).position(i6);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(928).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.attributeTextureBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr3).position(i6);
    }

    public void bind() {
        GLES20.glBindFramebuffer(36160, this.glFrameBuffers[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[0], 0);
        GLES20.glViewport(0, 0, this.videoWidth, this.videoHeight);
    }

    public void render() {
        GLES20.glDisable(3042);
        Program program = this.programRenderTexture;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[1], 0);
        int i = 48;
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
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            BlurProgram blurProgram = this.programRenderBlur;
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.glTextures[i2 == 0 ? (char) 2 : (char) 1], 0);
            GLES20.glViewport(0, 0, i, i);
            GLES20.glUseProgram(blurProgram.program);
            GLES20.glVertexAttribPointer(blurProgram.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(0));
            GLES20.glEnableVertexAttribArray(blurProgram.attributePositionHandle);
            GLES20.glVertexAttribPointer(blurProgram.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(0));
            GLES20.glEnableVertexAttribArray(blurProgram.attributeTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.glTextures[i2 == 0 ? (char) 1 : (char) 2]);
            GLES20.glUniform1i(blurProgram.uniformTextureHandle, 0);
            int i3 = blurProgram.uniformOffsetHandle;
            float f = 0.0f;
            float f2 = i2 == 0 ? 0.020833334f : 0.0f;
            if (i2 == 1) {
                f = 0.020833334f;
            }
            GLES20.glUniform2f(i3, f2, f);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(3553, 0);
            GLES20.glDisableVertexAttribArray(blurProgram.attributeTextureHandle);
            GLES20.glDisableVertexAttribArray(blurProgram.attributePositionHandle);
            GLES20.glUseProgram(0);
            i2++;
            i = 48;
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
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 == 0) {
                GLES20.glVertexAttribPointer(program2.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(12));
                GLES20.glEnableVertexAttribArray(program2.attributePositionHandle);
                GLES20.glVertexAttribPointer(program2.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(8));
                GLES20.glEnableVertexAttribArray(program2.attributeTextureHandle);
                GLES20.glBindTexture(3553, this.glTextures[3]);
            } else {
                int i5 = this.logoFrame;
                this.logoFrame = i5 + 1;
                GLES20.glVertexAttribPointer(program2.attributePositionHandle, 3, 5126, false, 12, this.attributeVertexBuffer.position(24));
                GLES20.glEnableVertexAttribArray(program2.attributePositionHandle);
                GLES20.glVertexAttribPointer(program2.attributeTextureHandle, 2, 5126, false, 8, this.attributeTextureBuffer.position(((i5 % 27) * 8) + 16));
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

    public void destroy() {
        this.programRenderTexture.destroy();
        this.programRenderBlur.destroy();
        this.programRenderMixed.destroy();
        this.programRenderWatermark.destroy();
        GLES20.glDeleteTextures(5, this.glTextures, 0);
        GLES20.glDeleteFramebuffers(1, this.glFrameBuffers, 0);
    }

    private static class MixProgram extends Program {
        final int uniformBlurredTextureHandle;
        final int uniformHalfResolutionHandle;

        public MixProgram() {
            super(R.raw.round_blur_stage_2_frag);
            this.uniformBlurredTextureHandle = GLES20.glGetUniformLocation(this.program, "bTexture");
            this.uniformHalfResolutionHandle = GLES20.glGetUniformLocation(this.program, "center");
        }
    }

    private static class BlurProgram extends Program {
        final int uniformOffsetHandle;

        public BlurProgram() {
            super(R.raw.round_blur_stage_1_frag);
            this.uniformOffsetHandle = GLES20.glGetUniformLocation(this.program, "texOffset");
        }
    }

    private static class Program {
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
}
