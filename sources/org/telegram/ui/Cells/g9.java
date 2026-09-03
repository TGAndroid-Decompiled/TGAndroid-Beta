package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.sl0;
public final class g9 implements Runnable {
    public final z9 f22862a;

    public g9(z9 z9Var) {
        this.f22862a = z9Var;
    }

    @Override
    public final void run() {
        z9 z9Var = this.f22862a;
        g gVar = z9Var.f24534r0;
        Rect rect = z9Var.B;
        p9 p9Var = z9Var.f24503a0;
        u9 u9Var = z9Var.X;
        if (u9Var != null && z9Var.C != null) {
            u9 u9Var2 = z9Var.W;
            CharSequence t6 = z9Var.t(u9Var, true);
            sl0 sl0Var = z9Var.E;
            if (sl0Var != null) {
                sl0Var.I0(false);
            }
            int i10 = z9Var.f24535s;
            int i11 = z9Var.f24537t;
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
            int l10 = z9Var.l(i16, i11, z9Var.f24506c, z9Var.d, u9Var, true);
            if (l10 >= t6.length()) {
                z9Var.j(l10, p9Var, true);
                Layout layout = p9Var.f23341b;
                if (layout == null) {
                    z9Var.v = -1;
                    z9Var.f24539u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i16 - z9Var.f24506c;
                if (f10 < p9Var.f23341b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > p9Var.f23341b.getLineLeft(lineCount)) {
                    l10 = t6.length() - 1;
                }
            }
            if (l10 >= 0 && l10 < t6.length() && t6.charAt(l10) != '\n') {
                int i17 = z9Var.f24506c;
                int i18 = z9Var.d;
                z9Var.f(false);
                z9Var.C.setVisibility(0);
                z9Var.M(u9Var, u9Var2);
                z9Var.f24539u = l10;
                z9Var.v = l10;
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
                                z9Var.f24539u = spanStart;
                                z9Var.v = spanEnd;
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
                                    z9Var.f24539u = spanStart2;
                                    z9Var.v = spanEnd2;
                                    break;
                                }
                                i20++;
                            }
                        }
                    }
                }
                if (z9Var.f24539u == z9Var.v) {
                    while (true) {
                        int i21 = z9Var.f24539u;
                        if (i21 <= 0 || !z9.z(t6.charAt(i21 - 1))) {
                            break;
                        }
                        z9Var.f24539u--;
                    }
                    while (z9Var.v < t6.length() && z9.z(t6.charAt(z9Var.v))) {
                        z9Var.v++;
                    }
                }
                z9Var.f24502a = i17;
                z9Var.f24504b = i18;
                z9Var.W = u9Var;
                try {
                    z9Var.C.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                z9Var.V();
                z9Var.x();
                if (u9Var2 != null) {
                    u9Var2.invalidate();
                }
                k7.y5 y5Var = z9Var.D;
                if (y5Var != null) {
                    y5Var.a(true);
                }
                z9Var.f24516i = true;
                z9Var.R = true;
                z9Var.f24520k = true;
                z9Var.f24513g = 0.0f;
                z9Var.f24511f = 0.0f;
                z9Var.G();
            }
            z9Var.f24543z = false;
            z9Var.f24509e = false;
        }
    }
}
