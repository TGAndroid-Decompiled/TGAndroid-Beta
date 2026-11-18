package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ef;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.hf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mp;
public final class x5 extends FrameLayout {
    public org.telegram.ui.Components.q9 f32418a;
    public FrameLayout f32419b;
    public mp f32420c;
    public TextView d;
    public di.n4 f32421e;
    public int f32422f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32420c.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f32422f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32422f, 1073741824));
    }

    public void setImage(ef efVar) {
        di.n4 n4Var = this.f32421e;
        org.telegram.ui.Components.q9 q9Var = this.f32418a;
        Drawable drawable = getResources().getDrawable(2131232452);
        String str = efVar.f27850c;
        int i7 = efVar.C;
        String str2 = efVar.I;
        if (str != null) {
            q9Var.h(str, null, drawable);
        } else if (str2 != null) {
            q9Var.s(efVar.J, efVar.K, true);
            if (efVar.d()) {
                n4Var.setVisibility(4);
                setContentDescription(gd.M0(2131753960, null));
                q9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            } else if (efVar.f27849b) {
                n4Var.setVisibility(0);
                this.d.setText(org.telegram.messenger.g0.g0(efVar.E, false, false));
                StringBuilder sb2 = new StringBuilder();
                c0.u(null, 2131753931, sb2, ", ");
                sb2.append(gd.z(efVar.E));
                setContentDescription(sb2.toString());
                StringBuilder sb3 = new StringBuilder("vthumb://");
                sb3.append(i7);
                q9Var.h(a8.p0.s(sb3, ":", str2), null, drawable);
            } else {
                n4Var.setVisibility(4);
                setContentDescription(gd.M0(2131753946, null));
                q9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            }
        } else {
            q9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i7) {
        this.f32420c.setNum(i7);
    }

    public void setImage(hf hfVar) {
        org.telegram.ui.Components.q9 q9Var = this.f32418a;
        Drawable drawable = getResources().getDrawable(2131232452);
        TLRPC.PhotoSize photoSize = hfVar.M;
        if (photoSize != null) {
            q9Var.j(fc.i(photoSize, hfVar.K), null, drawable, hfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = hfVar.L;
        if (photoSize2 != null) {
            q9Var.j(fc.i(photoSize2, hfVar.K), "80_80", drawable, hfVar);
            return;
        }
        String str = hfVar.f27850c;
        if (str != null) {
            q9Var.h(str, null, drawable);
            return;
        }
        String str2 = hfVar.D;
        if (str2 != null && str2.length() > 0) {
            q9Var.h(hfVar.D, null, drawable);
        } else if (fj.W2(hfVar.J)) {
            q9Var.j(fc.c(org.telegram.messenger.w7.w(hfVar.J.thumbs, 320, false, null, false), hfVar.J), null, drawable, hfVar);
        } else {
            q9Var.setImageDrawable(drawable);
        }
    }
}
