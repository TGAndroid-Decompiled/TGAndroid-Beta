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
    public final org.telegram.ui.Components.o6 f18868a;
    public final View f18869b;
    public final org.telegram.ui.ActionBar.f6 f18870c;

    public a2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        this.f18870c = f6Var;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f18868a = o6Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        o6Var.setGravity(i10);
        o6Var.setImportantForAccessibility(2);
        o6Var.setOnWidthUpdatedListener(new g(this, 2));
        addView(o6Var, w7.a6.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f18869b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        addView(view, w7.a6.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float d = this.f18868a.getDrawable().d() + AndroidUtilities.dp(1.0f);
        boolean z10 = LocaleController.isRTL;
        View view = this.f18869b;
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
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f18870c);
        this.f18868a.setTextColor(v02);
        this.f18869b.getBackground().setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
    }
}
