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
public final class y11 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
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
    public o80 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int f42260a;
    public ValueAnimator f42261a0;
    public final org.telegram.ui.ActionBar.i6 f42262b;
    public rn0 f42263c;
    public final hi.x4 d;
    public final FrameLayout.LayoutParams f42264e;
    public final m6 f42265f;
    public final di.d1 h;
    public final q9 f42266n;
    public q11 f42267r;
    public final b9 f42268s;
    public final TextView f42269w;
    public final ImageView f42270x;
    public boolean f42271y;

    public y11(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = org.telegram.ui.ActionBar.n6.U8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.f42260a = i7;
        this.f42262b = i6Var;
        hi.x4 x4Var = new hi.x4(this, context);
        this.d = x4Var;
        x4Var.setWillNotDraw(false);
        x4Var.setOrientation(1);
        addView(x4Var, c8.ma.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        c8.ra.a(x4Var);
        m6 m6Var = new m6(false, false, false);
        this.f42265f = m6Var;
        m6Var.w(org.telegram.messenger.g0.L(11.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W8, i6Var));
        m6Var.N = org.telegram.messenger.g0.f24121q.x;
        m6Var.f37377b = 17;
        di.d1 d1Var = new di.d1(this, context, i6Var);
        this.h = d1Var;
        d1Var.setWillNotDraw(false);
        d1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        x4Var.addView(d1Var, c8.ma.r(-1, -2, 17));
        q9 q9Var = new q9(context);
        this.f42266n = q9Var;
        FrameLayout.LayoutParams e10 = c8.ma.e(34, 34, 17);
        this.f42264e = e10;
        d1Var.addView(q9Var, e10);
        this.f42268s = new b9((org.telegram.ui.ActionBar.i6) null);
        TextView textView = new TextView(context);
        this.f42269w = textView;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        textView.setTextColor(i0.a.f(this.V, w02, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        x4Var.addView(textView, c8.ma.t(-1, -2, 17, 4, 0, 4, 0));
        x4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.f42270x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(2.33f), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(imageView, d02, M, null, i6Var);
        addView(imageView, c8.ma.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
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
        this.f42266n.setRoundRadius(org.telegram.messenger.g0.L(f10));
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
        FrameLayout.LayoutParams layoutParams = this.f42264e;
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
        long j11 = tL_forumTopic.f28457id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Q = false;
        this.O = j11;
        this.P = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f42269w;
        textView.setText(str);
        textView.setVisibility(0);
        int i7 = tL_forumTopic.f28457id;
        q9 q9Var = this.f42266n;
        if (i7 == 1) {
            this.Q = true;
            q9Var.b();
            q9Var.setAnimatedEmojiDrawable(null);
            q9Var.setImageResource(2131232146);
            q9Var.setScaleX(0.66f);
            q9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            q9Var.b();
            q9Var.setAnimatedEmojiDrawable(o5.m(org.telegram.messenger.j10.f24773t0, tL_forumTopic.icon_emoji_id, null, 3));
            q9Var.setScaleX(1.0f);
            q9Var.setScaleY(1.0f);
        } else {
            q9Var.setAnimatedEmojiDrawable(null);
            q9Var.setImageDrawable(qg.c.f(tL_forumTopic));
            q9Var.setScaleX(1.0f);
            q9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean u22 = org.telegram.messenger.mp.u1(this.f42260a).u2(j3, tL_forumTopic.f28457id, null);
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
        d(i10, u22, z12, z13, z11);
        boolean z14 = tL_forumTopic.pinned;
        if (this.F != z14) {
            this.F = z14;
        }
        h();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29807z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.Q = true;
        this.P = true;
        String M0 = org.telegram.messenger.gd.M0(2131748059, null);
        TextView textView = this.f42269w;
        textView.setText(M0);
        textView.setVisibility(0);
        q9 q9Var = this.f42266n;
        q9Var.b();
        q9Var.setAnimatedEmojiDrawable(null);
        q9Var.setImageResource(2131231067);
        q9Var.setScaleX(1.0f);
        q9Var.setScaleY(1.0f);
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
            i7 = 2131753062;
        } else {
            i7 = 2131754286;
        }
        String M0 = org.telegram.messenger.gd.M0(i7, null);
        TextView textView = this.f42269w;
        textView.setText(M0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        q9 q9Var = this.f42266n;
        q9Var.b();
        q9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            q11 q11Var = new q11(getContext());
            q11Var.f38682b.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f42262b));
            q9Var.setImageDrawable(q11Var);
            this.f42267r = q11Var;
        } else {
            q9Var.setImageResource(2131232474);
            this.f42267r = null;
        }
        q9Var.setScaleX(1.0f);
        q9Var.setScaleY(1.0f);
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
        m6 m6Var = this.f42265f;
        if (z12) {
            this.G = org.telegram.ui.ActionBar.n6.Z5;
            if (this.I == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                lq lqVar = new lq(2131231964, 0);
                lqVar.I = 0.8f;
                lqVar.J = 0.8f;
                lqVar.H = 0.5f;
                lqVar.f37198r = -org.telegram.messenger.g0.L(3.0f);
                lqVar.f37199s = 0.0f;
                spannableStringBuilder.setSpan(lqVar, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            m6Var.t(this.I, z13, true);
        } else if (z11) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.n6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.U8;
            }
            this.G = i11;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                lq lqVar2 = new lq(2131231965, 0);
                lqVar2.I = 0.8f;
                lqVar2.J = 0.8f;
                lqVar2.H = 0.5f;
                lqVar2.f37198r = -org.telegram.messenger.g0.L(3.0f);
                lqVar2.f37199s = 0.0f;
                spannableStringBuilder2.setSpan(lqVar2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            m6Var.t(this.H, z13, true);
        } else if (i7 > 0) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.n6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.U8;
            }
            this.G = i10;
            m6Var.t(org.telegram.messenger.gd.E(i7, ','), z13, true);
        } else {
            this.G = org.telegram.ui.ActionBar.n6.V8;
            m6Var.t("", z13, true);
        }
        if (z13 && (this.J < i7 || ((!this.K && z11) || (!this.L && z12)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new w11(this, 1));
            this.N.addListener(new s11(this, 1));
            org.telegram.ui.Cells.c0.q(2.0f, this.N);
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
        TextView textView = this.f42269w;
        p80 p80Var = new p80(L, textView);
        p80Var.f38318e = 0.75f;
        spannableStringBuilder.setSpan(p80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        q9 q9Var = this.f42266n;
        q9Var.b();
        q9Var.setAnimatedEmojiDrawable(null);
        if (this.R == null) {
            org.telegram.ui.ActionBar.i6 i6Var = this.f42262b;
            o80 o80Var = new o80(i6Var);
            this.R = o80Var;
            o80Var.k(38.0f);
            this.R.setCallback(q9Var);
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
            this.R.g(org.telegram.ui.ActionBar.n6.r1(0.15f, w02), org.telegram.ui.ActionBar.n6.r1(0.5f, w02), org.telegram.ui.ActionBar.n6.r1(0.6f, w02), org.telegram.ui.ActionBar.n6.r1(0.15f, w02));
            this.R.f38023n = false;
        }
        q9Var.setImageDrawable(this.R);
        q9Var.setScaleX(1.0f);
        q9Var.setScaleY(1.0f);
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
        long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        if (o4 == this.O) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = o4;
        String l10 = org.telegram.messenger.n5.l(org.telegram.messenger.j10.f24773t0, o4);
        TextView textView = this.f42269w;
        textView.setText(l10);
        textView.setVisibility(0);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        int i10 = this.f42260a;
        q9 q9Var = this.f42266n;
        b9 b9Var = this.f42268s;
        if (i7 >= 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(o4));
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-o4));
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
        }
        q9Var.setScaleX(1.0f);
        q9Var.setScaleY(1.0f);
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
        int i7 = org.telegram.ui.ActionBar.n6.f29807z6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f42262b;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
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
        q9 q9Var = this.f42266n;
        if (!z10) {
            q9Var.setColorFilter(null);
        } else {
            q9Var.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        q9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        q9Var.invalidate();
    }

    public final void h() {
        int i7;
        float f10 = 1.0f;
        float f11 = (1.0f - this.V) * (-org.telegram.messenger.g0.L(3.0f));
        ImageView imageView = this.f42270x;
        imageView.setTranslationX(f11);
        if (this.V <= 0.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        int i10 = org.telegram.ui.ActionBar.n6.f29807z6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f42262b;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
        if (!this.P) {
            f10 = this.V;
        }
        this.f42269w.setTextColor(i0.a.f(f10, w02, w03));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), i10);
    }

    public void setReorder(boolean z10) {
        this.f42271y = z10;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f10;
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        ValueAnimator valueAnimator = this.f42261a0;
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
        this.f42261a0 = ofFloat;
        ofFloat.addUpdateListener(new w11(this, 0));
        this.f42261a0.addListener(new org.telegram.ui.on(24, this, z10));
        this.f42261a0.setInterpolator(lr.h);
        this.f42261a0.setDuration(320L);
        this.f42261a0.start();
    }

    @Override
    public final void updateColors() {
        float f10;
        try {
            TextView textView = this.f42269w;
            float f11 = 1.0f;
            org.telegram.ui.ActionBar.i6 i6Var = this.f42262b;
            if (textView != null) {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
                if (this.P) {
                    f10 = 1.0f;
                } else {
                    f10 = this.V;
                }
                textView.setTextColor(i0.a.f(f10, w02, w03));
            }
            q9 q9Var = this.f42266n;
            if (q9Var != null) {
                int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
                int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
                if (!this.P) {
                    f11 = this.V;
                }
                int f12 = i0.a.f(f11, w04, w05);
                if (!this.S || f12 != this.U || this.Q != this.T) {
                    g();
                }
            }
            q11 q11Var = this.f42267r;
            if (q11Var != null) {
                q11Var.f38682b.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
                if (q9Var != null) {
                    q9Var.invalidate();
                }
            }
            if (this.R != null) {
                int w06 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
                this.R.g(org.telegram.ui.ActionBar.n6.r1(0.15f, w06), org.telegram.ui.ActionBar.n6.r1(0.5f, w06), org.telegram.ui.ActionBar.n6.r1(0.6f, w06), org.telegram.ui.ActionBar.n6.r1(0.15f, w06));
                this.R.f38023n = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
