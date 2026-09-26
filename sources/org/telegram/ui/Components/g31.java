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
public final class g31 extends FrameLayout {
    public org.telegram.ui.g5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f24388a;
    public final org.telegram.ui.ActionBar.d6 f24389b;
    public mp0 f24390c;
    public final o90 d;
    public final o6 e;
    public final ai.n4 f24391f;
    public final ImageView h;
    public boolean f24392n;
    public final e6 f24393r;
    public boolean f24394s;
    public int v;
    public long f24395w;
    public boolean f24396x;
    public boolean f24397y;

    public g31(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24393r = new e6(this, 360L, sr.h);
        this.f24394s = false;
        this.f24396x = false;
        this.f24397y = false;
        this.I = org.telegram.ui.ActionBar.h6.U8;
        this.L = 0;
        this.f24388a = i10;
        this.f24389b = d6Var;
        setClipChildren(false);
        setClipToPadding(false);
        o90 o90Var = new o90(context, d6Var);
        this.d = o90Var;
        o90Var.setTextSize(1, 14.0f);
        o90Var.setTypeface(AndroidUtilities.bold());
        addView(o90Var, w7.y5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.a6.a(o90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.y5.e(34, 34, 17));
        o6 o6Var = new o6(false, false, false, false);
        this.e = o6Var;
        o6Var.t(AndroidUtilities.dp(11.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.f26962b = 17;
        ai.n4 n4Var = new ai.n4(this, context, d6Var);
        this.f24391f = n4Var;
        addView(n4Var, w7.y5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.a6.a(n4Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        o6 o6Var = this.e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), o6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (o6Var.d > 0.0f) {
            i10 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i10 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i10 + this.L;
    }

    public int getTextColor() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.f19461z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24389b;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        if (this.f24396x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f24397y == z10) {
            return;
        }
        this.f24397y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f24395w;
        long j11 = tL_forumTopic.f18387id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24395w = j11;
        this.h.setVisibility(8);
        o90 o90Var = this.d;
        o90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f18387id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            qq qqVar = new qq(R.drawable.msg_filled_general, 0);
            qqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(qqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new z5(tL_forumTopic.icon_emoji_id, o90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        o90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f24388a).isDialogMuted(j3, this.f24395w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f24394s != z12) {
            this.f24394s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f24395w = 0L;
        this.f24396x = true;
        this.h.setVisibility(8);
        o90 o90Var = this.d;
        o90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new qq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        o90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f24394s) {
            this.f24394s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f24395w = 0L;
        this.f24396x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            d31 d31Var = new d31(getContext());
            d31Var.f23489b.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.f24389b));
            imageView.setImageDrawable(d31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        o90 o90Var = this.d;
        o90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        o90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f24394s) {
            this.f24394s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float e = this.f24393r.e(this.f24392n);
            if (e > 0.0f) {
                if (this.f24390c == null) {
                    this.f24390c = new mp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f24390c.a(canvas, e);
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
        o6 o6Var = this.e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.h6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.U8;
            }
            this.I = i11;
            o6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.h6.V8;
            o6Var.q("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new e31(this, 0));
            this.K.addListener(new gd0(this, 24));
            this.K.setInterpolator(new OvershootInterpolator(2.0f));
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f24391f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f24395w = -1L;
        this.h.setVisibility(8);
        o90 o90Var = this.d;
        o90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        t90 t90Var = new t90(AndroidUtilities.dp(42.0f), o90Var);
        t90Var.e = 0.95f;
        spannableStringBuilder.setSpan(t90Var, 0, 1, 33);
        o90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f24394s) {
            this.f24394s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f24395w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24395w = peerDialogId;
        this.h.setVisibility(8);
        o90 o90Var = this.d;
        o90Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.E;
        int i10 = this.f24388a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(o90Var, 18.0f, i10);
            this.E = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.E;
            h9 h9Var = g5Var3.f33821c;
            h9Var.j(g5Var3.e, userOrChat);
            g5Var3.f33820b.setForUserOrChat(userOrChat, h9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        o90Var.setText(TextUtils.ellipsize(spannableStringBuilder, o90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.f24394s) {
            this.f24394s = false;
        }
    }

    public long getTopicId() {
        return this.f24395w;
    }

    public final void h() {
        int textColor = getTextColor();
        o90 o90Var = this.d;
        o90Var.setTextColor(textColor);
        o90Var.setEmojiColor(textColor);
        this.f24391f.invalidate();
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
        o90 o90Var = this.d;
        o90Var.layout(dp, i16 - (o90Var.getMeasuredHeight() / 2), o90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (o90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        ai.n4 n4Var = this.f24391f;
        if (f7 > 0.0f) {
            n4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - n4Var.getMeasuredWidth(), i16 - (n4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (n4Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = o90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            n4Var.layout(dp3 + o90Var.getMeasuredWidth() + dp2, i16 - (n4Var.getMeasuredHeight() / 2), n4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (n4Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && n4Var.getLeft() != this.v) {
            n4Var.setTranslationX((-n4Var.getLeft()) + this.v);
            n4Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(sr.h).start();
        }
        this.v = n4Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f24392n = z10;
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
        ofFloat.addUpdateListener(new e31(this, 1));
        this.H.addListener(new ca(21, this, z10));
        this.H.setInterpolator(sr.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
