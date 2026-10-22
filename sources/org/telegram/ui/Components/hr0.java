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
public final class hr0 implements Runnable {
    public final int f26993a;
    public final Object f26994b;

    public hr0(Object obj, int i10) {
        this.f26993a = i10;
        this.f26994b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        a6[] a6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f26993a;
        Object obj = this.f26994b;
        switch (i10) {
            case 0:
                ((ir0) obj).setVisibility(8);
                return;
            case 1:
                uv0 uv0Var = ((js0) obj).G;
                if (uv0Var.C1) {
                    uv0Var.d1(false);
                    return;
                }
                return;
            case 2:
                ((st0) obj).f30360r.o1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((du0) obj).f25634f.f31074v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((hr0) obj).run();
                return;
            case 5:
                ev0 ev0Var = (ev0) obj;
                ArrayList arrayList3 = ev0Var.f25980f;
                if (ev0Var.h) {
                    ev0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    ev0Var.f25985x.f31074v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((fv0) obj).F();
                return;
            case 7:
                ((lw0) obj).X();
                return;
            case 8:
                ((uw0) obj).getClass();
                return;
            case 9:
                mx0 mx0Var = (mx0) obj;
                if (!mx0Var.f28625w) {
                    mx0Var.f28627y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((xy0) obj).b();
                return;
            case 11:
                iz0 iz0Var = (iz0) obj;
                int i12 = iz0Var.f27356a;
                iz0Var.F = null;
                gz0 gz0Var = iz0Var.f27360c;
                if (gz0Var != null && gz0Var.getEditField() != null && iz0Var.f27360c.getFieldText() != null) {
                    int selectionStart = iz0Var.f27360c.getEditField().getSelectionStart();
                    int selectionEnd = iz0Var.f27360c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        iz0Var.f27366s = false;
                        ah.x xVar = iz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = iz0Var.f27360c.getFieldText();
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
                                iz0Var.f27366s = true;
                                iz0Var.c();
                                iz0Var.T = emojiSpan;
                                iz0Var.W = null;
                                iz0Var.V = null;
                                if (substring != null) {
                                    String str = iz0Var.H;
                                    if (str != null && iz0Var.G == 2 && str.equals(substring) && !iz0Var.f27368x && (arrayList2 = iz0Var.f27367w) != null && !arrayList2.isEmpty()) {
                                        iz0Var.v = false;
                                        iz0Var.c();
                                        ah.x xVar2 = iz0Var.d;
                                        if (xVar2 != null) {
                                            xVar2.setVisibility(0);
                                            iz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = iz0Var.I + 1;
                                        iz0Var.I = i13;
                                        Runnable runnable = iz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        iz0Var.K = new org.telegram.ui.i4(iz0Var, substring, i13, 27);
                                        ArrayList arrayList5 = iz0Var.f27367w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            iz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(iz0Var.K, 600L);
                                        }
                                    }
                                }
                                ah.x xVar3 = iz0Var.d;
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
                            iz0Var.f27366s = true;
                            iz0Var.c();
                            iz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = iz0Var.H;
                                if (str2 != null && iz0Var.G == 1 && str2.equals(substring2) && !iz0Var.f27368x && (arrayList = iz0Var.f27367w) != null && !arrayList.isEmpty()) {
                                    iz0Var.v = false;
                                    iz0Var.c();
                                    iz0Var.d.setVisibility(0);
                                    iz0Var.U = AndroidUtilities.dp(10.0f);
                                    iz0Var.d.invalidate();
                                } else {
                                    int i14 = iz0Var.I + 1;
                                    iz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (iz0Var.J != null && Math.abs(currentTimeMillis - iz0Var.L) <= 360) {
                                        iz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = iz0Var.J;
                                    } else {
                                        iz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = iz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    iz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = iz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        iz0Var.K = null;
                                    }
                                    iz0Var.K = new ai.cb(iz0Var, currentKeyboardLanguage, substring2, i14, 29);
                                    ArrayList arrayList6 = iz0Var.f27367w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        iz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(iz0Var.K, 600L);
                                    }
                                }
                            }
                            ah.x xVar4 = iz0Var.d;
                            if (xVar4 != null) {
                                xVar4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = iz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        iz0Var.K = null;
                    }
                    iz0Var.f27366s = false;
                    ah.x xVar5 = iz0Var.d;
                    if (xVar5 != null) {
                        xVar5.invalidate();
                        return;
                    }
                    return;
                }
                iz0Var.f27366s = false;
                iz0Var.v = true;
                ah.x xVar6 = iz0Var.d;
                if (xVar6 != null) {
                    xVar6.invalidate();
                    return;
                }
                return;
            case 12:
                oz0 oz0Var = (oz0) obj;
                oz0Var.G = null;
                oz0Var.b();
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
                ((m11) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((s11) obj).f30118a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                r21 r21Var = (r21) obj;
                r21Var.J = null;
                r21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(bs.f25024f).start();
                return;
            case 17:
                v21 v21Var = (v21) obj;
                ViewPropertyAnimator duration = v21Var.animate().alpha(0.0f).setListener(new c80(v21Var, 28)).setDuration(300L);
                v21Var.f31128b = duration;
                duration.start();
                return;
            case 18:
                x21 x21Var = (x21) obj;
                Utilities.Callback callback = x21Var.f32326b;
                if (callback != null) {
                    callback.run(Long.valueOf(x21Var.f32325a.f32568s));
                    return;
                }
                return;
            case 19:
                s31 s31Var = ((i31) obj).f27118b;
                if (s31Var.k()) {
                    s31Var.l();
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
                ((d51) obj).f25341c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.rk) obj).f27760c.presentFragment(new org.telegram.ui.r21());
                return;
            case 25:
                ((o51) obj).requestLayout();
                return;
            case 26:
                ((f61) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24409e0;
                undoView.getClass();
                try {
                    undoView.f24417f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((e71) obj).invalidateSelf();
                return;
            default:
                e00 e00Var = ((r71) obj).f29864b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
        }
    }
}
