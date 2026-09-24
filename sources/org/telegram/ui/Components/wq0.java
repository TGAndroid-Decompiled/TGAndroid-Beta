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
public final class wq0 implements Runnable {
    public final int f30150a;
    public final Object f30151b;

    public wq0(Object obj, int i10) {
        this.f30150a = i10;
        this.f30151b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        z5[] z5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f30150a;
        int i11 = 0;
        Object obj = this.f30151b;
        switch (i10) {
            case 0:
                zq0 zq0Var = (zq0) obj;
                xq0[] xq0VarArr = zq0Var.f30958a;
                if (zq0Var.f30959b != 1) {
                    for (xq0 xq0Var : xq0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = xq0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        xq0Var.e.setAlpha(0.0f);
                    }
                    zq0Var.E = false;
                    AndroidUtilities.runOnUIThread(zq0Var.G, 4000L);
                    return;
                }
                zq0Var.E = !zq0Var.E;
                int length = xq0VarArr.length;
                while (i11 < length) {
                    xq0 xq0Var2 = xq0VarArr[i11];
                    org.telegram.ui.ActionBar.h5 h5Var2 = xq0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = xq0Var2.e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (zq0Var.E) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(zq0Var.G, 4000L);
                return;
            case 1:
                ((xq0) obj).setVisibility(8);
                return;
            case 2:
                jv0 jv0Var = ((xr0) obj).G;
                if (jv0Var.C1) {
                    jv0Var.b1(false);
                    return;
                }
                return;
            case 3:
                ((ht0) obj).f24841f.m1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((st0) obj).f28319f.f25543v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((wq0) obj).run();
                return;
            case 6:
                tu0 tu0Var = (tu0) obj;
                ArrayList arrayList3 = tu0Var.f28611f;
                if (tu0Var.h) {
                    tu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    tu0Var.f28616x.f25543v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 7:
                ((uu0) obj).F();
                return;
            case 8:
                ((aw0) obj).X();
                return;
            case 9:
                ((jw0) obj).getClass();
                return;
            case 10:
                bx0 bx0Var = (bx0) obj;
                if (!bx0Var.f23089w) {
                    bx0Var.f23091y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((ny0) obj).b();
                return;
            case 12:
                xy0 xy0Var = (xy0) obj;
                int i12 = xy0Var.f30418a;
                xy0Var.F = null;
                vy0 vy0Var = xy0Var.f30422c;
                if (vy0Var != null && vy0Var.getEditField() != null && xy0Var.f30422c.getFieldText() != null) {
                    int selectionStart = xy0Var.f30422c.getEditField().getSelectionStart();
                    int selectionEnd = xy0Var.f30422c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        xy0Var.f30428s = false;
                        ai.f0 f0Var = xy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = xy0Var.f30422c.getFieldText();
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
                                xy0Var.f30428s = true;
                                xy0Var.c();
                                xy0Var.T = emojiSpan;
                                xy0Var.W = null;
                                xy0Var.V = null;
                                if (substring != null) {
                                    String str = xy0Var.H;
                                    if (str != null && xy0Var.G == 2 && str.equals(substring) && !xy0Var.f30430x && (arrayList2 = xy0Var.f30429w) != null && !arrayList2.isEmpty()) {
                                        xy0Var.v = false;
                                        xy0Var.c();
                                        ai.f0 f0Var2 = xy0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            xy0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = xy0Var.I + 1;
                                        xy0Var.I = i13;
                                        Runnable runnable = xy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        xy0Var.K = new xm(xy0Var, substring, i13, 21);
                                        ArrayList arrayList5 = xy0Var.f30429w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            xy0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(xy0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = xy0Var.d;
                                if (f0Var3 != null) {
                                    f0Var3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            z5VarArr = (z5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, z5.class);
                        } else {
                            z5VarArr = null;
                        }
                        if ((z5VarArr == null || z5VarArr.length == 0) && selectionEnd < 52) {
                            xy0Var.f30428s = true;
                            xy0Var.c();
                            xy0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = xy0Var.H;
                                if (str2 != null && xy0Var.G == 1 && str2.equals(substring2) && !xy0Var.f30430x && (arrayList = xy0Var.f30429w) != null && !arrayList.isEmpty()) {
                                    xy0Var.v = false;
                                    xy0Var.c();
                                    xy0Var.d.setVisibility(0);
                                    xy0Var.U = AndroidUtilities.dp(10.0f);
                                    xy0Var.d.invalidate();
                                } else {
                                    int i14 = xy0Var.I + 1;
                                    xy0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (xy0Var.J != null && Math.abs(currentTimeMillis - xy0Var.L) <= 360) {
                                        xy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = xy0Var.J;
                                    } else {
                                        xy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = xy0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    xy0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = xy0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        xy0Var.K = null;
                                    }
                                    xy0Var.K = new ai.c9(xy0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = xy0Var.f30429w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        xy0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(xy0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = xy0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = xy0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        xy0Var.K = null;
                    }
                    xy0Var.f30428s = false;
                    ai.f0 f0Var5 = xy0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                xy0Var.f30428s = false;
                xy0Var.v = true;
                ai.f0 f0Var6 = xy0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 13:
                dz0 dz0Var = (dz0) obj;
                dz0Var.G = null;
                dz0Var.b();
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
                ((a11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((h11) obj).f24584a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 17:
                h21 h21Var = (h21) obj;
                h21Var.J = null;
                h21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(rr.f28022f).start();
                return;
            case 18:
                l21 l21Var = (l21) obj;
                ViewPropertyAnimator duration = l21Var.animate().alpha(0.0f).setListener(new fd0(l21Var, 23)).setDuration(300L);
                l21Var.f26005b = duration;
                duration.start();
                return;
            case 19:
                n21 n21Var = (n21) obj;
                Utilities.Callback callback = n21Var.f26613b;
                if (callback != null) {
                    callback.run(Long.valueOf(n21Var.f26612a.f26892s));
                    return;
                }
                return;
            case 20:
                k31 k31Var = ((b31) obj).f22854b;
                if (k31Var.k()) {
                    k31Var.l();
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
                ((s41) obj).f28138c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.wk) obj).f30774c.presentFragment(new org.telegram.ui.w31());
                return;
            case 26:
                ((c51) obj).requestLayout();
                return;
            case 27:
                ((t51) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f22436e0;
                undoView.getClass();
                try {
                    undoView.f22444f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((u61) obj).invalidateSelf();
                return;
        }
    }
}
