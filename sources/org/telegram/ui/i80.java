package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i80 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final Paint f33555a;
    public final Path f33556b;
    public final ImageView f33557c;
    public final bi.t2 d;
    public GradientDrawable e;
    public final k80 f33558f;

    public i80(k80 k80Var, Context context, org.telegram.ui.ActionBar.x1 x1Var) {
        super(context);
        int i10;
        this.f33558f = k80Var;
        this.f33555a = new Paint(1);
        this.f33556b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f33557c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.6f, k80Var.getThemedColor(i11)), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.a6.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        x1Var.setClipChildren(true);
        addView(x1Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        bi.t2 t2Var = new bi.t2(this, context, 7);
        this.d = t2Var;
        t2Var.setHint(LocaleController.getString(R.string.Search));
        t2Var.setTextSize(1, 15.0f);
        t2Var.setCursorWidth(1.5f);
        t2Var.setInputType(t2Var.getInputType() | 176);
        t2Var.setSingleLine(true);
        t2Var.setBackground(null);
        t2Var.setVerticalScrollBarEnabled(false);
        t2Var.setHorizontalScrollBarEnabled(false);
        t2Var.setClipToPadding(true);
        t2Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        t2Var.setEllipsizeByGradient(true);
        t2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        t2Var.setGravity(i10 | 16);
        t2Var.addTextChangedListener(new h80(this));
        if (Build.VERSION.SDK_INT >= 35) {
            t2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        t2Var.setTextColor(k80Var.getThemedColor(i11));
        t2Var.setHintTextColor(k80Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        addView(t2Var, w7.a6.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f33555a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        k80 k80Var = this.f33558f;
        paint.setColor(k80Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + k80Var.f34259b.e + AndroidUtilities.dp(3.0f));
        Path path = this.f33556b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) k80Var.f34259b.e)));
            this.e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f33558f.e) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        int themedColor = this.f33558f.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7);
        this.e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(1.0f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.0f, themedColor)});
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
    }
}
