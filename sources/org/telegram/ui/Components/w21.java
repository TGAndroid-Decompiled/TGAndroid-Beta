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
public final class w21 extends FrameLayout {
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
    public g90 P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public final int f29543a;
    public final org.telegram.ui.ActionBar.e6 f29544b;
    public yo0 f29545c;
    public final ci.x5 d;
    public final FrameLayout.LayoutParams e;
    public final m6 f29546f;
    public final ai.v7 h;
    public final u9 f29547n;
    public final f9 f29548r;
    public final TextView f29549s;
    public final ImageView v;
    public boolean f29550w;
    public boolean f29551x;
    public boolean f29552y;

    public w21(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29551x = false;
        this.f29552y = false;
        this.E = org.telegram.ui.ActionBar.i6.U8;
        this.K = 1.0f;
        this.M = 0L;
        this.N = false;
        this.O = false;
        this.f29543a = i10;
        this.f29544b = e6Var;
        ci.x5 x5Var = new ci.x5(this, context);
        this.d = x5Var;
        x5Var.setWillNotDraw(false);
        x5Var.setOrientation(1);
        addView(x5Var, w7.x5.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        w7.z5.a(x5Var);
        m6 m6Var = new m6(false, false, false, false);
        this.f29546f = m6Var;
        m6Var.t(AndroidUtilities.dp(11.0f));
        m6Var.u(AndroidUtilities.bold());
        m6Var.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W8, e6Var));
        m6Var.G = AndroidUtilities.displaySize.x;
        m6Var.f26085b = 17;
        ai.v7 v7Var = new ai.v7(this, context, e6Var);
        this.h = v7Var;
        v7Var.setWillNotDraw(false);
        v7Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        x5Var.addView(v7Var, w7.x5.q(-1, -2, 17));
        u9 u9Var = new u9(context);
        this.f29547n = u9Var;
        FrameLayout.LayoutParams e = w7.x5.e(34, 34, 17);
        this.e = e;
        v7Var.addView(u9Var, e);
        this.f29548r = new f9((org.telegram.ui.ActionBar.e6) null);
        TextView textView = new TextView(context);
        this.f29549s = textView;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19234z6, e6Var);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        textView.setTextColor(i0.a.d(this.Q, v02, org.telegram.ui.ActionBar.i6.v0(i11, e6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.addView(textView, w7.x5.t(-1, -2, 17, 4, 0, 4, 0));
        x5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.i6.v0(i11, e6Var)));
        addView(imageView, w7.x5.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f7;
        float f10;
        int dp;
        int dp2;
        if (this.f29551x == z10) {
            return;
        }
        this.f29551x = z10;
        if (z10) {
            f7 = 36.0f;
        } else {
            f7 = 3.0f;
        }
        this.f29547n.setRoundRadius(AndroidUtilities.dp(f7));
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
        long j11 = tL_forumTopic.f18161id;
        if (j10 == j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = false;
        this.M = j11;
        this.N = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f29549s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.f18161id;
        u9 u9Var = this.f29547n;
        if (i10 == 1) {
            this.O = true;
            u9Var.b();
            u9Var.setAnimatedEmojiDrawable(null);
            u9Var.setImageResource(R.drawable.msg_filled_general);
            u9Var.setScaleX(0.66f);
            u9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            u9Var.b();
            u9Var.setAnimatedEmojiDrawable(o5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            u9Var.setScaleX(1.0f);
            u9Var.setScaleY(1.0f);
        } else {
            u9Var.setAnimatedEmojiDrawable(null);
            u9Var.setImageDrawable(ng.d.e(tL_forumTopic));
            u9Var.setScaleX(1.0f);
            u9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.f29543a).isDialogMuted(j3, tL_forumTopic.f18161id);
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
        if (this.f29552y != z16) {
            this.f29552y = z16;
        }
        h();
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.O = true;
        this.N = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.f29549s;
        textView.setText(string);
        textView.setVisibility(0);
        u9 u9Var = this.f29547n;
        u9Var.b();
        u9Var.setAnimatedEmojiDrawable(null);
        u9Var.setImageResource(R.drawable.emoji_tabs_new3);
        u9Var.setScaleX(1.0f);
        u9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f29552y) {
            this.f29552y = false;
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
        TextView textView = this.f29549s;
        textView.setText(string);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        u9 u9Var = this.f29547n;
        u9Var.b();
        u9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            p21 p21Var = new p21(getContext());
            p21Var.f26934b.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.f29544b));
            u9Var.setImageDrawable(p21Var);
        } else {
            u9Var.setImageResource(R.drawable.other_chats);
        }
        u9Var.setScaleX(1.0f);
        u9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f29552y) {
            this.f29552y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        m6 m6Var = this.f29546f;
        if (z12) {
            this.E = org.telegram.ui.ActionBar.i6.Z5;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                oq oqVar = new oq(R.drawable.mini_like_filled, 0);
                oqVar.setScale(0.8f, 0.8f);
                oqVar.spaceScaleX = 0.5f;
                oqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(oqVar, 0, spannableStringBuilder.length(), 33);
                this.G = spannableStringBuilder;
            }
            m6Var.q(this.G, z13, true);
        } else if (z11) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.i6.V8;
            } else {
                i12 = org.telegram.ui.ActionBar.i6.U8;
            }
            this.E = i12;
            if (this.F == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                oq oqVar2 = new oq(R.drawable.mini_mention_filled_16, 0);
                oqVar2.setScale(0.8f, 0.8f);
                oqVar2.spaceScaleX = 0.5f;
                oqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(oqVar2, 0, 1, 33);
                this.F = spannableStringBuilder2;
            }
            m6Var.q(this.F, z13, true);
        } else if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.i6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.U8;
            }
            this.E = i11;
            m6Var.q(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.E = org.telegram.ui.ActionBar.i6.V8;
            m6Var.q("", z13, true);
        }
        if (z13 && (this.H < i10 || ((!this.I && z11) || (!this.J && z12)))) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new u21(this, 1));
            this.L.addListener(new jd0(this, 24));
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
        TextView textView = this.f29549s;
        h90 h90Var = new h90(dp, textView);
        h90Var.e = 0.75f;
        spannableStringBuilder.setSpan(h90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        u9 u9Var = this.f29547n;
        u9Var.b();
        u9Var.setAnimatedEmojiDrawable(null);
        if (this.P == null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f29544b;
            g90 g90Var = new g90(e6Var);
            this.P = g90Var;
            g90Var.j(38.0f);
            this.P.setCallback(u9Var);
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19234z6, e6Var);
            this.P.f(org.telegram.ui.ActionBar.i6.l1(0.15f, v02), org.telegram.ui.ActionBar.i6.l1(0.5f, v02), org.telegram.ui.ActionBar.i6.l1(0.6f, v02), org.telegram.ui.ActionBar.i6.l1(0.15f, v02));
            this.P.f24268n = false;
        }
        u9Var.setImageDrawable(this.P);
        u9Var.setScaleX(1.0f);
        u9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.f29552y) {
            this.f29552y = false;
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
        TextView textView = this.f29549s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = this.f29543a;
        u9 u9Var = this.f29547n;
        f9 f9Var = this.f29548r;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            f9Var.r(user);
            u9Var.e(user, f9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            f9Var.q(chat);
            u9Var.e(chat, f9Var);
        }
        u9Var.setScaleX(1.0f);
        u9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i11, false, false, z12, z11);
        if (this.f29552y) {
            this.f29552y = false;
        }
    }

    public final void g() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.i6.f19234z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29544b;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        if (this.N) {
            f7 = 1.0f;
        } else {
            f7 = this.Q;
        }
        int d = i0.a.d(f7, v02, v03);
        boolean z10 = this.O;
        u9 u9Var = this.f29547n;
        if (!z10) {
            u9Var.setColorFilter(null);
        } else {
            u9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        }
        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        u9Var.invalidate();
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
        int i11 = org.telegram.ui.ActionBar.i6.f19234z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29544b;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        if (!this.N) {
            f7 = this.Q;
        }
        this.f29549s.setTextColor(i0.a.d(f7, v02, v03));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i11);
    }

    public void setReorder(boolean z10) {
        this.f29550w = z10;
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
        ofFloat.addUpdateListener(new u21(this, 0));
        this.S.addListener(new aa(22, this, z10));
        this.S.setInterpolator(qr.h);
        this.S.setDuration(320L);
        this.S.start();
    }
}
