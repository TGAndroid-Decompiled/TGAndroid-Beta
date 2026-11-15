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
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.yi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.x11;
public final class c1 {
    public final q1 f30083a;
    public float f30084b;
    public float f30085c;
    public StaticLayout d;
    public int f30086e;
    public StaticLayout f30087f;
    public int f30088g;
    public float h;

    public c1(q1 q1Var) {
        this.f30083a = q1Var;
    }

    public final void a(android.graphics.Canvas r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c1.a(android.graphics.Canvas, float, float):void");
    }

    public final void b(Canvas canvas, float f10, float f11, int i7) {
        float f12;
        int i10;
        float L;
        int i11;
        float L2;
        float f13;
        float f14;
        int i12;
        int i13;
        int i14;
        float videoTranscriptionProgress;
        float videoTranscriptionProgress2;
        boolean z10;
        float f15;
        Paint paint;
        float f16;
        float f17;
        boolean z11;
        float f18;
        int i15;
        Paint a22;
        boolean z12;
        canvas.save();
        q1 q1Var = this.f30083a;
        x1 x1Var = q1Var.f31018ib;
        int currentBackgroundRight = q1Var.getCurrentBackgroundRight() - q1Var.getCurrentBackgroundLeft();
        if (q1Var.G) {
            f12 = 6.0f;
        } else {
            f12 = 0.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f12) + currentBackgroundRight;
        if (q1Var.R1) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int L4 = L3 - org.telegram.messenger.g0.L(i10 + 128);
        if (q1Var.J4 == null) {
            b1 b1Var = new b1(this, q1Var, q1Var.E4);
            q1Var.J4 = b1Var;
            gj gjVar = q1Var.Q5;
            TLRPC.Message message = gjVar.f23817k;
            if (message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && x11.l(gjVar)) {
                z12 = true;
            } else {
                z12 = false;
            }
            b1Var.s(z12, false);
            q1Var.J4.q(x11.k(q1Var.Q5), false);
            q1Var.J4.r(x11.u(q1Var.Q5), false);
        }
        if (q1Var.F8 != 0) {
            this.f30084b = org.telegram.messenger.g0.T1(org.telegram.messenger.k5.C(21.0f, i7, L4), q1Var.R8, 1.0f - q1Var.getVideoTranscriptionProgress());
            this.f30085c = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(3.0f) + q1Var.H4, q1Var.S8 - org.telegram.messenger.g0.L(40.0f), 1.0f - q1Var.getVideoTranscriptionProgress());
        } else {
            float C = org.telegram.messenger.k5.C(21.0f, i7, L4);
            gj gjVar2 = q1Var.Q5;
            if (gjVar2 != null && gjVar2.P3()) {
                L = (org.telegram.messenger.g0.L(28.0f) * f11) + (q1Var.getCurrentBackgroundLeft() - org.telegram.messenger.g0.L(40.0f));
            } else if (q1Var.u2()) {
                L = Math.min(q1Var.getPhotoImage().y() + org.telegram.messenger.g0.L(8.0f), q1Var.getCompactRight() - org.telegram.messenger.g0.L(32.0f));
            } else {
                L = (org.telegram.messenger.g0.L(8.0f) + q1Var.getCurrentBackgroundRight()) - (org.telegram.messenger.g0.L(40.0f) * f11);
            }
            this.f30084b = org.telegram.messenger.g0.T1(C, L, 1.0f - q1Var.getVideoTranscriptionProgress());
            float f19 = q1Var.f30962e7 + x1Var.f31957j0;
            if (q1Var.K) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            float L5 = f19 - org.telegram.messenger.g0.L(28 - i11);
            ch.q0 q0Var = q1Var.O;
            if (!q0Var.f5204p) {
                L5 -= q0Var.i(x1Var.L1);
            }
            float T1 = org.telegram.messenger.g0.T1(L5, (q1Var.getMediaOffsetY() + (org.telegram.messenger.g0.L(44.0f) + q1Var.Ua)) - org.telegram.messenger.g0.L(1.7f), q1Var.getVideoTranscriptionProgress()) + org.telegram.messenger.g0.L(1.7f);
            float L6 = org.telegram.messenger.g0.L(3.0f) + q1Var.H4;
            float L7 = T1 - org.telegram.messenger.g0.L(12.0f);
            if (q1Var.Q5.P3()) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(28.0f) * f11;
            }
            this.f30085c = org.telegram.messenger.g0.T1(L6, L7 - L2, 1.0f - q1Var.getVideoTranscriptionProgress());
        }
        b1 b1Var2 = q1Var.J4;
        int i16 = (int) this.f30084b;
        int i17 = (int) this.f30085c;
        int W1 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(32.0f));
        int W12 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f));
        int W13 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f));
        Rect rect = b1Var2.f41529u;
        if (W1 == rect.width() && W12 == rect.height()) {
            f13 = 40.0f;
            f14 = 0.0f;
            i12 = 2;
        } else {
            float f20 = W1 / 2.0f;
            f13 = 40.0f;
            float f21 = W13;
            f14 = 0.0f;
            float f22 = W12 / 2.0f;
            i12 = 2;
            b1Var2.F = (float) ((Math.atan((f20 - f21) / f22) * 180.0d) / 3.141592653589793d);
            b1Var2.G = (float) ((Math.atan(f20 / (f22 - f21)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i16, i17, i16 + W1, i17 + W12);
        int min = Math.min(Math.min(W1, W12) / 2, W13);
        b1Var2.D = min;
        b1Var2.E = min * 2;
        b1 b1Var3 = q1Var.J4;
        if (q1Var.u2()) {
            i13 = org.telegram.ui.ActionBar.j6.Ta;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.Zc;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i13, q1Var.Qb);
        if (q1Var.Q5.P3()) {
            i14 = org.telegram.ui.ActionBar.j6.Jc;
        } else {
            i14 = org.telegram.ui.ActionBar.j6.tk;
        }
        int w03 = org.telegram.ui.ActionBar.j6.w0(i14, q1Var.Qb);
        if (q1Var.M1 == 3) {
            videoTranscriptionProgress = 1.0f;
        } else {
            videoTranscriptionProgress = q1Var.getVideoTranscriptionProgress();
        }
        int f23 = i0.a.f(videoTranscriptionProgress, w02, w03);
        org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, q1Var.Qb);
        q1Var.Q5.N3();
        if (q1Var.M1 == 3) {
            videoTranscriptionProgress2 = f14;
        } else {
            videoTranscriptionProgress2 = 1.0f - q1Var.getVideoTranscriptionProgress();
        }
        ch0 ch0Var = b1Var3.f41524p;
        ch0 ch0Var2 = b1Var3.f41522n;
        if (b1Var3.f41512b != f23) {
            z10 = true;
        } else {
            z10 = false;
        }
        b1Var3.f41512b = f23;
        b1Var3.f41513c = f23;
        int o4 = i0.a.o(f23, (int) (Color.alpha(f23) * 0.156f));
        b1Var3.f41511a = o4;
        b1Var3.f41514e = videoTranscriptionProgress2;
        float alpha = Color.alpha(f23);
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            f15 = 0.3f;
        } else {
            f15 = 0.2f;
        }
        b1Var3.d = org.telegram.ui.ActionBar.j6.w(o4, i0.a.o(f23, (int) (alpha * f15)));
        if (b1Var3.f41515f == null) {
            b1Var3.f41515f = new Paint();
        }
        b1Var3.f41515f.setColor(b1Var3.f41511a);
        b1Var3.f41515f.setAlpha((int) ((1.0f - videoTranscriptionProgress2) * paint.getAlpha()));
        if (z10 || b1Var3.f41525q == null) {
            int L8 = org.telegram.messenger.g0.L(8.0f);
            int i18 = b1Var3.d;
            y k02 = org.telegram.ui.ActionBar.j6.k0(L8, L8, L8, L8, 0, i18, i18);
            b1Var3.f41525q = k02;
            k02.setCallback(b1Var3.f41526r);
        }
        if (z10) {
            ch0Var2.f33571a0 = true;
            ch0Var2.Q(b1Var3.f41513c, "Artboard Outlines");
            ch0Var2.o();
            ch0Var2.J(true);
            ch0Var2.V(0L);
            int alpha2 = Color.alpha(f23);
            b1Var3.f41521m = alpha2;
            ch0Var2.setAlpha(alpha2);
            ch0Var.f33571a0 = true;
            ch0Var.Q(b1Var3.f41513c, "Artboard Outlines");
            ch0Var.o();
            ch0Var.J(true);
            ch0Var.V(0L);
            int alpha3 = Color.alpha(f23);
            b1Var3.f41523o = alpha3;
            ch0Var.setAlpha(alpha3);
        }
        if (b1Var3.f41516g == null) {
            Paint paint2 = new Paint(1);
            b1Var3.f41516g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            b1Var3.f41516g.setStrokeCap(Paint.Cap.ROUND);
        }
        b1Var3.f41516g.setColor(f23);
        b1 b1Var4 = q1Var.J4;
        ch0 ch0Var3 = b1Var4.f41524p;
        ch0 ch0Var4 = b1Var4.f41522n;
        Rect rect2 = b1Var4.v;
        Rect rect3 = b1Var4.f41529u;
        rect2.set(rect3.left - org.telegram.messenger.g0.L(8.0f), rect3.top - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + rect3.right, org.telegram.messenger.g0.L(8.0f) + rect3.bottom);
        Path path = b1Var4.C;
        if (path == null) {
            b1Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect3);
        Path path2 = b1Var4.C;
        float f24 = b1Var4.D;
        path2.addRoundRect(rectF, f24, f24, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(b1Var4.C);
        float f25 = b1Var4.f41514e * f10;
        if (f25 > f14) {
            q1 q1Var2 = b1Var4.U.f30083a;
            if (q1Var2.Q5.P5()) {
                a22 = q1Var2.a2("paintChatActionBackground");
            } else {
                a22 = q1Var2.a2("paintChatTimeBackground");
            }
            int alpha4 = a22.getAlpha();
            a22.setAlpha((int) (alpha4 * f25));
            q1Var2.x();
            canvas.drawRect(rect3, a22);
            if (a22 == q1Var2.a2("paintChatActionBackground") && q1Var2.h2()) {
                int alpha5 = org.telegram.ui.ActionBar.j6.f28919h2.getAlpha();
                org.telegram.ui.ActionBar.j6.f28919h2.setAlpha((int) (alpha5 * f25));
                canvas.drawRect(rect3, org.telegram.ui.ActionBar.j6.f28919h2);
                org.telegram.ui.ActionBar.j6.f28919h2.setAlpha(alpha5);
            }
            a22.setAlpha(alpha4);
        }
        Paint paint3 = b1Var4.f41515f;
        if (paint3 != null) {
            int alpha6 = paint3.getAlpha();
            b1Var4.f41515f.setAlpha((int) (alpha6 * f10));
            canvas.drawRect(rect3, b1Var4.f41515f);
            b1Var4.f41515f.setAlpha(alpha6);
        }
        y yVar = b1Var4.f41525q;
        if (yVar != null) {
            yVar.setBounds(rect3);
            b1Var4.f41525q.draw(canvas);
        }
        canvas.restore();
        org.telegram.ui.Components.u5 u5Var = b1Var4.f41520l;
        if (b1Var4.f41519k) {
            f16 = 1.0f;
        } else {
            f16 = f14;
        }
        float e10 = u5Var.e(false, f16);
        if (e10 > f14) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - b1Var4.f41528t)) * 0.75f;
            x1.a aVar = b1Var4.B;
            if (b1Var4.M == null) {
                b1Var4.M = new float[i12];
            }
            long j3 = elapsedRealtime % 5400;
            float[] fArr = b1Var4.M;
            float f26 = ((float) (1520 * j3)) / 5400.0f;
            fArr[0] = f26 - 20.0f;
            char c10 = 1;
            fArr[1] = f26;
            int i19 = 0;
            while (i19 < 4) {
                float[] fArr2 = b1Var4.M;
                fArr2[1] = (aVar.getInterpolation(((float) (j3 - (i19 * 1350))) / 667.0f) * 250.0f) + fArr2[c10];
                float[] fArr3 = b1Var4.M;
                fArr3[0] = (aVar.getInterpolation(((float) (j3 - (i15 + 667))) / 667.0f) * 250.0f) + fArr3[0];
                i19++;
                c10 = 1;
            }
            f17 = 180.0f;
            float[] fArr4 = b1Var4.M;
            Path path3 = b1Var4.h;
            if (path3 == null) {
                b1Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e10 * f13, fArr4[1] - fArr4[0]);
            float f27 = fArr4[0];
            float f28 = (1.0f - e10) * max;
            if (b1Var4.f41519k) {
                f18 = f14;
            } else {
                f18 = 1.0f;
            }
            float f29 = (f28 * f18) + f27;
            float f30 = (max * e10) + f29;
            float f31 = f29 % 360.0f;
            float f32 = f30 % 360.0f;
            if (f31 < f14) {
                f31 += 360.0f;
            }
            float f33 = f31;
            if (f32 < f14) {
                f32 += 360.0f;
            }
            float f34 = f32;
            Path path4 = b1Var4.h;
            int centerX = rect3.centerX();
            int i20 = rect3.top;
            x11.d(path4, centerX, i20, rect3.right - b1Var4.D, i20, f33, f34, 0.0f, b1Var4.F);
            x11.b(b1Var4.h, rect3.right, rect3.top, b1Var4.E, 1, f33, f34, b1Var4.F, b1Var4.G);
            Path path5 = b1Var4.h;
            int i21 = rect3.right;
            int i22 = rect3.top;
            int i23 = b1Var4.D;
            int i24 = i22 + i23;
            int i25 = rect3.bottom - i23;
            float f35 = b1Var4.G;
            x11.d(path5, i21, i24, i21, i25, f33, f34, f35, 180.0f - f35);
            x11.b(b1Var4.h, rect3.right, rect3.bottom, b1Var4.E, 2, f33, f34, 180.0f - b1Var4.G, 180.0f - b1Var4.F);
            Path path6 = b1Var4.h;
            int i26 = rect3.right;
            int i27 = b1Var4.D;
            int i28 = i26 - i27;
            int i29 = rect3.bottom;
            int i30 = rect3.left + i27;
            float f36 = b1Var4.F;
            x11.d(path6, i28, i29, i30, i29, f33, f34, 180.0f - f36, f36 + 180.0f);
            x11.b(b1Var4.h, rect3.left, rect3.bottom, b1Var4.E, 3, f33, f34, b1Var4.F + 180.0f, b1Var4.G + 180.0f);
            Path path7 = b1Var4.h;
            int i31 = rect3.left;
            int i32 = rect3.bottom;
            int i33 = b1Var4.D;
            int i34 = i32 - i33;
            int i35 = rect3.top + i33;
            float f37 = b1Var4.G;
            x11.d(path7, i31, i34, i31, i35, f33, f34, f37 + 180.0f, 360.0f - f37);
            x11.b(b1Var4.h, rect3.left, rect3.top, b1Var4.E, 4, f33, f34, 360.0f - b1Var4.G, 360.0f - b1Var4.F);
            x11.d(b1Var4.h, rect3.left + b1Var4.D, rect3.top, rect3.centerX(), rect3.top, f33, f34, 360.0f - b1Var4.F, 360.0f);
            b1Var4.f41516g.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            int alpha7 = b1Var4.f41516g.getAlpha();
            b1Var4.f41516g.setAlpha((int) (alpha7 * f10));
            canvas.drawPath(b1Var4.h, b1Var4.f41516g);
            b1Var4.f41516g.setAlpha(alpha7);
            b1Var4.f41526r.invalidate();
        } else {
            f17 = 180.0f;
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-13.0f) + rect3.centerX(), org.telegram.messenger.g0.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), 255, 31);
        if (b1Var4.f41532y) {
            ch0Var4.setAlpha((int) (b1Var4.f41521m * f10));
            ch0Var4.draw(canvas);
        } else {
            ch0Var3.setAlpha((int) (b1Var4.f41523o * f10));
            ch0Var3.draw(canvas);
        }
        org.telegram.ui.Components.u5 u5Var2 = b1Var4.f41518j;
        if (b1Var4.f41517i && !b1Var4.f41532y && !b1Var4.f41519k) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d = u5Var2.d(z11);
        if (d > f14) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
            if (b1Var4.H == null) {
                Paint paint4 = new Paint(1);
                b1Var4.H = paint4;
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f14, -org.telegram.messenger.g0.L(0.4f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), b1Var4.H);
            if (b1Var4.I == null) {
                b1Var4.I = new Paint(1);
            }
            b1Var4.I.setColor(b1Var4.f41513c);
            int i36 = (int) (d * 255.0f);
            b1Var4.I.setAlpha(i36);
            rectF2.set(0.0f, org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.33f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), b1Var4.I);
            if (b1Var4.L == null || Math.abs(b1Var4.K - org.telegram.messenger.g0.f23608p) > 0.1f) {
                b1Var4.K = org.telegram.messenger.g0.f23608p;
                Path path8 = new Path();
                b1Var4.L = path8;
                path8.moveTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(3.33f));
                b1Var4.L.lineTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(2.0f));
                rectF2.set(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(0.33f), org.telegram.messenger.g0.L(4.99f), org.telegram.messenger.g0.L(3.6599998f));
                b1Var4.L.arcTo(rectF2, -180.0f, f17, false);
                b1Var4.L.lineTo(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.33f));
            }
            if (b1Var4.J == null) {
                Paint paint5 = new Paint(1);
                b1Var4.J = paint5;
                paint5.setStyle(Paint.Style.STROKE);
            }
            b1Var4.J.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            b1Var4.J.setColor(b1Var4.f41513c);
            b1Var4.J.setAlpha(i36);
            canvas.drawPath(b1Var4.L, b1Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i7, float f10) {
        int i10;
        canvas.save();
        int L = org.telegram.messenger.g0.L(44.0f);
        q1 q1Var = this.f30083a;
        canvas.translate(i7, q1Var.getMediaOffsetY() + L + q1Var.Ua + f10);
        q1Var.L4.draw(canvas);
        canvas.restore();
        gj gjVar = q1Var.Q5;
        if (gjVar.D != 0 && gjVar.f23817k.media_unread) {
            Paint paint = org.telegram.ui.ActionBar.j6.S1;
            if (gjVar.P3()) {
                i10 = org.telegram.ui.ActionBar.j6.f29151tc;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f29116re;
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, q1Var.Qb));
            canvas.drawCircle(org.telegram.messenger.g0.L(6.0f) + i7 + q1Var.N4, q1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(51.0f) + q1Var.Ua, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.j6.S1);
        }
    }

    public final void d(gj gjVar, boolean z10) {
        boolean z11;
        boolean z12;
        yi yiVar;
        int L;
        bj bjVar;
        q1 q1Var = this.f30083a;
        ch.q0 q0Var = q1Var.O;
        int i7 = 0;
        if (!q1Var.f31173u6 && gjVar.f23817k.fwd_from != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.s9 = z11;
        if ((q1Var.f31001h6 && !gjVar.P3() && (gjVar.P1() < 0 || gjVar.P1() == 2666000)) || (((gjVar.o3() && gjVar.A4()) || (gjVar.y3() && gjVar.f23817k.fwd_from.from_id == null)) && ((yiVar = q1Var.M) == null || (yiVar.f27753l & 4) != 0))) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var.f31029j9 = z12;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            L = Q0 - org.telegram.messenger.g0.L(i7 + 50);
            q1Var.f30923b7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            L = parentWidth - org.telegram.messenger.g0.L(i7 + 50);
            q1Var.f30923b7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        }
        if (q1Var.M != null) {
            q1Var.f30923b7 = L;
        }
        int w02 = q1Var.w0(L, gjVar);
        q1Var.setMessageObjectInternal(gjVar);
        q1Var.f31181v0 = org.telegram.messenger.g0.L(82.0f) + q1Var.Ua;
        if (org.telegram.messenger.g0.L(76.0f) + w02 >= (q1Var.f30923b7 - q1Var.A9) - org.telegram.messenger.g0.L(12.0f)) {
            q1Var.f31181v0 = org.telegram.messenger.g0.L(14.0f) + q1Var.f31181v0;
        }
        if (q1Var.M != null && (bjVar = q1Var.L) != null && bjVar.d.size() > 1) {
            if ((q1Var.M.f27753l & 4) == 0) {
                q1Var.f31181v0 -= org.telegram.messenger.g0.L(6.0f);
                q1Var.X1 -= org.telegram.messenger.g0.L(6.0f);
            }
            if ((q1Var.M.f27753l & 8) == 0) {
                q1Var.f31181v0 -= org.telegram.messenger.g0.L(6.0f);
            }
        }
        if (q1Var.J) {
            q1Var.Ua -= org.telegram.messenger.g0.L(1.0f);
        }
        q0Var.getClass();
        q0Var.o(L - org.telegram.messenger.g0.L(24.0f), 3);
        if (!q0Var.f5204p) {
            q0Var.f5202n = org.telegram.messenger.g0.L(12.0f) + q0Var.f5201m;
            q1Var.X2(gjVar);
            int i10 = q0Var.f5203o;
            if (i10 > q1Var.f30923b7) {
                q1Var.f30923b7 = i10;
            }
            if (org.telegram.messenger.g0.L(24.0f) + q0Var.f5206r + q1Var.A9 > q1Var.f30923b7) {
                q0Var.f5202n = org.telegram.messenger.g0.L(12.0f) + q0Var.f5202n;
                q0Var.f5199k -= org.telegram.messenger.g0.L(12.0f);
            }
            if (!gjVar.G0 && gjVar.f23875z != null) {
                q0Var.f5199k = org.telegram.messenger.g0.L(14.0f) + q0Var.f5199k;
            }
            q1Var.f31181v0 += q0Var.f5202n;
        }
    }

    public final void e(gj gjVar, boolean z10) {
        int min;
        float f10;
        q1 q1Var = this.f30083a;
        ch.q0 q0Var = q1Var.O;
        boolean z11 = true;
        q1Var.s9 = !q1Var.f31173u6;
        int i7 = 0;
        if ((!q1Var.f31001h6 || gjVar.P3() || (gjVar.P1() >= 0 && gjVar.P1() != 2666000)) && ((!gjVar.o3() || !gjVar.A4()) && ((!gjVar.y3() || gjVar.f23817k.fwd_from.from_id != null) && (!q1Var.Y6 || gjVar.P3() || (!q1Var.f31052l6 && (!q1Var.f31065m6 || !q1Var.W6)))))) {
            z11 = false;
        }
        q1Var.f31029j9 = z11;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            min = Math.min(Q0 - org.telegram.messenger.g0.L(i7 + 50), org.telegram.messenger.g0.L(270.0f));
            q1Var.f30923b7 = min;
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            min = Math.min(parentWidth - org.telegram.messenger.g0.L(i7 + 50), org.telegram.messenger.g0.L(270.0f));
            q1Var.f30923b7 = min;
        }
        q1Var.w0(q1Var.f30923b7, gjVar);
        q1Var.setMessageObjectInternal(gjVar);
        int L = org.telegram.messenger.g0.L(70.0f);
        int i10 = q1Var.Ua;
        q1Var.f31181v0 = L + i10;
        if (q1Var.J) {
            q1Var.Ua = i10 - org.telegram.messenger.g0.L(1.0f);
        }
        q0Var.getClass();
        if (gjVar.P3()) {
            f10 = 32.0f;
        } else {
            f10 = 24.0f;
        }
        q0Var.o(min - org.telegram.messenger.g0.L(f10), 3);
        if (!q0Var.f5204p) {
            q0Var.f5202n = q0Var.f5201m;
            if (TextUtils.isEmpty(gjVar.f23875z)) {
                q0Var.f5202n = org.telegram.messenger.g0.L(12.0f) + q0Var.f5202n;
            } else {
                q0Var.f5202n = org.telegram.messenger.g0.L(8.0f) + q0Var.f5202n;
            }
            int i11 = q0Var.f5203o;
            if (i11 > q1Var.f30923b7) {
                q1Var.f30923b7 = i11;
            }
            int L2 = org.telegram.messenger.g0.L(6.0f) + q1Var.A9;
            if (gj.b4(gjVar.f23817k) && !gjVar.n4()) {
                L2 -= org.telegram.messenger.g0.L(3.0f);
            } else if (gjVar.P3()) {
                L2 += org.telegram.messenger.g0.L(20.5f);
            }
            if (q0Var.f5206r + q1Var.getExtraTimeX() + L2 >= q1Var.f30923b7) {
                q0Var.f5202n = org.telegram.messenger.g0.L(12.0f) + q0Var.f5202n;
                q0Var.f5199k -= org.telegram.messenger.g0.L(12.0f);
            }
            q1Var.f31181v0 += q0Var.f5202n;
        }
    }
}
