package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
public final class b8 extends FrameLayout {
    public org.telegram.ui.Components.g9 f21735a;
    public TLRPC.Document f21736b;
    public Object f21737c;
    public long d;
    public boolean e;
    public float f21738f;
    public boolean h;
    public kg.l1 f21739n;
    public boolean f21740r;
    public boolean f21741s;
    public org.telegram.ui.ActionBar.p6 f21742w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.g9 g9Var = this.f21735a;
        if (view == g9Var && (((z10 = this.e) && this.f21738f != 0.8f) || (!z10 && this.f21738f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f7 = this.f21738f;
                if (f7 != 0.8f) {
                    float f10 = f7 - (((float) j11) / 400.0f);
                    this.f21738f = f10;
                    if (f10 < 0.8f) {
                        this.f21738f = 0.8f;
                    }
                    g9Var.setScaleX(this.f21738f);
                    g9Var.setScaleY(this.f21738f);
                    g9Var.invalidate();
                    invalidate();
                }
            }
            float f11 = (((float) j11) / 400.0f) + this.f21738f;
            this.f21738f = f11;
            if (f11 > 1.0f) {
                this.f21738f = 1.0f;
            }
            g9Var.setScaleX(this.f21738f);
            g9Var.setScaleY(this.f21738f);
            g9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f21737c;
    }

    public fj getSendAnimationData() {
        org.telegram.ui.Components.g9 g9Var = this.f21735a;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        g9Var.getLocationInWindow(iArr);
        obj.f15577a = imageReceiver.r() + iArr[0];
        obj.f15578b = imageReceiver.s() + iArr[1];
        obj.f15579c = imageReceiver.M0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f21736b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f21736b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f21736b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f21736b.attributes.get(i10);
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
            i11.append(cd.L0(2131753936, null));
            accessibilityNodeInfo.setText(i11.toString());
        } else {
            accessibilityNodeInfo.setText(cd.L0(2131753936, null));
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
        org.telegram.ui.Components.g9 g9Var = this.f21735a;
        if (g9Var.getImageReceiver().f14377e1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            g9Var.getImageReceiver().f14377e1 = z10 ? 1 : 0;
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
