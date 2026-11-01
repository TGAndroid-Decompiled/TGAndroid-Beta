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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.nd;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.u80;
import org.telegram.ui.rb0;
public final class v7 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 D;
    public int E;
    public final mg.c2 F;
    public boolean G;
    public double H;
    public double I;
    public SpannableString J;
    public CharSequence K;
    public Drawable L;
    public int M;
    public y f23321a;
    public int f23322b;
    public final org.telegram.ui.Components.g9 f23323c;
    public final org.telegram.ui.ActionBar.u5 d;
    public int e;
    public final TextView f23324f;
    public boolean h;
    public org.telegram.ui.Components.r8 f23325n;
    public final int f23326r;
    public final RectF f23327s;
    public nd f23328w;
    public rb0 f23329x;
    public final Location f23330y;

    public v7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        int i13;
        float f12;
        float f13;
        int i14;
        float f14;
        float f15;
        int i15;
        float f16;
        this.f23327s = new RectF();
        this.f23330y = new Location("network");
        this.E = e20.f15506s0;
        this.F = new mg.c2(this, 21);
        this.K = "";
        this.D = p6Var;
        this.f23326r = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f23323c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
        this.f23325n = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        at.i(u5Var);
        u5Var.setTextSize(16);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        if (dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        u5Var.setGravity(i11);
        u5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = dd.X;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z11) {
                f12 = 0.0f;
            } else {
                f12 = 15.0f;
            }
            if (z11) {
                f13 = 15.0f;
            } else {
                f13 = 0.0f;
            }
            addView(g9Var, w7.b6.d(42, 42.0f, i16, f12, 12.0f, f13, 0.0f));
            boolean z12 = dd.X;
            if (z12) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i17 = i14 | 48;
            if (z12) {
                f14 = i10;
            } else {
                f14 = 73.0f;
            }
            if (z12) {
                f15 = 73.0f;
            } else {
                f15 = 16.0f;
            }
            addView(u5Var, w7.b6.d(-1, 20.0f, i17, f14, 12.0f, f15, 0.0f));
            TextView textView = new TextView(context);
            this.f23324f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
            if (dd.X) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            textView.setGravity(i15);
            boolean z13 = dd.X;
            int i18 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f16 = i10;
            } else {
                f16 = 73.0f;
            }
            addView(textView, w7.b6.d(-1, -2.0f, i18, f16, 33.0f, z13 ? 73.0f : i10, 0.0f));
        } else {
            boolean z14 = dd.X;
            if (z14) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i19 = i12 | 48;
            if (z14) {
                f7 = 0.0f;
            } else {
                f7 = 15.0f;
            }
            if (z14) {
                f10 = 15.0f;
            } else {
                f10 = 0.0f;
            }
            addView(g9Var, w7.b6.d(42, 42.0f, i19, f7, 6.0f, f10, 0.0f));
            boolean z15 = dd.X;
            int i20 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f11 = i10;
            } else {
                f11 = 74.0f;
            }
            addView(u5Var, w7.b6.d(-2, -2.0f, i20, f11, 17.0f, z15 ? 74.0f : i10, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        v7 v7Var;
        if (this.G) {
            return this.K;
        }
        if (Math.abs(this.H - d) <= 1.0E-6d && Math.abs(this.I - d10) <= 1.0E-6d && !TextUtils.isEmpty(this.K)) {
            v7Var = this;
        } else {
            this.G = true;
            v7Var = this;
            Utilities.e.c(new u7(v7Var, d, d10, 0));
        }
        return v7Var.K;
    }

    public final void b(kj kjVar, Location location, boolean z10) {
        String str;
        float f7;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        org.telegram.ui.Components.g9 g9Var = this.f23323c;
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        TextView textView = this.f23324f;
        if (kjVar != null && (message = kjVar.f16690k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(2131232538);
            org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.bj, p6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, p6Var);
            y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(42.0f), w02, w02);
            this.f23321a = j02;
            this.f23322b = w02;
            eq eqVar = new eq(j02, drawable);
            int L = org.telegram.messenger.i0.L(42.0f);
            int L2 = org.telegram.messenger.i0.L(42.0f);
            eqVar.h = L;
            eqVar.f25905n = L2;
            int L3 = org.telegram.messenger.i0.L(24.0f);
            int L4 = org.telegram.messenger.i0.L(24.0f);
            eqVar.e = L3;
            eqVar.f25904f = L4;
            g9Var.setImageDrawable(eqVar);
            u5Var.l(org.telegram.messenger.k6.m(wp.r1(this.E).A1(org.telegram.messenger.o5.o(kjVar.f16690k.peer_id), false), u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = kjVar.f16690k.media.address;
            this.e = new StaticLayout(str2, textView.getPaint(), org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(this.f23326r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = kjVar.Z0();
        if (kj.l3(kjVar.f16690k)) {
            Z0 = kj.C1(kjVar.f16690k.fwd_from.from_id);
        }
        this.E = kjVar.I1;
        if (!TextUtils.isEmpty(kjVar.f16690k.media.address)) {
            str = kjVar.f16690k.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(kjVar.f16690k.media.title);
        if (isEmpty) {
            this.f23325n = null;
            if (Z0 > 0) {
                f7 = 42.0f;
                TLRPC.User Z1 = wp.r1(this.E).Z1(Long.valueOf(Z0));
                if (Z1 != null) {
                    this.f23325n = new org.telegram.ui.Components.r8(0, Z1);
                    charSequence = i20.p(Z1);
                    g9Var.e(Z1, this.f23325n);
                } else {
                    TLRPC.GeoPoint geoPoint = kjVar.f16690k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f7 = 42.0f;
                TLRPC.Chat L0 = wp.r1(this.E).L0(Long.valueOf(-Z0));
                if (L0 != null) {
                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(L0);
                    this.f23325n = r8Var;
                    charSequence = L0.title;
                    g9Var.e(L0, r8Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = kjVar.f16690k.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            f7 = 42.0f;
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.J == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.J = spannableString;
                spannableString.setSpan(new u80(u5Var, org.telegram.messenger.i0.L(100.0f), 0, p6Var), 0, this.J.length(), 33);
            }
            charSequence = this.J;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(kjVar.f16690k.media.title)) {
                charSequence = kjVar.f16690k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(2131232538);
            org.telegram.ui.ActionBar.a7.y(this, drawable2, org.telegram.ui.ActionBar.t6.bj, p6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, p6Var);
            y j03 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(f7), w03, w03);
            this.f23321a = j03;
            this.f23322b = w03;
            eq eqVar2 = new eq(j03, drawable2);
            int L5 = org.telegram.messenger.i0.L(f7);
            int L6 = org.telegram.messenger.i0.L(f7);
            eqVar2.h = L5;
            eqVar2.f25905n = L6;
            int L7 = org.telegram.messenger.i0.L(24.0f);
            int L8 = org.telegram.messenger.i0.L(24.0f);
            eqVar2.e = L7;
            eqVar2.f25904f = L8;
            g9Var.setImageDrawable(eqVar2);
        }
        u5Var.l(charSequence, false);
        double d = kjVar.f16690k.media.geo.lat;
        Location location2 = this.f23330y;
        location2.setLatitude(d);
        location2.setLongitude(kjVar.f16690k.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + dd.y(distanceTo, 0, null));
                return;
            }
            textView.setText(dd.y(distanceTo, 0, null));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z10) {
            textView.setText(dd.L0(2131748789, null));
        } else {
            textView.setText("");
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.g3(this.F);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.F);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        boolean z10;
        float abs;
        int w02;
        float f7;
        nd ndVar = this.f23328w;
        if (ndVar != null || this.f23329x != null) {
            if (ndVar != null) {
                i11 = ndVar.f17284c;
                i10 = ndVar.d;
            } else {
                TLRPC.Message message = this.f23329x.f41030b;
                int i12 = message.date;
                i10 = message.media.period;
                i11 = i12 + i10;
            }
            int i13 = i11;
            if (i10 == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            int currentTime = ConnectionsManager.getInstance(this.E).getCurrentTime();
            if (i13 < currentTime && !z11) {
                return;
            }
            if (z11) {
                abs = 1.0f;
            } else {
                abs = Math.abs(i13 - currentTime) / i10;
            }
            float f10 = abs;
            boolean z12 = dd.X;
            float f11 = 48.0f;
            float f12 = 12.0f;
            TextView textView = this.f23324f;
            RectF rectF = this.f23327s;
            if (z12) {
                float L = org.telegram.messenger.i0.L(13.0f);
                if (textView != null) {
                    f12 = 18.0f;
                }
                float L2 = org.telegram.messenger.i0.L(f12);
                float L3 = org.telegram.messenger.i0.L(43.0f);
                if (textView == null) {
                    f11 = 42.0f;
                }
                rectF.set(L, L2, L3, org.telegram.messenger.i0.L(f11));
            } else {
                float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(43.0f);
                if (textView != null) {
                    f12 = 18.0f;
                }
                float L4 = org.telegram.messenger.i0.L(f12);
                float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.i0.L(13.0f);
                if (textView == null) {
                    f11 = 42.0f;
                }
                rectF.set(measuredWidth, L4, measuredWidth2, org.telegram.messenger.i0.L(f11));
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.D;
            if (textView == null) {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.mj, p6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.gj, p6Var);
            }
            org.telegram.ui.ActionBar.t6.f21074l2.setColor(w02);
            org.telegram.ui.ActionBar.t6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.t6.f21074l2.getAlpha();
            org.telegram.ui.ActionBar.t6.f21074l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.t6.f21074l2);
            org.telegram.ui.ActionBar.t6.f21074l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, org.telegram.ui.ActionBar.t6.f21074l2);
            org.telegram.ui.ActionBar.t6.f21074l2.setAlpha(alpha);
            if (z11) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(2131231130).mutate();
                }
                if (org.telegram.ui.ActionBar.t6.F2.getColor() != this.M) {
                    Drawable drawable = this.L;
                    int color = org.telegram.ui.ActionBar.t6.F2.getColor();
                    this.M = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.L.setBounds(f1.z(2, (int) rectF.centerX(), this.L), f1.y(2, (int) rectF.centerY(), this.L), f1.w(2, (int) rectF.centerX(), this.L), f1.f(2, (int) rectF.centerY(), this.L));
                this.L.draw(canvas);
                return;
            }
            String C = dd.C(i13 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.t6.F2.measureText(C) / 2.0f);
            if (textView != null) {
                f7 = 37.0f;
            } else {
                f7 = 31.0f;
            }
            canvas.drawText(C, centerX, org.telegram.messenger.i0.L(f7), org.telegram.ui.ActionBar.t6.F2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        TextView textView = this.f23324f;
        if (textView != null) {
            f7 = 66.0f;
        } else {
            f7 = 54.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        if (textView != null && !this.h) {
            i12 = (-org.telegram.messenger.i0.L(20.0f)) + this.e;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i12, 1073741824));
    }

    public void setDialog(nd ndVar) {
        this.f23328w = ndVar;
        this.E = ndVar.e;
        org.telegram.ui.Components.g9 g9Var = this.f23323c;
        g9Var.getImageReceiver().d = this.E;
        boolean E = org.telegram.messenger.o5.E(ndVar.f17282a);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        if (E) {
            TLRPC.User Z1 = wp.r1(this.E).Z1(Long.valueOf(ndVar.f17282a));
            if (Z1 != null) {
                this.f23325n.r(Z1);
                u5Var.l(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name), false);
                g9Var.e(Z1, this.f23325n);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = wp.r1(this.E).L0(Long.valueOf(-ndVar.f17282a));
        if (L0 != null) {
            this.f23325n.q(L0);
            u5Var.l(L0.title, false);
            g9Var.e(L0, this.f23325n);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f23321a != null && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, this.D)) != this.f23322b) {
                this.f23322b = w02;
                org.telegram.ui.ActionBar.t6.H1(this.f23321a, w02, false);
                org.telegram.ui.ActionBar.t6.H1(this.f23321a, w02, true);
                this.f23321a.invalidateSelf();
                org.telegram.ui.Components.g9 g9Var = this.f23323c;
                if (g9Var != null) {
                    g9Var.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
