package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class o11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public boolean F;
    public int G;
    public SpannableStringBuilder H;
    public SpannableStringBuilder I;
    public int J;
    public boolean K;
    public boolean L;
    public float M;
    public ValueAnimator N;
    public long O;
    public boolean P;
    public boolean Q;
    public d80 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int f37789a;
    public ValueAnimator f37790a0;
    public final org.telegram.ui.ActionBar.e6 f37791b;
    public in0 f37792c;
    public final hi.y4 d;
    public final FrameLayout.LayoutParams f37793e;
    public final g6 f37794f;
    public final di.e1 h;
    public final i9 f37795n;
    public g11 f37796r;
    public final t8 f37797s;
    public final TextView f37798w;
    public final ImageView f37799x;
    public boolean f37800y;

    public o11(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = org.telegram.ui.ActionBar.j6.U8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.f37789a = i7;
        this.f37791b = e6Var;
        hi.y4 y4Var = new hi.y4(this, context);
        this.d = y4Var;
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        addView(y4Var, c8.ja.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        c8.na.a(y4Var);
        g6 g6Var = new g6(false, false, false);
        this.f37794f = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W8, e6Var));
        g6Var.N = org.telegram.messenger.g0.f23611q.x;
        g6Var.f34833b = 17;
        di.e1 e1Var = new di.e1(this, context, e6Var);
        this.h = e1Var;
        e1Var.setWillNotDraw(false);
        e1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        y4Var.addView(e1Var, c8.ja.r(-1, -2, 17));
        i9 i9Var = new i9(context);
        this.f37795n = i9Var;
        FrameLayout.LayoutParams e10 = c8.ja.e(34, 34, 17);
        this.f37793e = e10;
        e1Var.addView(i9Var, e10);
        this.f37797s = new t8((org.telegram.ui.ActionBar.e6) null);
        TextView textView = new TextView(context);
        this.f37798w = textView;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        textView.setTextColor(i0.a.f(this.V, w02, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        y4Var.addView(textView, c8.ja.t(-1, -2, 17, 4, 0, 4, 0));
        y4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.f37799x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(2.33f), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(imageView, d02, M, null, e6Var);
        addView(imageView, c8.ja.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f10;
        float f11;
        int L;
        int L2;
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        if (z10) {
            f10 = 36.0f;
        } else {
            f10 = 3.0f;
        }
        this.f37795n.setRoundRadius(org.telegram.messenger.g0.L(f10));
        if (z10) {
            f11 = 7.0f;
        } else {
            f11 = 4.0f;
        }
        this.h.setPadding(0, org.telegram.messenger.g0.L(f11), 0, 0);
        if (z10) {
            L = org.telegram.messenger.g0.L(28.0f);
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        FrameLayout.LayoutParams layoutParams = this.f37793e;
        layoutParams.width = L;
        if (z10) {
            L2 = org.telegram.messenger.g0.L(28.0f);
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        layoutParams.height = L2;
    }

    public final void a(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        setLayout(false);
        long j10 = this.O;
        long j11 = tL_forumTopic.f28103id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Q = false;
        this.O = j11;
        this.P = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f37798w;
        textView.setText(str);
        textView.setVisibility(0);
        int i7 = tL_forumTopic.f28103id;
        i9 i9Var = this.f37795n;
        if (i7 == 1) {
            this.Q = true;
            i9Var.b();
            i9Var.setAnimatedEmojiDrawable(null);
            i9Var.setImageResource(2131232145);
            i9Var.setScaleX(0.66f);
            i9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            i9Var.b();
            i9Var.setAnimatedEmojiDrawable(g5.m(org.telegram.messenger.m10.f24940t0, tL_forumTopic.icon_emoji_id, null, 3));
            i9Var.setScaleX(1.0f);
            i9Var.setScaleY(1.0f);
        } else {
            i9Var.setAnimatedEmojiDrawable(null);
            i9Var.setImageDrawable(qg.c.e(tL_forumTopic));
            i9Var.setScaleX(1.0f);
            i9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean r22 = org.telegram.messenger.np.s1(this.f37789a).r2(j3, tL_forumTopic.f28103id, null);
        int i10 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_mentions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (tL_forumTopic.unread_reactions_count > 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        d(i10, r22, z12, z13, z11);
        boolean z14 = tL_forumTopic.pinned;
        if (this.F != z14) {
            this.F = z14;
        }
        h();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.Q = true;
        this.P = true;
        String M0 = org.telegram.messenger.hd.M0(2131748251, null);
        TextView textView = this.f37798w;
        textView.setText(M0);
        textView.setVisibility(0);
        i9 i9Var = this.f37795n;
        i9Var.b();
        i9Var.setAnimatedEmojiDrawable(null);
        i9Var.setImageResource(2131231067);
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i7;
        int i10;
        setLayout(z11);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        if (z10) {
            i7 = 2131753064;
        } else {
            i7 = 2131754288;
        }
        String M0 = org.telegram.messenger.hd.M0(i7, null);
        TextView textView = this.f37798w;
        textView.setText(M0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        i9 i9Var = this.f37795n;
        i9Var.b();
        i9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            g11 g11Var = new g11(getContext());
            g11Var.f34780b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f37791b));
            i9Var.setImageDrawable(g11Var);
            this.f37796r = g11Var;
        } else {
            i9Var.setImageResource(2131232473);
            this.f37796r = null;
        }
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void d(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i10;
        int i11;
        g6 g6Var = this.f37794f;
        if (z12) {
            this.G = org.telegram.ui.ActionBar.j6.Z5;
            if (this.I == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                eq eqVar = new eq(2131231963, 0);
                eqVar.I = 0.8f;
                eqVar.J = 0.8f;
                eqVar.H = 0.5f;
                eqVar.f34414r = -org.telegram.messenger.g0.L(3.0f);
                eqVar.f34415s = 0.0f;
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            g6Var.t(this.I, z13, true);
        } else if (z11) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.j6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.U8;
            }
            this.G = i11;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                eq eqVar2 = new eq(2131231964, 0);
                eqVar2.I = 0.8f;
                eqVar2.J = 0.8f;
                eqVar2.H = 0.5f;
                eqVar2.f34414r = -org.telegram.messenger.g0.L(3.0f);
                eqVar2.f34415s = 0.0f;
                spannableStringBuilder2.setSpan(eqVar2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            g6Var.t(this.H, z13, true);
        } else if (i7 > 0) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.j6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.U8;
            }
            this.G = i10;
            g6Var.t(org.telegram.messenger.hd.E(i7, ','), z13, true);
        } else {
            this.G = org.telegram.ui.ActionBar.j6.V8;
            g6Var.t("", z13, true);
        }
        if (z13 && (this.J < i7 || ((!this.K && z11) || (!this.L && z12)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new m11(this, 1));
            this.N.addListener(new i11(this, 1));
            org.telegram.messenger.i20.k(2.0f, this.N);
            this.N.setDuration(200L);
            this.N.start();
        }
        this.J = i7;
        this.K = z11;
        this.L = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int L = org.telegram.messenger.g0.L(38.0f);
        TextView textView = this.f37798w;
        e80 e80Var = new e80(L, textView);
        e80Var.f34243e = 0.75f;
        spannableStringBuilder.setSpan(e80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        i9 i9Var = this.f37795n;
        i9Var.b();
        i9Var.setAnimatedEmojiDrawable(null);
        if (this.R == null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f37791b;
            d80 d80Var = new d80(e6Var);
            this.R = d80Var;
            d80Var.k(38.0f);
            this.R.setCallback(i9Var);
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
            this.R.g(org.telegram.ui.ActionBar.j6.r1(0.15f, w02), org.telegram.ui.ActionBar.j6.r1(0.5f, w02), org.telegram.ui.ActionBar.j6.r1(0.6f, w02), org.telegram.ui.ActionBar.j6.r1(0.15f, w02));
            this.R.f33877n = false;
        }
        i9Var.setImageDrawable(this.R);
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        setLayout(true);
        this.P = false;
        this.Q = false;
        long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        if (o4 == this.O) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = o4;
        String l10 = org.telegram.messenger.m5.l(org.telegram.messenger.m10.f24940t0, o4);
        TextView textView = this.f37798w;
        textView.setText(l10);
        textView.setVisibility(0);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        int i10 = this.f37789a;
        i9 i9Var = this.f37795n;
        t8 t8Var = this.f37797s;
        if (i7 >= 0) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(i10).a2(Long.valueOf(o4));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-o4));
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
        }
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i11, false, false, z12, z11);
        if (this.F) {
            this.F = false;
        }
    }

    public final void g() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.j6.f29260z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f37791b;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
        if (this.P) {
            f10 = 1.0f;
        } else {
            f10 = this.V;
        }
        int f11 = i0.a.f(f10, w02, w03);
        this.S = true;
        this.U = f11;
        boolean z10 = this.Q;
        this.T = z10;
        i9 i9Var = this.f37795n;
        if (!z10) {
            i9Var.setColorFilter(null);
        } else {
            i9Var.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        i9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        i9Var.invalidate();
    }

    public final void h() {
        int i7;
        float f10 = 1.0f;
        float f11 = (1.0f - this.V) * (-org.telegram.messenger.g0.L(3.0f));
        ImageView imageView = this.f37799x;
        imageView.setTranslationX(f11);
        if (this.V <= 0.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        int i10 = org.telegram.ui.ActionBar.j6.f29260z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f37791b;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
        if (!this.P) {
            f10 = this.V;
        }
        this.f37798w.setTextColor(i0.a.f(f10, w02, w03));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), i10);
    }

    public void setReorder(boolean z10) {
        this.f37800y = z10;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f10;
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        ValueAnimator valueAnimator = this.f37790a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.V;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f37790a0 = ofFloat;
        ofFloat.addUpdateListener(new m11(this, 0));
        this.f37790a0.addListener(new org.telegram.ui.nn(24, this, z10));
        this.f37790a0.setInterpolator(er.h);
        this.f37790a0.setDuration(320L);
        this.f37790a0.start();
    }

    @Override
    public final void updateColors() {
        float f10;
        try {
            TextView textView = this.f37798w;
            float f11 = 1.0f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f37791b;
            if (textView != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
                if (this.P) {
                    f10 = 1.0f;
                } else {
                    f10 = this.V;
                }
                textView.setTextColor(i0.a.f(f10, w02, w03));
            }
            i9 i9Var = this.f37795n;
            if (i9Var != null) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
                int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
                if (!this.P) {
                    f11 = this.V;
                }
                int f12 = i0.a.f(f11, w04, w05);
                if (!this.S || f12 != this.U || this.Q != this.T) {
                    g();
                }
            }
            g11 g11Var = this.f37796r;
            if (g11Var != null) {
                g11Var.f34780b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var));
                if (i9Var != null) {
                    i9Var.invalidate();
                }
            }
            if (this.R != null) {
                int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
                this.R.g(org.telegram.ui.ActionBar.j6.r1(0.15f, w06), org.telegram.ui.ActionBar.j6.r1(0.5f, w06), org.telegram.ui.ActionBar.j6.r1(0.6f, w06), org.telegram.ui.ActionBar.j6.r1(0.15f, w06));
                this.R.f33877n = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
