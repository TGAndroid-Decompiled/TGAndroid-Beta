package org.telegram.p009ui.Cells;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1010R;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;

@SuppressLint({"NewApi"})
public class PhotoAttachCameraCell extends FrameLayout {
    private ImageView backgroundView;
    private ImageView imageView;
    private int itemSize;
    private final Theme.ResourcesProvider resourcesProvider;

    public PhotoAttachCameraCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        ImageView imageView = new ImageView(context);
        this.backgroundView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.backgroundView, LayoutHelper.createFrame(80, 80.0f));
        ImageView imageView2 = new ImageView(context);
        this.imageView = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setImageResource(C1010R.C1011drawable.instant_camera);
        addView(this.imageView, LayoutHelper.createFrame(80, 80.0f));
        setFocusable(true);
        this.itemSize = AndroidUtilities.m35dp(0.0f);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.itemSize + AndroidUtilities.m35dp(5.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.itemSize + AndroidUtilities.m35dp(5.0f), 1073741824));
    }

    public void setItemSize(int i) {
        this.itemSize = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.imageView.getLayoutParams();
        int i2 = this.itemSize;
        layoutParams.height = i2;
        layoutParams.width = i2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.backgroundView.getLayoutParams();
        int i3 = this.itemSize;
        layoutParams2.height = i3;
        layoutParams2.width = i3;
    }

    public ImageView getImageView() {
        return this.imageView;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogCameraIcon"), PorterDuff.Mode.MULTIPLY));
    }

    public void updateBitmap() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            this.backgroundView.setImageBitmap(bitmap);
        } else {
            this.backgroundView.setImageResource(C1010R.C1011drawable.icplaceholder);
        }
    }

    protected int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
