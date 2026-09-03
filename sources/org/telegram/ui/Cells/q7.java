package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q7 {
    public final TextPaint f23373a;
    public final Paint f23374b;
    public final Drawable f23375c;
    public final Drawable d;
    public final Paint f23376e;
    public final SparseArray f23377f;
    public final HashMap f23378g;

    public q7(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f23373a = textPaint;
        Paint paint = new Paint();
        this.f23374b = paint;
        this.f23376e = new Paint();
        this.f23377f = new SparseArray();
        this.f23378g = new HashMap();
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getDrawable(R.drawable.play_mini_video).mutate();
        this.f23375c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(R.drawable.filled_views).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Lh, g6Var));
    }
}
