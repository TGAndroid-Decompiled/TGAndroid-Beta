package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class bo extends org.telegram.ui.Cells.z8 {
    public final io D;
    public ValueAnimator f44080x;
    public int f44081y;

    public bo(io ioVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(12, context, g6Var);
        this.D = ioVar;
        this.f44081y = -1;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f44081y != -1) {
            io ioVar = this.D;
            if (ioVar.f46725n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                for (int i13 = 0; i13 < ioVar.f46725n.getChildCount(); i13++) {
                    View childAt = ioVar.f46725n.getChildAt(i13);
                    if (z10) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z10 = true;
                    }
                }
                float height = this.f44081y - getHeight();
                ValueAnimator valueAnimator = this.f44080x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44080x = ofFloat;
                ofFloat.addUpdateListener(new sf(arrayList, height, 1));
                this.f44080x.setInterpolator(org.telegram.ui.Components.xq.h);
                this.f44080x.setDuration(350L);
                this.f44080x.start();
            }
        }
        this.f44081y = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            io ioVar = this.D;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.l6.f28086p7, io.Z(ioVar)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.v31[] v31VarArr = (org.telegram.ui.Components.v31[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.v31.class);
            ah.i iVar = ioVar.f46710b;
            if (iVar != null && iVar.getText() != null) {
                str = ioVar.f46710b.getText().toString();
            } else {
                str = "";
            }
            for (int i7 = 0; i7 < v31VarArr.length; i7++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, str), charSequence.getSpanStart(v31VarArr[i7]), charSequence.getSpanEnd(v31VarArr[i7]), 33);
                charSequence.removeSpan(v31VarArr[i7]);
            }
        }
        super.setText(charSequence);
    }
}
