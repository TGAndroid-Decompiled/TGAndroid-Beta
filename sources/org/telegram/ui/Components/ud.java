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
    public final int f28460a;
    public final ChatActivityEnterView f28461b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28460a = i10;
        this.f28461b = chatActivityEnterView;
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
        int i16 = this.f28460a;
        ChatActivityEnterView chatActivityEnterView = this.f28461b;
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
                if (mfVar == null || mfVar.f39016q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f21809s2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f21735f0 == null) {
                        chatActivityEnterView.T0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ng ngVar2 = chatActivityEnterView.Y2;
                if (ngVar2 != null) {
                    ngVar2.J0();
                    return;
                }
                return;
            case 3:
                int i17 = ChatActivityEnterView.f21701n5;
                if (chatActivityEnterView.a2 != null) {
                    if (chatActivityEnterView.f21716c0 - chatActivityEnterView.f21722d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f21709b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f21709b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    jg y3 = chatActivityEnterView.y();
                    chatActivityEnterView.f21711b2 = y3;
                    hg.a0 d = hg.a0.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.a2.link;
                    String str3 = y3.f25302a;
                    ArrayList<TLRPC.MessageEntity> arrayList = y3.f25303b;
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
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (ngVar = chatActivityEnterView.Y2) != null) {
                    ngVar.z1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.j3) {
                    if (!chatActivityEnterView.f21842y2 || (pfVar = chatActivityEnterView.E0) == null || !pfVar.isFocused()) {
                        if (chatActivityEnterView.y3) {
                            if (chatActivityEnterView.Q1 != 0) {
                                z10 = true;
                                chatActivityEnterView.n1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.A();
                                if (chatActivityEnterView.f21837x3) {
                                    chatActivityEnterView.L(true);
                                }
                            } else {
                                if (!chatActivityEnterView.D3 && (dgVar = chatActivityEnterView.U0) != null) {
                                    dgVar.O(false);
                                }
                                z10 = true;
                            }
                        } else {
                            if (!chatActivityEnterView.D3) {
                                z10 = true;
                                chatActivityEnterView.U0.O(true);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.D3) {
                            chatActivityEnterView.o1(chatActivityEnterView.y3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f21809s2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    hk0 hk0Var = chatActivityEnterView.f21748h1;
                    if (hk0Var != null) {
                        hk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f21725d3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.G3);
                        ng ngVar3 = chatActivityEnterView.Y2;
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
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f21719c3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f21712b3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            com.google.android.gms.internal.vision.e2.t(chatActivityEnterView.f21712b3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f21712b3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.P2;
                    org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
                    if (xnVar != null && xnVar.f39400h4) {
                        j3 = xnVar.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f21754i1 = 0L;
                    chatActivityEnterView.p0(false);
                    chatActivityEnterView.L(true);
                    return;
                }
                return;
            case 7:
                ei.c0 c0Var = chatActivityEnterView.f21770l0;
                boolean z16 = c0Var.v;
                c0Var.setOpened(!z16);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.k0()) {
                    if (!z16) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.M0();
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 13), 275L);
                        chatActivityEnterView.n0(false);
                        return;
                    }
                    return;
                } else if (!z16) {
                    if (chatActivityEnterView.m0 == null) {
                        nf nfVar = new nf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = nfVar;
                        ai.w0 w0Var = nfVar.f8723c;
                        chatActivityEnterView.getContext();
                        w0Var.setLayoutManager(new s4.c0());
                        ai.w0 w0Var2 = chatActivityEnterView.m0.f8723c;
                        ?? h0Var = new s4.h0();
                        h0Var.f8225c = new ArrayList();
                        h0Var.d = new ArrayList();
                        h0Var.e = new ArrayList();
                        chatActivityEnterView.f21780n0 = h0Var;
                        w0Var2.setAdapter(h0Var);
                        chatActivityEnterView.m0.f8723c.setOnItemClickListener(new of(chatActivityEnterView));
                        chatActivityEnterView.m0.f8723c.setOnItemLongClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.l1.addView(chatActivityEnterView.m0, w7.x5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.X4;
                        if (iVar != null) {
                            chatActivityEnterView.f21780n0.E(iVar);
                        }
                        chatActivityEnterView.D1();
                    }
                    nf nfVar2 = chatActivityEnterView.m0;
                    if (nfVar2.getVisibility() != 0) {
                        nfVar2.setVisibility(0);
                        nfVar2.f8723c.u0(0);
                        nfVar2.f8725n = true;
                        nfVar2.f8724f = false;
                        return;
                    } else if (nfVar2.f8724f) {
                        nfVar2.f8724f = false;
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
                ng ngVar4 = chatActivityEnterView.Y2;
                if (ngVar4 != null && !ngVar4.m()) {
                    ng ngVar5 = chatActivityEnterView.Y2;
                    vg vgVar = chatActivityEnterView.F0;
                    ngVar5.t1(vgVar, vgVar.f28736a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.xn xnVar2 = chatActivityEnterView.O2;
                if (BirthdayController.isToday(xnVar2.f39316a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + xnVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + xnVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + xnVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f39316a8 == null || !chatActivityEnterView.getParentFragment().f39316a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.J1, false);
                }
                TLRPC.User i18 = chatActivityEnterView.getParentFragment().i();
                if (i18 != null) {
                    if (chatActivityEnterView.getParentFragment().f39316a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f39316a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new org.telegram.ui.ba(chatActivityEnterView, tg.t.j(chatActivityEnterView.Q, null, new ai.t4(chatActivityEnterView, b2Var, i18, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i19 = ChatActivityEnterView.f21701n5;
                chatActivityEnterView.K0();
                return;
            case 11:
                lf lfVar = chatActivityEnterView.N0;
                if (lfVar != null && lfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new k2.b0(chatActivityEnterView, 11), chatActivityEnterView.V3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f28461b;
                lf lfVar2 = chatActivityEnterView2.N0;
                if (lfVar2 != null && lfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.U0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f28461b;
                lf lfVar3 = chatActivityEnterView3.N0;
                if (lfVar3 != null && lfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.U0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.U;
                if (p1Var == null || !p1Var.f19445f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.v1();
                        return;
                    } else if (chatActivityEnterView.u0() && chatActivityEnterView.f21730e2 == 0) {
                        if (chatActivityEnterView.Q1 != 0) {
                            z15 = false;
                            chatActivityEnterView.n1(0, true);
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
                        if (chatActivityEnterView.y3) {
                            chatActivityEnterView.o1(z15, true, z15, true);
                            chatActivityEnterView.f21767k3 = true;
                            AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 22), 200L);
                            return;
                        }
                        chatActivityEnterView.J0();
                        return;
                    } else {
                        chatActivityEnterView.u1(1, 0, true, true);
                        dg dgVar3 = chatActivityEnterView.U0;
                        pf pfVar4 = chatActivityEnterView.E0;
                        if (pfVar4 != null && pfVar4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.xn xnVar3 = chatActivityEnterView.O2;
                        if (xnVar3 != null) {
                            ci.e4 e4Var = xnVar3.f39610y1;
                            if (e4Var != null) {
                                if (e4Var.V) {
                                    e4Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            xnVar3.f39610y1 = null;
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
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.n1(0, false);
                    chatActivityEnterView.U0.t(false);
                    pf pfVar5 = chatActivityEnterView.E0;
                    if (pfVar5 != null) {
                        pfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f21775m2 != null) {
                    if (chatActivityEnterView.u0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f21730e2 == 1) {
                            if (chatActivityEnterView.u0() && chatActivityEnterView.f21730e2 == 1) {
                                chatActivityEnterView.u1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.u1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.f21787o2) {
                    chatActivityEnterView.setFieldText("/");
                    pf pfVar6 = chatActivityEnterView.E0;
                    if (pfVar6 != null) {
                        pfVar6.requestFocus();
                    }
                    chatActivityEnterView.I0();
                }
                if (chatActivityEnterView.y3) {
                    chatActivityEnterView.o1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f28461b;
                org.telegram.ui.xn xnVar4 = chatActivityEnterView4.O2;
                if (!chatActivityEnterView4.f21773l5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.u0()) {
                    chatActivityEnterView4.f21801r0 = new ie(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f21773l5) {
                        chatActivityEnterView4.o0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.o0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Y2.q() > AndroidUtilities.dp(20.0f)) {
                    int b12 = chatActivityEnterView4.Y2.b1();
                    int q6 = chatActivityEnterView4.Y2.q();
                    f7 = 20.0f;
                    if (q6 <= AndroidUtilities.dp(20.0f)) {
                        b12 += q6;
                    }
                    if (chatActivityEnterView4.W0) {
                        b12 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (b12 < AndroidUtilities.dp(200.0f)) {
                        chatActivityEnterView4.f21817u0 = new ie(chatActivityEnterView4, 4);
                        chatActivityEnterView4.Q();
                        return;
                    }
                } else {
                    f7 = 20.0f;
                }
                if (chatActivityEnterView4.Y2.J() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    ef efVar = chatActivityEnterView4.f21795q0;
                    if (efVar != null) {
                        efVar.e = false;
                        efVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f21773l5) {
                        peer2 = chatActivityEnterView4.Y2.v();
                        chatFull = null;
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        MessagesController.getInstance(chatActivityEnterView4.Q).getChat(Long.valueOf(-chatActivityEnterView4.P2));
                        TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.Q).getChatFull(-chatActivityEnterView4.P2);
                        if (chatFull2 != null) {
                            peer = chatFull2.default_send_as;
                        } else {
                            peer = null;
                        }
                        TLRPC.Peer peer3 = peer;
                        chatFull = chatFull2;
                        peer2 = peer3;
                    }
                    if (peer2 == null && chatActivityEnterView4.Y2.J() != null && !chatActivityEnterView4.Y2.J().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Y2.J().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.P2)));
                    if (chatActivityEnterView4.f21773l5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        xnVar4.getParentLayout().getOverlayContainerView();
                    }
                    ef efVar2 = new ef(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.O2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Y2.J(), new ai.q5(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.V3);
                    chatActivityEnterView4.f21795q0 = efVar2;
                    efVar2.e = true;
                    efVar2.f19407c = 220;
                    efVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f21795q0.setClippingEnabled(true);
                    chatActivityEnterView4.f21795q0.setFocusable(true);
                    chatActivityEnterView4.f21795q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f21795q0.setInputMethodMode(2);
                    chatActivityEnterView4.f21795q0.setSoftInputMode(0);
                    chatActivityEnterView4.f21795q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f21795q0.f19406b = false;
                    int i20 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && xnVar4 != null) {
                        xnVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i20;
                    } else {
                        i11 = i20;
                    }
                    int b13 = chatActivityEnterView4.Y2.b1();
                    int measuredHeight = chatActivityEnterView4.f21795q0.getContentView().getMeasuredHeight();
                    int q10 = chatActivityEnterView4.Y2.q();
                    if (q10 <= AndroidUtilities.dp(f7)) {
                        b13 += q10;
                    }
                    if (chatActivityEnterView4.W0) {
                        b13 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(f10);
                    int i21 = (i20 * 2) + b13;
                    if (xnVar4 != null && xnVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i21 - i12) - chatActivityEnterView4.f21795q0.f28822p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i20) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (xnVar4 != null && xnVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f21795q0.f28821o.getLayoutParams().height = ((b13 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    ef efVar3 = chatActivityEnterView4.f21795q0;
                    View view2 = efVar3.f28827u;
                    ml0 ml0Var = efVar3.v;
                    TLRPC.Peer peer5 = efVar3.f28824r;
                    po0 po0Var = efVar3.f28821o;
                    ai.f0 f0Var = efVar3.f28826t;
                    ArrayList arrayList2 = efVar3.f28831z;
                    int size = arrayList2.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj = arrayList2.get(i22);
                        i22++;
                        ((o1.k) obj).c();
                    }
                    arrayList2.clear();
                    f0Var.setPivotX(AndroidUtilities.dp(8.0f));
                    f0Var.setPivotY(f0Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                    po0Var.setPivotX(0.0f);
                    po0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = efVar3.f28825s.peers;
                    if (peer5 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        int i23 = 0;
                        while (i23 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i23).peer;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            ml0 ml0Var2 = ml0Var;
                            long j11 = peer6.channel_id;
                            if (j11 == 0 || j11 != peer5.channel_id) {
                                long j12 = peer6.user_id;
                                if (j12 == 0 || j12 != peer5.user_id) {
                                    long j13 = peer6.chat_id;
                                    if (j13 == 0 || j13 != peer5.chat_id) {
                                        i23++;
                                        ml0Var = ml0Var2;
                                        arrayList3 = arrayList4;
                                    }
                                }
                            }
                            if (i23 != arrayList4.size() - 1 && ml0Var2.getMeasuredHeight() < size2) {
                                i15 = ml0Var2.getMeasuredHeight() % dp;
                            } else {
                                i15 = 0;
                            }
                            efVar3.f28828w.h1(i23, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + i15);
                            if (ml0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    }
                    f0Var.setScaleX(0.25f);
                    f0Var.setScaleY(0.25f);
                    po0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(f0Var, o1.h.f15310o);
                    kVar.f15326u = org.telegram.ui.Cells.q3.l(1.0f, 750.0f, 1.0f);
                    kVar.b(new mo0(efVar3, 2));
                    o1.k kVar2 = new o1.k(f0Var, o1.h.f15311p);
                    kVar2.f15326u = org.telegram.ui.Cells.q3.l(1.0f, 750.0f, 1.0f);
                    kVar2.b(new mo0(efVar3, 3));
                    o1.c cVar = o1.h.f15315t;
                    o1.k kVar3 = new o1.k(f0Var, cVar);
                    kVar3.f15326u = org.telegram.ui.Cells.q3.l(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(po0Var, cVar);
                    kVar4.f15326u = org.telegram.ui.Cells.q3.l(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new no0(efVar3, kVar5, 1));
                        kVar5.f();
                    }
                    ef efVar4 = chatActivityEnterView4.f21795q0;
                    chatActivityEnterView4.f21807s0 = i11;
                    chatActivityEnterView4.f21812t0 = i14;
                    efVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f21790p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i24 = ChatActivityEnterView.f21701n5;
                chatActivityEnterView.e0();
                return;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var2 = chatActivityEnterView.U;
                if ((p1Var2 == null || !p1Var2.f19445f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.A2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.U;
                if ((p1Var3 == null || !p1Var3.f19445f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.q1();
                    return;
                }
                return;
            default:
                int i25 = ChatActivityEnterView.f21701n5;
                chatActivityEnterView.K0();
                return;
        }
    }
}
