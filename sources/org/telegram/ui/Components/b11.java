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
public final class b11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public org.telegram.ui.h5 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int f32047a;
    public final org.telegram.ui.ActionBar.e6 f32048b;
    public hn0 f32049c;
    public final s70 d;
    public final g6 f32050e;
    public final ei.e3 f32051f;
    public final ImageView h;
    public boolean f32052n;
    public final u5 f32053r;
    public boolean f32054s;
    public int f32055w;
    public long f32056x;
    public boolean f32057y;

    public b11(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32053r = new u5(this, 360L, xq.h);
        this.f32054s = false;
        this.f32057y = false;
        this.E = false;
        this.J = org.telegram.ui.ActionBar.k6.U8;
        this.M = 0;
        this.f32047a = i3;
        this.f32048b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        s70 s70Var = new s70(context, e6Var);
        this.d = s70Var;
        s70Var.setTextSize(1, 14.0f);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        addView(s70Var, b8.mf.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        b8.pf.a(s70Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, b8.mf.e(34, 34, 17));
        g6 g6Var = new g6(false, false, false);
        this.f32050e = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
        g6Var.f33983b = 17;
        ei.e3 e3Var = new ei.e3(this, context, e6Var);
        this.f32051f = e3Var;
        addView(e3Var, b8.mf.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        b8.pf.a(e3Var);
        h();
    }

    private int getMeasuringWidth() {
        int i3;
        g6 g6Var = this.f32050e;
        int max = (int) Math.max(org.telegram.messenger.g0.L(16.66f), g6Var.d + org.telegram.messenger.g0.L(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f);
        if (g6Var.d > 0.0f) {
            i3 = org.telegram.messenger.g0.L(4.66f) + max;
        } else {
            i3 = 0;
        }
        return org.telegram.messenger.g0.L(11.0f) + measuredWidth + i3 + this.M;
    }

    public int getTextColor() {
        float f10;
        int i3 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32048b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
        if (this.f32057y) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f32056x;
        long j12 = tL_forumTopic.f27053id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32056x = j12;
        this.h.setVisibility(8);
        s70 s70Var = this.d;
        s70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f27053id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            wp wpVar = new wp(2131232144, 0);
            wpVar.I = 0.66f;
            wpVar.J = 0.66f;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new p5(tL_forumTopic.icon_emoji_id, s70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        s70Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.hp.s1(this.f32047a).r2(j10, this.f32056x, null), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f32054s != z12) {
            this.f32054s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f32056x = 0L;
        this.f32057y = true;
        this.h.setVisibility(8);
        s70 s70Var = this.d;
        s70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new wp(2131231904, 0), 0, 1, 33);
        s70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f32054s) {
            this.f32054s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i3;
        int i10;
        setLayout(z11);
        this.f32056x = 0L;
        this.f32057y = false;
        int i11 = 8;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i3);
        if (z10) {
            y01 y01Var = new y01(getContext());
            y01Var.f40564b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f32048b));
            imageView.setImageDrawable(y01Var);
        }
        if (z10) {
            i10 = 2131753064;
        } else {
            i10 = 2131754289;
        }
        String M0 = org.telegram.messenger.bd.M0(i10, null);
        s70 s70Var = this.d;
        s70Var.setText(M0);
        if (!z10) {
            i11 = 0;
        }
        s70Var.setVisibility(i11);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f32054s) {
            this.f32054s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float d = this.f32053r.d(this.f32052n);
            if (d > 0.0f) {
                if (this.f32049c == null) {
                    this.f32049c = new hn0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f32049c.a(canvas, d);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(int i3, boolean z10, boolean z11) {
        int i10;
        g6 g6Var = this.f32050e;
        if (i3 > 0) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.k6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.U8;
            }
            this.J = i10;
            g6Var.t(org.telegram.messenger.bd.E(i3, ','), z11, true);
        } else {
            this.J = org.telegram.ui.ActionBar.k6.V8;
            g6Var.t("", z11, true);
        }
        if (z11 && this.K < i3) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new z01(this, 0));
            this.L.addListener(new j01(this, 1));
            org.telegram.messenger.camera.q.i(2.0f, this.L);
            this.L.setDuration(200L);
            this.L.start();
        }
        this.K = i3;
        this.f32051f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f32056x = -1L;
        this.h.setVisibility(8);
        s70 s70Var = this.d;
        s70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        x70 x70Var = new x70(org.telegram.messenger.g0.L(42.0f), s70Var);
        x70Var.f40262e = 0.95f;
        spannableStringBuilder.setSpan(x70Var, 0, 1, 33);
        s70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f32054s) {
            this.f32054s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        if (this.f32056x == o10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32056x = o10;
        this.h.setVisibility(8);
        s70 s70Var = this.d;
        s70Var.setVisibility(0);
        org.telegram.ui.h5 h5Var = this.F;
        int i3 = this.f32047a;
        if (h5Var == null) {
            org.telegram.ui.h5 h5Var2 = new org.telegram.ui.h5(18.0f, i3, s70Var);
            this.F = h5Var2;
            h5Var2.f45818w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject e22 = org.telegram.messenger.hp.s1(i3).e2(o10);
        if (e22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.h5 h5Var3 = this.F;
            u8 u8Var = h5Var3.f45812c;
            u8Var.p(e22);
            h5Var3.f45811b.i0(e22, u8Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.m5.l(org.telegram.messenger.h10.f22829t0, o10));
        s70Var.setText(TextUtils.ellipsize(spannableStringBuilder, s70Var.getPaint(), org.telegram.messenger.g0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, org.telegram.messenger.hp.s1(i3).r2(j10, o10, null), z11);
        if (this.f32054s) {
            this.f32054s = false;
        }
    }

    public long getTopicId() {
        return this.f32056x;
    }

    public final void h() {
        int textColor = getTextColor();
        s70 s70Var = this.d;
        s70Var.setTextColor(textColor);
        s70Var.setEmojiColor(textColor);
        this.f32051f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        ImageView imageView = this.h;
        int measuredWidth = (i13 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i15 = i14 / 2;
        s70 s70Var = this.d;
        s70Var.layout(L, i15 - (s70Var.getMeasuredHeight() / 2), s70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (s70Var.getMeasuredHeight() / 2) + i15);
        int i16 = (this.f32050e.d > 0.0f ? 1 : (this.f32050e.d == 0.0f ? 0 : -1));
        ei.e3 e3Var = this.f32051f;
        if (i16 > 0) {
            e3Var.layout(((i13 - org.telegram.messenger.g0.L(11.0f)) - this.M) - e3Var.getMeasuredWidth(), i15 - (e3Var.getMeasuredHeight() / 2), (i13 - org.telegram.messenger.g0.L(11.0f)) - this.M, (e3Var.getMeasuredHeight() / 2) + i15);
        } else {
            int L2 = org.telegram.messenger.g0.L(11.0f);
            int L3 = org.telegram.messenger.g0.L(4.66f);
            int measuredWidth2 = s70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f);
            e3Var.layout(L3 + s70Var.getMeasuredWidth() + L2, i15 - (e3Var.getMeasuredHeight() / 2), e3Var.getMeasuredWidth() + org.telegram.messenger.g0.L(4.66f) + measuredWidth2, (e3Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.f32055w != 0 && e3Var.getLeft() != this.f32055w) {
            e3Var.setTranslationX((-e3Var.getLeft()) + this.f32055w);
            e3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
        this.f32055w = e3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.d.measure(i3, i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f32052n = z10;
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
        ofFloat.addUpdateListener(new z01(this, 1));
        this.I.addListener(new s9(22, this, z10));
        this.I.setInterpolator(xq.h);
        this.I.setDuration(320L);
        this.I.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f32051f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof y01)) {
                ((y01) imageView.getDrawable()).f40564b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f32048b));
                imageView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
