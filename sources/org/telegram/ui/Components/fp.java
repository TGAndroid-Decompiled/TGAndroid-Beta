package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class fp implements View.OnClickListener {
    public final int f26433a;
    public final wp f26434b;

    public fp(wp wpVar, int i10) {
        this.f26433a = i10;
        this.f26434b = wpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26433a) {
            case 0:
                wp wpVar = this.f26434b;
                ti tiVar = wpVar.X;
                if (tiVar.B0 == tiVar.f30742j0) {
                    wpVar.Z.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    wpVar.X.I1();
                    ij ijVar = wpVar.X.f30766r0;
                    boolean z10 = wpVar.M;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                wpVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
                ti tiVar2 = wpVar.X;
                tiVar2.Y1(tiVar2.f30742j0);
                return;
            case 1:
                wp wpVar2 = this.f26434b;
                if (wpVar2.A()) {
                    wpVar2.E(true);
                    wpVar2.L(true);
                    return;
                }
                wpVar2.dismiss();
                return;
            case 2:
                wp wpVar3 = this.f26434b;
                if (wpVar3.S == null) {
                    wpVar3.G(!wpVar3.M);
                    return;
                }
                return;
            default:
                this.f26434b.v(false);
                return;
        }
    }
}
