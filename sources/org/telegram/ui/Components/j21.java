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
public final class j21 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public org.telegram.ui.e5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f27199a;
    public final org.telegram.ui.ActionBar.p6 f27200b;
    public fo0 f27201c;
    public final p80 d;
    public final e6 e;
    public final ih.c f27202f;
    public final ImageView h;
    public boolean f27203n;
    public final t5 f27204r;
    public boolean f27205s;
    public int f27206w;
    public long f27207x;
    public boolean f27208y;

    public j21(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f27204r = new t5(this, 360L, gr.h);
        this.f27205s = false;
        this.f27208y = false;
        this.D = false;
        this.I = org.telegram.ui.ActionBar.t6.U8;
        this.L = 0;
        this.f27199a = i10;
        this.f27200b = p6Var;
        setClipChildren(false);
        setClipToPadding(false);
        p80 p80Var = new p80(context, p6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        addView(p80Var, w7.b6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.e6.a(p80Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.b6.e(34, 34, 17));
        e6 e6Var = new e6(false, false, false);
        this.e = e6Var;
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.f16026q.x;
        e6Var.f25695b = 17;
        ih.c cVar = new ih.c(this, context, p6Var);
        this.f27202f = cVar;
        addView(cVar, w7.b6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.e6.a(cVar);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        e6 e6Var = this.e;
        int max = (int) Math.max(org.telegram.messenger.i0.L(16.66f), e6Var.d + org.telegram.messenger.i0.L(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + org.telegram.messenger.i0.L(11.0f);
        if (e6Var.d > 0.0f) {
            i10 = org.telegram.messenger.i0.L(4.66f) + max;
        } else {
            i10 = 0;
        }
        return org.telegram.messenger.i0.L(11.0f) + measuredWidth + i10 + this.L;
    }

    public int getTextColor() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.t6.f21330z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f27200b;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        if (this.f27208y) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.b.f(f7, w02, w03);
    }

    private void setLayout(boolean z10) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f27207x;
        long j12 = tL_forumTopic.f19845id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27207x = j12;
        this.h.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f19845id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            dq dqVar = new dq(2131232143, 0);
            dqVar.H = 0.66f;
            dqVar.I = 0.66f;
            spannableStringBuilder.setSpan(dqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new o5(tL_forumTopic.icon_emoji_id, p80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        p80Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.vp.r1(this.f27199a).q2(j10, this.f27207x, null), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f27205s != z12) {
            this.f27205s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f27207x = 0L;
        this.f27208y = true;
        this.h.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new dq(2131231903, 0), 0, 1, 33);
        p80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f27205s) {
            this.f27205s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f27207x = 0L;
        this.f27208y = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            g21 g21Var = new g21(getContext());
            g21Var.f26240b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f27200b));
            imageView.setImageDrawable(g21Var);
        }
        if (z10) {
            i11 = 2131753064;
        } else {
            i11 = 2131754289;
        }
        String L0 = org.telegram.messenger.cd.L0(i11, null);
        p80 p80Var = this.d;
        p80Var.setText(L0);
        if (!z10) {
            i12 = 0;
        }
        p80Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f27205s) {
            this.f27205s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float d = this.f27204r.d(this.f27203n);
            if (d > 0.0f) {
                if (this.f27201c == null) {
                    this.f27201c = new fo0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f27201c.a(canvas, d);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(int i10, boolean z10, boolean z11) {
        int i11;
        e6 e6Var = this.e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.t6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.U8;
            }
            this.I = i11;
            e6Var.t(org.telegram.messenger.cd.E(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.t6.V8;
            e6Var.t("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new h21(this, 0));
            this.K.addListener(new p11(this, 1));
            org.telegram.messenger.z20.j(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f27202f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f27207x = -1L;
        this.h.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        u80 u80Var = new u80(org.telegram.messenger.i0.L(42.0f), p80Var);
        u80Var.e = 0.95f;
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        p80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f27205s) {
            this.f27205s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
        if (this.f27207x == o10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27207x = o10;
        this.h.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        org.telegram.ui.e5 e5Var = this.E;
        int i10 = this.f27199a;
        if (e5Var == null) {
            org.telegram.ui.e5 e5Var2 = new org.telegram.ui.e5(18.0f, i10, p80Var);
            this.E = e5Var2;
            e5Var2.f36926w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject d22 = org.telegram.messenger.vp.r1(i10).d2(o10);
        if (d22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.e5 e5Var3 = this.E;
            r8 r8Var = e5Var3.f36921c;
            r8Var.p(d22);
            e5Var3.f36920b.i0(d22, r8Var, null);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.o5.l(org.telegram.messenger.d20.f15147s0, o10));
        p80Var.setText(TextUtils.ellipsize(spannableStringBuilder, p80Var.getPaint(), org.telegram.messenger.i0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, org.telegram.messenger.vp.r1(i10).q2(j10, o10, null), z11);
        if (this.f27205s) {
            this.f27205s = false;
        }
    }

    public long getTopicId() {
        return this.f27207x;
    }

    public final void h() {
        int textColor = getTextColor();
        p80 p80Var = this.d;
        p80Var.setTextColor(textColor);
        p80Var.setEmojiColor(textColor);
        this.f27202f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        ImageView imageView = this.h;
        int measuredWidth = (i14 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = org.telegram.messenger.i0.L(11.0f);
        int i16 = i15 / 2;
        p80 p80Var = this.d;
        p80Var.layout(L, i16 - (p80Var.getMeasuredHeight() / 2), p80Var.getMeasuredWidth() + org.telegram.messenger.i0.L(11.0f), (p80Var.getMeasuredHeight() / 2) + i16);
        int i17 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        ih.c cVar = this.f27202f;
        if (i17 > 0) {
            cVar.layout(((i14 - org.telegram.messenger.i0.L(11.0f)) - this.L) - cVar.getMeasuredWidth(), i16 - (cVar.getMeasuredHeight() / 2), (i14 - org.telegram.messenger.i0.L(11.0f)) - this.L, (cVar.getMeasuredHeight() / 2) + i16);
        } else {
            int L2 = org.telegram.messenger.i0.L(11.0f);
            int L3 = org.telegram.messenger.i0.L(4.66f);
            int measuredWidth2 = p80Var.getMeasuredWidth() + org.telegram.messenger.i0.L(11.0f);
            cVar.layout(L3 + p80Var.getMeasuredWidth() + L2, i16 - (cVar.getMeasuredHeight() / 2), cVar.getMeasuredWidth() + org.telegram.messenger.i0.L(4.66f) + measuredWidth2, (cVar.getMeasuredHeight() / 2) + i16);
        }
        if (this.f27206w != 0 && cVar.getLeft() != this.f27206w) {
            cVar.setTranslationX((-cVar.getLeft()) + this.f27206w);
            cVar.animate().translationX(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        this.f27206w = cVar.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f27203n = z10;
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f7;
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new h21(this, 1));
        this.H.addListener(new ha0(8, this, z10));
        this.H.setInterpolator(gr.h);
        this.H.setDuration(320L);
        this.H.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f27202f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof g21)) {
                ((g21) imageView.getDrawable()).f26240b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f27200b));
                imageView.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
