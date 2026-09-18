package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class ly0 extends ll0 {
    public final oy0 f25988c;
    public final oy0 d;

    public ly0(oy0 oy0Var, oy0 oy0Var2) {
        this.d = oy0Var;
        this.f25988c = oy0Var2;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f25988c.f26896w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f25988c.f26896w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        ny0 ny0Var = (ny0) c1Var.f42702a;
        oy0 oy0Var = this.f25988c;
        ArrayList arrayList = oy0Var.f26896w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = oy0Var.getDirection();
        ny0Var.f26562a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = ny0Var.f26563b;
                if (!(drawable instanceof o5) || ((o5) drawable).i() != parseLong) {
                    ny0Var.setImageDrawable(o5.n(UserConfig.selectedAccount, parseLong, null, ny0Var.f26565f.d()));
                }
            } catch (Exception unused) {
                ny0Var.setImageDrawable(null);
            }
        } else {
            ny0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (ny0Var.d != direction) {
            ny0Var.d = direction;
            ny0Var.requestLayout();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new ny0(this.d, this.f25988c.getContext()));
    }
}
