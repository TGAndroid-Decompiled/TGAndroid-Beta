package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.z90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fs0;
import org.telegram.ui.vf1;
public final class j0 extends ImageView {
    public final int f21414a;
    public final Object f21415b;

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f21414a = i10;
        this.f21415b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f21414a) {
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
        switch (this.f21414a) {
            case 0:
                u0 u0Var = (u0) this.f21415b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    u0Var.f21752s.setVisibility(4);
                    u0Var.f21752s.setAlpha(0.0f);
                    u0Var.f21752s.setRotation(45.0f);
                    u0Var.f21752s.setScaleX(0.0f);
                    u0Var.f21752s.setScaleY(0.0f);
                    return;
                }
                u0Var.f21752s.setAlpha(1.0f);
                u0Var.f21752s.setRotation(0.0f);
                u0Var.f21752s.setScaleX(1.0f);
                u0Var.f21752s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f21414a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((vf1) this.f21415b).f42239n.getTransformationMethod() != null) {
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
        switch (this.f21414a) {
            case 1:
                super.setAlpha(f7);
                ((wq) this.f21415b).f32201x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f21414a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f21415b;
                ArrayList arrayList = photoViewer.f33299h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ei.x3) obj).setTranslationY(f7);
                    }
                }
                fs0 fs0Var = photoViewer.f33290g1;
                if (fs0Var != null) {
                    fs0Var.setTranslationY(f7);
                }
                z90 z90Var = photoViewer.f33282f1;
                if (z90Var != null) {
                    z90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
