package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ao extends org.telegram.ui.Cells.y8 {
    public final ho E;
    public ValueAnimator f45462x;
    public int f45463y;

    public ao(ho hoVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(12, context, e6Var);
        this.E = hoVar;
        this.f45463y = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f45463y != -1) {
            ho hoVar = this.E;
            if (hoVar.f47775n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i13 = 0; i13 < hoVar.f47775n.getChildCount(); i13++) {
                    View childAt = hoVar.f47775n.getChildAt(i13);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f45463y - getHeight();
                ValueAnimator valueAnimator = this.f45462x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f45462x = ofFloat;
                ofFloat.addUpdateListener(new pf(arrayList, height, 1));
                this.f45462x.setInterpolator(org.telegram.ui.Components.er.h);
                this.f45462x.setDuration(350L);
                this.f45462x.start();
            }
        }
        this.f45463y = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            ho hoVar = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.f29070p7, ho.Z(hoVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.y31[] y31VarArr = (org.telegram.ui.Components.y31[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.y31.class);
            ah.i iVar = hoVar.f47760b;
            if (iVar != null && iVar.getText() != null) {
                str = hoVar.f47760b.getText().toString();
            } else {
                str = "";
            }
            for (int i7 = 0; i7 < y31VarArr.length; i7++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, str), charSequence.getSpanStart(y31VarArr[i7]), charSequence.getSpanEnd(y31VarArr[i7]), 33);
                charSequence.removeSpan(y31VarArr[i7]);
            }
        }
        super.setText(charSequence);
    }
}
