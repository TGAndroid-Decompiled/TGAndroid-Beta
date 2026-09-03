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
public final class nq0 implements Runnable {
    public final int f29564a;
    public final Object f29565b;

    public nq0(Object obj, int i10) {
        this.f29564a = i10;
        this.f29565b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        u5[] u5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f29564a;
        Object obj = this.f29565b;
        switch (i10) {
            case 0:
                ((oq0) obj).setVisibility(8);
                return;
            case 1:
                yu0 yu0Var = ((nr0) obj).D;
                if (yu0Var.f33666z1) {
                    yu0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((vs0) obj).f32537f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = ((gt0) obj).f27280f.f33649s1;
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((nq0) obj).run();
                return;
            case 5:
                hu0 hu0Var = (hu0) obj;
                ArrayList arrayList3 = hu0Var.f27631f;
                if (hu0Var.h) {
                    hu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    hu0Var.f27636x.f33649s1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((ju0) obj).F();
                return;
            case 7:
                ((pv0) obj).X();
                return;
            case 8:
                ((zv0) obj).getClass();
                return;
            case 9:
                sw0 sw0Var = (sw0) obj;
                if (!sw0Var.f31193w) {
                    sw0Var.f31195y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((fy0) obj).b();
                return;
            case 11:
                qy0 qy0Var = (qy0) obj;
                int i12 = qy0Var.f30558a;
                qy0Var.C = null;
                oy0 oy0Var = qy0Var.f30561c;
                if (oy0Var != null && oy0Var.getEditField() != null && qy0Var.f30561c.getFieldText() != null) {
                    int selectionStart = qy0Var.f30561c.getEditField().getSelectionStart();
                    int selectionEnd = qy0Var.f30561c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        qy0Var.f30566s = false;
                        eg.s2 s2Var = qy0Var.d;
                        if (s2Var != null) {
                            s2Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = qy0Var.f30561c.getFieldText();
                    boolean z4 = fieldText instanceof Spanned;
                    if (z4) {
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
                                qy0Var.f30566s = true;
                                qy0Var.c();
                                qy0Var.Q = emojiSpan;
                                qy0Var.T = null;
                                qy0Var.S = null;
                                if (substring != null) {
                                    String str = qy0Var.E;
                                    if (str != null && qy0Var.D == 2 && str.equals(substring) && !qy0Var.f30568x && (arrayList2 = qy0Var.f30567w) != null && !arrayList2.isEmpty()) {
                                        qy0Var.v = false;
                                        qy0Var.c();
                                        eg.s2 s2Var2 = qy0Var.d;
                                        if (s2Var2 != null) {
                                            s2Var2.setVisibility(0);
                                            qy0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = qy0Var.F + 1;
                                        qy0Var.F = i13;
                                        Runnable runnable = qy0Var.H;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        qy0Var.H = new gy(qy0Var, substring, i13, 19);
                                        ArrayList arrayList5 = qy0Var.f30567w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            qy0Var.H.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(qy0Var.H, 600L);
                                        }
                                    }
                                }
                                eg.s2 s2Var3 = qy0Var.d;
                                if (s2Var3 != null) {
                                    s2Var3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z4) {
                            u5VarArr = (u5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, u5.class);
                        } else {
                            u5VarArr = null;
                        }
                        if ((u5VarArr == null || u5VarArr.length == 0) && selectionEnd < 52) {
                            qy0Var.f30566s = true;
                            qy0Var.c();
                            qy0Var.Q = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = qy0Var.E;
                                if (str2 != null && qy0Var.D == 1 && str2.equals(substring2) && !qy0Var.f30568x && (arrayList = qy0Var.f30567w) != null && !arrayList.isEmpty()) {
                                    qy0Var.v = false;
                                    qy0Var.c();
                                    qy0Var.d.setVisibility(0);
                                    qy0Var.R = AndroidUtilities.dp(10.0f);
                                    qy0Var.d.invalidate();
                                } else {
                                    int i14 = qy0Var.F + 1;
                                    qy0Var.F = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (qy0Var.G != null && Math.abs(currentTimeMillis - qy0Var.I) <= 360) {
                                        qy0Var.I = currentTimeMillis;
                                        currentKeyboardLanguage = qy0Var.G;
                                    } else {
                                        qy0Var.I = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = qy0Var.G;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    qy0Var.G = currentKeyboardLanguage;
                                    Runnable runnable2 = qy0Var.H;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        qy0Var.H = null;
                                    }
                                    qy0Var.H = new dg.u1(qy0Var, currentKeyboardLanguage, substring2, i14, 26);
                                    ArrayList arrayList6 = qy0Var.f30567w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        qy0Var.H.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(qy0Var.H, 600L);
                                    }
                                }
                            }
                            eg.s2 s2Var4 = qy0Var.d;
                            if (s2Var4 != null) {
                                s2Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = qy0Var.H;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        qy0Var.H = null;
                    }
                    qy0Var.f30566s = false;
                    eg.s2 s2Var5 = qy0Var.d;
                    if (s2Var5 != null) {
                        s2Var5.invalidate();
                        return;
                    }
                    return;
                }
                qy0Var.f30566s = false;
                qy0Var.v = true;
                eg.s2 s2Var6 = qy0Var.d;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 12:
                wy0 wy0Var = (wy0) obj;
                wy0Var.D = null;
                wy0Var.b();
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
                ((r01) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((x01) obj).f32872a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                w11 w11Var = (w11) obj;
                w11Var.G = null;
                w11Var.E.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(pr.f30168f).start();
                return;
            case 17:
                a21 a21Var = (a21) obj;
                ViewPropertyAnimator duration = a21Var.animate().alpha(0.0f).setListener(new pd0(a21Var, 21)).setDuration(300L);
                a21Var.f25141b = duration;
                duration.start();
                return;
            case 18:
                c21 c21Var = (c21) obj;
                Utilities.Callback callback = c21Var.f25739b;
                if (callback != null) {
                    callback.run(Long.valueOf(c21Var.f25738a.f26153s));
                    return;
                }
                return;
            case 19:
                w21 w21Var = ((n21) obj).f29370b;
                if (w21Var.k()) {
                    w21Var.l();
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
                ((org.telegram.ui.ActionBar.p1) obj).dismiss();
                return;
            case 23:
                ((f41) obj).f26773c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.wk) obj).f28618c.presentFragment(new org.telegram.ui.t31());
                return;
            case 25:
                ((o41) obj).requestLayout();
                return;
            case 26:
                ((f51) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f25076b0;
                undoView.getClass();
                try {
                    undoView.f25082f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((k61) obj).invalidateSelf();
                return;
            default:
                xz xzVar = ((x61) obj).f32958b;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
