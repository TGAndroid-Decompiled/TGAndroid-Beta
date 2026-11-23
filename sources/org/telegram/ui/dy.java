package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
public abstract class dy extends FrameLayout {
    public float[] E;
    public FrameLayout f47068a;
    public org.telegram.ui.ActionBar.m5 f47069b;
    public org.telegram.ui.ActionBar.m5 f47070c;
    public ImageView d;
    public cy f47071e;
    public di.xb f47072f;
    public di.xb h;
    public TextView f47073n;
    public org.telegram.ui.ActionBar.g2 f47074r;
    public String f47075s;
    public float f47076w;
    public ValueAnimator f47077x;
    public org.telegram.ui.ActionBar.g1 f47078y;

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y10 = frameLayout3.getY() + f10;
            f11 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y10 -= frameLayout3.getScrollY();
            }
            f10 = y10;
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
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(127.0f), 1073741824));
    }
}
