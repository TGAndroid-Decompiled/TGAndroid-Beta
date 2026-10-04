package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class bp extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int f35162w;
    public final hp f35163x;

    public bp(hp hpVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 12, d6Var);
        this.f35163x = hpVar;
        this.f35162w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f35162w != -1) {
            hp hpVar = this.f35163x;
            if (hpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < hpVar.h.getChildCount(); i14++) {
                    View childAt = hpVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f35162w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new mg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.tr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f35162w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            hp hpVar = this.f35163x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(hpVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21044p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.d61[] d61VarArr = (org.telegram.ui.Components.d61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.d61.class);
            ci.h2 h2Var = hpVar.f37130a;
            if (h2Var != null && h2Var.getText() != null) {
                str = hpVar.f37130a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < d61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(d61VarArr[i10]), charSequence.getSpanEnd(d61VarArr[i10]), 33);
                charSequence.removeSpan(d61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
