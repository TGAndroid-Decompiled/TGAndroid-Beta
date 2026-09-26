package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
public final class m6 extends ai.ca {
    public final int S = 0;
    public final View T;

    public m6(o6 o6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(d6Var, false);
        this.T = o6Var;
    }

    @Override
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j3);
                return;
            case 1:
                za zaVar = (za) this.T;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(zaVar.getContext(), j3, ai.u9.a((xl0) zaVar.getParent()));
                    return;
                }
                return;
            default:
                bo boVar = (bo) this.T;
                boVar.H.getOrCreateStoryViewer().D(boVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public m6(za zaVar) {
        super(null, false);
        this.T = zaVar;
    }

    public m6(bo boVar) {
        super(null, true);
        this.T = boVar;
    }
}
