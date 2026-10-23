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
public final class kr0 implements Runnable {
    public final int f28138a;
    public final Object f28139b;

    public kr0(Object obj, int i10) {
        this.f28138a = i10;
        this.f28139b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        a6[] a6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f28138a;
        int i11 = 0;
        Object obj = this.f28139b;
        switch (i10) {
            case 0:
                nr0 nr0Var = (nr0) obj;
                lr0[] lr0VarArr = nr0Var.f29002a;
                if (nr0Var.f29003b != 1) {
                    for (lr0 lr0Var : lr0VarArr) {
                        org.telegram.ui.ActionBar.n5 n5Var = lr0Var.d;
                        n5Var.setAlpha(1.0f);
                        n5Var.setScaleX(1.0f);
                        n5Var.setScaleY(1.0f);
                        lr0Var.e.setAlpha(0.0f);
                    }
                    nr0Var.E = false;
                    AndroidUtilities.runOnUIThread(nr0Var.G, 4000L);
                    return;
                }
                nr0Var.E = !nr0Var.E;
                int length = lr0VarArr.length;
                while (i11 < length) {
                    lr0 lr0Var2 = lr0VarArr[i11];
                    org.telegram.ui.ActionBar.n5 n5Var2 = lr0Var2.d;
                    org.telegram.ui.ActionBar.n5 n5Var3 = lr0Var2.e;
                    n5Var2.setPivotX(0.0f);
                    n5Var3.setPivotX(0.0f);
                    if (nr0Var.E) {
                        n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        n5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        n5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(nr0Var.G, 4000L);
                return;
            case 1:
                ((lr0) obj).setVisibility(8);
                return;
            case 2:
                xv0 xv0Var = ((ms0) obj).G;
                if (xv0Var.C1) {
                    xv0Var.e1(false);
                    return;
                }
                return;
            case 3:
                ((vt0) obj).f32052r.p1(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = ((gu0) obj).f26716f.f32711v1;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 5:
                ((kr0) obj).run();
                return;
            case 6:
                hv0 hv0Var = (hv0) obj;
                ArrayList arrayList3 = hv0Var.f27058f;
                if (hv0Var.h) {
                    hv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    hv0Var.f27063x.f32711v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 7:
                ((iv0) obj).F();
                return;
            case 8:
                ((ow0) obj).W();
                return;
            case 9:
                ((xw0) obj).getClass();
                return;
            case 10:
                px0 px0Var = (px0) obj;
                if (!px0Var.f29691w) {
                    px0Var.f29693y = 0.0f;
                    return;
                }
                return;
            case 11:
                ((az0) obj).b();
                return;
            case 12:
                lz0 lz0Var = (lz0) obj;
                int i12 = lz0Var.f28439a;
                lz0Var.H = null;
                jz0 jz0Var = lz0Var.f28443c;
                if (jz0Var != null && jz0Var.getEditField() != null && lz0Var.f28443c.getFieldText() != null) {
                    int selectionStart = lz0Var.f28443c.getEditField().getSelectionStart();
                    int selectionEnd = lz0Var.f28443c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        lz0Var.f28451s = false;
                        ah.x xVar = lz0Var.d;
                        if (xVar != null) {
                            xVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = lz0Var.f28443c.getFieldText();
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
                                lz0Var.f28451s = true;
                                lz0Var.c();
                                lz0Var.V = emojiSpan;
                                lz0Var.f28442b0 = null;
                                lz0Var.f28440a0 = null;
                                if (substring != null) {
                                    String str = lz0Var.J;
                                    if (str != null && lz0Var.I == 2 && str.equals(substring) && !lz0Var.f28453x && (arrayList2 = lz0Var.f28452w) != null && !arrayList2.isEmpty()) {
                                        lz0Var.v = false;
                                        lz0Var.c();
                                        ah.x xVar2 = lz0Var.d;
                                        if (xVar2 != null) {
                                            xVar2.setVisibility(0);
                                            lz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = lz0Var.K + 1;
                                        lz0Var.K = i13;
                                        Runnable runnable = lz0Var.M;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        lz0Var.M = new org.telegram.ui.h4(lz0Var, substring, i13, 27);
                                        ArrayList arrayList5 = lz0Var.f28452w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            lz0Var.M.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(lz0Var.M, 600L);
                                        }
                                    }
                                }
                                ah.x xVar3 = lz0Var.d;
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
                            lz0Var.f28451s = true;
                            lz0Var.c();
                            lz0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = lz0Var.J;
                                if (str2 != null && lz0Var.I == 1 && str2.equals(substring2) && !lz0Var.f28453x && (arrayList = lz0Var.f28452w) != null && !arrayList.isEmpty()) {
                                    lz0Var.v = false;
                                    lz0Var.c();
                                    lz0Var.d.setVisibility(0);
                                    lz0Var.W = AndroidUtilities.dp(10.0f);
                                    lz0Var.d.invalidate();
                                } else {
                                    int i14 = lz0Var.K + 1;
                                    lz0Var.K = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (lz0Var.L != null && Math.abs(currentTimeMillis - lz0Var.N) <= 360) {
                                        lz0Var.N = currentTimeMillis;
                                        currentKeyboardLanguage = lz0Var.L;
                                    } else {
                                        lz0Var.N = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = lz0Var.L;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    lz0Var.L = currentKeyboardLanguage;
                                    Runnable runnable2 = lz0Var.M;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        lz0Var.M = null;
                                    }
                                    lz0Var.M = new fz0(lz0Var, currentKeyboardLanguage, substring2, i14, 0);
                                    ArrayList arrayList6 = lz0Var.f28452w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        lz0Var.M.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(lz0Var.M, 600L);
                                    }
                                }
                            }
                            ah.x xVar4 = lz0Var.d;
                            if (xVar4 != null) {
                                xVar4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = lz0Var.M;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        lz0Var.M = null;
                    }
                    lz0Var.f28451s = false;
                    ah.x xVar5 = lz0Var.d;
                    if (xVar5 != null) {
                        xVar5.invalidate();
                        return;
                    }
                    return;
                }
                lz0Var.f28451s = false;
                lz0Var.v = true;
                ah.x xVar6 = lz0Var.d;
                if (xVar6 != null) {
                    xVar6.invalidate();
                    return;
                }
                return;
            case 13:
                rz0 rz0Var = (rz0) obj;
                rz0Var.K = null;
                rz0Var.b();
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
                ((p11) obj).a();
                return;
            case 16:
                ArrayList arrayList7 = ((v11) obj).f31282a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).I3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).K3(false, false, false);
                    }
                }
                return;
            case 17:
                v21 v21Var = (v21) obj;
                v21Var.J = null;
                v21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(bs.f25133f).start();
                return;
            case 18:
                z21 z21Var = (z21) obj;
                ViewPropertyAnimator duration = z21Var.animate().alpha(0.0f).setListener(new i60(z21Var, 29)).setDuration(300L);
                z21Var.f33129b = duration;
                duration.start();
                return;
            case 19:
                b31 b31Var = (b31) obj;
                Utilities.Callback callback = b31Var.f24948b;
                if (callback != null) {
                    callback.run(Long.valueOf(b31Var.f24947a.f25228t));
                    return;
                }
                return;
            case 20:
                w31 w31Var = ((m31) obj).f28498b;
                if (w31Var.l()) {
                    w31Var.m();
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
                ((j51) obj).f27521c.setVisibility(8);
                return;
            case 25:
                ((org.telegram.ui.sk) obj).f29427c.presentFragment(new org.telegram.ui.v21());
                return;
            case 26:
                ((t51) obj).requestLayout();
                return;
            case 27:
                ((k61) obj).f();
                return;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f24554i0;
                undoView.getClass();
                try {
                    undoView.f24563f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((l71) obj).invalidateSelf();
                return;
        }
    }
}
