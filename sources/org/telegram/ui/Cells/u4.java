package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f23732a;
    public final FrameLayout f23733b;
    public int f23734c;
    public boolean d;

    public u4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f23732a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23733b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
        addView(frameLayout, w7.z5.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        n5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        n5Var.setGravity(17);
        n5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        n5Var.setTextSize(14);
        n5Var.l(LocaleController.getString(R.string.Directions), false);
        n5Var.setLeftDrawable(R.drawable.filled_directions);
        n5Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(n5Var, w7.z5.c(-1.0f, -1));
        frameLayout.setOutlineProvider(zf.j0.f52047b);
        frameLayout.setClipToOutline(true);
        w7.b6.b(frameLayout, 0.02f, 1.2f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(73.0f), 1073741824));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.f23733b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.f23732a);
            FrameLayout frameLayout = this.f23733b;
            if (frameLayout != null) {
                if (w02 == this.f23734c) {
                    if (this.d != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.d = org.telegram.ui.ActionBar.k6.I.q();
                this.f23734c = w02;
                org.telegram.ui.ActionBar.k6.E1(frameLayout.getBackground(), w02, false);
                org.telegram.ui.ActionBar.k6.E1(frameLayout.getBackground(), org.telegram.ui.ActionBar.a6.b(w02), true);
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
