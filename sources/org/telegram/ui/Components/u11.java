package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u11 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public org.telegram.ui.f5 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int f40168a;
    public final org.telegram.ui.ActionBar.i6 f40169b;
    public rn0 f40170c;
    public final k80 d;
    public final m6 f40171e;
    public final fi.u2 f40172f;
    public final ImageView h;
    public boolean f40173n;
    public final c6 f40174r;
    public boolean f40175s;
    public int f40176w;
    public long f40177x;
    public boolean f40178y;

    public u11(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f40174r = new c6(this, 360L, lr.h);
        this.f40175s = false;
        this.f40178y = false;
        this.E = false;
        this.J = org.telegram.ui.ActionBar.n6.U8;
        this.M = 0;
        this.f40168a = i7;
        this.f40169b = i6Var;
        setClipChildren(false);
        setClipToPadding(false);
        k80 k80Var = new k80(context, i6Var);
        this.d = k80Var;
        k80Var.setTextSize(1, 14.0f);
        k80Var.setTypeface(org.telegram.messenger.g0.o());
        addView(k80Var, c8.ma.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        c8.ra.a(k80Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, c8.ma.e(34, 34, 17));
        m6 m6Var = new m6(false, false, false);
        this.f40171e = m6Var;
        m6Var.w(org.telegram.messenger.g0.L(11.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.N = org.telegram.messenger.g0.f24118q.x;
        m6Var.f37377b = 17;
        fi.u2 u2Var = new fi.u2(this, context, i6Var);
        this.f40172f = u2Var;
        addView(u2Var, c8.ma.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        c8.ra.a(u2Var);
        h();
    }

    private int getMeasuringWidth() {
        int i7;
        m6 m6Var = this.f40171e;
        int max = (int) Math.max(org.telegram.messenger.g0.L(16.66f), m6Var.d + org.telegram.messenger.g0.L(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f);
        if (m6Var.d > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.66f) + max;
        } else {
            i7 = 0;
        }
        return org.telegram.messenger.g0.L(11.0f) + measuredWidth + i7 + this.M;
    }

    public int getTextColor() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.n6.f29805z6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f40169b;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
        if (this.f40178y) {
            f10 = 1.0f;
        } else {
            f10 = this.G;
        }
        return i0.a.f(f10, w02, w03);
    }

    private void setLayout(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f40177x;
        long j11 = tL_forumTopic.f28455id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40177x = j11;
        this.h.setVisibility(8);
        k80 k80Var = this.d;
        k80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f28455id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            lq lqVar = new lq(2131232146, 0);
            lqVar.I = 0.66f;
            lqVar.J = 0.66f;
            spannableStringBuilder.setSpan(lqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new x5(tL_forumTopic.icon_emoji_id, k80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        k80Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.mp.u1(this.f40168a).u2(j3, this.f40177x, null), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f40175s != z12) {
            this.f40175s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f40177x = 0L;
        this.f40178y = true;
        this.h.setVisibility(8);
        k80 k80Var = this.d;
        k80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new lq(2131231905, 0), 0, 1, 33);
        k80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f40175s) {
            this.f40175s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i7;
        int i10;
        setLayout(z11);
        this.f40177x = 0L;
        this.f40178y = false;
        int i11 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i7);
        if (z10) {
            q11 q11Var = new q11(getContext());
            q11Var.f38682b.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f40169b));
            imageView.setImageDrawable(q11Var);
        }
        if (z10) {
            i10 = 2131753062;
        } else {
            i10 = 2131754287;
        }
        String M0 = org.telegram.messenger.gd.M0(i10, null);
        k80 k80Var = this.d;
        k80Var.setText(M0);
        if (!z10) {
            i11 = 0;
        }
        k80Var.setVisibility(i11);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f40175s) {
            this.f40175s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float d = this.f40174r.d(this.f40173n);
            if (d > 0.0f) {
                if (this.f40170c == null) {
                    this.f40170c = new rn0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f40170c.a(canvas, d);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i7, boolean z10, boolean z11) {
        int i10;
        m6 m6Var = this.f40171e;
        if (i7 > 0) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.n6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.U8;
            }
            this.J = i10;
            m6Var.t(org.telegram.messenger.gd.E(i7, ','), z11, true);
        } else {
            this.J = org.telegram.ui.ActionBar.n6.V8;
            m6Var.t("", z11, true);
        }
        if (z11 && this.K < i7) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new r11(this, 0));
            this.L.addListener(new s11(this, 0));
            org.telegram.ui.Cells.c0.q(2.0f, this.L);
            this.L.setDuration(200L);
            this.L.start();
        }
        this.K = i7;
        this.f40172f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f40177x = -1L;
        this.h.setVisibility(8);
        k80 k80Var = this.d;
        k80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        p80 p80Var = new p80(org.telegram.messenger.g0.L(42.0f), k80Var);
        p80Var.f38318e = 0.95f;
        spannableStringBuilder.setSpan(p80Var, 0, 1, 33);
        k80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f40175s) {
            this.f40175s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        if (this.f40177x == o4) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40177x = o4;
        this.h.setVisibility(8);
        k80 k80Var = this.d;
        k80Var.setVisibility(0);
        org.telegram.ui.f5 f5Var = this.F;
        int i7 = this.f40168a;
        if (f5Var == null) {
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(18.0f, i7, k80Var);
            this.F = f5Var2;
            f5Var2.f47520w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject g22 = org.telegram.messenger.mp.u1(i7).g2(o4);
        if (g22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.f5 f5Var3 = this.F;
            b9 b9Var = f5Var3.f47514c;
            b9Var.p(g22);
            f5Var3.f47513b.i0(g22, b9Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.n5.l(org.telegram.messenger.j10.f24770t0, o4));
        k80Var.setText(TextUtils.ellipsize(spannableStringBuilder, k80Var.getPaint(), org.telegram.messenger.g0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, org.telegram.messenger.mp.u1(i7).u2(j3, o4, null), z11);
        if (this.f40175s) {
            this.f40175s = false;
        }
    }

    public long getTopicId() {
        return this.f40177x;
    }

    public final void h() {
        int textColor = getTextColor();
        k80 k80Var = this.d;
        k80Var.setTextColor(textColor);
        k80Var.setEmojiColor(textColor);
        this.f40172f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        ImageView imageView = this.h;
        int measuredWidth = (i13 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i15 = i14 / 2;
        k80 k80Var = this.d;
        k80Var.layout(L, i15 - (k80Var.getMeasuredHeight() / 2), k80Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (k80Var.getMeasuredHeight() / 2) + i15);
        int i16 = (this.f40171e.d > 0.0f ? 1 : (this.f40171e.d == 0.0f ? 0 : -1));
        fi.u2 u2Var = this.f40172f;
        if (i16 > 0) {
            u2Var.layout(((i13 - org.telegram.messenger.g0.L(11.0f)) - this.M) - u2Var.getMeasuredWidth(), i15 - (u2Var.getMeasuredHeight() / 2), (i13 - org.telegram.messenger.g0.L(11.0f)) - this.M, (u2Var.getMeasuredHeight() / 2) + i15);
        } else {
            int L2 = org.telegram.messenger.g0.L(11.0f);
            int L3 = org.telegram.messenger.g0.L(4.66f);
            int measuredWidth2 = k80Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f);
            u2Var.layout(L3 + k80Var.getMeasuredWidth() + L2, i15 - (u2Var.getMeasuredHeight() / 2), u2Var.getMeasuredWidth() + org.telegram.messenger.g0.L(4.66f) + measuredWidth2, (u2Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.f40176w != 0 && u2Var.getLeft() != this.f40176w) {
            u2Var.setTranslationX((-u2Var.getLeft()) + this.f40176w);
            u2Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(lr.h).start();
        }
        this.f40176w = u2Var.getLeft();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.d.measure(i7, i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f40173n = z10;
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f10;
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.G;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new r11(this, 1));
        this.I.addListener(new org.telegram.ui.on(23, this, z10));
        this.I.setInterpolator(lr.h);
        this.I.setDuration(320L);
        this.I.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f40172f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof q11)) {
                ((q11) imageView.getDrawable()).f38682b.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f40169b));
                imageView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
