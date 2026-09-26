package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
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
public final class k31 extends FrameLayout {
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
    public s90 P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public final int f25611a;
    public final org.telegram.ui.ActionBar.d6 f25612b;
    public mp0 f25613c;
    public final ci.w5 d;
    public final FrameLayout.LayoutParams e;
    public final o6 f25614f;
    public final ai.w7 h;
    public final w9 f25615n;
    public final h9 f25616r;
    public final TextView f25617s;
    public final ImageView v;
    public boolean f25618w;
    public boolean f25619x;
    public boolean f25620y;

    public k31(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25619x = false;
        this.f25620y = false;
        this.E = org.telegram.ui.ActionBar.h6.U8;
        this.K = 1.0f;
        this.M = 0L;
        this.N = false;
        this.O = false;
        this.f25611a = i10;
        this.f25612b = d6Var;
        ci.w5 w5Var = new ci.w5(this, context);
        this.d = w5Var;
        w5Var.setWillNotDraw(false);
        w5Var.setOrientation(1);
        addView(w5Var, w7.y5.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        w7.a6.a(w5Var);
        o6 o6Var = new o6(false, false, false, false);
        this.f25614f = o6Var;
        o6Var.t(AndroidUtilities.dp(11.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W8, d6Var));
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.f26962b = 17;
        ai.w7 w7Var = new ai.w7(this, context, d6Var);
        this.h = w7Var;
        w7Var.setWillNotDraw(false);
        w7Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        w5Var.addView(w7Var, w7.y5.q(-1, -2, 17));
        w9 w9Var = new w9(context);
        this.f25615n = w9Var;
        FrameLayout.LayoutParams e = w7.y5.e(34, 34, 17);
        this.e = e;
        w7Var.addView(w9Var, e);
        this.f25616r = new h9((org.telegram.ui.ActionBar.d6) null);
        TextView textView = new TextView(context);
        this.f25617s = textView;
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19461z6, d6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        textView.setTextColor(i0.a.d(this.Q, v02, org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        w5Var.addView(textView, w7.y5.t(-1, -2, 17, 4, 0, 4, 0));
        w5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        addView(imageView, w7.y5.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f7;
        float f10;
        int dp;
        int dp2;
        if (this.f25619x == z10) {
            return;
        }
        this.f25619x = z10;
        if (z10) {
            f7 = 36.0f;
        } else {
            f7 = 3.0f;
        }
        this.f25615n.setRoundRadius(AndroidUtilities.dp(f7));
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

    public final void a(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        setLayout(false);
        long j10 = this.M;
        long j11 = tL_forumTopic.f18387id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = false;
        this.M = j11;
        this.N = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f25617s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.f18387id;
        w9 w9Var = this.f25615n;
        if (i10 == 1) {
            this.O = true;
            w9Var.b();
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageResource(R.drawable.msg_filled_general);
            w9Var.setScaleX(0.66f);
            w9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            w9Var.b();
            w9Var.setAnimatedEmojiDrawable(q5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageDrawable(ng.d.e(tL_forumTopic));
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.f25611a).isDialogMuted(j3, tL_forumTopic.f18387id);
        boolean z15 = false;
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_mentions_count > 0) {
            z12 = z11;
            z13 = isDialogMuted;
            z14 = true;
        } else {
            z12 = z11;
            z13 = isDialogMuted;
            z14 = false;
        }
        if (tL_forumTopic.unread_reactions_count > 0) {
            z15 = true;
        }
        d(i11, z13, z14, z15, z12);
        boolean z16 = tL_forumTopic.pinned;
        if (this.f25620y != z16) {
            this.f25620y = z16;
        }
        h();
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.O = true;
        this.N = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.f25617s;
        textView.setText(string);
        textView.setVisibility(0);
        w9 w9Var = this.f25615n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        w9Var.setImageResource(R.drawable.emoji_tabs_new3);
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f25620y) {
            this.f25620y = false;
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
        TextView textView = this.f25617s;
        textView.setText(string);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        w9 w9Var = this.f25615n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            d31 d31Var = new d31(getContext());
            d31Var.f23489b.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.f25612b));
            w9Var.setImageDrawable(d31Var);
        } else {
            w9Var.setImageResource(R.drawable.other_chats);
        }
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f25620y) {
            this.f25620y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        o6 o6Var = this.f25614f;
        if (z12) {
            this.E = org.telegram.ui.ActionBar.h6.Z5;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                qq qqVar = new qq(R.drawable.mini_like_filled, 0);
                qqVar.setScale(0.8f, 0.8f);
                qqVar.spaceScaleX = 0.5f;
                qqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(qqVar, 0, spannableStringBuilder.length(), 33);
                this.G = spannableStringBuilder;
            }
            o6Var.q(this.G, z13, true);
        } else if (z11) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.h6.V8;
            } else {
                i12 = org.telegram.ui.ActionBar.h6.U8;
            }
            this.E = i12;
            if (this.F == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                qq qqVar2 = new qq(R.drawable.mini_mention_filled_16, 0);
                qqVar2.setScale(0.8f, 0.8f);
                qqVar2.spaceScaleX = 0.5f;
                qqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(qqVar2, 0, 1, 33);
                this.F = spannableStringBuilder2;
            }
            o6Var.q(this.F, z13, true);
        } else if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.h6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.U8;
            }
            this.E = i11;
            o6Var.q(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.E = org.telegram.ui.ActionBar.h6.V8;
            o6Var.q("", z13, true);
        }
        if (z13 && (this.H < i10 || ((!this.I && z11) || (!this.J && z12)))) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new i31(this, 1));
            this.L.addListener(new gd0(this, 25));
            this.L.setInterpolator(new OvershootInterpolator(2.0f));
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
        TextView textView = this.f25617s;
        t90 t90Var = new t90(dp, textView);
        t90Var.e = 0.75f;
        spannableStringBuilder.setSpan(t90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        w9 w9Var = this.f25615n;
        w9Var.b();
        w9Var.setAnimatedEmojiDrawable(null);
        if (this.P == null) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f25612b;
            s90 s90Var = new s90(d6Var);
            this.P = s90Var;
            s90Var.j(38.0f);
            this.P.setCallback(w9Var);
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19461z6, d6Var);
            this.P.f(org.telegram.ui.ActionBar.h6.l1(0.15f, v02), org.telegram.ui.ActionBar.h6.l1(0.5f, v02), org.telegram.ui.ActionBar.h6.l1(0.6f, v02), org.telegram.ui.ActionBar.h6.l1(0.15f, v02));
            this.P.f28212n = false;
        }
        w9Var.setImageDrawable(this.P);
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.f25620y) {
            this.f25620y = false;
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
        TextView textView = this.f25617s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = this.f25611a;
        w9 w9Var = this.f25615n;
        h9 h9Var = this.f25616r;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            h9Var.r(user);
            w9Var.e(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i11, false, false, z12, z11);
        if (this.f25620y) {
            this.f25620y = false;
        }
    }

    public final void g() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.h6.f19461z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25612b;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        if (this.N) {
            f7 = 1.0f;
        } else {
            f7 = this.Q;
        }
        int d = i0.a.d(f7, v02, v03);
        boolean z10 = this.O;
        w9 w9Var = this.f25615n;
        if (!z10) {
            w9Var.setColorFilter(null);
        } else {
            w9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        }
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
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
        int i11 = org.telegram.ui.ActionBar.h6.f19461z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25612b;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        if (!this.N) {
            f7 = this.Q;
        }
        this.f25617s.setTextColor(i0.a.d(f7, v02, v03));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i11);
    }

    public void setReorder(boolean z10) {
        this.f25618w = z10;
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
        ofFloat.addUpdateListener(new i31(this, 0));
        this.S.addListener(new ca(22, this, z10));
        this.S.setInterpolator(sr.h);
        this.S.setDuration(320L);
        this.S.start();
    }
}
