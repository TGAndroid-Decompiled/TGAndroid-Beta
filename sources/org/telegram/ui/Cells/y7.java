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
    public org.telegram.ui.Components.q9 f32506a;
    public TLRPC.Document f32507b;
    public Object f32508c;
    public long d;
    public boolean f32509e;
    public float f32510f;
    public boolean h;
    public ug.b1 f32511n;
    public boolean f32512r;
    public boolean f32513s;
    public org.telegram.ui.ActionBar.h6 f32514w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.q9 q9Var = this.f32506a;
        if (view == q9Var && (((z10 = this.f32509e) && this.f32510f != 0.8f) || (!z10 && this.f32510f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f32509e) {
                float f10 = this.f32510f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j10) / 400.0f);
                    this.f32510f = f11;
                    if (f11 < 0.8f) {
                        this.f32510f = 0.8f;
                    }
                    q9Var.setScaleX(this.f32510f);
                    q9Var.setScaleY(this.f32510f);
                    q9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j10) / 400.0f) + this.f32510f;
            this.f32510f = f12;
            if (f12 > 1.0f) {
                this.f32510f = 1.0f;
            }
            q9Var.setScaleX(this.f32510f);
            q9Var.setScaleY(this.f32510f);
            q9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f32508c;
    }

    public cj getSendAnimationData() {
        org.telegram.ui.Components.q9 q9Var = this.f32506a;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        obj.f23321a = imageReceiver.r() + iArr[0];
        obj.f23322b = imageReceiver.s() + iArr[1];
        obj.f23323c = imageReceiver.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f32507b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f32507b == null) {
            return;
        }
        String str = null;
        for (int i7 = 0; i7 < this.f32507b.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = this.f32507b.attributes.get(i7);
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
        org.telegram.ui.Components.q9 q9Var = this.f32506a;
        if (q9Var.getImageReceiver().f22666f1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            q9Var.getImageReceiver().f22666f1 = z10 ? 1 : 0;
            q9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.f32509e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
