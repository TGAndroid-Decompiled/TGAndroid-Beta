package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class z9 {
    public FloatBuffer f42311e;
    public FloatBuffer f42312f;
    public FloatBuffer f42313g;
    public boolean h;
    public int f42317l;
    public int f42318m;
    public ByteBuffer f42320o;
    public Bitmap f42321p;
    public boolean f42322q;
    public u9 f42325t;
    public int f42308a = 1;
    public int f42309b = 1;
    public int f42310c = 0;
    public final v9[] d = new v9[2];
    public final float[] f42314i = new float[9];
    public final float[] f42315j = new float[16];
    public final Object f42316k = new Object();
    public final Object f42319n = new Object();
    public final int[] f42323r = new int[3];
    public final int[] f42324s = new int[3];
    public final dg f42326u = new dg(this, 13);
    public final Matrix v = new Matrix();

    public final void a(int i7, int i10, int i11, float[] fArr) {
        char c10;
        float f10;
        Object obj;
        if (fArr != null) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        v9 v9Var = this.d[c10];
        if (v9Var != null) {
            GLES20.glBindFramebuffer(36160, this.f42323r[0]);
            GLES20.glViewport(0, 0, this.f42308a, this.f42309b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(v9Var.f40347a);
            GLES20.glUniform1i(v9Var.f40350e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i7);
            } else {
                GLES20.glBindTexture(3553, i7);
            }
            GLES20.glEnableVertexAttribArray(v9Var.f40349c);
            GLES20.glVertexAttribPointer(v9Var.f40349c, 2, 5126, false, 8, (Buffer) this.f42313g);
            GLES20.glEnableVertexAttribArray(v9Var.f40348b);
            GLES20.glVertexAttribPointer(v9Var.f40348b, 2, 5126, false, 8, (Buffer) this.f42311e);
            GLES20.glUniform2f(v9Var.f40351f, this.f42308a, this.f42309b);
            float f11 = i10;
            float f12 = i11;
            GLES20.glUniform2f(v9Var.f40352g, f11, f12);
            GLES20.glUniform1i(v9Var.f40354j, 0);
            int i12 = v9Var.f40355k;
            float f13 = 1.0f;
            if (c10 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i12, f10);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(v9Var.f40356l, 1, false, fArr, 0);
            }
            int i13 = v9Var.f40357m;
            if (c10 == 0) {
                f13 = 0.0f;
            }
            GLES20.glUniform1f(i13, f13);
            sg.v0.a(v9Var.h, this.f42317l);
            sg.v0.a(v9Var.f40353i, this.f42318m);
            synchronized (this.f42316k) {
                GLES20.glUniformMatrix4fv(v9Var.d, 1, false, this.f42315j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                v9Var = this.d[0];
                if (v9Var == null) {
                    return;
                }
                GLES20.glUseProgram(v9Var.f40347a);
                GLES20.glEnableVertexAttribArray(v9Var.f40349c);
                GLES20.glVertexAttribPointer(v9Var.f40349c, 2, 5126, false, 8, (Buffer) this.f42313g);
                GLES20.glEnableVertexAttribArray(v9Var.f40348b);
                GLES20.glVertexAttribPointer(v9Var.f40348b, 2, 5126, false, 8, (Buffer) this.f42311e);
                GLES20.glUniform2f(v9Var.f40351f, this.f42308a, this.f42309b);
                GLES20.glUniform2f(v9Var.f40352g, f11, f12);
                GLES20.glUniform1i(v9Var.f40354j, 0);
                sg.v0.a(v9Var.h, this.f42317l);
                sg.v0.a(v9Var.f40353i, this.f42318m);
                GLES20.glUniform1f(v9Var.f40355k, 0.0f);
                synchronized (this.f42316k) {
                    GLES20.glUniformMatrix4fv(v9Var.d, 1, false, this.f42315j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f42323r[1]);
            GLES20.glUniform1i(v9Var.f40354j, 1);
            GLES20.glUniform1i(v9Var.f40350e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f42324s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f42323r[2]);
            int i14 = this.f42308a;
            int i15 = this.f42310c * 2;
            GLES20.glViewport(0, 0, i14 + i15, i15 + this.f42309b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(v9Var.f40348b);
            GLES20.glVertexAttribPointer(v9Var.f40348b, 2, 5126, false, 8, (Buffer) this.f42312f);
            GLES20.glUniform1i(v9Var.f40354j, 2);
            GLES20.glUniform1i(v9Var.f40350e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f42324s[1]);
            u9 u9Var = this.f42325t;
            if (u9Var != null) {
                obj = u9Var.h;
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
            ByteBuffer byteBuffer = this.f42320o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i16 = this.f42308a;
                int i17 = this.f42310c * 2;
                GLES20.glReadPixels(0, 0, i17 + i16, i17 + this.f42309b, 6408, 5121, this.f42320o);
                synchronized (this.f42319n) {
                    this.f42321p.copyPixelsFromBuffer(this.f42320o);
                    this.f42322q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            org.telegram.messenger.g0.r(this.f42326u);
            org.telegram.messenger.g0.h3(this.f42326u);
        }
    }

    public final boolean b(float f10, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f42308a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f42309b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f42310c = i7;
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
        this.f42311e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f42311e.position(0);
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i14 * 2;
            fArr[i15] = ((i12 - i7) / this.f42308a) * fArr[i15];
            int i16 = i15 + 1;
            fArr[i16] = ((i13 - i7) / this.f42309b) * fArr[i16];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f42312f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f42312f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f42313g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f42313g.position(0);
        String y22 = org.telegram.messenger.g0.y2(null, 2131623943);
        String y23 = org.telegram.messenger.g0.y2(null, 2131623942);
        if (y22 != null && y23 != null) {
            int i17 = 0;
            while (true) {
                if (i17 < 2) {
                    if (i17 == 1) {
                        y23 = "#extension GL_OES_EGL_image_external : require\n" + y23.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = zy.h(35633, y22);
                    int h7 = zy.h(35632, y23);
                    if (h == 0 || h7 == 0) {
                        break;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(glCreateProgram, h);
                    GLES20.glAttachShader(glCreateProgram, h7);
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
                    obj.f40347a = glCreateProgram;
                    obj.f40348b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f40349c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f40350e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f40351f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f40352g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f40353i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f40354j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f40356l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f40357m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f40355k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i17] = obj;
                    i17++;
                } else {
                    int[] iArr2 = this.f42323r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f42324s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i18 = 0; i18 < 3; i18++) {
                        GLES20.glBindTexture(3553, iArr3[i18]);
                        int i19 = this.f42308a;
                        if (i18 == 2) {
                            i10 = i7 * 2;
                        } else {
                            i10 = 0;
                        }
                        int i20 = i19 + i10;
                        int i21 = this.f42309b;
                        if (i18 == 2) {
                            i11 = i7 * 2;
                        } else {
                            i11 = 0;
                        }
                        GLES20.glTexImage2D(3553, 0, 6408, i20, i21 + i11, 0, 6408, 5121, null);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glBindFramebuffer(36160, iArr2[i18]);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr3[i18], 0);
                        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                        }
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    int i22 = i7 * 2;
                    this.f42321p = Bitmap.createBitmap(this.f42308a + i22, this.f42309b + i22, Bitmap.Config.ARGB_8888);
                    this.f42320o = ByteBuffer.allocateDirect((i22 + this.f42309b) * (this.f42308a + i22) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f42314i);
        synchronized (this.f42316k) {
            float[] fArr = this.f42315j;
            float[] fArr2 = this.f42314i;
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
