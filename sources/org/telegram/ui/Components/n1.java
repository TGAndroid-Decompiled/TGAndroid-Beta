package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class n1 implements Runnable {
    public final int f28999a;
    public final ArrayList f29000b;

    public n1(ArrayList arrayList, int i10) {
        this.f28999a = i10;
        this.f29000b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.n2 R;
        switch (this.f28999a) {
            case 0:
                if (this.f29000b != null && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21357a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f29000b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        if (arrayList.get(i10) instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) arrayList.get(i10)).J3(false, false);
                            ((org.telegram.ui.Cells.u1) arrayList.get(i10)).L3(false, false, false);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
