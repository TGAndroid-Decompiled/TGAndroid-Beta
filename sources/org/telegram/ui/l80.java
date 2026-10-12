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
public final class l80 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final Paint f39657a;
    public final Path f39658b;
    public final ImageView f39659c;
    public final ci.g2 d;
    public GradientDrawable f39660e;
    public final n80 f39661f;

    public l80(n80 n80Var, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        super(context);
        int i10;
        this.f39661f = n80Var;
        this.f39657a = new Paint(1);
        this.f39658b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f39659c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.6f, n80Var.getThemedColor(i11)), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.w5.a(24.0f, 11.0f, 8.0f, 11.0f, 8.0f, 24, 51));
        u1Var.setClipChildren(true);
        addView(u1Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 40.0f, -1, 119));
        ci.g2 g2Var = new ci.g2(this, context, 7);
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
        g2Var.addTextChangedListener(new k80(this));
        if (Build.VERSION.SDK_INT >= 35) {
            g2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        g2Var.setTextColor(n80Var.getThemedColor(i11));
        g2Var.setHintTextColor(n80Var.getThemedColor(org.telegram.ui.ActionBar.h6.H6));
        addView(g2Var, w7.w5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f39657a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.h6.f20560d6;
        n80 n80Var = this.f39661f;
        paint.setColor(n80Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + n80Var.f40319b.f16096e + AndroidUtilities.dp(3.0f));
        Path path = this.f39658b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.f39660e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) n80Var.f40319b.f16096e)));
            this.f39660e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f39661f.f40321e) {
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
        int themedColor = this.f39661f.getThemedColor(org.telegram.ui.ActionBar.h6.f20504a7);
        this.f39660e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(1.0f, themedColor), org.telegram.ui.ActionBar.h6.m1(0.0f, themedColor)});
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
    }
}
