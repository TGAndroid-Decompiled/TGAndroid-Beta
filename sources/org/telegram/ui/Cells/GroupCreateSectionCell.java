package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class GroupCreateSectionCell extends FrameLayout {
    public final Drawable drawable;
    public final TextView textView;

    public GroupCreateSectionCell(Context context) {
        super(context);
        setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false));
        Drawable drawable = getResources().getDrawable(R.drawable.shadowdown);
        this.drawable = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_groupcreate_sectionShadow, false), PorterDuff.Mode.MULTIPLY));
        TextView textView = new TextView(getContext());
        this.textView = textView;
        zzkk.m(14.0f, 1, textView);
        textView.setTextColor(Theme.getColor(null, Theme.key_groupcreate_sectionText, false));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable = this.drawable;
        drawable.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        drawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.textView.setText(str);
    }
}
