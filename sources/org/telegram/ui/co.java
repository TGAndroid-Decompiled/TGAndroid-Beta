package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class co extends org.telegram.ui.Cells.a9 {
    public final jo E;
    public ValueAnimator f46572x;
    public int f46573y;

    public co(jo joVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(12, context, i6Var);
        this.E = joVar;
        this.f46573y = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f46573y != -1) {
            jo joVar = this.E;
            if (joVar.f49012n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i13 = 0; i13 < joVar.f49012n.getChildCount(); i13++) {
                    View childAt = joVar.f49012n.getChildAt(i13);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f46573y - getHeight();
                ValueAnimator valueAnimator = this.f46572x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f46572x = ofFloat;
                ofFloat.addUpdateListener(new rf(arrayList, height, 1));
                this.f46572x.setInterpolator(org.telegram.ui.Components.lr.h);
                this.f46572x.setDuration(350L);
                this.f46572x.start();
            }
        }
        this.f46573y = getHeight();
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
                charSequence.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.f29615p7, jo.Z(joVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.i41[] i41VarArr = (org.telegram.ui.Components.i41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.i41.class);
            ah.i iVar = joVar.f48997b;
            if (iVar != null && iVar.getText() != null) {
                str = joVar.f48997b.getText().toString();
            } else {
                str = "";
            }
            for (int i7 = 0; i7 < i41VarArr.length; i7++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, str), charSequence.getSpanStart(i41VarArr[i7]), charSequence.getSpanEnd(i41VarArr[i7]), 33);
                charSequence.removeSpan(i41VarArr[i7]);
            }
        }
        super.setText(charSequence);
    }
}
