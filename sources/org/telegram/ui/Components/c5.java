package org.telegram.ui.Components;

import java.util.HashSet;
import org.telegram.messenger.FileLog;
public class c5 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.b6 {
    public boolean f25183b;
    public int f25184c;
    public org.telegram.ui.ActionBar.g6 d;
    public int e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        if (this.f25183b) {
            hashSet.add(Integer.valueOf(this.f25184c));
        }
    }

    public final void i(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f25183b = true;
        this.f25184c = i10;
        this.d = g6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        this.e = w02;
        setCursorColor(w02);
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f25183b && (w02 = org.telegram.ui.ActionBar.k6.w0(this.f25184c, this.d)) != this.e) {
                this.e = w02;
                setCursorColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
