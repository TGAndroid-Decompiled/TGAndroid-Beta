package org.telegram.ui.Components;

import java.util.HashSet;
import org.telegram.messenger.FileLog;
public class f5 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.p6 {
    public boolean f28029b;
    public int f28030c;
    public org.telegram.ui.ActionBar.u6 d;
    public int e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        if (this.f28029b) {
            hashSet.add(Integer.valueOf(this.f28030c));
        }
    }

    public final void i(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f28029b = true;
        this.f28030c = i10;
        this.d = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        this.e = w02;
        setCursorColor(w02);
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f28029b && (w02 = org.telegram.ui.ActionBar.y6.w0(this.f28030c, this.d)) != this.e) {
                this.e = w02;
                setCursorColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
