package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class uo implements View.OnClickListener {
    public final int f30930a;
    public final lp f30931b;

    public uo(lp lpVar, int i10) {
        this.f30930a = i10;
        this.f30931b = lpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30930a) {
            case 0:
                lp lpVar = this.f30931b;
                vi viVar = lpVar.Y;
                if (viVar.f31341y0 == viVar.f31292j0) {
                    lpVar.f28256a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    lpVar.Y.C1();
                    jj jjVar = lpVar.Y.f31316r0;
                    boolean z10 = lpVar.N;
                    za zaVar = jjVar.v;
                    ((ArrayList) zaVar.f33114e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.f33114e, z10);
                    zaVar.l();
                    return;
                }
                lpVar.f28256a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                vi viVar2 = lpVar.Y;
                viVar2.Q1(viVar2.f31292j0);
                return;
            case 1:
                lp lpVar2 = this.f30931b;
                if (lpVar2.v()) {
                    lpVar2.A(true);
                    lpVar2.F(true);
                    return;
                }
                lpVar2.dismiss();
                return;
            case 2:
                lp lpVar3 = this.f30931b;
                if (lpVar3.T == null) {
                    lpVar3.C(!lpVar3.N);
                    return;
                }
                return;
            default:
                this.f30931b.s(false);
                return;
        }
    }
}
