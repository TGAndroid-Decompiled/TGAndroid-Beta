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
public final class tp0 implements Runnable {
    public final int f32776a;
    public final Object f32777b;

    public tp0(Object obj, int i9) {
        this.f32776a = i9;
        this.f32777b = obj;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        t5[] t5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i9 = this.f32776a;
        Object obj = this.f32777b;
        switch (i9) {
            case 0:
                ((up0) obj).setVisibility(8);
                return;
            case 1:
                eu0 eu0Var = ((uq0) obj).C;
                if (eu0Var.f28178y1) {
                    eu0Var.b1(false);
                    return;
                }
                return;
            case 2:
                ((cs0) obj).f27562f.m1(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = ((ns0) obj).f31179f.f28160r1;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 4:
                ((tp0) obj).run();
                return;
            case 5:
                ot0 ot0Var = (ot0) obj;
                ArrayList arrayList3 = ot0Var.f31441f;
                if (ot0Var.h) {
                    ot0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i10)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i10)).dialogId));
                        }
                    }
                    ot0Var.f31446x.f28160r1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 6:
                ((pt0) obj).F();
                return;
            case 7:
                ((xu0) obj).X();
                return;
            case 8:
                ((gv0) obj).getClass();
                return;
            case 9:
                zv0 zv0Var = (zv0) obj;
                if (!zv0Var.f35380w) {
                    zv0Var.f35382y = 0.0f;
                    return;
                }
                return;
            case 10:
                ((kx0) obj).b();
                return;
            case 11:
                ux0 ux0Var = (ux0) obj;
                int i11 = ux0Var.f33158a;
                ux0Var.B = null;
                sx0 sx0Var = ux0Var.f33160c;
                if (sx0Var != null && sx0Var.getEditField() != null && ux0Var.f33160c.getFieldText() != null) {
                    int selectionStart = ux0Var.f33160c.getEditField().getSelectionStart();
                    int selectionEnd = ux0Var.f33160c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ux0Var.f33165s = false;
                        fh.d2 d2Var = ux0Var.d;
                        if (d2Var != null) {
                            d2Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = ux0Var.f33160c.getFieldText();
                    boolean z10 = fieldText instanceof Spanned;
                    if (z10) {
                        emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class);
                    } else {
                        emojiSpanArr = null;
                    }
                    if (emojiSpanArr != null && emojiSpanArr.length > 0 && SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i11).isPremium()) {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[emojiSpanArr.length - 1];
                        if (emojiSpan != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(emojiSpan);
                            int spanEnd = spanned.getSpanEnd(emojiSpan);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                ux0Var.f33165s = true;
                                ux0Var.c();
                                ux0Var.P = emojiSpan;
                                ux0Var.S = null;
                                ux0Var.R = null;
                                if (substring != null) {
                                    String str = ux0Var.D;
                                    if (str != null && ux0Var.C == 2 && str.equals(substring) && !ux0Var.f33167x && (arrayList2 = ux0Var.f33166w) != null && !arrayList2.isEmpty()) {
                                        ux0Var.v = false;
                                        ux0Var.c();
                                        fh.d2 d2Var2 = ux0Var.d;
                                        if (d2Var2 != null) {
                                            d2Var2.setVisibility(0);
                                            ux0Var.d.invalidate();
                                        }
                                    } else {
                                        int i12 = ux0Var.E + 1;
                                        ux0Var.E = i12;
                                        Runnable runnable = ux0Var.G;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        ux0Var.G = new org.telegram.ui.rl(ux0Var, substring, i12, 22);
                                        ArrayList arrayList5 = ux0Var.f33166w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            ux0Var.G.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(ux0Var.G, 600L);
                                        }
                                    }
                                }
                                fh.d2 d2Var3 = ux0Var.d;
                                if (d2Var3 != null) {
                                    d2Var3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            t5VarArr = (t5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, t5.class);
                        } else {
                            t5VarArr = null;
                        }
                        if ((t5VarArr == null || t5VarArr.length == 0) && selectionEnd < 52) {
                            ux0Var.f33165s = true;
                            ux0Var.c();
                            ux0Var.P = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = ux0Var.D;
                                if (str2 != null && ux0Var.C == 1 && str2.equals(substring2) && !ux0Var.f33167x && (arrayList = ux0Var.f33166w) != null && !arrayList.isEmpty()) {
                                    ux0Var.v = false;
                                    ux0Var.c();
                                    ux0Var.d.setVisibility(0);
                                    ux0Var.Q = AndroidUtilities.dp(10.0f);
                                    ux0Var.d.invalidate();
                                } else {
                                    int i13 = ux0Var.E + 1;
                                    ux0Var.E = i13;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (ux0Var.F != null && Math.abs(currentTimeMillis - ux0Var.H) <= 360) {
                                        ux0Var.H = currentTimeMillis;
                                        currentKeyboardLanguage = ux0Var.F;
                                    } else {
                                        ux0Var.H = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = ux0Var.F;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    ux0Var.F = currentKeyboardLanguage;
                                    Runnable runnable2 = ux0Var.G;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        ux0Var.G = null;
                                    }
                                    ux0Var.G = new c3.d(ux0Var, currentKeyboardLanguage, substring2, i13, 27);
                                    ArrayList arrayList6 = ux0Var.f33166w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        ux0Var.G.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(ux0Var.G, 600L);
                                    }
                                }
                            }
                            fh.d2 d2Var4 = ux0Var.d;
                            if (d2Var4 != null) {
                                d2Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = ux0Var.G;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        ux0Var.G = null;
                    }
                    ux0Var.f33165s = false;
                    fh.d2 d2Var5 = ux0Var.d;
                    if (d2Var5 != null) {
                        d2Var5.invalidate();
                        return;
                    }
                    return;
                }
                ux0Var.f33165s = false;
                ux0Var.v = true;
                fh.d2 d2Var6 = ux0Var.d;
                if (d2Var6 != null) {
                    d2Var6.invalidate();
                    return;
                }
                return;
            case 12:
                ay0 ay0Var = (ay0) obj;
                ay0Var.C = null;
                ay0Var.b();
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
                ((uz0) obj).a();
                return;
            case 15:
                ArrayList arrayList7 = ((a01) obj).f26593a;
                for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                    ((View) arrayList7.get(i14)).setVisibility(8);
                    if (arrayList7.get(i14) instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i14)).J3(false, false);
                        ((org.telegram.ui.Cells.t1) arrayList7.get(i14)).L3(false, false, false);
                    }
                }
                return;
            case 16:
                a11 a11Var = (a11) obj;
                a11Var.F = null;
                a11Var.D.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f28844f).start();
                return;
            case 17:
                e11 e11Var = (e11) obj;
                ViewPropertyAnimator duration = e11Var.animate().alpha(0.0f).setListener(new r60(e11Var, 28)).setDuration(300L);
                e11Var.f27899b = duration;
                duration.start();
                return;
            case 18:
                g11 g11Var = (g11) obj;
                Utilities.Callback callback = g11Var.f28628b;
                if (callback != null) {
                    callback.run(Long.valueOf(g11Var.f28627a.f28946s));
                    return;
                }
                return;
            case 19:
                b21 b21Var = ((r11) obj).f32058b;
                if (b21Var.k()) {
                    b21Var.l();
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
                ((j31) obj).f29620c.setVisibility(8);
                return;
            case 24:
                ((org.telegram.ui.nk) obj).f31534c.presentFragment(new org.telegram.ui.b31());
                return;
            case 25:
                ((s31) obj).requestLayout();
                return;
            case 26:
                ((j41) obj).f();
                return;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i15 = UndoView.f26575a0;
                undoView.getClass();
                try {
                    undoView.f26580f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((l51) obj).invalidateSelf();
                return;
            default:
                hz hzVar = ((y51) obj).f34862b;
                if (hzVar != null) {
                    hzVar.e(false, true, false);
                    return;
                }
                return;
        }
    }
}
