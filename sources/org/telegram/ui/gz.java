package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public abstract class gz extends FrameLayout {
    public FrameLayout f38693a;
    public org.telegram.ui.ActionBar.h5 f38694b;
    public org.telegram.ui.ActionBar.h5 f38695c;
    public ImageView d;
    public nh.i8 f38696e;
    public eg.r f38697f;
    public eg.r h;
    public TextView f38698n;
    public org.telegram.ui.ActionBar.o2 f38699r;
    public String f38700s;
    public float v;
    public ValueAnimator f38701w;
    public org.telegram.ui.ActionBar.o1 f38702x;
    public float[] f38703y;

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f9 = 0.0f;
        float f10 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y8 = frameLayout3.getY() + f9;
            f10 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y8 -= frameLayout3.getScrollY();
            }
            f9 = y8;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r32 = (View) frameLayout3.getParent();
            boolean z10 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z10) {
                return;
            }
        }
        fArr[0] = f10 - frameLayout2.getPaddingLeft();
        fArr[1] = f9 - frameLayout2.getPaddingTop();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(127.0f), 1073741824));
    }
}
