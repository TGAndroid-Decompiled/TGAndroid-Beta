package org.telegram.ui.Components;

import java.util.HashSet;
import org.telegram.messenger.FileLog;
public class f5 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.p6 {
    public boolean f28056b;
    public int f28057c;
    public org.telegram.ui.ActionBar.u6 d;
    public int e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        if (this.f28056b) {
            hashSet.add(Integer.valueOf(this.f28057c));
        }
    }

    public final void i(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f28056b = true;
        this.f28057c = i10;
        this.d = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        this.e = w02;
        setCursorColor(w02);
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (this.f28056b && (w02 = org.telegram.ui.ActionBar.y6.w0(this.f28057c, this.d)) != this.e) {
                this.e = w02;
                setCursorColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
