package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.jq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ks0;
import org.telegram.ui.wg1;
public final class l0 extends ImageView {
    public final int f20393a;
    public final Object f20394b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f20393a = i10;
        this.f20394b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f20393a) {
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
        switch (this.f20393a) {
            case 0:
                w0 w0Var = (w0) this.f20394b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f20645s.setVisibility(4);
                    w0Var.f20645s.setAlpha(0.0f);
                    w0Var.f20645s.setRotation(45.0f);
                    w0Var.f20645s.setScaleX(0.0f);
                    w0Var.f20645s.setScaleY(0.0f);
                    return;
                }
                w0Var.f20645s.setAlpha(1.0f);
                w0Var.f20645s.setRotation(0.0f);
                w0Var.f20645s.setScaleX(1.0f);
                w0Var.f20645s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f20393a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z4 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((wg1) this.f20394b).f39692n.getTransformationMethod() != null) {
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
        switch (this.f20393a) {
            case 1:
                super.setAlpha(f10);
                ((jq) this.f20394b).f26033x.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f20393a) {
            case 2:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f20394b;
                ArrayList arrayList = photoViewer.f31707e1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ph.f3) obj).setTranslationY(f10);
                    }
                }
                ks0 ks0Var = photoViewer.f31698d1;
                if (ks0Var != null) {
                    ks0Var.setTranslationY(f10);
                }
                h90 h90Var = photoViewer.f31690c1;
                if (h90Var != null) {
                    h90Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
