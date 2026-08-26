package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public final class PollAttachedMediaFile extends PollAttachedMedia {
    public final String ext;
    public final String name;
    public final String path;
    public final long size;
    public final StaticLayout staticLayout;
    public final Drawable thumb;
    public final Uri uri;

    public final class FileInfoDrawable extends Drawable {
        public RadialProgress2 radialProgress;
        public StaticLayout subtitleLayout;
        public final TextPaint subtitlePaint;
        public StaticLayout titleLayout;
        public final TextPaint titlePaint;
        public String title = "";
        public String subtitle = "";
        public int lastLayoutWidth = -1;
        public final int paddingStart = AndroidUtilities.dp(64.0f);
        public final int paddingTop = AndroidUtilities.dp(10.66f);
        public final int paddingEnd = AndroidUtilities.dp(12.0f);
        public final int lineSpacing = AndroidUtilities.dp(4.0f);

        public FileInfoDrawable() {
            TextPaint textPaint = new TextPaint(1);
            this.titlePaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            this.subtitlePaint = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }

        @Override
        public final void draw(Canvas canvas) {
            int iWidth = getBounds().width();
            int i = this.paddingStart;
            if (iWidth > 0 && (iWidth != this.lastLayoutWidth || this.titleLayout == null || this.subtitleLayout == null)) {
                this.lastLayoutWidth = iWidth;
                int i2 = (iWidth - i) - this.paddingEnd;
                if (i2 <= 0) {
                    this.titleLayout = null;
                    this.subtitleLayout = null;
                } else {
                    String str = this.title;
                    TextPaint textPaint = this.titlePaint;
                    float f = i2;
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(str, textPaint, f, TextUtils.TruncateAt.MIDDLE);
                    String str2 = this.subtitle;
                    TextPaint textPaint2 = this.subtitlePaint;
                    CharSequence charSequenceEllipsize2 = TextUtils.ellipsize(str2, textPaint2, f, TextUtils.TruncateAt.END);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.titleLayout = new StaticLayout(charSequenceEllipsize, textPaint, i2, alignment, 1.0f, 0.0f, false);
                    this.subtitleLayout = new StaticLayout(charSequenceEllipsize2, textPaint2, i2, alignment, 1.0f, 0.0f, false);
                }
            }
            if (this.titleLayout == null || this.subtitleLayout == null) {
                return;
            }
            Rect bounds = getBounds();
            float f2 = bounds.left + i;
            float f3 = bounds.top + this.paddingTop;
            float height = this.titleLayout.getHeight() + f3 + this.lineSpacing;
            this.radialProgress.setProgressRect(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f2, f3);
            this.titleLayout.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f2, height);
            this.subtitleLayout.draw(canvas);
            canvas.restore();
            this.radialProgress.draw(canvas);
        }

        @Override
        public final int getIntrinsicHeight() {
            Paint.FontMetricsInt fontMetricsInt = this.titlePaint.getFontMetricsInt();
            int i = fontMetricsInt.descent - fontMetricsInt.ascent;
            int i2 = this.paddingTop;
            int i3 = i + i2 + this.lineSpacing;
            Paint.FontMetricsInt fontMetricsInt2 = this.subtitlePaint.getFontMetricsInt();
            return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i3 + i2;
        }

        @Override
        public final int getOpacity() {
            return -3;
        }

        @Override
        public final void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.lastLayoutWidth = -1;
            this.titleLayout = null;
            this.subtitleLayout = null;
        }

        @Override
        public final void setAlpha(int i) {
            this.radialProgress.overrideAlpha = i / 255.0f;
            this.titlePaint.setAlpha(i);
            this.subtitlePaint.setAlpha(i);
            invalidateSelf();
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.titlePaint.setColorFilter(colorFilter);
            this.subtitlePaint.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    public PollAttachedMediaFile(String str) {
        long length;
        this.path = str;
        this.uri = null;
        File file = new File(str);
        try {
            length = file.length();
        } catch (Throwable unused) {
            length = 0;
        }
        this.size = length;
        String name = file.getName();
        this.name = name;
        String[] strArrSplit = name.split("\\.");
        String str2 = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
        this.ext = str2;
        int thumbForNameOrMime = AndroidUtilities.getThumbForNameOrMime(name, str2, false);
        if (thumbForNameOrMime != 0) {
            this.thumb = ApplicationLoader.applicationContext.getResources().getDrawable(thumbForNameOrMime);
        } else {
            this.thumb = null;
        }
        if (TextUtils.isEmpty(str2)) {
            this.staticLayout = null;
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(Theme.getColor(null, Theme.key_files_iconText, false));
        this.staticLayout = new StaticLayout(TextUtils.ellipsize(str2, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public static FileInfoDrawable createMessagePreviewDrawable(View view, String str, String str2, TLRPC.Document document, MessageObject messageObject) {
        final FileInfoDrawable fileInfoDrawable = new FileInfoDrawable();
        fileInfoDrawable.titlePaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        fileInfoDrawable.subtitlePaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        RadialProgress2 radialProgress2 = new RadialProgress2(null, view);
        fileInfoDrawable.radialProgress = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(21.0f));
        RadialProgress2 radialProgress3 = fileInfoDrawable.radialProgress;
        int i = Theme.key_chat_inLoader;
        int i2 = Theme.key_chat_inLoaderSelected;
        int i3 = Theme.key_chat_inMediaIcon;
        int i4 = Theme.key_chat_inMediaIconSelected;
        radialProgress3.circleColorKey = i;
        radialProgress3.circlePressedColorKey = i2;
        radialProgress3.iconColorKey = i3;
        radialProgress3.iconPressedColorKey = i4;
        if (MessageObject.isMusicDocument(document)) {
            if (MessageObject.isDocumentHasThumb(document)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                fileInfoDrawable.radialProgress.setImageOverlay(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
            } else {
                String artworkUrl = MessageObject.getArtworkUrl(document, true);
                if (TextUtils.isEmpty(artworkUrl)) {
                    fileInfoDrawable.radialProgress.setImageOverlay(null, null, null);
                } else {
                    fileInfoDrawable.radialProgress.setImageOverlay(artworkUrl);
                }
            }
            fileInfoDrawable.radialProgress.setIcon(0, false, false);
        } else {
            fileInfoDrawable.radialProgress.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        fileInfoDrawable.title = str;
        if (str2 == null) {
            str2 = "";
        }
        fileInfoDrawable.subtitle = str2;
        fileInfoDrawable.lastLayoutWidth = -1;
        fileInfoDrawable.titleLayout = null;
        fileInfoDrawable.subtitleLayout = null;
        fileInfoDrawable.invalidateSelf();
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public final void onViewAttachedToWindow(View view2) {
                fileInfoDrawable.radialProgress.overlayImageView.onAttachedToWindow();
            }

            @Override
            public final void onViewDetachedFromWindow(View view2) {
                fileInfoDrawable.radialProgress.overlayImageView.onDetachedFromWindow();
            }
        });
        return fileInfoDrawable;
    }

    @Override
    public final void draw(Canvas canvas, int i, int i2) {
        Drawable drawable = this.thumb;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i - AndroidUtilities.dp(34.0f)) / 2.0f, AndroidUtilities.dp(15.0f));
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public PollAttachedMediaFile(Uri uri) {
        this.path = null;
        this.uri = uri;
        String fileName = MediaController.getFileName(uri);
        fileName = fileName == null ? "?" : fileName;
        this.name = fileName;
        String[] strArrSplit = fileName.split("\\.");
        String str = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
        this.ext = str;
        this.size = 0L;
        int thumbForNameOrMime = AndroidUtilities.getThumbForNameOrMime(fileName, str, false);
        if (thumbForNameOrMime != 0) {
            this.thumb = ApplicationLoader.applicationContext.getResources().getDrawable(thumbForNameOrMime);
        } else {
            this.thumb = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(Theme.getColor(null, Theme.key_files_iconText, false));
            this.staticLayout = new StaticLayout(TextUtils.ellipsize(str, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.staticLayout = null;
    }
}
