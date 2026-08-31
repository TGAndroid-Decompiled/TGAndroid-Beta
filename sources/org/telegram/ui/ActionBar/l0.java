package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.mq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fs0;
import org.telegram.ui.qg1;
public final class l0 extends ImageView {
    public final int f22062a;
    public final Object f22063b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f22062a = i10;
        this.f22063b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f22062a) {
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
        switch (this.f22062a) {
            case 0:
                w0 w0Var = (w0) this.f22063b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f22366s.setVisibility(4);
                    w0Var.f22366s.setAlpha(0.0f);
                    w0Var.f22366s.setRotation(45.0f);
                    w0Var.f22366s.setScaleX(0.0f);
                    w0Var.f22366s.setScaleY(0.0f);
                    return;
                }
                w0Var.f22366s.setAlpha(1.0f);
                w0Var.f22366s.setRotation(0.0f);
                w0Var.f22366s.setScaleX(1.0f);
                w0Var.f22366s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f22062a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z4 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((qg1) this.f22063b).f40492n.getTransformationMethod() != null) {
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
        switch (this.f22062a) {
            case 1:
                super.setAlpha(f10);
                ((mq) this.f22063b).f29194x.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f22062a) {
            case 2:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f22063b;
                ArrayList arrayList = photoViewer.f34259e1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((qh.f3) obj).setTranslationY(f10);
                    }
                }
                fs0 fs0Var = photoViewer.f34249d1;
                if (fs0Var != null) {
                    fs0Var.setTranslationY(f10);
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
