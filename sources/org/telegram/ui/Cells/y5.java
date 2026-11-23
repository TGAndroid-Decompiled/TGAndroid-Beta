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
import org.telegram.ui.Components.op;
public final class y5 extends FrameLayout {
    public org.telegram.ui.Components.q9 f32496a;
    public FrameLayout f32497b;
    public op f32498c;
    public TextView d;
    public di.n4 f32499e;
    public int f32500f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32498c.b(org.telegram.ui.ActionBar.m6.W9, org.telegram.ui.ActionBar.m6.X9, org.telegram.ui.ActionBar.m6.V9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f32500f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32500f, 1073741824));
    }

    public void setImage(ff ffVar) {
        di.n4 n4Var = this.f32499e;
        org.telegram.ui.Components.q9 q9Var = this.f32496a;
        Drawable drawable = getResources().getDrawable(2131232452);
        String str = ffVar.f28060c;
        int i7 = ffVar.C;
        String str2 = ffVar.I;
        if (str != null) {
            q9Var.h(str, null, drawable);
        } else if (str2 != null) {
            q9Var.s(ffVar.J, ffVar.K, true);
            if (ffVar.d()) {
                n4Var.setVisibility(4);
                setContentDescription(hd.N0(2131753959, null));
                q9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            } else if (ffVar.f28059b) {
                n4Var.setVisibility(0);
                this.d.setText(org.telegram.messenger.g0.g0(ffVar.E, false, false));
                StringBuilder sb2 = new StringBuilder();
                c0.u(null, 2131753930, sb2, ", ");
                sb2.append(hd.z(ffVar.E));
                setContentDescription(sb2.toString());
                StringBuilder sb3 = new StringBuilder("vthumb://");
                sb3.append(i7);
                q9Var.h(a8.p0.s(sb3, ":", str2), null, drawable);
            } else {
                n4Var.setVisibility(4);
                setContentDescription(hd.N0(2131753945, null));
                q9Var.h("thumb://" + i7 + ":" + str2, null, drawable);
            }
        } else {
            q9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i7) {
        this.f32498c.setNum(i7);
    }

    public void setImage(jf jfVar) {
        org.telegram.ui.Components.q9 q9Var = this.f32496a;
        Drawable drawable = getResources().getDrawable(2131232452);
        TLRPC.PhotoSize photoSize = jfVar.M;
        if (photoSize != null) {
            q9Var.j(gc.i(photoSize, jfVar.K), null, drawable, jfVar);
            return;
        }
        TLRPC.PhotoSize photoSize2 = jfVar.L;
        if (photoSize2 != null) {
            q9Var.j(gc.i(photoSize2, jfVar.K), "80_80", drawable, jfVar);
            return;
        }
        String str = jfVar.f28060c;
        if (str != null) {
            q9Var.h(str, null, drawable);
            return;
        }
        String str2 = jfVar.D;
        if (str2 != null && str2.length() > 0) {
            q9Var.h(jfVar.D, null, drawable);
        } else if (gj.W2(jfVar.J)) {
            q9Var.j(gc.c(org.telegram.messenger.w7.w(jfVar.J.thumbs, 320, false, null, false), jfVar.J), null, drawable, jfVar);
        } else {
            q9Var.setImageDrawable(drawable);
        }
    }
}
