package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.mq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bt0;
import org.telegram.ui.ih1;
public final class l0 extends ImageView {
    public final int f19369a;
    public final Object f19370b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f19369a = i10;
        this.f19370b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f19369a) {
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
        switch (this.f19369a) {
            case 0:
                w0 w0Var = (w0) this.f19370b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    w0Var.f19627s.setVisibility(4);
                    w0Var.f19627s.setAlpha(0.0f);
                    w0Var.f19627s.setRotation(45.0f);
                    w0Var.f19627s.setScaleX(0.0f);
                    w0Var.f19627s.setScaleY(0.0f);
                    return;
                }
                w0Var.f19627s.setAlpha(1.0f);
                w0Var.f19627s.setRotation(0.0f);
                w0Var.f19627s.setScaleX(1.0f);
                w0Var.f19627s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f19369a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((ih1) this.f19370b).f34590n.getTransformationMethod() != null) {
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
        switch (this.f19369a) {
            case 1:
                super.setAlpha(f7);
                ((mq) this.f19370b).f26255x.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f19369a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f19370b;
                ArrayList arrayList = photoViewer.f30981h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.f4) obj).setTranslationY(f7);
                    }
                }
                bt0 bt0Var = photoViewer.f30972g1;
                if (bt0Var != null) {
                    bt0Var.setTranslationY(f7);
                }
                e90 e90Var = photoViewer.f30964f1;
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
