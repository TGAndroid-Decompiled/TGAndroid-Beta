package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y3 extends FrameLayout {
    public final TextPaint f35755a;
    public final b5 f35756b;

    public y3(b5 b5Var, Context context) {
        super(context);
        this.f35756b = b5Var;
        this.f35755a = new TextPaint(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TextPaint textPaint = this.f35755a;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        for (int i13 = 0; i13 < 2; i13++) {
            if (i13 == 0) {
                i12 = R.string.WalletTransactions;
            } else {
                i12 = R.string.WalletCollectibles;
            }
            dp = org.telegram.messenger.q.C(24.0f, (int) Math.ceil(textPaint.measureText(LocaleController.getString(i12))), dp);
        }
        this.f35756b.f34717h0.getLayoutParams().width = Math.min(dp, Math.max(0, View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(32.0f)));
        super.onMeasure(i10, i11);
    }
}
