package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
public final class x7 extends FrameLayout {
    public org.telegram.ui.Components.p9 f32421a;
    public TLRPC.Document f32422b;
    public Object f32423c;
    public long d;
    public boolean f32424e;
    public float f32425f;
    public boolean h;
    public ug.b1 f32426n;
    public boolean f32427r;
    public boolean f32428s;
    public org.telegram.ui.ActionBar.i6 f32429w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.p9 p9Var = this.f32421a;
        if (view == p9Var && (((z10 = this.f32424e) && this.f32425f != 0.8f) || (!z10 && this.f32425f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f32424e) {
                float f10 = this.f32425f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j10) / 400.0f);
                    this.f32425f = f11;
                    if (f11 < 0.8f) {
                        this.f32425f = 0.8f;
                    }
                    p9Var.setScaleX(this.f32425f);
                    p9Var.setScaleY(this.f32425f);
                    p9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j10) / 400.0f) + this.f32425f;
            this.f32425f = f12;
            if (f12 > 1.0f) {
                this.f32425f = 1.0f;
            }
            p9Var.setScaleX(this.f32425f);
            p9Var.setScaleY(this.f32425f);
            p9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f32423c;
    }

    public bj getSendAnimationData() {
        org.telegram.ui.Components.p9 p9Var = this.f32421a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        if (!imageReceiver.M()) {
            return null;
        }
        ?? obj = new Object();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        obj.f23204a = imageReceiver.r() + iArr[0];
        obj.f23205b = imageReceiver.s() + iArr[1];
        obj.f23206c = imageReceiver.N0;
        return obj;
    }

    public TLRPC.Document getSticker() {
        return this.f32422b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f32422b == null) {
            return;
        }
        String str = null;
        for (int i7 = 0; i7 < this.f32422b.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = this.f32422b.attributes.get(i7);
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
            n10.append(gd.N0(2131753933, null));
            accessibilityNodeInfo.setText(n10.toString());
        } else {
            accessibilityNodeInfo.setText(gd.N0(2131753933, null));
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
        org.telegram.ui.Components.p9 p9Var = this.f32421a;
        if (p9Var.getImageReceiver().f22733f1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            p9Var.getImageReceiver().f22733f1 = z10 ? 1 : 0;
            p9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.f32424e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
