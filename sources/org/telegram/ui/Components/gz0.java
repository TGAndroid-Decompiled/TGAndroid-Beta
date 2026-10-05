package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class gz0 extends yl0 {
    public final jz0 f27020c;
    public final jz0 d;

    public gz0(jz0 jz0Var, jz0 jz0Var2) {
        this.d = jz0Var;
        this.f27020c = jz0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f27020c.f28010w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f27020c.f28010w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        iz0 iz0Var = (iz0) c1Var.f46538a;
        jz0 jz0Var = this.f27020c;
        ArrayList arrayList = jz0Var.f28010w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = jz0Var.getDirection();
        iz0Var.f27628a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = iz0Var.f27629b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    iz0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, iz0Var.f27632f.d()));
                }
            } catch (Exception unused) {
                iz0Var.setImageDrawable(null);
            }
        } else {
            iz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (iz0Var.d != direction) {
            iz0Var.d = direction;
            iz0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new iz0(this.d, this.f27020c.getContext()));
    }
}
