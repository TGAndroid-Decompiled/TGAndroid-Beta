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
public final class sd implements View.OnClickListener {
    public final int f27836a;
    public final ChatActivityEnterView f27837b;

    public sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27836a = i10;
        this.f27837b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        mg mgVar;
        boolean z10;
        cg cgVar;
        of ofVar;
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
        int i16 = this.f27836a;
        ChatActivityEnterView chatActivityEnterView = this.f27837b;
        switch (i16) {
            case 0:
                of ofVar2 = chatActivityEnterView.E0;
                if (ofVar2 == null) {
                    str = "";
                } else {
                    str = ofVar2.getText().toString();
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
                kf kfVar = chatActivityEnterView.L0;
                if (kfVar == null || kfVar.f33159q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f21851s2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f21777f0 == null) {
                        chatActivityEnterView.T0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mg mgVar2 = chatActivityEnterView.Y2;
                if (mgVar2 != null) {
                    mgVar2.J0();
                    return;
                }
                return;
            case 3:
                int i17 = ChatActivityEnterView.f21743n5;
                if (chatActivityEnterView.a2 != null) {
                    if (chatActivityEnterView.f21758c0 - chatActivityEnterView.f21764d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f21751b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f21751b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    ig y3 = chatActivityEnterView.y();
                    chatActivityEnterView.f21753b2 = y3;
                    hg.y d = hg.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.a2.link;
                    String str3 = y3.f24937a;
                    ArrayList<TLRPC.MessageEntity> arrayList = y3.f24938b;
                    qd qdVar = new qd(chatActivityEnterView, 14);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, qdVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.T4 == BotForumHelper.SteamingSendButtonState.STOP && (mgVar = chatActivityEnterView.Y2) != null) {
                    mgVar.z1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.j3) {
                    if (!chatActivityEnterView.f21884y2 || (ofVar = chatActivityEnterView.E0) == null || !ofVar.isFocused()) {
                        if (chatActivityEnterView.y3) {
                            if (chatActivityEnterView.Q1 != 0) {
                                z10 = true;
                                chatActivityEnterView.m1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.A();
                                if (chatActivityEnterView.f21879x3) {
                                    chatActivityEnterView.L(true);
                                }
                            } else {
                                if (!chatActivityEnterView.D3 && (cgVar = chatActivityEnterView.U0) != null) {
                                    cgVar.O(false);
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
                            chatActivityEnterView.n1(chatActivityEnterView.y3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f21851s2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    hk0 hk0Var = chatActivityEnterView.f21790h1;
                    if (hk0Var != null) {
                        hk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f21767d3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.G3);
                        mg mgVar3 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        mgVar3.k2(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        ve veVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        veVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f21761c3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f21754b3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            com.google.android.gms.internal.vision.e2.t(chatActivityEnterView.f21754b3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f21754b3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.P2;
                    org.telegram.ui.bo boVar = chatActivityEnterView.O2;
                    if (boVar != null && boVar.f32310h4) {
                        j3 = boVar.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f21796i1 = 0L;
                    chatActivityEnterView.p0(false);
                    chatActivityEnterView.L(true);
                    return;
                }
                return;
            case 7:
                ei.c0 c0Var = chatActivityEnterView.f21812l0;
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
                        AndroidUtilities.runOnUIThread(new qd(chatActivityEnterView, 13), 275L);
                        chatActivityEnterView.n0(false);
                        return;
                    }
                    return;
                } else if (!z16) {
                    if (chatActivityEnterView.m0 == null) {
                        lf lfVar = new lf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = lfVar;
                        ai.w0 w0Var = lfVar.f8740c;
                        chatActivityEnterView.getContext();
                        w0Var.setLayoutManager(new s4.c0());
                        ai.w0 w0Var2 = chatActivityEnterView.m0.f8740c;
                        ?? h0Var = new s4.h0();
                        h0Var.f8242c = new ArrayList();
                        h0Var.d = new ArrayList();
                        h0Var.e = new ArrayList();
                        chatActivityEnterView.f21822n0 = h0Var;
                        w0Var2.setAdapter(h0Var);
                        chatActivityEnterView.m0.f8740c.setOnItemClickListener(new nf(chatActivityEnterView));
                        chatActivityEnterView.m0.f8740c.setOnItemLongClickListener(new pe(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.l1.addView(chatActivityEnterView.m0, w7.x5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.X4;
                        if (iVar != null) {
                            chatActivityEnterView.f21822n0.E(iVar);
                        }
                        chatActivityEnterView.C1();
                    }
                    lf lfVar2 = chatActivityEnterView.m0;
                    if (lfVar2.getVisibility() != 0) {
                        lfVar2.setVisibility(0);
                        lfVar2.f8740c.v0(0);
                        lfVar2.f8742n = true;
                        lfVar2.f8741f = false;
                        return;
                    } else if (lfVar2.f8741f) {
                        lfVar2.f8741f = false;
                        lfVar2.a();
                        lfVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    lf lfVar3 = chatActivityEnterView.m0;
                    if (lfVar3 != null) {
                        lfVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                mg mgVar4 = chatActivityEnterView.Y2;
                if (mgVar4 != null && !mgVar4.m()) {
                    mg mgVar5 = chatActivityEnterView.Y2;
                    ug ugVar = chatActivityEnterView.F0;
                    mgVar5.t1(ugVar, ugVar.f28384a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.bo boVar2 = chatActivityEnterView.O2;
                if (BirthdayController.isToday(boVar2.f32225a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + boVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + boVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + boVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f32225a8 == null || !chatActivityEnterView.getParentFragment().f32225a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.J1, false);
                }
                TLRPC.User i18 = chatActivityEnterView.getParentFragment().i();
                if (i18 != null) {
                    if (chatActivityEnterView.getParentFragment().f32225a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f32225a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(chatActivityEnterView.getContext(), 3, null);
                    c2Var.q(200L);
                    c2Var.setOnCancelListener(new org.telegram.ui.da(chatActivityEnterView, tg.t.j(chatActivityEnterView.Q, null, new ai.t4(chatActivityEnterView, c2Var, i18, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i19 = ChatActivityEnterView.f21743n5;
                chatActivityEnterView.K0();
                return;
            case 11:
                jf jfVar = chatActivityEnterView.N0;
                if (jfVar != null && jfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                c5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new k2.c0(chatActivityEnterView, 11), chatActivityEnterView.V3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f27837b;
                jf jfVar2 = chatActivityEnterView2.N0;
                if (jfVar2 != null && jfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.U0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f27837b;
                jf jfVar3 = chatActivityEnterView3.N0;
                if (jfVar3 != null && jfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.U0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.q1 q1Var = chatActivityEnterView.U;
                if (q1Var == null || !q1Var.f19512f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.u1();
                        return;
                    } else if (chatActivityEnterView.u0() && chatActivityEnterView.f21772e2 == 0) {
                        if (chatActivityEnterView.Q1 != 0) {
                            z15 = false;
                            chatActivityEnterView.m1(0, true);
                            cg cgVar2 = chatActivityEnterView.U0;
                            if (cgVar2 != null) {
                                cgVar2.t(false);
                            }
                            of ofVar3 = chatActivityEnterView.E0;
                            if (ofVar3 != null) {
                                ofVar3.requestFocus();
                            }
                        } else {
                            z15 = false;
                        }
                        if (chatActivityEnterView.y3) {
                            chatActivityEnterView.n1(z15, true, z15, true);
                            chatActivityEnterView.f21809k3 = true;
                            AndroidUtilities.runOnUIThread(new qd(chatActivityEnterView, 22), 200L);
                            return;
                        }
                        chatActivityEnterView.J0();
                        return;
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        cg cgVar3 = chatActivityEnterView.U0;
                        of ofVar4 = chatActivityEnterView.E0;
                        if (ofVar4 != null && ofVar4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.bo boVar3 = chatActivityEnterView.O2;
                        if (boVar3 != null) {
                            ci.f4 f4Var = boVar3.f32520y1;
                            if (f4Var != null) {
                                if (f4Var.V) {
                                    f4Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boVar3.f32520y1 = null;
                            if (z14) {
                                z13 = true;
                                cgVar3.B(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        cgVar3.B(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    of ofVar5 = chatActivityEnterView.E0;
                    if (ofVar5 != null) {
                        ofVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f21817m2 != null) {
                    if (chatActivityEnterView.u0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f21772e2 == 1) {
                            if (chatActivityEnterView.u0() && chatActivityEnterView.f21772e2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.t1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.f21829o2) {
                    chatActivityEnterView.setFieldText("/");
                    of ofVar6 = chatActivityEnterView.E0;
                    if (ofVar6 != null) {
                        ofVar6.requestFocus();
                    }
                    chatActivityEnterView.I0();
                }
                if (chatActivityEnterView.y3) {
                    chatActivityEnterView.n1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f27837b;
                org.telegram.ui.bo boVar4 = chatActivityEnterView4.O2;
                if (!chatActivityEnterView4.f21815l5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.u0()) {
                    chatActivityEnterView4.f21843r0 = new ge(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f21815l5) {
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
                        chatActivityEnterView4.f21859u0 = new ge(chatActivityEnterView4, 4);
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
                    cf cfVar = chatActivityEnterView4.f21837q0;
                    if (cfVar != null) {
                        cfVar.e = false;
                        cfVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f21815l5) {
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
                    if (chatActivityEnterView4.f21815l5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        boVar4.getParentLayout().getOverlayContainerView();
                    }
                    cf cfVar2 = new cf(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.O2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Y2.J(), new ai.r5(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.V3);
                    chatActivityEnterView4.f21837q0 = cfVar2;
                    cfVar2.e = true;
                    cfVar2.f19449c = 220;
                    cfVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f21837q0.setClippingEnabled(true);
                    chatActivityEnterView4.f21837q0.setFocusable(true);
                    chatActivityEnterView4.f21837q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f21837q0.setInputMethodMode(2);
                    chatActivityEnterView4.f21837q0.setSoftInputMode(0);
                    chatActivityEnterView4.f21837q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f21837q0.f19448b = false;
                    int i20 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && boVar4 != null) {
                        boVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i20;
                    } else {
                        i11 = i20;
                    }
                    int b13 = chatActivityEnterView4.Y2.b1();
                    int measuredHeight = chatActivityEnterView4.f21837q0.getContentView().getMeasuredHeight();
                    int q10 = chatActivityEnterView4.Y2.q();
                    if (q10 <= AndroidUtilities.dp(f7)) {
                        b13 += q10;
                    }
                    if (chatActivityEnterView4.W0) {
                        b13 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(f10);
                    int i21 = (i20 * 2) + b13;
                    if (boVar4 != null && boVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i21 - i12) - chatActivityEnterView4.f21837q0.f29714p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i20) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (boVar4 != null && boVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f21837q0.f29713o.getLayoutParams().height = ((b13 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    cf cfVar3 = chatActivityEnterView4.f21837q0;
                    View view2 = cfVar3.f29719u;
                    ml0 ml0Var = cfVar3.v;
                    TLRPC.Peer peer5 = cfVar3.f29716r;
                    qo0 qo0Var = cfVar3.f29713o;
                    ai.f0 f0Var = cfVar3.f29718t;
                    ArrayList arrayList2 = cfVar3.f29723z;
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
                    qo0Var.setPivotX(0.0f);
                    qo0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = cfVar3.f29717s.peers;
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
                            cfVar3.f29720w.h1(i23, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + i15);
                            if (ml0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    }
                    f0Var.setScaleX(0.25f);
                    f0Var.setScaleY(0.25f);
                    qo0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(f0Var, o1.h.f15345o);
                    kVar.f15361u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                    kVar.b(new no0(cfVar3, 2));
                    o1.k kVar2 = new o1.k(f0Var, o1.h.f15346p);
                    kVar2.f15361u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                    kVar2.b(new no0(cfVar3, 3));
                    o1.c cVar = o1.h.f15350t;
                    o1.k kVar3 = new o1.k(f0Var, cVar);
                    kVar3.f15361u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(qo0Var, cVar);
                    kVar4.f15361u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new oo0(cfVar3, kVar5, 1));
                        kVar5.f();
                    }
                    cf cfVar4 = chatActivityEnterView4.f21837q0;
                    chatActivityEnterView4.f21849s0 = i11;
                    chatActivityEnterView4.f21854t0 = i14;
                    cfVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f21832p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i24 = ChatActivityEnterView.f21743n5;
                chatActivityEnterView.e0();
                return;
            case 18:
                org.telegram.ui.ActionBar.q1 q1Var2 = chatActivityEnterView.U;
                if ((q1Var2 == null || !q1Var2.f19512f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.A2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.q1 q1Var3 = chatActivityEnterView.U;
                if ((q1Var3 == null || !q1Var3.f19512f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.q1();
                    return;
                }
                return;
            default:
                int i25 = ChatActivityEnterView.f21743n5;
                chatActivityEnterView.K0();
                return;
        }
    }
}
