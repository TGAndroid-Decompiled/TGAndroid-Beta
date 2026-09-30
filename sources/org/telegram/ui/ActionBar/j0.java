package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.r90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.rs0;
import org.telegram.ui.zg1;
public final class j0 extends ImageView {
    public final int f19487a;
    public final Object f19488b;

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f19487a = i10;
        this.f19488b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f19487a) {
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
        switch (this.f19487a) {
            case 0:
                u0 u0Var = (u0) this.f19488b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    u0Var.f19811s.setVisibility(4);
                    u0Var.f19811s.setAlpha(0.0f);
                    u0Var.f19811s.setRotation(45.0f);
                    u0Var.f19811s.setScaleX(0.0f);
                    u0Var.f19811s.setScaleY(0.0f);
                    return;
                }
                u0Var.f19811s.setAlpha(1.0f);
                u0Var.f19811s.setRotation(0.0f);
                u0Var.f19811s.setScaleX(1.0f);
                u0Var.f19811s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f19487a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((zg1) this.f19488b).f40484n.getTransformationMethod() != null) {
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
        switch (this.f19487a) {
            case 1:
                super.setAlpha(f7);
                ((oq) this.f19488b).f27169x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f19487a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f19488b;
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
                rs0 rs0Var = photoViewer.f31243g1;
                if (rs0Var != null) {
                    rs0Var.setTranslationY(f7);
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
