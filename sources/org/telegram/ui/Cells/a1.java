package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import org.telegram.messenger.cu;
import org.telegram.messenger.gj;
import org.telegram.messenger.iv;
public final class a1 extends AccessibilityNodeProvider {
    public final q1 f29985a;
    public final Path f29986b = new Path();
    public final RectF f29987c = new RectF();
    public final Rect d = new Rect();

    public a1(q1 q1Var) {
        this.f29985a = q1Var;
    }

    public final ClickableSpan a(int i7, boolean z10) {
        if (i7 == 5000) {
            return null;
        }
        q1 q1Var = this.f29985a;
        if (z10) {
            int i10 = i7 - 3000;
            CharSequence charSequence = q1Var.Q5.f23875z;
            if (!(charSequence instanceof Spannable) || i10 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i10) {
                return null;
            }
            return clickableSpanArr[i10];
        }
        int i11 = i7 - 2000;
        CharSequence charSequence2 = q1Var.Q5.v;
        if (!(charSequence2 instanceof Spannable) || i11 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i11) {
            return null;
        }
        return clickableSpanArr2[i11];
    }

    public final cu b(int[] iArr, int i7) {
        iv ivVar;
        int i10;
        gj gjVar = this.f29985a.Q5;
        if (gjVar != null && (ivVar = gjVar.f23874y2) != null) {
            ArrayList arrayList = ivVar.f24445g;
            int i11 = i7 - 6000;
            if (i11 >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    cu cuVar = (cu) arrayList.get(i13);
                    if (cuVar.S()) {
                        if (cuVar.f22939r == null) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        int B = cuVar.B() + i10 + i12;
                        if (i11 < B) {
                            iArr[0] = i11 - i12;
                            return cuVar;
                        }
                        i12 = B;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a1.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int r10, int r11, android.os.Bundle r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.a1.performAction(int, int, android.os.Bundle):boolean");
    }
}
