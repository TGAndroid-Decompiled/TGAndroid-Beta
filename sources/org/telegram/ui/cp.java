package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class cp extends org.telegram.ui.Cells.f9 {
    public ValueAnimator v;
    public int f32800w;
    public final ip f32801x;

    public cp(ip ipVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.f32801x = ipVar;
        this.f32800w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f32800w != -1) {
            ip ipVar = this.f32801x;
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
                float height = this.f32800w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new lg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.qr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f32800w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            ip ipVar = this.f32801x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(ipVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19315p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.t51[] t51VarArr = (org.telegram.ui.Components.t51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.t51.class);
            ci.h2 h2Var = ipVar.f34629a;
            if (h2Var != null && h2Var.getText() != null) {
                str = ipVar.f34629a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < t51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(t51VarArr[i10]), charSequence.getSpanEnd(t51VarArr[i10]), 33);
                charSequence.removeSpan(t51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
