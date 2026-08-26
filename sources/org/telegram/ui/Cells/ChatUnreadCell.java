package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class ChatUnreadCell extends FrameLayout {
    public final FrameLayout backgroundLayout;
    public final ImageView imageView;
    public final TextView textView;

    public ChatUnreadCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.backgroundLayout = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i = Theme.key_chat_unreadMessagesStartBackground;
        Integer numValueOf = resourcesProvider != null ? Integer.valueOf(resourcesProvider.getColor(i)) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : Theme.getColor(null, i, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(iIntValue, mode));
        addView(frameLayout, LayoutHelper.createFrame(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        int i2 = Theme.key_chat_unreadMessagesStartArrowIcon;
        Integer numValueOf2 = resourcesProvider != null ? Integer.valueOf(resourcesProvider.getColor(i2)) : null;
        imageView.setColorFilter(new PorterDuffColorFilter(numValueOf2 != null ? numValueOf2.intValue() : Theme.getColor(null, i2, false), mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        int i3 = Theme.key_chat_unreadMessagesStartText;
        Integer numValueOf3 = resourcesProvider != null ? Integer.valueOf(resourcesProvider.getColor(i3)) : null;
        textView.setTextColor(numValueOf3 != null ? numValueOf3.intValue() : Theme.getColor(null, i3, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
    }

    public FrameLayout getBackgroundLayout() {
        return this.backgroundLayout;
    }

    public ImageView getImageView() {
        return this.imageView;
    }

    public TextView getTextView() {
        return this.textView;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.textView.setText(str);
    }
}
