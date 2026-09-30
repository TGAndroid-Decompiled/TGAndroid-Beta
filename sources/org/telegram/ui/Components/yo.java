package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class yo implements View.OnClickListener {
    public final int f30749a;
    public final pp f30750b;

    public yo(pp ppVar, int i10) {
        this.f30749a = i10;
        this.f30750b = ppVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30749a) {
            case 0:
                pp ppVar = this.f30750b;
                xi xiVar = ppVar.Y;
                if (xiVar.f30331y0 == xiVar.f30282j0) {
                    ppVar.f27423a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    ppVar.Y.C1();
                    mj mjVar = ppVar.Y.f30306r0;
                    boolean z10 = ppVar.N;
                    ab abVar = mjVar.v;
                    ((ArrayList) abVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) abVar.e, z10);
                    abVar.l();
                    return;
                }
                ppVar.f27423a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                xi xiVar2 = ppVar.Y;
                xiVar2.Q1(xiVar2.f30282j0);
                return;
            case 1:
                pp ppVar2 = this.f30750b;
                if (ppVar2.v()) {
                    ppVar2.z(true);
                    ppVar2.F(true);
                    return;
                }
                ppVar2.dismiss();
                return;
            case 2:
                pp ppVar3 = this.f30750b;
                if (ppVar3.T == null) {
                    ppVar3.B(!ppVar3.N);
                    return;
                }
                return;
            default:
                this.f30750b.s(false);
                return;
        }
    }
}
