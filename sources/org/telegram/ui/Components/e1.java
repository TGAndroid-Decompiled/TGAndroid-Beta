package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class e1 implements Runnable {
    public final int f33262a;
    public final ArrayList f33263b;

    public e1(int i3, ArrayList arrayList) {
        this.f33262a = i3;
        this.f33263b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d2 Q;
        switch (this.f33262a) {
            case 0:
                if (this.f33263b != null && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.f33263b;
                    if (i3 < arrayList.size()) {
                        ((View) arrayList.get(i3)).setVisibility(8);
                        if (arrayList.get(i3) instanceof org.telegram.ui.Cells.q1) {
                            ((org.telegram.ui.Cells.q1) arrayList.get(i3)).h3(false, false);
                            ((org.telegram.ui.Cells.q1) arrayList.get(i3)).j3(false, false, false);
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
        }
    }
}
