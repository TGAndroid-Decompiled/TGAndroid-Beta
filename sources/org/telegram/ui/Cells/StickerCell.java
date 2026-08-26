package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumLockIconView;

public final class StickerCell extends FrameLayout {
    public boolean clearsInputField;
    public final BackupImageView imageView;
    public boolean isPremiumSticker;
    public long lastUpdateTime;
    public Object parentObject;
    public final PremiumLockIconView premiumIconView;
    public final Theme.ResourcesProvider resourcesProvider;
    public float scale;
    public boolean scaled;
    public boolean showPremiumLock;
    public TLRPC.Document sticker;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public StickerCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setAspectFit(true);
        backupImageView.setLayerNum(1);
        addView(backupImageView, LayoutHelper.createFrame(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
        setFocusable(true);
        PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context, PremiumLockIconView.TYPE_STICKERS_PREMIUM_LOCKED, null);
        this.premiumIconView = premiumLockIconView;
        premiumLockIconView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        premiumLockIconView.setImageReceiver(backupImageView.getImageReceiver());
        addView(premiumLockIconView, LayoutHelper.createFrame(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        float f;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        BackupImageView backupImageView = this.imageView;
        if (view == backupImageView && (((z = this.scaled) && this.scale != 0.8f) || (!z && this.scale != 1.0f))) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - this.lastUpdateTime;
            this.lastUpdateTime = jCurrentTimeMillis;
            if (this.scaled) {
                float f2 = this.scale;
                if (f2 != 0.8f) {
                    float f3 = f2 - (j2 / 400.0f);
                    this.scale = f3;
                    if (f3 < 0.8f) {
                        this.scale = 0.8f;
                    }
                } else {
                    f = (j2 / 400.0f) + this.scale;
                    this.scale = f;
                    if (f > 1.0f) {
                        this.scale = 1.0f;
                    }
                }
            } else {
                f = (j2 / 400.0f) + this.scale;
                this.scale = f;
                if (f > 1.0f) {
                    this.scale = 1.0f;
                }
            }
            backupImageView.setScaleX(this.scale);
            backupImageView.setScaleY(this.scale);
            backupImageView.invalidate();
            invalidate();
        }
        return zDrawChild;
    }

    public Object getParentObject() {
        return this.parentObject;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        BackupImageView backupImageView = this.imageView;
        ImageReceiver imageReceiver = backupImageView.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        backupImageView.getLocationInWindow(iArr);
        sendAnimationData.x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.sticker;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.sticker == null) {
            return;
        }
        String str = null;
        for (int i = 0; i < this.sticker.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = this.sticker.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                str = (str2 == null || str2.length() <= 0) ? null : documentAttribute.alt;
            }
        }
        if (str != null) {
            StringBuilder sbM = Log.m(str, " ");
            sbM.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(sbM.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachSticker));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), 1073741824));
    }

    public void setClearsInputField(boolean z) {
        this.clearsInputField = z;
    }

    @Override
    public void setPressed(boolean z) {
        BackupImageView backupImageView = this.imageView;
        if (backupImageView.getImageReceiver().getPressed() != z) {
            backupImageView.getImageReceiver().setPressed(z ? 1 : 0);
            backupImageView.invalidate();
        }
        super.setPressed(z);
    }

    public void setScaled(boolean z) {
        this.scaled = z;
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }
}
