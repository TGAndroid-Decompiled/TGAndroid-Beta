package org.telegram.ui.Components;
public final class mm implements org.telegram.messenger.c20 {
    public final int f36111a;
    public final org.telegram.messenger.c20 f36112b;

    public mm(org.telegram.messenger.c20 c20Var, int i7) {
        this.f36111a = i7;
        this.f36112b = c20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36111a) {
            case 0:
                this.f36112b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z9 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z9 = true;
                }
                this.f36112b.a(Boolean.valueOf(z9));
                return;
        }
    }
}
