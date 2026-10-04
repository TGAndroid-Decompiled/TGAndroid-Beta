package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class fz0 extends yl0 {
    public final iz0 f26610c;
    public final iz0 d;

    public fz0(iz0 iz0Var, iz0 iz0Var2) {
        this.d = iz0Var;
        this.f26610c = iz0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f26610c.f27542w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f26610c.f27542w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        hz0 hz0Var = (hz0) c1Var.f46531a;
        iz0 iz0Var = this.f26610c;
        ArrayList arrayList = iz0Var.f27542w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = iz0Var.getDirection();
        hz0Var.f27263a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = hz0Var.f27264b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    hz0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, hz0Var.f27267f.d()));
                }
            } catch (Exception unused) {
                hz0Var.setImageDrawable(null);
            }
        } else {
            hz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (hz0Var.d != direction) {
            hz0Var.d = direction;
            hz0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new hz0(this.d, this.f26610c.getContext()));
    }
}
