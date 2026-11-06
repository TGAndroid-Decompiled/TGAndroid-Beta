package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.xp;
import org.telegram.ui.la0;
public final class r7 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 D;
    public int E;
    public final m.f3 F;
    public boolean G;
    public double H;
    public double I;
    public SpannableString J;
    public CharSequence K;
    public Drawable L;
    public int M;
    public y f30192a;
    public int f30193b;
    public final org.telegram.ui.Components.l9 f30194c;
    public final org.telegram.ui.ActionBar.k5 d;
    public int f30195e;
    public final TextView f30196f;
    public boolean h;
    public org.telegram.ui.Components.w8 f30197n;
    public final int f30198r;
    public final RectF f30199s;
    public rd f30200w;
    public la0 f30201x;
    public final Location f30202y;

    public r7(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        int i12;
        float f13;
        float f14;
        int i13;
        float f15;
        float f16;
        int i14;
        float f17;
        this.f30199s = new RectF();
        this.f30202y = new Location("network");
        this.E = p10.f24467s0;
        this.F = new m.f3(this, 23);
        this.K = "";
        this.D = f6Var;
        this.f30198r = i7;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f30194c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f30197n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        qs.i(k5Var);
        k5Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        if (hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k5Var.setGravity(i10);
        k5Var.setScrollNonFitText(true);
        if (z9) {
            boolean z10 = hd.f22878a0;
            if (z10) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i15 = i12 | 48;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 15.0f;
            }
            if (z10) {
                f14 = 15.0f;
            } else {
                f14 = 0.0f;
            }
            addView(l9Var, c8.ha.d(42, 42.0f, i15, f13, 12.0f, f14, 0.0f));
            boolean z11 = hd.f22878a0;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z11) {
                f15 = i7;
            } else {
                f15 = 73.0f;
            }
            if (z11) {
                f16 = 73.0f;
            } else {
                f16 = 16.0f;
            }
            addView(k5Var, c8.ha.d(-1, 20.0f, i16, f15, 12.0f, f16, 0.0f));
            TextView textView = new TextView(context);
            this.f30196f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, f6Var);
            if (hd.f22878a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView.setGravity(i14);
            boolean z12 = hd.f22878a0;
            int i17 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f17 = i7;
            } else {
                f17 = 73.0f;
            }
            addView(textView, c8.ha.d(-1, -2.0f, i17, f17, 33.0f, z12 ? 73.0f : i7, 0.0f));
        } else {
            boolean z13 = hd.f22878a0;
            if (z13) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i18 = i11 | 48;
            if (z13) {
                f10 = 0.0f;
            } else {
                f10 = 15.0f;
            }
            if (z13) {
                f11 = 15.0f;
            } else {
                f11 = 0.0f;
            }
            addView(l9Var, c8.ha.d(42, 42.0f, i18, f10, 6.0f, f11, 0.0f));
            boolean z14 = hd.f22878a0;
            int i19 = (z14 ? 5 : 3) | 48;
            if (z14) {
                f12 = i7;
            } else {
                f12 = 74.0f;
            }
            addView(k5Var, c8.ha.d(-2, -2.0f, i19, f12, 17.0f, z14 ? 74.0f : i7, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        r7 r7Var;
        if (this.G) {
            return this.K;
        }
        if (Math.abs(this.H - d) <= 1.0E-6d && Math.abs(this.I - d2) <= 1.0E-6d && !TextUtils.isEmpty(this.K)) {
            r7Var = this;
        } else {
            this.G = true;
            r7Var = this;
            Utilities.f21333e.c(new q7(r7Var, d, d2, 0));
        }
        return r7Var.K;
    }

    public final void b(ij ijVar, Location location, boolean z9) {
        String str;
        float f10;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        org.telegram.ui.Components.l9 l9Var = this.f30194c;
        org.telegram.ui.ActionBar.f6 f6Var = this.D;
        TextView textView = this.f30196f;
        if (ijVar != null && (message = ijVar.f23244k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(2131232539);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.bj, f6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, f6Var);
            y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(42.0f), w02, w02);
            this.f30192a = j02;
            this.f30193b = w02;
            xp xpVar = new xp(j02, drawable);
            int L = org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(42.0f);
            xpVar.h = L;
            xpVar.f40336n = L2;
            int L3 = org.telegram.messenger.g0.L(24.0f);
            int L4 = org.telegram.messenger.g0.L(24.0f);
            xpVar.f40334e = L3;
            xpVar.f40335f = L4;
            l9Var.setImageDrawable(xpVar);
            k5Var.l(org.telegram.messenger.i6.m(qp.s1(this.E).B1(org.telegram.messenger.m5.o(ijVar.f23244k.peer_id), false), k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = ijVar.f23244k.media.address;
            this.f30195e = new StaticLayout(str2, textView.getPaint(), org.telegram.messenger.g0.f22544q.x - org.telegram.messenger.g0.L(this.f30198r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = ijVar.Z0();
        if (ij.m3(ijVar.f23244k)) {
            Z0 = ij.C1(ijVar.f23244k.fwd_from.from_id);
        }
        this.E = ijVar.I1;
        if (!TextUtils.isEmpty(ijVar.f23244k.media.address)) {
            str = ijVar.f23244k.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(ijVar.f23244k.media.title);
        if (isEmpty) {
            this.f30197n = null;
            if (Z0 > 0) {
                f10 = 42.0f;
                TLRPC.User a22 = qp.s1(this.E).a2(Long.valueOf(Z0));
                if (a22 != null) {
                    this.f30197n = new org.telegram.ui.Components.w8(0, a22);
                    charSequence = t10.p(a22);
                    l9Var.e(a22, this.f30197n);
                } else {
                    TLRPC.GeoPoint geoPoint = ijVar.f23244k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f10 = 42.0f;
                TLRPC.Chat M0 = qp.s1(this.E).M0(Long.valueOf(-Z0));
                if (M0 != null) {
                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(M0);
                    this.f30197n = w8Var;
                    charSequence = M0.title;
                    l9Var.e(M0, w8Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = ijVar.f23244k.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            f10 = 42.0f;
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.J == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.J = spannableString;
                spannableString.setSpan(new b80(k5Var, org.telegram.messenger.g0.L(100.0f), 0, f6Var), 0, this.J.length(), 33);
            }
            charSequence = this.J;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(ijVar.f23244k.media.title)) {
                charSequence = ijVar.f23244k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(2131232539);
            org.telegram.ui.ActionBar.r6.y(this, drawable2, org.telegram.ui.ActionBar.k6.bj, f6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, f6Var);
            y j03 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(f10), w03, w03);
            this.f30192a = j03;
            this.f30193b = w03;
            xp xpVar2 = new xp(j03, drawable2);
            int L5 = org.telegram.messenger.g0.L(f10);
            int L6 = org.telegram.messenger.g0.L(f10);
            xpVar2.h = L5;
            xpVar2.f40336n = L6;
            int L7 = org.telegram.messenger.g0.L(24.0f);
            int L8 = org.telegram.messenger.g0.L(24.0f);
            xpVar2.f40334e = L7;
            xpVar2.f40335f = L8;
            l9Var.setImageDrawable(xpVar2);
        }
        k5Var.l(charSequence, false);
        double d = ijVar.f23244k.media.geo.lat;
        Location location2 = this.f30202y;
        location2.setLatitude(d);
        location2.setLongitude(ijVar.f23244k.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + hd.y(distanceTo, 0, null));
                return;
            }
            textView.setText(hd.y(distanceTo, 0, null));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z9) {
            textView.setText(hd.M0(2131748778, null));
        } else {
            textView.setText("");
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(this.F);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.F);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        boolean z9;
        float abs;
        int w02;
        float f10;
        rd rdVar = this.f30200w;
        if (rdVar != null || this.f30201x != null) {
            if (rdVar != null) {
                i10 = rdVar.f25275c;
                i7 = rdVar.d;
            } else {
                TLRPC.Message message = this.f30201x.f47493b;
                int i11 = message.date;
                i7 = message.media.period;
                i10 = i11 + i7;
            }
            int i12 = i10;
            if (i7 == Integer.MAX_VALUE) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z10 = z9;
            int currentTime = ConnectionsManager.getInstance(this.E).getCurrentTime();
            if (i12 < currentTime && !z10) {
                return;
            }
            if (z10) {
                abs = 1.0f;
            } else {
                abs = Math.abs(i12 - currentTime) / i7;
            }
            float f11 = abs;
            boolean z11 = hd.f22878a0;
            float f12 = 48.0f;
            float f13 = 12.0f;
            TextView textView = this.f30196f;
            RectF rectF = this.f30199s;
            if (z11) {
                float L = org.telegram.messenger.g0.L(13.0f);
                if (textView != null) {
                    f13 = 18.0f;
                }
                float L2 = org.telegram.messenger.g0.L(f13);
                float L3 = org.telegram.messenger.g0.L(43.0f);
                if (textView == null) {
                    f12 = 42.0f;
                }
                rectF.set(L, L2, L3, org.telegram.messenger.g0.L(f12));
            } else {
                float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(43.0f);
                if (textView != null) {
                    f13 = 18.0f;
                }
                float L4 = org.telegram.messenger.g0.L(f13);
                float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(13.0f);
                if (textView == null) {
                    f12 = 42.0f;
                }
                rectF.set(measuredWidth, L4, measuredWidth2, org.telegram.messenger.g0.L(f12));
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.D;
            if (textView == null) {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.mj, f6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.gj, f6Var);
            }
            org.telegram.ui.ActionBar.k6.f27992l2.setColor(w02);
            org.telegram.ui.ActionBar.k6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.f27992l2.getAlpha();
            org.telegram.ui.ActionBar.k6.f27992l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.f27992l2);
            org.telegram.ui.ActionBar.k6.f27992l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f11 * (-360.0f), false, org.telegram.ui.ActionBar.k6.f27992l2);
            org.telegram.ui.ActionBar.k6.f27992l2.setAlpha(alpha);
            if (z10) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(2131231130).mutate();
                }
                if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.M) {
                    Drawable drawable = this.L;
                    int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                    this.M = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.L.setBounds(f1.z(2, (int) rectF.centerX(), this.L), f1.y(2, (int) rectF.centerY(), this.L), f1.w(2, (int) rectF.centerX(), this.L), f1.f(2, (int) rectF.centerY(), this.L));
                this.L.draw(canvas);
                return;
            }
            String C = hd.C(i12 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.k6.F2.measureText(C) / 2.0f);
            if (textView != null) {
                f10 = 37.0f;
            } else {
                f10 = 31.0f;
            }
            canvas.drawText(C, centerX, org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.k6.F2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        TextView textView = this.f30196f;
        if (textView != null) {
            f10 = 66.0f;
        } else {
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (textView != null && !this.h) {
            i11 = (-org.telegram.messenger.g0.L(20.0f)) + this.f30195e;
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i11, 1073741824));
    }

    public void setDialog(rd rdVar) {
        this.f30200w = rdVar;
        this.E = rdVar.f25276e;
        org.telegram.ui.Components.l9 l9Var = this.f30194c;
        l9Var.getImageReceiver().d = this.E;
        boolean E = org.telegram.messenger.m5.E(rdVar.f25273a);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (E) {
            TLRPC.User a22 = qp.s1(this.E).a2(Long.valueOf(rdVar.f25273a));
            if (a22 != null) {
                this.f30197n.r(a22);
                k5Var.l(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name), false);
                l9Var.e(a22, this.f30197n);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = qp.s1(this.E).M0(Long.valueOf(-rdVar.f25273a));
        if (M0 != null) {
            this.f30197n.q(M0);
            k5Var.l(M0.title, false);
            l9Var.e(M0, this.f30197n);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f30192a != null && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, this.D)) != this.f30193b) {
                this.f30193b = w02;
                org.telegram.ui.ActionBar.k6.H1(this.f30192a, w02, false);
                org.telegram.ui.ActionBar.k6.H1(this.f30192a, w02, true);
                this.f30192a.invalidateSelf();
                org.telegram.ui.Components.l9 l9Var = this.f30194c;
                if (l9Var != null) {
                    l9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
