package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.StealthModeAlert;

public final class TooManyCommunitiesHintCell extends FrameLayout {
    public final TextView messageTextView;

    public TooManyCommunitiesHintCell(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        int i = Theme.key_chats_nameMessage_threeLines;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(null, i, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.messageTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_chats_message, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        StealthModeAlert.ItemCell itemCell = new StealthModeAlert.ItemCell(context, new Paint(1), textPaint);
        itemCell.setWillNotDraw(false);
        itemCell.addView(imageView, LayoutHelper.createFrame(-2, -2, 1));
        addView(itemCell, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
        textView.setText(LocaleController.getString(R.string.TooManyCommunities));
        imageView.setImageResource(R.drawable.groups_limit1);
    }

    public void setMessageText(String str) {
        this.messageTextView.setText(str);
    }
}
