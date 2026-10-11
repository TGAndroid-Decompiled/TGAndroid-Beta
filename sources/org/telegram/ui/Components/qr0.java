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
public final class qr0 implements Runnable {
    public final int f30235a;
    public final Object f30236b;

    public qr0(Object obj, int i10) {
        this.f30235a = i10;
        this.f30236b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        b6[] b6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f30235a;
        Object obj = this.f30236b;
        switch (i10) {
            case 0:
                ((rr0) obj).setVisibility(8);
                return;
            case 1:
                dw0 dw0Var = ((ss0) obj).G;
                if (dw0Var.C1) {
                    dw0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((bu0) obj).f25025f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.m2 m2Var = ((mu0) obj).f28863f.f25735v1;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((qr0) obj).run();
                return;
            case 5:
                nv0 nv0Var = (nv0) obj;
                ArrayList arrayList3 = nv0Var.f29157f;
                if (nv0Var.h) {
                    nv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    nv0Var.f29162x.f25735v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((ov0) obj).F();
                return;
            case 7:
                ((uw0) obj).X();
                return;
            case 8:
                ((dx0) obj).getClass();
                return;
            case 9:
                vx0 vx0Var = (vx0) obj;
                if (!vx0Var.f32507w) {
                    vx0Var.f32509y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((gz0) obj).b();
                return;
            case 11:
                qz0 qz0Var = (qz0) obj;
                int i12 = qz0Var.f30268a;
                qz0Var.F = null;
                oz0 oz0Var = qz0Var.f30272c;
                if (oz0Var != null && oz0Var.getEditField() != null && qz0Var.f30272c.getFieldText() != null) {
                    int selectionStart = qz0Var.f30272c.getEditField().getSelectionStart();
                    int selectionEnd = qz0Var.f30272c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        qz0Var.f30279s = false;
                        ai.f0 f0Var = qz0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = qz0Var.f30272c.getFieldText();
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
                                qz0Var.f30279s = true;
                                qz0Var.c();
                                qz0Var.T = emojiSpan;
                                qz0Var.W = null;
                                qz0Var.V = null;
                                if (substring != null) {
                                    String str = qz0Var.H;
                                    if (str != null && qz0Var.G == 2 && str.equals(substring) && !qz0Var.f30281x && (arrayList2 = qz0Var.f30280w) != null && !arrayList2.isEmpty()) {
                                        qz0Var.v = false;
                                        qz0Var.c();
                                        ai.f0 f0Var2 = qz0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            qz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = qz0Var.I + 1;
                                        qz0Var.I = i13;
                                        Runnable runnable = qz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        qz0Var.K = new zk(qz0Var, substring, i13, 22);
                                        ArrayList arrayList5 = qz0Var.f30280w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            qz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(qz0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = qz0Var.d;
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
                            qz0Var.f30279s = true;
                            qz0Var.c();
                            qz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = qz0Var.H;
                                if (str2 != null && qz0Var.G == 1 && str2.equals(substring2) && !qz0Var.f30281x && (arrayList = qz0Var.f30280w) != null && !arrayList.isEmpty()) {
                                    qz0Var.v = false;
                                    qz0Var.c();
                                    qz0Var.d.setVisibility(0);
                                    qz0Var.U = AndroidUtilities.dp(10.0f);
                                    qz0Var.d.invalidate();
                                } else {
                                    int i14 = qz0Var.I + 1;
                                    qz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (qz0Var.J != null && Math.abs(currentTimeMillis - qz0Var.L) <= 360) {
                                        qz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = qz0Var.J;
                                    } else {
                                        qz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = qz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    qz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = qz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        qz0Var.K = null;
                                    }
                                    qz0Var.K = new ai.d9(qz0Var, currentKeyboardLanguage, substring2, i14, 28);
                                    ArrayList arrayList6 = qz0Var.f30280w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        qz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(qz0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = qz0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = qz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        qz0Var.K = null;
                    }
                    qz0Var.f30279s = false;
                    ai.f0 f0Var5 = qz0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                qz0Var.f30279s = false;
                qz0Var.v = true;
                ai.f0 f0Var6 = qz0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 12:
                wz0 wz0Var = (wz0) obj;
                wz0Var.G = null;
                wz0Var.b();
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
                ((u11) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((b21) obj).f24785a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                b31 b31Var = (b31) obj;
                b31Var.J = null;
                b31Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(is.f27451f).start();
                return;
            case 17:
                f31 f31Var = (f31) obj;
                ViewPropertyAnimator duration = f31Var.animate().alpha(0.0f).setListener(new wd0(f31Var, 23)).setDuration(300L);
                f31Var.f26214b = duration;
                duration.start();
                return;
            case 18:
                h31 h31Var = (h31) obj;
                Utilities.Callback callback = h31Var.f26900b;
                if (callback != null) {
                    callback.run(Long.valueOf(h31Var.f26899a.f27171s));
                    return;
                }
                return;
            case 19:
                e41 e41Var = ((v31) obj).f31670b;
                if (e41Var.k()) {
                    e41Var.l();
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
                ((n51) obj).f28961c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.al) obj).f31246c.presentFragment(new org.telegram.ui.e41());
                return;
            case 25:
                ((y51) obj).requestLayout();
                return;
            case 26:
                ((p61) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24362e0;
                undoView.getClass();
                try {
                    undoView.f24371f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((o71) obj).invalidateSelf();
                return;
            default:
                m00 m00Var = ((b81) obj).f24880b;
                if (m00Var != null) {
                    m00Var.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
