package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import org.telegram.messenger.cv;
import org.telegram.messenger.xt;
import org.telegram.messenger.zi;
public final class z0 extends AccessibilityNodeProvider {
    public final q1 f31021a;
    public final Path f31022b = new Path();
    public final RectF f31023c = new RectF();
    public final Rect d = new Rect();

    public z0(q1 q1Var) {
        this.f31021a = q1Var;
    }

    public final ClickableSpan a(int i3, boolean z10) {
        if (i3 == 5000) {
            return null;
        }
        q1 q1Var = this.f31021a;
        if (z10) {
            int i10 = i3 - 3000;
            CharSequence charSequence = q1Var.P5.f26924z;
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
        int i11 = i3 - 2000;
        CharSequence charSequence2 = q1Var.P5.v;
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

    public final xt b(int[] iArr, int i3) {
        cv cvVar;
        int i10;
        zi ziVar = this.f31021a.P5;
        if (ziVar != null && (cvVar = ziVar.f26915w2) != null) {
            ArrayList arrayList = cvVar.f22070g;
            int i11 = i3 - 6000;
            if (i11 >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    xt xtVar = (xt) arrayList.get(i13);
                    if (xtVar.S()) {
                        if (xtVar.f26440r == null) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        int B = xtVar.B() + i10 + i12;
                        if (i11 < B) {
                            iArr[0] = i11 - i12;
                            return xtVar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z0.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int r10, int r11, android.os.Bundle r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z0.performAction(int, int, android.os.Bundle):boolean");
    }
}
