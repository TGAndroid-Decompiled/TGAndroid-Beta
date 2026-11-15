package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
public final class w7 extends FrameLayout {
    public org.telegram.ui.Components.i9 f31889a;
    public TLRPC.Document f31890b;
    public Object f31891c;
    public long d;
    public boolean f31892e;
    public float f31893f;
    public boolean h;
    public ug.a1 f31894n;
    public boolean f31895r;
    public boolean f31896s;
    public org.telegram.ui.ActionBar.e6 f31897w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.i9 i9Var = this.f31889a;
        if (view == i9Var && (((z10 = this.f31892e) && this.f31893f != 0.8f) || (!z10 && this.f31893f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f31892e) {
                float f10 = this.f31893f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j10) / 400.0f);
                    this.f31893f = f11;
                    if (f11 < 0.8f) {
                        this.f31893f = 0.8f;
                    }
                    i9Var.setScaleX(this.f31893f);
                    i9Var.setScaleY(this.f31893f);
                    i9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j10) / 400.0f) + this.f31893f;
            this.f31893f = f12;
            if (f12 > 1.0f) {
                this.f31893f = 1.0f;
            }
            i9Var.setScaleX(this.f31893f);
            i9Var.setScaleY(this.f31893f);
            i9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f31891c;
    }

    public cj getSendAnimationData() {
        org.telegram.ui.Components.i9 i9Var = this.f31889a;
        ImageReceiver imageReceiver = i9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        i9Var.getLocationInWindow(iArr);
        obj.f22885a = imageReceiver.r() + iArr[0];
        obj.f22886b = imageReceiver.s() + iArr[1];
        obj.f22887c = imageReceiver.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f31890b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f31890b == null) {
            return;
        }
        String str = null;
        for (int i7 = 0; i7 < this.f31890b.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = this.f31890b.attributes.get(i7);
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
            StringBuilder m10 = r.b.m(str, " ");
            m10.append(hd.M0(2131753936, null));
            accessibilityNodeInfo.setText(m10.toString());
        } else {
            accessibilityNodeInfo.setText(hd.M0(2131753936, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + org.telegram.messenger.g0.L(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        org.telegram.ui.Components.i9 i9Var = this.f31889a;
        if (i9Var.getImageReceiver().f22272f1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            i9Var.getImageReceiver().f22272f1 = z10 ? 1 : 0;
            i9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.f31892e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
