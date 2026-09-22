package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class vo implements View.OnClickListener {
    public final int f29219a;
    public final mp f29220b;

    public vo(mp mpVar, int i10) {
        this.f29219a = i10;
        this.f29220b = mpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29219a) {
            case 0:
                mp mpVar = this.f29220b;
                vi viVar = mpVar.Y;
                if (viVar.f29157y0 == viVar.f29108j0) {
                    mpVar.f26495a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    mpVar.Y.C1();
                    jj jjVar = mpVar.Y.f29132r0;
                    boolean z10 = mpVar.N;
                    ya yaVar = jjVar.v;
                    ((ArrayList) yaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) yaVar.e, z10);
                    yaVar.l();
                    return;
                }
                mpVar.f26495a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                vi viVar2 = mpVar.Y;
                viVar2.Q1(viVar2.f29108j0);
                return;
            case 1:
                mp mpVar2 = this.f29220b;
                if (mpVar2.v()) {
                    mpVar2.z(true);
                    mpVar2.E(true);
                    return;
                }
                mpVar2.dismiss();
                return;
            case 2:
                mp mpVar3 = this.f29220b;
                if (mpVar3.T == null) {
                    mpVar3.B(!mpVar3.N);
                    return;
                }
                return;
            default:
                this.f29220b.s(false);
                return;
        }
    }
}
