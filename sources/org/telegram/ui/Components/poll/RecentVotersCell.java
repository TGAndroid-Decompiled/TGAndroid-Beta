package org.telegram.ui.Components.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarsListDrawable;
import org.telegram.ui.Components.LayoutHelper;

public class RecentVotersCell extends FrameLayout {
    public final AvatarsListDrawable avatarsListDrawable;
    public final TextView textView;

    public RecentVotersCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.avatarsListDrawable = new AvatarsListDrawable(i, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, LayoutHelper.createFrameMatchParent());
    }

    public void setText(String str) {
        this.textView.setText(str);
    }

    public void setRecentVoters(List list, boolean z) {
        this.avatarsListDrawable.set(list, z);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarsListDrawable.attach();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarsListDrawable.detach();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.avatarsListDrawable.setBounds((getWidth() - AndroidUtilities.dp(11.0f)) - ((int) this.avatarsListDrawable.getAnimatedWidth()), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(24.0f));
        this.avatarsListDrawable.draw(canvas);
    }
}
