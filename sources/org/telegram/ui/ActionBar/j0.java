package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hh1;
import org.telegram.ui.ys0;
public final class j0 extends ImageView {
    public final int f21213a;
    public final Object f21214b;

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f21213a = i10;
        this.f21214b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f21213a) {
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
        switch (this.f21213a) {
            case 0:
                u0 u0Var = (u0) this.f21214b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    u0Var.f21557s.setVisibility(4);
                    u0Var.f21557s.setAlpha(0.0f);
                    u0Var.f21557s.setRotation(45.0f);
                    u0Var.f21557s.setScaleX(0.0f);
                    u0Var.f21557s.setScaleY(0.0f);
                    return;
                }
                u0Var.f21557s.setAlpha(1.0f);
                u0Var.f21557s.setRotation(0.0f);
                u0Var.f21557s.setScaleX(1.0f);
                u0Var.f21557s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f21213a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((hh1) this.f21214b).f38428n.getTransformationMethod() != null) {
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
        switch (this.f21213a) {
            case 1:
                super.setAlpha(f7);
                ((cr) this.f21214b).f25304x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f21213a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f21214b;
                ArrayList arrayList = photoViewer.f33959h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.d4) obj).setTranslationY(f7);
                    }
                }
                ys0 ys0Var = photoViewer.f33950g1;
                if (ys0Var != null) {
                    ys0Var.setTranslationY(f7);
                }
                ha0 ha0Var = photoViewer.f33942f1;
                if (ha0Var != null) {
                    ha0Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
