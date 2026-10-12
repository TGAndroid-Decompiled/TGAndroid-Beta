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
public final class x31 extends FrameLayout {
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
    public ha0 P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public final int f31148a;
    public final org.telegram.ui.ActionBar.c6 f31149b;
    public zp0 f31150c;
    public final di.v5 d;
    public final FrameLayout.LayoutParams e;
    public final r6 f31151f;
    public final bi.i7 h;
    public final z9 f31152n;
    public final k9 f31153r;
    public final TextView f31154s;
    public final ImageView v;
    public boolean f31155w;
    public boolean f31156x;
    public boolean f31157y;

    public x31(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31156x = false;
        this.f31157y = false;
        this.E = org.telegram.ui.ActionBar.g6.U8;
        this.K = 1.0f;
        this.M = 0L;
        this.N = false;
        this.O = false;
        this.f31148a = i10;
        this.f31149b = c6Var;
        di.v5 v5Var = new di.v5(this, context);
        this.d = v5Var;
        v5Var.setWillNotDraw(false);
        v5Var.setOrientation(1);
        addView(v5Var, w7.a6.a(-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        w7.c6.a(v5Var);
        r6 r6Var = new r6(false, false, false);
        this.f31151f = r6Var;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W8, c6Var));
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.f28748b = 17;
        bi.i7 i7Var = new bi.i7(this, context, c6Var);
        this.h = i7Var;
        i7Var.setWillNotDraw(false);
        i7Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        v5Var.addView(i7Var, w7.a6.q(-1, -2, 17));
        z9 z9Var = new z9(context);
        this.f31152n = z9Var;
        FrameLayout.LayoutParams e = w7.a6.e(34, 34, 17);
        this.e = e;
        i7Var.addView(z9Var, e);
        this.f31153r = new k9((org.telegram.ui.ActionBar.c6) null);
        TextView textView = new TextView(context);
        this.f31154s = textView;
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        textView.setTextColor(i0.a.d(this.Q, w02, org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        v5Var.addView(textView, w7.a6.t(-1, -2, 17, 4, 0, 4, 0));
        v5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        addView(imageView, w7.a6.a(-1.0f, -3.0f, 3.0f, 0.0f, 3.0f, 6, 115));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f7;
        float f10;
        int dp;
        int dp2;
        if (this.f31156x == z10) {
            return;
        }
        this.f31156x = z10;
        if (z10) {
            f7 = 36.0f;
        } else {
            f7 = 3.0f;
        }
        this.f31152n.setRoundRadius(AndroidUtilities.dp(f7));
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
        long j12 = tL_forumTopic.f19268id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.O = false;
        this.M = j12;
        this.N = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f31154s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.f19268id;
        z9 z9Var = this.f31152n;
        if (i10 == 1) {
            this.O = true;
            z9Var.b();
            z9Var.setAnimatedEmojiDrawable(null);
            z9Var.setImageResource(R.drawable.msg_filled_general);
            z9Var.setScaleX(0.66f);
            z9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            z9Var.b();
            z9Var.setAnimatedEmojiDrawable(s5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            z9Var.setScaleX(1.0f);
            z9Var.setScaleY(1.0f);
        } else {
            z9Var.setAnimatedEmojiDrawable(null);
            z9Var.setImageDrawable(og.d.e(tL_forumTopic));
            z9Var.setScaleX(1.0f);
            z9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.f31148a).isDialogMuted(j10, tL_forumTopic.f19268id);
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
        if (this.f31157y != z14) {
            this.f31157y = z14;
        }
        h();
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.O = true;
        this.N = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.f31154s;
        textView.setText(string);
        textView.setVisibility(0);
        z9 z9Var = this.f31152n;
        z9Var.b();
        z9Var.setAnimatedEmojiDrawable(null);
        z9Var.setImageResource(R.drawable.emoji_tabs_new3);
        z9Var.setScaleX(1.0f);
        z9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f31157y) {
            this.f31157y = false;
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
        TextView textView = this.f31154s;
        textView.setText(string);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        z9 z9Var = this.f31152n;
        z9Var.b();
        z9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            q31 q31Var = new q31(getContext());
            q31Var.f28504b.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.f31149b));
            z9Var.setImageDrawable(q31Var);
        } else {
            z9Var.setImageResource(R.drawable.other_chats);
        }
        z9Var.setScaleX(1.0f);
        z9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f31157y) {
            this.f31157y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        r6 r6Var = this.f31151f;
        if (z12) {
            this.E = org.telegram.ui.ActionBar.g6.Z5;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                br brVar = new br(R.drawable.mini_like_filled, 0);
                brVar.setScale(0.8f, 0.8f);
                brVar.spaceScaleX = 0.5f;
                brVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(brVar, 0, spannableStringBuilder.length(), 33);
                this.G = spannableStringBuilder;
            }
            r6Var.t(this.G, z13, true);
        } else if (z11) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.g6.V8;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.U8;
            }
            this.E = i12;
            if (this.F == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                br brVar2 = new br(R.drawable.mini_mention_filled_16, 0);
                brVar2.setScale(0.8f, 0.8f);
                brVar2.spaceScaleX = 0.5f;
                brVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(brVar2, 0, 1, 33);
                this.F = spannableStringBuilder2;
            }
            r6Var.t(this.F, z13, true);
        } else if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.g6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.U8;
            }
            this.E = i11;
            r6Var.t(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.E = org.telegram.ui.ActionBar.g6.V8;
            r6Var.t("", z13, true);
        }
        if (z13 && (this.H < i10 || ((!this.I && z11) || (!this.J && z12)))) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new v31(this, 1));
            this.L.addListener(new k90(this, 28));
            org.telegram.ui.Cells.d0.l(2.0f, this.L);
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
        TextView textView = this.f31154s;
        ia0 ia0Var = new ia0(dp, textView);
        ia0Var.e = 0.75f;
        spannableStringBuilder.setSpan(ia0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        z9 z9Var = this.f31152n;
        z9Var.b();
        z9Var.setAnimatedEmojiDrawable(null);
        if (this.P == null) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f31149b;
            ha0 ha0Var = new ha0(c6Var);
            this.P = ha0Var;
            ha0Var.k(38.0f);
            this.P.setCallback(z9Var);
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var);
            this.P.g(org.telegram.ui.ActionBar.g6.m1(0.15f, w02), org.telegram.ui.ActionBar.g6.m1(0.5f, w02), org.telegram.ui.ActionBar.g6.m1(0.6f, w02), org.telegram.ui.ActionBar.g6.m1(0.15f, w02));
            this.P.f25615n = false;
        }
        z9Var.setImageDrawable(this.P);
        z9Var.setScaleX(1.0f);
        z9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.f31157y) {
            this.f31157y = false;
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
        TextView textView = this.f31154s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        int i11 = this.f31148a;
        z9 z9Var = this.f31152n;
        k9 k9Var = this.f31153r;
        if (i10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
            k9Var.r(user);
            z9Var.e(user, k9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
            k9Var.q(chat);
            z9Var.e(chat, k9Var);
        }
        z9Var.setScaleX(1.0f);
        z9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i12 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i12, false, false, z12, z11);
        if (this.f31157y) {
            this.f31157y = false;
        }
    }

    public final void g() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.g6.f20305z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31149b;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        if (this.N) {
            f7 = 1.0f;
        } else {
            f7 = this.Q;
        }
        int d = i0.a.d(f7, w02, w03);
        boolean z10 = this.O;
        z9 z9Var = this.f31152n;
        if (!z10) {
            z9Var.setColorFilter(null);
        } else {
            z9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        }
        z9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        z9Var.invalidate();
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
        int i11 = org.telegram.ui.ActionBar.g6.f20305z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31149b;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        if (!this.N) {
            f7 = this.Q;
        }
        this.f31154s.setTextColor(i0.a.d(f7, w02, w03));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i11);
    }

    public void setReorder(boolean z10) {
        this.f31155w = z10;
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
        ofFloat.addUpdateListener(new v31(this, 0));
        this.S.addListener(new org.telegram.ui.vo(23, this, z10));
        this.S.setInterpolator(es.h);
        this.S.setDuration(320L);
        this.S.start();
    }
}
