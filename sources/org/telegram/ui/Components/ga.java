package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class ga {
    public FloatBuffer f35378e;
    public FloatBuffer f35379f;
    public FloatBuffer f35380g;
    public boolean h;
    public int f35384l;
    public int f35385m;
    public ByteBuffer f35387o;
    public Bitmap f35388p;
    public boolean f35389q;
    public ba f35392t;
    public int f35375a = 1;
    public int f35376b = 1;
    public int f35377c = 0;
    public final ca[] d = new ca[2];
    public final float[] f35381i = new float[9];
    public final float[] f35382j = new float[16];
    public final Object f35383k = new Object();
    public final Object f35386n = new Object();
    public final int[] f35390r = new int[3];
    public final int[] f35391s = new int[3];
    public final ng f35393u = new ng(this, 13);
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
        ca caVar = this.d[c10];
        if (caVar != null) {
            GLES20.glBindFramebuffer(36160, this.f35390r[0]);
            GLES20.glViewport(0, 0, this.f35375a, this.f35376b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(caVar.f33995a);
            GLES20.glUniform1i(caVar.f33998e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i7);
            } else {
                GLES20.glBindTexture(3553, i7);
            }
            GLES20.glEnableVertexAttribArray(caVar.f33997c);
            GLES20.glVertexAttribPointer(caVar.f33997c, 2, 5126, false, 8, (Buffer) this.f35380g);
            GLES20.glEnableVertexAttribArray(caVar.f33996b);
            GLES20.glVertexAttribPointer(caVar.f33996b, 2, 5126, false, 8, (Buffer) this.f35378e);
            GLES20.glUniform2f(caVar.f33999f, this.f35375a, this.f35376b);
            float f11 = i10;
            float f12 = i11;
            GLES20.glUniform2f(caVar.f34000g, f11, f12);
            GLES20.glUniform1i(caVar.f34002j, 0);
            int i12 = caVar.f34003k;
            float f13 = 1.0f;
            if (c10 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i12, f10);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(caVar.f34004l, 1, false, fArr, 0);
            }
            int i13 = caVar.f34005m;
            if (c10 == 0) {
                f13 = 0.0f;
            }
            GLES20.glUniform1f(i13, f13);
            sg.u0.a(caVar.h, this.f35384l);
            sg.u0.a(caVar.f34001i, this.f35385m);
            synchronized (this.f35383k) {
                GLES20.glUniformMatrix4fv(caVar.d, 1, false, this.f35382j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                caVar = this.d[0];
                if (caVar == null) {
                    return;
                }
                GLES20.glUseProgram(caVar.f33995a);
                GLES20.glEnableVertexAttribArray(caVar.f33997c);
                GLES20.glVertexAttribPointer(caVar.f33997c, 2, 5126, false, 8, (Buffer) this.f35380g);
                GLES20.glEnableVertexAttribArray(caVar.f33996b);
                GLES20.glVertexAttribPointer(caVar.f33996b, 2, 5126, false, 8, (Buffer) this.f35378e);
                GLES20.glUniform2f(caVar.f33999f, this.f35375a, this.f35376b);
                GLES20.glUniform2f(caVar.f34000g, f11, f12);
                GLES20.glUniform1i(caVar.f34002j, 0);
                sg.u0.a(caVar.h, this.f35384l);
                sg.u0.a(caVar.f34001i, this.f35385m);
                GLES20.glUniform1f(caVar.f34003k, 0.0f);
                synchronized (this.f35383k) {
                    GLES20.glUniformMatrix4fv(caVar.d, 1, false, this.f35382j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f35390r[1]);
            GLES20.glUniform1i(caVar.f34002j, 1);
            GLES20.glUniform1i(caVar.f33998e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f35391s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f35390r[2]);
            int i14 = this.f35375a;
            int i15 = this.f35377c * 2;
            GLES20.glViewport(0, 0, i14 + i15, i15 + this.f35376b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(caVar.f33996b);
            GLES20.glVertexAttribPointer(caVar.f33996b, 2, 5126, false, 8, (Buffer) this.f35379f);
            GLES20.glUniform1i(caVar.f34002j, 2);
            GLES20.glUniform1i(caVar.f33998e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f35391s[1]);
            ba baVar = this.f35392t;
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
            ByteBuffer byteBuffer = this.f35387o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i16 = this.f35375a;
                int i17 = this.f35377c * 2;
                GLES20.glReadPixels(0, 0, i17 + i16, i17 + this.f35376b, 6408, 5121, this.f35387o);
                synchronized (this.f35386n) {
                    this.f35388p.copyPixelsFromBuffer(this.f35387o);
                    this.f35389q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            org.telegram.messenger.g0.r(this.f35393u);
            org.telegram.messenger.g0.g3(this.f35393u);
        }
    }

    public final boolean b(float f10, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f35375a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f35376b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f35377c = i7;
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
        this.f35378e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f35378e.position(0);
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i14 * 2;
            fArr[i15] = ((i12 - i7) / this.f35375a) * fArr[i15];
            int i16 = i15 + 1;
            fArr[i16] = ((i13 - i7) / this.f35376b) * fArr[i16];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f35379f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f35379f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f35380g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f35380g.position(0);
        String y22 = org.telegram.messenger.g0.y2(null, 2131623943);
        String y23 = org.telegram.messenger.g0.y2(null, 2131623942);
        if (y22 != null && y23 != null) {
            int i17 = 0;
            while (true) {
                if (i17 < 2) {
                    if (i17 == 1) {
                        y23 = "#extension GL_OES_EGL_image_external : require\n" + y23.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = ez.h(35633, y22);
                    int h7 = ez.h(35632, y23);
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
                    obj.f33995a = glCreateProgram;
                    obj.f33996b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f33997c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f33998e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f33999f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f34000g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f34001i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f34002j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f34004l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f34005m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f34003k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i17] = obj;
                    i17++;
                } else {
                    int[] iArr2 = this.f35390r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f35391s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i18 = 0; i18 < 3; i18++) {
                        GLES20.glBindTexture(3553, iArr3[i18]);
                        int i19 = this.f35375a;
                        if (i18 == 2) {
                            i10 = i7 * 2;
                        } else {
                            i10 = 0;
                        }
                        int i20 = i19 + i10;
                        int i21 = this.f35376b;
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
                    this.f35388p = Bitmap.createBitmap(this.f35375a + i22, this.f35376b + i22, Bitmap.Config.ARGB_8888);
                    this.f35387o = ByteBuffer.allocateDirect((i22 + this.f35376b) * (this.f35375a + i22) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f35381i);
        synchronized (this.f35383k) {
            float[] fArr = this.f35382j;
            float[] fArr2 = this.f35381i;
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
