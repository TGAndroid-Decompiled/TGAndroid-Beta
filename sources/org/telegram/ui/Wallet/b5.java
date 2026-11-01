package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.z41;
public final class b5 extends View {
    public final int f34240a = 1;
    public final Paint f34241b;
    public final Object f34242c;
    public final Object d;
    public final Object e;

    public b5(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.f34242c = new fe.b(this, gr.h, 380L);
        this.f34241b = new Paint(1);
        this.d = p6Var;
        z41 z41Var = new z41(true);
        this.e = z41Var;
        z41Var.setCallback(this);
        z41Var.b(-1);
        z41Var.f32999i = true;
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f34240a) {
            case 1:
                super.onAttachedToWindow();
                ((z41) this.e).d();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f34240a) {
            case 1:
                super.onDetachedFromWindow();
                ((z41) this.e).e();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        View[] viewPages;
        switch (this.f34240a) {
            case 0:
                c5 c5Var = (c5) this.e;
                int d12 = c5Var.d1();
                Paint paint = this.f34241b;
                paint.setColor(d12);
                ViewGroup viewGroup = c5Var.T1;
                int[] iArr = (int[]) this.f34242c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f7 = iArr[0] - iArr2[0];
                View view = ((x71) c5Var.T1).getViewPages()[0];
                if (view != null) {
                    i10 = view.getPaddingLeft();
                } else {
                    i10 = 0;
                }
                if (view != null) {
                    i11 = view.getPaddingRight();
                } else {
                    i11 = 0;
                }
                canvas.save();
                canvas.clipRect(i10 + f7, 0.0f, (f7 + c5Var.T1.getWidth()) - i11, getHeight());
                for (View view2 : ((x71) c5Var.T1).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), org.telegram.messenger.i0.L(100.0f) + view2.getHeight(), paint);
                        canvas.restore();
                    }
                }
                canvas.restore();
                return;
            default:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Me, (org.telegram.ui.ActionBar.p6) this.d);
                Paint paint2 = this.f34241b;
                paint2.setColor(w02);
                canvas.drawCircle(width, height, org.telegram.messenger.i0.L(19.0f), paint2);
                float f10 = ((fe.b) this.f34242c).e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    rf.o.b(canvas, (z41) this.e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float L = org.telegram.messenger.i0.L(6.666f) * f10;
                    float L2 = org.telegram.messenger.i0.L(2.666f) * f10;
                    canvas.drawRoundRect(width - L, height - L, width + L, height + L, L2, L2, org.telegram.ui.ActionBar.t6.n0(-1));
                    return;
                }
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f34240a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                rf.o.d((z41) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f34240a) {
            case 1:
                if (!super.verifyDrawable(drawable) && (drawable != ((z41) this.e) || ((fe.b) this.f34242c).f7022f)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public b5(c5 c5Var, Context context) {
        super(context);
        this.e = c5Var;
        this.f34241b = new Paint(1);
        this.f34242c = new int[2];
        this.d = new int[2];
    }
}
