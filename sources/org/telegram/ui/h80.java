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
public final class h80 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Paint f34160a;
    public final Path f34161b;
    public final ImageView f34162c;
    public final ci.h2 d;
    public GradientDrawable e;
    public final j80 f34163f;

    public h80(j80 j80Var, Context context, org.telegram.ui.ActionBar.w1 w1Var) {
        super(context);
        int i10;
        this.f34163f = j80Var;
        this.f34160a = new Paint(1);
        this.f34161b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f34162c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.l1(0.6f, j80Var.getThemedColor(i11)), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.y5.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        w1Var.setClipChildren(true);
        addView(w1Var, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        ci.h2 h2Var = new ci.h2(this, context, 7);
        this.d = h2Var;
        h2Var.setHint(LocaleController.getString(R.string.Search));
        h2Var.setTextSize(1, 15.0f);
        h2Var.setCursorWidth(1.5f);
        h2Var.setInputType(h2Var.getInputType() | 176);
        h2Var.setSingleLine(true);
        h2Var.setBackground(null);
        h2Var.setVerticalScrollBarEnabled(false);
        h2Var.setHorizontalScrollBarEnabled(false);
        h2Var.setClipToPadding(true);
        h2Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        h2Var.setEllipsizeByGradient(true);
        h2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h2Var.setGravity(i10 | 16);
        h2Var.addTextChangedListener(new g80(this));
        if (Build.VERSION.SDK_INT >= 35) {
            h2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        h2Var.setTextColor(j80Var.getThemedColor(i11));
        h2Var.setHintTextColor(j80Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        addView(h2Var, w7.y5.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f34160a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.i6.f19057d6;
        j80 j80Var = this.f34163f;
        paint.setColor(j80Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + j80Var.f34659b.e + AndroidUtilities.dp(3.0f));
        Path path = this.f34161b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) j80Var.f34659b.e)));
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
        if (view == this.f34163f.e) {
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
        int themedColor = this.f34163f.getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7);
        this.e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.i6.l1(1.0f, themedColor), org.telegram.ui.ActionBar.i6.l1(0.0f, themedColor)});
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
    }
}
