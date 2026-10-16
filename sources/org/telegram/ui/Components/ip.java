package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class ip implements View.OnClickListener {
    public final int f25707a;
    public final zp f25708b;

    public ip(zp zpVar, int i10) {
        this.f25707a = i10;
        this.f25708b = zpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25707a) {
            case 0:
                zp zpVar = this.f25708b;
                vi viVar = zpVar.Y;
                if (viVar.B0 == viVar.f29684j0) {
                    zpVar.f31643a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    zpVar.Y.F1();
                    kj kjVar = zpVar.Y.f29708r0;
                    boolean z10 = zpVar.N;
                    bb bbVar = kjVar.v;
                    ((ArrayList) bbVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) bbVar.e, z10);
                    bbVar.l();
                    return;
                }
                zpVar.f31643a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                vi viVar2 = zpVar.Y;
                viVar2.U1(viVar2.f29684j0);
                return;
            case 1:
                zp zpVar2 = this.f25708b;
                if (zpVar2.x()) {
                    zpVar2.C(true);
                    zpVar2.G(true);
                    return;
                }
                zpVar2.dismiss();
                return;
            case 2:
                zp zpVar3 = this.f25708b;
                if (zpVar3.T == null) {
                    zpVar3.E(!zpVar3.N);
                    return;
                }
                return;
            default:
                this.f25708b.u(false);
                return;
        }
    }
}
