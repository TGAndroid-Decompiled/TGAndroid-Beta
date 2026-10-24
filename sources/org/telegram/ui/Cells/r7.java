package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class r7 {
    public final TextPaint f23104a;
    public final Paint f23105b;
    public final Drawable f23106c;
    public final Drawable d;
    public final Paint e;
    public final SparseArray f23107f;
    public final HashMap f23108g;

    public r7(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f23104a = textPaint;
        Paint paint = new Paint();
        this.f23105b = paint;
        this.e = new Paint();
        this.f23107f = new SparseArray();
        this.f23108g = new HashMap();
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getDrawable(R.drawable.play_mini_video).mutate();
        this.f23106c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(R.drawable.filled_views).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lh, g6Var));
    }
}
