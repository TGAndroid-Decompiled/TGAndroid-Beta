package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class wu extends r41 {
    public final xu f41733e;

    public wu(xu xuVar, String str) {
        super(str, (ez0) null);
        this.f41733e = xuVar;
    }

    @Override
    public final void onClick(View view) {
        xu xuVar = this.f41733e;
        bv bvVar = xuVar.f42202y;
        Pattern pattern = bv.Q1;
        org.telegram.messenger.mp.u1(bvVar.f30223a).F3(getURL(), xuVar.f42202y.n1, 1, null);
        xuVar.f42202y.M0();
        xuVar.f42202y.dismiss();
    }
}
