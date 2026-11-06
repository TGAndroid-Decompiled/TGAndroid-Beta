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
    public org.telegram.ui.Components.l9 f30891a;
    public TLRPC.Document f30892b;
    public Object f30893c;
    public long d;
    public boolean f30894e;
    public float f30895f;
    public boolean h;
    public ug.z0 f30896n;
    public boolean f30897r;
    public boolean f30898s;
    public org.telegram.ui.ActionBar.f6 f30899w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.l9 l9Var = this.f30891a;
        if (view == l9Var && (((z9 = this.f30894e) && this.f30895f != 0.8f) || (!z9 && this.f30895f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f30894e) {
                float f10 = this.f30895f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j10) / 400.0f);
                    this.f30895f = f11;
                    if (f11 < 0.8f) {
                        this.f30895f = 0.8f;
                    }
                    l9Var.setScaleX(this.f30895f);
                    l9Var.setScaleY(this.f30895f);
                    l9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j10) / 400.0f) + this.f30895f;
            this.f30895f = f12;
            if (f12 > 1.0f) {
                this.f30895f = 1.0f;
            }
            l9Var.setScaleX(this.f30895f);
            l9Var.setScaleY(this.f30895f);
            l9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f30893c;
    }

    public ej getSendAnimationData() {
        org.telegram.ui.Components.l9 l9Var = this.f30891a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        obj.f22220a = imageReceiver.r() + iArr[0];
        obj.f22221b = imageReceiver.s() + iArr[1];
        obj.f22222c = imageReceiver.M0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f30892b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f30892b == null) {
            return;
        }
        String str = null;
        for (int i7 = 0; i7 < this.f30892b.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = this.f30892b.attributes.get(i7);
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
        org.telegram.ui.Components.l9 l9Var = this.f30891a;
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
        this.f30894e = z9;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
