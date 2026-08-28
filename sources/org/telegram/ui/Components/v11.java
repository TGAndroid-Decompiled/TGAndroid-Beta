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
public final class v11 extends FrameLayout {
    public org.telegram.ui.f5 A;
    public float B;
    public boolean C;
    public ValueAnimator D;
    public int E;
    public int F;
    public ValueAnimator G;
    public int H;
    public final int f33226a;
    public final org.telegram.ui.ActionBar.b6 f33227b;
    public ho0 f33228c;
    public final l80 d;
    public final i6 f33229e;
    public final ih.b3 f33230f;
    public final ImageView h;
    public boolean f33231n;
    public final y5 f33232r;
    public boolean f33233s;
    public int v;
    public long f33234w;
    public boolean f33235x;
    public boolean f33236y;

    public v11(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f33232r = new y5(this, 360L, gr.h);
        this.f33233s = false;
        this.f33235x = false;
        this.f33236y = false;
        this.E = org.telegram.ui.ActionBar.f6.U8;
        this.H = 0;
        this.f33226a = i9;
        this.f33227b = b6Var;
        setClipChildren(false);
        setClipToPadding(false);
        l80 l80Var = new l80(context, b6Var);
        this.d = l80Var;
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTypeface(AndroidUtilities.bold());
        addView(l80Var, g7.e6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        g7.g6.a(l80Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, g7.e6.e(34, 34, 17));
        i6 i6Var = new i6(false, false, false, false);
        this.f33229e = i6Var;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.f29333b = 17;
        ih.b3 b3Var = new ih.b3(this, context, b6Var);
        this.f33230f = b3Var;
        addView(b3Var, g7.e6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        g7.g6.a(b3Var);
        h();
    }

    private int getMeasuringWidth() {
        int i9;
        i6 i6Var = this.f33229e;
        int max = (int) Math.max(AndroidUtilities.dp(16.66f), i6Var.d + AndroidUtilities.dp(10.0f));
        int measuredWidth = this.d.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
        if (i6Var.d > 0.0f) {
            i9 = AndroidUtilities.dp(4.66f) + max;
        } else {
            i9 = 0;
        }
        return AndroidUtilities.dp(11.0f) + measuredWidth + i9 + this.H;
    }

    public int getTextColor() {
        float f10;
        int i9 = org.telegram.ui.ActionBar.f6.f23386z6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f33227b;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        if (this.f33235x) {
            f10 = 1.0f;
        } else {
            f10 = this.B;
        }
        return i0.a.d(f10, v02, v03);
    }

    private void setLayout(boolean z10) {
        if (this.f33236y == z10) {
            return;
        }
        this.f33236y = z10;
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f33234w;
        long j12 = tL_forumTopic.f22432id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33234w = j12;
        this.h.setVisibility(8);
        l80 l80Var = this.d;
        l80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f22432id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            eq eqVar = new eq(R.drawable.msg_filled_general, 0);
            eqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(eqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new t5(tL_forumTopic.icon_emoji_id, l80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        l80Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f33226a).isDialogMuted(j10, this.f33234w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f33233s != z12) {
            this.f33233s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f33234w = 0L;
        this.f33235x = true;
        this.h.setVisibility(8);
        l80 l80Var = this.d;
        l80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new eq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        l80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f33233s) {
            this.f33233s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i9;
        int i10;
        setLayout(z11);
        this.f33234w = 0L;
        this.f33235x = false;
        int i11 = 8;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i9);
        if (z10) {
            s11 s11Var = new s11(getContext());
            s11Var.f32335b.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.f33227b));
            imageView.setImageDrawable(s11Var);
        }
        if (z10) {
            i10 = R.string.BotForumNewTopic;
        } else {
            i10 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i10);
        l80 l80Var = this.d;
        l80Var.setText(string);
        if (!z10) {
            i11 = 0;
        }
        l80Var.setVisibility(i11);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f33233s) {
            this.f33233s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e10 = this.f33232r.e(this.f33231n);
            if (e10 > 0.0f) {
                if (this.f33228c == null) {
                    this.f33228c = new ho0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f33228c.a(canvas, e10);
                canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(int i9, boolean z10, boolean z11) {
        int i10;
        i6 i6Var = this.f33229e;
        if (i9 > 0) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.f6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.U8;
            }
            this.E = i10;
            i6Var.q(LocaleController.formatNumber(i9, ','), z11, true);
        } else {
            this.E = org.telegram.ui.ActionBar.f6.V8;
            i6Var.q("", z11, true);
        }
        if (z11 && this.F < i9) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new t11(this, 0));
            this.G.addListener(new r60(this, 29));
            this.G.setInterpolator(new OvershootInterpolator(2.0f));
            this.G.setDuration(200L);
            this.G.start();
        }
        this.F = i9;
        this.f33230f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f33234w = -1L;
        this.h.setVisibility(8);
        l80 l80Var = this.d;
        l80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        q80 q80Var = new q80(AndroidUtilities.dp(42.0f), l80Var);
        q80Var.f31862e = 0.95f;
        spannableStringBuilder.setSpan(q80Var, 0, 1, 33);
        l80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f33233s) {
            this.f33233s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f33234w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33234w = peerDialogId;
        this.h.setVisibility(8);
        l80 l80Var = this.d;
        l80Var.setVisibility(0);
        org.telegram.ui.f5 f5Var = this.A;
        int i9 = this.f33226a;
        if (f5Var == null) {
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(l80Var, 18.0f, i9);
            this.A = f5Var2;
            f5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i9).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.f5 f5Var3 = this.A;
            z8 z8Var = f5Var3.f38138c;
            z8Var.j(f5Var3.f38139e, userOrChat);
            f5Var3.f38137b.setForUserOrChat(userOrChat, z8Var);
            spannableStringBuilder.setSpan(this.A, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        l80Var.setText(TextUtils.ellipsize(spannableStringBuilder, l80Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i9).isDialogMuted(j10, peerDialogId), z11);
        if (this.f33233s) {
            this.f33233s = false;
        }
    }

    public long getTopicId() {
        return this.f33234w;
    }

    public final void h() {
        int textColor = getTextColor();
        l80 l80Var = this.d;
        l80Var.setTextColor(textColor);
        l80Var.setEmojiColor(textColor);
        this.f33230f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        ImageView imageView = this.h;
        int measuredWidth = (i13 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int dp = AndroidUtilities.dp(11.0f);
        int i15 = i14 / 2;
        l80 l80Var = this.d;
        l80Var.layout(dp, i15 - (l80Var.getMeasuredHeight() / 2), l80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (l80Var.getMeasuredHeight() / 2) + i15);
        float f10 = this.f33229e.d;
        ih.b3 b3Var = this.f33230f;
        if (f10 > 0.0f) {
            b3Var.layout((i13 - AndroidUtilities.dp(11.0f)) - b3Var.getMeasuredWidth(), i15 - (b3Var.getMeasuredHeight() / 2), i13 - AndroidUtilities.dp(11.0f), (b3Var.getMeasuredHeight() / 2) + i15);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = l80Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            b3Var.layout(dp3 + l80Var.getMeasuredWidth() + dp2, i15 - (b3Var.getMeasuredHeight() / 2), b3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (b3Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.v != 0 && b3Var.getLeft() != this.v) {
            b3Var.setTranslationX((-b3Var.getLeft()) + this.v);
            b3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        this.v = b3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.d.measure(i9, i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f33231n = z10;
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f10;
        if (this.C == z10) {
            return;
        }
        this.C = z10;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.B;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new t11(this, 1));
        this.D.addListener(new u9(21, this, z10));
        this.D.setInterpolator(gr.h);
        this.D.setDuration(320L);
        this.D.start();
    }
}
