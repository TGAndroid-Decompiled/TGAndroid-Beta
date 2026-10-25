package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class m1 implements Runnable {
    public final int f30350a;
    public final ArrayList f30351b;

    public m1(ArrayList arrayList, int i10) {
        this.f30350a = i10;
        this.f30351b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.r2 R;
        switch (this.f30350a) {
            case 0:
                if (this.f30351b != null && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f22926a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f30351b;
                    if (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        if (arrayList.get(i10) instanceof org.telegram.ui.Cells.s1) {
                            ((org.telegram.ui.Cells.s1) arrayList.get(i10)).L3(false, false);
                            ((org.telegram.ui.Cells.s1) arrayList.get(i10)).N3(false, false, false);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
