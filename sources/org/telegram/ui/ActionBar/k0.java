package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.s90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.us0;
import org.telegram.ui.zg1;
public final class k0 extends ImageView {
    public final int f21312a;
    public final Object f21313b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f21312a = i10;
        this.f21313b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f21312a) {
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
        switch (this.f21312a) {
            case 0:
                v0 v0Var = (v0) this.f21313b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    v0Var.f21601s.setVisibility(4);
                    v0Var.f21601s.setAlpha(0.0f);
                    v0Var.f21601s.setRotation(45.0f);
                    v0Var.f21601s.setScaleX(0.0f);
                    v0Var.f21601s.setScaleY(0.0f);
                    return;
                }
                v0Var.f21601s.setAlpha(1.0f);
                v0Var.f21601s.setRotation(0.0f);
                v0Var.f21601s.setScaleX(1.0f);
                v0Var.f21601s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f21312a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((zg1) this.f21313b).f43791n.getTransformationMethod() != null) {
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
        switch (this.f21312a) {
            case 1:
                super.setAlpha(f7);
                ((pq) this.f21313b).f29823x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f21312a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f21313b;
                ArrayList arrayList = photoViewer.f33941h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.e4) obj).setTranslationY(f7);
                    }
                }
                us0 us0Var = photoViewer.f33932g1;
                if (us0Var != null) {
                    us0Var.setTranslationY(f7);
                }
                s90 s90Var = photoViewer.f33924f1;
                if (s90Var != null) {
                    s90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
