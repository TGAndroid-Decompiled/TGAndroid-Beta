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
public final class b80 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Paint f35396a;
    public final Path f35397b;
    public final ImageView f35398c;
    public final lg.f d;
    public GradientDrawable f35399e;
    public final d80 f35400f;

    public b80(d80 d80Var, Context context, org.telegram.ui.ActionBar.x1 x1Var) {
        super(context);
        int i10;
        this.f35400f = d80Var;
        this.f35396a = new Paint(1);
        this.f35397b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f35398c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.l1(0.6f, d80Var.getThemedColor(i11)), PorterDuff.Mode.SRC_IN));
        addView(imageView, k7.c6.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        x1Var.setClipChildren(true);
        addView(x1Var, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        lg.f fVar = new lg.f(this, context, 6);
        this.d = fVar;
        fVar.setHint(LocaleController.getString(R.string.Search));
        fVar.setTextSize(1, 15.0f);
        fVar.setCursorWidth(1.5f);
        fVar.setInputType(fVar.getInputType() | 176);
        fVar.setSingleLine(true);
        fVar.setBackground(null);
        fVar.setVerticalScrollBarEnabled(false);
        fVar.setHorizontalScrollBarEnabled(false);
        fVar.setClipToPadding(true);
        fVar.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        fVar.setEllipsizeByGradient(true);
        fVar.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fVar.setGravity(i10 | 16);
        fVar.addTextChangedListener(new a80(this));
        if (Build.VERSION.SDK_INT >= 35) {
            fVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        fVar.setTextColor(d80Var.getThemedColor(i11));
        fVar.setHintTextColor(d80Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        addView(fVar, k7.c6.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f35396a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        d80 d80Var = this.f35400f;
        paint.setColor(d80Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + d80Var.f36112b.f50546e + AndroidUtilities.dp(3.0f));
        Path path = this.f35397b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.f35399e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) d80Var.f36112b.f50546e)));
            this.f35399e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f35400f.f36114e) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        int themedColor = this.f35400f.getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7);
        this.f35399e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.l1(1.0f, themedColor), org.telegram.ui.ActionBar.k6.l1(0.0f, themedColor)});
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
    }
}
