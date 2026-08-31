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
    public org.telegram.ui.i5 B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public int F;
    public int G;
    public ValueAnimator H;
    public int I;
    public final int f30958a;
    public final org.telegram.ui.ActionBar.g6 f30959b;
    public dp0 f30960c;
    public final g90 d;
    public final j6 f30961e;
    public final oh.b3 f30962f;
    public final ImageView h;
    public boolean f30963n;
    public final z5 f30964r;
    public boolean f30965s;
    public int v;
    public long f30966w;
    public boolean f30967x;
    public boolean f30968y;

    public s21(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30964r = new z5(this, 360L, pr.h);
        this.f30965s = false;
        this.f30967x = false;
        this.f30968y = false;
        this.F = org.telegram.ui.ActionBar.k6.U8;
        this.I = 0;
        this.f30958a = i10;
        this.f30959b = g6Var;
        setClipChildren(false);
        setClipToPadding(false);
        g90 g90Var = new g90(context, g6Var);
        this.d = g90Var;
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTypeface(AndroidUtilities.bold());
        addView(g90Var, k7.c6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        k7.e6.a(g90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, k7.c6.e(34, 34, 17));
        j6 j6Var = new j6(false, false, false, false);
        this.f30961e = j6Var;
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.f28029b = 17;
        oh.b3 b3Var = new oh.b3(this, context, g6Var);
        this.f30962f = b3Var;
        addView(b3Var, k7.c6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        k7.e6.a(b3Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        j6 j6Var = this.f30961e;
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
        int i10 = org.telegram.ui.ActionBar.k6.f22053z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f30959b;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        if (this.f30967x) {
            f10 = 1.0f;
        } else {
            f10 = this.C;
        }
        return i0.a.d(f10, v02, v03);
    }

    private void setLayout(boolean z4) {
        if (this.f30968y == z4) {
            return;
        }
        this.f30968y = z4;
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        boolean z10;
        String str;
        setLayout(false);
        long j11 = this.f30966w;
        long j12 = tL_forumTopic.f20895id;
        if (j11 == j12) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30966w = j12;
        this.h.setVisibility(8);
        g90 g90Var = this.d;
        g90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f20895id == 1) {
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
            spannableStringBuilder.setSpan(new u5(tL_forumTopic.icon_emoji_id, g90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        g90Var.setText(spannableStringBuilder);
        setSelected(z4);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f30958a).isDialogMuted(j10, this.f30966w), z10);
        boolean z11 = tL_forumTopic.pinned;
        if (this.f30965s != z11) {
            this.f30965s = z11;
        }
    }

    public final void c() {
        setLayout(false);
        this.f30966w = 0L;
        this.f30967x = true;
        this.h.setVisibility(8);
        g90 g90Var = this.d;
        g90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new oq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        g90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f30965s) {
            this.f30965s = false;
        }
    }

    public final void d(boolean z4, boolean z10, boolean z11) {
        int i10;
        int i11;
        setLayout(z10);
        this.f30966w = 0L;
        this.f30967x = false;
        int i12 = 8;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z4) {
            p21 p21Var = new p21(getContext());
            p21Var.f29934b.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, this.f30959b));
            imageView.setImageDrawable(p21Var);
        }
        if (z4) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        g90 g90Var = this.d;
        g90Var.setText(string);
        if (!z4) {
            i12 = 0;
        }
        g90Var.setVisibility(i12);
        setSelected(z11);
        h();
        e(0, true, false);
        if (this.f30965s) {
            this.f30965s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e6 = this.f30964r.e(this.f30963n);
            if (e6 > 0.0f) {
                if (this.f30960c == null) {
                    this.f30960c = new dp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f30960c.a(canvas, e6);
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
        j6 j6Var = this.f30961e;
        if (i10 > 0) {
            if (z4) {
                i11 = org.telegram.ui.ActionBar.k6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.U8;
            }
            this.F = i11;
            j6Var.q(LocaleController.formatNumber(i10, ','), z10, true);
        } else {
            this.F = org.telegram.ui.ActionBar.k6.V8;
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
            ofFloat.addUpdateListener(new q21(this, 0));
            this.H.addListener(new pd0(this, 22));
            this.H.setInterpolator(new OvershootInterpolator(2.0f));
            this.H.setDuration(200L);
            this.H.start();
        }
        this.G = i10;
        this.f30962f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f30966w = -1L;
        this.h.setVisibility(8);
        g90 g90Var = this.d;
        g90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        l90 l90Var = new l90(AndroidUtilities.dp(42.0f), g90Var);
        l90Var.f28677e = 0.95f;
        spannableStringBuilder.setSpan(l90Var, 0, 1, 33);
        g90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f30965s) {
            this.f30965s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        boolean z10;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f30966w == peerDialogId) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30966w = peerDialogId;
        this.h.setVisibility(8);
        g90 g90Var = this.d;
        g90Var.setVisibility(0);
        org.telegram.ui.i5 i5Var = this.B;
        int i10 = this.f30958a;
        if (i5Var == null) {
            org.telegram.ui.i5 i5Var2 = new org.telegram.ui.i5(g90Var, 18.0f, i10);
            this.B = i5Var2;
            i5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.i5 i5Var3 = this.B;
            z8 z8Var = i5Var3.f37742c;
            z8Var.j(i5Var3.f37743e, userOrChat);
            i5Var3.f37741b.setForUserOrChat(userOrChat, z8Var);
            spannableStringBuilder.setSpan(this.B, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        g90Var.setText(TextUtils.ellipsize(spannableStringBuilder, g90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z4);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z10);
        if (this.f30965s) {
            this.f30965s = false;
        }
    }

    public long getTopicId() {
        return this.f30966w;
    }

    public final void h() {
        int textColor = getTextColor();
        g90 g90Var = this.d;
        g90Var.setTextColor(textColor);
        g90Var.setEmojiColor(textColor);
        this.f30962f.invalidate();
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
        g90 g90Var = this.d;
        g90Var.layout(dp, i16 - (g90Var.getMeasuredHeight() / 2), g90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (g90Var.getMeasuredHeight() / 2) + i16);
        float f10 = this.f30961e.d;
        oh.b3 b3Var = this.f30962f;
        if (f10 > 0.0f) {
            b3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - b3Var.getMeasuredWidth(), i16 - (b3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (b3Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = g90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            b3Var.layout(dp3 + g90Var.getMeasuredWidth() + dp2, i16 - (b3Var.getMeasuredHeight() / 2), b3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (b3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && b3Var.getLeft() != this.v) {
            b3Var.setTranslationX((-b3Var.getLeft()) + this.v);
            b3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
        this.v = b3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z4) {
        this.f30963n = z4;
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
        ofFloat.addUpdateListener(new q21(this, 1));
        this.E.addListener(new x20(11, this, z4));
        this.E.setInterpolator(pr.h);
        this.E.setDuration(320L);
        this.E.start();
    }
}
