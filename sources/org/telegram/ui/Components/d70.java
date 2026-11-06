package org.telegram.ui.Components;
public final class d70 implements Runnable {
    public final int f32789a;
    public final f70 f32790b;
    public final boolean f32791c;

    public d70(f70 f70Var, boolean z9, int i7) {
        this.f32789a = i7;
        this.f32790b = f70Var;
        this.f32791c = z9;
    }

    @Override
    public final void run() {
        switch (this.f32789a) {
            case 0:
                org.telegram.messenger.g0.h3(new d70(this.f32790b, this.f32791c, 1));
                return;
            default:
                this.f32790b.setJoinRequest(this.f32791c);
                return;
        }
    }
}
