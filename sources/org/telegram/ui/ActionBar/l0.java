package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.r80;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xr0;
import org.telegram.ui.zf1;

public final class l0 extends ImageView {

    public final int f23617a;

    public final Object f23618b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f23617a = i10;
        this.f23618b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f23617a) {
            case 0:
                getBackground().draw(canvas);
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f23617a) {
            case 0:
                v0 v0Var = (v0) this.f23618b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() != null) {
                    v0Var.f23875s.setAlpha(1.0f);
                    v0Var.f23875s.setRotation(0.0f);
                    v0Var.f23875s.setScaleX(1.0f);
                    v0Var.f23875s.setScaleY(1.0f);
                } else {
                    v0Var.f23875s.setVisibility(4);
                    v0Var.f23875s.setAlpha(0.0f);
                    v0Var.f23875s.setRotation(45.0f);
                    v0Var.f23875s.setScaleX(0.0f);
                    v0Var.f23875s.setScaleY(0.0f);
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f23617a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(((zf1) this.f23618b).f45172n.getTransformationMethod() == null);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f23617a) {
            case 1:
                super.setAlpha(f10);
                ((aq) this.f23618b).f26804x.invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f23617a) {
            case 2:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f23618b;
                ArrayList arrayList = photoViewer.f35611d1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((lh.w3) obj).setTranslationY(f10);
                    }
                }
                xr0 xr0Var = photoViewer.f35602c1;
                if (xr0Var != null) {
                    xr0Var.setTranslationY(f10);
                }
                r80 r80Var = photoViewer.f35592b1;
                if (r80Var != null) {
                    r80Var.setTranslationY(f10);
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
