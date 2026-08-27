package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.view.View;
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

public final class gd implements View.OnClickListener {

    public final int f28592a;

    public final ChatActivityEnterView f28593b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28592a = i10;
        this.f28593b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        ag agVar;
        boolean z10;
        qf qfVar;
        bf bfVar;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r10;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peerL;
        int i10;
        int iDp;
        int i11 = this.f28592a;
        ChatActivityEnterView chatActivityEnterView = this.f28593b;
        switch (i11) {
            case 0:
                bf bfVar2 = chatActivityEnterView.A0;
                String string = bfVar2 != null ? bfVar2.getText().toString() : "";
                int iIndexOf = string.indexOf(32);
                if (iIndexOf == -1 || iIndexOf == string.length() - 1) {
                    chatActivityEnterView.setFieldText("");
                } else {
                    chatActivityEnterView.setFieldText(string.substring(0, iIndexOf + 1));
                }
                break;
            case 1:
                ye yeVar = chatActivityEnterView.H0;
                if (yeVar == null || yeVar.m0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f26153o2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f26077b0 == null) {
                        chatActivityEnterView.S0();
                    }
                }
                break;
            case 2:
                ag agVar2 = chatActivityEnterView.U2;
                if (agVar2 != null) {
                    agVar2.w0();
                }
                break;
            case 3:
                int i12 = ChatActivityEnterView.f26070i5;
                if (chatActivityEnterView.W1 != null) {
                    if (chatActivityEnterView.V - chatActivityEnterView.W < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.U;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.U.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    } else {
                        wf wfVarY = chatActivityEnterView.y();
                        chatActivityEnterView.X1 = wfVarY;
                        qf.v vVarD = qf.v.d(chatActivityEnterView.M);
                        String str = chatActivityEnterView.W1.link;
                        String str2 = wfVarY.f34173a;
                        ArrayList<TLRPC.MessageEntity> arrayList = wfVarY.f34174b;
                        ed edVar = new ed(chatActivityEnterView, 14);
                        TL_account.TL_businessChatLink tL_businessChatLinkC = vVarD.c(str);
                        if (tL_businessChatLinkC != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList;
                            tL_inputBusinessChatLink.title = tL_businessChatLinkC.title;
                            vVarD.b(tL_businessChatLinkC, tL_inputBusinessChatLink, edVar);
                            break;
                        }
                    }
                }
                break;
            case 4:
                if (chatActivityEnterView.O4 == BotForumHelper.SteamingSendButtonState.STOP && (agVar = chatActivityEnterView.U2) != null) {
                    agVar.r1();
                    break;
                }
                break;
            case 5:
                if (chatActivityEnterView.O0.getVisibility() == 0 && chatActivityEnterView.O0.getAlpha() == 1.0f && !chatActivityEnterView.f26107f3) {
                    if (!chatActivityEnterView.f26185u2 || (bfVar = chatActivityEnterView.A0) == null || !bfVar.isFocused()) {
                        if (!chatActivityEnterView.f26186u3) {
                            if (!chatActivityEnterView.f26213z3) {
                                z10 = true;
                                chatActivityEnterView.Q0.Q(true);
                            }
                            if (!chatActivityEnterView.f26213z3) {
                                chatActivityEnterView.m1(chatActivityEnterView.f26186u3 ^ z10, z10, false, z10);
                            }
                            break;
                        } else if (chatActivityEnterView.M1 != 0) {
                            chatActivityEnterView.l1(0, true);
                            chatActivityEnterView.Q0.u(true);
                            chatActivityEnterView.Q0.C();
                            if (chatActivityEnterView.f26181t3) {
                                chatActivityEnterView.K(true);
                            }
                        } else if (!chatActivityEnterView.f26213z3 && (qfVar = chatActivityEnterView.Q0) != null) {
                            qfVar.Q(false);
                        }
                        z10 = true;
                        if (!chatActivityEnterView.f26213z3) {
                            chatActivityEnterView.m1(chatActivityEnterView.f26186u3 ^ z10, z10, false, z10);
                        }
                    }
                    break;
                }
                break;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f26153o2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    xj0 xj0Var = chatActivityEnterView.f26091d1;
                    if (xj0Var != null) {
                        xj0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.Z2 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.C3);
                        chatActivityEnterView.U2.X1(2, 0, chatActivityEnterView.K ? Integer.MAX_VALUE : 0, chatActivityEnterView.N4, 0L, true);
                        ke keVar = chatActivityEnterView.F0;
                        chatActivityEnterView.N4 = 0L;
                        keVar.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.Y2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.X2 != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.ui.Cells.pa.v(chatActivityEnterView.X2, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.X2).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                    long j10 = chatActivityEnterView.L2;
                    org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
                    mediaDataController.pushDraftVoiceMessage(j10, (rnVar == null || !rnVar.f42017d4) ? 0L : rnVar.b(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.f26098e1 = 0L;
                    chatActivityEnterView.o0(false);
                    chatActivityEnterView.K(true);
                }
                break;
            case 7:
                nh.a0 a0Var = chatActivityEnterView.f26116h0;
                boolean z14 = a0Var.v;
                a0Var.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.j0()) {
                    if (!z14) {
                        if (chatActivityEnterView.S0 || chatActivityEnterView.T0) {
                            AndroidUtilities.runOnUIThread(new ed(chatActivityEnterView, 13), 275L);
                            chatActivityEnterView.m0(false);
                        } else {
                            chatActivityEnterView.L0();
                        }
                    }
                } else if (z14) {
                    ze zeVar = chatActivityEnterView.f26122i0;
                    if (zeVar != null) {
                        zeVar.c();
                    }
                } else {
                    if (chatActivityEnterView.f26122i0 == null) {
                        ze zeVar2 = new ze(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.f26122i0 = zeVar2;
                        hh.f1 f1Var = zeVar2.f19010c;
                        chatActivityEnterView.getContext();
                        f1Var.setLayoutManager(new f2.k0());
                        hh.f1 f1Var2 = chatActivityEnterView.f26122i0.f19010c;
                        nh.z zVar = new nh.z();
                        zVar.f19062c = new ArrayList();
                        zVar.d = new ArrayList();
                        zVar.f19063e = new ArrayList();
                        chatActivityEnterView.f26127j0 = zVar;
                        f1Var2.setAdapter(zVar);
                        chatActivityEnterView.f26122i0.f19010c.setOnItemClickListener(new af(chatActivityEnterView));
                        chatActivityEnterView.f26122i0.f19010c.setOnItemLongClickListener(new ee(chatActivityEnterView));
                        chatActivityEnterView.f26122i0.setClipToPadding(false);
                        chatActivityEnterView.f26117h1.addView(chatActivityEnterView.f26122i0, h7.z5.e(-1, -1, 80));
                        chatActivityEnterView.f26122i0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.S4;
                        if (hVar != null) {
                            chatActivityEnterView.f26127j0.E(hVar);
                        }
                        chatActivityEnterView.B1();
                    }
                    ze zeVar3 = chatActivityEnterView.f26122i0;
                    if (zeVar3.getVisibility() != 0) {
                        zeVar3.setVisibility(0);
                        zeVar3.f19010c.u0(0);
                        zeVar3.f19013n = true;
                        zeVar3.f19012f = false;
                    } else if (zeVar3.f19012f) {
                        zeVar3.f19012f = false;
                        zeVar3.a();
                        zeVar3.d(false);
                    }
                }
                break;
            case 8:
                ag agVar3 = chatActivityEnterView.U2;
                if (agVar3 != null && !agVar3.g()) {
                    ag agVar4 = chatActivityEnterView.U2;
                    ig igVar = chatActivityEnterView.B0;
                    agVar4.l1(igVar, igVar.f29359a.getText(), true);
                    break;
                }
                break;
            case 9:
                SharedPreferences.Editor editorEdit = MessagesController.getInstance(chatActivityEnterView.M).getMainSettings().edit();
                org.telegram.ui.rn rnVar2 = chatActivityEnterView.K2;
                if (BirthdayController.isToday(rnVar2.W7)) {
                    editorEdit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + rnVar2.a(), false);
                } else {
                    editorEdit.putBoolean("show_gift_for_" + rnVar2.a(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.M).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.M).giftTextFieldIcon) {
                    editorEdit.putBoolean("show_gift_for_" + rnVar2.a(), false);
                }
                editorEdit.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.M).getUserFull(UserConfig.getInstance(chatActivityEnterView.M).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().W7 == null || !chatActivityEnterView.getParentFragment().W7.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.F1, false);
                }
                TLRPC.User userI = chatActivityEnterView.getParentFragment().i();
                if (userI != null) {
                    boolean z15 = chatActivityEnterView.getParentFragment().W7 != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().W7.birthday);
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(chatActivityEnterView.getContext(), 3, null);
                    b2Var.q(200L);
                    b2Var.setOnCancelListener(new hh.x(chatActivityEnterView, cg.q0.j(chatActivityEnterView.M, null, new jh.d3(chatActivityEnterView, b2Var, userI, z15)), 4));
                    break;
                }
                break;
            case 10:
                int i13 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.J0();
                break;
            case 11:
                xe xeVar = chatActivityEnterView.J0;
                if (xeVar != null && xeVar.isShowing()) {
                    chatActivityEnterView.J0.dismiss();
                }
                y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new o0.b(chatActivityEnterView, 5), chatActivityEnterView.R3);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f28593b;
                xe xeVar2 = chatActivityEnterView2.J0;
                if (xeVar2 != null && xeVar2.isShowing()) {
                    chatActivityEnterView2.J0.dismiss();
                }
                chatActivityEnterView2.T0(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f28593b;
                xe xeVar3 = chatActivityEnterView3.J0;
                if (xeVar3 != null && xeVar3.isShowing()) {
                    chatActivityEnterView3.J0.dismiss();
                }
                chatActivityEnterView3.T0(0, false, 0, true, 0L);
                break;
            case 14:
                org.telegram.ui.ActionBar.p1 p1Var = chatActivityEnterView.Q;
                if (p1Var == null || !p1Var.f23711f) {
                    if (chatActivityEnterView.f26193w0) {
                        chatActivityEnterView.t1();
                    } else if (chatActivityEnterView.t0() && chatActivityEnterView.a2 == 0) {
                        if (chatActivityEnterView.M1 != 0) {
                            z13 = false;
                            chatActivityEnterView.l1(0, true);
                            qf qfVar2 = chatActivityEnterView.Q0;
                            if (qfVar2 != null) {
                                qfVar2.u(false);
                            }
                            bf bfVar3 = chatActivityEnterView.A0;
                            if (bfVar3 != null) {
                                bfVar3.requestFocus();
                            }
                        } else {
                            z13 = false;
                        }
                        if (chatActivityEnterView.f26186u3) {
                            chatActivityEnterView.m1(z13, true, z13, true);
                            chatActivityEnterView.f26113g3 = true;
                            AndroidUtilities.runOnUIThread(new ed(chatActivityEnterView, 22), 200L);
                        } else {
                            chatActivityEnterView.I0();
                        }
                    } else {
                        chatActivityEnterView.s1(1, 0, true, true);
                        qf qfVar3 = chatActivityEnterView.Q0;
                        bf bfVar4 = chatActivityEnterView.A0;
                        boolean z16 = bfVar4 != null && bfVar4.length() > 0;
                        org.telegram.ui.rn rnVar3 = chatActivityEnterView.K2;
                        if (rnVar3 == null) {
                            z11 = false;
                        } else {
                            lh.w3 w3Var = rnVar3.f42227u1;
                            if (w3Var != null) {
                                if (w3Var.R) {
                                    w3Var.e(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            rnVar3.f42227u1 = null;
                            if (z12) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        qfVar3.F(z16, z11);
                    }
                }
                break;
            case 15:
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.Q0.u(false);
                    bf bfVar5 = chatActivityEnterView.A0;
                    if (bfVar5 != null) {
                        bfVar5.requestFocus();
                    }
                }
                if (chatActivityEnterView.f26124i2 != null) {
                    if (chatActivityEnterView.t0()) {
                        r10 = 1;
                        if (chatActivityEnterView.a2 == 1) {
                            if (chatActivityEnterView.t0() && chatActivityEnterView.a2 == 1) {
                                chatActivityEnterView.s1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.s1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.f26134k2) {
                    chatActivityEnterView.setFieldText("/");
                    bf bfVar6 = chatActivityEnterView.A0;
                    if (bfVar6 != null) {
                        bfVar6.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.f26186u3) {
                    chatActivityEnterView.m1(false, false, false, true);
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f28593b;
                org.telegram.ui.rn rnVar4 = chatActivityEnterView4.K2;
                if (!chatActivityEnterView4.f26115g5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.t0()) {
                    if (chatActivityEnterView4.U2.i() > AndroidUtilities.dp(20.0f)) {
                        int iP0 = chatActivityEnterView4.U2.P0();
                        int i14 = chatActivityEnterView4.U2.i();
                        if (i14 <= AndroidUtilities.dp(20.0f)) {
                            iP0 += i14;
                        }
                        if (chatActivityEnterView4.S0) {
                            iP0 -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (iP0 < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.f26161q0 = new ud(chatActivityEnterView4, 4);
                            chatActivityEnterView4.P();
                        }
                    }
                    if (chatActivityEnterView4.U2.y() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                            break;
                        } catch (Exception unused3) {
                        }
                        re reVar = chatActivityEnterView4.m0;
                        if (reVar != null) {
                            reVar.f23684e = false;
                            reVar.l(new o1.j[0]);
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.M);
                            if (chatActivityEnterView4.f26115g5) {
                                peerL = chatActivityEnterView4.U2.l();
                                chatFull = null;
                            } else {
                                MessagesController.getInstance(chatActivityEnterView4.M).getChat(Long.valueOf(-chatActivityEnterView4.L2));
                                TLRPC.ChatFull chatFull2 = MessagesController.getInstance(chatActivityEnterView4.M).getChatFull(-chatActivityEnterView4.L2);
                                chatFull = chatFull2;
                                peerL = chatFull2 != null ? chatFull2.default_send_as : null;
                            }
                            if (peerL == null && chatActivityEnterView4.U2.y() != null && !chatActivityEnterView4.U2.y().peers.isEmpty()) {
                                peerL = chatActivityEnterView4.U2.y().peers.get(0).peer;
                            }
                            TLRPC.Peer peer = peerL;
                            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.L2)));
                            if (chatActivityEnterView4.f26115g5) {
                            } else {
                                rnVar4.getParentLayout().getOverlayContainerView();
                            }
                            re reVar2 = new re(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.K2, messagesController, zIsChannelAndNotMegaGroup, peer, chatActivityEnterView4.U2.y(), new ag.l0(chatActivityEnterView4, chatFull, messagesController, 21), chatActivityEnterView4.R3);
                            chatActivityEnterView4.m0 = reVar2;
                            reVar2.f23684e = true;
                            reVar2.f23683c = 220;
                            reVar2.setOutsideTouchable(true);
                            chatActivityEnterView4.m0.setClippingEnabled(true);
                            chatActivityEnterView4.m0.setFocusable(true);
                            chatActivityEnterView4.m0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            chatActivityEnterView4.m0.setInputMethodMode(2);
                            chatActivityEnterView4.m0.setSoftInputMode(0);
                            chatActivityEnterView4.m0.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.m0.f23682b = false;
                            int i15 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || rnVar4 == null) {
                                i10 = i15;
                            } else {
                                rnVar4.getFragmentView().getLocationInWindow(iArr);
                                i10 = iArr[0] + i15;
                            }
                            int iP1 = chatActivityEnterView4.U2.P0();
                            int measuredHeight = chatActivityEnterView4.m0.getContentView().getMeasuredHeight();
                            int i16 = chatActivityEnterView4.U2.i();
                            if (i16 <= AndroidUtilities.dp(20.0f)) {
                                iP1 += i16;
                            }
                            if (chatActivityEnterView4.S0) {
                                iP1 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(1.0f);
                            if (measuredHeight < (((i15 * 2) + iP1) - ((rnVar4 == null || !rnVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.m0.f28412p.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                iDp = ((iArr[1] - measuredHeight) - i15) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i17 = (rnVar4 == null || !rnVar4.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.m0.f28411o.getLayoutParams().height = ((iP1 - i17) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                iDp = i17;
                            }
                            re reVar3 = chatActivityEnterView4.m0;
                            View view2 = reVar3.f28417u;
                            zk0 zk0Var = reVar3.v;
                            TLRPC.Peer peer2 = reVar3.f28414r;
                            zn0 zn0Var = reVar3.f28411o;
                            ag.p1 p1Var2 = reVar3.f28416t;
                            ArrayList arrayList2 = reVar3.f28421z;
                            int size = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                Object obj = arrayList2.get(i18);
                                i18++;
                                ((o1.j) obj).c();
                            }
                            arrayList2.clear();
                            p1Var2.setPivotX(AndroidUtilities.dp(8.0f));
                            p1Var2.setPivotY(p1Var2.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            zn0Var.setPivotX(0.0f);
                            zn0Var.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = reVar3.f28415s.peers;
                            if (peer2 != null) {
                                int iDp2 = AndroidUtilities.dp(54.0f);
                                int size2 = arrayList3.size() * iDp2;
                                int i19 = 0;
                                while (true) {
                                    if (i19 < arrayList3.size()) {
                                        TLRPC.Peer peer3 = arrayList3.get(i19).peer;
                                        ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                                        int i20 = iDp2;
                                        long j11 = peer3.channel_id;
                                        if (j11 == 0 || j11 != peer2.channel_id) {
                                            long j12 = peer3.user_id;
                                            if (j12 == 0 || j12 != peer2.user_id) {
                                                long j13 = peer3.chat_id;
                                                if (j13 == 0 || j13 != peer2.chat_id) {
                                                    i19++;
                                                    arrayList3 = arrayList4;
                                                    iDp2 = i20;
                                                }
                                            }
                                        }
                                        reVar3.f28418w.h1(i19, (size2 - ((arrayList4.size() - 2) * i20)) + AndroidUtilities.dp(7.0f) + ((i19 == arrayList4.size() + (-1) || zk0Var.getMeasuredHeight() >= size2) ? 0 : zk0Var.getMeasuredHeight() % i20));
                                        if (zk0Var.computeVerticalScrollOffset() > 0) {
                                            view2.animate().cancel();
                                            view2.animate().alpha(1.0f).setDuration(150L).start();
                                        }
                                    }
                                }
                            }
                            p1Var2.setScaleX(0.25f);
                            p1Var2.setScaleY(0.25f);
                            zn0Var.setAlpha(0.25f);
                            o1.j jVar = new o1.j(p1Var2, o1.h.f19131o);
                            jVar.f19147u = org.telegram.ui.Cells.pa.k(1.0f, 750.0f, 1.0f);
                            jVar.b(new wn0(reVar3, 2));
                            o1.j jVar2 = new o1.j(p1Var2, o1.h.f19132p);
                            jVar2.f19147u = org.telegram.ui.Cells.pa.k(1.0f, 750.0f, 1.0f);
                            jVar2.b(new wn0(reVar3, 3));
                            o1.c cVar = o1.h.f19136t;
                            o1.j jVar3 = new o1.j(p1Var2, cVar);
                            jVar3.f19147u = org.telegram.ui.Cells.pa.k(1.0f, 750.0f, 1.0f);
                            o1.j jVar4 = new o1.j(zn0Var, cVar);
                            jVar4.f19147u = org.telegram.ui.Cells.pa.k(1.0f, 750.0f, 1.0f);
                            for (o1.j jVar5 : Arrays.asList(jVar, jVar2, jVar3, jVar4)) {
                                arrayList2.add(jVar5);
                                jVar5.a(new xn0(reVar3, jVar5, 1));
                                jVar5.f();
                            }
                            re reVar4 = chatActivityEnterView4.m0;
                            chatActivityEnterView4.f26151o0 = i10;
                            chatActivityEnterView4.f26156p0 = iDp;
                            reVar4.showAtLocation(view, 51, i10, iDp);
                            chatActivityEnterView4.f26137l0.setProgress(1.0f);
                        }
                    }
                    break;
                } else {
                    chatActivityEnterView4.f26146n0 = new ud(chatActivityEnterView4, 3);
                    if (chatActivityEnterView4.f26115g5) {
                        chatActivityEnterView4.n0(true, false, true);
                    } else {
                        chatActivityEnterView4.n0(true, true, true);
                    }
                }
                break;
            case 17:
                int i21 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.d0();
                break;
            case 18:
                org.telegram.ui.ActionBar.p1 p1Var3 = chatActivityEnterView.Q;
                if ((p1Var3 == null || !p1Var3.f23711f) && chatActivityEnterView.B != 0.0f) {
                    chatActivityEnterView.U2.q2();
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.p1 p1Var4 = chatActivityEnterView.Q;
                if ((p1Var4 == null || !p1Var4.f23711f) && chatActivityEnterView.B != 0.0f) {
                    chatActivityEnterView.U2.i1();
                }
                break;
            default:
                int i22 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.J0();
                break;
        }
    }
}
