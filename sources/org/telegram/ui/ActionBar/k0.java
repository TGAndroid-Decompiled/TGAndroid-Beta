package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ih1;
import org.telegram.ui.zs0;
public final class k0 extends ImageView {
    public final int f19577a;
    public final Object f19578b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f19577a = i10;
        this.f19578b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f19577a) {
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
        switch (this.f19577a) {
            case 0:
                v0 v0Var = (v0) this.f19578b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    v0Var.f19833s.setVisibility(4);
                    v0Var.f19833s.setAlpha(0.0f);
                    v0Var.f19833s.setRotation(45.0f);
                    v0Var.f19833s.setScaleX(0.0f);
                    v0Var.f19833s.setScaleY(0.0f);
                    return;
                }
                v0Var.f19833s.setAlpha(1.0f);
                v0Var.f19833s.setRotation(0.0f);
                v0Var.f19833s.setScaleX(1.0f);
                v0Var.f19833s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f19577a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((ih1) this.f19578b).f34604n.getTransformationMethod() != null) {
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
        switch (this.f19577a) {
            case 1:
                super.setAlpha(f7);
                ((mq) this.f19578b).f26528x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f19577a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f19578b;
                ArrayList arrayList = photoViewer.f31269h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.f4) obj).setTranslationY(f7);
                    }
                }
                zs0 zs0Var = photoViewer.f31260g1;
                if (zs0Var != null) {
                    zs0Var.setTranslationY(f7);
                }
                p90 p90Var = photoViewer.f31252f1;
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
