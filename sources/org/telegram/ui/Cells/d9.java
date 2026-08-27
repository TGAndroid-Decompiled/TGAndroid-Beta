package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.zk0;

public final class d9 implements Runnable {

    public final w9 f24228a;

    public d9(w9 w9Var) {
        this.f24228a = w9Var;
    }

    @Override
    public final void run() {
        w9 w9Var = this.f24228a;
        g gVar = w9Var.f25890r0;
        Rect rect = w9Var.B;
        m9 m9Var = w9Var.f25859a0;
        r9 r9Var = w9Var.X;
        if (r9Var == null || w9Var.C == null) {
            return;
        }
        r9 r9Var2 = w9Var.W;
        CharSequence charSequenceT = w9Var.t(r9Var, true);
        zk0 zk0Var = w9Var.E;
        if (zk0Var != null) {
            zk0Var.I0(false);
        }
        int i10 = w9Var.f25891s;
        int i11 = w9Var.f25893t;
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
        int iL = w9Var.l(i16, i11, w9Var.f25862c, w9Var.d, r9Var, true);
        if (iL >= charSequenceT.length()) {
            w9Var.j(iL, m9Var, true);
            Layout layout = m9Var.f24688b;
            if (layout == null) {
                w9Var.v = -1;
                w9Var.f25895u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f10 = i16 - w9Var.f25862c;
                if (f10 < m9Var.f24688b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > m9Var.f24688b.getLineLeft(lineCount)) {
                    iL = charSequenceT.length() - 1;
                }
            }
        }
        if (iL >= 0 && iL < charSequenceT.length() && charSequenceT.charAt(iL) != '\n') {
            int i17 = w9Var.f25862c;
            int i18 = w9Var.d;
            w9Var.f(false);
            w9Var.C.setVisibility(0);
            w9Var.M(r9Var, r9Var2);
            w9Var.f25895u = iL;
            w9Var.v = iL;
            if (charSequenceT instanceof Spanned) {
                Spanned spanned = (Spanned) charSequenceT;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequenceT.length(), Emoji.EmojiSpan.class);
                int length = emojiSpanArr.length;
                int i19 = 0;
                while (true) {
                    if (i19 >= length) {
                        for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) spanned.getSpans(0, charSequenceT.length(), org.telegram.ui.Components.t5.class)) {
                            int spanStart = spanned.getSpanStart(t5Var);
                            int spanEnd = spanned.getSpanEnd(t5Var);
                            if (iL >= spanStart && iL <= spanEnd) {
                                w9Var.f25895u = spanStart;
                                w9Var.v = spanEnd;
                                break;
                            }
                        }
                        break;
                    }
                    Emoji.EmojiSpan emojiSpan = emojiSpanArr[i19];
                    int spanStart2 = spanned.getSpanStart(emojiSpan);
                    int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                    if (iL >= spanStart2 && iL <= spanEnd2) {
                        w9Var.f25895u = spanStart2;
                        w9Var.v = spanEnd2;
                        break;
                    }
                    i19++;
                }
            }
            if (w9Var.f25895u == w9Var.v) {
                while (true) {
                    int i20 = w9Var.f25895u;
                    if (i20 <= 0 || !w9.z(charSequenceT.charAt(i20 - 1))) {
                        break;
                    } else {
                        w9Var.f25895u--;
                    }
                }
                while (w9Var.v < charSequenceT.length() && w9.z(charSequenceT.charAt(w9Var.v))) {
                    w9Var.v++;
                }
            }
            w9Var.f25858a = i17;
            w9Var.f25860b = i18;
            w9Var.W = r9Var;
            try {
                w9Var.C.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            w9Var.V();
            w9Var.x();
            if (r9Var2 != null) {
                r9Var2.invalidate();
            }
            h7.j0 j0Var = w9Var.D;
            if (j0Var != null) {
                j0Var.a(true);
            }
            w9Var.f25872i = true;
            w9Var.R = true;
            w9Var.f25876k = true;
            w9Var.f25869g = 0.0f;
            w9Var.f25867f = 0.0f;
            w9Var.G();
        }
        w9Var.f25899z = false;
        w9Var.f25865e = false;
    }
}
