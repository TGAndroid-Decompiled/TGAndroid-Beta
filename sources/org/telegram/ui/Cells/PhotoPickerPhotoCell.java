package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.ThemePreviewActivity;

public final class PhotoPickerPhotoCell extends FrameLayout {
    public final CheckBox2 checkBox;
    public final FrameLayout checkFrame;
    public int extraWidth;
    public final BackupImageView imageView;
    public int itemWidth;
    public final ThemePreviewActivity.AnonymousClass14 videoInfoContainer;
    public final TextView videoTextView;

    public PhotoPickerPhotoCell(Context context) {
        super(context);
        new Paint();
        setWillNotDraw(false);
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
        addView(backupImageView, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.checkFrame = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(42, 42, 53));
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = new ThemePreviewActivity.AnonymousClass14(context);
        this.videoInfoContainer = anonymousClass14;
        anonymousClass14.setWillNotDraw(false);
        anonymousClass14.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(anonymousClass14, LayoutHelper.createFrame(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        anonymousClass14.addView(imageView, LayoutHelper.createFrame(-2, -2, 19));
        TextView textView = new TextView(context);
        this.videoTextView = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        anonymousClass14.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 24);
        this.checkBox = checkBox2;
        checkBox2.setDrawBackgroundAsArc(11);
        checkBox2.checkBoxBase.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
        addView(checkBox2, LayoutHelper.createFrame(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        checkBox2.setVisibility(0);
        setFocusable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CheckBox2 checkBox2 = this.checkBox;
        checkBox2.checkBoxBase.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.itemWidth + this.extraWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.itemWidth, 1073741824));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        BackupImageView backupImageView = this.imageView;
        if (str != null) {
            backupImageView.setImage(str, null, drawable);
            return;
        }
        if (photoEntry.path == null) {
            backupImageView.setImageDrawable(drawable);
            return;
        }
        backupImageView.imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
        boolean zIsLivePhoto = photoEntry.isLivePhoto();
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = this.videoInfoContainer;
        if (zIsLivePhoto) {
            anonymousClass14.setVisibility(4);
            setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
            backupImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            return;
        }
        if (!photoEntry.isVideo) {
            anonymousClass14.setVisibility(4);
            setContentDescription(LocaleController.getString(R.string.AttachPhoto));
            backupImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            return;
        }
        anonymousClass14.setVisibility(0);
        this.videoTextView.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
        StringBuilder sb = new StringBuilder();
        zzlf.m(R.string.AttachVideo, ", ", sb);
        sb.append(LocaleController.formatDuration(photoEntry.duration));
        setContentDescription(sb.toString());
        backupImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
    }

    public void setNum(int i) {
        this.checkBox.setNum(i);
    }

    public void setImage(MediaController.SearchImage searchImage) {
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        BackupImageView backupImageView = this.imageView;
        if (photoSize != null) {
            backupImageView.setImage(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            backupImageView.setImage(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            backupImageView.setImage(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            backupImageView.setImage(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            backupImageView.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
        } else {
            backupImageView.setImageDrawable(drawable);
        }
    }
}
