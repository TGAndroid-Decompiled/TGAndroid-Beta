package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class dp implements View.OnClickListener {
    public final int f25802a;
    public final up f25803b;

    public dp(up upVar, int i10) {
        this.f25802a = i10;
        this.f25803b = upVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25802a) {
            case 0:
                up upVar = this.f25803b;
                ri riVar = upVar.X;
                if (riVar.B0 == riVar.f30158j0) {
                    upVar.Z.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    upVar.X.I1();
                    gj gjVar = upVar.X.f30182r0;
                    boolean z10 = upVar.M;
                    xa xaVar = gjVar.v;
                    ((ArrayList) xaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) xaVar.e, z10);
                    xaVar.l();
                    return;
                }
                upVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
                ri riVar2 = upVar.X;
                riVar2.Y1(riVar2.f30158j0);
                return;
            case 1:
                up upVar2 = this.f25803b;
                if (upVar2.A()) {
                    upVar2.E(true);
                    upVar2.L(true);
                    return;
                }
                upVar2.dismiss();
                return;
            case 2:
                up upVar3 = this.f25803b;
                if (upVar3.S == null) {
                    upVar3.G(!upVar3.M);
                    return;
                }
                return;
            default:
                this.f25803b.v(false);
                return;
        }
    }
}
