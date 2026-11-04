package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class ca {
    public FloatBuffer f32624e;
    public FloatBuffer f32625f;
    public FloatBuffer f32626g;
    public boolean h;
    public int f32630l;
    public int f32631m;
    public ByteBuffer f32633o;
    public Bitmap f32634p;
    public boolean f32635q;
    public x9 f32638t;
    public int f32621a = 1;
    public int f32622b = 1;
    public int f32623c = 0;
    public final y9[] d = new y9[2];
    public final float[] f32627i = new float[9];
    public final float[] f32628j = new float[16];
    public final Object f32629k = new Object();
    public final Object f32632n = new Object();
    public final int[] f32636r = new int[3];
    public final int[] f32637s = new int[3];
    public final vf f32639u = new vf(this, 13);
    public final Matrix v = new Matrix();

    public final void a(int i3, int i10, int i11, float[] fArr) {
        char c2;
        float f10;
        Object obj;
        if (fArr != null) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        y9 y9Var = this.d[c2];
        if (y9Var != null) {
            GLES20.glBindFramebuffer(36160, this.f32636r[0]);
            GLES20.glViewport(0, 0, this.f32621a, this.f32622b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(y9Var.f40656a);
            GLES20.glUniform1i(y9Var.f40659e, 0);
            GLES20.glActiveTexture(33984);
            if (c2 != 0) {
                GLES20.glBindTexture(36197, i3);
            } else {
                GLES20.glBindTexture(3553, i3);
            }
            GLES20.glEnableVertexAttribArray(y9Var.f40658c);
            GLES20.glVertexAttribPointer(y9Var.f40658c, 2, 5126, false, 8, (Buffer) this.f32626g);
            GLES20.glEnableVertexAttribArray(y9Var.f40657b);
            GLES20.glVertexAttribPointer(y9Var.f40657b, 2, 5126, false, 8, (Buffer) this.f32624e);
            GLES20.glUniform2f(y9Var.f40660f, this.f32621a, this.f32622b);
            float f11 = i10;
            float f12 = i11;
            GLES20.glUniform2f(y9Var.f40661g, f11, f12);
            GLES20.glUniform1i(y9Var.f40663j, 0);
            int i12 = y9Var.f40664k;
            float f13 = 1.0f;
            if (c2 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i12, f10);
            if (c2 != 0) {
                GLES20.glUniformMatrix4fv(y9Var.f40665l, 1, false, fArr, 0);
            }
            int i13 = y9Var.f40666m;
            if (c2 == 0) {
                f13 = 0.0f;
            }
            GLES20.glUniform1f(i13, f13);
            tg.v0.a(y9Var.h, this.f32630l);
            tg.v0.a(y9Var.f40662i, this.f32631m);
            synchronized (this.f32629k) {
                GLES20.glUniformMatrix4fv(y9Var.d, 1, false, this.f32628j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c2 != 0) {
                y9Var = this.d[0];
                if (y9Var == null) {
                    return;
                }
                GLES20.glUseProgram(y9Var.f40656a);
                GLES20.glEnableVertexAttribArray(y9Var.f40658c);
                GLES20.glVertexAttribPointer(y9Var.f40658c, 2, 5126, false, 8, (Buffer) this.f32626g);
                GLES20.glEnableVertexAttribArray(y9Var.f40657b);
                GLES20.glVertexAttribPointer(y9Var.f40657b, 2, 5126, false, 8, (Buffer) this.f32624e);
                GLES20.glUniform2f(y9Var.f40660f, this.f32621a, this.f32622b);
                GLES20.glUniform2f(y9Var.f40661g, f11, f12);
                GLES20.glUniform1i(y9Var.f40663j, 0);
                tg.v0.a(y9Var.h, this.f32630l);
                tg.v0.a(y9Var.f40662i, this.f32631m);
                GLES20.glUniform1f(y9Var.f40664k, 0.0f);
                synchronized (this.f32629k) {
                    GLES20.glUniformMatrix4fv(y9Var.d, 1, false, this.f32628j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f32636r[1]);
            GLES20.glUniform1i(y9Var.f40663j, 1);
            GLES20.glUniform1i(y9Var.f40659e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f32637s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f32636r[2]);
            int i14 = this.f32621a;
            int i15 = this.f32623c * 2;
            GLES20.glViewport(0, 0, i14 + i15, i15 + this.f32622b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(y9Var.f40657b);
            GLES20.glVertexAttribPointer(y9Var.f40657b, 2, 5126, false, 8, (Buffer) this.f32625f);
            GLES20.glUniform1i(y9Var.f40663j, 2);
            GLES20.glUniform1i(y9Var.f40659e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f32637s[1]);
            x9 x9Var = this.f32638t;
            if (x9Var != null) {
                obj = x9Var.h;
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
            ByteBuffer byteBuffer = this.f32633o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i16 = this.f32621a;
                int i17 = this.f32623c * 2;
                GLES20.glReadPixels(0, 0, i17 + i16, i17 + this.f32622b, 6408, 5121, this.f32633o);
                synchronized (this.f32632n) {
                    this.f32634p.copyPixelsFromBuffer(this.f32633o);
                    this.f32635q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            org.telegram.messenger.g0.r(this.f32639u);
            org.telegram.messenger.g0.h3(this.f32639u);
        }
    }

    public final boolean b(float f10, int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f32621a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f32622b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f32623c = i3;
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
        this.f32624e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f32624e.position(0);
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i14 * 2;
            fArr[i15] = ((i12 - i3) / this.f32621a) * fArr[i15];
            int i16 = i15 + 1;
            fArr[i16] = ((i13 - i3) / this.f32622b) * fArr[i16];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f32625f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f32625f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f32626g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f32626g.position(0);
        String y22 = org.telegram.messenger.g0.y2(null, 2131623943);
        String y23 = org.telegram.messenger.g0.y2(null, 2131623942);
        if (y22 != null && y23 != null) {
            int i17 = 0;
            while (true) {
                if (i17 < 2) {
                    if (i17 == 1) {
                        y23 = "#extension GL_OES_EGL_image_external : require\n" + y23.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = sy.h(35633, y22);
                    int h7 = sy.h(35632, y23);
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
                    obj.f40656a = glCreateProgram;
                    obj.f40657b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f40658c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f40659e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f40660f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f40661g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f40662i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f40663j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f40665l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f40666m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f40664k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i17] = obj;
                    i17++;
                } else {
                    int[] iArr2 = this.f32636r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f32637s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i18 = 0; i18 < 3; i18++) {
                        GLES20.glBindTexture(3553, iArr3[i18]);
                        int i19 = this.f32621a;
                        if (i18 == 2) {
                            i10 = i3 * 2;
                        } else {
                            i10 = 0;
                        }
                        int i20 = i19 + i10;
                        int i21 = this.f32622b;
                        if (i18 == 2) {
                            i11 = i3 * 2;
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
                    int i22 = i3 * 2;
                    this.f32634p = Bitmap.createBitmap(this.f32621a + i22, this.f32622b + i22, Bitmap.Config.ARGB_8888);
                    this.f32633o = ByteBuffer.allocateDirect((i22 + this.f32622b) * (this.f32621a + i22) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f32627i);
        synchronized (this.f32629k) {
            float[] fArr = this.f32628j;
            float[] fArr2 = this.f32627i;
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
