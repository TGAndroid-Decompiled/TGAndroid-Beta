package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;

public final class jo implements View.OnClickListener {

    public final int f29767a;

    public final ap f29768b;

    public jo(ap apVar, int i10) {
        this.f29767a = i10;
        this.f29768b = apVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29767a) {
            case 0:
                ap apVar = this.f29768b;
                gi giVar = apVar.U;
                if (giVar.f28696u0 != giVar.f28650f0) {
                    apVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                    gi giVar2 = apVar.U;
                    giVar2.Q1(giVar2.f28650f0);
                } else {
                    apVar.W.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    apVar.U.C1();
                    ui uiVar = apVar.U.f28673n0;
                    boolean z10 = apVar.J;
                    pa paVar = uiVar.v;
                    ((ArrayList) paVar.f31572e).clear();
                    WallpapersListActivity.z0((ArrayList) paVar.f31572e, z10);
                    paVar.l();
                }
                break;
            case 1:
                ap apVar2 = this.f29768b;
                if (!apVar2.w()) {
                    apVar2.dismiss();
                } else {
                    apVar2.B(true);
                    apVar2.F(true);
                }
                break;
            case 2:
                ap apVar3 = this.f29768b;
                if (apVar3.P == null) {
                    apVar3.D(!apVar3.J);
                    break;
                }
                break;
            default:
                this.f29768b.t(false);
                break;
        }
    }
}
