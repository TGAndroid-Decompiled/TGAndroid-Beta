package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
public abstract class az extends FrameLayout {
    public float[] D;
    public FrameLayout f35860a;
    public org.telegram.ui.ActionBar.u5 f35861b;
    public org.telegram.ui.ActionBar.u5 f35862c;
    public ImageView d;
    public zy e;
    public ag.j3 f35863f;
    public ag.j3 h;
    public TextView f35864n;
    public org.telegram.ui.ActionBar.k2 f35865r;
    public String f35866s;
    public float f35867w;
    public ValueAnimator f35868x;
    public org.telegram.ui.ActionBar.k1 f35869y;

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f7 = 0.0f;
        float f10 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y3 = frameLayout3.getY() + f7;
            f10 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y3 -= frameLayout3.getScrollY();
            }
            f7 = y3;
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
        fArr[1] = f7 - frameLayout2.getPaddingTop();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(127.0f), 1073741824));
    }
}
