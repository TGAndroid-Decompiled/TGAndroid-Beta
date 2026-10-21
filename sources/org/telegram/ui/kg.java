package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class kg implements Runnable {
    public final int f38600a;
    public final qn f38601b;

    public kg(qn qnVar, int i10) {
        this.f38600a = i10;
        this.f38601b = qnVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        ei.x3 x3Var;
        int i10 = this.f38600a;
        boolean z12 = true;
        qn qnVar = this.f38601b;
        switch (i10) {
            case 0:
                fk fkVar = qnVar.Y;
                if (fkVar != null && qnVar.Dc != null) {
                    if (fkVar.r0()) {
                        qnVar.Y.k0(false);
                        AndroidUtilities.showKeyboard(qnVar.Dc.f45742a);
                        qnVar.Dc.f45743b.f45739a.a(false, true);
                        return;
                    }
                    qnVar.Y.S0(false, false, false);
                    qnVar.Y.p1();
                    qnVar.Dc.f45743b.f45739a.a(true, true);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = qnVar.f40868u6;
                qnVar.Hb = System.currentTimeMillis();
                if (qnVar.f40901x0 != null && qnVar.A0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < qnVar.f40901x0.getChildCount(); i13++) {
                        View childAt = qnVar.f40901x0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) qnVar.f40907x6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = qnVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = qnVar.getMessagesController().getTranslateController();
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
                if (qnVar.L4 > 0 && qnVar.J4 != null) {
                    qnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) qnVar.J4.get(Integer.valueOf(qnVar.L4)), true);
                }
                qnVar.Zc();
                return;
            case 2:
                qnVar.xa();
                return;
            case 3:
                AndroidUtilities.removeFromParent(qnVar.J0);
                return;
            case 4:
                qnVar.h9();
                qnVar.Dc(0, true);
                return;
            case 5:
                qnVar.j8(false, true, 0.0f);
                return;
            case 6:
                qnVar.X9();
                return;
            case 7:
                qnVar.mc(false);
                return;
            case 8:
                qnVar.v9(2);
                return;
            case 9:
                qnVar.j8(false, true, 0.0f);
                return;
            case 10:
                qn.x0(qnVar);
                return;
            case 11:
                qnVar.j8(false, true, 0.0f);
                return;
            case 12:
                AndroidUtilities.removeFromParent(qnVar.L0);
                return;
            case 13:
                qnVar.j8(false, true, 0.0f);
                return;
            case 14:
                qnVar.Q6();
                return;
            case 15:
                qnVar.f40611a = (qnVar.f40611a + 1) % 3;
                return;
            case 16:
                qnVar.f40624b = !qnVar.f40624b;
                return;
            case 17:
                qnVar.D7(true);
                org.telegram.messenger.g0.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(qnVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                qnVar.A0.M.clear();
                dm dmVar = qnVar.A0;
                dmVar.L = false;
                dmVar.O(true);
                qnVar.Ub(false);
                return;
            case 19:
                qnVar.t9();
                qnVar.w9();
                qnVar.u7();
                qnVar.w7();
                return;
            case 20:
                qnVar.f40924ya = false;
                qnVar.zc();
                return;
            case 21:
                qnVar.f40723ic = 0;
                qnVar.f40736jc = false;
                qnVar.f40901x0.f1();
                return;
            case 22:
                qnVar.v9(5);
                return;
            case 23:
                qnVar.Dc(0, (qnVar.P5 == 0 || SystemClock.elapsedRealtime() < qnVar.P5 + 150) ? false : false);
                return;
            case 24:
                ik ikVar = qnVar.R2;
                if ((ikVar == null || ikVar.getVisibility() != 0) && (x3Var = qnVar.f40889w1) != null) {
                    x3Var.u();
                    return;
                }
                return;
            case 25:
                qnVar.n7();
                return;
            case 26:
                qnVar.v9(5);
                return;
            case 27:
                qnVar.d7(false);
                return;
            case 28:
                FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 87);
                e.bottomMargin = qnVar.Y.getMeasuredHeight();
                qnVar.X0.addView(qnVar.f40916y1, e);
                qnVar.f40916y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                qnVar.f40916y1.m(0.0f, qnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                qnVar.f40916y1.u();
                return;
            default:
                int i17 = qn.Ic;
                qnVar.c7();
                return;
        }
    }
}
