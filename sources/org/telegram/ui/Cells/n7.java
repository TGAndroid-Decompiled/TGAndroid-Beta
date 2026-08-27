package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class n7 {

    public final TextPaint f24728a;

    public final Paint f24729b;

    public final Drawable f24730c;
    public final Drawable d;

    public final Paint f24731e;

    public final SparseArray f24732f;

    public final HashMap f24733g;

    public n7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f24728a = textPaint;
        Paint paint = new Paint();
        this.f24729b = paint;
        this.f24731e = new Paint();
        this.f24732f = new SparseArray();
        this.f24733g = new HashMap();
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = context.getDrawable(R.drawable.play_mini_video).mutate();
        this.f24730c = drawableMutate;
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        Drawable drawableMutate2 = context.getDrawable(R.drawable.filled_views).mutate();
        this.d = drawableMutate2;
        drawableMutate2.setBounds(0, 0, (int) (drawableMutate2.getIntrinsicWidth() * 0.7f), (int) (drawableMutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Lh, c6Var));
    }
}
