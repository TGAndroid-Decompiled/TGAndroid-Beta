package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.y70;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xo0;
import org.telegram.ui.z10;
import org.telegram.ui.za1;
public final class f0 extends ImageView {
    public final int f27465a;
    public final Object f27466b;

    public f0(int i7, Context context, Object obj) {
        super(context);
        this.f27465a = i7;
        this.f27466b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27465a) {
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
        switch (this.f27465a) {
            case 2:
                super.invalidate();
                z10 z10Var = (z10) this.f27466b;
                z10Var.f39301f0.invalidate();
                z10Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f27465a) {
            case 0:
                r0 r0Var = (r0) this.f27466b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    r0Var.f28446s.setVisibility(4);
                    r0Var.f28446s.setAlpha(0.0f);
                    r0Var.f28446s.setRotation(45.0f);
                    r0Var.f28446s.setScaleX(0.0f);
                    r0Var.f28446s.setScaleY(0.0f);
                    return;
                }
                r0Var.f28446s.setAlpha(1.0f);
                r0Var.f28446s.setRotation(0.0f);
                r0Var.f28446s.setScaleX(1.0f);
                r0Var.f28446s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27465a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z9 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((za1) this.f27466b).f52511n.getTransformationMethod() != null) {
                    z9 = false;
                }
                accessibilityNodeInfo.setChecked(z9);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f27465a) {
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(k.getCurrentActionBarHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f27465a) {
            case 1:
                super.setAlpha(f10);
                ((vp) this.f27466b).f39698y.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f27465a) {
            case 3:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f27466b;
                ArrayList arrayList = photoViewer.f41413h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((fi.m3) obj).setTranslationY(f10);
                    }
                }
                xo0 xo0Var = photoViewer.f41404g1;
                if (xo0Var != null) {
                    xo0Var.setTranslationY(f10);
                }
                y70 y70Var = photoViewer.f41395f1;
                if (y70Var != null) {
                    y70Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
