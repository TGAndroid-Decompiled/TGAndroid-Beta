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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.kd;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ha0;
public final class q7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 E;
    public int F;
    public final mi.b0 G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public y f30220a;
    public int f30221b;
    public final org.telegram.ui.Components.k9 f30222c;
    public final org.telegram.ui.ActionBar.k5 d;
    public int f30223e;
    public final TextView f30224f;
    public boolean h;
    public org.telegram.ui.Components.u8 f30225n;
    public final int f30226r;
    public final RectF f30227s;
    public kd f30228w;
    public ha0 f30229x;
    public final Location f30230y;

    public q7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
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
        this.f30227s = new RectF();
        this.f30230y = new Location("network");
        this.F = h10.f22829t0;
        this.G = new mi.b0(this, 22);
        this.L = "";
        this.E = e6Var;
        this.f30226r = i3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f30222c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f30225n = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        hs.i(k5Var);
        k5Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k5Var.setGravity(i10);
        k5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = bd.f21784a0;
            if (z11) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i15 = i12 | 48;
            if (z11) {
                f13 = 0.0f;
            } else {
                f13 = 15.0f;
            }
            if (z11) {
                f14 = 15.0f;
            } else {
                f14 = 0.0f;
            }
            addView(k9Var, mf.d(42, 42.0f, i15, f13, 12.0f, f14, 0.0f));
            boolean z12 = bd.f21784a0;
            if (z12) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z12) {
                f15 = i3;
            } else {
                f15 = 73.0f;
            }
            if (z12) {
                f16 = 73.0f;
            } else {
                f16 = 16.0f;
            }
            addView(k5Var, mf.d(-1, 20.0f, i16, f15, 12.0f, f16, 0.0f));
            TextView textView = new TextView(context);
            this.f30224f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
            if (bd.f21784a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView.setGravity(i14);
            boolean z13 = bd.f21784a0;
            int i17 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f17 = i3;
            } else {
                f17 = 73.0f;
            }
            addView(textView, mf.d(-1, -2.0f, i17, f17, 33.0f, z13 ? 73.0f : i3, 0.0f));
        } else {
            boolean z14 = bd.f21784a0;
            if (z14) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i18 = i11 | 48;
            if (z14) {
                f10 = 0.0f;
            } else {
                f10 = 15.0f;
            }
            if (z14) {
                f11 = 15.0f;
            } else {
                f11 = 0.0f;
            }
            addView(k9Var, mf.d(42, 42.0f, i18, f10, 6.0f, f11, 0.0f));
            boolean z15 = bd.f21784a0;
            int i19 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f12 = i3;
            } else {
                f12 = 74.0f;
            }
            addView(k5Var, mf.d(-2, -2.0f, i19, f12, 17.0f, z15 ? 74.0f : i3, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d10) {
        q7 q7Var;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) <= 1.0E-6d && Math.abs(this.J - d10) <= 1.0E-6d && !TextUtils.isEmpty(this.L)) {
            q7Var = this;
        } else {
            this.H = true;
            q7Var = this;
            Utilities.f21387e.c(new p7(q7Var, d, d10, 0));
        }
        return q7Var.L;
    }

    public final void b(zi ziVar, Location location, boolean z10) {
        String str;
        float f10;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        org.telegram.ui.Components.k9 k9Var = this.f30222c;
        org.telegram.ui.ActionBar.e6 e6Var = this.E;
        TextView textView = this.f30224f;
        if (ziVar != null && (message = ziVar.f26868k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(2131232539);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.bj, e6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, e6Var);
            y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(42.0f), w02, w02);
            this.f30220a = j02;
            this.f30221b = w02;
            xp xpVar = new xp(j02, drawable);
            int L = org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(42.0f);
            xpVar.h = L;
            xpVar.f40443n = L2;
            int L3 = org.telegram.messenger.g0.L(24.0f);
            int L4 = org.telegram.messenger.g0.L(24.0f);
            xpVar.f40441e = L3;
            xpVar.f40442f = L4;
            k9Var.setImageDrawable(xpVar);
            k5Var.l(org.telegram.messenger.i6.m(hp.s1(this.F).B1(org.telegram.messenger.m5.o(ziVar.f26868k.peer_id), false), k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = ziVar.f26868k.media.address;
            this.f30223e = new StaticLayout(str2, textView.getPaint(), org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(this.f30226r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = ziVar.Z0();
        if (zi.m3(ziVar.f26868k)) {
            Z0 = zi.C1(ziVar.f26868k.fwd_from.from_id);
        }
        this.F = ziVar.I1;
        if (!TextUtils.isEmpty(ziVar.f26868k.media.address)) {
            str = ziVar.f26868k.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(ziVar.f26868k.media.title);
        if (isEmpty) {
            this.f30225n = null;
            if (Z0 > 0) {
                f10 = 42.0f;
                TLRPC.User a22 = hp.s1(this.F).a2(Long.valueOf(Z0));
                if (a22 != null) {
                    this.f30225n = new org.telegram.ui.Components.u8(0, a22);
                    charSequence = l10.p(a22);
                    k9Var.e(a22, this.f30225n);
                } else {
                    TLRPC.GeoPoint geoPoint = ziVar.f26868k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f10 = 42.0f;
                TLRPC.Chat M0 = hp.s1(this.F).M0(Long.valueOf(-Z0));
                if (M0 != null) {
                    org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(M0);
                    this.f30225n = u8Var;
                    charSequence = M0.title;
                    k9Var.e(M0, u8Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = ziVar.f26868k.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            f10 = 42.0f;
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.K == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.K = spannableString;
                spannableString.setSpan(new x70(k5Var, org.telegram.messenger.g0.L(100.0f), 0, e6Var), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(ziVar.f26868k.media.title)) {
                charSequence = ziVar.f26868k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(2131232539);
            org.telegram.ui.ActionBar.r6.y(this, drawable2, org.telegram.ui.ActionBar.k6.bj, e6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, e6Var);
            y j03 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(f10), w03, w03);
            this.f30220a = j03;
            this.f30221b = w03;
            xp xpVar2 = new xp(j03, drawable2);
            int L5 = org.telegram.messenger.g0.L(f10);
            int L6 = org.telegram.messenger.g0.L(f10);
            xpVar2.h = L5;
            xpVar2.f40443n = L6;
            int L7 = org.telegram.messenger.g0.L(24.0f);
            int L8 = org.telegram.messenger.g0.L(24.0f);
            xpVar2.f40441e = L7;
            xpVar2.f40442f = L8;
            k9Var.setImageDrawable(xpVar2);
        }
        k5Var.l(charSequence, false);
        double d = ziVar.f26868k.media.geo.lat;
        Location location2 = this.f30230y;
        location2.setLatitude(d);
        location2.setLongitude(ziVar.f26868k.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + bd.y(distanceTo, 0, null));
                return;
            }
            textView.setText(bd.y(distanceTo, 0, null));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z10) {
            textView.setText(bd.M0(2131748787, null));
        } else {
            textView.setText("");
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(this.G);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.G);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        int i10;
        boolean z10;
        float abs;
        int w02;
        float f10;
        kd kdVar = this.f30228w;
        if (kdVar != null || this.f30229x != null) {
            if (kdVar != null) {
                i10 = kdVar.f23812c;
                i3 = kdVar.d;
            } else {
                TLRPC.Message message = this.f30229x.f45881b;
                int i11 = message.date;
                i3 = message.media.period;
                i10 = i11 + i3;
            }
            int i12 = i10;
            if (i3 == Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            int currentTime = ConnectionsManager.getInstance(this.F).getCurrentTime();
            if (i12 < currentTime && !z11) {
                return;
            }
            if (z11) {
                abs = 1.0f;
            } else {
                abs = Math.abs(i12 - currentTime) / i3;
            }
            float f11 = abs;
            boolean z12 = bd.f21784a0;
            float f12 = 48.0f;
            float f13 = 12.0f;
            TextView textView = this.f30224f;
            RectF rectF = this.f30227s;
            if (z12) {
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
            org.telegram.ui.ActionBar.e6 e6Var = this.E;
            if (textView == null) {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.mj, e6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.gj, e6Var);
            }
            org.telegram.ui.ActionBar.k6.f28022l2.setColor(w02);
            org.telegram.ui.ActionBar.k6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.k6.f28022l2.getAlpha();
            org.telegram.ui.ActionBar.k6.f28022l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.f28022l2);
            org.telegram.ui.ActionBar.k6.f28022l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f11 * (-360.0f), false, org.telegram.ui.ActionBar.k6.f28022l2);
            org.telegram.ui.ActionBar.k6.f28022l2.setAlpha(alpha);
            if (z11) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(2131231130).mutate();
                }
                if (org.telegram.ui.ActionBar.k6.F2.getColor() != this.N) {
                    Drawable drawable = this.M;
                    int color = org.telegram.ui.ActionBar.k6.F2.getColor();
                    this.N = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.M.setBounds(f1.C(2, (int) rectF.centerX(), this.M), f1.B(2, (int) rectF.centerY(), this.M), f1.z(2, (int) rectF.centerX(), this.M), f1.i(2, (int) rectF.centerY(), this.M));
                this.M.draw(canvas);
                return;
            }
            String C = bd.C(i12 - currentTime);
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
    public final void onMeasure(int i3, int i10) {
        float f10;
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        TextView textView = this.f30224f;
        if (textView != null) {
            f10 = 66.0f;
        } else {
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (textView != null && !this.h) {
            i11 = (-org.telegram.messenger.g0.L(20.0f)) + this.f30223e;
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i11, 1073741824));
    }

    public void setDialog(kd kdVar) {
        this.f30228w = kdVar;
        this.F = kdVar.f23813e;
        org.telegram.ui.Components.k9 k9Var = this.f30222c;
        k9Var.getImageReceiver().d = this.F;
        boolean E = org.telegram.messenger.m5.E(kdVar.f23810a);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (E) {
            TLRPC.User a22 = hp.s1(this.F).a2(Long.valueOf(kdVar.f23810a));
            if (a22 != null) {
                this.f30225n.r(a22);
                k5Var.l(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name), false);
                k9Var.e(a22, this.f30225n);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = hp.s1(this.F).M0(Long.valueOf(-kdVar.f23810a));
        if (M0 != null) {
            this.f30225n.q(M0);
            k5Var.l(M0.title, false);
            k9Var.e(M0, this.f30225n);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f30220a != null && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hj, this.E)) != this.f30221b) {
                this.f30221b = w02;
                org.telegram.ui.ActionBar.k6.H1(this.f30220a, w02, false);
                org.telegram.ui.ActionBar.k6.H1(this.f30220a, w02, true);
                this.f30220a.invalidateSelf();
                org.telegram.ui.Components.k9 k9Var = this.f30222c;
                if (k9Var != null) {
                    k9Var.invalidate();
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
