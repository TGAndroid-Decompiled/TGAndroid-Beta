package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class iz0 extends lm0 {
    public final lz0 f25830c;
    public final lz0 d;

    public iz0(lz0 lz0Var, lz0 lz0Var2) {
        this.d = lz0Var;
        this.f25830c = lz0Var2;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f25830c.f26858w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f25830c.f26858w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        kz0 kz0Var = (kz0) b1Var.f44838a;
        lz0 lz0Var = this.f25830c;
        ArrayList arrayList = lz0Var.f26858w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = lz0Var.getDirection();
        kz0Var.f26508a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = kz0Var.f26509b;
                if (!(drawable instanceof s5) || ((s5) drawable).i() != parseLong) {
                    kz0Var.setImageDrawable(s5.n(UserConfig.selectedAccount, parseLong, null, kz0Var.f26511f.d()));
                }
            } catch (Exception unused) {
                kz0Var.setImageDrawable(null);
            }
        } else {
            kz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (kz0Var.d != direction) {
            kz0Var.d = direction;
            kz0Var.requestLayout();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new kz0(this.d, this.f25830c.getContext()));
    }
}
