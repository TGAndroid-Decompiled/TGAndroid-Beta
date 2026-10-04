package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q71 implements View.OnLayoutChangeListener {
    public Boolean f29941a;
    public boolean f29942b;
    public final n7.z0 f29943c;

    public q71(n7.z0 z0Var, View view) {
        this.f29943c = z0Var;
        o1.k kVar = new o1.k(view, o1.h.f16965n, 0.0f);
        z0Var.f16847c = kVar;
        kVar.f16983u.a(1.0f);
        ((o1.k) z0Var.f16847c).f16983u.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f29941a;
        if (bool == null || bool.booleanValue() != z10) {
            this.f29941a = Boolean.valueOf(z10);
            this.f29942b = true;
        }
        if (i15 != 0 && i15 != i11 && !this.f29942b) {
            n7.z0 z0Var = this.f29943c;
            ((o1.k) z0Var.f16847c).c();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((o1.k) z0Var.f16847c).f16983u.f16990i = 0.0f;
            view.setTranslationY((i15 - i11) + 0.0f);
            ((o1.k) z0Var.f16847c).f();
            return;
        }
        this.f29942b = false;
    }
}
