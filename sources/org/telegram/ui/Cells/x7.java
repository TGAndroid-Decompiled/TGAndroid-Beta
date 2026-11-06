package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ej;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
public final class x7 extends FrameLayout {
    public org.telegram.ui.Components.l9 f30890a;
    public TLRPC.Document f30891b;
    public Object f30892c;
    public long d;
    public boolean f30893e;
    public float f30894f;
    public boolean h;
    public ug.z0 f30895n;
    public boolean f30896r;
    public boolean f30897s;
    public org.telegram.ui.ActionBar.f6 f30898w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.l9 l9Var = this.f30890a;
        if (view == l9Var && (((z9 = this.f30893e) && this.f30894f != 0.8f) || (!z9 && this.f30894f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f30893e) {
                float f10 = this.f30894f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j10) / 400.0f);
                    this.f30894f = f11;
                    if (f11 < 0.8f) {
                        this.f30894f = 0.8f;
                    }
                    l9Var.setScaleX(this.f30894f);
                    l9Var.setScaleY(this.f30894f);
                    l9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j10) / 400.0f) + this.f30894f;
            this.f30894f = f12;
            if (f12 > 1.0f) {
                this.f30894f = 1.0f;
            }
            l9Var.setScaleX(this.f30894f);
            l9Var.setScaleY(this.f30894f);
            l9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f30892c;
    }

    public ej getSendAnimationData() {
        org.telegram.ui.Components.l9 l9Var = this.f30890a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        obj.f22213a = imageReceiver.r() + iArr[0];
        obj.f22214b = imageReceiver.s() + iArr[1];
        obj.f22215c = imageReceiver.M0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f30891b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f30891b == null) {
            return;
        }
        String str = null;
        for (int i7 = 0; i7 < this.f30891b.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = this.f30891b.attributes.get(i7);
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
            StringBuilder j3 = rf.b.j(str, " ");
            j3.append(hd.M0(2131753936, null));
            accessibilityNodeInfo.setText(j3.toString());
        } else {
            accessibilityNodeInfo.setText(hd.M0(2131753936, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + org.telegram.messenger.g0.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z9) {
        this.h = z9;
    }

    @Override
    public void setPressed(boolean z9) {
        boolean z10;
        org.telegram.ui.Components.l9 l9Var = this.f30890a;
        if (l9Var.getImageReceiver().f21187e1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z9) {
            l9Var.getImageReceiver().f21187e1 = z9 ? 1 : 0;
            l9Var.invalidate();
        }
        super.setPressed(z9);
    }

    public void setScaled(boolean z9) {
        this.f30893e = z9;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
