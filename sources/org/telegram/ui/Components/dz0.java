package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class dz0 extends hm0 {
    public final gz0 f25730c;
    public final gz0 d;

    public dz0(gz0 gz0Var, gz0 gz0Var2) {
        this.d = gz0Var;
        this.f25730c = gz0Var2;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f25730c.f26714w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f25730c.f26714w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        fz0 fz0Var = (fz0) b1Var.f45910a;
        gz0 gz0Var = this.f25730c;
        ArrayList arrayList = gz0Var.f26714w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = gz0Var.getDirection();
        fz0Var.f26411a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = fz0Var.f26412b;
                if (!(drawable instanceof r5) || ((r5) drawable).i() != parseLong) {
                    fz0Var.setImageDrawable(r5.n(UserConfig.selectedAccount, parseLong, null, fz0Var.f26414f.d()));
                }
            } catch (Exception unused) {
                fz0Var.setImageDrawable(null);
            }
        } else {
            fz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (fz0Var.d != direction) {
            fz0Var.d = direction;
            fz0Var.requestLayout();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new fz0(this.d, this.f25730c.getContext()));
    }
}
