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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.m20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.xq;
public final class u1 {
    public final q1 f30548a;
    public int f30549b;
    public np f30550c;
    public String d;
    public m20 f30551e;
    public Drawable f30552f;
    public int f30553g = -1;

    public u1(q1 q1Var) {
        this.f30548a = q1Var;
    }

    public final void a(Canvas canvas) {
        q1 q1Var = this.f30548a;
        di.z2 z2Var = q1Var.T0;
        h6.m mVar = q1Var.Rb;
        if (((Drawable) mVar.d) == null) {
            mVar.d = jg.g.h((Context) mVar.f14264b, 2131231646);
        }
        Drawable drawable = (Drawable) mVar.d;
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int A = (int) com.google.android.recaptcha.internal.a.A(z2Var.M0, intrinsicWidth, 2.0f, z2Var.K0);
        int interpolation = (int) ((((z2Var.N0 / 2.0f) - intrinsicHeight) + z2Var.L0) - ((1.0f - xq.f40333k.getInterpolation(z2Var.f21194h1)) * org.telegram.messenger.g0.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, z2Var.f21194h1 * 5.0f) * 255.0f));
        drawable.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (z2Var.f21194h1 < 1.0f) {
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
        q1 q1Var2 = this.f30548a;
        int i11 = q1Var2.Z5;
        ImageReceiver imageReceiver2 = q1Var2.E7;
        x1 x1Var2 = q1Var2.f29868hb;
        RectF rectF2 = q1Var2.f29783b4;
        di.z2 z2Var = q1Var2.T0;
        if (q1Var2.f29808d3 != null) {
            if (q1Var2.P5.Q3()) {
                org.telegram.ui.ActionBar.k6.H2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tc, q1Var2.Pb));
                TextPaint textPaint = org.telegram.ui.ActionBar.k6.I2;
                if (q1Var2.x2()) {
                    i10 = org.telegram.ui.ActionBar.k6.f28263zc;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f28245yc;
                }
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, q1Var2.Pb));
            } else {
                org.telegram.ui.ActionBar.k6.H2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var2.Pb));
                TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.I2;
                if (q1Var2.x2()) {
                    i7 = org.telegram.ui.ActionBar.k6.f28228xe;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.f28209we;
                }
                textPaint2.setColor(org.telegram.ui.ActionBar.k6.w0(i7, q1Var2.Pb));
            }
            if (ij.o1(q1Var2.P5.f23237k) instanceof TLRPC.TL_messageMediaGeoLive) {
                int A = (int) (z2Var.A() + org.telegram.messenger.g0.L(30.0f));
                if (q1Var2.f29847g3 && !x1Var2.f30802j) {
                    x1Var2.f30811l = null;
                    x1Var2.f30819n = null;
                    x1Var2.f30822o = null;
                    q1Var = q1Var2;
                    imageReceiver = imageReceiver2;
                    f12 = 2.0f;
                    f10 = 1.0f;
                    f11 = 255.0f;
                } else {
                    q1Var2.F9 = true;
                    StaticLayout staticLayout = q1Var2.f29808d3;
                    StaticLayout staticLayout2 = q1Var2.f30047w3;
                    f10 = 1.0f;
                    boolean z9 = false;
                    if (x1Var2.f30802j) {
                        float f18 = x1Var2.f30815m;
                        String str = x1Var2.f30811l;
                        staticLayout = x1Var2.f30819n;
                        StaticLayout staticLayout3 = x1Var2.f30822o;
                        f11 = 255.0f;
                        abs = f18;
                        f13 = 1.0f - x1Var2.L1;
                        C = str;
                        staticLayout2 = staticLayout3;
                        f12 = 2.0f;
                    } else {
                        f11 = 255.0f;
                        if (ij.o1(q1Var2.P5.f23237k).period == Integer.MAX_VALUE) {
                            C = "";
                            f13 = 1.0f;
                            abs = 1.0f;
                            f12 = 2.0f;
                            z9 = true;
                        } else {
                            f12 = 2.0f;
                            C = hd.C(Math.abs(ij.o1(q1Var2.P5.f23237k).period - (ConnectionsManager.getInstance(i11).getCurrentTime() - q1Var2.P5.f23237k.date)));
                            abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i11).getCurrentTime() - q1Var2.P5.f23237k.date) / ij.o1(q1Var2.P5.f23237k).period);
                            f13 = 1.0f;
                        }
                    }
                    float f19 = f13;
                    rectF2.set(z2Var.y() - org.telegram.messenger.g0.L(43.0f), A - org.telegram.messenger.g0.L(15.0f), z2Var.y() - org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(15.0f) + A);
                    if (q1Var2.P5.Q3()) {
                        Paint paint = org.telegram.ui.ActionBar.k6.f27991l2;
                        int i12 = org.telegram.ui.ActionBar.k6.Jb;
                        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i12, q1Var2.Pb));
                        org.telegram.ui.ActionBar.k6.F2.setColor(org.telegram.ui.ActionBar.k6.w0(i12, q1Var2.Pb));
                    } else {
                        Paint paint2 = org.telegram.ui.ActionBar.k6.f27991l2;
                        int i13 = org.telegram.ui.ActionBar.k6.f28114rd;
                        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, q1Var2.Pb));
                        org.telegram.ui.ActionBar.k6.F2.setColor(org.telegram.ui.ActionBar.k6.w0(i13, q1Var2.Pb));
                    }
                    int alpha = org.telegram.ui.ActionBar.k6.H2.getAlpha();
                    int alpha2 = org.telegram.ui.ActionBar.k6.I2.getAlpha();
                    int alpha3 = org.telegram.ui.ActionBar.k6.F2.getAlpha();
                    int i14 = (f19 > 1.0f ? 1 : (f19 == 1.0f ? 0 : -1));
                    if (i14 != 0) {
                        f14 = 50.0f;
                        rectF = rectF2;
                        org.telegram.ui.ActionBar.k6.H2.setAlpha((int) (alpha * f19));
                        org.telegram.ui.ActionBar.k6.I2.setAlpha((int) (alpha2 * f19));
                        org.telegram.ui.ActionBar.k6.F2.setAlpha((int) (alpha3 * f19));
                        canvas.save();
                        canvas.translate(0.0f, (-org.telegram.messenger.g0.L(50.0f)) * x1Var2.L1);
                    } else {
                        rectF = rectF2;
                        f14 = 50.0f;
                    }
                    org.telegram.ui.ActionBar.k6.f27991l2.setAlpha((int) (f19 * f14));
                    StaticLayout staticLayout4 = staticLayout2;
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), org.telegram.messenger.g0.L(15.0f), org.telegram.ui.ActionBar.k6.f27991l2);
                    org.telegram.ui.ActionBar.k6.f27991l2.setAlpha((int) (f19 * f11));
                    StaticLayout staticLayout5 = staticLayout;
                    q1Var = q1Var2;
                    imageReceiver = imageReceiver2;
                    RectF rectF3 = rectF;
                    canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, org.telegram.ui.ActionBar.k6.f27991l2);
                    if (z9) {
                        if (this.f30552f == null) {
                            this.f30552f = q1Var.getContext().getResources().getDrawable(2131231130).mutate();
                        }
                        if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.f30553g) {
                            Drawable drawable = this.f30552f;
                            int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                            this.f30553g = color;
                            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                        }
                        x1Var = x1Var2;
                        f15 = abs;
                        this.f30552f.setBounds(f1.z(2, (int) rectF3.centerX(), this.f30552f), f1.y(2, (int) rectF3.centerY(), this.f30552f), f1.w(2, (int) rectF3.centerX(), this.f30552f), f1.f(2, (int) rectF3.centerY(), this.f30552f));
                        this.f30552f.draw(canvas);
                    } else {
                        x1Var = x1Var2;
                        f15 = abs;
                        float measureText = org.telegram.ui.ActionBar.k6.F2.measureText(C);
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
                        canvas.drawText(C, rectF3.centerX() - (measureText / f12), org.telegram.messenger.g0.L(4.0f) + A, org.telegram.ui.ActionBar.k6.F2);
                        canvas.restore();
                    }
                    if (staticLayout5 != null && staticLayout4 != null) {
                        canvas.save();
                        canvas.translate(z2Var.K0 + org.telegram.messenger.g0.L(10.0f), z2Var.A() + org.telegram.messenger.g0.L(10.0f));
                        staticLayout5.draw(canvas);
                        canvas.translate(0.0f, org.telegram.messenger.g0.L(23.0f));
                        staticLayout4.draw(canvas);
                        canvas.restore();
                    }
                    if (i14 != 0) {
                        org.telegram.ui.ActionBar.k6.H2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.k6.I2.setAlpha(alpha2);
                        org.telegram.ui.ActionBar.k6.F2.setAlpha(alpha3);
                        canvas.restore();
                    }
                    x1 x1Var3 = x1Var;
                    x1Var3.f30815m = f15;
                    x1Var3.f30811l = C;
                    x1Var3.f30819n = staticLayout5;
                    x1Var3.f30822o = staticLayout4;
                }
                if (z2Var.N()) {
                    f17 = f10;
                } else {
                    f17 = z2Var.f21194h1;
                }
                if (f17 > 0.0f) {
                    if (z2Var.L() || z2Var.N()) {
                        int L = (int) (((z2Var.M0 / f12) + z2Var.K0) - org.telegram.messenger.g0.L(31.0f));
                        int L2 = (int) ((((z2Var.N0 / f12) + z2Var.L0) - org.telegram.messenger.g0.L(38.0f)) - ((f10 - xq.f40333k.getInterpolation(f17)) * org.telegram.messenger.g0.L(16.0f)));
                        h6.m mVar = q1Var.Rb;
                        if (((Drawable) mVar.f14265c) == null) {
                            mVar.f14265c = jg.g.h((Context) mVar.f14264b, 2131231634);
                        }
                        Drawable drawable2 = (Drawable) mVar.f14265c;
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
            canvas.translate(z2Var.K0 + org.telegram.messenger.g0.L(6.0f), z2Var.A() + org.telegram.messenger.g0.L(8.0f));
            q1Var2.f29808d3.draw(canvas);
            if (q1Var2.f30047w3 != null) {
                canvas.translate(0.0f, org.telegram.messenger.g0.L(21.0f));
                q1Var2.f30047w3.draw(canvas);
            }
            canvas.restore();
        }
    }
}
