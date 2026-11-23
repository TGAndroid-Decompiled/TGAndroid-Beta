package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import org.telegram.messenger.au;
import org.telegram.messenger.fv;
import org.telegram.messenger.gj;
public final class b1 extends AccessibilityNodeProvider {
    public final r1 f30418a;
    public final Path f30419b = new Path();
    public final RectF f30420c = new RectF();
    public final Rect d = new Rect();

    public b1(r1 r1Var) {
        this.f30418a = r1Var;
    }

    public final ClickableSpan a(int i7, boolean z10) {
        if (i7 == 5000) {
            return null;
        }
        r1 r1Var = this.f30418a;
        if (z10) {
            int i10 = i7 - 3000;
            CharSequence charSequence = r1Var.Q5.f24235z;
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
        CharSequence charSequence2 = r1Var.Q5.v;
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

    public final au b(int[] iArr, int i7) {
        fv fvVar;
        int i10;
        gj gjVar = this.f30418a.Q5;
        if (gjVar != null && (fvVar = gjVar.f24234y2) != null) {
            ArrayList arrayList = fvVar.f23945g;
            int i11 = i7 - 6000;
            if (i11 >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    au auVar = (au) arrayList.get(i13);
                    if (auVar.S()) {
                        if (auVar.f22938r == null) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        int B = auVar.B() + i10 + i12;
                        if (i11 < B) {
                            iArr[0] = i11 - i12;
                            return auVar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b1.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int r10, int r11, android.os.Bundle r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.b1.performAction(int, int, android.os.Bundle):boolean");
    }
}
