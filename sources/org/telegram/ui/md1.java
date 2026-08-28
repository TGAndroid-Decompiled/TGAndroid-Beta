package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class md1 implements Runnable {
    public final int f40398a;
    public final rd1 f40399b;

    public md1(rd1 rd1Var, int i9) {
        this.f40398a = i9;
        this.f40399b = rd1Var;
    }

    @Override
    public final void run() {
        switch (this.f40398a) {
            case 0:
                rd1 rd1Var = this.f40399b;
                rd1Var.getClass();
                new zf.x0((org.telegram.ui.ActionBar.o2) rd1Var, 11, false).show();
                return;
            default:
                rd1 rd1Var2 = this.f40399b;
                rd1Var2.f42372e.requestFocus();
                AndroidUtilities.showKeyboard(rd1Var2.f42372e);
                return;
        }
    }
}
