package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class s7 {
    public final TextPaint f22845a;
    public final Paint f22846b;
    public final Drawable f22847c;
    public final Drawable d;
    public final Paint f22848e;
    public final SparseArray f22849f;
    public final HashMap f22850g;

    public s7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f22845a = textPaint;
        Paint paint = new Paint();
        this.f22846b = paint;
        this.f22848e = new Paint();
        this.f22849f = new SparseArray();
        this.f22850g = new HashMap();
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getDrawable(R.drawable.play_mini_video).mutate();
        this.f22847c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(R.drawable.filled_views).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Lh, f6Var));
    }
}
