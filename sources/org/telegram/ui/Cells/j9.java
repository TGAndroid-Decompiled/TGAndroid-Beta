package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.wm0;
public final class j9 implements Runnable {
    public final ba f22124a;

    public j9(ba baVar) {
        this.f22124a = baVar;
    }

    @Override
    public final void run() {
        int i10;
        ba baVar = this.f22124a;
        g gVar = baVar.m0;
        Rect rect = baVar.B;
        r9 r9Var = baVar.f21615a0;
        w9 w9Var = baVar.X;
        if (w9Var != null && baVar.C != null) {
            w9 w9Var2 = baVar.W;
            int i11 = 1;
            CharSequence s10 = baVar.s(w9Var, true);
            wm0 wm0Var = baVar.E;
            if (wm0Var != null) {
                wm0Var.I0(false);
            }
            int i12 = baVar.f21644s;
            int i13 = baVar.f21645t;
            if (!rect.isEmpty()) {
                int i14 = rect.right;
                if (i12 > i14) {
                    i12 = i14 - 1;
                }
                int i15 = rect.left;
                if (i12 < i15) {
                    i12 = i15 + 1;
                }
                int i16 = rect.top;
                if (i13 < i16) {
                    i13 = i16 + 1;
                }
                int i17 = rect.bottom;
                if (i13 > i17) {
                    i13 = i17 - 1;
                }
            }
            int i18 = i12;
            int k10 = baVar.k(i18, i13, baVar.f21618c, baVar.d, w9Var, true);
            if (k10 >= s10.length()) {
                baVar.i(k10, r9Var, true);
                Layout layout = r9Var.f22492b;
                if (layout == null) {
                    baVar.v = -1;
                    baVar.f21646u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i18 - baVar.f21618c;
                if (f7 < r9Var.f22492b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > r9Var.f22492b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                int i19 = baVar.f21618c;
                int i20 = baVar.d;
                baVar.f(false);
                baVar.C.setVisibility(0);
                baVar.L(w9Var, w9Var2);
                baVar.f21646u = k10;
                baVar.v = k10;
                if (s10 instanceof Spanned) {
                    Spanned spanned = (Spanned) s10;
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, s10.length(), Emoji.EmojiSpan.class);
                    int length = emojiSpanArr.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 < length) {
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[i21];
                            i10 = i11;
                            int spanStart = spanned.getSpanStart(emojiSpan);
                            int spanEnd = spanned.getSpanEnd(emojiSpan);
                            if (k10 >= spanStart && k10 <= spanEnd) {
                                baVar.f21646u = spanStart;
                                baVar.v = spanEnd;
                                break;
                            }
                            i21++;
                            i11 = i10;
                        } else {
                            i10 = i11;
                            org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spanned.getSpans(0, s10.length(), org.telegram.ui.Components.b6.class);
                            int length2 = b6VarArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.b6 b6Var = b6VarArr[i22];
                                int spanStart2 = spanned.getSpanStart(b6Var);
                                int spanEnd2 = spanned.getSpanEnd(b6Var);
                                if (k10 >= spanStart2 && k10 <= spanEnd2) {
                                    baVar.f21646u = spanStart2;
                                    baVar.v = spanEnd2;
                                    break;
                                }
                                i22++;
                            }
                        }
                    }
                } else {
                    i10 = 1;
                }
                if (baVar.f21646u == baVar.v) {
                    while (true) {
                        int i23 = baVar.f21646u;
                        if (i23 <= 0 || !ba.y(s10.charAt(i23 - 1))) {
                            break;
                        }
                        baVar.f21646u--;
                    }
                    while (baVar.v < s10.length() && ba.y(s10.charAt(baVar.v))) {
                        baVar.v++;
                    }
                }
                baVar.f21614a = i19;
                baVar.f21616b = i20;
                baVar.W = w9Var;
                try {
                    baVar.C.performHapticFeedback(0, i10);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                baVar.U();
                baVar.w();
                if (w9Var2 != null) {
                    w9Var2.invalidate();
                }
                w7.g0 g0Var = baVar.D;
                if (g0Var != null) {
                    g0Var.a(true);
                }
                baVar.f21628i = true;
                baVar.R = true;
                baVar.f21632k = true;
                baVar.f21625g = 0.0f;
                baVar.f21623f = 0.0f;
                baVar.F();
            }
            baVar.f21650z = false;
            baVar.f21621e = false;
        }
    }
}
