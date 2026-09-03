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
    public org.telegram.ui.Components.p9 f22612a;
    public TLRPC.Document f22613b;
    public Object f22614c;
    public long d;
    public boolean f22615e;
    public float f22616f;
    public boolean h;
    public fg.r1 f22617n;
    public boolean f22618r;
    public boolean f22619s;
    public org.telegram.ui.ActionBar.g6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.p9 p9Var = this.f22612a;
        if (view == p9Var && (((z4 = this.f22615e) && this.f22616f != 0.8f) || (!z4 && this.f22616f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.f22615e) {
                float f10 = this.f22616f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (((float) j11) / 400.0f);
                    this.f22616f = f11;
                    if (f11 < 0.8f) {
                        this.f22616f = 0.8f;
                    }
                    p9Var.setScaleX(this.f22616f);
                    p9Var.setScaleY(this.f22616f);
                    p9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (((float) j11) / 400.0f) + this.f22616f;
            this.f22616f = f12;
            if (f12 > 1.0f) {
                this.f22616f = 1.0f;
            }
            p9Var.setScaleX(this.f22616f);
            p9Var.setScaleY(this.f22616f);
            p9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.f22614c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.p9 p9Var = this.f22612a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        sendAnimationData.f18055x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.f18056y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.f22613b;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f22613b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.f22613b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.f22613b.attributes.get(i10);
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
            StringBuilder f10 = w.c.f(str, " ");
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
        org.telegram.ui.Components.p9 p9Var = this.f22612a;
        if (p9Var.getImageReceiver().getPressed() != z4) {
            p9Var.getImageReceiver().setPressed(z4 ? 1 : 0);
            p9Var.invalidate();
        }
        super.setPressed(z4);
    }

    public void setScaled(boolean z4) {
        this.f22615e = z4;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
