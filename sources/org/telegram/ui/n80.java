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
public final class n80 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final Paint f38567a;
    public final Path f38568b;
    public final ImageView f38569c;
    public final di.g2 d;
    public GradientDrawable e;
    public final p80 f38570f;

    public n80(p80 p80Var, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        super(context);
        int i10;
        this.f38570f = p80Var;
        this.f38567a = new Paint(1);
        this.f38568b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f38569c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.m1(0.6f, p80Var.getThemedColor(i11)), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.a6.a(24.0f, 11.0f, 8.0f, 11.0f, 8.0f, 24, 51));
        u1Var.setClipChildren(true);
        addView(u1Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 40.0f, -1, 119));
        di.g2 g2Var = new di.g2(this, context, 7);
        this.d = g2Var;
        g2Var.setHint(LocaleController.getString(R.string.Search));
        g2Var.setTextSize(1, 15.0f);
        g2Var.setCursorWidth(1.5f);
        g2Var.setInputType(g2Var.getInputType() | 176);
        g2Var.setSingleLine(true);
        g2Var.setBackground(null);
        g2Var.setVerticalScrollBarEnabled(false);
        g2Var.setHorizontalScrollBarEnabled(false);
        g2Var.setClipToPadding(true);
        g2Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        g2Var.setEllipsizeByGradient(true);
        g2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g2Var.setGravity(i10 | 16);
        g2Var.addTextChangedListener(new m80(this));
        if (Build.VERSION.SDK_INT >= 35) {
            g2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        g2Var.setTextColor(p80Var.getThemedColor(i11));
        g2Var.setHintTextColor(p80Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        addView(g2Var, w7.a6.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        d();
    }

    @Override
    public final void d() {
        int themedColor = this.f38570f.getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7);
        this.e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.m1(1.0f, themedColor), org.telegram.ui.ActionBar.g6.m1(0.0f, themedColor)});
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f38567a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        p80 p80Var = this.f38570f;
        paint.setColor(p80Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + p80Var.f39143b.e + AndroidUtilities.dp(3.0f));
        Path path = this.f38568b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) p80Var.f39143b.e)));
            this.e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f38570f.e) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
    }
}
