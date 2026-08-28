package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class po extends org.telegram.ui.Cells.b9 {
    public ValueAnimator v;
    public int f41567w;
    public final vo f41568x;

    public po(vo voVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 12, b6Var);
        this.f41568x = voVar;
        this.f41567w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.f41567w != -1) {
            vo voVar = this.f41568x;
            if (voVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i13 = 0; i13 < voVar.h.getChildCount(); i13++) {
                    View childAt = voVar.h.getChildAt(i13);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f41567w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new cg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.gr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f41567w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            vo voVar = this.f41568x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(voVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.i41[] i41VarArr = (org.telegram.ui.Components.i41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.i41.class);
            fg.g gVar = voVar.f43524a;
            if (gVar != null && gVar.getText() != null) {
                str = voVar.f43524a.getText().toString();
            } else {
                str = "";
            }
            for (int i9 = 0; i9 < i41VarArr.length; i9++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(i41VarArr[i9]), charSequence.getSpanEnd(i41VarArr[i9]), 33);
                charSequence.removeSpan(i41VarArr[i9]);
            }
        }
        super.setText(charSequence);
    }
}
