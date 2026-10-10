package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class cp extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int f36763w;
    public final ip f36764x;

    public cp(ip ipVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 12, e6Var);
        this.f36764x = ipVar;
        this.f36763w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f36763w != -1) {
            ip ipVar = this.f36764x;
            if (ipVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < ipVar.h.getChildCount(); i14++) {
                    View childAt = ipVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f36763w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new lg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.is.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f36763w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            ip ipVar = this.f36764x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(ipVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21022p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.n61[] n61VarArr = (org.telegram.ui.Components.n61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.n61.class);
            ci.g2 g2Var = ipVar.f38752a;
            if (g2Var != null && g2Var.getText() != null) {
                str = ipVar.f38752a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < n61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(n61VarArr[i10]), charSequence.getSpanEnd(n61VarArr[i10]), 33);
                charSequence.removeSpan(n61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
