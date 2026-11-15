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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.qd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.fq;
import org.telegram.ui.la0;
public final class q7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 E;
    public int F;
    public final j6.o G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public y f31296a;
    public int f31297b;
    public final org.telegram.ui.Components.i9 f31298c;
    public final org.telegram.ui.ActionBar.j5 d;
    public int f31299e;
    public final TextView f31300f;
    public boolean h;
    public org.telegram.ui.Components.t8 f31301n;
    public final int f31302r;
    public final RectF f31303s;
    public qd f31304w;
    public la0 f31305x;
    public final Location f31306y;

    public q7(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
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
        this.f31303s = new RectF();
        this.f31306y = new Location("network");
        this.F = m10.f24934t0;
        this.G = new j6.o(this, 26);
        this.L = "";
        this.E = e6Var;
        this.f31302r = i7;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f31298c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f31301n = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        ns.i(j5Var);
        j5Var.setTextSize(16);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        if (hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        j5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = hd.f24101a0;
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
            addView(i9Var, c8.ja.d(42, 42.0f, i15, f13, 12.0f, f14, 0.0f));
            boolean z12 = hd.f24101a0;
            if (z12) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z12) {
                f15 = i7;
            } else {
                f15 = 73.0f;
            }
            if (z12) {
                f16 = 73.0f;
            } else {
                f16 = 16.0f;
            }
            addView(j5Var, c8.ja.d(-1, 20.0f, i16, f15, 12.0f, f16, 0.0f));
            TextView textView = new TextView(context);
            this.f31300f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.A6, e6Var);
            if (hd.f24101a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView.setGravity(i14);
            boolean z13 = hd.f24101a0;
            int i17 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f17 = i7;
            } else {
                f17 = 73.0f;
            }
            addView(textView, c8.ja.d(-1, -2.0f, i17, f17, 33.0f, z13 ? 73.0f : i7, 0.0f));
        } else {
            boolean z14 = hd.f24101a0;
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
            addView(i9Var, c8.ja.d(42, 42.0f, i18, f10, 6.0f, f11, 0.0f));
            boolean z15 = hd.f24101a0;
            int i19 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f12 = i7;
            } else {
                f12 = 74.0f;
            }
            addView(j5Var, c8.ja.d(-2, -2.0f, i19, f12, 17.0f, z15 ? 74.0f : i7, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        q7 q7Var;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) <= 1.0E-6d && Math.abs(this.J - d2) <= 1.0E-6d && !TextUtils.isEmpty(this.L)) {
            q7Var = this;
        } else {
            this.H = true;
            q7Var = this;
            Utilities.f22416e.c(new p7(q7Var, d, d2, 0));
        }
        return q7Var.L;
    }

    public final void b(gj gjVar, Location location, boolean z10) {
        String str;
        float f10;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        org.telegram.ui.Components.i9 i9Var = this.f31298c;
        org.telegram.ui.ActionBar.e6 e6Var = this.E;
        TextView textView = this.f31300f;
        if (gjVar != null && (message = gjVar.f23817k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(2131232540);
            org.telegram.ui.ActionBar.q6.x(this, drawable, org.telegram.ui.ActionBar.j6.ej, e6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.kj, e6Var);
            y j02 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(42.0f), w02, w02);
            this.f31296a = j02;
            this.f31297b = w02;
            fq fqVar = new fq(j02, drawable);
            int L = org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(42.0f);
            fqVar.h = L;
            fqVar.f34674n = L2;
            int L3 = org.telegram.messenger.g0.L(24.0f);
            int L4 = org.telegram.messenger.g0.L(24.0f);
            fqVar.f34672e = L3;
            fqVar.f34673f = L4;
            i9Var.setImageDrawable(fqVar);
            j5Var.l(org.telegram.messenger.j6.m(np.s1(this.F).B1(org.telegram.messenger.m5.o(gjVar.f23817k.peer_id), false), j5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = gjVar.f23817k.media.address;
            this.f31299e = new StaticLayout(str2, textView.getPaint(), org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(this.f31302r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = gjVar.Z0();
        if (gj.l3(gjVar.f23817k)) {
            Z0 = gj.B1(gjVar.f23817k.fwd_from.from_id);
        }
        this.F = gjVar.K1;
        if (!TextUtils.isEmpty(gjVar.f23817k.media.address)) {
            str = gjVar.f23817k.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(gjVar.f23817k.media.title);
        if (isEmpty) {
            this.f31301n = null;
            if (Z0 > 0) {
                f10 = 42.0f;
                TLRPC.User a22 = np.s1(this.F).a2(Long.valueOf(Z0));
                if (a22 != null) {
                    this.f31301n = new org.telegram.ui.Components.t8(0, a22);
                    charSequence = q10.p(a22);
                    i9Var.f(a22, this.f31301n);
                } else {
                    TLRPC.GeoPoint geoPoint = gjVar.f23817k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f10 = 42.0f;
                TLRPC.Chat M0 = np.s1(this.F).M0(Long.valueOf(-Z0));
                if (M0 != null) {
                    org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(M0);
                    this.f31301n = t8Var;
                    charSequence = M0.title;
                    i9Var.f(M0, t8Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = gjVar.f23817k.media.geo;
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
                spannableString.setSpan(new e80(j5Var, org.telegram.messenger.g0.L(100.0f), 0, e6Var), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(gjVar.f23817k.media.title)) {
                charSequence = gjVar.f23817k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(2131232540);
            org.telegram.ui.ActionBar.q6.x(this, drawable2, org.telegram.ui.ActionBar.j6.ej, e6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.kj, e6Var);
            y j03 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(f10), w03, w03);
            this.f31296a = j03;
            this.f31297b = w03;
            fq fqVar2 = new fq(j03, drawable2);
            int L5 = org.telegram.messenger.g0.L(f10);
            int L6 = org.telegram.messenger.g0.L(f10);
            fqVar2.h = L5;
            fqVar2.f34674n = L6;
            int L7 = org.telegram.messenger.g0.L(24.0f);
            int L8 = org.telegram.messenger.g0.L(24.0f);
            fqVar2.f34672e = L7;
            fqVar2.f34673f = L8;
            i9Var.setImageDrawable(fqVar2);
        }
        j5Var.l(charSequence, false);
        double d = gjVar.f23817k.media.geo.lat;
        Location location2 = this.f31306y;
        location2.setLatitude(d);
        location2.setLongitude(gjVar.f23817k.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + hd.y(distanceTo, 0, null));
                return;
            }
            textView.setText(hd.y(distanceTo, 0, null));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z10) {
            textView.setText(hd.M0(2131748779, null));
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
        int i7;
        int i10;
        boolean z10;
        float abs;
        int w02;
        float f10;
        qd qdVar = this.f31304w;
        if (qdVar != null || this.f31305x != null) {
            if (qdVar != null) {
                i10 = qdVar.f26080c;
                i7 = qdVar.d;
            } else {
                TLRPC.Message message = this.f31305x.f48922b;
                int i11 = message.date;
                i7 = message.media.period;
                i10 = i11 + i7;
            }
            int i12 = i10;
            if (i7 == Integer.MAX_VALUE) {
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
                abs = Math.abs(i12 - currentTime) / i7;
            }
            float f11 = abs;
            boolean z12 = hd.f24101a0;
            float f12 = 48.0f;
            float f13 = 12.0f;
            TextView textView = this.f31300f;
            RectF rectF = this.f31303s;
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
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.pj, e6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.jj, e6Var);
            }
            org.telegram.ui.ActionBar.j6.f28992l2.setColor(w02);
            org.telegram.ui.ActionBar.j6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.j6.f28992l2.getAlpha();
            org.telegram.ui.ActionBar.j6.f28992l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.j6.f28992l2);
            org.telegram.ui.ActionBar.j6.f28992l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f11 * (-360.0f), false, org.telegram.ui.ActionBar.j6.f28992l2);
            org.telegram.ui.ActionBar.j6.f28992l2.setAlpha(alpha);
            if (z11) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(2131231130).mutate();
                }
                if (org.telegram.ui.ActionBar.j6.F2.getColor() != this.N) {
                    Drawable drawable = this.M;
                    int color = org.telegram.ui.ActionBar.j6.F2.getColor();
                    this.N = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.M.setBounds(y0.A(2, (int) rectF.centerX(), this.M), y0.y(2, (int) rectF.centerY(), this.M), y0.w(2, (int) rectF.centerX(), this.M), y0.h(2, (int) rectF.centerY(), this.M));
                this.M.draw(canvas);
                return;
            }
            String C = hd.C(i12 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.j6.F2.measureText(C) / 2.0f);
            if (textView != null) {
                f10 = 37.0f;
            } else {
                f10 = 31.0f;
            }
            canvas.drawText(C, centerX, org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.j6.F2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        TextView textView = this.f31300f;
        if (textView != null) {
            f10 = 66.0f;
        } else {
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (textView != null && !this.h) {
            i11 = (-org.telegram.messenger.g0.L(20.0f)) + this.f31299e;
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i11, 1073741824));
    }

    public void setDialog(qd qdVar) {
        this.f31304w = qdVar;
        this.F = qdVar.f26081e;
        org.telegram.ui.Components.i9 i9Var = this.f31298c;
        i9Var.getImageReceiver().d = this.F;
        boolean E = org.telegram.messenger.m5.E(qdVar.f26078a);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        if (E) {
            TLRPC.User a22 = np.s1(this.F).a2(Long.valueOf(qdVar.f26078a));
            if (a22 != null) {
                this.f31301n.r(a22);
                j5Var.l(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name), false);
                i9Var.f(a22, this.f31301n);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = np.s1(this.F).M0(Long.valueOf(-qdVar.f26078a));
        if (M0 != null) {
            this.f31301n.q(M0);
            j5Var.l(M0.title, false);
            i9Var.f(M0, this.f31301n);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f31296a != null && (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.kj, this.E)) != this.f31297b) {
                this.f31297b = w02;
                org.telegram.ui.ActionBar.j6.H1(this.f31296a, w02, false);
                org.telegram.ui.ActionBar.j6.H1(this.f31296a, w02, true);
                this.f31296a.invalidateSelf();
                org.telegram.ui.Components.i9 i9Var = this.f31298c;
                if (i9Var != null) {
                    i9Var.invalidate();
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
