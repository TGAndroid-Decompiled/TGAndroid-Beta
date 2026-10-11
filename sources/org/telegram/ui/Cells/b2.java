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
public final class b2 extends FrameLayout {
    public final org.telegram.ui.Components.r6 f21859a;
    public final View f21860b;
    public final org.telegram.ui.ActionBar.d6 f21861c;

    public b2(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        this.f21861c = d6Var;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, false, false);
        this.f21859a = r6Var;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        r6Var.setGravity(i10);
        r6Var.setImportantForAccessibility(2);
        r6Var.setOnWidthUpdatedListener(new g(this, 2));
        addView(r6Var, w7.x5.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f21860b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        addView(view, w7.x5.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.f21859a.getDrawable().c() + AndroidUtilities.dp(1.0f);
        boolean z10 = LocaleController.isRTL;
        View view = this.f21860b;
        if (z10) {
            view.setTranslationX(-c10);
        } else {
            view.setTranslationX(c10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), 1073741824));
        a();
    }

    public void setColor(int i10) {
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, this.f21861c);
        this.f21859a.setTextColor(w02);
        this.f21860b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
