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
public final class g31 extends FrameLayout {
    public org.telegram.ui.g5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f24240a;
    public final org.telegram.ui.ActionBar.f6 f24241b;
    public lp0 f24242c;
    public final k90 d;
    public final n6 e;
    public final ai.n4 f24243f;
    public final ImageView h;
    public boolean f24244n;
    public final d6 f24245r;
    public boolean f24246s;
    public int v;
    public long f24247w;
    public boolean f24248x;
    public boolean f24249y;

    public g31(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24245r = new d6(this, 360L, qr.h);
        this.f24246s = false;
        this.f24248x = false;
        this.f24249y = false;
        this.I = org.telegram.ui.ActionBar.j6.U8;
        this.L = 0;
        this.f24240a = i10;
        this.f24241b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        k90 k90Var = new k90(context, f6Var);
        this.d = k90Var;
        k90Var.setTextSize(1, 14.0f);
        k90Var.setTypeface(AndroidUtilities.bold());
        addView(k90Var, w7.y5.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(k90Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.y5.e(34, 34, 17));
        n6 n6Var = new n6(false, false, false, false);
        this.e = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.f26575b = 17;
        ai.n4 n4Var = new ai.n4(this, context, f6Var);
        this.f24243f = n4Var;
        addView(n4Var, w7.y5.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.b6.a(n4Var);
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
        int i10 = org.telegram.ui.ActionBar.j6.f19496z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24241b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        if (this.f24248x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.d(f7, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f24249y == z10) {
            return;
        }
        this.f24249y = z10;
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j10 = this.f24247w;
        long j11 = tL_forumTopic.f18380id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24247w = j11;
        this.h.setVisibility(8);
        k90 k90Var = this.d;
        k90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f18380id == 1) {
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
            spannableStringBuilder.setSpan(new y5(tL_forumTopic.icon_emoji_id, k90Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        k90Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f24240a).isDialogMuted(j3, this.f24247w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f24246s != z12) {
            this.f24246s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f24247w = 0L;
        this.f24248x = true;
        this.h.setVisibility(8);
        k90 k90Var = this.d;
        k90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new oq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        k90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f24246s) {
            this.f24246s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f24247w = 0L;
        this.f24248x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            d31 d31Var = new d31(getContext());
            d31Var.f23486b.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f24241b));
            imageView.setImageDrawable(d31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        k90 k90Var = this.d;
        k90Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        k90Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f24246s) {
            this.f24246s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d) {
            canvas.save();
            float e = this.f24245r.e(this.f24244n);
            if (e > 0.0f) {
                if (this.f24242c == null) {
                    this.f24242c = new lp0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f24242c.a(canvas, e);
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
            ofFloat.addUpdateListener(new e31(this, 0));
            this.K.addListener(new dd0(this, 24));
            this.K.setInterpolator(new OvershootInterpolator(2.0f));
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f24243f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f24247w = -1L;
        this.h.setVisibility(8);
        k90 k90Var = this.d;
        k90Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        p90 p90Var = new p90(AndroidUtilities.dp(42.0f), k90Var);
        p90Var.e = 0.95f;
        spannableStringBuilder.setSpan(p90Var, 0, 1, 33);
        k90Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f24246s) {
            this.f24246s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f24247w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24247w = peerDialogId;
        this.h.setVisibility(8);
        k90 k90Var = this.d;
        k90Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.E;
        int i10 = this.f24240a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(k90Var, 18.0f, i10);
            this.E = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.E;
            g9 g9Var = g5Var3.f33801c;
            g9Var.j(g5Var3.e, userOrChat);
            g5Var3.f33800b.setForUserOrChat(userOrChat, g9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        k90Var.setText(TextUtils.ellipsize(spannableStringBuilder, k90Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j3, peerDialogId), z11);
        if (this.f24246s) {
            this.f24246s = false;
        }
    }

    public long getTopicId() {
        return this.f24247w;
    }

    public final void h() {
        int textColor = getTextColor();
        k90 k90Var = this.d;
        k90Var.setTextColor(textColor);
        k90Var.setEmojiColor(textColor);
        this.f24243f.invalidate();
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
        k90 k90Var = this.d;
        k90Var.layout(dp, i16 - (k90Var.getMeasuredHeight() / 2), k90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (k90Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        ai.n4 n4Var = this.f24243f;
        if (f7 > 0.0f) {
            n4Var.layout((i14 - AndroidUtilities.dp(11.0f)) - n4Var.getMeasuredWidth(), i16 - (n4Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (n4Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = k90Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            n4Var.layout(dp3 + k90Var.getMeasuredWidth() + dp2, i16 - (n4Var.getMeasuredHeight() / 2), n4Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (n4Var.getMeasuredHeight() / 2) + i16);
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
        this.f24244n = z10;
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
        ofFloat.addUpdateListener(new e31(this, 1));
        this.H.addListener(new ba(21, this, z10));
        this.H.setInterpolator(qr.h);
        this.H.setDuration(320L);
        this.H.start();
    }
}
