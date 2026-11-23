package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.l80;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a20;
import org.telegram.ui.xo0;
import org.telegram.ui.za1;
public final class f0 extends ImageView {
    public final int f29002a;
    public final Object f29003b;

    public f0(int i7, Context context, Object obj) {
        super(context);
        this.f29002a = i7;
        this.f29003b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f29002a) {
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
        switch (this.f29002a) {
            case 2:
                super.invalidate();
                a20 a20Var = (a20) this.f29003b;
                a20Var.f41012g0.invalidate();
                a20Var.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f29002a) {
            case 0:
                q0 q0Var = (q0) this.f29003b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    q0Var.f29981s.setVisibility(4);
                    q0Var.f29981s.setAlpha(0.0f);
                    q0Var.f29981s.setRotation(45.0f);
                    q0Var.f29981s.setScaleX(0.0f);
                    q0Var.f29981s.setScaleY(0.0f);
                    return;
                }
                q0Var.f29981s.setAlpha(1.0f);
                q0Var.f29981s.setRotation(0.0f);
                q0Var.f29981s.setScaleX(1.0f);
                q0Var.f29981s.setScaleY(1.0f);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29002a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                boolean z10 = true;
                accessibilityNodeInfo.setCheckable(true);
                if (((za1) this.f29003b).f54576n.getTransformationMethod() != null) {
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
    public void onMeasure(int i7, int i10) {
        switch (this.f29002a) {
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
        switch (this.f29002a) {
            case 1:
                super.setAlpha(f10);
                ((jq) this.f29003b).f36495y.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f29002a) {
            case 3:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f29003b;
                ArrayList arrayList = photoViewer.f43361i1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((hi.u3) obj).setTranslationY(f10);
                    }
                }
                xo0 xo0Var = photoViewer.f43353h1;
                if (xo0Var != null) {
                    xo0Var.setTranslationY(f10);
                }
                l80 l80Var = photoViewer.f43344g1;
                if (l80Var != null) {
                    l80Var.setTranslationY(f10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
