package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;
public final class zu implements Runnable {
    public final int f26976a = 0;
    public final bv f26977b;
    public final cv f26978c;
    public final View d;

    public zu(bv bvVar, View view, cv cvVar) {
        this.f26977b = bvVar;
        this.d = view;
        this.f26978c = cvVar;
    }

    @Override
    public final void run() {
        switch (this.f26976a) {
            case 0:
                bv bvVar = this.f26977b;
                bvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new zu(bvVar, this.f26978c, view));
                    return;
                }
                return;
            default:
                bv bvVar2 = this.f26977b;
                cv cvVar = this.f26978c;
                if (cvVar != null) {
                    bvVar2.getClass();
                    zi ziVar = cvVar.f22066b;
                    if (ziVar != null) {
                        ziVar.L0 = true;
                    }
                    ArrayList arrayList = cvVar.f22076n;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) obj;
                        if (s9Var instanceof bv) {
                            ((bv) s9Var).f21896x.clear();
                        }
                    }
                } else {
                    bvVar2.f21896x.clear();
                }
                this.d.invalidate();
                return;
        }
    }

    public zu(bv bvVar, cv cvVar, View view) {
        this.f26977b = bvVar;
        this.f26978c = cvVar;
        this.d = view;
    }
}
