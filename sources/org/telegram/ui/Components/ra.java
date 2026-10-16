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
public final class ra {
    public FloatBuffer e;
    public FloatBuffer f28474f;
    public FloatBuffer f28475g;
    public boolean h;
    public int f28479l;
    public int f28480m;
    public ByteBuffer f28482o;
    public Bitmap f28483p;
    public boolean f28484q;
    public la f28487t;
    public int f28471a = 1;
    public int f28472b = 1;
    public int f28473c = 0;
    public final ma[] d = new ma[2];
    public final float[] f28476i = new float[9];
    public final float[] f28477j = new float[16];
    public final Object f28478k = new Object();
    public final Object f28481n = new Object();
    public final int[] f28485r = new int[3];
    public final int[] f28486s = new int[3];
    public final qg f28488u = new qg(this, 13);
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
        ma maVar = this.d[c10];
        if (maVar != null) {
            GLES20.glBindFramebuffer(36160, this.f28485r[0]);
            GLES20.glViewport(0, 0, this.f28471a, this.f28472b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(maVar.f27050a);
            GLES20.glUniform1i(maVar.e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i10);
            } else {
                GLES20.glBindTexture(3553, i10);
            }
            GLES20.glEnableVertexAttribArray(maVar.f27052c);
            GLES20.glVertexAttribPointer(maVar.f27052c, 2, 5126, false, 8, (Buffer) this.f28475g);
            GLES20.glEnableVertexAttribArray(maVar.f27051b);
            GLES20.glVertexAttribPointer(maVar.f27051b, 2, 5126, false, 8, (Buffer) this.e);
            GLES20.glUniform2f(maVar.f27053f, this.f28471a, this.f28472b);
            float f10 = i11;
            float f11 = i12;
            GLES20.glUniform2f(maVar.f27054g, f10, f11);
            GLES20.glUniform1i(maVar.f27056j, 0);
            int i13 = maVar.f27057k;
            float f12 = 1.0f;
            if (c10 != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            GLES20.glUniform1f(i13, f7);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(maVar.f27058l, 1, false, fArr, 0);
            }
            int i14 = maVar.f27059m;
            if (c10 == 0) {
                f12 = 0.0f;
            }
            GLES20.glUniform1f(i14, f12);
            qg.d1.a(maVar.h, this.f28479l);
            qg.d1.a(maVar.f27055i, this.f28480m);
            synchronized (this.f28478k) {
                GLES20.glUniformMatrix4fv(maVar.d, 1, false, this.f28477j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                maVar = this.d[0];
                if (maVar == null) {
                    return;
                }
                GLES20.glUseProgram(maVar.f27050a);
                GLES20.glEnableVertexAttribArray(maVar.f27052c);
                GLES20.glVertexAttribPointer(maVar.f27052c, 2, 5126, false, 8, (Buffer) this.f28475g);
                GLES20.glEnableVertexAttribArray(maVar.f27051b);
                GLES20.glVertexAttribPointer(maVar.f27051b, 2, 5126, false, 8, (Buffer) this.e);
                GLES20.glUniform2f(maVar.f27053f, this.f28471a, this.f28472b);
                GLES20.glUniform2f(maVar.f27054g, f10, f11);
                GLES20.glUniform1i(maVar.f27056j, 0);
                qg.d1.a(maVar.h, this.f28479l);
                qg.d1.a(maVar.f27055i, this.f28480m);
                GLES20.glUniform1f(maVar.f27057k, 0.0f);
                synchronized (this.f28478k) {
                    GLES20.glUniformMatrix4fv(maVar.d, 1, false, this.f28477j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f28485r[1]);
            GLES20.glUniform1i(maVar.f27056j, 1);
            GLES20.glUniform1i(maVar.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f28486s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f28485r[2]);
            int i15 = this.f28471a;
            int i16 = this.f28473c * 2;
            GLES20.glViewport(0, 0, i15 + i16, i16 + this.f28472b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(maVar.f27051b);
            GLES20.glVertexAttribPointer(maVar.f27051b, 2, 5126, false, 8, (Buffer) this.f28474f);
            GLES20.glUniform1i(maVar.f27056j, 2);
            GLES20.glUniform1i(maVar.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f28486s[1]);
            la laVar = this.f28487t;
            if (laVar != null) {
                obj = laVar.h;
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
            ByteBuffer byteBuffer = this.f28482o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i17 = this.f28471a;
                int i18 = this.f28473c * 2;
                GLES20.glReadPixels(0, 0, i18 + i17, i18 + this.f28472b, 6408, 5121, this.f28482o);
                synchronized (this.f28481n) {
                    this.f28483p.copyPixelsFromBuffer(this.f28482o);
                    this.f28484q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f28488u);
            AndroidUtilities.runOnUIThread(this.f28488u);
        }
    }

    public final boolean b(float f7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f28471a = (int) Math.round(Math.sqrt(f7 * 324.0f));
        this.f28472b = (int) Math.round(Math.sqrt(324.0f / f7));
        this.f28473c = i10;
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
            fArr[i16] = ((i13 - i10) / this.f28471a) * fArr[i16];
            int i17 = i16 + 1;
            fArr[i17] = ((i14 - i10) / this.f28472b) * fArr[i17];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f28474f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f28474f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f28475g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f28475g.position(0);
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
            int i18 = 0;
            while (true) {
                if (i18 < 2) {
                    if (i18 == 1) {
                        readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = l00.h(35633, readRes);
                    int h10 = l00.h(35632, readRes2);
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
                    obj.f27050a = glCreateProgram;
                    obj.f27051b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f27052c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f27053f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f27054g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f27055i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f27056j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f27058l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f27059m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f27057k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i18] = obj;
                    i18++;
                } else {
                    int[] iArr2 = this.f28485r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f28486s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i19 = 0; i19 < 3; i19++) {
                        GLES20.glBindTexture(3553, iArr3[i19]);
                        int i20 = this.f28471a;
                        if (i19 == 2) {
                            i11 = i10 * 2;
                        } else {
                            i11 = 0;
                        }
                        int i21 = i20 + i11;
                        int i22 = this.f28472b;
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
                    this.f28483p = Bitmap.createBitmap(this.f28471a + i23, this.f28472b + i23, Bitmap.Config.ARGB_8888);
                    this.f28482o = ByteBuffer.allocateDirect((i23 + this.f28472b) * (this.f28471a + i23) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f28476i);
        synchronized (this.f28478k) {
            float[] fArr = this.f28477j;
            float[] fArr2 = this.f28476i;
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
