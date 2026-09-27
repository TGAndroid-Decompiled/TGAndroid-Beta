package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ap extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int f32117w;
    public final gp f32118x;

    public ap(gp gpVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 12, e6Var);
        this.f32118x = gpVar;
        this.f32117w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f32117w != -1) {
            gp gpVar = this.f32118x;
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
                float height = this.f32117w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new lg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.sr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f32117w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            gp gpVar = this.f32118x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(gpVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19278p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.u51[] u51VarArr = (org.telegram.ui.Components.u51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.u51.class);
            ci.h2 h2Var = gpVar.f33985a;
            if (h2Var != null && h2Var.getText() != null) {
                str = gpVar.f33985a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < u51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(u51VarArr[i10]), charSequence.getSpanEnd(u51VarArr[i10]), 33);
                charSequence.removeSpan(u51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
