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
public final class gr0 implements Runnable {
    public final int f26683a;
    public final Object f26684b;

    public gr0(Object obj, int i10) {
        this.f26683a = i10;
        this.f26684b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        a6[] a6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f26683a;
        Object obj = this.f26684b;
        switch (i10) {
            case 0:
                ((hr0) obj).setVisibility(8);
                return;
            case 1:
                tv0 tv0Var = ((is0) obj).G;
                if (tv0Var.C1) {
                    tv0Var.d1(false);
                    return;
                }
                return;
            case 2:
                ((rt0) obj).f30050r.o1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((cu0) obj).f25346f.f30734v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((gr0) obj).run();
                return;
            case 5:
                dv0 dv0Var = (dv0) obj;
                ArrayList arrayList3 = dv0Var.f25653f;
                if (dv0Var.h) {
                    dv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    dv0Var.f25658x.f30734v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((ev0) obj).F();
                return;
            case 7:
                ((kw0) obj).X();
                return;
            case 8:
                ((tw0) obj).getClass();
                return;
            case 9:
                lx0 lx0Var = (lx0) obj;
                if (!lx0Var.f28330w) {
                    lx0Var.f28332y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((wy0) obj).b();
                return;
            case 11:
                hz0 hz0Var = (hz0) obj;
                int i12 = hz0Var.f26950a;
                hz0Var.F = null;
                fz0 fz0Var = hz0Var.f26954c;
                if (fz0Var != null && fz0Var.getEditField() != null && hz0Var.f26954c.getFieldText() != null) {
                    int selectionStart = hz0Var.f26954c.getEditField().getSelectionStart();
                    int selectionEnd = hz0Var.f26954c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        hz0Var.f26960s = false;
                        ah.x xVar = hz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = hz0Var.f26954c.getFieldText();
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
                                hz0Var.f26960s = true;
                                hz0Var.c();
                                hz0Var.T = emojiSpan;
                                hz0Var.W = null;
                                hz0Var.V = null;
                                if (substring != null) {
                                    String str = hz0Var.H;
                                    if (str != null && hz0Var.G == 2 && str.equals(substring) && !hz0Var.f26962x && (arrayList2 = hz0Var.f26961w) != null && !arrayList2.isEmpty()) {
                                        hz0Var.v = false;
                                        hz0Var.c();
                                        ah.x xVar2 = hz0Var.d;
                                        if (xVar2 != null) {
                                            xVar2.setVisibility(0);
                                            hz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = hz0Var.I + 1;
                                        hz0Var.I = i13;
                                        Runnable runnable = hz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        hz0Var.K = new org.telegram.ui.i4(hz0Var, substring, i13, 27);
                                        ArrayList arrayList5 = hz0Var.f26961w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            hz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(hz0Var.K, 600L);
                                        }
                                    }
                                }
                                ah.x xVar3 = hz0Var.d;
                                if (xVar3 != null) {
                                    xVar3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            a6VarArr = (a6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, a6.class);
                        } else {
                            a6VarArr = null;
                        }
                        if ((a6VarArr == null || a6VarArr.length == 0) && selectionEnd < 52) {
                            hz0Var.f26960s = true;
                            hz0Var.c();
                            hz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = hz0Var.H;
                                if (str2 != null && hz0Var.G == 1 && str2.equals(substring2) && !hz0Var.f26962x && (arrayList = hz0Var.f26961w) != null && !arrayList.isEmpty()) {
                                    hz0Var.v = false;
                                    hz0Var.c();
                                    hz0Var.d.setVisibility(0);
                                    hz0Var.U = AndroidUtilities.dp(10.0f);
                                    hz0Var.d.invalidate();
                                } else {
                                    int i14 = hz0Var.I + 1;
                                    hz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (hz0Var.J != null && Math.abs(currentTimeMillis - hz0Var.L) <= 360) {
                                        hz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = hz0Var.J;
                                    } else {
                                        hz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = hz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    hz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = hz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        hz0Var.K = null;
                                    }
                                    hz0Var.K = new ai.cb(hz0Var, currentKeyboardLanguage, substring2, i14, 29);
                                    ArrayList arrayList6 = hz0Var.f26961w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        hz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(hz0Var.K, 600L);
                                    }
                                }
                            }
                            ah.x xVar4 = hz0Var.d;
                            if (xVar4 != null) {
                                xVar4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = hz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        hz0Var.K = null;
                    }
                    hz0Var.f26960s = false;
                    ah.x xVar5 = hz0Var.d;
                    if (xVar5 != null) {
                        xVar5.invalidate();
                        return;
                    }
                    return;
                }
                hz0Var.f26960s = false;
                hz0Var.v = true;
                ah.x xVar6 = hz0Var.d;
                if (xVar6 != null) {
                    xVar6.invalidate();
                    return;
                }
                return;
            case 12:
                nz0 nz0Var = (nz0) obj;
                nz0Var.G = null;
                nz0Var.b();
                return;
            case 13:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 14:
                ((l11) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((r11) obj).f29774a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                q21 q21Var = (q21) obj;
                q21Var.J = null;
                q21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(bs.f25014f).start();
                return;
            case 17:
                u21 u21Var = (u21) obj;
                ViewPropertyAnimator duration = u21Var.animate().alpha(0.0f).setListener(new c80(u21Var, 28)).setDuration(300L);
                u21Var.f30870b = duration;
                duration.start();
                return;
            case 18:
                w21 w21Var = (w21) obj;
                Utilities.Callback callback = w21Var.f32004b;
                if (callback != null) {
                    callback.run(Long.valueOf(w21Var.f32003a.f32291s));
                    return;
                }
                return;
            case 19:
                r31 r31Var = ((h31) obj).f26766b;
                if (r31Var.k()) {
                    r31Var.l();
                    return;
                }
                return;
            case 20:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                return;
            case 21:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                return;
            case 22:
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                return;
            case 23:
                ((c51) obj).f25081c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.rk) obj).f27426c.presentFragment(new org.telegram.ui.r21());
                return;
            case 25:
                ((n51) obj).requestLayout();
                return;
            case 26:
                ((e61) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24405e0;
                undoView.getClass();
                try {
                    undoView.f24413f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((d71) obj).invalidateSelf();
                return;
            default:
                e00 e00Var = ((q71) obj).f29540b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
        }
    }
}
