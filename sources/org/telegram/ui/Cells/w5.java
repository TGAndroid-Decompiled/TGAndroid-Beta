package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.kf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wo;
public final class w5 extends FrameLayout {
    public org.telegram.ui.Components.k9 f30743a;
    public FrameLayout f30744b;
    public wo f30745c;
    public TextView d;
    public bi.m5 f30746e;
    public int f30747f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30745c.b(org.telegram.ui.ActionBar.m6.W9, org.telegram.ui.ActionBar.m6.X9, org.telegram.ui.ActionBar.m6.V9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f30747f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30747f, 1073741824));
    }

    public void setImage(gf gfVar) {
        bi.m5 m5Var = this.f30746e;
        org.telegram.ui.Components.k9 k9Var = this.f30743a;
        Drawable drawable = getResources().getDrawable(2131232450);
        String str = gfVar.f26850c;
        int i7 = gfVar.C;
        String str2 = gfVar.I;
        if (str != null) {
            k9Var.h(str, null, drawable);
        } else if (str2 != null) {
            k9Var.s(gfVar.J, gfVar.K, true);
            if (gfVar.d()) {
                m5Var.setVisibility(4);
                setContentDescription(id.M0(2131753962, null));
                k9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            } else if (gfVar.f26849b) {
                m5Var.setVisibility(0);
                this.d.setText(org.telegram.messenger.g0.g0(gfVar.E, false, false));
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
                sb2.append(id.z(gfVar.E));
                setContentDescription(sb2.toString());
                StringBuilder sb3 = new StringBuilder("vthumb://");
                sb3.append(i7);
                k9Var.h(a8.p0.s(sb3, ":", str2), null, drawable);
            } else {
                m5Var.setVisibility(4);
                setContentDescription(id.M0(2131753948, null));
                k9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            }
        } else {
            k9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i7) {
        this.f30745c.setNum(i7);
    }

    public void setImage(kf kfVar) {
        org.telegram.ui.Components.k9 k9Var = this.f30743a;
        Drawable drawable = getResources().getDrawable(2131232450);
        TLRPC.PhotoSize photoSize = kfVar.M;
        if (photoSize != null) {
            k9Var.j(hc.i(photoSize, kfVar.K), null, drawable, kfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = kfVar.L;
        if (photoSize2 != null) {
            k9Var.j(hc.i(photoSize2, kfVar.K), "80_80", drawable, kfVar);
            return;
        }
        String str = kfVar.f26850c;
        if (str != null) {
            k9Var.h(str, null, drawable);
            return;
        }
        String str2 = kfVar.D;
        if (str2 != null && str2.length() > 0) {
            k9Var.h(kfVar.D, null, drawable);
        } else if (ij.W2(kfVar.J)) {
            k9Var.j(hc.c(org.telegram.messenger.w7.w(kfVar.J.thumbs, 320, false, null, false), kfVar.J), null, drawable, kfVar);
        } else {
            k9Var.setImageDrawable(drawable);
        }
    }
}
