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
public final class zq0 implements Runnable {
    public final int f31051a;
    public final Object f31052b;

    public zq0(Object obj, int i10) {
        this.f31051a = i10;
        this.f31052b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        z5[] z5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f31051a;
        int i11 = 0;
        Object obj = this.f31052b;
        switch (i10) {
            case 0:
                cr0 cr0Var = (cr0) obj;
                ar0[] ar0VarArr = cr0Var.f23405a;
                if (cr0Var.f23406b != 1) {
                    for (ar0 ar0Var : ar0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = ar0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        ar0Var.e.setAlpha(0.0f);
                    }
                    cr0Var.E = false;
                    AndroidUtilities.runOnUIThread(cr0Var.G, 4000L);
                    return;
                }
                cr0Var.E = !cr0Var.E;
                int length = ar0VarArr.length;
                while (i11 < length) {
                    ar0 ar0Var2 = ar0VarArr[i11];
                    org.telegram.ui.ActionBar.h5 h5Var2 = ar0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = ar0Var2.e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (cr0Var.E) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(cr0Var.G, 4000L);
                return;
            case 1:
                ((ar0) obj).setVisibility(8);
                return;
            case 2:
                mv0 mv0Var = ((as0) obj).G;
                if (mv0Var.C1) {
                    mv0Var.b1(false);
                    return;
                }
                return;
            case 3:
                ((kt0) obj).f25824f.m1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((vt0) obj).f29723f.f26449v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((zq0) obj).run();
                return;
            case 6:
                wu0 wu0Var = (wu0) obj;
                ArrayList arrayList3 = wu0Var.f30059f;
                if (wu0Var.h) {
                    wu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    wu0Var.f30064x.f26449v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 7:
                ((xu0) obj).F();
                return;
            case 8:
                ((dw0) obj).X();
                return;
            case 9:
                ((mw0) obj).getClass();
                return;
            case 10:
                ex0 ex0Var = (ex0) obj;
                if (!ex0Var.f24070w) {
                    ex0Var.f24072y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((qy0) obj).b();
                return;
            case 12:
                az0 az0Var = (az0) obj;
                int i12 = az0Var.f22744a;
                az0Var.F = null;
                yy0 yy0Var = az0Var.f22748c;
                if (yy0Var != null && yy0Var.getEditField() != null && az0Var.f22748c.getFieldText() != null) {
                    int selectionStart = az0Var.f22748c.getEditField().getSelectionStart();
                    int selectionEnd = az0Var.f22748c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        az0Var.f22754s = false;
                        ai.f0 f0Var = az0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = az0Var.f22748c.getFieldText();
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
                                az0Var.f22754s = true;
                                az0Var.c();
                                az0Var.T = emojiSpan;
                                az0Var.W = null;
                                az0Var.V = null;
                                if (substring != null) {
                                    String str = az0Var.H;
                                    if (str != null && az0Var.G == 2 && str.equals(substring) && !az0Var.f22756x && (arrayList2 = az0Var.f22755w) != null && !arrayList2.isEmpty()) {
                                        az0Var.v = false;
                                        az0Var.c();
                                        ai.f0 f0Var2 = az0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            az0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = az0Var.I + 1;
                                        az0Var.I = i13;
                                        Runnable runnable = az0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        az0Var.K = new zm(az0Var, substring, i13, 21);
                                        ArrayList arrayList5 = az0Var.f22755w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            az0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(az0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = az0Var.d;
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
                            az0Var.f22754s = true;
                            az0Var.c();
                            az0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = az0Var.H;
                                if (str2 != null && az0Var.G == 1 && str2.equals(substring2) && !az0Var.f22756x && (arrayList = az0Var.f22755w) != null && !arrayList.isEmpty()) {
                                    az0Var.v = false;
                                    az0Var.c();
                                    az0Var.d.setVisibility(0);
                                    az0Var.U = AndroidUtilities.dp(10.0f);
                                    az0Var.d.invalidate();
                                } else {
                                    int i14 = az0Var.I + 1;
                                    az0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (az0Var.J != null && Math.abs(currentTimeMillis - az0Var.L) <= 360) {
                                        az0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = az0Var.J;
                                    } else {
                                        az0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = az0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    az0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = az0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        az0Var.K = null;
                                    }
                                    az0Var.K = new ai.c9(az0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = az0Var.f22755w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        az0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(az0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = az0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = az0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        az0Var.K = null;
                    }
                    az0Var.f22754s = false;
                    ai.f0 f0Var5 = az0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                az0Var.f22754s = false;
                az0Var.v = true;
                ai.f0 f0Var6 = az0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 13:
                gz0 gz0Var = (gz0) obj;
                gz0Var.G = null;
                gz0Var.b();
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
                ((d11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((k11) obj).f25604a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 17:
                k21 k21Var = (k21) obj;
                k21Var.J = null;
                k21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(tr.f28636f).start();
                return;
            case 18:
                o21 o21Var = (o21) obj;
                ViewPropertyAnimator duration = o21Var.animate().alpha(0.0f).setListener(new id0(o21Var, 23)).setDuration(300L);
                o21Var.f26965b = duration;
                duration.start();
                return;
            case 19:
                q21 q21Var = (q21) obj;
                Utilities.Callback callback = q21Var.f27524b;
                if (callback != null) {
                    callback.run(Long.valueOf(q21Var.f27523a.f27831s));
                    return;
                }
                return;
            case 20:
                n31 n31Var = ((e31) obj).f23838b;
                if (n31Var.k()) {
                    n31Var.l();
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
                ((v41) obj).f29032c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.wk) obj).f23162c.presentFragment(new org.telegram.ui.w31());
                return;
            case 26:
                ((f51) obj).requestLayout();
                return;
            case 27:
                ((w51) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f22472e0;
                undoView.getClass();
                try {
                    undoView.f22480f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((x61) obj).invalidateSelf();
                return;
        }
    }
}
