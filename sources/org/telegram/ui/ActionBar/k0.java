package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.lq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hh1;
import org.telegram.ui.ys0;
public final class k0 extends ImageView {
    public final int f21155a;
    public final Object f21156b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f21155a = i10;
        this.f21156b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f21155a) {
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
    public void onDetachedFromWindow() {
        switch (this.f21155a) {
            case 0:
                v0 v0Var = (v0) this.f21156b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    v0Var.f21428s.setVisibility(4);
                    v0Var.f21428s.setAlpha(0.0f);
                    v0Var.f21428s.setRotation(45.0f);
                    v0Var.f21428s.setScaleX(0.0f);
                    v0Var.f21428s.setScaleY(0.0f);
                    return;
                }
                v0Var.f21428s.setAlpha(1.0f);
                v0Var.f21428s.setRotation(0.0f);
                v0Var.f21428s.setScaleX(1.0f);
                v0Var.f21428s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f21155a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((hh1) this.f21156b).f37045n.getTransformationMethod() != null) {
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
    public void setAlpha(float f7) {
        switch (this.f21155a) {
            case 1:
                super.setAlpha(f7);
                ((lq) this.f21156b).f28317x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f21155a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f21156b;
                ArrayList arrayList = photoViewer.f33604h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((di.f4) obj).setTranslationY(f7);
                    }
                }
                ys0 ys0Var = photoViewer.f33595g1;
                if (ys0Var != null) {
                    ys0Var.setTranslationY(f7);
                }
                f90 f90Var = photoViewer.f33587f1;
                if (f90Var != null) {
                    f90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
