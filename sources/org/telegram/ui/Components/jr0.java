package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PremiumPreviewFragment;
public final class jr0 implements Runnable {
    public final int f27791a;
    public final Object f27792b;

    public jr0(Object obj, int i10) {
        this.f27791a = i10;
        this.f27792b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        y5[] y5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f27791a;
        int i11 = 0;
        Object obj = this.f27792b;
        switch (i10) {
            case 0:
                mr0 mr0Var = (mr0) obj;
                kr0[] kr0VarArr = mr0Var.f28677a;
                if (mr0Var.f28678b != 1) {
                    for (kr0 kr0Var : kr0VarArr) {
                        org.telegram.ui.ActionBar.n5 n5Var = kr0Var.d;
                        n5Var.setAlpha(1.0f);
                        n5Var.setScaleX(1.0f);
                        n5Var.setScaleY(1.0f);
                        kr0Var.e.setAlpha(0.0f);
                    }
                    mr0Var.E = false;
                    AndroidUtilities.runOnUIThread(mr0Var.G, 4000L);
                    return;
                }
                mr0Var.E = !mr0Var.E;
                int length = kr0VarArr.length;
                while (i11 < length) {
                    kr0 kr0Var2 = kr0VarArr[i11];
                    org.telegram.ui.ActionBar.n5 n5Var2 = kr0Var2.d;
                    org.telegram.ui.ActionBar.n5 n5Var3 = kr0Var2.e;
                    n5Var2.setPivotX(0.0f);
                    n5Var3.setPivotX(0.0f);
                    if (mr0Var.E) {
                        n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        n5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        n5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(mr0Var.G, 4000L);
                return;
            case 1:
                ((kr0) obj).setVisibility(8);
                return;
            case 2:
                wv0 wv0Var = ((ls0) obj).G;
                if (wv0Var.C1) {
                    wv0Var.e1(false);
                    return;
                }
                return;
            case 3:
                ((ut0) obj).f31222r.p1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = ((fu0) obj).f26436f.f32410v1;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((jr0) obj).run();
                return;
            case 6:
                gv0 gv0Var = (gv0) obj;
                ArrayList arrayList3 = gv0Var.f26795f;
                if (gv0Var.h) {
                    gv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    gv0Var.f26800x.f32410v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 7:
                ((hv0) obj).F();
                return;
            case 8:
                ((nw0) obj).W();
                return;
            case 9:
                ((ww0) obj).getClass();
                return;
            case 10:
                ox0 ox0Var = (ox0) obj;
                if (!ox0Var.f29424w) {
                    ox0Var.f29426y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((zy0) obj).b();
                return;
            case 12:
                kz0 kz0Var = (kz0) obj;
                int i12 = kz0Var.f28105a;
                kz0Var.H = null;
                iz0 iz0Var = kz0Var.f28109c;
                if (iz0Var != null && iz0Var.getEditField() != null && kz0Var.f28109c.getFieldText() != null) {
                    int selectionStart = kz0Var.f28109c.getEditField().getSelectionStart();
                    int selectionEnd = kz0Var.f28109c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        kz0Var.f28117s = false;
                        ah.x xVar = kz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = kz0Var.f28109c.getFieldText();
                    boolean z10 = fieldText instanceof Spanned;
                    if (z10) {
                        emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class);
                    } else {
                        emojiSpanArr = null;
                    }
                    if (emojiSpanArr != null && emojiSpanArr.length > 0 && SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i12).isPremium()) {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[emojiSpanArr.length - 1];
                        if (emojiSpan != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(emojiSpan);
                            int spanEnd = spanned.getSpanEnd(emojiSpan);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                kz0Var.f28117s = true;
                                kz0Var.c();
                                kz0Var.V = emojiSpan;
                                kz0Var.f28108b0 = null;
                                kz0Var.f28106a0 = null;
                                if (substring != null) {
                                    String str = kz0Var.J;
                                    if (str != null && kz0Var.I == 2 && str.equals(substring) && !kz0Var.f28119x && (arrayList2 = kz0Var.f28118w) != null && !arrayList2.isEmpty()) {
                                        kz0Var.v = false;
                                        kz0Var.c();
                                        ah.x xVar2 = kz0Var.d;
                                        if (xVar2 != null) {
                                            xVar2.setVisibility(0);
                                            kz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = kz0Var.K + 1;
                                        kz0Var.K = i13;
                                        Runnable runnable = kz0Var.M;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        kz0Var.M = new org.telegram.ui.h4(kz0Var, substring, i13, 27);
                                        ArrayList arrayList5 = kz0Var.f28118w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            kz0Var.M.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(kz0Var.M, 600L);
                                        }
                                    }
                                }
                                ah.x xVar3 = kz0Var.d;
                                if (xVar3 != null) {
                                    xVar3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            y5VarArr = (y5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, y5.class);
                        } else {
                            y5VarArr = null;
                        }
                        if ((y5VarArr == null || y5VarArr.length == 0) && selectionEnd < 52) {
                            kz0Var.f28117s = true;
                            kz0Var.c();
                            kz0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = kz0Var.J;
                                if (str2 != null && kz0Var.I == 1 && str2.equals(substring2) && !kz0Var.f28119x && (arrayList = kz0Var.f28118w) != null && !arrayList.isEmpty()) {
                                    kz0Var.v = false;
                                    kz0Var.c();
                                    kz0Var.d.setVisibility(0);
                                    kz0Var.W = AndroidUtilities.dp(10.0f);
                                    kz0Var.d.invalidate();
                                } else {
                                    int i14 = kz0Var.K + 1;
                                    kz0Var.K = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (kz0Var.L != null && Math.abs(currentTimeMillis - kz0Var.N) <= 360) {
                                        kz0Var.N = currentTimeMillis;
                                        currentKeyboardLanguage = kz0Var.L;
                                    } else {
                                        kz0Var.N = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = kz0Var.L;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    kz0Var.L = currentKeyboardLanguage;
                                    Runnable runnable2 = kz0Var.M;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        kz0Var.M = null;
                                    }
                                    kz0Var.M = new ez0(kz0Var, currentKeyboardLanguage, substring2, i14, 0);
                                    ArrayList arrayList6 = kz0Var.f28118w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        kz0Var.M.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(kz0Var.M, 600L);
                                    }
                                }
                            }
                            ah.x xVar4 = kz0Var.d;
                            if (xVar4 != null) {
                                xVar4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = kz0Var.M;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        kz0Var.M = null;
                    }
                    kz0Var.f28117s = false;
                    ah.x xVar5 = kz0Var.d;
                    if (xVar5 != null) {
                        xVar5.invalidate();
                        return;
                    }
                    return;
                }
                kz0Var.f28117s = false;
                kz0Var.v = true;
                ah.x xVar6 = kz0Var.d;
                if (xVar6 != null) {
                    xVar6.invalidate();
                    return;
                }
                return;
            case 13:
                qz0 qz0Var = (qz0) obj;
                qz0Var.K = null;
                qz0Var.b();
                return;
            case 14:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 15:
                ((o11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((u11) obj).f30967a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).I3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).K3(false, false, false);
                    }
                }
                return;
            case 17:
                u21 u21Var = (u21) obj;
                u21Var.J = null;
                u21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(zr.f33337f).start();
                return;
            case 18:
                y21 y21Var = (y21) obj;
                ViewPropertyAnimator duration = y21Var.animate().alpha(0.0f).setListener(new g60(y21Var, 29)).setDuration(300L);
                y21Var.f32795b = duration;
                duration.start();
                return;
            case 19:
                a31 a31Var = (a31) obj;
                Utilities.Callback callback = a31Var.f24617b;
                if (callback != null) {
                    callback.run(Long.valueOf(a31Var.f24616a.f24904t));
                    return;
                }
                return;
            case 20:
                v31 v31Var = ((l31) obj).f28160b;
                if (v31Var.l()) {
                    v31Var.m();
                    return;
                }
                return;
            case 21:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                return;
            case 22:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                return;
            case 24:
                ((i51) obj).f27300c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.sk) obj).f29146c.presentFragment(new org.telegram.ui.u21());
                return;
            case 26:
                ((s51) obj).requestLayout();
                return;
            case 27:
                ((j61) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24555i0;
                undoView.getClass();
                try {
                    undoView.f24564f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((k71) obj).invalidateSelf();
                return;
        }
    }
}
