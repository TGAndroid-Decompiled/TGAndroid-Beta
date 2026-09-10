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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tp;
import org.telegram.ui.PhotoViewer;
public final class r7 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f19895a;
    public final TextView f19896b;
    public final q5 f19897c;
    public final View d;
    public final tp e;
    public final FrameLayout f19898f;
    public AnimatorSet h;
    public MessageObject f19899n;
    public final v7 f19900r;

    public r7(v7 v7Var, Context context) {
        super(context);
        this.f19900r = v7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19898f = frameLayout;
        addView(frameLayout, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f19895a = w9Var;
        w9Var.getImageReceiver().setNeedsQualityThumb(true);
        w9Var.getImageReceiver().setShouldGenerateQualityThumb(true);
        frameLayout.addView(w9Var, w7.a6.c(-1.0f, -1));
        q5 q5Var = new q5(context, 1);
        q5Var.f19717b = new RectF();
        this.f19897c = q5Var;
        q5Var.setWillNotDraw(false);
        q5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(q5Var, w7.a6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.play_mini_video);
        q5Var.addView(imageView, w7.a6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f19896b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q5Var.addView(textView, w7.a6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, w7.a6.c(-1.0f, -1));
        tp tpVar = new tp(context, 21, null);
        this.e = tpVar;
        tpVar.setVisibility(4);
        tpVar.b(-1, org.telegram.ui.ActionBar.j6.Lh, org.telegram.ui.ActionBar.j6.f18056k7);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(1);
        addView(tpVar, w7.a6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
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
        if (!this.e.f27462a.f21057q) {
            org.telegram.ui.Components.w9 w9Var = this.f19895a;
            if (w9Var.getImageReceiver().hasBitmapImage() && w9Var.getImageReceiver().getCurrentAlpha() == 1.0f && !PhotoViewer.M1(this.f19899n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f19900r.f20563n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f19899n.isLivePhoto()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachLivePhoto));
        } else if (this.f19899n.isVideo()) {
            StringBuilder sb2 = new StringBuilder();
            em.l(R.string.AttachVideo, ", ", sb2);
            sb2.append(LocaleController.formatDuration((int) this.f19899n.getDuration()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachPhoto));
        }
        if (this.e.f27462a.f21057q) {
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
        this.f19899n = messageObject;
        this.f19895a.getImageReceiver().setVisible(!PhotoViewer.M1(messageObject), false);
        if (!TextUtils.isEmpty(MessagesController.getInstance(this.f19900r.f20565s).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
            this.f19897c.setVisibility(4);
            this.f19895a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (messageObject.isVideo()) {
            this.f19897c.setVisibility(0);
            this.f19896b.setText(AndroidUtilities.formatShortDuration((int) messageObject.getDuration()));
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            if (closestPhotoSizeWithSize != null) {
                if (messageObject.strippedThumb != null) {
                    this.f19895a.i(ImageLocation.getForDocument(photoSize, document), "100_100", null, messageObject.strippedThumb, messageObject);
                    return;
                } else {
                    this.f19895a.m(ImageLocation.getForDocument(photoSize, document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                    return;
                }
            }
            this.f19895a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !messageObject.photoThumbs.isEmpty()) {
            this.f19897c.setVisibility(4);
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
            if (!messageObject.mediaExists && !DownloadController.getInstance(this.f19900r.f20565s).canDownloadMedia(messageObject)) {
                BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                if (bitmapDrawable != null) {
                    this.f19895a.m(null, null, null, null, bitmapDrawable, null, 0, messageObject);
                    return;
                } else {
                    this.f19895a.m(null, null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                    return;
                }
            }
            if (closestPhotoSizeWithSize4 != closestPhotoSizeWithSize3) {
                photoSize = closestPhotoSizeWithSize3;
            }
            if (messageObject.strippedThumb != null) {
                ImageReceiver imageReceiver = this.f19895a.getImageReceiver();
                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                long j3 = 0;
                BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                if (closestPhotoSizeWithSize4 != null) {
                    j3 = closestPhotoSizeWithSize4.size;
                }
                if (messageObject.shouldEncryptPhotoOrVideo()) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                imageReceiver.setImage(forObject, "100_100", null, null, bitmapDrawable2, j3, null, messageObject, i11);
                return;
            }
            long j10 = 0;
            ImageReceiver imageReceiver2 = this.f19895a.getImageReceiver();
            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
            ImageLocation forObject3 = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
            if (closestPhotoSizeWithSize4 != null) {
                j10 = closestPhotoSizeWithSize4.size;
            }
            if (messageObject.shouldEncryptPhotoOrVideo()) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            imageReceiver2.setImage(forObject2, "100_100", forObject3, "b", j10, null, messageObject, i10);
            return;
        }
        this.f19897c.setVisibility(4);
        this.f19895a.setImageResource(R.drawable.photo_placeholder_in);
    }
}
