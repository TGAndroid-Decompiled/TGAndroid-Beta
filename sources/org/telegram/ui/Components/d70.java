package org.telegram.ui.Components;
public final class d70 implements Runnable {
    public final int f32913a;
    public final f70 f32914b;
    public final boolean f32915c;

    public d70(f70 f70Var, boolean z9, int i7) {
        this.f32913a = i7;
        this.f32914b = f70Var;
        this.f32915c = z9;
    }

    @Override
    public final void run() {
        switch (this.f32913a) {
            case 0:
                org.telegram.messenger.g0.h3(new d70(this.f32914b, this.f32915c, 1));
                return;
            default:
                this.f32914b.setJoinRequest(this.f32915c);
                return;
        }
    }
}
