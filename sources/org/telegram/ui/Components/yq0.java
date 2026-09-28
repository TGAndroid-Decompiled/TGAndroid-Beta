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
public final class yq0 implements Runnable {
    public final int f30739a;
    public final Object f30740b;

    public yq0(Object obj, int i10) {
        this.f30739a = i10;
        this.f30740b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        z5[] z5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f30739a;
        int i11 = 0;
        Object obj = this.f30740b;
        switch (i10) {
            case 0:
                br0 br0Var = (br0) obj;
                zq0[] zq0VarArr = br0Var.f23092a;
                if (br0Var.f23093b != 1) {
                    for (zq0 zq0Var : zq0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = zq0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        zq0Var.e.setAlpha(0.0f);
                    }
                    br0Var.E = false;
                    AndroidUtilities.runOnUIThread(br0Var.G, 4000L);
                    return;
                }
                br0Var.E = !br0Var.E;
                int length = zq0VarArr.length;
                while (i11 < length) {
                    zq0 zq0Var2 = zq0VarArr[i11];
                    org.telegram.ui.ActionBar.h5 h5Var2 = zq0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = zq0Var2.e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (br0Var.E) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(br0Var.G, 4000L);
                return;
            case 1:
                ((zq0) obj).setVisibility(8);
                return;
            case 2:
                lv0 lv0Var = ((zr0) obj).G;
                if (lv0Var.C1) {
                    lv0Var.b1(false);
                    return;
                }
                return;
            case 3:
                ((jt0) obj).f25517f.m1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((ut0) obj).f28887f.f26160v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((yq0) obj).run();
                return;
            case 6:
                vu0 vu0Var = (vu0) obj;
                ArrayList arrayList3 = vu0Var.f29738f;
                if (vu0Var.h) {
                    vu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    vu0Var.f29743x.f26160v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 7:
                ((wu0) obj).F();
                return;
            case 8:
                ((cw0) obj).X();
                return;
            case 9:
                ((lw0) obj).getClass();
                return;
            case 10:
                dx0 dx0Var = (dx0) obj;
                if (!dx0Var.f23749w) {
                    dx0Var.f23751y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((py0) obj).b();
                return;
            case 12:
                zy0 zy0Var = (zy0) obj;
                int i12 = zy0Var.f30999a;
                zy0Var.F = null;
                xy0 xy0Var = zy0Var.f31003c;
                if (xy0Var != null && xy0Var.getEditField() != null && zy0Var.f31003c.getFieldText() != null) {
                    int selectionStart = zy0Var.f31003c.getEditField().getSelectionStart();
                    int selectionEnd = zy0Var.f31003c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        zy0Var.f31009s = false;
                        ai.f0 f0Var = zy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = zy0Var.f31003c.getFieldText();
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
                                zy0Var.f31009s = true;
                                zy0Var.c();
                                zy0Var.T = emojiSpan;
                                zy0Var.W = null;
                                zy0Var.V = null;
                                if (substring != null) {
                                    String str = zy0Var.H;
                                    if (str != null && zy0Var.G == 2 && str.equals(substring) && !zy0Var.f31011x && (arrayList2 = zy0Var.f31010w) != null && !arrayList2.isEmpty()) {
                                        zy0Var.v = false;
                                        zy0Var.c();
                                        ai.f0 f0Var2 = zy0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            zy0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = zy0Var.I + 1;
                                        zy0Var.I = i13;
                                        Runnable runnable = zy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        zy0Var.K = new ym(zy0Var, substring, i13, 21);
                                        ArrayList arrayList5 = zy0Var.f31010w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            zy0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(zy0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = zy0Var.d;
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
                            zy0Var.f31009s = true;
                            zy0Var.c();
                            zy0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = zy0Var.H;
                                if (str2 != null && zy0Var.G == 1 && str2.equals(substring2) && !zy0Var.f31011x && (arrayList = zy0Var.f31010w) != null && !arrayList.isEmpty()) {
                                    zy0Var.v = false;
                                    zy0Var.c();
                                    zy0Var.d.setVisibility(0);
                                    zy0Var.U = AndroidUtilities.dp(10.0f);
                                    zy0Var.d.invalidate();
                                } else {
                                    int i14 = zy0Var.I + 1;
                                    zy0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (zy0Var.J != null && Math.abs(currentTimeMillis - zy0Var.L) <= 360) {
                                        zy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = zy0Var.J;
                                    } else {
                                        zy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = zy0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    zy0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = zy0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        zy0Var.K = null;
                                    }
                                    zy0Var.K = new ai.c9(zy0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = zy0Var.f31010w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        zy0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(zy0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = zy0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = zy0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        zy0Var.K = null;
                    }
                    zy0Var.f31009s = false;
                    ai.f0 f0Var5 = zy0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                zy0Var.f31009s = false;
                zy0Var.v = true;
                ai.f0 f0Var6 = zy0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 13:
                fz0 fz0Var = (fz0) obj;
                fz0Var.G = null;
                fz0Var.b();
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
                ((c11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((j11) obj).f25267a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 17:
                j21 j21Var = (j21) obj;
                j21Var.J = null;
                j21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(sr.f28349f).start();
                return;
            case 18:
                n21 n21Var = (n21) obj;
                ViewPropertyAnimator duration = n21Var.animate().alpha(0.0f).setListener(new hd0(n21Var, 23)).setDuration(300L);
                n21Var.f26681b = duration;
                duration.start();
                return;
            case 19:
                p21 p21Var = (p21) obj;
                Utilities.Callback callback = p21Var.f27230b;
                if (callback != null) {
                    callback.run(Long.valueOf(p21Var.f27229a.f27524s));
                    return;
                }
                return;
            case 20:
                m31 m31Var = ((d31) obj).f23488b;
                if (m31Var.k()) {
                    m31Var.l();
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
                ((u41) obj).f28734c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.wk) obj).f22867c.presentFragment(new org.telegram.ui.w31());
                return;
            case 26:
                ((e51) obj).requestLayout();
                return;
            case 27:
                ((v51) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f22451e0;
                undoView.getClass();
                try {
                    undoView.f22459f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((w61) obj).invalidateSelf();
                return;
        }
    }
}
