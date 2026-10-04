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
public final class qa {
    public FloatBuffer f29980e;
    public FloatBuffer f29981f;
    public FloatBuffer f29982g;
    public boolean h;
    public int f29986l;
    public int f29987m;
    public ByteBuffer f29989o;
    public Bitmap f29990p;
    public boolean f29991q;
    public ka f29994t;
    public int f29977a = 1;
    public int f29978b = 1;
    public int f29979c = 0;
    public final la[] d = new la[2];
    public final float[] f29983i = new float[9];
    public final float[] f29984j = new float[16];
    public final Object f29985k = new Object();
    public final Object f29988n = new Object();
    public final int[] f29992r = new int[3];
    public final int[] f29993s = new int[3];
    public final qg f29995u = new qg(this, 13);
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
        la laVar = this.d[c10];
        if (laVar != null) {
            GLES20.glBindFramebuffer(36160, this.f29992r[0]);
            GLES20.glViewport(0, 0, this.f29977a, this.f29978b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(laVar.f28319a);
            GLES20.glUniform1i(laVar.f28322e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i10);
            } else {
                GLES20.glBindTexture(3553, i10);
            }
            GLES20.glEnableVertexAttribArray(laVar.f28321c);
            GLES20.glVertexAttribPointer(laVar.f28321c, 2, 5126, false, 8, (Buffer) this.f29982g);
            GLES20.glEnableVertexAttribArray(laVar.f28320b);
            GLES20.glVertexAttribPointer(laVar.f28320b, 2, 5126, false, 8, (Buffer) this.f29980e);
            GLES20.glUniform2f(laVar.f28323f, this.f29977a, this.f29978b);
            float f10 = i11;
            float f11 = i12;
            GLES20.glUniform2f(laVar.f28324g, f10, f11);
            GLES20.glUniform1i(laVar.f28326j, 0);
            int i13 = laVar.f28327k;
            float f12 = 1.0f;
            if (c10 != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            GLES20.glUniform1f(i13, f7);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(laVar.f28328l, 1, false, fArr, 0);
            }
            int i14 = laVar.f28329m;
            if (c10 == 0) {
                f12 = 0.0f;
            }
            GLES20.glUniform1f(i14, f12);
            pg.g1.a(laVar.h, this.f29986l);
            pg.g1.a(laVar.f28325i, this.f29987m);
            synchronized (this.f29985k) {
                GLES20.glUniformMatrix4fv(laVar.d, 1, false, this.f29984j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                laVar = this.d[0];
                if (laVar == null) {
                    return;
                }
                GLES20.glUseProgram(laVar.f28319a);
                GLES20.glEnableVertexAttribArray(laVar.f28321c);
                GLES20.glVertexAttribPointer(laVar.f28321c, 2, 5126, false, 8, (Buffer) this.f29982g);
                GLES20.glEnableVertexAttribArray(laVar.f28320b);
                GLES20.glVertexAttribPointer(laVar.f28320b, 2, 5126, false, 8, (Buffer) this.f29980e);
                GLES20.glUniform2f(laVar.f28323f, this.f29977a, this.f29978b);
                GLES20.glUniform2f(laVar.f28324g, f10, f11);
                GLES20.glUniform1i(laVar.f28326j, 0);
                pg.g1.a(laVar.h, this.f29986l);
                pg.g1.a(laVar.f28325i, this.f29987m);
                GLES20.glUniform1f(laVar.f28327k, 0.0f);
                synchronized (this.f29985k) {
                    GLES20.glUniformMatrix4fv(laVar.d, 1, false, this.f29984j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f29992r[1]);
            GLES20.glUniform1i(laVar.f28326j, 1);
            GLES20.glUniform1i(laVar.f28322e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f29993s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f29992r[2]);
            int i15 = this.f29977a;
            int i16 = this.f29979c * 2;
            GLES20.glViewport(0, 0, i15 + i16, i16 + this.f29978b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(laVar.f28320b);
            GLES20.glVertexAttribPointer(laVar.f28320b, 2, 5126, false, 8, (Buffer) this.f29981f);
            GLES20.glUniform1i(laVar.f28326j, 2);
            GLES20.glUniform1i(laVar.f28322e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f29993s[1]);
            ka kaVar = this.f29994t;
            if (kaVar != null) {
                obj = kaVar.h;
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
            ByteBuffer byteBuffer = this.f29989o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i17 = this.f29977a;
                int i18 = this.f29979c * 2;
                GLES20.glReadPixels(0, 0, i18 + i17, i18 + this.f29978b, 6408, 5121, this.f29989o);
                synchronized (this.f29988n) {
                    this.f29990p.copyPixelsFromBuffer(this.f29989o);
                    this.f29991q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f29995u);
            AndroidUtilities.runOnUIThread(this.f29995u);
        }
    }

    public final boolean b(float f7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f29977a = (int) Math.round(Math.sqrt(f7 * 324.0f));
        this.f29978b = (int) Math.round(Math.sqrt(324.0f / f7));
        this.f29979c = i10;
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
        this.f29980e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f29980e.position(0);
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i15 * 2;
            fArr[i16] = ((i13 - i10) / this.f29977a) * fArr[i16];
            int i17 = i16 + 1;
            fArr[i17] = ((i14 - i10) / this.f29978b) * fArr[i17];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f29981f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f29981f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f29982g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f29982g.position(0);
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
            int i18 = 0;
            while (true) {
                if (i18 < 2) {
                    if (i18 == 1) {
                        readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = c00.h(35633, readRes);
                    int h10 = c00.h(35632, readRes2);
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
                    obj.f28319a = glCreateProgram;
                    obj.f28320b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f28321c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f28322e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f28323f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f28324g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f28325i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f28326j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f28328l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f28329m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f28327k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i18] = obj;
                    i18++;
                } else {
                    int[] iArr2 = this.f29992r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f29993s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i19 = 0; i19 < 3; i19++) {
                        GLES20.glBindTexture(3553, iArr3[i19]);
                        int i20 = this.f29977a;
                        if (i19 == 2) {
                            i11 = i10 * 2;
                        } else {
                            i11 = 0;
                        }
                        int i21 = i20 + i11;
                        int i22 = this.f29978b;
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
                    this.f29990p = Bitmap.createBitmap(this.f29977a + i23, this.f29978b + i23, Bitmap.Config.ARGB_8888);
                    this.f29989o = ByteBuffer.allocateDirect((i23 + this.f29978b) * (this.f29977a + i23) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f29983i);
        synchronized (this.f29985k) {
            float[] fArr = this.f29984j;
            float[] fArr2 = this.f29983i;
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
