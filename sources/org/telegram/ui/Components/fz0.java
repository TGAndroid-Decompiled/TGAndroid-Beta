package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class fz0 extends im0 {
    public final iz0 f26443c;
    public final iz0 d;

    public fz0(iz0 iz0Var, iz0 iz0Var2) {
        this.d = iz0Var;
        this.f26443c = iz0Var2;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f26443c.f27364w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f26443c.f27364w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        hz0 hz0Var = (hz0) b1Var.f45917a;
        iz0 iz0Var = this.f26443c;
        ArrayList arrayList = iz0Var.f27364w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = iz0Var.getDirection();
        hz0Var.f27013a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = hz0Var.f27014b;
                if (!(drawable instanceof r5) || ((r5) drawable).i() != parseLong) {
                    hz0Var.setImageDrawable(r5.n(UserConfig.selectedAccount, parseLong, null, hz0Var.f27016f.d()));
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new hz0(this.d, this.f26443c.getContext()));
    }
}
