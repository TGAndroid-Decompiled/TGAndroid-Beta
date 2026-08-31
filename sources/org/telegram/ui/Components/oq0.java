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
public final class oq0 implements Runnable {
    public final int f29836a;
    public final Object f29837b;

    public oq0(Object obj, int i10) {
        this.f29836a = i10;
        this.f29837b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        u5[] u5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f29836a;
        Object obj = this.f29837b;
        switch (i10) {
            case 0:
                ((pq0) obj).setVisibility(8);
                return;
            case 1:
                zu0 zu0Var = ((or0) obj).D;
                if (zu0Var.f34021z1) {
                    zu0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((ws0) obj).f32845f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = ((ht0) obj).f27587f.f34004s1;
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((oq0) obj).run();
                return;
            case 5:
                iu0 iu0Var = (iu0) obj;
                ArrayList arrayList3 = iu0Var.f27908f;
                if (iu0Var.h) {
                    iu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    iu0Var.f27913x.f34004s1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((ku0) obj).F();
                return;
            case 7:
                ((qv0) obj).X();
                return;
            case 8:
                ((aw0) obj).getClass();
                return;
            case 9:
                tw0 tw0Var = (tw0) obj;
                if (!tw0Var.f31467w) {
                    tw0Var.f31469y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((gy0) obj).b();
                return;
            case 11:
                ry0 ry0Var = (ry0) obj;
                int i12 = ry0Var.f30897a;
                ry0Var.C = null;
                py0 py0Var = ry0Var.f30900c;
                if (py0Var != null && py0Var.getEditField() != null && ry0Var.f30900c.getFieldText() != null) {
                    int selectionStart = ry0Var.f30900c.getEditField().getSelectionStart();
                    int selectionEnd = ry0Var.f30900c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ry0Var.f30905s = false;
                        eg.s2 s2Var = ry0Var.d;
                        if (s2Var != null) {
                            s2Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = ry0Var.f30900c.getFieldText();
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
                                ry0Var.f30905s = true;
                                ry0Var.c();
                                ry0Var.Q = emojiSpan;
                                ry0Var.T = null;
                                ry0Var.S = null;
                                if (substring != null) {
                                    String str = ry0Var.E;
                                    if (str != null && ry0Var.D == 2 && str.equals(substring) && !ry0Var.f30907x && (arrayList2 = ry0Var.f30906w) != null && !arrayList2.isEmpty()) {
                                        ry0Var.v = false;
                                        ry0Var.c();
                                        eg.s2 s2Var2 = ry0Var.d;
                                        if (s2Var2 != null) {
                                            s2Var2.setVisibility(0);
                                            ry0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = ry0Var.F + 1;
                                        ry0Var.F = i13;
                                        Runnable runnable = ry0Var.H;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        ry0Var.H = new gy(ry0Var, substring, i13, 19);
                                        ArrayList arrayList5 = ry0Var.f30906w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            ry0Var.H.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(ry0Var.H, 600L);
                                        }
                                    }
                                }
                                eg.s2 s2Var3 = ry0Var.d;
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
                            ry0Var.f30905s = true;
                            ry0Var.c();
                            ry0Var.Q = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = ry0Var.E;
                                if (str2 != null && ry0Var.D == 1 && str2.equals(substring2) && !ry0Var.f30907x && (arrayList = ry0Var.f30906w) != null && !arrayList.isEmpty()) {
                                    ry0Var.v = false;
                                    ry0Var.c();
                                    ry0Var.d.setVisibility(0);
                                    ry0Var.R = AndroidUtilities.dp(10.0f);
                                    ry0Var.d.invalidate();
                                } else {
                                    int i14 = ry0Var.F + 1;
                                    ry0Var.F = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (ry0Var.G != null && Math.abs(currentTimeMillis - ry0Var.I) <= 360) {
                                        ry0Var.I = currentTimeMillis;
                                        currentKeyboardLanguage = ry0Var.G;
                                    } else {
                                        ry0Var.I = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = ry0Var.G;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    ry0Var.G = currentKeyboardLanguage;
                                    Runnable runnable2 = ry0Var.H;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        ry0Var.H = null;
                                    }
                                    ry0Var.H = new dg.u1(ry0Var, currentKeyboardLanguage, substring2, i14, 26);
                                    ArrayList arrayList6 = ry0Var.f30906w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        ry0Var.H.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(ry0Var.H, 600L);
                                    }
                                }
                            }
                            eg.s2 s2Var4 = ry0Var.d;
                            if (s2Var4 != null) {
                                s2Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = ry0Var.H;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        ry0Var.H = null;
                    }
                    ry0Var.f30905s = false;
                    eg.s2 s2Var5 = ry0Var.d;
                    if (s2Var5 != null) {
                        s2Var5.invalidate();
                        return;
                    }
                    return;
                }
                ry0Var.f30905s = false;
                ry0Var.v = true;
                eg.s2 s2Var6 = ry0Var.d;
                if (s2Var6 != null) {
                    s2Var6.invalidate();
                    return;
                }
                return;
            case 12:
                xy0 xy0Var = (xy0) obj;
                xy0Var.D = null;
                xy0Var.b();
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
                ((s01) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((y01) obj).f33236a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                x11 x11Var = (x11) obj;
                x11Var.G = null;
                x11Var.E.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(pr.f30183f).start();
                return;
            case 17:
                b21 b21Var = (b21) obj;
                ViewPropertyAnimator duration = b21Var.animate().alpha(0.0f).setListener(new pd0(b21Var, 21)).setDuration(300L);
                b21Var.f25466b = duration;
                duration.start();
                return;
            case 18:
                d21 d21Var = (d21) obj;
                Utilities.Callback callback = d21Var.f26178b;
                if (callback != null) {
                    callback.run(Long.valueOf(d21Var.f26177a.f26395s));
                    return;
                }
                return;
            case 19:
                x21 x21Var = ((o21) obj).f29659b;
                if (x21Var.k()) {
                    x21Var.l();
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
                ((g41) obj).f27103c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.wk) obj).f29398c.presentFragment(new org.telegram.ui.p31());
                return;
            case 25:
                ((q41) obj).requestLayout();
                return;
            case 26:
                ((h51) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f25074b0;
                undoView.getClass();
                try {
                    undoView.f25080f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((l61) obj).invalidateSelf();
                return;
            default:
                xz xzVar = ((y61) obj).f33384b;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
