package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class n1 implements Runnable {
    public final int f37688a;
    public final ArrayList f37689b;

    public n1(int i7, ArrayList arrayList) {
        this.f37688a = i7;
        this.f37689b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h2 Q;
        switch (this.f37688a) {
            case 0:
                if (this.f37689b != null && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28923a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f37689b;
                    if (i7 < arrayList.size()) {
                        ((View) arrayList.get(i7)).setVisibility(8);
                        if (arrayList.get(i7) instanceof org.telegram.ui.Cells.q1) {
                            ((org.telegram.ui.Cells.q1) arrayList.get(i7)).l3(false, false);
                            ((org.telegram.ui.Cells.q1) arrayList.get(i7)).n3(false, false, false);
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}
