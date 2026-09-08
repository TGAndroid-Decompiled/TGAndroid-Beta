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
    public org.telegram.ui.g5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f29924a;
    public final org.telegram.ui.ActionBar.f6 f29925b;
    public zo0 f29926c;
    public final d90 d;
    public final p6 f29927e;
    public final bi.a4 f29928f;
    public final ImageView h;
    public boolean f29929n;
    public final e6 f29930r;
    public boolean f29931s;
    public int v;
    public long f29932w;
    public boolean f29933x;
    public boolean f29934y;

    public r21(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29930r = new e6(this, 360L, pr.h);
        this.f29931s = false;
        this.f29933x = false;
        this.f29934y = false;
        this.I = org.telegram.ui.ActionBar.j6.U8;
        this.L = 0;
        this.f29924a = i10;
        this.f29925b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        d90 d90Var = new d90(context, f6Var);
        this.d = d90Var;
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTypeface(AndroidUtilities.bold());
        addView(d90Var, w7.x5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.z5.a(d90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.x5.e(34, 34, 17));
        p6 p6Var = new p6(false, false, false, false);
        this.f29927e = p6Var;
        p6Var.t(AndroidUtilities.dp(11.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var.f29312b = 17;
        bi.a4 a4Var = new bi.a4(this, context, f6Var);
        this.f29928f = a4Var;
        addView(a4Var, w7.x5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.z5.a(a4Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        p6 p6Var = this.f29927e;
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
        int i10 = org.telegram.ui.ActionBar.j6.f21088z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29925b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        if (this.f29933x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f29934y == z10) {
            return;
        }
        this.f29934y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f29932w;
        long j11 = tL_forumTopic.f19948id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29932w = j11;
        this.h.setVisibility(8);
        d90 d90Var = this.d;
        d90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f19948id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            nq nqVar = new nq(R.drawable.msg_filled_general, 0);
            nqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(nqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new z5(tL_forumTopic.icon_emoji_id, d90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        d90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f29924a).isDialogMuted(j3, this.f29932w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f29931s != z12) {
            this.f29931s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f29932w = 0L;
        this.f29933x = true;
        this.h.setVisibility(8);
        d90 d90Var = this.d;
        d90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new nq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        d90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f29931s) {
            this.f29931s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f29932w = 0L;
        this.f29933x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            o21 o21Var = new o21(getContext());
            o21Var.f28967b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f29925b));
            imageView.setImageDrawable(o21Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        d90 d90Var = this.d;
        d90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        d90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f29931s) {
            this.f29931s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float e7 = this.f29930r.e(this.f29929n);
            if (e7 > 0.0f) {
                if (this.f29926c == null) {
                    this.f29926c = new zo0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f29926c.a(canvas, e7);
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
        p6 p6Var = this.f29927e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.j6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.U8;
            }
            this.I = i11;
            p6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.j6.V8;
            p6Var.q("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new p21(this, 0));
            this.K.addListener(new r80(this, 26));
            this.K.setInterpolator(new OvershootInterpolator(2.0f));
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f29928f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f29932w = -1L;
        this.h.setVisibility(8);
        d90 d90Var = this.d;
        d90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        i90 i90Var = new i90(AndroidUtilities.dp(42.0f), d90Var);
        i90Var.f27078e = 0.95f;
        spannableStringBuilder.setSpan(i90Var, 0, 1, 33);
        d90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f29931s) {
            this.f29931s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f29932w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29932w = peerDialogId;
        this.h.setVisibility(8);
        d90 d90Var = this.d;
        d90Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.E;
        int i10 = this.f29924a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(d90Var, 18.0f, i10);
            this.E = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.E;
            i9 i9Var = g5Var3.f36590c;
            i9Var.j(g5Var3.f36591e, userOrChat);
            g5Var3.f36589b.setForUserOrChat(userOrChat, i9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        d90Var.setText(TextUtils.ellipsize(spannableStringBuilder, d90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.f29931s) {
            this.f29931s = false;
        }
    }

    public long getTopicId() {
        return this.f29932w;
    }

    public final void h() {
        int textColor = getTextColor();
        d90 d90Var = this.d;
        d90Var.setTextColor(textColor);
        d90Var.setEmojiColor(textColor);
        this.f29928f.invalidate();
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
        d90 d90Var = this.d;
        d90Var.layout(dp, i16 - (d90Var.getMeasuredHeight() / 2), d90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (d90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.f29927e.d;
        bi.a4 a4Var = this.f29928f;
        if (f7 > 0.0f) {
            a4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - a4Var.getMeasuredWidth(), i16 - (a4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (a4Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = d90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            a4Var.layout(dp3 + d90Var.getMeasuredWidth() + dp2, i16 - (a4Var.getMeasuredHeight() / 2), a4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (a4Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && a4Var.getLeft() != this.v) {
            a4Var.setTranslationX((-a4Var.getLeft()) + this.v);
            a4Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
        this.v = a4Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f29929n = z10;
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
        ofFloat.addUpdateListener(new p21(this, 1));
        this.H.addListener(new org.telegram.ui.to(22, this, z10));
        this.H.setInterpolator(pr.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
