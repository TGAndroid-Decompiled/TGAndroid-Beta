package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.rl0;
public final class f9 implements Runnable {
    public final y9 f21040a;

    public f9(y9 y9Var) {
        this.f21040a = y9Var;
    }

    @Override
    public final void run() {
        y9 y9Var = this.f21040a;
        g gVar = y9Var.f22632r0;
        Rect rect = y9Var.B;
        o9 o9Var = y9Var.f22602a0;
        t9 t9Var = y9Var.X;
        if (t9Var != null && y9Var.C != null) {
            t9 t9Var2 = y9Var.W;
            CharSequence t6 = y9Var.t(t9Var, true);
            rl0 rl0Var = y9Var.E;
            if (rl0Var != null) {
                rl0Var.I0(false);
            }
            int i10 = y9Var.f22633s;
            int i11 = y9Var.f22635t;
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
            int l10 = y9Var.l(i16, i11, y9Var.f22605c, y9Var.d, t9Var, true);
            if (l10 >= t6.length()) {
                y9Var.j(l10, o9Var, true);
                Layout layout = o9Var.f21488b;
                if (layout == null) {
                    y9Var.v = -1;
                    y9Var.f22637u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i16 - y9Var.f22605c;
                if (f10 < o9Var.f21488b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > o9Var.f21488b.getLineLeft(lineCount)) {
                    l10 = t6.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t6.length() && t6.charAt(l10) != '\n') {
                int i17 = y9Var.f22605c;
                int i18 = y9Var.d;
                y9Var.f(false);
                y9Var.C.setVisibility(0);
                y9Var.M(t9Var, t9Var2);
                y9Var.f22637u = l10;
                y9Var.v = l10;
                if (t6 instanceof Spanned) {
                    Spanned spanned = (Spanned) t6;
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, t6.length(), Emoji.EmojiSpan.class);
                    int length = emojiSpanArr.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 < length) {
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[i19];
                            int spanStart = spanned.getSpanStart(emojiSpan);
                            int spanEnd = spanned.getSpanEnd(emojiSpan);
                            if (l10 >= spanStart && l10 <= spanEnd) {
                                y9Var.f22637u = spanStart;
                                y9Var.v = spanEnd;
                                break;
                            }
                            i19++;
                        } else {
                            org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spanned.getSpans(0, t6.length(), org.telegram.ui.Components.u5.class);
                            int length2 = u5VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.u5 u5Var = u5VarArr[i20];
                                int spanStart2 = spanned.getSpanStart(u5Var);
                                int spanEnd2 = spanned.getSpanEnd(u5Var);
                                if (l10 >= spanStart2 && l10 <= spanEnd2) {
                                    y9Var.f22637u = spanStart2;
                                    y9Var.v = spanEnd2;
                                    break;
                                }
                                i20++;
                            }
                        }
                    }
                }
                if (y9Var.f22637u == y9Var.v) {
                    while (true) {
                        int i21 = y9Var.f22637u;
                        if (i21 <= 0 || !y9.z(t6.charAt(i21 - 1))) {
                            break;
                        }
                        y9Var.f22637u--;
                    }
                    while (y9Var.v < t6.length() && y9.z(t6.charAt(y9Var.v))) {
                        y9Var.v++;
                    }
                }
                y9Var.f22601a = i17;
                y9Var.f22603b = i18;
                y9Var.W = t9Var;
                try {
                    y9Var.C.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                y9Var.V();
                y9Var.x();
                if (t9Var2 != null) {
                    t9Var2.invalidate();
                }
                k7.x5 x5Var = y9Var.D;
                if (x5Var != null) {
                    x5Var.a(true);
                }
                y9Var.f22614i = true;
                y9Var.R = true;
                y9Var.f22618k = true;
                y9Var.f22611g = 0.0f;
                y9Var.f22609f = 0.0f;
                y9Var.G();
            }
            y9Var.f22641z = false;
            y9Var.e = false;
        }
    }
}
