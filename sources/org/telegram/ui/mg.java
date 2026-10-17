package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class mg implements Runnable {
    public final int f39180a;
    public final sn f39181b;

    public mg(sn snVar, int i10) {
        this.f39180a = i10;
        this.f39181b = snVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        ei.x3 x3Var;
        int i10 = this.f39180a;
        boolean z12 = true;
        sn snVar = this.f39181b;
        switch (i10) {
            case 0:
                hk hkVar = snVar.Y;
                if (hkVar != null && snVar.Cc != null) {
                    if (hkVar.r0()) {
                        snVar.Y.k0(false);
                        AndroidUtilities.showKeyboard(snVar.Cc.f45760a);
                        snVar.Cc.f45761b.f45757a.a(false, true);
                        return;
                    }
                    snVar.Y.S0(false, false, false);
                    snVar.Y.q1();
                    snVar.Cc.f45761b.f45757a.a(true, true);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = snVar.f41400u6;
                snVar.Hb = System.currentTimeMillis();
                if (snVar.f41433x0 != null && snVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < snVar.f41433x0.getChildCount(); i13++) {
                        View childAt = snVar.f41433x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < u1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = u1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (u1Var.getMessageObject() != null) {
                                int id3 = u1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) snVar.f41439x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = snVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = snVar.getMessagesController().getTranslateController();
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
                if (snVar.L4 > 0 && snVar.J4 != null) {
                    snVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) snVar.J4.get(Integer.valueOf(snVar.L4)), true);
                }
                snVar.Yc();
                return;
            case 2:
                snVar.xa();
                return;
            case 3:
                AndroidUtilities.removeFromParent(snVar.J0);
                return;
            case 4:
                snVar.h9();
                snVar.Cc(0, true);
                return;
            case 5:
                snVar.j8(false, true, 0.0f);
                return;
            case 6:
                snVar.X9();
                return;
            case 7:
                snVar.lc(false);
                return;
            case 8:
                snVar.v9(2);
                return;
            case 9:
                snVar.j8(false, true, 0.0f);
                return;
            case 10:
                sn.x0(snVar);
                return;
            case 11:
                snVar.j8(false, true, 0.0f);
                return;
            case 12:
                AndroidUtilities.removeFromParent(snVar.L0);
                return;
            case 13:
                snVar.j8(false, true, 0.0f);
                return;
            case 14:
                snVar.Q6();
                return;
            case 15:
                snVar.f41143a = (snVar.f41143a + 1) % 3;
                return;
            case 16:
                snVar.f41156b = !snVar.f41156b;
                return;
            case 17:
                snVar.D7(true);
                org.telegram.messenger.q.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(snVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                snVar.A0.M.clear();
                fm fmVar = snVar.A0;
                fmVar.L = false;
                fmVar.O(true);
                snVar.Tb(false);
                return;
            case 19:
                snVar.t9();
                snVar.w9();
                snVar.u7();
                snVar.w7();
                return;
            case 20:
                snVar.f41456ya = false;
                snVar.yc();
                return;
            case 21:
                snVar.f41255ic = 0;
                snVar.f41268jc = false;
                snVar.f41433x0.f1();
                return;
            case 22:
                snVar.v9(5);
                return;
            case 23:
                snVar.Cc(0, (snVar.P5 == 0 || SystemClock.elapsedRealtime() < snVar.P5 + 150) ? false : false);
                return;
            case 24:
                kk kkVar = snVar.R2;
                if ((kkVar == null || kkVar.getVisibility() != 0) && (x3Var = snVar.f41421w1) != null) {
                    x3Var.u();
                    return;
                }
                return;
            case 25:
                snVar.n7();
                return;
            case 26:
                snVar.v9(5);
                return;
            case 27:
                snVar.d7(false);
                return;
            case 28:
                FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 87);
                e.bottomMargin = snVar.Y.getMeasuredHeight();
                snVar.X0.addView(snVar.f41448y1, e);
                snVar.f41448y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                snVar.f41448y1.m(0.0f, snVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                snVar.f41448y1.u();
                return;
            default:
                int i17 = sn.Hc;
                snVar.c7();
                return;
        }
    }
}
