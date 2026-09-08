package org.telegram.ui.Components;

import java.util.ArrayList;
public final class os implements Runnable {
    public final int f29203a;
    public final ps f29204b;

    public os(ps psVar, int i10) {
        this.f29203a = i10;
        this.f29204b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f29203a) {
            case 0:
                ps psVar = this.f29204b;
                psVar.f29507c = false;
                psVar.f29506b.run();
                ArrayList arrayList = psVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - psVar.f29509f > 3600000) {
                    arrayList.clear();
                    psVar.f29508e = false;
                    psVar.f29510g = null;
                    psVar.a();
                    return;
                }
                return;
            default:
                this.f29204b.f29511i = false;
                return;
        }
    }
}
