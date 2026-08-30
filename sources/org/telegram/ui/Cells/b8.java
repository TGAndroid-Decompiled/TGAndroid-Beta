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
    public org.telegram.ui.Components.p9 f20881a;
    public TLRPC.Document f20882b;
    public Object f20883c;
    public long d;
    public boolean e;
    public float f20884f;
    public boolean h;
    public eg.s1 f20885n;
    public boolean f20886r;
    public boolean f20887s;
    public org.telegram.ui.ActionBar.f6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.p9 p9Var = this.f20881a;
        if (view == p9Var && (((z4 = this.e) && this.f20884f != 0.8f) || (!z4 && this.f20884f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f10 = this.f20884f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j11) / 400.0f);
                    this.f20884f = f11;
                    if (f11 < 0.8f) {
                        this.f20884f = 0.8f;
                    }
                    p9Var.setScaleX(this.f20884f);
                    p9Var.setScaleY(this.f20884f);
                    p9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j11) / 400.0f) + this.f20884f;
            this.f20884f = f12;
            if (f12 > 1.0f) {
                this.f20884f = 1.0f;
            }
            p9Var.setScaleX(this.f20884f);
            p9Var.setScaleY(this.f20884f);
            p9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f20883c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.p9 p9Var = this.f20881a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        sendAnimationData.f16667x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.f16668y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f20882b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f20882b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f20882b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f20882b.attributes.get(i10);
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
            StringBuilder f10 = vh.v2.f(str, " ");
            f10.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(f10.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachSticker));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z4) {
        this.h = z4;
    }

    @Override
    public void setPressed(boolean z4) {
        org.telegram.ui.Components.p9 p9Var = this.f20881a;
        if (p9Var.getImageReceiver().getPressed() != z4) {
            p9Var.getImageReceiver().setPressed(z4 ? 1 : 0);
            p9Var.invalidate();
        }
        super.setPressed(z4);
    }

    public void setScaled(boolean z4) {
        this.e = z4;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
