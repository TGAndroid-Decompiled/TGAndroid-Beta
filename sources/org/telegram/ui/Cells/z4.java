package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gb1;
public final class z4 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f25785a;
    public final FrameLayout f25786b;
    public int f25787c;
    public boolean d;

    public z4(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f25785a = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25786b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var)));
        addView(frameLayout, gb1.h(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        b6Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        b6Var.setGravity(17);
        b6Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        b6Var.setTextSize(14);
        b6Var.l(LocaleController.getString(R.string.Directions), false);
        b6Var.setLeftDrawable(R.drawable.filled_directions);
        b6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(b6Var, gb1.g(-1.0f, -1));
        frameLayout.setOutlineProvider(ag.z0.f1401b);
        frameLayout.setClipToOutline(true);
        gb1.c(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.f25786b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f25785a);
            FrameLayout frameLayout = this.f25786b;
            if (frameLayout != null) {
                if (w02 == this.f25787c) {
                    if (this.d != org.telegram.ui.ActionBar.y6.I.q()) {
                    }
                }
                this.d = org.telegram.ui.ActionBar.y6.I.q();
                this.f25787c = w02;
                org.telegram.ui.ActionBar.y6.E1(frameLayout.getBackground(), w02, false);
                org.telegram.ui.ActionBar.y6.E1(frameLayout.getBackground(), org.telegram.ui.ActionBar.o6.b(w02), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
