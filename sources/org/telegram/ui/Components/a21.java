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
public final class a21 extends FrameLayout {
    public int A;
    public SpannableStringBuilder B;
    public SpannableStringBuilder C;
    public int D;
    public boolean E;
    public boolean F;
    public float G;
    public ValueAnimator H;
    public long I;
    public boolean J;
    public boolean K;
    public p80 L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final int f26634a;
    public final org.telegram.ui.ActionBar.b6 f26635b;
    public ho0 f26636c;
    public final kh.n5 d;
    public final FrameLayout.LayoutParams f26637e;
    public final i6 f26638f;
    public final gh.h1 h;
    public final o9 f26639n;
    public final z8 f26640r;
    public final TextView f26641s;
    public final ImageView v;
    public boolean f26642w;
    public boolean f26643x;
    public boolean f26644y;

    public a21(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26643x = false;
        this.f26644y = false;
        this.A = org.telegram.ui.ActionBar.f6.U8;
        this.G = 1.0f;
        this.I = 0L;
        this.J = false;
        this.K = false;
        this.f26634a = i9;
        this.f26635b = b6Var;
        kh.n5 n5Var = new kh.n5(this, context);
        this.d = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setOrientation(1);
        addView(n5Var, g7.e6.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        g7.g6.a(n5Var);
        i6 i6Var = new i6(false, false, false, false);
        this.f26638f = i6Var;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W8, b6Var));
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.f29333b = 17;
        gh.h1 h1Var = new gh.h1(this, context, b6Var);
        this.h = h1Var;
        h1Var.setWillNotDraw(false);
        h1Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        n5Var.addView(h1Var, g7.e6.q(-1, -2, 17));
        o9 o9Var = new o9(context);
        this.f26639n = o9Var;
        FrameLayout.LayoutParams e10 = g7.e6.e(34, 34, 17);
        this.f26637e = e10;
        h1Var.addView(o9Var, e10);
        this.f26640r = new z8((org.telegram.ui.ActionBar.b6) null);
        TextView textView = new TextView(context);
        this.f26641s = textView;
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var);
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        textView.setTextColor(i0.a.d(this.M, v02, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        n5Var.addView(textView, g7.e6.t(-1, -2, 17, 4, 0, 4, 0));
        n5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        addView(imageView, g7.e6.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f10;
        float f11;
        int dp;
        int dp2;
        if (this.f26643x == z10) {
            return;
        }
        this.f26643x = z10;
        if (z10) {
            f10 = 36.0f;
        } else {
            f10 = 3.0f;
        }
        this.f26639n.setRoundRadius(AndroidUtilities.dp(f10));
        if (z10) {
            f11 = 7.0f;
        } else {
            f11 = 4.0f;
        }
        this.h.setPadding(0, AndroidUtilities.dp(f11), 0, 0);
        if (z10) {
            dp = AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        FrameLayout.LayoutParams layoutParams = this.f26637e;
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
        boolean z14;
        setLayout(false);
        long j11 = this.I;
        long j12 = tL_forumTopic.f22432id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = false;
        this.I = j12;
        this.J = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f26641s;
        textView.setText(str);
        textView.setVisibility(0);
        int i9 = tL_forumTopic.f22432id;
        o9 o9Var = this.f26639n;
        if (i9 == 1) {
            this.K = true;
            o9Var.b();
            o9Var.setAnimatedEmojiDrawable(null);
            o9Var.setImageResource(R.drawable.msg_filled_general);
            o9Var.setScaleX(0.66f);
            o9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            o9Var.b();
            o9Var.setAnimatedEmojiDrawable(k5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            o9Var.setScaleX(1.0f);
            o9Var.setScaleY(1.0f);
        } else {
            o9Var.setAnimatedEmojiDrawable(null);
            o9Var.setImageDrawable(vf.c.e(tL_forumTopic));
            o9Var.setScaleX(1.0f);
            o9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.f26634a).isDialogMuted(j10, tL_forumTopic.f22432id);
        boolean z15 = false;
        int i10 = tL_forumTopic.unread_count;
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
        d(i10, z13, z14, z15, z12);
        boolean z16 = tL_forumTopic.pinned;
        if (this.f26644y != z16) {
            this.f26644y = z16;
        }
        h();
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.K = true;
        this.J = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.f26641s;
        textView.setText(string);
        textView.setVisibility(0);
        o9 o9Var = this.f26639n;
        o9Var.b();
        o9Var.setAnimatedEmojiDrawable(null);
        o9Var.setImageResource(R.drawable.emoji_tabs_new3);
        o9Var.setScaleX(1.0f);
        o9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f26644y) {
            this.f26644y = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i9;
        int i10;
        setLayout(z11);
        this.I = -1L;
        this.K = true;
        this.J = false;
        if (z10) {
            i9 = R.string.BotForumNewTopic;
        } else {
            i9 = R.string.AllTopicsSide;
        }
        String string = LocaleController.getString(i9);
        TextView textView = this.f26641s;
        textView.setText(string);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        o9 o9Var = this.f26639n;
        o9Var.b();
        o9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            s11 s11Var = new s11(getContext());
            s11Var.f32335b.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.f26635b));
            o9Var.setImageDrawable(s11Var);
        } else {
            o9Var.setImageResource(R.drawable.other_chats);
        }
        o9Var.setScaleX(1.0f);
        o9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f26644y) {
            this.f26644y = false;
        }
    }

    public final void d(int i9, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i10;
        int i11;
        i6 i6Var = this.f26638f;
        if (z12) {
            this.A = org.telegram.ui.ActionBar.f6.Z5;
            if (this.C == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                eq eqVar = new eq(R.drawable.mini_like_filled, 0);
                eqVar.setScale(0.8f, 0.8f);
                eqVar.spaceScaleX = 0.5f;
                eqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
                this.C = spannableStringBuilder;
            }
            i6Var.q(this.C, z13, true);
        } else if (z11) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.f6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.f6.U8;
            }
            this.A = i11;
            if (this.B == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                eq eqVar2 = new eq(R.drawable.mini_mention_filled_16, 0);
                eqVar2.setScale(0.8f, 0.8f);
                eqVar2.spaceScaleX = 0.5f;
                eqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(eqVar2, 0, 1, 33);
                this.B = spannableStringBuilder2;
            }
            i6Var.q(this.B, z13, true);
        } else if (i9 > 0) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.f6.V8;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.U8;
            }
            this.A = i10;
            i6Var.q(LocaleController.formatNumber(i9, ','), z13, true);
        } else {
            this.A = org.telegram.ui.ActionBar.f6.V8;
            i6Var.q("", z13, true);
        }
        if (z13 && (this.D < i9 || ((!this.E && z11) || (!this.F && z12)))) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new x11(this, 1));
            this.H.addListener(new y11(this, 0));
            this.H.setInterpolator(new OvershootInterpolator(2.0f));
            this.H.setDuration(200L);
            this.H.start();
        }
        this.D = i9;
        this.E = z11;
        this.F = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.I = -1L;
        this.K = true;
        this.J = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int dp = AndroidUtilities.dp(38.0f);
        TextView textView = this.f26641s;
        q80 q80Var = new q80(dp, textView);
        q80Var.f31862e = 0.75f;
        spannableStringBuilder.setSpan(q80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        o9 o9Var = this.f26639n;
        o9Var.b();
        o9Var.setAnimatedEmojiDrawable(null);
        if (this.L == null) {
            org.telegram.ui.ActionBar.b6 b6Var = this.f26635b;
            p80 p80Var = new p80(b6Var);
            this.L = p80Var;
            p80Var.j(38.0f);
            this.L.setCallback(o9Var);
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var);
            this.L.f(org.telegram.ui.ActionBar.f6.l1(0.15f, v02), org.telegram.ui.ActionBar.f6.l1(0.5f, v02), org.telegram.ui.ActionBar.f6.l1(0.6f, v02), org.telegram.ui.ActionBar.f6.l1(0.15f, v02));
            this.L.f31582n = false;
        }
        o9Var.setImageDrawable(this.L);
        o9Var.setScaleX(1.0f);
        o9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.f26644y) {
            this.f26644y = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        setLayout(true);
        this.J = false;
        this.K = false;
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (peerDialogId == this.I) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.I = peerDialogId;
        String name = DialogObject.getName(peerDialogId);
        TextView textView = this.f26641s;
        textView.setText(name);
        textView.setVisibility(0);
        int i9 = this.f26634a;
        o9 o9Var = this.f26639n;
        z8 z8Var = this.f26640r;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
            z8Var.r(user);
            o9Var.e(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
        }
        o9Var.setScaleX(1.0f);
        o9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i10 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i10, false, false, z12, z11);
        if (this.f26644y) {
            this.f26644y = false;
        }
    }

    public final void g() {
        float f10;
        int i9 = org.telegram.ui.ActionBar.f6.f23386z6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26635b;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        if (this.J) {
            f10 = 1.0f;
        } else {
            f10 = this.M;
        }
        int d = i0.a.d(f10, v02, v03);
        boolean z10 = this.K;
        o9 o9Var = this.f26639n;
        if (!z10) {
            o9Var.setColorFilter(null);
        } else {
            o9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        }
        o9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        o9Var.invalidate();
    }

    public final void h() {
        int i9;
        float f10 = 1.0f;
        float f11 = (1.0f - this.M) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.v;
        imageView.setTranslationX(f11);
        if (this.M <= 0.0f) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        imageView.setVisibility(i9);
        int i10 = org.telegram.ui.ActionBar.f6.f23386z6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26635b;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        if (!this.J) {
            f10 = this.M;
        }
        this.f26641s.setTextColor(i0.a.d(f10, v02, v03));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i10);
    }

    public void setReorder(boolean z10) {
        this.f26642w = z10;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f10;
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.M;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new x11(this, 0));
        this.O.addListener(new u9(22, this, z10));
        this.O.setInterpolator(gr.h);
        this.O.setDuration(320L);
        this.O.start();
    }
}
