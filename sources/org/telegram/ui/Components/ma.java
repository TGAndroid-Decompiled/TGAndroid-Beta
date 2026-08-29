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
public final class ma {
    public FloatBuffer f30612e;
    public FloatBuffer f30613f;
    public FloatBuffer f30614g;
    public boolean h;
    public int f30618l;
    public int f30619m;
    public ByteBuffer f30621o;
    public Bitmap f30622p;
    public boolean f30623q;
    public ga f30626t;
    public int f30609a = 1;
    public int f30610b = 1;
    public int f30611c = 0;
    public final ha[] d = new ha[2];
    public final float[] f30615i = new float[9];
    public final float[] f30616j = new float[16];
    public final Object f30617k = new Object();
    public final Object f30620n = new Object();
    public final int[] f30624r = new int[3];
    public final int[] f30625s = new int[3];
    public final ig f30627u = new ig(this, 13);
    public final Matrix v = new Matrix();

    public final void a(float[] fArr, int i10, int i11, int i12) {
        char c3;
        float f9;
        Object obj;
        if (fArr != null) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        ha haVar = this.d[c3];
        if (haVar != null) {
            GLES20.glBindFramebuffer(36160, this.f30624r[0]);
            GLES20.glViewport(0, 0, this.f30609a, this.f30610b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(haVar.f29147a);
            GLES20.glUniform1i(haVar.f29150e, 0);
            GLES20.glActiveTexture(33984);
            if (c3 != 0) {
                GLES20.glBindTexture(36197, i10);
            } else {
                GLES20.glBindTexture(3553, i10);
            }
            GLES20.glEnableVertexAttribArray(haVar.f29149c);
            GLES20.glVertexAttribPointer(haVar.f29149c, 2, 5126, false, 8, (Buffer) this.f30614g);
            GLES20.glEnableVertexAttribArray(haVar.f29148b);
            GLES20.glVertexAttribPointer(haVar.f29148b, 2, 5126, false, 8, (Buffer) this.f30612e);
            GLES20.glUniform2f(haVar.f29151f, this.f30609a, this.f30610b);
            float f10 = i11;
            float f11 = i12;
            GLES20.glUniform2f(haVar.f29152g, f10, f11);
            GLES20.glUniform1i(haVar.f29154j, 0);
            int i13 = haVar.f29155k;
            float f12 = 1.0f;
            if (c3 != 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            GLES20.glUniform1f(i13, f9);
            if (c3 != 0) {
                GLES20.glUniformMatrix4fv(haVar.f29156l, 1, false, fArr, 0);
            }
            int i14 = haVar.f29157m;
            if (c3 == 0) {
                f12 = 0.0f;
            }
            GLES20.glUniform1f(i14, f12);
            ag.u1.a(haVar.h, this.f30618l);
            ag.u1.a(haVar.f29153i, this.f30619m);
            synchronized (this.f30617k) {
                GLES20.glUniformMatrix4fv(haVar.d, 1, false, this.f30616j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c3 != 0) {
                haVar = this.d[0];
                if (haVar == null) {
                    return;
                }
                GLES20.glUseProgram(haVar.f29147a);
                GLES20.glEnableVertexAttribArray(haVar.f29149c);
                GLES20.glVertexAttribPointer(haVar.f29149c, 2, 5126, false, 8, (Buffer) this.f30614g);
                GLES20.glEnableVertexAttribArray(haVar.f29148b);
                GLES20.glVertexAttribPointer(haVar.f29148b, 2, 5126, false, 8, (Buffer) this.f30612e);
                GLES20.glUniform2f(haVar.f29151f, this.f30609a, this.f30610b);
                GLES20.glUniform2f(haVar.f29152g, f10, f11);
                GLES20.glUniform1i(haVar.f29154j, 0);
                ag.u1.a(haVar.h, this.f30618l);
                ag.u1.a(haVar.f29153i, this.f30619m);
                GLES20.glUniform1f(haVar.f29155k, 0.0f);
                synchronized (this.f30617k) {
                    GLES20.glUniformMatrix4fv(haVar.d, 1, false, this.f30616j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f30624r[1]);
            GLES20.glUniform1i(haVar.f29154j, 1);
            GLES20.glUniform1i(haVar.f29150e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f30625s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f30624r[2]);
            int i15 = this.f30609a;
            int i16 = this.f30611c * 2;
            GLES20.glViewport(0, 0, i15 + i16, i16 + this.f30610b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(haVar.f29148b);
            GLES20.glVertexAttribPointer(haVar.f29148b, 2, 5126, false, 8, (Buffer) this.f30613f);
            GLES20.glUniform1i(haVar.f29154j, 2);
            GLES20.glUniform1i(haVar.f29150e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f30625s[1]);
            ga gaVar = this.f30626t;
            if (gaVar != null) {
                obj = gaVar.h;
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
            ByteBuffer byteBuffer = this.f30621o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i17 = this.f30609a;
                int i18 = this.f30611c * 2;
                GLES20.glReadPixels(0, 0, i18 + i17, i18 + this.f30610b, 6408, 5121, this.f30621o);
                synchronized (this.f30620n) {
                    this.f30622p.copyPixelsFromBuffer(this.f30621o);
                    this.f30623q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f30627u);
            AndroidUtilities.runOnUIThread(this.f30627u);
        }
    }

    public final boolean b(float f9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f30609a = (int) Math.round(Math.sqrt(f9 * 324.0f));
        this.f30610b = (int) Math.round(Math.sqrt(324.0f / f9));
        this.f30611c = i10;
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
        this.f30612e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f30612e.position(0);
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i15 * 2;
            fArr[i16] = ((i13 - i10) / this.f30609a) * fArr[i16];
            int i17 = i16 + 1;
            fArr[i17] = ((i14 - i10) / this.f30610b) * fArr[i17];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f30613f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f30613f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f30614g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f30614g.position(0);
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
            int i18 = 0;
            while (true) {
                if (i18 < 2) {
                    if (i18 == 1) {
                        readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = uz.h(35633, readRes);
                    int h10 = uz.h(35632, readRes2);
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
                    obj.f29147a = glCreateProgram;
                    obj.f29148b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f29149c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f29150e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f29151f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f29152g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f29153i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f29154j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f29156l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f29157m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f29155k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i18] = obj;
                    i18++;
                } else {
                    int[] iArr2 = this.f30624r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f30625s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i19 = 0; i19 < 3; i19++) {
                        GLES20.glBindTexture(3553, iArr3[i19]);
                        int i20 = this.f30609a;
                        if (i19 == 2) {
                            i11 = i10 * 2;
                        } else {
                            i11 = 0;
                        }
                        int i21 = i20 + i11;
                        int i22 = this.f30610b;
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
                    this.f30622p = Bitmap.createBitmap(this.f30609a + i23, this.f30610b + i23, Bitmap.Config.ARGB_8888);
                    this.f30621o = ByteBuffer.allocateDirect((i23 + this.f30610b) * (this.f30609a + i23) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f30615i);
        synchronized (this.f30617k) {
            float[] fArr = this.f30616j;
            float[] fArr2 = this.f30615i;
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
