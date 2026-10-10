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
public final class c41 extends FrameLayout {
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
    public ja0 P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public final int f25177a;
    public final org.telegram.ui.ActionBar.e6 f25178b;
    public eq0 f25179c;
    public final ci.w5 d;
    public final FrameLayout.LayoutParams f25180e;
    public final q6 f25181f;
    public final ai.x7 h;
    public final y9 f25182n;
    public final j9 f25183r;
    public final TextView f25184s;
    public final ImageView v;
    public boolean f25185w;
    public boolean f25186x;
    public boolean f25187y;

    public c41(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f25186x = false;
        this.f25187y = false;
        this.E = org.telegram.ui.ActionBar.i6.U8;
        this.K = 1.0f;
        this.M = 0L;
        this.N = false;
        this.O = false;
        this.f25177a = i10;
        this.f25178b = e6Var;
        ci.w5 w5Var = new ci.w5(this, context);
        this.d = w5Var;
        w5Var.setWillNotDraw(false);
        w5Var.setOrientation(1);
        addView(w5Var, w7.x5.a(-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        w7.z5.a(w5Var);
        q6 q6Var = new q6(false, false, false);
        this.f25181f = q6Var;
        q6Var.w(AndroidUtilities.dp(11.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.u(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.W8, e6Var));
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.f30031b = 17;
        ai.x7 x7Var = new ai.x7(this, context, e6Var);
        this.h = x7Var;
        x7Var.setWillNotDraw(false);
        x7Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        w5Var.addView(x7Var, w7.x5.q(-1, -2, 17));
        y9 y9Var = new y9(context);
        this.f25182n = y9Var;
        FrameLayout.LayoutParams e7 = w7.x5.e(34, 34, 17);
        this.f25180e = e7;
        x7Var.addView(y9Var, e7);
        this.f25183r = new j9((org.telegram.ui.ActionBar.e6) null);
        TextView textView = new TextView(context);
        this.f25184s = textView;
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        textView.setTextColor(i0.a.d(this.Q, w02, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        w5Var.addView(textView, w7.x5.t(-1, -2, 17, 4, 0, 4, 0));
        w5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
        addView(imageView, w7.x5.a(-1.0f, -3.0f, 3.0f, 0.0f, 3.0f, 6, 115));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f7;
        float f10;
        int dp;
        int dp2;
        if (this.f25186x == z10) {
            return;
        }
        this.f25186x = z10;
        if (z10) {
            f7 = 36.0f;
        } else {
            f7 = 3.0f;
        }
        this.f25182n.setRoundRadius(AndroidUtilities.dp(f7));
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
        FrameLayout.LayoutParams layoutParams = this.f25180e;
        layoutParams.width = dp;
        if (z10) {
            dp2 = AndroidUtilities.dp(28.0f);
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        layoutParams.height = dp2;
    }

    public final void a(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        setLayout(false);
        long j10 = this.M;
        long j11 = tL_forumTopic.f20094id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = false;
        this.M = j11;
        this.N = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f25184s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.f20094id;
        y9 y9Var = this.f25182n;
        if (i10 == 1) {
            this.O = true;
            y9Var.b();
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageResource(R.drawable.msg_filled_general);
            y9Var.setScaleX(0.66f);
            y9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            y9Var.b();
            y9Var.setAnimatedEmojiDrawable(s5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        } else {
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageDrawable(ng.d.e(tL_forumTopic));
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.f25177a).isDialogMuted(j3, tL_forumTopic.f20094id);
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
        if (this.f25187y != z14) {
            this.f25187y = z14;
        }
        h();
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.O = true;
        this.N = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.f25184s;
        textView.setText(string);
        textView.setVisibility(0);
        y9 y9Var = this.f25182n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        y9Var.setImageResource(R.drawable.emoji_tabs_new3);
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f25187y) {
            this.f25187y = false;
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
        TextView textView = this.f25184s;
        textView.setText(string);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        y9 y9Var = this.f25182n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            v31 v31Var = new v31(getContext());
            v31Var.f31728b.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.f25178b));
            y9Var.setImageDrawable(v31Var);
        } else {
            y9Var.setImageResource(R.drawable.other_chats);
        }
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f25187y) {
            this.f25187y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        q6 q6Var = this.f25181f;
        if (z12) {
            this.E = org.telegram.ui.ActionBar.i6.Z5;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                er erVar = new er(R.drawable.mini_like_filled, 0);
                erVar.setScale(0.8f, 0.8f);
                erVar.spaceScaleX = 0.5f;
                erVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(erVar, 0, spannableStringBuilder.length(), 33);
                this.G = spannableStringBuilder;
            }
            q6Var.t(this.G, z13, true);
        } else if (z11) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.i6.V8;
            } else {
                i12 = org.telegram.ui.ActionBar.i6.U8;
            }
            this.E = i12;
            if (this.F == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                er erVar2 = new er(R.drawable.mini_mention_filled_16, 0);
                erVar2.setScale(0.8f, 0.8f);
                erVar2.spaceScaleX = 0.5f;
                erVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(erVar2, 0, 1, 33);
                this.F = spannableStringBuilder2;
            }
            q6Var.t(this.F, z13, true);
        } else if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.i6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.U8;
            }
            this.E = i11;
            q6Var.t(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.E = org.telegram.ui.ActionBar.i6.V8;
            q6Var.t("", z13, true);
        }
        if (z13 && (this.H < i10 || ((!this.I && z11) || (!this.J && z12)))) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new a41(this, 1));
            this.L.addListener(new wd0(this, 25));
            org.telegram.messenger.bi.l(2.0f, this.L);
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
        TextView textView = this.f25184s;
        ka0 ka0Var = new ka0(dp, textView);
        ka0Var.f27953e = 0.75f;
        spannableStringBuilder.setSpan(ka0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        y9 y9Var = this.f25182n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        if (this.P == null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f25178b;
            ja0 ja0Var = new ja0(e6Var);
            this.P = ja0Var;
            ja0Var.k(38.0f);
            this.P.setCallback(y9Var);
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var);
            this.P.g(org.telegram.ui.ActionBar.i6.m1(0.15f, w02), org.telegram.ui.ActionBar.i6.m1(0.5f, w02), org.telegram.ui.ActionBar.i6.m1(0.6f, w02), org.telegram.ui.ActionBar.i6.m1(0.15f, w02));
            this.P.f27642n = false;
        }
        y9Var.setImageDrawable(this.P);
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.f25187y) {
            this.f25187y = false;
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
        TextView textView = this.f25184s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        int i11 = this.f25177a;
        y9 y9Var = this.f25182n;
        j9 j9Var = this.f25183r;
        if (i10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
            j9Var.r(user);
            y9Var.e(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
            j9Var.q(chat);
            y9Var.e(chat, j9Var);
        }
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i12 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i12, false, false, z12, z11);
        if (this.f25187y) {
            this.f25187y = false;
        }
    }

    public final void g() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.i6.f21203z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f25178b;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        if (this.N) {
            f7 = 1.0f;
        } else {
            f7 = this.Q;
        }
        int d = i0.a.d(f7, w02, w03);
        boolean z10 = this.O;
        y9 y9Var = this.f25182n;
        if (!z10) {
            y9Var.setColorFilter(null);
        } else {
            y9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        }
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        y9Var.invalidate();
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
        int i11 = org.telegram.ui.ActionBar.i6.f21203z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f25178b;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        if (!this.N) {
            f7 = this.Q;
        }
        this.f25184s.setTextColor(i0.a.d(f7, w02, w03));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i11);
    }

    public void setReorder(boolean z10) {
        this.f25185w = z10;
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
        ofFloat.addUpdateListener(new a41(this, 0));
        this.S.addListener(new fa(22, this, z10));
        this.S.setInterpolator(is.h);
        this.S.setDuration(320L);
        this.S.start();
    }
}
