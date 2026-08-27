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

public final class up0 implements Runnable {

    public final int f33164a;

    public final Object f33165b;

    public up0(Object obj, int i10) {
        this.f33164a = i10;
        this.f33165b = obj;
    }

    @Override
    public final void run() {
        String[] currentKeyboardLanguage;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f33164a;
        int i11 = 0;
        Object obj = this.f33165b;
        switch (i10) {
            case 0:
                ((vp0) obj).setVisibility(8);
                break;
            case 1:
                hu0 hu0Var = ((vq0) obj).C;
                if (hu0Var.f29163y1) {
                    hu0Var.b1(false);
                }
                break;
            case 2:
                ((ds0) obj).f27839f.m1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = ((ps0) obj).f31661f.f29145r1;
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                }
                break;
            case 4:
                ((up0) obj).run();
                break;
            case 5:
                qt0 qt0Var = (qt0) obj;
                ArrayList arrayList3 = qt0Var.f31975f;
                if (qt0Var.h) {
                    qt0Var.h = false;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    while (i11 < arrayList3.size()) {
                        if (((SavedMessagesController.SavedDialog) arrayList3.get(i11)).pinned) {
                            arrayList4.add(Long.valueOf(((SavedMessagesController.SavedDialog) arrayList3.get(i11)).dialogId));
                        }
                        i11++;
                    }
                    qt0Var.f31980x.f29145r1.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList4);
                    break;
                }
                break;
            case 6:
                ((st0) obj).F();
                break;
            case 7:
                ((zu0) obj).X();
                break;
            case 8:
                ((iv0) obj).getClass();
                break;
            case 9:
                bw0 bw0Var = (bw0) obj;
                if (!bw0Var.f27218w) {
                    bw0Var.f27220y = 0.0f;
                }
                break;
            case 10:
                ((mx0) obj).b();
                break;
            case 11:
                wx0 wx0Var = (wx0) obj;
                int i12 = wx0Var.f34363a;
                wx0Var.B = null;
                ux0 ux0Var = wx0Var.f34365c;
                if (ux0Var == null || ux0Var.getEditField() == null || wx0Var.f34365c.getFieldText() == null) {
                    wx0Var.f34370s = false;
                    wx0Var.v = true;
                    ag.p1 p1Var = wx0Var.d;
                    if (p1Var != null) {
                        p1Var.invalidate();
                    }
                } else {
                    int selectionStart = wx0Var.f34365c.getEditField().getSelectionStart();
                    int selectionEnd = wx0Var.f34365c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        wx0Var.f34370s = false;
                        ag.p1 p1Var2 = wx0Var.d;
                        if (p1Var2 != null) {
                            p1Var2.invalidate();
                        }
                    } else {
                        CharSequence fieldText = wx0Var.f34365c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        Emoji.EmojiSpan[] emojiSpanArr = z10 ? (Emoji.EmojiSpan[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, Emoji.EmojiSpan.class) : null;
                        if (emojiSpanArr == null || emojiSpanArr.length <= 0 || !SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(i12).isPremium()) {
                            t5[] t5VarArr = z10 ? (t5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, t5.class) : null;
                            if ((t5VarArr == null || t5VarArr.length == 0) && selectionEnd < 52) {
                                wx0Var.f34370s = true;
                                wx0Var.c();
                                wx0Var.P = null;
                                String strSubstring = fieldText.toString().substring(0, selectionEnd);
                                if (strSubstring != null) {
                                    String str = wx0Var.D;
                                    if (str == null || wx0Var.C != 1 || !str.equals(strSubstring) || wx0Var.f34372x || (arrayList = wx0Var.f34371w) == null || arrayList.isEmpty()) {
                                        int i13 = wx0Var.E + 1;
                                        wx0Var.E = i13;
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        if (wx0Var.F == null || Math.abs(jCurrentTimeMillis - wx0Var.H) > 360) {
                                            wx0Var.H = jCurrentTimeMillis;
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                        } else {
                                            wx0Var.H = jCurrentTimeMillis;
                                            currentKeyboardLanguage = wx0Var.F;
                                        }
                                        String[] strArr = wx0Var.F;
                                        if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                                            MediaDataController.getInstance(i12).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                        }
                                        wx0Var.F = currentKeyboardLanguage;
                                        Runnable runnable = wx0Var.G;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            wx0Var.G = null;
                                        }
                                        wx0Var.G = new ag.k0(wx0Var, currentKeyboardLanguage, strSubstring, i13, 26);
                                        ArrayList arrayList5 = wx0Var.f34371w;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            AndroidUtilities.runOnUIThread(wx0Var.G, 600L);
                                        } else {
                                            wx0Var.G.run();
                                        }
                                    } else {
                                        wx0Var.v = false;
                                        wx0Var.c();
                                        wx0Var.d.setVisibility(0);
                                        wx0Var.Q = AndroidUtilities.dp(10.0f);
                                        wx0Var.d.invalidate();
                                    }
                                }
                                ag.p1 p1Var3 = wx0Var.d;
                                if (p1Var3 != null) {
                                    p1Var3.invalidate();
                                }
                            }
                        } else {
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[emojiSpanArr.length - 1];
                            if (emojiSpan != null) {
                                Spanned spanned = (Spanned) fieldText;
                                int spanStart = spanned.getSpanStart(emojiSpan);
                                int spanEnd = spanned.getSpanEnd(emojiSpan);
                                if (selectionStart == spanEnd) {
                                    String strSubstring2 = fieldText.toString().substring(spanStart, spanEnd);
                                    wx0Var.f34370s = true;
                                    wx0Var.c();
                                    wx0Var.P = emojiSpan;
                                    wx0Var.S = null;
                                    wx0Var.R = null;
                                    if (strSubstring2 != null) {
                                        String str2 = wx0Var.D;
                                        if (str2 == null || wx0Var.C != 2 || !str2.equals(strSubstring2) || wx0Var.f34372x || (arrayList2 = wx0Var.f34371w) == null || arrayList2.isEmpty()) {
                                            int i14 = wx0Var.E + 1;
                                            wx0Var.E = i14;
                                            Runnable runnable2 = wx0Var.G;
                                            if (runnable2 != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable2);
                                            }
                                            wx0Var.G = new km(wx0Var, strSubstring2, i14, 21);
                                            ArrayList arrayList6 = wx0Var.f34371w;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                AndroidUtilities.runOnUIThread(wx0Var.G, 600L);
                                            } else {
                                                wx0Var.G.run();
                                            }
                                        } else {
                                            wx0Var.v = false;
                                            wx0Var.c();
                                            ag.p1 p1Var4 = wx0Var.d;
                                            if (p1Var4 != null) {
                                                p1Var4.setVisibility(0);
                                                wx0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    ag.p1 p1Var5 = wx0Var.d;
                                    if (p1Var5 != null) {
                                        p1Var5.invalidate();
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = wx0Var.G;
                        if (runnable3 != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable3);
                            wx0Var.G = null;
                        }
                        wx0Var.f34370s = false;
                        ag.p1 p1Var6 = wx0Var.d;
                        if (p1Var6 != null) {
                            p1Var6.invalidate();
                        }
                    }
                }
                break;
            case 12:
                cy0 cy0Var = (cy0) obj;
                cy0Var.C = null;
                cy0Var.b();
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                }
                break;
            case 14:
                ((wz0) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((c01) obj).f27250a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).I3(false, false);
                        ((org.telegram.ui.Cells.s1) arrayList7.get(i15)).K3(false, false, false);
                    }
                }
                break;
            case 16:
                b11 b11Var = (b11) obj;
                b11Var.F = null;
                b11Var.D.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f28122f).start();
                break;
            case 17:
                g11 g11Var = (g11) obj;
                ViewPropertyAnimator duration = g11Var.animate().alpha(0.0f).setListener(new f11(g11Var, i11)).setDuration(300L);
                g11Var.f28501b = duration;
                duration.start();
                break;
            case 18:
                i11 i11Var = (i11) obj;
                Utilities.Callback callback = i11Var.f29201b;
                if (callback != null) {
                    callback.run(Long.valueOf(i11Var.f29200a.f29554s));
                }
                break;
            case 19:
                d21 d21Var = ((u11) obj).f32948b;
                if (d21Var.k()) {
                    d21Var.l();
                }
                break;
            case 20:
                MessageObject messageObject = (MessageObject) obj;
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            case 21:
                ((Utilities.Callback2) obj).run(null, Boolean.FALSE);
                break;
            case 22:
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                break;
            case 23:
                ((l31) obj).f30276c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.pk) obj).f32073c.presentFragment(new org.telegram.ui.a31());
                break;
            case 25:
                ((u31) obj).requestLayout();
                break;
            case 26:
                ((l41) obj).f();
                break;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.f26571a0;
                undoView.getClass();
                try {
                    undoView.f26576f.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 28:
                ((n51) obj).invalidateSelf();
                break;
            default:
                jz jzVar = ((a61) obj).f26644b;
                if (jzVar != null) {
                    jzVar.e(false, true, false);
                }
                break;
        }
    }
}
