package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class m1 implements Runnable {
    public final int f26321a;
    public final ArrayList f26322b;

    public m1(ArrayList arrayList, int i10) {
        this.f26321a = i10;
        this.f26322b = arrayList;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.m2 R;
        switch (this.f26321a) {
            case 0:
                if (this.f26322b != null && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19567a = true;
                    R.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f26322b;
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
