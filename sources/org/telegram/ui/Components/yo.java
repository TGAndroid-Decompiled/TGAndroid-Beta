package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class yo implements View.OnClickListener {
    public final int f33306a;
    public final pp f33307b;

    public yo(pp ppVar, int i10) {
        this.f33306a = i10;
        this.f33307b = ppVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33306a) {
            case 0:
                pp ppVar = this.f33307b;
                xi xiVar = ppVar.Y;
                if (xiVar.f32971y0 == xiVar.f32922j0) {
                    ppVar.f29780a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    ppVar.Y.B1();
                    mj mjVar = ppVar.Y.f32946r0;
                    boolean z10 = ppVar.N;
                    ab abVar = mjVar.v;
                    ((ArrayList) abVar.f24577e).clear();
                    WallpapersListActivity.z0((ArrayList) abVar.f24577e, z10);
                    abVar.l();
                    return;
                }
                ppVar.f29780a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                xi xiVar2 = ppVar.Y;
                xiVar2.P1(xiVar2.f32922j0);
                return;
            case 1:
                pp ppVar2 = this.f33307b;
                if (ppVar2.v()) {
                    ppVar2.z(true);
                    ppVar2.D(true);
                    return;
                }
                ppVar2.dismiss();
                return;
            case 2:
                pp ppVar3 = this.f33307b;
                if (ppVar3.T == null) {
                    ppVar3.B(!ppVar3.N);
                    return;
                }
                return;
            default:
                this.f33307b.s(false);
                return;
        }
    }
}
