package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class l1 implements Runnable {
    public final int f30299a;
    public final ArrayList f30300b;

    public l1(ArrayList arrayList, int i9) {
        this.f30299a = i9;
        this.f30300b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.o2 R;
        switch (this.f30299a) {
            case 0:
                if (this.f30300b != null && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f23653a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = this.f30300b;
                    if (i9 < arrayList.size()) {
                        ((View) arrayList.get(i9)).setVisibility(8);
                        if (arrayList.get(i9) instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) arrayList.get(i9)).J3(false, false);
                            ((org.telegram.ui.Cells.t1) arrayList.get(i9)).L3(false, false, false);
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
        }
    }
}
