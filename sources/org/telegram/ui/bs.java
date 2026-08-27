package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class bs implements Runnable {

    public final int f36871a;

    public final js f36872b;

    public bs(js jsVar, int i10) {
        this.f36871a = i10;
        this.f36872b = jsVar;
    }

    @Override
    public final void run() {
        switch (this.f36871a) {
            case 0:
                js jsVar = this.f36872b;
                if (jsVar.F) {
                    jsVar.d.f24370b.requestFocus();
                    AndroidUtilities.showKeyboard(jsVar.d.f24370b);
                }
                break;
            case 1:
                js.Z(this.f36872b);
                break;
            default:
                js jsVar2 = this.f36872b;
                jsVar2.presentFragment(rn.R9(jsVar2.D), true);
                break;
        }
    }
}
