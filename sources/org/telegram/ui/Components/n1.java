package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class n1 implements Runnable {
    public final int f27557a;
    public final ArrayList f27558b;

    public n1(ArrayList arrayList, int i10) {
        this.f27557a = i10;
        this.f27558b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.m2 R;
        switch (this.f27557a) {
            case 0:
                if (this.f27558b != null && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f20469a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f27558b;
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
