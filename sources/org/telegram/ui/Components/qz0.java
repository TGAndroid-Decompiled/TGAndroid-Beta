package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class qz0 extends lm0 {
    public final tz0 f32064c;
    public final tz0 d;

    public qz0(tz0 tz0Var, tz0 tz0Var2) {
        this.d = tz0Var;
        this.f32064c = tz0Var2;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f32064c.f33182w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f32064c.f33182w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        sz0 sz0Var = (sz0) e1Var.f47735a;
        tz0 tz0Var = this.f32064c;
        ArrayList arrayList = tz0Var.f33182w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = tz0Var.getDirection();
        sz0Var.f32792a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = sz0Var.f32793b;
                if (!(drawable instanceof t5) || ((t5) drawable).i() != parseLong) {
                    sz0Var.setImageDrawable(t5.n(UserConfig.selectedAccount, parseLong, null, sz0Var.f32795f.d()));
                }
            } catch (Exception unused) {
                sz0Var.setImageDrawable(null);
            }
        } else {
            sz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (sz0Var.d != direction) {
            sz0Var.d = direction;
            sz0Var.requestLayout();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new sz0(this.d, this.f32064c.getContext()));
    }
}
