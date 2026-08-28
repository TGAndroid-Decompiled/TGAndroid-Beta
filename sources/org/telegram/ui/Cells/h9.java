package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.wk0;
public final class h9 implements Runnable {
    public final aa f24492a;

    public h9(aa aaVar) {
        this.f24492a = aaVar;
    }

    @Override
    public final void run() {
        aa aaVar = this.f24492a;
        g gVar = aaVar.f24103r0;
        Rect rect = aaVar.B;
        q9 q9Var = aaVar.f24072a0;
        v9 v9Var = aaVar.X;
        if (v9Var != null && aaVar.C != null) {
            v9 v9Var2 = aaVar.W;
            CharSequence t10 = aaVar.t(v9Var, true);
            wk0 wk0Var = aaVar.E;
            if (wk0Var != null) {
                wk0Var.I0(false);
            }
            int i9 = aaVar.f24104s;
            int i10 = aaVar.f24106t;
            if (!rect.isEmpty()) {
                int i11 = rect.right;
                if (i9 > i11) {
                    i9 = i11 - 1;
                }
                int i12 = rect.left;
                if (i9 < i12) {
                    i9 = i12 + 1;
                }
                int i13 = rect.top;
                if (i10 < i13) {
                    i10 = i13 + 1;
                }
                int i14 = rect.bottom;
                if (i10 > i14) {
                    i10 = i14 - 1;
                }
            }
            int i15 = i9;
            int l10 = aaVar.l(i15, i10, aaVar.f24075c, aaVar.d, v9Var, true);
            if (l10 >= t10.length()) {
                aaVar.j(l10, q9Var, true);
                Layout layout = q9Var.f24920b;
                if (layout == null) {
                    aaVar.v = -1;
                    aaVar.f24108u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i15 - aaVar.f24075c;
                if (f10 < q9Var.f24920b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > q9Var.f24920b.getLineLeft(lineCount)) {
                    l10 = t10.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t10.length() && t10.charAt(l10) != '\n') {
                int i16 = aaVar.f24075c;
                int i17 = aaVar.d;
                aaVar.f(false);
                aaVar.C.setVisibility(0);
                aaVar.M(v9Var, v9Var2);
                aaVar.f24108u = l10;
                aaVar.v = l10;
                if (t10 instanceof Spanned) {
                    Spanned spanned = (Spanned) t10;
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, t10.length(), Emoji.EmojiSpan.class);
                    int length = emojiSpanArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 < length) {
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[i18];
                            int spanStart = spanned.getSpanStart(emojiSpan);
                            int spanEnd = spanned.getSpanEnd(emojiSpan);
                            if (l10 >= spanStart && l10 <= spanEnd) {
                                aaVar.f24108u = spanStart;
                                aaVar.v = spanEnd;
                                break;
                            }
                            i18++;
                        } else {
                            org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, t10.length(), org.telegram.ui.Components.t5.class);
                            int length2 = t5VarArr.length;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.t5 t5Var = t5VarArr[i19];
                                int spanStart2 = spanned.getSpanStart(t5Var);
                                int spanEnd2 = spanned.getSpanEnd(t5Var);
                                if (l10 >= spanStart2 && l10 <= spanEnd2) {
                                    aaVar.f24108u = spanStart2;
                                    aaVar.v = spanEnd2;
                                    break;
                                }
                                i19++;
                            }
                        }
                    }
                }
                if (aaVar.f24108u == aaVar.v) {
                    while (true) {
                        int i20 = aaVar.f24108u;
                        if (i20 <= 0 || !aa.z(t10.charAt(i20 - 1))) {
                            break;
                        }
                        aaVar.f24108u--;
                    }
                    while (aaVar.v < t10.length() && aa.z(t10.charAt(aaVar.v))) {
                        aaVar.v++;
                    }
                }
                aaVar.f24071a = i16;
                aaVar.f24073b = i17;
                aaVar.W = v9Var;
                try {
                    aaVar.C.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                aaVar.V();
                aaVar.x();
                if (v9Var2 != null) {
                    v9Var2.invalidate();
                }
                g7.a6 a6Var = aaVar.D;
                if (a6Var != null) {
                    a6Var.a(true);
                }
                aaVar.f24085i = true;
                aaVar.R = true;
                aaVar.f24089k = true;
                aaVar.f24082g = 0.0f;
                aaVar.f24080f = 0.0f;
                aaVar.G();
            }
            aaVar.f24112z = false;
            aaVar.f24078e = false;
        }
    }
}
