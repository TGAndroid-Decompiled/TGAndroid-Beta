package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class m1 implements Runnable {
    public final int f26064a;
    public final ArrayList f26065b;

    public m1(ArrayList arrayList, int i10) {
        this.f26064a = i10;
        this.f26065b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.n2 R;
        switch (this.f26064a) {
            case 0:
                if (this.f26065b != null && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19352a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f26065b;
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
