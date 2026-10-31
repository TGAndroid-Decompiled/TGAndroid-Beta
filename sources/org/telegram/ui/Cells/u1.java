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
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.up;
public final class u1 {
    public final q1 f23120a;
    public int f23121b;
    public up f23122c;
    public String d;
    public b30 e;
    public Drawable f23123f;
    public int f23124g = -1;

    public u1(q1 q1Var) {
        this.f23120a = q1Var;
    }

    public final void a(Canvas canvas) {
        q1 q1Var = this.f23120a;
        ag.c2 c2Var = q1Var.T0;
        li.k kVar = q1Var.Qb;
        if (((Drawable) kVar.d) == null) {
            kVar.d = i0.a.f((Context) kVar.f12100b, 2131231645);
        }
        Drawable drawable = (Drawable) kVar.d;
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int B = (int) c3.i0.B(c2Var.M0, intrinsicWidth, 2.0f, c2Var.K0);
        int interpolation = (int) ((((c2Var.N0 / 2.0f) - intrinsicHeight) + c2Var.L0) - ((1.0f - gr.f26499k.getInterpolation(c2Var.f14384h1)) * org.telegram.messenger.i0.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, c2Var.f14384h1 * 5.0f) * 255.0f));
        drawable.setBounds(B, interpolation, intrinsicWidth + B, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (c2Var.f14384h1 < 1.0f) {
            q1Var.invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        String C;
        float abs;
        float f12;
        RectF rectF;
        float f13;
        q1 q1Var;
        ImageReceiver imageReceiver;
        x1 x1Var;
        float f14;
        float f15;
        float f16;
        int i11;
        q1 q1Var2 = this.f23120a;
        int i12 = q1Var2.Y5;
        ImageReceiver imageReceiver2 = q1Var2.D7;
        x1 x1Var2 = q1Var2.gb;
        RectF rectF2 = q1Var2.f22488a4;
        ag.c2 c2Var = q1Var2.T0;
        if (q1Var2.f22515c3 != null) {
            if (q1Var2.O5.P3()) {
                org.telegram.ui.ActionBar.t6.H2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Tc, q1Var2.Ob));
                TextPaint textPaint = org.telegram.ui.ActionBar.t6.I2;
                if (q1Var2.v2()) {
                    i11 = org.telegram.ui.ActionBar.t6.f21335zc;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.f21317yc;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, q1Var2.Ob));
            } else {
                org.telegram.ui.ActionBar.t6.H2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, q1Var2.Ob));
                TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.I2;
                if (q1Var2.v2()) {
                    i10 = org.telegram.ui.ActionBar.t6.f21302xe;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.f21284we;
                }
                textPaint2.setColor(org.telegram.ui.ActionBar.t6.w0(i10, q1Var2.Ob));
            }
            if (jj.o1(q1Var2.O5.f16337k) instanceof TLRPC.TL_messageMediaGeoLive) {
                int A = (int) (c2Var.A() + org.telegram.messenger.i0.L(30.0f));
                if (q1Var2.f22555f3 && !x1Var2.f23496j) {
                    x1Var2.f23506l = null;
                    x1Var2.f23514n = null;
                    x1Var2.f23518o = null;
                    q1Var = q1Var2;
                    imageReceiver = imageReceiver2;
                    f11 = 2.0f;
                    f7 = 1.0f;
                    f10 = 255.0f;
                } else {
                    q1Var2.E9 = true;
                    StaticLayout staticLayout = q1Var2.f22515c3;
                    StaticLayout staticLayout2 = q1Var2.f22752v3;
                    f7 = 1.0f;
                    boolean z10 = false;
                    if (x1Var2.f23496j) {
                        float f17 = x1Var2.f23510m;
                        String str = x1Var2.f23506l;
                        staticLayout = x1Var2.f23514n;
                        StaticLayout staticLayout3 = x1Var2.f23518o;
                        f10 = 255.0f;
                        abs = f17;
                        f12 = 1.0f - x1Var2.L1;
                        C = str;
                        staticLayout2 = staticLayout3;
                        f11 = 2.0f;
                    } else {
                        f10 = 255.0f;
                        if (jj.o1(q1Var2.O5.f16337k).period == Integer.MAX_VALUE) {
                            C = "";
                            f12 = 1.0f;
                            abs = 1.0f;
                            f11 = 2.0f;
                            z10 = true;
                        } else {
                            f11 = 2.0f;
                            C = cd.C(Math.abs(jj.o1(q1Var2.O5.f16337k).period - (ConnectionsManager.getInstance(i12).getCurrentTime() - q1Var2.O5.f16337k.date)));
                            abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i12).getCurrentTime() - q1Var2.O5.f16337k.date) / jj.o1(q1Var2.O5.f16337k).period);
                            f12 = 1.0f;
                        }
                    }
                    float f18 = f12;
                    rectF2.set(c2Var.y() - org.telegram.messenger.i0.L(43.0f), A - org.telegram.messenger.i0.L(15.0f), c2Var.y() - org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(15.0f) + A);
                    if (q1Var2.O5.P3()) {
                        Paint paint = org.telegram.ui.ActionBar.t6.f21073l2;
                        int i13 = org.telegram.ui.ActionBar.t6.Jb;
                        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i13, q1Var2.Ob));
                        org.telegram.ui.ActionBar.t6.F2.setColor(org.telegram.ui.ActionBar.t6.w0(i13, q1Var2.Ob));
                    } else {
                        Paint paint2 = org.telegram.ui.ActionBar.t6.f21073l2;
                        int i14 = org.telegram.ui.ActionBar.t6.f21192rd;
                        paint2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, q1Var2.Ob));
                        org.telegram.ui.ActionBar.t6.F2.setColor(org.telegram.ui.ActionBar.t6.w0(i14, q1Var2.Ob));
                    }
                    int alpha = org.telegram.ui.ActionBar.t6.H2.getAlpha();
                    int alpha2 = org.telegram.ui.ActionBar.t6.I2.getAlpha();
                    int alpha3 = org.telegram.ui.ActionBar.t6.F2.getAlpha();
                    int i15 = (f18 > 1.0f ? 1 : (f18 == 1.0f ? 0 : -1));
                    if (i15 != 0) {
                        f13 = 50.0f;
                        rectF = rectF2;
                        org.telegram.ui.ActionBar.t6.H2.setAlpha((int) (alpha * f18));
                        org.telegram.ui.ActionBar.t6.I2.setAlpha((int) (alpha2 * f18));
                        org.telegram.ui.ActionBar.t6.F2.setAlpha((int) (alpha3 * f18));
                        canvas.save();
                        canvas.translate(0.0f, (-org.telegram.messenger.i0.L(50.0f)) * x1Var2.L1);
                    } else {
                        rectF = rectF2;
                        f13 = 50.0f;
                    }
                    org.telegram.ui.ActionBar.t6.f21073l2.setAlpha((int) (f18 * f13));
                    StaticLayout staticLayout4 = staticLayout2;
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), org.telegram.messenger.i0.L(15.0f), org.telegram.ui.ActionBar.t6.f21073l2);
                    org.telegram.ui.ActionBar.t6.f21073l2.setAlpha((int) (f18 * f10));
                    StaticLayout staticLayout5 = staticLayout;
                    q1Var = q1Var2;
                    imageReceiver = imageReceiver2;
                    RectF rectF3 = rectF;
                    canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.t6.f21073l2);
                    if (z10) {
                        if (this.f23123f == null) {
                            this.f23123f = q1Var.getContext().getResources().getDrawable(2131231130).mutate();
                        }
                        if (org.telegram.ui.ActionBar.t6.F2.getColor() != this.f23124g) {
                            Drawable drawable = this.f23123f;
                            int color = org.telegram.ui.ActionBar.t6.F2.getColor();
                            this.f23124g = color;
                            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        }
                        x1Var = x1Var2;
                        f14 = abs;
                        this.f23123f.setBounds(f1.z(2, (int) rectF3.centerX(), this.f23123f), f1.y(2, (int) rectF3.centerY(), this.f23123f), f1.w(2, (int) rectF3.centerX(), this.f23123f), f1.f(2, (int) rectF3.centerY(), this.f23123f));
                        this.f23123f.draw(canvas);
                    } else {
                        x1Var = x1Var2;
                        f14 = abs;
                        float measureText = org.telegram.ui.ActionBar.t6.F2.measureText(C);
                        int length = C.length();
                        if (length > 4) {
                            f15 = 0.75f;
                        } else if (length > 3) {
                            f15 = 0.85f;
                        } else {
                            f15 = 1.0f;
                        }
                        canvas.save();
                        canvas.scale(f15, f15, rectF3.centerX(), rectF3.centerY());
                        canvas.drawText(C, rectF3.centerX() - (measureText / f11), org.telegram.messenger.i0.L(4.0f) + A, org.telegram.ui.ActionBar.t6.F2);
                        canvas.restore();
                    }
                    if (staticLayout5 != null && staticLayout4 != null) {
                        canvas.save();
                        canvas.translate(c2Var.K0 + org.telegram.messenger.i0.L(10.0f), c2Var.A() + org.telegram.messenger.i0.L(10.0f));
                        staticLayout5.draw(canvas);
                        canvas.translate(0.0f, org.telegram.messenger.i0.L(23.0f));
                        staticLayout4.draw(canvas);
                        canvas.restore();
                    }
                    if (i15 != 0) {
                        org.telegram.ui.ActionBar.t6.H2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.t6.I2.setAlpha(alpha2);
                        org.telegram.ui.ActionBar.t6.F2.setAlpha(alpha3);
                        canvas.restore();
                    }
                    x1 x1Var3 = x1Var;
                    x1Var3.f23510m = f14;
                    x1Var3.f23506l = C;
                    x1Var3.f23514n = staticLayout5;
                    x1Var3.f23518o = staticLayout4;
                }
                if (c2Var.N()) {
                    f16 = f7;
                } else {
                    f16 = c2Var.f14384h1;
                }
                if (f16 > 0.0f) {
                    if (c2Var.L() || c2Var.N()) {
                        int L = (int) (((c2Var.M0 / f11) + c2Var.K0) - org.telegram.messenger.i0.L(31.0f));
                        int L2 = (int) ((((c2Var.N0 / f11) + c2Var.L0) - org.telegram.messenger.i0.L(38.0f)) - ((f7 - gr.f26499k.getInterpolation(f16)) * org.telegram.messenger.i0.L(16.0f)));
                        li.k kVar = q1Var.Qb;
                        if (((Drawable) kVar.f12101c) == null) {
                            kVar.f12101c = i0.a.f((Context) kVar.f12100b, 2131231635);
                        }
                        Drawable drawable2 = (Drawable) kVar.f12101c;
                        z.t(L, L2, drawable2);
                        float f19 = f16 * 5.0f;
                        drawable2.setAlpha((int) (Math.min(f7, f19) * f10));
                        drawable2.draw(canvas);
                        ImageReceiver imageReceiver3 = imageReceiver;
                        imageReceiver3.y0(org.telegram.messenger.i0.L(5.0f) + L, org.telegram.messenger.i0.L(5.0f) + L2, org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(52.0f));
                        imageReceiver3.setAlpha(Math.min(1.0f, f19));
                        imageReceiver3.h(canvas, null);
                        return;
                    }
                    return;
                }
                return;
            }
            canvas.save();
            canvas.translate(c2Var.K0 + org.telegram.messenger.i0.L(6.0f), c2Var.A() + org.telegram.messenger.i0.L(8.0f));
            q1Var2.f22515c3.draw(canvas);
            if (q1Var2.f22752v3 != null) {
                canvas.translate(0.0f, org.telegram.messenger.i0.L(21.0f));
                q1Var2.f22752v3.draw(canvas);
            }
            canvas.restore();
        }
    }
}
