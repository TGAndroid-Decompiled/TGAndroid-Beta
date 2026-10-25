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
public final class mp0 implements Runnable {
    public final int f30680a;
    public final Object f30681b;

    public mp0(fi.e2 e2Var, int i10) {
        this.f30680a = 14;
        this.f30681b = e2Var;
    }

    @Override
    public final void run() {
        Emoji.EmojiSpan[] emojiSpanArr;
        c6[] c6VarArr;
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f30680a;
        int i11 = 0;
        Object obj = this.f30681b;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.s1 s1Var = ((pp0) obj).f31683n;
                if (s1Var != null) {
                    s1Var.invalidate();
                    return;
                }
                return;
            case 1:
                qp0 qp0Var = (qp0) obj;
                qp0Var.f31988q = false;
                qp0Var.f31976b.run();
                return;
            case 2:
                ((mr0) ((bi.u) obj).f5502b).d1(1);
                return;
            case 3:
                qr0 qr0Var = (qr0) obj;
                or0[] or0VarArr = qr0Var.f32003a;
                if (qr0Var.f32004b != 1) {
                    for (or0 or0Var : or0VarArr) {
                        org.telegram.ui.ActionBar.b6 b6Var = or0Var.d;
                        b6Var.setAlpha(1.0f);
                        b6Var.setScaleX(1.0f);
                        b6Var.setScaleY(1.0f);
                        or0Var.e.setAlpha(0.0f);
                    }
                    qr0Var.E = false;
                    AndroidUtilities.runOnUIThread(qr0Var.G, 4000L);
                    return;
                }
                qr0Var.E = !qr0Var.E;
                int length = or0VarArr.length;
                while (i11 < length) {
                    or0 or0Var2 = or0VarArr[i11];
                    org.telegram.ui.ActionBar.b6 b6Var2 = or0Var2.d;
                    org.telegram.ui.ActionBar.b6 b6Var3 = or0Var2.e;
                    b6Var2.setPivotX(0.0f);
                    b6Var3.setPivotX(0.0f);
                    if (qr0Var.E) {
                        b6Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        b6Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        b6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        b6Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(qr0Var.G, 4000L);
                return;
            case 4:
                ((or0) obj).setVisibility(8);
                return;
            case 5:
                aw0 aw0Var = ((us0) obj).G;
                if (aw0Var.E1) {
                    aw0Var.k1(false);
                    return;
                }
                return;
            case 6:
                ((du0) obj).f27604a.v1(false);
                return;
            case 7:
                org.telegram.ui.ActionBar.r2 r2Var = ((ju0) obj).f29723f.f26702x1;
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 8:
                ((mp0) obj).run();
                return;
            case 9:
                lv0 lv0Var = (lv0) obj;
                ArrayList arrayList3 = lv0Var.f30292f;
                if (lv0Var.h) {
                    lv0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    lv0Var.f30297x.f26702x1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    return;
                }
                return;
            case 10:
                ((mv0) obj).F();
                return;
            case 11:
                ((vw0) obj).V();
                return;
            case 12:
                return;
            case 13:
                ((ex0) obj).getClass();
                return;
            case 14:
                ((by0) obj).l0(0);
                return;
            case 15:
                wx0 wx0Var = (wx0) obj;
                if (!wx0Var.f34545w) {
                    wx0Var.f34547y = 0.0f;
                    return;
                }
                return;
            case 16:
                ((jz0) obj).b();
                return;
            case 17:
                tz0 tz0Var = (tz0) obj;
                int i12 = tz0Var.f33169a;
                tz0Var.H = null;
                rz0 rz0Var = tz0Var.f33173c;
                if (rz0Var != null && rz0Var.getEditField() != null && tz0Var.f33173c.getFieldText() != null) {
                    int selectionStart = tz0Var.f33173c.getEditField().getSelectionStart();
                    int selectionEnd = tz0Var.f33173c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        tz0Var.f33181s = false;
                        bh.r rVar = tz0Var.d;
                        if (rVar != null) {
                            rVar.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = tz0Var.f33173c.getFieldText();
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
                                tz0Var.f33181s = true;
                                tz0Var.c();
                                tz0Var.V = emojiSpan;
                                tz0Var.f33172b0 = null;
                                tz0Var.f33170a0 = null;
                                if (substring != null) {
                                    String str = tz0Var.J;
                                    if (str != null && tz0Var.I == 2 && str.equals(substring) && !tz0Var.f33183x && (arrayList2 = tz0Var.f33182w) != null && !arrayList2.isEmpty()) {
                                        tz0Var.v = false;
                                        tz0Var.c();
                                        bh.r rVar2 = tz0Var.d;
                                        if (rVar2 != null) {
                                            rVar2.setVisibility(0);
                                            tz0Var.d.invalidate();
                                        }
                                    } else {
                                        int i13 = tz0Var.K + 1;
                                        tz0Var.K = i13;
                                        Runnable runnable = tz0Var.M;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        tz0Var.M = new org.telegram.ui.g4(tz0Var, substring, i13, 25);
                                        ArrayList arrayList5 = tz0Var.f33182w;
                                        if (arrayList5 != null && !arrayList5.isEmpty()) {
                                            tz0Var.M.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(tz0Var.M, 600L);
                                        }
                                    }
                                }
                                bh.r rVar3 = tz0Var.d;
                                if (rVar3 != null) {
                                    rVar3.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z10) {
                            c6VarArr = (c6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, c6.class);
                        } else {
                            c6VarArr = null;
                        }
                        if ((c6VarArr == null || c6VarArr.length == 0) && selectionEnd < 52) {
                            tz0Var.f33181s = true;
                            tz0Var.c();
                            tz0Var.V = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            if (substring2 != null) {
                                String str2 = tz0Var.J;
                                if (str2 != null && tz0Var.I == 1 && str2.equals(substring2) && !tz0Var.f33183x && (arrayList = tz0Var.f33182w) != null && !arrayList.isEmpty()) {
                                    tz0Var.v = false;
                                    tz0Var.c();
                                    tz0Var.d.setVisibility(0);
                                    tz0Var.W = AndroidUtilities.dp(10.0f);
                                    tz0Var.d.invalidate();
                                } else {
                                    int i14 = tz0Var.K + 1;
                                    tz0Var.K = i14;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (tz0Var.L != null && Math.abs(currentTimeMillis - tz0Var.N) <= 360) {
                                        tz0Var.N = currentTimeMillis;
                                        currentKeyboardLanguage = tz0Var.L;
                                    } else {
                                        tz0Var.N = currentTimeMillis;
                                        currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    }
                                    String[] strArr = tz0Var.L;
                                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                        MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    tz0Var.L = currentKeyboardLanguage;
                                    Runnable runnable2 = tz0Var.M;
                                    if (runnable2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        tz0Var.M = null;
                                    }
                                    tz0Var.M = new zr0(tz0Var, currentKeyboardLanguage, substring2, i14, 2);
                                    ArrayList arrayList6 = tz0Var.f33182w;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        tz0Var.M.run();
                                    } else {
                                        AndroidUtilities.runOnUIThread(tz0Var.M, 600L);
                                    }
                                }
                            }
                            bh.r rVar4 = tz0Var.d;
                            if (rVar4 != null) {
                                rVar4.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = tz0Var.M;
                    if (runnable3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable3);
                        tz0Var.M = null;
                    }
                    tz0Var.f33181s = false;
                    bh.r rVar5 = tz0Var.d;
                    if (rVar5 != null) {
                        rVar5.invalidate();
                        return;
                    }
                    return;
                }
                tz0Var.f33181s = false;
                tz0Var.v = true;
                bh.r rVar6 = tz0Var.d;
                if (rVar6 != null) {
                    rVar6.invalidate();
                    return;
                }
                return;
            case 18:
                zz0 zz0Var = (zz0) obj;
                zz0Var.K = null;
                zz0Var.b();
                return;
            case 19:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 20:
                ((x11) obj).a();
                return;
            case 21:
                ArrayList arrayList7 = ((d21) obj).f27340a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).L3(false, false);
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).N3(false, false, false);
                    }
                }
                return;
            case 22:
                d31 d31Var = (d31) obj;
                d31Var.J = null;
                d31Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(ds.f27584f).start();
                return;
            case 23:
                i31 i31Var = (i31) obj;
                ViewPropertyAnimator duration = i31Var.animate().alpha(0.0f).setListener(new h31(i31Var, 0)).setDuration(300L);
                i31Var.f29178b = duration;
                duration.start();
                return;
            case 24:
                k31 k31Var = (k31) obj;
                Utilities.Callback callback = k31Var.f29800b;
                if (callback != null) {
                    callback.run(Long.valueOf(k31Var.f29799a.f30052t));
                    return;
                }
                return;
            case 25:
                e41 e41Var = ((v31) obj).f33560b;
                if (e41Var.l()) {
                    e41Var.m();
                    return;
                }
                return;
            case 26:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                return;
            case 27:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                return;
            case 28:
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                return;
            default:
                ((q51) obj).f31838c.setVisibility(8);
                return;
        }
    }

    public mp0(Object obj, int i10) {
        this.f30680a = i10;
        this.f30681b = obj;
    }
}
