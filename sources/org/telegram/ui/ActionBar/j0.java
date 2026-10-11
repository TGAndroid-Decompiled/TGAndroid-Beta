package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hh1;
import org.telegram.ui.ys0;
public final class j0 extends ImageView {
    public final int f21249a;
    public final Object f21250b;

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f21249a = i10;
        this.f21250b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f21249a) {
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
        switch (this.f21249a) {
            case 0:
                u0 u0Var = (u0) this.f21250b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    u0Var.f21593s.setVisibility(4);
                    u0Var.f21593s.setAlpha(0.0f);
                    u0Var.f21593s.setRotation(45.0f);
                    u0Var.f21593s.setScaleX(0.0f);
                    u0Var.f21593s.setScaleY(0.0f);
                    return;
                }
                u0Var.f21593s.setAlpha(1.0f);
                u0Var.f21593s.setRotation(0.0f);
                u0Var.f21593s.setScaleX(1.0f);
                u0Var.f21593s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f21249a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((hh1) this.f21250b).f38462n.getTransformationMethod() != null) {
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
        switch (this.f21249a) {
            case 1:
                super.setAlpha(f7);
                ((cr) this.f21250b).f25462x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f21249a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f21250b;
                ArrayList arrayList = photoViewer.f33993h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.d4) obj).setTranslationY(f7);
                    }
                }
                ys0 ys0Var = photoViewer.f33984g1;
                if (ys0Var != null) {
                    ys0Var.setTranslationY(f7);
                }
                ga0 ga0Var = photoViewer.f33976f1;
                if (ga0Var != null) {
                    ga0Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
