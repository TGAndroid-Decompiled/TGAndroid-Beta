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
public final class f11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
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
    public w70 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int f33650a;
    public ValueAnimator f33651a0;
    public final org.telegram.ui.ActionBar.e6 f33652b;
    public hn0 f33653c;
    public final gi.y4 d;
    public final FrameLayout.LayoutParams f33654e;
    public final g6 f33655f;
    public final ci.l1 h;
    public final k9 f33656n;
    public y01 f33657r;
    public final u8 f33658s;
    public final TextView f33659w;
    public final ImageView f33660x;
    public boolean f33661y;

    public f11(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = org.telegram.ui.ActionBar.k6.U8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.f33650a = i3;
        this.f33652b = e6Var;
        gi.y4 y4Var = new gi.y4(this, context);
        this.d = y4Var;
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        addView(y4Var, b8.mf.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        b8.pf.a(y4Var);
        g6 g6Var = new g6(false, false, false);
        this.f33655f = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, e6Var));
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
        g6Var.f33983b = 17;
        ci.l1 l1Var = new ci.l1(this, context, e6Var);
        this.h = l1Var;
        l1Var.setWillNotDraw(false);
        l1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        y4Var.addView(l1Var, b8.mf.r(-1, -2, 17));
        k9 k9Var = new k9(context);
        this.f33656n = k9Var;
        FrameLayout.LayoutParams e10 = b8.mf.e(34, 34, 17);
        this.f33654e = e10;
        l1Var.addView(k9Var, e10);
        this.f33658s = new u8((org.telegram.ui.ActionBar.e6) null);
        TextView textView = new TextView(context);
        this.f33659w = textView;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        textView.setTextColor(i0.a.f(this.V, w02, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        y4Var.addView(textView, b8.mf.t(-1, -2, 17, 4, 0, 4, 0));
        y4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.f33660x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(2.33f), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N, null, e6Var);
        addView(imageView, b8.mf.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
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
        this.f33656n.setRoundRadius(org.telegram.messenger.g0.L(f10));
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
        FrameLayout.LayoutParams layoutParams = this.f33654e;
        layoutParams.width = L;
        if (z10) {
            L2 = org.telegram.messenger.g0.L(28.0f);
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        layoutParams.height = L2;
    }

    public final void a(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        setLayout(false);
        long j11 = this.O;
        long j12 = tL_forumTopic.f27053id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Q = false;
        this.O = j12;
        this.P = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f33659w;
        textView.setText(str);
        textView.setVisibility(0);
        int i3 = tL_forumTopic.f27053id;
        k9 k9Var = this.f33656n;
        if (i3 == 1) {
            this.Q = true;
            k9Var.b();
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageResource(2131232144);
            k9Var.setScaleX(0.66f);
            k9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            k9Var.b();
            k9Var.setAnimatedEmojiDrawable(g5.m(org.telegram.messenger.h10.f22829t0, tL_forumTopic.icon_emoji_id, null, 3));
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        } else {
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageDrawable(rg.c.e(tL_forumTopic));
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean r22 = org.telegram.messenger.hp.s1(this.f33650a).r2(j10, tL_forumTopic.f27053id, null);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.Q = true;
        this.P = true;
        String M0 = org.telegram.messenger.bd.M0(2131748259, null);
        TextView textView = this.f33659w;
        textView.setText(M0);
        textView.setVisibility(0);
        k9 k9Var = this.f33656n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        k9Var.setImageResource(2131231067);
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i3;
        int i10;
        setLayout(z11);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        if (z10) {
            i3 = 2131753064;
        } else {
            i3 = 2131754288;
        }
        String M0 = org.telegram.messenger.bd.M0(i3, null);
        TextView textView = this.f33659w;
        textView.setText(M0);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        k9 k9Var = this.f33656n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            y01 y01Var = new y01(getContext());
            y01Var.f40564b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f33652b));
            k9Var.setImageDrawable(y01Var);
            this.f33657r = y01Var;
        } else {
            k9Var.setImageResource(2131232472);
            this.f33657r = null;
        }
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void d(int i3, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i10;
        int i11;
        g6 g6Var = this.f33655f;
        if (z12) {
            this.G = org.telegram.ui.ActionBar.k6.Z5;
            if (this.I == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                wp wpVar = new wp(2131231963, 0);
                wpVar.I = 0.8f;
                wpVar.J = 0.8f;
                wpVar.H = 0.5f;
                wpVar.f40045r = -org.telegram.messenger.g0.L(3.0f);
                wpVar.f40046s = 0.0f;
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            g6Var.t(this.I, z13, true);
        } else if (z11) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.k6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.U8;
            }
            this.G = i11;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                wp wpVar2 = new wp(2131231964, 0);
                wpVar2.I = 0.8f;
                wpVar2.J = 0.8f;
                wpVar2.H = 0.5f;
                wpVar2.f40045r = -org.telegram.messenger.g0.L(3.0f);
                wpVar2.f40046s = 0.0f;
                spannableStringBuilder2.setSpan(wpVar2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            g6Var.t(this.H, z13, true);
        } else if (i3 > 0) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.k6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.U8;
            }
            this.G = i10;
            g6Var.t(org.telegram.messenger.bd.E(i3, ','), z13, true);
        } else {
            this.G = org.telegram.ui.ActionBar.k6.V8;
            g6Var.t("", z13, true);
        }
        if (z13 && (this.J < i3 || ((!this.K && z11) || (!this.L && z12)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new d11(this, 1));
            this.N.addListener(new j01(this, 2));
            org.telegram.messenger.camera.q.i(2.0f, this.N);
            this.N.setDuration(200L);
            this.N.start();
        }
        this.J = i3;
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
        TextView textView = this.f33659w;
        x70 x70Var = new x70(L, textView);
        x70Var.f40262e = 0.75f;
        spannableStringBuilder.setSpan(x70Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        k9 k9Var = this.f33656n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        if (this.R == null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f33652b;
            w70 w70Var = new w70(e6Var);
            this.R = w70Var;
            w70Var.k(38.0f);
            this.R.setCallback(k9Var);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
            this.R.g(org.telegram.ui.ActionBar.k6.r1(0.15f, w02), org.telegram.ui.ActionBar.k6.r1(0.5f, w02), org.telegram.ui.ActionBar.k6.r1(0.6f, w02), org.telegram.ui.ActionBar.k6.r1(0.15f, w02));
            this.R.f39935n = false;
        }
        k9Var.setImageDrawable(this.R);
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
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
        long o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        if (o10 == this.O) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = o10;
        String l10 = org.telegram.messenger.m5.l(org.telegram.messenger.h10.f22829t0, o10);
        TextView textView = this.f33659w;
        textView.setText(l10);
        textView.setVisibility(0);
        int i3 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
        int i10 = this.f33650a;
        k9 k9Var = this.f33656n;
        u8 u8Var = this.f33658s;
        if (i3 >= 0) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(o10));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-o10));
            u8Var.q(M0);
            k9Var.e(M0, u8Var);
        }
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
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
        int i3 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33652b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
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
        k9 k9Var = this.f33656n;
        if (!z10) {
            k9Var.setColorFilter(null);
        } else {
            k9Var.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        k9Var.invalidate();
    }

    public final void h() {
        int i3;
        float f10 = 1.0f;
        float f11 = (1.0f - this.V) * (-org.telegram.messenger.g0.L(3.0f));
        ImageView imageView = this.f33660x;
        imageView.setTranslationX(f11);
        if (this.V <= 0.0f) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        int i10 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33652b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
        if (!this.P) {
            f10 = this.V;
        }
        this.f33659w.setTextColor(i0.a.f(f10, w02, w03));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), i10);
    }

    public void setReorder(boolean z10) {
        this.f33661y = z10;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f10;
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        ValueAnimator valueAnimator = this.f33651a0;
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
        this.f33651a0 = ofFloat;
        ofFloat.addUpdateListener(new d11(this, 0));
        this.f33651a0.addListener(new s9(23, this, z10));
        this.f33651a0.setInterpolator(xq.h);
        this.f33651a0.setDuration(320L);
        this.f33651a0.start();
    }

    @Override
    public final void updateColors() {
        float f10;
        try {
            TextView textView = this.f33659w;
            float f11 = 1.0f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f33652b;
            if (textView != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
                if (this.P) {
                    f10 = 1.0f;
                } else {
                    f10 = this.V;
                }
                textView.setTextColor(i0.a.f(f10, w02, w03));
            }
            k9 k9Var = this.f33656n;
            if (k9Var != null) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
                int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
                if (!this.P) {
                    f11 = this.V;
                }
                int f12 = i0.a.f(f11, w04, w05);
                if (!this.S || f12 != this.U || this.Q != this.T) {
                    g();
                }
            }
            y01 y01Var = this.f33657r;
            if (y01Var != null) {
                y01Var.f40564b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
                if (k9Var != null) {
                    k9Var.invalidate();
                }
            }
            if (this.R != null) {
                int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
                this.R.g(org.telegram.ui.ActionBar.k6.r1(0.15f, w06), org.telegram.ui.ActionBar.k6.r1(0.5f, w06), org.telegram.ui.ActionBar.k6.r1(0.6f, w06), org.telegram.ui.ActionBar.k6.r1(0.15f, w06));
                this.R.f39935n = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
