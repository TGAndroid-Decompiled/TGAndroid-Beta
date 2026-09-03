package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ha {
    public FloatBuffer f27447e;
    public FloatBuffer f27448f;
    public FloatBuffer f27449g;
    public boolean h;
    public int f27453l;
    public int f27454m;
    public ByteBuffer f27456o;
    public Bitmap f27457p;
    public boolean f27458q;
    public ba f27461t;
    public int f27444a = 1;
    public int f27445b = 1;
    public int f27446c = 0;
    public final ca[] d = new ca[2];
    public final float[] f27450i = new float[9];
    public final float[] f27451j = new float[16];
    public final Object f27452k = new Object();
    public final Object f27455n = new Object();
    public final int[] f27459r = new int[3];
    public final int[] f27460s = new int[3];
    public final fg f27462u = new fg(this, 13);
    public final Matrix v = new Matrix();

    public final void a(float[] fArr, int i10, int i11, int i12) {
        char c3;
        float f10;
        Object obj;
        if (fArr != null) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        ca caVar = this.d[c3];
        if (caVar != null) {
            GLES20.glBindFramebuffer(36160, this.f27459r[0]);
            GLES20.glViewport(0, 0, this.f27444a, this.f27445b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(caVar.f25867a);
            GLES20.glUniform1i(caVar.f25870e, 0);
            GLES20.glActiveTexture(33984);
            if (c3 != 0) {
                GLES20.glBindTexture(36197, i10);
            } else {
                GLES20.glBindTexture(3553, i10);
            }
            GLES20.glEnableVertexAttribArray(caVar.f25869c);
            GLES20.glVertexAttribPointer(caVar.f25869c, 2, 5126, false, 8, (Buffer) this.f27449g);
            GLES20.glEnableVertexAttribArray(caVar.f25868b);
            GLES20.glVertexAttribPointer(caVar.f25868b, 2, 5126, false, 8, (Buffer) this.f27447e);
            GLES20.glUniform2f(caVar.f25871f, this.f27444a, this.f27445b);
            float f11 = i11;
            float f12 = i12;
            GLES20.glUniform2f(caVar.f25872g, f11, f12);
            GLES20.glUniform1i(caVar.f25874j, 0);
            int i13 = caVar.f25875k;
            float f13 = 1.0f;
            if (c3 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i13, f10);
            if (c3 != 0) {
                GLES20.glUniformMatrix4fv(caVar.f25876l, 1, false, fArr, 0);
            }
            int i14 = caVar.f25877m;
            if (c3 == 0) {
                f13 = 0.0f;
            }
            GLES20.glUniform1f(i14, f13);
            dg.p1.a(caVar.h, this.f27453l);
            dg.p1.a(caVar.f25873i, this.f27454m);
            synchronized (this.f27452k) {
                GLES20.glUniformMatrix4fv(caVar.d, 1, false, this.f27451j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c3 != 0) {
                caVar = this.d[0];
                if (caVar == null) {
                    return;
                }
                GLES20.glUseProgram(caVar.f25867a);
                GLES20.glEnableVertexAttribArray(caVar.f25869c);
                GLES20.glVertexAttribPointer(caVar.f25869c, 2, 5126, false, 8, (Buffer) this.f27449g);
                GLES20.glEnableVertexAttribArray(caVar.f25868b);
                GLES20.glVertexAttribPointer(caVar.f25868b, 2, 5126, false, 8, (Buffer) this.f27447e);
                GLES20.glUniform2f(caVar.f25871f, this.f27444a, this.f27445b);
                GLES20.glUniform2f(caVar.f25872g, f11, f12);
                GLES20.glUniform1i(caVar.f25874j, 0);
                dg.p1.a(caVar.h, this.f27453l);
                dg.p1.a(caVar.f25873i, this.f27454m);
                GLES20.glUniform1f(caVar.f25875k, 0.0f);
                synchronized (this.f27452k) {
                    GLES20.glUniformMatrix4fv(caVar.d, 1, false, this.f27451j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f27459r[1]);
            GLES20.glUniform1i(caVar.f25874j, 1);
            GLES20.glUniform1i(caVar.f25870e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f27460s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f27459r[2]);
            int i15 = this.f27444a;
            int i16 = this.f27446c * 2;
            GLES20.glViewport(0, 0, i15 + i16, i16 + this.f27445b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(caVar.f25868b);
            GLES20.glVertexAttribPointer(caVar.f25868b, 2, 5126, false, 8, (Buffer) this.f27448f);
            GLES20.glUniform1i(caVar.f25874j, 2);
            GLES20.glUniform1i(caVar.f25870e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f27460s[1]);
            ba baVar = this.f27461t;
            if (baVar != null) {
                obj = baVar.h;
            } else {
                obj = null;
            }
            if (obj != null) {
                synchronized (obj) {
                    GLES20.glDrawArrays(5, 0, 4);
                }
            } else {
                GLES20.glDrawArrays(5, 0, 4);
            }
            ByteBuffer byteBuffer = this.f27456o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i17 = this.f27444a;
                int i18 = this.f27446c * 2;
                GLES20.glReadPixels(0, 0, i18 + i17, i18 + this.f27445b, 6408, 5121, this.f27456o);
                synchronized (this.f27455n) {
                    this.f27457p.copyPixelsFromBuffer(this.f27456o);
                    this.f27458q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f27462u);
            AndroidUtilities.runOnUIThread(this.f27462u);
        }
    }

    public final boolean b(float f10, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f27444a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f27445b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f27446c = i10;
        if (!this.h) {
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.v;
            matrix.invert(matrix2);
            float f11 = 1;
            matrix2.preScale(f11, f11);
            float f12 = 1.0f / f11;
            matrix2.postScale(f12, f12);
            c(matrix2);
        }
        float[] fArr = new float[8];
        fArr[0] = -1.0f;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        fArr[4] = -1.0f;
        fArr[5] = -1.0f;
        fArr[6] = 1.0f;
        fArr[7] = -1.0f;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f27447e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f27447e.position(0);
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i15 * 2;
            fArr[i16] = ((i13 - i10) / this.f27444a) * fArr[i16];
            int i17 = i16 + 1;
            fArr[i17] = ((i14 - i10) / this.f27445b) * fArr[i17];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f27448f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f27448f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f27449g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f27449g.position(0);
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
            int i18 = 0;
            while (true) {
                if (i18 < 2) {
                    if (i18 == 1) {
                        readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = b00.h(35633, readRes);
                    int h9 = b00.h(35632, readRes2);
                    if (h == 0 || h9 == 0) {
                        break;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(glCreateProgram, h);
                    GLES20.glAttachShader(glCreateProgram, h9);
                    GLES20.glBindAttribLocation(glCreateProgram, 0, "p");
                    GLES20.glBindAttribLocation(glCreateProgram, 1, "inputuv");
                    GLES20.glLinkProgram(glCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        GLES20.glDeleteProgram(glCreateProgram);
                        return false;
                    }
                    ?? obj = new Object();
                    obj.f25867a = glCreateProgram;
                    obj.f25868b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f25869c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f25870e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f25871f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f25872g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f25873i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f25874j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f25876l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f25877m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f25875k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i18] = obj;
                    i18++;
                } else {
                    int[] iArr2 = this.f27459r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f27460s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i19 = 0; i19 < 3; i19++) {
                        GLES20.glBindTexture(3553, iArr3[i19]);
                        int i20 = this.f27444a;
                        if (i19 == 2) {
                            i11 = i10 * 2;
                        } else {
                            i11 = 0;
                        }
                        int i21 = i20 + i11;
                        int i22 = this.f27445b;
                        if (i19 == 2) {
                            i12 = i10 * 2;
                        } else {
                            i12 = 0;
                        }
                        GLES20.glTexImage2D(3553, 0, 6408, i21, i22 + i12, 0, 6408, 5121, null);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glBindFramebuffer(36160, iArr2[i19]);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr3[i19], 0);
                        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                        }
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    int i23 = i10 * 2;
                    this.f27457p = Bitmap.createBitmap(this.f27444a + i23, this.f27445b + i23, Bitmap.Config.ARGB_8888);
                    this.f27456o = ByteBuffer.allocateDirect((i23 + this.f27445b) * (this.f27444a + i23) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f27450i);
        synchronized (this.f27452k) {
            float[] fArr = this.f27451j;
            float[] fArr2 = this.f27450i;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }
    }
}
