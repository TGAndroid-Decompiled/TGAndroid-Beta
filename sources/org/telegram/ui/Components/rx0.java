package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
public final class rx0 extends vk0 {
    public final ux0 f32300c;
    public final ux0 d;

    public rx0(ux0 ux0Var, ux0 ux0Var2) {
        this.d = ux0Var;
        this.f32300c = ux0Var2;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f32300c.f33166w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final long i(int i9) {
        ArrayList arrayList = this.f32300c.f33166w;
        if (arrayList == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.hashCode();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        tx0 tx0Var = (tx0) q1Var.f5501a;
        ux0 ux0Var = this.f32300c;
        ArrayList arrayList = ux0Var.f33166w;
        if (arrayList == null) {
            str = null;
        } else {
            str = ((MediaDataController.KeywordResult) arrayList.get(i9)).emoji;
        }
        int direction = ux0Var.getDirection();
        tx0Var.f32830a = str;
        if (str != null && str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = tx0Var.f32831b;
                if (!(drawable instanceof k5) || ((k5) drawable).i() != parseLong) {
                    tx0Var.setImageDrawable(k5.n(UserConfig.selectedAccount, parseLong, null, tx0Var.f32834f.d()));
                }
            } catch (Exception unused) {
                tx0Var.setImageDrawable(null);
            }
        } else {
            tx0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        }
        if (tx0Var.d != direction) {
            tx0Var.d = direction;
            tx0Var.requestLayout();
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new tx0(this.d, this.f32300c.getContext()));
    }
}
