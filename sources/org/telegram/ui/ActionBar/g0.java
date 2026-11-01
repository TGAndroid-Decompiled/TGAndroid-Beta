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
import org.telegram.ui.fq0;
import org.telegram.ui.rc1;
import org.telegram.ui.x20;
public final class g0 extends ImageView {
    public final int f20334a;
    public final Object f20335b;

    public g0(Object obj, Context context, int i10) {
        super(context);
        this.f20334a = i10;
        this.f20335b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f20334a) {
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
        switch (this.f20334a) {
            case 2:
                super.invalidate();
                x20 x20Var = (x20) this.f20335b;
                x20Var.f31799f0.invalidate();
                x20Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f20334a) {
            case 0:
                t0 t0Var = (t0) this.f20335b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    t0Var.f20848s.setVisibility(4);
                    t0Var.f20848s.setAlpha(0.0f);
                    t0Var.f20848s.setRotation(45.0f);
                    t0Var.f20848s.setScaleX(0.0f);
                    t0Var.f20848s.setScaleY(0.0f);
                    return;
                }
                t0Var.f20848s.setAlpha(1.0f);
                t0Var.f20848s.setRotation(0.0f);
                t0Var.f20848s.setScaleX(1.0f);
                t0Var.f20848s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f20334a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((rc1) this.f20335b).f41051n.getTransformationMethod() != null) {
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
        switch (this.f20334a) {
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
        switch (this.f20334a) {
            case 1:
                super.setAlpha(f7);
                ((cq) this.f20335b).f25225y.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f20334a) {
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f20335b;
                ArrayList arrayList = photoViewer.f33504h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((vh.p2) obj).setTranslationY(f7);
                    }
                }
                fq0 fq0Var = photoViewer.f33495g1;
                if (fq0Var != null) {
                    fq0Var.setTranslationY(f7);
                }
                r80 r80Var = photoViewer.f33487f1;
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
