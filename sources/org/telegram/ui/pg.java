package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
public final class pg implements Runnable {
    public final int f37123a;
    public final zn f37124b;

    public pg(zn znVar, int i10) {
        this.f37123a = i10;
        this.f37124b = znVar;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        ph.f3 f3Var;
        int i10 = this.f37123a;
        boolean z11 = true;
        zn znVar = this.f37124b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(znVar.G0);
                return;
            case 1:
                ArrayList arrayList = znVar.f40730r6;
                znVar.Eb = System.currentTimeMillis();
                if (znVar.f40759u0 != null && znVar.f40800x0 != null) {
                    int i11 = Integer.MAX_VALUE;
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = 0; i13 < znVar.f40759u0.getChildCount(); i13++) {
                        View childAt = znVar.f40759u0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) znVar.f40765u6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            TranslateController translateController = znVar.getMessagesController().getTranslateController();
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
                                TranslateController translateController2 = znVar.getMessagesController().getTranslateController();
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
                if (znVar.I4 > 0 && znVar.G4 != null) {
                    znVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) znVar.G4.get(Integer.valueOf(znVar.I4)), true);
                }
                znVar.Uc();
                return;
            case 2:
                lk lkVar = znVar.V;
                if (lkVar != null && znVar.f40836zc != null) {
                    if (lkVar.t0()) {
                        znVar.V.m0(false);
                        AndroidUtilities.showKeyboard(znVar.f40836zc.f4897a);
                        znVar.f40836zc.f4898b.f4894a.a(false, true);
                        return;
                    }
                    znVar.V.V0(false, false, false);
                    znVar.V.s1();
                    znVar.f40836zc.f4898b.f4894a.a(true, true);
                    return;
                }
                return;
            case 3:
                znVar.ta();
                return;
            case 4:
                znVar.g8(false, true, 0.0f);
                return;
            case 5:
                znVar.S9();
                return;
            case 6:
                znVar.c9();
                znVar.yc(0, true);
                return;
            case 7:
                znVar.g8(false, true, 0.0f);
                return;
            case 8:
                znVar.q9(2);
                return;
            case 9:
                znVar.g8(false, true, 0.0f);
                return;
            case 10:
                zn.X(znVar);
                return;
            case 11:
                znVar.g8(false, true, 0.0f);
                return;
            case 12:
                znVar.g8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(znVar.getParentActivity(), 3, znVar.f40534ba);
                znVar.f40671mb = d2Var;
                d2Var.setOnShowListener(new lf(znVar, 1));
                znVar.f40671mb.setOnCancelListener(znVar.f40635ja);
                znVar.f40671mb.q(500L);
                return;
            case 14:
                znVar.N6();
                return;
            case 15:
                znVar.f40510a = (znVar.f40510a + 1) % 3;
                return;
            case 16:
                znVar.f40523b = !znVar.f40523b;
                return;
            case 17:
                znVar.A7(true);
                kf.k0.v(R.string.TranscriptionReportSent, org.telegram.ui.Components.qc.a0(znVar), R.raw.chats_infotip, 36);
                return;
            case 18:
                znVar.f40800x0.J.clear();
                lm lmVar = znVar.f40800x0;
                lmVar.I = false;
                lmVar.O(true);
                znVar.Pb(false);
                return;
            case 19:
                znVar.o9();
                znVar.r9();
                znVar.r7();
                znVar.t7();
                return;
            case 20:
                znVar.f40587fc = 0;
                znVar.f40600gc = false;
                znVar.f40759u0.e1();
                return;
            case 21:
                znVar.q9(5);
                return;
            case 22:
                znVar.yc(0, (znVar.M5 == 0 || SystemClock.elapsedRealtime() < znVar.M5 + 150) ? false : false);
                return;
            case 23:
                pk pkVar = znVar.O2;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (f3Var = znVar.f40749t1) != null) {
                    f3Var.u();
                    return;
                }
                return;
            case 24:
                znVar.k7();
                return;
            case 25:
                znVar.q9(5);
                return;
            case 26:
                znVar.a7(false);
                return;
            case 27:
                FrameLayout.LayoutParams e = k7.b6.e(-1, -2, 87);
                e.bottomMargin = znVar.V.getMeasuredHeight();
                znVar.U0.addView(znVar.f40773v1, e);
                znVar.f40773v1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                znVar.f40773v1.m(0.0f, znVar.V.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                znVar.f40773v1.u();
                return;
            case 28:
                int i17 = zn.Ec;
                znVar.Z6();
                return;
            default:
                int i18 = zn.Ec;
                znVar.Z6();
                return;
        }
    }
}
