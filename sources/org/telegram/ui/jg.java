package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class jg implements Runnable {
    public final int f39496a;
    public final qn f39497b;

    public jg(qn qnVar, int i9) {
        this.f39496a = i9;
        this.f39497b = qnVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        kh.x3 x3Var;
        int i9 = this.f39496a;
        boolean z12 = true;
        qn qnVar = this.f39497b;
        switch (i9) {
            case 0:
                AndroidUtilities.removeFromParent(qnVar.F0);
                return;
            case 1:
                ArrayList arrayList = qnVar.f42042q6;
                qnVar.Db = System.currentTimeMillis();
                if (qnVar.f42077t0 != null && qnVar.f42114w0 != null) {
                    int i10 = Integer.MAX_VALUE;
                    int i11 = Integer.MIN_VALUE;
                    for (int i12 = 0; i12 < qnVar.f42077t0.getChildCount(); i12++) {
                        View childAt = qnVar.f42077t0.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var.getCurrentMessagesGroup() != null) {
                                for (int i13 = 0; i13 < t1Var.getCurrentMessagesGroup().messages.size(); i13++) {
                                    int id2 = t1Var.getCurrentMessagesGroup().messages.get(i13).getId();
                                    i10 = Math.min(i10, id2);
                                    i11 = Math.max(i11, id2);
                                }
                            } else if (t1Var.getMessageObject() != null) {
                                int id3 = t1Var.getMessageObject().getId();
                                i10 = Math.min(i10, id3);
                                i11 = Math.max(i11, id3);
                            }
                        }
                    }
                    if (i10 <= i11) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i14);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) qnVar.f42083t6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i15 = 0; i15 < groupedMessages.messages.size(); i15++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i15);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = qnVar.getMessagesController().getTranslateController();
                                            if (id4 >= i10 - 7 && id4 <= i11 + 7) {
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
                                if (id5 >= i10 - 7 && id5 <= i11 + 7) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                translateController2.checkTranslation(messageObject, z10);
                            }
                        }
                    }
                }
                if (qnVar.H4 > 0 && qnVar.F4 != null) {
                    qnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) qnVar.F4.get(Integer.valueOf(qnVar.H4)), true);
                }
                qnVar.Uc();
                return;
            case 2:
                ak akVar = qnVar.U;
                if (akVar != null && qnVar.yc != null) {
                    if (akVar.s0()) {
                        qnVar.U.l0(false);
                        AndroidUtilities.showKeyboard(qnVar.yc.f50208a);
                        qnVar.yc.f50209b.f50205a.a(false, true);
                        return;
                    }
                    qnVar.U.V0(false, false, false);
                    qnVar.U.s1();
                    qnVar.yc.f50209b.f50205a.a(true, true);
                    return;
                }
                return;
            case 3:
                qnVar.ta();
                return;
            case 4:
                qnVar.g8(false, true, 0.0f);
                return;
            case 5:
                qnVar.S9();
                return;
            case 6:
                qnVar.c9();
                qnVar.yc(0, true);
                return;
            case 7:
                qnVar.g8(false, true, 0.0f);
                return;
            case 8:
                qnVar.q9(2);
                return;
            case 9:
                qnVar.g8(false, true, 0.0f);
                return;
            case 10:
                qn.W(qnVar);
                return;
            case 11:
                qnVar.g8(false, true, 0.0f);
                return;
            case 12:
                qnVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(qnVar.getParentActivity(), 3, qnVar.f41848aa);
                qnVar.f41988lb = c2Var;
                c2Var.setOnShowListener(new ef(qnVar, 1));
                qnVar.f41988lb.setOnCancelListener(qnVar.f41951ia);
                qnVar.f41988lb.q(500L);
                return;
            case 14:
                qnVar.N6();
                return;
            case 15:
                qnVar.f41839a = (qnVar.f41839a + 1) % 3;
                return;
            case 16:
                qnVar.f41851b = !qnVar.f41851b;
                return;
            case 17:
                qnVar.A7(true);
                org.telegram.messenger.l0.p(R.string.TranscriptionReportSent, org.telegram.ui.Components.oc.a0(qnVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                qnVar.f42114w0.I.clear();
                bm bmVar = qnVar.f42114w0;
                bmVar.H = false;
                bmVar.O(true);
                qnVar.Pb(false);
                return;
            case 19:
                qnVar.o9();
                qnVar.r9();
                qnVar.r7();
                qnVar.t7();
                return;
            case 20:
                qnVar.ec = 0;
                qnVar.fc = false;
                qnVar.f42077t0.f1();
                return;
            case 21:
                qnVar.q9(5);
                return;
            case 22:
                qnVar.yc(0, (qnVar.L5 == 0 || SystemClock.elapsedRealtime() < qnVar.L5 + 150) ? false : false);
                return;
            case 23:
                ek ekVar = qnVar.N2;
                if ((ekVar == null || ekVar.getVisibility() != 0) && (x3Var = qnVar.f42065s1) != null) {
                    x3Var.v();
                    return;
                }
                return;
            case 24:
                qnVar.k7();
                return;
            case 25:
                qnVar.q9(5);
                return;
            case 26:
                qnVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e10 = g7.e6.e(-1, -2, 87);
                e10.bottomMargin = qnVar.U.getMeasuredHeight();
                qnVar.T0.addView(qnVar.f42091u1, e10);
                qnVar.f42091u1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                qnVar.f42091u1.n(0.0f, qnVar.U.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                qnVar.f42091u1.v();
                return;
            case 28:
                int i16 = qn.Dc;
                qnVar.Z6();
                return;
            default:
                int i17 = qn.Dc;
                qnVar.Z6();
                return;
        }
    }
}
