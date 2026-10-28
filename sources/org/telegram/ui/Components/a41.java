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
public final class a41 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.j5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int f26427a;
    public final org.telegram.ui.ActionBar.u6 f26428b;
    public fq0 f26429c;
    public final aa0 d;
    public final r6 e;
    public final di.h3 f26430f;
    public final ImageView h;
    public boolean f26431n;
    public final h6 f26432r;
    public boolean f26433s;
    public int v;
    public long f26434w;
    public boolean f26435x;
    public boolean f26436y;

    public a41(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f26432r = new h6(this, 360L, ds.h);
        this.f26433s = false;
        this.f26435x = false;
        this.f26436y = false;
        this.I = org.telegram.ui.ActionBar.y6.U8;
        this.L = 0;
        this.f26427a = i10;
        this.f26428b = u6Var;
        setClipChildren(false);
        setClipToPadding(false);
        aa0 aa0Var = new aa0(context, u6Var);
        this.d = aa0Var;
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setTypeface(AndroidUtilities.bold());
        addView(aa0Var, kb1.h(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        kb1.b(aa0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, kb1.i(34, 34, 17));
        r6 r6Var = new r6(false, false, false);
        this.e = r6Var;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.f32142b = 17;
        di.h3 h3Var = new di.h3(this, context, u6Var);
        this.f26430f = h3Var;
        addView(h3Var, kb1.h(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        kb1.b(h3Var);
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
        int i10 = org.telegram.ui.ActionBar.y6.f23768z6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f26428b;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
        if (this.f26435x) {
            f7 = 1.0f;
        } else {
            f7 = this.F;
        }
        return i0.a.f(f7, w02, w03);
    }

    private void setLayout(boolean z10) {
        if (this.f26436y == z10) {
            return;
        }
        this.f26436y = z10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        String str;
        setLayout(false);
        long j11 = this.f26434w;
        long j12 = tL_forumTopic.f22080id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26434w = j12;
        this.h.setVisibility(8);
        aa0 aa0Var = this.d;
        aa0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.f22080id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            if (tL_forumTopic.hidden) {
                str = "\u200b";
            } else {
                str = " ";
            }
            spannableStringBuilder.append((CharSequence) str);
            zq zqVar = new zq(R.drawable.msg_filled_general, 0);
            zqVar.setScale(0.66f, 0.66f);
            spannableStringBuilder.setSpan(zqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new c6(tL_forumTopic.icon_emoji_id, aa0Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        aa0Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, MessagesController.getInstance(this.f26427a).isDialogMuted(j10, this.f26434w), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.f26433s != z12) {
            this.f26433s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.f26434w = 0L;
        this.f26435x = true;
        this.h.setVisibility(8);
        aa0 aa0Var = this.d;
        aa0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new zq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        aa0Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f26433s) {
            this.f26433s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.f26434w = 0L;
        this.f26435x = false;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            x31 x31Var = new x31(getContext());
            x31Var.f34657b.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f26428b));
            imageView.setImageDrawable(x31Var);
        }
        if (z10) {
            i11 = R.string.BotForumNewTopic;
        } else {
            i11 = R.string.AllTopicsShort;
        }
        String string = LocaleController.getString(i11);
        aa0 aa0Var = this.d;
        aa0Var.setText(string);
        if (!z10) {
            i12 = 0;
        }
        aa0Var.setVisibility(i12);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.f26433s) {
            this.f26433s = false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d) {
            canvas.save();
            float e = this.f26432r.e(this.f26431n);
            if (e > 0.0f) {
                if (this.f26429c == null) {
                    this.f26429c = new fq0(this);
                }
                canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                this.f26429c.a(canvas, e);
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
                i11 = org.telegram.ui.ActionBar.y6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.U8;
            }
            this.I = i11;
            r6Var.t(LocaleController.formatNumber(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.y6.V8;
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
            ofFloat.addUpdateListener(new y31(this, 0));
            this.K.addListener(new i31(this, 1));
            org.telegram.ui.d3.m(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f26430f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.f26434w = -1L;
        this.h.setVisibility(8);
        aa0 aa0Var = this.d;
        aa0Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        fa0 fa0Var = new fa0(AndroidUtilities.dp(42.0f), aa0Var);
        fa0Var.e = 0.95f;
        spannableStringBuilder.setSpan(fa0Var, 0, 1, 33);
        aa0Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.f26433s) {
            this.f26433s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        setLayout(true);
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (this.f26434w == peerDialogId) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26434w = peerDialogId;
        this.h.setVisibility(8);
        aa0 aa0Var = this.d;
        aa0Var.setVisibility(0);
        org.telegram.ui.j5 j5Var = this.E;
        int i10 = this.f26427a;
        if (j5Var == null) {
            org.telegram.ui.j5 j5Var2 = new org.telegram.ui.j5(aa0Var, 18.0f, i10);
            this.E = j5Var2;
            j5Var2.v = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(peerDialogId);
        if (userOrChat != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.j5 j5Var3 = this.E;
            j9 j9Var = j5Var3.f40428c;
            j9Var.j(j5Var3.e, userOrChat);
            j5Var3.f40427b.setForUserOrChat(userOrChat, j9Var);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
        aa0Var.setText(TextUtils.ellipsize(spannableStringBuilder, aa0Var.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, MessagesController.getInstance(i10).isDialogMuted(j10, peerDialogId), z11);
        if (this.f26433s) {
            this.f26433s = false;
        }
    }

    public long getTopicId() {
        return this.f26434w;
    }

    public final void h() {
        int textColor = getTextColor();
        aa0 aa0Var = this.d;
        aa0Var.setTextColor(textColor);
        aa0Var.setEmojiColor(textColor);
        this.f26430f.invalidate();
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
        aa0 aa0Var = this.d;
        aa0Var.layout(dp, i16 - (aa0Var.getMeasuredHeight() / 2), aa0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f), (aa0Var.getMeasuredHeight() / 2) + i16);
        int i17 = (this.e.d > 0.0f ? 1 : (this.e.d == 0.0f ? 0 : -1));
        di.h3 h3Var = this.f26430f;
        if (i17 > 0) {
            h3Var.layout((i14 - AndroidUtilities.dp(11.0f)) - h3Var.getMeasuredWidth(), i16 - (h3Var.getMeasuredHeight() / 2), i14 - AndroidUtilities.dp(11.0f), (h3Var.getMeasuredHeight() / 2) + i16);
        } else {
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(4.66f);
            int measuredWidth2 = aa0Var.getMeasuredWidth() + AndroidUtilities.dp(11.0f);
            h3Var.layout(dp3 + aa0Var.getMeasuredWidth() + dp2, i16 - (h3Var.getMeasuredHeight() / 2), h3Var.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + measuredWidth2, (h3Var.getMeasuredHeight() / 2) + i16);
        }
        if (this.v != 0 && h3Var.getLeft() != this.v) {
            h3Var.setTranslationX((-h3Var.getLeft()) + this.v);
            h3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(ds.h).start();
        }
        this.v = h3Var.getLeft();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f26431n = z10;
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
        ofFloat.addUpdateListener(new y31(this, 1));
        this.H.addListener(new org.telegram.ui.lo(22, this, z10));
        this.H.setInterpolator(ds.h);
        this.H.setDuration(320L);
        this.H.start();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null && this.f26430f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView != null && (imageView.getDrawable() instanceof x31)) {
                ((x31) imageView.getDrawable()).f34657b.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f26428b));
                imageView.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
