package org.telegram.ui.community.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public class CommunityBanGroupConfirmCell extends FrameLayout {
    public final BackupImageView avatarView;
    public final TextView subtitleView;
    public final TextView titleView;

    public CommunityBanGroupConfirmCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        addView(new View(context, resourcesProvider) {
            private final Paint pBg;
            private final Paint pRed;
            private final Paint pWhite;
            private final RectF rectF;
            final Theme.ResourcesProvider val$resourcesProvider;

            {
                this.val$resourcesProvider = resourcesProvider;
                Paint paint = new Paint(1);
                this.pBg = paint;
                Paint paint2 = new Paint(1);
                this.pWhite = paint2;
                Paint paint3 = new Paint(1);
                this.pRed = paint3;
                this.rectF = new RectF();
                paint2.setColor(-1);
                paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                paint3.setColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                this.rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                RectF rectF = this.rectF;
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, this.rectF.height() / 2.0f, this.pBg);
                this.rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                RectF rectF2 = this.rectF;
                canvas.drawRoundRect(rectF2, rectF2.width() / 2.0f, this.rectF.height() / 2.0f, this.pRed);
                this.rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                RectF rectF3 = this.rectF;
                canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, this.rectF.height() / 2.0f, this.pWhite);
            }
        }, LayoutHelper.createFrame(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.subtitleView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }
}
