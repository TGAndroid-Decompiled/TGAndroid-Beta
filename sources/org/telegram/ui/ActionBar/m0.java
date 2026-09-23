package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class m0 extends AnimatorListenerAdapter {
    public final int f19367a;
    public final ArrayList f19368b;
    public final v0 f19369c;

    public m0(v0 v0Var, ArrayList arrayList, int i10) {
        this.f19367a = i10;
        this.f19369c = v0Var;
        this.f19368b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19367a) {
            case 0:
                v0 v0Var = this.f19369c;
                v0Var.F.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f19368b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    } else {
                        v0Var.F.setVisibility(8);
                        return;
                    }
                }
            default:
                this.f19369c.F.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f19368b;
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
