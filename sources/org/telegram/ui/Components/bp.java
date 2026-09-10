package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class bp implements View.OnClickListener {
    public final int f21866a;
    public final sp f21867b;

    public bp(sp spVar, int i10) {
        this.f21866a = i10;
        this.f21867b = spVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21866a) {
            case 0:
                sp spVar = this.f21867b;
                yi yiVar = spVar.Y;
                if (yiVar.f29427y0 == yiVar.f29378j0) {
                    spVar.f27131a0.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    spVar.Y.C1();
                    mj mjVar = spVar.Y.f29402r0;
                    boolean z10 = spVar.N;
                    ya yaVar = mjVar.v;
                    ((ArrayList) yaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) yaVar.e, z10);
                    yaVar.l();
                    return;
                }
                spVar.f27131a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                yi yiVar2 = spVar.Y;
                yiVar2.Q1(yiVar2.f29378j0);
                return;
            case 1:
                sp spVar2 = this.f21867b;
                if (spVar2.v()) {
                    spVar2.z(true);
                    spVar2.E(true);
                    return;
                }
                spVar2.dismiss();
                return;
            case 2:
                sp spVar3 = this.f21867b;
                if (spVar3.T == null) {
                    spVar3.C(!spVar3.N);
                    return;
                }
                return;
            default:
                this.f21867b.s(false);
                return;
        }
    }
}
