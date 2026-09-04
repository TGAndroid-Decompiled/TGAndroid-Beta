package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a2 extends FrameLayout {
    public final org.telegram.ui.Components.q6 f21597a;
    public final View f21598b;
    public final org.telegram.ui.ActionBar.f6 f21599c;

    public a2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        this.f21599c = f6Var;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.f21597a = q6Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        q6Var.setGravity(i10);
        q6Var.setImportantForAccessibility(2);
        q6Var.setOnWidthUpdatedListener(new g(this, 2));
        addView(q6Var, w7.x5.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f21598b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        addView(view, w7.x5.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float d = this.f21597a.getDrawable().d() + AndroidUtilities.dp(1.0f);
        boolean z10 = LocaleController.isRTL;
        View view = this.f21598b;
        if (z10) {
            view.setTranslationX(-d);
        } else {
            view.setTranslationX(d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), 1073741824));
        a();
    }

    public void setColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f21599c);
        this.f21597a.setTextColor(v02);
        this.f21598b.getBackground().setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
    }
}
