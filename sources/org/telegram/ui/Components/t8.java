package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class t8 extends View {

    public r8 f32682a;

    public final y5 f32683b;

    public boolean f32684c;
    public boolean d;

    public final c20 f32685e;

    public Drawable f32686f;
    public Drawable h;

    public boolean f32687n;

    public Paint f32688r;

    public Paint f32689s;
    public boolean v;

    public final v8 f32690w;

    public t8(v8 v8Var, Context context) {
        super(context);
        this.f32690w = v8Var;
        y5 y5Var = new y5(400L, AndroidUtilities.overshootInterpolator);
        this.f32683b = y5Var;
        this.f32685e = new c20();
        y5Var.f34810a = this;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        float f10 = this.f32684c ? 1.0f : 0.0f;
        y5 y5Var = this.f32683b;
        y5Var.d(f10, false);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        r8 r8Var = this.f32682a;
        if (r8Var != null) {
            int i10 = r8Var.f32101c;
            int i11 = r8Var.d;
            int i12 = r8Var.f32102e;
            int i13 = r8Var.f32103f;
            c20 c20Var = this.f32685e;
            c20Var.d(i10, i11, i12, i13);
            c20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            paint = c20Var.f27292c;
        } else {
            if (this.f32689s == null) {
                Paint paint2 = new Paint(1);
                this.f32689s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.He, false));
            }
            paint = this.f32689s;
        }
        if (y5Var.f34812c == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(15.0f), paint);
        } else {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dpf2(13.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, com.google.android.recaptcha.internal.a.z(1.0f, y5Var.f34812c, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)), paint);
        }
        if (this.v) {
            if (this.h != null) {
                if (this.f32687n != (this.d && this.f32682a == null)) {
                    this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    boolean z10 = !this.d && this.f32682a == null;
                    this.f32687n = z10;
                    this.h.setColorFilter(new PorterDuffColorFilter(z10 ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Je, false) : -1, PorterDuff.Mode.SRC_IN));
                }
            } else {
                this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                if (this.d) {
                }
                this.f32687n = z10;
                this.h.setColorFilter(new PorterDuffColorFilter(z10 ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Je, false) : -1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.h;
            drawable.setBounds((int) (measuredWidth - (drawable.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.h.getIntrinsicHeight() / 2.0f) + measuredHeight));
            float fLerp = AndroidUtilities.lerp(1.05f, 0.92f, y5Var.f34812c);
            canvas.save();
            canvas.scale(fLerp, fLerp, measuredWidth, measuredHeight);
            this.h.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.d) {
            if (this.f32682a == null) {
                if (this.f32686f == null) {
                    Drawable drawable2 = getContext().getDrawable(R.drawable.msg_filled_plus);
                    this.f32686f = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Je, false), PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable3 = this.f32686f;
                drawable3.setBounds((int) (measuredWidth - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.f32686f.getIntrinsicHeight() / 2.0f)), (int) ((this.f32686f.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.f32686f.getIntrinsicHeight() / 2.0f) + measuredHeight));
                this.f32686f.draw(canvas);
                return;
            }
            if (this.f32688r == null) {
                Paint paint3 = new Paint(1);
                this.f32688r = paint3;
                paint3.setColor(-1);
            }
            this.f32688r.setAlpha(Math.round(Utilities.clamp(y5Var.f34812c, 1.0f, 0.0f) * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(1.5f), this.f32688r);
            canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(5.0f) * y5Var.f34812c), measuredHeight, AndroidUtilities.dp(1.5f), this.f32688r);
            canvas.drawCircle((AndroidUtilities.dp(5.0f) * y5Var.f34812c) + measuredWidth, measuredHeight, AndroidUtilities.dp(1.5f), this.f32688r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f32690w.L, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
