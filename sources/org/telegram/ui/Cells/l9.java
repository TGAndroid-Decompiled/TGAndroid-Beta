package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.ml0;
public final class l9 implements Runnable {
    public final ea f20382a;

    public l9(ea eaVar) {
        this.f20382a = eaVar;
    }

    @Override
    public final void run() {
        ea eaVar = this.f20382a;
        g gVar = eaVar.f20008r0;
        Rect rect = eaVar.B;
        u9 u9Var = eaVar.f19978a0;
        z9 z9Var = eaVar.X;
        if (z9Var != null && eaVar.C != null) {
            z9 z9Var2 = eaVar.W;
            CharSequence t10 = eaVar.t(z9Var, true);
            ml0 ml0Var = eaVar.E;
            if (ml0Var != null) {
                ml0Var.I0(false);
            }
            int i10 = eaVar.f20009s;
            int i11 = eaVar.f20011t;
            if (!rect.isEmpty()) {
                int i12 = rect.right;
                if (i10 > i12) {
                    i10 = i12 - 1;
                }
                int i13 = rect.left;
                if (i10 < i13) {
                    i10 = i13 + 1;
                }
                int i14 = rect.top;
                if (i11 < i14) {
                    i11 = i14 + 1;
                }
                int i15 = rect.bottom;
                if (i11 > i15) {
                    i11 = i15 - 1;
                }
            }
            int i16 = i10;
            int l4 = eaVar.l(i16, i11, eaVar.f19981c, eaVar.d, z9Var, true);
            if (l4 >= t10.length()) {
                eaVar.j(l4, u9Var, true);
                Layout layout = u9Var.f21428b;
                if (layout == null) {
                    eaVar.v = -1;
                    eaVar.f20013u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - eaVar.f19981c;
                if (f7 < u9Var.f21428b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > u9Var.f21428b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                int i17 = eaVar.f19981c;
                int i18 = eaVar.d;
                eaVar.f(false);
                eaVar.C.setVisibility(0);
                eaVar.M(z9Var, z9Var2);
                eaVar.f20013u = l4;
                eaVar.v = l4;
                if (t10 instanceof Spanned) {
                    Spanned spanned = (Spanned) t10;
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, t10.length(), Emoji.EmojiSpan.class);
                    int length = emojiSpanArr.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 < length) {
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[i19];
                            int spanStart = spanned.getSpanStart(emojiSpan);
                            int spanEnd = spanned.getSpanEnd(emojiSpan);
                            if (l4 >= spanStart && l4 <= spanEnd) {
                                eaVar.f20013u = spanStart;
                                eaVar.v = spanEnd;
                                break;
                            }
                            i19++;
                        } else {
                            org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spanned.getSpans(0, t10.length(), org.telegram.ui.Components.z5.class);
                            int length2 = z5VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.z5 z5Var = z5VarArr[i20];
                                int spanStart2 = spanned.getSpanStart(z5Var);
                                int spanEnd2 = spanned.getSpanEnd(z5Var);
                                if (l4 >= spanStart2 && l4 <= spanEnd2) {
                                    eaVar.f20013u = spanStart2;
                                    eaVar.v = spanEnd2;
                                    break;
                                }
                                i20++;
                            }
                        }
                    }
                }
                if (eaVar.f20013u == eaVar.v) {
                    while (true) {
                        int i21 = eaVar.f20013u;
                        if (i21 <= 0 || !ea.z(t10.charAt(i21 - 1))) {
                            break;
                        }
                        eaVar.f20013u--;
                    }
                    while (eaVar.v < t10.length() && ea.z(t10.charAt(eaVar.v))) {
                        eaVar.v++;
                    }
                }
                eaVar.f19977a = i17;
                eaVar.f19979b = i18;
                eaVar.W = z9Var;
                try {
                    eaVar.C.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                eaVar.V();
                eaVar.x();
                if (z9Var2 != null) {
                    z9Var2.invalidate();
                }
                w7.h0 h0Var = eaVar.D;
                if (h0Var != null) {
                    h0Var.a(true);
                }
                eaVar.f19990i = true;
                eaVar.R = true;
                eaVar.f19994k = true;
                eaVar.f19987g = 0.0f;
                eaVar.f19985f = 0.0f;
                eaVar.G();
            }
            eaVar.f20017z = false;
            eaVar.e = false;
        }
    }
}
