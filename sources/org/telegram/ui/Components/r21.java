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
public final class r21 extends FrameLayout {
    public org.telegram.ui.k5 B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public int F;
    public int G;
    public ValueAnimator H;
    public int I;
    public final int f28385a;
    public final org.telegram.ui.ActionBar.f6 f28386b;
    public bp0 f28387c;
    public final f90 d;
    public final j6 e;
    public final nh.a3 f28388f;
    public final ImageView h;
    public boolean f28389n;
    public final z5 f28390r;
    public boolean f28391s;
    public int v;
    public long f28392w;
    public boolean f28393x;
    public boolean f28394y;

    public r21(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f28390r = new z5(this, 360L, mr.h);
        this.f28391s = false;
        this.f28393x = false;
        this.f28394y = false;
        this.F = org.telegram.ui.ActionBar.j6.U8;
        this.I = 0;
        this.f28385a = i10;
        this.f28386b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        f90 f90Var = new f90(context, f6Var);
        this.d = f90Var;
        f90Var.setTextSize(1, 14.0f);
        f90Var.setTypeface(AndroidUtilities.bold());
        addView(f90Var, k7.b6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        k7.d6.a(f90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, k7.b6.e(34, 34, 17));
        j6 j6Var = new j6(false, false, false, false);
        this.e = j6Var;
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.f25847b = 17;
        nh.a3 a3Var = new nh.a3(this, context, f6Var);
        this.f28388f = a3Var;
        addView(a3Var, k7.b6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        k7.d6.a(a3Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        j6 j6Var = this.e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), j6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (j6Var.d > 0.0f) {
            i10 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i10 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i10 + this.I;
    }

    public int getTextColor() {
        float f10;
        int i10 = org.telegram.ui.ActionBar.j6.f20273z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28386b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        if (this.f28393x) {
            f10 = 1.0f;
        } else {
            f10 = this.C;
        }
        return i0.a.d(f10, v02, v03);
    }

    private void setLayout(boolean z4) {
        if (this.f28394y == z4) {
            return;
        }
        this.f28394y = z4;
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        boolean z10;
        String str;
        setLayout(false);
        long j11 = this.f28392w;
        long j12 = tL_forumTopic.f19211id;
        if (j11 == j12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28392w = j12;
        this.h.setVisibility(8);
        f90 f90Var = this.d;
        f90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f19211id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            lq lqVar = new lq(R.drawable.msg_filled_general, 0);
            lqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(lqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new u5(tL_forumTopic.icon_emoji_id, f90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        f90Var.setText(spannableStringBuilder);
        setSelected(z4);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f28385a).isDialogMuted(j10, this.f28392w), z10);
        boolean z11 = tL_forumTopic.pinned;
        if (this.f28391s != z11) {
            this.f28391s = z11;
        }
    }

    public final void c() {
        setLayout(false);
        this.f28392w = 0L;
        this.f28393x = true;
        this.h.setVisibility(8);
        f90 f90Var = this.d;
        f90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new lq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        f90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f28391s) {
            this.f28391s = false;
        }
    }

    public final void d(boolean z4, boolean z10, boolean z11) {
        int i10;
        int i11;
        setLayout(z10);
        this.f28392w = 0L;
        this.f28393x = false;
        int i12 = 8;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z4) {
            o21 o21Var = new o21(getContext());
            o21Var.f27440b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f28386b));
            imageView.setImageDrawable(o21Var);
        }
        if (z4) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        f90 f90Var = this.d;
        f90Var.setText(string);
        if (!z4) {
            i12 = 0;
        }
        f90Var.setVisibility(i12);
        setSelected(z11);
        h();
        e(0, true, false);
        if (this.f28391s) {
            this.f28391s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e = this.f28390r.e(this.f28389n);
            if (e > 0.0f) {
                if (this.f28387c == null) {
                    this.f28387c = new bp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f28387c.a(canvas, e);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(int i10, boolean z4, boolean z10) {
        int i11;
        j6 j6Var = this.e;
        if (i10 > 0) {
            if (z4) {
                i11 = org.telegram.ui.ActionBar.j6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.U8;
            }
            this.F = i11;
            j6Var.q(LocaleController.formatNumber(i10, ','), z10, true);
        } else {
            this.F = org.telegram.ui.ActionBar.j6.V8;
            j6Var.q("", z10, true);
        }
        if (z10 && this.G < i10) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new p21(this, 0));
            this.H.addListener(new od0(this, 22));
            this.H.setInterpolator(new OvershootInterpolator(2.0f));
            this.H.setDuration(200L);
            this.H.start();
        }
        this.G = i10;
        this.f28388f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f28392w = -1L;
        this.h.setVisibility(8);
        f90 f90Var = this.d;
        f90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        k90 k90Var = new k90(AndroidUtilities.dp(42.0f), f90Var);
        k90Var.e = 0.95f;
        spannableStringBuilder.setSpan(k90Var, 0, 1, 33);
        f90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f28391s) {
            this.f28391s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        boolean z10;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f28392w == peerDialogId) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28392w = peerDialogId;
        this.h.setVisibility(8);
        f90 f90Var = this.d;
        f90Var.setVisibility(0);
        org.telegram.ui.k5 k5Var = this.B;
        int i10 = this.f28385a;
        if (k5Var == null) {
            org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(f90Var, 18.0f, i10);
            this.B = k5Var2;
            k5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.k5 k5Var3 = this.B;
            z8 z8Var = k5Var3.f35421c;
            z8Var.j(k5Var3.e, userOrChat);
            k5Var3.f35420b.setForUserOrChat(userOrChat, z8Var);
            spannableStringBuilder.setSpan(this.B, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        f90Var.setText(TextUtils.ellipsize(spannableStringBuilder, f90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z4);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z10);
        if (this.f28391s) {
            this.f28391s = false;
        }
    }

    public long getTopicId() {
        return this.f28392w;
    }

    public final void h() {
        int textColor = getTextColor();
        f90 f90Var = this.d;
        f90Var.setTextColor(textColor);
        f90Var.setEmojiColor(textColor);
        this.f28388f.invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        ImageView imageView = this.h;
        int measuredWidth = (i14 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int dp = AndroidUtilities.dp(11.0f);
        int i16 = i15 / 2;
        f90 f90Var = this.d;
        f90Var.layout(dp, i16 - (f90Var.getMeasuredHeight() / 2), f90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (f90Var.getMeasuredHeight() / 2) + i16);
        float f10 = this.e.d;
        nh.a3 a3Var = this.f28388f;
        if (f10 > 0.0f) {
            a3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - a3Var.getMeasuredWidth(), i16 - (a3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (a3Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = f90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            a3Var.layout(dp3 + f90Var.getMeasuredWidth() + dp2, i16 - (a3Var.getMeasuredHeight() / 2), a3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (a3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && a3Var.getLeft() != this.v) {
            a3Var.setTranslationX((-a3Var.getLeft()) + this.v);
            a3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(mr.h).start();
        }
        this.v = a3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z4) {
        this.f28389n = z4;
        invalidate();
    }

    @Override
    public void setSelected(boolean z4) {
        float f10;
        if (this.D == z4) {
            return;
        }
        this.D = z4;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.C;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new p21(this, 1));
        this.E.addListener(new m00(13, this, z4));
        this.E.setInterpolator(mr.h);
        this.E.setDuration(320L);
        this.E.start();
    }
}
