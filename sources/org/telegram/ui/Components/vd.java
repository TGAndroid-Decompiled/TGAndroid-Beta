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
    public final int f31635a;
    public final ChatActivityEnterView f31636b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31635a = i10;
        this.f31636b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        pg pgVar;
        boolean z10;
        fg fgVar;
        rf rfVar;
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
        int i16 = this.f31635a;
        ChatActivityEnterView chatActivityEnterView = this.f31636b;
        switch (i16) {
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
                if (ofVar == null || ofVar.f43812q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f23960t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f23881f0 == null) {
                        chatActivityEnterView.S0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pg pgVar2 = chatActivityEnterView.Z2;
                if (pgVar2 != null) {
                    pgVar2.J0();
                    return;
                }
                return;
            case 3:
                int i17 = ChatActivityEnterView.f23846n5;
                if (chatActivityEnterView.f23856b2 != null) {
                    if (chatActivityEnterView.f23861c0 - chatActivityEnterView.f23867d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f23854b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f23854b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    lg x10 = chatActivityEnterView.x();
                    chatActivityEnterView.f23863c2 = x10;
                    hg.y d = hg.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f23856b2.link;
                    String str3 = x10.f28358a;
                    ArrayList<TLRPC.MessageEntity> arrayList = x10.f28359b;
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
                    pgVar.z1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f23913k3) {
                    if (!chatActivityEnterView.f23992z2 || (rfVar = chatActivityEnterView.E0) == null || !rfVar.isFocused()) {
                        if (chatActivityEnterView.f23993z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                z10 = true;
                                chatActivityEnterView.l1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.A();
                                if (chatActivityEnterView.y3) {
                                    chatActivityEnterView.I(true);
                                }
                            } else {
                                if (!chatActivityEnterView.E3 && (fgVar = chatActivityEnterView.U0) != null) {
                                    fgVar.M(false);
                                }
                                z10 = true;
                            }
                        } else {
                            if (!chatActivityEnterView.E3) {
                                z10 = true;
                                chatActivityEnterView.U0.M(true);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.E3) {
                            chatActivityEnterView.m1(chatActivityEnterView.f23993z3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f23960t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    tk0 tk0Var = chatActivityEnterView.f23894h1;
                    if (tk0Var != null) {
                        tk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f23877e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        pg pgVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        pgVar3.k2(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        ze zeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        zeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f23870d3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f23864c3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            com.google.android.gms.internal.vision.e2.t(chatActivityEnterView.f23864c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f23864c3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
                    if (ynVar != null && ynVar.f43331f4) {
                        j3 = ynVar.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f23900i1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.I(true);
                    return;
                }
                return;
            case 7:
                ei.d0 d0Var = chatActivityEnterView.f23916l0;
                boolean z16 = d0Var.v;
                d0Var.setOpened(!z16);
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
                        AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 13), 275L);
                        chatActivityEnterView.m0(false);
                        return;
                    }
                    return;
                } else if (!z16) {
                    if (chatActivityEnterView.m0 == null) {
                        pf pfVar = new pf(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = pfVar;
                        ai.w0 w0Var = pfVar.f9496c;
                        chatActivityEnterView.getContext();
                        w0Var.setLayoutManager(new s4.c0());
                        ai.w0 w0Var2 = chatActivityEnterView.m0.f9496c;
                        ?? h0Var = new s4.h0();
                        h0Var.f8947c = new ArrayList();
                        h0Var.d = new ArrayList();
                        h0Var.f8948e = new ArrayList();
                        chatActivityEnterView.f23926n0 = h0Var;
                        w0Var2.setAdapter(h0Var);
                        chatActivityEnterView.m0.f9496c.setOnItemClickListener(new qf(chatActivityEnterView));
                        chatActivityEnterView.m0.f9496c.setOnItemLongClickListener(new te(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f23920m1.addView(chatActivityEnterView.m0, w7.z5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.X4;
                        if (iVar != null) {
                            chatActivityEnterView.f23926n0.E(iVar);
                        }
                        chatActivityEnterView.B1();
                    }
                    pf pfVar2 = chatActivityEnterView.m0;
                    if (pfVar2.getVisibility() != 0) {
                        pfVar2.setVisibility(0);
                        pfVar2.f9496c.v0(0);
                        pfVar2.f9499n = true;
                        pfVar2.f9498f = false;
                        return;
                    } else if (pfVar2.f9498f) {
                        pfVar2.f9498f = false;
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
                if (pgVar4 != null && !pgVar4.m()) {
                    pg pgVar5 = chatActivityEnterView.Z2;
                    xg xgVar = chatActivityEnterView.F0;
                    pgVar5.t1(xgVar, xgVar.f32780a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.yn ynVar2 = chatActivityEnterView.P2;
                if (BirthdayController.isToday(ynVar2.Y7)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + ynVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + ynVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + ynVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().Y7 == null || !chatActivityEnterView.getParentFragment().Y7.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.K1, false);
                }
                TLRPC.User i18 = chatActivityEnterView.getParentFragment().i();
                if (i18 != null) {
                    if (chatActivityEnterView.getParentFragment().Y7 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().Y7.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new org.telegram.ui.da(chatActivityEnterView, tg.s.j(chatActivityEnterView.Q, null, new ai.t4(chatActivityEnterView, b2Var, i18, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i19 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.J0();
                return;
            case 11:
                nf nfVar = chatActivityEnterView.N0;
                if (nfVar != null && nfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                e5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new n2.c(chatActivityEnterView, 5), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f31636b;
                nf nfVar2 = chatActivityEnterView2.N0;
                if (nfVar2 != null && nfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f31636b;
                nf nfVar3 = chatActivityEnterView3.N0;
                if (nfVar3 != null && nfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.U;
                if (p1Var == null || !p1Var.f21448f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.t1();
                        return;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.f23883f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            z15 = false;
                            chatActivityEnterView.l1(0, true);
                            fg fgVar2 = chatActivityEnterView.U0;
                            if (fgVar2 != null) {
                                fgVar2.t(false);
                            }
                            rf rfVar3 = chatActivityEnterView.E0;
                            if (rfVar3 != null) {
                                rfVar3.requestFocus();
                            }
                        } else {
                            z15 = false;
                        }
                        if (chatActivityEnterView.f23993z3) {
                            chatActivityEnterView.m1(z15, true, z15, true);
                            chatActivityEnterView.f23918l3 = true;
                            AndroidUtilities.runOnUIThread(new td(chatActivityEnterView, 22), 200L);
                            return;
                        }
                        chatActivityEnterView.I0();
                        return;
                    } else {
                        chatActivityEnterView.s1(1, 0, true, true);
                        fg fgVar3 = chatActivityEnterView.U0;
                        rf rfVar4 = chatActivityEnterView.E0;
                        if (rfVar4 != null && rfVar4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.yn ynVar3 = chatActivityEnterView.P2;
                        if (ynVar3 != null) {
                            ci.e4 e4Var = ynVar3.f43539w1;
                            if (e4Var != null) {
                                if (e4Var.V) {
                                    e4Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            ynVar3.f43539w1 = null;
                            if (z14) {
                                z13 = true;
                                fgVar3.B(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        fgVar3.B(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.U0.t(false);
                    rf rfVar5 = chatActivityEnterView.E0;
                    if (rfVar5 != null) {
                        rfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f23928n2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f23883f2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.f23883f2 == 1) {
                                chatActivityEnterView.s1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.s1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.f23938p2) {
                    chatActivityEnterView.setFieldText("/");
                    rf rfVar6 = chatActivityEnterView.E0;
                    if (rfVar6 != null) {
                        rfVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.f23993z3) {
                    chatActivityEnterView.m1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f31636b;
                org.telegram.ui.yn ynVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.f23919l5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.t0()) {
                    chatActivityEnterView4.f23947r0 = new ke(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f23919l5) {
                        chatActivityEnterView4.n0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.q() > AndroidUtilities.dp(20.0f)) {
                    int b12 = chatActivityEnterView4.Z2.b1();
                    int q6 = chatActivityEnterView4.Z2.q();
                    f7 = 20.0f;
                    if (q6 <= AndroidUtilities.dp(20.0f)) {
                        b12 += q6;
                    }
                    if (chatActivityEnterView4.W0) {
                        b12 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (b12 < AndroidUtilities.dp(200.0f)) {
                        chatActivityEnterView4.f23963u0 = new ke(chatActivityEnterView4, 4);
                        chatActivityEnterView4.N();
                        return;
                    }
                } else {
                    f7 = 20.0f;
                }
                if (chatActivityEnterView4.Z2.I() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    gf gfVar = chatActivityEnterView4.f23941q0;
                    if (gfVar != null) {
                        gfVar.f21408e = false;
                        gfVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f23919l5) {
                        peer2 = chatActivityEnterView4.Z2.v();
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
                    if (peer2 == null && chatActivityEnterView4.Z2.I() != null && !chatActivityEnterView4.Z2.I().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Z2.I().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.f23919l5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        ynVar4.getParentLayout().getOverlayContainerView();
                    }
                    gf gfVar2 = new gf(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Z2.I(), new ai.q5(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f23941q0 = gfVar2;
                    gfVar2.f21408e = true;
                    gfVar2.f21407c = 220;
                    gfVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f23941q0.setClippingEnabled(true);
                    chatActivityEnterView4.f23941q0.setFocusable(true);
                    chatActivityEnterView4.f23941q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f23941q0.setInputMethodMode(2);
                    chatActivityEnterView4.f23941q0.setSoftInputMode(0);
                    chatActivityEnterView4.f23941q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f23941q0.f21406b = false;
                    int i20 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && ynVar4 != null) {
                        ynVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i20;
                    } else {
                        i11 = i20;
                    }
                    int b13 = chatActivityEnterView4.Z2.b1();
                    int measuredHeight = chatActivityEnterView4.f23941q0.getContentView().getMeasuredHeight();
                    int q10 = chatActivityEnterView4.Z2.q();
                    if (q10 <= AndroidUtilities.dp(f7)) {
                        b13 += q10;
                    }
                    if (chatActivityEnterView4.W0) {
                        b13 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(f10);
                    int i21 = (i20 * 2) + b13;
                    if (ynVar4 != null && ynVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i21 - i12) - chatActivityEnterView4.f23941q0.f29427p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i20) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (ynVar4 != null && ynVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f23941q0.f29426o.getLayoutParams().height = ((b13 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    gf gfVar3 = chatActivityEnterView4.f23941q0;
                    View view2 = gfVar3.f29432u;
                    zl0 zl0Var = gfVar3.v;
                    TLRPC.Peer peer5 = gfVar3.f29429r;
                    ip0 ip0Var = gfVar3.f29426o;
                    ai.f0 f0Var = gfVar3.f29431t;
                    ArrayList arrayList2 = gfVar3.f29436z;
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
                    ip0Var.setPivotX(0.0f);
                    ip0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = gfVar3.f29430s.peers;
                    if (peer5 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        int i23 = 0;
                        while (i23 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i23).peer;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            zl0 zl0Var2 = zl0Var;
                            long j11 = peer6.channel_id;
                            if (j11 == 0 || j11 != peer5.channel_id) {
                                long j12 = peer6.user_id;
                                if (j12 == 0 || j12 != peer5.user_id) {
                                    long j13 = peer6.chat_id;
                                    if (j13 == 0 || j13 != peer5.chat_id) {
                                        i23++;
                                        zl0Var = zl0Var2;
                                        arrayList3 = arrayList4;
                                    }
                                }
                            }
                            if (i23 != arrayList4.size() - 1 && zl0Var2.getMeasuredHeight() < size2) {
                                i15 = zl0Var2.getMeasuredHeight() % dp;
                            } else {
                                i15 = 0;
                            }
                            gfVar3.f29433w.h1(i23, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + i15);
                            if (zl0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    }
                    f0Var.setScaleX(0.25f);
                    f0Var.setScaleY(0.25f);
                    ip0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(f0Var, o1.h.f16966o);
                    kVar.f16983u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                    kVar.b(new fp0(gfVar3, 2));
                    o1.k kVar2 = new o1.k(f0Var, o1.h.f16967p);
                    kVar2.f16983u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                    kVar2.b(new fp0(gfVar3, 3));
                    o1.c cVar = o1.h.f16971t;
                    o1.k kVar3 = new o1.k(f0Var, cVar);
                    kVar3.f16983u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(ip0Var, cVar);
                    kVar4.f16983u = org.telegram.ui.Cells.c1.l(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new gp0(gfVar3, kVar5, 1));
                        kVar5.f();
                    }
                    gf gfVar4 = chatActivityEnterView4.f23941q0;
                    chatActivityEnterView4.f23953s0 = i11;
                    chatActivityEnterView4.f23958t0 = i14;
                    gfVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f23936p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i24 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.d0();
                return;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var2 = chatActivityEnterView.U;
                if ((p1Var2 == null || !p1Var2.f21448f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.A2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.U;
                if ((p1Var3 == null || !p1Var3.f21448f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.q1();
                    return;
                }
                return;
            default:
                int i25 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.J0();
                return;
        }
    }
}
