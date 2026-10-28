package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class rz0 extends mm0 {
    public final uz0 f32405c;
    public final uz0 d;

    public rz0(uz0 uz0Var, uz0 uz0Var2) {
        this.d = uz0Var;
        this.f32405c = uz0Var2;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f32405c.f33498w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f32405c.f33498w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        tz0 tz0Var = (tz0) e1Var.f47773a;
        uz0 uz0Var = this.f32405c;
        ArrayList arrayList = uz0Var.f33498w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = uz0Var.getDirection();
        tz0Var.f33170a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = tz0Var.f33171b;
                if (!(drawable instanceof t5) || ((t5) drawable).i() != parseLong) {
                    tz0Var.setImageDrawable(t5.n(UserConfig.selectedAccount, parseLong, null, tz0Var.f33173f.d()));
                }
            } catch (Exception unused) {
                tz0Var.setImageDrawable(null);
            }
        } else {
            tz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (tz0Var.d != direction) {
            tz0Var.d = direction;
            tz0Var.requestLayout();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new tz0(this.d, this.f32405c.getContext()));
    }
}
