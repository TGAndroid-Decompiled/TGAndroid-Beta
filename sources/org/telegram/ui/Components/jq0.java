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
    public final int f25395a;
    public final Object f25396b;

    public jq0(Object obj, int i10) {
        this.f25395a = i10;
        this.f25396b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        x5[] x5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f25395a;
        Object obj = this.f25396b;
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
                ((ws0) obj).f29775f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((ht0) obj).f24807f.f30389v1;
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
                ArrayList arrayList3 = iu0Var.f25135f;
                if (iu0Var.h) {
                    iu0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                    }
                    iu0Var.f25140x.f30389v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
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
                rw0 rw0Var = (rw0) obj;
                if (!rw0Var.f27695w) {
                    rw0Var.f27697y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((dy0) obj).b();
                return;
            case 11:
                ny0 ny0Var = (ny0) obj;
                int i12 = ny0Var.f26613a;
                ny0Var.F = null;
                ly0 ly0Var = ny0Var.f26617c;
                if (ly0Var != null && ly0Var.getEditField() != null && ny0Var.f26617c.getFieldText() != null) {
                    int selectionStart = ny0Var.f26617c.getEditField().getSelectionStart();
                    int selectionEnd = ny0Var.f26617c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ny0Var.f26623s = false;
                        ai.f0 f0Var = ny0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = ny0Var.f26617c.getFieldText();
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
                                ny0Var.f26623s = true;
                                ny0Var.c();
                                ny0Var.T = emojiSpan;
                                ny0Var.W = null;
                                ny0Var.V = null;
                                if (substring != null) {
                                    String str = ny0Var.H;
                                    if (str != null && ny0Var.G == 2 && str.equals(substring) && !ny0Var.f26625x && (arrayList2 = ny0Var.f26624w) != null && !arrayList2.isEmpty()) {
                                        ny0Var.v = false;
                                        ny0Var.c();
                                        ai.f0 f0Var2 = ny0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            ny0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = ny0Var.I + 1;
                                        ny0Var.I = i13;
                                        Runnable runnable = ny0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        ny0Var.K = new wm(ny0Var, substring, i13, 21);
                                        ArrayList arrayList5 = ny0Var.f26624w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            ny0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(ny0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = ny0Var.d;
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
                            ny0Var.f26623s = true;
                            ny0Var.c();
                            ny0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = ny0Var.H;
                                if (str2 != null && ny0Var.G == 1 && str2.equals(substring2) && !ny0Var.f26625x && (arrayList = ny0Var.f26624w) != null && !arrayList.isEmpty()) {
                                    ny0Var.v = false;
                                    ny0Var.c();
                                    ny0Var.d.setVisibility(0);
                                    ny0Var.U = AndroidUtilities.dp(10.0f);
                                    ny0Var.d.invalidate();
                                } else {
                                    int i14 = ny0Var.I + 1;
                                    ny0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (ny0Var.J != null && Math.abs(currentTimeMillis - ny0Var.L) <= 360) {
                                        ny0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = ny0Var.J;
                                    } else {
                                        ny0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = ny0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    ny0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = ny0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        ny0Var.K = null;
                                    }
                                    ny0Var.K = new ai.c9(ny0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = ny0Var.f26624w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        ny0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(ny0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = ny0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = ny0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        ny0Var.K = null;
                    }
                    ny0Var.f26623s = false;
                    ai.f0 f0Var5 = ny0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                ny0Var.f26623s = false;
                ny0Var.v = true;
                ai.f0 f0Var6 = ny0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 12:
                ty0 ty0Var = (ty0) obj;
                ty0Var.G = null;
                ty0Var.b();
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
                ((n01) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((u01) obj).f28223a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                u11 u11Var = (u11) obj;
                u11Var.J = null;
                u11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f27420f).start();
                return;
            case 17:
                y11 y11Var = (y11) obj;
                ViewPropertyAnimator duration = y11Var.animate().alpha(0.0f).setListener(new jd0(y11Var, 22)).setDuration(300L);
                y11Var.f30135b = duration;
                duration.start();
                return;
            case 18:
                a21 a21Var = (a21) obj;
                Utilities.Callback callback = a21Var.f22283b;
                if (callback != null) {
                    callback.run(Long.valueOf(a21Var.f22282a.f22589s));
                    return;
                }
                return;
            case 19:
                x21 x21Var = ((o21) obj).f26666b;
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
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                return;
            case 23:
                ((f41) obj).f23807c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.zk) obj).f26065c.presentFragment(new org.telegram.ui.f41());
                return;
            case 25:
                ((p41) obj).requestLayout();
                return;
            case 26:
                ((g51) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f22225e0;
                undoView.getClass();
                try {
                    undoView.f22233f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((h61) obj).invalidateSelf();
                return;
            default:
                vz vzVar = ((u61) obj).f28297b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
