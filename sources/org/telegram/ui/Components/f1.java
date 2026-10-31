package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class f1 implements Runnable {
    public final int f25925a;
    public final ArrayList f25926b;

    public f1(int i10, ArrayList arrayList) {
        this.f25925a = i10;
        this.f25926b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.k2 Q;
        switch (this.f25925a) {
            case 0:
                if (this.f25926b != null && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f20389a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f25926b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        if (arrayList.get(i10) instanceof org.telegram.ui.Cells.q1) {
                            ((org.telegram.ui.Cells.q1) arrayList.get(i10)).f3(false, false);
                            ((org.telegram.ui.Cells.q1) arrayList.get(i10)).h3(false, false, false);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
