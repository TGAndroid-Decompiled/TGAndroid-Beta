package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class uy0 extends vl0 {
    public final xy0 f28951c;
    public final xy0 d;

    public uy0(xy0 xy0Var, xy0 xy0Var2) {
        this.d = xy0Var;
        this.f28951c = xy0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f28951c.f30437w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f28951c.f30437w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        wy0 wy0Var = (wy0) c1Var.f42961a;
        xy0 xy0Var = this.f28951c;
        ArrayList arrayList = xy0Var.f30437w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = xy0Var.getDirection();
        wy0Var.f30204a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = wy0Var.f30205b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    wy0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, wy0Var.f30207f.d()));
                }
            } catch (Exception unused) {
                wy0Var.setImageDrawable(null);
            }
        } else {
            wy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (wy0Var.d != direction) {
            wy0Var.d = direction;
            wy0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new wy0(this.d, this.f28951c.getContext()));
    }
}
