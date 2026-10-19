package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class ez0 extends hm0 {
    public final hz0 f26051c;
    public final hz0 d;

    public ez0(hz0 hz0Var, hz0 hz0Var2) {
        this.d = hz0Var;
        this.f26051c = hz0Var2;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f26051c.f26961w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f26051c.f26961w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        gz0 gz0Var = (gz0) b1Var.f45910a;
        hz0 hz0Var = this.f26051c;
        ArrayList arrayList = hz0Var.f26961w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = hz0Var.getDirection();
        gz0Var.f26726a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = gz0Var.f26727b;
                if (!(drawable instanceof r5) || ((r5) drawable).i() != parseLong) {
                    gz0Var.setImageDrawable(r5.n(UserConfig.selectedAccount, parseLong, null, gz0Var.f26729f.d()));
                }
            } catch (Exception unused) {
                gz0Var.setImageDrawable(null);
            }
        } else {
            gz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (gz0Var.d != direction) {
            gz0Var.d = direction;
            gz0Var.requestLayout();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new gz0(this.d, this.f26051c.getContext()));
    }
}
