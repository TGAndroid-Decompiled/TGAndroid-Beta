package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
public abstract class ay extends FrameLayout {
    public float[] D;
    public FrameLayout f43816a;
    public org.telegram.ui.ActionBar.l5 f43817b;
    public org.telegram.ui.ActionBar.l5 f43818c;
    public ImageView d;
    public zx f43819e;
    public bi.md f43820f;
    public bi.md h;
    public TextView f43821n;
    public org.telegram.ui.ActionBar.f2 f43822r;
    public String f43823s;
    public float f43824w;
    public ValueAnimator f43825x;
    public org.telegram.ui.ActionBar.g1 f43826y;

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
            boolean z9 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z9) {
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
