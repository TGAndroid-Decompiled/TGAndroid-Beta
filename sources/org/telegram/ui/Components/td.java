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
    public final int f28369a;
    public final ChatActivityEnterView f28370b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28369a = i10;
        this.f28370b = chatActivityEnterView;
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
        int i16 = this.f28369a;
        ChatActivityEnterView chatActivityEnterView = this.f28370b;
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
                if (mfVar == null || mfVar.f32691q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f22024s2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f21951f0 == null) {
                        chatActivityEnterView.S0();
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
                int i17 = ChatActivityEnterView.f21917m5;
                if (chatActivityEnterView.a2 != null) {
                    if (chatActivityEnterView.f21932c0 - chatActivityEnterView.f21938d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f21925b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f21925b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    jg x10 = chatActivityEnterView.x();
                    chatActivityEnterView.f21927b2 = x10;
                    hg.y d = hg.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.a2.link;
                    String str3 = x10.f25327a;
                    ArrayList<TLRPC.MessageEntity> arrayList = x10.f25328b;
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
                if (chatActivityEnterView.S4 == BotForumHelper.SteamingSendButtonState.STOP && (ngVar = chatActivityEnterView.Y2) != null) {
                    ngVar.z1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.j3) {
                    if (!chatActivityEnterView.f22057y2 || (pfVar = chatActivityEnterView.E0) == null || !pfVar.isFocused()) {
                        if (chatActivityEnterView.y3) {
                            if (chatActivityEnterView.Q1 != 0) {
                                z10 = true;
                                chatActivityEnterView.l1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.A();
                                if (chatActivityEnterView.f22052x3) {
                                    chatActivityEnterView.K(true);
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
                            chatActivityEnterView.m1(chatActivityEnterView.y3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f22024s2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    rk0 rk0Var = chatActivityEnterView.f21964h1;
                    if (rk0Var != null) {
                        rk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f21941d3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.G3);
                        ng ngVar3 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ngVar3.k2(2, 0, i10, chatActivityEnterView.R4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.R4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f21935c3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f21928b3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            com.google.android.gms.internal.vision.e2.t(chatActivityEnterView.f21928b3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f21928b3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.P2;
                    org.telegram.ui.zn znVar = chatActivityEnterView.O2;
                    if (znVar != null && znVar.f40292h4) {
                        j3 = znVar.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f21970i1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.K(true);
                    return;
                }
                return;
            case 7:
                ei.c0 c0Var = chatActivityEnterView.f21986l0;
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
                        AndroidUtilities.runOnUIThread(new rd(chatActivityEnterView, 13), 275L);
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
                        chatActivityEnterView.f21995n0 = h0Var;
                        w0Var2.setAdapter(h0Var);
                        chatActivityEnterView.m0.f8739c.setOnItemClickListener(new of(chatActivityEnterView));
                        chatActivityEnterView.m0.f8739c.setOnItemLongClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.l1.addView(chatActivityEnterView.m0, w7.y5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.W4;
                        if (iVar != null) {
                            chatActivityEnterView.f21995n0.E(iVar);
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
                ng ngVar4 = chatActivityEnterView.Y2;
                if (ngVar4 != null && !ngVar4.m()) {
                    ng ngVar5 = chatActivityEnterView.Y2;
                    vg vgVar = chatActivityEnterView.F0;
                    ngVar5.t1(vgVar, vgVar.f28995a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.zn znVar2 = chatActivityEnterView.O2;
                if (BirthdayController.isToday(znVar2.f40207a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + znVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + znVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + znVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f40207a8 == null || !chatActivityEnterView.getParentFragment().f40207a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.J1, false);
                }
                TLRPC.User i18 = chatActivityEnterView.getParentFragment().i();
                if (i18 != null) {
                    if (chatActivityEnterView.getParentFragment().f40207a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f40207a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new org.telegram.ui.ca(chatActivityEnterView, tg.s.j(chatActivityEnterView.Q, null, new ai.t4(chatActivityEnterView, b2Var, i18, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i19 = ChatActivityEnterView.f21917m5;
                chatActivityEnterView.J0();
                return;
            case 11:
                lf lfVar = chatActivityEnterView.N0;
                if (lfVar != null && lfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new n2.e(chatActivityEnterView, 5), chatActivityEnterView.V3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f28370b;
                lf lfVar2 = chatActivityEnterView2.N0;
                if (lfVar2 != null && lfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f28370b;
                lf lfVar3 = chatActivityEnterView3.N0;
                if (lfVar3 != null && lfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.U;
                if (p1Var == null || !p1Var.f19671f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.t1();
                        return;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.f21946e2 == 0) {
                        if (chatActivityEnterView.Q1 != 0) {
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
                        if (chatActivityEnterView.y3) {
                            chatActivityEnterView.m1(z15, true, z15, true);
                            chatActivityEnterView.f21983k3 = true;
                            AndroidUtilities.runOnUIThread(new rd(chatActivityEnterView, 22), 200L);
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
                        org.telegram.ui.zn znVar3 = chatActivityEnterView.O2;
                        if (znVar3 != null) {
                            ci.f4 f4Var = znVar3.f40502y1;
                            if (f4Var != null) {
                                if (f4Var.V) {
                                    f4Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            znVar3.f40502y1 = null;
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
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.U0.t(false);
                    pf pfVar5 = chatActivityEnterView.E0;
                    if (pfVar5 != null) {
                        pfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f21991m2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f21946e2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.f21946e2 == 1) {
                                chatActivityEnterView.s1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.s1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.f22002o2) {
                    chatActivityEnterView.setFieldText("/");
                    pf pfVar6 = chatActivityEnterView.E0;
                    if (pfVar6 != null) {
                        pfVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.y3) {
                    chatActivityEnterView.m1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f28370b;
                org.telegram.ui.zn znVar4 = chatActivityEnterView4.O2;
                if (!chatActivityEnterView4.f21985k5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.t0()) {
                    chatActivityEnterView4.f22016r0 = new ie(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f21985k5) {
                        chatActivityEnterView4.n0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
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
                        chatActivityEnterView4.f22032u0 = new ie(chatActivityEnterView4, 4);
                        chatActivityEnterView4.P();
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
                    ef efVar = chatActivityEnterView4.f22010q0;
                    if (efVar != null) {
                        efVar.e = false;
                        efVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f21985k5) {
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
                    if (chatActivityEnterView4.f21985k5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        znVar4.getParentLayout().getOverlayContainerView();
                    }
                    ef efVar2 = new ef(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.O2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Y2.J(), new ai.r5(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.V3);
                    chatActivityEnterView4.f22010q0 = efVar2;
                    efVar2.e = true;
                    efVar2.f19609c = 220;
                    efVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f22010q0.setClippingEnabled(true);
                    chatActivityEnterView4.f22010q0.setFocusable(true);
                    chatActivityEnterView4.f22010q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f22010q0.setInputMethodMode(2);
                    chatActivityEnterView4.f22010q0.setSoftInputMode(0);
                    chatActivityEnterView4.f22010q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f22010q0.f19608b = false;
                    int i20 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && znVar4 != null) {
                        znVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i20;
                    } else {
                        i11 = i20;
                    }
                    int b13 = chatActivityEnterView4.Y2.b1();
                    int measuredHeight = chatActivityEnterView4.f22010q0.getContentView().getMeasuredHeight();
                    int q10 = chatActivityEnterView4.Y2.q();
                    if (q10 <= AndroidUtilities.dp(f7)) {
                        b13 += q10;
                    }
                    if (chatActivityEnterView4.W0) {
                        b13 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(f10);
                    int i21 = (i20 * 2) + b13;
                    if (znVar4 != null && znVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i21 - i12) - chatActivityEnterView4.f22010q0.f25404p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i20) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (znVar4 != null && znVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f22010q0.f25403o.getLayoutParams().height = ((b13 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    ef efVar3 = chatActivityEnterView4.f22010q0;
                    View view2 = efVar3.f25409u;
                    wl0 wl0Var = efVar3.v;
                    TLRPC.Peer peer5 = efVar3.f25406r;
                    dp0 dp0Var = efVar3.f25403o;
                    ai.f0 f0Var = efVar3.f25408t;
                    ArrayList arrayList2 = efVar3.f25413z;
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
                    dp0Var.setPivotX(0.0f);
                    dp0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = efVar3.f25407s.peers;
                    if (peer5 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        int i23 = 0;
                        while (i23 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i23).peer;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            wl0 wl0Var2 = wl0Var;
                            long j11 = peer6.channel_id;
                            if (j11 == 0 || j11 != peer5.channel_id) {
                                long j12 = peer6.user_id;
                                if (j12 == 0 || j12 != peer5.user_id) {
                                    long j13 = peer6.chat_id;
                                    if (j13 == 0 || j13 != peer5.chat_id) {
                                        i23++;
                                        wl0Var = wl0Var2;
                                        arrayList3 = arrayList4;
                                    }
                                }
                            }
                            if (i23 != arrayList4.size() - 1 && wl0Var2.getMeasuredHeight() < size2) {
                                i15 = wl0Var2.getMeasuredHeight() % dp;
                            } else {
                                i15 = 0;
                            }
                            efVar3.f25410w.h1(i23, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + i15);
                            if (wl0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    }
                    f0Var.setScaleX(0.25f);
                    f0Var.setScaleY(0.25f);
                    dp0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(f0Var, o1.h.f15474o);
                    kVar.f15490u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    kVar.b(new ap0(efVar3, 2));
                    o1.k kVar2 = new o1.k(f0Var, o1.h.f15475p);
                    kVar2.f15490u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    kVar2.b(new ap0(efVar3, 3));
                    o1.c cVar = o1.h.f15479t;
                    o1.k kVar3 = new o1.k(f0Var, cVar);
                    kVar3.f15490u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(dp0Var, cVar);
                    kVar4.f15490u = org.telegram.ui.Cells.c1.j(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new bp0(efVar3, kVar5, 1));
                        kVar5.f();
                    }
                    ef efVar4 = chatActivityEnterView4.f22010q0;
                    chatActivityEnterView4.f22022s0 = i11;
                    chatActivityEnterView4.f22027t0 = i14;
                    efVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f22005p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i24 = ChatActivityEnterView.f21917m5;
                chatActivityEnterView.d0();
                return;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var2 = chatActivityEnterView.U;
                if ((p1Var2 == null || !p1Var2.f19671f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.A2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.U;
                if ((p1Var3 == null || !p1Var3.f19671f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.q1();
                    return;
                }
                return;
            default:
                int i25 = ChatActivityEnterView.f21917m5;
                chatActivityEnterView.J0();
                return;
        }
    }
}
