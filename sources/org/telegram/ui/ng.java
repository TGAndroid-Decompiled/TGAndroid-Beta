package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class ng implements Runnable {
    public final int f36619a;
    public final xn f36620b;

    public ng(xn xnVar, int i10) {
        this.f36619a = i10;
        this.f36620b = xnVar;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        ph.f3 f3Var;
        int i10 = this.f36619a;
        boolean z11 = true;
        xn xnVar = this.f36620b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(xnVar.G0);
                return;
            case 1:
                ArrayList arrayList = xnVar.f40164r6;
                xnVar.Eb = System.currentTimeMillis();
                if (xnVar.f40193u0 != null && xnVar.f40234x0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < xnVar.f40193u0.getChildCount(); i13++) {
                        View childAt = xnVar.f40193u0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < t1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = t1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (t1Var.getMessageObject() != null) {
                                int id3 = t1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) xnVar.f40199u6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = xnVar.getMessagesController().getTranslateController();
                                            if (id4 >= i11 - 7 && id4 <= i12 + 7) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            translateController.checkTranslation(messageObject2, z10);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(groupedMessages.groupId));
                                }
                            } else {
                                int id5 = messageObject.getId();
                                TranslateController translateController2 = xnVar.getMessagesController().getTranslateController();
                                if (id5 >= i11 - 7 && id5 <= i12 + 7) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                translateController2.checkTranslation(messageObject, z4);
                            }
                        }
                    }
                }
                if (xnVar.I4 > 0 && xnVar.G4 != null) {
                    xnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) xnVar.G4.get(Integer.valueOf(xnVar.I4)), true);
                }
                xnVar.Uc();
                return;
            case 2:
                jk jkVar = xnVar.V;
                if (jkVar != null && xnVar.f40270zc != null) {
                    if (jkVar.t0()) {
                        xnVar.V.m0(false);
                        AndroidUtilities.showKeyboard(xnVar.f40270zc.f4891a);
                        xnVar.f40270zc.f4892b.f4888a.a(false, true);
                        return;
                    }
                    xnVar.V.V0(false, false, false);
                    xnVar.V.s1();
                    xnVar.f40270zc.f4892b.f4888a.a(true, true);
                    return;
                }
                return;
            case 3:
                xnVar.ta();
                return;
            case 4:
                xnVar.g8(false, true, 0.0f);
                return;
            case 5:
                xnVar.S9();
                return;
            case 6:
                xnVar.c9();
                xnVar.yc(0, true);
                return;
            case 7:
                xnVar.g8(false, true, 0.0f);
                return;
            case 8:
                xnVar.q9(2);
                return;
            case 9:
                xnVar.g8(false, true, 0.0f);
                return;
            case 10:
                xn.X(xnVar);
                return;
            case 11:
                xnVar.g8(false, true, 0.0f);
                return;
            case 12:
                xnVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(xnVar.getParentActivity(), 3, xnVar.f39968ba);
                xnVar.f40105mb = d2Var;
                d2Var.setOnShowListener(new jf(xnVar, 1));
                xnVar.f40105mb.setOnCancelListener(xnVar.f40069ja);
                xnVar.f40105mb.q(500L);
                return;
            case 14:
                xnVar.N6();
                return;
            case 15:
                xnVar.f39944a = (xnVar.f39944a + 1) % 3;
                return;
            case 16:
                xnVar.f39957b = !xnVar.f39957b;
                return;
            case 17:
                xnVar.A7(true);
                kh.a2.v(R.string.TranscriptionReportSent, org.telegram.ui.Components.qc.a0(xnVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                xnVar.f40234x0.J.clear();
                jm jmVar = xnVar.f40234x0;
                jmVar.I = false;
                jmVar.O(true);
                xnVar.Pb(false);
                return;
            case 19:
                xnVar.o9();
                xnVar.r9();
                xnVar.r7();
                xnVar.t7();
                return;
            case 20:
                xnVar.f40021fc = 0;
                xnVar.f40034gc = false;
                xnVar.f40193u0.f1();
                return;
            case 21:
                xnVar.q9(5);
                return;
            case 22:
                xnVar.yc(0, (xnVar.M5 == 0 || SystemClock.elapsedRealtime() < xnVar.M5 + 150) ? false : false);
                return;
            case 23:
                nk nkVar = xnVar.O2;
                if ((nkVar == null || nkVar.getVisibility() != 0) && (f3Var = xnVar.f40183t1) != null) {
                    f3Var.v();
                    return;
                }
                return;
            case 24:
                xnVar.k7();
                return;
            case 25:
                xnVar.q9(5);
                return;
            case 26:
                xnVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e = k7.b6.e(-1, -2, 87);
                e.bottomMargin = xnVar.V.getMeasuredHeight();
                xnVar.U0.addView(xnVar.f40207v1, e);
                xnVar.f40207v1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                xnVar.f40207v1.n(0.0f, xnVar.V.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                xnVar.f40207v1.v();
                return;
            case 28:
                int i17 = xn.Ec;
                xnVar.Z6();
                return;
            default:
                int i18 = xn.Ec;
                xnVar.Z6();
                return;
        }
    }
}
