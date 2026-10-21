package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m31 extends FrameLayout {
    public org.telegram.ui.l5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f28369a;
    public final org.telegram.ui.ActionBar.d6 f28370b;
    public vp0 f28371c;
    public final x90 d;
    public final p6 e;
    public final ci.i3 f28372f;
    public final ImageView h;
    public boolean f28373n;
    public final f6 f28374r;
    public boolean f28375s;
    public int v;
    public long f28376w;
    public boolean f28377x;
    public boolean f28378y;

    public m31(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28374r = new f6(this, 360L, bs.h);
        this.f28375s = false;
        this.f28377x = false;
        this.f28378y = false;
        this.I = org.telegram.ui.ActionBar.h6.U8;
        this.L = 0;
        this.f28369a = i10;
        this.f28370b = d6Var;
        setClipChildren(false);
        setClipToPadding(false);
        x90 x90Var = new x90(context, d6Var);
        this.d = x90Var;
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTypeface(AndroidUtilities.bold());
        addView(x90Var, w7.z5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(x90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.z5.e(34, 34, 17));
        p6 p6Var = new p6(false, false, false);
        this.e = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.f29226b = 17;
        ci.i3 i3Var = new ci.i3(this, context, d6Var);
        this.f28372f = i3Var;
        addView(i3Var, w7.z5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(i3Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        p6 p6Var = this.e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), p6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (p6Var.d > 0.0f) {
            i10 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i10 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i10 + this.L;
    }

    public int getTextColor() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.f21395z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f28370b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        if (this.f28377x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.f(f7, w02, w03);
    }

    private void setLayout(boolean z10) {
        if (this.f28378y == z10) {
            return;
        }
        this.f28378y = z10;
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f28376w;
        long j12 = tL_forumTopic.f20328id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28376w = j12;
        this.h.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f20328id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            yq yqVar = new yq(R.drawable.msg_filled_general, 0);
            yqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(yqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new a6(tL_forumTopic.icon_emoji_id, x90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        x90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f28369a).isDialogMuted(j10, this.f28376w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f28375s != z12) {
            this.f28375s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f28376w = 0L;
        this.f28377x = true;
        this.h.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new yq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        x90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f28375s) {
            this.f28375s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f28376w = 0L;
        this.f28377x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            j31 j31Var = new j31(getContext());
            j31Var.f27394b.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f28370b));
            imageView.setImageDrawable(j31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        x90 x90Var = this.d;
        x90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        x90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f28375s) {
            this.f28375s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e = this.f28374r.e(this.f28373n);
            if (e > 0.0f) {
                if (this.f28371c == null) {
                    this.f28371c = new vp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f28371c.a(canvas, e);
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
        p6 p6Var = this.e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.h6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.U8;
            }
            this.I = i11;
            p6Var.t(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.h6.V8;
            p6Var.t("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new k31(this, 0));
            this.K.addListener(new c80(this, 29));
            org.telegram.messenger.mk.l(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f28372f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f28376w = -1L;
        this.h.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ca0 ca0Var = new ca0(AndroidUtilities.dp(42.0f), x90Var);
        ca0Var.e = 0.95f;
        spannableStringBuilder.setSpan(ca0Var, 0, 1, 33);
        x90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f28375s) {
            this.f28375s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f28376w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28376w = peerDialogId;
        this.h.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setVisibility(0);
        org.telegram.ui.l5 l5Var = this.E;
        int i10 = this.f28369a;
        if (l5Var == null) {
            org.telegram.ui.l5 l5Var2 = new org.telegram.ui.l5(x90Var, 18.0f, i10);
            this.E = l5Var2;
            l5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.l5 l5Var3 = this.E;
            h9 h9Var = l5Var3.f38790c;
            h9Var.j(l5Var3.e, userOrChat);
            l5Var3.f38789b.setForUserOrChat(userOrChat, h9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        x90Var.setText(TextUtils.ellipsize(spannableStringBuilder, x90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z11);
        if (this.f28375s) {
            this.f28375s = false;
        }
    }

    public long getTopicId() {
        return this.f28376w;
    }

    public final void h() {
        int textColor = getTextColor();
        x90 x90Var = this.d;
        x90Var.setTextColor(textColor);
        x90Var.setEmojiColor(textColor);
        this.f28372f.invalidate();
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
        x90 x90Var = this.d;
        x90Var.layout(dp, i16 - (x90Var.getMeasuredHeight() / 2), x90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (x90Var.getMeasuredHeight() / 2) + i16);
        int i17 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        ci.i3 i3Var = this.f28372f;
        if (i17 > 0) {
            i3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - i3Var.getMeasuredWidth(), i16 - (i3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (i3Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = x90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            i3Var.layout(dp3 + x90Var.getMeasuredWidth() + dp2, i16 - (i3Var.getMeasuredHeight() / 2), i3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (i3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && i3Var.getLeft() != this.v) {
            i3Var.setTranslationX((-i3Var.getLeft()) + this.v);
            i3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        this.v = i3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f28373n = z10;
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
        ofFloat.addUpdateListener(new k31(this, 1));
        this.H.addListener(new org.telegram.ui.fo(22, this, z10));
        this.H.setInterpolator(bs.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
