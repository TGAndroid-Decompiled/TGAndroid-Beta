package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class ig implements Runnable {
    public final int f39257a;
    public final tn f39258b;

    public ig(tn tnVar, int i10) {
        this.f39257a = i10;
        this.f39258b = tnVar;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        nh.t3 t3Var;
        int i10 = this.f39257a;
        boolean z12 = true;
        tn tnVar = this.f39258b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(tnVar.F0);
                return;
            case 1:
                ArrayList arrayList = tnVar.q6;
                tnVar.Db = System.currentTimeMillis();
                if (tnVar.f42973t0 != null && tnVar.f43013w0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < tnVar.f42973t0.getChildCount(); i13++) {
                        View childAt = tnVar.f42973t0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) tnVar.f42979t6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = tnVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = tnVar.getMessagesController().getTranslateController();
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
                if (tnVar.H4 > 0 && tnVar.F4 != null) {
                    tnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) tnVar.F4.get(Integer.valueOf(tnVar.H4)), true);
                }
                tnVar.Uc();
                return;
            case 2:
                dk dkVar = tnVar.U;
                if (dkVar != null && tnVar.f43049yc != null) {
                    if (dkVar.t0()) {
                        tnVar.U.m0(false);
                        AndroidUtilities.showKeyboard(tnVar.f43049yc.f2654a);
                        tnVar.f43049yc.f2655b.f2651a.a(false, true);
                        return;
                    }
                    tnVar.U.V0(false, false, false);
                    tnVar.U.s1();
                    tnVar.f43049yc.f2655b.f2651a.a(true, true);
                    return;
                }
                return;
            case 3:
                tnVar.ta();
                return;
            case 4:
                tnVar.g8(false, true, 0.0f);
                return;
            case 5:
                tnVar.S9();
                return;
            case 6:
                tnVar.c9();
                tnVar.yc(0, true);
                return;
            case 7:
                tnVar.g8(false, true, 0.0f);
                return;
            case 8:
                tnVar.q9(2);
                return;
            case 9:
                tnVar.g8(false, true, 0.0f);
                return;
            case 10:
                tn.X(tnVar);
                return;
            case 11:
                tnVar.g8(false, true, 0.0f);
                return;
            case 12:
                tnVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tnVar.getParentActivity(), 3, tnVar.f42746aa);
                tnVar.f42886lb = c2Var;
                c2Var.setOnShowListener(new bf(tnVar, 1));
                tnVar.f42886lb.setOnCancelListener(tnVar.f42848ia);
                tnVar.f42886lb.q(500L);
                return;
            case 14:
                tnVar.N6();
                return;
            case 15:
                tnVar.f42736a = (tnVar.f42736a + 1) % 3;
                return;
            case 16:
                tnVar.f42749b = !tnVar.f42749b;
                return;
            case 17:
                tnVar.A7(true);
                j7.l1.v(R.string.TranscriptionReportSent, org.telegram.ui.Components.tc.a0(tnVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                tnVar.f43013w0.I.clear();
                em emVar = tnVar.f43013w0;
                emVar.H = false;
                emVar.O(true);
                tnVar.Pb(false);
                return;
            case 19:
                tnVar.o9();
                tnVar.r9();
                tnVar.r7();
                tnVar.t7();
                return;
            case 20:
                tnVar.f42800ec = 0;
                tnVar.f42813fc = false;
                tnVar.f42973t0.f1();
                return;
            case 21:
                tnVar.q9(5);
                return;
            case 22:
                tnVar.yc(0, (tnVar.L5 == 0 || SystemClock.elapsedRealtime() < tnVar.L5 + 150) ? false : false);
                return;
            case 23:
                hk hkVar = tnVar.N2;
                if ((hkVar == null || hkVar.getVisibility() != 0) && (t3Var = tnVar.f42961s1) != null) {
                    t3Var.v();
                    return;
                }
                return;
            case 24:
                tnVar.k7();
                return;
            case 25:
                tnVar.q9(5);
                return;
            case 26:
                tnVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e10 = i7.f6.e(-1, -2, 87);
                e10.bottomMargin = tnVar.U.getMeasuredHeight();
                tnVar.T0.addView(tnVar.f42987u1, e10);
                tnVar.f42987u1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                tnVar.f42987u1.n(0.0f, tnVar.U.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                tnVar.f42987u1.v();
                return;
            case 28:
                int i17 = tn.Dc;
                tnVar.Z6();
                return;
            default:
                int i18 = tn.Dc;
                tnVar.Z6();
                return;
        }
    }
}
