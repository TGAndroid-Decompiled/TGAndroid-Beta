package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class qb extends ta {
    public final ei0 f29622a;
    public final f6 f29623b;
    public final f6 f29624c;
    public final int d;

    public qb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
        ?? imageView = new ImageView(context);
        this.f29622a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.b6.h(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.t6.uj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        f6 f6Var = new f6(context, true, true, true);
        this.f29623b = f6Var;
        f6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.Z(f6Var, i10, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setEllipsizeByGradient(true);
        linearLayout.addView(f6Var, w7.b6.o(-1, 20));
        f6 f6Var2 = new f6(context, true, true, true);
        this.f29624c = f6Var2;
        f6Var2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i10, p6Var);
        f6Var2.setTypeface(Typeface.SANS_SERIF);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(f6Var2, w7.b6.o(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        ei0 ei0Var = this.f29622a;
        ei0Var.f(2131624224, 32, 32, null);
        for (String str : strArr) {
            ei0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f29623b.getText()) + ".\n" + ((Object) this.f29624c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f29622a.d();
    }
}
