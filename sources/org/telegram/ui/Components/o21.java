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
public final class o21 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public boolean E;
    public int F;
    public SpannableStringBuilder G;
    public SpannableStringBuilder H;
    public int I;
    public boolean J;
    public boolean K;
    public float L;
    public ValueAnimator M;
    public long N;
    public boolean O;
    public boolean P;
    public t80 Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public ValueAnimator W;
    public final int f29007a;
    public final org.telegram.ui.ActionBar.p6 f29008b;
    public go0 f29009c;
    public final jg.d0 d;
    public final FrameLayout.LayoutParams e;
    public final e6 f29010f;
    public final jg.a3 h;
    public final g9 f29011n;
    public h21 f29012r;
    public final r8 f29013s;
    public final TextView f29014w;
    public final ImageView f29015x;
    public boolean f29016y;

    public o21(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.D = false;
        this.E = false;
        this.F = org.telegram.ui.ActionBar.t6.U8;
        this.L = 1.0f;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.f29007a = i10;
        this.f29008b = p6Var;
        jg.d0 d0Var = new jg.d0(this, context);
        this.d = d0Var;
        d0Var.setWillNotDraw(false);
        d0Var.setOrientation(1);
        addView(d0Var, w7.b6.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        w7.e6.a(d0Var);
        e6 e6Var = new e6(false, false, false);
        this.f29010f = e6Var;
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.u(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W8, p6Var));
        e6Var.M = org.telegram.messenger.i0.f16172q.x;
        e6Var.f25744b = 17;
        jg.a3 a3Var = new jg.a3(this, context, p6Var);
        this.h = a3Var;
        a3Var.setWillNotDraw(false);
        a3Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
        d0Var.addView(a3Var, w7.b6.r(-1, -2, 17));
        g9 g9Var = new g9(context);
        this.f29011n = g9Var;
        FrameLayout.LayoutParams e = w7.b6.e(34, 34, 17);
        this.e = e;
        a3Var.addView(g9Var, e);
        this.f29013s = new r8((org.telegram.ui.ActionBar.p6) null);
        TextView textView = new TextView(context);
        this.f29014w = textView;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        textView.setTextColor(i0.b.f(this.U, w02, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        d0Var.addView(textView, w7.b6.t(-1, -2, 17, 4, 0, 4, 0));
        d0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.f29015x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(2.33f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(imageView, d02, N, null, p6Var);
        addView(imageView, w7.b6.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-org.telegram.messenger.i0.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f7;
        float f10;
        int L;
        int L2;
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        if (z10) {
            f7 = 36.0f;
        } else {
            f7 = 3.0f;
        }
        this.f29011n.setRoundRadius(org.telegram.messenger.i0.L(f7));
        if (z10) {
            f10 = 7.0f;
        } else {
            f10 = 4.0f;
        }
        this.h.setPadding(0, org.telegram.messenger.i0.L(f10), 0, 0);
        if (z10) {
            L = org.telegram.messenger.i0.L(28.0f);
        } else {
            L = org.telegram.messenger.i0.L(30.0f);
        }
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        if (z10) {
            L2 = org.telegram.messenger.i0.L(28.0f);
        } else {
            L2 = org.telegram.messenger.i0.L(30.0f);
        }
        layoutParams.height = L2;
    }

    public final void a(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        setLayout(false);
        long j11 = this.N;
        long j12 = tL_forumTopic.f19846id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.P = false;
        this.N = j12;
        this.O = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f29014w;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.f19846id;
        g9 g9Var = this.f29011n;
        if (i10 == 1) {
            this.P = true;
            g9Var.b();
            g9Var.setAnimatedEmojiDrawable(null);
            g9Var.setImageResource(2131232143);
            g9Var.setScaleX(0.66f);
            g9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            g9Var.b();
            g9Var.setAnimatedEmojiDrawable(f5.m(org.telegram.messenger.e20.f15506s0, tL_forumTopic.icon_emoji_id, null, 3));
            g9Var.setScaleX(1.0f);
            g9Var.setScaleY(1.0f);
        } else {
            g9Var.setAnimatedEmojiDrawable(null);
            g9Var.setImageDrawable(gg.e.e(tL_forumTopic));
            g9Var.setScaleX(1.0f);
            g9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean q22 = org.telegram.messenger.wp.r1(this.f29007a).q2(j10, tL_forumTopic.f19846id, null);
        int i11 = tL_forumTopic.unread_count;
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
        d(i11, q22, z12, z13, z11);
        boolean z14 = tL_forumTopic.pinned;
        if (this.E != z14) {
            this.E = z14;
        }
        h();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.P = true;
        this.O = true;
        String L0 = org.telegram.messenger.dd.L0(2131748268, null);
        TextView textView = this.f29014w;
        textView.setText(L0);
        textView.setVisibility(0);
        g9 g9Var = this.f29011n;
        g9Var.b();
        g9Var.setAnimatedEmojiDrawable(null);
        g9Var.setImageResource(2131231067);
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.N = -1L;
        this.P = true;
        this.O = false;
        if (z10) {
            i10 = 2131753064;
        } else {
            i10 = 2131754288;
        }
        String L0 = org.telegram.messenger.dd.L0(i10, null);
        TextView textView = this.f29014w;
        textView.setText(L0);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        g9 g9Var = this.f29011n;
        g9Var.b();
        g9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            h21 h21Var = new h21(getContext());
            h21Var.f26654b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f29008b));
            g9Var.setImageDrawable(h21Var);
            this.f29012r = h21Var;
        } else {
            g9Var.setImageResource(2131232471);
            this.f29012r = null;
        }
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        e6 e6Var = this.f29010f;
        if (z12) {
            this.F = org.telegram.ui.ActionBar.t6.Z5;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                dq dqVar = new dq(2131231962, 0);
                dqVar.H = 0.8f;
                dqVar.I = 0.8f;
                dqVar.G = 0.5f;
                dqVar.f25568r = -org.telegram.messenger.i0.L(3.0f);
                dqVar.f25569s = 0.0f;
                spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 33);
                this.H = spannableStringBuilder;
            }
            e6Var.t(this.H, z13, true);
        } else if (z11) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.t6.V8;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.U8;
            }
            this.F = i12;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                dq dqVar2 = new dq(2131231963, 0);
                dqVar2.H = 0.8f;
                dqVar2.I = 0.8f;
                dqVar2.G = 0.5f;
                dqVar2.f25568r = -org.telegram.messenger.i0.L(3.0f);
                dqVar2.f25569s = 0.0f;
                spannableStringBuilder2.setSpan(dqVar2, 0, 1, 33);
                this.G = spannableStringBuilder2;
            }
            e6Var.t(this.G, z13, true);
        } else if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.t6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.U8;
            }
            this.F = i11;
            e6Var.t(org.telegram.messenger.dd.E(i10, ','), z13, true);
        } else {
            this.F = org.telegram.ui.ActionBar.t6.V8;
            e6Var.t("", z13, true);
        }
        if (z13 && (this.I < i10 || ((!this.J && z11) || (!this.K && z12)))) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new m21(this, 1));
            this.M.addListener(new q11(this, 2));
            org.telegram.messenger.a30.j(2.0f, this.M);
            this.M.setDuration(200L);
            this.M.start();
        }
        this.I = i10;
        this.J = z11;
        this.K = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.N = -1L;
        this.P = true;
        this.O = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int L = org.telegram.messenger.i0.L(38.0f);
        TextView textView = this.f29014w;
        u80 u80Var = new u80(L, textView);
        u80Var.e = 0.75f;
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        g9 g9Var = this.f29011n;
        g9Var.b();
        g9Var.setAnimatedEmojiDrawable(null);
        if (this.Q == null) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f29008b;
            t80 t80Var = new t80(p6Var);
            this.Q = t80Var;
            t80Var.k(38.0f);
            this.Q.setCallback(g9Var);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
            this.Q.g(org.telegram.ui.ActionBar.t6.r1(0.15f, w02), org.telegram.ui.ActionBar.t6.r1(0.5f, w02), org.telegram.ui.ActionBar.t6.r1(0.6f, w02), org.telegram.ui.ActionBar.t6.r1(0.15f, w02));
            this.Q.f30583n = false;
        }
        g9Var.setImageDrawable(this.Q);
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        setLayout(true);
        this.O = false;
        this.P = false;
        long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
        if (o10 == this.N) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.N = o10;
        String l4 = org.telegram.messenger.o5.l(org.telegram.messenger.e20.f15506s0, o10);
        TextView textView = this.f29014w;
        textView.setText(l4);
        textView.setVisibility(0);
        int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
        int i11 = this.f29007a;
        g9 g9Var = this.f29011n;
        r8 r8Var = this.f29013s;
        if (i10 >= 0) {
            TLRPC.User Z1 = org.telegram.messenger.wp.r1(i11).Z1(Long.valueOf(o10));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i11).L0(Long.valueOf(-o10));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
        }
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i12 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i12, false, false, z12, z11);
        if (this.E) {
            this.E = false;
        }
    }

    public final void g() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.t6.f21331z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f29008b;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        if (this.O) {
            f7 = 1.0f;
        } else {
            f7 = this.U;
        }
        int f10 = i0.b.f(f7, w02, w03);
        this.R = true;
        this.T = f10;
        boolean z10 = this.P;
        this.S = z10;
        g9 g9Var = this.f29011n;
        if (!z10) {
            g9Var.setColorFilter(null);
        } else {
            g9Var.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        g9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        g9Var.invalidate();
    }

    public final void h() {
        int i10;
        float f7 = 1.0f;
        float f10 = (1.0f - this.U) * (-org.telegram.messenger.i0.L(3.0f));
        ImageView imageView = this.f29015x;
        imageView.setTranslationX(f10);
        if (this.U <= 0.0f) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.t6.f21331z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f29008b;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        if (!this.O) {
            f7 = this.U;
        }
        this.f29014w.setTextColor(i0.b.f(f7, w02, w03));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), 1073741824), i11);
    }

    public void setReorder(boolean z10) {
        this.f29016y = z10;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f7;
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.U;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new m21(this, 0));
        this.W.addListener(new ha0(9, this, z10));
        this.W.setInterpolator(gr.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    @Override
    public final void updateColors() {
        float f7;
        try {
            TextView textView = this.f29014w;
            float f10 = 1.0f;
            org.telegram.ui.ActionBar.p6 p6Var = this.f29008b;
            if (textView != null) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
                if (this.O) {
                    f7 = 1.0f;
                } else {
                    f7 = this.U;
                }
                textView.setTextColor(i0.b.f(f7, w02, w03));
            }
            g9 g9Var = this.f29011n;
            if (g9Var != null) {
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
                int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
                if (!this.O) {
                    f10 = this.U;
                }
                int f11 = i0.b.f(f10, w04, w05);
                if (!this.R || f11 != this.T || this.P != this.S) {
                    g();
                }
            }
            h21 h21Var = this.f29012r;
            if (h21Var != null) {
                h21Var.f26654b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
                if (g9Var != null) {
                    g9Var.invalidate();
                }
            }
            if (this.Q != null) {
                int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
                this.Q.g(org.telegram.ui.ActionBar.t6.r1(0.15f, w06), org.telegram.ui.ActionBar.t6.r1(0.5f, w06), org.telegram.ui.ActionBar.t6.r1(0.6f, w06), org.telegram.ui.ActionBar.t6.r1(0.15f, w06));
                this.Q.f30583n = false;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
