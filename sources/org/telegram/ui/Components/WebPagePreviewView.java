package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class WebPagePreviewView extends FrameLayout {
    public static final int $r8$clinit = 0;
    public final Path clipPath;
    public final ReplyMessageLine line;
    public final RectF lineRect;
    public final RectF rectF;
    public final Theme.ResourcesProvider resourcesProvider;

    public WebPagePreviewView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        ReplyMessageLine replyMessageLine = new ReplyMessageLine(this);
        this.line = replyMessageLine;
        this.rectF = new RectF();
        this.lineRect = new RectF();
        this.clipPath = new Path();
        setWillNotDraw(false);
        this.resourcesProvider = resourcesProvider;
        int color = Theme.getColor(Theme.key_telegram_color_text, resourcesProvider);
        replyMessageLine.color3 = color;
        replyMessageLine.color2 = color;
        replyMessageLine.color1 = color;
        replyMessageLine.backgroundColor = Theme.multAlpha(0.1f, color);
        replyMessageLine.hasColor3 = false;
        replyMessageLine.hasColor2 = false;
        replyMessageLine.color1Animated.set(replyMessageLine.color1, true);
        replyMessageLine.color2Animated.set(replyMessageLine.color2, true);
        replyMessageLine.color2Alpha.set(replyMessageLine.hasColor2, true);
        replyMessageLine.nameColorAnimated.set(replyMessageLine.nameColor, true);
        replyMessageLine.backgroundColorAnimated.set(replyMessageLine.backgroundColor, true);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = replyMessageLine.emoji;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.changeProgress.set(1.0f, true);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.rectF;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ReplyMessageLine replyMessageLine = this.line;
        float[] fArr = replyMessageLine.radii;
        float fDp = AndroidUtilities.dp(10.0f);
        fArr[7] = fDp;
        fArr[6] = fDp;
        fArr[1] = fDp;
        fArr[0] = fDp;
        float[] fArr2 = replyMessageLine.radii;
        float fDp2 = AndroidUtilities.dp(10.0f);
        fArr2[5] = fDp2;
        fArr2[4] = fDp2;
        fArr2[3] = fDp2;
        fArr2[2] = fDp2;
        Path path = this.clipPath;
        path.rewind();
        path.addRoundRect(rectF, replyMessageLine.radii, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.line.drawBackground(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.lineRect;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(3.0f), getHeight());
        replyMessageLine.drawLine(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        removeAllViews();
        boolean z = webPage.photo != null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(Theme.key_telegram_color_text, resourcesProvider));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2));
        }
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, z ? 56.0f : 0.0f, 0.0f));
        if (z) {
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setRoundRadius(AndroidUtilities.dp(6.0f));
            backupImageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(0.08f, Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider))));
            addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            backupImageView.imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            backupImageView.onNewImageSet();
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
