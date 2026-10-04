package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m0 extends AnimatorListenerAdapter {
    public final int f21365a;
    public final ArrayList f21366b;
    public final v0 f21367c;

    public m0(v0 v0Var, ArrayList arrayList, int i10) {
        this.f21365a = i10;
        this.f21367c = v0Var;
        this.f21366b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21365a) {
            case 0:
                v0 v0Var = this.f21367c;
                v0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f21366b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        v0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f21367c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f21366b;
                    if (i11 < arrayList2.size()) {
                        ((View) arrayList2.get(i11)).setAlpha(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
