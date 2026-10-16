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
public final class kr0 implements Runnable {
    public final int f26475a;
    public final Object f26476b;

    public kr0(Object obj, int i10) {
        this.f26475a = i10;
        this.f26476b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        b6[] b6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f26475a;
        int i11 = 0;
        Object obj = this.f26476b;
        switch (i10) {
            case 0:
                nr0 nr0Var = (nr0) obj;
                lr0[] lr0VarArr = nr0Var.f27398a;
                if (nr0Var.f27399b != 1) {
                    for (lr0 lr0Var : lr0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = lr0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        lr0Var.e.setAlpha(0.0f);
                    }
                    nr0Var.E = false;
                    AndroidUtilities.runOnUIThread(nr0Var.G, 4000L);
                    return;
                }
                nr0Var.E = !nr0Var.E;
                int length = lr0VarArr.length;
                while (i11 < length) {
                    lr0 lr0Var2 = lr0VarArr[i11];
                    org.telegram.ui.ActionBar.h5 h5Var2 = lr0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = lr0Var2.e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (nr0Var.E) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(nr0Var.G, 4000L);
                return;
            case 1:
                ((lr0) obj).setVisibility(8);
                return;
            case 2:
                xv0 xv0Var = ((ms0) obj).G;
                if (xv0Var.C1) {
                    xv0Var.c1(false);
                    return;
                }
                return;
            case 3:
                ((vt0) obj).f30317f.n1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((gu0) obj).f25112f.f31069v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((kr0) obj).run();
                return;
            case 6:
                hv0 hv0Var = (hv0) obj;
                ArrayList arrayList3 = hv0Var.f25415f;
                if (hv0Var.h) {
                    hv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    hv0Var.f25420x.f31069v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 7:
                ((iv0) obj).F();
                return;
            case 8:
                ((ow0) obj).X();
                return;
            case 9:
                ((xw0) obj).getClass();
                return;
            case 10:
                px0 px0Var = (px0) obj;
                if (!px0Var.f28129w) {
                    px0Var.f28131y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((bz0) obj).b();
                return;
            case 12:
                lz0 lz0Var = (lz0) obj;
                int i12 = lz0Var.f26847a;
                lz0Var.F = null;
                jz0 jz0Var = lz0Var.f26851c;
                if (jz0Var != null && jz0Var.getEditField() != null && lz0Var.f26851c.getFieldText() != null) {
                    int selectionStart = lz0Var.f26851c.getEditField().getSelectionStart();
                    int selectionEnd = lz0Var.f26851c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        lz0Var.f26857s = false;
                        ah.x xVar = lz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = lz0Var.f26851c.getFieldText();
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
                                lz0Var.f26857s = true;
                                lz0Var.c();
                                lz0Var.T = emojiSpan;
                                lz0Var.W = null;
                                lz0Var.V = null;
                                if (substring != null) {
                                    String str = lz0Var.H;
                                    if (str != null && lz0Var.G == 2 && str.equals(substring) && !lz0Var.f26859x && (arrayList2 = lz0Var.f26858w) != null && !arrayList2.isEmpty()) {
                                        lz0Var.v = false;
                                        lz0Var.c();
                                        ah.x xVar2 = lz0Var.d;
                                        if (xVar2 != null) {
                                            xVar2.setVisibility(0);
                                            lz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = lz0Var.I + 1;
                                        lz0Var.I = i13;
                                        Runnable runnable = lz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        lz0Var.K = new org.telegram.ui.gm(lz0Var, substring, i13, 23);
                                        ArrayList arrayList5 = lz0Var.f26858w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            lz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(lz0Var.K, 600L);
                                        }
                                    }
                                }
                                ah.x xVar3 = lz0Var.d;
                                if (xVar3 != null) {
                                    xVar3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            b6VarArr = (b6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, b6.class);
                        } else {
                            b6VarArr = null;
                        }
                        if ((b6VarArr == null || b6VarArr.length == 0) && selectionEnd < 52) {
                            lz0Var.f26857s = true;
                            lz0Var.c();
                            lz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = lz0Var.H;
                                if (str2 != null && lz0Var.G == 1 && str2.equals(substring2) && !lz0Var.f26859x && (arrayList = lz0Var.f26858w) != null && !arrayList.isEmpty()) {
                                    lz0Var.v = false;
                                    lz0Var.c();
                                    lz0Var.d.setVisibility(0);
                                    lz0Var.U = AndroidUtilities.dp(10.0f);
                                    lz0Var.d.invalidate();
                                } else {
                                    int i14 = lz0Var.I + 1;
                                    lz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (lz0Var.J != null && Math.abs(currentTimeMillis - lz0Var.L) <= 360) {
                                        lz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = lz0Var.J;
                                    } else {
                                        lz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = lz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    lz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = lz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        lz0Var.K = null;
                                    }
                                    lz0Var.K = new bi.n8(lz0Var, currentKeyboardLanguage, substring2, i14, 28);
                                    ArrayList arrayList6 = lz0Var.f26858w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        lz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(lz0Var.K, 600L);
                                    }
                                }
                            }
                            ah.x xVar4 = lz0Var.d;
                            if (xVar4 != null) {
                                xVar4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = lz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        lz0Var.K = null;
                    }
                    lz0Var.f26857s = false;
                    ah.x xVar5 = lz0Var.d;
                    if (xVar5 != null) {
                        xVar5.invalidate();
                        return;
                    }
                    return;
                }
                lz0Var.f26857s = false;
                lz0Var.v = true;
                ah.x xVar6 = lz0Var.d;
                if (xVar6 != null) {
                    xVar6.invalidate();
                    return;
                }
                return;
            case 13:
                rz0 rz0Var = (rz0) obj;
                rz0Var.G = null;
                rz0Var.b();
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
                ((p11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((w11) obj).f30402a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 17:
                w21 w21Var = (w21) obj;
                w21Var.J = null;
                w21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(es.f24465f).start();
                return;
            case 18:
                a31 a31Var = (a31) obj;
                ViewPropertyAnimator duration = a31Var.animate().alpha(0.0f).setListener(new k90(a31Var, 26)).setDuration(300L);
                a31Var.f23117b = duration;
                duration.start();
                return;
            case 19:
                c31 c31Var = (c31) obj;
                Utilities.Callback callback = c31Var.f23629b;
                if (callback != null) {
                    callback.run(Long.valueOf(c31Var.f23628a.f23975s));
                    return;
                }
                return;
            case 20:
                y31 y31Var = ((p31) obj).f27833b;
                if (y31Var.k()) {
                    y31Var.l();
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
                ((h51) obj).f25177c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.el) obj).f27846c.presentFragment(new org.telegram.ui.l41());
                return;
            case 26:
                ((t51) obj).requestLayout();
                return;
            case 27:
                ((k61) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f23047e0;
                undoView.getClass();
                try {
                    undoView.f23055f.performHapticFeedback(3, 2);
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
