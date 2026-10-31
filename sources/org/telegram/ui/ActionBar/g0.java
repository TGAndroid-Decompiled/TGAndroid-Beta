package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.r80;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hq0;
import org.telegram.ui.tc1;
import org.telegram.ui.y20;
public final class g0 extends ImageView {
    public final int f20333a;
    public final Object f20334b;

    public g0(Object obj, Context context, int i10) {
        super(context);
        this.f20333a = i10;
        this.f20334b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f20333a) {
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
        switch (this.f20333a) {
            case 2:
                super.invalidate();
                y20 y20Var = (y20) this.f20334b;
                y20Var.f31719f0.invalidate();
                y20Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f20333a) {
            case 0:
                t0 t0Var = (t0) this.f20334b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    t0Var.f20847s.setVisibility(4);
                    t0Var.f20847s.setAlpha(0.0f);
                    t0Var.f20847s.setRotation(45.0f);
                    t0Var.f20847s.setScaleX(0.0f);
                    t0Var.f20847s.setScaleY(0.0f);
                    return;
                }
                t0Var.f20847s.setAlpha(1.0f);
                t0Var.f20847s.setRotation(0.0f);
                t0Var.f20847s.setScaleX(1.0f);
                t0Var.f20847s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f20333a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((tc1) this.f20334b).f41808n.getTransformationMethod() != null) {
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
    public void onMeasure(int i10, int i11) {
        switch (this.f20333a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(l.getCurrentActionBarHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f20333a) {
            case 1:
                super.setAlpha(f7);
                ((cq) this.f20334b).f25148y.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f20333a) {
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f20334b;
                ArrayList arrayList = photoViewer.f33497h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((vh.p2) obj).setTranslationY(f7);
                    }
                }
                hq0 hq0Var = photoViewer.f33488g1;
                if (hq0Var != null) {
                    hq0Var.setTranslationY(f7);
                }
                r80 r80Var = photoViewer.f33480f1;
                if (r80Var != null) {
                    r80Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
