package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.r90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.us0;
import org.telegram.ui.zg1;
public final class l0 extends ImageView {
    public final int f19599a;
    public final Object f19600b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f19599a = i10;
        this.f19600b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f19599a) {
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
        switch (this.f19599a) {
            case 0:
                w0 w0Var = (w0) this.f19600b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f19859s.setVisibility(4);
                    w0Var.f19859s.setAlpha(0.0f);
                    w0Var.f19859s.setRotation(45.0f);
                    w0Var.f19859s.setScaleX(0.0f);
                    w0Var.f19859s.setScaleY(0.0f);
                    return;
                }
                w0Var.f19859s.setAlpha(1.0f);
                w0Var.f19859s.setRotation(0.0f);
                w0Var.f19859s.setScaleX(1.0f);
                w0Var.f19859s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f19599a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((zg1) this.f19600b).f40518n.getTransformationMethod() != null) {
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
        switch (this.f19599a) {
            case 1:
                super.setAlpha(f7);
                ((oq) this.f19600b).f27193x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f19599a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f19600b;
                ArrayList arrayList = photoViewer.f31252h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.e4) obj).setTranslationY(f7);
                    }
                }
                us0 us0Var = photoViewer.f31243g1;
                if (us0Var != null) {
                    us0Var.setTranslationY(f7);
                }
                r90 r90Var = photoViewer.f31235f1;
                if (r90Var != null) {
                    r90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
