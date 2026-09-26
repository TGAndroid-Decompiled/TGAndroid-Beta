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
public final class xq0 implements Runnable {
    public final int f30455a;
    public final Object f30456b;

    public xq0(Object obj, int i10) {
        this.f30455a = i10;
        this.f30456b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        z5[] z5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f30455a;
        int i11 = 0;
        Object obj = this.f30456b;
        switch (i10) {
            case 0:
                ar0 ar0Var = (ar0) obj;
                yq0[] yq0VarArr = ar0Var.f22733a;
                if (ar0Var.f22734b != 1) {
                    for (yq0 yq0Var : yq0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = yq0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        yq0Var.e.setAlpha(0.0f);
                    }
                    ar0Var.E = false;
                    AndroidUtilities.runOnUIThread(ar0Var.G, 4000L);
                    return;
                }
                ar0Var.E = !ar0Var.E;
                int length = yq0VarArr.length;
                while (i11 < length) {
                    yq0 yq0Var2 = yq0VarArr[i11];
                    org.telegram.ui.ActionBar.h5 h5Var2 = yq0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = yq0Var2.e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (ar0Var.E) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(ar0Var.G, 4000L);
                return;
            case 1:
                ((yq0) obj).setVisibility(8);
                return;
            case 2:
                kv0 kv0Var = ((yr0) obj).G;
                if (kv0Var.C1) {
                    kv0Var.b1(false);
                    return;
                }
                return;
            case 3:
                ((it0) obj).f25188f.m1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((tt0) obj).f28612f.f25866v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((xq0) obj).run();
                return;
            case 6:
                uu0 uu0Var = (uu0) obj;
                ArrayList arrayList3 = uu0Var.f28905f;
                if (uu0Var.h) {
                    uu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    uu0Var.f28910x.f25866v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 7:
                ((vu0) obj).F();
                return;
            case 8:
                ((bw0) obj).X();
                return;
            case 9:
                ((kw0) obj).getClass();
                return;
            case 10:
                cx0 cx0Var = (cx0) obj;
                if (!cx0Var.f23428w) {
                    cx0Var.f23430y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((oy0) obj).b();
                return;
            case 12:
                yy0 yy0Var = (yy0) obj;
                int i12 = yy0Var.f30727a;
                yy0Var.F = null;
                wy0 wy0Var = yy0Var.f30731c;
                if (wy0Var != null && wy0Var.getEditField() != null && yy0Var.f30731c.getFieldText() != null) {
                    int selectionStart = yy0Var.f30731c.getEditField().getSelectionStart();
                    int selectionEnd = yy0Var.f30731c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        yy0Var.f30737s = false;
                        ai.f0 f0Var = yy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = yy0Var.f30731c.getFieldText();
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
                                yy0Var.f30737s = true;
                                yy0Var.c();
                                yy0Var.T = emojiSpan;
                                yy0Var.W = null;
                                yy0Var.V = null;
                                if (substring != null) {
                                    String str = yy0Var.H;
                                    if (str != null && yy0Var.G == 2 && str.equals(substring) && !yy0Var.f30739x && (arrayList2 = yy0Var.f30738w) != null && !arrayList2.isEmpty()) {
                                        yy0Var.v = false;
                                        yy0Var.c();
                                        ai.f0 f0Var2 = yy0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            yy0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = yy0Var.I + 1;
                                        yy0Var.I = i13;
                                        Runnable runnable = yy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        yy0Var.K = new ym(yy0Var, substring, i13, 21);
                                        ArrayList arrayList5 = yy0Var.f30738w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            yy0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(yy0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = yy0Var.d;
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
                            yy0Var.f30737s = true;
                            yy0Var.c();
                            yy0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = yy0Var.H;
                                if (str2 != null && yy0Var.G == 1 && str2.equals(substring2) && !yy0Var.f30739x && (arrayList = yy0Var.f30738w) != null && !arrayList.isEmpty()) {
                                    yy0Var.v = false;
                                    yy0Var.c();
                                    yy0Var.d.setVisibility(0);
                                    yy0Var.U = AndroidUtilities.dp(10.0f);
                                    yy0Var.d.invalidate();
                                } else {
                                    int i14 = yy0Var.I + 1;
                                    yy0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (yy0Var.J != null && Math.abs(currentTimeMillis - yy0Var.L) <= 360) {
                                        yy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = yy0Var.J;
                                    } else {
                                        yy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = yy0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    yy0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = yy0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        yy0Var.K = null;
                                    }
                                    yy0Var.K = new ai.c9(yy0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = yy0Var.f30738w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        yy0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(yy0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = yy0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = yy0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        yy0Var.K = null;
                    }
                    yy0Var.f30737s = false;
                    ai.f0 f0Var5 = yy0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                yy0Var.f30737s = false;
                yy0Var.v = true;
                ai.f0 f0Var6 = yy0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 13:
                ez0 ez0Var = (ez0) obj;
                ez0Var.G = null;
                ez0Var.b();
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
                ((b11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((i11) obj).f24931a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 17:
                i21 i21Var = (i21) obj;
                i21Var.J = null;
                i21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(sr.f28339f).start();
                return;
            case 18:
                m21 m21Var = (m21) obj;
                ViewPropertyAnimator duration = m21Var.animate().alpha(0.0f).setListener(new gd0(m21Var, 23)).setDuration(300L);
                m21Var.f26305b = duration;
                duration.start();
                return;
            case 19:
                o21 o21Var = (o21) obj;
                Utilities.Callback callback = o21Var.f26915b;
                if (callback != null) {
                    callback.run(Long.valueOf(o21Var.f26914a.f27207s));
                    return;
                }
                return;
            case 20:
                l31 l31Var = ((c31) obj).f23196b;
                if (l31Var.k()) {
                    l31Var.l();
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
                ((t41) obj).f28458c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.wk) obj).f22538c.presentFragment(new org.telegram.ui.w31());
                return;
            case 26:
                ((d51) obj).requestLayout();
                return;
            case 27:
                ((u51) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f22450e0;
                undoView.getClass();
                try {
                    undoView.f22458f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((v61) obj).invalidateSelf();
                return;
        }
    }
}
