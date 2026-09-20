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
public final class wq0 implements Runnable {
    public final int f30079a;
    public final Object f30080b;

    public wq0(Object obj, int i10) {
        this.f30079a = i10;
        this.f30080b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        y5[] y5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f30079a;
        Object obj = this.f30080b;
        switch (i10) {
            case 0:
                ((xq0) obj).setVisibility(8);
                return;
            case 1:
                jv0 jv0Var = ((xr0) obj).G;
                if (jv0Var.C1) {
                    jv0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((ht0) obj).f24758f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((st0) obj).f28213f.f25528v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((wq0) obj).run();
                return;
            case 5:
                tu0 tu0Var = (tu0) obj;
                ArrayList arrayList3 = tu0Var.f28444f;
                if (tu0Var.h) {
                    tu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    tu0Var.f28449x.f25528v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((uu0) obj).F();
                return;
            case 7:
                ((aw0) obj).X();
                return;
            case 8:
                ((jw0) obj).getClass();
                return;
            case 9:
                cx0 cx0Var = (cx0) obj;
                if (!cx0Var.f23420w) {
                    cx0Var.f23422y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((oy0) obj).b();
                return;
            case 11:
                yy0 yy0Var = (yy0) obj;
                int i12 = yy0Var.f30638a;
                yy0Var.F = null;
                wy0 wy0Var = yy0Var.f30642c;
                if (wy0Var != null && wy0Var.getEditField() != null && yy0Var.f30642c.getFieldText() != null) {
                    int selectionStart = yy0Var.f30642c.getEditField().getSelectionStart();
                    int selectionEnd = yy0Var.f30642c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        yy0Var.f30648s = false;
                        ai.f0 f0Var = yy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = yy0Var.f30642c.getFieldText();
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
                                yy0Var.f30648s = true;
                                yy0Var.c();
                                yy0Var.T = emojiSpan;
                                yy0Var.W = null;
                                yy0Var.V = null;
                                if (substring != null) {
                                    String str = yy0Var.H;
                                    if (str != null && yy0Var.G == 2 && str.equals(substring) && !yy0Var.f30650x && (arrayList2 = yy0Var.f30649w) != null && !arrayList2.isEmpty()) {
                                        yy0Var.v = false;
                                        yy0Var.c();
                                        ai.f0 f0Var2 = yy0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            yy0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = yy0Var.I + 1;
                                        yy0Var.I = i13;
                                        Runnable runnable = yy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        yy0Var.K = new wm(yy0Var, substring, i13, 21);
                                        ArrayList arrayList5 = yy0Var.f30649w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            yy0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(yy0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = yy0Var.d;
                                if (f0Var3 != null) {
                                    f0Var3.invalidate();
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
                            yy0Var.f30648s = true;
                            yy0Var.c();
                            yy0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = yy0Var.H;
                                if (str2 != null && yy0Var.G == 1 && str2.equals(substring2) && !yy0Var.f30650x && (arrayList = yy0Var.f30649w) != null && !arrayList.isEmpty()) {
                                    yy0Var.v = false;
                                    yy0Var.c();
                                    yy0Var.d.setVisibility(0);
                                    yy0Var.U = AndroidUtilities.dp(10.0f);
                                    yy0Var.d.invalidate();
                                } else {
                                    int i14 = yy0Var.I + 1;
                                    yy0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (yy0Var.J != null && Math.abs(currentTimeMillis - yy0Var.L) <= 360) {
                                        yy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = yy0Var.J;
                                    } else {
                                        yy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = yy0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    yy0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = yy0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        yy0Var.K = null;
                                    }
                                    yy0Var.K = new ai.c9(yy0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = yy0Var.f30649w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        yy0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(yy0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = yy0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = yy0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        yy0Var.K = null;
                    }
                    yy0Var.f30648s = false;
                    ai.f0 f0Var5 = yy0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                yy0Var.f30648s = false;
                yy0Var.v = true;
                ai.f0 f0Var6 = yy0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 12:
                ez0 ez0Var = (ez0) obj;
                ez0Var.G = null;
                ez0Var.b();
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
                ((b11) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((i11) obj).f24833a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                i21 i21Var = (i21) obj;
                i21Var.J = null;
                i21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f27642f).start();
                return;
            case 17:
                m21 m21Var = (m21) obj;
                ViewPropertyAnimator duration = m21Var.animate().alpha(0.0f).setListener(new dd0(m21Var, 23)).setDuration(300L);
                m21Var.f26308b = duration;
                duration.start();
                return;
            case 18:
                o21 o21Var = (o21) obj;
                Utilities.Callback callback = o21Var.f26796b;
                if (callback != null) {
                    callback.run(Long.valueOf(o21Var.f26795a.f27135s));
                    return;
                }
                return;
            case 19:
                l31 l31Var = ((c31) obj).f23137b;
                if (l31Var.k()) {
                    l31Var.l();
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
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                return;
            case 23:
                ((t41) obj).f28285c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.yk) obj).f22526c.presentFragment(new org.telegram.ui.f41());
                return;
            case 25:
                ((d51) obj).requestLayout();
                return;
            case 26:
                ((u51) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f22449e0;
                undoView.getClass();
                try {
                    undoView.f22457f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((v61) obj).invalidateSelf();
                return;
            default:
                vz vzVar = ((i71) obj).f24903b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
