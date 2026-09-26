package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class wo implements View.OnClickListener {
    public final int f30146a;
    public final np f30147b;

    public wo(np npVar, int i10) {
        this.f30146a = i10;
        this.f30147b = npVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30146a) {
            case 0:
                np npVar = this.f30147b;
                wi wiVar = npVar.Y;
                if (wiVar.f30066y0 == wiVar.f30017j0) {
                    npVar.f26752a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    npVar.Y.C1();
                    kj kjVar = npVar.Y.f30041r0;
                    boolean z10 = npVar.N;
                    za zaVar = kjVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                npVar.f26752a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                wi wiVar2 = npVar.Y;
                wiVar2.Q1(wiVar2.f30017j0);
                return;
            case 1:
                np npVar2 = this.f30147b;
                if (npVar2.v()) {
                    npVar2.z(true);
                    npVar2.F(true);
                    return;
                }
                npVar2.dismiss();
                return;
            case 2:
                np npVar3 = this.f30147b;
                if (npVar3.T == null) {
                    npVar3.B(!npVar3.N);
                    return;
                }
                return;
            default:
                this.f30147b.s(false);
                return;
        }
    }
}
