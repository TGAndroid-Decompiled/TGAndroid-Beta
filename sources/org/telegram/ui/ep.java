package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ep extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int f33448w;
    public final kp f33449x;

    public ep(kp kpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.f33449x = kpVar;
        this.f33448w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f33448w != -1) {
            kp kpVar = this.f33449x;
            if (kpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < kpVar.h.getChildCount(); i14++) {
                    View childAt = kpVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f33448w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new pg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.qr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f33448w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            kp kpVar = this.f33449x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(kpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19082p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.g51[] g51VarArr = (org.telegram.ui.Components.g51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.g51.class);
            ci.h2 h2Var = kpVar.f35317a;
            if (h2Var != null && h2Var.getText() != null) {
                str = kpVar.f35317a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < g51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(g51VarArr[i10]), charSequence.getSpanEnd(g51VarArr[i10]), 33);
                charSequence.removeSpan(g51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
