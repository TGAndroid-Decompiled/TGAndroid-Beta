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
public final class jq0 implements Runnable {
    public final int f25386a;
    public final Object f25387b;

    public jq0(Object obj, int i10) {
        this.f25386a = i10;
        this.f25387b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        z5[] z5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f25386a;
        Object obj = this.f25387b;
        switch (i10) {
            case 0:
                ((kq0) obj).setVisibility(8);
                return;
            case 1:
                yu0 yu0Var = ((mr0) obj).G;
                if (yu0Var.C1) {
                    yu0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((ws0) obj).f29803f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((ht0) obj).f24822f.f30450v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((jq0) obj).run();
                return;
            case 5:
                iu0 iu0Var = (iu0) obj;
                ArrayList arrayList3 = iu0Var.f25062f;
                if (iu0Var.h) {
                    iu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    iu0Var.f25067x.f30450v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
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
                ((yv0) obj).getClass();
                return;
            case 9:
                qw0 qw0Var = (qw0) obj;
                if (!qw0Var.f27473w) {
                    qw0Var.f27475y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((cy0) obj).b();
                return;
            case 11:
                my0 my0Var = (my0) obj;
                int i12 = my0Var.f26288a;
                my0Var.F = null;
                ky0 ky0Var = my0Var.f26292c;
                if (ky0Var != null && ky0Var.getEditField() != null && my0Var.f26292c.getFieldText() != null) {
                    int selectionStart = my0Var.f26292c.getEditField().getSelectionStart();
                    int selectionEnd = my0Var.f26292c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        my0Var.f26298s = false;
                        ai.f0 f0Var = my0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = my0Var.f26292c.getFieldText();
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
                                my0Var.f26298s = true;
                                my0Var.c();
                                my0Var.T = emojiSpan;
                                my0Var.W = null;
                                my0Var.V = null;
                                if (substring != null) {
                                    String str = my0Var.H;
                                    if (str != null && my0Var.G == 2 && str.equals(substring) && !my0Var.f26300x && (arrayList2 = my0Var.f26299w) != null && !arrayList2.isEmpty()) {
                                        my0Var.v = false;
                                        my0Var.c();
                                        ai.f0 f0Var2 = my0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            my0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = my0Var.I + 1;
                                        my0Var.I = i13;
                                        Runnable runnable = my0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        my0Var.K = new xm(my0Var, substring, i13, 21);
                                        ArrayList arrayList5 = my0Var.f26299w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            my0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(my0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = my0Var.d;
                                if (f0Var3 != null) {
                                    f0Var3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            z5VarArr = (z5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, z5.class);
                        } else {
                            z5VarArr = null;
                        }
                        if ((z5VarArr == null || z5VarArr.length == 0) && selectionEnd < 52) {
                            my0Var.f26298s = true;
                            my0Var.c();
                            my0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = my0Var.H;
                                if (str2 != null && my0Var.G == 1 && str2.equals(substring2) && !my0Var.f26300x && (arrayList = my0Var.f26299w) != null && !arrayList.isEmpty()) {
                                    my0Var.v = false;
                                    my0Var.c();
                                    my0Var.d.setVisibility(0);
                                    my0Var.U = AndroidUtilities.dp(10.0f);
                                    my0Var.d.invalidate();
                                } else {
                                    int i14 = my0Var.I + 1;
                                    my0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (my0Var.J != null && Math.abs(currentTimeMillis - my0Var.L) <= 360) {
                                        my0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = my0Var.J;
                                    } else {
                                        my0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = my0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    my0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = my0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        my0Var.K = null;
                                    }
                                    my0Var.K = new ai.c9(my0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = my0Var.f26299w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        my0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(my0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = my0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = my0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        my0Var.K = null;
                    }
                    my0Var.f26298s = false;
                    ai.f0 f0Var5 = my0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                my0Var.f26298s = false;
                my0Var.v = true;
                ai.f0 f0Var6 = my0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 12:
                sy0 sy0Var = (sy0) obj;
                sy0Var.G = null;
                sy0Var.b();
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
                ((m01) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((t01) obj).f28033a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                t11 t11Var = (t11) obj;
                t11Var.J = null;
                t11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(rr.f27701f).start();
                return;
            case 17:
                x11 x11Var = (x11) obj;
                ViewPropertyAnimator duration = x11Var.animate().alpha(0.0f).setListener(new jd0(x11Var, 22)).setDuration(300L);
                x11Var.f29871b = duration;
                duration.start();
                return;
            case 18:
                z11 z11Var = (z11) obj;
                Utilities.Callback callback = z11Var.f30514b;
                if (callback != null) {
                    callback.run(Long.valueOf(z11Var.f30513a.f22329s));
                    return;
                }
                return;
            case 19:
                w21 w21Var = ((n21) obj).f26329b;
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
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                return;
            case 23:
                ((e41) obj).f23562c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.wk) obj).f25808c.presentFragment(new org.telegram.ui.x31());
                return;
            case 25:
                ((o41) obj).requestLayout();
                return;
            case 26:
                ((f51) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f22199e0;
                undoView.getClass();
                try {
                    undoView.f22207f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((g61) obj).invalidateSelf();
                return;
            default:
                wz wzVar = ((t61) obj).f28102b;
                if (wzVar != null) {
                    wzVar.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
