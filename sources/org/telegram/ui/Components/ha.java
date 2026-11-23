package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class ha {
    public FloatBuffer f35843e;
    public FloatBuffer f35844f;
    public FloatBuffer f35845g;
    public boolean h;
    public int f35849l;
    public int f35850m;
    public ByteBuffer f35852o;
    public Bitmap f35853p;
    public boolean f35854q;
    public ca f35857t;
    public int f35840a = 1;
    public int f35841b = 1;
    public int f35842c = 0;
    public final da[] d = new da[2];
    public final float[] f35846i = new float[9];
    public final float[] f35847j = new float[16];
    public final Object f35848k = new Object();
    public final Object f35851n = new Object();
    public final int[] f35855r = new int[3];
    public final int[] f35856s = new int[3];
    public final og f35858u = new og(this, 13);
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
        da daVar = this.d[c10];
        if (daVar != null) {
            GLES20.glBindFramebuffer(36160, this.f35855r[0]);
            GLES20.glViewport(0, 0, this.f35840a, this.f35841b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(daVar.f34450a);
            GLES20.glUniform1i(daVar.f34453e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i7);
            } else {
                GLES20.glBindTexture(3553, i7);
            }
            GLES20.glEnableVertexAttribArray(daVar.f34452c);
            GLES20.glVertexAttribPointer(daVar.f34452c, 2, 5126, false, 8, (Buffer) this.f35845g);
            GLES20.glEnableVertexAttribArray(daVar.f34451b);
            GLES20.glVertexAttribPointer(daVar.f34451b, 2, 5126, false, 8, (Buffer) this.f35843e);
            GLES20.glUniform2f(daVar.f34454f, this.f35840a, this.f35841b);
            float f11 = i10;
            float f12 = i11;
            GLES20.glUniform2f(daVar.f34455g, f11, f12);
            GLES20.glUniform1i(daVar.f34457j, 0);
            int i12 = daVar.f34458k;
            float f13 = 1.0f;
            if (c10 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i12, f10);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(daVar.f34459l, 1, false, fArr, 0);
            }
            int i13 = daVar.f34460m;
            if (c10 == 0) {
                f13 = 0.0f;
            }
            GLES20.glUniform1f(i13, f13);
            sg.v0.a(daVar.h, this.f35849l);
            sg.v0.a(daVar.f34456i, this.f35850m);
            synchronized (this.f35848k) {
                GLES20.glUniformMatrix4fv(daVar.d, 1, false, this.f35847j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                daVar = this.d[0];
                if (daVar == null) {
                    return;
                }
                GLES20.glUseProgram(daVar.f34450a);
                GLES20.glEnableVertexAttribArray(daVar.f34452c);
                GLES20.glVertexAttribPointer(daVar.f34452c, 2, 5126, false, 8, (Buffer) this.f35845g);
                GLES20.glEnableVertexAttribArray(daVar.f34451b);
                GLES20.glVertexAttribPointer(daVar.f34451b, 2, 5126, false, 8, (Buffer) this.f35843e);
                GLES20.glUniform2f(daVar.f34454f, this.f35840a, this.f35841b);
                GLES20.glUniform2f(daVar.f34455g, f11, f12);
                GLES20.glUniform1i(daVar.f34457j, 0);
                sg.v0.a(daVar.h, this.f35849l);
                sg.v0.a(daVar.f34456i, this.f35850m);
                GLES20.glUniform1f(daVar.f34458k, 0.0f);
                synchronized (this.f35848k) {
                    GLES20.glUniformMatrix4fv(daVar.d, 1, false, this.f35847j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f35855r[1]);
            GLES20.glUniform1i(daVar.f34457j, 1);
            GLES20.glUniform1i(daVar.f34453e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f35856s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f35855r[2]);
            int i14 = this.f35840a;
            int i15 = this.f35842c * 2;
            GLES20.glViewport(0, 0, i14 + i15, i15 + this.f35841b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(daVar.f34451b);
            GLES20.glVertexAttribPointer(daVar.f34451b, 2, 5126, false, 8, (Buffer) this.f35844f);
            GLES20.glUniform1i(daVar.f34457j, 2);
            GLES20.glUniform1i(daVar.f34453e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f35856s[1]);
            ca caVar = this.f35857t;
            if (caVar != null) {
                obj = caVar.h;
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
            ByteBuffer byteBuffer = this.f35852o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i16 = this.f35840a;
                int i17 = this.f35842c * 2;
                GLES20.glReadPixels(0, 0, i17 + i16, i17 + this.f35841b, 6408, 5121, this.f35852o);
                synchronized (this.f35851n) {
                    this.f35853p.copyPixelsFromBuffer(this.f35852o);
                    this.f35854q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            org.telegram.messenger.g0.r(this.f35858u);
            org.telegram.messenger.g0.g3(this.f35858u);
        }
    }

    public final boolean b(float f10, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f35840a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f35841b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f35842c = i7;
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
        this.f35843e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f35843e.position(0);
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i14 * 2;
            fArr[i15] = ((i12 - i7) / this.f35840a) * fArr[i15];
            int i16 = i15 + 1;
            fArr[i16] = ((i13 - i7) / this.f35841b) * fArr[i16];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f35844f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f35844f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f35845g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f35845g.position(0);
        String y22 = org.telegram.messenger.g0.y2(null, 2131623943);
        String y23 = org.telegram.messenger.g0.y2(null, 2131623942);
        if (y22 != null && y23 != null) {
            int i17 = 0;
            while (true) {
                if (i17 < 2) {
                    if (i17 == 1) {
                        y23 = "#extension GL_OES_EGL_image_external : require\n" + y23.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = hz.h(35633, y22);
                    int h7 = hz.h(35632, y23);
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
                    obj.f34450a = glCreateProgram;
                    obj.f34451b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f34452c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f34453e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f34454f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f34455g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f34456i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f34457j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f34459l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f34460m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f34458k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i17] = obj;
                    i17++;
                } else {
                    int[] iArr2 = this.f35855r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f35856s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i18 = 0; i18 < 3; i18++) {
                        GLES20.glBindTexture(3553, iArr3[i18]);
                        int i19 = this.f35840a;
                        if (i18 == 2) {
                            i10 = i7 * 2;
                        } else {
                            i10 = 0;
                        }
                        int i20 = i19 + i10;
                        int i21 = this.f35841b;
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
                    this.f35853p = Bitmap.createBitmap(this.f35840a + i22, this.f35841b + i22, Bitmap.Config.ARGB_8888);
                    this.f35852o = ByteBuffer.allocateDirect((i22 + this.f35841b) * (this.f35840a + i22) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f35846i);
        synchronized (this.f35848k) {
            float[] fArr = this.f35847j;
            float[] fArr2 = this.f35846i;
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
