package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CombinedDrawable;

public final class AlbumButton extends View {
    public StaticLayout countLayout;
    public float countLayoutLeft;
    public float countLayoutWidth;
    public final TextPaint countPaintLayout;
    public final ImageReceiver imageReceiver;
    public StaticLayout nameLayout;
    public float nameLayoutLeft;
    public float nameLayoutWidth;
    public final TextPaint namePaintLayout;
    public final String subtitle;
    public final String title;

    public AlbumButton(Context context, MediaController.PhotoEntry photoEntry, String str, int i, Theme.ResourcesProvider resourcesProvider) {
        String str2;
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.namePaintLayout = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.countPaintLayout = textPaint2;
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        setBackground(Theme.getSelectorDrawable(false));
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        textPaint.setColor(Theme.getColor(i2, resourcesProvider));
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint2.setColor(Theme.getColor(i2, resourcesProvider));
        textPaint2.setAlpha(102);
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.title = str4;
        this.subtitle = DiffUtil.m(i, "");
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), -13750737), drawableMutate);
        combinedDrawable.setFullsize(false);
        combinedDrawable.setIconSize(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        if (photoEntry != null && (str2 = photoEntry.thumbPath) != null) {
            imageReceiver.setImage(ImageLocation.getForPath(str2), "30.0_30.0", (ImageLocation) null, (String) null, combinedDrawable, (Object) null, 0);
        } else if (photoEntry == null || photoEntry.path == null) {
            imageReceiver.setImageBitmap(combinedDrawable);
        } else if (photoEntry.isVideo) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, combinedDrawable, (Object) null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "30.0_30.0", (ImageLocation) null, (String) null, combinedDrawable, (Object) null, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) str4);
        if (i > 0) {
            str3 = " " + LocaleController.formatPluralStringComma("Media", i);
        }
        sb.append(str3);
        setContentDescription(sb.toString());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords(paddingLeft, (getMeasuredHeight() - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        imageReceiver.draw(canvas);
        float fDp = paddingLeft + AndroidUtilities.dp(30.0f) + AndroidUtilities.dp(12.0f);
        if (this.nameLayout != null) {
            canvas.save();
            canvas.translate(fDp - this.nameLayoutLeft, (getMeasuredHeight() - this.nameLayout.getHeight()) / 2.0f);
            this.nameLayout.draw(canvas);
            fDp = fDp + this.nameLayoutWidth + AndroidUtilities.dp(6.0f);
            canvas.restore();
        }
        if (this.countLayout != null) {
            canvas.save();
            canvas.translate(fDp - this.countLayoutLeft, AndroidUtilities.dpf2(1.6f) + ((getMeasuredHeight() - this.countLayout.getHeight()) / 2.0f));
            this.countLayout.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = (((View.MeasureSpec.getSize(i) - AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.nameLayout;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextPaint textPaint = this.namePaintLayout;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.title, textPaint, size, truncateAt);
            int iMax = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(charSequenceEllipsize, textPaint, iMax, alignment, 1.0f, 0.0f, false);
            this.nameLayout = staticLayout2;
            this.nameLayoutLeft = staticLayout2.getLineCount() > 0 ? this.nameLayout.getLineLeft(0) : 0.0f;
            float lineWidth = this.nameLayout.getLineCount() > 0 ? this.nameLayout.getLineWidth(0) : 0.0f;
            this.nameLayoutWidth = lineWidth;
            int iDp = size - ((int) (lineWidth + AndroidUtilities.dp(8.0f)));
            TextPaint textPaint2 = this.countPaintLayout;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.subtitle, textPaint2, iDp, truncateAt), textPaint2, Math.max(0, iDp), alignment, 1.0f, 0.0f, false);
            this.countLayout = staticLayout3;
            this.countLayoutLeft = staticLayout3.getLineCount() > 0 ? this.countLayout.getLineLeft(0) : 0.0f;
            this.countLayoutWidth = this.countLayout.getLineCount() > 0 ? this.countLayout.getLineWidth(0) : 0.0f;
        }
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(30.0f) + getPaddingLeft() + this.nameLayoutWidth + AndroidUtilities.dp(8.0f) + this.countLayoutWidth + getPaddingRight(), View.MeasureSpec.getSize(i)), AndroidUtilities.dp(48.0f));
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(48.0f));
        }
    }
}
