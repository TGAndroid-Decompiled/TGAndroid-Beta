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
public final class g11 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public org.telegram.ui.f5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f33722a;
    public final org.telegram.ui.ActionBar.f6 f33723b;
    public en0 f33724c;
    public final w70 d;
    public final i6 f33725e;
    public final di.b3 f33726f;
    public final ImageView h;
    public boolean f33727n;
    public final w5 f33728r;
    public boolean f33729s;
    public int f33730w;
    public long f33731x;
    public boolean f33732y;

    public g11(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33728r = new w5(this, 360L, xq.h);
        this.f33729s = false;
        this.f33732y = false;
        this.D = false;
        this.I = org.telegram.ui.ActionBar.k6.U8;
        this.L = 0;
        this.f33722a = i7;
        this.f33723b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        w70 w70Var = new w70(context, f6Var);
        this.d = w70Var;
        w70Var.setTextSize(1, 14.0f);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        addView(w70Var, c8.ha.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        c8.ka.a(w70Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, c8.ha.e(34, 34, 17));
        i6 i6Var = new i6(false, false, false);
        this.f33725e = i6Var;
        i6Var.w(org.telegram.messenger.g0.L(11.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.M = org.telegram.messenger.g0.f22537q.x;
        i6Var.f34477b = 17;
        di.b3 b3Var = new di.b3(this, context, f6Var);
        this.f33726f = b3Var;
        addView(b3Var, c8.ha.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        c8.ka.a(b3Var);
        h();
    }

    private int getMeasuringWidth() {
        int i7;
        i6 i6Var = this.f33725e;
        int max = (int) Math.max(org.telegram.messenger.g0.L(16.66f), i6Var.d + org.telegram.messenger.g0.L(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f);
        if (i6Var.d > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.66f) + max;
        } else {
            i7 = 0;
        }
        return org.telegram.messenger.g0.L(11.0f) + measuredWidth + i7 + this.L;
    }

    public int getTextColor() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.k6.f28258z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f33723b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
        if (this.f33732y) {
            f10 = 1.0f;
        } else {
            f10 = this.F;
        }
        return i0.a.f(f10, w02, w03);
    }

    private void setLayout(boolean z9) {
        if (this.D == z9) {
            return;
        }
        this.D = z9;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        boolean z10;
        String str;
        setLayout(false);
        long j10 = this.f33731x;
        long j11 = tL_forumTopic.f27004id;
        if (j10 == j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33731x = j11;
        this.h.setVisibility(8);
        w70 w70Var = this.d;
        w70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f27004id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            wp wpVar = new wp(2131232144, 0);
            wpVar.H = 0.66f;
            wpVar.I = 0.66f;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new r5(tL_forumTopic.icon_emoji_id, w70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        w70Var.setText(spannableStringBuilder);
        setSelected(z9);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.qp.s1(this.f33722a).r2(j3, this.f33731x, null), z10);
        boolean z11 = tL_forumTopic.pinned;
        if (this.f33729s != z11) {
            this.f33729s = z11;
        }
    }

    public final void c() {
        setLayout(false);
        this.f33731x = 0L;
        this.f33732y = true;
        this.h.setVisibility(8);
        w70 w70Var = this.d;
        w70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new wp(2131231904, 0), 0, 1, 33);
        w70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f33729s) {
            this.f33729s = false;
        }
    }

    public final void d(boolean z9, boolean z10, boolean z11) {
        int i7;
        int i10;
        setLayout(z10);
        this.f33731x = 0L;
        this.f33732y = false;
        int i11 = 8;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i7);
        if (z9) {
            c11 c11Var = new c11(getContext());
            c11Var.f32355b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f33723b));
            imageView.setImageDrawable(c11Var);
        }
        if (z9) {
            i10 = 2131753064;
        } else {
            i10 = 2131754289;
        }
        String M0 = org.telegram.messenger.hd.M0(i10, null);
        w70 w70Var = this.d;
        w70Var.setText(M0);
        if (!z9) {
            i11 = 0;
        }
        w70Var.setVisibility(i11);
        setSelected(z11);
        h();
        e(0, true, false);
        if (this.f33729s) {
            this.f33729s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float d = this.f33728r.d(this.f33727n);
            if (d > 0.0f) {
                if (this.f33724c == null) {
                    this.f33724c = new en0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f33724c.a(canvas, d);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i7, boolean z9, boolean z10) {
        int i10;
        i6 i6Var = this.f33725e;
        if (i7 > 0) {
            if (z9) {
                i10 = org.telegram.ui.ActionBar.k6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.U8;
            }
            this.I = i10;
            i6Var.t(org.telegram.messenger.hd.E(i7, ','), z10, true);
        } else {
            this.I = org.telegram.ui.ActionBar.k6.V8;
            i6Var.t("", z10, true);
        }
        if (z10 && this.J < i7) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new d11(this, 0));
            this.K.addListener(new e11(this, 0));
            org.telegram.messenger.camera.q.i(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i7;
        this.f33726f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f33731x = -1L;
        this.h.setVisibility(8);
        w70 w70Var = this.d;
        w70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        b80 b80Var = new b80(org.telegram.messenger.g0.L(42.0f), w70Var);
        b80Var.f32072e = 0.95f;
        spannableStringBuilder.setSpan(b80Var, 0, 1, 33);
        w70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f33729s) {
            this.f33729s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        boolean z10;
        setLayout(true);
        long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        if (this.f33731x == o4) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33731x = o4;
        this.h.setVisibility(8);
        w70 w70Var = this.d;
        w70Var.setVisibility(0);
        org.telegram.ui.f5 f5Var = this.E;
        int i7 = this.f33722a;
        if (f5Var == null) {
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(18.0f, i7, w70Var);
            this.E = f5Var2;
            f5Var2.f45489w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject e22 = org.telegram.messenger.qp.s1(i7).e2(o4);
        if (e22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.f5 f5Var3 = this.E;
            w8 w8Var = f5Var3.f45483c;
            w8Var.p(e22);
            f5Var3.f45482b.i0(e22, w8Var, null);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.m5.l(org.telegram.messenger.p10.f24459s0, o4));
        w70Var.setText(TextUtils.ellipsize(spannableStringBuilder, w70Var.getPaint(), org.telegram.messenger.g0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z9);
        e(tL_forumTopic.unread_count, org.telegram.messenger.qp.s1(i7).r2(j3, o4, null), z10);
        if (this.f33729s) {
            this.f33729s = false;
        }
    }

    public long getTopicId() {
        return this.f33731x;
    }

    public final void h() {
        int textColor = getTextColor();
        w70 w70Var = this.d;
        w70Var.setTextColor(textColor);
        w70Var.setEmojiColor(textColor);
        this.f33726f.invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        ImageView imageView = this.h;
        int measuredWidth = (i13 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i15 = i14 / 2;
        w70 w70Var = this.d;
        w70Var.layout(L, i15 - (w70Var.getMeasuredHeight() / 2), w70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (w70Var.getMeasuredHeight() / 2) + i15);
        int i16 = (this.f33725e.d > 0.0f ? 1 : (this.f33725e.d == 0.0f ? 0 : -1));
        di.b3 b3Var = this.f33726f;
        if (i16 > 0) {
            b3Var.layout(((i13 - org.telegram.messenger.g0.L(11.0f)) - this.L) - b3Var.getMeasuredWidth(), i15 - (b3Var.getMeasuredHeight() / 2), (i13 - org.telegram.messenger.g0.L(11.0f)) - this.L, (b3Var.getMeasuredHeight() / 2) + i15);
        } else {
            int L2 = org.telegram.messenger.g0.L(11.0f);
            int L3 = org.telegram.messenger.g0.L(4.66f);
            int measuredWidth2 = w70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f);
            b3Var.layout(L3 + w70Var.getMeasuredWidth() + L2, i15 - (b3Var.getMeasuredHeight() / 2), b3Var.getMeasuredWidth() + org.telegram.messenger.g0.L(4.66f) + measuredWidth2, (b3Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.f33730w != 0 && b3Var.getLeft() != this.f33730w) {
            b3Var.setTranslationX((-b3Var.getLeft()) + this.f33730w);
            b3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
        this.f33730w = b3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.d.measure(i7, i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setReorder(boolean z9) {
        this.f33727n = z9;
        invalidate();
    }

    @Override
    public void setSelected(boolean z9) {
        float f10;
        if (this.G == z9) {
            return;
        }
        this.G = z9;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.F;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new d11(this, 1));
        this.H.addListener(new t9(22, this, z9));
        this.H.setInterpolator(xq.h);
        this.H.setDuration(320L);
        this.H.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f33726f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof c11)) {
                ((c11) imageView.getDrawable()).f32355b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f33723b));
                imageView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
