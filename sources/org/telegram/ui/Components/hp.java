package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class hp implements View.OnClickListener {
    public final int f29032a;
    public final yp f29033b;

    public hp(yp ypVar, int i10) {
        this.f29032a = i10;
        this.f29033b = ypVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29032a) {
            case 0:
                yp ypVar = this.f29033b;
                ti tiVar = ypVar.X;
                if (tiVar.B0 == tiVar.f33030j0) {
                    ypVar.Z.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    ypVar.X.H1();
                    ij ijVar = ypVar.X.f33054r0;
                    boolean z10 = ypVar.M;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.A0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                ypVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
                ti tiVar2 = ypVar.X;
                tiVar2.X1(tiVar2.f33030j0);
                return;
            case 1:
                yp ypVar2 = this.f29033b;
                if (ypVar2.A()) {
                    ypVar2.F(true);
                    ypVar2.L(true);
                    return;
                }
                ypVar2.dismiss();
                return;
            case 2:
                yp ypVar3 = this.f29033b;
                if (ypVar3.S == null) {
                    ypVar3.H(!ypVar3.M);
                    return;
                }
                return;
            default:
                this.f29033b.u(false);
                return;
        }
    }
}
