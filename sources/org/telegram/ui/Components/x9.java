package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class x9 {
    public FloatBuffer e;
    public FloatBuffer f32511f;
    public FloatBuffer f32512g;
    public boolean h;
    public int f32516l;
    public int f32517m;
    public ByteBuffer f32519o;
    public Bitmap f32520p;
    public boolean f32521q;
    public s9 f32524t;
    public int f32508a = 1;
    public int f32509b = 1;
    public int f32510c = 0;
    public final t9[] d = new t9[2];
    public final float[] f32513i = new float[9];
    public final float[] f32514j = new float[16];
    public final Object f32515k = new Object();
    public final Object f32518n = new Object();
    public final int[] f32522r = new int[3];
    public final int[] f32523s = new int[3];
    public final tf f32525u = new tf(this, 14);
    public final Matrix v = new Matrix();

    public final void a(int i10, int i11, int i12, float[] fArr) {
        char c10;
        float f7;
        Object obj;
        if (fArr != null) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        t9 t9Var = this.d[c10];
        if (t9Var != null) {
            GLES20.glBindFramebuffer(36160, this.f32522r[0]);
            GLES20.glViewport(0, 0, this.f32508a, this.f32509b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(t9Var.f30605a);
            GLES20.glUniform1i(t9Var.e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i10);
            } else {
                GLES20.glBindTexture(3553, i10);
            }
            GLES20.glEnableVertexAttribArray(t9Var.f30607c);
            GLES20.glVertexAttribPointer(t9Var.f30607c, 2, 5126, false, 8, (Buffer) this.f32512g);
            GLES20.glEnableVertexAttribArray(t9Var.f30606b);
            GLES20.glVertexAttribPointer(t9Var.f30606b, 2, 5126, false, 8, (Buffer) this.e);
            GLES20.glUniform2f(t9Var.f30608f, this.f32508a, this.f32509b);
            float f10 = i11;
            float f11 = i12;
            GLES20.glUniform2f(t9Var.f30609g, f10, f11);
            GLES20.glUniform1i(t9Var.f30611j, 0);
            int i13 = t9Var.f30612k;
            float f12 = 1.0f;
            if (c10 != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            GLES20.glUniform1f(i13, f7);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(t9Var.f30613l, 1, false, fArr, 0);
            }
            int i14 = t9Var.f30614m;
            if (c10 == 0) {
                f12 = 0.0f;
            }
            GLES20.glUniform1f(i14, f12);
            ig.d1.a(t9Var.h, this.f32516l);
            ig.d1.a(t9Var.f30610i, this.f32517m);
            synchronized (this.f32515k) {
                GLES20.glUniformMatrix4fv(t9Var.d, 1, false, this.f32514j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                t9Var = this.d[0];
                if (t9Var == null) {
                    return;
                }
                GLES20.glUseProgram(t9Var.f30605a);
                GLES20.glEnableVertexAttribArray(t9Var.f30607c);
                GLES20.glVertexAttribPointer(t9Var.f30607c, 2, 5126, false, 8, (Buffer) this.f32512g);
                GLES20.glEnableVertexAttribArray(t9Var.f30606b);
                GLES20.glVertexAttribPointer(t9Var.f30606b, 2, 5126, false, 8, (Buffer) this.e);
                GLES20.glUniform2f(t9Var.f30608f, this.f32508a, this.f32509b);
                GLES20.glUniform2f(t9Var.f30609g, f10, f11);
                GLES20.glUniform1i(t9Var.f30611j, 0);
                ig.d1.a(t9Var.h, this.f32516l);
                ig.d1.a(t9Var.f30610i, this.f32517m);
                GLES20.glUniform1f(t9Var.f30612k, 0.0f);
                synchronized (this.f32515k) {
                    GLES20.glUniformMatrix4fv(t9Var.d, 1, false, this.f32514j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f32522r[1]);
            GLES20.glUniform1i(t9Var.f30611j, 1);
            GLES20.glUniform1i(t9Var.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f32523s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f32522r[2]);
            int i15 = this.f32508a;
            int i16 = this.f32510c * 2;
            GLES20.glViewport(0, 0, i15 + i16, i16 + this.f32509b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(t9Var.f30606b);
            GLES20.glVertexAttribPointer(t9Var.f30606b, 2, 5126, false, 8, (Buffer) this.f32511f);
            GLES20.glUniform1i(t9Var.f30611j, 2);
            GLES20.glUniform1i(t9Var.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f32523s[1]);
            s9 s9Var = this.f32524t;
            if (s9Var != null) {
                obj = s9Var.h;
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
            ByteBuffer byteBuffer = this.f32519o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i17 = this.f32508a;
                int i18 = this.f32510c * 2;
                GLES20.glReadPixels(0, 0, i18 + i17, i18 + this.f32509b, 6408, 5121, this.f32519o);
                synchronized (this.f32518n) {
                    this.f32520p.copyPixelsFromBuffer(this.f32519o);
                    this.f32521q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            org.telegram.messenger.i0.r(this.f32525u);
            org.telegram.messenger.i0.g3(this.f32525u);
        }
    }

    public final boolean b(float f7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f32508a = (int) Math.round(Math.sqrt(f7 * 324.0f));
        this.f32509b = (int) Math.round(Math.sqrt(324.0f / f7));
        this.f32510c = i10;
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
            fArr[i16] = ((i13 - i10) / this.f32508a) * fArr[i16];
            int i17 = i16 + 1;
            fArr[i17] = ((i14 - i10) / this.f32509b) * fArr[i17];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f32511f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f32511f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f32512g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f32512g.position(0);
        String y22 = org.telegram.messenger.i0.y2(null, 2131623943);
        String y23 = org.telegram.messenger.i0.y2(null, 2131623942);
        if (y22 != null && y23 != null) {
            int i18 = 0;
            while (true) {
                if (i18 < 2) {
                    if (i18 == 1) {
                        y23 = "#extension GL_OES_EGL_image_external : require\n" + y23.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = jz.h(35633, y22);
                    int h10 = jz.h(35632, y23);
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
                    obj.f30605a = glCreateProgram;
                    obj.f30606b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f30607c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f30608f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f30609g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f30610i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f30611j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f30613l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f30614m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f30612k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i18] = obj;
                    i18++;
                } else {
                    int[] iArr2 = this.f32522r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f32523s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i19 = 0; i19 < 3; i19++) {
                        GLES20.glBindTexture(3553, iArr3[i19]);
                        int i20 = this.f32508a;
                        if (i19 == 2) {
                            i11 = i10 * 2;
                        } else {
                            i11 = 0;
                        }
                        int i21 = i20 + i11;
                        int i22 = this.f32509b;
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
                    this.f32520p = Bitmap.createBitmap(this.f32508a + i23, this.f32509b + i23, Bitmap.Config.ARGB_8888);
                    this.f32519o = ByteBuffer.allocateDirect((i23 + this.f32509b) * (this.f32508a + i23) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f32513i);
        synchronized (this.f32515k) {
            float[] fArr = this.f32514j;
            float[] fArr2 = this.f32513i;
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
