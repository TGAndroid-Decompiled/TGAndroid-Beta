package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class f1 implements Runnable {
    public final int f26018a;
    public final ArrayList f26019b;

    public f1(int i10, ArrayList arrayList) {
        this.f26018a = i10;
        this.f26019b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.k2 Q;
        switch (this.f26018a) {
            case 0:
                if (this.f26019b != null && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f20390a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f26019b;
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
