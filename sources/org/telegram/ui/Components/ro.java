package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class ro implements View.OnClickListener {
    public final int f28501a;
    public final kp f28502b;

    public ro(kp kpVar, int i10) {
        this.f28501a = i10;
        this.f28502b = kpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28501a) {
            case 0:
                kp kpVar = this.f28502b;
                li liVar = kpVar.V;
                if (liVar.f26748v0 == liVar.f26702g0) {
                    kpVar.X.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    kpVar.V.C1();
                    zi ziVar = kpVar.V.f26725o0;
                    boolean z4 = kpVar.K;
                    ra raVar = ziVar.v;
                    ((ArrayList) raVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.e, z4);
                    raVar.l();
                    return;
                }
                kpVar.X.setText(LocaleController.getString(R.string.SetColorAsBackground));
                li liVar2 = kpVar.V;
                liVar2.Q1(liVar2.f26702g0);
                return;
            case 1:
                kp kpVar2 = this.f28502b;
                if (kpVar2.v()) {
                    kpVar2.A(true);
                    kpVar2.E(true);
                    return;
                }
                kpVar2.dismiss();
                return;
            case 2:
                kp kpVar3 = this.f28502b;
                if (kpVar3.Q == null) {
                    kpVar3.C(!kpVar3.K);
                    return;
                }
                return;
            default:
                this.f28502b.s(false);
                return;
        }
    }
}
