package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class nz0 extends rm0 {
    public final qz0 f29190c;
    public final qz0 d;

    public nz0(qz0 qz0Var, qz0 qz0Var2) {
        this.d = qz0Var;
        this.f29190c = qz0Var2;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f29190c.f30280w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f29190c.f30280w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        pz0 pz0Var = (pz0) d1Var.f47748a;
        qz0 qz0Var = this.f29190c;
        ArrayList arrayList = qz0Var.f30280w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = qz0Var.getDirection();
        pz0Var.f29872a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = pz0Var.f29873b;
                if (!(drawable instanceof s5) || ((s5) drawable).i() != parseLong) {
                    pz0Var.setImageDrawable(s5.n(UserConfig.selectedAccount, parseLong, null, pz0Var.f29876f.d()));
                }
            } catch (Exception unused) {
                pz0Var.setImageDrawable(null);
            }
        } else {
            pz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (pz0Var.d != direction) {
            pz0Var.d = direction;
            pz0Var.requestLayout();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new pz0(this.d, this.f29190c.getContext()));
    }
}
