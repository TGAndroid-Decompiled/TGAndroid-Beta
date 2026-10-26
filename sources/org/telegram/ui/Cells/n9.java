package org.telegram.ui.Cells;

import a8.ye;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.mm0;
public final class n9 implements Runnable {
    public final fa f24566a;

    public n9(fa faVar) {
        this.f24566a = faVar;
    }

    @Override
    public final void run() {
        int i10;
        fa faVar = this.f24566a;
        g gVar = faVar.m0;
        Rect rect = faVar.B;
        v9 v9Var = faVar.f24088a0;
        aa aaVar = faVar.X;
        if (aaVar != null && faVar.C != null) {
            aa aaVar2 = faVar.W;
            int i11 = 1;
            CharSequence s10 = faVar.s(aaVar, true);
            mm0 mm0Var = faVar.E;
            if (mm0Var != null) {
                mm0Var.I0(false);
            }
            int i12 = faVar.f24116s;
            int i13 = faVar.f24117t;
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
            int k10 = faVar.k(i18, i13, faVar.f24091c, faVar.d, aaVar, true);
            if (k10 >= s10.length()) {
                faVar.i(k10, v9Var, true);
                Layout layout = v9Var.f25604b;
                if (layout == null) {
                    faVar.v = -1;
                    faVar.f24118u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i18 - faVar.f24091c;
                if (f7 < v9Var.f25604b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > v9Var.f25604b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                int i19 = faVar.f24091c;
                int i20 = faVar.d;
                faVar.f(false);
                faVar.C.setVisibility(0);
                faVar.L(aaVar, aaVar2);
                faVar.f24118u = k10;
                faVar.v = k10;
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
                                faVar.f24118u = spanStart;
                                faVar.v = spanEnd;
                                break;
                            }
                            i21++;
                            i11 = i10;
                        } else {
                            i10 = i11;
                            org.telegram.ui.Components.c6[] c6VarArr = (org.telegram.ui.Components.c6[]) spanned.getSpans(0, s10.length(), org.telegram.ui.Components.c6.class);
                            int length2 = c6VarArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.c6 c6Var = c6VarArr[i22];
                                int spanStart2 = spanned.getSpanStart(c6Var);
                                int spanEnd2 = spanned.getSpanEnd(c6Var);
                                if (k10 >= spanStart2 && k10 <= spanEnd2) {
                                    faVar.f24118u = spanStart2;
                                    faVar.v = spanEnd2;
                                    break;
                                }
                                i22++;
                            }
                        }
                    }
                } else {
                    i10 = 1;
                }
                if (faVar.f24118u == faVar.v) {
                    while (true) {
                        int i23 = faVar.f24118u;
                        if (i23 <= 0 || !fa.y(s10.charAt(i23 - 1))) {
                            break;
                        }
                        faVar.f24118u--;
                    }
                    while (faVar.v < s10.length() && fa.y(s10.charAt(faVar.v))) {
                        faVar.v++;
                    }
                }
                faVar.f24087a = i19;
                faVar.f24089b = i20;
                faVar.W = aaVar;
                try {
                    faVar.C.performHapticFeedback(0, i10);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                faVar.U();
                faVar.w();
                if (aaVar2 != null) {
                    aaVar2.invalidate();
                }
                ye yeVar = faVar.D;
                if (yeVar != null) {
                    yeVar.a(true);
                }
                faVar.f24100i = true;
                faVar.R = true;
                faVar.f24104k = true;
                faVar.f24097g = 0.0f;
                faVar.f24095f = 0.0f;
                faVar.F();
            }
            faVar.f24122z = false;
            faVar.e = false;
        }
    }
}
