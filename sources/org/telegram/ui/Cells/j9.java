package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.mm0;
public final class j9 implements Runnable {
    public final ba f21419a;

    public j9(ba baVar) {
        this.f21419a = baVar;
    }

    @Override
    public final void run() {
        int i10;
        ba baVar = this.f21419a;
        g gVar = baVar.m0;
        Rect rect = baVar.B;
        r9 r9Var = baVar.f20960a0;
        w9 w9Var = baVar.X;
        if (w9Var != null && baVar.C != null) {
            w9 w9Var2 = baVar.W;
            int i11 = 1;
            CharSequence s10 = baVar.s(w9Var, true);
            mm0 mm0Var = baVar.E;
            if (mm0Var != null) {
                mm0Var.I0(false);
            }
            int i12 = baVar.f20988s;
            int i13 = baVar.f20989t;
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
            int k10 = baVar.k(i18, i13, baVar.f20963c, baVar.d, w9Var, true);
            if (k10 >= s10.length()) {
                baVar.i(k10, r9Var, true);
                Layout layout = r9Var.f21770b;
                if (layout == null) {
                    baVar.v = -1;
                    baVar.f20990u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i18 - baVar.f20963c;
                if (f7 < r9Var.f21770b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > r9Var.f21770b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                int i19 = baVar.f20963c;
                int i20 = baVar.d;
                baVar.f(false);
                baVar.C.setVisibility(0);
                baVar.L(w9Var, w9Var2);
                baVar.f20990u = k10;
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
                                baVar.f20990u = spanStart;
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
                                    baVar.f20990u = spanStart2;
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
                if (baVar.f20990u == baVar.v) {
                    while (true) {
                        int i23 = baVar.f20990u;
                        if (i23 <= 0 || !ba.y(s10.charAt(i23 - 1))) {
                            break;
                        }
                        baVar.f20990u--;
                    }
                    while (baVar.v < s10.length() && ba.y(s10.charAt(baVar.v))) {
                        baVar.v++;
                    }
                }
                baVar.f20959a = i19;
                baVar.f20961b = i20;
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
                w7.w5 w5Var = baVar.D;
                if (w5Var != null) {
                    w5Var.a(true);
                }
                baVar.f20972i = true;
                baVar.R = true;
                baVar.f20976k = true;
                baVar.f20969g = 0.0f;
                baVar.f20967f = 0.0f;
                baVar.F();
            }
            baVar.f20994z = false;
            baVar.e = false;
        }
    }
}
