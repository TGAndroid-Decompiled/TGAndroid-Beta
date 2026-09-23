package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class jy0 extends ll0 {
    public final my0 f25439c;
    public final my0 d;

    public jy0(my0 my0Var, my0 my0Var2) {
        this.d = my0Var;
        this.f25439c = my0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f25439c.f26299w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f25439c.f26299w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        ly0 ly0Var = (ly0) c1Var.f42627a;
        my0 my0Var = this.f25439c;
        ArrayList arrayList = my0Var.f26299w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = my0Var.getDirection();
        ly0Var.f25955a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = ly0Var.f25956b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    ly0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, ly0Var.f25958f.d()));
                }
            } catch (Exception unused) {
                ly0Var.setImageDrawable(null);
            }
        } else {
            ly0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (ly0Var.d != direction) {
            ly0Var.d = direction;
            ly0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new ly0(this.d, this.f25439c.getContext()));
    }
}
