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
public final class fq0 implements Runnable {
    public final int f28518a;
    public final Object f28519b;

    public fq0(Object obj, int i10) {
        this.f28518a = i10;
        this.f28519b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        y5[] y5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f28518a;
        Object obj = this.f28519b;
        switch (i10) {
            case 0:
                ((gq0) obj).setVisibility(8);
                return;
            case 1:
                qu0 qu0Var = ((fr0) obj).C;
                if (qu0Var.f32111y1) {
                    qu0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((ns0) obj).f31131f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = ((ys0) obj).f35129f.f32093r1;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((fq0) obj).run();
                return;
            case 5:
                zt0 zt0Var = (zt0) obj;
                ArrayList arrayList3 = zt0Var.f35416f;
                if (zt0Var.h) {
                    zt0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    zt0Var.f35421x.f32093r1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((bu0) obj).F();
                return;
            case 7:
                ((hv0) obj).X();
                return;
            case 8:
                ((qv0) obj).getClass();
                return;
            case 9:
                jw0 jw0Var = (jw0) obj;
                if (!jw0Var.f29837w) {
                    jw0Var.f29839y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((vx0) obj).b();
                return;
            case 11:
                fy0 fy0Var = (fy0) obj;
                int i12 = fy0Var.f28563a;
                fy0Var.B = null;
                dy0 dy0Var = fy0Var.f28565c;
                if (dy0Var != null && dy0Var.getEditField() != null && fy0Var.f28565c.getFieldText() != null) {
                    int selectionStart = fy0Var.f28565c.getEditField().getSelectionStart();
                    int selectionEnd = fy0Var.f28565c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        fy0Var.f28570s = false;
                        bg.x2 x2Var = fy0Var.d;
                        if (x2Var != null) {
                            x2Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = fy0Var.f28565c.getFieldText();
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
                                fy0Var.f28570s = true;
                                fy0Var.c();
                                fy0Var.P = emojiSpan;
                                fy0Var.S = null;
                                fy0Var.R = null;
                                if (substring != null) {
                                    String str = fy0Var.D;
                                    if (str != null && fy0Var.C == 2 && str.equals(substring) && !fy0Var.f28572x && (arrayList2 = fy0Var.f28571w) != null && !arrayList2.isEmpty()) {
                                        fy0Var.v = false;
                                        fy0Var.c();
                                        bg.x2 x2Var2 = fy0Var.d;
                                        if (x2Var2 != null) {
                                            x2Var2.setVisibility(0);
                                            fy0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = fy0Var.E + 1;
                                        fy0Var.E = i13;
                                        Runnable runnable = fy0Var.G;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        fy0Var.G = new rm(fy0Var, substring, i13, 21);
                                        ArrayList arrayList5 = fy0Var.f28571w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            fy0Var.G.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(fy0Var.G, 600L);
                                        }
                                    }
                                }
                                bg.x2 x2Var3 = fy0Var.d;
                                if (x2Var3 != null) {
                                    x2Var3.invalidate();
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
                            fy0Var.f28570s = true;
                            fy0Var.c();
                            fy0Var.P = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = fy0Var.D;
                                if (str2 != null && fy0Var.C == 1 && str2.equals(substring2) && !fy0Var.f28572x && (arrayList = fy0Var.f28571w) != null && !arrayList.isEmpty()) {
                                    fy0Var.v = false;
                                    fy0Var.c();
                                    fy0Var.d.setVisibility(0);
                                    fy0Var.Q = AndroidUtilities.dp(10.0f);
                                    fy0Var.d.invalidate();
                                } else {
                                    int i14 = fy0Var.E + 1;
                                    fy0Var.E = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (fy0Var.F != null && Math.abs(currentTimeMillis - fy0Var.H) <= 360) {
                                        fy0Var.H = currentTimeMillis;
                                        currentKeyboardLanguage = fy0Var.F;
                                    } else {
                                        fy0Var.H = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = fy0Var.F;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    fy0Var.F = currentKeyboardLanguage;
                                    Runnable runnable2 = fy0Var.G;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        fy0Var.G = null;
                                    }
                                    fy0Var.G = new ag.z1(fy0Var, currentKeyboardLanguage, substring2, i14, 26);
                                    ArrayList arrayList6 = fy0Var.f28571w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        fy0Var.G.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(fy0Var.G, 600L);
                                    }
                                }
                            }
                            bg.x2 x2Var4 = fy0Var.d;
                            if (x2Var4 != null) {
                                x2Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = fy0Var.G;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        fy0Var.G = null;
                    }
                    fy0Var.f28570s = false;
                    bg.x2 x2Var5 = fy0Var.d;
                    if (x2Var5 != null) {
                        x2Var5.invalidate();
                        return;
                    }
                    return;
                }
                fy0Var.f28570s = false;
                fy0Var.v = true;
                bg.x2 x2Var6 = fy0Var.d;
                if (x2Var6 != null) {
                    x2Var6.invalidate();
                    return;
                }
                return;
            case 12:
                ly0 ly0Var = (ly0) obj;
                ly0Var.C = null;
                ly0Var.b();
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
                ((g01) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((m01) obj).f30498a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                l11 l11Var = (l11) obj;
                l11Var.F = null;
                l11Var.D.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(jr.f29800f).start();
                return;
            case 17:
                q11 q11Var = (q11) obj;
                ViewPropertyAnimator duration = q11Var.animate().alpha(0.0f).setListener(new p11(q11Var, 0)).setDuration(300L);
                q11Var.f31828b = duration;
                duration.start();
                return;
            case 18:
                s11 s11Var = (s11) obj;
                Utilities.Callback callback = s11Var.f32455b;
                if (callback != null) {
                    callback.run(Long.valueOf(s11Var.f32454a.f32819s));
                    return;
                }
                return;
            case 19:
                m21 m21Var = ((d21) obj).f27645b;
                if (m21Var.k()) {
                    m21Var.l();
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
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                return;
            case 23:
                ((u31) obj).f33116c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.qk) obj).f26660c.presentFragment(new org.telegram.ui.b31());
                return;
            case 25:
                ((d41) obj).requestLayout();
                return;
            case 26:
                ((u41) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f26586a0;
                undoView.getClass();
                try {
                    undoView.f26591f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((x51) obj).invalidateSelf();
                return;
            default:
                qz qzVar = ((l61) obj).f30235b;
                if (qzVar != null) {
                    qzVar.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
