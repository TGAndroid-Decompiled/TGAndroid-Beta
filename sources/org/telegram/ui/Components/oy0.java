package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class oy0 extends sl0 {
    public final ry0 f29889c;
    public final ry0 d;

    public oy0(ry0 ry0Var, ry0 ry0Var2) {
        this.d = ry0Var;
        this.f29889c = ry0Var2;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f29889c.f30906w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList = this.f29889c.f30906w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.hashCode();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        qy0 qy0Var = (qy0) m1Var.f5875a;
        ry0 ry0Var = this.f29889c;
        ArrayList arrayList = ry0Var.f30906w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        }
        int direction = ry0Var.getDirection();
        qy0Var.f30529a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = qy0Var.f30530b;
                if (!(drawable instanceof l5) || ((l5) drawable).i() != parseLong) {
                    qy0Var.setImageDrawable(l5.n(UserConfig.selectedAccount, parseLong, null, qy0Var.f30533f.d()));
                }
            } catch (Exception unused) {
                qy0Var.setImageDrawable(null);
            }
        } else {
            qy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (qy0Var.d != direction) {
            qy0Var.d = direction;
            qy0Var.requestLayout();
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new qy0(this.d, this.f29889c.getContext()));
    }
}
