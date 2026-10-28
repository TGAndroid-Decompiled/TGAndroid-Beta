package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class ip implements View.OnClickListener {
    public final int f29401a;
    public final zp f29402b;

    public ip(zp zpVar, int i10) {
        this.f29401a = i10;
        this.f29402b = zpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29401a) {
            case 0:
                zp zpVar = this.f29402b;
                ti tiVar = zpVar.X;
                if (tiVar.B0 == tiVar.f33002j0) {
                    zpVar.Z.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    zpVar.X.I1();
                    ij ijVar = zpVar.X.f33026r0;
                    boolean z10 = zpVar.M;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.A0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                zpVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
                ti tiVar2 = zpVar.X;
                tiVar2.Y1(tiVar2.f33002j0);
                return;
            case 1:
                zp zpVar2 = this.f29402b;
                if (zpVar2.A()) {
                    zpVar2.F(true);
                    zpVar2.L(true);
                    return;
                }
                zpVar2.dismiss();
                return;
            case 2:
                zp zpVar3 = this.f29402b;
                if (zpVar3.S == null) {
                    zpVar3.H(!zpVar3.M);
                    return;
                }
                return;
            default:
                this.f29402b.u(false);
                return;
        }
    }
}
