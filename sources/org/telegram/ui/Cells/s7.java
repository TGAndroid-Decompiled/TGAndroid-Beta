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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.pd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.ma0;
public final class s7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 E;
    public int F;
    public final j6.o G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public y f31769a;
    public int f31770b;
    public final org.telegram.ui.Components.q9 f31771c;
    public final org.telegram.ui.ActionBar.n5 d;
    public int f31772e;
    public final TextView f31773f;
    public boolean h;
    public org.telegram.ui.Components.b9 f31774n;
    public final int f31775r;
    public final RectF f31776s;
    public pd f31777w;
    public ma0 f31778x;
    public final Location f31779y;

    public s7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
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
        this.f31776s = new RectF();
        this.f31779y = new Location("network");
        this.F = j10.f24770t0;
        this.G = new j6.o(this, 26);
        this.L = "";
        this.E = i6Var;
        this.f31775r = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31771c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f31774n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        ks.i(n5Var);
        n5Var.setTextSize(16);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        if (gd.f24213a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n5Var.setGravity(i10);
        n5Var.setScrollNonFitText(true);
        if (z10) {
            boolean z11 = gd.f24213a0;
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
            addView(q9Var, c8.ma.d(42, 42.0f, i15, f13, 12.0f, f14, 0.0f));
            boolean z12 = gd.f24213a0;
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
            addView(n5Var, c8.ma.d(-1, 20.0f, i16, f15, 12.0f, f16, 0.0f));
            TextView textView = new TextView(context);
            this.f31773f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
            if (gd.f24213a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView.setGravity(i14);
            boolean z13 = gd.f24213a0;
            int i17 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f17 = i7;
            } else {
                f17 = 73.0f;
            }
            addView(textView, c8.ma.d(-1, -2.0f, i17, f17, 33.0f, z13 ? 73.0f : i7, 0.0f));
        } else {
            boolean z14 = gd.f24213a0;
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
            addView(q9Var, c8.ma.d(42, 42.0f, i18, f10, 6.0f, f11, 0.0f));
            boolean z15 = gd.f24213a0;
            int i19 = (z15 ? 5 : 3) | 48;
            if (z15) {
                f12 = i7;
            } else {
                f12 = 74.0f;
            }
            addView(n5Var, c8.ma.d(-2, -2.0f, i19, f12, 17.0f, z15 ? 74.0f : i7, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        s7 s7Var;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) <= 1.0E-6d && Math.abs(this.J - d2) <= 1.0E-6d && !TextUtils.isEmpty(this.L)) {
            s7Var = this;
        } else {
            this.H = true;
            s7Var = this;
            Utilities.f22779e.c(new r7(s7Var, d, d2, 0));
        }
        return s7Var.L;
    }

    public final void b(fj fjVar, Location location, boolean z10) {
        String str;
        float f10;
        CharSequence charSequence;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.Components.q9 q9Var = this.f31771c;
        org.telegram.ui.ActionBar.i6 i6Var = this.E;
        TextView textView = this.f31773f;
        if (fjVar != null && (message = fjVar.f23965k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(2131232541);
            org.telegram.ui.ActionBar.u6.x(this, drawable, org.telegram.ui.ActionBar.n6.ej, i6Var, PorterDuff.Mode.MULTIPLY);
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.kj, i6Var);
            y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(42.0f), w02, w02);
            this.f31769a = j02;
            this.f31770b = w02;
            mq mqVar = new mq(j02, drawable);
            int L = org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(42.0f);
            mqVar.h = L;
            mqVar.f37612n = L2;
            int L3 = org.telegram.messenger.g0.L(24.0f);
            int L4 = org.telegram.messenger.g0.L(24.0f);
            mqVar.f37610e = L3;
            mqVar.f37611f = L4;
            q9Var.setImageDrawable(mqVar);
            n5Var.l(org.telegram.messenger.j6.m(mp.u1(this.F).D1(org.telegram.messenger.n5.o(fjVar.f23965k.peer_id), false), n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = fjVar.f23965k.media.address;
            this.f31772e = new StaticLayout(str2, textView.getPaint(), org.telegram.messenger.g0.f24118q.x - org.telegram.messenger.g0.L(this.f31775r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = fjVar.Z0();
        if (fj.l3(fjVar.f23965k)) {
            Z0 = fj.B1(fjVar.f23965k.fwd_from.from_id);
        }
        this.F = fjVar.K1;
        if (!TextUtils.isEmpty(fjVar.f23965k.media.address)) {
            str = fjVar.f23965k.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(fjVar.f23965k.media.title);
        if (isEmpty) {
            this.f31774n = null;
            if (Z0 > 0) {
                f10 = 42.0f;
                TLRPC.User c22 = mp.u1(this.F).c2(Long.valueOf(Z0));
                if (c22 != null) {
                    this.f31774n = new org.telegram.ui.Components.b9(0, c22);
                    charSequence = o10.q(c22);
                    q9Var.f(c22, this.f31774n);
                } else {
                    TLRPC.GeoPoint geoPoint = fjVar.f23965k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                f10 = 42.0f;
                TLRPC.Chat O0 = mp.u1(this.F).O0(Long.valueOf(-Z0));
                if (O0 != null) {
                    org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(O0);
                    this.f31774n = b9Var;
                    charSequence = O0.title;
                    q9Var.f(O0, b9Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = fjVar.f23965k.media.geo;
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
                spannableString.setSpan(new p80(n5Var, org.telegram.messenger.g0.L(100.0f), 0, i6Var), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(fjVar.f23965k.media.title)) {
                charSequence = fjVar.f23965k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(2131232541);
            org.telegram.ui.ActionBar.u6.x(this, drawable2, org.telegram.ui.ActionBar.n6.ej, i6Var, PorterDuff.Mode.MULTIPLY);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.kj, i6Var);
            y j03 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(f10), w03, w03);
            this.f31769a = j03;
            this.f31770b = w03;
            mq mqVar2 = new mq(j03, drawable2);
            int L5 = org.telegram.messenger.g0.L(f10);
            int L6 = org.telegram.messenger.g0.L(f10);
            mqVar2.h = L5;
            mqVar2.f37612n = L6;
            int L7 = org.telegram.messenger.g0.L(24.0f);
            int L8 = org.telegram.messenger.g0.L(24.0f);
            mqVar2.f37610e = L7;
            mqVar2.f37611f = L8;
            q9Var.setImageDrawable(mqVar2);
        }
        n5Var.l(charSequence, false);
        double d = fjVar.f23965k.media.geo.lat;
        Location location2 = this.f31779y;
        location2.setLatitude(d);
        location2.setLongitude(fjVar.f23965k.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + gd.y(distanceTo, 0, null));
                return;
            }
            textView.setText(gd.y(distanceTo, 0, null));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z10) {
            textView.setText(gd.M0(2131748587, null));
        } else {
            textView.setText("");
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.g3(this.G);
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
        pd pdVar = this.f31777w;
        if (pdVar != null || this.f31778x != null) {
            if (pdVar != null) {
                i10 = pdVar.f26227c;
                i7 = pdVar.d;
            } else {
                TLRPC.Message message = this.f31778x.f49782b;
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
            boolean z12 = gd.f24213a0;
            float f12 = 48.0f;
            float f13 = 12.0f;
            TextView textView = this.f31773f;
            RectF rectF = this.f31776s;
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
            org.telegram.ui.ActionBar.i6 i6Var = this.E;
            if (textView == null) {
                w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.pj, i6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.jj, i6Var);
            }
            org.telegram.ui.ActionBar.n6.f29537l2.setColor(w02);
            org.telegram.ui.ActionBar.n6.F2.setColor(w02);
            int alpha = org.telegram.ui.ActionBar.n6.f29537l2.getAlpha();
            org.telegram.ui.ActionBar.n6.f29537l2.setAlpha((int) (alpha * 0.2f));
            canvas.drawArc(rectF, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.n6.f29537l2);
            org.telegram.ui.ActionBar.n6.f29537l2.setAlpha(alpha);
            canvas.drawArc(rectF, -90.0f, f11 * (-360.0f), false, org.telegram.ui.ActionBar.n6.f29537l2);
            org.telegram.ui.ActionBar.n6.f29537l2.setAlpha(alpha);
            if (z11) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(2131231130).mutate();
                }
                if (org.telegram.ui.ActionBar.n6.F2.getColor() != this.N) {
                    Drawable drawable = this.M;
                    int color = org.telegram.ui.ActionBar.n6.F2.getColor();
                    this.N = color;
                    drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                this.M.setBounds(c0.C(2, (int) rectF.centerX(), this.M), c0.A(2, (int) rectF.centerY(), this.M), c0.y(2, (int) rectF.centerX(), this.M), c0.j(2, (int) rectF.centerY(), this.M));
                this.M.draw(canvas);
                return;
            }
            String C = gd.C(i12 - currentTime);
            float centerX = rectF.centerX() - (org.telegram.ui.ActionBar.n6.F2.measureText(C) / 2.0f);
            if (textView != null) {
                f10 = 37.0f;
            } else {
                f10 = 31.0f;
            }
            canvas.drawText(C, centerX, org.telegram.messenger.g0.L(f10), org.telegram.ui.ActionBar.n6.F2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        TextView textView = this.f31773f;
        if (textView != null) {
            f10 = 66.0f;
        } else {
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (textView != null && !this.h) {
            i11 = (-org.telegram.messenger.g0.L(20.0f)) + this.f31772e;
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i11, 1073741824));
    }

    public void setDialog(pd pdVar) {
        this.f31777w = pdVar;
        this.F = pdVar.f26228e;
        org.telegram.ui.Components.q9 q9Var = this.f31771c;
        q9Var.getImageReceiver().d = this.F;
        boolean E = org.telegram.messenger.n5.E(pdVar.f26225a);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        if (E) {
            TLRPC.User c22 = mp.u1(this.F).c2(Long.valueOf(pdVar.f26225a));
            if (c22 != null) {
                this.f31774n.r(c22);
                n5Var.l(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name), false);
                q9Var.f(c22, this.f31774n);
                return;
            }
            return;
        }
        TLRPC.Chat O0 = mp.u1(this.F).O0(Long.valueOf(-pdVar.f26225a));
        if (O0 != null) {
            this.f31774n.q(O0);
            n5Var.l(O0.title, false);
            q9Var.f(O0, this.f31774n);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f31769a != null && (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.kj, this.E)) != this.f31770b) {
                this.f31770b = w02;
                org.telegram.ui.ActionBar.n6.H1(this.f31769a, w02, false);
                org.telegram.ui.ActionBar.n6.H1(this.f31769a, w02, true);
                this.f31769a.invalidateSelf();
                org.telegram.ui.Components.q9 q9Var = this.f31771c;
                if (q9Var != null) {
                    q9Var.invalidate();
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
