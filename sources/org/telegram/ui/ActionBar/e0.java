package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vp;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.oo0;
import org.telegram.ui.ra1;
import org.telegram.ui.u10;
public final class e0 extends ImageView {
    public final int f27469a;
    public final Object f27470b;

    public e0(int i3, Context context, Object obj) {
        super(context);
        this.f27469a = i3;
        this.f27470b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27469a) {
            case 0:
                getBackground().draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f27469a) {
            case 2:
                super.invalidate();
                u10 u10Var = (u10) this.f27470b;
                u10Var.f39679g0.invalidate();
                u10Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f27469a) {
            case 0:
                q0 q0Var = (q0) this.f27470b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    q0Var.f28462s.setVisibility(4);
                    q0Var.f28462s.setAlpha(0.0f);
                    q0Var.f28462s.setRotation(45.0f);
                    q0Var.f28462s.setScaleX(0.0f);
                    q0Var.f28462s.setScaleY(0.0f);
                    return;
                }
                q0Var.f28462s.setAlpha(1.0f);
                q0Var.f28462s.setRotation(0.0f);
                q0Var.f28462s.setScaleX(1.0f);
                q0Var.f28462s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27469a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((ra1) this.f27470b).f49169n.getTransformationMethod() != null) {
                    z10 = false;
                }
                accessibilityNodeInfo.setChecked(z10);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f27469a) {
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(k.getCurrentActionBarHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f27469a) {
            case 1:
                super.setAlpha(f10);
                ((vp) this.f27470b).f39765y.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f27469a) {
            case 3:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f27470b;
                ArrayList arrayList = photoViewer.f41446i1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((gi.l3) obj).setTranslationY(f10);
                    }
                }
                oo0 oo0Var = photoViewer.f41438h1;
                if (oo0Var != null) {
                    oo0Var.setTranslationY(f10);
                }
                u70 u70Var = photoViewer.f41430g1;
                if (u70Var != null) {
                    u70Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
