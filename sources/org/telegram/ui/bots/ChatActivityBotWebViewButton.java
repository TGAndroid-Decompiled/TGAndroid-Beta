package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;

public final class ChatActivityBotWebViewButton extends FrameLayout {
    public int backgroundColor;
    public final int buttonColor;
    public BotCommandsMenuView menuButton;
    public int menuButtonWidth;
    public final Path path;
    public float progress;

    public ChatActivityBotWebViewButton(Context context) {
        super(context);
        this.path = new Path();
        this.buttonColor = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        textView.setAlpha(0.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.0f);
        radialProgressView.setScaleY(0.0f);
        addView(radialProgressView, LayoutHelper.createFrame(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        View view = new View(context);
        view.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false), 2, -1));
        addView(view, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float fMax = Math.max((getWidth() - this.menuButtonWidth) - AndroidUtilities.dp(4.0f), getHeight()) * this.progress;
        float fDp = AndroidUtilities.dp(16.0f) + fMax;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - fMax, (AndroidUtilities.dp(4.0f) + height) - fMax, AndroidUtilities.dp(6.0f) + this.menuButtonWidth + fMax, (getHeight() - AndroidUtilities.dp(12.0f)) + fMax);
        Path path = this.path;
        path.rewind();
        path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.backgroundColor);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.progress) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        BotCommandsMenuView botCommandsMenuView = this.menuButton;
        if (botCommandsMenuView != null) {
            botCommandsMenuView.setDrawBackgroundDrawable(false);
            this.menuButton.draw(canvas);
            this.menuButton.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.progress) * (-AndroidUtilities.dp(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        if (height > 0) {
            size = Math.min(size, height);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i2)));
    }

    public void setBotMenuButton(BotCommandsMenuView botCommandsMenuView) {
        this.menuButton = botCommandsMenuView;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i) {
        this.menuButtonWidth = i;
        invalidate();
    }

    public void setProgress(float f) {
        this.progress = f;
        this.backgroundColor = ColorUtils.blendARGB(f, Theme.getColor(null, Theme.key_chat_messagePanelVoiceBackground, false), this.buttonColor);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setAlpha(f);
        }
        invalidate();
    }
}
