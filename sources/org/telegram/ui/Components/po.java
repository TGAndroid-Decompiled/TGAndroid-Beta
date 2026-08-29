package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class po implements View.OnClickListener {
    public final int f31717a;
    public final gp f31718b;

    public po(gp gpVar, int i10) {
        this.f31717a = i10;
        this.f31718b = gpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31717a) {
            case 0:
                gp gpVar = this.f31718b;
                ni niVar = gpVar.U;
                if (niVar.f31051u0 == niVar.f31005f0) {
                    gpVar.W.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    gpVar.U.C1();
                    bj bjVar = gpVar.U.f31028n0;
                    boolean z10 = gpVar.J;
                    wa waVar = bjVar.v;
                    ((ArrayList) waVar.f34357e).clear();
                    WallpapersListActivity.z0((ArrayList) waVar.f34357e, z10);
                    waVar.l();
                    return;
                }
                gpVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                ni niVar2 = gpVar.U;
                niVar2.Q1(niVar2.f31005f0);
                return;
            case 1:
                gp gpVar2 = this.f31718b;
                if (gpVar2.v()) {
                    gpVar2.A(true);
                    gpVar2.E(true);
                    return;
                }
                gpVar2.dismiss();
                return;
            case 2:
                gp gpVar3 = this.f31718b;
                if (gpVar3.P == null) {
                    gpVar3.C(!gpVar3.J);
                    return;
                }
                return;
            default:
                this.f31718b.s(false);
                return;
        }
    }
}
