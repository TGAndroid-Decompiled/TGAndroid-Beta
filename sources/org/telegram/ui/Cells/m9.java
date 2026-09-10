package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.vl0;
public final class m9 implements Runnable {
    public final fa f19535a;

    public m9(fa faVar) {
        this.f19535a = faVar;
    }

    @Override
    public final void run() {
        fa faVar = this.f19535a;
        g gVar = faVar.f19159r0;
        Rect rect = faVar.B;
        v9 v9Var = faVar.f19129a0;
        aa aaVar = faVar.X;
        if (aaVar != null && faVar.C != null) {
            aa aaVar2 = faVar.W;
            CharSequence t10 = faVar.t(aaVar, true);
            vl0 vl0Var = faVar.E;
            if (vl0Var != null) {
                vl0Var.I0(false);
            }
            int i10 = faVar.f19160s;
            int i11 = faVar.f19162t;
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
            int l4 = faVar.l(i16, i11, faVar.f19132c, faVar.d, aaVar, true);
            if (l4 >= t10.length()) {
                faVar.j(l4, v9Var, true);
                Layout layout = v9Var.f20570b;
                if (layout == null) {
                    faVar.v = -1;
                    faVar.f19164u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - faVar.f19132c;
                if (f7 < v9Var.f20570b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > v9Var.f20570b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                int i17 = faVar.f19132c;
                int i18 = faVar.d;
                faVar.f(false);
                faVar.C.setVisibility(0);
                faVar.M(aaVar, aaVar2);
                faVar.f19164u = l4;
                faVar.v = l4;
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
                                faVar.f19164u = spanStart;
                                faVar.v = spanEnd;
                                break;
                            }
                            i19++;
                        } else {
                            org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spanned.getSpans(0, t10.length(), org.telegram.ui.Components.y5.class);
                            int length2 = y5VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.y5 y5Var = y5VarArr[i20];
                                int spanStart2 = spanned.getSpanStart(y5Var);
                                int spanEnd2 = spanned.getSpanEnd(y5Var);
                                if (l4 >= spanStart2 && l4 <= spanEnd2) {
                                    faVar.f19164u = spanStart2;
                                    faVar.v = spanEnd2;
                                    break;
                                }
                                i20++;
                            }
                        }
                    }
                }
                if (faVar.f19164u == faVar.v) {
                    while (true) {
                        int i21 = faVar.f19164u;
                        if (i21 <= 0 || !fa.z(t10.charAt(i21 - 1))) {
                            break;
                        }
                        faVar.f19164u--;
                    }
                    while (faVar.v < t10.length() && fa.z(t10.charAt(faVar.v))) {
                        faVar.v++;
                    }
                }
                faVar.f19128a = i17;
                faVar.f19130b = i18;
                faVar.W = aaVar;
                try {
                    faVar.C.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                faVar.V();
                faVar.x();
                if (aaVar2 != null) {
                    aaVar2.invalidate();
                }
                w7.w5 w5Var = faVar.D;
                if (w5Var != null) {
                    w5Var.a(true);
                }
                faVar.f19141i = true;
                faVar.R = true;
                faVar.f19145k = true;
                faVar.f19138g = 0.0f;
                faVar.f19136f = 0.0f;
                faVar.G();
            }
            faVar.f19168z = false;
            faVar.e = false;
        }
    }
}
