package org.telegram.ui.Components;

import java.util.HashSet;
public class s4 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.z5 {
    public boolean H1;
    public int I1;
    public org.telegram.ui.ActionBar.e6 J1;
    public int K1;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        if (this.H1) {
            hashSet.add(Integer.valueOf(this.I1));
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.H1 && (w02 = org.telegram.ui.ActionBar.k6.w0(this.I1, this.J1)) != this.K1) {
                this.K1 = w02;
                setCursorColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void z(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.H1 = true;
        this.I1 = i3;
        this.J1 = e6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        this.K1 = w02;
        setCursorColor(w02);
    }
}
