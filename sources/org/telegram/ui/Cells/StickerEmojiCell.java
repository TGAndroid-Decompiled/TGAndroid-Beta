package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Vibrator;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public class StickerEmojiCell extends FrameLayout {
    private static AccelerateInterpolator interpolator = new AccelerateInterpolator(0.5f);
    private boolean changingAlpha;
    private String currentEmoji;
    private TextView emojiTextView;
    private boolean fromEmojiPanel;
    private BackupImageView imageView;
    private boolean isPremiumSticker;
    private long lastUpdateTime;
    private Object parentObject;
    private PremiumLockIconView premiumIconView;
    private boolean recent;
    private float scale;
    private boolean scaled;
    private TLRPC$Document sticker;
    private SendMessagesHelper.ImportingSticker stickerPath;
    private long time;
    private float alpha = 1.0f;
    private int currentAccount = UserConfig.selectedAccount;
    private float premiumAlpha = 1.0f;

    public StickerEmojiCell(Context context, boolean z) {
        super(context);
        this.fromEmojiPanel = z;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setAspectFit(true);
        this.imageView.setLayerNum(1);
        this.imageView.getImageReceiver().setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z2, boolean z3, boolean z4) {
                StickerEmojiCell.this.lambda$new$0(imageReceiver, z2, z3, z4);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        });
        addView(this.imageView, LayoutHelper.createFrame(66, 66, 17));
        TextView textView = new TextView(context);
        this.emojiTextView = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(Theme.getColor("featuredStickers_addButton"));
        PremiumLockIconView premiumLockIconView = new PremiumLockIconView(context);
        this.premiumIconView = premiumLockIconView;
        premiumLockIconView.setImageReceiver(this.imageView.getImageReceiver());
        this.premiumIconView.setImageResource(R.drawable.msg_premium_lock);
        addView(this.premiumIconView, LayoutHelper.createFrame(24, 24.0f, 85, 0.0f, 0.0f, 4.0f, 4.0f));
        setFocusable(true);
    }

    public void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        this.premiumIconView.setWaitingImage();
    }

    public TLRPC$Document getSticker() {
        return this.sticker;
    }

    public SendMessagesHelper.ImportingSticker getStickerPath() {
        SendMessagesHelper.ImportingSticker importingSticker = this.stickerPath;
        if (importingSticker == null || !importingSticker.validated) {
            return null;
        }
        return importingSticker;
    }

    public String getEmoji() {
        return this.currentEmoji;
    }

    public Object getParentObject() {
        return this.parentObject;
    }

    public boolean isRecent() {
        return this.recent;
    }

    public void setRecent(boolean z) {
        this.recent = z;
    }

    public void setSticker(TLRPC$Document tLRPC$Document, Object obj, boolean z) {
        setSticker(tLRPC$Document, null, obj, null, z);
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        String str = importingSticker.emoji;
        setSticker(null, importingSticker, null, str, str != null);
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        ImageReceiver imageReceiver = this.imageView.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        int[] iArr = new int[2];
        this.imageView.getLocationInWindow(iArr);
        sendAnimationData.x = imageReceiver.getCenterX() + iArr[0];
        sendAnimationData.y = imageReceiver.getCenterY() + iArr[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
    }

    public void setSticker(org.telegram.tgnet.TLRPC$Document r32, org.telegram.messenger.SendMessagesHelper.ImportingSticker r33, java.lang.Object r34, java.lang.String r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.StickerEmojiCell.setSticker(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.SendMessagesHelper$ImportingSticker, java.lang.Object, java.lang.String, boolean):void");
    }

    public void disable() {
        this.changingAlpha = true;
        this.alpha = 0.5f;
        this.time = 0L;
        this.imageView.getImageReceiver().setAlpha(this.alpha * this.premiumAlpha);
        this.imageView.invalidate();
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public void setScaled(boolean z) {
        this.scaled = z;
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public boolean isDisabled() {
        return this.changingAlpha;
    }

    public boolean showingBitmap() {
        return this.imageView.getImageReceiver().getBitmap() != null;
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    @Override
    public void invalidate() {
        this.emojiTextView.invalidate();
        super.invalidate();
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.imageView && (this.changingAlpha || (((z = this.scaled) && this.scale != 0.8f) || (!z && this.scale != 1.0f)))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - this.lastUpdateTime;
            this.lastUpdateTime = currentTimeMillis;
            if (this.changingAlpha) {
                long j3 = this.time + j2;
                this.time = j3;
                if (j3 > 1050) {
                    this.time = 1050L;
                }
                float interpolation = (interpolator.getInterpolation(((float) this.time) / 150.0f) * 0.5f) + 0.5f;
                this.alpha = interpolation;
                if (interpolation >= 1.0f) {
                    this.changingAlpha = false;
                    this.alpha = 1.0f;
                }
                this.imageView.getImageReceiver().setAlpha(this.alpha * this.premiumAlpha);
            } else {
                if (this.scaled) {
                    float f = this.scale;
                    if (f != 0.8f) {
                        float f2 = f - (((float) j2) / 400.0f);
                        this.scale = f2;
                        if (f2 < 0.8f) {
                            this.scale = 0.8f;
                        }
                    }
                }
                float f3 = this.scale + (((float) j2) / 400.0f);
                this.scale = f3;
                if (f3 > 1.0f) {
                    this.scale = 1.0f;
                }
            }
            this.imageView.setScaleX(this.scale);
            this.imageView.setScaleY(this.scale);
            this.imageView.invalidate();
            invalidate();
        }
        return drawChild;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString("AttachSticker", R.string.AttachSticker);
        if (this.sticker != null) {
            int i = 0;
            while (true) {
                if (i >= this.sticker.attributes.size()) {
                    break;
                }
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.sticker.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                    String str = tLRPC$DocumentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        TextView textView = this.emojiTextView;
                        textView.setText(Emoji.replaceEmoji(tLRPC$DocumentAttribute.alt, textView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(16.0f), false));
                        string = tLRPC$DocumentAttribute.alt + " " + string;
                    }
                } else {
                    i++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void showRequirePremiumAnimation() {
        if (this.premiumIconView != null) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.premiumIconView, 2.0f, 0);
        }
    }
}
