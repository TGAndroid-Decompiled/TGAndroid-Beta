package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
public final class y5 extends tg.g {
    public static final int[] f35172f0 = {6145};
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
    public volatile Bitmap R;
    public Bitmap S;
    public volatile int T;
    public int U;
    public final int V;
    public q5 W;
    public float[] X;
    public volatile float[] Y;
    public volatile boolean Z;
    public boolean f35173a0;
    public long f35174b0;
    public long f35175c0;
    public int f35176d0;
    public int f35177e0;

    public y5(Context context, int i10, int i11) {
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
        this.Y = k7.f(fArr);
        this.f35173a0 = true;
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
        ?? r17;
        char c10;
        float f7;
        int i10;
        float f10;
        int i11;
        char c11;
        int i12;
        float f11;
        float f12;
        float[] fArr;
        ?? r29;
        mi.s sVar;
        p5 p5Var;
        float f13;
        p5 p5Var2;
        float f14;
        float[] fArr2;
        int i13;
        boolean z10;
        int[] iArr;
        GLES20.glClear(16640);
        if (this.W == null) {
            return;
        }
        int i14 = this.T;
        int i15 = 1;
        if (i14 != this.U) {
            q5 q5Var = this.W;
            Context context = this.H;
            int i16 = this.V;
            int i17 = q5Var.f34798u;
            q5Var.f34798u = q5.d(context, i14, i16);
            GLES20.glDeleteTextures(1, new int[]{i17}, 0);
            this.U = i14;
        }
        Bitmap bitmap = this.R;
        float f15 = 0.0f;
        if (bitmap != null && bitmap != this.S) {
            q5 q5Var2 = this.W;
            q5Var2.getClass();
            i10 = 33989;
            Bitmap createBitmap = Bitmap.createBitmap(2048, 1024, Bitmap.Config.ARGB_8888);
            f10 = 0.5f;
            i11 = 33985;
            c10 = 3;
            c11 = 2;
            i12 = 33984;
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, new RectF(0.0f, 0.0f, 2048.0f, 1024.0f), new Paint(3));
            int[] iArr2 = new int[2048];
            int i18 = -1;
            int i19 = 1024;
            int i20 = 0;
            int i21 = -1;
            int i22 = 2048;
            f11 = 4.0f;
            while (i20 < 1024) {
                int[] iArr3 = iArr2;
                Bitmap bitmap2 = createBitmap;
                bitmap2.getPixels(iArr3, 0, 2048, 0, i20, 2048, 1);
                for (int i23 = 0; i23 < 2048; i23++) {
                    if ((iArr3[i23] >>> 24) != 0) {
                        int min = Math.min(i22, i23);
                        int min2 = Math.min(i19, i20);
                        i18 = Math.max(i18, i23);
                        i19 = min2;
                        i22 = min;
                        i21 = i20;
                    }
                }
                i20++;
                createBitmap = bitmap2;
                iArr2 = iArr3;
            }
            Bitmap bitmap3 = createBitmap;
            if (i18 >= i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            q5Var2.f34790m = z10;
            if (z10) {
                float[] fArr3 = q5Var2.f34789l;
                fArr3[0] = i22 / 2048.0f;
                fArr3[1] = i19 / 1024.0f;
                fArr3[2] = (i18 + 1) / 2048.0f;
                fArr3[3] = (i21 + 1) / 1024.0f;
            }
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, q5Var2.v);
            q5.j();
            GLUtils.texImage2D(3553, 0, bitmap3, 0);
            GLES20.glGenerateMipmap(3553);
            p5 p5Var3 = q5Var2.f34787j;
            GLES20.glUseProgram(p5Var3.f34710c);
            GLES20.glUniform2f(p5Var3.f34720p, 4.8828125E-4f, 9.765625E-4f);
            p5 p5Var4 = q5Var2.f34786i;
            GLES20.glUseProgram(p5Var4.f34710c);
            GLES20.glUniform2f(p5Var4.f34720p, 4.8828125E-4f, 9.765625E-4f);
            p5 p5Var5 = q5Var2.f34791n;
            GLES20.glUseProgram(p5Var5.f34710c);
            GLES20.glUniform2f(p5Var5.f34720p, 4.8828125E-4f, 9.765625E-4f);
            p5 p5Var6 = q5Var2.f34800x;
            GLES20.glUseProgram(p5Var6.f34710c);
            GLES20.glUniform2f(p5Var6.f34720p, 4.8828125E-4f, 9.765625E-4f);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33984);
            bitmap3.getPixels(new int[262144], 0, 256, 1792, 0, 256, 1024);
            float[] fArr4 = new float[262144];
            for (int i24 = 0; i24 < 262144; i24++) {
                fArr4[i24] = (iArr[i24] >>> 24) / 255.0f;
            }
            GLES20.glActiveTexture(33989);
            GLES20.glBindTexture(3553, q5Var2.f34795r);
            q5.j();
            int i25 = 0;
            int i26 = 256;
            int i27 = 1024;
            while (true) {
                int i28 = i26 * i27;
                float[] fArr5 = new float[i28 * 4];
                float sqrt = (float) (1.0d / Math.sqrt(i15 << i25));
                for (int i29 = 0; i29 < i27; i29++) {
                    int i30 = 0;
                    while (i30 < i26) {
                        int i31 = i30 - 1;
                        int i32 = i29 - 1;
                        float h = q5.h(fArr4, i26, i27, i31, i32);
                        float f16 = f15;
                        int i33 = i30 + 1;
                        float h10 = q5.h(fArr4, i26, i27, i33, i32);
                        int i34 = i29 + 1;
                        float h11 = q5.h(fArr4, i26, i27, i31, i34);
                        float h12 = q5.h(fArr4, i26, i27, i33, i34);
                        float f17 = (((h10 + h12) - h) - h11) * 0.5f * sqrt;
                        float f18 = (((h11 + h12) - h) - h10) * 0.5f * sqrt;
                        int i35 = (i29 * i26) + i30;
                        int i36 = i35 * 4;
                        fArr5[i36] = f17;
                        fArr5[i36 + 1] = f18;
                        fArr5[i36 + 2] = (f18 * f18) + (f17 * f17);
                        fArr5[i36 + 3] = ((fArr4[i35] * 4.0f) + h + h10 + h11 + h12) * 0.125f;
                        i30 = i33;
                        f15 = f16;
                    }
                }
                f7 = f15;
                FloatBuffer h13 = wh.h(ByteBuffer.allocateDirect(i28 * 16));
                h13.put(fArr5).position(0);
                GLES20.glTexImage2D(3553, i25, 34842, i26, i27, 0, 6408, 5126, h13);
                if (i26 == i15 && i27 == i15) {
                    break;
                }
                int max = Math.max(i15, i26 / 2);
                int max2 = Math.max(i15, i27 / 2);
                float[] fArr6 = new float[max * max2];
                for (int i37 = 0; i37 < max2; i37++) {
                    int i38 = 0;
                    while (i38 < max) {
                        int i39 = i38 * 2;
                        int i40 = i37 * 2;
                        float h14 = q5.h(fArr4, i26, i27, i39, i40);
                        int i41 = i15;
                        int i42 = i39 + 1;
                        int i43 = i40 + 1;
                        fArr6[(i37 * max) + i38] = (q5.h(fArr4, i26, i27, i42, i43) + q5.h(fArr4, i26, i27, i39, i43) + q5.h(fArr4, i26, i27, i42, i40) + h14) * 0.25f;
                        i38++;
                        i15 = i41;
                    }
                }
                i25++;
                i26 = max;
                i27 = max2;
                fArr4 = fArr6;
                f15 = f7;
            }
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33984);
            bitmap3.recycle();
            this.S = bitmap;
            r17 = i15;
        } else {
            r17 = 1;
            c10 = 3;
            f7 = 0.0f;
            i10 = 33989;
            f10 = 0.5f;
            i11 = 33985;
            c11 = 2;
            i12 = 33984;
            f11 = 4.0f;
        }
        this.W.f34785g = this.Y;
        Matrix.setLookAtM(this.J, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr7 = this.Q;
        float f19 = fArr7[0];
        float f20 = fArr7[r17];
        c(f19, f20, this.K);
        Matrix.multiplyMM(this.L, 0, this.J, 0, this.K, 0);
        Matrix.multiplyMM(this.M, 0, this.I, 0, this.L, 0);
        synchronized (this) {
            try {
                if (!this.f35173a0) {
                    long nanoTime = System.nanoTime();
                    long j10 = this.f35175c0;
                    if (j10 != 0) {
                        this.f35174b0 = (nanoTime - j10) + this.f35174b0;
                    }
                    this.f35175c0 = nanoTime;
                }
                f12 = ((float) this.f35174b0) * 1.0E-9f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        double sin = ((float) Math.sin(f12 * 0.05f * 6.2831855f)) * 1.5707964f;
        float cos = (float) Math.cos(sin);
        float sin2 = (float) Math.sin(sin);
        float f21 = (cos * 0.175f) - (sin2 * f7);
        float f22 = (cos * f7) + (sin2 * 0.175f);
        q5 q5Var3 = this.W;
        float[] fArr8 = this.N;
        float f23 = this.O;
        q5Var3.f34783c = fArr8;
        q5Var3.d = f23;
        q5 q5Var4 = this.W;
        float f24 = this.P;
        p5 p5Var7 = q5Var4.f34786i;
        p5 p5Var8 = q5Var4.f34787j;
        p5 p5Var9 = q5Var4.f34791n;
        p5 p5Var10 = q5Var4.f34792o;
        q5Var4.f34800x.f34708a = f24;
        p5Var10.f34708a = f24;
        p5Var9.f34708a = f24;
        p5Var8.f34708a = f24;
        p5Var7.f34708a = f24;
        q5 q5Var5 = this.W;
        float[] fArr9 = this.M;
        float[] fArr10 = this.L;
        float f25 = (f20 * 2.0f) - (f19 * 1.25f);
        int i44 = this.f35176d0;
        int i45 = this.f35177e0;
        float[] fArr11 = q5Var5.f34801y;
        p5 p5Var11 = q5Var5.f34800x;
        float max3 = Math.max(1.0f, ((Math.abs(fArr9[8]) * i44) / Math.max(0.001f, fArr9[15])) / 768.0f);
        q5Var5.f34786i.a(fArr9, fArr10, f21, f22, f25, q5Var5.f34802z, max3);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, q5Var5.h);
        GLES20.glActiveTexture(i12);
        GLES20.glBindTexture(3553, q5Var5.f34798u);
        GLES20.glActiveTexture(i11);
        GLES20.glBindTexture(3553, q5Var5.v);
        GLES20.glActiveTexture(i10);
        GLES20.glBindTexture(3553, q5Var5.f34795r);
        mi.s sVar2 = q5Var5.f34796s;
        p5 p5Var12 = q5Var5.f34786i;
        q5Var5.f(sVar2, p5Var12);
        if (q5Var5.f34790m) {
            q5Var5.f34787j.a(fArr9, fArr10, f21, f22, f25, q5Var5.f34802z, max3);
            float[] fArr12 = q5Var5.f34789l;
            fArr = fArr11;
            p5Var2 = p5Var11;
            p5Var = p5Var12;
            f13 = 2.0f;
            r29 = 0;
            sVar = sVar2;
            w7.j6.a(fArr9, i44, i45, fArr12[0], fArr12[r17], fArr12[c11], fArr12[c10], 2048, 1024, true, q5Var5.f34788k, q5Var5.f34801y);
            GLES20.glEnable(3089);
            int[] iArr4 = q5Var5.f34788k;
            GLES20.glScissor(iArr4[0], iArr4[r17], iArr4[c11], iArr4[c10]);
            GLES20.glDepthFunc(514);
            GLES20.glDepthMask(false);
            q5Var5.f(sVar, q5Var5.f34787j);
            GLES20.glDisable(3089);
            GLES20.glDepthMask(r17);
            GLES20.glDepthFunc(515);
        } else {
            fArr = fArr11;
            r29 = 0;
            sVar = sVar2;
            p5Var = p5Var12;
            f13 = 2.0f;
            p5Var2 = p5Var11;
        }
        q5Var5.f34791n.a(fArr9, fArr10, f21, f22, f25, q5Var5.f34802z, max3);
        float f26 = 336.0f - q5Var5.f34802z;
        w7.j6.a(fArr9, i44, i45, (f26 - 48.0f) / 336.0f, 0.36097562f, f26 / 336.0f, 0.5365854f, 1024, 625, false, q5Var5.A, q5Var5.f34801y);
        GLES20.glEnable(3089);
        int[] iArr5 = q5Var5.A;
        GLES20.glScissor(iArr5[r29], iArr5[r17], iArr5[c11], iArr5[c10]);
        GLES20.glDepthFunc(514);
        GLES20.glDepthMask(r29);
        q5Var5.f(sVar, q5Var5.f34791n);
        GLES20.glDisable(3089);
        GLES20.glDepthMask(r17);
        GLES20.glDepthFunc(515);
        q5Var5.f34800x.a(fArr9, fArr10, f21, f22, f25, q5Var5.f34802z, max3);
        GLES20.glUniform2f(p5Var2.f34723s, Math.min(512.0f, (fArr[r29] * 512.0f * f11) + 8.0f), Math.min(512.0f, (fArr[r17] * 312.5f * f11) + 8.0f));
        GLES20.glEnable(32823);
        GLES20.glPolygonOffset(1.0f, f13);
        GLES20.glDepthFunc(516);
        GLES20.glDepthMask(r29);
        q5Var5.b(p5Var2);
        x5 x5Var = q5Var5.f34799w;
        int i46 = p5Var2.f34714j;
        int i47 = p5Var2.f34715k;
        int i48 = p5Var2.f34721q;
        int i49 = p5Var2.f34722r;
        x5Var.getClass();
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(35866, x5Var.f35131a);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, x5Var.f35132b);
        GLES20.glBindBuffer(34962, x5Var.f35133c);
        GLES20.glEnableVertexAttribArray(i46);
        GLES20.glVertexAttribPointer(i46, 3, 5126, false, 32, 0);
        if (i47 >= 0) {
            GLES20.glDisableVertexAttribArray(i47);
            float f27 = f7;
            GLES20.glVertexAttrib3f(i47, -1.0f, f27, f27);
        }
        GLES20.glEnableVertexAttribArray(i48);
        GLES20.glVertexAttribPointer(i48, 3, 5126, false, 32, 12);
        GLES20.glEnableVertexAttribArray(i49);
        GLES20.glVertexAttribPointer(i49, 2, 5126, false, 32, 24);
        int i50 = r29;
        GLES20.glDrawArrays(4, i50, x5Var.d);
        GLES20.glDisableVertexAttribArray(i48);
        GLES20.glDisableVertexAttribArray(i49);
        GLES20.glBindTexture(3553, i50);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(35866, i50);
        GLES20.glDisable(32823);
        GLES20.glDepthMask(r17);
        GLES20.glDepthFunc(515);
        if (q5Var5.d > 0.0f && (fArr2 = q5Var5.f34783c) != null && fArr2[c11] > 0.0f && fArr2[c10] > 0.0f) {
            if (q5Var5.f34781a == null) {
                Context context2 = q5Var5.f34784f;
                q5Var5.f34781a = new p5(context2, q5.i(context2, "shaders/wallet_card_vertex.glsl"), q5.i(q5Var5.f34784f, "shaders/wallet_card_diamond_fragment.glsl"), "diamond", "");
                q5Var5.f34782b = q5.e();
                GLES20.glActiveTexture(i12);
                GLES20.glBindTexture(3553, q5Var5.f34782b);
                Bitmap decodeResource = BitmapFactory.decodeResource(q5Var5.f34784f.getResources(), R.drawable.wallet_card_diamond_layers);
                q5.j();
                i13 = 0;
                GLUtils.texImage2D(3553, 0, decodeResource, 0);
                GLES20.glGenerateMipmap(3553);
                decodeResource.recycle();
            } else {
                i13 = 0;
            }
            q5Var5.f34781a.a(fArr9, fArr10, f21, f22, f25, q5Var5.f34802z, max3);
            int i51 = r17;
            GLES20.glUniform4fv(q5Var5.f34781a.v, i51, q5Var5.f34783c, i13);
            GLES20.glUniform1f(q5Var5.f34781a.f34726w, q5Var5.d);
            GLES20.glActiveTexture(i12);
            GLES20.glBindTexture(3553, q5Var5.f34782b);
            float[] fArr13 = q5Var5.f34783c;
            float f28 = f10 - ((0.618561f - (fArr13[i51] * 1.212122f)) / 1.219512f);
            f14 = -1.0f;
            float f29 = fArr13[0];
            w7.j6.a(fArr9, i44, i45, f29, f28, fArr13[c11] + f29, f28 + ((fArr13[c10] * 1.212122f) / 1.219512f), 1024, 625, false, q5Var5.e, q5Var5.f34801y);
            GLES20.glEnable(3089);
            int[] iArr6 = q5Var5.e;
            GLES20.glScissor(iArr6[0], iArr6[1], iArr6[c11], iArr6[c10]);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            GLES20.glDepthFunc(514);
            GLES20.glDepthMask(false);
            q5Var5.f(sVar, q5Var5.f34781a);
            GLES20.glDisable(3042);
            GLES20.glDisable(3089);
            GLES20.glDepthMask(true);
            GLES20.glDepthFunc(515);
        } else {
            f14 = -1.0f;
        }
        q5Var5.f34792o.a(fArr9, fArr10, f21, f22, f25, q5Var5.f34802z, max3);
        q5Var5.f(q5Var5.f34797t, q5Var5.f34792o);
        q5Var5.f34793p.a(fArr9, fArr10, f21, f22, f25, q5Var5.f34802z, max3);
        GLES20.glEnable(32823);
        GLES20.glPolygonOffset(f14, f14);
        q5Var5.f(q5Var5.f34794q, q5Var5.f34793p);
        GLES20.glDisable(32823);
        p5 p5Var13 = p5Var;
        int i52 = p5Var13.f34714j;
        if (i52 >= 0) {
            GLES20.glDisableVertexAttribArray(i52);
        }
        int i53 = p5Var13.f34715k;
        if (i53 >= 0) {
            GLES20.glDisableVertexAttribArray(i53);
        }
        GLES20.glBindBuffer(34962, 0);
        GLES20.glActiveTexture(i11);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(i10);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(i12);
        GLES20.glBindTexture(3553, 0);
        GLES30.glInvalidateFramebuffer(36160, 1, f35172f0, 0);
        this.Z = true;
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f35176d0 = i10;
        this.f35177e0 = i11;
        GLES20.glViewport(0, 0, i10, i11);
        d(this.I, i10, i11);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.Z = false;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(515);
        GLES20.glDisable(2884);
        q5 q5Var = this.W;
        if (q5Var != null) {
            p5 p5Var = q5Var.f34781a;
            if (p5Var != null) {
                GLES20.glDeleteProgram(p5Var.f34710c);
                GLES20.glDeleteTextures(1, new int[]{q5Var.f34782b}, 0);
            }
            int[] iArr = q5Var.f34796s.f16979b;
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            int[] iArr2 = q5Var.f34797t.f16979b;
            GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
            int[] iArr3 = q5Var.f34794q.f16979b;
            GLES20.glDeleteBuffers(iArr3.length, iArr3, 0);
            GLES20.glDeleteProgram(q5Var.f34793p.f34710c);
            GLES20.glDeleteTextures(1, new int[]{q5Var.f34795r}, 0);
            GLES20.glDeleteTextures(1, new int[]{q5Var.f34798u}, 0);
            GLES20.glDeleteTextures(1, new int[]{q5Var.v}, 0);
            GLES20.glDeleteTextures(1, new int[]{q5Var.h}, 0);
            x5 x5Var = q5Var.f34799w;
            GLES20.glDeleteTextures(2, new int[]{x5Var.f35131a, x5Var.f35132b}, 0);
            GLES20.glDeleteBuffers(1, new int[]{x5Var.f35133c}, 0);
            GLES20.glDeleteProgram(q5Var.f34786i.f34710c);
            GLES20.glDeleteProgram(q5Var.f34787j.f34710c);
            GLES20.glDeleteProgram(q5Var.f34791n.f34710c);
            GLES20.glDeleteProgram(q5Var.f34792o.f34710c);
            GLES20.glDeleteProgram(q5Var.f34800x.f34710c);
        }
        this.W = new q5(this.H, this.T, this.V);
        this.U = this.T;
        this.S = null;
        synchronized (this) {
            this.f35175c0 = 0L;
        }
    }
}
