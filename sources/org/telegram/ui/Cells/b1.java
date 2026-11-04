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
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.m11;
public final class b1 {
    public final q1 f28976a;
    public float f28977b;
    public float f28978c;
    public StaticLayout d;
    public int f28979e;
    public StaticLayout f28980f;
    public int f28981g;
    public float h;

    public b1(q1 q1Var) {
        this.f28976a = q1Var;
    }

    public final void a(android.graphics.Canvas r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b1.a(android.graphics.Canvas, float, float):void");
    }

    public final void b(Canvas canvas, float f10, float f11, int i3) {
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
        Paint Z1;
        boolean z12;
        canvas.save();
        q1 q1Var = this.f28976a;
        x1 x1Var = q1Var.hb;
        int currentBackgroundRight = q1Var.getCurrentBackgroundRight() - q1Var.getCurrentBackgroundLeft();
        if (q1Var.G) {
            f12 = 6.0f;
        } else {
            f12 = 0.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f12) + currentBackgroundRight;
        if (q1Var.Q1) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int L4 = L3 - org.telegram.messenger.g0.L(i10 + 128);
        if (q1Var.I4 == null) {
            a1 a1Var = new a1(this, q1Var, q1Var.D4);
            q1Var.I4 = a1Var;
            zi ziVar = q1Var.P5;
            TLRPC.Message message = ziVar.f26868k;
            if (message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && m11.k(ziVar)) {
                z12 = true;
            } else {
                z12 = false;
            }
            a1Var.q(z12, false);
            q1Var.I4.o(m11.j(q1Var.P5), false);
            q1Var.I4.p(m11.s(q1Var.P5), false);
        }
        if (q1Var.E8 != 0) {
            this.f28977b = org.telegram.messenger.g0.T1(org.telegram.messenger.k5.C(21.0f, i3, L4), q1Var.Q8, 1.0f - q1Var.getVideoTranscriptionProgress());
            this.f28978c = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(3.0f) + q1Var.G4, q1Var.R8 - org.telegram.messenger.g0.L(40.0f), 1.0f - q1Var.getVideoTranscriptionProgress());
        } else {
            float C = org.telegram.messenger.k5.C(21.0f, i3, L4);
            zi ziVar2 = q1Var.P5;
            if (ziVar2 != null && ziVar2.Q3()) {
                L = (org.telegram.messenger.g0.L(28.0f) * f11) + (q1Var.getCurrentBackgroundLeft() - org.telegram.messenger.g0.L(40.0f));
            } else if (q1Var.t2()) {
                L = Math.min(q1Var.getPhotoImage().y() + org.telegram.messenger.g0.L(8.0f), q1Var.getCompactRight() - org.telegram.messenger.g0.L(32.0f));
            } else {
                L = (org.telegram.messenger.g0.L(8.0f) + q1Var.getCurrentBackgroundRight()) - (org.telegram.messenger.g0.L(40.0f) * f11);
            }
            this.f28977b = org.telegram.messenger.g0.T1(C, L, 1.0f - q1Var.getVideoTranscriptionProgress());
            float f19 = q1Var.f29887d7 + x1Var.f30880j0;
            if (q1Var.K) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            float L5 = f19 - org.telegram.messenger.g0.L(28 - i11);
            dh.o0 o0Var = q1Var.O;
            if (!o0Var.f9125p) {
                L5 -= o0Var.i(x1Var.L1);
            }
            float T1 = org.telegram.messenger.g0.T1(L5, (q1Var.getMediaOffsetY() + (org.telegram.messenger.g0.L(44.0f) + q1Var.Ta)) - org.telegram.messenger.g0.L(1.7f), q1Var.getVideoTranscriptionProgress()) + org.telegram.messenger.g0.L(1.7f);
            float L6 = org.telegram.messenger.g0.L(3.0f) + q1Var.G4;
            float L7 = T1 - org.telegram.messenger.g0.L(12.0f);
            if (q1Var.P5.Q3()) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(28.0f) * f11;
            }
            this.f28978c = org.telegram.messenger.g0.T1(L6, L7 - L2, 1.0f - q1Var.getVideoTranscriptionProgress());
        }
        a1 a1Var2 = q1Var.I4;
        int i16 = (int) this.f28977b;
        int i17 = (int) this.f28978c;
        int W1 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(32.0f));
        int W12 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f));
        int W13 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f));
        Rect rect = a1Var2.f35974u;
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
            a1Var2.F = (float) ((Math.atan((f20 - f21) / f22) * 180.0d) / 3.141592653589793d);
            a1Var2.G = (float) ((Math.atan(f20 / (f22 - f21)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i16, i17, i16 + W1, i17 + W12);
        int min = Math.min(Math.min(W1, W12) / 2, W13);
        a1Var2.D = min;
        a1Var2.E = min * 2;
        a1 a1Var3 = q1Var.I4;
        if (q1Var.t2()) {
            i13 = org.telegram.ui.ActionBar.k6.Ta;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.Wc;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, q1Var.Pb);
        if (q1Var.P5.Q3()) {
            i14 = org.telegram.ui.ActionBar.k6.Gc;
        } else {
            i14 = org.telegram.ui.ActionBar.k6.qk;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(i14, q1Var.Pb);
        if (q1Var.L1 == 3) {
            videoTranscriptionProgress = 1.0f;
        } else {
            videoTranscriptionProgress = q1Var.getVideoTranscriptionProgress();
        }
        int f23 = i0.a.f(videoTranscriptionProgress, w02, w03);
        org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, q1Var.Pb);
        q1Var.P5.O3();
        if (q1Var.L1 == 3) {
            videoTranscriptionProgress2 = f14;
        } else {
            videoTranscriptionProgress2 = 1.0f - q1Var.getVideoTranscriptionProgress();
        }
        ch0 ch0Var = a1Var3.f35969p;
        ch0 ch0Var2 = a1Var3.f35967n;
        if (a1Var3.f35957b != f23) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1Var3.f35957b = f23;
        a1Var3.f35958c = f23;
        int o10 = i0.a.o(f23, (int) (Color.alpha(f23) * 0.156f));
        a1Var3.f35956a = o10;
        a1Var3.f35959e = videoTranscriptionProgress2;
        float alpha = Color.alpha(f23);
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            f15 = 0.3f;
        } else {
            f15 = 0.2f;
        }
        a1Var3.d = org.telegram.ui.ActionBar.k6.w(o10, i0.a.o(f23, (int) (alpha * f15)));
        if (a1Var3.f35960f == null) {
            a1Var3.f35960f = new Paint();
        }
        a1Var3.f35960f.setColor(a1Var3.f35956a);
        a1Var3.f35960f.setAlpha((int) ((1.0f - videoTranscriptionProgress2) * paint.getAlpha()));
        if (z10 || a1Var3.f35970q == null) {
            int L8 = org.telegram.messenger.g0.L(8.0f);
            int i18 = a1Var3.d;
            y k02 = org.telegram.ui.ActionBar.k6.k0(L8, L8, L8, L8, 0, i18, i18);
            a1Var3.f35970q = k02;
            k02.setCallback(a1Var3.f35971r);
        }
        if (z10) {
            ch0Var2.f32719a0 = true;
            ch0Var2.Q(a1Var3.f35958c, "Artboard Outlines");
            ch0Var2.o();
            ch0Var2.J(true);
            ch0Var2.V(0L);
            int alpha2 = Color.alpha(f23);
            a1Var3.f35966m = alpha2;
            ch0Var2.setAlpha(alpha2);
            ch0Var.f32719a0 = true;
            ch0Var.Q(a1Var3.f35958c, "Artboard Outlines");
            ch0Var.o();
            ch0Var.J(true);
            ch0Var.V(0L);
            int alpha3 = Color.alpha(f23);
            a1Var3.f35968o = alpha3;
            ch0Var.setAlpha(alpha3);
        }
        if (a1Var3.f35961g == null) {
            Paint paint2 = new Paint(1);
            a1Var3.f35961g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            a1Var3.f35961g.setStrokeCap(Paint.Cap.ROUND);
        }
        a1Var3.f35961g.setColor(f23);
        a1 a1Var4 = q1Var.I4;
        ch0 ch0Var3 = a1Var4.f35969p;
        ch0 ch0Var4 = a1Var4.f35967n;
        Rect rect2 = a1Var4.v;
        Rect rect3 = a1Var4.f35974u;
        rect2.set(rect3.left - org.telegram.messenger.g0.L(8.0f), rect3.top - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + rect3.right, org.telegram.messenger.g0.L(8.0f) + rect3.bottom);
        Path path = a1Var4.C;
        if (path == null) {
            a1Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect3);
        Path path2 = a1Var4.C;
        float f24 = a1Var4.D;
        path2.addRoundRect(rectF, f24, f24, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(a1Var4.C);
        float f25 = a1Var4.f35959e * f10;
        if (f25 > f14) {
            q1 q1Var2 = a1Var4.R.f28976a;
            if (q1Var2.P5.Q5()) {
                Z1 = q1Var2.Z1("paintChatActionBackground");
            } else {
                Z1 = q1Var2.Z1("paintChatTimeBackground");
            }
            int alpha4 = Z1.getAlpha();
            Z1.setAlpha((int) (alpha4 * f25));
            q1Var2.x();
            canvas.drawRect(rect3, Z1);
            if (Z1 == q1Var2.Z1("paintChatActionBackground") && q1Var2.g2()) {
                int alpha5 = org.telegram.ui.ActionBar.k6.f27951h2.getAlpha();
                org.telegram.ui.ActionBar.k6.f27951h2.setAlpha((int) (alpha5 * f25));
                canvas.drawRect(rect3, org.telegram.ui.ActionBar.k6.f27951h2);
                org.telegram.ui.ActionBar.k6.f27951h2.setAlpha(alpha5);
            }
            Z1.setAlpha(alpha4);
        }
        Paint paint3 = a1Var4.f35960f;
        if (paint3 != null) {
            int alpha6 = paint3.getAlpha();
            a1Var4.f35960f.setAlpha((int) (alpha6 * f10));
            canvas.drawRect(rect3, a1Var4.f35960f);
            a1Var4.f35960f.setAlpha(alpha6);
        }
        y yVar = a1Var4.f35970q;
        if (yVar != null) {
            yVar.setBounds(rect3);
            a1Var4.f35970q.draw(canvas);
        }
        canvas.restore();
        org.telegram.ui.Components.u5 u5Var = a1Var4.f35965l;
        if (a1Var4.f35964k) {
            f16 = 1.0f;
        } else {
            f16 = f14;
        }
        float e10 = u5Var.e(false, f16);
        if (e10 > f14) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - a1Var4.f35973t)) * 0.75f;
            w1.a aVar = a1Var4.B;
            if (a1Var4.M == null) {
                a1Var4.M = new float[i12];
            }
            long j10 = elapsedRealtime % 5400;
            float[] fArr = a1Var4.M;
            float f26 = ((float) (1520 * j10)) / 5400.0f;
            fArr[0] = f26 - 20.0f;
            char c2 = 1;
            fArr[1] = f26;
            int i19 = 0;
            while (i19 < 4) {
                float[] fArr2 = a1Var4.M;
                fArr2[1] = (aVar.getInterpolation(((float) (j10 - (i19 * 1350))) / 667.0f) * 250.0f) + fArr2[c2];
                float[] fArr3 = a1Var4.M;
                fArr3[0] = (aVar.getInterpolation(((float) (j10 - (i15 + 667))) / 667.0f) * 250.0f) + fArr3[0];
                i19++;
                c2 = 1;
            }
            f17 = 180.0f;
            float[] fArr4 = a1Var4.M;
            Path path3 = a1Var4.h;
            if (path3 == null) {
                a1Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e10 * f13, fArr4[1] - fArr4[0]);
            float f27 = fArr4[0];
            float f28 = (1.0f - e10) * max;
            if (a1Var4.f35964k) {
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
            Path path4 = a1Var4.h;
            int centerX = rect3.centerX();
            int i20 = rect3.top;
            m11.d(path4, centerX, i20, rect3.right - a1Var4.D, i20, f33, f34, 0.0f, a1Var4.F);
            m11.b(a1Var4.h, rect3.right, rect3.top, a1Var4.E, 1, f33, f34, a1Var4.F, a1Var4.G);
            Path path5 = a1Var4.h;
            int i21 = rect3.right;
            int i22 = rect3.top;
            int i23 = a1Var4.D;
            int i24 = i22 + i23;
            int i25 = rect3.bottom - i23;
            float f35 = a1Var4.G;
            m11.d(path5, i21, i24, i21, i25, f33, f34, f35, 180.0f - f35);
            m11.b(a1Var4.h, rect3.right, rect3.bottom, a1Var4.E, 2, f33, f34, 180.0f - a1Var4.G, 180.0f - a1Var4.F);
            Path path6 = a1Var4.h;
            int i26 = rect3.right;
            int i27 = a1Var4.D;
            int i28 = i26 - i27;
            int i29 = rect3.bottom;
            int i30 = rect3.left + i27;
            float f36 = a1Var4.F;
            m11.d(path6, i28, i29, i30, i29, f33, f34, 180.0f - f36, f36 + 180.0f);
            m11.b(a1Var4.h, rect3.left, rect3.bottom, a1Var4.E, 3, f33, f34, a1Var4.F + 180.0f, a1Var4.G + 180.0f);
            Path path7 = a1Var4.h;
            int i31 = rect3.left;
            int i32 = rect3.bottom;
            int i33 = a1Var4.D;
            int i34 = i32 - i33;
            int i35 = rect3.top + i33;
            float f37 = a1Var4.G;
            m11.d(path7, i31, i34, i31, i35, f33, f34, f37 + 180.0f, 360.0f - f37);
            m11.b(a1Var4.h, rect3.left, rect3.top, a1Var4.E, 4, f33, f34, 360.0f - a1Var4.G, 360.0f - a1Var4.F);
            m11.d(a1Var4.h, rect3.left + a1Var4.D, rect3.top, rect3.centerX(), rect3.top, f33, f34, 360.0f - a1Var4.F, 360.0f);
            a1Var4.f35961g.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            int alpha7 = a1Var4.f35961g.getAlpha();
            a1Var4.f35961g.setAlpha((int) (alpha7 * f10));
            canvas.drawPath(a1Var4.h, a1Var4.f35961g);
            a1Var4.f35961g.setAlpha(alpha7);
            a1Var4.f35971r.invalidate();
        } else {
            f17 = 180.0f;
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-13.0f) + rect3.centerX(), org.telegram.messenger.g0.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), 255, 31);
        if (a1Var4.f35977y) {
            ch0Var4.setAlpha((int) (a1Var4.f35966m * f10));
            ch0Var4.draw(canvas);
        } else {
            ch0Var3.setAlpha((int) (a1Var4.f35968o * f10));
            ch0Var3.draw(canvas);
        }
        org.telegram.ui.Components.u5 u5Var2 = a1Var4.f35963j;
        if (a1Var4.f35962i && !a1Var4.f35977y && !a1Var4.f35964k) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d = u5Var2.d(z11);
        if (d > f14) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
            if (a1Var4.H == null) {
                Paint paint4 = new Paint(1);
                a1Var4.H = paint4;
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f14, -org.telegram.messenger.g0.L(0.4f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), a1Var4.H);
            if (a1Var4.I == null) {
                a1Var4.I = new Paint(1);
            }
            a1Var4.I.setColor(a1Var4.f35958c);
            int i36 = (int) (d * 255.0f);
            a1Var4.I.setAlpha(i36);
            rectF2.set(0.0f, org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.33f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), a1Var4.I);
            if (a1Var4.L == null || Math.abs(a1Var4.K - org.telegram.messenger.g0.f22607p) > 0.1f) {
                a1Var4.K = org.telegram.messenger.g0.f22607p;
                Path path8 = new Path();
                a1Var4.L = path8;
                path8.moveTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(3.33f));
                a1Var4.L.lineTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(2.0f));
                rectF2.set(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(0.33f), org.telegram.messenger.g0.L(4.99f), org.telegram.messenger.g0.L(3.6599998f));
                a1Var4.L.arcTo(rectF2, -180.0f, f17, false);
                a1Var4.L.lineTo(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.33f));
            }
            if (a1Var4.J == null) {
                Paint paint5 = new Paint(1);
                a1Var4.J = paint5;
                paint5.setStyle(Paint.Style.STROKE);
            }
            a1Var4.J.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            a1Var4.J.setColor(a1Var4.f35958c);
            a1Var4.J.setAlpha(i36);
            canvas.drawPath(a1Var4.L, a1Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i3, float f10) {
        int i10;
        canvas.save();
        int L = org.telegram.messenger.g0.L(44.0f);
        q1 q1Var = this.f28976a;
        canvas.translate(i3, q1Var.getMediaOffsetY() + L + q1Var.Ta + f10);
        q1Var.K4.draw(canvas);
        canvas.restore();
        zi ziVar = q1Var.P5;
        if (ziVar.D != 0 && ziVar.f26868k.media_unread) {
            Paint paint = org.telegram.ui.ActionBar.k6.S1;
            if (ziVar.Q3()) {
                i10 = org.telegram.ui.ActionBar.k6.f28127qc;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28089oe;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, q1Var.Pb));
            canvas.drawCircle(org.telegram.messenger.g0.L(6.0f) + i3 + q1Var.M4, q1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(51.0f) + q1Var.Ta, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.S1);
        }
    }

    public final void d(zi ziVar, boolean z10) {
        boolean z11;
        boolean z12;
        ri riVar;
        int L;
        ui uiVar;
        q1 q1Var = this.f28976a;
        dh.o0 o0Var = q1Var.O;
        int i3 = 0;
        if (!q1Var.f30088t6 && ziVar.f26868k.fwd_from != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.r9 = z11;
        if ((q1Var.f29928g6 && !ziVar.Q3() && (ziVar.Q1() < 0 || ziVar.Q1() == 2666000)) || (((ziVar.p3() && ziVar.B4()) || (ziVar.z3() && ziVar.f26868k.fwd_from.from_id == null)) && ((riVar = q1Var.M) == null || (riVar.f25149l & 4) != 0))) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var.f29954i9 = z12;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.W6) {
                i3 = 71;
            } else if (z10) {
                i3 = 52;
            }
            L = Q0 - org.telegram.messenger.g0.L(i3 + 50);
            q1Var.f29848a7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.W6) {
                i3 = 71;
            } else if (z10) {
                i3 = 52;
            }
            L = parentWidth - org.telegram.messenger.g0.L(i3 + 50);
            q1Var.f29848a7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        }
        if (q1Var.M != null) {
            q1Var.f29848a7 = L;
        }
        int v02 = q1Var.v0(L, ziVar);
        q1Var.setMessageObjectInternal(ziVar);
        q1Var.f30106v0 = org.telegram.messenger.g0.L(82.0f) + q1Var.Ta;
        if (org.telegram.messenger.g0.L(76.0f) + v02 >= (q1Var.f29848a7 - q1Var.f30167z9) - org.telegram.messenger.g0.L(12.0f)) {
            q1Var.f30106v0 = org.telegram.messenger.g0.L(14.0f) + q1Var.f30106v0;
        }
        if (q1Var.M != null && (uiVar = q1Var.L) != null && uiVar.d.size() > 1) {
            if ((q1Var.M.f25149l & 4) == 0) {
                q1Var.f30106v0 -= org.telegram.messenger.g0.L(6.0f);
                q1Var.W1 -= org.telegram.messenger.g0.L(6.0f);
            }
            if ((q1Var.M.f25149l & 8) == 0) {
                q1Var.f30106v0 -= org.telegram.messenger.g0.L(6.0f);
            }
        }
        if (q1Var.J) {
            q1Var.Ta -= org.telegram.messenger.g0.L(1.0f);
        }
        o0Var.getClass();
        o0Var.o(L - org.telegram.messenger.g0.L(24.0f), 3);
        if (!o0Var.f9125p) {
            o0Var.f9123n = org.telegram.messenger.g0.L(12.0f) + o0Var.f9122m;
            q1Var.V2(ziVar);
            int i10 = o0Var.f9124o;
            if (i10 > q1Var.f29848a7) {
                q1Var.f29848a7 = i10;
            }
            if (org.telegram.messenger.g0.L(24.0f) + o0Var.f9127r + q1Var.f30167z9 > q1Var.f29848a7) {
                o0Var.f9123n = org.telegram.messenger.g0.L(12.0f) + o0Var.f9123n;
                o0Var.f9120k -= org.telegram.messenger.g0.L(12.0f);
            }
            if (!ziVar.E0 && ziVar.f26924z != null) {
                o0Var.f9120k = org.telegram.messenger.g0.L(14.0f) + o0Var.f9120k;
            }
            q1Var.f30106v0 += o0Var.f9123n;
        }
    }

    public final void e(zi ziVar, boolean z10) {
        int min;
        float f10;
        q1 q1Var = this.f28976a;
        dh.o0 o0Var = q1Var.O;
        boolean z11 = true;
        q1Var.r9 = !q1Var.f30088t6;
        int i3 = 0;
        if ((!q1Var.f29928g6 || ziVar.Q3() || (ziVar.Q1() >= 0 && ziVar.Q1() != 2666000)) && ((!ziVar.p3() || !ziVar.B4()) && ((!ziVar.z3() || ziVar.f26868k.fwd_from.from_id != null) && (!q1Var.X6 || ziVar.Q3() || (!q1Var.f29975k6 && (!q1Var.f29988l6 || !q1Var.V6)))))) {
            z11 = false;
        }
        q1Var.f29954i9 = z11;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.W6) {
                i3 = 71;
            } else if (z10) {
                i3 = 52;
            }
            min = Math.min(Q0 - org.telegram.messenger.g0.L(i3 + 50), org.telegram.messenger.g0.L(270.0f));
            q1Var.f29848a7 = min;
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.W6) {
                i3 = 71;
            } else if (z10) {
                i3 = 52;
            }
            min = Math.min(parentWidth - org.telegram.messenger.g0.L(i3 + 50), org.telegram.messenger.g0.L(270.0f));
            q1Var.f29848a7 = min;
        }
        q1Var.v0(q1Var.f29848a7, ziVar);
        q1Var.setMessageObjectInternal(ziVar);
        int L = org.telegram.messenger.g0.L(70.0f);
        int i10 = q1Var.Ta;
        q1Var.f30106v0 = L + i10;
        if (q1Var.J) {
            q1Var.Ta = i10 - org.telegram.messenger.g0.L(1.0f);
        }
        o0Var.getClass();
        if (ziVar.Q3()) {
            f10 = 32.0f;
        } else {
            f10 = 24.0f;
        }
        o0Var.o(min - org.telegram.messenger.g0.L(f10), 3);
        if (!o0Var.f9125p) {
            o0Var.f9123n = o0Var.f9122m;
            if (TextUtils.isEmpty(ziVar.f26924z)) {
                o0Var.f9123n = org.telegram.messenger.g0.L(12.0f) + o0Var.f9123n;
            } else {
                o0Var.f9123n = org.telegram.messenger.g0.L(8.0f) + o0Var.f9123n;
            }
            int i11 = o0Var.f9124o;
            if (i11 > q1Var.f29848a7) {
                q1Var.f29848a7 = i11;
            }
            int L2 = org.telegram.messenger.g0.L(6.0f) + q1Var.f30167z9;
            if (zi.c4(ziVar.f26868k) && !ziVar.o4()) {
                L2 -= org.telegram.messenger.g0.L(3.0f);
            } else if (ziVar.Q3()) {
                L2 += org.telegram.messenger.g0.L(20.5f);
            }
            if (o0Var.f9127r + q1Var.getExtraTimeX() + L2 >= q1Var.f29848a7) {
                o0Var.f9123n = org.telegram.messenger.g0.L(12.0f) + o0Var.f9123n;
                o0Var.f9120k -= org.telegram.messenger.g0.L(12.0f);
            }
            q1Var.f30106v0 += o0Var.f9123n;
        }
    }
}
