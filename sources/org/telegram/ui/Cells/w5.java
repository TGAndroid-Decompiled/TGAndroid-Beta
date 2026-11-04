package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.bf;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wo;
public final class w5 extends FrameLayout {
    public org.telegram.ui.Components.k9 f30803a;
    public FrameLayout f30804b;
    public wo f30805c;
    public TextView d;
    public ci.t4 f30806e;
    public int f30807f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30805c.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f30807f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30807f, 1073741824));
    }

    public void setImage(ye yeVar) {
        ci.t4 t4Var = this.f30806e;
        org.telegram.ui.Components.k9 k9Var = this.f30803a;
        Drawable drawable = getResources().getDrawable(2131232450);
        String str = yeVar.f25311c;
        int i3 = yeVar.C;
        String str2 = yeVar.I;
        if (str != null) {
            k9Var.h(str, null, drawable);
        } else if (str2 != null) {
            k9Var.s(yeVar.J, yeVar.K, true);
            if (yeVar.d()) {
                t4Var.setVisibility(4);
                setContentDescription(bd.M0(2131753962, null));
                k9Var.h("thumb://" + i3 + ":" + str2, null, drawable);
            } else if (yeVar.f25310b) {
                t4Var.setVisibility(0);
                this.d.setText(org.telegram.messenger.g0.g0(yeVar.E, false, false));
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
                sb2.append(bd.z(yeVar.E));
                setContentDescription(sb2.toString());
                StringBuilder sb3 = new StringBuilder("vthumb://");
                sb3.append(i3);
                k9Var.h(a1.g.s(sb3, ":", str2), null, drawable);
            } else {
                t4Var.setVisibility(4);
                setContentDescription(bd.M0(2131753948, null));
                k9Var.h("thumb://" + i3 + ":" + str2, null, drawable);
            }
        } else {
            k9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i3) {
        this.f30805c.setNum(i3);
    }

    public void setImage(bf bfVar) {
        org.telegram.ui.Components.k9 k9Var = this.f30803a;
        Drawable drawable = getResources().getDrawable(2131232450);
        TLRPC.PhotoSize photoSize = bfVar.M;
        if (photoSize != null) {
            k9Var.j(ac.i(photoSize, bfVar.K), null, drawable, bfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = bfVar.L;
        if (photoSize2 != null) {
            k9Var.j(ac.i(photoSize2, bfVar.K), "80_80", drawable, bfVar);
            return;
        }
        String str = bfVar.f25311c;
        if (str != null) {
            k9Var.h(str, null, drawable);
            return;
        }
        String str2 = bfVar.D;
        if (str2 != null && str2.length() > 0) {
            k9Var.h(bfVar.D, null, drawable);
        } else if (zi.X2(bfVar.J)) {
            k9Var.j(ac.c(org.telegram.messenger.w7.w(bfVar.J.thumbs, 320, false, null, false), bfVar.J), null, drawable, bfVar);
        } else {
            k9Var.setImageDrawable(drawable);
        }
    }
}
