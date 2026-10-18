package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b6 extends tg.g {
    public static final int[] f34045n0 = {6145};
    public final Context H;
    public final float[] I;
    public final float[] J;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public volatile float[] N;
    public volatile float O;
    public volatile float P;
    public volatile float[] Q;
    public volatile FutureTask R;
    public FutureTask S;
    public volatile int T;
    public int U;
    public final int V;
    public s5 W;
    public float[] X;
    public volatile float[] Y;
    public volatile boolean Z;
    public float f34046a0;
    public float f34047b0;
    public float f34048c0;
    public float f34049d0;
    public float[] f34050e0;
    public float[] f34051f0;
    public long f34052g0;
    public volatile boolean f34053h0;
    public boolean f34054i0;
    public long f34055j0;
    public long f34056k0;
    public int f34057l0;
    public int m0;

    public b6(Context context, int i10, int i11) {
        super(context, 0, 0);
        this.I = new float[16];
        this.J = new float[16];
        this.K = new float[16];
        this.L = new float[16];
        this.M = new float[16];
        this.N = new float[4];
        this.O = 1.0f;
        this.P = 1.0f;
        this.Q = new float[2];
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
        this.X = fArr;
        this.Y = n7.f(fArr);
        this.f34046a0 = Float.NaN;
        this.f34054i0 = true;
        this.H = context.getApplicationContext();
        this.T = i10;
        this.V = i11;
    }

    public static void c(float f7, float f10, float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, -f7, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr, 0, -f10, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr, 0, 0.965f, 0.965f, 0.965f);
    }

    public static void d(float[] fArr, int i10, int i11) {
        float f7 = (i10 - i11) / 0.3902439f;
        if (f7 <= 0.0f || f7 > i10) {
            f7 = i10;
        }
        Matrix.perspectiveM(fArr, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i11 / Math.max(1.0f, f7 / 1.64f))) * 2.0d), i10 / Math.max(1, i11), 0.1f, 20.0f);
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        boolean z10;
        float f7;
        int i10;
        int i11;
        mi.s sVar;
        float f10;
        float f11;
        float[] fArr;
        int i12;
        GLES20.glClear(16640);
        if (this.W == null) {
            return;
        }
        int i13 = this.T;
        if (i13 != this.U) {
            s5 s5Var = this.W;
            Context context = this.H;
            int i14 = this.V;
            int i15 = s5Var.f34892u;
            s5Var.f34892u = s5.d(context, i13, i14);
            GLES20.glDeleteTextures(1, new int[]{i15}, 0);
            this.U = i13;
        }
        FutureTask futureTask = this.R;
        if (futureTask != null && futureTask != this.S) {
            futureTask.run();
            boolean z11 = false;
            while (true) {
                try {
                    this.W.j((q5) futureTask.get());
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                } catch (ExecutionException e) {
                    FileLog.e(e);
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            this.S = futureTask;
        }
        this.W.f34879g = this.Y;
        Matrix.setLookAtM(this.J, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr2 = this.Q;
        float f12 = fArr2[0];
        float f13 = fArr2[1];
        long nanoTime = System.nanoTime();
        if (Math.abs(f12 - this.f34046a0) > 0.05f || Math.abs(f13 - this.f34047b0) > 0.05f || this.O != this.f34048c0 || this.P != this.f34049d0 || this.Y != this.f34050e0 || this.N != this.f34051f0) {
            this.f34046a0 = f12;
            this.f34047b0 = f13;
            this.f34048c0 = this.O;
            this.f34049d0 = this.P;
            this.f34050e0 = this.Y;
            this.f34051f0 = this.N;
            this.f34052g0 = nanoTime;
        }
        if (nanoTime - this.f34052g0 > 300000000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34053h0 = z10;
        c(f12, f13, this.K);
        Matrix.multiplyMM(this.L, 0, this.J, 0, this.K, 0);
        Matrix.multiplyMM(this.M, 0, this.I, 0, this.L, 0);
        synchronized (this) {
            try {
                if (!this.f34054i0) {
                    long nanoTime2 = System.nanoTime();
                    long j10 = this.f34056k0;
                    if (j10 != 0) {
                        this.f34055j0 = (nanoTime2 - j10) + this.f34055j0;
                    }
                    this.f34056k0 = nanoTime2;
                }
                f7 = ((float) this.f34055j0) * 1.0E-9f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        double sin = ((float) Math.sin(f7 * 0.05f * 6.2831855f)) * 1.5707964f;
        float cos = (float) Math.cos(sin);
        float sin2 = (float) Math.sin(sin);
        float f14 = (cos * 0.175f) - (sin2 * 0.0f);
        float f15 = (cos * 0.0f) + (sin2 * 0.175f);
        s5 s5Var2 = this.W;
        float[] fArr3 = this.N;
        float f16 = this.O;
        s5Var2.f34877c = fArr3;
        s5Var2.d = f16;
        s5 s5Var3 = this.W;
        float f17 = this.P;
        r5 r5Var = s5Var3.f34880i;
        r5 r5Var2 = s5Var3.f34881j;
        r5 r5Var3 = s5Var3.f34885n;
        r5 r5Var4 = s5Var3.f34886o;
        s5Var3.f34893w.f34830a = f17;
        r5Var4.f34830a = f17;
        r5Var3.f34830a = f17;
        r5Var2.f34830a = f17;
        r5Var.f34830a = f17;
        s5 s5Var4 = this.W;
        float[] fArr4 = this.M;
        float[] fArr5 = this.L;
        float f18 = (f13 * 2.0f) - (f12 * 1.25f);
        int i16 = this.f34057l0;
        int i17 = this.m0;
        float[] fArr6 = s5Var4.f34894x;
        r5 r5Var5 = s5Var4.f34893w;
        float max = Math.max(1.0f, ((Math.abs(fArr4[8]) * i16) / Math.max(0.001f, fArr4[15])) / 768.0f);
        s5Var4.f34880i.a(fArr4, fArr5, f14, f15, f18, s5Var4.f34895y, max);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, s5Var4.h);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, s5Var4.f34892u);
        GLES20.glActiveTexture(33989);
        GLES20.glBindTexture(3553, s5Var4.f34889r);
        mi.s sVar2 = s5Var4.f34890s;
        r5 r5Var6 = s5Var4.f34880i;
        s5Var4.f(sVar2, r5Var6);
        if (s5Var4.f34884m) {
            sVar = sVar2;
            s5Var4.f34881j.a(fArr4, fArr5, f14, f15, f18, s5Var4.f34895y, max);
            f10 = f18;
            float[] fArr7 = s5Var4.f34883l;
            w7.j6.a(fArr4, i16, i17, fArr7[0], fArr7[1], fArr7[2], fArr7[3], 2048, 1024, true, s5Var4.f34882k, s5Var4.f34894x);
            GLES20.glEnable(3089);
            int[] iArr = s5Var4.f34882k;
            i10 = i16;
            i11 = i17;
            GLES20.glScissor(iArr[0], iArr[1], iArr[2], iArr[3]);
            GLES20.glDepthFunc(514);
            GLES20.glDepthMask(false);
            s5Var4.f(sVar, s5Var4.f34881j);
            GLES20.glDisable(3089);
            GLES20.glDepthMask(true);
            GLES20.glDepthFunc(515);
            max = max;
        } else {
            i10 = i16;
            i11 = i17;
            sVar = sVar2;
            f10 = f18;
        }
        s5Var4.f34885n.a(fArr4, fArr5, f14, f15, f10, s5Var4.f34895y, max);
        float f19 = max;
        float f20 = 336.0f - s5Var4.f34895y;
        int i18 = i11;
        int i19 = i10;
        w7.j6.a(fArr4, i19, i18, (f20 - 48.0f) / 336.0f, 0.36097562f, f20 / 336.0f, 0.5365854f, 1024, 625, false, s5Var4.f34896z, s5Var4.f34894x);
        GLES20.glEnable(3089);
        int[] iArr2 = s5Var4.f34896z;
        GLES20.glScissor(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        GLES20.glDepthFunc(514);
        GLES20.glDepthMask(false);
        s5Var4.f(sVar, s5Var4.f34885n);
        GLES20.glDisable(3089);
        GLES20.glDepthMask(true);
        GLES20.glDepthFunc(515);
        float f21 = f19;
        float f22 = f10;
        s5Var4.f34893w.a(fArr4, fArr5, f14, f15, f22, s5Var4.f34895y, f21);
        GLES20.glUniform2f(r5Var5.f34845s, Math.min(512.0f, (fArr6[0] * 512.0f * 4.0f) + 8.0f), Math.min(512.0f, (fArr6[1] * 312.5f * 4.0f) + 8.0f));
        GLES20.glEnable(32823);
        GLES20.glPolygonOffset(1.0f, 2.0f);
        GLES20.glDepthFunc(516);
        GLES20.glDepthMask(false);
        s5Var4.b(r5Var5);
        z5 z5Var = s5Var4.v;
        int i20 = r5Var5.f34836j;
        int i21 = r5Var5.f34837k;
        int i22 = r5Var5.f34843q;
        int i23 = r5Var5.f34844r;
        z5Var.getClass();
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(35866, z5Var.f35172a);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, z5Var.f35173b);
        GLES20.glBindBuffer(34962, z5Var.f35174c);
        GLES20.glEnableVertexAttribArray(i20);
        GLES20.glVertexAttribPointer(i20, 3, 5126, false, 32, 0);
        if (i21 >= 0) {
            GLES20.glDisableVertexAttribArray(i21);
            GLES20.glVertexAttrib3f(i21, -1.0f, 0.0f, 0.0f);
        }
        GLES20.glEnableVertexAttribArray(i22);
        GLES20.glVertexAttribPointer(i22, 3, 5126, false, 32, 12);
        GLES20.glEnableVertexAttribArray(i23);
        GLES20.glVertexAttribPointer(i23, 2, 5126, false, 32, 24);
        GLES20.glDrawArrays(4, 0, z5Var.d);
        GLES20.glDisableVertexAttribArray(i22);
        GLES20.glDisableVertexAttribArray(i23);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(35866, 0);
        GLES20.glDisable(32823);
        GLES20.glDepthMask(true);
        GLES20.glDepthFunc(515);
        if (s5Var4.d > 0.0f && (fArr = s5Var4.f34877c) != null && fArr[2] > 0.0f && fArr[3] > 0.0f) {
            if (s5Var4.f34875a == null) {
                Context context2 = s5Var4.f34878f;
                s5Var4.f34875a = new r5(context2, s5.i(context2, "shaders/wallet_card_vertex.glsl"), s5.i(s5Var4.f34878f, "shaders/wallet_card_diamond_fragment.glsl"), "diamond", "");
                s5Var4.f34876b = s5.e();
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, s5Var4.f34876b);
                Bitmap decodeResource = BitmapFactory.decodeResource(s5Var4.f34878f.getResources(), R.drawable.wallet_card_diamond_layers);
                s5.k();
                i12 = 0;
                GLUtils.texImage2D(3553, 0, decodeResource, 0);
                GLES20.glGenerateMipmap(3553);
                decodeResource.recycle();
            } else {
                i12 = 0;
            }
            s5Var4.f34875a.a(fArr4, fArr5, f14, f15, f22, s5Var4.f34895y, f21);
            f11 = f22;
            GLES20.glUniform4fv(s5Var4.f34875a.v, 1, s5Var4.f34877c, i12);
            GLES20.glUniform1f(s5Var4.f34875a.f34848w, s5Var4.d);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, s5Var4.f34876b);
            float[] fArr8 = s5Var4.f34877c;
            float f23 = 0.5f - ((0.618561f - (fArr8[1] * 1.212122f)) / 1.219512f);
            float f24 = fArr8[0];
            w7.j6.a(fArr4, i19, i18, f24, f23, f24 + fArr8[2], f23 + ((fArr8[3] * 1.212122f) / 1.219512f), 1024, 625, false, s5Var4.e, s5Var4.f34894x);
            GLES20.glEnable(3089);
            int[] iArr3 = s5Var4.e;
            GLES20.glScissor(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            GLES20.glDepthFunc(514);
            GLES20.glDepthMask(false);
            s5Var4.f(sVar, s5Var4.f34875a);
            GLES20.glDisable(3042);
            GLES20.glDisable(3089);
            GLES20.glDepthMask(true);
            GLES20.glDepthFunc(515);
            f21 = f21;
        } else {
            f11 = f22;
        }
        float f25 = f11;
        s5Var4.f34886o.a(fArr4, fArr5, f14, f15, f25, s5Var4.f34895y, f21);
        s5Var4.f(s5Var4.f34891t, s5Var4.f34886o);
        s5Var4.f34887p.a(fArr4, fArr5, f14, f15, f25, s5Var4.f34895y, f21);
        GLES20.glEnable(32823);
        GLES20.glPolygonOffset(-1.0f, -1.0f);
        s5Var4.f(s5Var4.f34888q, s5Var4.f34887p);
        GLES20.glDisable(32823);
        int i24 = r5Var6.f34836j;
        if (i24 >= 0) {
            GLES20.glDisableVertexAttribArray(i24);
        }
        int i25 = r5Var6.f34837k;
        if (i25 >= 0) {
            GLES20.glDisableVertexAttribArray(i25);
        }
        GLES20.glBindBuffer(34962, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33989);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, 0);
        GLES30.glInvalidateFramebuffer(36160, 1, f34045n0, 0);
        this.Z = true;
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f34057l0 = i10;
        this.m0 = i11;
        GLES20.glViewport(0, 0, i10, i11);
        d(this.I, i10, i11);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.Z = false;
        this.f34046a0 = Float.NaN;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(515);
        GLES20.glDisable(2884);
        s5 s5Var = this.W;
        if (s5Var != null) {
            r5 r5Var = s5Var.f34875a;
            if (r5Var != null) {
                GLES20.glDeleteProgram(r5Var.f34832c);
                GLES20.glDeleteTextures(1, new int[]{s5Var.f34876b}, 0);
            }
            int[] iArr = s5Var.f34890s.f16986b;
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            int[] iArr2 = s5Var.f34891t.f16986b;
            GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
            int[] iArr3 = s5Var.f34888q.f16986b;
            GLES20.glDeleteBuffers(iArr3.length, iArr3, 0);
            GLES20.glDeleteProgram(s5Var.f34887p.f34832c);
            GLES20.glDeleteTextures(1, new int[]{s5Var.f34889r}, 0);
            GLES20.glDeleteTextures(1, new int[]{s5Var.f34892u}, 0);
            GLES20.glDeleteTextures(1, new int[]{s5Var.h}, 0);
            z5 z5Var = s5Var.v;
            GLES20.glDeleteTextures(2, new int[]{z5Var.f35172a, z5Var.f35173b}, 0);
            GLES20.glDeleteBuffers(1, new int[]{z5Var.f35174c}, 0);
            GLES20.glDeleteProgram(s5Var.f34880i.f34832c);
            GLES20.glDeleteProgram(s5Var.f34881j.f34832c);
            GLES20.glDeleteProgram(s5Var.f34885n.f34832c);
            GLES20.glDeleteProgram(s5Var.f34886o.f34832c);
            GLES20.glDeleteProgram(s5Var.f34893w.f34832c);
        }
        this.W = new s5(this.H, this.T, this.V);
        this.U = this.T;
        this.S = null;
        synchronized (this) {
            this.f34056k0 = 0L;
        }
    }
}
