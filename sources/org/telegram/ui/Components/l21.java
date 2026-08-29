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
public final class l21 extends FrameLayout {
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
    public c90 L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final int f30208a;
    public final org.telegram.ui.ActionBar.c6 f30209b;
    public so0 f30210c;
    public final bg.l0 d;
    public final FrameLayout.LayoutParams f30211e;
    public final n6 f30212f;
    public final bg.z3 h;
    public final t9 f30213n;
    public final e9 f30214r;
    public final TextView f30215s;
    public final ImageView v;
    public boolean f30216w;
    public boolean f30217x;
    public boolean f30218y;

    public l21(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30217x = false;
        this.f30218y = false;
        this.A = org.telegram.ui.ActionBar.g6.U8;
        this.G = 1.0f;
        this.I = 0L;
        this.J = false;
        this.K = false;
        this.f30208a = i10;
        this.f30209b = c6Var;
        bg.l0 l0Var = new bg.l0(this, context);
        this.d = l0Var;
        l0Var.setWillNotDraw(false);
        l0Var.setOrientation(1);
        addView(l0Var, i7.f6.d(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        i7.h6.a(l0Var);
        n6 n6Var = new n6(false, false, false, false);
        this.f30212f = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.r(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W8, c6Var));
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.f30862b = 17;
        bg.z3 z3Var = new bg.z3(this, context, c6Var);
        this.h = z3Var;
        z3Var.setWillNotDraw(false);
        z3Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        l0Var.addView(z3Var, i7.f6.q(-1, -2, 17));
        t9 t9Var = new t9(context);
        this.f30213n = t9Var;
        FrameLayout.LayoutParams e10 = i7.f6.e(34, 34, 17);
        this.f30211e = e10;
        z3Var.addView(t9Var, e10);
        this.f30214r = new e9((org.telegram.ui.ActionBar.c6) null);
        TextView textView = new TextView(context);
        this.f30215s = textView;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        textView.setTextColor(i0.a.d(this.M, v02, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        l0Var.addView(textView, i7.f6.t(-1, -2, 17, 4, 0, 4, 0));
        l0Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        addView(imageView, i7.f6.d(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f9;
        float f10;
        int dp;
        int dp2;
        if (this.f30217x == z10) {
            return;
        }
        this.f30217x = z10;
        if (z10) {
            f9 = 36.0f;
        } else {
            f9 = 3.0f;
        }
        this.f30213n.setRoundRadius(AndroidUtilities.dp(f9));
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
        FrameLayout.LayoutParams layoutParams = this.f30211e;
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
        long j12 = tL_forumTopic.f22444id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = false;
        this.I = j12;
        this.J = false;
        String str = tL_forumTopic.title;
        TextView textView = this.f30215s;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.f22444id;
        t9 t9Var = this.f30213n;
        if (i10 == 1) {
            this.K = true;
            t9Var.b();
            t9Var.setAnimatedEmojiDrawable(null);
            t9Var.setImageResource(R.drawable.msg_filled_general);
            t9Var.setScaleX(0.66f);
            t9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            t9Var.b();
            t9Var.setAnimatedEmojiDrawable(p5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            t9Var.setScaleX(1.0f);
            t9Var.setScaleY(1.0f);
        } else {
            t9Var.setAnimatedEmojiDrawable(null);
            t9Var.setImageDrawable(yf.d.e(tL_forumTopic));
            t9Var.setScaleX(1.0f);
            t9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.f30208a).isDialogMuted(j10, tL_forumTopic.f22444id);
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
        if (this.f30218y != z16) {
            this.f30218y = z16;
        }
        h();
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.K = true;
        this.J = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.f30215s;
        textView.setText(string);
        textView.setVisibility(0);
        t9 t9Var = this.f30213n;
        t9Var.b();
        t9Var.setAnimatedEmojiDrawable(null);
        t9Var.setImageResource(R.drawable.emoji_tabs_new3);
        t9Var.setScaleX(1.0f);
        t9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f30218y) {
            this.f30218y = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.I = -1L;
        this.K = true;
        this.J = false;
        if (z10) {
            i10 = R.string.BotForumNewTopic;
        } else {
            i10 = R.string.AllTopicsSide;
        }
        String string = LocaleController.getString(i10);
        TextView textView = this.f30215s;
        textView.setText(string);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        t9 t9Var = this.f30213n;
        t9Var.b();
        t9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            e21 e21Var = new e21(getContext());
            e21Var.f27913b.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f30209b));
            t9Var.setImageDrawable(e21Var);
        } else {
            t9Var.setImageResource(R.drawable.other_chats);
        }
        t9Var.setScaleX(1.0f);
        t9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.f30218y) {
            this.f30218y = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        n6 n6Var = this.f30212f;
        if (z12) {
            this.A = org.telegram.ui.ActionBar.g6.Z5;
            if (this.C == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                iq iqVar = new iq(R.drawable.mini_like_filled, 0);
                iqVar.setScale(0.8f, 0.8f);
                iqVar.spaceScaleX = 0.5f;
                iqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(iqVar, 0, spannableStringBuilder.length(), 33);
                this.C = spannableStringBuilder;
            }
            n6Var.q(this.C, z13, true);
        } else if (z11) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.g6.V8;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.U8;
            }
            this.A = i12;
            if (this.B == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                iq iqVar2 = new iq(R.drawable.mini_mention_filled_16, 0);
                iqVar2.setScale(0.8f, 0.8f);
                iqVar2.spaceScaleX = 0.5f;
                iqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(iqVar2, 0, 1, 33);
                this.B = spannableStringBuilder2;
            }
            n6Var.q(this.B, z13, true);
        } else if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.g6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.U8;
            }
            this.A = i11;
            n6Var.q(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.A = org.telegram.ui.ActionBar.g6.V8;
            n6Var.q("", z13, true);
        }
        if (z13 && (this.D < i10 || ((!this.E && z11) || (!this.F && z12)))) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new j21(this, 1));
            this.H.addListener(new p11(this, 2));
            this.H.setInterpolator(new OvershootInterpolator(2.0f));
            this.H.setDuration(200L);
            this.H.start();
        }
        this.D = i10;
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
        TextView textView = this.f30215s;
        d90 d90Var = new d90(dp, textView);
        d90Var.f27720e = 0.75f;
        spannableStringBuilder.setSpan(d90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        t9 t9Var = this.f30213n;
        t9Var.b();
        t9Var.setAnimatedEmojiDrawable(null);
        if (this.L == null) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f30209b;
            c90 c90Var = new c90(c6Var);
            this.L = c90Var;
            c90Var.j(38.0f);
            this.L.setCallback(t9Var);
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var);
            this.L.f(org.telegram.ui.ActionBar.g6.l1(0.15f, v02), org.telegram.ui.ActionBar.g6.l1(0.5f, v02), org.telegram.ui.ActionBar.g6.l1(0.6f, v02), org.telegram.ui.ActionBar.g6.l1(0.15f, v02));
            this.L.f27391n = false;
        }
        t9Var.setImageDrawable(this.L);
        t9Var.setScaleX(1.0f);
        t9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.f30218y) {
            this.f30218y = false;
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
        TextView textView = this.f30215s;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = this.f30208a;
        t9 t9Var = this.f30213n;
        e9 e9Var = this.f30214r;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            e9Var.r(user);
            t9Var.e(user, e9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
        }
        t9Var.setScaleX(1.0f);
        t9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        int i11 = tL_forumTopic.unread_count;
        if (tL_forumTopic.unread_reactions_count > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(i11, false, false, z12, z11);
        if (this.f30218y) {
            this.f30218y = false;
        }
    }

    public final void g() {
        float f9;
        int i10 = org.telegram.ui.ActionBar.g6.f23450z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30209b;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        if (this.J) {
            f9 = 1.0f;
        } else {
            f9 = this.M;
        }
        int d = i0.a.d(f9, v02, v03);
        boolean z10 = this.K;
        t9 t9Var = this.f30213n;
        if (!z10) {
            t9Var.setColorFilter(null);
        } else {
            t9Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        }
        t9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        t9Var.invalidate();
    }

    public final void h() {
        int i10;
        float f9 = 1.0f;
        float f10 = (1.0f - this.M) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.v;
        imageView.setTranslationX(f10);
        if (this.M <= 0.0f) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.g6.f23450z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30209b;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        if (!this.J) {
            f9 = this.M;
        }
        this.f30215s.setTextColor(i0.a.d(f9, v02, v03));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i11);
    }

    public void setReorder(boolean z10) {
        this.f30216w = z10;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f9;
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.M;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new j21(this, 0));
        this.O.addListener(new z9(22, this, z10));
        this.O.setInterpolator(jr.h);
        this.O.setDuration(320L);
        this.O.start();
    }
}
