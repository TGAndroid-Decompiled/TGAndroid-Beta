package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class vo implements View.OnClickListener {
    public final int f28845a;
    public final mp f28846b;

    public vo(mp mpVar, int i10) {
        this.f28845a = i10;
        this.f28846b = mpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28845a) {
            case 0:
                mp mpVar = this.f28846b;
                vi viVar = mpVar.Y;
                if (viVar.f28808y0 == viVar.f28759j0) {
                    mpVar.f26192a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    mpVar.Y.C1();
                    jj jjVar = mpVar.Y.f28783r0;
                    boolean z10 = mpVar.N;
                    xa xaVar = jjVar.v;
                    ((ArrayList) xaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) xaVar.e, z10);
                    xaVar.l();
                    return;
                }
                mpVar.f26192a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                vi viVar2 = mpVar.Y;
                viVar2.Q1(viVar2.f28759j0);
                return;
            case 1:
                mp mpVar2 = this.f28846b;
                if (mpVar2.v()) {
                    mpVar2.z(true);
                    mpVar2.F(true);
                    return;
                }
                mpVar2.dismiss();
                return;
            case 2:
                mp mpVar3 = this.f28846b;
                if (mpVar3.T == null) {
                    mpVar3.B(!mpVar3.N);
                    return;
                }
                return;
            default:
                this.f28846b.s(false);
                return;
        }
    }
}
