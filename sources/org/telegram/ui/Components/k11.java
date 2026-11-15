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
public final class k11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public org.telegram.ui.f5 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int f36226a;
    public final org.telegram.ui.ActionBar.e6 f36227b;
    public in0 f36228c;
    public final z70 d;
    public final g6 f36229e;
    public final fi.w2 f36230f;
    public final ImageView h;
    public boolean f36231n;
    public final u5 f36232r;
    public boolean f36233s;
    public int f36234w;
    public long f36235x;
    public boolean f36236y;

    public k11(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f36232r = new u5(this, 360L, er.h);
        this.f36233s = false;
        this.f36236y = false;
        this.E = false;
        this.J = org.telegram.ui.ActionBar.j6.U8;
        this.M = 0;
        this.f36226a = i7;
        this.f36227b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        z70 z70Var = new z70(context, e6Var);
        this.d = z70Var;
        z70Var.setTextSize(1, 14.0f);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        addView(z70Var, c8.ja.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        c8.na.a(z70Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, c8.ja.e(34, 34, 17));
        g6 g6Var = new g6(false, false, false);
        this.f36229e = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.N = org.telegram.messenger.g0.f23611q.x;
        g6Var.f34833b = 17;
        fi.w2 w2Var = new fi.w2(this, context, e6Var);
        this.f36230f = w2Var;
        addView(w2Var, c8.ja.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        c8.na.a(w2Var);
        h();
    }

    private int getMeasuringWidth() {
        int i7;
        g6 g6Var = this.f36229e;
        int max = (int) Math.max(org.telegram.messenger.g0.L(16.66f), g6Var.d + org.telegram.messenger.g0.L(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f);
        if (g6Var.d > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.66f) + max;
        } else {
            i7 = 0;
        }
        return org.telegram.messenger.g0.L(11.0f) + measuredWidth + i7 + this.M;
    }

    public int getTextColor() {
        float f10;
        int i7 = org.telegram.ui.ActionBar.j6.f29260z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36227b;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
        if (this.f36236y) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f36235x;
        long j11 = tL_forumTopic.f28103id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36235x = j11;
        this.h.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f28103id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            eq eqVar = new eq(2131232145, 0);
            eqVar.I = 0.66f;
            eqVar.J = 0.66f;
            spannableStringBuilder.setSpan(eqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new p5(tL_forumTopic.icon_emoji_id, z70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        z70Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.np.s1(this.f36226a).r2(j3, this.f36235x, null), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f36233s != z12) {
            this.f36233s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f36235x = 0L;
        this.f36236y = true;
        this.h.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new eq(2131231904, 0), 0, 1, 33);
        z70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f36233s) {
            this.f36233s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i7;
        int i10;
        setLayout(z11);
        this.f36235x = 0L;
        this.f36236y = false;
        int i11 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i7);
        if (z10) {
            g11 g11Var = new g11(getContext());
            g11Var.f34780b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f36227b));
            imageView.setImageDrawable(g11Var);
        }
        if (z10) {
            i10 = 2131753064;
        } else {
            i10 = 2131754289;
        }
        String M0 = org.telegram.messenger.hd.M0(i10, null);
        z70 z70Var = this.d;
        z70Var.setText(M0);
        if (!z10) {
            i11 = 0;
        }
        z70Var.setVisibility(i11);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f36233s) {
            this.f36233s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float d = this.f36232r.d(this.f36231n);
            if (d > 0.0f) {
                if (this.f36228c == null) {
                    this.f36228c = new in0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f36228c.a(canvas, d);
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
        g6 g6Var = this.f36229e;
        if (i7 > 0) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.j6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.U8;
            }
            this.J = i10;
            g6Var.t(org.telegram.messenger.hd.E(i7, ','), z11, true);
        } else {
            this.J = org.telegram.ui.ActionBar.j6.V8;
            g6Var.t("", z11, true);
        }
        if (z11 && this.K < i7) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new h11(this, 0));
            this.L.addListener(new i11(this, 0));
            org.telegram.messenger.i20.k(2.0f, this.L);
            this.L.setDuration(200L);
            this.L.start();
        }
        this.K = i7;
        this.f36230f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f36235x = -1L;
        this.h.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        e80 e80Var = new e80(org.telegram.messenger.g0.L(42.0f), z70Var);
        e80Var.f34243e = 0.95f;
        spannableStringBuilder.setSpan(e80Var, 0, 1, 33);
        z70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f36233s) {
            this.f36233s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        if (this.f36235x == o4) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36235x = o4;
        this.h.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setVisibility(0);
        org.telegram.ui.f5 f5Var = this.F;
        int i7 = this.f36226a;
        if (f5Var == null) {
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(18.0f, i7, z70Var);
            this.F = f5Var2;
            f5Var2.f46991w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject e22 = org.telegram.messenger.np.s1(i7).e2(o4);
        if (e22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.f5 f5Var3 = this.F;
            t8 t8Var = f5Var3.f46985c;
            t8Var.p(e22);
            f5Var3.f46984b.i0(e22, t8Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.m5.l(org.telegram.messenger.m10.f24940t0, o4));
        z70Var.setText(TextUtils.ellipsize(spannableStringBuilder, z70Var.getPaint(), org.telegram.messenger.g0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, org.telegram.messenger.np.s1(i7).r2(j3, o4, null), z11);
        if (this.f36233s) {
            this.f36233s = false;
        }
    }

    public long getTopicId() {
        return this.f36235x;
    }

    public final void h() {
        int textColor = getTextColor();
        z70 z70Var = this.d;
        z70Var.setTextColor(textColor);
        z70Var.setEmojiColor(textColor);
        this.f36230f.invalidate();
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
        z70 z70Var = this.d;
        z70Var.layout(L, i15 - (z70Var.getMeasuredHeight() / 2), z70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (z70Var.getMeasuredHeight() / 2) + i15);
        int i16 = (this.f36229e.d > 0.0f ? 1 : (this.f36229e.d == 0.0f ? 0 : -1));
        fi.w2 w2Var = this.f36230f;
        if (i16 > 0) {
            w2Var.layout(((i13 - org.telegram.messenger.g0.L(11.0f)) - this.M) - w2Var.getMeasuredWidth(), i15 - (w2Var.getMeasuredHeight() / 2), (i13 - org.telegram.messenger.g0.L(11.0f)) - this.M, (w2Var.getMeasuredHeight() / 2) + i15);
        } else {
            int L2 = org.telegram.messenger.g0.L(11.0f);
            int L3 = org.telegram.messenger.g0.L(4.66f);
            int measuredWidth2 = z70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f);
            w2Var.layout(L3 + z70Var.getMeasuredWidth() + L2, i15 - (w2Var.getMeasuredHeight() / 2), w2Var.getMeasuredWidth() + org.telegram.messenger.g0.L(4.66f) + measuredWidth2, (w2Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.f36234w != 0 && w2Var.getLeft() != this.f36234w) {
            w2Var.setTranslationX((-w2Var.getLeft()) + this.f36234w);
            w2Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(er.h).start();
        }
        this.f36234w = w2Var.getLeft();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.d.measure(i7, i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f36231n = z10;
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
        ofFloat.addUpdateListener(new h11(this, 1));
        this.I.addListener(new org.telegram.ui.nn(23, this, z10));
        this.I.setInterpolator(er.h);
        this.I.setDuration(320L);
        this.I.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f36230f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof g11)) {
                ((g11) imageView.getDrawable()).f34780b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f36227b));
                imageView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
