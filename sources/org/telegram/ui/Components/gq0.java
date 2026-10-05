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
public final class gq0 implements Runnable {
    public final int f26962a;
    public final Object f26963b;

    public gq0(ci.k2 k2Var, int i10) {
        this.f26962a = 11;
        this.f26963b = k2Var;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        z5[] z5VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f26962a;
        int i11 = 0;
        Object obj = this.f26963b;
        switch (i10) {
            case 0:
                ((br0) ((ci.i2) obj).f5157b).X0(1);
                return;
            case 1:
                fr0 fr0Var = (fr0) obj;
                dr0[] dr0VarArr = fr0Var.f26566a;
                if (fr0Var.f26567b != 1) {
                    for (dr0 dr0Var : dr0VarArr) {
                        org.telegram.ui.ActionBar.i5 i5Var = dr0Var.d;
                        i5Var.setAlpha(1.0f);
                        i5Var.setScaleX(1.0f);
                        i5Var.setScaleY(1.0f);
                        dr0Var.f25852e.setAlpha(0.0f);
                    }
                    fr0Var.E = false;
                    AndroidUtilities.runOnUIThread(fr0Var.G, 4000L);
                    return;
                }
                fr0Var.E = !fr0Var.E;
                int length = dr0VarArr.length;
                while (i11 < length) {
                    dr0 dr0Var2 = dr0VarArr[i11];
                    org.telegram.ui.ActionBar.i5 i5Var2 = dr0Var2.d;
                    org.telegram.ui.ActionBar.i5 i5Var3 = dr0Var2.f25852e;
                    i5Var2.setPivotX(0.0f);
                    i5Var3.setPivotX(0.0f);
                    if (fr0Var.E) {
                        i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        i5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        i5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(fr0Var.G, 4000L);
                return;
            case 2:
                ((dr0) obj).setVisibility(8);
                return;
            case 3:
                qv0 qv0Var = ((es0) obj).G;
                if (qv0Var.C1) {
                    qv0Var.b1(false);
                    return;
                }
                return;
            case 4:
                ((ot0) obj).f29547f.m1(false);
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = ((zt0) obj).f33641f.f30263v1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 6:
                ((gq0) obj).run();
                return;
            case 7:
                av0 av0Var = (av0) obj;
                ArrayList arrayList3 = av0Var.f24749f;
                if (av0Var.h) {
                    av0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    av0Var.f24754x.f30263v1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 8:
                ((bv0) obj).F();
                return;
            case 9:
                ((mw0) obj).X();
                return;
            case 10:
                ((vw0) obj).getClass();
                return;
            case 11:
                ((sx0) obj).l0(0);
                return;
            case 12:
                nx0 nx0Var = (nx0) obj;
                if (!nx0Var.f29168w) {
                    nx0Var.f29170y = 0.0f;
                    return;
                }
                return;
            case 13:
                ((zy0) obj).b();
                return;
            case 14:
                jz0 jz0Var = (jz0) obj;
                int i12 = jz0Var.f27998a;
                jz0Var.F = null;
                hz0 hz0Var = jz0Var.f28002c;
                if (hz0Var != null && hz0Var.getEditField() != null && jz0Var.f28002c.getFieldText() != null) {
                    int selectionStart = jz0Var.f28002c.getEditField().getSelectionStart();
                    int selectionEnd = jz0Var.f28002c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        jz0Var.f28009s = false;
                        ai.f0 f0Var = jz0Var.d;
                        if (f0Var != null) {
                            f0Var.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = jz0Var.f28002c.getFieldText();
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
                                jz0Var.f28009s = true;
                                jz0Var.c();
                                jz0Var.T = emojiSpan;
                                jz0Var.W = null;
                                jz0Var.V = null;
                                if (substring != null) {
                                    String str = jz0Var.H;
                                    if (str != null && jz0Var.G == 2 && str.equals(substring) && !jz0Var.f28011x && (arrayList2 = jz0Var.f28010w) != null && !arrayList2.isEmpty()) {
                                        jz0Var.v = false;
                                        jz0Var.c();
                                        ai.f0 f0Var2 = jz0Var.d;
                                        if (f0Var2 != null) {
                                            f0Var2.setVisibility(0);
                                            jz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = jz0Var.I + 1;
                                        jz0Var.I = i13;
                                        Runnable runnable = jz0Var.K;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        jz0Var.K = new zm(jz0Var, substring, i13, 21);
                                        ArrayList arrayList5 = jz0Var.f28010w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            jz0Var.K.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(jz0Var.K, 600L);
                                        }
                                    }
                                }
                                ai.f0 f0Var3 = jz0Var.d;
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
                            jz0Var.f28009s = true;
                            jz0Var.c();
                            jz0Var.T = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = jz0Var.H;
                                if (str2 != null && jz0Var.G == 1 && str2.equals(substring2) && !jz0Var.f28011x && (arrayList = jz0Var.f28010w) != null && !arrayList.isEmpty()) {
                                    jz0Var.v = false;
                                    jz0Var.c();
                                    jz0Var.d.setVisibility(0);
                                    jz0Var.U = AndroidUtilities.dp(10.0f);
                                    jz0Var.d.invalidate();
                                } else {
                                    int i14 = jz0Var.I + 1;
                                    jz0Var.I = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (jz0Var.J != null && Math.abs(currentTimeMillis - jz0Var.L) <= 360) {
                                        jz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = jz0Var.J;
                                    } else {
                                        jz0Var.L = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = jz0Var.J;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    jz0Var.J = currentKeyboardLanguage;
                                    Runnable runnable2 = jz0Var.K;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        jz0Var.K = null;
                                    }
                                    jz0Var.K = new ai.c9(jz0Var, currentKeyboardLanguage, substring2, i14, 27);
                                    ArrayList arrayList6 = jz0Var.f28010w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        jz0Var.K.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(jz0Var.K, 600L);
                                    }
                                }
                            }
                            ai.f0 f0Var4 = jz0Var.d;
                            if (f0Var4 != null) {
                                f0Var4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = jz0Var.K;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        jz0Var.K = null;
                    }
                    jz0Var.f28009s = false;
                    ai.f0 f0Var5 = jz0Var.d;
                    if (f0Var5 != null) {
                        f0Var5.invalidate();
                        return;
                    }
                    return;
                }
                jz0Var.f28009s = false;
                jz0Var.v = true;
                ai.f0 f0Var6 = jz0Var.d;
                if (f0Var6 != null) {
                    f0Var6.invalidate();
                    return;
                }
                return;
            case 15:
                pz0 pz0Var = (pz0) obj;
                pz0Var.G = null;
                pz0Var.b();
                return;
            case 16:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 17:
                ((m11) obj).a();
                return;
            case 18:
                ArrayList arrayList7 = ((t11) obj).f31008a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).J3(false, false);
                        ((org.telegram.ui.Cells.u1) arrayList7.get(i15)).L3(false, false, false);
                    }
                }
                return;
            case 19:
                t21 t21Var = (t21) obj;
                t21Var.J = null;
                t21Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(tr.f31215f).start();
                return;
            case 20:
                x21 x21Var = (x21) obj;
                ViewPropertyAnimator duration = x21Var.animate().alpha(0.0f).setListener(new hd0(x21Var, 23)).setDuration(300L);
                x21Var.f32810b = duration;
                duration.start();
                return;
            case 21:
                z21 z21Var = (z21) obj;
                Utilities.Callback callback = z21Var.f33408b;
                if (callback != null) {
                    callback.run(Long.valueOf(z21Var.f33407a.f24475s));
                    return;
                }
                return;
            case 22:
                w31 w31Var = ((n31) obj).f28959b;
                if (w31Var.k()) {
                    w31Var.l();
                    return;
                }
                return;
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                return;
            case 24:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                return;
            case 25:
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                return;
            case 26:
                ((e51) obj).f25979c.setVisibility(8);
                return;
            case 27:
                ((org.telegram.ui.wk) obj).f28371c.presentFragment(new org.telegram.ui.w31());
                return;
            case 28:
                ((o51) obj).requestLayout();
                return;
            default:
                ((f61) obj).f();
                return;
        }
    }

    public gq0(Object obj, int i10) {
        this.f26962a = i10;
        this.f26963b = obj;
    }
}
