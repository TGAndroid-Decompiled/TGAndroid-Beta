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

public class PollAttachedMediaFile extends PollAttachedMedia {
    public final String ext;
    public final String name;
    public final String path;
    public final long size;
    private final StaticLayout staticLayout;
    private final Drawable thumb;
    private final TextPaint tp;
    public final Uri uri;

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
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            this.tp = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(Theme.getColor(Theme.key_files_iconText));
            this.staticLayout = new StaticLayout(TextUtils.ellipsize(str2, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.tp = null;
        this.staticLayout = null;
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
            this.tp = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(Theme.getColor(Theme.key_files_iconText));
            this.staticLayout = new StaticLayout(TextUtils.ellipsize(str, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.tp = null;
        this.staticLayout = null;
    }

    @Override
    protected void draw(Canvas canvas, int i, int i2) {
        Drawable drawable = this.thumb;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            this.thumb.draw(canvas);
            canvas.save();
            canvas.translate((i - AndroidUtilities.dp(34.0f)) / 2.0f, AndroidUtilities.dp(15.0f));
            this.staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public static Drawable createMessagePreviewDrawable(View view, String str, String str2, TLRPC.Document document, MessageObject messageObject) {
        final FileInfoDrawable fileInfoDrawable = new FileInfoDrawable();
        fileInfoDrawable.titlePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        fileInfoDrawable.subtitlePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        RadialProgress2 radialProgress2 = new RadialProgress2(view);
        fileInfoDrawable.radialProgress = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(21.0f));
        fileInfoDrawable.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
        if (MessageObject.isMusicDocument(document)) {
            if (MessageObject.isDocumentHasThumb(document)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                fileInfoDrawable.radialProgress.setImageOverlay(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
            } else {
                String artworkUrl = MessageObject.getArtworkUrl(document, true);
                if (!TextUtils.isEmpty(artworkUrl)) {
                    fileInfoDrawable.radialProgress.setImageOverlay(artworkUrl);
                } else {
                    fileInfoDrawable.radialProgress.setImageOverlay(null, null, null);
                }
            }
            fileInfoDrawable.radialProgress.setIcon(0, false, false);
        } else {
            fileInfoDrawable.radialProgress.setIcon(5, false, false);
        }
        fileInfoDrawable.setText(str, str2);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                fileInfoDrawable.radialProgress.onAttachedToWindow();
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                fileInfoDrawable.radialProgress.onDetachedFromWindow();
            }
        });
        return fileInfoDrawable;
    }

    public static class FileInfoDrawable extends Drawable {
        public RadialProgress2 radialProgress;
        private StaticLayout subtitleLayout;
        private final TextPaint subtitlePaint;
        private StaticLayout titleLayout;
        private final TextPaint titlePaint;
        private CharSequence title = "";
        private CharSequence subtitle = "";
        private int lastLayoutWidth = -1;
        private final int paddingStart = AndroidUtilities.dp(64.0f);
        private final int paddingTop = AndroidUtilities.dp(10.66f);
        private final int paddingEnd = AndroidUtilities.dp(12.0f);
        private final int lineSpacing = AndroidUtilities.dp(4.0f);

        @Override
        public int getOpacity() {
            return -3;
        }

        public FileInfoDrawable() {
            TextPaint textPaint = new TextPaint(1);
            this.titlePaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            this.subtitlePaint = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }

        public void setText(CharSequence charSequence, CharSequence charSequence2) {
            if (charSequence == null) {
                charSequence = "";
            }
            this.title = charSequence;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            this.subtitle = charSequence2;
            this.lastLayoutWidth = -1;
            this.titleLayout = null;
            this.subtitleLayout = null;
            invalidateSelf();
        }

        @Override
        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.lastLayoutWidth = -1;
            this.titleLayout = null;
            this.subtitleLayout = null;
        }

        private void ensureLayout() {
            int iWidth = getBounds().width();
            if (iWidth <= 0) {
                return;
            }
            if (iWidth != this.lastLayoutWidth || this.titleLayout == null || this.subtitleLayout == null) {
                this.lastLayoutWidth = iWidth;
                int i = (iWidth - this.paddingStart) - this.paddingEnd;
                if (i <= 0) {
                    this.titleLayout = null;
                    this.subtitleLayout = null;
                    return;
                }
                float f = i;
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.title, this.titlePaint, f, TextUtils.TruncateAt.MIDDLE);
                CharSequence charSequenceEllipsize2 = TextUtils.ellipsize(this.subtitle, this.subtitlePaint, f, TextUtils.TruncateAt.END);
                TextPaint textPaint = this.titlePaint;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.titleLayout = new StaticLayout(charSequenceEllipsize, textPaint, i, alignment, 1.0f, 0.0f, false);
                this.subtitleLayout = new StaticLayout(charSequenceEllipsize2, this.subtitlePaint, i, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            ensureLayout();
            if (this.titleLayout == null || this.subtitleLayout == null) {
                return;
            }
            Rect bounds = getBounds();
            float f = bounds.left + this.paddingStart;
            float f2 = bounds.top + this.paddingTop;
            float height = this.titleLayout.getHeight() + f2 + this.lineSpacing;
            this.radialProgress.setProgressRect(bounds.left + AndroidUtilities.dp(10.0f), bounds.top + AndroidUtilities.dp(9.0f), bounds.left + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(42.0f), bounds.top + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(42.0f));
            canvas.save();
            canvas.translate(f, f2);
            this.titleLayout.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f, height);
            this.subtitleLayout.draw(canvas);
            canvas.restore();
            this.radialProgress.draw(canvas);
        }

        @Override
        public void setAlpha(int i) {
            this.radialProgress.setOverrideAlpha(i / 255.0f);
            this.titlePaint.setAlpha(i);
            this.subtitlePaint.setAlpha(i);
            invalidateSelf();
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.titlePaint.setColorFilter(colorFilter);
            this.subtitlePaint.setColorFilter(colorFilter);
            invalidateSelf();
        }

        @Override
        public int getIntrinsicHeight() {
            return this.paddingTop + getLineHeight(this.titlePaint) + this.lineSpacing + getLineHeight(this.subtitlePaint) + this.paddingTop;
        }

        private static int getLineHeight(TextPaint textPaint) {
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            return fontMetricsInt.descent - fontMetricsInt.ascent;
        }
    }
}
