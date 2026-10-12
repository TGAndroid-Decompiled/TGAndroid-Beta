package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class ip implements View.OnClickListener {
    public final int f26044a;
    public final zp f26045b;

    public ip(zp zpVar, int i10) {
        this.f26044a = i10;
        this.f26045b = zpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26044a) {
            case 0:
                zp zpVar = this.f26045b;
                vi viVar = zpVar.Y;
                if (viVar.B0 == viVar.f30013j0) {
                    zpVar.f31940a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    zpVar.Y.F1();
                    kj kjVar = zpVar.Y.f30037r0;
                    boolean z10 = zpVar.N;
                    bb bbVar = kjVar.v;
                    ((ArrayList) bbVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) bbVar.e, z10);
                    bbVar.l();
                    return;
                }
                zpVar.f31940a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                vi viVar2 = zpVar.Y;
                viVar2.U1(viVar2.f30013j0);
                return;
            case 1:
                zp zpVar2 = this.f26045b;
                if (zpVar2.x()) {
                    zpVar2.B(true);
                    zpVar2.G(true);
                    return;
                }
                zpVar2.dismiss();
                return;
            case 2:
                zp zpVar3 = this.f26045b;
                if (zpVar3.T == null) {
                    zpVar3.E(!zpVar3.N);
                    return;
                }
                return;
            default:
                this.f26045b.u(false);
                return;
        }
    }
}
