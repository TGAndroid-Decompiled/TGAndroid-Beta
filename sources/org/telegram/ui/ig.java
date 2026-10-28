package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
public final class ig implements Runnable {
    public final int f40137a;
    public final wn f40138b;

    public ig(wn wnVar, int i10) {
        this.f40137a = i10;
        this.f40138b = wnVar;
    }

    @Override
    public final void run() {
        jk jkVar;
        View sendButton;
        View sendButton2;
        org.telegram.ui.ActionBar.g1 g1Var;
        boolean z10;
        boolean z11;
        fi.v3 v3Var;
        int i10 = this.f40137a;
        boolean z12 = true;
        wn wnVar = this.f40138b;
        switch (i10) {
            case 0:
                wnVar.G7 = null;
                org.telegram.ui.Components.u60 u60Var = wnVar.f45214n3;
                if (u60Var != null) {
                    org.telegram.ui.Components.r60 cameraContainer = u60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(wnVar.f45214n3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(wnVar.f45214n3.getPaint(), org.telegram.ui.Components.v6.f33570b, 0), ObjectAnimator.ofFloat(wnVar.f45214n3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new si(wnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 1:
                wnVar.A0.M.clear();
                hm hmVar = wnVar.A0;
                hmVar.L = false;
                hmVar.O(true);
                wnVar.fc(false);
                return;
            case 2:
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && (jkVar = wnVar.Y) != null && (sendButton = jkVar.getSendButton()) != null && wnVar.Y.getEditField() != null && wnVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (wnVar.f45275s2 == null) {
                        ej ejVar = new ej(4, 0, wnVar.getParentActivity(), wnVar.f45309ua, false);
                        wnVar.f45275s2 = ejVar;
                        ejVar.a();
                        wnVar.f45275s2.setAlpha(0.0f);
                        wnVar.f45275s2.setVisibility(4);
                        wnVar.f45275s2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        wnVar.f45163j1.addView(wnVar.f45275s2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    wnVar.f45275s2.f(sendButton, true);
                    wnVar.f45288t2 = true;
                    return;
                }
                return;
            case 3:
                jk jkVar2 = wnVar.Y;
                if (jkVar2 != null && wnVar.f45100dd != null) {
                    if (jkVar2.p0()) {
                        wnVar.Y.i0(false);
                        AndroidUtilities.showKeyboard(wnVar.f45100dd.f48653a);
                        wnVar.f45100dd.f48654b.f48650a.a(false, true);
                        return;
                    }
                    wnVar.Y.R0(false, false, false);
                    wnVar.Y.o1();
                    wnVar.f45100dd.f48654b.f48650a.a(true, true);
                    return;
                }
                return;
            case 4:
                wnVar.Fa();
                return;
            case 5:
                wnVar.p9();
                wnVar.Pc(0, true);
                return;
            case 6:
                wnVar.p8(false, true, 0.0f);
                return;
            case 7:
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && wnVar.Y != null && wnVar.Va == null && wnVar.getMessagesController().getSendPaidMessagesStars(wnVar.a()) <= 0 && (sendButton2 = wnVar.Y.getSendButton()) != null && wnVar.Y.getEditField() != null && wnVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (wnVar.f45301u2 == null) {
                        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(4, wnVar.getParentActivity(), wnVar.f45309ua, false);
                        wnVar.f45301u2 = t40Var;
                        t40Var.a();
                        wnVar.f45301u2.setAlpha(0.0f);
                        wnVar.f45301u2.setVisibility(4);
                        wnVar.f45301u2.setText(LocaleController.getString(R.string.ScheduledHint));
                        wnVar.f45163j1.addView(wnVar.f45301u2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    wnVar.f45301u2.f(sendButton2, true);
                    wnVar.f45314v2 = true;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.g1[] g1VarArr = wnVar.f45159i9;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    wnVar.f45159i9[0].performAccessibilityAction(64, null);
                    wnVar.f45159i9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = wnVar.K6;
                wnVar.f45149hc = System.currentTimeMillis();
                if (wnVar.f45339x0 != null && wnVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < wnVar.f45339x0.getChildCount(); i13++) {
                        View childAt = wnVar.f45339x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < s1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = s1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (s1Var.getMessageObject() != null) {
                                int id3 = s1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) wnVar.N6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = wnVar.getMessagesController().getTranslateController();
                                            if (id4 >= i11 - 7 && id4 <= i12 + 7) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            translateController.checkTranslation(messageObject2, z11);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(groupedMessages.groupId));
                                }
                            } else {
                                int id5 = messageObject.getId();
                                TranslateController translateController2 = wnVar.getMessagesController().getTranslateController();
                                if (id5 >= i11 - 7 && id5 <= i12 + 7) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                translateController2.checkTranslation(messageObject, z10);
                            }
                        }
                    }
                }
                if (wnVar.X4 > 0 && wnVar.V4 != null) {
                    wnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) wnVar.V4.get(Integer.valueOf(wnVar.X4)), true);
                }
                wnVar.ld();
                return;
            case 10:
                wnVar.p8(false, true, 0.0f);
                return;
            case 11:
                wnVar.fa();
                return;
            case 12:
                wn.T0(wnVar);
                return;
            case 13:
                wnVar.p8(false, true, 0.0f);
                return;
            case 14:
                wnVar.p8(false, true, 0.0f);
                return;
            case 15:
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wnVar.getParentActivity(), 3, wnVar.f45309ua);
                wnVar.Pb = e2Var;
                e2Var.setOnShowListener(new gf(wnVar, 1));
                wnVar.Pb.setOnCancelListener(wnVar.Ca);
                wnVar.Pb.r(500L);
                return;
            case 16:
                wnVar.p8(false, true, 0.0f);
                return;
            case 17:
                AndroidUtilities.removeFromParent(wnVar.X0);
                return;
            case 18:
                wnVar.W6();
                return;
            case 19:
                wnVar.J7(true);
                org.telegram.messenger.t.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.wc.b0(wnVar), R.raw.chats_infotip, 36);
                return;
            case 20:
                wnVar.A0.M.clear();
                hm hmVar2 = wnVar.A0;
                hmVar2.L = false;
                hmVar2.O(true);
                wnVar.fc(false);
                return;
            case 21:
                wnVar.f45044a = (wnVar.f45044a + 1) % 3;
                return;
            case 22:
                wnVar.f45057b = !wnVar.f45057b;
                return;
            case 23:
                wnVar.Oa = false;
                wnVar.Lc();
                return;
            case 24:
                wnVar.Ic = 0;
                wnVar.Jc = false;
                wnVar.f45339x0.g1();
                return;
            case 25:
                wnVar.A9();
                wnVar.C9();
                wnVar.A7();
                wnVar.C7();
                return;
            case 26:
                wnVar.Pc(0, (wnVar.f45120f6 == 0 || SystemClock.elapsedRealtime() < wnVar.f45120f6 + 150) ? false : false);
                return;
            case 27:
                mk mkVar = wnVar.f45090d3;
                if ((mkVar == null || mkVar.getVisibility() != 0) && (v3Var = wnVar.I1) != null) {
                    v3Var.u();
                    return;
                }
                return;
            case 28:
                wnVar.t7();
                return;
            default:
                wnVar.j7(false);
                return;
        }
    }
}
