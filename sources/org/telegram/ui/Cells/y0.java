package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.messenger.qu;
import org.telegram.messenger.vv;
public final class y0 extends AccessibilityNodeProvider {
    public final q1 f23607a;
    public final Path f23608b = new Path();
    public final RectF f23609c = new RectF();
    public final Rect d = new Rect();

    public y0(q1 q1Var) {
        this.f23607a = q1Var;
    }

    public final ClickableSpan a(int i10, boolean z10) {
        if (i10 == 5000) {
            return null;
        }
        q1 q1Var = this.f23607a;
        if (z10) {
            int i11 = i10 - 3000;
            CharSequence charSequence = q1Var.O5.f16394z;
            if (!(charSequence instanceof Spannable) || i11 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i11) {
                return null;
            }
            return clickableSpanArr[i11];
        }
        int i12 = i10 - 2000;
        CharSequence charSequence2 = q1Var.O5.v;
        if (!(charSequence2 instanceof Spannable) || i12 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i12) {
            return null;
        }
        return clickableSpanArr2[i12];
    }

    public final qu b(int[] iArr, int i10) {
        vv vvVar;
        int i11;
        jj jjVar = this.f23607a.O5;
        if (jjVar != null && (vvVar = jjVar.f16385w2) != null) {
            ArrayList arrayList = vvVar.f18990g;
            int i12 = i10 - 6000;
            if (i12 >= 0) {
                int i13 = 0;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    qu quVar = (qu) arrayList.get(i14);
                    if (quVar.R()) {
                        if (quVar.f17626r == null) {
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                        int B = quVar.B() + i11 + i13;
                        if (i12 < B) {
                            iArr[0] = i12 - i13;
                            return quVar;
                        }
                        i13 = B;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y0.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int r10, int r11, android.os.Bundle r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y0.performAction(int, int, android.os.Bundle):boolean");
    }
}
