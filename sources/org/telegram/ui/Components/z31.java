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
public final class z31 extends FrameLayout {
    public org.telegram.ui.f5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f33400a;
    public final org.telegram.ui.ActionBar.d6 f33401b;
    public fq0 f33402c;
    public final fa0 d;
    public final q6 f33403e;
    public final ai.o4 f33404f;
    public final ImageView h;
    public boolean f33405n;
    public final g6 f33406r;
    public boolean f33407s;
    public int v;
    public long f33408w;
    public boolean f33409x;
    public boolean f33410y;

    public z31(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f33406r = new g6(this, 360L, is.h);
        this.f33407s = false;
        this.f33409x = false;
        this.f33410y = false;
        this.I = org.telegram.ui.ActionBar.h6.U8;
        this.L = 0;
        this.f33400a = i10;
        this.f33401b = d6Var;
        setClipChildren(false);
        setClipToPadding(false);
        fa0 fa0Var = new fa0(context, d6Var);
        this.d = fa0Var;
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setTypeface(AndroidUtilities.bold());
        addView(fa0Var, w7.x5.a(-2.0f, 11.0f, 0.0f, 11.0f, 0.0f, -2, 19));
        w7.z5.a(fa0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.x5.e(34, 34, 17));
        q6 q6Var = new q6(false, false, false);
        this.f33403e = q6Var;
        q6Var.w(AndroidUtilities.dp(11.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.f30019b = 17;
        ai.o4 o4Var = new ai.o4(this, context, d6Var);
        this.f33404f = o4Var;
        addView(o4Var, w7.x5.a(-2.0f, 4.66f, 0.0f, 11.0f, 0.0f, -2, 21));
        w7.z5.a(o4Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        q6 q6Var = this.f33403e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), q6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (q6Var.d > 0.0f) {
            i10 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i10 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i10 + this.L;
    }

    public int getTextColor() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.f21189z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f33401b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        if (this.f33409x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, w02, w03);
    }

    private void setLayout(boolean z10) {
        if (this.f33410y == z10) {
            return;
        }
        this.f33410y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f33408w;
        long j11 = tL_forumTopic.f20084id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33408w = j11;
        this.h.setVisibility(8);
        fa0 fa0Var = this.d;
        fa0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f20084id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            er erVar = new er(R.drawable.msg_filled_general, 0);
            erVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(erVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new b6(tL_forumTopic.icon_emoji_id, fa0Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        fa0Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f33400a).isDialogMuted(j3, this.f33408w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f33407s != z12) {
            this.f33407s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f33408w = 0L;
        this.f33409x = true;
        this.h.setVisibility(8);
        fa0 fa0Var = this.d;
        fa0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new er(R.drawable.menu_topic_add, 0), 0, 1, 33);
        fa0Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f33407s) {
            this.f33407s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f33408w = 0L;
        this.f33409x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            w31 w31Var = new w31(getContext());
            w31Var.f32572b.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f33401b));
            imageView.setImageDrawable(w31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        fa0 fa0Var = this.d;
        fa0Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        fa0Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f33407s) {
            this.f33407s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float e7 = this.f33406r.e(this.f33405n);
            if (e7 > 0.0f) {
                if (this.f33402c == null) {
                    this.f33402c = new fq0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f33402c.a(canvas, e7);
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
        q6 q6Var = this.f33403e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.h6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.U8;
            }
            this.I = i11;
            q6Var.t(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.h6.V8;
            q6Var.t("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new x31(this, 0));
            this.K.addListener(new wd0(this, 24));
            org.telegram.messenger.ai.l(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f33404f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f33408w = -1L;
        this.h.setVisibility(8);
        fa0 fa0Var = this.d;
        fa0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ka0 ka0Var = new ka0(AndroidUtilities.dp(42.0f), fa0Var);
        ka0Var.f27895e = 0.95f;
        spannableStringBuilder.setSpan(ka0Var, 0, 1, 33);
        fa0Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f33407s) {
            this.f33407s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f33408w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33408w = peerDialogId;
        this.h.setVisibility(8);
        fa0 fa0Var = this.d;
        fa0Var.setVisibility(0);
        org.telegram.ui.f5 f5Var = this.E;
        int i10 = this.f33400a;
        if (f5Var == null) {
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(fa0Var, 18.0f, i10);
            this.E = f5Var2;
            f5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.f5 f5Var3 = this.E;
            j9 j9Var = f5Var3.f37541c;
            j9Var.j(f5Var3.f37542e, userOrChat);
            f5Var3.f37540b.setForUserOrChat(userOrChat, j9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        fa0Var.setText(TextUtils.ellipsize(spannableStringBuilder, fa0Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.f33407s) {
            this.f33407s = false;
        }
    }

    public long getTopicId() {
        return this.f33408w;
    }

    public final void h() {
        int textColor = getTextColor();
        fa0 fa0Var = this.d;
        fa0Var.setTextColor(textColor);
        fa0Var.setEmojiColor(textColor);
        this.f33404f.invalidate();
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
        fa0 fa0Var = this.d;
        fa0Var.layout(dp, i16 - (fa0Var.getMeasuredHeight() / 2), fa0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (fa0Var.getMeasuredHeight() / 2) + i16);
        int i17 = (this.f33403e.d > 0.0f ? 1 : (this.f33403e.d == 0.0f ? 0 : -1));
        ai.o4 o4Var = this.f33404f;
        if (i17 > 0) {
            o4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - o4Var.getMeasuredWidth(), i16 - (o4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (o4Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = fa0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            o4Var.layout(dp3 + fa0Var.getMeasuredWidth() + dp2, i16 - (o4Var.getMeasuredHeight() / 2), o4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (o4Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && o4Var.getLeft() != this.v) {
            o4Var.setTranslationX((-o4Var.getLeft()) + this.v);
            o4Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(is.h).start();
        }
        this.v = o4Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f33405n = z10;
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
        ofFloat.addUpdateListener(new x31(this, 1));
        this.H.addListener(new ea(21, this, z10));
        this.H.setInterpolator(is.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
