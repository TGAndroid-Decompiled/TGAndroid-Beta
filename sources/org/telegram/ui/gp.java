package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class gp extends org.telegram.ui.Cells.f9 {
    public ValueAnimator v;
    public int f33147w;
    public final mp f33148x;

    public gp(mp mpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.f33148x = mpVar;
        this.f33147w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f33147w != -1) {
            mp mpVar = this.f33148x;
            if (mpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < mpVar.h.getChildCount(); i14++) {
                    View childAt = mpVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f33147w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new og(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.wr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f33147w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            mp mpVar = this.f33148x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18144p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.s51[] s51VarArr = (org.telegram.ui.Components.s51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.s51.class);
            bi.t2 t2Var = mpVar.f35015a;
            if (t2Var != null && t2Var.getText() != null) {
                str = mpVar.f35015a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < s51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(s51VarArr[i10]), charSequence.getSpanEnd(s51VarArr[i10]), 33);
                charSequence.removeSpan(s51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
