package org.telegram.ui;
public final class nr implements Runnable {
    public final int f41867a;
    public final or f41868b;

    public nr(or orVar, int i10) {
        this.f41867a = i10;
        this.f41868b = orVar;
    }

    @Override
    public final void run() {
        switch (this.f41867a) {
            case 0:
                org.telegram.ui.Components.m71 m71Var = this.f41868b.f30764a;
                if (m71Var != null) {
                    m71Var.f32504g3.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.m71 m71Var2 = this.f41868b.f30764a;
                if (m71Var2 != null) {
                    m71Var2.f32504g3.O(true);
                    return;
                }
                return;
        }
    }
}
