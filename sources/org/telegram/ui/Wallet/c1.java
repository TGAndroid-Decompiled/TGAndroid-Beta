package org.telegram.ui.Wallet;
public final class c1 implements Runnable {
    public final int f34355a;
    public final w f34356b;
    public final String f34357c;

    public c1(w wVar, String str, int i10) {
        this.f34355a = i10;
        this.f34356b = wVar;
        this.f34357c = str;
    }

    @Override
    public final void run() {
        switch (this.f34355a) {
            case 0:
                this.f34356b.run(this.f34357c);
                return;
            default:
                this.f34356b.run(this.f34357c);
                return;
        }
    }
}
