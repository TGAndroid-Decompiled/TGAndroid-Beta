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
public final class td implements View.OnClickListener {
    public final int f30504a;
    public final ChatActivityEnterView f30505b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30504a = i10;
        this.f30505b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        og ogVar;
        boolean z10;
        dg dgVar;
        pf pfVar;
        long j10;
        int i10;
        org.telegram.ui.qn qnVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r10;
        TLRPC.Peer peer;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f30504a;
        ChatActivityEnterView chatActivityEnterView = this.f30505b;
        switch (i16) {
            case 0:
                pf pfVar2 = chatActivityEnterView.E0;
                if (pfVar2 == null) {
                    str = "";
                } else {
                    str = pfVar2.getText().toString();
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
                mf mfVar = chatActivityEnterView.L0;
                if (mfVar == null || mfVar.f39274p0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f24022t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f23942f0 == null) {
                        chatActivityEnterView.Q0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                og ogVar2 = chatActivityEnterView.Z2;
                if (ogVar2 != null) {
                    ogVar2.H0();
                    return;
                }
                return;
            case 3:
                int i17 = ChatActivityEnterView.f23908n5;
                if (chatActivityEnterView.f23918b2 != null) {
                    if (chatActivityEnterView.f23923c0 - chatActivityEnterView.f23929d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f23916b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f23916b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    jg w9 = chatActivityEnterView.w();
                    chatActivityEnterView.f23925c2 = w9;
                    ig.y d = ig.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f23918b2.link;
                    String str3 = w9.f27524a;
                    ArrayList<TLRPC.MessageEntity> arrayList = w9.f27525b;
                    rd rdVar = new rd(chatActivityEnterView, 14);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, rdVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (ogVar = chatActivityEnterView.Z2) != null) {
                    ogVar.u1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f23975k3) {
                    if (!chatActivityEnterView.f24054z2 || (pfVar = chatActivityEnterView.E0) == null || !pfVar.isFocused()) {
                        if (chatActivityEnterView.f24055z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                z10 = true;
                                chatActivityEnterView.j1(0, true);
                                chatActivityEnterView.U0.u(true);
                                chatActivityEnterView.U0.B();
                                if (chatActivityEnterView.y3) {
                                    chatActivityEnterView.I(true);
                                }
                            } else {
                                if (!chatActivityEnterView.E3 && (dgVar = chatActivityEnterView.U0) != null) {
                                    dgVar.O(false);
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
                            chatActivityEnterView.k1(chatActivityEnterView.f24055z3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f24022t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    el0 el0Var = chatActivityEnterView.f23955h1;
                    if (el0Var != null) {
                        el0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f23938e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        og ogVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ogVar3.a2(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f23932d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f23926c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            i2.e.v(chatActivityEnterView.f23926c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f23926c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j11 = chatActivityEnterView.Q2;
                    org.telegram.ui.qn qnVar2 = chatActivityEnterView.P2;
                    if (qnVar2 != null && qnVar2.f40705h4) {
                        j10 = qnVar2.d();
                    } else {
                        j10 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f23961i1 = 0L;
                    chatActivityEnterView.m0(false);
                    chatActivityEnterView.I(true);
                    return;
                }
                return;
            case 7:
                gi.b0 b0Var = chatActivityEnterView.f23978l0;
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
                        AndroidUtilities.runOnUIThread(new rd(chatActivityEnterView, 13), 275L);
                        chatActivityEnterView.k0(false);
                        return;
                    }
                    return;
                } else if (!z16) {
                    if (chatActivityEnterView.m0 == null) {
                        nf nfVar = new nf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = nfVar;
                        ai.u1 u1Var = nfVar.f11534c;
                        chatActivityEnterView.getContext();
                        u1Var.setLayoutManager(new s4.b0());
                        ai.u1 u1Var2 = chatActivityEnterView.m0.f11534c;
                        ?? g0Var = new s4.g0();
                        g0Var.f11066c = new ArrayList();
                        g0Var.d = new ArrayList();
                        g0Var.e = new ArrayList();
                        chatActivityEnterView.f23988n0 = g0Var;
                        u1Var2.setAdapter(g0Var);
                        chatActivityEnterView.m0.f11534c.setOnItemClickListener(new of(chatActivityEnterView));
                        chatActivityEnterView.m0.f11534c.setOnItemLongClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f23982m1.addView(chatActivityEnterView.m0, w7.z5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.X4;
                        if (hVar != null) {
                            chatActivityEnterView.f23988n0.E(hVar);
                        }
                        chatActivityEnterView.z1();
                    }
                    nf nfVar2 = chatActivityEnterView.m0;
                    if (nfVar2.getVisibility() != 0) {
                        nfVar2.setVisibility(0);
                        nfVar2.f11534c.u0(0);
                        nfVar2.f11536n = true;
                        nfVar2.f11535f = false;
                        return;
                    } else if (nfVar2.f11535f) {
                        nfVar2.f11535f = false;
                        nfVar2.a();
                        nfVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    nf nfVar3 = chatActivityEnterView.m0;
                    if (nfVar3 != null) {
                        nfVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                og ogVar4 = chatActivityEnterView.Z2;
                if (ogVar4 != null && !ogVar4.o()) {
                    og ogVar5 = chatActivityEnterView.Z2;
                    wg wgVar = chatActivityEnterView.F0;
                    ogVar5.o1(wgVar, wgVar.f32099a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                if (BirthdayController.isToday(chatActivityEnterView.P2.f40619a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + qnVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + qnVar.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + qnVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f40619a8 == null || !chatActivityEnterView.getParentFragment().f40619a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i18 = chatActivityEnterView.getParentFragment().i();
                if (i18 != null) {
                    if (chatActivityEnterView.getParentFragment().f40619a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f40619a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.r(200L);
                    b2Var.setOnCancelListener(new ai.e0(chatActivityEnterView, ug.r.j(chatActivityEnterView.Q, null, new ci.l3(chatActivityEnterView, b2Var, i18, z11)), 4));
                    return;
                }
                return;
            case 10:
                int i19 = ChatActivityEnterView.f23908n5;
                chatActivityEnterView.H0();
                return;
            case 11:
                lf lfVar = chatActivityEnterView.N0;
                if (lfVar != null && lfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                f5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new ki.t1(chatActivityEnterView, 13), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f30505b;
                lf lfVar2 = chatActivityEnterView2.N0;
                if (lfVar2 != null && lfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f30505b;
                lf lfVar3 = chatActivityEnterView3.N0;
                if (lfVar3 != null && lfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.o1 o1Var = chatActivityEnterView.U;
                if (o1Var == null || !o1Var.f21636f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.r1();
                        return;
                    } else if (chatActivityEnterView.r0() && chatActivityEnterView.f23944f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z15 = false;
                            chatActivityEnterView.j1(0, true);
                            dg dgVar2 = chatActivityEnterView.U0;
                            if (dgVar2 != null) {
                                dgVar2.u(false);
                            }
                            pf pfVar3 = chatActivityEnterView.E0;
                            if (pfVar3 != null) {
                                pfVar3.requestFocus();
                            }
                        } else {
                            z15 = false;
                        }
                        if (chatActivityEnterView.f24055z3) {
                            chatActivityEnterView.k1(z15, true, z15, true);
                            chatActivityEnterView.f23980l3 = true;
                            AndroidUtilities.runOnUIThread(new rd(chatActivityEnterView, 22), 200L);
                            return;
                        }
                        chatActivityEnterView.G0();
                        return;
                    } else {
                        chatActivityEnterView.q1(1, 0, true, true);
                        dg dgVar3 = chatActivityEnterView.U0;
                        pf pfVar4 = chatActivityEnterView.E0;
                        if (pfVar4 != null && pfVar4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.qn qnVar3 = chatActivityEnterView.P2;
                        if (qnVar3 != null) {
                            ei.x3 x3Var = qnVar3.f40916y1;
                            if (x3Var != null) {
                                if (x3Var.V) {
                                    x3Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            qnVar3.f40916y1 = null;
                            if (z14) {
                                z13 = true;
                                dgVar3.C(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        dgVar3.C(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.j1(0, false);
                    chatActivityEnterView.U0.u(false);
                    pf pfVar5 = chatActivityEnterView.E0;
                    if (pfVar5 != null) {
                        pfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f23990n2 != null) {
                    if (chatActivityEnterView.r0()) {
                        r10 = 1;
                        if (chatActivityEnterView.f23944f2 == 1) {
                            if (chatActivityEnterView.r0() && chatActivityEnterView.f23944f2 == 1) {
                                chatActivityEnterView.q1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.q1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.f24000p2) {
                    chatActivityEnterView.setFieldText("/");
                    pf pfVar6 = chatActivityEnterView.E0;
                    if (pfVar6 != null) {
                        pfVar6.requestFocus();
                    }
                    chatActivityEnterView.F0();
                }
                if (chatActivityEnterView.f24055z3) {
                    chatActivityEnterView.k1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f30505b;
                org.telegram.ui.qn qnVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.f23981l5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.r0()) {
                    chatActivityEnterView4.f24009r0 = new ie(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f23981l5) {
                        chatActivityEnterView4.l0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.l0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.u() > AndroidUtilities.dp(20.0f)) {
                    int Y0 = chatActivityEnterView4.Z2.Y0();
                    int u10 = chatActivityEnterView4.Z2.u();
                    if (u10 <= AndroidUtilities.dp(20.0f)) {
                        Y0 += u10;
                    }
                    if (chatActivityEnterView4.W0) {
                        Y0 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (Y0 < AndroidUtilities.dp(200.0f)) {
                        chatActivityEnterView4.f24025u0 = new ie(chatActivityEnterView4, 4);
                        chatActivityEnterView4.N();
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.O() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    ef efVar = chatActivityEnterView4.f24003q0;
                    if (efVar != null) {
                        efVar.e = false;
                        efVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f23981l5) {
                        peer2 = chatActivityEnterView4.Z2.x();
                        chatFull = null;
                    } else {
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
                    if (peer2 == null && chatActivityEnterView4.Z2.O() != null && !chatActivityEnterView4.Z2.O().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Z2.O().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.f23981l5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        qnVar4.getParentLayout().getOverlayContainerView();
                    }
                    ef efVar2 = new ef(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Z2.O(), new ai.u2(chatActivityEnterView4, chatFull, messagesController, 23), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f24003q0 = efVar2;
                    efVar2.e = true;
                    efVar2.f21577c = 220;
                    efVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f24003q0.setClippingEnabled(true);
                    chatActivityEnterView4.f24003q0.setFocusable(true);
                    chatActivityEnterView4.f24003q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f24003q0.setInputMethodMode(2);
                    chatActivityEnterView4.f24003q0.setSoftInputMode(0);
                    chatActivityEnterView4.f24003q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f24003q0.f21576b = false;
                    int i20 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && qnVar4 != null) {
                        qnVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i20;
                    } else {
                        i11 = i20;
                    }
                    int Y02 = chatActivityEnterView4.Z2.Y0();
                    int measuredHeight = chatActivityEnterView4.f24003q0.getContentView().getMeasuredHeight();
                    int u11 = chatActivityEnterView4.Z2.u();
                    if (u11 <= AndroidUtilities.dp(20.0f)) {
                        Y02 += u11;
                    }
                    if (chatActivityEnterView4.W0) {
                        Y02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(1.0f);
                    int i21 = (i20 * 2) + Y02;
                    if (qnVar4 != null && qnVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i21 - i12) - chatActivityEnterView4.f24003q0.f30330p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i20) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (qnVar4 != null && qnVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f24003q0.f30329o.getLayoutParams().height = ((Y02 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    ef efVar3 = chatActivityEnterView4.f24003q0;
                    View view2 = efVar3.f30335u;
                    jm0 jm0Var = efVar3.v;
                    TLRPC.Peer peer5 = efVar3.f30332r;
                    mp0 mp0Var = efVar3.f30329o;
                    ah.x xVar = efVar3.f30334t;
                    int i22 = 1;
                    ArrayList arrayList2 = efVar3.f30339z;
                    int size = arrayList2.size();
                    int i23 = 0;
                    while (i23 < size) {
                        Object obj = arrayList2.get(i23);
                        i23++;
                        ((o1.k) obj).c();
                    }
                    arrayList2.clear();
                    xVar.setPivotX(AndroidUtilities.dp(8.0f));
                    xVar.setPivotY(xVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                    mp0Var.setPivotX(0.0f);
                    mp0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = efVar3.f30333s.peers;
                    if (peer5 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        int i24 = 0;
                        while (i24 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i24).peer;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            int i25 = dp;
                            long j12 = peer6.channel_id;
                            if (j12 == 0 || j12 != peer5.channel_id) {
                                long j13 = peer6.user_id;
                                if (j13 == 0 || j13 != peer5.user_id) {
                                    long j14 = peer6.chat_id;
                                    if (j14 == 0 || j14 != peer5.chat_id) {
                                        i24++;
                                        arrayList3 = arrayList4;
                                        dp = i25;
                                    }
                                }
                            }
                            if (i24 != arrayList4.size() - 1 && jm0Var.getMeasuredHeight() < size2) {
                                i15 = jm0Var.getMeasuredHeight() % i25;
                            } else {
                                i15 = 0;
                            }
                            efVar3.f30336w.h1(i24, (size2 - ((arrayList4.size() - 2) * i25)) + AndroidUtilities.dp(7.0f) + i15);
                            if (jm0Var.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    }
                    xVar.setScaleX(0.25f);
                    xVar.setScaleY(0.25f);
                    mp0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(xVar, o1.h.f17543o);
                    kVar.f17559u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                    kVar.b(new jp0(efVar3, 2));
                    o1.k kVar2 = new o1.k(xVar, o1.h.f17544p);
                    kVar2.f17559u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                    kVar2.b(new jp0(efVar3, 3));
                    o1.c cVar = o1.h.f17548t;
                    o1.k kVar3 = new o1.k(xVar, cVar);
                    kVar3.f17559u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(mp0Var, cVar);
                    kVar4.f17559u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new kp0(efVar3, kVar5, i22));
                        kVar5.h();
                        i22 = 1;
                    }
                    ef efVar4 = chatActivityEnterView4.f24003q0;
                    chatActivityEnterView4.f24015s0 = i11;
                    chatActivityEnterView4.f24020t0 = i14;
                    efVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f23998p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i26 = ChatActivityEnterView.f23908n5;
                chatActivityEnterView.b0();
                return;
            case 18:
                org.telegram.ui.ActionBar.o1 o1Var2 = chatActivityEnterView.U;
                if ((o1Var2 == null || !o1Var2.f21636f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.q2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.o1 o1Var3 = chatActivityEnterView.U;
                if ((o1Var3 == null || !o1Var3.f21636f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.l1();
                    return;
                }
                return;
            default:
                int i27 = ChatActivityEnterView.f23908n5;
                chatActivityEnterView.H0();
                return;
        }
    }
}
