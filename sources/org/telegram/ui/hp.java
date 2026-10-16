package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class hp extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int f36621w;
    public final np f36622x;

    public hp(np npVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 12, c6Var);
        this.f36622x = npVar;
        this.f36621w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f36621w != -1) {
            np npVar = this.f36622x;
            if (npVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < npVar.h.getChildCount(); i14++) {
                    View childAt = npVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f36621w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new qg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.es.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f36621w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            np npVar = this.f36622x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(npVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19822p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.j61[] j61VarArr = (org.telegram.ui.Components.j61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.j61.class);
            di.g2 g2Var = npVar.f38432a;
            if (g2Var != null && g2Var.getText() != null) {
                str = npVar.f38432a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < j61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(j61VarArr[i10]), charSequence.getSpanEnd(j61VarArr[i10]), 33);
                charSequence.removeSpan(j61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
