package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class f60 extends org.telegram.ui.ActionBar.e3 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public final a60 P;
    public final org.telegram.ui.ActionBar.n2 Q;
    public final s50 R;
    public final TextView S;
    public AnimatorSet T;
    public final View U;
    public int V;
    public boolean W;
    public final boolean X;
    public final boolean Y;
    public final ArrayList Z;

    public final ArrayList f28270a0;

    public final TLRPC.TL_chatInviteExported f28271b;

    public final ArrayList f28272b0;

    public final HashMap f28273c;

    public final long f28274c0;
    public final TLRPC.ChatFull d;

    public final boolean f28275d0;

    public int f28276e;

    public final long f28277e0;

    public int f28278f;

    public org.telegram.ui.cb f28279f0;

    public boolean f28280g0;
    public int h;

    public boolean f28281h0;

    public int f28282n;

    public int f28283r;

    public int f28284s;
    public int v;

    public int f28285w;

    public int f28286x;

    public int f28287y;

    public f60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap map, final org.telegram.ui.ActionBar.n2 n2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        this.Z = new ArrayList();
        this.f28270a0 = new ArrayList();
        this.f28272b0 = new ArrayList();
        this.f28280g0 = true;
        this.f28281h0 = false;
        this.f28271b = tL_chatInviteExported;
        this.f28273c = map;
        this.Q = n2Var;
        this.d = chatFull;
        this.f28274c0 = j10;
        this.X = z10;
        this.f28275d0 = z11;
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (map == null) {
            this.f28273c = new HashMap();
        }
        this.f28277e0 = ((long) ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) - (System.currentTimeMillis() / 1000);
        r50 r50Var = new r50(this, context);
        this.containerView = r50Var;
        r50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.U = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        s50 s50Var = new s50(this, context);
        this.R = s50Var;
        s50Var.p1();
        s50Var.setTag(14);
        getContext();
        f2.k0 k0Var = new f2.k0(1, false);
        s50Var.setLayoutManager(k0Var);
        a60 a60Var = new a60(this);
        this.P = a60Var;
        s50Var.setAdapter(a60Var);
        s50Var.setVerticalScrollBarEnabled(false);
        s50Var.setClipToPadding(false);
        s50Var.setNestedScrollingEnabled(true);
        s50Var.setOnScrollListener(new t50(this, k0Var));
        s50Var.setOnItemClickListener(new pk0() {
            @Override
            public final void a(int i11, View view2) {
                f60.m(this.f30860a, tL_chatInviteExported, map, chatFull, context, j10, n2Var, i11);
            }
        });
        TextView textView = new TextView(context);
        this.S = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(AndroidUtilities.bold());
        if (z10) {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.Y = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        } else {
            if (tL_chatInviteExported.expired) {
                textView.setText(LocaleController.getString(R.string.ExpiredLink));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(LocaleController.getString(R.string.RevokedLink));
            } else {
                textView.setText(LocaleController.getString(R.string.InviteLink));
            }
            this.Y = true;
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        this.containerView.addView(s50Var, h7.z5.d(-1, -1.0f, 51, 0.0f, !this.Y ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(textView, h7.z5.d(-1, !this.Y ? 44.0f : 50.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        X();
        if (map == null || map.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f22521id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new w1(this, 6));
        }
        b0();
    }

    public static void O(f60 f60Var) {
        View view = f60Var.U;
        TextView textView = f60Var.S;
        s50 s50Var = f60Var.R;
        if (s50Var.getChildCount() <= 0) {
            int paddingTop = s50Var.getPaddingTop();
            f60Var.V = paddingTop;
            s50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(f60Var.V);
            view.setTranslationY(f60Var.V);
            f60Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = s50Var.getChildAt(0);
        lk0 lk0Var = (lk0) s50Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            f60Var.Y(true);
        } else {
            f60Var.Y(false);
            i10 = top;
        }
        if (f60Var.V != i10) {
            f60Var.V = i10;
            s50Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(f60Var.V);
            }
            view.setTranslationY(f60Var.V);
            f60Var.containerView.invalidate();
        }
    }

    public static void Z(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.c6 c6Var) {
        char c10;
        String str;
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        linearLayoutG.setClipChildren(false);
        linearLayoutG.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayoutG.addView(frameLayout, h7.z5.t(-1, -2, 7, 0, 0, 0, 10));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        if (j10 >= 0) {
            c10 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            y8Var.r(user);
            n9Var.e(user, y8Var);
        } else {
            c10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            y8Var.q(chat);
            n9Var.e(chat, y8Var);
        }
        frameLayout.addView(n9Var, h7.z5.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, h7.z5.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, h7.z5.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayoutG, textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        textViewI.setTextSize(1, 14.0f);
        textViewI.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.g6.B6;
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        int i12 = tL_starsSubscriptionPricing.period;
        if (i12 == 2592000) {
            int i13 = R.string.StarsSubscriptionPrice;
            str = "min";
            Object[] objArr = new Object[1];
            objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            textViewI.setText(hh.oa.X0(false, LocaleController.formatString(i13, objArr), 0.8f, null));
        } else {
            str = "min";
            textViewI.setText(hh.oa.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : str), 0.8f, null));
        }
        TextView textViewI2 = org.telegram.ui.Cells.pa.i(linearLayoutG, textViewI, h7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        textViewI2.setTextSize(1, 14.0f);
        textViewI2.setGravity(17);
        textViewI2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            textViewI2.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (((double) MessagesController.getInstance(i10).starsUsdWithdrawRate1000) * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            textViewI2.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (((double) MessagesController.getInstance(i10).starsUsdWithdrawRate1000) * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), i14 != 300 ? str : "5min"));
        }
        linearLayoutG.addView(textViewI2, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
        yy0 yy0Var = new yy0(context, c6Var);
        p80 p80Var = new p80(context, c6Var);
        p80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i15 = org.telegram.ui.ActionBar.g6.gc;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(true);
        p80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(p80Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z10 = user2 == null;
        String userName = UserObject.getUserName(user2);
        g5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new u50(e3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        p80Var.setText(spannableStringBuilder);
        if (!z10) {
            yy0Var.i(p80Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        yy0Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) tL_chatInviteImporter.date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) tL_chatInviteImporter.date) * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            yy0Var.c(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) channelParticipant.subscription_until_date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) channelParticipant.subscription_until_date) * 1000))), null, null);
        }
        linearLayoutG.addView(yy0Var, h7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        p80 p80Var2 = new p80(context, c6Var);
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new p20(context, 1)));
        p80Var2.setGravity(17);
        linearLayoutG.addView(p80Var2, h7.z5.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        linearLayoutG.addView(dVar, h7.z5.n(-1, 48));
        dVar.setOnClickListener(new h2(e3VarArr, 2));
        e3VarO.customView = linearLayoutG;
        e3VarArr[0] = e3VarO;
        e3VarO.useBackgroundTopPadding = false;
        e3VarO.fixNavigationBar();
        e3VarArr[0].show();
    }

    public static void a0(View view) {
        if (view instanceof org.telegram.ui.Cells.j4) {
            ((org.telegram.ui.Cells.j4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
            return;
        }
        if (view instanceof i80) {
            ((i80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.x8) {
            ((org.telegram.ui.Cells.x8) view).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.sa) {
            ((org.telegram.ui.Cells.sa) view).j(0);
        }
    }

    public static void m(final f60 f60Var, final TLRPC.TL_chatInviteExported tL_chatInviteExported, HashMap map, TLRPC.ChatFull chatFull, final Context context, final long j10, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2;
        TLRPC.User user;
        TLRPC.ChannelParticipant channelParticipant;
        if (i10 == f60Var.f28282n && tL_chatInviteExported.admin_id == UserConfig.getInstance(f60Var.currentAccount).clientUserId) {
            return;
        }
        int i11 = f60Var.f28286x;
        int i12 = 0;
        boolean z10 = i10 >= i11 && i10 < f60Var.f28287y;
        int i13 = f60Var.B;
        boolean z11 = i10 >= i13 && i10 < f60Var.C;
        int i14 = f60Var.K;
        boolean z12 = i10 >= i14 && i10 < f60Var.L;
        if ((i10 == f60Var.f28282n || z10 || z12) && map != null) {
            long j11 = tL_chatInviteExported.admin_id;
            if (z10) {
                tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) f60Var.Z.get(i10 - i11);
                j11 = tL_chatInviteImporter2.user_id;
            } else {
                if (!z11) {
                    if (z12) {
                        tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) f60Var.f28272b0.get(i10 - i14);
                        j11 = tL_chatInviteImporter2.user_id;
                    } else {
                        tL_chatInviteImporter = null;
                    }
                    user = (TLRPC.User) map.get(Long.valueOf(j11));
                    if (user != null) {
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                        if (z10 || tL_chatInviteExported.subscription_pricing == null) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((KeyEvent.Callback) f60Var, (Object) user, n2Var, 17), 100L);
                            f60Var.dismiss();
                        }
                        if (chatFull != null && chatFull.participants != null) {
                            while (true) {
                                if (i12 >= chatFull.participants.participants.size()) {
                                    channelParticipant = null;
                                    break;
                                } else {
                                    if (chatFull.participants.participants.get(i12).user_id == j11 && (chatFull.participants.participants.get(i12) instanceof TLRPC.TL_chatChannelParticipant)) {
                                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatFull.participants.participants.get(i12)).channelParticipant;
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        } else {
                            channelParticipant = null;
                            break;
                        }
                        if (channelParticipant != null) {
                            Z(context, f60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, f60Var.resourcesProvider);
                            return;
                        }
                        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                        b2Var.q(120L);
                        final TLRPC.TL_chatInviteImporter tL_chatInviteImporter3 = tL_chatInviteImporter;
                        MessagesController.getInstance(f60Var.currentAccount).getChannelParticipant(MessagesController.getInstance(f60Var.currentAccount).getChat(Long.valueOf(j10)), user, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                AndroidUtilities.runOnUIThread(new gf.h0(this.f31506a, b2Var, context, j10, tL_chatInviteExported, tL_chatInviteImporter3, (TLRPC.ChannelParticipant) obj));
                            }
                        });
                        return;
                    }
                }
                tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) f60Var.f28270a0.get(i10 - i13);
                j11 = tL_chatInviteImporter2.user_id;
            }
            tL_chatInviteImporter = tL_chatInviteImporter2;
            user = (TLRPC.User) map.get(Long.valueOf(j11));
            if (user != null) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser(user, false);
                if (z10) {
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((KeyEvent.Callback) f60Var, (Object) user, n2Var, 17), 100L);
                f60Var.dismiss();
            }
        }
    }

    public static void n(f60 f60Var, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        b2Var.c(400L);
        Z(context, f60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, f60Var.resourcesProvider);
    }

    public final void X() {
        final boolean z10;
        final boolean z11;
        final ArrayList arrayList;
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters;
        if (this.M) {
            return;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f28271b;
        int i10 = tL_chatInviteExported.usage;
        ArrayList arrayList2 = this.Z;
        boolean z12 = i10 > arrayList2.size();
        int i11 = tL_chatInviteExported.subscription_expired;
        ArrayList arrayList3 = this.f28270a0;
        final boolean z13 = i11 > arrayList3.size();
        boolean z14 = tL_chatInviteExported.request_needed;
        ArrayList arrayList4 = this.f28272b0;
        final boolean z15 = z14 && tL_chatInviteExported.requested > arrayList4.size();
        if (!z12) {
            if (z13) {
                z10 = false;
                z11 = true;
            } else if (!z15) {
                return;
            } else {
                z10 = true;
            }
            if (z10) {
                arrayList = arrayList4;
            } else if (z11) {
                arrayList = arrayList3;
            } else {
                arrayList = arrayList2;
            }
            tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
            tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.f28274c0);
            tL_messages_getChatInviteImporters.requested = z10;
            tL_messages_getChatInviteImporters.subscription_expired = z11;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f28273c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.M = true;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final f60 f60Var = this.f31164a;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z10;
                    final boolean z17 = z11;
                    final boolean z18 = z15;
                    final boolean z19 = z13;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            f60 f60Var2 = f60Var;
                            if (tL_error == null) {
                                TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                                ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                                ArrayList arrayList7 = arrayList5;
                                arrayList7.addAll(arrayList6);
                                for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                    TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                    f60Var2.f28273c.put(Long.valueOf(user.f22527id), user);
                                }
                                boolean z20 = true;
                                if (!z16) {
                                    boolean z21 = z17;
                                    boolean z22 = z18;
                                    if (!z21 ? !(arrayList7.size() < tL_messages_chatInviteImporters.count || z22 || z19) : !(arrayList7.size() < tL_messages_chatInviteImporters.count || z22)) {
                                        z20 = false;
                                    }
                                } else if (arrayList7.size() >= tL_messages_chatInviteImporters.count) {
                                    z20 = false;
                                }
                                f60Var2.N = z20;
                                f60Var2.c0();
                            }
                            f60Var2.M = false;
                        }
                    });
                }
            });
        }
        z10 = false;
        z11 = false;
        if (z10) {
            arrayList = arrayList4;
        } else if (z11) {
            arrayList = arrayList3;
        } else {
            arrayList = arrayList2;
        }
        tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        tL_messages_getChatInviteImporters.flags |= 2;
        tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
        tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.f28274c0);
        tL_messages_getChatInviteImporters.requested = z10;
        tL_messages_getChatInviteImporters.subscription_expired = z11;
        if (arrayList.isEmpty()) {
            tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        } else {
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
            tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f28273c.get(Long.valueOf(tL_chatInviteImporter2.user_id)));
            tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter2.date;
        }
        this.M = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final f60 f60Var = this.f31164a;
                final ArrayList arrayList5 = arrayList;
                final boolean z16 = z10;
                final boolean z17 = z11;
                final boolean z18 = z15;
                final boolean z19 = z13;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        f60 f60Var2 = f60Var;
                        if (tL_error == null) {
                            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                            ArrayList<TLRPC.TL_chatInviteImporter> arrayList6 = tL_messages_chatInviteImporters.importers;
                            ArrayList arrayList7 = arrayList5;
                            arrayList7.addAll(arrayList6);
                            for (int i12 = 0; i12 < tL_messages_chatInviteImporters.users.size(); i12++) {
                                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i12);
                                f60Var2.f28273c.put(Long.valueOf(user.f22527id), user);
                            }
                            boolean z20 = true;
                            if (!z16) {
                                boolean z21 = z17;
                                boolean z22 = z18;
                                if (!z21 ? !(arrayList7.size() < tL_messages_chatInviteImporters.count || z22 || z19) : !(arrayList7.size() < tL_messages_chatInviteImporters.count || z22)) {
                                    z20 = false;
                                }
                            } else if (arrayList7.size() >= tL_messages_chatInviteImporters.count) {
                                z20 = false;
                            }
                            f60Var2.N = z20;
                            f60Var2.c0();
                        }
                        f60Var2.M = false;
                    }
                });
            }
        });
    }

    public final void Y(boolean z10) {
        View view = this.U;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        TextView textView = this.S;
        if (z10) {
            view.setVisibility(0);
            textView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        if (!this.Y) {
            this.T.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.T.setDuration(150L);
        this.T.addListener(new org.telegram.ui.go(13, this, z10));
        this.T.start();
    }

    public final void b0() {
        TextView textView = this.S;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23180k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23197l5, false));
            if (!this.Y) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            }
        }
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false);
        s50 s50Var = this.R;
        s50Var.setGlowColor(iW0);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        int hiddenChildCount = s50Var.getHiddenChildCount();
        for (int i10 = 0; i10 < s50Var.getChildCount(); i10++) {
            a0(s50Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            a0(s50Var.V(i11));
        }
        int cachedChildCount = s50Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            a0(s50Var.P(i12));
        }
        int attachedScrapChildCount = s50Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            a0(s50Var.O(i13));
        }
        this.containerView.invalidate();
    }

    public final void c0() {
        boolean z10 = false;
        this.O = 0;
        this.f28283r = -1;
        this.f28284s = -1;
        this.v = -1;
        this.f28285w = -1;
        this.f28286x = -1;
        this.f28287y = -1;
        this.G = -1;
        this.H = -1;
        this.D = -1;
        this.E = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.F = -1;
        this.f28276e = -1;
        this.f28278f = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        boolean z11 = true;
        if (!this.X) {
            this.D = 0;
            this.O = 2;
            this.E = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f28271b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.O;
            this.f28276e = i10;
            this.O = i10 + 2;
            this.f28278f = i10 + 1;
        }
        int i11 = this.O;
        this.h = i11;
        this.O = i11 + 2;
        this.f28282n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        boolean z12 = i12 > 0 || tL_chatInviteExported.usage_limit > 0 || tL_chatInviteExported.requested > 0 || tL_chatInviteExported.subscription_expired > 0;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f28272b0;
        ArrayList arrayList3 = this.f28270a0;
        boolean z13 = i12 > size || tL_chatInviteExported.subscription_expired > arrayList3.size() || (tL_chatInviteExported.request_needed && tL_chatInviteExported.requested > arrayList2.size());
        if (!arrayList.isEmpty()) {
            int i13 = this.O;
            int i14 = i13 + 1;
            this.O = i14;
            this.f28285w = i13;
            this.f28286x = i14;
            int size2 = arrayList.size() + i14;
            this.O = size2;
            this.f28287y = size2;
            z10 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.O;
            int i16 = i15 + 1;
            this.O = i16;
            this.A = i15;
            this.B = i16;
            int size3 = arrayList3.size() + i16;
            this.O = size3;
            this.C = size3;
            z10 = true;
        }
        if (arrayList2.isEmpty()) {
            z11 = z10;
        } else {
            int i17 = this.O;
            int i18 = i17 + 1;
            this.O = i18;
            this.J = i17;
            this.K = i18;
            int size4 = arrayList2.size() + i18;
            this.O = size4;
            this.L = size4;
        }
        if ((z12 || z13) && !z11) {
            int i19 = this.O;
            this.f28283r = i19;
            this.F = i19 + 1;
            this.O = i19 + 3;
            this.G = i19 + 2;
        }
        this.P.l();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void show() {
        super.show();
        this.f28281h0 = false;
    }
}
