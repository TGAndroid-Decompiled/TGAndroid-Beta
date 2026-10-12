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
public final class lr0 implements Runnable {
    public final int f27115a;
    public final Object f27116b;

    public lr0(Object obj, int i10) {
        this.f27115a = i10;
        this.f27116b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        b6[] b6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f27115a;
        int i11 = 0;
        Object obj = this.f27116b;
        switch (i10) {
            case 0:
                or0 or0Var = (or0) obj;
                mr0[] mr0VarArr = or0Var.f28030a;
                if (or0Var.f28031b != 1) {
                    for (mr0 mr0Var : mr0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = mr0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        mr0Var.e.setAlpha(0.0f);
                    }
                    or0Var.E = false;
                    AndroidUtilities.runOnUIThread(or0Var.G, 4000L);
                    return;
                }
                or0Var.E = !or0Var.E;
                int length = mr0VarArr.length;
                while (i11 < length) {
                    mr0 mr0Var2 = mr0VarArr[i11];
                    org.telegram.ui.ActionBar.h5 h5Var2 = mr0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = mr0Var2.e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (or0Var.E) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(or0Var.G, 4000L);
                return;
            case 1:
                ((mr0) obj).setVisibility(8);
                return;
            case 2:
                xv0 xv0Var = ((ms0) obj).G;
                if (xv0Var.C1) {
                    xv0Var.b1(false);
                    return;
                }
                return;
            case 3:
                ((vt0) obj).f30648f.m1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((gu0) obj).f25424f.f31388v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((lr0) obj).run();
                return;
            case 6:
                hv0 hv0Var = (hv0) obj;
                ArrayList arrayList3 = hv0Var.f25761f;
                if (hv0Var.h) {
                    hv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    hv0Var.f25766x.f31388v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
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
                if (!px0Var.f28443w) {
                    px0Var.f28445y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((az0) obj).b();
                return;
            case 12:
                kz0 kz0Var = (kz0) obj;
                int i12 = kz0Var.f26827a;
                kz0Var.F = null;
                iz0 iz0Var = kz0Var.f26831c;
                if (iz0Var != null && iz0Var.getEditField() != null && kz0Var.f26831c.getFieldText() != null) {
                    int selectionStart = kz0Var.f26831c.getEditField().getSelectionStart();
                    int selectionEnd = kz0Var.f26831c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        kz0Var.f26837s = false;
                        ah.x xVar = kz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = kz0Var.f26831c.getFieldText();
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
                                kz0Var.f26837s = true;
                                kz0Var.c();
                                kz0Var.T = emojiSpan;
                                kz0Var.W = null;
                                kz0Var.V = null;
                                if (substring != null) {
                                    String str = kz0Var.H;
                                    if (str != null && kz0Var.G == 2 && str.equals(substring) && !kz0Var.f26839x && (arrayList2 = kz0Var.f26838w) != null && !arrayList2.isEmpty()) {
                                        kz0Var.v = false;
                                        kz0Var.c();
                                        ah.x xVar2 = kz0Var.d;
                                        if (xVar2 != null) {
                                            xVar2.setVisibility(0);
                                            kz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = kz0Var.I + 1;
                                        kz0Var.I = i13;
                                        Runnable runnable = kz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        kz0Var.K = new org.telegram.ui.gm(kz0Var, substring, i13, 23);
                                        ArrayList arrayList5 = kz0Var.f26838w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            kz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(kz0Var.K, 600L);
                                        }
                                    }
                                }
                                ah.x xVar3 = kz0Var.d;
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
                            kz0Var.f26837s = true;
                            kz0Var.c();
                            kz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = kz0Var.H;
                                if (str2 != null && kz0Var.G == 1 && str2.equals(substring2) && !kz0Var.f26839x && (arrayList = kz0Var.f26838w) != null && !arrayList.isEmpty()) {
                                    kz0Var.v = false;
                                    kz0Var.c();
                                    kz0Var.d.setVisibility(0);
                                    kz0Var.U = AndroidUtilities.dp(10.0f);
                                    kz0Var.d.invalidate();
                                } else {
                                    int i14 = kz0Var.I + 1;
                                    kz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (kz0Var.J != null && Math.abs(currentTimeMillis - kz0Var.L) <= 360) {
                                        kz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = kz0Var.J;
                                    } else {
                                        kz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = kz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    kz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = kz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        kz0Var.K = null;
                                    }
                                    kz0Var.K = new bi.n8(kz0Var, currentKeyboardLanguage, substring2, i14, 28);
                                    ArrayList arrayList6 = kz0Var.f26838w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        kz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(kz0Var.K, 600L);
                                    }
                                }
                            }
                            ah.x xVar4 = kz0Var.d;
                            if (xVar4 != null) {
                                xVar4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = kz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        kz0Var.K = null;
                    }
                    kz0Var.f26837s = false;
                    ah.x xVar5 = kz0Var.d;
                    if (xVar5 != null) {
                        xVar5.invalidate();
                        return;
                    }
                    return;
                }
                kz0Var.f26837s = false;
                kz0Var.v = true;
                ah.x xVar6 = kz0Var.d;
                if (xVar6 != null) {
                    xVar6.invalidate();
                    return;
                }
                return;
            case 13:
                qz0 qz0Var = (qz0) obj;
                qz0Var.G = null;
                qz0Var.b();
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
                ((o11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((v11) obj).f29833a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 17:
                v21 v21Var = (v21) obj;
                v21Var.J = null;
                v21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(es.f24771f).start();
                return;
            case 18:
                z21 z21Var = (z21) obj;
                ViewPropertyAnimator duration = z21Var.animate().alpha(0.0f).setListener(new k90(z21Var, 26)).setDuration(300L);
                z21Var.f31743b = duration;
                duration.start();
                return;
            case 19:
                b31 b31Var = (b31) obj;
                Utilities.Callback callback = b31Var.f23694b;
                if (callback != null) {
                    callback.run(Long.valueOf(b31Var.f23693a.f23940s));
                    return;
                }
                return;
            case 20:
                y31 y31Var = ((p31) obj).f28143b;
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
                ((h51) obj).f25508c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.el) obj).f27850c.presentFragment(new org.telegram.ui.l41());
                return;
            case 26:
                ((s51) obj).requestLayout();
                return;
            case 27:
                ((j61) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f23347e0;
                undoView.getClass();
                try {
                    undoView.f23355f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((j71) obj).invalidateSelf();
                return;
        }
    }
}
