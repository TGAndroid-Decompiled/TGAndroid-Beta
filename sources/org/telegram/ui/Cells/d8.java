package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d8 extends FrameLayout {
    public org.telegram.ui.Components.z9 f21080a;
    public TLRPC.Document f21081b;
    public Object f21082c;
    public long d;
    public boolean e;
    public float f21083f;
    public boolean h;
    public sg.c1 f21084n;
    public boolean f21085r;
    public boolean f21086s;
    public org.telegram.ui.ActionBar.c6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.z9 z9Var = this.f21080a;
        if (view == z9Var && (((z10 = this.e) && this.f21083f != 0.8f) || (!z10 && this.f21083f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f7 = this.f21083f;
                if (f7 != 0.8f) {
                    float f10 = f7 - (((float) j11) / 400.0f);
                    this.f21083f = f10;
                    if (f10 < 0.8f) {
                        this.f21083f = 0.8f;
                    }
                    z9Var.setScaleX(this.f21083f);
                    z9Var.setScaleY(this.f21083f);
                    z9Var.invalidate();
                    invalidate();
                }
            }
            float f11 = (((float) j11) / 400.0f) + this.f21083f;
            this.f21083f = f11;
            if (f11 > 1.0f) {
                this.f21083f = 1.0f;
            }
            z9Var.setScaleX(this.f21083f);
            z9Var.setScaleY(this.f21083f);
            z9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f21082c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.z9 z9Var = this.f21080a;
        ImageReceiver imageReceiver = z9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        z9Var.getLocationInWindow(iArr);
        sendAnimationData.f16706x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.f16707y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f21081b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f21081b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f21081b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f21081b.attributes.get(i10);
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
            StringBuilder i11 = t8.b.i(str, " ");
            i11.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(i11.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachSticker));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        org.telegram.ui.Components.z9 z9Var = this.f21080a;
        if (z9Var.getImageReceiver().getPressed() != z10) {
            z9Var.getImageReceiver().setPressed(z10 ? 1 : 0);
            z9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
