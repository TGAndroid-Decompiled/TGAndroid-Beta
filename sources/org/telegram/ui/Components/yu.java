package org.telegram.ui.Components;

import org.telegram.messenger.R;

public final class yu implements Runnable {

    public final int f34964a;

    public final zu f34965b;

    public yu(zu zuVar, int i10) {
        this.f34964a = i10;
        this.f34965b = zuVar;
    }

    @Override
    public final void run() {
        switch (this.f34964a) {
            case 0:
                this.f34965b.f35363f.dismiss();
                break;
            default:
                cv cvVar = this.f34965b.f35363f;
                cvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = cvVar.f27548c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.y1.r(R.string.AddEmojiNotFound, mc.a0(n2Var), null);
                    break;
                }
                break;
        }
    }
}
