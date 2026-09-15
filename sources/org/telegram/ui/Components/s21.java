package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s21 extends FrameLayout {
    public org.telegram.ui.g5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f27754a;
    public final org.telegram.ui.ActionBar.e6 f27755b;
    public yo0 f27756c;
    public final c90 d;
    public final m6 e;
    public final ai.n4 f27757f;
    public final ImageView h;
    public boolean f27758n;
    public final c6 f27759r;
    public boolean f27760s;
    public int v;
    public long f27761w;
    public boolean f27762x;
    public boolean f27763y;

    public s21(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f27759r = new c6(this, 360L, qr.h);
        this.f27760s = false;
        this.f27762x = false;
        this.f27763y = false;
        this.I = org.telegram.ui.ActionBar.i6.U8;
        this.L = 0;
        this.f27754a = i10;
        this.f27755b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        c90 c90Var = new c90(context, e6Var);
        this.d = c90Var;
        c90Var.setTextSize(1, 14.0f);
        c90Var.setTypeface(AndroidUtilities.bold());
        addView(c90Var, w7.x5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.z5.a(c90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.x5.e(34, 34, 17));
        m6 m6Var = new m6(false, false, false, false);
        this.e = m6Var;
        m6Var.t(AndroidUtilities.dp(11.0f));
        m6Var.u(AndroidUtilities.bold());
        m6Var.G = AndroidUtilities.displaySize.x;
        m6Var.f26086b = 17;
        ai.n4 n4Var = new ai.n4(this, context, e6Var);
        this.f27757f = n4Var;
        addView(n4Var, w7.x5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.z5.a(n4Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        m6 m6Var = this.e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), m6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (m6Var.d > 0.0f) {
            i10 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i10 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i10 + this.L;
    }

    public int getTextColor() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.i6.f19237z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f27755b;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        if (this.f27762x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f27763y == z10) {
            return;
        }
        this.f27763y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f27761w;
        long j11 = tL_forumTopic.f18164id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27761w = j11;
        this.h.setVisibility(8);
        c90 c90Var = this.d;
        c90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f18164id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            oq oqVar = new oq(R.drawable.msg_filled_general, 0);
            oqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new x5(tL_forumTopic.icon_emoji_id, c90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        c90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f27754a).isDialogMuted(j3, this.f27761w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f27760s != z12) {
            this.f27760s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f27761w = 0L;
        this.f27762x = true;
        this.h.setVisibility(8);
        c90 c90Var = this.d;
        c90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new oq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        c90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f27760s) {
            this.f27760s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f27761w = 0L;
        this.f27762x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            p21 p21Var = new p21(getContext());
            p21Var.f26937b.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.f27755b));
            imageView.setImageDrawable(p21Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        c90 c90Var = this.d;
        c90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        c90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f27760s) {
            this.f27760s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float e = this.f27759r.e(this.f27758n);
            if (e > 0.0f) {
                if (this.f27756c == null) {
                    this.f27756c = new yo0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f27756c.a(canvas, e);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i10, boolean z10, boolean z11) {
        int i11;
        m6 m6Var = this.e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.i6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.U8;
            }
            this.I = i11;
            m6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.i6.V8;
            m6Var.q("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new q21(this, 0));
            this.K.addListener(new jd0(this, 23));
            this.K.setInterpolator(new OvershootInterpolator(2.0f));
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f27757f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f27761w = -1L;
        this.h.setVisibility(8);
        c90 c90Var = this.d;
        c90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        h90 h90Var = new h90(AndroidUtilities.dp(42.0f), c90Var);
        h90Var.e = 0.95f;
        spannableStringBuilder.setSpan(h90Var, 0, 1, 33);
        c90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f27760s) {
            this.f27760s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f27761w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27761w = peerDialogId;
        this.h.setVisibility(8);
        c90 c90Var = this.d;
        c90Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.E;
        int i10 = this.f27754a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(c90Var, 18.0f, i10);
            this.E = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.E;
            f9 f9Var = g5Var3.f33759c;
            f9Var.j(g5Var3.e, userOrChat);
            g5Var3.f33758b.setForUserOrChat(userOrChat, f9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        c90Var.setText(TextUtils.ellipsize(spannableStringBuilder, c90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.f27760s) {
            this.f27760s = false;
        }
    }

    public long getTopicId() {
        return this.f27761w;
    }

    public final void h() {
        int textColor = getTextColor();
        c90 c90Var = this.d;
        c90Var.setTextColor(textColor);
        c90Var.setEmojiColor(textColor);
        this.f27757f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        ImageView imageView = this.h;
        int measuredWidth = (i14 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int dp = AndroidUtilities.dp(11.0f);
        int i16 = i15 / 2;
        c90 c90Var = this.d;
        c90Var.layout(dp, i16 - (c90Var.getMeasuredHeight() / 2), c90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (c90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        ai.n4 n4Var = this.f27757f;
        if (f7 > 0.0f) {
            n4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - n4Var.getMeasuredWidth(), i16 - (n4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (n4Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = c90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            n4Var.layout(dp3 + c90Var.getMeasuredWidth() + dp2, i16 - (n4Var.getMeasuredHeight() / 2), n4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (n4Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && n4Var.getLeft() != this.v) {
            n4Var.setTranslationX((-n4Var.getLeft()) + this.v);
            n4Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        this.v = n4Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f27758n = z10;
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
        ofFloat.addUpdateListener(new q21(this, 1));
        this.H.addListener(new aa(21, this, z10));
        this.H.setInterpolator(qr.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
