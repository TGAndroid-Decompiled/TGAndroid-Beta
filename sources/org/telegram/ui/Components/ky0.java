package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class ky0 extends kl0 {
    public final ny0 f25693c;
    public final ny0 d;

    public ky0(ny0 ny0Var, ny0 ny0Var2) {
        this.d = ny0Var;
        this.f25693c = ny0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f25693c.f26625w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f25693c.f26625w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        my0 my0Var = (my0) c1Var.f42675a;
        ny0 ny0Var = this.f25693c;
        ArrayList arrayList = ny0Var.f26625w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = ny0Var.getDirection();
        my0Var.f26259a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = my0Var.f26260b;
                if (!(drawable instanceof o5) || ((o5) drawable).i() != parseLong) {
                    my0Var.setImageDrawable(o5.n(UserConfig.selectedAccount, parseLong, null, my0Var.f26262f.d()));
                }
            } catch (Exception unused) {
                my0Var.setImageDrawable(null);
            }
        } else {
            my0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (my0Var.d != direction) {
            my0Var.d = direction;
            my0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new my0(this.d, this.f25693c.getContext()));
    }
}
