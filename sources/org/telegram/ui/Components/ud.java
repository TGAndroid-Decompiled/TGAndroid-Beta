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
    public final int f31138a;
    public final ChatActivityEnterView f31139b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31138a = i10;
        this.f31139b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        boolean z10;
        ig igVar;
        uf ufVar;
        long j3;
        int i10;
        sg sgVar;
        org.telegram.ui.eo eoVar;
        boolean z11;
        ?? r11;
        float f7;
        long j10;
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        int i11;
        int i12;
        int i13;
        ai.f0 f0Var;
        int i14;
        int i15;
        boolean z12;
        boolean z13;
        int i16 = this.f31138a;
        TLRPC.ChatFull chatFull = null;
        boolean z14 = false;
        ChatActivityEnterView chatActivityEnterView = this.f31139b;
        switch (i16) {
            case 0:
                org.telegram.ui.ActionBar.o1 o1Var = chatActivityEnterView.U;
                if ((o1Var == null || !o1Var.f21187f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.w1();
                    return;
                }
                return;
            case 1:
                int i17 = ChatActivityEnterView.S5;
                chatActivityEnterView.L0();
                return;
            case 2:
                uf ufVar2 = chatActivityEnterView.E0;
                if (ufVar2 == null) {
                    str = "";
                } else {
                    str = ufVar2.getText().toString();
                }
                int indexOf = str.indexOf(32);
                if (indexOf != -1 && indexOf != str.length() - 1) {
                    chatActivityEnterView.setFieldText(str.substring(0, indexOf + 1));
                    return;
                } else {
                    chatActivityEnterView.setFieldText("");
                    return;
                }
            case 3:
                rf rfVar = chatActivityEnterView.L0;
                if (rfVar == null || rfVar.f37151q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f23735t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f23651f0 == null) {
                        chatActivityEnterView.V0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                sg sgVar2 = chatActivityEnterView.Z2;
                if (sgVar2 != null) {
                    sgVar2.O0();
                    return;
                }
                return;
            case 5:
                int i18 = ChatActivityEnterView.S5;
                if (chatActivityEnterView.f23626b2 != null) {
                    if (chatActivityEnterView.f23631c0 - chatActivityEnterView.f23637d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f23624b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f23624b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    og x10 = chatActivityEnterView.x();
                    chatActivityEnterView.f23633c2 = x10;
                    hg.z d = hg.z.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f23626b2.link;
                    String str3 = x10.f29177a;
                    ArrayList<TLRPC.MessageEntity> arrayList = x10.f29178b;
                    vd vdVar = new vd(chatActivityEnterView, 18);
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
            case 6:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.M3) {
                    if (!chatActivityEnterView.f23773z2 || (ufVar = chatActivityEnterView.E0) == null || !ufVar.isFocused()) {
                        if (chatActivityEnterView.f23628b4) {
                            if (chatActivityEnterView.R1 != 0) {
                                z10 = true;
                                chatActivityEnterView.o1(0, true);
                                chatActivityEnterView.U0.u(true);
                                chatActivityEnterView.U0.B();
                                if (chatActivityEnterView.f23621a4) {
                                    chatActivityEnterView.L(true);
                                }
                            } else {
                                if (!chatActivityEnterView.f23661g4 && (igVar = chatActivityEnterView.U0) != null) {
                                    igVar.O(false);
                                }
                                z10 = true;
                            }
                        } else {
                            if (!chatActivityEnterView.f23661g4) {
                                z10 = true;
                                chatActivityEnterView.U0.O(true);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.f23661g4) {
                            chatActivityEnterView.p1(chatActivityEnterView.f23628b4 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                AnimatorSet animatorSet2 = chatActivityEnterView.f23735t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    chatActivityEnterView.B(false);
                    ol0 ol0Var = chatActivityEnterView.f23664h1;
                    if (ol0Var != null) {
                        ol0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f23647e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.f23678j4);
                        sg sgVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        sgVar3.q2(2, 0, i10, chatActivityEnterView.f23750v5, 0L, true);
                        af afVar = chatActivityEnterView.J0;
                        chatActivityEnterView.f23750v5 = 0L;
                        afVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f23640d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f23634c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            hg.c.v(chatActivityEnterView.f23634c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f23634c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j11 = chatActivityEnterView.Q2;
                    org.telegram.ui.eo eoVar2 = chatActivityEnterView.P2;
                    if (eoVar2 != null && eoVar2.f37286h4) {
                        j3 = eoVar2.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j3, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f23670i1 = 0L;
                    chatActivityEnterView.p0(false);
                    chatActivityEnterView.L(true);
                    return;
                }
                return;
            case 8:
                ei.c0 c0Var = chatActivityEnterView.f23686l0;
                boolean z15 = c0Var.v;
                c0Var.setOpened(!z15);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.k0()) {
                    if (!z15) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.N0();
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 15), 275L);
                        chatActivityEnterView.n0(false);
                        return;
                    }
                    return;
                } else if (!z15) {
                    if (chatActivityEnterView.m0 == null) {
                        sf sfVar = new sf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = sfVar;
                        ai.w0 w0Var = sfVar.f9492c;
                        chatActivityEnterView.getContext();
                        w0Var.setLayoutManager(new s4.d0());
                        ai.w0 w0Var2 = chatActivityEnterView.m0.f9492c;
                        ?? i0Var = new s4.i0();
                        i0Var.f8953c = new ArrayList();
                        i0Var.d = new ArrayList();
                        i0Var.f8954e = new ArrayList();
                        chatActivityEnterView.f23696n0 = i0Var;
                        w0Var2.setAdapter(i0Var);
                        chatActivityEnterView.m0.f9492c.setOnItemClickListener(new tf(chatActivityEnterView));
                        chatActivityEnterView.m0.f9492c.setOnItemLongClickListener(new ue(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f23690m1.addView(chatActivityEnterView.m0, w7.w5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.A5;
                        if (iVar != null) {
                            chatActivityEnterView.f23696n0.E(iVar);
                        }
                        chatActivityEnterView.F1();
                    }
                    sf sfVar2 = chatActivityEnterView.m0;
                    if (sfVar2.getVisibility() != 0) {
                        sfVar2.setVisibility(0);
                        sfVar2.f9492c.u0(0);
                        sfVar2.f9495n = true;
                        sfVar2.f9494f = false;
                        return;
                    } else if (sfVar2.f9494f) {
                        sfVar2.f9494f = false;
                        sfVar2.a();
                        sfVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    sf sfVar3 = chatActivityEnterView.m0;
                    if (sfVar3 != null) {
                        sfVar3.c();
                        return;
                    }
                    return;
                }
            case 9:
                if (chatActivityEnterView.f23757w5 == BotForumHelper.SteamingSendButtonState.STOP && (sgVar = chatActivityEnterView.Z2) != null) {
                    sgVar.G1();
                    return;
                }
                return;
            case 10:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                if (BirthdayController.isToday(chatActivityEnterView.P2.f37201a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + eoVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + eoVar.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + eoVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f37201a8 == null || !chatActivityEnterView.getParentFragment().f37201a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i19 = chatActivityEnterView.getParentFragment().i();
                if (i19 != null) {
                    if (chatActivityEnterView.getParentFragment().f37201a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f37201a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(chatActivityEnterView.getContext(), 3, null);
                    a2Var.q(200L);
                    a2Var.setOnCancelListener(new org.telegram.ui.fa(chatActivityEnterView, tg.r.j(chatActivityEnterView.Q, null, new ai.u4(chatActivityEnterView, a2Var, i19, z11)), 3));
                    return;
                }
                return;
            case 11:
                int i20 = ChatActivityEnterView.S5;
                chatActivityEnterView.L0();
                return;
            case 12:
                sg sgVar4 = chatActivityEnterView.Z2;
                if (sgVar4 != null && !sgVar4.m()) {
                    sg sgVar5 = chatActivityEnterView.Z2;
                    ah ahVar = chatActivityEnterView.F0;
                    sgVar5.z1(ahVar, ahVar.f24301a.getText(), true);
                    return;
                }
                return;
            case 13:
                qf qfVar = chatActivityEnterView.N0;
                if (qfVar != null && qfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new m.y0(chatActivityEnterView, 7), chatActivityEnterView.f23775z4);
                return;
            case 14:
                ChatActivityEnterView chatActivityEnterView2 = this.f31139b;
                qf qfVar2 = chatActivityEnterView2.N0;
                if (qfVar2 != null && qfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.W0(2147483646, true, 0, true, 0L);
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView3 = this.f31139b;
                qf qfVar3 = chatActivityEnterView3.N0;
                if (qfVar3 != null && qfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.W0(0, false, 0, true, 0L);
                return;
            case 16:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.o1(0, false);
                    chatActivityEnterView.U0.u(false);
                    uf ufVar3 = chatActivityEnterView.E0;
                    if (ufVar3 != null) {
                        ufVar3.requestFocus();
                    }
                }
                if (chatActivityEnterView.f23698n2 != null) {
                    if (chatActivityEnterView.u0()) {
                        r11 = 1;
                        if (chatActivityEnterView.f23653f2 == 1) {
                            if (chatActivityEnterView.u0() && chatActivityEnterView.f23653f2 == 1) {
                                chatActivityEnterView.v1(0, 1, true, false);
                            }
                        }
                    } else {
                        r11 = 1;
                    }
                    chatActivityEnterView.v1(r11, r11, r11, r11);
                } else if (chatActivityEnterView.f23710p2) {
                    chatActivityEnterView.setFieldText("/");
                    uf ufVar4 = chatActivityEnterView.E0;
                    if (ufVar4 != null) {
                        ufVar4.requestFocus();
                    }
                    chatActivityEnterView.J0();
                }
                if (chatActivityEnterView.f23628b4) {
                    chatActivityEnterView.p1(false, false, false, true);
                    return;
                }
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView4 = this.f31139b;
                org.telegram.ui.eo eoVar3 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.Q5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.u0()) {
                    chatActivityEnterView4.f23720r0 = new vd(chatActivityEnterView4, 28);
                    if (chatActivityEnterView4.Q5) {
                        chatActivityEnterView4.o0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.o0(true, true, true);
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
                        chatActivityEnterView4.f23739u0 = new vd(chatActivityEnterView4, 29);
                        chatActivityEnterView4.Q();
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
                    kf kfVar = chatActivityEnterView4.f23713q0;
                    if (kfVar != null) {
                        kfVar.f21147e = false;
                        kfVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.Q5) {
                        peer2 = chatActivityEnterView4.Z2.x();
                        j10 = 0;
                    } else {
                        j10 = 0;
                        MessagesController.getInstance(chatActivityEnterView4.Q).getChat(Long.valueOf(-chatActivityEnterView4.Q2));
                        TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.Q).getChatFull(-chatActivityEnterView4.Q2);
                        if (chatFull2 != null) {
                            peer = chatFull2.default_send_as;
                        } else {
                            peer = null;
                        }
                        peer2 = peer;
                        chatFull = chatFull2;
                    }
                    if (peer2 == null && chatActivityEnterView4.Z2.J() != null && !chatActivityEnterView4.Z2.J().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Z2.J().peers.get(0).peer;
                    }
                    TLRPC.Peer peer3 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.Q5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        eoVar3.getParentLayout().getOverlayContainerView();
                    }
                    kf kfVar2 = new kf(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer3, chatActivityEnterView4.Z2.J(), new ai.r5(chatActivityEnterView4, chatFull, messagesController, 20), chatActivityEnterView4.f23775z4);
                    chatActivityEnterView4.f23713q0 = kfVar2;
                    kfVar2.f21147e = true;
                    kfVar2.f21146c = 220;
                    kfVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f23713q0.setClippingEnabled(true);
                    chatActivityEnterView4.f23713q0.setFocusable(true);
                    chatActivityEnterView4.f23713q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f23713q0.setInputMethodMode(2);
                    chatActivityEnterView4.f23713q0.setSoftInputMode(0);
                    chatActivityEnterView4.f23713q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f23713q0.f21145b = false;
                    int i21 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && eoVar3 != null) {
                        eoVar3.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i21;
                    } else {
                        i11 = i21;
                    }
                    int h13 = chatActivityEnterView4.Z2.h1();
                    int measuredHeight = chatActivityEnterView4.f23713q0.getContentView().getMeasuredHeight();
                    int v9 = chatActivityEnterView4.Z2.v();
                    float f10 = 1.0f;
                    if (v9 <= AndroidUtilities.dp(f7)) {
                        h13 += v9;
                    }
                    if (chatActivityEnterView4.W0) {
                        h13 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(1.0f);
                    int i22 = (i21 * 2) + h13;
                    if (eoVar3 != null && eoVar3.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i22 - i12) - chatActivityEnterView4.f23713q0.f26489p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i13 = ((iArr[1] - measuredHeight) - i21) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (eoVar3 != null && eoVar3.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f23713q0.f26488o.getLayoutParams().height = ((h13 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                    }
                    kf kfVar3 = chatActivityEnterView4.f23713q0;
                    View view2 = kfVar3.f26494u;
                    wm0 wm0Var = kfVar3.v;
                    TLRPC.Peer peer4 = kfVar3.f26491r;
                    aq0 aq0Var = kfVar3.f26488o;
                    ai.f0 f0Var2 = kfVar3.f26493t;
                    ArrayList arrayList2 = kfVar3.f26498z;
                    int size = arrayList2.size();
                    int i23 = 1;
                    int i24 = 0;
                    while (i24 < size) {
                        Object obj = arrayList2.get(i24);
                        i24++;
                        ((o1.k) obj).c();
                    }
                    arrayList2.clear();
                    f0Var2.setPivotX(AndroidUtilities.dp(8.0f));
                    f0Var2.setPivotY(f0Var2.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                    aq0Var.setPivotX(0.0f);
                    aq0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = kfVar3.f26492s.peers;
                    if (peer4 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        ai.f0 f0Var3 = f0Var2;
                        i14 = 2;
                        int i25 = 0;
                        while (i25 < arrayList3.size()) {
                            TLRPC.Peer peer5 = arrayList3.get(i25).peer;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            int i26 = dp;
                            long j12 = peer5.channel_id;
                            if (j12 == j10 || j12 != peer4.channel_id) {
                                long j13 = peer5.user_id;
                                if (j13 == j10 || j13 != peer4.user_id) {
                                    long j14 = peer5.chat_id;
                                    if (j14 == j10 || j14 != peer4.chat_id) {
                                        i25++;
                                        f0Var3 = f0Var3;
                                        arrayList3 = arrayList4;
                                        dp = i26;
                                        f10 = 1.0f;
                                    }
                                }
                            }
                            if (i25 != arrayList4.size() - 1 && wm0Var.getMeasuredHeight() < size2) {
                                i15 = wm0Var.getMeasuredHeight() % i26;
                            } else {
                                i15 = 0;
                            }
                            kfVar3.f26495w.h1(i25, (size2 - ((arrayList4.size() - 2) * i26)) + AndroidUtilities.dp(7.0f) + i15);
                            if (wm0Var.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                f0Var = f0Var3;
                                view2.animate().alpha(f10).setDuration(150L).start();
                            }
                            f0Var = f0Var3;
                        }
                        f0Var = f0Var3;
                    } else {
                        f0Var = f0Var2;
                        i14 = 2;
                    }
                    f0Var.setScaleX(0.25f);
                    f0Var.setScaleY(0.25f);
                    aq0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(f0Var, o1.h.f16674o);
                    kVar.f16691u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    kVar.b(new xp0(kfVar3, i14));
                    o1.k kVar2 = new o1.k(f0Var, o1.h.f16675p);
                    kVar2.f16691u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    kVar2.b(new xp0(kfVar3, 3));
                    o1.c cVar = o1.h.f16679t;
                    o1.k kVar3 = new o1.k(f0Var, cVar);
                    kVar3.f16691u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(aq0Var, cVar);
                    kVar4.f16691u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new yp0(kfVar3, kVar5, i23));
                        kVar5.h();
                        i23 = 1;
                    }
                    kf kfVar4 = chatActivityEnterView4.f23713q0;
                    chatActivityEnterView4.f23727s0 = i11;
                    chatActivityEnterView4.f23733t0 = i13;
                    kfVar4.showAtLocation(view, 51, i11, i13);
                    chatActivityEnterView4.f23708p0.setProgress(1.0f);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.o1 o1Var2 = chatActivityEnterView.U;
                if (o1Var2 == null || !o1Var2.f21187f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.w1();
                        return;
                    } else if (chatActivityEnterView.u0() && chatActivityEnterView.f23653f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.o1(0, true);
                            ig igVar2 = chatActivityEnterView.U0;
                            if (igVar2 != null) {
                                igVar2.u(false);
                            }
                            uf ufVar5 = chatActivityEnterView.E0;
                            if (ufVar5 != null) {
                                ufVar5.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.f23628b4) {
                            chatActivityEnterView.p1(false, true, false, true);
                            chatActivityEnterView.N3 = true;
                            AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 17), 200L);
                            return;
                        }
                        chatActivityEnterView.K0();
                        return;
                    } else {
                        chatActivityEnterView.v1(1, 0, true, true);
                        ig igVar3 = chatActivityEnterView.U0;
                        uf ufVar6 = chatActivityEnterView.E0;
                        if (ufVar6 != null && ufVar6.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.eo eoVar4 = chatActivityEnterView.P2;
                        if (eoVar4 != null) {
                            ci.d4 d4Var = eoVar4.f37497y1;
                            if (d4Var != null) {
                                if (d4Var.V) {
                                    d4Var.e(true);
                                }
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            eoVar4.f37497y1 = null;
                            if (z13) {
                                z14 = true;
                            }
                        }
                        igVar3.D(z12, z14);
                        return;
                    }
                }
                return;
            case 19:
                int i27 = ChatActivityEnterView.S5;
                chatActivityEnterView.e0();
                return;
            default:
                org.telegram.ui.ActionBar.o1 o1Var3 = chatActivityEnterView.U;
                if ((o1Var3 == null || !o1Var3.f21187f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.H2();
                    return;
                }
                return;
        }
    }
}
