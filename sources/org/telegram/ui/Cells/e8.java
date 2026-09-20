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
public final class e8 extends FrameLayout {
    public org.telegram.ui.Components.v9 f20193a;
    public TLRPC.Document f20194b;
    public Object f20195c;
    public long d;
    public boolean e;
    public float f20196f;
    public boolean h;
    public rg.b1 f20197n;
    public boolean f20198r;
    public boolean f20199s;
    public org.telegram.ui.ActionBar.f6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.v9 v9Var = this.f20193a;
        if (view == v9Var && (((z10 = this.e) && this.f20196f != 0.8f) || (!z10 && this.f20196f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f7 = this.f20196f;
                if (f7 != 0.8f) {
                    float f10 = f7 - (((float) j10) / 400.0f);
                    this.f20196f = f10;
                    if (f10 < 0.8f) {
                        this.f20196f = 0.8f;
                    }
                    v9Var.setScaleX(this.f20196f);
                    v9Var.setScaleY(this.f20196f);
                    v9Var.invalidate();
                    invalidate();
                }
            }
            float f11 = (((float) j10) / 400.0f) + this.f20196f;
            this.f20196f = f11;
            if (f11 > 1.0f) {
                this.f20196f = 1.0f;
            }
            v9Var.setScaleX(this.f20196f);
            v9Var.setScaleY(this.f20196f);
            v9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f20195c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.v9 v9Var = this.f20193a;
        ImageReceiver imageReceiver = v9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        v9Var.getLocationInWindow(iArr);
        sendAnimationData.f15820x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.f15821y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f20194b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f20194b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f20194b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f20194b.attributes.get(i10);
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
            StringBuilder h = v7.j0.h(str, " ");
            h.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(h.toString());
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
        org.telegram.ui.Components.v9 v9Var = this.f20193a;
        if (v9Var.getImageReceiver().getPressed() != z10) {
            v9Var.getImageReceiver().setPressed(z10 ? 1 : 0);
            v9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
