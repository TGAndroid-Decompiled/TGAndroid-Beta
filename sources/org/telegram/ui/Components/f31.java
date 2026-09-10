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
public final class f31 extends FrameLayout {
    public org.telegram.ui.g5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f22835a;
    public final org.telegram.ui.ActionBar.f6 f22836b;
    public jp0 f22837c;
    public final m90 d;
    public final n6 e;
    public final org.telegram.ui.u7 f22838f;
    public final ImageView h;
    public boolean f22839n;
    public final d6 f22840r;
    public boolean f22841s;
    public int v;
    public long f22842w;
    public boolean f22843x;
    public boolean f22844y;

    public f31(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22840r = new d6(this, 360L, wr.h);
        this.f22841s = false;
        this.f22843x = false;
        this.f22844y = false;
        this.I = org.telegram.ui.ActionBar.j6.U8;
        this.L = 0;
        this.f22835a = i10;
        this.f22836b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        m90 m90Var = new m90(context, f6Var);
        this.d = m90Var;
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTypeface(AndroidUtilities.bold());
        addView(m90Var, w7.a6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.c6.a(m90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.a6.e(34, 34, 17));
        n6 n6Var = new n6(false, false, false, false);
        this.e = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.f25425b = 17;
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, context, f6Var);
        this.f22838f = u7Var;
        addView(u7Var, w7.a6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.c6.a(u7Var);
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
        int i10 = org.telegram.ui.ActionBar.j6.f18325z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22836b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        if (this.f22843x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f22844y == z10) {
            return;
        }
        this.f22844y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f22842w;
        long j11 = tL_forumTopic.f17247id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22842w = j11;
        this.h.setVisibility(8);
        m90 m90Var = this.d;
        m90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f17247id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            uq uqVar = new uq(R.drawable.msg_filled_general, 0);
            uqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(uqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new y5(tL_forumTopic.icon_emoji_id, m90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        m90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f22835a).isDialogMuted(j3, this.f22842w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f22841s != z12) {
            this.f22841s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f22842w = 0L;
        this.f22843x = true;
        this.h.setVisibility(8);
        m90 m90Var = this.d;
        m90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new uq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        m90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f22841s) {
            this.f22841s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f22842w = 0L;
        this.f22843x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            c31 c31Var = new c31(getContext());
            c31Var.f21985b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f22836b));
            imageView.setImageDrawable(c31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        m90 m90Var = this.d;
        m90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        m90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f22841s) {
            this.f22841s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float e = this.f22840r.e(this.f22839n);
            if (e > 0.0f) {
                if (this.f22837c == null) {
                    this.f22837c = new jp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f22837c.a(canvas, e);
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
            ofFloat.addUpdateListener(new d31(this, 0));
            this.K.addListener(new zn0(this, 13));
            this.K.setInterpolator(new OvershootInterpolator(2.0f));
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f22838f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f22842w = -1L;
        this.h.setVisibility(8);
        m90 m90Var = this.d;
        m90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        r90 r90Var = new r90(AndroidUtilities.dp(42.0f), m90Var);
        r90Var.e = 0.95f;
        spannableStringBuilder.setSpan(r90Var, 0, 1, 33);
        m90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f22841s) {
            this.f22841s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f22842w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22842w = peerDialogId;
        this.h.setVisibility(8);
        m90 m90Var = this.d;
        m90Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.E;
        int i10 = this.f22835a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(m90Var, 18.0f, i10);
            this.E = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.E;
            g9 g9Var = g5Var3.f32997c;
            g9Var.j(g5Var3.e, userOrChat);
            g5Var3.f32996b.setForUserOrChat(userOrChat, g9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        m90Var.setText(TextUtils.ellipsize(spannableStringBuilder, m90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.f22841s) {
            this.f22841s = false;
        }
    }

    public long getTopicId() {
        return this.f22842w;
    }

    public final void h() {
        int textColor = getTextColor();
        m90 m90Var = this.d;
        m90Var.setTextColor(textColor);
        m90Var.setEmojiColor(textColor);
        this.f22838f.invalidate();
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
        m90 m90Var = this.d;
        m90Var.layout(dp, i16 - (m90Var.getMeasuredHeight() / 2), m90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (m90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        org.telegram.ui.u7 u7Var = this.f22838f;
        if (f7 > 0.0f) {
            u7Var.layout((i14 - AndroidUtilities.dp(11.0f)) - u7Var.getMeasuredWidth(), i16 - (u7Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (u7Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = m90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            u7Var.layout(dp3 + m90Var.getMeasuredWidth() + dp2, i16 - (u7Var.getMeasuredHeight() / 2), u7Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (u7Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && u7Var.getLeft() != this.v) {
            u7Var.setTranslationX((-u7Var.getLeft()) + this.v);
            u7Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(wr.h).start();
        }
        this.v = u7Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f22839n = z10;
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
        ofFloat.addUpdateListener(new d31(this, 1));
        this.H.addListener(new yo(17, this, z10));
        this.H.setInterpolator(wr.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
