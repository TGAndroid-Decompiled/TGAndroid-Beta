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
public final class kq0 implements Runnable {
    public final int f25673a;
    public final Object f25674b;

    public kq0(Object obj, int i10) {
        this.f25673a = i10;
        this.f25674b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        x5[] x5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f25673a;
        Object obj = this.f25674b;
        switch (i10) {
            case 0:
                ((lq0) obj).setVisibility(8);
                return;
            case 1:
                zu0 zu0Var = ((nr0) obj).G;
                if (zu0Var.C1) {
                    zu0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((xs0) obj).f29986f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = ((it0) obj).f25031f.f30659v1;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((kq0) obj).run();
                return;
            case 5:
                ju0 ju0Var = (ju0) obj;
                ArrayList arrayList3 = ju0Var.f25444f;
                if (ju0Var.h) {
                    ju0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    ju0Var.f25449x.f30659v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
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
                ((zv0) obj).getClass();
                return;
            case 9:
                sw0 sw0Var = (sw0) obj;
                if (!sw0Var.f27942w) {
                    sw0Var.f27944y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((ey0) obj).b();
                return;
            case 11:
                oy0 oy0Var = (oy0) obj;
                int i12 = oy0Var.f26885a;
                oy0Var.F = null;
                my0 my0Var = oy0Var.f26889c;
                if (my0Var != null && my0Var.getEditField() != null && oy0Var.f26889c.getFieldText() != null) {
                    int selectionStart = oy0Var.f26889c.getEditField().getSelectionStart();
                    int selectionEnd = oy0Var.f26889c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        oy0Var.f26895s = false;
                        ai.f0 f0Var = oy0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = oy0Var.f26889c.getFieldText();
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
                                oy0Var.f26895s = true;
                                oy0Var.c();
                                oy0Var.T = emojiSpan;
                                oy0Var.W = null;
                                oy0Var.V = null;
                                if (substring != null) {
                                    String str = oy0Var.H;
                                    if (str != null && oy0Var.G == 2 && str.equals(substring) && !oy0Var.f26897x && (arrayList2 = oy0Var.f26896w) != null && !arrayList2.isEmpty()) {
                                        oy0Var.v = false;
                                        oy0Var.c();
                                        ai.f0 f0Var2 = oy0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            oy0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = oy0Var.I + 1;
                                        oy0Var.I = i13;
                                        Runnable runnable = oy0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        oy0Var.K = new wm(oy0Var, substring, i13, 21);
                                        ArrayList arrayList5 = oy0Var.f26896w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            oy0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(oy0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = oy0Var.d;
                                if (f0Var3 != null) {
                                    f0Var3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            x5VarArr = (x5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, x5.class);
                        } else {
                            x5VarArr = null;
                        }
                        if ((x5VarArr == null || x5VarArr.length == 0) && selectionEnd < 52) {
                            oy0Var.f26895s = true;
                            oy0Var.c();
                            oy0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = oy0Var.H;
                                if (str2 != null && oy0Var.G == 1 && str2.equals(substring2) && !oy0Var.f26897x && (arrayList = oy0Var.f26896w) != null && !arrayList.isEmpty()) {
                                    oy0Var.v = false;
                                    oy0Var.c();
                                    oy0Var.d.setVisibility(0);
                                    oy0Var.U = AndroidUtilities.dp(10.0f);
                                    oy0Var.d.invalidate();
                                } else {
                                    int i14 = oy0Var.I + 1;
                                    oy0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (oy0Var.J != null && Math.abs(currentTimeMillis - oy0Var.L) <= 360) {
                                        oy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = oy0Var.J;
                                    } else {
                                        oy0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = oy0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    oy0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = oy0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        oy0Var.K = null;
                                    }
                                    oy0Var.K = new ai.c9(oy0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = oy0Var.f26896w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        oy0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(oy0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = oy0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = oy0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        oy0Var.K = null;
                    }
                    oy0Var.f26895s = false;
                    ai.f0 f0Var5 = oy0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                oy0Var.f26895s = false;
                oy0Var.v = true;
                ai.f0 f0Var6 = oy0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 12:
                uy0 uy0Var = (uy0) obj;
                uy0Var.G = null;
                uy0Var.b();
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
                ((o01) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((v01) obj).f28538a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                v11 v11Var = (v11) obj;
                v11Var.J = null;
                v11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f27383f).start();
                return;
            case 17:
                z11 z11Var = (z11) obj;
                ViewPropertyAnimator duration = z11Var.animate().alpha(0.0f).setListener(new jd0(z11Var, 22)).setDuration(300L);
                z11Var.f30371b = duration;
                duration.start();
                return;
            case 18:
                b21 b21Var = (b21) obj;
                Utilities.Callback callback = b21Var.f22552b;
                if (callback != null) {
                    callback.run(Long.valueOf(b21Var.f22551a.f22919s));
                    return;
                }
                return;
            case 19:
                y21 y21Var = ((p21) obj).f26922b;
                if (y21Var.k()) {
                    y21Var.l();
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
                ((g41) obj).f24086c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.al) obj).f26324c.presentFragment(new org.telegram.ui.g41());
                return;
            case 25:
                ((q41) obj).requestLayout();
                return;
            case 26:
                ((h51) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f22241e0;
                undoView.getClass();
                try {
                    undoView.f22249f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((i61) obj).invalidateSelf();
                return;
            default:
                vz vzVar = ((v61) obj).f28640b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
