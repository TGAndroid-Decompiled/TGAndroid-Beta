package org.telegram.ui.Components;
public final class d70 implements Runnable {
    public final int f32818a;
    public final f70 f32819b;
    public final boolean f32820c;

    public d70(f70 f70Var, boolean z9, int i7) {
        this.f32818a = i7;
        this.f32819b = f70Var;
        this.f32820c = z9;
    }

    @Override
    public final void run() {
        switch (this.f32818a) {
            case 0:
                org.telegram.messenger.g0.h3(new d70(this.f32819b, this.f32820c, 1));
                return;
            default:
                this.f32819b.setJoinRequest(this.f32820c);
                return;
        }
    }
}
