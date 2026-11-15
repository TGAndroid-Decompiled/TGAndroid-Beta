package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ff;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.jf;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fp;
public final class w5 extends FrameLayout {
    public org.telegram.ui.Components.i9 f31879a;
    public FrameLayout f31880b;
    public fp f31881c;
    public TextView d;
    public di.k4 f31882e;
    public int f31883f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31881c.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f31883f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f31883f, 1073741824));
    }

    public void setImage(ff ffVar) {
        di.k4 k4Var = this.f31882e;
        org.telegram.ui.Components.i9 i9Var = this.f31879a;
        Drawable drawable = getResources().getDrawable(2131232451);
        String str = ffVar.f27709c;
        int i7 = ffVar.C;
        String str2 = ffVar.I;
        if (str != null) {
            i9Var.h(str, null, drawable);
        } else if (str2 != null) {
            i9Var.s(ffVar.J, ffVar.K, true);
            if (ffVar.d()) {
                k4Var.setVisibility(4);
                setContentDescription(hd.M0(2131753962, null));
                i9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            } else if (ffVar.f27708b) {
                k4Var.setVisibility(0);
                this.d.setText(org.telegram.messenger.g0.g0(ffVar.E, false, false));
                StringBuilder sb2 = new StringBuilder();
                y0.r(null, 2131753933, sb2, ", ");
                sb2.append(hd.z(ffVar.E));
                setContentDescription(sb2.toString());
                StringBuilder sb3 = new StringBuilder("vthumb://");
                sb3.append(i7);
                i9Var.h(a8.p0.s(sb3, ":", str2), null, drawable);
            } else {
                k4Var.setVisibility(4);
                setContentDescription(hd.M0(2131753948, null));
                i9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            }
        } else {
            i9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i7) {
        this.f31881c.setNum(i7);
    }

    public void setImage(jf jfVar) {
        org.telegram.ui.Components.i9 i9Var = this.f31879a;
        Drawable drawable = getResources().getDrawable(2131232451);
        TLRPC.PhotoSize photoSize = jfVar.M;
        if (photoSize != null) {
            i9Var.j(gc.i(photoSize, jfVar.K), null, drawable, jfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = jfVar.L;
        if (photoSize2 != null) {
            i9Var.j(gc.i(photoSize2, jfVar.K), "80_80", drawable, jfVar);
            return;
        }
        String str = jfVar.f27709c;
        if (str != null) {
            i9Var.h(str, null, drawable);
            return;
        }
        String str2 = jfVar.D;
        if (str2 != null && str2.length() > 0) {
            i9Var.h(jfVar.D, null, drawable);
        } else if (gj.W2(jfVar.J)) {
            i9Var.j(gc.c(org.telegram.messenger.w7.w(jfVar.J.thumbs, 320, false, null, false), jfVar.J), null, drawable, jfVar);
        } else {
            i9Var.setImageDrawable(drawable);
        }
    }
}
