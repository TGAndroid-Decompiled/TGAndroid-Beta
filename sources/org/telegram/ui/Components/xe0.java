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

public final class xe0 extends LinearLayout {

    public final LinearLayout f34608a;

    public final LinearLayout f34609b;

    public xe0(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        LinearLayout linearLayoutA = a(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia));
        this.f34609b = linearLayoutA;
        addView(linearLayoutA, h7.z5.n(-2, -1));
        LinearLayout linearLayoutA2 = a(R.drawable.media_button_restore, LocaleController.getString(R.string.Edit));
        this.f34608a = linearLayoutA2;
        addView(linearLayoutA2, h7.z5.n(-2, -1));
    }

    public final LinearLayout a(int i10, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(25.0f), AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        linearLayout.addView(imageView, h7.z5.k(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, h7.z5.n(-2, -2));
        h7.b6.a(linearLayout);
        return linearLayout;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        LinearLayout linearLayout = this.f34608a;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMax = Math.max(0, size - paddingRight);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - paddingBottom), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
        linearLayout.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        LinearLayout linearLayout2 = this.f34609b;
        linearLayout2.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        int iMin = Math.min(Math.max(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredWidth()), iMax / 2);
        layoutParams2.width = iMin;
        layoutParams.width = iMin;
        super.onMeasure(i10, i11);
    }
}
