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
public final class i31 extends FrameLayout {
    public org.telegram.ui.g5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f24952a;
    public final org.telegram.ui.ActionBar.f6 f24953b;
    public np0 f24954c;
    public final n90 d;
    public final n6 e;
    public final ai.n4 f24955f;
    public final ImageView h;
    public boolean f24956n;
    public final d6 f24957r;
    public boolean f24958s;
    public int v;
    public long f24959w;
    public boolean f24960x;
    public boolean f24961y;

    public i31(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24957r = new d6(this, 360L, qr.h);
        this.f24958s = false;
        this.f24960x = false;
        this.f24961y = false;
        this.I = org.telegram.ui.ActionBar.j6.U8;
        this.L = 0;
        this.f24952a = i10;
        this.f24953b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        n90 n90Var = new n90(context, f6Var);
        this.d = n90Var;
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTypeface(AndroidUtilities.bold());
        addView(n90Var, w7.y5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.a6.a(n90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.y5.e(34, 34, 17));
        n6 n6Var = new n6(false, false, false, false);
        this.e = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.f26643b = 17;
        ai.n4 n4Var = new ai.n4(this, context, f6Var);
        this.f24955f = n4Var;
        addView(n4Var, w7.y5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.a6.a(n4Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        n6 n6Var = this.e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), n6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (n6Var.d > 0.0f) {
            i10 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i10 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i10 + this.L;
    }

    public int getTextColor() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.j6.f19511z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24953b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        if (this.f24960x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f24961y == z10) {
            return;
        }
        this.f24961y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f24959w;
        long j11 = tL_forumTopic.f18395id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24959w = j11;
        this.h.setVisibility(8);
        n90 n90Var = this.d;
        n90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f18395id == 1) {
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
            spannableStringBuilder.setSpan(new y5(tL_forumTopic.icon_emoji_id, n90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        n90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f24952a).isDialogMuted(j3, this.f24959w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f24958s != z12) {
            this.f24958s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f24959w = 0L;
        this.f24960x = true;
        this.h.setVisibility(8);
        n90 n90Var = this.d;
        n90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new oq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        n90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f24958s) {
            this.f24958s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f24959w = 0L;
        this.f24960x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            f31 f31Var = new f31(getContext());
            f31Var.f24105b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f24953b));
            imageView.setImageDrawable(f31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        n90 n90Var = this.d;
        n90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        n90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f24958s) {
            this.f24958s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float e = this.f24957r.e(this.f24956n);
            if (e > 0.0f) {
                if (this.f24954c == null) {
                    this.f24954c = new np0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f24954c.a(canvas, e);
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
        n6 n6Var = this.e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.j6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.U8;
            }
            this.I = i11;
            n6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.j6.V8;
            n6Var.q("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new g31(this, 0));
            this.K.addListener(new gd0(this, 24));
            this.K.setInterpolator(new OvershootInterpolator(2.0f));
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f24955f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f24959w = -1L;
        this.h.setVisibility(8);
        n90 n90Var = this.d;
        n90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        s90 s90Var = new s90(AndroidUtilities.dp(42.0f), n90Var);
        s90Var.e = 0.95f;
        spannableStringBuilder.setSpan(s90Var, 0, 1, 33);
        n90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f24958s) {
            this.f24958s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f24959w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24959w = peerDialogId;
        this.h.setVisibility(8);
        n90 n90Var = this.d;
        n90Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.E;
        int i10 = this.f24952a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(n90Var, 18.0f, i10);
            this.E = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.E;
            g9 g9Var = g5Var3.f33829c;
            g9Var.j(g5Var3.e, userOrChat);
            g5Var3.f33828b.setForUserOrChat(userOrChat, g9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        n90Var.setText(TextUtils.ellipsize(spannableStringBuilder, n90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.f24958s) {
            this.f24958s = false;
        }
    }

    public long getTopicId() {
        return this.f24959w;
    }

    public final void h() {
        int textColor = getTextColor();
        n90 n90Var = this.d;
        n90Var.setTextColor(textColor);
        n90Var.setEmojiColor(textColor);
        this.f24955f.invalidate();
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
        n90 n90Var = this.d;
        n90Var.layout(dp, i16 - (n90Var.getMeasuredHeight() / 2), n90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (n90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        ai.n4 n4Var = this.f24955f;
        if (f7 > 0.0f) {
            n4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - n4Var.getMeasuredWidth(), i16 - (n4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (n4Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = n90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            n4Var.layout(dp3 + n90Var.getMeasuredWidth() + dp2, i16 - (n4Var.getMeasuredHeight() / 2), n4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (n4Var.getMeasuredHeight() / 2) + i16);
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
        this.f24956n = z10;
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
        ofFloat.addUpdateListener(new g31(this, 1));
        this.H.addListener(new ba(21, this, z10));
        this.H.setInterpolator(qr.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
