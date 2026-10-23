package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fn0 implements Runnable {
    public final int f37374a;
    public final io0 f37375b;

    public fn0(io0 io0Var, int i10) {
        this.f37374a = i10;
        this.f37375b = io0Var;
    }

    @Override
    public final void run() {
        switch (this.f37374a) {
            case 0:
                io0 io0Var = this.f37375b;
                io0Var.f38300f[0].requestFocus();
                AndroidUtilities.showKeyboard(io0Var.f38300f[0]);
                return;
            case 1:
                this.f37375b.t0();
                return;
            case 2:
                io0 io0Var2 = this.f37375b;
                io0Var2.getMessagesController().newMessageCallback = null;
                if (io0Var2.f38302f1 == 3 && !io0Var2.isFinishing()) {
                    io0Var2.f38302f1 = 4;
                    ho0 ho0Var = io0Var2.Z0;
                    if (ho0Var != null) {
                        ho0Var.a(4);
                    }
                    io0Var2.finishFragment();
                    return;
                } else if (io0Var2.f38302f1 == 1 && !io0Var2.isFinishing()) {
                    io0Var2.finishFragment();
                    return;
                } else {
                    return;
                }
            default:
                io0 io0Var3 = this.f37375b;
                if (io0Var3.f38296d0 != null) {
                    io0Var3.w0();
                    io0Var3.f38296d0 = null;
                    return;
                }
                return;
        }
    }
}
