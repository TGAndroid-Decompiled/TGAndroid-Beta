package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class vo implements View.OnClickListener {
    public final int f29150a;
    public final mp f29151b;

    public vo(mp mpVar, int i10) {
        this.f29150a = i10;
        this.f29151b = mpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29150a) {
            case 0:
                mp mpVar = this.f29151b;
                vi viVar = mpVar.Y;
                if (viVar.f29082y0 == viVar.f29033j0) {
                    mpVar.f26474a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    mpVar.Y.C1();
                    jj jjVar = mpVar.Y.f29057r0;
                    boolean z10 = mpVar.N;
                    za zaVar = jjVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                    return;
                }
                mpVar.f26474a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                vi viVar2 = mpVar.Y;
                viVar2.Q1(viVar2.f29033j0);
                return;
            case 1:
                mp mpVar2 = this.f29151b;
                if (mpVar2.v()) {
                    mpVar2.z(true);
                    mpVar2.F(true);
                    return;
                }
                mpVar2.dismiss();
                return;
            case 2:
                mp mpVar3 = this.f29151b;
                if (mpVar3.T == null) {
                    mpVar3.B(!mpVar3.N);
                    return;
                }
                return;
            default:
                this.f29151b.s(false);
                return;
        }
    }
}
