package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class zu implements Runnable {
    public final int f35376a;
    public final av f35377b;

    public zu(av avVar, int i9) {
        this.f35376a = i9;
        this.f35377b = avVar;
    }

    @Override
    public final void run() {
        switch (this.f35376a) {
            case 0:
                this.f35377b.f26912f.dismiss();
                return;
            default:
                dv dvVar = this.f35377b.f26912f;
                dvVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = dvVar.f27815c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.ll.p(R.string.AddEmojiNotFound, oc.a0(o2Var), null);
                    return;
                }
                return;
        }
    }
}
