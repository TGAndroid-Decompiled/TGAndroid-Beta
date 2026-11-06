package org.telegram.ui.Components;
public final class wd0 implements Runnable {
    public final int f39953a;
    public final ae0 f39954b;

    public wd0(ae0 ae0Var, int i7) {
        this.f39953a = i7;
        this.f39954b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f39953a) {
            case 0:
                this.f39954b.e();
                return;
            default:
                this.f39954b.g();
                return;
        }
    }
}
