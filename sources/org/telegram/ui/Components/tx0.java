package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

public final class tx0 extends yk0 {

    public final wx0 f32905c;
    public final wx0 d;

    public tx0(wx0 wx0Var, wx0 wx0Var2) {
        this.d = wx0Var;
        this.f32905c = wx0Var2;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f32905c.f34371w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f32905c.f34371w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        vx0 vx0Var = (vx0) o1Var.f5789a;
        wx0 wx0Var = this.f32905c;
        ArrayList arrayList = wx0Var.f34371w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = wx0Var.getDirection();
        vx0Var.f34063a = str;
        if (str == null || !str.startsWith("animated_")) {
            vx0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long j10 = Long.parseLong(str.substring(9));
                Drawable drawable = vx0Var.f34064b;
                if (!(drawable instanceof k5) || ((k5) drawable).i() != j10) {
                    vx0Var.setImageDrawable(k5.n(UserConfig.selectedAccount, j10, null, vx0Var.f34067f.d()));
                }
            } catch (Exception unused) {
                vx0Var.setImageDrawable(null);
            }
        }
        if (vx0Var.d != direction) {
            vx0Var.d = direction;
            vx0Var.requestLayout();
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new vx0(this.d, this.f32905c.getContext()));
    }
}
