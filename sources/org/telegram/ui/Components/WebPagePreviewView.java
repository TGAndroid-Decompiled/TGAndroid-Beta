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

public class WebPagePreviewView extends FrameLayout {
    private final Path clipPath;
    private final int currentAccount;
    private final ReplyMessageLine line;
    private final RectF lineRect;
    private final RectF rectF;
    private final Theme.ResourcesProvider resourcesProvider;

    public WebPagePreviewView(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        ReplyMessageLine replyMessageLine = new ReplyMessageLine(this);
        this.line = replyMessageLine;
        this.rectF = new RectF();
        this.lineRect = new RectF();
        this.clipPath = new Path();
        setWillNotDraw(false);
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i;
        int color = Theme.getColor(Theme.key_telegram_color_text, resourcesProvider);
        replyMessageLine.color3 = color;
        replyMessageLine.color2 = color;
        replyMessageLine.color1 = color;
        replyMessageLine.backgroundColor = Theme.multAlpha(0.1f, color);
        replyMessageLine.hasColor3 = false;
        replyMessageLine.hasColor2 = false;
        replyMessageLine.resetAnimation();
    }

    public static boolean hasPreview(TLRPC.WebPage webPage) {
        if (webPage != null) {
            return (webPage.site_name == null && webPage.title == null && webPage.description == null && webPage.photo == null && webPage.document == null) ? false : true;
        }
        return false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float[] fArr = this.line.radii;
        float fDp = AndroidUtilities.dp(10.0f);
        fArr[7] = fDp;
        fArr[6] = fDp;
        fArr[1] = fDp;
        fArr[0] = fDp;
        float[] fArr2 = this.line.radii;
        float fDp2 = AndroidUtilities.dp(10.0f);
        fArr2[5] = fDp2;
        fArr2[4] = fDp2;
        fArr2[3] = fDp2;
        fArr2[2] = fDp2;
        this.clipPath.rewind();
        this.clipPath.addRoundRect(this.rectF, this.line.radii, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.clipPath);
        this.line.drawBackground(canvas, this.rectF, 1.0f);
        this.lineRect.set(0.0f, 0.0f, AndroidUtilities.dp(3.0f), getHeight());
        this.line.drawLine(canvas, this.lineRect);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        removeAllViews();
        boolean z = webPage.photo != null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        if (webPage.site_name != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(Theme.key_telegram_color_text, this.resourcesProvider));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2));
        }
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, z ? 56.0f : 0.0f, 0.0f));
        if (z) {
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setRoundRadius(AndroidUtilities.dp(6.0f));
            backupImageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(0.08f, Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider))));
            addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            backupImageView.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", (String) null, 0L, 1, webPage);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
