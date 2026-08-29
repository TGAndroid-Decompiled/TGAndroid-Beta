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
public final class z7 extends FrameLayout {
    public org.telegram.ui.Components.t9 f26055a;
    public TLRPC.Document f26056b;
    public Object f26057c;
    public long d;
    public boolean f26058e;
    public float f26059f;
    public boolean h;
    public cg.t1 f26060n;
    public boolean f26061r;
    public boolean f26062s;
    public org.telegram.ui.ActionBar.c6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.t9 t9Var = this.f26055a;
        if (view == t9Var && (((z10 = this.f26058e) && this.f26059f != 0.8f) || (!z10 && this.f26059f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f26058e) {
                float f9 = this.f26059f;
                if (f9 != 0.8f) {
                    float f10 = f9 - (((float) j11) / 400.0f);
                    this.f26059f = f10;
                    if (f10 < 0.8f) {
                        this.f26059f = 0.8f;
                    }
                    t9Var.setScaleX(this.f26059f);
                    t9Var.setScaleY(this.f26059f);
                    t9Var.invalidate();
                    invalidate();
                }
            }
            float f11 = (((float) j11) / 400.0f) + this.f26059f;
            this.f26059f = f11;
            if (f11 > 1.0f) {
                this.f26059f = 1.0f;
            }
            t9Var.setScaleX(this.f26059f);
            t9Var.setScaleY(this.f26059f);
            t9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f26057c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.t9 t9Var = this.f26055a;
        ImageReceiver imageReceiver = t9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        t9Var.getLocationInWindow(iArr);
        sendAnimationData.f19618x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.f19619y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f26056b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f26056b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f26056b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f26056b.attributes.get(i10);
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
            StringBuilder f9 = u3.c.f(str, " ");
            f9.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(f9.toString());
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
        org.telegram.ui.Components.t9 t9Var = this.f26055a;
        if (t9Var.getImageReceiver().getPressed() != z10) {
            t9Var.getImageReceiver().setPressed(z10 ? 1 : 0);
            t9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.f26058e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
