package org.telegram.ui.Components;

import java.util.HashSet;
public class u4 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.a6 {
    public boolean G1;
    public int H1;
    public org.telegram.ui.ActionBar.f6 I1;
    public int J1;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        if (this.G1) {
            hashSet.add(Integer.valueOf(this.H1));
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.G1 && (w02 = org.telegram.ui.ActionBar.k6.w0(this.H1, this.I1)) != this.J1) {
                this.J1 = w02;
                setCursorColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void z(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.G1 = true;
        this.H1 = i7;
        this.I1 = f6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        this.J1 = w02;
        setCursorColor(w02);
    }
}
