package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class l0 extends AnimatorListenerAdapter {
    public final int f19611a;
    public final ArrayList f19612b;
    public final u0 f19613c;

    public l0(u0 u0Var, ArrayList arrayList, int i10) {
        this.f19611a = i10;
        this.f19613c = u0Var;
        this.f19612b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19611a) {
            case 0:
                u0 u0Var = this.f19613c;
                u0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f19612b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        u0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f19613c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f19612b;
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
