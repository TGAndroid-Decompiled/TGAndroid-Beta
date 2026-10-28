package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class u3 extends ViewGroup implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.u6 f25479a;
    public final TextView f25480b;
    public final int f25481c;
    public ArrayList d;

    public u3(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f25479a = u6Var;
        this.f25481c = i10;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f25480b = textView;
        textView.setText(LocaleController.getString(R.string.NewsInterests));
        textView.setTextSize(12.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setIncludeFontPadding(false);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        addView(textView);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        for (int i12 = 1; i12 < getChildCount(); i12++) {
            getChildAt(i12).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(AndroidUtilities.dp(14.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(14.0f), getHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        this.f25480b.layout(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), getWidth() - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f));
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = AndroidUtilities.dp(32.0f);
        for (int i15 = 1; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (dp > AndroidUtilities.dp(14.0f) && childAt.getMeasuredWidth() + dp > getWidth() - AndroidUtilities.dp(14.0f)) {
                dp = AndroidUtilities.dp(14.0f);
                dp2 = AndroidUtilities.dp(34.0f) + dp2;
            }
            if (LocaleController.isRTL) {
                i14 = (getWidth() - dp) - childAt.getMeasuredWidth();
            } else {
                i14 = dp;
            }
            childAt.layout(i14, dp2, childAt.getMeasuredWidth() + i14, AndroidUtilities.dp(28.0f) + dp2);
            dp = org.telegram.messenger.t.D(5.0f, childAt.getMeasuredWidth(), dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(28.0f);
        this.f25480b.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        int dp2 = AndroidUtilities.dp(32.0f);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
            if (i13 > 0 && childAt.getMeasuredWidth() + i13 > dp) {
                dp2 = AndroidUtilities.dp(34.0f) + dp2;
                i13 = 0;
            }
            i13 = org.telegram.messenger.t.D(5.0f, childAt.getMeasuredWidth(), i13);
        }
        if (getChildCount() > 1) {
            i12 = AndroidUtilities.dp(28.0f);
        }
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + dp2 + i12);
    }
}
