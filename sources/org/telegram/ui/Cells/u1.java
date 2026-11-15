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
import org.telegram.messenger.k20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.vp;
public final class u1 {
    public final q1 f31701a;
    public int f31702b;
    public vp f31703c;
    public String d;
    public k20 f31704e;
    public Drawable f31705f;
    public int f31706g = -1;

    public u1(q1 q1Var) {
        this.f31701a = q1Var;
    }

    public final void a(Canvas canvas) {
        q1 q1Var = this.f31701a;
        fi.u2 u2Var = q1Var.U0;
        h6.m mVar = q1Var.Sb;
        if (((Drawable) mVar.d) == null) {
            mVar.d = i5.c.g((Context) mVar.f13624b, 2131231646);
        }
        Drawable drawable = (Drawable) mVar.d;
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int A = (int) com.google.android.gms.internal.vision.e2.A(u2Var.N0, intrinsicWidth, 2.0f, u2Var.L0);
        int interpolation = (int) ((((u2Var.O0 / 2.0f) - intrinsicHeight) + u2Var.M0) - ((1.0f - er.f34424k.getInterpolation(u2Var.f22278i1)) * org.telegram.messenger.g0.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, u2Var.f22278i1 * 5.0f) * 255.0f));
        drawable.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (u2Var.f22278i1 < 1.0f) {
            q1Var.invalidate();
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
        q1 q1Var;
        ImageReceiver imageReceiver;
        x1 x1Var;
        float f15;
        float f16;
        float f17;
        int i10;
        q1 q1Var2 = this.f31701a;
        int i11 = q1Var2.f30908a6;
        ImageReceiver imageReceiver2 = q1Var2.F7;
        x1 x1Var2 = q1Var2.f31018ib;
        RectF rectF2 = q1Var2.f30933c4;
        fi.u2 u2Var = q1Var2.U0;
        if (q1Var2.f30958e3 != null) {
            if (q1Var2.Q5.P3()) {
                org.telegram.ui.ActionBar.j6.H2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Wc, q1Var2.Qb));
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.I2;
                if (q1Var2.y2()) {
                    i10 = org.telegram.ui.ActionBar.j6.Cc;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.Bc;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, q1Var2.Qb));
            } else {
                org.telegram.ui.ActionBar.j6.H2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Vc, q1Var2.Qb));
                TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.I2;
                if (q1Var2.y2()) {
                    i7 = org.telegram.ui.ActionBar.j6.Ae;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.f29268ze;
                }
                textPaint2.setColor(org.telegram.ui.ActionBar.j6.w0(i7, q1Var2.Qb));
            }
            if (gj.n1(q1Var2.Q5.f23817k) instanceof TLRPC.TL_messageMediaGeoLive) {
                int A = (int) (u2Var.A() + org.telegram.messenger.g0.L(30.0f));
                if (q1Var2.f30998h3 && !x1Var2.f31956j) {
                    x1Var2.f31965l = null;
                    x1Var2.f31973n = null;
                    x1Var2.f31976o = null;
                    q1Var = q1Var2;
                    imageReceiver = imageReceiver2;
                    f12 = 2.0f;
                    f10 = 1.0f;
                    f11 = 255.0f;
                } else {
                    q1Var2.G9 = true;
                    StaticLayout staticLayout = q1Var2.f30958e3;
                    StaticLayout staticLayout2 = q1Var2.f31212x3;
                    f10 = 1.0f;
                    boolean z10 = false;
                    if (x1Var2.f31956j) {
                        float f18 = x1Var2.f31969m;
                        String str = x1Var2.f31965l;
                        staticLayout = x1Var2.f31973n;
                        StaticLayout staticLayout3 = x1Var2.f31976o;
                        f11 = 255.0f;
                        abs = f18;
                        f13 = 1.0f - x1Var2.L1;
                        C = str;
                        staticLayout2 = staticLayout3;
                        f12 = 2.0f;
                    } else {
                        f11 = 255.0f;
                        if (gj.n1(q1Var2.Q5.f23817k).period == Integer.MAX_VALUE) {
                            C = "";
                            f13 = 1.0f;
                            abs = 1.0f;
                            f12 = 2.0f;
                            z10 = true;
                        } else {
                            f12 = 2.0f;
                            C = hd.C(Math.abs(gj.n1(q1Var2.Q5.f23817k).period - (ConnectionsManager.getInstance(i11).getCurrentTime() - q1Var2.Q5.f23817k.date)));
                            abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i11).getCurrentTime() - q1Var2.Q5.f23817k.date) / gj.n1(q1Var2.Q5.f23817k).period);
                            f13 = 1.0f;
                        }
                    }
                    float f19 = f13;
                    rectF2.set(u2Var.y() - org.telegram.messenger.g0.L(43.0f), A - org.telegram.messenger.g0.L(15.0f), u2Var.y() - org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(15.0f) + A);
                    if (q1Var2.Q5.P3()) {
                        Paint paint = org.telegram.ui.ActionBar.j6.f28992l2;
                        int i12 = org.telegram.ui.ActionBar.j6.Mb;
                        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i12, q1Var2.Qb));
                        org.telegram.ui.ActionBar.j6.F2.setColor(org.telegram.ui.ActionBar.j6.w0(i12, q1Var2.Qb));
                    } else {
                        Paint paint2 = org.telegram.ui.ActionBar.j6.f28992l2;
                        int i13 = org.telegram.ui.ActionBar.j6.f29172ud;
                        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(i13, q1Var2.Qb));
                        org.telegram.ui.ActionBar.j6.F2.setColor(org.telegram.ui.ActionBar.j6.w0(i13, q1Var2.Qb));
                    }
                    int alpha = org.telegram.ui.ActionBar.j6.H2.getAlpha();
                    int alpha2 = org.telegram.ui.ActionBar.j6.I2.getAlpha();
                    int alpha3 = org.telegram.ui.ActionBar.j6.F2.getAlpha();
                    int i14 = (f19 > 1.0f ? 1 : (f19 == 1.0f ? 0 : -1));
                    if (i14 != 0) {
                        f14 = 50.0f;
                        rectF = rectF2;
                        org.telegram.ui.ActionBar.j6.H2.setAlpha((int) (alpha * f19));
                        org.telegram.ui.ActionBar.j6.I2.setAlpha((int) (alpha2 * f19));
                        org.telegram.ui.ActionBar.j6.F2.setAlpha((int) (alpha3 * f19));
                        canvas.save();
                        canvas.translate(0.0f, (-org.telegram.messenger.g0.L(50.0f)) * x1Var2.L1);
                    } else {
                        rectF = rectF2;
                        f14 = 50.0f;
                    }
                    org.telegram.ui.ActionBar.j6.f28992l2.setAlpha((int) (f19 * f14));
                    StaticLayout staticLayout4 = staticLayout2;
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), org.telegram.messenger.g0.L(15.0f), org.telegram.ui.ActionBar.j6.f28992l2);
                    org.telegram.ui.ActionBar.j6.f28992l2.setAlpha((int) (f19 * f11));
                    StaticLayout staticLayout5 = staticLayout;
                    q1Var = q1Var2;
                    imageReceiver = imageReceiver2;
                    RectF rectF3 = rectF;
                    canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.j6.f28992l2);
                    if (z10) {
                        if (this.f31705f == null) {
                            this.f31705f = q1Var.getContext().getResources().getDrawable(2131231130).mutate();
                        }
                        if (org.telegram.ui.ActionBar.j6.F2.getColor() != this.f31706g) {
                            Drawable drawable = this.f31705f;
                            int color = org.telegram.ui.ActionBar.j6.F2.getColor();
                            this.f31706g = color;
                            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        }
                        x1Var = x1Var2;
                        f15 = abs;
                        this.f31705f.setBounds(y0.A(2, (int) rectF3.centerX(), this.f31705f), y0.y(2, (int) rectF3.centerY(), this.f31705f), y0.w(2, (int) rectF3.centerX(), this.f31705f), y0.h(2, (int) rectF3.centerY(), this.f31705f));
                        this.f31705f.draw(canvas);
                    } else {
                        x1Var = x1Var2;
                        f15 = abs;
                        float measureText = org.telegram.ui.ActionBar.j6.F2.measureText(C);
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
                        canvas.drawText(C, rectF3.centerX() - (measureText / f12), org.telegram.messenger.g0.L(4.0f) + A, org.telegram.ui.ActionBar.j6.F2);
                        canvas.restore();
                    }
                    if (staticLayout5 != null && staticLayout4 != null) {
                        canvas.save();
                        canvas.translate(u2Var.L0 + org.telegram.messenger.g0.L(10.0f), u2Var.A() + org.telegram.messenger.g0.L(10.0f));
                        staticLayout5.draw(canvas);
                        canvas.translate(0.0f, org.telegram.messenger.g0.L(23.0f));
                        staticLayout4.draw(canvas);
                        canvas.restore();
                    }
                    if (i14 != 0) {
                        org.telegram.ui.ActionBar.j6.H2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.j6.I2.setAlpha(alpha2);
                        org.telegram.ui.ActionBar.j6.F2.setAlpha(alpha3);
                        canvas.restore();
                    }
                    x1 x1Var3 = x1Var;
                    x1Var3.f31969m = f15;
                    x1Var3.f31965l = C;
                    x1Var3.f31973n = staticLayout5;
                    x1Var3.f31976o = staticLayout4;
                }
                if (u2Var.N()) {
                    f17 = f10;
                } else {
                    f17 = u2Var.f22278i1;
                }
                if (f17 > 0.0f) {
                    if (u2Var.L() || u2Var.N()) {
                        int L = (int) (((u2Var.N0 / f12) + u2Var.L0) - org.telegram.messenger.g0.L(31.0f));
                        int L2 = (int) ((((u2Var.O0 / f12) + u2Var.M0) - org.telegram.messenger.g0.L(38.0f)) - ((f10 - er.f34424k.getInterpolation(f17)) * org.telegram.messenger.g0.L(16.0f)));
                        h6.m mVar = q1Var.Sb;
                        if (((Drawable) mVar.f13625c) == null) {
                            mVar.f13625c = i5.c.g((Context) mVar.f13624b, 2131231634);
                        }
                        Drawable drawable2 = (Drawable) mVar.f13625c;
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
            canvas.translate(u2Var.L0 + org.telegram.messenger.g0.L(6.0f), u2Var.A() + org.telegram.messenger.g0.L(8.0f));
            q1Var2.f30958e3.draw(canvas);
            if (q1Var2.f31212x3 != null) {
                canvas.translate(0.0f, org.telegram.messenger.g0.L(21.0f));
                q1Var2.f31212x3.draw(canvas);
            }
            canvas.restore();
        }
    }
}
