package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class HideEmojiTextView extends TextView {
    public final VoIPBackgroundProvider backgroundProvider;
    public final RectF bgRect;

    public HideEmojiTextView(Activity activity, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(activity);
        this.bgRect = new RectF();
        this.backgroundProvider = voIPBackgroundProvider;
        voIPBackgroundProvider.views.add(this);
        int i = R.string.VoipHideEmoji;
        setText(LocaleController.getString(i));
        setContentDescription(LocaleController.getString(i));
        setTextColor(-1);
        setTypeface(AndroidUtilities.bold());
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.bgRect;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x = ((View) getParent()).getX() + getX();
        float y = ((View) getParent()).getY() + getY();
        VoIPBackgroundProvider voIPBackgroundProvider = this.backgroundProvider;
        voIPBackgroundProvider.setDarkTranslation(x, y);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), voIPBackgroundProvider.getDarkPaint());
        super.onDraw(canvas);
    }
}
