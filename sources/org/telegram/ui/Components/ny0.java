package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class ny0 extends ql0 {
    public final qy0 f27401c;
    public final qy0 d;

    public ny0(qy0 qy0Var, qy0 qy0Var2) {
        this.d = qy0Var;
        this.f27401c = qy0Var2;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f27401c.f28325w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f27401c.f28325w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        py0 py0Var = (py0) l1Var.f5774a;
        qy0 qy0Var = this.f27401c;
        ArrayList arrayList = qy0Var.f28325w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = qy0Var.getDirection();
        py0Var.f28025a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = py0Var.f28026b;
                if (!(drawable instanceof l5) || ((l5) drawable).i() != parseLong) {
                    py0Var.setImageDrawable(l5.n(UserConfig.selectedAccount, parseLong, null, py0Var.f28028f.d()));
                }
            } catch (Exception unused) {
                py0Var.setImageDrawable(null);
            }
        } else {
            py0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (py0Var.d != direction) {
            py0Var.d = direction;
            py0Var.requestLayout();
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new py0(this.d, this.f27401c.getContext()));
    }
}
