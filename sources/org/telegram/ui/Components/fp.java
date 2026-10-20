package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class fp implements View.OnClickListener {
    public final int f26332a;
    public final wp f26333b;

    public fp(wp wpVar, int i10) {
        this.f26332a = i10;
        this.f26333b = wpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26332a) {
            case 0:
                wp wpVar = this.f26333b;
                ti tiVar = wpVar.Y;
                if (tiVar.B0 == tiVar.f30557j0) {
                    wpVar.f32203a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    wpVar.Y.F1();
                    ij ijVar = wpVar.Y.f30581r0;
                    boolean z10 = wpVar.N;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                wpVar.f32203a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                ti tiVar2 = wpVar.Y;
                tiVar2.U1(tiVar2.f30557j0);
                return;
            case 1:
                wp wpVar2 = this.f26333b;
                if (wpVar2.x()) {
                    wpVar2.B(true);
                    wpVar2.F(true);
                    return;
                }
                wpVar2.dismiss();
                return;
            case 2:
                wp wpVar3 = this.f26333b;
                if (wpVar3.T == null) {
                    wpVar3.D(!wpVar3.N);
                    return;
                }
                return;
            default:
                this.f26333b.u(false);
                return;
        }
    }
}
