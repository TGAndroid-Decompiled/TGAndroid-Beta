package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class r31 extends FrameLayout {
    public int E;
    public SpannableStringBuilder F;
    public SpannableStringBuilder G;
    public int H;
    public boolean I;
    public boolean J;
    public float K;
    public ValueAnimator L;
    public long M;
    public boolean N;
    public boolean O;
    public ba0 P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public final int f29799a;
    public final org.telegram.ui.ActionBar.d6 f29800b;
    public vp0 f29801c;
    public final ei.m5 d;
    public final FrameLayout.LayoutParams e;
    public final p6 f29802f;
    public final ai.w1 h;
    public final w9 f29803n;
    public final h9 f29804r;
    public final TextView f29805s;
    public final ImageView v;
    public boolean f29806w;
    public boolean f29807x;
    public boolean f29808y;

    public r31(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f29807x = false;
        this.f29808y = false;
        this.E = org.telegram.ui.ActionBar.h6.U8;
        this.K = 1.0f;
        this.M = 0L;
        this.N = false;
        this.O = false;
        this.f29799a = i10;
        this.f29800b = d6Var;
        ei.m5 m5Var = new ei.m5(this, context);
        this.d = m5Var;
        m5Var.setWillNotDraw(false);
        m5Var.setOrientation(1);
        addView(m5Var, w7.z5.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        w7.b6.a(m5Var);
        p6 p6Var = new p6(false, false, false);
        this.f29802f = p6Var;
        p6Var.w(AndroidUtilities.dp(11.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W8, d6Var));
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.f29225b = 17;
        ai.w1 w1Var = new ai.w1(this, context, d6Var);
        this.h = w1Var;
        w1Var.setWillNotDraw(false);
        w1Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        m5Var.addView(w1Var, w7.z5.q(-1, -2, 17));
        w9 w9Var = new w9(context);
        this.f29803n = w9Var;
        FrameLayout.LayoutParams e = w7.z5.e(34, 34, 17);
        this.e = e;
        w1Var.addView(w9Var, e);
        this.f29804r = new h9((org.telegram.ui.ActionBar.d6) null);
        TextView textView = new TextView(context);
        this.f29805s = textView;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21395z6, d6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        textView.setTextColor(i0.a.f(this.Q, w02, org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        m5Var.addView(textView, w7.z5.t(-1, -2, 17, 4, 0, 4, 0));
        m5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        addView(imageView, w7.z5.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f7;
        float f10;
        int dp;
        int dp2;
        if (this.f29807x == z10) {
            return;
        }
        this.f29807x = z10;
        if (z10) {
            f7 = 36.0f;
        } else {
            f7 = 3.0f;
        }
        this.f29803n.setRoundRadius(AndroidUtilities.dp(f7));
        if (z10) {
            f10 = 7.0f;
        } else {
            f10 = 4.0f;
        }
        this.h.setPadding(0, AndroidUtilities.dp(f10), 0, 0);
        if (z10) {
            dp = AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = dp;
        if (z10) {
            dp2 = AndroidUtilities.dp(28.0f);
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        layoutParams.height = dp2;
    }

    public final void a(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        setLayout(false);
        long j11 = this.M;
        long j12 = tL_forumTopic.f20328id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = false;
        this.M = j12;
        this.N = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f29805s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.f20328id;
        w9 w9Var = this.f29803n;
        if (i10 == 1) {
            this.O = true;
            w9Var.b();
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageResource(R.drawable.msg_filled_general);
            w9Var.setScaleX(0.66f);
            w9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            w9Var.b();
            w9Var.setAnimatedEmojiDrawable(r5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageDrawable(og.d.e(tL_forumTopic));
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.f29799a).isDialogMuted(j10, tL_forumTopic.f20328id);
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_mentions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (tL_forumTopic.unread_reactions_count > 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        d(i11, isDialogMuted, z12, z13, z11);
        boolean z14 = tL_forumTopic.pinned;
        if (this.f29808y != z14) {
            this.f29808y = z14;
        }
        h();
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.O = true;
        this.N = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.f29805s;
        textView.setText(string);
        textView.setVisibility(0);
        w9 w9Var = this.f29803n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        w9Var.setImageResource(R.drawable.emoji_tabs_new3);
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f29808y) {
            this.f29808y = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.M = -1L;
        this.O = true;
        this.N = false;
        if (z10) {
            i10 = R.string.BotForumNewTopic;
        } else {
            i10 = R.string.AllTopicsSide;
        }
        String string = LocaleController.getString(i10);
        TextView textView = this.f29805s;
        textView.setText(string);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        w9 w9Var = this.f29803n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            j31 j31Var = new j31(getContext());
            j31Var.f27394b.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f29800b));
            w9Var.setImageDrawable(j31Var);
        } else {
            w9Var.setImageResource(R.drawable.other_chats);
        }
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f29808y) {
            this.f29808y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        p6 p6Var = this.f29802f;
        if (z12) {
            this.E = org.telegram.ui.ActionBar.h6.Z5;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                yq yqVar = new yq(R.drawable.mini_like_filled, 0);
                yqVar.setScale(0.8f, 0.8f);
                yqVar.spaceScaleX = 0.5f;
                yqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(yqVar, 0, spannableStringBuilder.length(), 33);
                this.G = spannableStringBuilder;
            }
            p6Var.t(this.G, z13, true);
        } else if (z11) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.h6.V8;
            } else {
                i12 = org.telegram.ui.ActionBar.h6.U8;
            }
            this.E = i12;
            if (this.F == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                yq yqVar2 = new yq(R.drawable.mini_mention_filled_16, 0);
                yqVar2.setScale(0.8f, 0.8f);
                yqVar2.spaceScaleX = 0.5f;
                yqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(yqVar2, 0, 1, 33);
                this.F = spannableStringBuilder2;
            }
            p6Var.t(this.F, z13, true);
        } else if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.h6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.U8;
            }
            this.E = i11;
            p6Var.t(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.E = org.telegram.ui.ActionBar.h6.V8;
            p6Var.t("", z13, true);
        }
        if (z13 && (this.H < i10 || ((!this.I && z11) || (!this.J && z12)))) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new o31(this, 1));
            this.L.addListener(new p31(this, 0));
            org.telegram.messenger.mk.l(2.0f, this.L);
            this.L.setDuration(200L);
            this.L.start();
        }
        this.H = i10;
        this.I = z11;
        this.J = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.M = -1L;
        this.O = true;
        this.N = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int dp = AndroidUtilities.dp(38.0f);
        TextView textView = this.f29805s;
        ca0 ca0Var = new ca0(dp, textView);
        ca0Var.e = 0.75f;
        spannableStringBuilder.setSpan(ca0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        w9 w9Var = this.f29803n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        if (this.P == null) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f29800b;
            ba0 ba0Var = new ba0(d6Var);
            this.P = ba0Var;
            ba0Var.k(38.0f);
            this.P.setCallback(w9Var);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21395z6, d6Var);
            this.P.g(org.telegram.ui.ActionBar.h6.m1(0.15f, w02), org.telegram.ui.ActionBar.h6.m1(0.5f, w02), org.telegram.ui.ActionBar.h6.m1(0.6f, w02), org.telegram.ui.ActionBar.h6.m1(0.15f, w02));
            this.P.f24867n = false;
        }
        w9Var.setImageDrawable(this.P);
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.f29808y) {
            this.f29808y = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        setLayout(true);
        this.N = false;
        this.O = false;
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (peerDialogId == this.M) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.M = peerDialogId;
        String name = DialogObject.getName(peerDialogId);
        TextView textView = this.f29805s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        int i11 = this.f29799a;
        w9 w9Var = this.f29803n;
        h9 h9Var = this.f29804r;
        if (i10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
            h9Var.r(user);
            w9Var.e(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i12 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i12, false, false, z12, z11);
        if (this.f29808y) {
            this.f29808y = false;
        }
    }

    public final void g() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.f21395z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29800b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        if (this.N) {
            f7 = 1.0f;
        } else {
            f7 = this.Q;
        }
        int f10 = i0.a.f(f7, w02, w03);
        boolean z10 = this.O;
        w9 w9Var = this.f29803n;
        if (!z10) {
            w9Var.setColorFilter(null);
        } else {
            w9Var.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        w9Var.invalidate();
    }

    public final void h() {
        int i10;
        float f7 = 1.0f;
        float f10 = (1.0f - this.Q) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.v;
        imageView.setTranslationX(f10);
        if (this.Q <= 0.0f) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.h6.f21395z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29800b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        if (!this.N) {
            f7 = this.Q;
        }
        this.f29805s.setTextColor(i0.a.f(f7, w02, w03));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i11);
    }

    public void setReorder(boolean z10) {
        this.f29806w = z10;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f7;
        if (this.R == z10) {
            return;
        }
        this.R = z10;
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.Q;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new o31(this, 0));
        this.S.addListener(new org.telegram.ui.fo(23, this, z10));
        this.S.setInterpolator(bs.h);
        this.S.setDuration(320L);
        this.S.start();
    }
}
