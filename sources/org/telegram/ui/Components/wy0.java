package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class wy0 extends ul0 {
    public final zy0 f28870c;
    public final zy0 d;

    public wy0(zy0 zy0Var, zy0 zy0Var2) {
        this.d = zy0Var;
        this.f28870c = zy0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f28870c.f29839w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f28870c.f29839w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        yy0 yy0Var = (yy0) c1Var.f41610a;
        zy0 zy0Var = this.f28870c;
        ArrayList arrayList = zy0Var.f29839w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = zy0Var.getDirection();
        yy0Var.f29528a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = yy0Var.f29529b;
                if (!(drawable instanceof p5) || ((p5) drawable).i() != parseLong) {
                    yy0Var.setImageDrawable(p5.n(UserConfig.selectedAccount, parseLong, null, yy0Var.f29531f.d()));
                }
            } catch (Exception unused) {
                yy0Var.setImageDrawable(null);
            }
        } else {
            yy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (yy0Var.d != direction) {
            yy0Var.d = direction;
            yy0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new yy0(this.d, this.f28870c.getContext()));
    }
}
