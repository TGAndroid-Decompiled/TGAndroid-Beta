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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.md;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.u80;
import org.telegram.ui.sb0;
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
    public y f23320a;
    public int f23321b;
    public final org.telegram.ui.Components.g9 f23322c;
    public final org.telegram.ui.ActionBar.u5 d;
    public int e;
    public final TextView f23323f;
    public boolean h;
    public org.telegram.ui.Components.r8 f23324n;
    public final int f23325r;
    public final RectF f23326s;
    public md f23327w;
    public sb0 f23328x;
    public final Location f23329y;

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
        this.f23326s = new RectF();
        this.f23329y = new Location("network");
        this.E = d20.f15147s0;
        this.F = new mg.c2(this, 21);
        this.K = "";
        this.D = p6Var;
        this.f23325r = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f23322c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
        this.f23324n = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        zs.i(u5Var);
        u5Var.setTextSize(16);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        u5Var.setGravity(i11);
        u5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = cd.X;
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
            boolean z12 = cd.X;
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
            this.f23323f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
            if (cd.X) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            textView.setGravity(i15);
            boolean z13 = cd.X;
            int i18 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f16 = i10;
            } else {
                f16 = 73.0f;
            }
            addView(textView, w7.b6.d(-1, -2.0f, i18, f16, 33.0f, z13 ? 73.0f : i10, 0.0f));
        } else {
            boolean z14 = cd.X;
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
            boolean z15 = cd.X;
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

    public final void b(jj jjVar, Location location, boolean z10) {
        String str;
        float f7;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        org.telegram.ui.Components.g9 g9Var = this.f23322c;
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        TextView textView = this.f23323f;
        if (jjVar != null && (message = jjVar.f16337k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(2131232538);
            org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.bj, p6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, p6Var);
            y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(42.0f), w02, w02);
            this.f23320a = j02;
            this.f23321b = w02;
            eq eqVar = new eq(j02, drawable);
            int L = org.telegram.messenger.i0.L(42.0f);
            int L2 = org.telegram.messenger.i0.L(42.0f);
            eqVar.h = L;
            eqVar.f25843n = L2;
            int L3 = org.telegram.messenger.i0.L(24.0f);
            int L4 = org.telegram.messenger.i0.L(24.0f);
            eqVar.e = L3;
            eqVar.f25842f = L4;
            g9Var.setImageDrawable(eqVar);
            u5Var.l(org.telegram.messenger.k6.m(vp.r1(this.E).A1(org.telegram.messenger.o5.o(jjVar.f16337k.peer_id), false), u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = jjVar.f16337k.media.address;
            this.e = new StaticLayout(str2, textView.getPaint(), org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(this.f23325r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = jjVar.Z0();
        if (jj.l3(jjVar.f16337k)) {
            Z0 = jj.C1(jjVar.f16337k.fwd_from.from_id);
        }
        this.E = jjVar.I1;
        if (!TextUtils.isEmpty(jjVar.f16337k.media.address)) {
            str = jjVar.f16337k.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(jjVar.f16337k.media.title);
        if (isEmpty) {
            this.f23324n = null;
            if (Z0 > 0) {
                f7 = 42.0f;
                TLRPC.User Z1 = vp.r1(this.E).Z1(Long.valueOf(Z0));
                if (Z1 != null) {
                    this.f23324n = new org.telegram.ui.Components.r8(0, Z1);
                    charSequence = h20.p(Z1);
                    g9Var.e(Z1, this.f23324n);
                } else {
                    TLRPC.GeoPoint geoPoint = jjVar.f16337k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f7 = 42.0f;
                TLRPC.Chat L0 = vp.r1(this.E).L0(Long.valueOf(-Z0));
                if (L0 != null) {
                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(L0);
                    this.f23324n = r8Var;
                    charSequence = L0.title;
                    g9Var.e(L0, r8Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = jjVar.f16337k.media.geo;
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
            if (!TextUtils.isEmpty(jjVar.f16337k.media.title)) {
                charSequence = jjVar.f16337k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(2131232538);
            org.telegram.ui.ActionBar.a7.y(this, drawable2, org.telegram.ui.ActionBar.t6.bj, p6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, p6Var);
            y j03 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(f7), w03, w03);
            this.f23320a = j03;
            this.f23321b = w03;
            eq eqVar2 = new eq(j03, drawable2);
            int L5 = org.telegram.messenger.i0.L(f7);
            int L6 = org.telegram.messenger.i0.L(f7);
            eqVar2.h = L5;
            eqVar2.f25843n = L6;
            int L7 = org.telegram.messenger.i0.L(24.0f);
            int L8 = org.telegram.messenger.i0.L(24.0f);
            eqVar2.e = L7;
            eqVar2.f25842f = L8;
            g9Var.setImageDrawable(eqVar2);
        }
        u5Var.l(charSequence, false);
        double d = jjVar.f16337k.media.geo.lat;
        Location location2 = this.f23329y;
        location2.setLatitude(d);
        location2.setLongitude(jjVar.f16337k.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + cd.y(distanceTo, 0, null));
                return;
            }
            textView.setText(cd.y(distanceTo, 0, null));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z10) {
            textView.setText(cd.L0(2131748789, null));
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
        md mdVar = this.f23327w;
        if (mdVar != null || this.f23328x != null) {
            if (mdVar != null) {
                i11 = mdVar.f16942c;
                i10 = mdVar.d;
            } else {
                TLRPC.Message message = this.f23328x.f41461b;
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
            boolean z12 = cd.X;
            float f11 = 48.0f;
            float f12 = 12.0f;
            TextView textView = this.f23323f;
            RectF rectF = this.f23326s;
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
            org.telegram.ui.ActionBar.t6.f21073l2.setColor(w02);
            org.telegram.ui.ActionBar.t6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.t6.f21073l2.getAlpha();
            org.telegram.ui.ActionBar.t6.f21073l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.t6.f21073l2);
            org.telegram.ui.ActionBar.t6.f21073l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f10 * (-360.0f), false, org.telegram.ui.ActionBar.t6.f21073l2);
            org.telegram.ui.ActionBar.t6.f21073l2.setAlpha(alpha);
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
            String C = cd.C(i13 - currentTime);
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
        TextView textView = this.f23323f;
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

    public void setDialog(md mdVar) {
        this.f23327w = mdVar;
        this.E = mdVar.e;
        org.telegram.ui.Components.g9 g9Var = this.f23322c;
        g9Var.getImageReceiver().d = this.E;
        boolean E = org.telegram.messenger.o5.E(mdVar.f16940a);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        if (E) {
            TLRPC.User Z1 = vp.r1(this.E).Z1(Long.valueOf(mdVar.f16940a));
            if (Z1 != null) {
                this.f23324n.r(Z1);
                u5Var.l(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name), false);
                g9Var.e(Z1, this.f23324n);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = vp.r1(this.E).L0(Long.valueOf(-mdVar.f16940a));
        if (L0 != null) {
            this.f23324n.q(L0);
            u5Var.l(L0.title, false);
            g9Var.e(L0, this.f23324n);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f23320a != null && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.hj, this.D)) != this.f23321b) {
                this.f23321b = w02;
                org.telegram.ui.ActionBar.t6.H1(this.f23320a, w02, false);
                org.telegram.ui.ActionBar.t6.H1(this.f23320a, w02, true);
                this.f23320a.invalidateSelf();
                org.telegram.ui.Components.g9 g9Var = this.f23322c;
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
