package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class d41 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public int F;
    public SpannableStringBuilder G;
    public SpannableStringBuilder H;
    public int I;
    public boolean J;
    public boolean K;
    public float L;
    public ValueAnimator M;
    public long N;
    public boolean O;
    public boolean P;
    public da0 Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public ValueAnimator W;
    public final int f27383a;
    public final org.telegram.ui.ActionBar.u6 f27384b;
    public eq0 f27385c;
    public final fi.l5 d;
    public final FrameLayout.LayoutParams e;
    public final r6 f27386f;
    public final bi.t1 h;
    public final y9 f27387n;
    public w31 f27388r;
    public final j9 f27389s;
    public final TextView v;
    public final ImageView f27390w;
    public boolean f27391x;
    public boolean f27392y;

    public d41(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f27392y = false;
        this.E = false;
        this.F = org.telegram.ui.ActionBar.y6.U8;
        this.L = 1.0f;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.f27383a = i10;
        this.f27384b = u6Var;
        fi.l5 l5Var = new fi.l5(this, context);
        this.d = l5Var;
        l5Var.setWillNotDraw(false);
        l5Var.setOrientation(1);
        addView(l5Var, gb1.h(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
        gb1.b(l5Var);
        r6 r6Var = new r6(false, false, false);
        this.f27386f = r6Var;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W8, u6Var));
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.f32121b = 17;
        bi.t1 t1Var = new bi.t1(this, context, u6Var);
        this.h = t1Var;
        t1Var.setWillNotDraw(false);
        t1Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        l5Var.addView(t1Var, gb1.u(-1, -2, 17));
        y9 y9Var = new y9(context);
        this.f27387n = y9Var;
        FrameLayout.LayoutParams i11 = gb1.i(34, 34, 17);
        this.e = i11;
        t1Var.addView(y9Var, i11);
        this.f27389s = new j9((org.telegram.ui.ActionBar.u6) null);
        TextView textView = new TextView(context);
        this.v = textView;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        textView.setTextColor(i0.a.f(this.U, w02, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        l5Var.addView(textView, gb1.x(-1, -2, 17, 4, 0, 4, 0));
        l5Var.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        ImageView imageView = new ImageView(context);
        this.f27390w = imageView;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(2.33f), org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(imageView, c02, N, null, u6Var);
        addView(imageView, gb1.h(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        float f7;
        float f10;
        int dp;
        int dp2;
        if (this.f27392y == z10) {
            return;
        }
        this.f27392y = z10;
        if (z10) {
            f7 = 36.0f;
        } else {
            f7 = 3.0f;
        }
        this.f27387n.setRoundRadius(AndroidUtilities.dp(f7));
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
        long j11 = this.N;
        long j12 = tL_forumTopic.f22079id;
        if (j11 == j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.P = false;
        this.N = j12;
        this.O = false;
        String str = tL_forumTopic.title;
        TextView textView = this.v;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.f22079id;
        y9 y9Var = this.f27387n;
        if (i10 == 1) {
            this.P = true;
            y9Var.b();
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageResource(R.drawable.msg_filled_general);
            y9Var.setScaleX(0.66f);
            y9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            y9Var.b();
            y9Var.setAnimatedEmojiDrawable(t5.n(UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id, null, 3));
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        } else {
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageDrawable(pg.d.e(tL_forumTopic));
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        boolean isDialogMuted = MessagesController.getInstance(this.f27383a).isDialogMuted(j10, tL_forumTopic.f22079id);
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
        if (this.E != z14) {
            this.E = z14;
        }
        h();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.P = true;
        this.O = true;
        String string = LocaleController.getString(R.string.NewTopic);
        TextView textView = this.v;
        textView.setText(string);
        textView.setVisibility(0);
        y9 y9Var = this.f27387n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        y9Var.setImageResource(R.drawable.emoji_tabs_new3);
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        setLayout(z11);
        this.N = -1L;
        this.P = true;
        this.O = false;
        if (z10) {
            i10 = R.string.BotForumNewTopic;
        } else {
            i10 = R.string.AllTopicsSide;
        }
        String string = LocaleController.getString(i10);
        TextView textView = this.v;
        textView.setText(string);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        y9 y9Var = this.f27387n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            w31 w31Var = new w31(getContext());
            w31Var.f34356b.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f27384b));
            y9Var.setImageDrawable(w31Var);
            this.f27388r = w31Var;
        } else {
            y9Var.setImageResource(R.drawable.other_chats);
            this.f27388r = null;
        }
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        r6 r6Var = this.f27386f;
        if (z12) {
            this.F = org.telegram.ui.ActionBar.y6.Z5;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                zq zqVar = new zq(R.drawable.mini_like_filled, 0);
                zqVar.setScale(0.8f, 0.8f);
                zqVar.spaceScaleX = 0.5f;
                zqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder.setSpan(zqVar, 0, spannableStringBuilder.length(), 33);
                this.H = spannableStringBuilder;
            }
            r6Var.t(this.H, z13, true);
        } else if (z11) {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.y6.V8;
            } else {
                i12 = org.telegram.ui.ActionBar.y6.U8;
            }
            this.F = i12;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                zq zqVar2 = new zq(R.drawable.mini_mention_filled_16, 0);
                zqVar2.setScale(0.8f, 0.8f);
                zqVar2.spaceScaleX = 0.5f;
                zqVar2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                spannableStringBuilder2.setSpan(zqVar2, 0, 1, 33);
                this.G = spannableStringBuilder2;
            }
            r6Var.t(this.G, z13, true);
        } else if (i10 > 0) {
            if (z10) {
                i11 = org.telegram.ui.ActionBar.y6.V8;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.U8;
            }
            this.F = i11;
            r6Var.t(LocaleController.formatNumber(i10, ','), z13, true);
        } else {
            this.F = org.telegram.ui.ActionBar.y6.V8;
            r6Var.t("", z13, true);
        }
        if (z13 && (this.I < i10 || ((!this.J && z11) || (!this.K && z12)))) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new b41(this, 1));
            this.M.addListener(new h31(this, 2));
            org.telegram.ui.d3.m(2.0f, this.M);
            this.M.setDuration(200L);
            this.M.start();
        }
        this.I = i10;
        this.J = z11;
        this.K = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.N = -1L;
        this.P = true;
        this.O = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int dp = AndroidUtilities.dp(38.0f);
        TextView textView = this.v;
        ea0 ea0Var = new ea0(dp, textView);
        ea0Var.e = 0.75f;
        spannableStringBuilder.setSpan(ea0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        y9 y9Var = this.f27387n;
        y9Var.b();
        y9Var.setAnimatedEmojiDrawable(null);
        if (this.Q == null) {
            org.telegram.ui.ActionBar.u6 u6Var = this.f27384b;
            da0 da0Var = new da0(u6Var);
            this.Q = da0Var;
            da0Var.k(38.0f);
            this.Q.setCallback(y9Var);
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
            this.Q.g(org.telegram.ui.ActionBar.y6.o1(0.15f, w02), org.telegram.ui.ActionBar.y6.o1(0.5f, w02), org.telegram.ui.ActionBar.y6.o1(0.6f, w02), org.telegram.ui.ActionBar.y6.o1(0.15f, w02));
            this.Q.f27471n = false;
        }
        y9Var.setImageDrawable(this.Q);
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        boolean z11;
        boolean z12;
        setLayout(true);
        this.O = false;
        this.P = false;
        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
        if (peerDialogId == this.N) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.N = peerDialogId;
        String name = DialogObject.getName(peerDialogId);
        TextView textView = this.v;
        textView.setText(name);
        textView.setVisibility(0);
        int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        int i11 = this.f27383a;
        y9 y9Var = this.f27387n;
        j9 j9Var = this.f27389s;
        if (i10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
            j9Var.r(user);
            y9Var.f(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
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
        if (this.E) {
            this.E = false;
        }
    }

    public final void g() {
        float f7;
        int i10 = org.telegram.ui.ActionBar.y6.f23767z6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27384b;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
        if (this.O) {
            f7 = 1.0f;
        } else {
            f7 = this.U;
        }
        int f10 = i0.a.f(f7, w02, w03);
        this.R = true;
        this.T = f10;
        boolean z10 = this.P;
        this.S = z10;
        y9 y9Var = this.f27387n;
        if (!z10) {
            y9Var.setColorFilter(null);
        } else {
            y9Var.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        y9Var.invalidate();
    }

    public final void h() {
        int i10;
        float f7 = 1.0f;
        float f10 = (1.0f - this.U) * (-AndroidUtilities.dp(3.0f));
        ImageView imageView = this.f27390w;
        imageView.setTranslationX(f10);
        if (this.U <= 0.0f) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        int i11 = org.telegram.ui.ActionBar.y6.f23767z6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27384b;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
        if (!this.O) {
            f7 = this.U;
        }
        this.v.setTextColor(i0.a.f(f7, w02, w03));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i11);
    }

    public void setReorder(boolean z10) {
        this.f27391x = z10;
        this.d.invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        float f7;
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.U;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new b41(this, 0));
        this.W.addListener(new org.telegram.ui.jo(23, this, z10));
        this.W.setInterpolator(ds.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    @Override
    public final void updateColors() {
        float f7;
        try {
            TextView textView = this.v;
            float f10 = 1.0f;
            org.telegram.ui.ActionBar.u6 u6Var = this.f27384b;
            if (textView != null) {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
                if (this.O) {
                    f7 = 1.0f;
                } else {
                    f7 = this.U;
                }
                textView.setTextColor(i0.a.f(f7, w02, w03));
            }
            y9 y9Var = this.f27387n;
            if (y9Var != null) {
                int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
                int w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
                if (!this.O) {
                    f10 = this.U;
                }
                int f11 = i0.a.f(f10, w04, w05);
                if (!this.R || f11 != this.T || this.P != this.S) {
                    g();
                }
            }
            w31 w31Var = this.f27388r;
            if (w31Var != null) {
                w31Var.f34356b.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
                if (y9Var != null) {
                    y9Var.invalidate();
                }
            }
            if (this.Q != null) {
                int w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
                this.Q.g(org.telegram.ui.ActionBar.y6.o1(0.15f, w06), org.telegram.ui.ActionBar.y6.o1(0.5f, w06), org.telegram.ui.ActionBar.y6.o1(0.6f, w06), org.telegram.ui.ActionBar.y6.o1(0.15f, w06));
                this.Q.f27471n = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
