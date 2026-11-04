package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
public final class w7 extends FrameLayout {
    public org.telegram.ui.Components.k9 f30813a;
    public TLRPC.Document f30814b;
    public Object f30815c;
    public long d;
    public boolean f30816e;
    public float f30817f;
    public boolean h;
    public vg.y0 f30818n;
    public boolean f30819r;
    public boolean f30820s;
    public org.telegram.ui.ActionBar.e6 f30821w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.k9 k9Var = this.f30813a;
        if (view == k9Var && (((z10 = this.f30816e) && this.f30817f != 0.8f) || (!z10 && this.f30817f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f30816e) {
                float f10 = this.f30817f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j11) / 400.0f);
                    this.f30817f = f11;
                    if (f11 < 0.8f) {
                        this.f30817f = 0.8f;
                    }
                    k9Var.setScaleX(this.f30817f);
                    k9Var.setScaleY(this.f30817f);
                    k9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j11) / 400.0f) + this.f30817f;
            this.f30817f = f12;
            if (f12 > 1.0f) {
                this.f30817f = 1.0f;
            }
            k9Var.setScaleX(this.f30817f);
            k9Var.setScaleY(this.f30817f);
            k9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f30815c;
    }

    public vi getSendAnimationData() {
        org.telegram.ui.Components.k9 k9Var = this.f30813a;
        ImageReceiver imageReceiver = k9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        k9Var.getLocationInWindow(iArr);
        obj.f25882a = imageReceiver.r() + iArr[0];
        obj.f25883b = imageReceiver.s() + iArr[1];
        obj.f25884c = imageReceiver.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f30814b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f30814b == null) {
            return;
        }
        String str = null;
        for (int i3 = 0; i3 < this.f30814b.attributes.size(); i3++) {
            TLRPC.DocumentAttribute documentAttribute = this.f30814b.attributes.get(i3);
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
            StringBuilder h = t4.c.h(str, " ");
            h.append(bd.M0(2131753936, null));
            accessibilityNodeInfo.setText(h.toString());
        } else {
            accessibilityNodeInfo.setText(bd.M0(2131753936, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + org.telegram.messenger.g0.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        org.telegram.ui.Components.k9 k9Var = this.f30813a;
        if (k9Var.getImageReceiver().f21243f1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            k9Var.getImageReceiver().f21243f1 = z10 ? 1 : 0;
            k9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.f30816e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
