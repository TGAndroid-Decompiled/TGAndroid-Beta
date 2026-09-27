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
public final class h31 extends FrameLayout {
    public org.telegram.ui.i5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f24711a;
    public final org.telegram.ui.ActionBar.e6 f24712b;
    public np0 f24713c;
    public final p90 d;
    public final o6 e;
    public final ai.n4 f24714f;
    public final ImageView h;
    public boolean f24715n;
    public final e6 f24716r;
    public boolean f24717s;
    public int v;
    public long f24718w;
    public boolean f24719x;
    public boolean f24720y;

    public h31(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f24716r = new e6(this, 360L, sr.h);
        this.f24717s = false;
        this.f24719x = false;
        this.f24720y = false;
        this.I = org.telegram.ui.ActionBar.i6.U8;
        this.L = 0;
        this.f24711a = i10;
        this.f24712b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        p90 p90Var = new p90(context, e6Var);
        this.d = p90Var;
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTypeface(AndroidUtilities.bold());
        addView(p90Var, w7.y5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.a6.a(p90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.y5.e(34, 34, 17));
        o6 o6Var = new o6(false, false, false, false);
        this.e = o6Var;
        o6Var.t(AndroidUtilities.dp(11.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.f26983b = 17;
        ai.n4 n4Var = new ai.n4(this, context, e6Var);
        this.f24714f = n4Var;
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
        int i10 = org.telegram.ui.ActionBar.i6.f19461z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24712b;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        if (this.f24719x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f24720y == z10) {
            return;
        }
        this.f24720y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f24718w;
        long j11 = tL_forumTopic.f18381id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24718w = j11;
        this.h.setVisibility(8);
        p90 p90Var = this.d;
        p90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f18381id == 1) {
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
            spannableStringBuilder.setSpan(new z5(tL_forumTopic.icon_emoji_id, p90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        p90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f24711a).isDialogMuted(j3, this.f24718w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f24717s != z12) {
            this.f24717s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f24718w = 0L;
        this.f24719x = true;
        this.h.setVisibility(8);
        p90 p90Var = this.d;
        p90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new qq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        p90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f24717s) {
            this.f24717s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f24718w = 0L;
        this.f24719x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            e31 e31Var = new e31(getContext());
            e31Var.f23863b.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.f24712b));
            imageView.setImageDrawable(e31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        p90 p90Var = this.d;
        p90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        p90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f24717s) {
            this.f24717s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float e = this.f24716r.e(this.f24715n);
            if (e > 0.0f) {
                if (this.f24713c == null) {
                    this.f24713c = new np0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f24713c.a(canvas, e);
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
                i11 = org.telegram.ui.ActionBar.i6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.U8;
            }
            this.I = i11;
            o6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.i6.V8;
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
            ofFloat.addUpdateListener(new f31(this, 0));
            this.K.addListener(new fd0(this, 24));
            this.K.setInterpolator(new OvershootInterpolator(2.0f));
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f24714f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f24718w = -1L;
        this.h.setVisibility(8);
        p90 p90Var = this.d;
        p90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        u90 u90Var = new u90(AndroidUtilities.dp(42.0f), p90Var);
        u90Var.e = 0.95f;
        spannableStringBuilder.setSpan(u90Var, 0, 1, 33);
        p90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f24717s) {
            this.f24717s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f24718w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24718w = peerDialogId;
        this.h.setVisibility(8);
        p90 p90Var = this.d;
        p90Var.setVisibility(0);
        org.telegram.ui.i5 i5Var = this.E;
        int i10 = this.f24711a;
        if (i5Var == null) {
            org.telegram.ui.i5 i5Var2 = new org.telegram.ui.i5(p90Var, 18.0f, i10);
            this.E = i5Var2;
            i5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.i5 i5Var3 = this.E;
            h9 h9Var = i5Var3.f34358c;
            h9Var.j(i5Var3.e, userOrChat);
            i5Var3.f34357b.setForUserOrChat(userOrChat, h9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        p90Var.setText(TextUtils.ellipsize(spannableStringBuilder, p90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.f24717s) {
            this.f24717s = false;
        }
    }

    public long getTopicId() {
        return this.f24718w;
    }

    public final void h() {
        int textColor = getTextColor();
        p90 p90Var = this.d;
        p90Var.setTextColor(textColor);
        p90Var.setEmojiColor(textColor);
        this.f24714f.invalidate();
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
        p90 p90Var = this.d;
        p90Var.layout(dp, i16 - (p90Var.getMeasuredHeight() / 2), p90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (p90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        ai.n4 n4Var = this.f24714f;
        if (f7 > 0.0f) {
            n4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - n4Var.getMeasuredWidth(), i16 - (n4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (n4Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = p90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            n4Var.layout(dp3 + p90Var.getMeasuredWidth() + dp2, i16 - (n4Var.getMeasuredHeight() / 2), n4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (n4Var.getMeasuredHeight() / 2) + i16);
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
        this.f24715n = z10;
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
        ofFloat.addUpdateListener(new f31(this, 1));
        this.H.addListener(new ca(21, this, z10));
        this.H.setInterpolator(sr.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
