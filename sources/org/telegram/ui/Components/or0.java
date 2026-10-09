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
public final class or0 implements Runnable {
    public final int f29562a;
    public final Object f29563b;

    public or0(Object obj, int i10) {
        this.f29562a = i10;
        this.f29563b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        b6[] b6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f29562a;
        Object obj = this.f29563b;
        switch (i10) {
            case 0:
                ((pr0) obj).setVisibility(8);
                return;
            case 1:
                bw0 bw0Var = ((qs0) obj).G;
                if (bw0Var.C1) {
                    bw0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((zt0) obj).f33648f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((ku0) obj).f28170f.f25166v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((or0) obj).run();
                return;
            case 5:
                lv0 lv0Var = (lv0) obj;
                ArrayList arrayList3 = lv0Var.f28610f;
                if (lv0Var.h) {
                    lv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    lv0Var.f28615x.f25166v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((mv0) obj).F();
                return;
            case 7:
                ((sw0) obj).X();
                return;
            case 8:
                ((bx0) obj).getClass();
                return;
            case 9:
                tx0 tx0Var = (tx0) obj;
                if (!tx0Var.f31301w) {
                    tx0Var.f31303y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((ez0) obj).b();
                return;
            case 11:
                oz0 oz0Var = (oz0) obj;
                int i12 = oz0Var.f29601a;
                oz0Var.F = null;
                mz0 mz0Var = oz0Var.f29605c;
                if (mz0Var != null && mz0Var.getEditField() != null && oz0Var.f29605c.getFieldText() != null) {
                    int selectionStart = oz0Var.f29605c.getEditField().getSelectionStart();
                    int selectionEnd = oz0Var.f29605c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        oz0Var.f29612s = false;
                        ai.f0 f0Var = oz0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = oz0Var.f29605c.getFieldText();
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
                                oz0Var.f29612s = true;
                                oz0Var.c();
                                oz0Var.T = emojiSpan;
                                oz0Var.W = null;
                                oz0Var.V = null;
                                if (substring != null) {
                                    String str = oz0Var.H;
                                    if (str != null && oz0Var.G == 2 && str.equals(substring) && !oz0Var.f29614x && (arrayList2 = oz0Var.f29613w) != null && !arrayList2.isEmpty()) {
                                        oz0Var.v = false;
                                        oz0Var.c();
                                        ai.f0 f0Var2 = oz0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            oz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = oz0Var.I + 1;
                                        oz0Var.I = i13;
                                        Runnable runnable = oz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        oz0Var.K = new zk(oz0Var, substring, i13, 22);
                                        ArrayList arrayList5 = oz0Var.f29613w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            oz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(oz0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = oz0Var.d;
                                if (f0Var3 != null) {
                                    f0Var3.invalidate();
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
                            oz0Var.f29612s = true;
                            oz0Var.c();
                            oz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = oz0Var.H;
                                if (str2 != null && oz0Var.G == 1 && str2.equals(substring2) && !oz0Var.f29614x && (arrayList = oz0Var.f29613w) != null && !arrayList.isEmpty()) {
                                    oz0Var.v = false;
                                    oz0Var.c();
                                    oz0Var.d.setVisibility(0);
                                    oz0Var.U = AndroidUtilities.dp(10.0f);
                                    oz0Var.d.invalidate();
                                } else {
                                    int i14 = oz0Var.I + 1;
                                    oz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (oz0Var.J != null && Math.abs(currentTimeMillis - oz0Var.L) <= 360) {
                                        oz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = oz0Var.J;
                                    } else {
                                        oz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = oz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    oz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = oz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        oz0Var.K = null;
                                    }
                                    oz0Var.K = new ai.d9(oz0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = oz0Var.f29613w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        oz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(oz0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = oz0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = oz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        oz0Var.K = null;
                    }
                    oz0Var.f29612s = false;
                    ai.f0 f0Var5 = oz0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                oz0Var.f29612s = false;
                oz0Var.v = true;
                ai.f0 f0Var6 = oz0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 12:
                uz0 uz0Var = (uz0) obj;
                uz0Var.G = null;
                uz0Var.b();
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
                ((s11) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((z11) obj).f33413a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                z21 z21Var = (z21) obj;
                z21Var.J = null;
                z21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(hs.f27118f).start();
                return;
            case 17:
                d31 d31Var = (d31) obj;
                ViewPropertyAnimator duration = d31Var.animate().alpha(0.0f).setListener(new vd0(d31Var, 23)).setDuration(300L);
                d31Var.f25581b = duration;
                duration.start();
                return;
            case 18:
                f31 f31Var = (f31) obj;
                Utilities.Callback callback = f31Var.f26235b;
                if (callback != null) {
                    callback.run(Long.valueOf(f31Var.f26234a.f26586s));
                    return;
                }
                return;
            case 19:
                c41 c41Var = ((t31) obj).f30984b;
                if (c41Var.k()) {
                    c41Var.l();
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
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                return;
            case 23:
                ((l51) obj).f28258c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.al) obj).f30667c.presentFragment(new org.telegram.ui.f41());
                return;
            case 25:
                ((w51) obj).requestLayout();
                return;
            case 26:
                ((n61) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24370e0;
                undoView.getClass();
                try {
                    undoView.f24379f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((m71) obj).invalidateSelf();
                return;
            default:
                l00 l00Var = ((z71) obj).f33491b;
                if (l00Var != null) {
                    l00Var.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
