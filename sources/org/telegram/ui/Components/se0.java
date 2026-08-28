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
public final class se0 extends LinearLayout {
    public final LinearLayout f32450a;
    public final LinearLayout f32451b;

    public se0(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        LinearLayout a2 = a(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia));
        this.f32451b = a2;
        addView(a2, g7.e6.n(-2, -1));
        LinearLayout a3 = a(R.drawable.media_button_restore, LocaleController.getString(R.string.Edit));
        this.f32450a = a3;
        addView(a3, g7.e6.n(-2, -1));
    }

    public final LinearLayout a(int i9, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(25.0f), AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i9);
        linearLayout.addView(imageView, g7.e6.k(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, g7.e6.n(-2, -2));
        g7.g6.a(linearLayout);
        return linearLayout;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        LinearLayout linearLayout = this.f32450a;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop();
        int max = Math.max(0, size - paddingRight);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - (getPaddingBottom() + paddingTop)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        linearLayout.measure(makeMeasureSpec2, makeMeasureSpec);
        LinearLayout linearLayout2 = this.f32451b;
        linearLayout2.measure(makeMeasureSpec2, makeMeasureSpec);
        int min = Math.min(Math.max(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredWidth()), max / 2);
        layoutParams2.width = min;
        layoutParams.width = min;
        super.onMeasure(i9, i10);
    }
}
