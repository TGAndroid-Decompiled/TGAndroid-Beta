package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class yo implements View.OnClickListener {
    public final int f33183a;
    public final pp f33184b;

    public yo(pp ppVar, int i10) {
        this.f33183a = i10;
        this.f33184b = ppVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33183a) {
            case 0:
                pp ppVar = this.f33184b;
                xi xiVar = ppVar.Y;
                if (xiVar.f32874y0 == xiVar.f32825j0) {
                    ppVar.f29682a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    ppVar.Y.z1();
                    mj mjVar = ppVar.Y.f32849r0;
                    boolean z10 = ppVar.N;
                    ab abVar = mjVar.v;
                    ((ArrayList) abVar.f24507e).clear();
                    WallpapersListActivity.z0((ArrayList) abVar.f24507e, z10);
                    abVar.l();
                    return;
                }
                ppVar.f29682a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                xi xiVar2 = ppVar.Y;
                xiVar2.N1(xiVar2.f32825j0);
                return;
            case 1:
                pp ppVar2 = this.f33184b;
                if (ppVar2.v()) {
                    ppVar2.z(true);
                    ppVar2.D(true);
                    return;
                }
                ppVar2.dismiss();
                return;
            case 2:
                pp ppVar3 = this.f33184b;
                if (ppVar3.T == null) {
                    ppVar3.B(!ppVar3.N);
                    return;
                }
                return;
            default:
                this.f33184b.s(false);
                return;
        }
    }
}
