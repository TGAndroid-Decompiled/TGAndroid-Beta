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
public final class ud implements View.OnClickListener {
    public final int f28713a;
    public final ChatActivityEnterView f28714b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28713a = i10;
        this.f28714b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        ng ngVar;
        boolean z10;
        dg dgVar;
        pf pfVar;
        long j3;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r62;
        float f7;
        TLRPC.Peer peer;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f28713a;
        ChatActivityEnterView chatActivityEnterView = this.f28714b;
        switch (i15) {
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
                if (mfVar == null || mfVar.f33098q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f22080t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f22001f0 == null) {
                        chatActivityEnterView.S0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ng ngVar2 = chatActivityEnterView.Z2;
                if (ngVar2 != null) {
                    ngVar2.K0();
                    return;
                }
                return;
            case 3:
                int i16 = ChatActivityEnterView.f21967n5;
                if (chatActivityEnterView.f21977b2 != null) {
                    if (chatActivityEnterView.f21982c0 - chatActivityEnterView.f21988d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f21975b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f21975b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    jg x10 = chatActivityEnterView.x();
                    chatActivityEnterView.f21984c2 = x10;
                    hg.y d = hg.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f21977b2.link;
                    String str3 = x10.f25375a;
                    ArrayList<TLRPC.MessageEntity> arrayList = x10.f25376b;
                    sd sdVar = new sd(chatActivityEnterView, 14);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, sdVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (ngVar = chatActivityEnterView.Z2) != null) {
                    ngVar.A1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f22033k3) {
                    if (!chatActivityEnterView.f22112z2 || (pfVar = chatActivityEnterView.E0) == null || !pfVar.isFocused()) {
                        if (chatActivityEnterView.f22113z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                z10 = true;
                                chatActivityEnterView.l1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.A();
                                if (chatActivityEnterView.y3) {
                                    chatActivityEnterView.K(true);
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
                            chatActivityEnterView.m1(chatActivityEnterView.f22113z3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f22080t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    tk0 tk0Var = chatActivityEnterView.f22014h1;
                    if (tk0Var != null) {
                        tk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f21997e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        ng ngVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ngVar3.k2(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f21991d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f21985c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            com.google.android.gms.internal.vision.e2.t(chatActivityEnterView.f21985c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f21985c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                    if (znVar != null && znVar.f40355h4) {
                        j3 = znVar.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f22020i1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.K(true);
                    return;
                }
                return;
            case 7:
                ei.c0 c0Var = chatActivityEnterView.f22036l0;
                boolean z16 = c0Var.v;
                c0Var.setOpened(!z16);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.j0()) {
                    if (!z16) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.L0();
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 13), 275L);
                        chatActivityEnterView.m0(false);
                        return;
                    }
                    return;
                } else if (!z16) {
                    if (chatActivityEnterView.m0 == null) {
                        nf nfVar = new nf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = nfVar;
                        ai.w0 w0Var = nfVar.f8739c;
                        chatActivityEnterView.getContext();
                        w0Var.setLayoutManager(new s4.c0());
                        ai.w0 w0Var2 = chatActivityEnterView.m0.f8739c;
                        ?? h0Var = new s4.h0();
                        h0Var.f8241c = new ArrayList();
                        h0Var.d = new ArrayList();
                        h0Var.e = new ArrayList();
                        chatActivityEnterView.f22046n0 = h0Var;
                        w0Var2.setAdapter(h0Var);
                        chatActivityEnterView.m0.f8739c.setOnItemClickListener(new of(chatActivityEnterView));
                        chatActivityEnterView.m0.f8739c.setOnItemLongClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f22040m1.addView(chatActivityEnterView.m0, w7.y5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.X4;
                        if (iVar != null) {
                            chatActivityEnterView.f22046n0.E(iVar);
                        }
                        chatActivityEnterView.B1();
                    }
                    nf nfVar2 = chatActivityEnterView.m0;
                    if (nfVar2.getVisibility() != 0) {
                        nfVar2.setVisibility(0);
                        nfVar2.f8739c.v0(0);
                        nfVar2.f8741n = true;
                        nfVar2.f8740f = false;
                        return;
                    } else if (nfVar2.f8740f) {
                        nfVar2.f8740f = false;
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
                ng ngVar4 = chatActivityEnterView.Z2;
                if (ngVar4 != null && !ngVar4.m()) {
                    ng ngVar5 = chatActivityEnterView.Z2;
                    vg vgVar = chatActivityEnterView.F0;
                    ngVar5.u1(vgVar, vgVar.f29070a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.zn znVar2 = chatActivityEnterView.P2;
                if (BirthdayController.isToday(znVar2.f40270a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + znVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + znVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + znVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f40270a8 == null || !chatActivityEnterView.getParentFragment().f40270a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i17 = chatActivityEnterView.getParentFragment().i();
                if (i17 != null) {
                    if (chatActivityEnterView.getParentFragment().f40270a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f40270a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new org.telegram.ui.ca(chatActivityEnterView, tg.s.j(chatActivityEnterView.Q, null, new ai.t4(chatActivityEnterView, b2Var, i17, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i18 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.J0();
                return;
            case 11:
                lf lfVar = chatActivityEnterView.N0;
                if (lfVar != null && lfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                d5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new o0.b(chatActivityEnterView, 4), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f28714b;
                lf lfVar2 = chatActivityEnterView2.N0;
                if (lfVar2 != null && lfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f28714b;
                lf lfVar3 = chatActivityEnterView3.N0;
                if (lfVar3 != null && lfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.U;
                if (p1Var == null || !p1Var.f19718f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.t1();
                        return;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.f22003f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z15 = false;
                            chatActivityEnterView.l1(0, true);
                            dg dgVar2 = chatActivityEnterView.U0;
                            if (dgVar2 != null) {
                                dgVar2.t(false);
                            }
                            pf pfVar3 = chatActivityEnterView.E0;
                            if (pfVar3 != null) {
                                pfVar3.requestFocus();
                            }
                        } else {
                            z15 = false;
                        }
                        if (chatActivityEnterView.f22113z3) {
                            chatActivityEnterView.m1(z15, true, z15, true);
                            chatActivityEnterView.f22038l3 = true;
                            AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 22), 200L);
                            return;
                        }
                        chatActivityEnterView.I0();
                        return;
                    } else {
                        chatActivityEnterView.s1(1, 0, true, true);
                        dg dgVar3 = chatActivityEnterView.U0;
                        pf pfVar4 = chatActivityEnterView.E0;
                        if (pfVar4 != null && pfVar4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.zn znVar3 = chatActivityEnterView.P2;
                        if (znVar3 != null) {
                            ci.f4 f4Var = znVar3.f40565y1;
                            if (f4Var != null) {
                                if (f4Var.V) {
                                    f4Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            znVar3.f40565y1 = null;
                            if (z14) {
                                z13 = true;
                                dgVar3.B(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        dgVar3.B(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.U0.t(false);
                    pf pfVar5 = chatActivityEnterView.E0;
                    if (pfVar5 != null) {
                        pfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f22048n2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r62 = 1;
                        if (chatActivityEnterView.f22003f2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.f22003f2 == 1) {
                                chatActivityEnterView.s1(0, 1, true, false);
                            }
                        }
                    } else {
                        r62 = 1;
                    }
                    chatActivityEnterView.s1(r62, r62, r62, r62);
                } else if (chatActivityEnterView.f22058p2) {
                    chatActivityEnterView.setFieldText("/");
                    pf pfVar6 = chatActivityEnterView.E0;
                    if (pfVar6 != null) {
                        pfVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.f22113z3) {
                    chatActivityEnterView.m1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f28714b;
                org.telegram.ui.zn znVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.f22039l5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.t0()) {
                    chatActivityEnterView4.f22067r0 = new ie(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f22039l5) {
                        chatActivityEnterView4.n0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.q() > AndroidUtilities.dp(20.0f)) {
                    int c12 = chatActivityEnterView4.Z2.c1();
                    int q6 = chatActivityEnterView4.Z2.q();
                    f7 = 20.0f;
                    if (q6 <= AndroidUtilities.dp(20.0f)) {
                        c12 += q6;
                    }
                    if (chatActivityEnterView4.W0) {
                        c12 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (c12 < AndroidUtilities.dp(200.0f)) {
                        chatActivityEnterView4.f22083u0 = new ie(chatActivityEnterView4, 4);
                        chatActivityEnterView4.P();
                        return;
                    }
                } else {
                    f7 = 20.0f;
                }
                if (chatActivityEnterView4.Z2.J() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    ef efVar = chatActivityEnterView4.f22061q0;
                    if (efVar != null) {
                        efVar.e = false;
                        efVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f22039l5) {
                        peer2 = chatActivityEnterView4.Z2.v();
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
                    if (peer2 == null && chatActivityEnterView4.Z2.J() != null && !chatActivityEnterView4.Z2.J().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Z2.J().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.f22039l5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        znVar4.getParentLayout().getOverlayContainerView();
                    }
                    ef efVar2 = new ef(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Z2.J(), new ai.r5(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f22061q0 = efVar2;
                    efVar2.e = true;
                    efVar2.f19656c = 220;
                    efVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f22061q0.setClippingEnabled(true);
                    chatActivityEnterView4.f22061q0.setFocusable(true);
                    chatActivityEnterView4.f22061q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f22061q0.setInputMethodMode(2);
                    chatActivityEnterView4.f22061q0.setSoftInputMode(0);
                    chatActivityEnterView4.f22061q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f22061q0.f19655b = false;
                    int i19 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && znVar4 != null) {
                        znVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i19;
                    } else {
                        i11 = i19;
                    }
                    int c13 = chatActivityEnterView4.Z2.c1();
                    int measuredHeight = chatActivityEnterView4.f22061q0.getContentView().getMeasuredHeight();
                    int q10 = chatActivityEnterView4.Z2.q();
                    if (q10 <= AndroidUtilities.dp(f7)) {
                        c13 += q10;
                    }
                    if (chatActivityEnterView4.W0) {
                        c13 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(1.0f);
                    int i20 = (i19 * 2) + c13;
                    if (znVar4 != null && znVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i20 - i12) - chatActivityEnterView4.f22061q0.f25787p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i13 = ((iArr[1] - measuredHeight) - i19) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (znVar4 != null && znVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f22061q0.f25786o.getLayoutParams().height = ((c13 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                    }
                    ef efVar3 = chatActivityEnterView4.f22061q0;
                    View view2 = efVar3.f25792u;
                    yl0 yl0Var = efVar3.v;
                    TLRPC.Peer peer5 = efVar3.f25789r;
                    ep0 ep0Var = efVar3.f25786o;
                    ai.f0 f0Var = efVar3.f25791t;
                    ArrayList arrayList2 = efVar3.f25796z;
                    int size = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList2.get(i21);
                        i21++;
                        ((o1.k) obj).c();
                    }
                    arrayList2.clear();
                    f0Var.setPivotX(AndroidUtilities.dp(8.0f));
                    f0Var.setPivotY(f0Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                    ep0Var.setPivotX(0.0f);
                    ep0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = efVar3.f25790s.peers;
                    if (peer5 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                            TLRPC.Peer peer6 = arrayList3.get(i22).peer;
                            long j11 = peer6.channel_id;
                            if (j11 == 0 || j11 != peer5.channel_id) {
                                long j12 = peer6.user_id;
                                if (j12 == 0 || j12 != peer5.user_id) {
                                    long j13 = peer6.chat_id;
                                    if (j13 == 0 || j13 != peer5.chat_id) {
                                    }
                                }
                            }
                            if (i22 != arrayList3.size() - 1 && yl0Var.getMeasuredHeight() < size2) {
                                i14 = yl0Var.getMeasuredHeight() % dp;
                            } else {
                                i14 = 0;
                            }
                            efVar3.f25793w.h1(i22, (size2 - ((arrayList3.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + i14);
                            if (yl0Var.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    }
                    f0Var.setScaleX(0.25f);
                    f0Var.setScaleY(0.25f);
                    ep0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(f0Var, o1.h.f15521o);
                    kVar.f15537u = org.telegram.ui.Cells.c1.m(1.0f, 750.0f, 1.0f);
                    kVar.b(new bp0(efVar3, 2));
                    o1.k kVar2 = new o1.k(f0Var, o1.h.f15522p);
                    kVar2.f15537u = org.telegram.ui.Cells.c1.m(1.0f, 750.0f, 1.0f);
                    kVar2.b(new bp0(efVar3, 3));
                    o1.c cVar = o1.h.f15526t;
                    o1.k kVar3 = new o1.k(f0Var, cVar);
                    kVar3.f15537u = org.telegram.ui.Cells.c1.m(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(ep0Var, cVar);
                    kVar4.f15537u = org.telegram.ui.Cells.c1.m(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new cp0(efVar3, kVar5, 1));
                        kVar5.f();
                    }
                    ef efVar4 = chatActivityEnterView4.f22061q0;
                    chatActivityEnterView4.f22073s0 = i11;
                    chatActivityEnterView4.f22078t0 = i13;
                    efVar4.showAtLocation(view, 51, i11, i13);
                    chatActivityEnterView4.f22056p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i23 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.d0();
                return;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var2 = chatActivityEnterView.U;
                if ((p1Var2 == null || !p1Var2.f19718f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.A2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.U;
                if ((p1Var3 == null || !p1Var3.f19718f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.r1();
                    return;
                }
                return;
            default:
                int i24 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.J0();
                return;
        }
    }
}
