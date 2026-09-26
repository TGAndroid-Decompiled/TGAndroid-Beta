package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class vy0 extends wl0 {
    public final yy0 f29792c;
    public final yy0 d;

    public vy0(yy0 yy0Var, yy0 yy0Var2) {
        this.d = yy0Var;
        this.f29792c = yy0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f29792c.f30738w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f29792c.f30738w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        xy0 xy0Var = (xy0) c1Var.f42959a;
        yy0 yy0Var = this.f29792c;
        ArrayList arrayList = yy0Var.f30738w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = yy0Var.getDirection();
        xy0Var.f30488a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = xy0Var.f30489b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    xy0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, xy0Var.f30491f.d()));
                }
            } catch (Exception unused) {
                xy0Var.setImageDrawable(null);
            }
        } else {
            xy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (xy0Var.d != direction) {
            xy0Var.d = direction;
            xy0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new xy0(this.d, this.f29792c.getContext()));
    }
}
