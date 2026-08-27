package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public abstract class hz extends FrameLayout {

    public FrameLayout f38912a;

    public org.telegram.ui.ActionBar.h5 f38913b;

    public org.telegram.ui.ActionBar.h5 f38914c;
    public ImageView d;

    public lh.t8 f38915e;

    public cg.q f38916f;
    public cg.q h;

    public TextView f38917n;

    public org.telegram.ui.ActionBar.n2 f38918r;

    public String f38919s;
    public float v;

    public ValueAnimator f38920w;

    public org.telegram.ui.ActionBar.n1 f38921x;

    public float[] f38922y;

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float x8 = 0.0f;
        while (frameLayout != frameLayout2) {
            float y10 = frameLayout.getY() + f10;
            x8 += frameLayout.getX();
            if (frameLayout instanceof ScrollView) {
                y10 -= frameLayout.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout.getParent() instanceof View)) {
                break;
            }
            frameLayout = (View) frameLayout.getParent();
            if (!(frameLayout instanceof ViewGroup)) {
                return;
            }
        }
        float paddingLeft = x8 - frameLayout2.getPaddingLeft();
        float paddingTop = f10 - frameLayout2.getPaddingTop();
        fArr[0] = paddingLeft;
        fArr[1] = paddingTop;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(127.0f), 1073741824));
    }
}
