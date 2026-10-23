package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class n1 implements Runnable {
    public final int f28801a;
    public final ArrayList f28802b;

    public n1(ArrayList arrayList, int i10) {
        this.f28801a = i10;
        this.f28802b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.o2 R;
        switch (this.f28801a) {
            case 0:
                if (this.f28802b != null && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21636a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f28802b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        if (arrayList.get(i10) instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) arrayList.get(i10)).I3(false, false);
                            ((org.telegram.ui.Cells.t1) arrayList.get(i10)).K3(false, false, false);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
