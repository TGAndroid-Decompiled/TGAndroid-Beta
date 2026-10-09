package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class lz0 extends pm0 {
    public final oz0 f28632c;
    public final oz0 d;

    public lz0(oz0 oz0Var, oz0 oz0Var2) {
        this.d = oz0Var;
        this.f28632c = oz0Var2;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f28632c.f29613w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f28632c.f29613w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        nz0 nz0Var = (nz0) d1Var.f47656a;
        oz0 oz0Var = this.f28632c;
        ArrayList arrayList = oz0Var.f29613w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = oz0Var.getDirection();
        nz0Var.f29308a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = nz0Var.f29309b;
                if (!(drawable instanceof s5) || ((s5) drawable).i() != parseLong) {
                    nz0Var.setImageDrawable(s5.n(UserConfig.selectedAccount, parseLong, null, nz0Var.f29312f.d()));
                }
            } catch (Exception unused) {
                nz0Var.setImageDrawable(null);
            }
        } else {
            nz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (nz0Var.d != direction) {
            nz0Var.d = direction;
            nz0Var.requestLayout();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new nz0(this.d, this.f28632c.getContext()));
    }
}
