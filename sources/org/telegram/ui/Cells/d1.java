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
import org.telegram.messenger.fj;
import org.telegram.messenger.xi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.oh0;
public final class d1 {
    public final r1 f30547a;
    public float f30548b;
    public float f30549c;
    public StaticLayout d;
    public int f30550e;
    public StaticLayout f30551f;
    public int f30552g;
    public float h;

    public d1(r1 r1Var) {
        this.f30547a = r1Var;
    }

    public final void a(android.graphics.Canvas r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d1.a(android.graphics.Canvas, float, float):void");
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
        r1 r1Var = this.f30547a;
        y1 y1Var = r1Var.f31468ib;
        int currentBackgroundRight = r1Var.getCurrentBackgroundRight() - r1Var.getCurrentBackgroundLeft();
        if (r1Var.G) {
            f12 = 6.0f;
        } else {
            f12 = 0.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f12) + currentBackgroundRight;
        if (r1Var.R1) {
            i10 = 10;
        } else {
            i10 = 0;
        }
        int L4 = L3 - org.telegram.messenger.g0.L(i10 + 128);
        if (r1Var.J4 == null) {
            c1 c1Var = new c1(this, r1Var, r1Var.E4);
            r1Var.J4 = c1Var;
            fj fjVar = r1Var.Q5;
            TLRPC.Message message = fjVar.f23993k;
            if (message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && j21.l(fjVar)) {
                z12 = true;
            } else {
                z12 = false;
            }
            c1Var.t(z12, false);
            r1Var.J4.r(j21.k(r1Var.Q5), false);
            r1Var.J4.s(j21.v(r1Var.Q5), false);
        }
        if (r1Var.F8 != 0) {
            this.f30548b = org.telegram.messenger.g0.T1(org.telegram.messenger.f3.C(21.0f, i7, L4), r1Var.R8, 1.0f - r1Var.getVideoTranscriptionProgress());
            this.f30549c = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(3.0f) + r1Var.H4, r1Var.S8 - org.telegram.messenger.g0.L(40.0f), 1.0f - r1Var.getVideoTranscriptionProgress());
        } else {
            float C = org.telegram.messenger.f3.C(21.0f, i7, L4);
            fj fjVar2 = r1Var.Q5;
            if (fjVar2 != null && fjVar2.P3()) {
                L = (org.telegram.messenger.g0.L(28.0f) * f11) + (r1Var.getCurrentBackgroundLeft() - org.telegram.messenger.g0.L(40.0f));
            } else if (r1Var.u2()) {
                L = Math.min(r1Var.getPhotoImage().y() + org.telegram.messenger.g0.L(8.0f), r1Var.getCompactRight() - org.telegram.messenger.g0.L(32.0f));
            } else {
                L = (org.telegram.messenger.g0.L(8.0f) + r1Var.getCurrentBackgroundRight()) - (org.telegram.messenger.g0.L(40.0f) * f11);
            }
            this.f30548b = org.telegram.messenger.g0.T1(C, L, 1.0f - r1Var.getVideoTranscriptionProgress());
            float f19 = r1Var.f31412e7 + y1Var.f32415j0;
            if (r1Var.K) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            float L5 = f19 - org.telegram.messenger.g0.L(28 - i11);
            ch.q0 q0Var = r1Var.O;
            if (!q0Var.f5521p) {
                L5 -= q0Var.i(y1Var.L1);
            }
            float T1 = org.telegram.messenger.g0.T1(L5, (r1Var.getMediaOffsetY() + (org.telegram.messenger.g0.L(44.0f) + r1Var.Ua)) - org.telegram.messenger.g0.L(1.7f), r1Var.getVideoTranscriptionProgress()) + org.telegram.messenger.g0.L(1.7f);
            float L6 = org.telegram.messenger.g0.L(3.0f) + r1Var.H4;
            float L7 = T1 - org.telegram.messenger.g0.L(12.0f);
            if (r1Var.Q5.P3()) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(28.0f) * f11;
            }
            this.f30549c = org.telegram.messenger.g0.T1(L6, L7 - L2, 1.0f - r1Var.getVideoTranscriptionProgress());
        }
        c1 c1Var2 = r1Var.J4;
        int i16 = (int) this.f30548b;
        int i17 = (int) this.f30549c;
        int W1 = org.telegram.messenger.g0.W1(1.0f - r1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(32.0f));
        int W12 = org.telegram.messenger.g0.W1(1.0f - r1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f));
        int W13 = org.telegram.messenger.g0.W1(1.0f - r1Var.getVideoTranscriptionProgress(), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f));
        Rect rect = c1Var2.f36384u;
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
            c1Var2.F = (float) ((Math.atan((f20 - f21) / f22) * 180.0d) / 3.141592653589793d);
            c1Var2.G = (float) ((Math.atan(f20 / (f22 - f21)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i16, i17, i16 + W1, i17 + W12);
        int min = Math.min(Math.min(W1, W12) / 2, W13);
        c1Var2.D = min;
        c1Var2.E = min * 2;
        c1 c1Var3 = r1Var.J4;
        if (r1Var.u2()) {
            i13 = org.telegram.ui.ActionBar.m6.Ta;
        } else {
            i13 = org.telegram.ui.ActionBar.m6.Zc;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i13, r1Var.Qb);
        if (r1Var.Q5.P3()) {
            i14 = org.telegram.ui.ActionBar.m6.Jc;
        } else {
            i14 = org.telegram.ui.ActionBar.m6.tk;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(i14, r1Var.Qb);
        if (r1Var.M1 == 3) {
            videoTranscriptionProgress = 1.0f;
        } else {
            videoTranscriptionProgress = r1Var.getVideoTranscriptionProgress();
        }
        int f23 = i0.a.f(videoTranscriptionProgress, w02, w03);
        org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29770y6, r1Var.Qb);
        r1Var.Q5.N3();
        if (r1Var.M1 == 3) {
            videoTranscriptionProgress2 = f14;
        } else {
            videoTranscriptionProgress2 = 1.0f - r1Var.getVideoTranscriptionProgress();
        }
        oh0 oh0Var = c1Var3.f36379p;
        oh0 oh0Var2 = c1Var3.f36377n;
        if (c1Var3.f36367b != f23) {
            z10 = true;
        } else {
            z10 = false;
        }
        c1Var3.f36367b = f23;
        c1Var3.f36368c = f23;
        int o4 = i0.a.o(f23, (int) (Color.alpha(f23) * 0.156f));
        c1Var3.f36366a = o4;
        c1Var3.f36369e = videoTranscriptionProgress2;
        float alpha = Color.alpha(f23);
        if (org.telegram.ui.ActionBar.m6.I.q()) {
            f15 = 0.3f;
        } else {
            f15 = 0.2f;
        }
        c1Var3.d = org.telegram.ui.ActionBar.m6.w(o4, i0.a.o(f23, (int) (alpha * f15)));
        if (c1Var3.f36370f == null) {
            c1Var3.f36370f = new Paint();
        }
        c1Var3.f36370f.setColor(c1Var3.f36366a);
        c1Var3.f36370f.setAlpha((int) ((1.0f - videoTranscriptionProgress2) * paint.getAlpha()));
        if (z10 || c1Var3.f36380q == null) {
            int L8 = org.telegram.messenger.g0.L(8.0f);
            int i18 = c1Var3.d;
            y k02 = org.telegram.ui.ActionBar.m6.k0(L8, L8, L8, L8, 0, i18, i18);
            c1Var3.f36380q = k02;
            k02.setCallback(c1Var3.f36381r);
        }
        if (z10) {
            oh0Var2.f38211a0 = true;
            oh0Var2.Q(c1Var3.f36368c, "Artboard Outlines");
            oh0Var2.o();
            oh0Var2.J(true);
            oh0Var2.V(0L);
            int alpha2 = Color.alpha(f23);
            c1Var3.f36376m = alpha2;
            oh0Var2.setAlpha(alpha2);
            oh0Var.f38211a0 = true;
            oh0Var.Q(c1Var3.f36368c, "Artboard Outlines");
            oh0Var.o();
            oh0Var.J(true);
            oh0Var.V(0L);
            int alpha3 = Color.alpha(f23);
            c1Var3.f36378o = alpha3;
            oh0Var.setAlpha(alpha3);
        }
        if (c1Var3.f36371g == null) {
            Paint paint2 = new Paint(1);
            c1Var3.f36371g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            c1Var3.f36371g.setStrokeCap(Paint.Cap.ROUND);
        }
        c1Var3.f36371g.setColor(f23);
        c1 c1Var4 = r1Var.J4;
        oh0 oh0Var3 = c1Var4.f36379p;
        oh0 oh0Var4 = c1Var4.f36377n;
        Rect rect2 = c1Var4.v;
        Rect rect3 = c1Var4.f36384u;
        rect2.set(rect3.left - org.telegram.messenger.g0.L(8.0f), rect3.top - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + rect3.right, org.telegram.messenger.g0.L(8.0f) + rect3.bottom);
        Path path = c1Var4.C;
        if (path == null) {
            c1Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect3);
        Path path2 = c1Var4.C;
        float f24 = c1Var4.D;
        path2.addRoundRect(rectF, f24, f24, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(c1Var4.C);
        float f25 = c1Var4.f36369e * f10;
        if (f25 > f14) {
            r1 r1Var2 = c1Var4.T.f30547a;
            if (r1Var2.Q5.P5()) {
                a22 = r1Var2.a2("paintChatActionBackground");
            } else {
                a22 = r1Var2.a2("paintChatTimeBackground");
            }
            int alpha4 = a22.getAlpha();
            a22.setAlpha((int) (alpha4 * f25));
            r1Var2.x();
            canvas.drawRect(rect3, a22);
            if (a22 == r1Var2.a2("paintChatActionBackground") && r1Var2.h2()) {
                int alpha5 = org.telegram.ui.ActionBar.m6.f29448h2.getAlpha();
                org.telegram.ui.ActionBar.m6.f29448h2.setAlpha((int) (alpha5 * f25));
                canvas.drawRect(rect3, org.telegram.ui.ActionBar.m6.f29448h2);
                org.telegram.ui.ActionBar.m6.f29448h2.setAlpha(alpha5);
            }
            a22.setAlpha(alpha4);
        }
        Paint paint3 = c1Var4.f36370f;
        if (paint3 != null) {
            int alpha6 = paint3.getAlpha();
            c1Var4.f36370f.setAlpha((int) (alpha6 * f10));
            canvas.drawRect(rect3, c1Var4.f36370f);
            c1Var4.f36370f.setAlpha(alpha6);
        }
        y yVar = c1Var4.f36380q;
        if (yVar != null) {
            yVar.setBounds(rect3);
            c1Var4.f36380q.draw(canvas);
        }
        canvas.restore();
        org.telegram.ui.Components.d6 d6Var = c1Var4.f36375l;
        if (c1Var4.f36374k) {
            f16 = 1.0f;
        } else {
            f16 = f14;
        }
        float e10 = d6Var.e(false, f16);
        if (e10 > f14) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - c1Var4.f36383t)) * 0.75f;
            x1.a aVar = c1Var4.B;
            if (c1Var4.M == null) {
                c1Var4.M = new float[i12];
            }
            long j3 = elapsedRealtime % 5400;
            float[] fArr = c1Var4.M;
            float f26 = ((float) (1520 * j3)) / 5400.0f;
            fArr[0] = f26 - 20.0f;
            char c10 = 1;
            fArr[1] = f26;
            int i19 = 0;
            while (i19 < 4) {
                float[] fArr2 = c1Var4.M;
                fArr2[1] = (aVar.getInterpolation(((float) (j3 - (i19 * 1350))) / 667.0f) * 250.0f) + fArr2[c10];
                float[] fArr3 = c1Var4.M;
                fArr3[0] = (aVar.getInterpolation(((float) (j3 - (i15 + 667))) / 667.0f) * 250.0f) + fArr3[0];
                i19++;
                c10 = 1;
            }
            f17 = 180.0f;
            float[] fArr4 = c1Var4.M;
            Path path3 = c1Var4.h;
            if (path3 == null) {
                c1Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e10 * f13, fArr4[1] - fArr4[0]);
            float f27 = fArr4[0];
            float f28 = (1.0f - e10) * max;
            if (c1Var4.f36374k) {
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
            Path path4 = c1Var4.h;
            int centerX = rect3.centerX();
            int i20 = rect3.top;
            j21.d(path4, centerX, i20, rect3.right - c1Var4.D, i20, f33, f34, 0.0f, c1Var4.F);
            j21.b(c1Var4.h, rect3.right, rect3.top, c1Var4.E, 1, f33, f34, c1Var4.F, c1Var4.G);
            Path path5 = c1Var4.h;
            int i21 = rect3.right;
            int i22 = rect3.top;
            int i23 = c1Var4.D;
            int i24 = i22 + i23;
            int i25 = rect3.bottom - i23;
            float f35 = c1Var4.G;
            j21.d(path5, i21, i24, i21, i25, f33, f34, f35, 180.0f - f35);
            j21.b(c1Var4.h, rect3.right, rect3.bottom, c1Var4.E, 2, f33, f34, 180.0f - c1Var4.G, 180.0f - c1Var4.F);
            Path path6 = c1Var4.h;
            int i26 = rect3.right;
            int i27 = c1Var4.D;
            int i28 = i26 - i27;
            int i29 = rect3.bottom;
            int i30 = rect3.left + i27;
            float f36 = c1Var4.F;
            j21.d(path6, i28, i29, i30, i29, f33, f34, 180.0f - f36, f36 + 180.0f);
            j21.b(c1Var4.h, rect3.left, rect3.bottom, c1Var4.E, 3, f33, f34, c1Var4.F + 180.0f, c1Var4.G + 180.0f);
            Path path7 = c1Var4.h;
            int i31 = rect3.left;
            int i32 = rect3.bottom;
            int i33 = c1Var4.D;
            int i34 = i32 - i33;
            int i35 = rect3.top + i33;
            float f37 = c1Var4.G;
            j21.d(path7, i31, i34, i31, i35, f33, f34, f37 + 180.0f, 360.0f - f37);
            j21.b(c1Var4.h, rect3.left, rect3.top, c1Var4.E, 4, f33, f34, 360.0f - c1Var4.G, 360.0f - c1Var4.F);
            j21.d(c1Var4.h, rect3.left + c1Var4.D, rect3.top, rect3.centerX(), rect3.top, f33, f34, 360.0f - c1Var4.F, 360.0f);
            c1Var4.f36371g.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            int alpha7 = c1Var4.f36371g.getAlpha();
            c1Var4.f36371g.setAlpha((int) (alpha7 * f10));
            canvas.drawPath(c1Var4.h, c1Var4.f36371g);
            c1Var4.f36371g.setAlpha(alpha7);
            c1Var4.f36381r.invalidate();
        } else {
            f17 = 180.0f;
        }
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-13.0f) + rect3.centerX(), org.telegram.messenger.g0.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), 255, 31);
        if (c1Var4.f36387y) {
            oh0Var4.setAlpha((int) (c1Var4.f36376m * f10));
            oh0Var4.draw(canvas);
        } else {
            oh0Var3.setAlpha((int) (c1Var4.f36378o * f10));
            oh0Var3.draw(canvas);
        }
        org.telegram.ui.Components.d6 d6Var2 = c1Var4.f36373j;
        if (c1Var4.f36372i && !c1Var4.f36387y && !c1Var4.f36374k) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d = d6Var2.d(z11);
        if (d > f14) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
            if (c1Var4.H == null) {
                Paint paint4 = new Paint(1);
                c1Var4.H = paint4;
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(f14, -org.telegram.messenger.g0.L(0.4f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), c1Var4.H);
            if (c1Var4.I == null) {
                c1Var4.I = new Paint(1);
            }
            c1Var4.I.setColor(c1Var4.f36368c);
            int i36 = (int) (d * 255.0f);
            c1Var4.I.setAlpha(i36);
            rectF2.set(0.0f, org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(6.666f), org.telegram.messenger.g0.L(8.33f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f), c1Var4.I);
            if (c1Var4.L == null || Math.abs(c1Var4.K - org.telegram.messenger.g0.f24145p) > 0.1f) {
                c1Var4.K = org.telegram.messenger.g0.f24145p;
                Path path8 = new Path();
                c1Var4.L = path8;
                path8.moveTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(3.33f));
                c1Var4.L.lineTo(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(2.0f));
                rectF2.set(org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(0.33f), org.telegram.messenger.g0.L(4.99f), org.telegram.messenger.g0.L(3.6599998f));
                c1Var4.L.arcTo(rectF2, -180.0f, f17, false);
                c1Var4.L.lineTo(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.33f));
            }
            if (c1Var4.J == null) {
                Paint paint5 = new Paint(1);
                c1Var4.J = paint5;
                paint5.setStyle(Paint.Style.STROKE);
            }
            c1Var4.J.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            c1Var4.J.setColor(c1Var4.f36368c);
            c1Var4.J.setAlpha(i36);
            canvas.drawPath(c1Var4.L, c1Var4.J);
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
        r1 r1Var = this.f30547a;
        canvas.translate(i7, r1Var.getMediaOffsetY() + L + r1Var.Ua + f10);
        r1Var.L4.draw(canvas);
        canvas.restore();
        fj fjVar = r1Var.Q5;
        if (fjVar.D != 0 && fjVar.f23993k.media_unread) {
            Paint paint = org.telegram.ui.ActionBar.m6.S1;
            if (fjVar.P3()) {
                i10 = org.telegram.ui.ActionBar.m6.f29680tc;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f29645re;
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, r1Var.Qb));
            canvas.drawCircle(org.telegram.messenger.g0.L(6.0f) + i7 + r1Var.N4, r1Var.getMediaOffsetY() + org.telegram.messenger.g0.L(51.0f) + r1Var.Ua, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.S1);
        }
    }

    public final void d(fj fjVar, boolean z10) {
        boolean z11;
        boolean z12;
        xi xiVar;
        int L;
        aj ajVar;
        r1 r1Var = this.f30547a;
        ch.q0 q0Var = r1Var.O;
        int i7 = 0;
        if (!r1Var.f31623u6 && fjVar.f23993k.fwd_from != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        r1Var.s9 = z11;
        if ((r1Var.f31451h6 && !fjVar.P3() && (fjVar.P1() < 0 || fjVar.P1() == 2666000)) || (((fjVar.o3() && fjVar.A4()) || (fjVar.y3() && fjVar.f23993k.fwd_from.from_id == null)) && ((xiVar = r1Var.M) == null || (xiVar.f27917l & 4) != 0))) {
            z12 = true;
        } else {
            z12 = false;
        }
        r1Var.f31479j9 = z12;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (r1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            L = Q0 - org.telegram.messenger.g0.L(i7 + 50);
            r1Var.f31373b7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        } else {
            int parentWidth = r1Var.getParentWidth();
            if (r1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            L = parentWidth - org.telegram.messenger.g0.L(i7 + 50);
            r1Var.f31373b7 = Math.min(org.telegram.messenger.g0.L(270.0f), L);
        }
        if (r1Var.M != null) {
            r1Var.f31373b7 = L;
        }
        int v02 = r1Var.v0(L, fjVar);
        r1Var.setMessageObjectInternal(fjVar);
        r1Var.f31631v0 = org.telegram.messenger.g0.L(82.0f) + r1Var.Ua;
        if (org.telegram.messenger.g0.L(76.0f) + v02 >= (r1Var.f31373b7 - r1Var.A9) - org.telegram.messenger.g0.L(12.0f)) {
            r1Var.f31631v0 = org.telegram.messenger.g0.L(14.0f) + r1Var.f31631v0;
        }
        if (r1Var.M != null && (ajVar = r1Var.L) != null && ajVar.d.size() > 1) {
            if ((r1Var.M.f27917l & 4) == 0) {
                r1Var.f31631v0 -= org.telegram.messenger.g0.L(6.0f);
                r1Var.X1 -= org.telegram.messenger.g0.L(6.0f);
            }
            if ((r1Var.M.f27917l & 8) == 0) {
                r1Var.f31631v0 -= org.telegram.messenger.g0.L(6.0f);
            }
        }
        if (r1Var.J) {
            r1Var.Ua -= org.telegram.messenger.g0.L(1.0f);
        }
        q0Var.getClass();
        q0Var.o(L - org.telegram.messenger.g0.L(24.0f), 3);
        if (!q0Var.f5521p) {
            q0Var.f5519n = org.telegram.messenger.g0.L(12.0f) + q0Var.f5518m;
            r1Var.Z2(fjVar);
            int i10 = q0Var.f5520o;
            if (i10 > r1Var.f31373b7) {
                r1Var.f31373b7 = i10;
            }
            if (org.telegram.messenger.g0.L(24.0f) + q0Var.f5523r + r1Var.A9 > r1Var.f31373b7) {
                q0Var.f5519n = org.telegram.messenger.g0.L(12.0f) + q0Var.f5519n;
                q0Var.f5516k -= org.telegram.messenger.g0.L(12.0f);
            }
            if (!fjVar.G0 && fjVar.f24051z != null) {
                q0Var.f5516k = org.telegram.messenger.g0.L(14.0f) + q0Var.f5516k;
            }
            r1Var.f31631v0 += q0Var.f5519n;
        }
    }

    public final void e(fj fjVar, boolean z10) {
        int min;
        float f10;
        r1 r1Var = this.f30547a;
        ch.q0 q0Var = r1Var.O;
        boolean z11 = true;
        r1Var.s9 = !r1Var.f31623u6;
        int i7 = 0;
        if ((!r1Var.f31451h6 || fjVar.P3() || (fjVar.P1() >= 0 && fjVar.P1() != 2666000)) && ((!fjVar.o3() || !fjVar.A4()) && ((!fjVar.y3() || fjVar.f23993k.fwd_from.from_id != null) && (!r1Var.Y6 || fjVar.P3() || (!r1Var.f31502l6 && (!r1Var.f31515m6 || !r1Var.W6)))))) {
            z11 = false;
        }
        r1Var.f31479j9 = z11;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (r1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            min = Math.min(Q0 - org.telegram.messenger.g0.L(i7 + 50), org.telegram.messenger.g0.L(270.0f));
            r1Var.f31373b7 = min;
        } else {
            int parentWidth = r1Var.getParentWidth();
            if (r1Var.X6) {
                i7 = 71;
            } else if (z10) {
                i7 = 52;
            }
            min = Math.min(parentWidth - org.telegram.messenger.g0.L(i7 + 50), org.telegram.messenger.g0.L(270.0f));
            r1Var.f31373b7 = min;
        }
        r1Var.v0(r1Var.f31373b7, fjVar);
        r1Var.setMessageObjectInternal(fjVar);
        int L = org.telegram.messenger.g0.L(70.0f);
        int i10 = r1Var.Ua;
        r1Var.f31631v0 = L + i10;
        if (r1Var.J) {
            r1Var.Ua = i10 - org.telegram.messenger.g0.L(1.0f);
        }
        q0Var.getClass();
        if (fjVar.P3()) {
            f10 = 32.0f;
        } else {
            f10 = 24.0f;
        }
        q0Var.o(min - org.telegram.messenger.g0.L(f10), 3);
        if (!q0Var.f5521p) {
            q0Var.f5519n = q0Var.f5518m;
            if (TextUtils.isEmpty(fjVar.f24051z)) {
                q0Var.f5519n = org.telegram.messenger.g0.L(12.0f) + q0Var.f5519n;
            } else {
                q0Var.f5519n = org.telegram.messenger.g0.L(8.0f) + q0Var.f5519n;
            }
            int i11 = q0Var.f5520o;
            if (i11 > r1Var.f31373b7) {
                r1Var.f31373b7 = i11;
            }
            int L2 = org.telegram.messenger.g0.L(6.0f) + r1Var.A9;
            if (fj.b4(fjVar.f23993k) && !fjVar.n4()) {
                L2 -= org.telegram.messenger.g0.L(3.0f);
            } else if (fjVar.P3()) {
                L2 += org.telegram.messenger.g0.L(20.5f);
            }
            int extraTimeX = r1Var.getExtraTimeX() + L2;
            if (!r1Var.y2() && q0Var.f5523r + extraTimeX >= r1Var.f31373b7) {
                q0Var.f5519n = org.telegram.messenger.g0.L(12.0f) + q0Var.f5519n;
                q0Var.f5516k -= org.telegram.messenger.g0.L(12.0f);
            }
            r1Var.f31631v0 += q0Var.f5519n;
        }
    }
}
