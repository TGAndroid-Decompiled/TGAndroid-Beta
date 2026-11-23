package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class co extends org.telegram.ui.Cells.a9 {
    public final jo E;
    public ValueAnimator f46631x;
    public int f46632y;

    public co(jo joVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(12, context, h6Var);
        this.E = joVar;
        this.f46632y = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f46632y != -1) {
            jo joVar = this.E;
            if (joVar.f49049n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i13 = 0; i13 < joVar.f49049n.getChildCount(); i13++) {
                    View childAt = joVar.f49049n.getChildAt(i13);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f46632y - getHeight();
                ValueAnimator valueAnimator = this.f46631x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f46631x = ofFloat;
                ofFloat.addUpdateListener(new rf(arrayList, height, 1));
                this.f46631x.setInterpolator(org.telegram.ui.Components.nr.h);
                this.f46631x.setDuration(350L);
                this.f46631x.start();
            }
        }
        this.f46632y = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.W2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            jo joVar = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.f29602p7, jo.Z(joVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.l41[] l41VarArr = (org.telegram.ui.Components.l41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.l41.class);
            ah.i iVar = joVar.f49034b;
            if (iVar != null && iVar.getText() != null) {
                str = joVar.f49034b.getText().toString();
            } else {
                str = "";
            }
            for (int i7 = 0; i7 < l41VarArr.length; i7++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, str), charSequence.getSpanStart(l41VarArr[i7]), charSequence.getSpanEnd(l41VarArr[i7]), 33);
                charSequence.removeSpan(l41VarArr[i7]);
            }
        }
        super.setText(charSequence);
    }
}
