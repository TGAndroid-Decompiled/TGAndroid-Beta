package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class xo implements View.OnClickListener {
    public final int f30431a;
    public final op f30432b;

    public xo(op opVar, int i10) {
        this.f30431a = i10;
        this.f30432b = opVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30431a) {
            case 0:
                op opVar = this.f30432b;
                wi wiVar = opVar.Y;
                if (wiVar.f30081y0 == wiVar.f30032j0) {
                    opVar.f27067a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    opVar.Y.C1();
                    lj ljVar = opVar.Y.f30056r0;
                    boolean z10 = opVar.N;
                    za zaVar = ljVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                opVar.f27067a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                wi wiVar2 = opVar.Y;
                wiVar2.Q1(wiVar2.f30032j0);
                return;
            case 1:
                op opVar2 = this.f30432b;
                if (opVar2.v()) {
                    opVar2.z(true);
                    opVar2.F(true);
                    return;
                }
                opVar2.dismiss();
                return;
            case 2:
                op opVar3 = this.f30432b;
                if (opVar3.T == null) {
                    opVar3.B(!opVar3.N);
                    return;
                }
                return;
            default:
                this.f30432b.s(false);
                return;
        }
    }
}
