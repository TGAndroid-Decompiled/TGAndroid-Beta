package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class xy0 extends yl0 {
    public final az0 f30531c;
    public final az0 d;

    public xy0(az0 az0Var, az0 az0Var2) {
        this.d = az0Var;
        this.f30531c = az0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f30531c.f22755w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f30531c.f22755w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        zy0 zy0Var = (zy0) c1Var.f43068a;
        az0 az0Var = this.f30531c;
        ArrayList arrayList = az0Var.f22755w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = az0Var.getDirection();
        zy0Var.f31086a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = zy0Var.f31087b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    zy0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, zy0Var.f31089f.d()));
                }
            } catch (Exception unused) {
                zy0Var.setImageDrawable(null);
            }
        } else {
            zy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (zy0Var.d != direction) {
            zy0Var.d = direction;
            zy0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new zy0(this.d, this.f30531c.getContext()));
    }
}
