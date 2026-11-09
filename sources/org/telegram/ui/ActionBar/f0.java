package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.z70;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b20;
import org.telegram.ui.bb1;
import org.telegram.ui.zo0;
public final class f0 extends ImageView {
    public final int f27464a;
    public final Object f27465b;

    public f0(int i7, Context context, Object obj) {
        super(context);
        this.f27464a = i7;
        this.f27465b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27464a) {
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
        switch (this.f27464a) {
            case 2:
                super.invalidate();
                b20 b20Var = (b20) this.f27465b;
                b20Var.f39390f0.invalidate();
                b20Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f27464a) {
            case 0:
                r0 r0Var = (r0) this.f27465b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    r0Var.f28447s.setVisibility(4);
                    r0Var.f28447s.setAlpha(0.0f);
                    r0Var.f28447s.setRotation(45.0f);
                    r0Var.f28447s.setScaleX(0.0f);
                    r0Var.f28447s.setScaleY(0.0f);
                    return;
                }
                r0Var.f28447s.setAlpha(1.0f);
                r0Var.f28447s.setRotation(0.0f);
                r0Var.f28447s.setScaleX(1.0f);
                r0Var.f28447s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27464a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z9 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((bb1) this.f27465b).f43965n.getTransformationMethod() != null) {
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
        switch (this.f27464a) {
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
        switch (this.f27464a) {
            case 1:
                super.setAlpha(f10);
                ((vp) this.f27465b).f39787y.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f27464a) {
            case 3:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f27465b;
                ArrayList arrayList = photoViewer.f41420h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((fi.m3) obj).setTranslationY(f10);
                    }
                }
                zo0 zo0Var = photoViewer.f41411g1;
                if (zo0Var != null) {
                    zo0Var.setTranslationY(f10);
                }
                z70 z70Var = photoViewer.f41402f1;
                if (z70Var != null) {
                    z70Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
