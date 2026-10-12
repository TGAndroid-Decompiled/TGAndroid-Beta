package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
public final class x3 extends FrameLayout {
    public final TextPaint f33846a;
    public final z4 f33847b;

    public x3(z4 z4Var, Context context) {
        super(context);
        this.f33847b = z4Var;
        this.f33846a = new TextPaint(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TextPaint textPaint = this.f33846a;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        for (int i13 = 0; i13 < 2; i13++) {
            if (i13 == 0) {
                i12 = R.string.WalletTransactions;
            } else {
                i12 = R.string.WalletCollectibles;
            }
            dp = yh.c(24.0f, (int) Math.ceil(textPaint.measureText(LocaleController.getString(i12))), dp);
        }
        this.f33847b.f33927h0.getLayoutParams().width = Math.min(dp, Math.max(0, View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(32.0f)));
        super.onMeasure(i10, i11);
    }
}
