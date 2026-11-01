package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dd;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
public final class b8 extends FrameLayout {
    public org.telegram.ui.Components.g9 f21736a;
    public TLRPC.Document f21737b;
    public Object f21738c;
    public long d;
    public boolean e;
    public float f21739f;
    public boolean h;
    public kg.l1 f21740n;
    public boolean f21741r;
    public boolean f21742s;
    public org.telegram.ui.ActionBar.p6 f21743w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.g9 g9Var = this.f21736a;
        if (view == g9Var && (((z10 = this.e) && this.f21739f != 0.8f) || (!z10 && this.f21739f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f7 = this.f21739f;
                if (f7 != 0.8f) {
                    float f10 = f7 - (((float) j11) / 400.0f);
                    this.f21739f = f10;
                    if (f10 < 0.8f) {
                        this.f21739f = 0.8f;
                    }
                    g9Var.setScaleX(this.f21739f);
                    g9Var.setScaleY(this.f21739f);
                    g9Var.invalidate();
                    invalidate();
                }
            }
            float f11 = (((float) j11) / 400.0f) + this.f21739f;
            this.f21739f = f11;
            if (f11 > 1.0f) {
                this.f21739f = 1.0f;
            }
            g9Var.setScaleX(this.f21739f);
            g9Var.setScaleY(this.f21739f);
            g9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f21738c;
    }

    public gj getSendAnimationData() {
        org.telegram.ui.Components.g9 g9Var = this.f21736a;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        g9Var.getLocationInWindow(iArr);
        obj.f15918a = imageReceiver.r() + iArr[0];
        obj.f15919b = imageReceiver.s() + iArr[1];
        obj.f15920c = imageReceiver.M0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f21737b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f21737b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f21737b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f21737b.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 != null && str2.length() > 0) {
                    str = documentAttribute.alt;
                } else {
                    str = null;
                }
            }
        }
        if (str != null) {
            StringBuilder i11 = sc.e.i(str, " ");
            i11.append(dd.L0(2131753936, null));
            accessibilityNodeInfo.setText(i11.toString());
        } else {
            accessibilityNodeInfo.setText(dd.L0(2131753936, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + org.telegram.messenger.i0.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        org.telegram.ui.Components.g9 g9Var = this.f21736a;
        if (g9Var.getImageReceiver().f14378e1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            g9Var.getImageReceiver().f14378e1 = z10 ? 1 : 0;
            g9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
