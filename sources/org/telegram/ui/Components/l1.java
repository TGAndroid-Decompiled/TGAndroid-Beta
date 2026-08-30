package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class l1 implements Runnable {
    public final int f26508a;
    public final ArrayList f26509b;

    public l1(ArrayList arrayList, int i10) {
        this.f26508a = i10;
        this.f26509b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.p2 R;
        switch (this.f26508a) {
            case 0:
                if (this.f26509b != null && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f20478a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f26509b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        if (arrayList.get(i10) instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) arrayList.get(i10)).J3(false, false);
                            ((org.telegram.ui.Cells.t1) arrayList.get(i10)).L3(false, false, false);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
