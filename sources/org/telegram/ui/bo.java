package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class bo extends org.telegram.ui.Cells.z8 {
    public final io E;
    public ValueAnimator f46458x;
    public int f46459y;

    public bo(io ioVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(12, context, i6Var);
        this.E = ioVar;
        this.f46459y = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f46459y != -1) {
            io ioVar = this.E;
            if (ioVar.f48878n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i13 = 0; i13 < ioVar.f48878n.getChildCount(); i13++) {
                    View childAt = ioVar.f48878n.getChildAt(i13);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f46459y - getHeight();
                ValueAnimator valueAnimator = this.f46458x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f46458x = ofFloat;
                ofFloat.addUpdateListener(new rf(arrayList, height, 1));
                this.f46458x.setInterpolator(org.telegram.ui.Components.kr.h);
                this.f46458x.setDuration(350L);
                this.f46458x.start();
            }
        }
        this.f46459y = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.W2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            io ioVar = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.f29672p7, io.Z(ioVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.k41[] k41VarArr = (org.telegram.ui.Components.k41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.k41.class);
            ah.i iVar = ioVar.f48863b;
            if (iVar != null && iVar.getText() != null) {
                str = ioVar.f48863b.getText().toString();
            } else {
                str = "";
            }
            for (int i7 = 0; i7 < k41VarArr.length; i7++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, str), charSequence.getSpanStart(k41VarArr[i7]), charSequence.getSpanEnd(k41VarArr[i7]), 33);
                charSequence.removeSpan(k41VarArr[i7]);
            }
        }
        super.setText(charSequence);
    }
}
