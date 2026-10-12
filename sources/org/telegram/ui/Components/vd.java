package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vd implements View.OnClickListener {
    public final int f29943a;
    public final ChatActivityEnterView f29944b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29943a = i10;
        this.f29944b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        pg pgVar;
        boolean z10;
        fg fgVar;
        rf rfVar;
        long j10;
        int i10;
        org.telegram.ui.fo foVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r10;
        float f7;
        float f10;
        TLRPC.Peer peer;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f29943a;
        ChatActivityEnterView chatActivityEnterView = this.f29944b;
        switch (i17) {
            case 0:
                rf rfVar2 = chatActivityEnterView.E0;
                if (rfVar2 == null) {
                    str = "";
                } else {
                    str = rfVar2.getText().toString();
                }
                int indexOf = str.indexOf(32);
                if (indexOf != -1 && indexOf != str.length() - 1) {
                    chatActivityEnterView.setFieldText(str.substring(0, indexOf + 1));
                    return;
                } else {
                    chatActivityEnterView.setFieldText("");
                    return;
                }
            case 1:
                of ofVar = chatActivityEnterView.L0;
                if (ofVar == null || ofVar.f36854q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f22963t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f22883f0 == null) {
                        chatActivityEnterView.Q0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pg pgVar2 = chatActivityEnterView.Z2;
                if (pgVar2 != null) {
                    pgVar2.H0();
                    return;
                }
                return;
            case 3:
                int i18 = ChatActivityEnterView.f22849n5;
                if (chatActivityEnterView.f22859b2 != null) {
                    if (chatActivityEnterView.f22864c0 - chatActivityEnterView.f22870d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f22857b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f22857b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    lg w9 = chatActivityEnterView.w();
                    chatActivityEnterView.f22866c2 = w9;
                    ig.y d = ig.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f22859b2.link;
                    String str3 = w9.f27038a;
                    ArrayList<TLRPC.MessageEntity> arrayList = w9.f27039b;
                    td tdVar = new td(chatActivityEnterView, 14);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, tdVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (pgVar = chatActivityEnterView.Z2) != null) {
                    pgVar.u1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f22916k3) {
                    if (!chatActivityEnterView.f22995z2 || (rfVar = chatActivityEnterView.E0) == null || !rfVar.isFocused()) {
                        if (chatActivityEnterView.f22996z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                z10 = true;
                                chatActivityEnterView.k1(0, true);
                                chatActivityEnterView.U0.u(true);
                                chatActivityEnterView.U0.B();
                                if (chatActivityEnterView.y3) {
                                    chatActivityEnterView.I(true);
                                }
                            } else {
                                if (!chatActivityEnterView.E3 && (fgVar = chatActivityEnterView.U0) != null) {
                                    fgVar.O(false);
                                }
                                z10 = true;
                            }
                        } else {
                            if (!chatActivityEnterView.E3) {
                                z10 = true;
                                chatActivityEnterView.U0.O(true);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.E3) {
                            chatActivityEnterView.l1(chatActivityEnterView.f22996z3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f22963t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    hl0 hl0Var = chatActivityEnterView.f22896h1;
                    if (hl0Var != null) {
                        hl0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f22879e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        pg pgVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        pgVar3.a2(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        ze zeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        zeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f22873d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f22867c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            i2.d.t(chatActivityEnterView.f22867c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f22867c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j11 = chatActivityEnterView.Q2;
                    org.telegram.ui.fo foVar2 = chatActivityEnterView.P2;
                    if (foVar2 != null && foVar2.f35964h4) {
                        j10 = foVar2.d();
                    } else {
                        j10 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f22902i1 = 0L;
                    chatActivityEnterView.m0(false);
                    chatActivityEnterView.I(true);
                    return;
                }
                return;
            case 7:
                fi.b0 b0Var = chatActivityEnterView.f22919l0;
                boolean z16 = b0Var.v;
                b0Var.setOpened(!z16);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.h0()) {
                    if (!z16) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.J0();
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 13), 275L);
                        chatActivityEnterView.k0(false);
                        return;
                    }
                    return;
                } else if (!z16) {
                    if (chatActivityEnterView.m0 == null) {
                        pf pfVar = new pf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = pfVar;
                        bi.o0 o0Var = pfVar.f9652c;
                        chatActivityEnterView.getContext();
                        o0Var.setLayoutManager(new s4.b0());
                        bi.o0 o0Var2 = chatActivityEnterView.m0.f9652c;
                        ?? g0Var = new s4.g0();
                        g0Var.f9155c = new ArrayList();
                        g0Var.d = new ArrayList();
                        g0Var.e = new ArrayList();
                        chatActivityEnterView.f22929n0 = g0Var;
                        o0Var2.setAdapter(g0Var);
                        chatActivityEnterView.m0.f9652c.setOnItemClickListener(new qf(chatActivityEnterView));
                        chatActivityEnterView.m0.f9652c.setOnItemLongClickListener(new se(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f22923m1.addView(chatActivityEnterView.m0, w7.a6.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.X4;
                        if (hVar != null) {
                            chatActivityEnterView.f22929n0.E(hVar);
                        }
                        chatActivityEnterView.A1();
                    }
                    pf pfVar2 = chatActivityEnterView.m0;
                    if (pfVar2.getVisibility() != 0) {
                        pfVar2.setVisibility(0);
                        pfVar2.f9652c.u0(0);
                        pfVar2.f9654n = true;
                        pfVar2.f9653f = false;
                        return;
                    } else if (pfVar2.f9653f) {
                        pfVar2.f9653f = false;
                        pfVar2.a();
                        pfVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    pf pfVar3 = chatActivityEnterView.m0;
                    if (pfVar3 != null) {
                        pfVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                pg pgVar4 = chatActivityEnterView.Z2;
                if (pgVar4 != null && !pgVar4.l()) {
                    pg pgVar5 = chatActivityEnterView.Z2;
                    xg xgVar = chatActivityEnterView.F0;
                    pgVar5.o1(xgVar, xgVar.f31254a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                if (BirthdayController.isToday(chatActivityEnterView.P2.f35878a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + foVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + foVar.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + foVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f35878a8 == null || !chatActivityEnterView.getParentFragment().f35878a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i19 = chatActivityEnterView.getParentFragment().i();
                if (i19 != null) {
                    if (chatActivityEnterView.getParentFragment().f35878a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f35878a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(chatActivityEnterView.getContext(), 3, null);
                    a2Var.q(200L);
                    a2Var.setOnCancelListener(new org.telegram.ui.ga(chatActivityEnterView, ug.s.j(chatActivityEnterView.Q, null, new bi.i4(chatActivityEnterView, a2Var, i19, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i20 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.H0();
                return;
            case 11:
                nf nfVar = chatActivityEnterView.N0;
                if (nfVar != null && nfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new ji.w4(chatActivityEnterView, 13), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f29944b;
                nf nfVar2 = chatActivityEnterView2.N0;
                if (nfVar2 != null && nfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f29944b;
                nf nfVar3 = chatActivityEnterView3.N0;
                if (nfVar3 != null && nfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.o1 o1Var = chatActivityEnterView.U;
                if (o1Var == null || !o1Var.f20558f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.s1();
                        return;
                    } else if (chatActivityEnterView.r0() && chatActivityEnterView.f22885f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z15 = false;
                            chatActivityEnterView.k1(0, true);
                            fg fgVar2 = chatActivityEnterView.U0;
                            if (fgVar2 != null) {
                                fgVar2.u(false);
                            }
                            rf rfVar3 = chatActivityEnterView.E0;
                            if (rfVar3 != null) {
                                rfVar3.requestFocus();
                            }
                        } else {
                            z15 = false;
                        }
                        if (chatActivityEnterView.f22996z3) {
                            chatActivityEnterView.l1(z15, true, z15, true);
                            chatActivityEnterView.f22921l3 = true;
                            AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 22), 200L);
                            return;
                        }
                        chatActivityEnterView.G0();
                        return;
                    } else {
                        chatActivityEnterView.r1(1, 0, true, true);
                        fg fgVar3 = chatActivityEnterView.U0;
                        rf rfVar4 = chatActivityEnterView.E0;
                        if (rfVar4 != null && rfVar4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.fo foVar3 = chatActivityEnterView.P2;
                        if (foVar3 != null) {
                            di.d4 d4Var = foVar3.f36175y1;
                            if (d4Var != null) {
                                if (d4Var.V) {
                                    d4Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            foVar3.f36175y1 = null;
                            if (z14) {
                                z13 = true;
                                fgVar3.D(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        fgVar3.D(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.u(false);
                    rf rfVar5 = chatActivityEnterView.E0;
                    if (rfVar5 != null) {
                        rfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f22931n2 != null) {
                    if (chatActivityEnterView.r0()) {
                        r10 = 1;
                        if (chatActivityEnterView.f22885f2 == 1) {
                            if (chatActivityEnterView.r0() && chatActivityEnterView.f22885f2 == 1) {
                                chatActivityEnterView.r1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.r1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.f22941p2) {
                    chatActivityEnterView.setFieldText("/");
                    rf rfVar6 = chatActivityEnterView.E0;
                    if (rfVar6 != null) {
                        rfVar6.requestFocus();
                    }
                    chatActivityEnterView.F0();
                }
                if (chatActivityEnterView.f22996z3) {
                    chatActivityEnterView.l1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f29944b;
                org.telegram.ui.fo foVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.f22922l5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.r0()) {
                    chatActivityEnterView4.f22950r0 = new je(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f22922l5) {
                        chatActivityEnterView4.l0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.l0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.q() > AndroidUtilities.dp(20.0f)) {
                    int Y0 = chatActivityEnterView4.Z2.Y0();
                    int q6 = chatActivityEnterView4.Z2.q();
                    f7 = 20.0f;
                    if (q6 <= AndroidUtilities.dp(20.0f)) {
                        Y0 += q6;
                    }
                    if (chatActivityEnterView4.W0) {
                        Y0 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (Y0 < AndroidUtilities.dp(200.0f)) {
                        chatActivityEnterView4.f22966u0 = new je(chatActivityEnterView4, 4);
                        chatActivityEnterView4.N();
                        return;
                    }
                } else {
                    f7 = 20.0f;
                }
                if (chatActivityEnterView4.Z2.K() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    gf gfVar = chatActivityEnterView4.f22944q0;
                    if (gfVar != null) {
                        gfVar.e = false;
                        gfVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f22922l5) {
                        peer2 = chatActivityEnterView4.Z2.x();
                        chatFull = null;
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        MessagesController.getInstance(chatActivityEnterView4.Q).getChat(Long.valueOf(-chatActivityEnterView4.Q2));
                        TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.Q).getChatFull(-chatActivityEnterView4.Q2);
                        if (chatFull2 != null) {
                            peer = chatFull2.default_send_as;
                        } else {
                            peer = null;
                        }
                        TLRPC.Peer peer3 = peer;
                        chatFull = chatFull2;
                        peer2 = peer3;
                    }
                    if (peer2 == null && chatActivityEnterView4.Z2.K() != null && !chatActivityEnterView4.Z2.K().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Z2.K().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.f22922l5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        foVar4.getParentLayout().getOverlayContainerView();
                    }
                    gf gfVar2 = new gf(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Z2.K(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f22944q0 = gfVar2;
                    gfVar2.e = true;
                    gfVar2.f20521c = 220;
                    gfVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f22944q0.setClippingEnabled(true);
                    chatActivityEnterView4.f22944q0.setFocusable(true);
                    chatActivityEnterView4.f22944q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f22944q0.setInputMethodMode(2);
                    chatActivityEnterView4.f22944q0.setSoftInputMode(0);
                    chatActivityEnterView4.f22944q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f22944q0.f20520b = false;
                    int i21 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && foVar4 != null) {
                        foVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i21;
                    } else {
                        i11 = i21;
                    }
                    int Y02 = chatActivityEnterView4.Z2.Y0();
                    int measuredHeight = chatActivityEnterView4.f22944q0.getContentView().getMeasuredHeight();
                    int q10 = chatActivityEnterView4.Z2.q();
                    if (q10 <= AndroidUtilities.dp(f7)) {
                        Y02 += q10;
                    }
                    if (chatActivityEnterView4.W0) {
                        Y02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(f10);
                    int i22 = (i21 * 2) + Y02;
                    if (foVar4 != null && foVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i22 - i12) - chatActivityEnterView4.f22944q0.f30934p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i21) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (foVar4 != null && foVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f22944q0.f30933o.getLayoutParams().height = ((Y02 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    gf gfVar3 = chatActivityEnterView4.f22944q0;
                    View view2 = gfVar3.f30939u;
                    mm0 mm0Var = gfVar3.v;
                    TLRPC.Peer peer5 = gfVar3.f30936r;
                    qp0 qp0Var = gfVar3.f30933o;
                    ah.x xVar = gfVar3.f30938t;
                    int i23 = 1;
                    ArrayList arrayList2 = gfVar3.f30943z;
                    int size = arrayList2.size();
                    int i24 = 0;
                    while (i24 < size) {
                        Object obj = arrayList2.get(i24);
                        i24++;
                        ((o1.k) obj).c();
                    }
                    arrayList2.clear();
                    xVar.setPivotX(AndroidUtilities.dp(8.0f));
                    xVar.setPivotY(xVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                    qp0Var.setPivotX(0.0f);
                    qp0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = gfVar3.f30937s.peers;
                    if (peer5 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        i15 = 2;
                        int i25 = 0;
                        while (i25 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i25).peer;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            mm0 mm0Var2 = mm0Var;
                            long j12 = peer6.channel_id;
                            if (j12 == 0 || j12 != peer5.channel_id) {
                                long j13 = peer6.user_id;
                                if (j13 == 0 || j13 != peer5.user_id) {
                                    long j14 = peer6.chat_id;
                                    if (j14 == 0 || j14 != peer5.chat_id) {
                                        i25++;
                                        mm0Var = mm0Var2;
                                        arrayList3 = arrayList4;
                                        f10 = 1.0f;
                                    }
                                }
                            }
                            if (i25 != arrayList4.size() - 1 && mm0Var2.getMeasuredHeight() < size2) {
                                i16 = mm0Var2.getMeasuredHeight() % dp;
                            } else {
                                i16 = 0;
                            }
                            gfVar3.f30940w.h1(i25, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + i16);
                            if (mm0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(f10).setDuration(150L).start();
                            }
                        }
                    } else {
                        i15 = 2;
                    }
                    xVar.setScaleX(0.25f);
                    xVar.setScaleY(0.25f);
                    qp0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(xVar, o1.h.f16452o);
                    kVar.f16468u = org.telegram.ui.Cells.d0.k(1.0f, 750.0f, 1.0f);
                    kVar.b(new np0(gfVar3, i15));
                    o1.k kVar2 = new o1.k(xVar, o1.h.f16453p);
                    kVar2.f16468u = org.telegram.ui.Cells.d0.k(1.0f, 750.0f, 1.0f);
                    kVar2.b(new np0(gfVar3, 3));
                    o1.c cVar = o1.h.f16457t;
                    o1.k kVar3 = new o1.k(xVar, cVar);
                    kVar3.f16468u = org.telegram.ui.Cells.d0.k(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(qp0Var, cVar);
                    kVar4.f16468u = org.telegram.ui.Cells.d0.k(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new op0(gfVar3, kVar5, i23));
                        kVar5.h();
                        i23 = 1;
                    }
                    gf gfVar4 = chatActivityEnterView4.f22944q0;
                    chatActivityEnterView4.f22956s0 = i11;
                    chatActivityEnterView4.f22961t0 = i14;
                    gfVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f22939p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i26 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.b0();
                return;
            case 18:
                org.telegram.ui.ActionBar.o1 o1Var2 = chatActivityEnterView.U;
                if ((o1Var2 == null || !o1Var2.f20558f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.q2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.o1 o1Var3 = chatActivityEnterView.U;
                if ((o1Var3 == null || !o1Var3.f20558f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.l1();
                    return;
                }
                return;
            default:
                int i27 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.H0();
                return;
        }
    }
}
