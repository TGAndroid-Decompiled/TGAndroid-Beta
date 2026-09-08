package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class fp extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int f36469w;
    public final lp f36470x;

    public fp(lp lpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.f36470x = lpVar;
        this.f36469w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f36469w != -1) {
            lp lpVar = this.f36470x;
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
                float height = this.f36469w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new ng(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.pr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f36469w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            lp lpVar = this.f36470x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(lpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20907p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.e51[] e51VarArr = (org.telegram.ui.Components.e51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.e51.class);
            di.h2 h2Var = lpVar.f38450a;
            if (h2Var != null && h2Var.getText() != null) {
                str = lpVar.f38450a.getText().toString();
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
