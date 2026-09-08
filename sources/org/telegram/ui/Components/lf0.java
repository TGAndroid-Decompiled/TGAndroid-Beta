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
public final class lf0 extends LinearLayout {
    public final LinearLayout f28194a;
    public final LinearLayout f28195b;

    public lf0(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        LinearLayout a2 = a(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia));
        this.f28195b = a2;
        addView(a2, w7.x5.n(-2, -1));
        LinearLayout a10 = a(R.drawable.media_button_restore, LocaleController.getString(R.string.Edit));
        this.f28194a = a10;
        addView(a10, w7.x5.n(-2, -1));
    }

    public final LinearLayout a(int i10, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(25.0f), AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        linearLayout.addView(imageView, w7.x5.k(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, w7.x5.n(-2, -2));
        w7.z5.a(linearLayout);
        return linearLayout;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        LinearLayout linearLayout = this.f28194a;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop();
        int max = Math.max(0, size - paddingRight);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - (getPaddingBottom() + paddingTop)), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        linearLayout.measure(makeMeasureSpec2, makeMeasureSpec);
        LinearLayout linearLayout2 = this.f28195b;
        linearLayout2.measure(makeMeasureSpec2, makeMeasureSpec);
        int min = Math.min(Math.max(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredWidth()), max / 2);
        layoutParams2.width = min;
        layoutParams.width = min;
        super.onMeasure(i10, i11);
    }
}
