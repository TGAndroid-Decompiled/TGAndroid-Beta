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
public final class ur0 implements Runnable {
    public final int f31254a;
    public final Object f31255b;

    public ur0(Object obj, int i10) {
        this.f31254a = i10;
        this.f31255b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        b6[] b6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f31254a;
        int i11 = 0;
        Object obj = this.f31255b;
        switch (i10) {
            case 0:
                xr0 xr0Var = (xr0) obj;
                vr0[] vr0VarArr = xr0Var.f32834a;
                if (xr0Var.f32835b != 1) {
                    for (vr0 vr0Var : vr0VarArr) {
                        org.telegram.ui.ActionBar.h5 h5Var = vr0Var.d;
                        h5Var.setAlpha(1.0f);
                        h5Var.setScaleX(1.0f);
                        h5Var.setScaleY(1.0f);
                        vr0Var.f32181e.setAlpha(0.0f);
                    }
                    xr0Var.E = false;
                    AndroidUtilities.runOnUIThread(xr0Var.G, 4000L);
                    return;
                }
                xr0Var.E = !xr0Var.E;
                int length = vr0VarArr.length;
                while (i11 < length) {
                    vr0 vr0Var2 = vr0VarArr[i11];
                    org.telegram.ui.ActionBar.h5 h5Var2 = vr0Var2.d;
                    org.telegram.ui.ActionBar.h5 h5Var3 = vr0Var2.f32181e;
                    h5Var2.setPivotX(0.0f);
                    h5Var3.setPivotX(0.0f);
                    if (xr0Var.E) {
                        h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        h5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        h5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(xr0Var.G, 4000L);
                return;
            case 1:
                ((vr0) obj).setVisibility(8);
                return;
            case 2:
                hw0 hw0Var = ((ws0) obj).G;
                if (hw0Var.C1) {
                    hw0Var.b1(false);
                    return;
                }
                return;
            case 3:
                ((fu0) obj).f26175f.m1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.m2 m2Var = ((qu0) obj).f29936f.f26972v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((ur0) obj).run();
                return;
            case 6:
                rv0 rv0Var = (rv0) obj;
                ArrayList arrayList3 = rv0Var.f30253f;
                if (rv0Var.h) {
                    rv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    rv0Var.f30258x.f26972v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 7:
                ((sv0) obj).F();
                return;
            case 8:
                ((yw0) obj).X();
                return;
            case 9:
                ((hx0) obj).getClass();
                return;
            case 10:
                zx0 zx0Var = (zx0) obj;
                if (!zx0Var.f33516w) {
                    zx0Var.f33518y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((kz0) obj).b();
                return;
            case 12:
                uz0 uz0Var = (uz0) obj;
                int i12 = uz0Var.f31293a;
                uz0Var.F = null;
                sz0 sz0Var = uz0Var.f31297c;
                if (sz0Var != null && sz0Var.getEditField() != null && uz0Var.f31297c.getFieldText() != null) {
                    int selectionStart = uz0Var.f31297c.getEditField().getSelectionStart();
                    int selectionEnd = uz0Var.f31297c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        uz0Var.f31304s = false;
                        ai.f0 f0Var = uz0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = uz0Var.f31297c.getFieldText();
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
                                uz0Var.f31304s = true;
                                uz0Var.c();
                                uz0Var.T = emojiSpan;
                                uz0Var.W = null;
                                uz0Var.V = null;
                                if (substring != null) {
                                    String str = uz0Var.H;
                                    if (str != null && uz0Var.G == 2 && str.equals(substring) && !uz0Var.f31306x && (arrayList2 = uz0Var.f31305w) != null && !arrayList2.isEmpty()) {
                                        uz0Var.v = false;
                                        uz0Var.c();
                                        ai.f0 f0Var2 = uz0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            uz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = uz0Var.I + 1;
                                        uz0Var.I = i13;
                                        Runnable runnable = uz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        uz0Var.K = new bl(uz0Var, substring, i13, 22);
                                        ArrayList arrayList5 = uz0Var.f31305w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            uz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(uz0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = uz0Var.d;
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
                            uz0Var.f31304s = true;
                            uz0Var.c();
                            uz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = uz0Var.H;
                                if (str2 != null && uz0Var.G == 1 && str2.equals(substring2) && !uz0Var.f31306x && (arrayList = uz0Var.f31305w) != null && !arrayList.isEmpty()) {
                                    uz0Var.v = false;
                                    uz0Var.c();
                                    uz0Var.d.setVisibility(0);
                                    uz0Var.U = AndroidUtilities.dp(10.0f);
                                    uz0Var.d.invalidate();
                                } else {
                                    int i14 = uz0Var.I + 1;
                                    uz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (uz0Var.J != null && Math.abs(currentTimeMillis - uz0Var.L) <= 360) {
                                        uz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = uz0Var.J;
                                    } else {
                                        uz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = uz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    uz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = uz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        uz0Var.K = null;
                                    }
                                    uz0Var.K = new ai.d9(uz0Var, currentKeyboardLanguage, substring2, i14, 28);
                                    ArrayList arrayList6 = uz0Var.f31305w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        uz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(uz0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = uz0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = uz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        uz0Var.K = null;
                    }
                    uz0Var.f31304s = false;
                    ai.f0 f0Var5 = uz0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                uz0Var.f31304s = false;
                uz0Var.v = true;
                ai.f0 f0Var6 = uz0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 13:
                a01 a01Var = (a01) obj;
                a01Var.G = null;
                a01Var.b();
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
                ((y11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((f21) obj).f25846a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 17:
                f31 f31Var = (f31) obj;
                f31Var.J = null;
                f31Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(js.f27627f).start();
                return;
            case 18:
                j31 j31Var = (j31) obj;
                ViewPropertyAnimator duration = j31Var.animate().alpha(0.0f).setListener(new zd0(j31Var, 23)).setDuration(300L);
                j31Var.f27358b = duration;
                duration.start();
                return;
            case 19:
                l31 l31Var = (l31) obj;
                Utilities.Callback callback = l31Var.f28022b;
                if (callback != null) {
                    callback.run(Long.valueOf(l31Var.f28021a.f28392s));
                    return;
                }
                return;
            case 20:
                h41 h41Var = ((y31) obj).f32951b;
                if (h41Var.k()) {
                    h41Var.l();
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
                ((q51) obj).f29703c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.el) obj).f32659c.presentFragment(new org.telegram.ui.h41());
                return;
            case 26:
                ((b61) obj).requestLayout();
                return;
            case 27:
                ((s61) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24147e0;
                undoView.getClass();
                try {
                    undoView.f24156f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((r71) obj).invalidateSelf();
                return;
        }
    }
}
