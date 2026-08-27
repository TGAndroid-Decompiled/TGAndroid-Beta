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

public final class fa {

    public FloatBuffer f28321e;

    public FloatBuffer f28322f;

    public FloatBuffer f28323g;
    public boolean h;

    public int f28327l;

    public int f28328m;

    public ByteBuffer f28330o;

    public Bitmap f28331p;

    public boolean f28332q;

    public z9 f28335t;

    public int f28318a = 1;

    public int f28319b = 1;

    public int f28320c = 0;
    public final aa[] d = new aa[2];

    public final float[] f28324i = new float[9];

    public final float[] f28325j = new float[16];

    public final Object f28326k = new Object();

    public final Object f28329n = new Object();

    public final int[] f28333r = new int[3];

    public final int[] f28334s = new int[3];

    public final bg f28336u = new bg(this, 13);
    public final Matrix v = new Matrix();

    public final void a(float[] fArr, int i10, int i11, int i12) {
        char c10 = fArr != null ? (char) 1 : (char) 0;
        aa aaVar = this.d[c10];
        if (aaVar == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.f28333r[0]);
        GLES20.glViewport(0, 0, this.f28318a, this.f28319b);
        GLES20.glClear(16384);
        GLES20.glUseProgram(aaVar.f26688a);
        GLES20.glUniform1i(aaVar.f26691e, 0);
        GLES20.glActiveTexture(33984);
        if (c10 != 0) {
            GLES20.glBindTexture(36197, i10);
        } else {
            GLES20.glBindTexture(3553, i10);
        }
        GLES20.glEnableVertexAttribArray(aaVar.f26690c);
        GLES20.glVertexAttribPointer(aaVar.f26690c, 2, 5126, false, 8, (Buffer) this.f28323g);
        GLES20.glEnableVertexAttribArray(aaVar.f26689b);
        GLES20.glVertexAttribPointer(aaVar.f26689b, 2, 5126, false, 8, (Buffer) this.f28321e);
        GLES20.glUniform2f(aaVar.f26692f, this.f28318a, this.f28319b);
        float f10 = i11;
        float f11 = i12;
        GLES20.glUniform2f(aaVar.f26693g, f10, f11);
        GLES20.glUniform1i(aaVar.f26695j, 0);
        GLES20.glUniform1f(aaVar.f26696k, c10 != 0 ? 1.0f : 0.0f);
        if (c10 != 0) {
            GLES20.glUniformMatrix4fv(aaVar.f26697l, 1, false, fArr, 0);
        }
        GLES20.glUniform1f(aaVar.f26698m, c10 == 0 ? 0.0f : 1.0f);
        yf.c1.a(aaVar.h, this.f28327l);
        yf.c1.a(aaVar.f26694i, this.f28328m);
        synchronized (this.f28326k) {
            GLES20.glUniformMatrix4fv(aaVar.d, 1, false, this.f28325j, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        if (c10 != 0) {
            aaVar = this.d[0];
            if (aaVar == null) {
                return;
            }
            GLES20.glUseProgram(aaVar.f26688a);
            GLES20.glEnableVertexAttribArray(aaVar.f26690c);
            GLES20.glVertexAttribPointer(aaVar.f26690c, 2, 5126, false, 8, (Buffer) this.f28323g);
            GLES20.glEnableVertexAttribArray(aaVar.f26689b);
            GLES20.glVertexAttribPointer(aaVar.f26689b, 2, 5126, false, 8, (Buffer) this.f28321e);
            GLES20.glUniform2f(aaVar.f26692f, this.f28318a, this.f28319b);
            GLES20.glUniform2f(aaVar.f26693g, f10, f11);
            GLES20.glUniform1i(aaVar.f26695j, 0);
            yf.c1.a(aaVar.h, this.f28327l);
            yf.c1.a(aaVar.f26694i, this.f28328m);
            GLES20.glUniform1f(aaVar.f26696k, 0.0f);
            synchronized (this.f28326k) {
                GLES20.glUniformMatrix4fv(aaVar.d, 1, false, this.f28325j, 0);
            }
        }
        GLES20.glBindFramebuffer(36160, this.f28333r[1]);
        GLES20.glUniform1i(aaVar.f26695j, 1);
        GLES20.glUniform1i(aaVar.f26691e, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f28334s[0]);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, this.f28333r[2]);
        int i13 = this.f28318a;
        int i14 = this.f28320c * 2;
        GLES20.glViewport(0, 0, i13 + i14, i14 + this.f28319b);
        GLES20.glClear(16384);
        GLES20.glEnableVertexAttribArray(aaVar.f26689b);
        GLES20.glVertexAttribPointer(aaVar.f26689b, 2, 5126, false, 8, (Buffer) this.f28322f);
        GLES20.glUniform1i(aaVar.f26695j, 2);
        GLES20.glUniform1i(aaVar.f26691e, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f28334s[1]);
        z9 z9Var = this.f28335t;
        Object obj = z9Var != null ? z9Var.h : null;
        if (obj != null) {
            synchronized (obj) {
                GLES20.glDrawArrays(5, 0, 4);
            }
        } else {
            GLES20.glDrawArrays(5, 0, 4);
        }
        ByteBuffer byteBuffer = this.f28330o;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            int i15 = this.f28318a;
            int i16 = this.f28320c * 2;
            GLES20.glReadPixels(0, 0, i16 + i15, i16 + this.f28319b, 6408, 5121, this.f28330o);
            synchronized (this.f28329n) {
                this.f28331p.copyPixelsFromBuffer(this.f28330o);
                this.f28332q = true;
            }
            GLES20.glBindFramebuffer(36160, 0);
        }
        AndroidUtilities.cancelRunOnUIThread(this.f28336u);
        AndroidUtilities.runOnUIThread(this.f28336u);
    }

    public final boolean b(float f10, int i10) {
        this.f28318a = (int) Math.round(Math.sqrt(f10 * 324.0f));
        this.f28319b = (int) Math.round(Math.sqrt(324.0f / f10));
        this.f28320c = i10;
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
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f28321e = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f28321e.position(0);
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 * 2;
            float f13 = fArr[i12];
            int i13 = this.f28318a;
            fArr[i12] = ((i13 - i10) / i13) * f13;
            int i14 = i12 + 1;
            float f14 = fArr[i14];
            int i15 = this.f28319b;
            fArr[i14] = ((i15 - i10) / i15) * f14;
        }
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.f28322f = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr);
        this.f28322f.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer3 = byteBufferAllocateDirect3.asFloatBuffer();
        this.f28323g = floatBufferAsFloatBuffer3;
        floatBufferAsFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f28323g.position(0);
        String res = AndroidUtilities.readRes(R.raw.blur_vrt);
        String res2 = AndroidUtilities.readRes(R.raw.blur_frg);
        if (res != null && res2 != null) {
            for (int i16 = 0; i16 < 2; i16++) {
                if (i16 == 1) {
                    res2 = "#extension GL_OES_EGL_image_external : require\n" + res2.replace("sampler2D tex", "samplerExternalOES tex");
                }
                int iH = nz.h(35633, res);
                int iH2 = nz.h(35632, res2);
                if (iH != 0 && iH2 != 0) {
                    int iGlCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(iGlCreateProgram, iH);
                    GLES20.glAttachShader(iGlCreateProgram, iH2);
                    GLES20.glBindAttribLocation(iGlCreateProgram, 0, "p");
                    GLES20.glBindAttribLocation(iGlCreateProgram, 1, "inputuv");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        return false;
                    }
                    aa aaVar = new aa();
                    aaVar.f26688a = iGlCreateProgram;
                    aaVar.f26689b = GLES20.glGetAttribLocation(iGlCreateProgram, "p");
                    aaVar.f26690c = GLES20.glGetAttribLocation(iGlCreateProgram, "inputuv");
                    aaVar.d = GLES20.glGetUniformLocation(iGlCreateProgram, "matrix");
                    aaVar.f26691e = GLES20.glGetUniformLocation(iGlCreateProgram, "tex");
                    aaVar.f26692f = GLES20.glGetUniformLocation(iGlCreateProgram, "sz");
                    aaVar.f26693g = GLES20.glGetUniformLocation(iGlCreateProgram, "texSz");
                    aaVar.h = GLES20.glGetUniformLocation(iGlCreateProgram, "gtop");
                    aaVar.f26694i = GLES20.glGetUniformLocation(iGlCreateProgram, "gbottom");
                    aaVar.f26695j = GLES20.glGetUniformLocation(iGlCreateProgram, "step");
                    aaVar.f26697l = GLES20.glGetUniformLocation(iGlCreateProgram, "videoMatrix");
                    aaVar.f26698m = GLES20.glGetUniformLocation(iGlCreateProgram, "hasVideoMatrix");
                    aaVar.f26696k = GLES20.glGetUniformLocation(iGlCreateProgram, "flipy");
                    this.d[i16] = aaVar;
                }
            }
            int[] iArr2 = this.f28333r;
            GLES20.glGenFramebuffers(3, iArr2, 0);
            int[] iArr3 = this.f28334s;
            GLES20.glGenTextures(3, iArr3, 0);
            int i17 = 0;
            while (i17 < 3) {
                GLES20.glBindTexture(3553, iArr3[i17]);
                GLES20.glTexImage2D(3553, 0, 6408, this.f28318a + (i17 == 2 ? i10 * 2 : 0), this.f28319b + (i17 == 2 ? i10 * 2 : 0), 0, 6408, 5121, null);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glBindFramebuffer(36160, iArr2[i17]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr3[i17], 0);
                if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                    i17++;
                }
            }
            GLES20.glBindFramebuffer(36160, 0);
            int i18 = i10 * 2;
            this.f28331p = Bitmap.createBitmap(this.f28318a + i18, this.f28319b + i18, Bitmap.Config.ARGB_8888);
            this.f28330o = ByteBuffer.allocateDirect((i18 + this.f28319b) * (this.f28318a + i18) * 4);
            return true;
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.f28324i);
        synchronized (this.f28326k) {
            float[] fArr = this.f28325j;
            float[] fArr2 = this.f28324i;
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
