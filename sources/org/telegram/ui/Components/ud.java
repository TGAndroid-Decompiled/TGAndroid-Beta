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
    public final int f30890a;
    public final ChatActivityEnterView f30891b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30890a = i10;
        this.f30891b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        og ogVar;
        boolean z10;
        eg egVar;
        qf qfVar;
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
        int i16 = this.f30890a;
        ChatActivityEnterView chatActivityEnterView = this.f30891b;
        switch (i16) {
            case 0:
                qf qfVar2 = chatActivityEnterView.E0;
                if (qfVar2 == null) {
                    str = "";
                } else {
                    str = qfVar2.getText().toString();
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
                nf nfVar = chatActivityEnterView.L0;
                if (nfVar == null || nfVar.f35175q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f23796s2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f23723f0 == null) {
                        chatActivityEnterView.S0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                og ogVar2 = chatActivityEnterView.Y2;
                if (ogVar2 != null) {
                    ogVar2.G0();
                    return;
                }
                return;
            case 3:
                int i17 = ChatActivityEnterView.f23688m5;
                if (chatActivityEnterView.a2 != null) {
                    if (chatActivityEnterView.f23703c0 - chatActivityEnterView.f23709d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f23696b0;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.f23696b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    kg x10 = chatActivityEnterView.x();
                    chatActivityEnterView.f23698b2 = x10;
                    ig.y d = ig.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.a2.link;
                    String str3 = x10.f27848a;
                    ArrayList<TLRPC.MessageEntity> arrayList = x10.f27849b;
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
                if (chatActivityEnterView.S4 == BotForumHelper.SteamingSendButtonState.STOP && (ogVar = chatActivityEnterView.Y2) != null) {
                    ogVar.t1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.j3) {
                    if (!chatActivityEnterView.f23829y2 || (qfVar = chatActivityEnterView.E0) == null || !qfVar.isFocused()) {
                        if (chatActivityEnterView.y3) {
                            if (chatActivityEnterView.Q1 != 0) {
                                z10 = true;
                                chatActivityEnterView.m1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.B();
                                if (chatActivityEnterView.f23824x3) {
                                    chatActivityEnterView.K(true);
                                }
                            } else {
                                if (!chatActivityEnterView.D3 && (egVar = chatActivityEnterView.U0) != null) {
                                    egVar.Q(false);
                                }
                                z10 = true;
                            }
                        } else {
                            if (!chatActivityEnterView.D3) {
                                z10 = true;
                                chatActivityEnterView.U0.Q(true);
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
                AnimatorSet animatorSet2 = chatActivityEnterView.f23796s2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    gk0 gk0Var = chatActivityEnterView.f23736h1;
                    if (gk0Var != null) {
                        gk0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f23712d3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.G3);
                        og ogVar3 = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ogVar3.c2(2, 0, i10, chatActivityEnterView.R4, 0L, true);
                        ye yeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f23706c3) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.f23699b3 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            com.google.android.gms.internal.vision.e2.t(chatActivityEnterView.f23699b3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f23699b3).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.P2;
                    org.telegram.ui.co coVar = chatActivityEnterView.O2;
                    if (coVar != null && coVar.f35304h4) {
                        j3 = coVar.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f23742i1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.K(true);
                    return;
                }
                return;
            case 7:
                fi.c0 c0Var = chatActivityEnterView.f23758l0;
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
                        of ofVar = new of(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = ofVar;
                        bi.o0 o0Var = ofVar.f10128c;
                        chatActivityEnterView.getContext();
                        o0Var.setLayoutManager(new s4.c0());
                        bi.o0 o0Var2 = chatActivityEnterView.m0.f10128c;
                        ?? h0Var = new s4.h0();
                        h0Var.f9581c = new ArrayList();
                        h0Var.d = new ArrayList();
                        h0Var.f9582e = new ArrayList();
                        chatActivityEnterView.f23767n0 = h0Var;
                        o0Var2.setAdapter(h0Var);
                        chatActivityEnterView.m0.f10128c.setOnItemClickListener(new pf(chatActivityEnterView));
                        chatActivityEnterView.m0.f10128c.setOnItemLongClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.l1.addView(chatActivityEnterView.m0, w7.x5.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.i iVar = chatActivityEnterView.W4;
                        if (iVar != null) {
                            chatActivityEnterView.f23767n0.E(iVar);
                        }
                        chatActivityEnterView.C1();
                    }
                    of ofVar2 = chatActivityEnterView.m0;
                    if (ofVar2.getVisibility() != 0) {
                        ofVar2.setVisibility(0);
                        ofVar2.f10128c.u0(0);
                        ofVar2.f10131n = true;
                        ofVar2.f10130f = false;
                        return;
                    } else if (ofVar2.f10130f) {
                        ofVar2.f10130f = false;
                        ofVar2.a();
                        ofVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    of ofVar3 = chatActivityEnterView.m0;
                    if (ofVar3 != null) {
                        ofVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                og ogVar4 = chatActivityEnterView.Y2;
                if (ogVar4 != null && !ogVar4.l()) {
                    og ogVar5 = chatActivityEnterView.Y2;
                    wg wgVar = chatActivityEnterView.F0;
                    ogVar5.n1(wgVar, wgVar.f32289a.getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = MessagesController.getInstance(chatActivityEnterView.Q).getMainSettings().edit();
                org.telegram.ui.co coVar2 = chatActivityEnterView.O2;
                if (BirthdayController.isToday(coVar2.f35219a8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + coVar2.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + coVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.Q).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.Q).giftTextFieldIcon) {
                    edit.putBoolean("show_gift_for_" + coVar2.a(), false);
                }
                edit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.Q).getUserFull(UserConfig.getInstance(chatActivityEnterView.Q).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().f35219a8 == null || !chatActivityEnterView.getParentFragment().f35219a8.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.J1, false);
                }
                TLRPC.User i18 = chatActivityEnterView.getParentFragment().i();
                if (i18 != null) {
                    if (chatActivityEnterView.getParentFragment().f35219a8 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().f35219a8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new org.telegram.ui.ba(chatActivityEnterView, ug.t.j(chatActivityEnterView.Q, null, new bi.f4(chatActivityEnterView, b2Var, i18, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i19 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.J0();
                return;
            case 11:
                mf mfVar = chatActivityEnterView.N0;
                if (mfVar != null && mfVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new l.d(chatActivityEnterView, 11), chatActivityEnterView.V3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f30891b;
                mf mfVar2 = chatActivityEnterView2.N0;
                if (mfVar2 != null && mfVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f30891b;
                mf mfVar3 = chatActivityEnterView3.N0;
                if (mfVar3 != null && mfVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                return;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.U;
                if (p1Var == null || !p1Var.f21307f) {
                    if (chatActivityEnterView.A0) {
                        chatActivityEnterView.u1();
                        return;
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.f23718e2 == 0) {
                        if (chatActivityEnterView.Q1 != 0) {
                            z15 = false;
                            chatActivityEnterView.m1(0, true);
                            eg egVar2 = chatActivityEnterView.U0;
                            if (egVar2 != null) {
                                egVar2.t(false);
                            }
                            qf qfVar3 = chatActivityEnterView.E0;
                            if (qfVar3 != null) {
                                qfVar3.requestFocus();
                            }
                        } else {
                            z15 = false;
                        }
                        if (chatActivityEnterView.y3) {
                            chatActivityEnterView.n1(z15, true, z15, true);
                            chatActivityEnterView.f23755k3 = true;
                            AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 22), 200L);
                            return;
                        }
                        chatActivityEnterView.I0();
                        return;
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        eg egVar3 = chatActivityEnterView.U0;
                        qf qfVar4 = chatActivityEnterView.E0;
                        if (qfVar4 != null && qfVar4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        org.telegram.ui.co coVar3 = chatActivityEnterView.O2;
                        if (coVar3 != null) {
                            di.f4 f4Var = coVar3.f35514y1;
                            if (f4Var != null) {
                                if (f4Var.V) {
                                    f4Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            coVar3.f35514y1 = null;
                            if (z14) {
                                z13 = true;
                                egVar3.F(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        egVar3.F(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    qf qfVar5 = chatActivityEnterView.E0;
                    if (qfVar5 != null) {
                        qfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f23763m2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f23718e2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.f23718e2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.t1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.f23774o2) {
                    chatActivityEnterView.setFieldText("/");
                    qf qfVar6 = chatActivityEnterView.E0;
                    if (qfVar6 != null) {
                        qfVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.y3) {
                    chatActivityEnterView.n1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f30891b;
                org.telegram.ui.co coVar4 = chatActivityEnterView4.O2;
                if (!chatActivityEnterView4.f23757k5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.t0()) {
                    chatActivityEnterView4.f23788r0 = new ie(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f23757k5) {
                        chatActivityEnterView4.n0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Y2.p() > AndroidUtilities.dp(20.0f)) {
                    int W0 = chatActivityEnterView4.Y2.W0();
                    int p5 = chatActivityEnterView4.Y2.p();
                    f7 = 20.0f;
                    if (p5 <= AndroidUtilities.dp(20.0f)) {
                        W0 += p5;
                    }
                    if (chatActivityEnterView4.W0) {
                        W0 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (W0 < AndroidUtilities.dp(200.0f)) {
                        chatActivityEnterView4.f23804u0 = new ie(chatActivityEnterView4, 4);
                        chatActivityEnterView4.P();
                        return;
                    }
                } else {
                    f7 = 20.0f;
                }
                if (chatActivityEnterView4.Y2.H() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    ff ffVar = chatActivityEnterView4.f23782q0;
                    if (ffVar != null) {
                        ffVar.f21238e = false;
                        ffVar.l(new o1.k[0]);
                        return;
                    }
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f23757k5) {
                        peer2 = chatActivityEnterView4.Y2.q();
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
                    if (peer2 == null && chatActivityEnterView4.Y2.H() != null && !chatActivityEnterView4.Y2.H().peers.isEmpty()) {
                        peer2 = chatActivityEnterView4.Y2.H().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer2;
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.P2)));
                    if (chatActivityEnterView4.f23757k5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        coVar4.getParentLayout().getOverlayContainerView();
                    }
                    ff ffVar2 = new ff(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.O2, messagesController, isChannelAndNotMegaGroup, peer4, chatActivityEnterView4.Y2.H(), new androidx.car.app.utils.a(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.V3);
                    chatActivityEnterView4.f23782q0 = ffVar2;
                    ffVar2.f21238e = true;
                    ffVar2.f21237c = 220;
                    ffVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f23782q0.setClippingEnabled(true);
                    chatActivityEnterView4.f23782q0.setFocusable(true);
                    chatActivityEnterView4.f23782q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f23782q0.setInputMethodMode(2);
                    chatActivityEnterView4.f23782q0.setSoftInputMode(0);
                    chatActivityEnterView4.f23782q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f23782q0.f21236b = false;
                    int i20 = -AndroidUtilities.dp(4.0f);
                    int[] iArr = new int[2];
                    if (AndroidUtilities.isTablet() && coVar4 != null) {
                        coVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i20;
                    } else {
                        i11 = i20;
                    }
                    int W02 = chatActivityEnterView4.Y2.W0();
                    int measuredHeight = chatActivityEnterView4.f23782q0.getContentView().getMeasuredHeight();
                    int p10 = chatActivityEnterView4.Y2.p();
                    if (p10 <= AndroidUtilities.dp(f7)) {
                        W02 += p10;
                    }
                    if (chatActivityEnterView4.W0) {
                        W02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    AndroidUtilities.dp(f10);
                    int i21 = (i20 * 2) + W02;
                    if (coVar4 != null && coVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = AndroidUtilities.statusBarHeight;
                    }
                    if (measuredHeight < (i21 - i12) - chatActivityEnterView4.f23782q0.f31408p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i14 = ((iArr[1] - measuredHeight) - i20) - AndroidUtilities.dp(2.0f);
                    } else {
                        if (coVar4 != null && coVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = AndroidUtilities.statusBarHeight;
                        }
                        chatActivityEnterView4.f23782q0.f31407o.getLayoutParams().height = ((W02 - i13) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                        i14 = i13;
                    }
                    ff ffVar3 = chatActivityEnterView4.f23782q0;
                    View view2 = ffVar3.f31413u;
                    ll0 ll0Var = ffVar3.v;
                    TLRPC.Peer peer5 = ffVar3.f31410r;
                    po0 po0Var = ffVar3.f31407o;
                    ah.y yVar = ffVar3.f31412t;
                    ArrayList arrayList2 = ffVar3.f31417z;
                    int size = arrayList2.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj = arrayList2.get(i22);
                        i22++;
                        ((o1.k) obj).c();
                    }
                    arrayList2.clear();
                    yVar.setPivotX(AndroidUtilities.dp(8.0f));
                    yVar.setPivotY(yVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                    po0Var.setPivotX(0.0f);
                    po0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = ffVar3.f31411s.peers;
                    if (peer5 != null) {
                        int dp = AndroidUtilities.dp(54.0f);
                        int size2 = arrayList3.size() * dp;
                        int i23 = 0;
                        while (i23 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i23).peer;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            ll0 ll0Var2 = ll0Var;
                            long j11 = peer6.channel_id;
                            if (j11 == 0 || j11 != peer5.channel_id) {
                                long j12 = peer6.user_id;
                                if (j12 == 0 || j12 != peer5.user_id) {
                                    long j13 = peer6.chat_id;
                                    if (j13 == 0 || j13 != peer5.chat_id) {
                                        i23++;
                                        ll0Var = ll0Var2;
                                        arrayList3 = arrayList4;
                                    }
                                }
                            }
                            if (i23 != arrayList4.size() - 1 && ll0Var2.getMeasuredHeight() < size2) {
                                i15 = ll0Var2.getMeasuredHeight() % dp;
                            } else {
                                i15 = 0;
                            }
                            ffVar3.f31414w.h1(i23, (size2 - ((arrayList4.size() - 2) * dp)) + AndroidUtilities.dp(7.0f) + i15);
                            if (ll0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    }
                    yVar.setScaleX(0.25f);
                    yVar.setScaleY(0.25f);
                    po0Var.setAlpha(0.25f);
                    o1.k kVar = new o1.k(yVar, o1.h.f16835o);
                    kVar.f16852u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                    kVar.b(new mo0(ffVar3, 2));
                    o1.k kVar2 = new o1.k(yVar, o1.h.f16836p);
                    kVar2.f16852u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                    kVar2.b(new mo0(ffVar3, 3));
                    o1.c cVar = o1.h.f16840t;
                    o1.k kVar3 = new o1.k(yVar, cVar);
                    kVar3.f16852u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                    o1.k kVar4 = new o1.k(po0Var, cVar);
                    kVar4.f16852u = org.telegram.ui.Cells.p6.l(1.0f, 750.0f, 1.0f);
                    for (o1.k kVar5 : Arrays.asList(kVar, kVar2, kVar3, kVar4)) {
                        arrayList2.add(kVar5);
                        kVar5.a(new no0(ffVar3, kVar5, 1));
                        kVar5.f();
                    }
                    ff ffVar4 = chatActivityEnterView4.f23782q0;
                    chatActivityEnterView4.f23794s0 = i11;
                    chatActivityEnterView4.f23799t0 = i14;
                    ffVar4.showAtLocation(view, 51, i11, i14);
                    chatActivityEnterView4.f23777p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i24 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.d0();
                return;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var2 = chatActivityEnterView.U;
                if ((p1Var2 == null || !p1Var2.f21307f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.r2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.U;
                if ((p1Var3 == null || !p1Var3.f21307f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Y2.k1();
                    return;
                }
                return;
            default:
                int i25 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.J0();
                return;
        }
    }
}
