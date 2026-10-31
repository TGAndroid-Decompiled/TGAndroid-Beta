package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.hf;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ep;
public final class b6 extends FrameLayout {
    public org.telegram.ui.Components.g9 f21727a;
    public FrameLayout f21728b;
    public ep f21729c;
    public TextView d;
    public jg.b1 e;
    public int f21730f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21729c.b(org.telegram.ui.ActionBar.t6.W9, org.telegram.ui.ActionBar.t6.X9, org.telegram.ui.ActionBar.t6.V9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f21730f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f21730f, 1073741824));
    }

    public void setImage(ef efVar) {
        jg.b1 b1Var = this.e;
        org.telegram.ui.Components.g9 g9Var = this.f21727a;
        Drawable drawable = getResources().getDrawable(2131232449);
        String str = efVar.f19508c;
        int i10 = efVar.C;
        String str2 = efVar.I;
        if (str != null) {
            g9Var.h(str, null, drawable);
        } else if (str2 != null) {
            g9Var.s(efVar.J, efVar.K, true);
            if (efVar.d()) {
                b1Var.setVisibility(4);
                setContentDescription(cd.L0(2131753962, null));
                g9Var.h("thumb://" + i10 + ":" + str2, null, drawable);
            } else if (efVar.f19507b) {
                b1Var.setVisibility(0);
                this.d.setText(org.telegram.messenger.i0.g0(efVar.E, false, false));
                StringBuilder sb2 = new StringBuilder();
                z20.q(null, 2131753933, sb2, ", ");
                sb2.append(cd.z(efVar.E));
                setContentDescription(sb2.toString());
                StringBuilder sb3 = new StringBuilder("vthumb://");
                sb3.append(i10);
                g9Var.h(a1.g.r(sb3, ":", str2), null, drawable);
            } else {
                b1Var.setVisibility(4);
                setContentDescription(cd.L0(2131753948, null));
                g9Var.h("thumb://" + i10 + ":" + str2, null, drawable);
            }
        } else {
            g9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i10) {
        this.f21729c.setNum(i10);
    }

    public void setImage(hf hfVar) {
        org.telegram.ui.Components.g9 g9Var = this.f21727a;
        Drawable drawable = getResources().getDrawable(2131232449);
        TLRPC.PhotoSize photoSize = hfVar.M;
        if (photoSize != null) {
            g9Var.j(ic.i(photoSize, hfVar.K), null, drawable, hfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = hfVar.L;
        if (photoSize2 != null) {
            g9Var.j(ic.i(photoSize2, hfVar.K), "80_80", drawable, hfVar);
            return;
        }
        String str = hfVar.f19508c;
        if (str != null) {
            g9Var.h(str, null, drawable);
            return;
        }
        String str2 = hfVar.D;
        if (str2 != null && str2.length() > 0) {
            g9Var.h(hfVar.D, null, drawable);
        } else if (jj.W2(hfVar.J)) {
            g9Var.j(ic.c(org.telegram.messenger.b8.w(hfVar.J.thumbs, 320, false, null, false), hfVar.J), null, drawable, hfVar);
        } else {
            g9Var.setImageDrawable(drawable);
        }
    }
}
