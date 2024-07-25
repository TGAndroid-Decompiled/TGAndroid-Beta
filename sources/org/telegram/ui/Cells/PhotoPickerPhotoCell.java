package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
public class PhotoPickerPhotoCell extends FrameLayout {
    public CheckBox2 checkBox;
    public FrameLayout checkFrame;
    private int extraWidth;
    public BackupImageView imageView;
    private int itemWidth;
    public FrameLayout videoInfoContainer;
    public TextView videoTextView;

    public PhotoPickerPhotoCell(Context context) {
        super(context);
        new Paint();
        setWillNotDraw(false);
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
        addView(this.imageView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.checkFrame = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(42, 42, 53));
        FrameLayout frameLayout2 = new FrameLayout(this, context) {
            private Path path = new Path();
            float[] radii = new float[8];
            private RectF rect = new RectF();
            private Paint paint = new Paint(1);

            @Override
            protected void onDraw(Canvas canvas) {
                this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = this.radii;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float dp = AndroidUtilities.dp(4.0f);
                fArr[7] = dp;
                fArr[6] = dp;
                fArr[5] = dp;
                fArr[4] = dp;
                this.path.reset();
                this.path.addRoundRect(this.rect, this.radii, Path.Direction.CW);
                this.path.close();
                this.paint.setColor(2130706432);
                canvas.drawPath(this.path, this.paint);
            }
        };
        this.videoInfoContainer = frameLayout2;
        frameLayout2.setWillNotDraw(false);
        this.videoInfoContainer.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(this.videoInfoContainer, LayoutHelper.createFrame(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        this.videoInfoContainer.addView(imageView, LayoutHelper.createFrame(-2, -2, 19));
        TextView textView = new TextView(context);
        this.videoTextView = textView;
        textView.setTextColor(-1);
        this.videoTextView.setTextSize(1, 12.0f);
        this.videoTextView.setImportantForAccessibility(2);
        this.videoInfoContainer.addView(this.videoTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 24);
        this.checkBox = checkBox2;
        checkBox2.setDrawBackgroundAsArc(11);
        this.checkBox.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
        addView(this.checkBox, LayoutHelper.createFrame(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        this.checkBox.setVisibility(0);
        setFocusable(true);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.itemWidth + this.extraWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.itemWidth, 1073741824));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateColors();
    }

    public void setItemWidth(int i, int i2) {
        this.itemWidth = i;
        this.extraWidth = i2;
        ((FrameLayout.LayoutParams) this.checkFrame.getLayoutParams()).rightMargin = i2;
        ((FrameLayout.LayoutParams) this.imageView.getLayoutParams()).rightMargin = i2;
        ((FrameLayout.LayoutParams) this.videoInfoContainer.getLayoutParams()).rightMargin = i2;
    }

    public void updateColors() {
        this.checkBox.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
    }

    public void setNum(int i) {
        this.checkBox.setNum(i);
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        if (str != null) {
            this.imageView.setImage(str, null, drawable);
        } else if (photoEntry.path != null) {
            this.imageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            if (photoEntry.isVideo) {
                this.videoInfoContainer.setVisibility(0);
                this.videoTextView.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                setContentDescription(LocaleController.getString("AttachVideo", R.string.AttachVideo) + ", " + LocaleController.formatDuration(photoEntry.duration));
                BackupImageView backupImageView = this.imageView;
                backupImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
                return;
            }
            this.videoInfoContainer.setVisibility(4);
            setContentDescription(LocaleController.getString("AttachPhoto", R.string.AttachPhoto));
            BackupImageView backupImageView2 = this.imageView;
            backupImageView2.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
        } else {
            this.imageView.setImageDrawable(drawable);
        }
    }

    public void setImage(MediaController.SearchImage searchImage) {
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC$PhotoSize tLRPC$PhotoSize = searchImage.thumbPhotoSize;
        if (tLRPC$PhotoSize != null) {
            this.imageView.setImage(ImageLocation.getForPhoto(tLRPC$PhotoSize, searchImage.photo), (String) null, drawable, searchImage);
            return;
        }
        TLRPC$PhotoSize tLRPC$PhotoSize2 = searchImage.photoSize;
        if (tLRPC$PhotoSize2 != null) {
            this.imageView.setImage(ImageLocation.getForPhoto(tLRPC$PhotoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            this.imageView.setImage(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            this.imageView.setImage(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            this.imageView.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), (String) null, drawable, searchImage);
        } else {
            this.imageView.setImageDrawable(drawable);
        }
    }

    public void setChecked(int i, boolean z, boolean z2) {
        this.checkBox.setChecked(i, z, z2);
    }
}
