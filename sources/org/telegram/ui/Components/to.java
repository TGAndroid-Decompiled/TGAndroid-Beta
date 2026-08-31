package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class to implements View.OnClickListener {
    public final int f31420a;
    public final mp f31421b;

    public to(mp mpVar, int i10) {
        this.f31420a = i10;
        this.f31421b = mpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31420a) {
            case 0:
                mp mpVar = this.f31421b;
                mi miVar = mpVar.V;
                if (miVar.f29100v0 == miVar.f29054g0) {
                    mpVar.X.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    mpVar.V.C1();
                    bj bjVar = mpVar.V.f29077o0;
                    boolean z4 = mpVar.K;
                    ra raVar = bjVar.v;
                    ((ArrayList) raVar.f30657e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.f30657e, z4);
                    raVar.l();
                    return;
                }
                mpVar.X.setText(LocaleController.getString(R.string.SetColorAsBackground));
                mi miVar2 = mpVar.V;
                miVar2.Q1(miVar2.f29054g0);
                return;
            case 1:
                mp mpVar2 = this.f31421b;
                if (mpVar2.v()) {
                    mpVar2.A(true);
                    mpVar2.E(true);
                    return;
                }
                mpVar2.dismiss();
                return;
            case 2:
                mp mpVar3 = this.f31421b;
                if (mpVar3.Q == null) {
                    mpVar3.C(!mpVar3.K);
                    return;
                }
                return;
            default:
                this.f31421b.s(false);
                return;
        }
    }
}
