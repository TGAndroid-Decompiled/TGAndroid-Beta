package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class mz0 extends qm0 {
    public final pz0 f28976c;
    public final pz0 d;

    public mz0(pz0 pz0Var, pz0 pz0Var2) {
        this.d = pz0Var;
        this.f28976c = pz0Var2;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f28976c.f30003w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f28976c.f30003w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        oz0 oz0Var = (oz0) d1Var.f47782a;
        pz0 pz0Var = this.f28976c;
        ArrayList arrayList = pz0Var.f30003w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = pz0Var.getDirection();
        oz0Var.f29658a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = oz0Var.f29659b;
                if (!(drawable instanceof s5) || ((s5) drawable).i() != parseLong) {
                    oz0Var.setImageDrawable(s5.n(UserConfig.selectedAccount, parseLong, null, oz0Var.f29662f.d()));
                }
            } catch (Exception unused) {
                oz0Var.setImageDrawable(null);
            }
        } else {
            oz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (oz0Var.d != direction) {
            oz0Var.d = direction;
            oz0Var.requestLayout();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new oz0(this.d, this.f28976c.getContext()));
    }
}
