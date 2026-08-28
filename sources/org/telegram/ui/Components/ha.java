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
public final class ha {
    public FloatBuffer f29007e;
    public FloatBuffer f29008f;
    public FloatBuffer f29009g;
    public boolean h;
    public int f29013l;
    public int f29014m;
    public ByteBuffer f29016o;
    public Bitmap f29017p;
    public boolean f29018q;
    public ba f29021t;
    public int f29004a = 1;
    public int f29005b = 1;
    public int f29006c = 0;
    public final ca[] d = new ca[2];
    public final float[] f29010i = new float[9];
    public final float[] f29011j = new float[16];
    public final Object f29012k = new Object();
    public final Object f29015n = new Object();
    public final int[] f29019r = new int[3];
    public final int[] f29020s = new int[3];
    public final fg f29022u = new fg(this, 13);
    public final Matrix v = new Matrix();

    public final void a(float[] fArr, int i9, int i10, int i11) {
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
            GLES20.glBindFramebuffer(36160, this.f29019r[0]);
            GLES20.glViewport(0, 0, this.f29004a, this.f29005b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(caVar.f27430a);
            GLES20.glUniform1i(caVar.f27433e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i9);
            } else {
                GLES20.glBindTexture(3553, i9);
            }
            GLES20.glEnableVertexAttribArray(caVar.f27432c);
            GLES20.glVertexAttribPointer(caVar.f27432c, 2, 5126, false, 8, (Buffer) this.f29009g);
            GLES20.glEnableVertexAttribArray(caVar.f27431b);
            GLES20.glVertexAttribPointer(caVar.f27431b, 2, 5126, false, 8, (Buffer) this.f29007e);
            GLES20.glUniform2f(caVar.f27434f, this.f29004a, this.f29005b);
            float f11 = i10;
            float f12 = i11;
            GLES20.glUniform2f(caVar.f27435g, f11, f12);
            GLES20.glUniform1i(caVar.f27437j, 0);
            int i12 = caVar.f27438k;
            float f13 = 1.0f;
            if (c10 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i12, f10);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(caVar.f27439l, 1, false, fArr, 0);
            }
            int i13 = caVar.f27440m;
            if (c10 == 0) {
                f13 = 0.0f;
            }
            GLES20.glUniform1f(i13, f13);
            xf.d1.a(caVar.h, this.f29013l);
            xf.d1.a(caVar.f27436i, this.f29014m);
            synchronized (this.f29012k) {
                GLES20.glUniformMatrix4fv(caVar.d, 1, false, this.f29011j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                caVar = this.d[0];
                if (caVar == null) {
                    return;
                }
                GLES20.glUseProgram(caVar.f27430a);
                GLES20.glEnableVertexAttribArray(caVar.f27432c);
                GLES20.glVertexAttribPointer(caVar.f27432c, 2, 5126, false, 8, (Buffer) this.f29009g);
                GLES20.glEnableVertexAttribArray(caVar.f27431b);
                GLES20.glVertexAttribPointer(caVar.f27431b, 2, 5126, false, 8, (Buffer) this.f29007e);
                GLES20.glUniform2f(caVar.f27434f, this.f29004a, this.f29005b);
                GLES20.glUniform2f(caVar.f27435g, f11, f12);
                GLES20.glUniform1i(caVar.f27437j, 0);
                xf.d1.a(caVar.h, this.f29013l);
                xf.d1.a(caVar.f27436i, this.f29014m);
                GLES20.glUniform1f(caVar.f27438k, 0.0f);
                synchronized (this.f29012k) {
                    GLES20.glUniformMatrix4fv(caVar.d, 1, false, this.f29011j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f29019r[1]);
            GLES20.glUniform1i(caVar.f27437j, 1);
            GLES20.glUniform1i(caVar.f27433e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f29020s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f29019r[2]);
            int i14 = this.f29004a;
            int i15 = this.f29006c * 2;
            GLES20.glViewport(0, 0, i14 + i15, i15 + this.f29005b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(caVar.f27431b);
            GLES20.glVertexAttribPointer(caVar.f27431b, 2, 5126, false, 8, (Buffer) this.f29008f);
            GLES20.glUniform1i(caVar.f27437j, 2);
            GLES20.glUniform1i(caVar.f27433e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f29020s[1]);
            ba baVar = this.f29021t;
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
            ByteBuffer byteBuffer = this.f29016o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i16 = this.f29004a;
                int i17 = this.f29006c * 2;
                GLES20.glReadPixels(0, 0, i17 + i16, i17 + this.f29005b, 6408, 5121, this.f29016o);
                synchronized (this.f29015n) {
                    this.f29017p.copyPixelsFromBuffer(this.f29016o);
                    this.f29018q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f29022u);
            AndroidUtilities.runOnUIThread(this.f29022u);
        }
    }

    public final boolean b(float f10, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f29004a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f29005b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f29006c = i9;
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
        this.f29007e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f29007e.position(0);
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i14 * 2;
            fArr[i15] = ((i12 - i9) / this.f29004a) * fArr[i15];
            int i16 = i15 + 1;
            fArr[i16] = ((i13 - i9) / this.f29005b) * fArr[i16];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f29008f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f29008f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f29009g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f29009g.position(0);
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
            int i17 = 0;
            while (true) {
                if (i17 < 2) {
                    if (i17 == 1) {
                        readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = lz.h(35633, readRes);
                    int h10 = lz.h(35632, readRes2);
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
                    obj.f27430a = glCreateProgram;
                    obj.f27431b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f27432c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f27433e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f27434f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f27435g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f27436i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f27437j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f27439l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f27440m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f27438k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i17] = obj;
                    i17++;
                } else {
                    int[] iArr2 = this.f29019r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f29020s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i18 = 0; i18 < 3; i18++) {
                        GLES20.glBindTexture(3553, iArr3[i18]);
                        int i19 = this.f29004a;
                        if (i18 == 2) {
                            i10 = i9 * 2;
                        } else {
                            i10 = 0;
                        }
                        int i20 = i19 + i10;
                        int i21 = this.f29005b;
                        if (i18 == 2) {
                            i11 = i9 * 2;
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
                    int i22 = i9 * 2;
                    this.f29017p = Bitmap.createBitmap(this.f29004a + i22, this.f29005b + i22, Bitmap.Config.ARGB_8888);
                    this.f29016o = ByteBuffer.allocateDirect((i22 + this.f29005b) * (this.f29004a + i22) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f29010i);
        synchronized (this.f29012k) {
            float[] fArr = this.f29011j;
            float[] fArr2 = this.f29010i;
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
