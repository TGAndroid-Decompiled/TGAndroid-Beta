package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
public final class jg implements Runnable {
    public final int f40622a;
    public final un f40623b;

    public jg(un unVar, int i10) {
        this.f40622a = i10;
        this.f40623b = unVar;
    }

    @Override
    public final void run() {
        View sendButton;
        boolean z10;
        boolean z11;
        fi.v3 v3Var;
        int i10 = this.f40622a;
        boolean z12 = true;
        un unVar = this.f40623b;
        switch (i10) {
            case 0:
                unVar.C7 = null;
                org.telegram.ui.Components.t60 t60Var = unVar.f44343n3;
                if (t60Var != null) {
                    org.telegram.ui.Components.q60 cameraContainer = t60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(unVar.f44343n3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(unVar.f44343n3.getPaint(), org.telegram.ui.Components.v6.f33577b, 0), ObjectAnimator.ofFloat(unVar.f44343n3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new pi(unVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 1:
                unVar.n8(false, true, 0.0f);
                return;
            case 2:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && unVar.Y != null && unVar.Ra == null && unVar.getMessagesController().getSendPaidMessagesStars(unVar.a()) <= 0 && (sendButton = unVar.Y.getSendButton()) != null && unVar.Y.getEditField() != null && unVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (unVar.f44430u2 == null) {
                        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(4, unVar.getParentActivity(), unVar.f44385qa, false);
                        unVar.f44430u2 = t40Var;
                        t40Var.a();
                        unVar.f44430u2.setAlpha(0.0f);
                        unVar.f44430u2.setVisibility(4);
                        unVar.f44430u2.setText(LocaleController.getString(R.string.ScheduledHint));
                        unVar.f44292j1.addView(unVar.f44430u2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.f44430u2.f(sendButton, true);
                    unVar.f44443v2 = true;
                    return;
                }
                return;
            case 3:
                unVar.S5 = null;
                unVar.q8();
                return;
            case 4:
                unVar.S5 = null;
                unVar.q8();
                return;
            case 5:
                ArrayList arrayList = unVar.G6;
                unVar.f44229dc = System.currentTimeMillis();
                if (unVar.f44468x0 != null && unVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < unVar.f44468x0.getChildCount(); i13++) {
                        View childAt = unVar.f44468x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) unVar.J6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = unVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = unVar.getMessagesController().getTranslateController();
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
                if (unVar.X4 > 0 && unVar.V4 != null) {
                    unVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) unVar.V4.get(Integer.valueOf(unVar.X4)), true);
                }
                unVar.hd();
                return;
            case 6:
                unVar.A0.M.clear();
                fm fmVar = unVar.A0;
                fmVar.L = false;
                fmVar.O(true);
                unVar.bc(false);
                return;
            case 7:
                hk hkVar = unVar.Y;
                if (hkVar != null && unVar.Zc != null) {
                    if (hkVar.q0()) {
                        unVar.Y.j0(false);
                        AndroidUtilities.showKeyboard(unVar.Zc.f48615a);
                        unVar.Zc.f48616b.f48612a.a(false, true);
                        return;
                    }
                    unVar.Y.S0(false, false, false);
                    unVar.Y.p1();
                    unVar.Zc.f48616b.f48612a.a(true, true);
                    return;
                }
                return;
            case 8:
                unVar.ca();
                return;
            case 9:
                unVar.Ca();
                return;
            case 10:
                unVar.m9();
                unVar.Lc(0, true);
                return;
            case 11:
                unVar.n8(false, true, 0.0f);
                return;
            case 12:
                unVar.n8(false, true, 0.0f);
                return;
            case 13:
                un.s1(unVar);
                return;
            case 14:
                unVar.n8(false, true, 0.0f);
                return;
            case 15:
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(unVar.getParentActivity(), 3, unVar.f44385qa);
                unVar.Lb = e2Var;
                e2Var.setOnShowListener(new hf(unVar, 1));
                unVar.Lb.setOnCancelListener(unVar.f44490ya);
                unVar.Lb.r(500L);
                return;
            case 16:
                AndroidUtilities.removeFromParent(unVar.X0);
                return;
            case 17:
                unVar.H7(true);
                org.telegram.messenger.t.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.wc.b0(unVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                unVar.U6();
                return;
            case 19:
                unVar.f44176a = (unVar.f44176a + 1) % 3;
                return;
            case 20:
                unVar.f44189b = !unVar.f44189b;
                return;
            case 21:
                unVar.A0.M.clear();
                fm fmVar2 = unVar.A0;
                fmVar2.L = false;
                fmVar2.O(true);
                unVar.bc(false);
                return;
            case 22:
                unVar.Ka = false;
                unVar.Hc();
                return;
            case 23:
                unVar.Ec = 0;
                unVar.Fc = false;
                unVar.f44468x0.g1();
                return;
            case 24:
                unVar.x9();
                unVar.z9();
                unVar.y7();
                unVar.A7();
                return;
            case 25:
                unVar.Lc(0, (unVar.f44196b6 == 0 || SystemClock.elapsedRealtime() < unVar.f44196b6 + 150) ? false : false);
                return;
            case 26:
                kk kkVar = unVar.f44220d3;
                if ((kkVar == null || kkVar.getVisibility() != 0) && (v3Var = unVar.I1) != null) {
                    v3Var.u();
                    return;
                }
                return;
            case 27:
                unVar.r7();
                return;
            case 28:
                unVar.h7(false);
                return;
            default:
                FrameLayout.LayoutParams i17 = org.telegram.ui.Components.gb1.i(-1, -2, 87);
                i17.bottomMargin = unVar.Y.getMeasuredHeight();
                unVar.f44292j1.addView(unVar.K1, i17);
                unVar.K1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                unVar.K1.m(0.0f, unVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                unVar.K1.u();
                return;
        }
    }
}
