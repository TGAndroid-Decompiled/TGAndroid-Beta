package org.telegram.ui.Components;
public final class lm implements Runnable {
    public final int f28139a;
    public final jn f28140b;
    public final int f28141c;

    public lm(jn jnVar, int i10, int i11) {
        this.f28139a = i11;
        this.f28140b = jnVar;
        this.f28141c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28139a) {
            case 0:
                this.f28140b.h0(this.f28141c, null);
                return;
            case 1:
                this.f28140b.e0(this.f28141c);
                return;
            default:
                this.f28140b.h0(this.f28141c, null);
                return;
        }
    }
}
