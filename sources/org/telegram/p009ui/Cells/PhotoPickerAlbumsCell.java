package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.MediaController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.LayoutHelper;

public class PhotoPickerAlbumsCell extends FrameLayout {
    private MediaController.AlbumEntry[] albumEntries;
    private AlbumView[] albumViews;
    private int albumsCount;
    private Paint backgroundPaint;
    private PhotoPickerAlbumsCellDelegate delegate;

    public interface PhotoPickerAlbumsCellDelegate {
        void didSelectAlbum(MediaController.AlbumEntry albumEntry);
    }

    public class AlbumView extends FrameLayout {
        private TextView countTextView;
        private BackupImageView imageView;
        private TextView nameTextView;
        private View selector;

        public AlbumView(Context context) {
            super(context);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundResource(C1072R.C1073drawable.album_shadow);
            addView(linearLayout, LayoutHelper.createFrame(-1, 60, 83));
            TextView textView = new TextView(context);
            this.nameTextView = textView;
            textView.setTextSize(1, 13.0f);
            this.nameTextView.setTextColor(-1);
            this.nameTextView.setSingleLine(true);
            this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.nameTextView.setMaxLines(1);
            this.nameTextView.setGravity(80);
            linearLayout.addView(this.nameTextView, LayoutHelper.createLinear(0, -1, 1.0f, 8, 0, 0, 5));
            TextView textView2 = new TextView(context);
            this.countTextView = textView2;
            textView2.setTextSize(1, 13.0f);
            this.countTextView.setTextColor(-1);
            this.countTextView.setSingleLine(true);
            this.countTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.countTextView.setMaxLines(1);
            this.countTextView.setGravity(80);
            linearLayout.addView(this.countTextView, LayoutHelper.createLinear(-2, -1, 4.0f, 0.0f, 7.0f, 5.0f));
            View view = new View(context);
            this.selector = view;
            view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            addView(this.selector, LayoutHelper.createFrame(-1, -1.0f));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (Build.VERSION.SDK_INT >= 21) {
                this.selector.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.imageView.getImageReceiver().hasNotThumb() && this.imageView.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
            PhotoPickerAlbumsCell.this.backgroundPaint.setColor(Theme.getColor("chat_attachPhotoBackground"));
            canvas.drawRect(0.0f, 0.0f, this.imageView.getMeasuredWidth(), this.imageView.getMeasuredHeight(), PhotoPickerAlbumsCell.this.backgroundPaint);
        }
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
            this.albumViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoPickerAlbumsCell.this.lambda$new$0(view);
                }
            });
        }
    }

    public void lambda$new$0(View view) {
        PhotoPickerAlbumsCellDelegate photoPickerAlbumsCellDelegate = this.delegate;
        if (photoPickerAlbumsCellDelegate != null) {
            photoPickerAlbumsCellDelegate.didSelectAlbum(this.albumEntries[((Integer) view.getTag()).intValue()]);
        }
    }

    public void setAlbumsCount(int i) {
        int i2 = 0;
        while (true) {
            AlbumView[] albumViewArr = this.albumViews;
            if (i2 < albumViewArr.length) {
                albumViewArr[i2].setVisibility(i2 < i ? 0 : 4);
                i2++;
            } else {
                this.albumsCount = i;
                return;
            }
        }
    }

    public void setDelegate(PhotoPickerAlbumsCellDelegate photoPickerAlbumsCellDelegate) {
        this.delegate = photoPickerAlbumsCellDelegate;
    }

    public void setAlbum(int i, MediaController.AlbumEntry albumEntry) {
        this.albumEntries[i] = albumEntry;
        if (albumEntry != null) {
            AlbumView albumView = this.albumViews[i];
            albumView.imageView.setOrientation(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry == null || photoEntry.path == null) {
                albumView.imageView.setImageDrawable(Theme.chat_attachEmptyDrawable);
            } else {
                albumView.imageView.setOrientation(albumEntry.coverPhoto.orientation, true);
                if (albumEntry.coverPhoto.isVideo) {
                    BackupImageView backupImageView = albumView.imageView;
                    backupImageView.setImage("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, Theme.chat_attachEmptyDrawable);
                } else {
                    BackupImageView backupImageView2 = albumView.imageView;
                    backupImageView2.setImage("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, Theme.chat_attachEmptyDrawable);
                }
            }
            albumView.nameTextView.setText(albumEntry.bucketName);
            albumView.countTextView.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        this.albumViews[i].setVisibility(4);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int m35dp;
        if (AndroidUtilities.isTablet()) {
            m35dp = ((AndroidUtilities.m35dp(490.0f) - AndroidUtilities.m35dp(12.0f)) - ((this.albumsCount - 1) * AndroidUtilities.m35dp(4.0f))) / this.albumsCount;
        } else {
            m35dp = ((AndroidUtilities.displaySize.x - AndroidUtilities.m35dp(12.0f)) - ((this.albumsCount - 1) * AndroidUtilities.m35dp(4.0f))) / this.albumsCount;
        }
        for (int i3 = 0; i3 < this.albumsCount; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.albumViews[i3].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.m35dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.m35dp(4.0f) + m35dp) * i3;
            layoutParams.width = m35dp;
            layoutParams.height = m35dp;
            layoutParams.gravity = 51;
            this.albumViews[i3].setLayoutParams(layoutParams);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(4.0f) + m35dp, 1073741824));
    }
}
