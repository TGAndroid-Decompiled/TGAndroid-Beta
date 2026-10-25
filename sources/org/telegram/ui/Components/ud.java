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
    public final int f33376a;
    public final ChatActivityEnterView f33377b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33376a = i10;
        this.f33377b = chatActivityEnterView;
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
        org.telegram.ui.un unVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r92;
        TLRPC.Peer peer;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f33376a;
        ChatActivityEnterView chatActivityEnterView = this.f33377b;
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
                if (mfVar == null || mfVar.f41920p0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f25958t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f25875f0 == null) {
                        chatActivityEnterView.Q0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                og ogVar2 = chatActivityEnterView.Z2;
                if (ogVar2 != null) {
                    ogVar2.z0();
                    return;
                }
                return;
            case 3:
                int i17 = ChatActivityEnterView.f25841r5;
                if (chatActivityEnterView.f25851b2 != null) {
                    if (chatActivityEnterView.f25856c0 - chatActivityEnterView.f25862d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f25849b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f25849b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    jg u10 = chatActivityEnterView.u();
                    chatActivityEnterView.f25858c2 = u10;
                    jg.z d = jg.z.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f25851b2.link;
                    String str3 = u10.f29640a;
                    ArrayList<TLRPC.MessageEntity> arrayList = u10.f29641b;
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
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (ogVar = chatActivityEnterView.Z2) != null) {
                    ogVar.j1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f25908k3) {
                    if (!chatActivityEnterView.f25990z2 || (pfVar = chatActivityEnterView.E0) == null || !pfVar.isFocused()) {
                        if (chatActivityEnterView.f25991z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                chatActivityEnterView.j1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.B();
                                if (chatActivityEnterView.y3) {
                                    chatActivityEnterView.G(true);
                                }
                                z10 = true;
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
                            chatActivityEnterView.k1(chatActivityEnterView.f25991z3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f25958t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    gl0 gl0Var = chatActivityEnterView.f25888h1;
                    if (gl0Var != null) {
                        gl0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f25871e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        og ogVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ogVar3.P1(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f25865d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f25859c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            ic.a.w(chatActivityEnterView.f25859c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f25859c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j11 = chatActivityEnterView.Q2;
                    org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                    if (unVar2 != null && unVar2.f44419t4) {
                        j10 = unVar2.b();
                    } else {
                        j10 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f25894i1 = 0L;
                    chatActivityEnterView.l0(false);
                    chatActivityEnterView.G(true);
                    return;
                }
                return;
            case 7:
                hi.i0 i0Var = chatActivityEnterView.f25911l0;
                boolean z16 = i0Var.v;
                i0Var.setOpened(!z16);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.g0()) {
                    if (!z16) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.J0();
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 13), 275L);
                        chatActivityEnterView.j0(false);
                        return;
                    }
                    return;
                } else if (!z16) {
                    if (chatActivityEnterView.m0 == null) {
                        nf nfVar = new nf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = nfVar;
                        bi.r1 r1Var = nfVar.f12949c;
                        chatActivityEnterView.getContext();
                        r1Var.setLayoutManager(new s4.c0());
                        bi.r1 r1Var2 = chatActivityEnterView.m0.f12949c;
                        ?? h0Var = new s4.h0();
                        h0Var.f13005c = new ArrayList();
                        h0Var.d = new ArrayList();
                        h0Var.e = new ArrayList();
                        chatActivityEnterView.f25921n0 = h0Var;
                        r1Var2.setAdapter(h0Var);
                        chatActivityEnterView.m0.f12949c.setOnItemClickListener(new of(chatActivityEnterView));
                        chatActivityEnterView.m0.f12949c.setOnItemLongClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f25915m1.addView(chatActivityEnterView.m0, gb1.i(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.f25854b5;
                        if (hVar != null) {
                            chatActivityEnterView.f25921n0.E(hVar);
                        }
                        chatActivityEnterView.z1();
                    }
                    nf nfVar2 = chatActivityEnterView.m0;
                    if (nfVar2.getVisibility() != 0) {
                        nfVar2.setVisibility(0);
                        nfVar2.f12949c.v0(0);
                        nfVar2.f12951n = true;
                        nfVar2.f12950f = false;
                        return;
                    } else if (nfVar2.f12950f) {
                        nfVar2.f12950f = false;
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
                if (ogVar4 != null && !ogVar4.f()) {
                    og ogVar5 = chatActivityEnterView.Z2;
                    wg wgVar = chatActivityEnterView.F0;
                    ogVar5.e1(wgVar, wgVar.f34431a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                if (BirthdayController.isToday(chatActivityEnterView.P2.f44334m8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + unVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + unVar.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + unVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f44334m8 == null || !chatActivityEnterView.getParentFragment().f44334m8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i18 = chatActivityEnterView.getParentFragment().i();
                if (i18 != null) {
                    if (chatActivityEnterView.getParentFragment().f44334m8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f44334m8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(chatActivityEnterView.getContext(), 3, null);
                    e2Var.r(200L);
                    e2Var.setOnCancelListener(new bi.f0(chatActivityEnterView, vg.s.j(chatActivityEnterView.Q, null, new di.k3(chatActivityEnterView, e2Var, i18, z11)), 4));
                    return;
                }
                return;
            case 10:
                int i19 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.H0();
                return;
            case 11:
                lf lfVar = chatActivityEnterView.N0;
                if (lfVar != null && lfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new jg.s0(chatActivityEnterView, 17), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f33377b;
                lf lfVar2 = chatActivityEnterView2.N0;
                if (lfVar2 != null && lfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f33377b;
                lf lfVar3 = chatActivityEnterView3.N0;
                if (lfVar3 != null && lfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.q1 q1Var = chatActivityEnterView.U;
                if (q1Var == null || !q1Var.f22965f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.r1();
                        return;
                    } else if (chatActivityEnterView.q0() && chatActivityEnterView.f25877f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z15 = false;
                            chatActivityEnterView.j1(0, true);
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
                        if (chatActivityEnterView.f25991z3) {
                            chatActivityEnterView.k1(z15, true, z15, true);
                            chatActivityEnterView.f25913l3 = true;
                            AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 22), 200L);
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
                        org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
                        if (unVar3 != null) {
                            fi.v3 v3Var = unVar3.K1;
                            if (v3Var != null) {
                                if (v3Var.V) {
                                    v3Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            unVar3.K1 = null;
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
                    chatActivityEnterView.U0.t(false);
                    pf pfVar5 = chatActivityEnterView.E0;
                    if (pfVar5 != null) {
                        pfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f25923n2 != null) {
                    if (chatActivityEnterView.q0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f25877f2 == 1) {
                            if (chatActivityEnterView.q0() && chatActivityEnterView.f25877f2 == 1) {
                                chatActivityEnterView.q1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.q1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.f25935p2) {
                    chatActivityEnterView.setFieldText("/");
                    pf pfVar6 = chatActivityEnterView.E0;
                    if (pfVar6 != null) {
                        pfVar6.requestFocus();
                    }
                    chatActivityEnterView.F0();
                }
                if (chatActivityEnterView.f25991z3) {
                    chatActivityEnterView.k1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f33377b;
                org.telegram.ui.un unVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.f25938p5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.q0()) {
                    chatActivityEnterView4.f25945r0 = new ie(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f25938p5) {
                        chatActivityEnterView4.k0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.k0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.g() > AndroidUtilities.dp(20.0f)) {
                    int N0 = chatActivityEnterView4.Z2.N0();
                    int g7 = chatActivityEnterView4.Z2.g();
                    if (g7 <= AndroidUtilities.dp(20.0f)) {
                        N0 += g7;
                    }
                    if (chatActivityEnterView4.W0) {
                        N0 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (N0 < AndroidUtilities.dp(200.0f)) {
                        chatActivityEnterView4.f25961u0 = new ie(chatActivityEnterView4, 4);
                        chatActivityEnterView4.M();
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.B() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    ef efVar = chatActivityEnterView4.f25939q0;
                    if (efVar != null) {
                        efVar.e = false;
                        efVar.l(new o1.j[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f25938p5) {
                        peer2 = chatActivityEnterView4.Z2.k();
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
                    if (peer2 == null && chatActivityEnterView4.Z2.B() != null && !chatActivityEnterView4.Z2.B().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Z2.B().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.f25938p5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        unVar4.getParentLayout().getOverlayContainerView();
                    }
                    ef efVar2 = new ef(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Z2.B(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, 23), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f25939q0 = efVar2;
                    efVar2.e = true;
                    efVar2.f22907c = 220;
                    efVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f25939q0.setClippingEnabled(true);
                    chatActivityEnterView4.f25939q0.setFocusable(true);
                    chatActivityEnterView4.f25939q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f25939q0.setInputMethodMode(2);
                    chatActivityEnterView4.f25939q0.setSoftInputMode(0);
                    chatActivityEnterView4.f25939q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f25939q0.f22906b = false;
                    int i20 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && unVar4 != null) {
                        unVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i20;
                    } else {
                        i11 = i20;
                    }
                    int N02 = chatActivityEnterView4.Z2.N0();
                    int measuredHeight = chatActivityEnterView4.f25939q0.getContentView().getMeasuredHeight();
                    int g10 = chatActivityEnterView4.Z2.g();
                    if (g10 <= AndroidUtilities.dp(20.0f)) {
                        N02 += g10;
                    }
                    if (chatActivityEnterView4.W0) {
                        N02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(1.0f);
                    int i21 = (i20 * 2) + N02;
                    if (unVar4 != null && unVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i21 - i12) - chatActivityEnterView4.f25939q0.f26939p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i20) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (unVar4 != null && unVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f25939q0.f26938o.getLayoutParams().height = ((N02 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    ef efVar3 = chatActivityEnterView4.f25939q0;
                    View view2 = efVar3.f26944u;
                    mm0 mm0Var = efVar3.v;
                    TLRPC.Peer peer5 = efVar3.f26941r;
                    vp0 vp0Var = efVar3.f26938o;
                    bh.r rVar = efVar3.f26943t;
                    int i22 = 1;
                    ArrayList arrayList2 = efVar3.f26948z;
                    int size = arrayList2.size();
                    int i23 = 0;
                    while (i23 < size) {
                        Object obj = arrayList2.get(i23);
                        i23++;
                        ((o1.j) obj).c();
                    }
                    arrayList2.clear();
                    rVar.setPivotX(AndroidUtilities.dp(8.0f));
                    rVar.setPivotY(rVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                    vp0Var.setPivotX(0.0f);
                    vp0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = efVar3.f26942s.peers;
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
                            if (i24 != arrayList4.size() - 1 && mm0Var.getMeasuredHeight() < size2) {
                                i15 = mm0Var.getMeasuredHeight() % i25;
                            } else {
                                i15 = 0;
                            }
                            efVar3.f26945w.h1(i24, (size2 - ((arrayList4.size() - 2) * i25)) + AndroidUtilities.dp(7.0f) + i15);
                            if (mm0Var.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    }
                    rVar.setScaleX(0.25f);
                    rVar.setScaleY(0.25f);
                    vp0Var.setAlpha(0.25f);
                    o1.j jVar = new o1.j(rVar, o1.h.f18954o);
                    jVar.f18969u = org.telegram.ui.d3.l(1.0f, 750.0f, 1.0f);
                    jVar.b(new sp0(efVar3, 2));
                    o1.j jVar2 = new o1.j(rVar, o1.h.f18955p);
                    jVar2.f18969u = org.telegram.ui.d3.l(1.0f, 750.0f, 1.0f);
                    jVar2.b(new sp0(efVar3, 3));
                    o1.c cVar = o1.h.f18959t;
                    o1.j jVar3 = new o1.j(rVar, cVar);
                    jVar3.f18969u = org.telegram.ui.d3.l(1.0f, 750.0f, 1.0f);
                    o1.j jVar4 = new o1.j(vp0Var, cVar);
                    jVar4.f18969u = org.telegram.ui.d3.l(1.0f, 750.0f, 1.0f);
                    for (o1.j jVar5 : Arrays.asList(jVar, jVar2, jVar3, jVar4)) {
                        arrayList2.add(jVar5);
                        jVar5.a(new tp0(efVar3, jVar5, i22));
                        jVar5.h();
                        i22 = 1;
                    }
                    ef efVar4 = chatActivityEnterView4.f25939q0;
                    chatActivityEnterView4.f25951s0 = i11;
                    chatActivityEnterView4.f25956t0 = i14;
                    efVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f25933p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i26 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.a0();
                return;
            case 18:
                org.telegram.ui.ActionBar.q1 q1Var2 = chatActivityEnterView.U;
                if ((q1Var2 == null || !q1Var2.f22965f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.c2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.q1 q1Var3 = chatActivityEnterView.U;
                if ((q1Var3 == null || !q1Var3.f22965f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.a1();
                    return;
                }
                return;
            default:
                int i27 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.H0();
                return;
        }
    }
}
