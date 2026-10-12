package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.R;
public final class j5 extends tg.g {
    public static final int[] f33355j0 = {6145};
    public final Context H;
    public final float[] I;
    public final float[] J;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public volatile float[] N;
    public volatile float O;
    public volatile float[] P;
    public Bitmap Q;
    public Bitmap R;
    public Bitmap S;
    public boolean T;
    public long U;
    public long V;
    public long W;
    public final e2.j0 X;
    public volatile Bitmap Y;
    public Bitmap Z;
    public volatile int f33356a0;
    public int f33357b0;
    public final int f33358c0;
    public e5 f33359d0;
    public boolean f33360e0;
    public long f33361f0;
    public long f33362g0;
    public int f33363h0;
    public int f33364i0;

    public j5(Context context, int i10, int i11) {
        super(context, 0, 0);
        this.I = new float[16];
        this.J = new float[16];
        this.K = new float[16];
        this.L = new float[16];
        this.M = new float[16];
        this.N = new float[4];
        this.O = 1.0f;
        this.P = new float[2];
        this.X = new e2.j0(2, (byte) 0);
        this.f33360e0 = true;
        this.H = context.getApplicationContext();
        this.f33356a0 = i10;
        this.f33358c0 = i11;
    }

    public static void d(float f7, float f10, float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, -f7, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr, 0, -f10, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr, 0, 0.965f, 0.965f, 0.965f);
    }

    public static void e(float[] fArr, int i10, int i11) {
        float f7 = (i10 - i11) / 0.3902439f;
        if (f7 <= 0.0f || f7 > i10) {
            f7 = i10;
        }
        Matrix.perspectiveM(fArr, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i11 / Math.max(1.0f, f7 / 1.64f))) * 2.0d), i10 / Math.max(1, i11), 0.1f, 20.0f);
    }

    public final synchronized float c() {
        try {
            if (!this.f33360e0) {
                long nanoTime = System.nanoTime();
                long j10 = this.f33362g0;
                if (j10 != 0) {
                    this.f33361f0 = (nanoTime - j10) + this.f33361f0;
                }
                this.f33362g0 = nanoTime;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ((float) this.f33361f0) * 1.0E-9f;
    }

    public final synchronized void f(Bitmap bitmap) {
        Bitmap bitmap2 = this.Q;
        if (bitmap2 != null) {
            Bitmap bitmap3 = this.S;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.S = bitmap2;
        }
        this.Q = bitmap;
        long j10 = this.U + 1;
        this.U = j10;
        this.V = j10;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        char c10;
        float f7;
        int i10;
        int i11;
        char c11;
        Bitmap bitmap;
        long j10;
        Bitmap bitmap2;
        int i12;
        int i13;
        ?? r26;
        mi.r rVar;
        int i14;
        long j11;
        float[] fArr;
        int i15;
        boolean z10;
        GLES20.glClear(16640);
        if (this.f33359d0 != null) {
            int i16 = this.f33356a0;
            if (i16 != this.f33357b0) {
                e5 e5Var = this.f33359d0;
                Context context = this.H;
                int i17 = this.f33358c0;
                int i18 = e5Var.f33140u;
                e5Var.f33140u = e5.c(context, i16, i17);
                GLES20.glDeleteTextures(1, new int[]{i18}, 0);
                this.f33357b0 = i16;
            }
            Bitmap bitmap3 = this.Y;
            if (bitmap3 != null && bitmap3 != this.Z) {
                e5 e5Var2 = this.f33359d0;
                e5Var2.getClass();
                Bitmap createBitmap = Bitmap.createBitmap(2048, 1024, Bitmap.Config.ARGB_8888);
                i10 = 33984;
                i11 = 33985;
                c11 = 2;
                c10 = 3;
                new Canvas(createBitmap).drawBitmap(bitmap3, (Rect) null, new RectF(0.0f, 0.0f, 2048.0f, 1024.0f), new Paint(3));
                int[] iArr = new int[2048];
                int i19 = -1;
                int i20 = -1;
                f7 = 0.0f;
                int i21 = 2048;
                int i22 = 1024;
                int i23 = 0;
                while (i23 < 1024) {
                    int[] iArr2 = iArr;
                    createBitmap.getPixels(iArr2, 0, 2048, 0, i23, 2048, 1);
                    for (int i24 = 0; i24 < 2048; i24++) {
                        if ((iArr2[i24] >>> 24) != 0) {
                            i21 = Math.min(i21, i24);
                            i22 = Math.min(i22, i23);
                            i19 = Math.max(i19, i24);
                            i20 = i23;
                        }
                    }
                    i23++;
                    iArr = iArr2;
                }
                if (i19 >= i21) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e5Var2.f33135p = z10;
                if (z10) {
                    float[] fArr2 = e5Var2.f33134o;
                    fArr2[0] = i21 / 2048.0f;
                    fArr2[1] = i22 / 1024.0f;
                    fArr2[2] = (i19 + 1) / 2048.0f;
                    fArr2[3] = (i20 + 1) / 1024.0f;
                }
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, e5Var2.v);
                e5.i();
                GLUtils.texImage2D(3553, 0, createBitmap, 0);
                GLES20.glGenerateMipmap(3553);
                d5 d5Var = e5Var2.f33132m;
                GLES20.glUseProgram(d5Var.f33085a);
                GLES20.glUniform2f(d5Var.f33089g, 4.8828125E-4f, 9.765625E-4f);
                d5 d5Var2 = e5Var2.f33131l;
                GLES20.glUseProgram(d5Var2.f33085a);
                GLES20.glUniform2f(d5Var2.f33089g, 4.8828125E-4f, 9.765625E-4f);
                d5 d5Var3 = e5Var2.f33136q;
                GLES20.glUseProgram(d5Var3.f33085a);
                GLES20.glUniform2f(d5Var3.f33089g, 4.8828125E-4f, 9.765625E-4f);
                d5 d5Var4 = e5Var2.f33142x;
                GLES20.glUseProgram(d5Var4.f33085a);
                GLES20.glUniform2f(d5Var4.f33089g, 4.8828125E-4f, 9.765625E-4f);
                GLES20.glBindTexture(3553, 0);
                GLES20.glActiveTexture(33984);
                createBitmap.recycle();
                this.Z = bitmap3;
            } else {
                c10 = 3;
                f7 = 0.0f;
                i10 = 33984;
                i11 = 33985;
                c11 = 2;
            }
            synchronized (this) {
                bitmap = this.Q;
                j10 = this.V;
                this.Q = null;
            }
            if (bitmap != null) {
                this.f33359d0.h(bitmap);
                synchronized (this) {
                    Bitmap bitmap4 = this.R;
                    if (bitmap4 != null) {
                        Bitmap bitmap5 = this.S;
                        if (bitmap5 != null) {
                            bitmap5.recycle();
                        }
                        this.S = bitmap4;
                    }
                    this.R = bitmap;
                }
                this.W = j10;
                this.T = true;
            } else if (!this.T && (bitmap2 = this.R) != null) {
                this.f33359d0.h(bitmap2);
                this.T = true;
            }
            Matrix.setLookAtM(this.J, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
            float[] fArr3 = this.P;
            float f10 = fArr3[0];
            float f11 = fArr3[1];
            d(f10, f11, this.K);
            Matrix.multiplyMM(this.L, 0, this.J, 0, this.K, 0);
            Matrix.multiplyMM(this.M, 0, this.I, 0, this.L, 0);
            double sin = ((float) Math.sin(c() * 0.05f * 6.2831855f)) * 1.5707964f;
            float cos = (float) Math.cos(sin);
            float sin2 = (float) Math.sin(sin);
            float f12 = (cos * 0.175f) - (sin2 * f7);
            float f13 = (cos * f7) + (sin2 * 0.175f);
            e5 e5Var3 = this.f33359d0;
            float[] fArr4 = this.N;
            float f14 = this.O;
            e5Var3.f33127g = fArr4;
            e5Var3.h = f14;
            e5 e5Var4 = this.f33359d0;
            float[] fArr5 = this.M;
            float[] fArr6 = this.L;
            float f15 = (f11 * 2.0f) - (f10 * 1.25f);
            int i25 = this.f33363h0;
            int i26 = this.f33364i0;
            float[] fArr7 = e5Var4.f33143y;
            d5 d5Var5 = e5Var4.f33142x;
            e5Var4.f33131l.a(fArr5, fArr6, f12, f13, f15, e5Var4.f33144z);
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, e5Var4.f33130k);
            GLES20.glActiveTexture(i10);
            GLES20.glBindTexture(3553, e5Var4.f33140u);
            GLES20.glActiveTexture(i11);
            GLES20.glBindTexture(3553, e5Var4.v);
            mi.r rVar2 = e5Var4.f33138s;
            d5 d5Var6 = e5Var4.f33131l;
            e5.e(rVar2, d5Var6);
            if (e5Var4.f33135p) {
                rVar = rVar2;
                r26 = 0;
                e5Var4.f33132m.a(fArr5, fArr6, f12, f13, f15, e5Var4.f33144z);
                float[] fArr8 = e5Var4.f33134o;
                i12 = i25;
                i13 = i26;
                w7.k6.a(fArr5, i12, i13, fArr8[0], fArr8[1], fArr8[c11], fArr8[c10], 2048, 1024, true, e5Var4.f33133n, e5Var4.f33143y);
                GLES20.glEnable(3089);
                int[] iArr3 = e5Var4.f33133n;
                GLES20.glScissor(iArr3[0], iArr3[1], iArr3[c11], iArr3[c10]);
                GLES20.glDepthFunc(514);
                GLES20.glDepthMask(false);
                e5.e(rVar, e5Var4.f33132m);
                GLES20.glDisable(3089);
                GLES20.glDepthMask(true);
                GLES20.glDepthFunc(515);
            } else {
                i12 = i25;
                i13 = i26;
                r26 = 0;
                rVar = rVar2;
            }
            e5Var4.f33136q.a(fArr5, fArr6, f12, f13, f15, e5Var4.f33144z);
            float f16 = 336.0f - e5Var4.f33144z;
            w7.k6.a(fArr5, i12, i13, (f16 - 50.0f) / 336.0f, 0.35609755f, f16 / 336.0f, 0.54146343f, 1024, 625, false, e5Var4.A, e5Var4.f33143y);
            GLES20.glEnable(3089);
            int[] iArr4 = e5Var4.A;
            GLES20.glScissor(iArr4[r26], iArr4[1], iArr4[c11], iArr4[c10]);
            GLES20.glDepthFunc(514);
            GLES20.glDepthMask(r26);
            e5.e(rVar, e5Var4.f33136q);
            GLES20.glDisable(3089);
            GLES20.glDepthMask(true);
            GLES20.glDepthFunc(515);
            e5Var4.f33142x.a(fArr5, fArr6, f12, f13, f15, e5Var4.f33144z);
            GLES20.glUniform2f(d5Var5.f33091j, Math.min(512.0f, (fArr7[r26] * 512.0f * 4.0f) + 8.0f), Math.min(512.0f, (fArr7[1] * 312.5f * 4.0f) + 8.0f));
            GLES20.glEnable(32823);
            GLES20.glPolygonOffset(1.0f, 2.0f);
            GLES20.glDepthFunc(516);
            GLES20.glDepthMask(r26);
            li.a0 a0Var = e5Var4.f33141w;
            int i27 = d5Var5.f33086b;
            int i28 = d5Var5.f33087c;
            int i29 = d5Var5.h;
            int i30 = d5Var5.f33090i;
            a0Var.getClass();
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(35866, a0Var.f14743a);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, a0Var.f14744b);
            GLES20.glBindBuffer(34962, a0Var.f14745c);
            GLES20.glEnableVertexAttribArray(i27);
            GLES20.glVertexAttribPointer(i27, 3, 5126, false, 32, 0);
            if (i28 >= 0) {
                GLES20.glDisableVertexAttribArray(i28);
                float f17 = f7;
                GLES20.glVertexAttrib3f(i28, -1.0f, f17, f17);
            }
            GLES20.glEnableVertexAttribArray(i29);
            GLES20.glVertexAttribPointer(i29, 3, 5126, false, 32, 12);
            GLES20.glEnableVertexAttribArray(i30);
            GLES20.glVertexAttribPointer(i30, 2, 5126, false, 32, 24);
            int i31 = r26;
            GLES20.glDrawArrays(4, i31, a0Var.d);
            GLES20.glDisableVertexAttribArray(i29);
            GLES20.glDisableVertexAttribArray(i30);
            GLES20.glBindTexture(3553, i31);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(35866, i31);
            GLES20.glDisable(32823);
            GLES20.glDepthMask(true);
            GLES20.glDepthFunc(515);
            if (e5Var4.h > 0.0f && (fArr = e5Var4.f33127g) != null && fArr[c11] > 0.0f && fArr[c10] > 0.0f) {
                if (e5Var4.e == null) {
                    Context context2 = e5Var4.f33129j;
                    e5Var4.e = new d5(context2, e5.g(context2, "shaders/wallet_card_vertex.glsl"), e5.g(e5Var4.f33129j, "shaders/wallet_card_diamond_fragment.glsl"), "diamond", "");
                    e5Var4.f33126f = e5.d();
                    GLES20.glActiveTexture(i10);
                    GLES20.glBindTexture(3553, e5Var4.f33126f);
                    Bitmap decodeResource = BitmapFactory.decodeResource(e5Var4.f33129j.getResources(), R.drawable.wallet_card_diamond);
                    e5.i();
                    i15 = 0;
                    GLUtils.texImage2D(3553, 0, decodeResource, 0);
                    GLES20.glGenerateMipmap(3553);
                    decodeResource.recycle();
                } else {
                    i15 = 0;
                }
                e5Var4.e.a(fArr5, fArr6, f12, f13, f15, e5Var4.f33144z);
                GLES20.glUniform4fv(e5Var4.e.f33094m, 1, e5Var4.f33127g, i15);
                GLES20.glUniform1f(e5Var4.e.f33095n, e5Var4.h);
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, e5Var4.f33126f);
                float[] fArr9 = e5Var4.f33127g;
                float f18 = 0.5f - ((0.618561f - (fArr9[1] * 1.212122f)) / 1.219512f);
                float f19 = fArr9[0];
                w7.k6.a(fArr5, i12, i13, f19, f18, f19 + fArr9[c11], f18 + ((fArr9[c10] * 1.212122f) / 1.219512f), 1024, 625, false, e5Var4.f33128i, e5Var4.f33143y);
                GLES20.glEnable(3089);
                int[] iArr5 = e5Var4.f33128i;
                i14 = 3042;
                GLES20.glScissor(iArr5[0], iArr5[1], iArr5[c11], iArr5[c10]);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(1, 771);
                GLES20.glDepthFunc(514);
                GLES20.glDepthMask(false);
                e5.e(rVar, e5Var4.e);
                GLES20.glDisable(3042);
                GLES20.glDisable(3089);
                GLES20.glDepthMask(true);
                GLES20.glDepthFunc(515);
            } else {
                i14 = 3042;
            }
            if (e5Var4.f33124b != 0) {
                e5Var4.f33123a.a(fArr5, fArr6, f12, f13, f15, e5Var4.f33144z);
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, e5Var4.f33124b);
                GLES20.glEnable(i14);
                GLES20.glBlendFunc(1, 771);
                GLES20.glDepthFunc(514);
                GLES20.glDepthMask(false);
                e5.e(rVar, e5Var4.f33123a);
                GLES20.glDepthMask(true);
                GLES20.glDepthFunc(515);
                GLES20.glDisable(i14);
            }
            e5Var4.f33137r.a(fArr5, fArr6, f12, f13, f15, e5Var4.f33144z);
            e5.e(e5Var4.f33139t, e5Var4.f33137r);
            int i32 = d5Var6.f33086b;
            if (i32 >= 0) {
                GLES20.glDisableVertexAttribArray(i32);
            }
            int i33 = d5Var6.f33087c;
            if (i33 >= 0) {
                GLES20.glDisableVertexAttribArray(i33);
            }
            GLES20.glBindBuffer(34962, 0);
            GLES20.glActiveTexture(i11);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(i10);
            GLES20.glBindTexture(3553, 0);
            GLES30.glInvalidateFramebuffer(36160, 1, f33355j0, 0);
            long nanoTime = System.nanoTime();
            if (EGLExt.eglPresentationTimeANDROID(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), nanoTime)) {
                e2.j0 j0Var = this.X;
                if (this.T) {
                    j11 = this.W;
                } else {
                    j11 = 0;
                }
                j0Var.l(nanoTime, j11);
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f33363h0 = i10;
        this.f33364i0 = i11;
        GLES20.glViewport(0, 0, i10, i11);
        e(this.I, i10, i11);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.X.c();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(515);
        GLES20.glDisable(2884);
        e5 e5Var = this.f33359d0;
        if (e5Var != null) {
            d5 d5Var = e5Var.f33123a;
            if (d5Var != null) {
                GLES20.glDeleteProgram(d5Var.f33085a);
                GLES20.glDeleteTextures(1, new int[]{e5Var.f33124b}, 0);
            }
            d5 d5Var2 = e5Var.e;
            if (d5Var2 != null) {
                GLES20.glDeleteProgram(d5Var2.f33085a);
                GLES20.glDeleteTextures(1, new int[]{e5Var.f33126f}, 0);
            }
            int[] iArr = e5Var.f33138s.f15889b;
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            int[] iArr2 = e5Var.f33139t.f15889b;
            GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
            GLES20.glDeleteTextures(1, new int[]{e5Var.f33140u}, 0);
            GLES20.glDeleteTextures(1, new int[]{e5Var.v}, 0);
            GLES20.glDeleteTextures(1, new int[]{e5Var.f33130k}, 0);
            li.a0 a0Var = e5Var.f33141w;
            GLES20.glDeleteTextures(2, new int[]{a0Var.f14743a, a0Var.f14744b}, 0);
            GLES20.glDeleteBuffers(1, new int[]{a0Var.f14745c}, 0);
            GLES20.glDeleteProgram(e5Var.f33131l.f33085a);
            GLES20.glDeleteProgram(e5Var.f33132m.f33085a);
            GLES20.glDeleteProgram(e5Var.f33136q.f33085a);
            GLES20.glDeleteProgram(e5Var.f33137r.f33085a);
            GLES20.glDeleteProgram(e5Var.f33142x.f33085a);
        }
        this.f33359d0 = new e5(this.H, this.f33356a0, this.f33358c0);
        this.f33357b0 = this.f33356a0;
        this.Z = null;
        this.T = false;
        synchronized (this) {
            this.f33362g0 = 0L;
        }
    }
}
