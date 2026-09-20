package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class vo implements View.OnClickListener {
    public final int f29240a;
    public final mp f29241b;

    public vo(mp mpVar, int i10) {
        this.f29240a = i10;
        this.f29241b = mpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29240a) {
            case 0:
                mp mpVar = this.f29241b;
                vi viVar = mpVar.Y;
                if (viVar.f29159y0 == viVar.f29110j0) {
                    mpVar.f26443a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    mpVar.Y.C1();
                    jj jjVar = mpVar.Y.f29134r0;
                    boolean z10 = mpVar.N;
                    ya yaVar = jjVar.v;
                    ((ArrayList) yaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) yaVar.e, z10);
                    yaVar.l();
                    return;
                }
                mpVar.f26443a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                vi viVar2 = mpVar.Y;
                viVar2.Q1(viVar2.f29110j0);
                return;
            case 1:
                mp mpVar2 = this.f29241b;
                if (mpVar2.v()) {
                    mpVar2.z(true);
                    mpVar2.F(true);
                    return;
                }
                mpVar2.dismiss();
                return;
            case 2:
                mp mpVar3 = this.f29241b;
                if (mpVar3.T == null) {
                    mpVar3.B(!mpVar3.N);
                    return;
                }
                return;
            default:
                this.f29241b.s(false);
                return;
        }
    }
}
