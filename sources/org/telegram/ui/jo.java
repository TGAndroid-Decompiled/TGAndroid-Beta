package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

public class jo extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.i40, NotificationCenter.NotificationCenterDelegate {
    public EditTextBoldCursor A;
    public TLRPC.UserFull A0;
    public LinearLayout B;
    public boolean B0;
    public org.telegram.ui.Cells.w6 C;
    public boolean C0;
    public org.telegram.ui.Cells.l8 D;
    public boolean D0;
    public org.telegram.ui.Cells.l8 E;
    public boolean E0;
    public org.telegram.ui.Cells.l8 F;
    public boolean F0;
    public org.telegram.ui.Cells.l8 G;
    public TLRPC.ChatReactions G0;
    public io0 H;
    public TL_stories.TL_premium_boostsStatus H0;
    public org.telegram.ui.Cells.l8 I;
    public boolean I0;
    public org.telegram.ui.Cells.l8 J;
    public boolean J0;
    public org.telegram.ui.Cells.l8 K;
    public boolean K0;
    public org.telegram.ui.Cells.x8 L;
    public final ArrayList L0;
    public org.telegram.ui.Cells.l8 M;
    public final ho M0;
    public LinearLayout N;
    public org.telegram.ui.Components.oi0 N0;
    public LinearLayout O;
    public ValueAnimator O0;
    public org.telegram.ui.Cells.l8 P;
    public org.telegram.ui.Cells.l8 Q;
    public org.telegram.ui.Cells.l8 R;
    public org.telegram.ui.Cells.l8 S;
    public org.telegram.ui.Cells.l8 T;
    public org.telegram.ui.Cells.l8 U;
    public org.telegram.ui.Cells.l8 V;
    public org.telegram.ui.Cells.l8 W;
    public io X;
    public FrameLayout Y;
    public org.telegram.ui.Cells.x9 Z;

    public org.telegram.ui.ActionBar.v0 f39403a;

    public org.telegram.ui.Cells.w6 f39404a0;

    public org.telegram.ui.ActionBar.b2 f39405b;

    public org.telegram.ui.Cells.l8 f39406b0;

    public UndoView f39407c;

    public org.telegram.ui.Cells.l8 f39408c0;
    public LinearLayout d;

    public ph.a f39409d0;

    public jh.z3 f39410e;

    public org.telegram.ui.Cells.x8 f39411e0;

    public ag.t0 f39412f;

    public org.telegram.ui.Cells.l8 f39413f0;

    public org.telegram.ui.Cells.x8 f39414g0;
    public AnimatorSet h;

    public org.telegram.ui.Cells.l8 f39415h0;

    public org.telegram.ui.Cells.l8 f39416i0;

    public org.telegram.ui.Cells.l8 f39417j0;

    public org.telegram.ui.Cells.l8 f39418k0;

    public org.telegram.ui.Cells.l8 f39419l0;
    public org.telegram.ui.Cells.l8 m0;

    public RadialProgressView f39420n;

    public org.telegram.ui.Cells.l8 f39421n0;

    public org.telegram.ui.Cells.x8 f39422o0;

    public org.telegram.ui.Cells.x8 f39423p0;

    public org.telegram.ui.Cells.l8 f39424q0;

    public final org.telegram.ui.Components.y8 f39425r;

    public TLRPC.FileLocation f39426r0;

    public final org.telegram.ui.Components.j40 f39427s;

    public long f39428s0;

    public TLRPC.Chat f39429t0;

    public TLRPC.ChatFull f39430u0;
    public org.telegram.ui.Components.tt v;

    public TLRPC.TL_chatAdminRights f39431v0;

    public hh.m f39432w;

    public TLRPC.TL_chatBannedRights f39433w0;

    public org.telegram.ui.Components.kn0 f39434x;

    public TLRPC.TL_chatBannedRights f39435x0;

    public LinearLayout f39436y;

    public final long f39437y0;

    public TLRPC.User f39438z0;

    public jo(Bundle bundle) {
        super(bundle);
        this.L0 = new ArrayList();
        this.M0 = new ho(this);
        this.f39425r = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f39428s0 = bundle.getLong("chat_id", 0L);
        this.f39437y0 = bundle.getLong("user_id", 0L);
        if (this.f39428s0 == 0) {
            this.f39427s = new org.telegram.ui.Components.j40(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f39428s0));
            this.f39427s = new org.telegram.ui.Components.j40((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(jo joVar, FrameLayout frameLayout, View view) {
        if (!joVar.C0) {
            TLRPC.ChatFull chatFull = joVar.f39430u0;
            org.telegram.ui.Components.mc.a0(joVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", joVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -joVar.f39428s0;
        yy yyVar = new yy(null);
        yyVar.f44964a = j10;
        yyVar.setResourceProvider(joVar.resourceProvider);
        boolean z10 = joVar.B0;
        boolean z11 = joVar.D0;
        cg.u0 u0Var = new cg.u0(14, joVar, view);
        yyVar.f44966c = z10;
        yyVar.d = z11;
        yyVar.f44968f = u0Var;
        joVar.presentFragment(yyVar);
    }

    public static void V(jo joVar) {
        joVar.f39426r0 = null;
        long j10 = joVar.f39437y0;
        if (j10 == 0) {
            MessagesController.getInstance(joVar.currentAccount).changeChatAvatar(joVar.f39428s0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = joVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f22512id = new TLRPC.TL_inputPhotoEmpty();
            joVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ao(joVar, 2));
        }
        joVar.n0(false, true);
        jh.z3 z3Var = joVar.f39410e;
        org.telegram.ui.Components.y8 y8Var = joVar.f39425r;
        Object obj = joVar.f39438z0;
        if (obj == null) {
            obj = joVar.f39429t0;
        }
        z3Var.h(null, null, y8Var, obj);
        joVar.N0.K(0);
        joVar.X.f24631e.d();
    }

    public static void X(jo joVar) {
        int i10 = joVar.currentAccount;
        long j10 = joVar.f39437y0;
        TL_bots.botVerifierSettings botverifiersettings = joVar.A0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return;
        }
        Bundle bundleE = org.telegram.messenger.y1.e(16, "onlySelect", "dialogsType", true);
        bundleE.putBoolean("resetDelegate", false);
        gy gyVar = new gy(bundleE);
        gyVar.setCurrentAccount(i10);
        gyVar.f38621y2 = new nh.p1(gyVar, i10, j10, botverifiersettings);
        n2VarU.presentFragment(gyVar);
    }

    public static void Y(jo joVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        b2Var.dismiss();
        if (joVar.getParentActivity() == null) {
            return;
        }
        ag.i1 i1Var = new ag.i1(35, joVar.currentAccount, joVar.getParentActivity(), joVar, joVar.getResourceProvider());
        i1Var.G1(canApplyBoost);
        i1Var.F1(tL_premium_boostsStatus, true);
        i1Var.H1(j10);
        TLRPC.Chat chat = joVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            i1Var.M0 = new rd(20, joVar, chat);
        }
        joVar.showDialog(i1Var);
    }

    public static void Z(jo joVar) {
        xc xcVar = new xc(-joVar.f39429t0.f22380id);
        xcVar.f44392h0 = joVar;
        joVar.presentFragment(xcVar);
        MessagesController.getInstance(joVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(joVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static void a0(jo joVar) {
        joVar.K0 = true;
        NotificationCenter.getInstance(joVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00(10);
        o00Var.f40966a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        o00Var.f40970f = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false);
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String g0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override
    public final void E(float f10) {
        RadialProgressView radialProgressView = this.f39420n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f39420n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new oh.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final View createView(Context context) {
        Context context2;
        long j10;
        final int i10;
        final jo joVar;
        final int i11;
        Integer num;
        boolean z10;
        CharSequence charSequenceX0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        final int i12;
        TLRPC.User user;
        final jo joVar2;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        String name;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        int i13;
        int i14;
        int i15;
        int i16;
        TLRPC.ChatFull chatFull2;
        boolean z11;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i17 = 1;
        Integer num2 = 1;
        org.telegram.ui.Components.tt ttVar = this.v;
        if (ttVar != null) {
            ttVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 26));
        ed edVar = new ed(i17, context, this);
        edVar.setOnTouchListener(new kh.e(9));
        this.fragmentView = edVar;
        edVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f22999a7));
        hh.m mVar = new hh.m(context);
        this.f39432w = mVar;
        final int i18 = 0;
        org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(context, this.f39432w, this.resourceProvider, false);
        this.f39434x = kn0Var;
        kn0Var.setFillViewport(true);
        edVar.addView(this.f39434x, h7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f39434x);
        this.f39434x.addView(mVar, new FrameLayout.LayoutParams(-1, -2));
        mVar.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23053d6));
        mVar.addView(this.d, h7.z5.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, h7.z5.n(-1, -2));
        jh.z3 z3Var = new jh.z3(this, context, 5);
        this.f39410e = z3Var;
        z3Var.setRoundRadius(this.B0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        int i19 = 6;
        if (this.f39438z0 != null || ChatObject.canChangeChatInfo(this.f39429t0)) {
            jh.z3 z3Var2 = this.f39410e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(z3Var2, h7.z5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ag.t0 t0Var = new ag.t0(this, context, paint, i19);
            this.f39412f = t0Var;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(t0Var, h7.z5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.f39420n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.f39420n.setProgressColor(-1);
            this.f39420n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.f39420n;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, h7.z5.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) {

                public final jo f43492b;

                {
                    this.f43492b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j11 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j11 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j11));
                                if (user3 == null) {
                                    TLRPC.Chat chat3 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                        int i20 = chatPhoto2.dc_id;
                                        if (i20 != 0) {
                                            chatPhoto2.photo_big.dc_id = i20;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat3.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i21 = userProfilePhoto2.dc_id;
                                        if (i21 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i21;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j12 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var = joVar14.D;
                            boolean z15 = l8Var != null && l8Var.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j12;
                            xoVar.f44562j0 = z15;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j13 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z16 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j13;
                            TLRPC.Chat chat4 = jpVar.getMessagesController().getChat(Long.valueOf(j13));
                            jpVar.f39454f = chat4;
                            if (ChatObject.isChannel(chat4) && !jpVar.f39454f.megagroup) {
                                z16 = true;
                            }
                            jpVar.f39457s = z16;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j14;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i22 = 0; i22 < tL_chatReactionsSome.reactions.size(); i22++) {
                                            if (tL_chatReactionsSome.reactions.get(i22) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i22)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
        } else {
            jh.z3 z3Var3 = this.f39410e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(z3Var3, h7.z5.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.tt ttVar2 = new org.telegram.ui.Components.tt(context, edVar, this);
        this.v = ttVar2;
        long j11 = this.f39437y0;
        if (j11 != 0) {
            ttVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.E0) {
            ttVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            ttVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.tt ttVar3 = this.v;
        TLRPC.Chat chat3 = this.f39429t0;
        ttVar3.setEnabled(chat3 != null || ChatObject.canChangeChatInfo(chat3));
        org.telegram.ui.Components.tt ttVar4 = this.v;
        ttVar4.setFocusable(ttVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new p0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.tt ttVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(ttVar5, h7.z5.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f39436y = linearLayout2;
        linearLayout2.setOrientation(1);
        mVar.addView(this.f39436y, h7.z5.n(-1, -2));
        final int i20 = 12;
        if (this.f39438z0 != null || ChatObject.canChangeChatInfo(this.f39429t0)) {
            io ioVar = new io(context);
            this.X = ioVar;
            ioVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            this.X.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
            this.X.setOnClickListener(new View.OnClickListener(this) {

                public final jo f43492b;

                {
                    this.f43492b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i20) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j12 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j12 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j12));
                                if (user3 == null) {
                                    TLRPC.Chat chat4 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                        int i21 = chatPhoto2.dc_id;
                                        if (i21 != 0) {
                                            chatPhoto2.photo_big.dc_id = i21;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat4.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i22 = userProfilePhoto2.dc_id;
                                        if (i22 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i22;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j13 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var = joVar14.D;
                            boolean z17 = l8Var != null && l8Var.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j13;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j14 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j14;
                            TLRPC.Chat chat5 = jpVar.getMessagesController().getChat(Long.valueOf(j14));
                            jpVar.f39454f = chat5;
                            if (ChatObject.isChannel(chat5) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j15 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j15;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j15));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i23 = 0; i23 < tL_chatReactionsSome.reactions.size(); i23++) {
                                            if (tL_chatReactionsSome.reactions.get(i23) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i23)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            this.f39436y.addView(this.X, h7.z5.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.A = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.A.setHintTextColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.A;
        int i21 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.u0(i21));
        this.A.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.A.setBackgroundDrawable(null);
        this.A.setGravity(LocaleController.isRTL ? 5 : 3);
        this.A.setInputType(180225);
        this.A.setImeOptions(6);
        this.A.setEnabled(this.f39438z0 != null || ChatObject.canChangeChatInfo(this.f39429t0));
        EditTextBoldCursor editTextBoldCursor3 = this.A;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.A.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.A.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.A.setCursorColor(org.telegram.ui.ActionBar.g6.u0(i21));
        this.A.setCursorSize(AndroidUtilities.dp(20.0f));
        this.A.setCursorWidth(1.5f);
        if (this.A.isEnabled()) {
            this.f39436y.addView(this.A, h7.z5.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.f39436y.addView(this.A, h7.z5.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.A.setOnEditorActionListener(new fa(this, 2));
        this.A.addTextChangedListener(new hd(1));
        org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context);
        this.C = w6Var;
        mVar.addView(w6Var, h7.z5.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.B = linearLayout3;
        linearLayout3.setOrientation(1);
        mVar.addView(this.B, h7.z5.n(-1, -2));
        TLRPC.Chat chat4 = this.f39429t0;
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.f39430u0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
                this.D = l8Var;
                l8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.B.addView(this.D, h7.z5.n(-1, -2));
                final int i22 = 15;
                this.D.setOnClickListener(new View.OnClickListener(this) {

                    public final jo f43492b;

                    {
                        this.f43492b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j12 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j12 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j12));
                                    if (user3 == null) {
                                        TLRPC.Chat chat5 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat5.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                                            int i23 = chatPhoto2.dc_id;
                                            if (i23 != 0) {
                                                chatPhoto2.photo_big.dc_id = i23;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat5.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i24 = userProfilePhoto2.dc_id;
                                            if (i24 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i24;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j13 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var2 = joVar14.D;
                                boolean z17 = l8Var2 != null && l8Var2.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j13;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j14 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j14;
                                TLRPC.Chat chat6 = jpVar.getMessagesController().getChat(Long.valueOf(j14));
                                jpVar.f39454f = chat6;
                                if (ChatObject.isChannel(chat6) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j15 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j15;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j15));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i25 = 0; i25 < tL_chatReactionsSome.reactions.size(); i25++) {
                                                if (tL_chatReactionsSome.reactions.get(i25) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i25)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.f39429t0.creator && ((chatFull3 = this.f39430u0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context);
                this.E = l8Var2;
                l8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.B.addView(this.E, h7.z5.n(-1, -2));
                final int i23 = 16;
                this.E.setOnClickListener(new View.OnClickListener(this) {

                    public final jo f43492b;

                    {
                        this.f43492b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j12 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j12 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j12));
                                    if (user3 == null) {
                                        TLRPC.Chat chat5 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat5.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                                            int i24 = chatPhoto2.dc_id;
                                            if (i24 != 0) {
                                                chatPhoto2.photo_big.dc_id = i24;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat5.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i25 = userProfilePhoto2.dc_id;
                                            if (i25 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i25;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j13 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var3 = joVar14.D;
                                boolean z17 = l8Var3 != null && l8Var3.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j13;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j14 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j14;
                                TLRPC.Chat chat6 = jpVar.getMessagesController().getChat(Long.valueOf(j14));
                                jpVar.f39454f = chat6;
                                if (ChatObject.isChannel(chat6) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j15 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j15;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j15));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i26 = 0; i26 < tL_chatReactionsSome.reactions.size(); i26++) {
                                                if (tL_chatReactionsSome.reactions.get(i26) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i26)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.f39429t0) && ((this.E0 && ChatObject.canUserDoAdminAction(this.f39429t0, 1)) || (!this.E0 && ChatObject.canUserDoAdminAction(this.f39429t0, 0)))) {
                org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(context);
                this.F = l8Var3;
                l8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.B.addView(this.F, h7.z5.n(-1, -2));
                final int i24 = 17;
                this.F.setOnClickListener(new View.OnClickListener(this) {

                    public final jo f43492b;

                    {
                        this.f43492b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j12 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j12 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j12));
                                    if (user3 == null) {
                                        TLRPC.Chat chat5 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat5.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                                            int i25 = chatPhoto2.dc_id;
                                            if (i25 != 0) {
                                                chatPhoto2.photo_big.dc_id = i25;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat5.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i26 = userProfilePhoto2.dc_id;
                                            if (i26 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i26;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j13 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var4 = joVar14.D;
                                boolean z17 = l8Var4 != null && l8Var4.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j13;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j14 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j14;
                                TLRPC.Chat chat6 = jpVar.getMessagesController().getChat(Long.valueOf(j14));
                                jpVar.f39454f = chat6;
                                if (ChatObject.isChannel(chat6) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j15 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j15;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j15));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i27 = 0; i27 < tL_chatReactionsSome.reactions.size(); i27++) {
                                                if (tL_chatReactionsSome.reactions.get(i27) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i27)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.f39429t0) && this.E0 && ChatObject.canUserDoAdminAction(this.f39429t0, 1)) {
                org.telegram.ui.Cells.l8 l8Var4 = new org.telegram.ui.Cells.l8(context);
                this.G = l8Var4;
                l8Var4.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                this.G.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.B.addView(this.G, h7.z5.n(-1, -2));
                final int i25 = 18;
                this.G.setOnClickListener(new View.OnClickListener(this) {

                    public final jo f43492b;

                    {
                        this.f43492b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j12 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j12 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j12));
                                    if (user3 == null) {
                                        TLRPC.Chat chat5 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat5.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                                            int i26 = chatPhoto2.dc_id;
                                            if (i26 != 0) {
                                                chatPhoto2.photo_big.dc_id = i26;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat5.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i27 = userProfilePhoto2.dc_id;
                                            if (i27 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i27;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j13 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var5 = joVar14.D;
                                boolean z17 = l8Var5 != null && l8Var5.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j13;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j14 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j14;
                                TLRPC.Chat chat6 = jpVar.getMessagesController().getChat(Long.valueOf(j14));
                                jpVar.f39454f = chat6;
                                if (ChatObject.isChannel(chat6) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j15 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j15;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j15));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i28 = 0; i28 < tL_chatReactionsSome.reactions.size(); i28++) {
                                                if (tL_chatReactionsSome.reactions.get(i28) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i28)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.f39429t0) && ChatObject.canChangeChatInfo(this.f39429t0)) {
                z11 = true;
                j10 = j11;
                i10 = 23;
                io0 io0Var = new io0(this.currentAccount, -this.f39429t0.f22380id, context, getResourceProvider());
                this.H = io0Var;
                io0Var.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                this.B.addView(this.H, h7.z5.n(-1, -2));
                final int i26 = 19;
                this.H.setOnClickListener(new View.OnClickListener(this) {

                    public final jo f43492b;

                    {
                        this.f43492b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j12 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j12 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j12));
                                    if (user3 == null) {
                                        TLRPC.Chat chat5 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat5.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                                            int i27 = chatPhoto2.dc_id;
                                            if (i27 != 0) {
                                                chatPhoto2.photo_big.dc_id = i27;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat5.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i28 = userProfilePhoto2.dc_id;
                                            if (i28 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i28;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j13 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var5 = joVar14.D;
                                boolean z17 = l8Var5 != null && l8Var5.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j13;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j14 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j14;
                                TLRPC.Chat chat6 = jpVar.getMessagesController().getChat(Long.valueOf(j14));
                                jpVar.f39454f = chat6;
                                if (ChatObject.isChannel(chat6) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j15 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j15;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j15));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i29 = 0; i29 < tL_chatReactionsSome.reactions.size(); i29++) {
                                                if (tL_chatReactionsSome.reactions.get(i29) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i29)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                j10 = j11;
                i10 = 23;
                z11 = true;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.f39429t0) || ChatObject.isCommunity(this.f39429t0)) {
                context3 = context;
                frameLayout = frameLayout2;
            } else {
                long j12 = -this.f39429t0.f22380id;
                org.telegram.ui.Cells.l8 l8Var5 = new org.telegram.ui.Cells.l8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.I = l8Var5;
                l8Var5.setBackground(org.telegram.ui.ActionBar.g6.K0(z11));
                this.I.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.f39429t0.autotranslation);
                getMessagesController().getBoostsController().getBoostsStats(j12, new d5.d(this) {

                    public final jo f45214b;

                    {
                        this.f45214b = this;
                    }

                    @Override
                    public final void accept(Object obj) {
                        switch (i18) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                jo joVar3 = this.f45214b;
                                if (tL_premium_boostsStatus == null) {
                                    joVar3.getClass();
                                } else {
                                    joVar3.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < joVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                }
                                break;
                            default:
                                this.f45214b.H0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.B.addView(this.I, h7.z5.n(-1, -2));
                frameLayout = frameLayout2;
                this.I.setOnClickListener(new hh.s2(this, new boolean[]{false}, j12, 1));
            }
            if (!joVar.E0 && ChatObject.canBlockUsers(joVar.f39429t0) && (ChatObject.isChannel(joVar.f39429t0) || joVar.f39429t0.creator)) {
                org.telegram.ui.Cells.l8 l8Var6 = new org.telegram.ui.Cells.l8(context3);
                joVar.J = l8Var6;
                l8Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                joVar.B.addView(joVar.J, h7.z5.n(-1, -2));
                joVar.J.setOnClickListener(new nh.x1(i10, joVar, context3));
            }
            if (ChatObject.isMegagroup(joVar.f39429t0) && ChatObject.hasAdminRights(joVar.f39429t0) && !ChatObject.isCommunity(joVar.f39429t0)) {
                final int i27 = 1;
                MessagesController.getInstance(joVar.currentAccount).getBoostsController().getBoostsStats(-joVar.f39429t0.f22380id, new d5.d(joVar) {

                    public final jo f45214b;

                    {
                        this.f45214b = joVar;
                    }

                    @Override
                    public final void accept(Object obj) {
                        switch (i27) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                jo joVar3 = this.f45214b;
                                if (tL_premium_boostsStatus == null) {
                                    joVar3.getClass();
                                } else {
                                    joVar3.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < joVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                }
                                break;
                            default:
                                this.f45214b.H0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                io0 io0Var2 = new io0(joVar.currentAccount, -joVar.f39429t0.f22380id, context3, joVar.getResourceProvider());
                joVar.H = io0Var2;
                io0Var2.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                joVar.B.addView(joVar.H, h7.z5.n(-1, -2));
                final int i28 = 20;
                joVar.H.setOnClickListener(new View.OnClickListener(joVar) {

                    public final jo f43492b;

                    {
                        this.f43492b = joVar;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i28) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j13 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                    if (user3 == null) {
                                        TLRPC.Chat chat5 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat5.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                                            int i29 = chatPhoto2.dc_id;
                                            if (i29 != 0) {
                                                chatPhoto2.photo_big.dc_id = i29;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat5.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i210 = userProfilePhoto2.dc_id;
                                            if (i210 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i210;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j14 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var7 = joVar14.D;
                                boolean z17 = l8Var7 != null && l8Var7.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j14;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j15 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j15;
                                TLRPC.Chat chat6 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                                jpVar.f39454f = chat6;
                                if (ChatObject.isChannel(chat6) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j16 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j16;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i211 = 0; i211 < tL_chatReactionsSome.reactions.size(); i211++) {
                                                if (tL_chatReactionsSome.reactions.get(i211) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i211)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!joVar.E0 && joVar.f39429t0.creator) {
                org.telegram.ui.Cells.l8 l8Var7 = new org.telegram.ui.Cells.l8(23, context, null, false, true);
                context2 = context;
                joVar.M = l8Var7;
                l8Var7.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                joVar.M.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), joVar.B0);
                joVar.M.getCheckBox().setIcon(joVar.C0 ? 0 : R.drawable.permission_locked);
                joVar.B.addView(joVar.M, h7.z5.c(-2.0f, -1));
                joVar.M.setOnClickListener(new nh.x1(24, this, frameLayout));
            } else {
                context2 = context;
            }
            joVar.o0();
        } else {
            context2 = context;
            j10 = j11;
            num2 = num2;
            edVar = edVar;
            i10 = 23;
            joVar = this;
        }
        org.telegram.ui.ActionBar.z zVarN = joVar.actionBar.n();
        if (joVar.f39438z0 != null || ChatObject.canChangeChatInfo(joVar.f39429t0) || joVar.J != null) {
            org.telegram.ui.ActionBar.v0 v0VarG = zVarN.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            joVar.f39403a = v0VarG;
            v0VarG.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (joVar.D != null || joVar.J != null || joVar.E != null || joVar.F != null || joVar.M != null) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context2, 12, joVar.resourceProvider);
            joVar.L = x8Var;
            if (joVar.M != null) {
                x8Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                x8Var.setFixedSize(12);
            }
            mVar.addView(joVar.L, h7.z5.n(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        joVar.N = linearLayout4;
        linearLayout4.setOrientation(1);
        mVar.addView(joVar.N, h7.z5.n(-1, -2));
        final int i29 = 8;
        if (joVar.f39429t0 != null) {
            org.telegram.ui.Cells.l8 l8Var8 = new org.telegram.ui.Cells.l8(context2);
            joVar.T = l8Var8;
            l8Var8.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            org.telegram.ui.Cells.l8 l8Var9 = joVar.T;
            if (ChatObject.isChannel(joVar.f39429t0)) {
                i16 = 0;
            } else {
                TLRPC.Chat chat5 = joVar.f39429t0;
                if (chat5.creator || (ChatObject.hasAdminRights(chat5) && ChatObject.canChangeChatInfo(joVar.f39429t0))) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
            }
            l8Var9.setVisibility(i16);
            final int i30 = 21;
            joVar.T.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i30) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var10 = joVar14.D;
                            boolean z17 = l8Var10 != null && l8Var10.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var10 = new org.telegram.ui.Cells.l8(context2);
            joVar.R = l8Var10;
            l8Var10.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            final int i31 = 22;
            joVar.R.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i31) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var11 = joVar14.D;
                            boolean z17 = l8Var11 != null && l8Var11.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var11 = new org.telegram.ui.Cells.l8(context2);
            joVar.K = l8Var11;
            l8Var11.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            joVar.K.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var12 = joVar14.D;
                            boolean z17 = l8Var12 != null && l8Var12.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(joVar.f39429t0, 28)) {
                org.telegram.ui.Cells.l8 l8Var12 = new org.telegram.ui.Cells.l8(context2);
                joVar.f39406b0 = l8Var12;
                l8Var12.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                final int i32 = 24;
                joVar.f39406b0.setOnClickListener(new View.OnClickListener(joVar) {

                    public final jo f43492b;

                    {
                        this.f43492b = joVar;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i32) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j13 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                    if (user3 == null) {
                                        TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                            int i210 = chatPhoto2.dc_id;
                                            if (i210 != 0) {
                                                chatPhoto2.photo_big.dc_id = i210;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i211 = userProfilePhoto2.dc_id;
                                            if (i211 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i211;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j14 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var13 = joVar14.D;
                                boolean z17 = l8Var13 != null && l8Var13.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j14;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j15 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j15;
                                TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                                jpVar.f39454f = chat7;
                                if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j16 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j16;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
                joVar.f0();
            }
            org.telegram.ui.Cells.l8 l8Var13 = new org.telegram.ui.Cells.l8(context2);
            joVar.S = l8Var13;
            l8Var13.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            joVar.S.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var14 = joVar14.D;
                            boolean z17 = l8Var14 != null && l8Var14.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var14 = new org.telegram.ui.Cells.l8(context2);
            joVar.P = l8Var14;
            l8Var14.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            final int i33 = 2;
            joVar.P.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i33) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var15 = joVar14.D;
                            boolean z17 = l8Var15 != null && l8Var15.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isChannelAndNotMegaGroup(joVar.f39429t0)) {
                i11 = 3;
            } else {
                org.telegram.ui.Cells.l8 l8Var15 = new org.telegram.ui.Cells.l8(context2);
                joVar.Q = l8Var15;
                l8Var15.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                i11 = 3;
                joVar.Q.setOnClickListener(new View.OnClickListener(joVar) {

                    public final jo f43492b;

                    {
                        this.f43492b = joVar;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j13 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                    if (user3 == null) {
                                        TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                            int i210 = chatPhoto2.dc_id;
                                            if (i210 != 0) {
                                                chatPhoto2.photo_big.dc_id = i210;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i211 = userProfilePhoto2.dc_id;
                                            if (i211 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i211;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j14 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var16 = joVar14.D;
                                boolean z17 = l8Var16 != null && l8Var16.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j14;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j15 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j15;
                                TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                                jpVar.f39454f = chat7;
                                if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j16 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j16;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            }
            org.telegram.ui.Cells.l8 l8Var16 = new org.telegram.ui.Cells.l8(context2);
            joVar.V = l8Var16;
            l8Var16.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            joVar.V.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            final int i34 = 4;
            joVar.V.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i34) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var17 = joVar14.D;
                            boolean z17 = l8Var17 != null && l8Var17.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            joVar.V.setVisibility(8);
            if (ChatObject.isChannel(joVar.f39429t0) || joVar.f39429t0.gigagroup) {
                org.telegram.ui.Cells.l8 l8Var17 = new org.telegram.ui.Cells.l8(context2);
                joVar.U = l8Var17;
                l8Var17.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                joVar.U.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                final int i35 = 5;
                joVar.U.setOnClickListener(new View.OnClickListener(joVar) {

                    public final jo f43492b;

                    {
                        this.f43492b = joVar;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i35) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j13 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                    if (user3 == null) {
                                        TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                            int i210 = chatPhoto2.dc_id;
                                            if (i210 != 0) {
                                                chatPhoto2.photo_big.dc_id = i210;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i211 = userProfilePhoto2.dc_id;
                                            if (i211 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i211;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j14 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var18 = joVar14.D;
                                boolean z17 = l8Var18 != null && l8Var18.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j14;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j15 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j15;
                                TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                                jpVar.f39454f = chat7;
                                if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j16 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j16;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isBoostSupported(joVar.f39429t0)) {
                org.telegram.ui.Cells.l8 l8Var18 = new org.telegram.ui.Cells.l8(context2);
                joVar.W = l8Var18;
                l8Var18.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                joVar.W.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                final int i36 = 6;
                joVar.W.setOnClickListener(new View.OnClickListener(joVar) {

                    public final jo f43492b;

                    {
                        this.f43492b = joVar;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i36) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j13 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                    if (user3 == null) {
                                        TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                            int i210 = chatPhoto2.dc_id;
                                            if (i210 != 0) {
                                                chatPhoto2.photo_big.dc_id = i210;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i211 = userProfilePhoto2.dc_id;
                                            if (i211 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i211;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j14 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var19 = joVar14.D;
                                boolean z17 = l8Var19 != null && l8Var19.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j14;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j15 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j15;
                                TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                                jpVar.f39454f = chat7;
                                if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j16 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j16;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
            }
            joVar.N.addView(joVar.K, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.l8 l8Var19 = joVar.f39406b0;
            if (l8Var19 != null) {
                joVar.N.addView(l8Var19, h7.z5.n(-1, -2));
            }
            if (!joVar.E0 && !joVar.f39429t0.gigagroup) {
                joVar.N.addView(joVar.T, h7.z5.n(-1, -2));
            }
            if (!joVar.E0) {
                joVar.N.addView(joVar.R, h7.z5.n(-1, -2));
            }
            joVar.N.addView(joVar.S, h7.z5.n(-1, -2));
            joVar.N.addView(joVar.P, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.l8 l8Var20 = joVar.Q;
            if (l8Var20 != null && (chatFull2 = joVar.f39430u0) != null && chatFull2.requests_pending > 0) {
                joVar.N.addView(l8Var20, h7.z5.n(-1, -2));
            }
            if (joVar.E0) {
                joVar.N.addView(joVar.R, h7.z5.n(-1, -2));
            }
            if (joVar.E0 || joVar.f39429t0.gigagroup) {
                joVar.N.addView(joVar.T, h7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.l8 l8Var21 = joVar.W;
            if (l8Var21 != null) {
                joVar.N.addView(l8Var21, h7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.l8 l8Var22 = joVar.U;
            if (l8Var22 != null) {
                joVar.N.addView(l8Var22, h7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.l8 l8Var23 = joVar.V;
            if (l8Var23 != null) {
                joVar.N.addView(l8Var23, h7.z5.n(-1, -2));
            }
            if (joVar.V != null && joVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(joVar.f39429t0)) {
                joVar.V.setVisibility(0);
            }
            org.telegram.ui.Cells.l8 l8Var24 = joVar.U;
            if (l8Var24 != null) {
                org.telegram.ui.Cells.l8 l8Var25 = joVar.V;
                l8Var24.setNeedDivider(l8Var25 != null && l8Var25.getVisibility() == 0);
            }
        } else {
            i11 = 3;
        }
        if (joVar.f39438z0 != null) {
            org.telegram.ui.Cells.l8 l8Var26 = new org.telegram.ui.Cells.l8(context2);
            joVar.f39415h0 = l8Var26;
            l8Var26.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            joVar.f39415h0.setPrioritizeTitleOverValue(true);
            joVar.N.addView(joVar.f39415h0, h7.z5.n(-1, -2));
            final int i37 = 7;
            joVar.f39415h0.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i37) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var110 = joVar14.D;
                            boolean z17 = l8Var110 != null && l8Var110.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            joVar.r0();
            org.telegram.ui.Cells.l8 l8Var27 = new org.telegram.ui.Cells.l8(context2);
            joVar.f39418k0 = l8Var27;
            l8Var27.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            joVar.f39418k0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), "", R.drawable.msg_shareout, true);
            joVar.N.addView(joVar.f39418k0, h7.z5.n(-1, -2));
            joVar.f39418k0.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i29) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var110 = joVar14.D;
                            boolean z17 = l8Var110 != null && l8Var110.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            joVar.f39418k0.f(45, joVar.A0 == null, false);
            TLRPC.UserFull userFull2 = joVar.A0;
            if (userFull2 != null) {
                org.telegram.ui.Cells.l8 l8Var28 = joVar.f39418k0;
                TL_payments.starRefProgram starrefprogram = userFull2.starref_program;
                l8Var28.u(starrefprogram == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f)), false);
            }
            if (!joVar.getMessagesController().starrefProgramAllowed) {
                joVar.f39418k0.setVisibility(8);
            }
            org.telegram.ui.Cells.l8 l8Var29 = new org.telegram.ui.Cells.l8(context2);
            joVar.f39419l0 = l8Var29;
            l8Var29.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            joVar.f39419l0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            joVar.N.addView(joVar.f39419l0, h7.z5.n(-1, -2));
            final int i38 = 9;
            joVar.f39419l0.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i38) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var110 = joVar14.D;
                            boolean z17 = l8Var110 != null && l8Var110.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var30 = new org.telegram.ui.Cells.l8(context2);
            joVar.m0 = l8Var30;
            l8Var30.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            joVar.m0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            joVar.N.addView(joVar.m0, h7.z5.n(-1, -2));
            final int i39 = 10;
            joVar.m0.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i39) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var110 = joVar14.D;
                            boolean z17 = l8Var110 != null && l8Var110.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var31 = new org.telegram.ui.Cells.l8(context2);
            joVar.f39421n0 = l8Var31;
            l8Var31.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            joVar.f39421n0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            joVar.N.addView(joVar.f39421n0, h7.z5.n(-1, -2));
            final int i40 = 11;
            joVar.f39421n0.setOnClickListener(new View.OnClickListener(joVar) {

                public final jo f43492b;

                {
                    this.f43492b = joVar;
                }

                @Override
                public final void onClick(View view) {
                    switch (i40) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j13 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                if (user3 == null) {
                                    TLRPC.Chat chat6 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat6.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat6.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat6.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j14 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var110 = joVar14.D;
                            boolean z17 = l8Var110 != null && l8Var110.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j14;
                            xoVar.f44562j0 = z17;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j15 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z18 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j15;
                            TLRPC.Chat chat7 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                            jpVar.f39454f = chat7;
                            if (ChatObject.isChannel(chat7) && !jpVar.f39454f.megagroup) {
                                z18 = true;
                            }
                            jpVar.f39457s = z18;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j16 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j16;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = joVar.f39429t0;
        if (chat6 == null) {
            if (joVar.f39438z0 != null) {
                joVar.f39422o0 = new org.telegram.ui.Cells.x8(context2, 12, joVar.resourceProvider);
                String string = LocaleController.getString(R.string.BotManageInfo);
                SpannableString spannableStringValueOf = SpannableString.valueOf(string);
                int iIndexOf = string.indexOf("@BotFather");
                if (iIndexOf != -1) {
                    spannableStringValueOf.setSpan(new hh.m3(1), iIndexOf, iIndexOf + 10, 33);
                }
                joVar.f39422o0.setText(spannableStringValueOf);
                mVar.addView(joVar.f39422o0, h7.z5.n(-1, -2));
                org.telegram.ui.Cells.l8 l8Var32 = new org.telegram.ui.Cells.l8(context2);
                joVar.f39424q0 = l8Var32;
                l8Var32.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                joVar.f39424q0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
                org.telegram.ui.Cells.l8 l8Var33 = joVar.f39424q0;
                int i41 = org.telegram.ui.ActionBar.g6.q6;
                l8Var33.e(i41, i41);
                mVar.addView(joVar.f39424q0, h7.z5.n(-1, -2));
                final int i42 = 13;
                joVar.f39424q0.setOnClickListener(new View.OnClickListener(joVar) {

                    public final jo f43492b;

                    {
                        this.f43492b = joVar;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i42) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j13 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user3 = j13 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j13));
                                    if (user3 == null) {
                                        TLRPC.Chat chat7 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat7.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat7.photo;
                                            int i210 = chatPhoto2.dc_id;
                                            if (i210 != 0) {
                                                chatPhoto2.photo_big.dc_id = i210;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat7.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                                            int i211 = userProfilePhoto2.dc_id;
                                            if (i211 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i211;
                                            }
                                            PhotoViewer.t1().e2(null, user3.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j14 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var110 = joVar14.D;
                                boolean z17 = l8Var110 != null && l8Var110.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j14;
                                xoVar.f44562j0 = z17;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j15 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z18 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j15;
                                TLRPC.Chat chat8 = jpVar.getMessagesController().getChat(Long.valueOf(j15));
                                jpVar.f39454f = chat8;
                                if (ChatObject.isChannel(chat8) && !jpVar.f39454f.megagroup) {
                                    z18 = true;
                                }
                                jpVar.f39457s = z18;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j16 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j16;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j16));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
                org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context2, 12, joVar.resourceProvider);
                joVar.f39423p0 = x8Var2;
                x8Var2.setFixedSize(12);
                mVar.addView(joVar.f39423p0, h7.z5.n(-1, -2));
                org.telegram.ui.Cells.l8 l8Var34 = joVar.f39424q0;
                TLRPC.UserFull userFull3 = joVar.A0;
                l8Var34.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
                org.telegram.ui.Cells.x8 x8Var3 = joVar.f39423p0;
                TLRPC.UserFull userFull4 = joVar.A0;
                x8Var3.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
                TLRPC.User user3 = joVar.f39438z0;
                if (user3.bot && user3.bot_can_edit) {
                    LinearLayout linearLayout5 = new LinearLayout(context2);
                    joVar.O = linearLayout5;
                    linearLayout5.setOrientation(1);
                    mVar.addView(joVar.O, h7.z5.n(-1, -2));
                    org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context2);
                    j4Var.setText(LocaleController.getString(R.string.BotBalance));
                    joVar.O.addView(j4Var, h7.z5.n(-1, -2));
                    org.telegram.ui.Cells.l8 l8Var35 = new org.telegram.ui.Cells.l8(context2);
                    joVar.f39416i0 = l8Var35;
                    l8Var35.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    joVar.f39416i0.setPrioritizeTitleOverValue(true);
                    joVar.O.addView(joVar.f39416i0, h7.z5.n(-1, -2));
                    final hh.c0 c0VarG = hh.c0.g(joVar.currentAccount);
                    joVar.f39416i0.setOnClickListener(new View.OnClickListener(joVar) {

                        public final jo f44151b;

                        {
                            this.f44151b = joVar;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    jo joVar3 = this.f44151b;
                                    long j13 = joVar3.f39437y0;
                                    if (c0VarG.h(j13, false) != null) {
                                        joVar3.presentFragment(new hh.r(1, j13));
                                    }
                                    break;
                                default:
                                    jo joVar4 = this.f44151b;
                                    long j14 = joVar4.f39437y0;
                                    if (c0VarG.h(j14, false) != null) {
                                        joVar4.presentFragment(new hh.r(0, j14));
                                    }
                                    break;
                            }
                        }
                    });
                    long j13 = j10;
                    if (c0VarG.m(j13)) {
                        long jI = c0VarG.i(j13);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (jI > 0) {
                            double d = jI / 1.0E9d;
                            if (d > 1000.0d) {
                                spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                            } else {
                                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                                decimalFormatSymbols.setDecimalSeparator('.');
                                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                                decimalFormat.setMinimumFractionDigits(2);
                                decimalFormat.setMaximumFractionDigits(i11);
                                decimalFormat.setGroupingUsed(false);
                                spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            }
                        }
                        joVar.f39416i0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u80(AndroidUtilities.dp(30.0f), joVar.f39416i0.f24630c), 0, spannableStringBuilder2.length(), 33);
                        joVar.f39416i0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    }
                    joVar.f39416i0.setVisibility(c0VarG.b(j13) ? 0 : 8);
                    org.telegram.ui.Cells.l8 l8Var36 = new org.telegram.ui.Cells.l8(context2);
                    joVar.f39417j0 = l8Var36;
                    l8Var36.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    final int i43 = 1;
                    joVar.f39417j0.setPrioritizeTitleOverValue(true);
                    joVar.O.addView(joVar.f39417j0, h7.z5.n(-1, -2));
                    joVar.f39417j0.setOnClickListener(new View.OnClickListener(joVar) {

                        public final jo f44151b;

                        {
                            this.f44151b = joVar;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i43) {
                                case 0:
                                    jo joVar3 = this.f44151b;
                                    long j14 = joVar3.f39437y0;
                                    if (c0VarG.h(j14, false) != null) {
                                        joVar3.presentFragment(new hh.r(1, j14));
                                    }
                                    break;
                                default:
                                    jo joVar4 = this.f44151b;
                                    long j15 = joVar4.f39437y0;
                                    if (c0VarG.h(j15, false) != null) {
                                        joVar4.presentFragment(new hh.r(0, j15));
                                    }
                                    break;
                            }
                        }
                    });
                    if (c0VarG.h(j13, false) != null) {
                        org.telegram.ui.Cells.l8 l8Var37 = joVar.f39417j0;
                        String string2 = LocaleController.getString(R.string.BotBalanceStars);
                        if (c0VarG.c(j13).amount <= 0) {
                            charSequenceX0 = "";
                            z10 = false;
                        } else {
                            z10 = false;
                            charSequenceX0 = hh.oa.X0(false, TextUtils.concat("XTR", hh.oa.K0(c0VarG.c(j13), 0.85f, ' ')), 0.85f, null);
                        }
                        l8Var37.q(string2, charSequenceX0, R.drawable.menu_premium_main, z10);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                        spannableStringBuilder3.setSpan(new org.telegram.ui.Components.u80(AndroidUtilities.dp(30.0f), joVar.f39417j0.f24630c), 0, spannableStringBuilder3.length(), 33);
                        joVar.f39417j0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                    }
                    joVar.f39417j0.setVisibility(c0VarG.a(j13) ? 0 : 8);
                    org.telegram.ui.Cells.x8 x8Var4 = new org.telegram.ui.Cells.x8(context2, 12, joVar.getResourceProvider());
                    x8Var4.setFixedSize(12);
                    num = num2;
                    x8Var4.setTag(R.id.fit_width_tag, num);
                    mVar.addView(x8Var4, h7.z5.n(-1, 12));
                    joVar.O.setVisibility((joVar.f39417j0.getVisibility() == 0 || joVar.f39416i0.getVisibility() == 0) ? 0 : 8);
                }
            }
            chat = joVar.f39429t0;
            i12 = 14;
            if ((chat == null && chat.creator) || ((user = joVar.f39438z0) != null && user.bot && user.bot_can_edit)) {
                final long j14 = chat != null ? chat.linked_community_id : joVar.f39438z0.linked_community_id;
                final long j15 = chat != null ? -chat.f22380id : joVar.f39438z0.f22527id;
                final boolean z17 = joVar.f39438z0 != null;
                if (j14 != 0) {
                    ph.a aVar = new ph.a(context2, joVar.resourceProvider);
                    joVar.f39409d0 = aVar;
                    aVar.a(joVar.currentAccount, joVar.getMessagesController().getChat(Long.valueOf(j14)));
                    final int i44 = 0;
                    joVar.f39409d0.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    joVar.f39409d0.setOnClickListener(new View.OnClickListener(joVar) {

                        public final jo f44541b;

                        {
                            this.f44541b = joVar;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i44) {
                                case 0:
                                    jo joVar3 = this.f44541b;
                                    MessagesController messagesController = joVar3.getMessagesController();
                                    long j16 = j14;
                                    if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j16)))) {
                                        joVar3.showDialog(new oh.j0(joVar3, j16, null, null));
                                    } else {
                                        joVar3.presentFragment(new oh.o(com.google.android.recaptcha.internal.a.h(j16, "community_id")));
                                    }
                                    break;
                                default:
                                    jo joVar4 = this.f44541b;
                                    joVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("dialog_id", j14);
                                    joVar4.presentFragment(new oh.f(bundle));
                                    break;
                            }
                        }
                    });
                    mVar.addView(joVar.f39409d0, h7.z5.n(-1, -2));
                    org.telegram.ui.Cells.l8 l8Var38 = new org.telegram.ui.Cells.l8(context2);
                    joVar.f39413f0 = l8Var38;
                    if (z17) {
                        i15 = R.string.CommunityRemoveBotFromCommunity;
                    } else {
                        i15 = joVar.E0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity;
                    }
                    l8Var38.m(R.drawable.outline_community_remove_24, LocaleController.getString(i15), false);
                    org.telegram.ui.Cells.l8 l8Var39 = joVar.f39413f0;
                    int i45 = org.telegram.ui.ActionBar.g6.f23269p7;
                    l8Var39.e(i45, i45);
                    joVar.f39413f0.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    joVar2 = joVar;
                    joVar.f39413f0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            int i46;
                            String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                            jo joVar3 = this.f44853a;
                            if (z17) {
                                i46 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                            } else {
                                i46 = joVar3.E0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                            }
                            org.telegram.ui.Components.y4.v0(joVar3, string3, LocaleController.getString(i46), LocaleController.getString(R.string.Remove), true, new fo(joVar3, j15, j14, 0));
                        }
                    });
                    mVar.addView(joVar2.f39413f0, h7.z5.n(-1, -2));
                    org.telegram.ui.Cells.x8 x8Var5 = new org.telegram.ui.Cells.x8(context2, 12, joVar2.getResourceProvider());
                    joVar2.f39414g0 = x8Var5;
                    x8Var5.setFixedSize(14);
                    joVar2.f39414g0.setTag(R.id.fit_width_tag, num);
                    mVar.addView(joVar2.f39414g0, h7.z5.n(-1, 14));
                } else {
                    joVar2 = joVar;
                    org.telegram.ui.Cells.l8 l8Var40 = new org.telegram.ui.Cells.l8(context2);
                    joVar2.f39408c0 = l8Var40;
                    l8Var40.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                    joVar2.f39408c0.setTextColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.il));
                    joVar2.f39408c0.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    org.telegram.ui.Cells.l8 l8Var41 = joVar2.f39408c0;
                    if (z17) {
                        i13 = R.string.CommunityAddBotToCommunity;
                    } else {
                        i13 = joVar2.E0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity;
                    }
                    l8Var41.m(R.drawable.msg_groups, LocaleController.getString(i13), false);
                    final int i46 = 1;
                    joVar2.f39408c0.setOnClickListener(new View.OnClickListener(joVar2) {

                        public final jo f44541b;

                        {
                            this.f44541b = joVar2;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i46) {
                                case 0:
                                    jo joVar3 = this.f44541b;
                                    MessagesController messagesController = joVar3.getMessagesController();
                                    long j16 = j15;
                                    if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j16)))) {
                                        joVar3.showDialog(new oh.j0(joVar3, j16, null, null));
                                    } else {
                                        joVar3.presentFragment(new oh.o(com.google.android.recaptcha.internal.a.h(j16, "community_id")));
                                    }
                                    break;
                                default:
                                    jo joVar4 = this.f44541b;
                                    joVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("dialog_id", j15);
                                    joVar4.presentFragment(new oh.f(bundle));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.x8 x8Var6 = new org.telegram.ui.Cells.x8(context2, 12, joVar2.resourceProvider);
                    joVar2.f39411e0 = x8Var6;
                    if (z17) {
                        i14 = R.string.CommunityAddBotToCommunityInfo;
                    } else {
                        i14 = joVar2.E0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo;
                    }
                    x8Var6.setText(LocaleController.getString(i14));
                    mVar.addView(joVar2.f39408c0, h7.z5.n(-1, -2));
                    mVar.addView(joVar2.f39411e0, h7.z5.n(-1, -2));
                }
            }
            chat2 = joVar2.f39429t0;
            if (chat2 != null && chat2.creator) {
                FrameLayout frameLayout3 = new FrameLayout(context2);
                joVar2.Y = frameLayout3;
                mVar.addView(frameLayout3, h7.z5.n(-1, -2));
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context2);
                joVar2.Z = x9Var;
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23269p7));
                joVar2.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                if (joVar2.f39438z0 != null) {
                    joVar2.Z.b(LocaleController.getString(R.string.DeleteBot), false);
                } else if (joVar2.E0) {
                    joVar2.Z.b(LocaleController.getString(R.string.ChannelDelete), false);
                } else {
                    joVar2.Z.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
                }
                joVar2.Y.addView(joVar2.Z, h7.z5.c(-2.0f, -1));
                joVar2.Z.setOnClickListener(new View.OnClickListener(joVar2) {

                    public final jo f43492b;

                    {
                        this.f43492b = joVar2;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                jo joVar3 = this.f43492b;
                                joVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", joVar3.f39428s0);
                                bundle.putInt("type", 1);
                                lr lrVar = new lr(bundle);
                                lrVar.x0(joVar3.f39430u0);
                                joVar3.presentFragment(lrVar);
                                break;
                            case 1:
                                jo joVar4 = this.f43492b;
                                ho hoVar = joVar4.M0;
                                long j16 = joVar4.f39437y0;
                                if (!joVar4.f39427s.h()) {
                                    ImageLocation forPhoto = null;
                                    TLRPC.User user4 = j16 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j16));
                                    if (user4 == null) {
                                        TLRPC.Chat chat7 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                        TLRPC.ChatPhoto chatPhoto = chat7.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat7.photo;
                                            int i210 = chatPhoto2.dc_id;
                                            if (i210 != 0) {
                                                chatPhoto2.photo_big.dc_id = i210;
                                            }
                                            TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat7.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, joVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user4.photo;
                                            int i211 = userProfilePhoto2.dc_id;
                                            if (i211 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i211;
                                            }
                                            PhotoViewer.t1().e2(null, user4.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                jo joVar5 = this.f43492b;
                                joVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", joVar5.f39428s0);
                                bundle2.putInt("type", 2);
                                lr lrVar2 = new lr(bundle2);
                                lrVar2.x0(joVar5.f39430u0);
                                joVar5.presentFragment(lrVar2);
                                break;
                            case 3:
                                jo joVar6 = this.f43492b;
                                joVar6.presentFragment(new lh0(joVar6.f39428s0));
                                break;
                            case 4:
                                jo joVar7 = this.f43492b;
                                joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                                break;
                            case 5:
                                jo joVar8 = this.f43492b;
                                joVar8.getClass();
                                joVar8.presentFragment(new qb(joVar8.f39429t0));
                                break;
                            case 6:
                                jo joVar9 = this.f43492b;
                                joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                                break;
                            case 7:
                                jo joVar10 = this.f43492b;
                                joVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", joVar10.f39437y0);
                                joVar10.presentFragment(new na(bundle3));
                                break;
                            case 8:
                                jo joVar11 = this.f43492b;
                                joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                                break;
                            case 9:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                                break;
                            case 10:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                                break;
                            case 11:
                                we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                                break;
                            case 12:
                                this.f43492b.i0();
                                break;
                            case 13:
                                jo.X(this.f43492b);
                                break;
                            case 14:
                                jo joVar12 = this.f43492b;
                                org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                                break;
                            case 15:
                                jo joVar13 = this.f43492b;
                                if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                    tc0 tc0Var = new tc0(4);
                                    tc0Var.f42856a0 = -joVar13.f39428s0;
                                    TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    tc0Var.B0 = new bo(joVar13, 6);
                                    joVar13.presentFragment(tc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                jo joVar14 = this.f43492b;
                                long j17 = joVar14.f39428s0;
                                org.telegram.ui.Cells.l8 l8Var110 = joVar14.D;
                                boolean z18 = l8Var110 != null && l8Var110.getVisibility() == 0;
                                xo xoVar = new xo(null);
                                xoVar.I = new ArrayList();
                                xoVar.J = new ArrayList();
                                xoVar.L = new ArrayList();
                                xoVar.Y = true;
                                xoVar.f44551b0 = new ArrayList();
                                xoVar.f44563k0 = new HashMap();
                                xoVar.m0 = new mo(xoVar, 5);
                                xoVar.f44568p0 = false;
                                xoVar.V = j17;
                                xoVar.f44562j0 = z18;
                                TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                                xoVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        xoVar.f44560h0 = tL_chatInviteExported;
                                    } else {
                                        xoVar.X(false);
                                    }
                                }
                                joVar14.presentFragment(xoVar);
                                break;
                            case 17:
                                jo joVar15 = this.f43492b;
                                long j18 = joVar15.f39428s0;
                                jp jpVar = new jp(null);
                                jpVar.v = new ArrayList();
                                boolean z19 = false;
                                jpVar.K = false;
                                jpVar.L = false;
                                jpVar.A = j18;
                                TLRPC.Chat chat8 = jpVar.getMessagesController().getChat(Long.valueOf(j18));
                                jpVar.f39454f = chat8;
                                if (ChatObject.isChannel(chat8) && !jpVar.f39454f.megagroup) {
                                    z19 = true;
                                }
                                jpVar.f39457s = z19;
                                jpVar.h = joVar15.f39430u0;
                                joVar15.presentFragment(jpVar);
                                break;
                            case 18:
                                jo joVar16 = this.f43492b;
                                qv0 qv0Var = new qv0(joVar16.f39428s0);
                                qv0Var.v = new bo(joVar16, 4);
                                joVar16.presentFragment(qv0Var);
                                break;
                            case 19:
                                jo.Z(this.f43492b);
                                break;
                            case 20:
                                jo joVar17 = this.f43492b;
                                c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                                c60Var.f44384c = joVar17.H0;
                                c60Var.f44392h0 = joVar17;
                                joVar17.presentFragment(c60Var);
                                break;
                            case 21:
                                jo joVar18 = this.f43492b;
                                joVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", joVar18.f39428s0);
                                bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                                lr lrVar3 = new lr(bundle4);
                                lrVar3.x0(joVar18.f39430u0);
                                joVar18.presentFragment(lrVar3);
                                break;
                            case 22:
                                jo joVar19 = this.f43492b;
                                kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                joVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                jo joVar20 = this.f43492b;
                                if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                    joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", joVar20.f39428s0);
                                    qp qpVar = new qp(bundle5);
                                    qpVar.d = new ArrayList();
                                    qpVar.f41724r = new ArrayList();
                                    qpVar.v = -1;
                                    qpVar.B = new ArrayList();
                                    long j19 = bundle5.getLong("chat_id", 0L);
                                    qpVar.f41720c = j19;
                                    TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                    qpVar.f41719b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (qpVar.f41718a == null) {
                                            qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j19));
                                        }
                                        qpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            qpVar.f41726w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            qpVar.f41726w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            qpVar.f41726w = 1;
                                        }
                                    }
                                    joVar20.presentFragment(qpVar);
                                }
                                break;
                            default:
                                jo joVar21 = this.f43492b;
                                joVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", joVar21.f39428s0);
                                bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                                joVar21.presentFragment(new rn(bundle6));
                                break;
                        }
                    }
                });
                org.telegram.ui.Cells.w6 w6Var2 = new org.telegram.ui.Cells.w6(context2);
                joVar2.f39404a0 = w6Var2;
                mVar.addView(w6Var2, h7.z5.n(-1, -2));
            }
            UndoView undoView = new UndoView(context2);
            joVar2.f39407c = undoView;
            edVar.addView(undoView, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            org.telegram.ui.Components.tt ttVar6 = joVar2.v;
            user2 = joVar2.f39438z0;
            if (user2 != null) {
                name = ContactsController.formatName(user2);
            } else {
                name = joVar2.f39429t0.title;
            }
            ttVar6.setText(Emoji.replaceEmoji(name, joVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
            org.telegram.ui.Components.tt ttVar7 = joVar2.v;
            ttVar7.setSelection(ttVar7.n());
            chatFull = joVar2.f39430u0;
            if (chatFull != null) {
                joVar2.A.setText(chatFull.about);
            } else {
                userFull = joVar2.A0;
                if (userFull != null) {
                    joVar2.A.setText(userFull.about);
                }
            }
            joVar2.k0();
            joVar2.p0(true, false);
            return joVar2.fragmentView;
        }
        if (!ChatObject.hasAdminRights(chat6)) {
            joVar.N.setVisibility(8);
            joVar.C.setVisibility(8);
        }
        mVar.addView(new org.telegram.ui.Cells.w6(context2), h7.z5.n(-1, -2));
        num = num2;
        chat = joVar.f39429t0;
        i12 = 14;
        joVar2 = chat == null ? joVar : joVar;
        chat2 = joVar2.f39429t0;
        if (chat2 != null) {
            FrameLayout frameLayout4 = new FrameLayout(context2);
            joVar2.Y = frameLayout4;
            mVar.addView(frameLayout4, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context2);
            joVar2.Z = x9Var2;
            x9Var2.setTextColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23269p7));
            joVar2.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            if (joVar2.f39438z0 != null) {
                joVar2.Z.b(LocaleController.getString(R.string.DeleteBot), false);
            } else if (joVar2.E0) {
                joVar2.Z.b(LocaleController.getString(R.string.ChannelDelete), false);
            } else {
                joVar2.Z.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
            }
            joVar2.Y.addView(joVar2.Z, h7.z5.c(-2.0f, -1));
            joVar2.Z.setOnClickListener(new View.OnClickListener(joVar2) {

                public final jo f43492b;

                {
                    this.f43492b = joVar2;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            jo joVar3 = this.f43492b;
                            joVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", joVar3.f39428s0);
                            bundle.putInt("type", 1);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(joVar3.f39430u0);
                            joVar3.presentFragment(lrVar);
                            break;
                        case 1:
                            jo joVar4 = this.f43492b;
                            ho hoVar = joVar4.M0;
                            long j16 = joVar4.f39437y0;
                            if (!joVar4.f39427s.h()) {
                                ImageLocation forPhoto = null;
                                TLRPC.User user4 = j16 == 0 ? null : joVar4.getMessagesController().getUser(Long.valueOf(j16));
                                if (user4 == null) {
                                    TLRPC.Chat chat7 = joVar4.getMessagesController().getChat(Long.valueOf(joVar4.f39428s0));
                                    TLRPC.ChatPhoto chatPhoto = chat7.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat7.photo;
                                        int i210 = chatPhoto2.dc_id;
                                        if (i210 != 0) {
                                            chatPhoto2.photo_big.dc_id = i210;
                                        }
                                        TLRPC.ChatFull chatFull5 = joVar4.f39430u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                forPhoto = ImageLocation.getForPhoto(joVar4.f39430u0.chat_photo.video_sizes.get(0), joVar4.f39430u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat7.photo.photo_big, null, forPhoto, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, joVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user4.photo;
                                        int i211 = userProfilePhoto2.dc_id;
                                        if (i211 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i211;
                                        }
                                        PhotoViewer.t1().e2(null, user4.photo.photo_big, null, null, null, null, null, 0, hoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            jo joVar5 = this.f43492b;
                            joVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", joVar5.f39428s0);
                            bundle2.putInt("type", 2);
                            lr lrVar2 = new lr(bundle2);
                            lrVar2.x0(joVar5.f39430u0);
                            joVar5.presentFragment(lrVar2);
                            break;
                        case 3:
                            jo joVar6 = this.f43492b;
                            joVar6.presentFragment(new lh0(joVar6.f39428s0));
                            break;
                        case 4:
                            jo joVar7 = this.f43492b;
                            joVar7.presentFragment(new nh.s3(-joVar7.f39428s0));
                            break;
                        case 5:
                            jo joVar8 = this.f43492b;
                            joVar8.getClass();
                            joVar8.presentFragment(new qb(joVar8.f39429t0));
                            break;
                        case 6:
                            jo joVar9 = this.f43492b;
                            joVar9.presentFragment(q91.d0(joVar9.f39429t0, false));
                            break;
                        case 7:
                            jo joVar10 = this.f43492b;
                            joVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", joVar10.f39437y0);
                            joVar10.presentFragment(new na(bundle3));
                            break;
                        case 8:
                            jo joVar11 = this.f43492b;
                            joVar11.presentFragment(new nh.k(joVar11.f39437y0));
                            break;
                        case 9:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-intro");
                            break;
                        case 10:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0) + "-commands");
                            break;
                        case 11:
                            we.e.s(view.getContext(), "https://t.me/BotFather?start=" + jo.g0(this.f43492b.f39438z0));
                            break;
                        case 12:
                            this.f43492b.i0();
                            break;
                        case 13:
                            jo.X(this.f43492b);
                            break;
                        case 14:
                            jo joVar12 = this.f43492b;
                            org.telegram.ui.Components.y4.s(joVar12, false, joVar12.f39429t0, null, false, true, true, false, new bo(joVar12, 7));
                            break;
                        case 15:
                            jo joVar13 = this.f43492b;
                            if (AndroidUtilities.isMapsInstalled(joVar13)) {
                                tc0 tc0Var = new tc0(4);
                                tc0Var.f42856a0 = -joVar13.f39428s0;
                                TLRPC.ChatFull chatFull6 = joVar13.f39430u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        tc0Var.f42885w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                tc0Var.B0 = new bo(joVar13, 6);
                                joVar13.presentFragment(tc0Var);
                                break;
                            }
                            break;
                        case 16:
                            jo joVar14 = this.f43492b;
                            long j17 = joVar14.f39428s0;
                            org.telegram.ui.Cells.l8 l8Var110 = joVar14.D;
                            boolean z18 = l8Var110 != null && l8Var110.getVisibility() == 0;
                            xo xoVar = new xo(null);
                            xoVar.I = new ArrayList();
                            xoVar.J = new ArrayList();
                            xoVar.L = new ArrayList();
                            xoVar.Y = true;
                            xoVar.f44551b0 = new ArrayList();
                            xoVar.f44563k0 = new HashMap();
                            xoVar.m0 = new mo(xoVar, 5);
                            xoVar.f44568p0 = false;
                            xoVar.V = j17;
                            xoVar.f44562j0 = z18;
                            TLRPC.ChatFull chatFull7 = joVar14.f39430u0;
                            xoVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    xoVar.f44560h0 = tL_chatInviteExported;
                                } else {
                                    xoVar.X(false);
                                }
                            }
                            joVar14.presentFragment(xoVar);
                            break;
                        case 17:
                            jo joVar15 = this.f43492b;
                            long j18 = joVar15.f39428s0;
                            jp jpVar = new jp(null);
                            jpVar.v = new ArrayList();
                            boolean z19 = false;
                            jpVar.K = false;
                            jpVar.L = false;
                            jpVar.A = j18;
                            TLRPC.Chat chat8 = jpVar.getMessagesController().getChat(Long.valueOf(j18));
                            jpVar.f39454f = chat8;
                            if (ChatObject.isChannel(chat8) && !jpVar.f39454f.megagroup) {
                                z19 = true;
                            }
                            jpVar.f39457s = z19;
                            jpVar.h = joVar15.f39430u0;
                            joVar15.presentFragment(jpVar);
                            break;
                        case 18:
                            jo joVar16 = this.f43492b;
                            qv0 qv0Var = new qv0(joVar16.f39428s0);
                            qv0Var.v = new bo(joVar16, 4);
                            joVar16.presentFragment(qv0Var);
                            break;
                        case 19:
                            jo.Z(this.f43492b);
                            break;
                        case 20:
                            jo joVar17 = this.f43492b;
                            c60 c60Var = new c60(-joVar17.f39429t0.f22380id);
                            c60Var.f44384c = joVar17.H0;
                            c60Var.f44392h0 = joVar17;
                            joVar17.presentFragment(c60Var);
                            break;
                        case 21:
                            jo joVar18 = this.f43492b;
                            joVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", joVar18.f39428s0);
                            bundle4.putInt("type", ((joVar18.E0 || joVar18.f39429t0.gigagroup) && !ChatObject.isCommunity(joVar18.f39429t0)) ? 0 : 3);
                            lr lrVar3 = new lr(bundle4);
                            lrVar3.x0(joVar18.f39430u0);
                            joVar18.presentFragment(lrVar3);
                            break;
                        case 22:
                            jo joVar19 = this.f43492b;
                            kh0 kh0Var = new kh0(joVar19.f39428s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = joVar19.f39430u0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            joVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            jo joVar20 = this.f43492b;
                            if (ChatObject.isChannelAndNotMegaGroup(joVar20.f39429t0)) {
                                joVar20.presentFragment(new ig.s(joVar20.f39428s0, joVar20.f39430u0));
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", joVar20.f39428s0);
                                qp qpVar = new qp(bundle5);
                                qpVar.d = new ArrayList();
                                qpVar.f41724r = new ArrayList();
                                qpVar.v = -1;
                                qpVar.B = new ArrayList();
                                long j19 = bundle5.getLong("chat_id", 0L);
                                qpVar.f41720c = j19;
                                TLRPC.ChatFull chatFull9 = joVar20.f39430u0;
                                qpVar.f41719b = chatFull9;
                                if (chatFull9 != null) {
                                    if (qpVar.f41718a == null) {
                                        qpVar.f41718a = qpVar.getMessagesController().getChat(Long.valueOf(j19));
                                    }
                                    qpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        qpVar.f41726w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        qpVar.f41726w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                qpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        qpVar.f41726w = 1;
                                    }
                                }
                                joVar20.presentFragment(qpVar);
                            }
                            break;
                        default:
                            jo joVar21 = this.f43492b;
                            joVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", joVar21.f39428s0);
                            bundle6.putLong("welcome_messages_chat_id", joVar21.f39428s0);
                            joVar21.presentFragment(new rn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.w6 w6Var3 = new org.telegram.ui.Cells.w6(context2);
            joVar2.f39404a0 = w6Var3;
            mVar.addView(w6Var3, h7.z5.n(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        joVar2.f39407c = undoView2;
        edVar.addView(undoView2, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.tt ttVar8 = joVar2.v;
        user2 = joVar2.f39438z0;
        if (user2 != null) {
            name = ContactsController.formatName(user2);
        } else {
            name = joVar2.f39429t0.title;
        }
        ttVar8.setText(Emoji.replaceEmoji(name, joVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.tt ttVar9 = joVar2.v;
        ttVar9.setSelection(ttVar9.n());
        chatFull = joVar2.f39430u0;
        if (chatFull != null) {
            joVar2.A.setText(chatFull.about);
        } else {
            userFull = joVar2.A0;
            if (userFull != null) {
                joVar2.A.setText(userFull.about);
            }
        }
        joVar2.k0();
        joVar2.p0(true, false);
        return joVar2.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        boolean z10;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = NotificationCenter.chatInfoDidLoad;
        boolean z11 = true;
        long j10 = this.f39437y0;
        int i13 = 0;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            if (chatFull2.f22381id == this.f39428s0) {
                if (this.f39430u0 == null && (editTextBoldCursor = this.A) != null) {
                    editTextBoldCursor.setText(chatFull2.about);
                }
                boolean z12 = this.f39430u0 == null;
                this.f39430u0 = chatFull2;
                f0();
                if (j10 != 0) {
                    this.C0 = false;
                } else {
                    if (this.B0) {
                        chatFull = this.f39430u0;
                        if (chatFull != null || chatFull.linked_chat_id == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        TLRPC.ChatFull chatFull3 = this.f39430u0;
                        if (Math.max(chatFull3 == null ? 0 : chatFull3.participants_count, this.f39429t0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) {
                            chatFull = this.f39430u0;
                            if (chatFull != null) {
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    this.C0 = z10;
                    org.telegram.ui.Cells.l8 l8Var = this.M;
                    if (l8Var != null) {
                        l8Var.getCheckBox().setIcon(this.C0 ? 0 : R.drawable.permission_locked);
                    }
                }
                if (ChatObject.isChannel(this.f39429t0) && !this.f39430u0.hidden_prehistory) {
                    z11 = false;
                }
                this.F0 = z11;
                p0(false, false);
                if (z12) {
                    h0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatSwitchedForum) {
            long jLongValue = ((Long) objArr[0]).longValue();
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.f39428s0 != jLongValue) {
                return;
            }
            this.B0 = zBooleanValue;
            this.D0 = zBooleanValue2;
            org.telegram.ui.Cells.l8 l8Var2 = this.M;
            if (l8Var2 != null) {
                l8Var2.setChecked(zBooleanValue);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) != 0) {
                k0();
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_NAME) != 0) {
                r0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.channelRightsUpdated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.f22380id != this.f39428s0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.f39431v0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.f39433w0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.f39435x0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i10 == NotificationCenter.chatAvailableReactionsUpdated) {
            long jLongValue2 = ((Long) objArr[0]).longValue();
            if (jLongValue2 == this.f39428s0) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(jLongValue2);
                this.f39430u0 = chatFull4;
                if (chatFull4 != null) {
                    this.G0 = chatFull4.available_reactions;
                }
                s0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.botStarsUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                if (((Long) objArr[0]).longValue() == j10) {
                    m0(getMessagesController().getUserFull(j10));
                    return;
                }
                return;
            } else {
                if (i10 == NotificationCenter.channelConnectedBotsUpdate) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i10 == NotificationCenter.dialogDeleted && (-this.f39428s0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
                    if (b5Var2 == null || b5Var2.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
        }
        if (((Long) objArr[0]).longValue() == j10) {
            if (this.f39417j0 != null) {
                hh.c0 c0VarG = hh.c0.g(this.currentAccount);
                this.f39417j0.setVisibility(c0VarG.a(j10) ? 0 : 8);
                this.f39417j0.u(hh.oa.X0(false, TextUtils.concat("XTR", hh.oa.J0(c0VarG.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.l8 l8Var3 = this.f39415h0;
                if (l8Var3 != null) {
                    l8Var3.setNeedDivider(c0VarG.a(j10) || c0VarG.b(j10));
                }
                this.O.setVisibility((this.f39417j0.getVisibility() == 0 || this.f39416i0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.f39416i0 != null) {
                hh.c0 c0VarG2 = hh.c0.g(this.currentAccount);
                this.f39416i0.setVisibility(c0VarG2.b(j10) ? 0 : 8);
                long jI = c0VarG2.i(j10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (jI > 0) {
                    double d = jI / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                    } else {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setDecimalSeparator('.');
                        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                        decimalFormat.setMinimumFractionDigits(2);
                        decimalFormat.setMaximumFractionDigits(3);
                        decimalFormat.setGroupingUsed(false);
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                    }
                }
                this.f39416i0.u(spannableStringBuilder, true);
                org.telegram.ui.Cells.l8 l8Var4 = this.f39415h0;
                if (l8Var4 != null) {
                    if (!c0VarG2.a(j10) && !c0VarG2.b(j10)) {
                        z11 = false;
                    }
                    l8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.O;
                if (this.f39417j0.getVisibility() != 0 && this.f39416i0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f39427s.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.f39427s.f29571c && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.tt ttVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.f39437y0 != 0) {
            TLRPC.UserFull userFull = this.A0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.tt ttVar2 = this.v;
            if ((ttVar2 == null || this.f39438z0.first_name.equals(ttVar2.getText().toString())) && ((editTextBoldCursor2 = this.A) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new bo(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new bo(this, 1));
                showDialog(alertDialog$Builder.f22702a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.f39430u0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.f39429t0) || this.f39430u0.hidden_prehistory == this.F0) && (((ttVar = this.v) == null || this.f39429t0.title.equals(ttVar.getText().toString())) && (((editTextBoldCursor = this.A) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.B0 == this.f39429t0.forum))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f22702a.N = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.E0) {
                    alertDialog$Builder2.f22702a.P = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder2.f22702a.P = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new bo(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new bo(this, 3));
                showDialog(alertDialog$Builder2.f22702a);
            }
        }
        return false;
    }

    public final void f0() {
        if (this.f39406b0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.f39428s0);
        TLRPC.ChatFull chatFull = this.f39430u0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.f39406b0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override
    public final cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        io ioVar = this.X;
        int i10 = org.telegram.ui.ActionBar.g6.f23144i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ioVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23357u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23373v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23215m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.l8 l8Var = this.Q;
        if (l8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(l8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.tt ttVar = this.v;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 8388608, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39436y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f23018b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39404a0, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Z, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Z, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23269p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23295r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39407c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i17 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39407c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39407c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39407c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39407c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39407c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39407c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.l8 l8Var2 = this.G;
        if (l8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(l8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.l8 l8Var3 = this.W;
        if (l8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(l8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.f39428s0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ao(this, 0));
    }

    public final void i0() {
        this.f39427s.o(this.f39426r0 != null, new co(this, 0), new s5(this, 5), 0);
        this.N0.K(0);
        this.N0.N(43);
        this.X.f24631e.d();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.tt ttVar;
        String str;
        String str2;
        if (this.J0 || (ttVar = this.v) == null) {
            return;
        }
        if (ttVar.f32875a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.v);
            return;
        }
        int i10 = 1;
        this.J0 = true;
        int i11 = 3;
        String str3 = "";
        if (this.f39438z0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().getInputUser(this.f39438z0);
            int i12 = 4;
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.f39438z0.first_name.equals(this.v.getText().toString())) {
                setbotinfo.name = this.v.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.A0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.A;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.A.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.f39405b = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.f39405b.setOnCancelListener(new hh.x(this, getConnectionsManager().sendRequest(setbotinfo, new gg(i12, this, setbotinfo)), i11));
            this.f39405b.show();
            return;
        }
        if (!ChatObject.isChannel(this.f39429t0) && (!this.F0 || this.B0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.f39428s0, this, new bo(this, 5));
            return;
        }
        if (this.f39430u0 != null && ChatObject.isChannel(this.f39429t0)) {
            TLRPC.ChatFull chatFull = this.f39430u0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.F0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().toggleChannelInvitesHistory(this.f39428s0, this.F0);
            }
        }
        if (this.f39427s.h()) {
            this.I0 = true;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.f39405b = b2Var;
            b2Var.setOnCancelListener(new fg(this, i10));
            this.f39405b.show();
            return;
        }
        if (!this.f39429t0.title.equals(this.v.getText().toString())) {
            getMessagesController().changeChatTitle(this.f39428s0, this.v.getText().toString());
        }
        TLRPC.ChatFull chatFull2 = this.f39430u0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.A;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            getMessagesController().updateChatAbout(this.f39428s0, this.A.getText().toString(), this.f39430u0);
        }
        boolean z12 = this.B0;
        TLRPC.Chat chat = this.f39429t0;
        if (z12 != chat.forum || this.D0 != chat.forum_tabs) {
            i10 = this.D0 == chat.forum_tabs ? 0 : 1;
            getMessagesController().toggleChannelForum(this.f39428s0, this.B0, this.D0);
            if (this.B0 && !this.D0) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i13 = 0; i13 < fragmentStack.size(); i13++) {
                    if ((fragmentStack.get(i13) instanceof rn) && ((rn) fragmentStack.get(i13)).getArguments().getLong("chat_id") == this.f39428s0) {
                        ((ActionBarLayout) getParentLayout()).Y(i13);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.f39428s0);
                        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                        HashSet hashSet = we1.f43718j1;
                        ((ActionBarLayout) parentLayout).c(i13, we1.E0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (i10 != 0) {
                q0();
            }
        }
        finishFragment();
    }

    public final void k0() {
        boolean z10;
        if (this.f39410e == null || this.K0) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f39428s0));
        long j10 = this.f39437y0;
        TLRPC.User user = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
        if (chat == null && user == null) {
            return;
        }
        this.f39438z0 = user;
        this.f39429t0 = chat;
        org.telegram.ui.Components.y8 y8Var = this.f39425r;
        if (user == null ? chat.photo != null : user.photo != null) {
            TLRPC.User user2 = user != null ? user : chat;
            this.f39426r0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, user2, 1);
            this.f39410e.e(user2, y8Var);
            z10 = forUserOrChat != null;
            if (this.X != null) {
                if (!z10 || this.f39427s.h()) {
                    this.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                } else {
                    this.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                }
                if (this.N0 == null) {
                    this.N0 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                this.X.f24631e.setTranslationX(-AndroidUtilities.dp(8.0f));
                this.X.f24631e.setAnimation(this.N0);
            }
            if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().y0();
            }
            if (this.V == null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.f39429t0)) {
                this.V.setVisibility(0);
                return;
            }
            return;
        }
        this.f39410e.setImageDrawable(y8Var);
        if (this.X != null) {
            if (z10) {
                this.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
            } else {
                this.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
            }
            if (this.N0 == null) {
                this.N0 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            }
            this.X.f24631e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.X.f24631e.setAnimation(this.N0);
        }
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().y0();
        }
        if (this.V == null) {
        }
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.k5 k5VarN;
        this.f39430u0 = chatFull;
        if (chatFull != null) {
            if (this.f39429t0 == null) {
                this.f39429t0 = getMessagesController().getChat(Long.valueOf(this.f39428s0));
            }
            this.F0 = !ChatObject.isChannel(this.f39429t0) || this.f39430u0.hidden_prehistory;
            this.G0 = this.f39430u0.available_reactions;
            ArrayList arrayList = this.L0;
            arrayList.clear();
            TLRPC.Chat chat = this.f39429t0;
            TLRPC.ChatFull chatFull2 = this.f39430u0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i10);
                        i10++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                k5VarN = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, org.telegram.ui.Components.k5.g(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            k5VarN = org.telegram.ui.Components.k5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.k5.g());
                        } else {
                            k5VarN = null;
                        }
                        if (k5VarN != null) {
                            arrayList2.add(k5VarN);
                            k5VarN.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.k5 k5VarM = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, org.telegram.ui.Components.k5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(k5VarM);
                            k5VarM.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.V != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.f39429t0)) {
                this.V.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.A0 = userFull;
        if (userFull != null) {
            if (this.f39438z0 == null) {
                long j10 = this.f39437y0;
                this.f39438z0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.l8 l8Var = this.f39418k0;
            if (l8Var != null) {
                l8Var.f(45, this.A0 == null, true);
                TLRPC.UserFull userFull2 = this.A0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.l8 l8Var2 = this.f39418k0;
                    TL_payments.starRefProgram starrefprogram = userFull2.starref_program;
                    l8Var2.u(starrefprogram == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.l8 l8Var3 = this.f39424q0;
            if (l8Var3 != null) {
                TLRPC.UserFull userFull3 = this.A0;
                l8Var3.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.x8 x8Var = this.f39423p0;
            if (x8Var != null) {
                TLRPC.UserFull userFull4 = this.A0;
                x8Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f39420n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i10 = 0;
        if (!z11) {
            if (z10) {
                this.f39420n.setAlpha(1.0f);
                this.f39420n.setVisibility(0);
                this.f39412f.setAlpha(1.0f);
                this.f39412f.setVisibility(0);
                return;
            }
            this.f39420n.setAlpha(0.0f);
            this.f39420n.setVisibility(4);
            this.f39412f.setAlpha(0.0f);
            this.f39412f.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.h = animatorSet2;
        if (z10) {
            this.f39420n.setVisibility(0);
            this.f39412f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            RadialProgressView radialProgressView = this.f39420n;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f39412f, (Property<ag.t0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.f39420n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f39412f, (Property<ag.t0, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new go(i10, this, z10));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        wo0 wo0VarC;
        int iV0;
        ArrayList<Integer> arrayList;
        io0 io0Var = this.H;
        if (io0Var != null) {
            TLRPC.Chat chat = this.f39429t0;
            org.telegram.ui.Cells.l8 l8Var3 = this.J;
            boolean z10 = (l8Var3 != null && l8Var3.getVisibility() == 0) || ((l8Var = this.M) != null && l8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.f39429t0) && ChatObject.hasAdminRights(this.f39429t0)) || ((l8Var2 = this.I) != null && l8Var2.getVisibility() == 0));
            Paint paint = io0Var.f39140n;
            int i10 = io0Var.f39135a;
            org.telegram.ui.ActionBar.c6 c6Var = io0Var.d;
            if (chat == null) {
                return;
            }
            io0Var.v = z10;
            io0Var.f39141r = new org.telegram.ui.Components.pz0(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            wo0 wo0Var = io0Var.f39143w;
            if (wo0Var != null) {
                wo0Var.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = wo0.f44155j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                io0Var.f39143w = new wo0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    wo0VarC = wo0.c(i10, ChatObject.getProfileColorId(chat));
                    wo0VarC.f44156a = AndroidUtilities.dp(11.0f);
                    wo0VarC.d();
                } else {
                    wo0VarC = null;
                }
                io0Var.f39143w = wo0VarC;
            }
            wo0 wo0Var2 = io0Var.f39143w;
            if (wo0Var2 != null) {
                wo0Var2.e(io0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
                int i13 = (!zA || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!zA || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int iIntValue = arrayList.get(0).intValue() | (-16777216);
                int iIntValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue;
                int iIntValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue;
                io0Var.f39141r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i13));
                wo0 wo0Var3 = new wo0(tL_peerColorCollectible.gift_emoji_id, iIntValue, iIntValue2, iIntValue3);
                wo0Var3.f44156a = AndroidUtilities.dp(11.0f);
                wo0Var3.d();
                io0Var.f39144x = wo0Var3;
                wo0Var3.e(io0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.g6.f23303r8[colorId];
                io0Var.f39142s = i14;
                iV0 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    io0Var.f39142s = -1;
                    iV0 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.g6.f23303r8[0];
                    io0Var.f39142s = i15;
                    iV0 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
                }
            }
            io0Var.f39141r.o(iV0);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, iV0));
            wo0 wo0VarA = wo0.a(i10, colorId);
            wo0VarA.f44156a = AndroidUtilities.dp(11.0f);
            wo0VarA.d();
            io0Var.f39144x = wo0VarA;
            wo0VarA.e(io0Var);
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.f39427s.i(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.tt ttVar = this.v;
        if (ttVar == null || !ttVar.f32878e) {
            return e0(z10);
        }
        if (!z10) {
            return false;
        }
        ttVar.k(true);
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f39407c;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jo.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.j40 j40Var = this.f39427s;
        if (j40Var != null) {
            j40Var.e();
        }
        if (this.f39429t0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.f39438z0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.tt ttVar = this.v;
        if (ttVar != null) {
            ttVar.o();
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        hh.m mVar = this.f39432w;
        if (mVar != null) {
            mVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.f39407c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.L0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.k5) obj).p(null);
        }
        org.telegram.ui.Components.tt ttVar = this.v;
        if (ttVar != null) {
            ttVar.r();
        }
        UndoView undoView = this.f39407c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f39427s.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.f39427s.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.tt ttVar = this.v;
        if (ttVar != null) {
            ttVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.f39427s.l();
    }

    public final void p0(boolean z10, boolean z11) {
        boolean z12;
        int iN0;
        int i10;
        int i11;
        String str;
        int i12;
        TLRPC.ChatFull chatFull;
        String str2;
        int i13;
        String string;
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        org.telegram.ui.Cells.l8 l8Var3;
        org.telegram.ui.Cells.l8 l8Var4;
        String str3;
        int i14;
        org.telegram.ui.Cells.l8 l8Var5;
        org.telegram.ui.Cells.l8 l8Var6;
        org.telegram.ui.Cells.l8 l8Var7;
        org.telegram.ui.Cells.l8 l8Var8;
        org.telegram.ui.Cells.l8 l8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.f39428s0))) != null) {
            this.f39429t0 = chat;
        }
        boolean zIsPublic = ChatObject.isPublic(this.f39429t0);
        org.telegram.ui.Cells.x8 x8Var = this.L;
        if (x8Var != null) {
            x8Var.setVisibility((this.E != null || ((l8Var7 = this.F) != null && l8Var7.getVisibility() == 0) || (((l8Var8 = this.J) != null && l8Var8.getVisibility() == 0) || ((l8Var9 = this.D) != null && l8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.l8 l8Var10 = this.U;
        if (l8Var10 != null) {
            l8Var10.setVisibility(ChatObject.isChannel(this.f39429t0) ? 0 : 8);
        }
        org.telegram.ui.Cells.l8 l8Var11 = this.F;
        if (l8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.f39430u0;
            if (chatFull2 == null || (!this.E0 && chatFull2.linked_chat_id == 0)) {
                l8Var11.setVisibility(8);
            } else {
                l8Var11.setVisibility(0);
                if (this.f39430u0.linked_chat_id == 0) {
                    this.F.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f39430u0.linked_chat_id));
                    if (chat2 == null) {
                        this.F.setVisibility(8);
                    } else if (this.E0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.F.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.F.s(LocaleController.getString("Discussion", R.string.Discussion), s3.c.e("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.l8 l8Var12 = this.F;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i15 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.l8 l8Var13 = this.M;
                            l8Var12.s(string2, str4, false, i15, l8Var13 != null && l8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.l8 l8Var14 = this.F;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String strE = s3.c.e("@", publicUsername2);
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.l8 l8Var15 = this.M;
                            l8Var14.s(string3, strE, false, i16, l8Var15 != null && l8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.l8 l8Var16 = this.D;
        if (l8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.f39430u0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                l8Var16.setVisibility(8);
            } else {
                l8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f39430u0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.D.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.D.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z11, true);
                }
            }
        }
        if (this.E != null) {
            TLRPC.ChatFull chatFull4 = this.f39430u0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.f39429t0.noforwards;
                if (this.E0) {
                    if (zIsPublic) {
                        str3 = "TypePublic";
                        i14 = R.string.TypePublic;
                    } else if (z13) {
                        str3 = "TypePrivateRestrictedForwards";
                        i14 = R.string.TypePrivateRestrictedForwards;
                    } else {
                        str3 = "TypePrivate";
                        i14 = R.string.TypePrivate;
                    }
                    string = LocaleController.getString(str3, i14);
                } else {
                    if (zIsPublic) {
                        str2 = "TypePublicGroup";
                        i13 = R.string.TypePublicGroup;
                    } else if (z13) {
                        str2 = "TypePrivateGroupRestrictedForwards";
                        i13 = R.string.TypePrivateGroupRestrictedForwards;
                    } else {
                        str2 = "TypePrivateGroup";
                        i13 = R.string.TypePrivateGroup;
                    }
                    string = LocaleController.getString(str2, i13);
                }
                String str5 = string;
                if (this.E0) {
                    org.telegram.ui.Cells.l8 l8Var17 = this.E;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i17 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.l8 l8Var18 = this.J;
                    l8Var17.s(string4, str5, false, i17, (l8Var18 != null && l8Var18.getVisibility() == 0) || ((l8Var3 = this.F) != null && l8Var3.getVisibility() == 0) || ((l8Var4 = this.M) != null && l8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.l8 l8Var19 = this.E;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i18 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.l8 l8Var20 = this.J;
                    l8Var19.s(string5, str5, false, i18, (l8Var20 != null && l8Var20.getVisibility() == 0) || ((l8Var = this.F) != null && l8Var.getVisibility() == 0) || ((l8Var2 = this.M) != null && l8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !zIsPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a9.p.p(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.f39429t0));
                org.telegram.ui.Cells.l8 l8Var21 = this.E;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i19 = R.drawable.msg_channel;
                org.telegram.ui.Cells.l8 l8Var22 = this.J;
                l8Var21.s(string7, string6, false, i19, (l8Var22 != null && l8Var22.getVisibility() == 0) || ((l8Var5 = this.F) != null && l8Var5.getVisibility() == 0) || ((l8Var6 = this.M) != null && l8Var6.getVisibility() == 0));
            }
        }
        if (this.J != null) {
            if (!this.F0 || this.B0) {
                str = "ChatHistoryVisible";
                i12 = R.string.ChatHistoryVisible;
            } else {
                str = "ChatHistoryHidden";
                i12 = R.string.ChatHistoryHidden;
            }
            this.J.s(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i12), z11, R.drawable.msg_discuss, this.M != null);
            this.J.setEnabled(!this.B0);
            boolean z14 = (this.B0 || zIsPublic || ((chatFull = this.f39430u0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.J.getAlpha() <= 0.0f && !z14) {
                this.J.setVisibility(8);
                o0();
            } else if (this.J.getVisibility() != 0 || this.J.getAlpha() < 1.0f || !z14) {
                ArrayList arrayList = new ArrayList();
                boolean z15 = false;
                for (int i20 = 0; i20 < this.B.getChildCount(); i20++) {
                    if (!z15 && this.B.getChildAt(i20) == this.J) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.B.getChildAt(i20));
                    }
                }
                boolean z16 = false;
                for (int i21 = 0; i21 < this.f39432w.getChildCount(); i21++) {
                    if (!z16 && this.f39432w.getChildAt(i21) == this.B) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.f39432w.getChildAt(i21));
                    }
                }
                if (this.J.getVisibility() != 0) {
                    this.J.setAlpha(0.0f);
                    org.telegram.ui.Cells.l8 l8Var23 = this.J;
                    l8Var23.setTranslationY((-l8Var23.getHeight()) / 2.0f);
                }
                this.J.setVisibility(0);
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    ((View) arrayList.get(i22)).setTranslationY((1.0f - this.J.getAlpha()) * (-this.J.getHeight()));
                }
                if (z11) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.J.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.O0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ag.t2(7, this, arrayList));
                    this.O0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 5));
                    this.O0.setDuration(320L);
                    this.O0.setInterpolator(org.telegram.ui.Components.er.h);
                    this.O0.start();
                } else {
                    this.J.setAlpha(z14 ? 1.0f : 0.0f);
                    org.telegram.ui.Cells.l8 l8Var24 = this.J;
                    l8Var24.setTranslationY(((-l8Var24.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.J.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.J.setVisibility(z14 ? 0 : 8);
                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                        ((View) arrayList.get(i23)).setTranslationY(0.0f);
                    }
                    this.O0 = null;
                }
            }
        }
        if (this.P != null) {
            if (this.f39430u0 != null) {
                org.telegram.ui.Cells.l8 l8Var25 = this.Q;
                if (l8Var25 != null) {
                    if (l8Var25.getParent() == null) {
                        this.N.addView(this.Q, this.N.indexOfChild(this.P) + 1, h7.z5.n(-1, -2));
                    }
                    this.Q.setVisibility(this.f39430u0.requests_pending > 0 ? 0 : 8);
                }
                if (!this.E0 || ChatObject.isCommunity(this.f39429t0)) {
                    if (ChatObject.isChannel(this.f39429t0)) {
                        this.P.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.f39430u0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        this.P.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.f39430u0.participants.participants.size())), false, R.drawable.msg_groups, this.Q.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.f39429t0;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i24 = this.B0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f39429t0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i25 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i25++;
                            }
                            iN0 = lr.n0(tL_chatBannedRights) + i25;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f39429t0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                iN0++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                iN0++;
                            }
                            if (this.B0 && !tL_chatBannedRights2.manage_topics) {
                                iN0++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                iN0++;
                            }
                            i10 = i24;
                        } else {
                            iN0 = i24;
                            i10 = iN0;
                        }
                        z12 = z11;
                        this.T.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(iN0), Integer.valueOf(i10)), z12, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.l8 l8Var26 = this.T;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.f39430u0;
                        String str6 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i26 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.l8 l8Var27 = this.U;
                        l8Var26.s(string8, str6, false, i26, l8Var27 != null && l8Var27.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.l8 l8Var28 = this.Q;
                    if (l8Var28 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String str7 = String.format("%d", Integer.valueOf(this.f39430u0.requests_pending));
                        int i27 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.l8 l8Var29 = this.U;
                        l8Var28.s(string9, str7, false, i27, l8Var29 != null && l8Var29.getVisibility() == 0);
                    }
                } else {
                    this.P.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.f39430u0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.l8 l8Var30 = this.T;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.f39430u0;
                    String str8 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i28 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.l8 l8Var31 = this.U;
                    l8Var30.s(string10, str8, false, i28, l8Var31 != null && l8Var31.getVisibility() == 0);
                    z12 = z11;
                }
                org.telegram.ui.Cells.l8 l8Var32 = this.S;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.f39429t0)) {
                    i11 = this.f39430u0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f39430u0;
                    if (chatFull7 == null) {
                        i11 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i29 = 0;
                        for (int i30 = 0; i30 < size; i30++) {
                            TLRPC.ChatParticipant chatParticipant = this.f39430u0.participants.participants.get(i30);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i29++;
                            }
                        }
                        i11 = i29;
                    }
                }
                l8Var32.s(string11, String.format("%d", Integer.valueOf(i11)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.E0 || ChatObject.isCommunity(this.f39429t0)) {
                    org.telegram.ui.Cells.l8 l8Var33 = this.P;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i31 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.l8 l8Var34 = this.U;
                    l8Var33.m(i31, string12, l8Var34 != null && l8Var34.getVisibility() == 0);
                    if (this.f39429t0.gigagroup) {
                        org.telegram.ui.Cells.l8 l8Var35 = this.T;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i32 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.l8 l8Var36 = this.U;
                        l8Var35.m(i32, string13, l8Var36 != null && l8Var36.getVisibility() == 0);
                    } else {
                        this.T.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.P.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.l8 l8Var37 = this.T;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i33 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.l8 l8Var38 = this.U;
                    l8Var37.m(i33, string14, l8Var38 != null && l8Var38.getVisibility() == 0);
                }
                this.S.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.K.setVisibility(ChatObject.canChangeChatInfo(this.f39429t0) ? 0 : 8);
            s0(z12);
            if (this.f39430u0 == null || !ChatObject.canUserDoAdminAction(this.f39429t0, 3) || (zIsPublic && this.f39429t0.creator)) {
                this.R.setVisibility(8);
            } else if (this.f39430u0.invitesCount > 0) {
                this.R.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.f39430u0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.R.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.G != null) {
            t0(null);
        }
    }

    public final void q0() {
        gy gyVar;
        bx bxVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof rn) {
                rn rnVar = (rn) fragmentStack.get(i10);
                if (rnVar.getArguments().getLong("chat_id") == this.f39428s0) {
                    ((ActionBarLayout) getParentLayout()).a0(rnVar, false);
                    rnVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, rnVar);
                    if (!this.D0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.f39428s0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new we1(bundle));
                        i10++;
                    }
                }
            } else if (this.D0 && (fragmentStack.get(i10) instanceof we1)) {
                we1 we1Var = (we1) fragmentStack.get(i10);
                if (we1Var.g() != null && we1Var.g().f22380id == this.f39428s0) {
                    ((ActionBarLayout) getParentLayout()).a0(we1Var, false);
                    i10--;
                }
            } else if (this.D0 && (fragmentStack.get(i10) instanceof gy) && (gyVar = (gy) fragmentStack.get(i10)) != null && (bxVar = gyVar.B3) != null && bxVar.c()) {
                gyVar.B3.a();
            }
            i10++;
        }
    }

    public final void r0() {
        if (this.f39415h0 == null) {
            return;
        }
        if (this.f39438z0.usernames.size() <= 1) {
            this.f39415h0.s(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.f39438z0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.f39438z0.usernames;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i11);
            i11++;
            if (tL_username.active) {
                i10++;
            }
        }
        this.f39415h0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.f39438z0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j40 j40Var = this.f39427s;
        if (j40Var != null) {
            j40Var.f29573f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10) {
        String str;
        String string;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.f39428s0);
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.f39429t0);
        TLRPC.ChatReactions chatReactions = this.G0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String string2 = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull == null || !chatFull.paid_reactions_available) {
                str = string2;
            } else {
                string = "1";
            }
            this.K.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
        }
        if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i10 = 0;
            for (int i11 = 0; i11 < tL_chatReactionsSome.reactions.size(); i11++) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i11);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null && !tL_availableReaction.inactive) {
                        i10++;
                    }
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    i10++;
                }
            }
            if (zIsChannelAndNotMegaGroup) {
                if (chatFull != null && chatFull.paid_reactions_available) {
                    i10++;
                }
                string = i10 == 0 ? LocaleController.getString(R.string.ReactionsOff) : String.valueOf(i10);
            } else {
                int iMin = Math.min(getMediaDataController().getEnabledReactionsList().size(), i10);
                string = iMin == 0 ? LocaleController.getString(R.string.ReactionsOff) : LocaleController.formatString(R.string.ReactionsCount, Integer.valueOf(iMin), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
            }
        } else {
            string = LocaleController.getString(R.string.ReactionsAll);
        }
        str = string;
        this.K.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j40 j40Var = this.f39427s;
        if (j40Var != null && (str = j40Var.f29573f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.tt ttVar = this.v;
        if (ttVar != null) {
            String string = ttVar.getText().toString();
            if (string.length() != 0) {
                bundle.putString("nameTextView", string);
            }
        }
    }

    public final void t0(Long l10) {
        boolean z10;
        TLRPC.Chat chat = this.f39429t0;
        if (chat == null || this.G == null) {
            return;
        }
        long jLongValue = 0;
        if (l10 != null) {
            z10 = l10.longValue() >= 0;
        } else {
            z10 = chat.broadcast_messages_allowed;
        }
        if (!z10) {
            this.G.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f39429t0.linked_monoforum_id));
        if (l10 != null) {
            jLongValue = l10.longValue();
        } else if (chat2 != null) {
            jLongValue = chat2.send_paid_messages_stars;
        }
        this.G.s(LocaleController.getString(R.string.PostSuggestions), hh.oa.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(jLongValue)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }
}
