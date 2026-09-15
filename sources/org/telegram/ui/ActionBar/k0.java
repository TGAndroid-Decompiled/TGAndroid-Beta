package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.mq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gh1;
import org.telegram.ui.zs0;
public final class k0 extends ImageView {
    public final int f19341a;
    public final Object f19342b;

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f19341a = i10;
        this.f19342b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f19341a) {
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
        switch (this.f19341a) {
            case 0:
                v0 v0Var = (v0) this.f19342b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    v0Var.f19599s.setVisibility(4);
                    v0Var.f19599s.setAlpha(0.0f);
                    v0Var.f19599s.setRotation(45.0f);
                    v0Var.f19599s.setScaleX(0.0f);
                    v0Var.f19599s.setScaleY(0.0f);
                    return;
                }
                v0Var.f19599s.setAlpha(1.0f);
                v0Var.f19599s.setRotation(0.0f);
                v0Var.f19599s.setScaleX(1.0f);
                v0Var.f19599s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f19341a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((gh1) this.f19342b).f33922n.getTransformationMethod() != null) {
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
        switch (this.f19341a) {
            case 1:
                super.setAlpha(f7);
                ((mq) this.f19342b).f26226x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f19341a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f19342b;
                ArrayList arrayList = photoViewer.f30963h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.f4) obj).setTranslationY(f7);
                    }
                }
                zs0 zs0Var = photoViewer.f30954g1;
                if (zs0Var != null) {
                    zs0Var.setTranslationY(f7);
                }
                e90 e90Var = photoViewer.f30946f1;
                if (e90Var != null) {
                    e90Var.setTranslationY(f7);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
