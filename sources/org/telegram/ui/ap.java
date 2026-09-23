package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ap extends org.telegram.ui.Cells.f9 {
    public ValueAnimator v;
    public int f31846w;
    public final gp f31847x;

    public ap(gp gpVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 12, d6Var);
        this.f31847x = gpVar;
        this.f31846w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f31846w != -1) {
            gp gpVar = this.f31847x;
            if (gpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < gpVar.h.getChildCount(); i14++) {
                    View childAt = gpVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f31846w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new lg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.rr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f31846w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            gp gpVar = this.f31847x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(gpVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19008p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.e51[] e51VarArr = (org.telegram.ui.Components.e51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.e51.class);
            ci.h2 h2Var = gpVar.f33603a;
            if (h2Var != null && h2Var.getText() != null) {
                str = gpVar.f33603a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < e51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(e51VarArr[i10]), charSequence.getSpanEnd(e51VarArr[i10]), 33);
                charSequence.removeSpan(e51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
