package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class wo implements View.OnClickListener {
    public final int f30147a;
    public final np f30148b;

    public wo(np npVar, int i10) {
        this.f30147a = i10;
        this.f30148b = npVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30147a) {
            case 0:
                np npVar = this.f30148b;
                wi wiVar = npVar.Y;
                if (wiVar.f30067y0 == wiVar.f30018j0) {
                    npVar.f26753a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    npVar.Y.C1();
                    kj kjVar = npVar.Y.f30042r0;
                    boolean z10 = npVar.N;
                    za zaVar = kjVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                npVar.f26753a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                wi wiVar2 = npVar.Y;
                wiVar2.Q1(wiVar2.f30018j0);
                return;
            case 1:
                np npVar2 = this.f30148b;
                if (npVar2.v()) {
                    npVar2.z(true);
                    npVar2.F(true);
                    return;
                }
                npVar2.dismiss();
                return;
            case 2:
                np npVar3 = this.f30148b;
                if (npVar3.T == null) {
                    npVar3.B(!npVar3.N);
                    return;
                }
                return;
            default:
                this.f30148b.s(false);
                return;
        }
    }
}
