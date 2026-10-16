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
public final class t31 extends FrameLayout {
    public org.telegram.ui.k5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f28959a;
    public final org.telegram.ui.ActionBar.c6 f28960b;
    public zp0 f28961c;
    public final da0 d;
    public final r6 e;
    public final bi.d4 f28962f;
    public final ImageView h;
    public boolean f28963n;
    public final g6 f28964r;
    public boolean f28965s;
    public int v;
    public long f28966w;
    public boolean f28967x;
    public boolean f28968y;

    public t31(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28964r = new g6(this, 360L, es.h);
        this.f28965s = false;
        this.f28967x = false;
        this.f28968y = false;
        this.I = org.telegram.ui.ActionBar.g6.U8;
        this.L = 0;
        this.f28959a = i10;
        this.f28960b = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        da0 da0Var = new da0(context, c6Var);
        this.d = da0Var;
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTypeface(AndroidUtilities.bold());
        addView(da0Var, w7.z5.a(-2.0f, 11.0f, 0.0f, 11.0f, 0.0f, -2, 19));
        w7.b6.a(da0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.z5.e(34, 34, 17));
        r6 r6Var = new r6(false, false, false);
        this.e = r6Var;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.f28435b = 17;
        bi.d4 d4Var = new bi.d4(this, context, c6Var);
        this.f28962f = d4Var;
        addView(d4Var, w7.z5.a(-2.0f, 4.66f, 0.0f, 11.0f, 0.0f, -2, 21));
        w7.b6.a(d4Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        r6 r6Var = this.e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), r6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (r6Var.d > 0.0f) {
            i10 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i10 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i10 + this.L;
    }

    public int getTextColor() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.g6.f20005z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28960b;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        if (this.f28967x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, w02, w03);
    }

    private void setLayout(boolean z10) {
        if (this.f28968y == z10) {
            return;
        }
        this.f28968y = z10;
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f28966w;
        long j12 = tL_forumTopic.f18968id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28966w = j12;
        this.h.setVisibility(8);
        da0 da0Var = this.d;
        da0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f18968id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            br brVar = new br(R.drawable.msg_filled_general, 0);
            brVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(brVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new b6(tL_forumTopic.icon_emoji_id, da0Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        da0Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f28959a).isDialogMuted(j10, this.f28966w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f28965s != z12) {
            this.f28965s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f28966w = 0L;
        this.f28967x = true;
        this.h.setVisibility(8);
        da0 da0Var = this.d;
        da0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new br(R.drawable.menu_topic_add, 0), 0, 1, 33);
        da0Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f28965s) {
            this.f28965s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f28966w = 0L;
        this.f28967x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            q31 q31Var = new q31(getContext());
            q31Var.f28185b.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.f28960b));
            imageView.setImageDrawable(q31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        da0 da0Var = this.d;
        da0Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        da0Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f28965s) {
            this.f28965s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e = this.f28964r.e(this.f28963n);
            if (e > 0.0f) {
                if (this.f28961c == null) {
                    this.f28961c = new zp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f28961c.a(canvas, e);
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
        r6 r6Var = this.e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.g6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.U8;
            }
            this.I = i11;
            r6Var.t(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.g6.V8;
            r6Var.t("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new r31(this, 0));
            this.K.addListener(new k90(this, 27));
            org.telegram.messenger.sk.l(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f28962f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f28966w = -1L;
        this.h.setVisibility(8);
        da0 da0Var = this.d;
        da0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ia0 ia0Var = new ia0(AndroidUtilities.dp(42.0f), da0Var);
        ia0Var.e = 0.95f;
        spannableStringBuilder.setSpan(ia0Var, 0, 1, 33);
        da0Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f28965s) {
            this.f28965s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f28966w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28966w = peerDialogId;
        this.h.setVisibility(8);
        da0 da0Var = this.d;
        da0Var.setVisibility(0);
        org.telegram.ui.k5 k5Var = this.E;
        int i10 = this.f28959a;
        if (k5Var == null) {
            org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(da0Var, 18.0f, i10);
            this.E = k5Var2;
            k5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.k5 k5Var3 = this.E;
            k9 k9Var = k5Var3.f37288c;
            k9Var.j(k5Var3.e, userOrChat);
            k5Var3.f37287b.setForUserOrChat(userOrChat, k9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        da0Var.setText(TextUtils.ellipsize(spannableStringBuilder, da0Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z11);
        if (this.f28965s) {
            this.f28965s = false;
        }
    }

    public long getTopicId() {
        return this.f28966w;
    }

    public final void h() {
        int textColor = getTextColor();
        da0 da0Var = this.d;
        da0Var.setTextColor(textColor);
        da0Var.setEmojiColor(textColor);
        this.f28962f.invalidate();
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
        da0 da0Var = this.d;
        da0Var.layout(dp, i16 - (da0Var.getMeasuredHeight() / 2), da0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (da0Var.getMeasuredHeight() / 2) + i16);
        int i17 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        bi.d4 d4Var = this.f28962f;
        if (i17 > 0) {
            d4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - d4Var.getMeasuredWidth(), i16 - (d4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (d4Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = da0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            d4Var.layout(dp3 + da0Var.getMeasuredWidth() + dp2, i16 - (d4Var.getMeasuredHeight() / 2), d4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (d4Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && d4Var.getLeft() != this.v) {
            d4Var.setTranslationX((-d4Var.getLeft()) + this.v);
            d4Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(es.h).start();
        }
        this.v = d4Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f28963n = z10;
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
        ofFloat.addUpdateListener(new r31(this, 1));
        this.H.addListener(new org.telegram.ui.vo(22, this, z10));
        this.H.setInterpolator(es.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
