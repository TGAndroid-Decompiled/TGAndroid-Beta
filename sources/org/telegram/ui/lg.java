package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

public final class lg implements Runnable {

    public final int f40076a;

    public final rn f40077b;

    public lg(rn rnVar, int i10) {
        this.f40076a = i10;
        this.f40077b = rnVar;
    }

    @Override
    public final void run() {
        lh.w3 w3Var;
        int i10 = this.f40076a;
        rn rnVar = this.f40077b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(rnVar.F0);
                break;
            case 1:
                ArrayList arrayList = rnVar.q6;
                rnVar.Db = System.currentTimeMillis();
                if (rnVar.f42213t0 != null && rnVar.f42252w0 != null) {
                    int iMin = Integer.MAX_VALUE;
                    int iMax = Integer.MIN_VALUE;
                    for (int i11 = 0; i11 < rnVar.f42213t0.getChildCount(); i11++) {
                        View childAt = rnVar.f42213t0.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var.getCurrentMessagesGroup() != null) {
                                for (int i12 = 0; i12 < s1Var.getCurrentMessagesGroup().messages.size(); i12++) {
                                    int id2 = s1Var.getCurrentMessagesGroup().messages.get(i12).getId();
                                    iMin = Math.min(iMin, id2);
                                    iMax = Math.max(iMax, id2);
                                }
                            } else if (s1Var.getMessageObject() != null) {
                                int id3 = s1Var.getMessageObject().getId();
                                iMin = Math.min(iMin, id3);
                                iMax = Math.max(iMax, id3);
                            }
                        }
                    }
                    if (iMin <= iMax) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i13);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) rnVar.f42219t6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                rnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= iMin + (-7) && id4 <= iMax + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i14 = 0; i14 < groupedMessages.messages.size(); i14++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i14);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        rnVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= iMin + (-7) && id5 <= iMax + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (rnVar.H4 > 0 && rnVar.F4 != null) {
                    rnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) rnVar.F4.get(Integer.valueOf(rnVar.H4)), true);
                }
                rnVar.Uc();
                break;
            case 2:
                ck ckVar = rnVar.U;
                if (ckVar != null && rnVar.f42289yc != null) {
                    if (ckVar.t0()) {
                        rnVar.U.m0(false);
                        AndroidUtilities.showKeyboard(rnVar.f42289yc.f50804a);
                        rnVar.f42289yc.f50805b.f50801a.a(false, true);
                    } else {
                        rnVar.U.U0(false, false, false);
                        rnVar.U.r1();
                        rnVar.f42289yc.f50805b.f50801a.a(true, true);
                    }
                    break;
                }
                break;
            case 3:
                rnVar.ta();
                break;
            case 4:
                rnVar.g8(false, true, 0.0f);
                break;
            case 5:
                rnVar.S9();
                break;
            case 6:
                rnVar.c9();
                rnVar.yc(0, true);
                break;
            case 7:
                rnVar.g8(false, true, 0.0f);
                break;
            case 8:
                rnVar.q9(2);
                break;
            case 9:
                rnVar.g8(false, true, 0.0f);
                break;
            case 10:
                rn.X(rnVar);
                break;
            case 11:
                rnVar.g8(false, true, 0.0f);
                break;
            case 12:
                rnVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(rnVar.getParentActivity(), 3, rnVar.f41983aa);
                rnVar.f42124lb = b2Var;
                b2Var.setOnShowListener(new ef(rnVar, 1));
                rnVar.f42124lb.setOnCancelListener(rnVar.f42087ia);
                rnVar.f42124lb.q(500L);
                break;
            case 14:
                rnVar.N6();
                break;
            case 15:
                rnVar.f41974a = (rnVar.f41974a + 1) % 3;
                break;
            case 16:
                rnVar.f41986b = !rnVar.f41986b;
                break;
            case 17:
                rnVar.A7(true);
                org.telegram.messenger.y1.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.mc.a0(rnVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                rnVar.f42252w0.I.clear();
                dm dmVar = rnVar.f42252w0;
                dmVar.H = false;
                dmVar.O(true);
                rnVar.Pb(false);
                break;
            case 19:
                rnVar.o9();
                rnVar.r9();
                rnVar.r7();
                rnVar.t7();
                break;
            case 20:
                rnVar.f42038ec = 0;
                rnVar.fc = false;
                rnVar.f42213t0.f1();
                break;
            case 21:
                rnVar.q9(5);
                break;
            case 22:
                rnVar.yc(0, rnVar.L5 != 0 && SystemClock.elapsedRealtime() >= rnVar.L5 + 150);
                break;
            case 23:
                gk gkVar = rnVar.N2;
                if ((gkVar == null || gkVar.getVisibility() != 0) && (w3Var = rnVar.f42201s1) != null) {
                    w3Var.v();
                }
                break;
            case 24:
                rnVar.k7();
                break;
            case 25:
                rnVar.q9(5);
                break;
            case 26:
                rnVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-1, -2, 87);
                layoutParamsE.bottomMargin = rnVar.U.getMeasuredHeight();
                rnVar.T0.addView(rnVar.f42227u1, layoutParamsE);
                rnVar.f42227u1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                rnVar.f42227u1.n(0.0f, rnVar.U.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                rnVar.f42227u1.v();
                break;
            case 28:
                int i15 = rn.Dc;
                rnVar.Z6();
                break;
            default:
                int i16 = rn.Dc;
                rnVar.Z6();
                break;
        }
    }
}
