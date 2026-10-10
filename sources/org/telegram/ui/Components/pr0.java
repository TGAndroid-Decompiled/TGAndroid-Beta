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
public final class pr0 implements Runnable {
    public final int f29849a;
    public final Object f29850b;

    public pr0(Object obj, int i10) {
        this.f29849a = i10;
        this.f29850b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        b6[] b6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f29849a;
        Object obj = this.f29850b;
        switch (i10) {
            case 0:
                ((qr0) obj).setVisibility(8);
                return;
            case 1:
                cw0 cw0Var = ((rs0) obj).G;
                if (cw0Var.C1) {
                    cw0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((au0) obj).f24636f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((lu0) obj).f28546f.f25474v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((pr0) obj).run();
                return;
            case 5:
                mv0 mv0Var = (mv0) obj;
                ArrayList arrayList3 = mv0Var.f28914f;
                if (mv0Var.h) {
                    mv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    mv0Var.f28919x.f25474v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((nv0) obj).F();
                return;
            case 7:
                ((tw0) obj).X();
                return;
            case 8:
                ((cx0) obj).getClass();
                return;
            case 9:
                ux0 ux0Var = (ux0) obj;
                if (!ux0Var.f31660w) {
                    ux0Var.f31662y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((fz0) obj).b();
                return;
            case 11:
                pz0 pz0Var = (pz0) obj;
                int i12 = pz0Var.f29888a;
                pz0Var.F = null;
                nz0 nz0Var = pz0Var.f29892c;
                if (nz0Var != null && nz0Var.getEditField() != null && pz0Var.f29892c.getFieldText() != null) {
                    int selectionStart = pz0Var.f29892c.getEditField().getSelectionStart();
                    int selectionEnd = pz0Var.f29892c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        pz0Var.f29899s = false;
                        ai.f0 f0Var = pz0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = pz0Var.f29892c.getFieldText();
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
                                pz0Var.f29899s = true;
                                pz0Var.c();
                                pz0Var.T = emojiSpan;
                                pz0Var.W = null;
                                pz0Var.V = null;
                                if (substring != null) {
                                    String str = pz0Var.H;
                                    if (str != null && pz0Var.G == 2 && str.equals(substring) && !pz0Var.f29901x && (arrayList2 = pz0Var.f29900w) != null && !arrayList2.isEmpty()) {
                                        pz0Var.v = false;
                                        pz0Var.c();
                                        ai.f0 f0Var2 = pz0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            pz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = pz0Var.I + 1;
                                        pz0Var.I = i13;
                                        Runnable runnable = pz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        pz0Var.K = new zk(pz0Var, substring, i13, 22);
                                        ArrayList arrayList5 = pz0Var.f29900w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            pz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(pz0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = pz0Var.d;
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
                            pz0Var.f29899s = true;
                            pz0Var.c();
                            pz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = pz0Var.H;
                                if (str2 != null && pz0Var.G == 1 && str2.equals(substring2) && !pz0Var.f29901x && (arrayList = pz0Var.f29900w) != null && !arrayList.isEmpty()) {
                                    pz0Var.v = false;
                                    pz0Var.c();
                                    pz0Var.d.setVisibility(0);
                                    pz0Var.U = AndroidUtilities.dp(10.0f);
                                    pz0Var.d.invalidate();
                                } else {
                                    int i14 = pz0Var.I + 1;
                                    pz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (pz0Var.J != null && Math.abs(currentTimeMillis - pz0Var.L) <= 360) {
                                        pz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = pz0Var.J;
                                    } else {
                                        pz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = pz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    pz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = pz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        pz0Var.K = null;
                                    }
                                    pz0Var.K = new ai.d9(pz0Var, currentKeyboardLanguage, substring2, i14, 28);
                                    ArrayList arrayList6 = pz0Var.f29900w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        pz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(pz0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = pz0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = pz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        pz0Var.K = null;
                    }
                    pz0Var.f29899s = false;
                    ai.f0 f0Var5 = pz0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                pz0Var.f29899s = false;
                pz0Var.v = true;
                ai.f0 f0Var6 = pz0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 12:
                vz0 vz0Var = (vz0) obj;
                vz0Var.G = null;
                vz0Var.b();
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
                ((t11) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((a21) obj).f24429a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                a31 a31Var = (a31) obj;
                a31Var.J = null;
                a31Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(is.f27443f).start();
                return;
            case 17:
                e31 e31Var = (e31) obj;
                ViewPropertyAnimator duration = e31Var.animate().alpha(0.0f).setListener(new wd0(e31Var, 23)).setDuration(300L);
                e31Var.f25887b = duration;
                duration.start();
                return;
            case 18:
                g31 g31Var = (g31) obj;
                Utilities.Callback callback = g31Var.f26601b;
                if (callback != null) {
                    callback.run(Long.valueOf(g31Var.f26600a.f26938s));
                    return;
                }
                return;
            case 19:
                d41 d41Var = ((u31) obj).f31310b;
                if (d41Var.k()) {
                    d41Var.l();
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
                ((m51) obj).f28636c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.al) obj).f30995c.presentFragment(new org.telegram.ui.f41());
                return;
            case 25:
                ((x51) obj).requestLayout();
                return;
            case 26:
                ((o61) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24374e0;
                undoView.getClass();
                try {
                    undoView.f24383f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((n71) obj).invalidateSelf();
                return;
            default:
                m00 m00Var = ((a81) obj).f24509b;
                if (m00Var != null) {
                    m00Var.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
