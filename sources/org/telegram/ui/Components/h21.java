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
public final class h21 extends FrameLayout {
    public org.telegram.ui.g5 A;
    public float B;
    public boolean C;
    public ValueAnimator D;
    public int E;
    public int F;
    public ValueAnimator G;
    public int H;
    public final int f29037a;
    public final org.telegram.ui.ActionBar.c6 f29038b;
    public so0 f29039c;
    public final y80 d;
    public final n6 f29040e;
    public final lh.z2 f29041f;
    public final ImageView h;
    public boolean f29042n;
    public final d6 f29043r;
    public boolean f29044s;
    public int v;
    public long f29045w;
    public boolean f29046x;
    public boolean f29047y;

    public h21(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f29043r = new d6(this, 360L, jr.h);
        this.f29044s = false;
        this.f29046x = false;
        this.f29047y = false;
        this.E = org.telegram.ui.ActionBar.g6.U8;
        this.H = 0;
        this.f29037a = i10;
        this.f29038b = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        y80 y80Var = new y80(context, c6Var);
        this.d = y80Var;
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTypeface(AndroidUtilities.bold());
        addView(y80Var, i7.f6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        i7.h6.a(y80Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, i7.f6.e(34, 34, 17));
        n6 n6Var = new n6(false, false, false, false);
        this.f29040e = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.f30862b = 17;
        lh.z2 z2Var = new lh.z2(this, context, c6Var);
        this.f29041f = z2Var;
        addView(z2Var, i7.f6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        i7.h6.a(z2Var);
        h();
    }

    private int getMeasuringWidth() {
        int i10;
        n6 n6Var = this.f29040e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), n6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (n6Var.d > 0.0f) {
            i10 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i10 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i10 + this.H;
    }

    public int getTextColor() {
        float f9;
        int i10 = org.telegram.ui.ActionBar.g6.f23450z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f29038b;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        if (this.f29046x) {
            f9 = 1.0f;
        } else {
            f9 = this.B;
        }
        return i0.a.d(f9, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f29047y == z10) {
            return;
        }
        this.f29047y = z10;
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f29045w;
        long j12 = tL_forumTopic.f22444id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29045w = j12;
        this.h.setVisibility(8);
        y80 y80Var = this.d;
        y80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f22444id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            iq iqVar = new iq(R.drawable.msg_filled_general, 0);
            iqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(iqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new y5(tL_forumTopic.icon_emoji_id, y80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        y80Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f29037a).isDialogMuted(j10, this.f29045w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f29044s != z12) {
            this.f29044s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f29045w = 0L;
        this.f29046x = true;
        this.h.setVisibility(8);
        y80 y80Var = this.d;
        y80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new iq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        y80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f29044s) {
            this.f29044s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f29045w = 0L;
        this.f29046x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            e21 e21Var = new e21(getContext());
            e21Var.f27913b.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f29038b));
            imageView.setImageDrawable(e21Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        y80 y80Var = this.d;
        y80Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        y80Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f29044s) {
            this.f29044s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e10 = this.f29043r.e(this.f29042n);
            if (e10 > 0.0f) {
                if (this.f29039c == null) {
                    this.f29039c = new so0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f29039c.a(canvas, e10);
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
        n6 n6Var = this.f29040e;
        if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.g6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.U8;
            }
            this.E = i11;
            n6Var.q(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.E = org.telegram.ui.ActionBar.g6.V8;
            n6Var.q("", z11, true);
        }
        if (z11 && this.F < i10) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new f21(this, 0));
            this.G.addListener(new p11(this, 1));
            this.G.setInterpolator(new OvershootInterpolator(2.0f));
            this.G.setDuration(200L);
            this.G.start();
        }
        this.F = i10;
        this.f29041f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f29045w = -1L;
        this.h.setVisibility(8);
        y80 y80Var = this.d;
        y80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        d90 d90Var = new d90(AndroidUtilities.dp(42.0f), y80Var);
        d90Var.f27720e = 0.95f;
        spannableStringBuilder.setSpan(d90Var, 0, 1, 33);
        y80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f29044s) {
            this.f29044s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f29045w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29045w = peerDialogId;
        this.h.setVisibility(8);
        y80 y80Var = this.d;
        y80Var.setVisibility(0);
        org.telegram.ui.g5 g5Var = this.A;
        int i10 = this.f29037a;
        if (g5Var == null) {
            org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(y80Var, 18.0f, i10);
            this.A = g5Var2;
            g5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.g5 g5Var3 = this.A;
            e9 e9Var = g5Var3.f38456c;
            e9Var.j(g5Var3.f38457e, userOrChat);
            g5Var3.f38455b.setForUserOrChat(userOrChat, e9Var);
            spannableStringBuilder.setSpan(this.A, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        y80Var.setText(TextUtils.ellipsize(spannableStringBuilder, y80Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z11);
        if (this.f29044s) {
            this.f29044s = false;
        }
    }

    public long getTopicId() {
        return this.f29045w;
    }

    public final void h() {
        int textColor = getTextColor();
        y80 y80Var = this.d;
        y80Var.setTextColor(textColor);
        y80Var.setEmojiColor(textColor);
        this.f29041f.invalidate();
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
        y80 y80Var = this.d;
        y80Var.layout(dp, i16 - (y80Var.getMeasuredHeight() / 2), y80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (y80Var.getMeasuredHeight() / 2) + i16);
        float f9 = this.f29040e.d;
        lh.z2 z2Var = this.f29041f;
        if (f9 > 0.0f) {
            z2Var.layout((i14 - AndroidUtilities.dp(11.0f)) - z2Var.getMeasuredWidth(), i16 - (z2Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (z2Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = y80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            z2Var.layout(dp3 + y80Var.getMeasuredWidth() + dp2, i16 - (z2Var.getMeasuredHeight() / 2), z2Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (z2Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && z2Var.getLeft() != this.v) {
            z2Var.setTranslationX((-z2Var.getLeft()) + this.v);
            z2Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(jr.h).start();
        }
        this.v = z2Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f29042n = z10;
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f9;
        if (this.C == z10) {
            return;
        }
        this.C = z10;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.B;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new f21(this, 1));
        this.D.addListener(new z9(21, this, z10));
        this.D.setInterpolator(jr.h);
        this.D.setDuration(320L);
        this.D.start();
    }
}
