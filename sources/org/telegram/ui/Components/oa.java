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
public final class oa {
    public FloatBuffer e;
    public FloatBuffer f26870f;
    public FloatBuffer f26871g;
    public boolean h;
    public int f26875l;
    public int f26876m;
    public ByteBuffer f26878o;
    public Bitmap f26879p;
    public boolean f26880q;
    public ia f26883t;
    public int f26867a = 1;
    public int f26868b = 1;
    public int f26869c = 0;
    public final ja[] d = new ja[2];
    public final float[] f26872i = new float[9];
    public final float[] f26873j = new float[16];
    public final Object f26874k = new Object();
    public final Object f26877n = new Object();
    public final int[] f26881r = new int[3];
    public final int[] f26882s = new int[3];
    public final og f26884u = new og(this, 13);
    public final Matrix v = new Matrix();

    public final void a(float[] fArr, int i10, int i11, int i12) {
        char c10;
        float f7;
        Object obj;
        if (fArr != null) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        ja jaVar = this.d[c10];
        if (jaVar != null) {
            GLES20.glBindFramebuffer(36160, this.f26881r[0]);
            GLES20.glViewport(0, 0, this.f26867a, this.f26868b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(jaVar.f25308a);
            GLES20.glUniform1i(jaVar.e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i10);
            } else {
                GLES20.glBindTexture(3553, i10);
            }
            GLES20.glEnableVertexAttribArray(jaVar.f25310c);
            GLES20.glVertexAttribPointer(jaVar.f25310c, 2, 5126, false, 8, (Buffer) this.f26871g);
            GLES20.glEnableVertexAttribArray(jaVar.f25309b);
            GLES20.glVertexAttribPointer(jaVar.f25309b, 2, 5126, false, 8, (Buffer) this.e);
            GLES20.glUniform2f(jaVar.f25311f, this.f26867a, this.f26868b);
            float f10 = i11;
            float f11 = i12;
            GLES20.glUniform2f(jaVar.f25312g, f10, f11);
            GLES20.glUniform1i(jaVar.f25314j, 0);
            int i13 = jaVar.f25315k;
            float f12 = 1.0f;
            if (c10 != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            GLES20.glUniform1f(i13, f7);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(jaVar.f25316l, 1, false, fArr, 0);
            }
            int i14 = jaVar.f25317m;
            if (c10 == 0) {
                f12 = 0.0f;
            }
            GLES20.glUniform1f(i14, f12);
            pg.f1.a(jaVar.h, this.f26875l);
            pg.f1.a(jaVar.f25313i, this.f26876m);
            synchronized (this.f26874k) {
                GLES20.glUniformMatrix4fv(jaVar.d, 1, false, this.f26873j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                jaVar = this.d[0];
                if (jaVar == null) {
                    return;
                }
                GLES20.glUseProgram(jaVar.f25308a);
                GLES20.glEnableVertexAttribArray(jaVar.f25310c);
                GLES20.glVertexAttribPointer(jaVar.f25310c, 2, 5126, false, 8, (Buffer) this.f26871g);
                GLES20.glEnableVertexAttribArray(jaVar.f25309b);
                GLES20.glVertexAttribPointer(jaVar.f25309b, 2, 5126, false, 8, (Buffer) this.e);
                GLES20.glUniform2f(jaVar.f25311f, this.f26867a, this.f26868b);
                GLES20.glUniform2f(jaVar.f25312g, f10, f11);
                GLES20.glUniform1i(jaVar.f25314j, 0);
                pg.f1.a(jaVar.h, this.f26875l);
                pg.f1.a(jaVar.f25313i, this.f26876m);
                GLES20.glUniform1f(jaVar.f25315k, 0.0f);
                synchronized (this.f26874k) {
                    GLES20.glUniformMatrix4fv(jaVar.d, 1, false, this.f26873j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f26881r[1]);
            GLES20.glUniform1i(jaVar.f25314j, 1);
            GLES20.glUniform1i(jaVar.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26882s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f26881r[2]);
            int i15 = this.f26867a;
            int i16 = this.f26869c * 2;
            GLES20.glViewport(0, 0, i15 + i16, i16 + this.f26868b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(jaVar.f25309b);
            GLES20.glVertexAttribPointer(jaVar.f25309b, 2, 5126, false, 8, (Buffer) this.f26870f);
            GLES20.glUniform1i(jaVar.f25314j, 2);
            GLES20.glUniform1i(jaVar.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26882s[1]);
            ia iaVar = this.f26883t;
            if (iaVar != null) {
                obj = iaVar.h;
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
            ByteBuffer byteBuffer = this.f26878o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i17 = this.f26867a;
                int i18 = this.f26869c * 2;
                GLES20.glReadPixels(0, 0, i18 + i17, i18 + this.f26868b, 6408, 5121, this.f26878o);
                synchronized (this.f26877n) {
                    this.f26879p.copyPixelsFromBuffer(this.f26878o);
                    this.f26880q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f26884u);
            AndroidUtilities.runOnUIThread(this.f26884u);
        }
    }

    public final boolean b(float f7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f26867a = (int) Math.round(Math.sqrt(f7 * 324.0f));
        this.f26868b = (int) Math.round(Math.sqrt(324.0f / f7));
        this.f26869c = i10;
        if (!this.h) {
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.v;
            matrix.invert(matrix2);
            float f10 = 1;
            matrix2.preScale(f10, f10);
            float f11 = 1.0f / f10;
            matrix2.postScale(f11, f11);
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
        this.e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.e.position(0);
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i15 * 2;
            fArr[i16] = ((i13 - i10) / this.f26867a) * fArr[i16];
            int i17 = i16 + 1;
            fArr[i17] = ((i14 - i10) / this.f26868b) * fArr[i17];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f26870f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f26870f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f26871g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f26871g.position(0);
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
            int i18 = 0;
            while (true) {
                if (i18 < 2) {
                    if (i18 == 1) {
                        readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = zz.h(35633, readRes);
                    int h10 = zz.h(35632, readRes2);
                    if (h == 0 || h10 == 0) {
                        break;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(glCreateProgram, h);
                    GLES20.glAttachShader(glCreateProgram, h10);
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
                    obj.f25308a = glCreateProgram;
                    obj.f25309b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f25310c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f25311f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f25312g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f25313i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f25314j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f25316l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f25317m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f25315k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i18] = obj;
                    i18++;
                } else {
                    int[] iArr2 = this.f26881r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f26882s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i19 = 0; i19 < 3; i19++) {
                        GLES20.glBindTexture(3553, iArr3[i19]);
                        int i20 = this.f26867a;
                        if (i19 == 2) {
                            i11 = i10 * 2;
                        } else {
                            i11 = 0;
                        }
                        int i21 = i20 + i11;
                        int i22 = this.f26868b;
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
                    this.f26879p = Bitmap.createBitmap(this.f26867a + i23, this.f26868b + i23, Bitmap.Config.ARGB_8888);
                    this.f26878o = ByteBuffer.allocateDirect((i23 + this.f26868b) * (this.f26867a + i23) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f26872i);
        synchronized (this.f26874k) {
            float[] fArr = this.f26873j;
            float[] fArr2 = this.f26872i;
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
