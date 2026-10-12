package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class fp extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int f37819w;
    public final lp f37820x;

    public fp(lp lpVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 12, c6Var);
        this.f37820x = lpVar;
        this.f37819w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f37819w != -1) {
            lp lpVar = this.f37820x;
            if (lpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < lpVar.h.getChildCount(); i14++) {
                    View childAt = lpVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f37819w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new pg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.js.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f37819w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            lp lpVar = this.f37820x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(lpVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20780p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.r61[] r61VarArr = (org.telegram.ui.Components.r61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.r61.class);
            ci.g2 g2Var = lpVar.f39797a;
            if (g2Var != null && g2Var.getText() != null) {
                str = lpVar.f39797a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < r61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(r61VarArr[i10]), charSequence.getSpanEnd(r61VarArr[i10]), 33);
                charSequence.removeSpan(r61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
