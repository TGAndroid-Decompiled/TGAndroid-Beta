package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class lo implements View.OnClickListener {
    public final int f30510a;
    public final cp f30511b;

    public lo(cp cpVar, int i9) {
        this.f30510a = i9;
        this.f30511b = cpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30510a) {
            case 0:
                cp cpVar = this.f30511b;
                ki kiVar = cpVar.U;
                if (kiVar.f30160u0 == kiVar.f30114f0) {
                    cpVar.W.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    cpVar.U.C1();
                    yi yiVar = cpVar.U.f30137n0;
                    boolean z10 = cpVar.J;
                    ra raVar = yiVar.v;
                    ((ArrayList) raVar.f32121e).clear();
                    WallpapersListActivity.y0((ArrayList) raVar.f32121e, z10);
                    raVar.l();
                    return;
                }
                cpVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                ki kiVar2 = cpVar.U;
                kiVar2.Q1(kiVar2.f30114f0);
                return;
            case 1:
                cp cpVar2 = this.f30511b;
                if (cpVar2.v()) {
                    cpVar2.z(true);
                    cpVar2.E(true);
                    return;
                }
                cpVar2.dismiss();
                return;
            case 2:
                cp cpVar3 = this.f30511b;
                if (cpVar3.P == null) {
                    cpVar3.C(!cpVar3.J);
                    return;
                }
                return;
            default:
                this.f30511b.s(false);
                return;
        }
    }
}
