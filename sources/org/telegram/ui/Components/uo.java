package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class uo implements View.OnClickListener {
    public final int f30956a;
    public final lp f30957b;

    public uo(lp lpVar, int i10) {
        this.f30956a = i10;
        this.f30957b = lpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30956a) {
            case 0:
                lp lpVar = this.f30957b;
                vi viVar = lpVar.Y;
                if (viVar.f31367y0 == viVar.f31318j0) {
                    lpVar.f28282a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    lpVar.Y.C1();
                    jj jjVar = lpVar.Y.f31342r0;
                    boolean z10 = lpVar.N;
                    za zaVar = jjVar.v;
                    ((ArrayList) zaVar.f33140e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.f33140e, z10);
                    zaVar.l();
                    return;
                }
                lpVar.f28282a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                vi viVar2 = lpVar.Y;
                viVar2.Q1(viVar2.f31318j0);
                return;
            case 1:
                lp lpVar2 = this.f30957b;
                if (lpVar2.v()) {
                    lpVar2.A(true);
                    lpVar2.F(true);
                    return;
                }
                lpVar2.dismiss();
                return;
            case 2:
                lp lpVar3 = this.f30957b;
                if (lpVar3.T == null) {
                    lpVar3.C(!lpVar3.N);
                    return;
                }
                return;
            default:
                this.f30957b.s(false);
                return;
        }
    }
}
