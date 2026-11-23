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
public final class y7 extends FrameLayout {
    public org.telegram.ui.Components.q9 f32472a;
    public TLRPC.Document f32473b;
    public Object f32474c;
    public long d;
    public boolean f32475e;
    public float f32476f;
    public boolean h;
    public ug.b1 f32477n;
    public boolean f32478r;
    public boolean f32479s;
    public org.telegram.ui.ActionBar.h6 f32480w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.q9 q9Var = this.f32472a;
        if (view == q9Var && (((z10 = this.f32475e) && this.f32476f != 0.8f) || (!z10 && this.f32476f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f32475e) {
                float f10 = this.f32476f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j10) / 400.0f);
                    this.f32476f = f11;
                    if (f11 < 0.8f) {
                        this.f32476f = 0.8f;
                    }
                    q9Var.setScaleX(this.f32476f);
                    q9Var.setScaleY(this.f32476f);
                    q9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j10) / 400.0f) + this.f32476f;
            this.f32476f = f12;
            if (f12 > 1.0f) {
                this.f32476f = 1.0f;
            }
            q9Var.setScaleX(this.f32476f);
            q9Var.setScaleY(this.f32476f);
            q9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f32474c;
    }

    public cj getSendAnimationData() {
        org.telegram.ui.Components.q9 q9Var = this.f32472a;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        obj.f23285a = imageReceiver.r() + iArr[0];
        obj.f23286b = imageReceiver.s() + iArr[1];
        obj.f23287c = imageReceiver.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f32473b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f32473b == null) {
            return;
        }
        String str = null;
        for (int i7 = 0; i7 < this.f32473b.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = this.f32473b.attributes.get(i7);
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
            StringBuilder n10 = p5.c.n(str, " ");
            n10.append(hd.N0(2131753933, null));
            accessibilityNodeInfo.setText(n10.toString());
        } else {
            accessibilityNodeInfo.setText(hd.N0(2131753933, null));
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
        org.telegram.ui.Components.q9 q9Var = this.f32472a;
        if (q9Var.getImageReceiver().f22630f1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            q9Var.getImageReceiver().f22630f1 = z10 ? 1 : 0;
            q9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.f32475e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
