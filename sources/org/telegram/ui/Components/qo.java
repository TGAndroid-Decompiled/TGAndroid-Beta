package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.WallpapersListActivity;
public final class qo implements View.OnClickListener {
    public final int f28220a;
    public final jp f28221b;

    public qo(jp jpVar, int i10) {
        this.f28220a = i10;
        this.f28221b = jpVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28220a) {
            case 0:
                jp jpVar = this.f28221b;
                li liVar = jpVar.V;
                if (liVar.f26744v0 == liVar.f26698g0) {
                    jpVar.X.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
                    jpVar.V.C1();
                    zi ziVar = jpVar.V.f26721o0;
                    boolean z4 = jpVar.K;
                    ra raVar = ziVar.v;
                    ((ArrayList) raVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.e, z4);
                    raVar.l();
                    return;
                }
                jpVar.X.setText(LocaleController.getString(R.string.SetColorAsBackground));
                li liVar2 = jpVar.V;
                liVar2.Q1(liVar2.f26698g0);
                return;
            case 1:
                jp jpVar2 = this.f28221b;
                if (jpVar2.v()) {
                    jpVar2.A(true);
                    jpVar2.E(true);
                    return;
                }
                jpVar2.dismiss();
                return;
            case 2:
                jp jpVar3 = this.f28221b;
                if (jpVar3.Q == null) {
                    jpVar3.C(!jpVar3.K);
                    return;
                }
                return;
            default:
                this.f28221b.s(false);
                return;
        }
    }
}
