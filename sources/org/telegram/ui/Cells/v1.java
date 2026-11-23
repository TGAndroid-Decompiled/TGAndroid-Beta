package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.nr;
public final class v1 {
    public final r1 f32174a;
    public int f32175b;
    public eq f32176c;
    public String d;
    public i20 f32177e;
    public Drawable f32178f;
    public int f32179g = -1;

    public v1(r1 r1Var) {
        this.f32174a = r1Var;
    }

    public final void a(Canvas canvas) {
        r1 r1Var = this.f32174a;
        fi.s2 s2Var = r1Var.U0;
        h6.m mVar = r1Var.Sb;
        if (((Drawable) mVar.d) == null) {
            mVar.d = i5.c.g((Context) mVar.f13968b, 2131231647);
        }
        Drawable drawable = (Drawable) mVar.d;
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int A = (int) com.google.android.gms.internal.vision.e2.A(s2Var.N0, intrinsicWidth, 2.0f, s2Var.L0);
        int interpolation = (int) ((((s2Var.O0 / 2.0f) - intrinsicHeight) + s2Var.M0) - ((1.0f - nr.f37965k.getInterpolation(s2Var.f22672i1)) * org.telegram.messenger.g0.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, s2Var.f22672i1 * 5.0f) * 255.0f));
        drawable.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (s2Var.f22672i1 < 1.0f) {
            r1Var.invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        float f12;
        String C;
        float abs;
        float f13;
        RectF rectF;
        float f14;
        r1 r1Var;
        ImageReceiver imageReceiver;
        y1 y1Var;
        float f15;
        float f16;
        float f17;
        int i10;
        r1 r1Var2 = this.f32174a;
        int i11 = r1Var2.f31361a6;
        ImageReceiver imageReceiver2 = r1Var2.F7;
        y1 y1Var2 = r1Var2.f31471ib;
        RectF rectF2 = r1Var2.f31386c4;
        fi.s2 s2Var = r1Var2.U0;
        if (r1Var2.f31411e3 != null) {
            if (r1Var2.Q5.P3()) {
                org.telegram.ui.ActionBar.m6.H2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, r1Var2.Qb));
                TextPaint textPaint = org.telegram.ui.ActionBar.m6.I2;
                if (r1Var2.A2()) {
                    i10 = org.telegram.ui.ActionBar.m6.Cc;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.Bc;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, r1Var2.Qb));
            } else {
                org.telegram.ui.ActionBar.m6.H2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vc, r1Var2.Qb));
                TextPaint textPaint2 = org.telegram.ui.ActionBar.m6.I2;
                if (r1Var2.A2()) {
                    i7 = org.telegram.ui.ActionBar.m6.Ae;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f29800ze;
                }
                textPaint2.setColor(org.telegram.ui.ActionBar.m6.w0(i7, r1Var2.Qb));
            }
            if (gj.n1(r1Var2.Q5.f24213k) instanceof TLRPC.TL_messageMediaGeoLive) {
                int A = (int) (s2Var.A() + org.telegram.messenger.g0.L(30.0f));
                if (r1Var2.f31451h3 && !y1Var2.f32417j) {
                    y1Var2.f32426l = null;
                    y1Var2.f32434n = null;
                    y1Var2.f32437o = null;
                    r1Var = r1Var2;
                    imageReceiver = imageReceiver2;
                    f12 = 2.0f;
                    f10 = 1.0f;
                    f11 = 255.0f;
                } else {
                    r1Var2.G9 = true;
                    StaticLayout staticLayout = r1Var2.f31411e3;
                    StaticLayout staticLayout2 = r1Var2.f31665x3;
                    f10 = 1.0f;
                    boolean z10 = false;
                    if (y1Var2.f32417j) {
                        float f18 = y1Var2.f32430m;
                        String str = y1Var2.f32426l;
                        staticLayout = y1Var2.f32434n;
                        StaticLayout staticLayout3 = y1Var2.f32437o;
                        f11 = 255.0f;
                        abs = f18;
                        f13 = 1.0f - y1Var2.L1;
                        C = str;
                        staticLayout2 = staticLayout3;
                        f12 = 2.0f;
                    } else {
                        f11 = 255.0f;
                        if (gj.n1(r1Var2.Q5.f24213k).period == Integer.MAX_VALUE) {
                            C = "";
                            f13 = 1.0f;
                            abs = 1.0f;
                            f12 = 2.0f;
                            z10 = true;
                        } else {
                            f12 = 2.0f;
                            C = hd.C(Math.abs(gj.n1(r1Var2.Q5.f24213k).period - (ConnectionsManager.getInstance(i11).getCurrentTime() - r1Var2.Q5.f24213k.date)));
                            abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i11).getCurrentTime() - r1Var2.Q5.f24213k.date) / gj.n1(r1Var2.Q5.f24213k).period);
                            f13 = 1.0f;
                        }
                    }
                    float f19 = f13;
                    rectF2.set(s2Var.y() - org.telegram.messenger.g0.L(43.0f), A - org.telegram.messenger.g0.L(15.0f), s2Var.y() - org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(15.0f) + A);
                    if (r1Var2.Q5.P3()) {
                        Paint paint = org.telegram.ui.ActionBar.m6.f29524l2;
                        int i12 = org.telegram.ui.ActionBar.m6.Mb;
                        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i12, r1Var2.Qb));
                        org.telegram.ui.ActionBar.m6.F2.setColor(org.telegram.ui.ActionBar.m6.w0(i12, r1Var2.Qb));
                    } else {
                        Paint paint2 = org.telegram.ui.ActionBar.m6.f29524l2;
                        int i13 = org.telegram.ui.ActionBar.m6.f29704ud;
                        paint2.setColor(org.telegram.ui.ActionBar.m6.w0(i13, r1Var2.Qb));
                        org.telegram.ui.ActionBar.m6.F2.setColor(org.telegram.ui.ActionBar.m6.w0(i13, r1Var2.Qb));
                    }
                    int alpha = org.telegram.ui.ActionBar.m6.H2.getAlpha();
                    int alpha2 = org.telegram.ui.ActionBar.m6.I2.getAlpha();
                    int alpha3 = org.telegram.ui.ActionBar.m6.F2.getAlpha();
                    int i14 = (f19 > 1.0f ? 1 : (f19 == 1.0f ? 0 : -1));
                    if (i14 != 0) {
                        f14 = 50.0f;
                        rectF = rectF2;
                        org.telegram.ui.ActionBar.m6.H2.setAlpha((int) (alpha * f19));
                        org.telegram.ui.ActionBar.m6.I2.setAlpha((int) (alpha2 * f19));
                        org.telegram.ui.ActionBar.m6.F2.setAlpha((int) (alpha3 * f19));
                        canvas.save();
                        canvas.translate(0.0f, (-org.telegram.messenger.g0.L(50.0f)) * y1Var2.L1);
                    } else {
                        rectF = rectF2;
                        f14 = 50.0f;
                    }
                    org.telegram.ui.ActionBar.m6.f29524l2.setAlpha((int) (f19 * f14));
                    StaticLayout staticLayout4 = staticLayout2;
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), org.telegram.messenger.g0.L(15.0f), org.telegram.ui.ActionBar.m6.f29524l2);
                    org.telegram.ui.ActionBar.m6.f29524l2.setAlpha((int) (f19 * f11));
                    StaticLayout staticLayout5 = staticLayout;
                    r1Var = r1Var2;
                    imageReceiver = imageReceiver2;
                    RectF rectF3 = rectF;
                    canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.m6.f29524l2);
                    if (z10) {
                        if (this.f32178f == null) {
                            this.f32178f = r1Var.getContext().getResources().getDrawable(2131231130).mutate();
                        }
                        if (org.telegram.ui.ActionBar.m6.F2.getColor() != this.f32179g) {
                            Drawable drawable = this.f32178f;
                            int color = org.telegram.ui.ActionBar.m6.F2.getColor();
                            this.f32179g = color;
                            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        }
                        y1Var = y1Var2;
                        f15 = abs;
                        this.f32178f.setBounds(c0.C(2, (int) rectF3.centerX(), this.f32178f), c0.A(2, (int) rectF3.centerY(), this.f32178f), c0.y(2, (int) rectF3.centerX(), this.f32178f), c0.j(2, (int) rectF3.centerY(), this.f32178f));
                        this.f32178f.draw(canvas);
                    } else {
                        y1Var = y1Var2;
                        f15 = abs;
                        float measureText = org.telegram.ui.ActionBar.m6.F2.measureText(C);
                        int length = C.length();
                        if (length > 4) {
                            f16 = 0.75f;
                        } else if (length > 3) {
                            f16 = 0.85f;
                        } else {
                            f16 = 1.0f;
                        }
                        canvas.save();
                        canvas.scale(f16, f16, rectF3.centerX(), rectF3.centerY());
                        canvas.drawText(C, rectF3.centerX() - (measureText / f12), org.telegram.messenger.g0.L(4.0f) + A, org.telegram.ui.ActionBar.m6.F2);
                        canvas.restore();
                    }
                    if (staticLayout5 != null && staticLayout4 != null) {
                        canvas.save();
                        canvas.translate(s2Var.L0 + org.telegram.messenger.g0.L(10.0f), s2Var.A() + org.telegram.messenger.g0.L(10.0f));
                        staticLayout5.draw(canvas);
                        canvas.translate(0.0f, org.telegram.messenger.g0.L(23.0f));
                        staticLayout4.draw(canvas);
                        canvas.restore();
                    }
                    if (i14 != 0) {
                        org.telegram.ui.ActionBar.m6.H2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.m6.I2.setAlpha(alpha2);
                        org.telegram.ui.ActionBar.m6.F2.setAlpha(alpha3);
                        canvas.restore();
                    }
                    y1 y1Var3 = y1Var;
                    y1Var3.f32430m = f15;
                    y1Var3.f32426l = C;
                    y1Var3.f32434n = staticLayout5;
                    y1Var3.f32437o = staticLayout4;
                }
                if (s2Var.N()) {
                    f17 = f10;
                } else {
                    f17 = s2Var.f22672i1;
                }
                if (f17 > 0.0f) {
                    if (s2Var.L() || s2Var.N()) {
                        int L = (int) (((s2Var.N0 / f12) + s2Var.L0) - org.telegram.messenger.g0.L(31.0f));
                        int L2 = (int) ((((s2Var.O0 / f12) + s2Var.M0) - org.telegram.messenger.g0.L(38.0f)) - ((f10 - nr.f37965k.getInterpolation(f17)) * org.telegram.messenger.g0.L(16.0f)));
                        h6.m mVar = r1Var.Sb;
                        if (((Drawable) mVar.f13969c) == null) {
                            mVar.f13969c = i5.c.g((Context) mVar.f13968b, 2131231635);
                        }
                        Drawable drawable2 = (Drawable) mVar.f13969c;
                        z.s(L, L2, drawable2);
                        float f20 = f17 * 5.0f;
                        drawable2.setAlpha((int) (Math.min(f10, f20) * f11));
                        drawable2.draw(canvas);
                        ImageReceiver imageReceiver3 = imageReceiver;
                        imageReceiver3.y0(org.telegram.messenger.g0.L(5.0f) + L, org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(52.0f));
                        imageReceiver3.setAlpha(Math.min(1.0f, f20));
                        imageReceiver3.h(canvas, null);
                        return;
                    }
                    return;
                }
                return;
            }
            canvas.save();
            canvas.translate(s2Var.L0 + org.telegram.messenger.g0.L(6.0f), s2Var.A() + org.telegram.messenger.g0.L(8.0f));
            r1Var2.f31411e3.draw(canvas);
            if (r1Var2.f31665x3 != null) {
                canvas.translate(0.0f, org.telegram.messenger.g0.L(21.0f));
                r1Var2.f31665x3.draw(canvas);
            }
            canvas.restore();
        }
    }
}
