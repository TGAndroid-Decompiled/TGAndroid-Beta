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
public final class m5 extends sg.g {
    public static final int[] f35306j0 = {6145};
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
    public final e2.a0 X;
    public volatile Bitmap Y;
    public Bitmap Z;
    public volatile int f35307a0;
    public int f35308b0;
    public final int f35309c0;
    public h5 f35310d0;
    public boolean f35311e0;
    public long f35312f0;
    public long f35313g0;
    public int f35314h0;
    public int f35315i0;

    public m5(Context context, int i10, int i11) {
        super(context, 0, 0);
        this.I = new float[16];
        this.J = new float[16];
        this.K = new float[16];
        this.L = new float[16];
        this.M = new float[16];
        this.N = new float[4];
        this.O = 1.0f;
        this.P = new float[2];
        this.X = new e2.a0(2, (byte) 0);
        this.f35311e0 = true;
        this.H = context.getApplicationContext();
        this.f35307a0 = i10;
        this.f35309c0 = i11;
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
            if (!this.f35311e0) {
                long nanoTime = System.nanoTime();
                long j3 = this.f35313g0;
                if (j3 != 0) {
                    this.f35312f0 = (nanoTime - j3) + this.f35312f0;
                }
                this.f35313g0 = nanoTime;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ((float) this.f35312f0) * 1.0E-9f;
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
        long j3 = this.U + 1;
        this.U = j3;
        this.V = j3;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        char c10;
        float f7;
        int i10;
        int i11;
        char c11;
        Bitmap bitmap;
        long j3;
        Bitmap bitmap2;
        int i12;
        int i13;
        ?? r26;
        li.r rVar;
        int i14;
        long j10;
        float[] fArr;
        int i15;
        boolean z10;
        GLES20.glClear(16640);
        if (this.f35310d0 != null) {
            int i16 = this.f35307a0;
            if (i16 != this.f35308b0) {
                h5 h5Var = this.f35310d0;
                Context context = this.H;
                int i17 = this.f35309c0;
                int i18 = h5Var.f35077u;
                h5Var.f35077u = h5.c(context, i16, i17);
                GLES20.glDeleteTextures(1, new int[]{i18}, 0);
                this.f35308b0 = i16;
            }
            Bitmap bitmap3 = this.Y;
            if (bitmap3 != null && bitmap3 != this.Z) {
                h5 h5Var2 = this.f35310d0;
                h5Var2.getClass();
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
                h5Var2.f35072p = z10;
                if (z10) {
                    float[] fArr2 = h5Var2.f35071o;
                    fArr2[0] = i21 / 2048.0f;
                    fArr2[1] = i22 / 1024.0f;
                    fArr2[2] = (i19 + 1) / 2048.0f;
                    fArr2[3] = (i20 + 1) / 1024.0f;
                }
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, h5Var2.v);
                h5.i();
                GLUtils.texImage2D(3553, 0, createBitmap, 0);
                GLES20.glGenerateMipmap(3553);
                g5 g5Var = h5Var2.f35069m;
                GLES20.glUseProgram(g5Var.f35016a);
                GLES20.glUniform2f(g5Var.f35021g, 4.8828125E-4f, 9.765625E-4f);
                g5 g5Var2 = h5Var2.f35068l;
                GLES20.glUseProgram(g5Var2.f35016a);
                GLES20.glUniform2f(g5Var2.f35021g, 4.8828125E-4f, 9.765625E-4f);
                g5 g5Var3 = h5Var2.f35073q;
                GLES20.glUseProgram(g5Var3.f35016a);
                GLES20.glUniform2f(g5Var3.f35021g, 4.8828125E-4f, 9.765625E-4f);
                g5 g5Var4 = h5Var2.f35079x;
                GLES20.glUseProgram(g5Var4.f35016a);
                GLES20.glUniform2f(g5Var4.f35021g, 4.8828125E-4f, 9.765625E-4f);
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
                j3 = this.V;
                this.Q = null;
            }
            if (bitmap != null) {
                this.f35310d0.h(bitmap);
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
                this.W = j3;
                this.T = true;
            } else if (!this.T && (bitmap2 = this.R) != null) {
                this.f35310d0.h(bitmap2);
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
            h5 h5Var3 = this.f35310d0;
            float[] fArr4 = this.N;
            float f14 = this.O;
            h5Var3.f35064g = fArr4;
            h5Var3.h = f14;
            h5 h5Var4 = this.f35310d0;
            float[] fArr5 = this.M;
            float[] fArr6 = this.L;
            float f15 = (f11 * 2.0f) - (f10 * 1.25f);
            int i25 = this.f35314h0;
            int i26 = this.f35315i0;
            float[] fArr7 = h5Var4.f35080y;
            g5 g5Var5 = h5Var4.f35079x;
            h5Var4.f35068l.a(fArr5, fArr6, f12, f13, f15, h5Var4.f35081z);
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, h5Var4.f35067k);
            GLES20.glActiveTexture(i10);
            GLES20.glBindTexture(3553, h5Var4.f35077u);
            GLES20.glActiveTexture(i11);
            GLES20.glBindTexture(3553, h5Var4.v);
            li.r rVar2 = h5Var4.f35075s;
            g5 g5Var6 = h5Var4.f35068l;
            h5.e(rVar2, g5Var6);
            if (h5Var4.f35072p) {
                rVar = rVar2;
                r26 = 0;
                h5Var4.f35069m.a(fArr5, fArr6, f12, f13, f15, h5Var4.f35081z);
                float[] fArr8 = h5Var4.f35071o;
                i12 = i25;
                i13 = i26;
                w7.h6.a(fArr5, i12, i13, fArr8[0], fArr8[1], fArr8[c11], fArr8[c10], 2048, 1024, true, h5Var4.f35070n, h5Var4.f35080y);
                GLES20.glEnable(3089);
                int[] iArr3 = h5Var4.f35070n;
                GLES20.glScissor(iArr3[0], iArr3[1], iArr3[c11], iArr3[c10]);
                GLES20.glDepthFunc(514);
                GLES20.glDepthMask(false);
                h5.e(rVar, h5Var4.f35069m);
                GLES20.glDisable(3089);
                GLES20.glDepthMask(true);
                GLES20.glDepthFunc(515);
            } else {
                i12 = i25;
                i13 = i26;
                r26 = 0;
                rVar = rVar2;
            }
            h5Var4.f35073q.a(fArr5, fArr6, f12, f13, f15, h5Var4.f35081z);
            float f16 = 336.0f - h5Var4.f35081z;
            w7.h6.a(fArr5, i12, i13, (f16 - 50.0f) / 336.0f, 0.35609755f, f16 / 336.0f, 0.54146343f, 1024, 625, false, h5Var4.A, h5Var4.f35080y);
            GLES20.glEnable(3089);
            int[] iArr4 = h5Var4.A;
            GLES20.glScissor(iArr4[r26], iArr4[1], iArr4[c11], iArr4[c10]);
            GLES20.glDepthFunc(514);
            GLES20.glDepthMask(r26);
            h5.e(rVar, h5Var4.f35073q);
            GLES20.glDisable(3089);
            GLES20.glDepthMask(true);
            GLES20.glDepthFunc(515);
            h5Var4.f35079x.a(fArr5, fArr6, f12, f13, f15, h5Var4.f35081z);
            GLES20.glUniform2f(g5Var5.f35023j, Math.min(512.0f, (fArr7[r26] * 512.0f * 4.0f) + 8.0f), Math.min(512.0f, (fArr7[1] * 312.5f * 4.0f) + 8.0f));
            GLES20.glEnable(32823);
            GLES20.glPolygonOffset(1.0f, 2.0f);
            GLES20.glDepthFunc(516);
            GLES20.glDepthMask(r26);
            ki.z zVar = h5Var4.f35078w;
            int i27 = g5Var5.f35017b;
            int i28 = g5Var5.f35018c;
            int i29 = g5Var5.h;
            int i30 = g5Var5.f35022i;
            zVar.getClass();
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(35866, zVar.f15206a);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, zVar.f15207b);
            GLES20.glBindBuffer(34962, zVar.f15208c);
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
            GLES20.glDrawArrays(4, i31, zVar.d);
            GLES20.glDisableVertexAttribArray(i29);
            GLES20.glDisableVertexAttribArray(i30);
            GLES20.glBindTexture(3553, i31);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(35866, i31);
            GLES20.glDisable(32823);
            GLES20.glDepthMask(true);
            GLES20.glDepthFunc(515);
            if (h5Var4.h > 0.0f && (fArr = h5Var4.f35064g) != null && fArr[c11] > 0.0f && fArr[c10] > 0.0f) {
                if (h5Var4.f35062e == null) {
                    Context context2 = h5Var4.f35066j;
                    h5Var4.f35062e = new g5(context2, h5.g(context2, "shaders/wallet_card_vertex.glsl"), h5.g(h5Var4.f35066j, "shaders/wallet_card_diamond_fragment.glsl"), "diamond", "");
                    h5Var4.f35063f = h5.d();
                    GLES20.glActiveTexture(i10);
                    GLES20.glBindTexture(3553, h5Var4.f35063f);
                    Bitmap decodeResource = BitmapFactory.decodeResource(h5Var4.f35066j.getResources(), R.drawable.wallet_card_diamond);
                    h5.i();
                    i15 = 0;
                    GLUtils.texImage2D(3553, 0, decodeResource, 0);
                    GLES20.glGenerateMipmap(3553);
                    decodeResource.recycle();
                } else {
                    i15 = 0;
                }
                h5Var4.f35062e.a(fArr5, fArr6, f12, f13, f15, h5Var4.f35081z);
                GLES20.glUniform4fv(h5Var4.f35062e.f35026m, 1, h5Var4.f35064g, i15);
                GLES20.glUniform1f(h5Var4.f35062e.f35027n, h5Var4.h);
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, h5Var4.f35063f);
                float[] fArr9 = h5Var4.f35064g;
                float f18 = 0.5f - ((0.618561f - (fArr9[1] * 1.212122f)) / 1.219512f);
                float f19 = fArr9[0];
                w7.h6.a(fArr5, i12, i13, f19, f18, f19 + fArr9[c11], f18 + ((fArr9[c10] * 1.212122f) / 1.219512f), 1024, 625, false, h5Var4.f35065i, h5Var4.f35080y);
                GLES20.glEnable(3089);
                int[] iArr5 = h5Var4.f35065i;
                i14 = 3042;
                GLES20.glScissor(iArr5[0], iArr5[1], iArr5[c11], iArr5[c10]);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(1, 771);
                GLES20.glDepthFunc(514);
                GLES20.glDepthMask(false);
                h5.e(rVar, h5Var4.f35062e);
                GLES20.glDisable(3042);
                GLES20.glDisable(3089);
                GLES20.glDepthMask(true);
                GLES20.glDepthFunc(515);
            } else {
                i14 = 3042;
            }
            if (h5Var4.f35060b != 0) {
                h5Var4.f35059a.a(fArr5, fArr6, f12, f13, f15, h5Var4.f35081z);
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, h5Var4.f35060b);
                GLES20.glEnable(i14);
                GLES20.glBlendFunc(1, 771);
                GLES20.glDepthFunc(514);
                GLES20.glDepthMask(false);
                h5.e(rVar, h5Var4.f35059a);
                GLES20.glDepthMask(true);
                GLES20.glDepthFunc(515);
                GLES20.glDisable(i14);
            }
            h5Var4.f35074r.a(fArr5, fArr6, f12, f13, f15, h5Var4.f35081z);
            h5.e(h5Var4.f35076t, h5Var4.f35074r);
            int i32 = g5Var6.f35017b;
            if (i32 >= 0) {
                GLES20.glDisableVertexAttribArray(i32);
            }
            int i33 = g5Var6.f35018c;
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
            GLES30.glInvalidateFramebuffer(36160, 1, f35306j0, 0);
            long nanoTime = System.nanoTime();
            if (EGLExt.eglPresentationTimeANDROID(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), nanoTime)) {
                e2.a0 a0Var = this.X;
                if (this.T) {
                    j10 = this.W;
                } else {
                    j10 = 0;
                }
                a0Var.l(nanoTime, j10);
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f35314h0 = i10;
        this.f35315i0 = i11;
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
        h5 h5Var = this.f35310d0;
        if (h5Var != null) {
            g5 g5Var = h5Var.f35059a;
            if (g5Var != null) {
                GLES20.glDeleteProgram(g5Var.f35016a);
                GLES20.glDeleteTextures(1, new int[]{h5Var.f35060b}, 0);
            }
            g5 g5Var2 = h5Var.f35062e;
            if (g5Var2 != null) {
                GLES20.glDeleteProgram(g5Var2.f35016a);
                GLES20.glDeleteTextures(1, new int[]{h5Var.f35063f}, 0);
            }
            int[] iArr = h5Var.f35075s.f15682b;
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            int[] iArr2 = h5Var.f35076t.f15682b;
            GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
            GLES20.glDeleteTextures(1, new int[]{h5Var.f35077u}, 0);
            GLES20.glDeleteTextures(1, new int[]{h5Var.v}, 0);
            GLES20.glDeleteTextures(1, new int[]{h5Var.f35067k}, 0);
            ki.z zVar = h5Var.f35078w;
            GLES20.glDeleteTextures(2, new int[]{zVar.f15206a, zVar.f15207b}, 0);
            GLES20.glDeleteBuffers(1, new int[]{zVar.f15208c}, 0);
            GLES20.glDeleteProgram(h5Var.f35068l.f35016a);
            GLES20.glDeleteProgram(h5Var.f35069m.f35016a);
            GLES20.glDeleteProgram(h5Var.f35073q.f35016a);
            GLES20.glDeleteProgram(h5Var.f35074r.f35016a);
            GLES20.glDeleteProgram(h5Var.f35079x.f35016a);
        }
        this.f35310d0 = new h5(this.H, this.f35307a0, this.f35309c0);
        this.f35308b0 = this.f35307a0;
        this.Z = null;
        this.T = false;
        synchronized (this) {
            this.f35313g0 = 0L;
        }
    }
}
