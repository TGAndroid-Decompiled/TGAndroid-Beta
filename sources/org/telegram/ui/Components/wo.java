package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class wo implements View.OnClickListener {
    public final int f30126a;
    public final np f30127b;

    public wo(np npVar, int i10) {
        this.f30126a = i10;
        this.f30127b = npVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30126a) {
            case 0:
                np npVar = this.f30127b;
                wi wiVar = npVar.Y;
                if (wiVar.f30046y0 == wiVar.f29997j0) {
                    npVar.f26745a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    npVar.Y.C1();
                    kj kjVar = npVar.Y.f30021r0;
                    boolean z10 = npVar.N;
                    za zaVar = kjVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                npVar.f26745a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                wi wiVar2 = npVar.Y;
                wiVar2.Q1(wiVar2.f29997j0);
                return;
            case 1:
                np npVar2 = this.f30127b;
                if (npVar2.v()) {
                    npVar2.z(true);
                    npVar2.F(true);
                    return;
                }
                npVar2.dismiss();
                return;
            case 2:
                np npVar3 = this.f30127b;
                if (npVar3.T == null) {
                    npVar3.B(!npVar3.N);
                    return;
                }
                return;
            default:
                this.f30127b.s(false);
                return;
        }
    }
}
