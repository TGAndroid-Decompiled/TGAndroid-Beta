package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class PhotoViewerPollAttachButtons extends LinearLayout {
    public final LinearLayout editButton;
    public final LinearLayout replaceButton;

    public PhotoViewerPollAttachButtons(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        LinearLayout linearLayoutCreateButton = createButton(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia));
        this.replaceButton = linearLayoutCreateButton;
        addView(linearLayoutCreateButton, LayoutHelper.createLinear(-2, -1));
        LinearLayout linearLayoutCreateButton2 = createButton(R.drawable.media_button_restore, LocaleController.getString(R.string.Edit));
        this.editButton = linearLayoutCreateButton2;
        addView(linearLayoutCreateButton2, LayoutHelper.createLinear(-2, -1));
    }

    public final LinearLayout createButton(int i, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(25.0f), AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i);
        linearLayout.addView(imageView, LayoutHelper.createLinear(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2));
        ScaleStateListAnimator.apply(linearLayout, 0.1f, 1.5f);
        return linearLayout;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        LinearLayout linearLayout = this.editButton;
        LinearLayout linearLayout2 = this.replaceButton;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMax = Math.max(0, size - paddingRight);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - paddingBottom), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
        linearLayout.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        linearLayout2.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        int iMin = Math.min(Math.max(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredWidth()), iMax / 2);
        layoutParams2.width = iMin;
        layoutParams.width = iMin;
        super.onMeasure(i, i2);
    }
}
