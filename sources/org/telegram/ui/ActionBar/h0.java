package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class h0 extends AnimatorListenerAdapter {
    public final int f27502a;
    public final ArrayList f27503b;
    public final r0 f27504c;

    public h0(r0 r0Var, ArrayList arrayList, int i7) {
        this.f27502a = i7;
        this.f27504c = r0Var;
        this.f27503b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27502a) {
            case 0:
                r0 r0Var = this.f27504c;
                r0Var.F.setAlpha(0.0f);
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f27503b;
                    if (i7 < arrayList.size()) {
                        ((View) arrayList.get(i7)).setAlpha(1.0f);
                        i7++;
                    } else {
                        r0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f27504c.F.setAlpha(1.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f27503b;
                    if (i10 < arrayList2.size()) {
                        ((View) arrayList2.get(i10)).setAlpha(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
