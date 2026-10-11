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
public final class xd implements View.OnClickListener {
    public final int f32936a;
    public final ChatActivityEnterView f32937b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32936a = i10;
        this.f32937b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        qg qgVar;
        boolean z10;
        gg ggVar;
        sf sfVar;
        long j3;
        int i10;
        org.telegram.ui.zn znVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r92;
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
        int i17 = this.f32936a;
        ChatActivityEnterView chatActivityEnterView = this.f32937b;
        switch (i17) {
            case 0:
                sf sfVar2 = chatActivityEnterView.E0;
                if (sfVar2 == null) {
                    str = "";
                } else {
                    str = sfVar2.getText().toString();
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
                pf pfVar = chatActivityEnterView.L0;
                if (pfVar == null || pfVar.f36778q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f23992t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f23913f0 == null) {
                        chatActivityEnterView.Q0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                qg qgVar2 = chatActivityEnterView.Z2;
                if (qgVar2 != null) {
                    qgVar2.O0();
                    return;
                }
                return;
            case 3:
                int i18 = ChatActivityEnterView.f23878n5;
                if (chatActivityEnterView.f23888b2 != null) {
                    if (chatActivityEnterView.f23893c0 - chatActivityEnterView.f23899d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f23886b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f23886b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    mg w10 = chatActivityEnterView.w();
                    chatActivityEnterView.f23895c2 = w10;
                    hg.z d = hg.z.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f23888b2.link;
                    String str3 = w10.f28847a;
                    ArrayList<TLRPC.MessageEntity> arrayList = w10.f28848b;
                    vd vdVar = new vd(chatActivityEnterView, 14);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, vdVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (qgVar = chatActivityEnterView.Z2) != null) {
                    qgVar.G1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f23945k3) {
                    if (!chatActivityEnterView.f24024z2 || (sfVar = chatActivityEnterView.E0) == null || !sfVar.isFocused()) {
                        if (chatActivityEnterView.f24025z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                z10 = true;
                                chatActivityEnterView.k1(0, true);
                                chatActivityEnterView.U0.u(true);
                                chatActivityEnterView.U0.C();
                                if (chatActivityEnterView.y3) {
                                    chatActivityEnterView.I(true);
                                }
                            } else {
                                if (!chatActivityEnterView.E3 && (ggVar = chatActivityEnterView.U0) != null) {
                                    ggVar.O(false);
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
                            chatActivityEnterView.l1(chatActivityEnterView.f24025z3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f23992t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    ml0 ml0Var = chatActivityEnterView.f23926h1;
                    if (ml0Var != null) {
                        ml0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f23909e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        qg qgVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        qgVar3.q2(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        af afVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        afVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f23902d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f23896c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            hg.c.t(chatActivityEnterView.f23896c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f23896c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.zn znVar2 = chatActivityEnterView.P2;
                    if (znVar2 != null && znVar2.f44826h4) {
                        j3 = znVar2.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f23932i1 = 0L;
                    chatActivityEnterView.m0(false);
                    chatActivityEnterView.I(true);
                    return;
                }
                return;
            case 7:
                ei.c0 c0Var = chatActivityEnterView.f23948l0;
                boolean z16 = c0Var.v;
                c0Var.setOpened(!z16);
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
                        AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 13), 275L);
                        chatActivityEnterView.k0(false);
                        return;
                    }
                    return;
                } else if (!z16) {
                    if (chatActivityEnterView.m0 == null) {
                        qf qfVar = new qf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = qfVar;
                        ai.w0 w0Var = qfVar.f9494c;
                        chatActivityEnterView.getContext();
                        w0Var.setLayoutManager(new s4.d0());
                        ai.w0 w0Var2 = chatActivityEnterView.m0.f9494c;
                        ?? i0Var = new s4.i0();
                        i0Var.f8955c = new ArrayList();
                        i0Var.d = new ArrayList();
                        i0Var.f8956e = new ArrayList();
                        chatActivityEnterView.f23958n0 = i0Var;
                        w0Var2.setAdapter(i0Var);
                        chatActivityEnterView.m0.f9494c.setOnItemClickListener(new rf(chatActivityEnterView));
                        chatActivityEnterView.m0.f9494c.setOnItemLongClickListener(new ue(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f23952m1.addView(chatActivityEnterView.m0, w7.x5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.X4;
                        if (iVar != null) {
                            chatActivityEnterView.f23958n0.E(iVar);
                        }
                        chatActivityEnterView.A1();
                    }
                    qf qfVar2 = chatActivityEnterView.m0;
                    if (qfVar2.getVisibility() != 0) {
                        qfVar2.setVisibility(0);
                        qfVar2.f9494c.u0(0);
                        qfVar2.f9497n = true;
                        qfVar2.f9496f = false;
                        return;
                    } else if (qfVar2.f9496f) {
                        qfVar2.f9496f = false;
                        qfVar2.a();
                        qfVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    qf qfVar3 = chatActivityEnterView.m0;
                    if (qfVar3 != null) {
                        qfVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                qg qgVar4 = chatActivityEnterView.Z2;
                if (qgVar4 != null && !qgVar4.m()) {
                    qg qgVar5 = chatActivityEnterView.Z2;
                    yg ygVar = chatActivityEnterView.F0;
                    qgVar5.z1(ygVar, ygVar.f33241a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                if (BirthdayController.isToday(chatActivityEnterView.P2.f44741a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + znVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + znVar.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + znVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f44741a8 == null || !chatActivityEnterView.getParentFragment().f44741a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i19 = chatActivityEnterView.getParentFragment().i();
                if (i19 != null) {
                    if (chatActivityEnterView.getParentFragment().f44741a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f44741a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(chatActivityEnterView.getContext(), 3, null);
                    a2Var.q(200L);
                    a2Var.setOnCancelListener(new org.telegram.ui.ba(chatActivityEnterView, tg.r.j(chatActivityEnterView.Q, null, new ai.u4(chatActivityEnterView, a2Var, i19, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i20 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.H0();
                return;
            case 11:
                of ofVar = chatActivityEnterView.N0;
                if (ofVar != null && ofVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new l2.f(chatActivityEnterView, 10), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f32937b;
                of ofVar2 = chatActivityEnterView2.N0;
                if (ofVar2 != null && ofVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f32937b;
                of ofVar3 = chatActivityEnterView3.N0;
                if (ofVar3 != null && ofVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.o1 o1Var = chatActivityEnterView.U;
                if (o1Var == null || !o1Var.f21448f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.s1();
                        return;
                    } else if (chatActivityEnterView.r0() && chatActivityEnterView.f23915f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z15 = false;
                            chatActivityEnterView.k1(0, true);
                            gg ggVar2 = chatActivityEnterView.U0;
                            if (ggVar2 != null) {
                                ggVar2.u(false);
                            }
                            sf sfVar3 = chatActivityEnterView.E0;
                            if (sfVar3 != null) {
                                sfVar3.requestFocus();
                            }
                        } else {
                            z15 = false;
                        }
                        if (chatActivityEnterView.f24025z3) {
                            chatActivityEnterView.l1(z15, true, z15, true);
                            chatActivityEnterView.f23950l3 = true;
                            AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 22), 200L);
                            return;
                        }
                        chatActivityEnterView.G0();
                        return;
                    } else {
                        chatActivityEnterView.r1(1, 0, true, true);
                        gg ggVar3 = chatActivityEnterView.U0;
                        sf sfVar4 = chatActivityEnterView.E0;
                        if (sfVar4 != null && sfVar4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.zn znVar3 = chatActivityEnterView.P2;
                        if (znVar3 != null) {
                            ci.d4 d4Var = znVar3.f45037y1;
                            if (d4Var != null) {
                                if (d4Var.V) {
                                    d4Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            znVar3.f45037y1 = null;
                            if (z14) {
                                z13 = true;
                                ggVar3.D(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        ggVar3.D(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.u(false);
                    sf sfVar5 = chatActivityEnterView.E0;
                    if (sfVar5 != null) {
                        sfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f23960n2 != null) {
                    if (chatActivityEnterView.r0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f23915f2 == 1) {
                            if (chatActivityEnterView.r0() && chatActivityEnterView.f23915f2 == 1) {
                                chatActivityEnterView.r1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.r1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.f23970p2) {
                    chatActivityEnterView.setFieldText("/");
                    sf sfVar6 = chatActivityEnterView.E0;
                    if (sfVar6 != null) {
                        sfVar6.requestFocus();
                    }
                    chatActivityEnterView.F0();
                }
                if (chatActivityEnterView.f24025z3) {
                    chatActivityEnterView.l1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f32937b;
                org.telegram.ui.zn znVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.f23951l5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.r0()) {
                    chatActivityEnterView4.f23979r0 = new le(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f23951l5) {
                        chatActivityEnterView4.l0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.l0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.v() > AndroidUtilities.dp(20.0f)) {
                    int h12 = chatActivityEnterView4.Z2.h1();
                    int v = chatActivityEnterView4.Z2.v();
                    f7 = 20.0f;
                    if (v <= AndroidUtilities.dp(20.0f)) {
                        h12 += v;
                    }
                    if (chatActivityEnterView4.W0) {
                        h12 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (h12 < AndroidUtilities.dp(200.0f)) {
                        chatActivityEnterView4.f23995u0 = new le(chatActivityEnterView4, 4);
                        chatActivityEnterView4.N();
                        return;
                    }
                } else {
                    f7 = 20.0f;
                }
                if (chatActivityEnterView4.Z2.P() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    hf hfVar = chatActivityEnterView4.f23973q0;
                    if (hfVar != null) {
                        hfVar.f21408e = false;
                        hfVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f23951l5) {
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
                    if (peer2 == null && chatActivityEnterView4.Z2.P() != null && !chatActivityEnterView4.Z2.P().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Z2.P().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.f23951l5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        znVar4.getParentLayout().getOverlayContainerView();
                    }
                    hf hfVar2 = new hf(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Z2.P(), new ai.r5(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f23973q0 = hfVar2;
                    hfVar2.f21408e = true;
                    hfVar2.f21407c = 220;
                    hfVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f23973q0.setClippingEnabled(true);
                    chatActivityEnterView4.f23973q0.setFocusable(true);
                    chatActivityEnterView4.f23973q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f23973q0.setInputMethodMode(2);
                    chatActivityEnterView4.f23973q0.setSoftInputMode(0);
                    chatActivityEnterView4.f23973q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f23973q0.f21406b = false;
                    int i21 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && znVar4 != null) {
                        znVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i21;
                    } else {
                        i11 = i21;
                    }
                    int h13 = chatActivityEnterView4.Z2.h1();
                    int measuredHeight = chatActivityEnterView4.f23973q0.getContentView().getMeasuredHeight();
                    int v9 = chatActivityEnterView4.Z2.v();
                    if (v9 <= AndroidUtilities.dp(f7)) {
                        h13 += v9;
                    }
                    if (chatActivityEnterView4.W0) {
                        h13 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(f10);
                    int i22 = (i21 * 2) + h13;
                    if (znVar4 != null && znVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i22 - i12) - chatActivityEnterView4.f23973q0.f25063p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i21) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (znVar4 != null && znVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f23973q0.f25062o.getLayoutParams().height = ((h13 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    hf hfVar3 = chatActivityEnterView4.f23973q0;
                    View view2 = hfVar3.f25068u;
                    rm0 rm0Var = hfVar3.v;
                    TLRPC.Peer peer5 = hfVar3.f25065r;
                    vp0 vp0Var = hfVar3.f25062o;
                    ai.f0 f0Var = hfVar3.f25067t;
                    int i23 = 1;
                    ArrayList arrayList2 = hfVar3.f25072z;
                    int size = arrayList2.size();
                    int i24 = 0;
                    while (i24 < size) {
                        Object obj = arrayList2.get(i24);
                        i24++;
                        ((o1.k) obj).c();
                    }
                    arrayList2.clear();
                    f0Var.setPivotX(AndroidUtilities.dp(8.0f));
                    f0Var.setPivotY(f0Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                    vp0Var.setPivotX(0.0f);
                    vp0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = hfVar3.f25066s.peers;
                    if (peer5 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        i15 = 2;
                        int i25 = 0;
                        while (i25 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i25).peer;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            rm0 rm0Var2 = rm0Var;
                            long j11 = peer6.channel_id;
                            if (j11 == 0 || j11 != peer5.channel_id) {
                                long j12 = peer6.user_id;
                                if (j12 == 0 || j12 != peer5.user_id) {
                                    long j13 = peer6.chat_id;
                                    if (j13 == 0 || j13 != peer5.chat_id) {
                                        i25++;
                                        rm0Var = rm0Var2;
                                        arrayList3 = arrayList4;
                                        f10 = 1.0f;
                                    }
                                }
                            }
                            if (i25 != arrayList4.size() - 1 && rm0Var2.getMeasuredHeight() < size2) {
                                i16 = rm0Var2.getMeasuredHeight() % dp;
                            } else {
                                i16 = 0;
                            }
                            hfVar3.f25069w.h1(i25, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + i16);
                            if (rm0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(f10).setDuration(150L).start();
                            }
                        }
                    } else {
                        i15 = 2;
                    }
                    f0Var.setScaleX(0.25f);
                    f0Var.setScaleY(0.25f);
                    vp0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(f0Var, o1.h.f17007o);
                    kVar.f17024u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    kVar.b(new sp0(hfVar3, i15));
                    o1.k kVar2 = new o1.k(f0Var, o1.h.f17008p);
                    kVar2.f17024u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    kVar2.b(new sp0(hfVar3, 3));
                    o1.c cVar = o1.h.f17012t;
                    o1.k kVar3 = new o1.k(f0Var, cVar);
                    kVar3.f17024u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(vp0Var, cVar);
                    kVar4.f17024u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new tp0(hfVar3, kVar5, i23));
                        kVar5.h();
                        i23 = 1;
                    }
                    hf hfVar4 = chatActivityEnterView4.f23973q0;
                    chatActivityEnterView4.f23985s0 = i11;
                    chatActivityEnterView4.f23990t0 = i14;
                    hfVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f23968p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i26 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.b0();
                return;
            case 18:
                org.telegram.ui.ActionBar.o1 o1Var2 = chatActivityEnterView.U;
                if ((o1Var2 == null || !o1Var2.f21448f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.F2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.o1 o1Var3 = chatActivityEnterView.U;
                if ((o1Var3 == null || !o1Var3.f21448f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.w1();
                    return;
                }
                return;
            default:
                int i27 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.H0();
                return;
        }
    }
}
