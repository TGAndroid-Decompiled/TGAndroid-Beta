package org.telegram.ui.Components;
public final class pb extends qb implements ob {
    public f90 d;

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        f90 f90Var = this.d;
        if (f90Var != null) {
            f90Var.setTextColor(i10);
        }
    }
}
