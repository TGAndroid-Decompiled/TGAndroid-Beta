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
public final class q31 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.k5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f29783a;
    public final org.telegram.ui.ActionBar.g6 f29784b;
    public yp0 f29785c;
    public final w90 d;
    public final n6 e;
    public final ci.h3 f29786f;
    public final ImageView h;
    public boolean f29787n;
    public final d6 f29788r;
    public boolean f29789s;
    public int v;
    public long f29790w;
    public boolean f29791x;
    public boolean f29792y;

    public q31(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29788r = new d6(this, 360L, zr.h);
        this.f29789s = false;
        this.f29791x = false;
        this.f29792y = false;
        this.I = org.telegram.ui.ActionBar.k6.U8;
        this.L = 0;
        this.f29783a = i10;
        this.f29784b = g6Var;
        setClipChildren(false);
        setClipToPadding(false);
        w90 w90Var = new w90(context, g6Var);
        this.d = w90Var;
        w90Var.setTextSize(1, 14.0f);
        w90Var.setTypeface(AndroidUtilities.bold());
        addView(w90Var, w7.z5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(w90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.z5.e(34, 34, 17));
        n6 n6Var = new n6(false, false, false);
        this.e = n6Var;
        n6Var.w(AndroidUtilities.dp(11.0f));
        n6Var.x(AndroidUtilities.bold());
        n6Var.M = AndroidUtilities.displaySize.x;
        n6Var.f28797b = 17;
        ci.h3 h3Var = new ci.h3(this, context, g6Var);
        this.f29786f = h3Var;
        addView(h3Var, w7.z5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(h3Var);
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
        int i10 = org.telegram.ui.ActionBar.k6.f21589z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29784b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        if (this.f29791x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.f(f7, w02, w03);
    }

    private void setLayout(boolean z10) {
        if (this.f29792y == z10) {
            return;
        }
        this.f29792y = z10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f29790w;
        long j12 = tL_forumTopic.f20396id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29790w = j12;
        this.h.setVisibility(8);
        w90 w90Var = this.d;
        w90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f20396id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            vq vqVar = new vq(R.drawable.msg_filled_general, 0);
            vqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(vqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new y5(tL_forumTopic.icon_emoji_id, w90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        w90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f29783a).isDialogMuted(j10, this.f29790w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f29789s != z12) {
            this.f29789s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f29790w = 0L;
        this.f29791x = true;
        this.h.setVisibility(8);
        w90 w90Var = this.d;
        w90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new vq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        w90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f29789s) {
            this.f29789s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f29790w = 0L;
        this.f29791x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            m31 m31Var = new m31(getContext());
            m31Var.f28506b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.f29784b));
            imageView.setImageDrawable(m31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        w90 w90Var = this.d;
        w90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        w90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f29789s) {
            this.f29789s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e = this.f29788r.e(this.f29787n);
            if (e > 0.0f) {
                if (this.f29785c == null) {
                    this.f29785c = new yp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f29785c.a(canvas, e);
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
        n6 n6Var = this.e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.k6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.U8;
            }
            this.I = i11;
            n6Var.t(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.k6.V8;
            n6Var.t("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new n31(this, 0));
            this.K.addListener(new o31(this, 0));
            org.telegram.messenger.tl.l(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f29786f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f29790w = -1L;
        this.h.setVisibility(8);
        w90 w90Var = this.d;
        w90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ba0 ba0Var = new ba0(AndroidUtilities.dp(42.0f), w90Var);
        ba0Var.e = 0.95f;
        spannableStringBuilder.setSpan(ba0Var, 0, 1, 33);
        w90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f29789s) {
            this.f29789s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f29790w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29790w = peerDialogId;
        this.h.setVisibility(8);
        w90 w90Var = this.d;
        w90Var.setVisibility(0);
        org.telegram.ui.k5 k5Var = this.E;
        int i10 = this.f29783a;
        if (k5Var == null) {
            org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(w90Var, 18.0f, i10);
            this.E = k5Var2;
            k5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.k5 k5Var3 = this.E;
            f9 f9Var = k5Var3.f38790c;
            f9Var.j(k5Var3.e, userOrChat);
            k5Var3.f38789b.setForUserOrChat(userOrChat, f9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        w90Var.setText(TextUtils.ellipsize(spannableStringBuilder, w90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z11);
        if (this.f29789s) {
            this.f29789s = false;
        }
    }

    public long getTopicId() {
        return this.f29790w;
    }

    public final void h() {
        int textColor = getTextColor();
        w90 w90Var = this.d;
        w90Var.setTextColor(textColor);
        w90Var.setEmojiColor(textColor);
        this.f29786f.invalidate();
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
        w90 w90Var = this.d;
        w90Var.layout(dp, i16 - (w90Var.getMeasuredHeight() / 2), w90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (w90Var.getMeasuredHeight() / 2) + i16);
        int i17 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        ci.h3 h3Var = this.f29786f;
        if (i17 > 0) {
            h3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - h3Var.getMeasuredWidth(), i16 - (h3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (h3Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = w90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            h3Var.layout(dp3 + w90Var.getMeasuredWidth() + dp2, i16 - (h3Var.getMeasuredHeight() / 2), h3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (h3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && h3Var.getLeft() != this.v) {
            h3Var.setTranslationX((-h3Var.getLeft()) + this.v);
            h3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(zr.h).start();
        }
        this.v = h3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f29787n = z10;
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
        ofFloat.addUpdateListener(new n31(this, 1));
        this.H.addListener(new org.telegram.ui.ho(22, this, z10));
        this.H.setInterpolator(zr.h);
        this.H.setDuration(320L);
        this.H.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f29786f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof m31)) {
                ((m31) imageView.getDrawable()).f28506b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.f29784b));
                imageView.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
