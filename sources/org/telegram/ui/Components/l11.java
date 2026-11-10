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
public final class l11 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
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
    public a80 Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public ValueAnimator W;
    public final int f35486a;
    public final org.telegram.ui.ActionBar.h6 f35487b;
    public en0 f35488c;
    public final fi.a5 d;
    public final FrameLayout.LayoutParams f35489e;
    public final h6 f35490f;
    public final bi.s1 h;
    public final k9 f35491n;
    public d11 f35492r;
    public final v8 f35493s;
    public final TextView f35494w;
    public final ImageView f35495x;
    public boolean f35496y;

    public l11(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.D = false;
        this.E = false;
        this.F = org.telegram.ui.ActionBar.m6.U8;
        this.L = 1.0f;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.f35486a = i7;
        this.f35487b = h6Var;
        fi.a5 a5Var = new fi.a5(this, context);
        this.d = a5Var;
        a5Var.setWillNotDraw(false);
        a5Var.setOrientation(1);
        addView(a5Var, c8.ha.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        c8.ka.a(a5Var);
        h6 h6Var2 = new h6(false, false, false);
        this.f35490f = h6Var2;
        h6Var2.w(org.telegram.messenger.g0.L(11.0f));
        h6Var2.x(org.telegram.messenger.g0.o());
        h6Var2.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W8, h6Var));
        h6Var2.M = org.telegram.messenger.g0.f22567q.x;
        h6Var2.f34187b = 17;
        bi.s1 s1Var = new bi.s1(this, context, h6Var);
        this.h = s1Var;
        s1Var.setWillNotDraw(false);
        s1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        a5Var.addView(s1Var, c8.ha.r(-1, -2, 17));
        k9 k9Var = new k9(context);
        this.f35491n = k9Var;
        FrameLayout.LayoutParams e10 = c8.ha.e(34, 34, 17);
        this.f35489e = e10;
        s1Var.addView(k9Var, e10);
        this.f35493s = new v8((org.telegram.ui.ActionBar.h6) null);
        TextView textView = new TextView(context);
        this.f35494w = textView;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        textView.setTextColor(i0.a.f(this.U, w02, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        a5Var.addView(textView, c8.ha.t(-1, -2, 17, 4, 0, 4, 0));
        a5Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.f35495x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(2.33f), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(imageView, d02, M, null, h6Var);
        addView(imageView, c8.ha.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z9) {
        float f10;
        float f11;
        int L;
        int L2;
        if (this.D == z9) {
            return;
        }
        this.D = z9;
        if (z9) {
            f10 = 36.0f;
        } else {
            f10 = 3.0f;
        }
        this.f35491n.setRoundRadius(org.telegram.messenger.g0.L(f10));
        if (z9) {
            f11 = 7.0f;
        } else {
            f11 = 4.0f;
        }
        this.h.setPadding(0, org.telegram.messenger.g0.L(f11), 0, 0);
        if (z9) {
            L = org.telegram.messenger.g0.L(28.0f);
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        FrameLayout.LayoutParams layoutParams = this.f35489e;
        layoutParams.width = L;
        if (z9) {
            L2 = org.telegram.messenger.g0.L(28.0f);
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        layoutParams.height = L2;
    }

    public final void a(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        setLayout(false);
        long j10 = this.N;
        long j11 = tL_forumTopic.f27012id;
        if (j10 == j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.P = false;
        this.N = j11;
        this.O = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f35494w;
        textView.setText(str);
        textView.setVisibility(0);
        int i7 = tL_forumTopic.f27012id;
        k9 k9Var = this.f35491n;
        if (i7 == 1) {
            this.P = true;
            k9Var.b();
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageResource(2131232144);
            k9Var.setScaleX(0.66f);
            k9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            k9Var.b();
            k9Var.setAnimatedEmojiDrawable(h5.m(org.telegram.messenger.p10.f24474s0, tL_forumTopic.icon_emoji_id, null, 3));
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        } else {
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageDrawable(qg.d.e(tL_forumTopic));
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        }
        setSelected(z9);
        g();
        boolean r22 = org.telegram.messenger.qp.s1(this.f35486a).r2(j3, tL_forumTopic.f27012id, null);
        int i10 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_mentions_count > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i10, r22, z11, z12, z10);
        boolean z13 = tL_forumTopic.pinned;
        if (this.E != z13) {
            this.E = z13;
        }
        h();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
    }

    public final void b(boolean z9, boolean z10) {
        setLayout(z9);
        this.P = true;
        this.O = true;
        String M0 = org.telegram.messenger.id.M0(2131748251, null);
        TextView textView = this.f35494w;
        textView.setText(M0);
        textView.setVisibility(0);
        k9 k9Var = this.f35491n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        k9Var.setImageResource(2131231067);
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(z10);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void c(boolean z9, boolean z10, boolean z11) {
        int i7;
        int i10;
        setLayout(z10);
        this.N = -1L;
        this.P = true;
        this.O = false;
        if (z9) {
            i7 = 2131753064;
        } else {
            i7 = 2131754288;
        }
        String M0 = org.telegram.messenger.id.M0(i7, null);
        TextView textView = this.f35494w;
        textView.setText(M0);
        if (z9) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        k9 k9Var = this.f35491n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        if (z9) {
            d11 d11Var = new d11(getContext());
            d11Var.f32853b.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.f35487b));
            k9Var.setImageDrawable(d11Var);
            this.f35492r = d11Var;
        } else {
            k9Var.setImageResource(2131232472);
            this.f35492r = null;
        }
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void d(int i7, boolean z9, boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        h6 h6Var = this.f35490f;
        if (z11) {
            this.F = org.telegram.ui.ActionBar.m6.Z5;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                wp wpVar = new wp(2131231963, 0);
                wpVar.H = 0.8f;
                wpVar.I = 0.8f;
                wpVar.G = 0.5f;
                wpVar.f40038r = -org.telegram.messenger.g0.L(3.0f);
                wpVar.f40039s = 0.0f;
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
                this.H = spannableStringBuilder;
            }
            h6Var.t(this.H, z12, true);
        } else if (z10) {
            if (z9) {
                i11 = org.telegram.ui.ActionBar.m6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.m6.U8;
            }
            this.F = i11;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                wp wpVar2 = new wp(2131231964, 0);
                wpVar2.H = 0.8f;
                wpVar2.I = 0.8f;
                wpVar2.G = 0.5f;
                wpVar2.f40038r = -org.telegram.messenger.g0.L(3.0f);
                wpVar2.f40039s = 0.0f;
                spannableStringBuilder2.setSpan(wpVar2, 0, 1, 33);
                this.G = spannableStringBuilder2;
            }
            h6Var.t(this.G, z12, true);
        } else if (i7 > 0) {
            if (z9) {
                i10 = org.telegram.ui.ActionBar.m6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.U8;
            }
            this.F = i10;
            h6Var.t(org.telegram.messenger.id.E(i7, ','), z12, true);
        } else {
            this.F = org.telegram.ui.ActionBar.m6.V8;
            h6Var.t("", z12, true);
        }
        if (z12 && (this.I < i7 || ((!this.J && z10) || (!this.K && z11)))) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new j11(this, 1));
            this.M.addListener(new f11(this, 1));
            org.telegram.messenger.camera.q.i(2.0f, this.M);
            this.M.setDuration(200L);
            this.M.start();
        }
        this.I = i7;
        this.J = z10;
        this.K = z11;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.N = -1L;
        this.P = true;
        this.O = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int L = org.telegram.messenger.g0.L(38.0f);
        TextView textView = this.f35494w;
        b80 b80Var = new b80(L, textView);
        b80Var.f32162e = 0.75f;
        spannableStringBuilder.setSpan(b80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        k9 k9Var = this.f35491n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        if (this.Q == null) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f35487b;
            a80 a80Var = new a80(h6Var);
            this.Q = a80Var;
            a80Var.k(38.0f);
            this.Q.setCallback(k9Var);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
            this.Q.g(org.telegram.ui.ActionBar.m6.r1(0.15f, w02), org.telegram.ui.ActionBar.m6.r1(0.5f, w02), org.telegram.ui.ActionBar.m6.r1(0.6f, w02), org.telegram.ui.ActionBar.m6.r1(0.15f, w02));
            this.Q.f31783n = false;
        }
        k9Var.setImageDrawable(this.Q);
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        boolean z10;
        boolean z11;
        setLayout(true);
        this.O = false;
        this.P = false;
        long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        if (o4 == this.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.N = o4;
        String l10 = org.telegram.messenger.m5.l(org.telegram.messenger.p10.f24474s0, o4);
        TextView textView = this.f35494w;
        textView.setText(l10);
        textView.setVisibility(0);
        int i7 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        int i10 = this.f35486a;
        k9 k9Var = this.f35491n;
        v8 v8Var = this.f35493s;
        if (i7 >= 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(o4));
            v8Var.r(a22);
            k9Var.e(a22, v8Var);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-o4));
            v8Var.q(M0);
            k9Var.e(M0, v8Var);
        }
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        h();
        setSelected(z9);
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d(i11, false, false, z11, z10);
        if (this.E) {
            this.E = false;
        }
    }

    public final void g() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.m6.f28300z6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f35487b;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var);
        if (this.O) {
            f10 = 1.0f;
        } else {
            f10 = this.U;
        }
        int f11 = i0.a.f(f10, w02, w03);
        this.R = true;
        this.T = f11;
        boolean z9 = this.P;
        this.S = z9;
        k9 k9Var = this.f35491n;
        if (!z9) {
            k9Var.setColorFilter(null);
        } else {
            k9Var.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        k9Var.invalidate();
    }

    public final void h() {
        int i7;
        float f10 = 1.0f;
        float f11 = (1.0f - this.U) * (-org.telegram.messenger.g0.L(3.0f));
        ImageView imageView = this.f35495x;
        imageView.setTranslationX(f11);
        if (this.U <= 0.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        int i10 = org.telegram.ui.ActionBar.m6.f28300z6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f35487b;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var);
        if (!this.O) {
            f10 = this.U;
        }
        this.f35494w.setTextColor(i0.a.f(f10, w02, w03));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), i10);
    }

    public void setReorder(boolean z9) {
        this.f35496y = z9;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z9) {
        float f10;
        if (this.V == z9) {
            return;
        }
        this.V = z9;
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.U;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new j11(this, 0));
        this.W.addListener(new s9(23, this, z9));
        this.W.setInterpolator(wq.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    @Override
    public final void updateColors() {
        float f10;
        try {
            TextView textView = this.f35494w;
            float f11 = 1.0f;
            org.telegram.ui.ActionBar.h6 h6Var = this.f35487b;
            if (textView != null) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var);
                if (this.O) {
                    f10 = 1.0f;
                } else {
                    f10 = this.U;
                }
                textView.setTextColor(i0.a.f(f10, w02, w03));
            }
            k9 k9Var = this.f35491n;
            if (k9Var != null) {
                int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
                int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var);
                if (!this.O) {
                    f11 = this.U;
                }
                int f12 = i0.a.f(f11, w04, w05);
                if (!this.R || f12 != this.T || this.P != this.S) {
                    g();
                }
            }
            d11 d11Var = this.f35492r;
            if (d11Var != null) {
                d11Var.f32853b.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var));
                if (k9Var != null) {
                    k9Var.invalidate();
                }
            }
            if (this.Q != null) {
                int w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
                this.Q.g(org.telegram.ui.ActionBar.m6.r1(0.15f, w06), org.telegram.ui.ActionBar.m6.r1(0.5f, w06), org.telegram.ui.ActionBar.m6.r1(0.6f, w06), org.telegram.ui.ActionBar.m6.r1(0.15f, w06));
                this.Q.f31783n = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
