package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;
public final class wu extends p41 {
    public final xu f41797e;

    public wu(xu xuVar, String str) {
        super(str, (dz0) null);
        this.f41797e = xuVar;
    }

    @Override
    public final void onClick(View view) {
        xu xuVar = this.f41797e;
        bv bvVar = xuVar.f42194y;
        Pattern pattern = bv.Q1;
        org.telegram.messenger.mp.u1(bvVar.f30187a).F3(getURL(), xuVar.f42194y.n1, 1, null);
        xuVar.f42194y.M0();
        xuVar.f42194y.dismiss();
    }
}
