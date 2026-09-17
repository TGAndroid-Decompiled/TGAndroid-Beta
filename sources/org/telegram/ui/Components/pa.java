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
public final class pa {
    public FloatBuffer f29355e;
    public FloatBuffer f29356f;
    public FloatBuffer f29357g;
    public boolean h;
    public int f29361l;
    public int f29362m;
    public ByteBuffer f29364o;
    public Bitmap f29365p;
    public boolean f29366q;
    public ja f29369t;
    public int f29352a = 1;
    public int f29353b = 1;
    public int f29354c = 0;
    public final ka[] d = new ka[2];
    public final float[] f29358i = new float[9];
    public final float[] f29359j = new float[16];
    public final Object f29360k = new Object();
    public final Object f29363n = new Object();
    public final int[] f29367r = new int[3];
    public final int[] f29368s = new int[3];
    public final pg f29370u = new pg(this, 13);
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
        ka kaVar = this.d[c10];
        if (kaVar != null) {
            GLES20.glBindFramebuffer(36160, this.f29367r[0]);
            GLES20.glViewport(0, 0, this.f29352a, this.f29353b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(kaVar.f27811a);
            GLES20.glUniform1i(kaVar.f27814e, 0);
            GLES20.glActiveTexture(33984);
            if (c10 != 0) {
                GLES20.glBindTexture(36197, i10);
            } else {
                GLES20.glBindTexture(3553, i10);
            }
            GLES20.glEnableVertexAttribArray(kaVar.f27813c);
            GLES20.glVertexAttribPointer(kaVar.f27813c, 2, 5126, false, 8, (Buffer) this.f29357g);
            GLES20.glEnableVertexAttribArray(kaVar.f27812b);
            GLES20.glVertexAttribPointer(kaVar.f27812b, 2, 5126, false, 8, (Buffer) this.f29355e);
            GLES20.glUniform2f(kaVar.f27815f, this.f29352a, this.f29353b);
            float f10 = i11;
            float f11 = i12;
            GLES20.glUniform2f(kaVar.f27816g, f10, f11);
            GLES20.glUniform1i(kaVar.f27818j, 0);
            int i13 = kaVar.f27819k;
            float f12 = 1.0f;
            if (c10 != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            GLES20.glUniform1f(i13, f7);
            if (c10 != 0) {
                GLES20.glUniformMatrix4fv(kaVar.f27820l, 1, false, fArr, 0);
            }
            int i14 = kaVar.f27821m;
            if (c10 == 0) {
                f12 = 0.0f;
            }
            GLES20.glUniform1f(i14, f12);
            qg.d1.a(kaVar.h, this.f29361l);
            qg.d1.a(kaVar.f27817i, this.f29362m);
            synchronized (this.f29360k) {
                GLES20.glUniformMatrix4fv(kaVar.d, 1, false, this.f29359j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c10 != 0) {
                kaVar = this.d[0];
                if (kaVar == null) {
                    return;
                }
                GLES20.glUseProgram(kaVar.f27811a);
                GLES20.glEnableVertexAttribArray(kaVar.f27813c);
                GLES20.glVertexAttribPointer(kaVar.f27813c, 2, 5126, false, 8, (Buffer) this.f29357g);
                GLES20.glEnableVertexAttribArray(kaVar.f27812b);
                GLES20.glVertexAttribPointer(kaVar.f27812b, 2, 5126, false, 8, (Buffer) this.f29355e);
                GLES20.glUniform2f(kaVar.f27815f, this.f29352a, this.f29353b);
                GLES20.glUniform2f(kaVar.f27816g, f10, f11);
                GLES20.glUniform1i(kaVar.f27818j, 0);
                qg.d1.a(kaVar.h, this.f29361l);
                qg.d1.a(kaVar.f27817i, this.f29362m);
                GLES20.glUniform1f(kaVar.f27819k, 0.0f);
                synchronized (this.f29360k) {
                    GLES20.glUniformMatrix4fv(kaVar.d, 1, false, this.f29359j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.f29367r[1]);
            GLES20.glUniform1i(kaVar.f27818j, 1);
            GLES20.glUniform1i(kaVar.f27814e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f29368s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f29367r[2]);
            int i15 = this.f29352a;
            int i16 = this.f29354c * 2;
            GLES20.glViewport(0, 0, i15 + i16, i16 + this.f29353b);
            GLES20.glClear(16384);
            GLES20.glEnableVertexAttribArray(kaVar.f27812b);
            GLES20.glVertexAttribPointer(kaVar.f27812b, 2, 5126, false, 8, (Buffer) this.f29356f);
            GLES20.glUniform1i(kaVar.f27818j, 2);
            GLES20.glUniform1i(kaVar.f27814e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f29368s[1]);
            ja jaVar = this.f29369t;
            if (jaVar != null) {
                obj = jaVar.h;
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
            ByteBuffer byteBuffer = this.f29364o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i17 = this.f29352a;
                int i18 = this.f29354c * 2;
                GLES20.glReadPixels(0, 0, i18 + i17, i18 + this.f29353b, 6408, 5121, this.f29364o);
                synchronized (this.f29363n) {
                    this.f29365p.copyPixelsFromBuffer(this.f29364o);
                    this.f29366q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f29370u);
            AndroidUtilities.runOnUIThread(this.f29370u);
        }
    }

    public final boolean b(float f7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f29352a = (int) Math.round(Math.sqrt(f7 * 324.0f));
        this.f29353b = (int) Math.round(Math.sqrt(324.0f / f7));
        this.f29354c = i10;
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
        this.f29355e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f29355e.position(0);
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i15 * 2;
            fArr[i16] = ((i13 - i10) / this.f29352a) * fArr[i16];
            int i17 = i16 + 1;
            fArr[i17] = ((i14 - i10) / this.f29353b) * fArr[i17];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f29356f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f29356f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f29357g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f29357g.position(0);
        String readRes = AndroidUtilities.readRes(R.raw.blur_vrt);
        String readRes2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (readRes != null && readRes2 != null) {
            int i18 = 0;
            while (true) {
                if (i18 < 2) {
                    if (i18 == 1) {
                        readRes2 = "#extension GL_OES_EGL_image_external : require\n" + readRes2.replace("sampler2D tex", "samplerExternalOES tex");
                    }
                    int h = zz.h(35633, readRes);
                    int h10 = zz.h(35632, readRes2);
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
                    obj.f27811a = glCreateProgram;
                    obj.f27812b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                    obj.f27813c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                    obj.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                    obj.f27814e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                    obj.f27815f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                    obj.f27816g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                    obj.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                    obj.f27817i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                    obj.f27818j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                    obj.f27820l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                    obj.f27821m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                    obj.f27819k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                    this.d[i18] = obj;
                    i18++;
                } else {
                    int[] iArr2 = this.f29367r;
                    GLES20.glGenFramebuffers(3, iArr2, 0);
                    int[] iArr3 = this.f29368s;
                    GLES20.glGenTextures(3, iArr3, 0);
                    for (int i19 = 0; i19 < 3; i19++) {
                        GLES20.glBindTexture(3553, iArr3[i19]);
                        int i20 = this.f29352a;
                        if (i19 == 2) {
                            i11 = i10 * 2;
                        } else {
                            i11 = 0;
                        }
                        int i21 = i20 + i11;
                        int i22 = this.f29353b;
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
                    this.f29365p = Bitmap.createBitmap(this.f29352a + i23, this.f29353b + i23, Bitmap.Config.ARGB_8888);
                    this.f29364o = ByteBuffer.allocateDirect((i23 + this.f29353b) * (this.f29352a + i23) * 4);
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f29358i);
        synchronized (this.f29360k) {
            float[] fArr = this.f29359j;
            float[] fArr2 = this.f29358i;
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
