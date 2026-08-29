package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o7 {
    public final TextPaint f24809a;
    public final Paint f24810b;
    public final Drawable f24811c;
    public final Drawable d;
    public final Paint f24812e;
    public final SparseArray f24813f;
    public final HashMap f24814g;

    public o7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f24809a = textPaint;
        Paint paint = new Paint();
        this.f24810b = paint;
        this.f24812e = new Paint();
        this.f24813f = new SparseArray();
        this.f24814g = new HashMap();
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getDrawable(R.drawable.play_mini_video).mutate();
        this.f24811c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(R.drawable.filled_views).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Lh, c6Var));
    }
}
