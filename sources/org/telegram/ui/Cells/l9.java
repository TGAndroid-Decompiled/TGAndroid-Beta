package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.yl0;
public final class l9 implements Runnable {
    public final ea f20645a;

    public l9(ea eaVar) {
        this.f20645a = eaVar;
    }

    @Override
    public final void run() {
        ea eaVar = this.f20645a;
        g gVar = eaVar.f20249r0;
        Rect rect = eaVar.B;
        u9 u9Var = eaVar.f20219a0;
        z9 z9Var = eaVar.X;
        if (z9Var != null && eaVar.C != null) {
            z9 z9Var2 = eaVar.W;
            CharSequence t10 = eaVar.t(z9Var, true);
            yl0 yl0Var = eaVar.E;
            if (yl0Var != null) {
                yl0Var.J0(false);
            }
            int i10 = eaVar.f20250s;
            int i11 = eaVar.f20252t;
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
            int l4 = eaVar.l(i16, i11, eaVar.f20222c, eaVar.d, z9Var, true);
            if (l4 >= t10.length()) {
                eaVar.j(l4, u9Var, true);
                Layout layout = u9Var.f21671b;
                if (layout == null) {
                    eaVar.v = -1;
                    eaVar.f20254u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - eaVar.f20222c;
                if (f7 < u9Var.f21671b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > u9Var.f21671b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                int i17 = eaVar.f20222c;
                int i18 = eaVar.d;
                eaVar.f(false);
                eaVar.C.setVisibility(0);
                eaVar.M(z9Var, z9Var2);
                eaVar.f20254u = l4;
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
                                eaVar.f20254u = spanStart;
                                eaVar.v = spanEnd;
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
                                    eaVar.f20254u = spanStart2;
                                    eaVar.v = spanEnd2;
                                    break;
                                }
                                i20++;
                            }
                        }
                    }
                }
                if (eaVar.f20254u == eaVar.v) {
                    while (true) {
                        int i21 = eaVar.f20254u;
                        if (i21 <= 0 || !ea.z(t10.charAt(i21 - 1))) {
                            break;
                        }
                        eaVar.f20254u--;
                    }
                    while (eaVar.v < t10.length() && ea.z(t10.charAt(eaVar.v))) {
                        eaVar.v++;
                    }
                }
                eaVar.f20218a = i17;
                eaVar.f20220b = i18;
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
                w7.i0 i0Var = eaVar.D;
                if (i0Var != null) {
                    i0Var.a(true);
                }
                eaVar.f20231i = true;
                eaVar.R = true;
                eaVar.f20235k = true;
                eaVar.f20228g = 0.0f;
                eaVar.f20226f = 0.0f;
                eaVar.G();
            }
            eaVar.f20258z = false;
            eaVar.e = false;
        }
    }
}
