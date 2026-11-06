package org.telegram.ui.Components;
public final class d70 implements Runnable {
    public final int f32777a;
    public final f70 f32778b;
    public final boolean f32779c;

    public d70(f70 f70Var, boolean z9, int i7) {
        this.f32777a = i7;
        this.f32778b = f70Var;
        this.f32779c = z9;
    }

    @Override
    public final void run() {
        switch (this.f32777a) {
            case 0:
                org.telegram.messenger.g0.h3(new d70(this.f32778b, this.f32779c, 1));
                return;
            default:
                this.f32778b.setJoinRequest(this.f32779c);
                return;
        }
    }
}
