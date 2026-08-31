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
    public FloatBuffer f27430e;
    public FloatBuffer f27431f;
    public FloatBuffer f27432g;
    public boolean h;
    public int f27436l;
    public int f27437m;
    public ByteBuffer f27439o;
    public Bitmap f27440p;
    public boolean f27441q;
    public ba f27444t;
    public int f27427a = 1;
    public int f27428b = 1;
    public int f27429c = 0;
    public final ca[] d = new ca[2];
    public final float[] f27433i = new float[9];
    public final float[] f27434j = new float[16];
    public final Object f27435k = new Object();
    public final Object f27438n = new Object();
    public final int[] f27442r = new int[3];
    public final int[] f27443s = new int[3];
    public final fg f27445u = new fg(this, 13);
    public final Matrix v = new Matrix();

    public final void a(float[] fArr, int i10, int i11, int i12) {
        char c3;
        float f10;
        Object obj;
        if (fArr != null) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        ca caVar = this.d[c3];
        if (caVar != null) {
            GLES20.glBindFramebuffer(36160, this.f27442r[0]);
            GLES20.glViewport(0, 0, this.f27427a, this.f27428b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(caVar.f25890a);
            GLES20.glUniform1i(caVar.f25893e, 0);
            GLES20.glActiveTexture(33984);
            if (c3 != 0) {
                GLES20.glBindTexture(36197, i10);
            } else {
                GLES20.glBindTexture(3553, i10);
            }
            GLES20.glEnableVertexAttribArray(caVar.f25892c);
            GLES20.glVertexAttribPointer(caVar.f25892c, 2, 5126, false, 8, (Buffer) this.f27432g);
            GLES20.glEnableVertexAttribArray(caVar.f25891b);
            GLES20.glVertexAttribPointer(caVar.f25891b, 2, 5126, false, 8, (Buffer) this.f27430e);
            GLES20.glUniform2f(caVar.f25894f, this.f27427a, this.f27428b);
            float f11 = i11;
            float f12 = i12;
            GLES20.glUniform2f(caVar.f25895g, f11, f12);
            GLES20.glUniform1i(caVar.f25897j, 0);
            int i13 = caVar.f25898k;
            float f13 = 1.0f;
            if (c3 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i13, f10);
            if (c3 != 0) {
                GLES20.glUniformMatrix4fv(caVar.f25899l, 1, false, fArr, 0);
            }
            int i14 = caVar.f25900m;
            if (c3 == 0) {
                f13 = 0.0f;
            }
            GLES20.glUniform1f(i14, f13);
            dg.p1.a(caVar.h, this.f27436l);
            dg.p1.a(caVar.f25896i, this.f27437m);
            synchronized (this.f27435k) {
                GLES20.glUniformMatrix4fv(caVar.d, 1, false, this.f27434j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c3 != 0) {
                caVar = this.d[0];
                if (caVar == null) {
                    return;
                }
                GLES20.glUseProgram(caVar.f25890a);
                GLES20.glEnableVertexAttribArray(caVar.f25892c);
                GLES20.glVertexAttribPointer(caVar.f25892c, 2, 5126, false, 8, (Buffer) this.f27432g);
                GLES20.glEnableVertexAttribArray(caVar.f25891b);
                GLES20.glVertexAttribPointer(caVar.f25891b, 2, 5126, false, 8, (Buffer) this.f27430e);
                GLES20.glUniform2f(caVar.f25894f, this.f27427a, this.f27428b);
                GLES20.glUniform2f(caVar.f25895g, f11, f12);
                GLES20.glUniform1i(caVar.f25897j, 0);
                dg.p1.a(caVar.h, this.f27436l);
                dg.p1.a(caVar.f25896i, this.f27437m);
                GLES20.glUniform1f(caVar.f25898k, 0.0f);
                synchronized (this.f27435k) {
                    GLES20.glUniformMatrix4fv(caVar.d, 1, false, this.f27434j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f27442r[1]);
            GLES20.glUniform1i(caVar.f25897j, 1);
            GLES20.glUniform1i(caVar.f25893e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f27443s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f27442r[2]);
            int i15 = this.f27427a;
            int i16 = this.f27429c * 2;
            GLES20.glViewport(0, 0, i15 + i16, i16 + this.f27428b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(caVar.f25891b);
            GLES20.glVertexAttribPointer(caVar.f25891b, 2, 5126, false, 8, (Buffer) this.f27431f);
            GLES20.glUniform1i(caVar.f25897j, 2);
            GLES20.glUniform1i(caVar.f25893e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f27443s[1]);
            ba baVar = this.f27444t;
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
            ByteBuffer byteBuffer = this.f27439o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i17 = this.f27427a;
                int i18 = this.f27429c * 2;
                GLES20.glReadPixels(0, 0, i18 + i17, i18 + this.f27428b, 6408, 5121, this.f27439o);
                synchronized (this.f27438n) {
                    this.f27440p.copyPixelsFromBuffer(this.f27439o);
                    this.f27441q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f27445u);
            AndroidUtilities.runOnUIThread(this.f27445u);
        }
    }

    public final boolean b(float f10, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f27427a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f27428b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f27429c = i10;
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
        this.f27430e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f27430e.position(0);
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i15 * 2;
            fArr[i16] = ((i13 - i10) / this.f27427a) * fArr[i16];
            int i17 = i16 + 1;
            fArr[i17] = ((i14 - i10) / this.f27428b) * fArr[i17];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f27431f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f27431f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f27432g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f27432g.position(0);
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
            int i18 = 0;
            while (true) {
                if (i18 < 2) {
                    if (i18 == 1) {
                        readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = b00.h(35633, readRes);
                    int h9 = b00.h(35632, readRes2);
                    if (h == 0 || h9 == 0) {
                        break;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(glCreateProgram, h);
                    GLES20.glAttachShader(glCreateProgram, h9);
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
                    obj.f25890a = glCreateProgram;
                    obj.f25891b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f25892c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f25893e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f25894f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f25895g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f25896i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f25897j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f25899l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f25900m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f25898k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i18] = obj;
                    i18++;
                } else {
                    int[] iArr2 = this.f27442r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f27443s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i19 = 0; i19 < 3; i19++) {
                        GLES20.glBindTexture(3553, iArr3[i19]);
                        int i20 = this.f27427a;
                        if (i19 == 2) {
                            i11 = i10 * 2;
                        } else {
                            i11 = 0;
                        }
                        int i21 = i20 + i11;
                        int i22 = this.f27428b;
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
                    this.f27440p = Bitmap.createBitmap(this.f27427a + i23, this.f27428b + i23, Bitmap.Config.ARGB_8888);
                    this.f27439o = ByteBuffer.allocateDirect((i23 + this.f27428b) * (this.f27427a + i23) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f27433i);
        synchronized (this.f27435k) {
            float[] fArr = this.f27434j;
            float[] fArr2 = this.f27433i;
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
