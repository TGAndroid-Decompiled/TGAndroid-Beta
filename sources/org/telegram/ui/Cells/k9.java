package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.ll0;
public final class k9 implements Runnable {
    public final da f20369a;

    public k9(da daVar) {
        this.f20369a = daVar;
    }

    @Override
    public final void run() {
        da daVar = this.f20369a;
        g gVar = daVar.f19970r0;
        Rect rect = daVar.B;
        t9 t9Var = daVar.f19940a0;
        y9 y9Var = daVar.X;
        if (y9Var != null && daVar.C != null) {
            y9 y9Var2 = daVar.W;
            CharSequence t10 = daVar.t(y9Var, true);
            ll0 ll0Var = daVar.E;
            if (ll0Var != null) {
                ll0Var.I0(false);
            }
            int i10 = daVar.f19971s;
            int i11 = daVar.f19973t;
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
            int l4 = daVar.l(i16, i11, daVar.f19943c, daVar.d, y9Var, true);
            if (l4 >= t10.length()) {
                daVar.j(l4, t9Var, true);
                Layout layout = t9Var.f21408b;
                if (layout == null) {
                    daVar.v = -1;
                    daVar.f19975u = -1;
                    return;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - daVar.f19943c;
                if (f7 < t9Var.f21408b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > t9Var.f21408b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
            if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
                int i17 = daVar.f19943c;
                int i18 = daVar.d;
                daVar.f(false);
                daVar.C.setVisibility(0);
                daVar.M(y9Var, y9Var2);
                daVar.f19975u = l4;
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
                                daVar.f19975u = spanStart;
                                daVar.v = spanEnd;
                                break;
                            }
                            i19++;
                        } else {
                            org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spanned.getSpans(0, t10.length(), org.telegram.ui.Components.x5.class);
                            int length2 = x5VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= length2) {
                                    break;
                                }
                                org.telegram.ui.Components.x5 x5Var = x5VarArr[i20];
                                int spanStart2 = spanned.getSpanStart(x5Var);
                                int spanEnd2 = spanned.getSpanEnd(x5Var);
                                if (l4 >= spanStart2 && l4 <= spanEnd2) {
                                    daVar.f19975u = spanStart2;
                                    daVar.v = spanEnd2;
                                    break;
                                }
                                i20++;
                            }
                        }
                    }
                }
                if (daVar.f19975u == daVar.v) {
                    while (true) {
                        int i21 = daVar.f19975u;
                        if (i21 <= 0 || !da.z(t10.charAt(i21 - 1))) {
                            break;
                        }
                        daVar.f19975u--;
                    }
                    while (daVar.v < t10.length() && da.z(t10.charAt(daVar.v))) {
                        daVar.v++;
                    }
                }
                daVar.f19939a = i17;
                daVar.f19941b = i18;
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
                w7.h0 h0Var = daVar.D;
                if (h0Var != null) {
                    h0Var.a(true);
                }
                daVar.f19952i = true;
                daVar.R = true;
                daVar.f19956k = true;
                daVar.f19949g = 0.0f;
                daVar.f19947f = 0.0f;
                daVar.G();
            }
            daVar.f19979z = false;
            daVar.e = false;
        }
    }
}
