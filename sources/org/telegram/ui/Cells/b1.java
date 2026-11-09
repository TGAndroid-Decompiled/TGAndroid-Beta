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
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.t11;
public final class b1 {
    public final q1 f28924a;
    public float f28925b;
    public float f28926c;
    public StaticLayout d;
    public int f28927e;
    public StaticLayout f28928f;
    public int f28929g;
    public float h;

    public b1(q1 q1Var) {
        this.f28924a = q1Var;
    }

    public final void a(android.graphics.Canvas r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b1.a(android.graphics.Canvas, float, float):void");
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
        boolean z9;
        float f15;
        Paint paint;
        float f16;
        float f17;
        boolean z10;
        float f18;
        int i15;
        Paint Z1;
        boolean z11;
        canvas.save();
        q1 q1Var = this.f28924a;
        x1 x1Var = q1Var.f29876hb;
        int currentBackgroundRight = q1Var.getCurrentBackgroundRight() - q1Var.getCurrentBackgroundLeft();
        if (q1Var.F) {
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
            ij ijVar = q1Var.P5;
            TLRPC.Message message = ijVar.f23262k;
            if (message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && t11.k(ijVar)) {
                z11 = true;
            } else {
                z11 = false;
            }
            a1Var.q(z11, false);
            q1Var.I4.o(t11.j(q1Var.P5), false);
            q1Var.I4.p(t11.s(q1Var.P5), false);
        }
        if (q1Var.E8 != 0) {
            this.f28925b = org.telegram.messenger.g0.T1(org.telegram.messenger.k5.C(21.0f, i7, L4), q1Var.Q8, 1.0f - q1Var.getVideoTranscriptionProgress());
            this.f28926c = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(3.0f) + q1Var.G4, q1Var.R8 - org.telegram.messenger.g0.L(40.0f), 1.0f - q1Var.getVideoTranscriptionProgress());
        } else {
            float C = org.telegram.messenger.k5.C(21.0f, i7, L4);
            ij ijVar2 = q1Var.P5;
            if (ijVar2 != null && ijVar2.P3()) {
                L = (org.telegram.messenger.g0.L(28.0f) * f11) + (q1Var.getCurrentBackgroundLeft() - org.telegram.messenger.g0.L(40.0f));
            } else if (q1Var.t2()) {
                L = Math.min(q1Var.getPhotoImage().y() + org.telegram.messenger.g0.L(8.0f), q1Var.getCompactRight() - org.telegram.messenger.g0.L(32.0f));
            } else {
                L = (org.telegram.messenger.g0.L(8.0f) + q1Var.getCurrentBackgroundRight()) - (org.telegram.messenger.g0.L(40.0f) * f11);
            }
            this.f28925b = org.telegram.messenger.g0.T1(C, L, 1.0f - q1Var.getVideoTranscriptionProgress());
            float f19 = q1Var.f29820d7 + x1Var.f30812j0;
            if (q1Var.J) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            float L5 = f19 - org.telegram.messenger.g0.L(28 - i11);
            ch.p0 p0Var = q1Var.N;
            if (!p0Var.f6371p) {
                L5 -= p0Var.i(x1Var.L1);
            }
            float T1 = org.telegram.messenger.g0.T1(L5, (q1Var.getMediaOffsetY() + (org.telegram.messenger.g0.L(44.0f) + q1Var.Ta)) - org.telegram.messenger.g0.L(1.7f), q1Var.getVideoTranscriptionProgress()) + org.telegram.messenger.g0.L(1.7f);
            float L6 = org.telegram.messenger.g0.L(3.0f) + q1Var.G4;
            float L7 = T1 - org.telegram.messenger.g0.L(12.0f);
            if (q1Var.P5.P3()) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(28.0f) * f11;
            }
            this.f28926c = org.telegram.messenger.g0.T1(L6, L7 - L2, 1.0f - q1Var.getVideoTranscriptionProgress());
        }
        a1 a1Var2 = q1Var.I4;
        int i16 = (int) this.f28925b;
        int i17 = (int) this.f28926c;
        int W1 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(32.0f));
        int W12 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f));
        int W13 = org.telegram.messenger.g0.W1(1.0f - q1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f));
        Rect rect = a1Var2.f38251u;
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
            i13 = org.telegram.ui.ActionBar.l6.Ta;
        } else {
            i13 = org.telegram.ui.ActionBar.l6.Wc;
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(i13, q1Var.Pb);
        if (q1Var.P5.P3()) {
            i14 = org.telegram.ui.ActionBar.l6.Gc;
        } else {
            i14 = org.telegram.ui.ActionBar.l6.qk;
        }
        int w03 = org.telegram.ui.ActionBar.l6.w0(i14, q1Var.Pb);
        if (q1Var.L1 == 3) {
            videoTranscriptionProgress = 1.0f;
        } else {
            videoTranscriptionProgress = q1Var.getVideoTranscriptionProgress();
        }
        int f23 = i0.a.f(videoTranscriptionProgress, w02, w03);
        org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, q1Var.Pb);
        q1Var.P5.N3();
        if (q1Var.L1 == 3) {
            videoTranscriptionProgress2 = f14;
        } else {
            videoTranscriptionProgress2 = 1.0f - q1Var.getVideoTranscriptionProgress();
        }
        ah0 ah0Var = a1Var3.f38246p;
        ah0 ah0Var2 = a1Var3.f38244n;
        if (a1Var3.f38234b != f23) {
            z9 = true;
        } else {
            z9 = false;
        }
        a1Var3.f38234b = f23;
        a1Var3.f38235c = f23;
        int o4 = i0.a.o(f23, (int) (Color.alpha(f23) * 0.156f));
        a1Var3.f38233a = o4;
        a1Var3.f38236e = videoTranscriptionProgress2;
        float alpha = Color.alpha(f23);
        if (org.telegram.ui.ActionBar.l6.I.q()) {
            f15 = 0.3f;
        } else {
            f15 = 0.2f;
        }
        a1Var3.d = org.telegram.ui.ActionBar.l6.w(o4, i0.a.o(f23, (int) (alpha * f15)));
        if (a1Var3.f38237f == null) {
            a1Var3.f38237f = new Paint();
        }
        a1Var3.f38237f.setColor(a1Var3.f38233a);
        a1Var3.f38237f.setAlpha((int) ((1.0f - videoTranscriptionProgress2) * paint.getAlpha()));
        if (z9 || a1Var3.f38247q == null) {
            int L8 = org.telegram.messenger.g0.L(8.0f);
            int i18 = a1Var3.d;
            y k02 = org.telegram.ui.ActionBar.l6.k0(L8, L8, L8, L8, 0, i18, i18);
            a1Var3.f38247q = k02;
            k02.setCallback(a1Var3.f38248r);
        }
        if (z9) {
            ah0Var2.Z = true;
            ah0Var2.Q(a1Var3.f38235c, "Artboard Outlines");
            ah0Var2.o();
            ah0Var2.J(true);
            ah0Var2.V(0L);
            int alpha2 = Color.alpha(f23);
            a1Var3.f38243m = alpha2;
            ah0Var2.setAlpha(alpha2);
            ah0Var.Z = true;
            ah0Var.Q(a1Var3.f38235c, "Artboard Outlines");
            ah0Var.o();
            ah0Var.J(true);
            ah0Var.V(0L);
            int alpha3 = Color.alpha(f23);
            a1Var3.f38245o = alpha3;
            ah0Var.setAlpha(alpha3);
        }
        if (a1Var3.f38238g == null) {
            Paint paint2 = new Paint(1);
            a1Var3.f38238g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            a1Var3.f38238g.setStrokeCap(Paint.Cap.ROUND);
        }
        a1Var3.f38238g.setColor(f23);
        a1 a1Var4 = q1Var.I4;
        ah0 ah0Var3 = a1Var4.f38246p;
        ah0 ah0Var4 = a1Var4.f38244n;
        Rect rect2 = a1Var4.v;
        Rect rect3 = a1Var4.f38251u;
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
        float f25 = a1Var4.f38236e * f10;
        if (f25 > f14) {
            q1 q1Var2 = a1Var4.R.f28924a;
            if (q1Var2.P5.P5()) {
                Z1 = q1Var2.Z1("paintChatActionBackground");
            } else {
                Z1 = q1Var2.Z1("paintChatTimeBackground");
            }
            int alpha4 = Z1.getAlpha();
            Z1.setAlpha((int) (alpha4 * f25));
            q1Var2.x();
            canvas.drawRect(rect3, Z1);
            if (Z1 == q1Var2.Z1("paintChatActionBackground") && q1Var2.g2()) {
                int alpha5 = org.telegram.ui.ActionBar.l6.f27935h2.getAlpha();
                org.telegram.ui.ActionBar.l6.f27935h2.setAlpha((int) (alpha5 * f25));
                canvas.drawRect(rect3, org.telegram.ui.ActionBar.l6.f27935h2);
                org.telegram.ui.ActionBar.l6.f27935h2.setAlpha(alpha5);
            }
            Z1.setAlpha(alpha4);
        }
        Paint paint3 = a1Var4.f38237f;
        if (paint3 != null) {
            int alpha6 = paint3.getAlpha();
            a1Var4.f38237f.setAlpha((int) (alpha6 * f10));
            canvas.drawRect(rect3, a1Var4.f38237f);
            a1Var4.f38237f.setAlpha(alpha6);
        }
        y yVar = a1Var4.f38247q;
        if (yVar != null) {
            yVar.setBounds(rect3);
            a1Var4.f38247q.draw(canvas);
        }
        canvas.restore();
        org.telegram.ui.Components.w5 w5Var = a1Var4.f38242l;
        if (a1Var4.f38241k) {
            f16 = 1.0f;
        } else {
            f16 = f14;
        }
        float e10 = w5Var.e(false, f16);
        if (e10 > f14) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - a1Var4.f38250t)) * 0.75f;
            x1.a aVar = a1Var4.B;
            if (a1Var4.M == null) {
                a1Var4.M = new float[i12];
            }
            long j3 = elapsedRealtime % 5400;
            float[] fArr = a1Var4.M;
            float f26 = ((float) (1520 * j3)) / 5400.0f;
            fArr[0] = f26 - 20.0f;
            char c10 = 1;
            fArr[1] = f26;
            int i19 = 0;
            while (i19 < 4) {
                float[] fArr2 = a1Var4.M;
                fArr2[1] = (aVar.getInterpolation(((float) (j3 - (i19 * 1350))) / 667.0f) * 250.0f) + fArr2[c10];
                float[] fArr3 = a1Var4.M;
                fArr3[0] = (aVar.getInterpolation(((float) (j3 - (i15 + 667))) / 667.0f) * 250.0f) + fArr3[0];
                i19++;
                c10 = 1;
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
            if (a1Var4.f38241k) {
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
            t11.d(path4, centerX, i20, rect3.right - a1Var4.D, i20, f33, f34, 0.0f, a1Var4.F);
            t11.b(a1Var4.h, rect3.right, rect3.top, a1Var4.E, 1, f33, f34, a1Var4.F, a1Var4.G);
            Path path5 = a1Var4.h;
            int i21 = rect3.right;
            int i22 = rect3.top;
            int i23 = a1Var4.D;
            int i24 = i22 + i23;
            int i25 = rect3.bottom - i23;
            float f35 = a1Var4.G;
            t11.d(path5, i21, i24, i21, i25, f33, f34, f35, 180.0f - f35);
            t11.b(a1Var4.h, rect3.right, rect3.bottom, a1Var4.E, 2, f33, f34, 180.0f - a1Var4.G, 180.0f - a1Var4.F);
            Path path6 = a1Var4.h;
            int i26 = rect3.right;
            int i27 = a1Var4.D;
            int i28 = i26 - i27;
            int i29 = rect3.bottom;
            int i30 = rect3.left + i27;
            float f36 = a1Var4.F;
            t11.d(path6, i28, i29, i30, i29, f33, f34, 180.0f - f36, f36 + 180.0f);
            t11.b(a1Var4.h, rect3.left, rect3.bottom, a1Var4.E, 3, f33, f34, a1Var4.F + 180.0f, a1Var4.G + 180.0f);
            Path path7 = a1Var4.h;
            int i31 = rect3.left;
            int i32 = rect3.bottom;
            int i33 = a1Var4.D;
            int i34 = i32 - i33;
            int i35 = rect3.top + i33;
            float f37 = a1Var4.G;
            t11.d(path7, i31, i34, i31, i35, f33, f34, f37 + 180.0f, 360.0f - f37);
            t11.b(a1Var4.h, rect3.left, rect3.top, a1Var4.E, 4, f33, f34, 360.0f - a1Var4.G, 360.0f - a1Var4.F);
            t11.d(a1Var4.h, rect3.left + a1Var4.D, rect3.top, rect3.centerX(), rect3.top, f33, f34, 360.0f - a1Var4.F, 360.0f);
            a1Var4.f38238g.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            int alpha7 = a1Var4.f38238g.getAlpha();
            a1Var4.f38238g.setAlpha((int) (alpha7 * f10));
            canvas.drawPath(a1Var4.h, a1Var4.f38238g);
            a1Var4.f38238g.setAlpha(alpha7);
            a1Var4.f38248r.invalidate();
        } else {
            f17 = 180.0f;
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-13.0f) + rect3.centerX(), org.telegram.messenger.g0.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), 255, 31);
        if (a1Var4.f38254y) {
            ah0Var4.setAlpha((int) (a1Var4.f38243m * f10));
            ah0Var4.draw(canvas);
        } else {
            ah0Var3.setAlpha((int) (a1Var4.f38245o * f10));
            ah0Var3.draw(canvas);
        }
        org.telegram.ui.Components.w5 w5Var2 = a1Var4.f38240j;
        if (a1Var4.f38239i && !a1Var4.f38254y && !a1Var4.f38241k) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = w5Var2.d(z10);
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
            a1Var4.I.setColor(a1Var4.f38235c);
            int i36 = (int) (d * 255.0f);
            a1Var4.I.setAlpha(i36);
            rectF2.set(0.0f, org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.33f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), a1Var4.I);
            if (a1Var4.L == null || Math.abs(a1Var4.K - org.telegram.messenger.g0.f22562p) > 0.1f) {
                a1Var4.K = org.telegram.messenger.g0.f22562p;
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
            a1Var4.J.setColor(a1Var4.f38235c);
            a1Var4.J.setAlpha(i36);
            canvas.drawPath(a1Var4.L, a1Var4.J);
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
        q1 q1Var = this.f28924a;
        canvas.translate(i7, q1Var.getMediaOffsetY() + L + q1Var.Ta + f10);
        q1Var.K4.draw(canvas);
        canvas.restore();
        ij ijVar = q1Var.P5;
        if (ijVar.D != 0 && ijVar.f23262k.media_unread) {
            Paint paint = org.telegram.ui.ActionBar.l6.S1;
            if (ijVar.P3()) {
                i10 = org.telegram.ui.ActionBar.l6.f28111qc;
            } else {
                i10 = org.telegram.ui.ActionBar.l6.f28073oe;
            }
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(i10, q1Var.Pb));
            canvas.drawCircle(org.telegram.messenger.g0.L(6.0f) + i7 + q1Var.M4, q1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(51.0f) + q1Var.Ta, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.l6.S1);
        }
    }

    public final void d(ij ijVar, boolean z9) {
        boolean z10;
        boolean z11;
        aj ajVar;
        int L;
        dj djVar;
        q1 q1Var = this.f28924a;
        ch.p0 p0Var = q1Var.N;
        int i7 = 0;
        if (!q1Var.t6 && ijVar.f23262k.fwd_from != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1Var.f29998r9 = z10;
        if ((q1Var.f29858g6 && !ijVar.P3() && (ijVar.P1() < 0 || ijVar.P1() == 2666000)) || (((ijVar.o3() && ijVar.A4()) || (ijVar.y3() && ijVar.f23262k.fwd_from.from_id == null)) && ((ajVar = q1Var.L) == null || (ajVar.f21450l & 4) != 0))) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f29887i9 = z11;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.W6) {
                i7 = 71;
            } else if (z9) {
                i7 = 52;
            }
            L = Q0 - org.telegram.messenger.g0.L(i7 + 50);
            q1Var.f29780a7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.W6) {
                i7 = 71;
            } else if (z9) {
                i7 = 52;
            }
            L = parentWidth - org.telegram.messenger.g0.L(i7 + 50);
            q1Var.f29780a7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        }
        if (q1Var.L != null) {
            q1Var.f29780a7 = L;
        }
        int w02 = q1Var.w0(L, ijVar);
        q1Var.setMessageObjectInternal(ijVar);
        q1Var.f30026u0 = org.telegram.messenger.g0.L(82.0f) + q1Var.Ta;
        if (org.telegram.messenger.g0.L(76.0f) + w02 >= (q1Var.f29780a7 - q1Var.z9) - org.telegram.messenger.g0.L(12.0f)) {
            q1Var.f30026u0 = org.telegram.messenger.g0.L(14.0f) + q1Var.f30026u0;
        }
        if (q1Var.L != null && (djVar = q1Var.K) != null && djVar.d.size() > 1) {
            if ((q1Var.L.f21450l & 4) == 0) {
                q1Var.f30026u0 -= org.telegram.messenger.g0.L(6.0f);
                q1Var.W1 -= org.telegram.messenger.g0.L(6.0f);
            }
            if ((q1Var.L.f21450l & 8) == 0) {
                q1Var.f30026u0 -= org.telegram.messenger.g0.L(6.0f);
            }
        }
        if (q1Var.I) {
            q1Var.Ta -= org.telegram.messenger.g0.L(1.0f);
        }
        p0Var.getClass();
        p0Var.o(L - org.telegram.messenger.g0.L(24.0f), 3);
        if (!p0Var.f6371p) {
            p0Var.f6369n = org.telegram.messenger.g0.L(12.0f) + p0Var.f6368m;
            q1Var.W2(ijVar);
            int i10 = p0Var.f6370o;
            if (i10 > q1Var.f29780a7) {
                q1Var.f29780a7 = i10;
            }
            if (org.telegram.messenger.g0.L(24.0f) + p0Var.f6373r + q1Var.z9 > q1Var.f29780a7) {
                p0Var.f6369n = org.telegram.messenger.g0.L(12.0f) + p0Var.f6369n;
                p0Var.f6366k -= org.telegram.messenger.g0.L(12.0f);
            }
            if (!ijVar.E0 && ijVar.f23318z != null) {
                p0Var.f6366k = org.telegram.messenger.g0.L(14.0f) + p0Var.f6366k;
            }
            q1Var.f30026u0 += p0Var.f6369n;
        }
    }

    public final void e(ij ijVar, boolean z9) {
        int min;
        float f10;
        q1 q1Var = this.f28924a;
        ch.p0 p0Var = q1Var.N;
        boolean z10 = true;
        q1Var.f29998r9 = !q1Var.t6;
        int i7 = 0;
        if ((!q1Var.f29858g6 || ijVar.P3() || (ijVar.P1() >= 0 && ijVar.P1() != 2666000)) && ((!ijVar.o3() || !ijVar.A4()) && ((!ijVar.y3() || ijVar.f23262k.fwd_from.from_id != null) && (!q1Var.X6 || ijVar.P3() || (!q1Var.f29909k6 && (!q1Var.f29920l6 || !q1Var.V6)))))) {
            z10 = false;
        }
        q1Var.f29887i9 = z10;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.W6) {
                i7 = 71;
            } else if (z9) {
                i7 = 52;
            }
            min = Math.min(Q0 - org.telegram.messenger.g0.L(i7 + 50), org.telegram.messenger.g0.L(270.0f));
            q1Var.f29780a7 = min;
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.W6) {
                i7 = 71;
            } else if (z9) {
                i7 = 52;
            }
            min = Math.min(parentWidth - org.telegram.messenger.g0.L(i7 + 50), org.telegram.messenger.g0.L(270.0f));
            q1Var.f29780a7 = min;
        }
        q1Var.w0(q1Var.f29780a7, ijVar);
        q1Var.setMessageObjectInternal(ijVar);
        int L = org.telegram.messenger.g0.L(70.0f);
        int i10 = q1Var.Ta;
        q1Var.f30026u0 = L + i10;
        if (q1Var.I) {
            q1Var.Ta = i10 - org.telegram.messenger.g0.L(1.0f);
        }
        p0Var.getClass();
        if (ijVar.P3()) {
            f10 = 32.0f;
        } else {
            f10 = 24.0f;
        }
        p0Var.o(min - org.telegram.messenger.g0.L(f10), 3);
        if (!p0Var.f6371p) {
            p0Var.f6369n = p0Var.f6368m;
            if (TextUtils.isEmpty(ijVar.f23318z)) {
                p0Var.f6369n = org.telegram.messenger.g0.L(12.0f) + p0Var.f6369n;
            } else {
                p0Var.f6369n = org.telegram.messenger.g0.L(8.0f) + p0Var.f6369n;
            }
            int i11 = p0Var.f6370o;
            if (i11 > q1Var.f29780a7) {
                q1Var.f29780a7 = i11;
            }
            int L2 = org.telegram.messenger.g0.L(6.0f) + q1Var.z9;
            if (ij.b4(ijVar.f23262k) && !ijVar.n4()) {
                L2 -= org.telegram.messenger.g0.L(3.0f);
            } else if (ijVar.P3()) {
                L2 += org.telegram.messenger.g0.L(20.5f);
            }
            if (p0Var.f6373r + q1Var.getExtraTimeX() + L2 >= q1Var.f29780a7) {
                p0Var.f6369n = org.telegram.messenger.g0.L(12.0f) + p0Var.f6369n;
                p0Var.f6366k -= org.telegram.messenger.g0.L(12.0f);
            }
            q1Var.f30026u0 += p0Var.f6369n;
        }
    }
}
