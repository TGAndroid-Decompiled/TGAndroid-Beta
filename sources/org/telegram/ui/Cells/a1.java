package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.v21;
public final class a1 {
    public final q1 f21659a;
    public float f21660b;
    public float f21661c;
    public StaticLayout d;
    public int e;
    public StaticLayout f21662f;
    public int f21663g;
    public float h;

    public a1(q1 q1Var) {
        this.f21659a = q1Var;
    }

    public final void a(android.graphics.Canvas r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a1.a(android.graphics.Canvas, float, float):void");
    }

    public final void b(Canvas canvas, float f7, float f10, int i10) {
        float f11;
        int i11;
        float L;
        int i12;
        float L2;
        float f12;
        float f13;
        int i13;
        int i14;
        int i15;
        float videoTranscriptionProgress;
        float videoTranscriptionProgress2;
        boolean z10;
        float f14;
        Paint paint;
        float f15;
        float f16;
        boolean z11;
        float f17;
        int i16;
        Paint X1;
        boolean z12;
        canvas.save();
        q1 q1Var = this.f21659a;
        x1 x1Var = q1Var.gb;
        int currentBackgroundRight = q1Var.getCurrentBackgroundRight() - q1Var.getCurrentBackgroundLeft();
        if (q1Var.F) {
            f11 = 6.0f;
        } else {
            f11 = 0.0f;
        }
        int L3 = org.telegram.messenger.i0.L(f11) + currentBackgroundRight;
        if (q1Var.P1) {
            i11 = 10;
        } else {
            i11 = 0;
        }
        int L4 = L3 - org.telegram.messenger.i0.L(i11 + 128);
        if (q1Var.H4 == null) {
            z0 z0Var = new z0(this, q1Var, q1Var.C4);
            q1Var.H4 = z0Var;
            kj kjVar = q1Var.O5;
            TLRPC.Message message = kjVar.f16690k;
            if (message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && v21.k(kjVar)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z0Var.q(z12, false);
            q1Var.H4.o(v21.j(q1Var.O5), false);
            q1Var.H4.p(v21.s(q1Var.O5), false);
        }
        if (q1Var.D8 != 0) {
            this.f21660b = org.telegram.messenger.i0.T1(org.telegram.messenger.m5.C(21.0f, i10, L4), q1Var.P8, 1.0f - q1Var.getVideoTranscriptionProgress());
            this.f21661c = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(3.0f) + q1Var.F4, q1Var.Q8 - org.telegram.messenger.i0.L(40.0f), 1.0f - q1Var.getVideoTranscriptionProgress());
        } else {
            float C = org.telegram.messenger.m5.C(21.0f, i10, L4);
            kj kjVar2 = q1Var.O5;
            if (kjVar2 != null && kjVar2.P3()) {
                L = (org.telegram.messenger.i0.L(28.0f) * f10) + (q1Var.getCurrentBackgroundLeft() - org.telegram.messenger.i0.L(40.0f));
            } else if (q1Var.r2()) {
                L = Math.min(q1Var.getPhotoImage().y() + org.telegram.messenger.i0.L(8.0f), q1Var.getCompactRight() - org.telegram.messenger.i0.L(32.0f));
            } else {
                L = (org.telegram.messenger.i0.L(8.0f) + q1Var.getCurrentBackgroundRight()) - (org.telegram.messenger.i0.L(40.0f) * f10);
            }
            this.f21660b = org.telegram.messenger.i0.T1(C, L, 1.0f - q1Var.getVideoTranscriptionProgress());
            float f18 = q1Var.f22520c7 + x1Var.f23498j0;
            if (q1Var.J) {
                i12 = 2;
            } else {
                i12 = 0;
            }
            float L5 = f18 - org.telegram.messenger.i0.L(28 - i12);
            sg.p0 p0Var = q1Var.N;
            if (!p0Var.f48461p) {
                L5 -= p0Var.i(x1Var.L1);
            }
            float T1 = org.telegram.messenger.i0.T1(L5, (q1Var.getMediaOffsetY() + (org.telegram.messenger.i0.L(44.0f) + q1Var.Sa)) - org.telegram.messenger.i0.L(1.7f), q1Var.getVideoTranscriptionProgress()) + org.telegram.messenger.i0.L(1.7f);
            float L6 = org.telegram.messenger.i0.L(3.0f) + q1Var.F4;
            float L7 = T1 - org.telegram.messenger.i0.L(12.0f);
            if (q1Var.O5.P3()) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.i0.L(28.0f) * f10;
            }
            this.f21661c = org.telegram.messenger.i0.T1(L6, L7 - L2, 1.0f - q1Var.getVideoTranscriptionProgress());
        }
        z0 z0Var2 = q1Var.H4;
        int i17 = (int) this.f21660b;
        int i18 = (int) this.f21661c;
        int W1 = org.telegram.messenger.i0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(32.0f));
        int W12 = org.telegram.messenger.i0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(32.0f));
        int W13 = org.telegram.messenger.i0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(16.0f));
        Rect rect = z0Var2.f31162u;
        if (W1 == rect.width() && W12 == rect.height()) {
            f12 = 40.0f;
            f13 = 0.0f;
            i13 = 2;
        } else {
            float f19 = W1 / 2.0f;
            f12 = 40.0f;
            float f20 = W13;
            f13 = 0.0f;
            float f21 = W12 / 2.0f;
            i13 = 2;
            z0Var2.F = (float) ((Math.atan((f19 - f20) / f21) * 180.0d) / 3.141592653589793d);
            z0Var2.G = (float) ((Math.atan(f19 / (f21 - f20)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i17, i18, i17 + W1, i18 + W12);
        int min = Math.min(Math.min(W1, W12) / 2, W13);
        z0Var2.D = min;
        z0Var2.E = min * 2;
        z0 z0Var3 = q1Var.H4;
        if (q1Var.r2()) {
            i14 = org.telegram.ui.ActionBar.t6.Ta;
        } else {
            i14 = org.telegram.ui.ActionBar.t6.Wc;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i14, q1Var.Ob);
        if (q1Var.O5.P3()) {
            i15 = org.telegram.ui.ActionBar.t6.Gc;
        } else {
            i15 = org.telegram.ui.ActionBar.t6.qk;
        }
        int w03 = org.telegram.ui.ActionBar.t6.w0(i15, q1Var.Ob);
        if (q1Var.K1 == 3) {
            videoTranscriptionProgress = 1.0f;
        } else {
            videoTranscriptionProgress = q1Var.getVideoTranscriptionProgress();
        }
        int f22 = i0.b.f(videoTranscriptionProgress, w02, w03);
        org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, q1Var.Ob);
        q1Var.O5.N3();
        if (q1Var.K1 == 3) {
            videoTranscriptionProgress2 = f13;
        } else {
            videoTranscriptionProgress2 = 1.0f - q1Var.getVideoTranscriptionProgress();
        }
        ci0 ci0Var = z0Var3.f31157p;
        ci0 ci0Var2 = z0Var3.f31155n;
        if (z0Var3.f31146b != f22) {
            z10 = true;
        } else {
            z10 = false;
        }
        z0Var3.f31146b = f22;
        z0Var3.f31147c = f22;
        int o10 = i0.b.o(f22, (int) (Color.alpha(f22) * 0.156f));
        z0Var3.f31145a = o10;
        z0Var3.e = videoTranscriptionProgress2;
        float alpha = Color.alpha(f22);
        if (org.telegram.ui.ActionBar.t6.I.q()) {
            f14 = 0.3f;
        } else {
            f14 = 0.2f;
        }
        z0Var3.d = org.telegram.ui.ActionBar.t6.w(o10, i0.b.o(f22, (int) (alpha * f14)));
        if (z0Var3.f31148f == null) {
            z0Var3.f31148f = new Paint();
        }
        z0Var3.f31148f.setColor(z0Var3.f31145a);
        z0Var3.f31148f.setAlpha((int) ((1.0f - videoTranscriptionProgress2) * paint.getAlpha()));
        if (z10 || z0Var3.f31158q == null) {
            int L8 = org.telegram.messenger.i0.L(8.0f);
            int i19 = z0Var3.d;
            y k02 = org.telegram.ui.ActionBar.t6.k0(L8, L8, L8, L8, 0, i19, i19);
            z0Var3.f31158q = k02;
            k02.setCallback(z0Var3.f31159r);
        }
        if (z10) {
            ci0Var2.Z = true;
            ci0Var2.Q(z0Var3.f31147c, "Artboard Outlines");
            ci0Var2.o();
            ci0Var2.J(true);
            ci0Var2.V(0L);
            int alpha2 = Color.alpha(f22);
            z0Var3.f31154m = alpha2;
            ci0Var2.setAlpha(alpha2);
            ci0Var.Z = true;
            ci0Var.Q(z0Var3.f31147c, "Artboard Outlines");
            ci0Var.o();
            ci0Var.J(true);
            ci0Var.V(0L);
            int alpha3 = Color.alpha(f22);
            z0Var3.f31156o = alpha3;
            ci0Var.setAlpha(alpha3);
        }
        if (z0Var3.f31149g == null) {
            Paint paint2 = new Paint(1);
            z0Var3.f31149g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            z0Var3.f31149g.setStrokeCap(Paint.Cap.ROUND);
        }
        z0Var3.f31149g.setColor(f22);
        z0 z0Var4 = q1Var.H4;
        ci0 ci0Var3 = z0Var4.f31157p;
        ci0 ci0Var4 = z0Var4.f31155n;
        Rect rect2 = z0Var4.v;
        Rect rect3 = z0Var4.f31162u;
        rect2.set(rect3.left - org.telegram.messenger.i0.L(8.0f), rect3.top - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f) + rect3.right, org.telegram.messenger.i0.L(8.0f) + rect3.bottom);
        Path path = z0Var4.C;
        if (path == null) {
            z0Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(rect3);
        Path path2 = z0Var4.C;
        float f23 = z0Var4.D;
        path2.addRoundRect(rectF, f23, f23, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(z0Var4.C);
        float f24 = z0Var4.e * f7;
        if (f24 > f13) {
            q1 q1Var2 = z0Var4.R.f21659a;
            if (q1Var2.O5.O5()) {
                X1 = q1Var2.X1("paintChatActionBackground");
            } else {
                X1 = q1Var2.X1("paintChatTimeBackground");
            }
            int alpha4 = X1.getAlpha();
            X1.setAlpha((int) (alpha4 * f24));
            q1Var2.z();
            canvas.drawRect(rect3, X1);
            if (X1 == q1Var2.X1("paintChatActionBackground") && q1Var2.e2()) {
                int alpha5 = org.telegram.ui.ActionBar.t6.f20999h2.getAlpha();
                org.telegram.ui.ActionBar.t6.f20999h2.setAlpha((int) (alpha5 * f24));
                canvas.drawRect(rect3, org.telegram.ui.ActionBar.t6.f20999h2);
                org.telegram.ui.ActionBar.t6.f20999h2.setAlpha(alpha5);
            }
            X1.setAlpha(alpha4);
        }
        Paint paint3 = z0Var4.f31148f;
        if (paint3 != null) {
            int alpha6 = paint3.getAlpha();
            z0Var4.f31148f.setAlpha((int) (alpha6 * f7));
            canvas.drawRect(rect3, z0Var4.f31148f);
            z0Var4.f31148f.setAlpha(alpha6);
        }
        y yVar = z0Var4.f31158q;
        if (yVar != null) {
            yVar.setBounds(rect3);
            z0Var4.f31158q.draw(canvas);
        }
        canvas.restore();
        org.telegram.ui.Components.t5 t5Var = z0Var4.f31153l;
        if (z0Var4.f31152k) {
            f15 = 1.0f;
        } else {
            f15 = f13;
        }
        float e = t5Var.e(false, f15);
        if (e > f13) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - z0Var4.f31161t)) * 0.75f;
            u1.a aVar = z0Var4.B;
            if (z0Var4.M == null) {
                z0Var4.M = new float[i13];
            }
            long j10 = elapsedRealtime % 5400;
            float[] fArr = z0Var4.M;
            float f25 = ((float) (1520 * j10)) / 5400.0f;
            fArr[0] = f25 - 20.0f;
            char c10 = 1;
            fArr[1] = f25;
            int i20 = 0;
            while (i20 < 4) {
                float[] fArr2 = z0Var4.M;
                fArr2[1] = (aVar.getInterpolation(((float) (j10 - (i20 * 1350))) / 667.0f) * 250.0f) + fArr2[c10];
                float[] fArr3 = z0Var4.M;
                fArr3[0] = (aVar.getInterpolation(((float) (j10 - (i16 + 667))) / 667.0f) * 250.0f) + fArr3[0];
                i20++;
                c10 = 1;
            }
            f16 = 180.0f;
            float[] fArr4 = z0Var4.M;
            Path path3 = z0Var4.h;
            if (path3 == null) {
                z0Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e * f12, fArr4[1] - fArr4[0]);
            float f26 = fArr4[0];
            float f27 = (1.0f - e) * max;
            if (z0Var4.f31152k) {
                f17 = f13;
            } else {
                f17 = 1.0f;
            }
            float f28 = (f27 * f17) + f26;
            float f29 = (max * e) + f28;
            float f30 = f28 % 360.0f;
            float f31 = f29 % 360.0f;
            if (f30 < f13) {
                f30 += 360.0f;
            }
            float f32 = f30;
            if (f31 < f13) {
                f31 += 360.0f;
            }
            float f33 = f31;
            Path path4 = z0Var4.h;
            int centerX = rect3.centerX();
            int i21 = rect3.top;
            v21.d(path4, centerX, i21, rect3.right - z0Var4.D, i21, f32, f33, 0.0f, z0Var4.F);
            v21.b(z0Var4.h, rect3.right, rect3.top, z0Var4.E, 1, f32, f33, z0Var4.F, z0Var4.G);
            Path path5 = z0Var4.h;
            int i22 = rect3.right;
            int i23 = rect3.top;
            int i24 = z0Var4.D;
            int i25 = i23 + i24;
            int i26 = rect3.bottom - i24;
            float f34 = z0Var4.G;
            v21.d(path5, i22, i25, i22, i26, f32, f33, f34, 180.0f - f34);
            v21.b(z0Var4.h, rect3.right, rect3.bottom, z0Var4.E, 2, f32, f33, 180.0f - z0Var4.G, 180.0f - z0Var4.F);
            Path path6 = z0Var4.h;
            int i27 = rect3.right;
            int i28 = z0Var4.D;
            int i29 = i27 - i28;
            int i30 = rect3.bottom;
            int i31 = rect3.left + i28;
            float f35 = z0Var4.F;
            v21.d(path6, i29, i30, i31, i30, f32, f33, 180.0f - f35, f35 + 180.0f);
            v21.b(z0Var4.h, rect3.left, rect3.bottom, z0Var4.E, 3, f32, f33, z0Var4.F + 180.0f, z0Var4.G + 180.0f);
            Path path7 = z0Var4.h;
            int i32 = rect3.left;
            int i33 = rect3.bottom;
            int i34 = z0Var4.D;
            int i35 = i33 - i34;
            int i36 = rect3.top + i34;
            float f36 = z0Var4.G;
            v21.d(path7, i32, i35, i32, i36, f32, f33, f36 + 180.0f, 360.0f - f36);
            v21.b(z0Var4.h, rect3.left, rect3.top, z0Var4.E, 4, f32, f33, 360.0f - z0Var4.G, 360.0f - z0Var4.F);
            v21.d(z0Var4.h, rect3.left + z0Var4.D, rect3.top, rect3.centerX(), rect3.top, f32, f33, 360.0f - z0Var4.F, 360.0f);
            z0Var4.f31149g.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
            int alpha7 = z0Var4.f31149g.getAlpha();
            z0Var4.f31149g.setAlpha((int) (alpha7 * f7));
            canvas.drawPath(z0Var4.h, z0Var4.f31149g);
            z0Var4.f31149g.setAlpha(alpha7);
            z0Var4.f31159r.invalidate();
        } else {
            f16 = 180.0f;
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.i0.L(-13.0f) + rect3.centerX(), org.telegram.messenger.i0.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f), 255, 31);
        if (z0Var4.f31165y) {
            ci0Var4.setAlpha((int) (z0Var4.f31154m * f7));
            ci0Var4.draw(canvas);
        } else {
            ci0Var3.setAlpha((int) (z0Var4.f31156o * f7));
            ci0Var3.draw(canvas);
        }
        org.telegram.ui.Components.t5 t5Var2 = z0Var4.f31151j;
        if (z0Var4.f31150i && !z0Var4.f31165y && !z0Var4.f31152k) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d = t5Var2.d(z11);
        if (d > f13) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(12.0f));
            if (z0Var4.H == null) {
                Paint paint4 = new Paint(1);
                z0Var4.H = paint4;
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(f13, -org.telegram.messenger.i0.L(0.4f), org.telegram.messenger.i0.L(6.666f), org.telegram.messenger.i0.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), z0Var4.H);
            if (z0Var4.I == null) {
                z0Var4.I = new Paint(1);
            }
            z0Var4.I.setColor(z0Var4.f31147c);
            int i37 = (int) (d * 255.0f);
            z0Var4.I.setAlpha(i37);
            rectF2.set(0.0f, org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(6.666f), org.telegram.messenger.i0.L(8.33f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f), z0Var4.I);
            if (z0Var4.L == null || Math.abs(z0Var4.K - org.telegram.messenger.i0.f16171p) > 0.1f) {
                z0Var4.K = org.telegram.messenger.i0.f16171p;
                Path path8 = new Path();
                z0Var4.L = path8;
                path8.moveTo(org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(3.33f));
                z0Var4.L.lineTo(org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(2.0f));
                rectF2.set(org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(0.33f), org.telegram.messenger.i0.L(4.99f), org.telegram.messenger.i0.L(3.6599998f));
                z0Var4.L.arcTo(rectF2, -180.0f, f16, false);
                z0Var4.L.lineTo(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(3.33f));
            }
            if (z0Var4.J == null) {
                Paint paint5 = new Paint(1);
                z0Var4.J = paint5;
                paint5.setStyle(Paint.Style.STROKE);
            }
            z0Var4.J.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
            z0Var4.J.setColor(z0Var4.f31147c);
            z0Var4.J.setAlpha(i37);
            canvas.drawPath(z0Var4.L, z0Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i10, float f7) {
        int i11;
        canvas.save();
        int L = org.telegram.messenger.i0.L(44.0f);
        q1 q1Var = this.f21659a;
        canvas.translate(i10, q1Var.getMediaOffsetY() + L + q1Var.Sa + f7);
        q1Var.J4.draw(canvas);
        canvas.restore();
        kj kjVar = q1Var.O5;
        if (kjVar.D != 0 && kjVar.f16690k.media_unread) {
            Paint paint = org.telegram.ui.ActionBar.t6.S1;
            if (kjVar.P3()) {
                i11 = org.telegram.ui.ActionBar.t6.qc;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21143oe;
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, q1Var.Ob));
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f) + i10 + q1Var.L4, q1Var.getMediaOffsetY() + org.telegram.messenger.i0.L(51.0f) + q1Var.Sa, org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.S1);
        }
    }

    public final void d(kj kjVar, boolean z10) {
        boolean z11;
        boolean z12;
        cj cjVar;
        int L;
        fj fjVar;
        q1 q1Var = this.f21659a;
        sg.p0 p0Var = q1Var.N;
        int i10 = 0;
        if (!q1Var.f22718s6 && kjVar.f16690k.fwd_from != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f22695q9 = z11;
        if ((q1Var.f22559f6 && !kjVar.P3() && (kjVar.Q1() < 0 || kjVar.Q1() == 2666000)) || (((kjVar.o3() && kjVar.A4()) || (kjVar.y3() && kjVar.f16690k.fwd_from.from_id == null)) && ((cjVar = q1Var.L) == null || (cjVar.f15166l & 4) != 0))) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var.f22585h9 = z12;
        if (org.telegram.messenger.i0.Q1()) {
            int Q0 = org.telegram.messenger.i0.Q0();
            if (q1Var.V6) {
                i10 = 71;
            } else if (z10) {
                i10 = 52;
            }
            L = Q0 - org.telegram.messenger.i0.L(i10 + 50);
            q1Var.Z6 = Math.min(org.telegram.messenger.i0.L(270.0f), L);
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.V6) {
                i10 = 71;
            } else if (z10) {
                i10 = 52;
            }
            L = parentWidth - org.telegram.messenger.i0.L(i10 + 50);
            q1Var.Z6 = Math.min(org.telegram.messenger.i0.L(270.0f), L);
        }
        if (q1Var.L != null) {
            q1Var.Z6 = L;
        }
        int u02 = q1Var.u0(L, kjVar);
        q1Var.setMessageObjectInternal(kjVar);
        q1Var.f22738u0 = org.telegram.messenger.i0.L(82.0f) + q1Var.Sa;
        if (org.telegram.messenger.i0.L(76.0f) + u02 >= (q1Var.Z6 - q1Var.f22797y9) - org.telegram.messenger.i0.L(12.0f)) {
            q1Var.f22738u0 = org.telegram.messenger.i0.L(14.0f) + q1Var.f22738u0;
        }
        if (q1Var.L != null && (fjVar = q1Var.K) != null && fjVar.d.size() > 1) {
            if ((q1Var.L.f15166l & 4) == 0) {
                q1Var.f22738u0 -= org.telegram.messenger.i0.L(6.0f);
                q1Var.V1 -= org.telegram.messenger.i0.L(6.0f);
            }
            if ((q1Var.L.f15166l & 8) == 0) {
                q1Var.f22738u0 -= org.telegram.messenger.i0.L(6.0f);
            }
        }
        if (q1Var.I) {
            q1Var.Sa -= org.telegram.messenger.i0.L(1.0f);
        }
        p0Var.getClass();
        p0Var.o(L - org.telegram.messenger.i0.L(24.0f), 3);
        if (!p0Var.f48461p) {
            p0Var.f48459n = org.telegram.messenger.i0.L(12.0f) + p0Var.f48458m;
            q1Var.T2(kjVar);
            int i11 = p0Var.f48460o;
            if (i11 > q1Var.Z6) {
                q1Var.Z6 = i11;
            }
            if (org.telegram.messenger.i0.L(24.0f) + p0Var.f48463r + q1Var.f22797y9 > q1Var.Z6) {
                p0Var.f48459n = org.telegram.messenger.i0.L(12.0f) + p0Var.f48459n;
                p0Var.f48456k -= org.telegram.messenger.i0.L(12.0f);
            }
            if (!kjVar.E0 && kjVar.f16747z != null) {
                p0Var.f48456k = org.telegram.messenger.i0.L(14.0f) + p0Var.f48456k;
            }
            q1Var.f22738u0 += p0Var.f48459n;
        }
    }

    public final void e(kj kjVar, boolean z10) {
        int min;
        float f7;
        q1 q1Var = this.f21659a;
        sg.p0 p0Var = q1Var.N;
        boolean z11 = true;
        q1Var.f22695q9 = !q1Var.f22718s6;
        int i10 = 0;
        if ((!q1Var.f22559f6 || kjVar.P3() || (kjVar.Q1() >= 0 && kjVar.Q1() != 2666000)) && ((!kjVar.o3() || !kjVar.A4()) && ((!kjVar.y3() || kjVar.f16690k.fwd_from.from_id != null) && (!q1Var.W6 || kjVar.P3() || (!q1Var.f22606j6 && (!q1Var.f22619k6 || !q1Var.U6)))))) {
            z11 = false;
        }
        q1Var.f22585h9 = z11;
        if (org.telegram.messenger.i0.Q1()) {
            int Q0 = org.telegram.messenger.i0.Q0();
            if (q1Var.V6) {
                i10 = 71;
            } else if (z10) {
                i10 = 52;
            }
            min = Math.min(Q0 - org.telegram.messenger.i0.L(i10 + 50), org.telegram.messenger.i0.L(270.0f));
            q1Var.Z6 = min;
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.V6) {
                i10 = 71;
            } else if (z10) {
                i10 = 52;
            }
            min = Math.min(parentWidth - org.telegram.messenger.i0.L(i10 + 50), org.telegram.messenger.i0.L(270.0f));
            q1Var.Z6 = min;
        }
        q1Var.u0(q1Var.Z6, kjVar);
        q1Var.setMessageObjectInternal(kjVar);
        int L = org.telegram.messenger.i0.L(70.0f);
        int i11 = q1Var.Sa;
        q1Var.f22738u0 = L + i11;
        if (q1Var.I) {
            q1Var.Sa = i11 - org.telegram.messenger.i0.L(1.0f);
        }
        p0Var.getClass();
        if (kjVar.P3()) {
            f7 = 32.0f;
        } else {
            f7 = 24.0f;
        }
        p0Var.o(min - org.telegram.messenger.i0.L(f7), 3);
        if (!p0Var.f48461p) {
            p0Var.f48459n = p0Var.f48458m;
            if (TextUtils.isEmpty(kjVar.f16747z)) {
                p0Var.f48459n = org.telegram.messenger.i0.L(12.0f) + p0Var.f48459n;
            } else {
                p0Var.f48459n = org.telegram.messenger.i0.L(8.0f) + p0Var.f48459n;
            }
            int i12 = p0Var.f48460o;
            if (i12 > q1Var.Z6) {
                q1Var.Z6 = i12;
            }
            int L2 = org.telegram.messenger.i0.L(6.0f) + q1Var.f22797y9;
            if (kj.b4(kjVar.f16690k) && !kjVar.n4()) {
                L2 -= org.telegram.messenger.i0.L(3.0f);
            } else if (kjVar.P3()) {
                L2 += org.telegram.messenger.i0.L(20.5f);
            }
            if (p0Var.f48463r + q1Var.getExtraTimeX() + L2 >= q1Var.Z6) {
                p0Var.f48459n = org.telegram.messenger.i0.L(12.0f) + p0Var.f48459n;
                p0Var.f48456k -= org.telegram.messenger.i0.L(12.0f);
            }
            q1Var.f22738u0 += p0Var.f48459n;
        }
    }
}
