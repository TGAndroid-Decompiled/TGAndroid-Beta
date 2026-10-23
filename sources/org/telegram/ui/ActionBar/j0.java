package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bg1;
import org.telegram.ui.is0;
public final class j0 extends ImageView {
    public final int f20986a;
    public final Object f20987b;

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f20986a = i10;
        this.f20987b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f20986a) {
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
        switch (this.f20986a) {
            case 0:
                u0 u0Var = (u0) this.f20987b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    u0Var.f21895s.setVisibility(4);
                    u0Var.f21895s.setAlpha(0.0f);
                    u0Var.f21895s.setRotation(45.0f);
                    u0Var.f21895s.setScaleX(0.0f);
                    u0Var.f21895s.setScaleY(0.0f);
                    return;
                }
                u0Var.f21895s.setAlpha(1.0f);
                u0Var.f21895s.setRotation(0.0f);
                u0Var.f21895s.setScaleX(1.0f);
                u0Var.f21895s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f20986a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((bg1) this.f20987b).f36094n.getTransformationMethod() != null) {
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
        switch (this.f20986a) {
            case 1:
                super.setAlpha(f7);
                ((wq) this.f20987b).f32328x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f20986a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f20987b;
                ArrayList arrayList = photoViewer.f33607h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ei.x3) obj).setTranslationY(f7);
                    }
                }
                is0 is0Var = photoViewer.f33598g1;
                if (is0Var != null) {
                    is0Var.setTranslationY(f7);
                }
                aa0 aa0Var = photoViewer.f33590f1;
                if (aa0Var != null) {
                    aa0Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
