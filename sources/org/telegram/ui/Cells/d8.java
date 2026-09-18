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
    public org.telegram.ui.Components.u9 f19940a;
    public TLRPC.Document f19941b;
    public Object f19942c;
    public long d;
    public boolean e;
    public float f19943f;
    public boolean h;
    public rg.b1 f19944n;
    public boolean f19945r;
    public boolean f19946s;
    public org.telegram.ui.ActionBar.f6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.u9 u9Var = this.f19940a;
        if (view == u9Var && (((z10 = this.e) && this.f19943f != 0.8f) || (!z10 && this.f19943f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f7 = this.f19943f;
                if (f7 != 0.8f) {
                    float f10 = f7 - (((float) j10) / 400.0f);
                    this.f19943f = f10;
                    if (f10 < 0.8f) {
                        this.f19943f = 0.8f;
                    }
                    u9Var.setScaleX(this.f19943f);
                    u9Var.setScaleY(this.f19943f);
                    u9Var.invalidate();
                    invalidate();
                }
            }
            float f11 = (((float) j10) / 400.0f) + this.f19943f;
            this.f19943f = f11;
            if (f11 > 1.0f) {
                this.f19943f = 1.0f;
            }
            u9Var.setScaleX(this.f19943f);
            u9Var.setScaleY(this.f19943f);
            u9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f19942c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.u9 u9Var = this.f19940a;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        sendAnimationData.f15611x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.f15612y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f19941b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f19941b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f19941b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f19941b.attributes.get(i10);
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
            StringBuilder g10 = w.f.g(str, " ");
            g10.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(g10.toString());
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
        org.telegram.ui.Components.u9 u9Var = this.f19940a;
        if (u9Var.getImageReceiver().getPressed() != z10) {
            u9Var.getImageReceiver().setPressed(z10 ? 1 : 0);
            u9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
