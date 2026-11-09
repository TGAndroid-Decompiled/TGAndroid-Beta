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
    public org.telegram.ui.Components.l9 f30732a;
    public FrameLayout f30733b;
    public wo f30734c;
    public TextView d;
    public bi.m5 f30735e;
    public int f30736f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30734c.b(org.telegram.ui.ActionBar.l6.W9, org.telegram.ui.ActionBar.l6.X9, org.telegram.ui.ActionBar.l6.V9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f30736f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30736f, 1073741824));
    }

    public void setImage(gf gfVar) {
        bi.m5 m5Var = this.f30735e;
        org.telegram.ui.Components.l9 l9Var = this.f30732a;
        Drawable drawable = getResources().getDrawable(2131232450);
        String str = gfVar.f26846c;
        int i7 = gfVar.C;
        String str2 = gfVar.I;
        if (str != null) {
            l9Var.h(str, null, drawable);
        } else if (str2 != null) {
            l9Var.s(gfVar.J, gfVar.K, true);
            if (gfVar.d()) {
                m5Var.setVisibility(4);
                setContentDescription(id.M0(2131753962, null));
                l9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            } else if (gfVar.f26845b) {
                m5Var.setVisibility(0);
                this.d.setText(org.telegram.messenger.g0.g0(gfVar.E, false, false));
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753933, sb2, ", ");
                sb2.append(id.z(gfVar.E));
                setContentDescription(sb2.toString());
                StringBuilder sb3 = new StringBuilder("vthumb://");
                sb3.append(i7);
                l9Var.h(a8.p0.s(sb3, ":", str2), null, drawable);
            } else {
                m5Var.setVisibility(4);
                setContentDescription(id.M0(2131753948, null));
                l9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            }
        } else {
            l9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i7) {
        this.f30734c.setNum(i7);
    }

    public void setImage(kf kfVar) {
        org.telegram.ui.Components.l9 l9Var = this.f30732a;
        Drawable drawable = getResources().getDrawable(2131232450);
        TLRPC.PhotoSize photoSize = kfVar.M;
        if (photoSize != null) {
            l9Var.j(hc.i(photoSize, kfVar.K), null, drawable, kfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = kfVar.L;
        if (photoSize2 != null) {
            l9Var.j(hc.i(photoSize2, kfVar.K), "80_80", drawable, kfVar);
            return;
        }
        String str = kfVar.f26846c;
        if (str != null) {
            l9Var.h(str, null, drawable);
            return;
        }
        String str2 = kfVar.D;
        if (str2 != null && str2.length() > 0) {
            l9Var.h(kfVar.D, null, drawable);
        } else if (ij.W2(kfVar.J)) {
            l9Var.j(hc.c(org.telegram.messenger.w7.w(kfVar.J.thumbs, 320, false, null, false), kfVar.J), null, drawable, kfVar);
        } else {
            l9Var.setImageDrawable(drawable);
        }
    }
}
