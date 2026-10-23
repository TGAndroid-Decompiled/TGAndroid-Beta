package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r31 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.k5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f30062a;
    public final org.telegram.ui.ActionBar.g6 f30063b;
    public zp0 f30064c;
    public final y90 d;
    public final p6 e;
    public final ci.h3 f30065f;
    public final ImageView h;
    public boolean f30066n;
    public final f6 f30067r;
    public boolean f30068s;
    public int v;
    public long f30069w;
    public boolean f30070x;
    public boolean f30071y;

    public r31(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30067r = new f6(this, 360L, bs.h);
        this.f30068s = false;
        this.f30070x = false;
        this.f30071y = false;
        this.I = org.telegram.ui.ActionBar.k6.U8;
        this.L = 0;
        this.f30062a = i10;
        this.f30063b = g6Var;
        setClipChildren(false);
        setClipToPadding(false);
        y90 y90Var = new y90(context, g6Var);
        this.d = y90Var;
        y90Var.setTextSize(1, 14.0f);
        y90Var.setTypeface(AndroidUtilities.bold());
        addView(y90Var, w7.z5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(y90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.z5.e(34, 34, 17));
        p6 p6Var = new p6(false, false, false);
        this.e = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.f29437b = 17;
        ci.h3 h3Var = new ci.h3(this, context, g6Var);
        this.f30065f = h3Var;
        addView(h3Var, w7.z5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(h3Var);
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
        int i10 = org.telegram.ui.ActionBar.k6.f21588z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f30063b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        if (this.f30070x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.f(f7, w02, w03);
    }

    private void setLayout(boolean z10) {
        if (this.f30071y == z10) {
            return;
        }
        this.f30071y = z10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f30069w;
        long j12 = tL_forumTopic.f20395id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30069w = j12;
        this.h.setVisibility(8);
        y90 y90Var = this.d;
        y90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f20395id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            xq xqVar = new xq(R.drawable.msg_filled_general, 0);
            xqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(xqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new a6(tL_forumTopic.icon_emoji_id, y90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        y90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f30062a).isDialogMuted(j10, this.f30069w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f30068s != z12) {
            this.f30068s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f30069w = 0L;
        this.f30070x = true;
        this.h.setVisibility(8);
        y90 y90Var = this.d;
        y90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new xq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        y90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f30068s) {
            this.f30068s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f30069w = 0L;
        this.f30070x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            n31 n31Var = new n31(getContext());
            n31Var.f28822b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.f30063b));
            imageView.setImageDrawable(n31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        y90 y90Var = this.d;
        y90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        y90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f30068s) {
            this.f30068s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e = this.f30067r.e(this.f30066n);
            if (e > 0.0f) {
                if (this.f30064c == null) {
                    this.f30064c = new zp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f30064c.a(canvas, e);
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
                i11 = org.telegram.ui.ActionBar.k6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.U8;
            }
            this.I = i11;
            p6Var.t(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.k6.V8;
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
            ofFloat.addUpdateListener(new o31(this, 0));
            this.K.addListener(new p31(this, 0));
            org.telegram.messenger.sl.l(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f30065f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f30069w = -1L;
        this.h.setVisibility(8);
        y90 y90Var = this.d;
        y90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        da0 da0Var = new da0(AndroidUtilities.dp(42.0f), y90Var);
        da0Var.e = 0.95f;
        spannableStringBuilder.setSpan(da0Var, 0, 1, 33);
        y90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f30068s) {
            this.f30068s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f30069w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30069w = peerDialogId;
        this.h.setVisibility(8);
        y90 y90Var = this.d;
        y90Var.setVisibility(0);
        org.telegram.ui.k5 k5Var = this.E;
        int i10 = this.f30062a;
        if (k5Var == null) {
            org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(y90Var, 18.0f, i10);
            this.E = k5Var2;
            k5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.k5 k5Var3 = this.E;
            h9 h9Var = k5Var3.f38817c;
            h9Var.j(k5Var3.e, userOrChat);
            k5Var3.f38816b.setForUserOrChat(userOrChat, h9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        y90Var.setText(TextUtils.ellipsize(spannableStringBuilder, y90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z11);
        if (this.f30068s) {
            this.f30068s = false;
        }
    }

    public long getTopicId() {
        return this.f30069w;
    }

    public final void h() {
        int textColor = getTextColor();
        y90 y90Var = this.d;
        y90Var.setTextColor(textColor);
        y90Var.setEmojiColor(textColor);
        this.f30065f.invalidate();
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
        y90 y90Var = this.d;
        y90Var.layout(dp, i16 - (y90Var.getMeasuredHeight() / 2), y90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (y90Var.getMeasuredHeight() / 2) + i16);
        int i17 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        ci.h3 h3Var = this.f30065f;
        if (i17 > 0) {
            h3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - h3Var.getMeasuredWidth(), i16 - (h3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (h3Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = y90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            h3Var.layout(dp3 + y90Var.getMeasuredWidth() + dp2, i16 - (h3Var.getMeasuredHeight() / 2), h3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (h3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && h3Var.getLeft() != this.v) {
            h3Var.setTranslationX((-h3Var.getLeft()) + this.v);
            h3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        this.v = h3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f30066n = z10;
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
        ofFloat.addUpdateListener(new o31(this, 1));
        this.H.addListener(new org.telegram.ui.ho(22, this, z10));
        this.H.setInterpolator(bs.h);
        this.H.setDuration(320L);
        this.H.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f30065f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof n31)) {
                ((n31) imageView.getDrawable()).f28822b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.f30063b));
                imageView.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
