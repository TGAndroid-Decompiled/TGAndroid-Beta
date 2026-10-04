package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class yo implements View.OnClickListener {
    public final int f33182a;
    public final pp f33183b;

    public yo(pp ppVar, int i10) {
        this.f33182a = i10;
        this.f33183b = ppVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33182a) {
            case 0:
                pp ppVar = this.f33183b;
                xi xiVar = ppVar.Y;
                if (xiVar.f32873y0 == xiVar.f32824j0) {
                    ppVar.f29681a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    ppVar.Y.z1();
                    mj mjVar = ppVar.Y.f32848r0;
                    boolean z10 = ppVar.N;
                    ab abVar = mjVar.v;
                    ((ArrayList) abVar.f24506e).clear();
                    WallpapersListActivity.z0((ArrayList) abVar.f24506e, z10);
                    abVar.l();
                    return;
                }
                ppVar.f29681a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                xi xiVar2 = ppVar.Y;
                xiVar2.N1(xiVar2.f32824j0);
                return;
            case 1:
                pp ppVar2 = this.f33183b;
                if (ppVar2.v()) {
                    ppVar2.z(true);
                    ppVar2.D(true);
                    return;
                }
                ppVar2.dismiss();
                return;
            case 2:
                pp ppVar3 = this.f33183b;
                if (ppVar3.T == null) {
                    ppVar3.B(!ppVar3.N);
                    return;
                }
                return;
            default:
                this.f33183b.s(false);
                return;
        }
    }
}
