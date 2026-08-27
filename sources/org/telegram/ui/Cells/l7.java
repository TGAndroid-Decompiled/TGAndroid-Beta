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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
import org.telegram.ui.PhotoViewer;

public final class l7 extends FrameLayout {

    public final org.telegram.ui.Components.n9 f24621a;

    public final TextView f24622b;

    public final n5 f24623c;
    public final View d;

    public final bp f24624e;

    public final FrameLayout f24625f;
    public AnimatorSet h;

    public MessageObject f24626n;

    public final p7 f24627r;

    public l7(p7 p7Var, Context context) {
        super(context);
        this.f24627r = p7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24625f = frameLayout;
        addView(frameLayout, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24621a = n9Var;
        n9Var.getImageReceiver().setNeedsQualityThumb(true);
        n9Var.getImageReceiver().setShouldGenerateQualityThumb(true);
        frameLayout.addView(n9Var, h7.z5.c(-1.0f, -1));
        n5 n5Var = new n5(context, 1);
        n5Var.f24724b = new RectF();
        this.f24623c = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(n5Var, h7.z5.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.play_mini_video);
        n5Var.addView(imageView, h7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f24622b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, h7.z5.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        addView(view, h7.z5.c(-1.0f, -1));
        bp bpVar = new bp(context, 21, null);
        this.f24624e = bpVar;
        bpVar.setVisibility(4);
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(1);
        addView(bpVar, h7.z5.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
        if (!this.f24624e.f27188a.f26309q) {
            org.telegram.ui.Components.n9 n9Var = this.f24621a;
            if (n9Var.getImageReceiver().hasBitmapImage() && n9Var.getImageReceiver().getCurrentAlpha() == 1.0f && !PhotoViewer.M1(this.f24626n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f24627r.f24997n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f24626n.isLivePhoto()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachLivePhoto));
        } else if (this.f24626n.isVideo()) {
            StringBuilder sb2 = new StringBuilder();
            rl.j(R.string.AttachVideo, ", ", sb2);
            sb2.append(LocaleController.formatDuration((int) this.f24626n.getDuration()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachPhoto));
        }
        if (this.f24624e.f27188a.f26309q) {
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
        TLRPC.PhotoSize photoSize;
        this.f24626n = messageObject;
        this.f24621a.getImageReceiver().setVisible(!PhotoViewer.M1(messageObject), false);
        if (!TextUtils.isEmpty(MessagesController.getInstance(this.f24627r.f24999s).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
            this.f24623c.setVisibility(4);
            this.f24621a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        if (messageObject.isVideo()) {
            this.f24623c.setVisibility(0);
            this.f24622b.setText(AndroidUtilities.formatShortDuration((int) messageObject.getDuration()));
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            photoSize = closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null;
            if (closestPhotoSizeWithSize == null) {
                this.f24621a.setImageResource(R.drawable.photo_placeholder_in);
                return;
            } else if (messageObject.strippedThumb != null) {
                this.f24621a.i(ImageLocation.getForDocument(photoSize, document), "100_100", null, messageObject.strippedThumb, messageObject);
                return;
            } else {
                this.f24621a.m(ImageLocation.getForDocument(photoSize, document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                return;
            }
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null || messageObject.photoThumbs.isEmpty()) {
            this.f24623c.setVisibility(4);
            this.f24621a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        this.f24623c.setVisibility(4);
        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
        if (!messageObject.mediaExists && !DownloadController.getInstance(this.f24627r.f24999s).canDownloadMedia(messageObject)) {
            BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
            if (bitmapDrawable != null) {
                this.f24621a.m(null, null, null, null, bitmapDrawable, null, 0, messageObject);
                return;
            } else {
                this.f24621a.m(null, null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                return;
            }
        }
        photoSize = closestPhotoSizeWithSize4 != closestPhotoSizeWithSize3 ? closestPhotoSizeWithSize3 : null;
        if (messageObject.strippedThumb != null) {
            ImageReceiver imageReceiver = this.f24621a.getImageReceiver();
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
            long j10 = 0;
            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
            if (closestPhotoSizeWithSize4 != null) {
                j10 = closestPhotoSizeWithSize4.size;
            }
            imageReceiver.setImage(forObject, "100_100", null, null, bitmapDrawable2, j10, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
            return;
        }
        long j11 = 0;
        ImageReceiver imageReceiver2 = this.f24621a.getImageReceiver();
        ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
        ImageLocation forObject3 = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
        if (closestPhotoSizeWithSize4 != null) {
            j11 = closestPhotoSizeWithSize4.size;
        }
        imageReceiver2.setImage(forObject2, "100_100", forObject3, "b", j11, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
    }
}
