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
public final class fr0 implements Runnable {
    public final int f26376a;
    public final Object f26377b;

    public fr0(Object obj, int i10) {
        this.f26376a = i10;
        this.f26377b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        a6[] a6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f26376a;
        Object obj = this.f26377b;
        switch (i10) {
            case 0:
                ((gr0) obj).setVisibility(8);
                return;
            case 1:
                sv0 sv0Var = ((hs0) obj).G;
                if (sv0Var.C1) {
                    sv0Var.d1(false);
                    return;
                }
                return;
            case 2:
                ((qt0) obj).f29742r.o1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((bu0) obj).f25047f.f30388v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((fr0) obj).run();
                return;
            case 5:
                cv0 cv0Var = (cv0) obj;
                ArrayList arrayList3 = cv0Var.f25381f;
                if (cv0Var.h) {
                    cv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    cv0Var.f25386x.f30388v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((dv0) obj).F();
                return;
            case 7:
                ((jw0) obj).X();
                return;
            case 8:
                ((sw0) obj).getClass();
                return;
            case 9:
                kx0 kx0Var = (kx0) obj;
                if (!kx0Var.f28018w) {
                    kx0Var.f28020y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((vy0) obj).b();
                return;
            case 11:
                gz0 gz0Var = (gz0) obj;
                int i12 = gz0Var.f26703a;
                gz0Var.F = null;
                ez0 ez0Var = gz0Var.f26707c;
                if (ez0Var != null && ez0Var.getEditField() != null && gz0Var.f26707c.getFieldText() != null) {
                    int selectionStart = gz0Var.f26707c.getEditField().getSelectionStart();
                    int selectionEnd = gz0Var.f26707c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        gz0Var.f26713s = false;
                        ah.x xVar = gz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = gz0Var.f26707c.getFieldText();
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
                                gz0Var.f26713s = true;
                                gz0Var.c();
                                gz0Var.T = emojiSpan;
                                gz0Var.W = null;
                                gz0Var.V = null;
                                if (substring != null) {
                                    String str = gz0Var.H;
                                    if (str != null && gz0Var.G == 2 && str.equals(substring) && !gz0Var.f26715x && (arrayList2 = gz0Var.f26714w) != null && !arrayList2.isEmpty()) {
                                        gz0Var.v = false;
                                        gz0Var.c();
                                        ah.x xVar2 = gz0Var.d;
                                        if (xVar2 != null) {
                                            xVar2.setVisibility(0);
                                            gz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = gz0Var.I + 1;
                                        gz0Var.I = i13;
                                        Runnable runnable = gz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        gz0Var.K = new org.telegram.ui.i4(gz0Var, substring, i13, 27);
                                        ArrayList arrayList5 = gz0Var.f26714w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            gz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(gz0Var.K, 600L);
                                        }
                                    }
                                }
                                ah.x xVar3 = gz0Var.d;
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
                            gz0Var.f26713s = true;
                            gz0Var.c();
                            gz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = gz0Var.H;
                                if (str2 != null && gz0Var.G == 1 && str2.equals(substring2) && !gz0Var.f26715x && (arrayList = gz0Var.f26714w) != null && !arrayList.isEmpty()) {
                                    gz0Var.v = false;
                                    gz0Var.c();
                                    gz0Var.d.setVisibility(0);
                                    gz0Var.U = AndroidUtilities.dp(10.0f);
                                    gz0Var.d.invalidate();
                                } else {
                                    int i14 = gz0Var.I + 1;
                                    gz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (gz0Var.J != null && Math.abs(currentTimeMillis - gz0Var.L) <= 360) {
                                        gz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = gz0Var.J;
                                    } else {
                                        gz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = gz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    gz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = gz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        gz0Var.K = null;
                                    }
                                    gz0Var.K = new ai.bb(gz0Var, currentKeyboardLanguage, substring2, i14, 29);
                                    ArrayList arrayList6 = gz0Var.f26714w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        gz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(gz0Var.K, 600L);
                                    }
                                }
                            }
                            ah.x xVar4 = gz0Var.d;
                            if (xVar4 != null) {
                                xVar4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = gz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        gz0Var.K = null;
                    }
                    gz0Var.f26713s = false;
                    ah.x xVar5 = gz0Var.d;
                    if (xVar5 != null) {
                        xVar5.invalidate();
                        return;
                    }
                    return;
                }
                gz0Var.f26713s = false;
                gz0Var.v = true;
                ah.x xVar6 = gz0Var.d;
                if (xVar6 != null) {
                    xVar6.invalidate();
                    return;
                }
                return;
            case 12:
                mz0 mz0Var = (mz0) obj;
                mz0Var.G = null;
                mz0Var.b();
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
                ((k11) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((q11) obj).f29518a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                p21 p21Var = (p21) obj;
                p21Var.J = null;
                p21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(bs.f25030f).start();
                return;
            case 17:
                t21 t21Var = (t21) obj;
                ViewPropertyAnimator duration = t21Var.animate().alpha(0.0f).setListener(new c80(t21Var, 28)).setDuration(300L);
                t21Var.f30454b = duration;
                duration.start();
                return;
            case 18:
                v21 v21Var = (v21) obj;
                Utilities.Callback callback = v21Var.f31150b;
                if (callback != null) {
                    callback.run(Long.valueOf(v21Var.f31149a.f31997s));
                    return;
                }
                return;
            case 19:
                q31 q31Var = ((g31) obj).f26469b;
                if (q31Var.k()) {
                    q31Var.l();
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
                ((b51) obj).f24800c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.tk) obj).f27078c.presentFragment(new org.telegram.ui.t21());
                return;
            case 25:
                ((m51) obj).requestLayout();
                return;
            case 26:
                ((d61) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24402e0;
                undoView.getClass();
                try {
                    undoView.f24410f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((c71) obj).invalidateSelf();
                return;
            default:
                e00 e00Var = ((p71) obj).f29220b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
        }
    }
}
