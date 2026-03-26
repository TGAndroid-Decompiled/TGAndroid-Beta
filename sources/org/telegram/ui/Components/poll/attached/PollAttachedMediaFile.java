package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public class PollAttachedMediaFile extends PollAttachedMedia {
    private final String ext;
    private final String name;
    public final String path;
    private final StaticLayout staticLayout;
    private final Drawable thumb;
    private final TextPaint tp;

    public PollAttachedMediaFile(String str) {
        this.path = str;
        String name = new File(str).getName();
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

    @Override
    protected void setupImageReceiver(ImageReceiver imageReceiver) {
        imageReceiver.clearImage();
    }

    @Override
    protected void drawOverlay(Canvas canvas, int i, int i2) {
        Drawable drawable = this.thumb;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            this.thumb.draw(canvas);
            canvas.save();
            canvas.translate((i - AndroidUtilities.dp(34.0f)) / 2.0f, AndroidUtilities.dp(15.0f));
            this.staticLayout.draw(canvas);
            canvas.restore();
            return;
        }
        canvas.drawRect(0.0f, 0.0f, i, i2, Theme.DEBUG_RED_STROKE);
    }
}
