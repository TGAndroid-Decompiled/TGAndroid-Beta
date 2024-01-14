package org.telegram.ui.Components.voip;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
@SuppressLint({"ViewConstructor"})
public class HideEmojiTextView extends TextView {
    private final VoIPBackgroundProvider backgroundProvider;
    private final RectF bgRect;

    public HideEmojiTextView(Context context, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(context);
        this.bgRect = new RectF();
        this.backgroundProvider = voIPBackgroundProvider;
        voIPBackgroundProvider.attach(this);
        int i = R.string.VoipHideEmoji;
        setText(LocaleController.getString("VoipHideEmoji", i));
        setContentDescription(LocaleController.getString("VoipHideEmoji", i));
        setTextColor(-1);
        setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.bgRect.set(0.0f, 0.0f, getWidth(), getHeight());
        this.backgroundProvider.setDarkTranslation(getX() + ((View) getParent()).getX(), getY() + ((View) getParent()).getY());
        canvas.drawRoundRect(this.bgRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.backgroundProvider.getDarkPaint());
        super.onDraw(canvas);
    }
}
