package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.rs0;
import org.telegram.ui.zg1;
public final class j0 extends ImageView {
    public final int f19471a;
    public final Object f19472b;

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f19471a = i10;
        this.f19472b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f19471a) {
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
        switch (this.f19471a) {
            case 0:
                u0 u0Var = (u0) this.f19472b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    u0Var.f19795s.setVisibility(4);
                    u0Var.f19795s.setAlpha(0.0f);
                    u0Var.f19795s.setRotation(45.0f);
                    u0Var.f19795s.setScaleX(0.0f);
                    u0Var.f19795s.setScaleY(0.0f);
                    return;
                }
                u0Var.f19795s.setAlpha(1.0f);
                u0Var.f19795s.setRotation(0.0f);
                u0Var.f19795s.setScaleX(1.0f);
                u0Var.f19795s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f19471a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((zg1) this.f19472b).f40468n.getTransformationMethod() != null) {
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
        switch (this.f19471a) {
            case 1:
                super.setAlpha(f7);
                ((nq) this.f19472b).f26777x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f19471a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f19472b;
                ArrayList arrayList = photoViewer.f31236h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.e4) obj).setTranslationY(f7);
                    }
                }
                rs0 rs0Var = photoViewer.f31227g1;
                if (rs0Var != null) {
                    rs0Var.setTranslationY(f7);
                }
                p90 p90Var = photoViewer.f31219f1;
                if (p90Var != null) {
                    p90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
