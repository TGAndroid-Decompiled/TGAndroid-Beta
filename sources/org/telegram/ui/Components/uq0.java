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
public final class uq0 implements Runnable {
    public final int f27737a;
    public final Object f27738b;

    public uq0(Object obj, int i10) {
        this.f27737a = i10;
        this.f27738b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        y5[] y5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f27737a;
        Object obj = this.f27738b;
        switch (i10) {
            case 0:
                ((vq0) obj).setVisibility(8);
                return;
            case 1:
                iv0 iv0Var = ((vr0) obj).G;
                if (iv0Var.C1) {
                    iv0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((ft0) obj).f23081f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = ((qt0) obj).f26486f.f24131v1;
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((uq0) obj).run();
                return;
            case 5:
                ru0 ru0Var = (ru0) obj;
                ArrayList arrayList3 = ru0Var.f26756f;
                if (ru0Var.h) {
                    ru0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    ru0Var.f26761x.f24131v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((tu0) obj).F();
                return;
            case 7:
                ((aw0) obj).X();
                return;
            case 8:
                ((jw0) obj).getClass();
                return;
            case 9:
                cx0 cx0Var = (cx0) obj;
                if (!cx0Var.f22244w) {
                    cx0Var.f22246y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((py0) obj).b();
                return;
            case 11:
                zy0 zy0Var = (zy0) obj;
                int i12 = zy0Var.f29828a;
                zy0Var.F = null;
                xy0 xy0Var = zy0Var.f29832c;
                if (xy0Var != null && xy0Var.getEditField() != null && zy0Var.f29832c.getFieldText() != null) {
                    int selectionStart = zy0Var.f29832c.getEditField().getSelectionStart();
                    int selectionEnd = zy0Var.f29832c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        zy0Var.f29838s = false;
                        bi.ld ldVar = zy0Var.d;
                        if (ldVar != null) {
                            ldVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = zy0Var.f29832c.getFieldText();
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
                                zy0Var.f29838s = true;
                                zy0Var.c();
                                zy0Var.T = emojiSpan;
                                zy0Var.W = null;
                                zy0Var.V = null;
                                if (substring != null) {
                                    String str = zy0Var.H;
                                    if (str != null && zy0Var.G == 2 && str.equals(substring) && !zy0Var.f29840x && (arrayList2 = zy0Var.f29839w) != null && !arrayList2.isEmpty()) {
                                        zy0Var.v = false;
                                        zy0Var.c();
                                        bi.ld ldVar2 = zy0Var.d;
                                        if (ldVar2 != null) {
                                            ldVar2.setVisibility(0);
                                            zy0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = zy0Var.I + 1;
                                        zy0Var.I = i13;
                                        Runnable runnable = zy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        zy0Var.K = new my(zy0Var, substring, i13, 19);
                                        ArrayList arrayList5 = zy0Var.f29839w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            zy0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(zy0Var.K, 600L);
                                        }
                                    }
                                }
                                bi.ld ldVar3 = zy0Var.d;
                                if (ldVar3 != null) {
                                    ldVar3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            y5VarArr = (y5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, y5.class);
                        } else {
                            y5VarArr = null;
                        }
                        if ((y5VarArr == null || y5VarArr.length == 0) && selectionEnd < 52) {
                            zy0Var.f29838s = true;
                            zy0Var.c();
                            zy0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = zy0Var.H;
                                if (str2 != null && zy0Var.G == 1 && str2.equals(substring2) && !zy0Var.f29840x && (arrayList = zy0Var.f29839w) != null && !arrayList.isEmpty()) {
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
                                    zy0Var.K = new di.q(zy0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = zy0Var.f29839w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        zy0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(zy0Var.K, 600L);
                                    }
                                }
                            }
                            bi.ld ldVar4 = zy0Var.d;
                            if (ldVar4 != null) {
                                ldVar4.invalidate();
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
                    zy0Var.f29838s = false;
                    bi.ld ldVar5 = zy0Var.d;
                    if (ldVar5 != null) {
                        ldVar5.invalidate();
                        return;
                    }
                    return;
                }
                zy0Var.f29838s = false;
                zy0Var.v = true;
                bi.ld ldVar6 = zy0Var.d;
                if (ldVar6 != null) {
                    ldVar6.invalidate();
                    return;
                }
                return;
            case 12:
                fz0 fz0Var = (fz0) obj;
                fz0Var.G = null;
                fz0Var.b();
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
                ((a11) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((h11) obj).f23470a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                i21 i21Var = (i21) obj;
                i21Var.J = null;
                i21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(wr.f28819f).start();
                return;
            case 17:
                m21 m21Var = (m21) obj;
                ViewPropertyAnimator duration = m21Var.animate().alpha(0.0f).setListener(new zn0(m21Var, 12)).setDuration(300L);
                m21Var.f25154b = duration;
                duration.start();
                return;
            case 18:
                o21 o21Var = (o21) obj;
                Utilities.Callback callback = o21Var.f25648b;
                if (callback != null) {
                    callback.run(Long.valueOf(o21Var.f25647a.f26005s));
                    return;
                }
                return;
            case 19:
                k31 k31Var = ((b31) obj).f21699b;
                if (k31Var.k()) {
                    k31Var.l();
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
                ((s41) obj).f26947c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.bl) obj).f29587c.presentFragment(new org.telegram.ui.k41());
                return;
            case 25:
                ((c51) obj).requestLayout();
                return;
            case 26:
                ((t51) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f21313e0;
                undoView.getClass();
                try {
                    undoView.f21321f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((u61) obj).invalidateSelf();
                return;
            default:
                c00 c00Var = ((h71) obj).f23538b;
                if (c00Var != null) {
                    c00Var.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
