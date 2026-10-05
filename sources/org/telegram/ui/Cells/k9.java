package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.zl0;
public final class k9 implements Runnable {
    public final da f22425a;

    public k9(da daVar) {
        this.f22425a = daVar;
    }

    @Override
    public final void run() {
        da daVar = this.f22425a;
        g gVar = daVar.f21983r0;
        Rect rect = daVar.B;
        t9 t9Var = daVar.f21952a0;
        y9 y9Var = daVar.X;
        if (y9Var != null && daVar.C != null) {
            y9 y9Var2 = daVar.W;
            CharSequence t10 = daVar.t(y9Var, true);
            zl0 zl0Var = daVar.E;
            if (zl0Var != null) {
                zl0Var.J0(false);
            }
            int i10 = daVar.f21984s;
            int i11 = daVar.f21986t;
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
            int l4 = daVar.l(i16, i11, daVar.f21955c, daVar.d, y9Var, true);
            if (l4 >= t10.length()) {
                daVar.j(l4, t9Var, true);
                Layout layout = t9Var.f23113b;
                if (layout == null) {
                    daVar.v = -1;
                    daVar.f21988u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - daVar.f21955c;
                if (f7 < t9Var.f23113b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > t9Var.f23113b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                int i17 = daVar.f21955c;
                int i18 = daVar.d;
                daVar.f(false);
                daVar.C.setVisibility(0);
                daVar.M(y9Var, y9Var2);
                daVar.f21988u = l4;
                daVar.v = l4;
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
                                daVar.f21988u = spanStart;
                                daVar.v = spanEnd;
                                break;
                            }
                            i19++;
                        } else {
                            org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spanned.getSpans(0, t10.length(), org.telegram.ui.Components.z5.class);
                            int length2 = z5VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.z5 z5Var = z5VarArr[i20];
                                int spanStart2 = spanned.getSpanStart(z5Var);
                                int spanEnd2 = spanned.getSpanEnd(z5Var);
                                if (l4 >= spanStart2 && l4 <= spanEnd2) {
                                    daVar.f21988u = spanStart2;
                                    daVar.v = spanEnd2;
                                    break;
                                }
                                i20++;
                            }
                        }
                    }
                }
                if (daVar.f21988u == daVar.v) {
                    while (true) {
                        int i21 = daVar.f21988u;
                        if (i21 <= 0 || !da.z(t10.charAt(i21 - 1))) {
                            break;
                        }
                        daVar.f21988u--;
                    }
                    while (daVar.v < t10.length() && da.z(t10.charAt(daVar.v))) {
                        daVar.v++;
                    }
                }
                daVar.f21951a = i17;
                daVar.f21953b = i18;
                daVar.W = y9Var;
                try {
                    daVar.C.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                daVar.V();
                daVar.x();
                if (y9Var2 != null) {
                    y9Var2.invalidate();
                }
                w7.j0 j0Var = daVar.D;
                if (j0Var != null) {
                    j0Var.a(true);
                }
                daVar.f21965i = true;
                daVar.R = true;
                daVar.f21969k = true;
                daVar.f21962g = 0.0f;
                daVar.f21960f = 0.0f;
                daVar.G();
            }
            daVar.f21992z = false;
            daVar.f21958e = false;
        }
    }
}
