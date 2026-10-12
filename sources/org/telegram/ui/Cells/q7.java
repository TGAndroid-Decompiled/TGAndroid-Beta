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
import org.telegram.ui.Components.aq;
import org.telegram.ui.PhotoViewer;
public final class q7 extends FrameLayout {
    public final org.telegram.ui.Components.z9 f21730a;
    public final TextView f21731b;
    public final q5 f21732c;
    public final View d;
    public final aq e;
    public final FrameLayout f21733f;
    public AnimatorSet h;
    public MessageObject f21734n;
    public final u7 f21735r;

    public q7(u7 u7Var, Context context) {
        super(context);
        this.f21735r = u7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21733f = frameLayout;
        addView(frameLayout, w7.a6.d(-1.0f, -1));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f21730a = z9Var;
        z9Var.getImageReceiver().setNeedsQualityThumb(true);
        z9Var.getImageReceiver().setShouldGenerateQualityThumb(true);
        frameLayout.addView(z9Var, w7.a6.d(-1.0f, -1));
        q5 q5Var = new q5(context, 1);
        q5Var.f21729b = new RectF();
        this.f21732c = q5Var;
        q5Var.setWillNotDraw(false);
        q5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(q5Var, w7.a6.a(17.0f, 4.0f, 0.0f, 0.0f, 4.0f, -2, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.play_mini_video);
        q5Var.addView(imageView, w7.a6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f21731b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q5Var.addView(textView, w7.a6.a(-2.0f, 13.0f, -0.7f, 0.0f, 0.0f, -2, 19));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
        addView(view, w7.a6.d(-1.0f, -1));
        aq aqVar = new aq(context, 21, null);
        this.e = aqVar;
        aqVar.setVisibility(4);
        aqVar.b(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.f20029k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(1);
        addView(aqVar, w7.a6.a(24.0f, 0.0f, 1.0f, 1.0f, 0.0f, 24, 53));
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
        if (!this.e.f23604a.f23092q) {
            org.telegram.ui.Components.z9 z9Var = this.f21730a;
            if (z9Var.getImageReceiver().hasBitmapImage() && z9Var.getImageReceiver().getCurrentAlpha() == 1.0f && !PhotoViewer.N1(this.f21734n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f21735r.f22539n);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f21734n.isLivePhoto()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachLivePhoto));
        } else if (this.f21734n.isVideo()) {
            StringBuilder sb2 = new StringBuilder();
            d0.n(R.string.AttachVideo, ", ", sb2);
            sb2.append(LocaleController.formatDuration((int) this.f21734n.getDuration()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachPhoto));
        }
        if (this.e.f23604a.f23092q) {
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
        this.f21734n = messageObject;
        this.f21730a.getImageReceiver().setVisible(!PhotoViewer.N1(messageObject), false);
        if (!TextUtils.isEmpty(MessagesController.getInstance(this.f21735r.f22541s).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
            this.f21732c.setVisibility(4);
            this.f21730a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        TLRPC.PhotoSize photoSize = null;
        if (messageObject.isVideo()) {
            this.f21732c.setVisibility(0);
            this.f21731b.setText(AndroidUtilities.formatShortDuration((int) messageObject.getDuration()));
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                photoSize = closestPhotoSizeWithSize2;
            }
            if (closestPhotoSizeWithSize != null) {
                if (messageObject.strippedThumb != null) {
                    this.f21730a.i(ImageLocation.getForDocument(photoSize, document), "100_100", null, messageObject.strippedThumb, messageObject);
                    return;
                } else {
                    this.f21730a.m(ImageLocation.getForDocument(photoSize, document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                    return;
                }
            }
            this.f21730a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !messageObject.photoThumbs.isEmpty()) {
            this.f21732c.setVisibility(4);
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
            if (!messageObject.mediaExists && !DownloadController.getInstance(this.f21735r.f22541s).canDownloadMedia(messageObject)) {
                BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                if (bitmapDrawable != null) {
                    this.f21730a.m(null, null, null, null, bitmapDrawable, null, 0, messageObject);
                    return;
                } else {
                    this.f21730a.m(null, null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                    return;
                }
            }
            if (closestPhotoSizeWithSize4 != closestPhotoSizeWithSize3) {
                photoSize = closestPhotoSizeWithSize3;
            }
            if (messageObject.strippedThumb != null) {
                ImageReceiver imageReceiver = this.f21730a.getImageReceiver();
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
            ImageReceiver imageReceiver2 = this.f21730a.getImageReceiver();
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
        this.f21732c.setVisibility(4);
        this.f21730a.setImageResource(R.drawable.photo_placeholder_in);
    }
}
