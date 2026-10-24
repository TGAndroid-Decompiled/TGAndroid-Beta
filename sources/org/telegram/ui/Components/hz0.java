package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class hz0 extends km0 {
    public final kz0 f27208c;
    public final kz0 d;

    public hz0(kz0 kz0Var, kz0 kz0Var2) {
        this.d = kz0Var;
        this.f27208c = kz0Var2;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f27208c.f28118w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f27208c.f28118w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        jz0 jz0Var = (jz0) b1Var.f46342a;
        kz0 kz0Var = this.f27208c;
        ArrayList arrayList = kz0Var.f28118w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = kz0Var.getDirection();
        jz0Var.f27813a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = jz0Var.f27814b;
                if (!(drawable instanceof p5) || ((p5) drawable).i() != parseLong) {
                    jz0Var.setImageDrawable(p5.n(UserConfig.selectedAccount, parseLong, null, jz0Var.f27816f.d()));
                }
            } catch (Exception unused) {
                jz0Var.setImageDrawable(null);
            }
        } else {
            jz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (jz0Var.d != direction) {
            jz0Var.d = direction;
            jz0Var.requestLayout();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new jz0(this.d, this.f27208c.getContext()));
    }
}
