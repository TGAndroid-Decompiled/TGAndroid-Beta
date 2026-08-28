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
public final class o70 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final Paint f40995a;
    public final Path f40996b;
    public final ImageView f40997c;
    public final fg.g d;
    public GradientDrawable f40998e;
    public final q70 f40999f;

    public o70(q70 q70Var, Context context, org.telegram.ui.ActionBar.w1 w1Var) {
        super(context);
        int i9;
        this.f40999f = q70Var;
        this.f40995a = new Paint(1);
        this.f40996b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f40997c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.l1(0.6f, q70Var.getThemedColor(i10)), PorterDuff.Mode.SRC_IN));
        addView(imageView, g7.e6.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        w1Var.setClipChildren(true);
        addView(w1Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        fg.g gVar = new fg.g(this, context, 8);
        this.d = gVar;
        gVar.setHint(LocaleController.getString(R.string.Search));
        gVar.setTextSize(1, 15.0f);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackground(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setClipToPadding(true);
        gVar.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        gVar.setEllipsizeByGradient(true);
        gVar.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        gVar.setGravity(i9 | 16);
        gVar.addTextChangedListener(new n70(this));
        if (Build.VERSION.SDK_INT >= 35) {
            gVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        gVar.setTextColor(q70Var.getThemedColor(i10));
        gVar.setHintTextColor(q70Var.getThemedColor(org.telegram.ui.ActionBar.f6.H6));
        addView(gVar, g7.e6.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int themedColor = this.f40999f.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7);
        this.f40998e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(1.0f, themedColor), org.telegram.ui.ActionBar.f6.l1(0.0f, themedColor)});
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f40995a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        q70 q70Var = this.f40999f;
        paint.setColor(q70Var.getThemedColor(i9));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + q70Var.f41701b.f47780e + AndroidUtilities.dp(3.0f));
        Path path = this.f40996b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.f40998e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) q70Var.f41701b.f47780e)));
            this.f40998e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f40999f.f41703e) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
    }
}
