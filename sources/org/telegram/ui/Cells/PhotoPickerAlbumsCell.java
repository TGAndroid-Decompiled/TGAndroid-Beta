package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$10$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public final class PhotoPickerAlbumsCell extends FrameLayout {
    public final MediaController.AlbumEntry[] albumEntries;
    public final AlbumView[] albumViews;
    public int albumsCount;
    public final Paint backgroundPaint;
    public PhotoPickerAlbumsCellDelegate delegate;

    public final class AlbumView extends FrameLayout {
        public final TextView countTextView;
        public final BackupImageView imageView;
        public final TextView nameTextView;
        public final View selector;

        public AlbumView(Context context) {
            super(context);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundResource(R.drawable.album_shadow);
            addView(linearLayout, LayoutHelper.createFrame(-1, 60, 83));
            TextView textView = new TextView(context);
            this.nameTextView = textView;
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(-1);
            textView.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setMaxLines(1);
            textView.setGravity(80);
            TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(0, -1, 1.0f, 8, 0, 0, 5), context);
            this.countTextView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            textViewM.setTextColor(-1);
            textViewM.setSingleLine(true);
            textViewM.setEllipsize(truncateAt);
            textViewM.setMaxLines(1);
            textViewM.setGravity(80);
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -1, 4.0f, 0.0f, 7.0f, 5.0f));
            View view = new View(context);
            this.selector = view;
            view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            addView(view, LayoutHelper.createFrame(-1, -1.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            BackupImageView backupImageView = this.imageView;
            if (backupImageView.getImageReceiver().hasNotThumb() && backupImageView.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
            PhotoPickerAlbumsCell photoPickerAlbumsCell = PhotoPickerAlbumsCell.this;
            photoPickerAlbumsCell.backgroundPaint.setColor(Theme.getColor(null, Theme.key_chat_attachPhotoBackground, false));
            canvas.drawRect(0.0f, 0.0f, backupImageView.getMeasuredWidth(), backupImageView.getMeasuredHeight(), photoPickerAlbumsCell.backgroundPaint);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            this.selector.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
            return super.onTouchEvent(motionEvent);
        }
    }

    public interface PhotoPickerAlbumsCellDelegate {
    }

    public PhotoPickerAlbumsCell(Context context) {
        super(context);
        this.backgroundPaint = new Paint();
        this.albumEntries = new MediaController.AlbumEntry[4];
        this.albumViews = new AlbumView[4];
        for (int i = 0; i < 4; i++) {
            this.albumViews[i] = new AlbumView(context);
            addView(this.albumViews[i]);
            this.albumViews[i].setVisibility(4);
            this.albumViews[i].setTag(Integer.valueOf(i));
            this.albumViews[i].setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 16));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iM$3 = AndroidUtilities.isTablet() ? OKLCH.m$3(4.0f, this.albumsCount - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.albumsCount : OKLCH.m$3(4.0f, this.albumsCount - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.albumsCount;
        for (int i3 = 0; i3 < this.albumsCount; i3++) {
            View[] viewArr = this.albumViews;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + iM$3) * i3;
            layoutParams.width = iM$3;
            layoutParams.height = iM$3;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        super.onMeasure(i, ArticleViewer$10$$ExternalSyntheticOutline0.m(4.0f, iM$3, 1073741824));
    }

    public final void setAlbum(MediaController.AlbumEntry albumEntry, int i) {
        this.albumEntries[i] = albumEntry;
        AlbumView[] albumViewArr = this.albumViews;
        if (albumEntry == null) {
            albumViewArr[i].setVisibility(4);
            return;
        }
        AlbumView albumView = albumViewArr[i];
        albumView.imageView.setOrientation(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        BackupImageView backupImageView = albumView.imageView;
        if (photoEntry == null || photoEntry.path == null) {
            backupImageView.setImageDrawable(Theme.chat_attachEmptyDrawable);
        } else {
            backupImageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                backupImageView.setImage("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, Theme.chat_attachEmptyDrawable);
            } else {
                backupImageView.setImage("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, Theme.chat_attachEmptyDrawable);
            }
        }
        albumView.nameTextView.setText(albumEntry.bucketName);
        albumView.countTextView.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    public void setAlbumsCount(int i) {
        int i2 = 0;
        while (true) {
            AlbumView[] albumViewArr = this.albumViews;
            if (i2 >= albumViewArr.length) {
                this.albumsCount = i;
                return;
            } else {
                albumViewArr[i2].setVisibility(i2 < i ? 0 : 4);
                i2++;
            }
        }
    }

    public void setDelegate(PhotoPickerAlbumsCellDelegate photoPickerAlbumsCellDelegate) {
        this.delegate = photoPickerAlbumsCellDelegate;
    }
}
