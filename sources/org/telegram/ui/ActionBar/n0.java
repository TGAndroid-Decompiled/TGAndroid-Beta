package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

public final class n0 extends AnimatorListenerAdapter {

    public final int f23674a;

    public final ArrayList f23675b;

    public final v0 f23676c;

    public n0(v0 v0Var, ArrayList arrayList, int i10) {
        this.f23674a = i10;
        this.f23676c = v0Var;
        this.f23675b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23674a) {
            case 0:
                v0 v0Var = this.f23676c;
                v0Var.B.setAlpha(0.0f);
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f23675b;
                    if (i10 >= arrayList.size()) {
                        v0Var.B.setVisibility(8);
                    } else {
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    }
                    break;
                }
                break;
            default:
                this.f23676c.B.setAlpha(1.0f);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f23675b;
                    if (i11 < arrayList2.size()) {
                        ((View) arrayList2.get(i11)).setAlpha(0.0f);
                        i11++;
                    }
                    break;
                }
                break;
        }
    }
}
