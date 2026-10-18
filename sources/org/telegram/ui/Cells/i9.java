package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.im0;
public final class i9 implements Runnable {
    public final aa f22438a;

    public i9(aa aaVar) {
        this.f22438a = aaVar;
    }

    @Override
    public final void run() {
        int i10;
        aa aaVar = this.f22438a;
        g gVar = aaVar.m0;
        Rect rect = aaVar.B;
        q9 q9Var = aaVar.f21979a0;
        v9 v9Var = aaVar.X;
        if (v9Var != null && aaVar.C != null) {
            v9 v9Var2 = aaVar.W;
            int i11 = 1;
            CharSequence s10 = aaVar.s(v9Var, true);
            im0 im0Var = aaVar.E;
            if (im0Var != null) {
                im0Var.I0(false);
            }
            int i12 = aaVar.f22007s;
            int i13 = aaVar.f22008t;
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
            int k10 = aaVar.k(i18, i13, aaVar.f21982c, aaVar.d, v9Var, true);
            if (k10 >= s10.length()) {
                aaVar.i(k10, q9Var, true);
                Layout layout = q9Var.f22789b;
                if (layout == null) {
                    aaVar.v = -1;
                    aaVar.f22009u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i18 - aaVar.f21982c;
                if (f7 < q9Var.f22789b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > q9Var.f22789b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                int i19 = aaVar.f21982c;
                int i20 = aaVar.d;
                aaVar.f(false);
                aaVar.C.setVisibility(0);
                aaVar.L(v9Var, v9Var2);
                aaVar.f22009u = k10;
                aaVar.v = k10;
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
                                aaVar.f22009u = spanStart;
                                aaVar.v = spanEnd;
                                break;
                            }
                            i21++;
                            i11 = i10;
                        } else {
                            i10 = i11;
                            org.telegram.ui.Components.a6[] a6VarArr = (org.telegram.ui.Components.a6[]) spanned.getSpans(0, s10.length(), org.telegram.ui.Components.a6.class);
                            int length2 = a6VarArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.a6 a6Var = a6VarArr[i22];
                                int spanStart2 = spanned.getSpanStart(a6Var);
                                int spanEnd2 = spanned.getSpanEnd(a6Var);
                                if (k10 >= spanStart2 && k10 <= spanEnd2) {
                                    aaVar.f22009u = spanStart2;
                                    aaVar.v = spanEnd2;
                                    break;
                                }
                                i22++;
                            }
                        }
                    }
                } else {
                    i10 = 1;
                }
                if (aaVar.f22009u == aaVar.v) {
                    while (true) {
                        int i23 = aaVar.f22009u;
                        if (i23 <= 0 || !aa.y(s10.charAt(i23 - 1))) {
                            break;
                        }
                        aaVar.f22009u--;
                    }
                    while (aaVar.v < s10.length() && aa.y(s10.charAt(aaVar.v))) {
                        aaVar.v++;
                    }
                }
                aaVar.f21978a = i19;
                aaVar.f21980b = i20;
                aaVar.W = v9Var;
                try {
                    aaVar.C.performHapticFeedback(0, i10);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                aaVar.U();
                aaVar.w();
                if (v9Var2 != null) {
                    v9Var2.invalidate();
                }
                w7.j0 j0Var = aaVar.D;
                if (j0Var != null) {
                    j0Var.a(true);
                }
                aaVar.f21991i = true;
                aaVar.R = true;
                aaVar.f21995k = true;
                aaVar.f21988g = 0.0f;
                aaVar.f21986f = 0.0f;
                aaVar.F();
            }
            aaVar.f22013z = false;
            aaVar.e = false;
        }
    }
}
