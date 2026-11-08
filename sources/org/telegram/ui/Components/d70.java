package org.telegram.ui.Components;
public final class d70 implements Runnable {
    public final int f32826a;
    public final f70 f32827b;
    public final boolean f32828c;

    public d70(f70 f70Var, boolean z9, int i7) {
        this.f32826a = i7;
        this.f32827b = f70Var;
        this.f32828c = z9;
    }

    @Override
    public final void run() {
        switch (this.f32826a) {
            case 0:
                org.telegram.messenger.g0.h3(new d70(this.f32827b, this.f32828c, 1));
                return;
            default:
                this.f32827b.setJoinRequest(this.f32828c);
                return;
        }
    }
}
