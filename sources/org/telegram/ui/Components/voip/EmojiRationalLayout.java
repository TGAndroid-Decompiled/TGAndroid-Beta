package org.telegram.ui.Components.voip;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

@SuppressLint({"ViewConstructor"})
public class EmojiRationalLayout extends LinearLayout {
    private final VoIPBackgroundProvider backgroundProvider;
    private final RectF bgRect;

    public EmojiRationalLayout(Context context, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(context);
        this.bgRect = new RectF();
        this.backgroundProvider = voIPBackgroundProvider;
        voIPBackgroundProvider.attach(this);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        this.bgRect.set(0.0f, 0.0f, getWidth(), getHeight());
        this.backgroundProvider.setDarkTranslation(getX(), getY());
        canvas.drawRoundRect(this.bgRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.backgroundProvider.getDarkPaint());
        super.dispatchDraw(canvas);
    }
}
