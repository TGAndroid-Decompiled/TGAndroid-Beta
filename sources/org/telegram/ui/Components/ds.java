package org.telegram.ui.Components;

import java.util.ArrayList;

public final class ds implements Runnable {

    public final int f27837a;

    public final es f27838b;

    public ds(es esVar, int i10) {
        this.f27837a = i10;
        this.f27838b = esVar;
    }

    @Override
    public final void run() {
        switch (this.f27837a) {
            case 0:
                es esVar = this.f27838b;
                esVar.f28139c = false;
                esVar.f28138b.run();
                ArrayList arrayList = esVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - esVar.f28141f > 3600000) {
                    arrayList.clear();
                    esVar.f28140e = false;
                    esVar.f28142g = null;
                    esVar.a();
                }
                break;
            default:
                this.f27838b.f28143i = false;
                break;
        }
    }
}
