package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class cy0 extends il0 {
    public final fy0 f27587c;
    public final fy0 d;

    public cy0(fy0 fy0Var, fy0 fy0Var2) {
        this.d = fy0Var;
        this.f27587c = fy0Var2;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f27587c.f28571w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f27587c.f28571w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        ey0 ey0Var = (ey0) n1Var.f6432a;
        fy0 fy0Var = this.f27587c;
        ArrayList arrayList = fy0Var.f28571w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = fy0Var.getDirection();
        ey0Var.f28204a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = ey0Var.f28205b;
                if (!(drawable instanceof p5) || ((p5) drawable).i() != parseLong) {
                    ey0Var.setImageDrawable(p5.n(UserConfig.selectedAccount, parseLong, null, ey0Var.f28208f.d()));
                }
            } catch (Exception unused) {
                ey0Var.setImageDrawable(null);
            }
        } else {
            ey0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (ey0Var.d != direction) {
            ey0Var.d = direction;
            ey0Var.requestLayout();
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new ey0(this.d, this.f27587c.getContext()));
    }
}
