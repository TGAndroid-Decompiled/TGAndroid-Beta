package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zp;
import org.telegram.ui.PhotoViewer;
public final class t7 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f25452a;
    public final TextView f25453b;
    public final u5 f25454c;
    public final View d;
    public final zp e;
    public final FrameLayout f25455f;
    public AnimatorSet h;
    public MessageObject f25456n;
    public final x7 f25457r;

    public t7(x7 x7Var, Context context) {
        super(context);
        this.f25457r = x7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25455f = frameLayout;
        addView(frameLayout, gb1.g(-1.0f, -1));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f25452a = y9Var;
        y9Var.getImageReceiver().setNeedsQualityThumb(true);
        y9Var.getImageReceiver().setShouldGenerateQualityThumb(true);
        frameLayout.addView(y9Var, gb1.g(-1.0f, -1));
        u5 u5Var = new u5(context, 1);
        u5Var.f25485b = new RectF();
        this.f25454c = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(u5Var, gb1.h(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.play_mini_video);
        u5Var.addView(imageView, gb1.i(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f25453b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        u5Var.addView(textView, gb1.h(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
        addView(view, gb1.g(-1.0f, -1));
        zp zpVar = new zp(context, 21, null);
        this.e = zpVar;
        zpVar.setVisibility(4);
        zpVar.b(-1, org.telegram.ui.ActionBar.y6.Lh, org.telegram.ui.ActionBar.y6.f23485k7);
        zpVar.setDrawUnchecked(false);
        zpVar.setDrawBackgroundAsArc(1);
        addView(zpVar, gb1.h(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.e.f35382a.f26089q) {
            org.telegram.ui.Components.y9 y9Var = this.f25452a;
            if (y9Var.getImageReceiver().hasBitmapImage() && y9Var.getImageReceiver().getCurrentAlpha() == 1.0f && !PhotoViewer.P1(this.f25456n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f25457r.f25723n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f25456n.isLivePhoto()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachLivePhoto));
        } else if (this.f25456n.isVideo()) {
            StringBuilder sb2 = new StringBuilder();
            org.telegram.ui.d3.p(R.string.AttachVideo, ", ", sb2);
            sb2.append(LocaleController.formatDuration((int) this.f25456n.getDuration()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachPhoto));
        }
        if (this.e.f35382a.f26089q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(MessageObject messageObject) {
        int i10;
        int i11;
        this.f25456n = messageObject;
        this.f25452a.getImageReceiver().setVisible(!PhotoViewer.P1(messageObject), false);
        if (!TextUtils.isEmpty(MessagesController.getInstance(this.f25457r.f25725s).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
            this.f25454c.setVisibility(4);
            this.f25452a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (messageObject.isVideo()) {
            this.f25454c.setVisibility(0);
            this.f25453b.setText(AndroidUtilities.formatShortDuration((int) messageObject.getDuration()));
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            if (closestPhotoSizeWithSize != null) {
                if (messageObject.strippedThumb != null) {
                    this.f25452a.i(ImageLocation.getForDocument(photoSize, document), "100_100", null, messageObject.strippedThumb, messageObject);
                    return;
                } else {
                    this.f25452a.m(ImageLocation.getForDocument(photoSize, document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                    return;
                }
            }
            this.f25452a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !messageObject.photoThumbs.isEmpty()) {
            this.f25454c.setVisibility(4);
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
            if (!messageObject.mediaExists && !DownloadController.getInstance(this.f25457r.f25725s).canDownloadMedia(messageObject)) {
                BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                if (bitmapDrawable != null) {
                    this.f25452a.m(null, null, null, null, bitmapDrawable, null, 0, messageObject);
                    return;
                } else {
                    this.f25452a.m(null, null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                    return;
                }
            }
            if (closestPhotoSizeWithSize4 != closestPhotoSizeWithSize3) {
                photoSize = closestPhotoSizeWithSize3;
            }
            if (messageObject.strippedThumb != null) {
                ImageReceiver imageReceiver = this.f25452a.getImageReceiver();
                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                long j10 = 0;
                BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                if (closestPhotoSizeWithSize4 != null) {
                    j10 = closestPhotoSizeWithSize4.size;
                }
                if (messageObject.shouldEncryptPhotoOrVideo()) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                imageReceiver.setImage(forObject, "100_100", null, null, bitmapDrawable2, j10, null, messageObject, i11);
                return;
            }
            long j11 = 0;
            ImageReceiver imageReceiver2 = this.f25452a.getImageReceiver();
            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
            ImageLocation forObject3 = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
            if (closestPhotoSizeWithSize4 != null) {
                j11 = closestPhotoSizeWithSize4.size;
            }
            if (messageObject.shouldEncryptPhotoOrVideo()) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            imageReceiver2.setImage(forObject2, "100_100", forObject3, "b", j11, null, messageObject, i10);
            return;
        }
        this.f25454c.setVisibility(4);
        this.f25452a.setImageResource(R.drawable.photo_placeholder_in);
    }
}
