package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.mq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ks0;
import org.telegram.ui.vg1;
public final class l0 extends ImageView {
    public final int f22064a;
    public final Object f22065b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f22064a = i10;
        this.f22065b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f22064a) {
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
        switch (this.f22064a) {
            case 0:
                w0 w0Var = (w0) this.f22065b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f22368s.setVisibility(4);
                    w0Var.f22368s.setAlpha(0.0f);
                    w0Var.f22368s.setRotation(45.0f);
                    w0Var.f22368s.setScaleX(0.0f);
                    w0Var.f22368s.setScaleY(0.0f);
                    return;
                }
                w0Var.f22368s.setAlpha(1.0f);
                w0Var.f22368s.setRotation(0.0f);
                w0Var.f22368s.setScaleX(1.0f);
                w0Var.f22368s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f22064a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z4 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((vg1) this.f22065b).f42122n.getTransformationMethod() != null) {
                    z4 = false;
                }
                accessibilityNodeInfo.setChecked(z4);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f22064a) {
            case 1:
                super.setAlpha(f10);
                ((mq) this.f22065b).f29235x.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f22064a) {
            case 2:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f22065b;
                ArrayList arrayList = photoViewer.f34259e1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((qh.e3) obj).setTranslationY(f10);
                    }
                }
                ks0 ks0Var = photoViewer.f34249d1;
                if (ks0Var != null) {
                    ks0Var.setTranslationY(f10);
                }
                i90 i90Var = photoViewer.f34241c1;
                if (i90Var != null) {
                    i90Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
