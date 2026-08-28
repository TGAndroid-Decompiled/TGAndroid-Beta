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
public final class b8 extends FrameLayout {
    public org.telegram.ui.Components.o9 f24144a;
    public TLRPC.Document f24145b;
    public Object f24146c;
    public long d;
    public boolean f24147e;
    public float f24148f;
    public boolean h;
    public zf.b1 f24149n;
    public boolean f24150r;
    public boolean f24151s;
    public org.telegram.ui.ActionBar.b6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.o9 o9Var = this.f24144a;
        if (view == o9Var && (((z10 = this.f24147e) && this.f24148f != 0.8f) || (!z10 && this.f24148f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f24147e) {
                float f10 = this.f24148f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j11) / 400.0f);
                    this.f24148f = f11;
                    if (f11 < 0.8f) {
                        this.f24148f = 0.8f;
                    }
                    o9Var.setScaleX(this.f24148f);
                    o9Var.setScaleY(this.f24148f);
                    o9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j11) / 400.0f) + this.f24148f;
            this.f24148f = f12;
            if (f12 > 1.0f) {
                this.f24148f = 1.0f;
            }
            o9Var.setScaleX(this.f24148f);
            o9Var.setScaleY(this.f24148f);
            o9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f24146c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.o9 o9Var = this.f24144a;
        ImageReceiver imageReceiver = o9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        o9Var.getLocationInWindow(iArr);
        sendAnimationData.f19647x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.f19648y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f24145b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f24145b == null) {
            return;
        }
        String str = null;
        for (int i9 = 0; i9 < this.f24145b.attributes.size(); i9++) {
            TLRPC.DocumentAttribute documentAttribute = this.f24145b.attributes.get(i9);
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
            StringBuilder e10 = ta.b.e(str, " ");
            e10.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(e10.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachSticker));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        org.telegram.ui.Components.o9 o9Var = this.f24144a;
        if (o9Var.getImageReceiver().getPressed() != z10) {
            o9Var.getImageReceiver().setPressed(z10 ? 1 : 0);
            o9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.f24147e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
