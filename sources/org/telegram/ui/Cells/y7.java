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

public final class y7 extends FrameLayout {

    public org.telegram.ui.Components.n9 f26002a;

    public TLRPC.Document f26003b;

    public Object f26004c;
    public long d;

    public boolean f26005e;

    public float f26006f;
    public boolean h;

    public ag.k2 f26007n;

    public boolean f26008r;

    public boolean f26009s;
    public org.telegram.ui.ActionBar.c6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f10;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.n9 n9Var = this.f26002a;
        if (view == n9Var && (((z10 = this.f26005e) && this.f26006f != 0.8f) || (!z10 && this.f26006f != 1.0f))) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = jCurrentTimeMillis - this.d;
            this.d = jCurrentTimeMillis;
            if (this.f26005e) {
                float f11 = this.f26006f;
                if (f11 != 0.8f) {
                    float f12 = f11 - (j11 / 400.0f);
                    this.f26006f = f12;
                    if (f12 < 0.8f) {
                        this.f26006f = 0.8f;
                    }
                } else {
                    f10 = (j11 / 400.0f) + this.f26006f;
                    this.f26006f = f10;
                    if (f10 > 1.0f) {
                        this.f26006f = 1.0f;
                    }
                }
            } else {
                f10 = (j11 / 400.0f) + this.f26006f;
                this.f26006f = f10;
                if (f10 > 1.0f) {
                    this.f26006f = 1.0f;
                }
            }
            n9Var.setScaleX(this.f26006f);
            n9Var.setScaleY(this.f26006f);
            n9Var.invalidate();
            invalidate();
        }
        return zDrawChild;
    }

    public Object getParentObject() {
        return this.f26004c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.n9 n9Var = this.f26002a;
        ImageReceiver imageReceiver = n9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        n9Var.getLocationInWindow(iArr);
        sendAnimationData.f19620x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.f19621y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f26003b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f26003b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f26003b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f26003b.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                str = (str2 == null || str2.length() <= 0) ? null : documentAttribute.alt;
            }
        }
        if (str != null) {
            StringBuilder sbF = s3.c.f(str, " ");
            sbF.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(sbF.toString());
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
        org.telegram.ui.Components.n9 n9Var = this.f26002a;
        if (n9Var.getImageReceiver().getPressed() != z10) {
            n9Var.getImageReceiver().setPressed(z10 ? 1 : 0);
            n9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.f26005e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
