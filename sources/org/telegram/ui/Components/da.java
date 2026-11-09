package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class da {
    public FloatBuffer f32899e;
    public FloatBuffer f32900f;
    public FloatBuffer f32901g;
    public boolean h;
    public int f32905l;
    public int f32906m;
    public ByteBuffer f32908o;
    public Bitmap f32909p;
    public boolean f32910q;
    public y9 f32913t;
    public int f32896a = 1;
    public int f32897b = 1;
    public int f32898c = 0;
    public final z9[] d = new z9[2];
    public final float[] f32902i = new float[9];
    public final float[] f32903j = new float[16];
    public final Object f32904k = new Object();
    public final Object f32907n = new Object();
    public final int[] f32911r = new int[3];
    public final int[] f32912s = new int[3];
    public final xf f32914u = new xf(this, 13);
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
        z9 z9Var = this.d[c10];
        if (z9Var != null) {
            GLES20.glBindFramebuffer(36160, this.f32911r[0]);
            GLES20.glViewport(0, 0, this.f32896a, this.f32897b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(z9Var.f40937a);
            GLES20.glUniform1i(z9Var.f40940e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i7);
            } else {
                GLES20.glBindTexture(3553, i7);
            }
            GLES20.glEnableVertexAttribArray(z9Var.f40939c);
            GLES20.glVertexAttribPointer(z9Var.f40939c, 2, 5126, false, 8, (Buffer) this.f32901g);
            GLES20.glEnableVertexAttribArray(z9Var.f40938b);
            GLES20.glVertexAttribPointer(z9Var.f40938b, 2, 5126, false, 8, (Buffer) this.f32899e);
            GLES20.glUniform2f(z9Var.f40941f, this.f32896a, this.f32897b);
            float f11 = i10;
            float f12 = i11;
            GLES20.glUniform2f(z9Var.f40942g, f11, f12);
            GLES20.glUniform1i(z9Var.f40944j, 0);
            int i12 = z9Var.f40945k;
            float f13 = 1.0f;
            if (c10 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i12, f10);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(z9Var.f40946l, 1, false, fArr, 0);
            }
            int i13 = z9Var.f40947m;
            if (c10 == 0) {
                f13 = 0.0f;
            }
            GLES20.glUniform1f(i13, f13);
            sg.w0.a(z9Var.h, this.f32905l);
            sg.w0.a(z9Var.f40943i, this.f32906m);
            synchronized (this.f32904k) {
                GLES20.glUniformMatrix4fv(z9Var.d, 1, false, this.f32903j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                z9Var = this.d[0];
                if (z9Var == null) {
                    return;
                }
                GLES20.glUseProgram(z9Var.f40937a);
                GLES20.glEnableVertexAttribArray(z9Var.f40939c);
                GLES20.glVertexAttribPointer(z9Var.f40939c, 2, 5126, false, 8, (Buffer) this.f32901g);
                GLES20.glEnableVertexAttribArray(z9Var.f40938b);
                GLES20.glVertexAttribPointer(z9Var.f40938b, 2, 5126, false, 8, (Buffer) this.f32899e);
                GLES20.glUniform2f(z9Var.f40941f, this.f32896a, this.f32897b);
                GLES20.glUniform2f(z9Var.f40942g, f11, f12);
                GLES20.glUniform1i(z9Var.f40944j, 0);
                sg.w0.a(z9Var.h, this.f32905l);
                sg.w0.a(z9Var.f40943i, this.f32906m);
                GLES20.glUniform1f(z9Var.f40945k, 0.0f);
                synchronized (this.f32904k) {
                    GLES20.glUniformMatrix4fv(z9Var.d, 1, false, this.f32903j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f32911r[1]);
            GLES20.glUniform1i(z9Var.f40944j, 1);
            GLES20.glUniform1i(z9Var.f40940e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f32912s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f32911r[2]);
            int i14 = this.f32896a;
            int i15 = this.f32898c * 2;
            GLES20.glViewport(0, 0, i14 + i15, i15 + this.f32897b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(z9Var.f40938b);
            GLES20.glVertexAttribPointer(z9Var.f40938b, 2, 5126, false, 8, (Buffer) this.f32900f);
            GLES20.glUniform1i(z9Var.f40944j, 2);
            GLES20.glUniform1i(z9Var.f40940e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f32912s[1]);
            y9 y9Var = this.f32913t;
            if (y9Var != null) {
                obj = y9Var.h;
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
            ByteBuffer byteBuffer = this.f32908o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i16 = this.f32896a;
                int i17 = this.f32898c * 2;
                GLES20.glReadPixels(0, 0, i17 + i16, i17 + this.f32897b, 6408, 5121, this.f32908o);
                synchronized (this.f32907n) {
                    this.f32909p.copyPixelsFromBuffer(this.f32908o);
                    this.f32910q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            org.telegram.messenger.g0.r(this.f32914u);
            org.telegram.messenger.g0.h3(this.f32914u);
        }
    }

    public final boolean b(float f10, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f32896a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f32897b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f32898c = i7;
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
        this.f32899e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f32899e.position(0);
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i14 * 2;
            fArr[i15] = ((i12 - i7) / this.f32896a) * fArr[i15];
            int i16 = i15 + 1;
            fArr[i16] = ((i13 - i7) / this.f32897b) * fArr[i16];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f32900f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f32900f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f32901g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f32901g.position(0);
        String y22 = org.telegram.messenger.g0.y2(null, 2131623943);
        String y23 = org.telegram.messenger.g0.y2(null, 2131623942);
        if (y22 != null && y23 != null) {
            int i17 = 0;
            while (true) {
                if (i17 < 2) {
                    if (i17 == 1) {
                        y23 = "#extension GL_OES_EGL_image_external : require\n" + y23.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = wy.h(35633, y22);
                    int h7 = wy.h(35632, y23);
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
                    obj.f40937a = glCreateProgram;
                    obj.f40938b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f40939c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f40940e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f40941f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f40942g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f40943i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f40944j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f40946l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f40947m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f40945k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i17] = obj;
                    i17++;
                } else {
                    int[] iArr2 = this.f32911r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f32912s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i18 = 0; i18 < 3; i18++) {
                        GLES20.glBindTexture(3553, iArr3[i18]);
                        int i19 = this.f32896a;
                        if (i18 == 2) {
                            i10 = i7 * 2;
                        } else {
                            i10 = 0;
                        }
                        int i20 = i19 + i10;
                        int i21 = this.f32897b;
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
                    this.f32909p = Bitmap.createBitmap(this.f32896a + i22, this.f32897b + i22, Bitmap.Config.ARGB_8888);
                    this.f32908o = ByteBuffer.allocateDirect((i22 + this.f32897b) * (this.f32896a + i22) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f32902i);
        synchronized (this.f32904k) {
            float[] fArr = this.f32903j;
            float[] fArr2 = this.f32902i;
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
