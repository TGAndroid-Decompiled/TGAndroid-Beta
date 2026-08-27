package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.z70;

public final class z1 extends LinearLayout {

    public boolean f23991a;

    public final org.telegram.ui.Components.y5 f23992b;

    public final Paint f23993c;
    public final b2 d;

    public z1(Context context, b2 b2Var) {
        super(context);
        this.d = b2Var;
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5();
        y5Var.f34814f = 0L;
        y5Var.f34815g = 200L;
        y5Var.h = er.f28122f;
        y5Var.f34810a = this;
        y5Var.d = 0.0f;
        y5Var.f34812c = 0.0f;
        y5Var.f34813e = false;
        this.f23992b = y5Var;
        this.f23993c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.d;
        Drawable drawable = b2Var.f22770v0;
        if (b2Var.f22750e0 && !b2Var.P0) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            View view = b2Var.R;
            if (view == null || !b2Var.f22752f0) {
                drawable.draw(canvas);
            } else {
                int bottom = view.getBottom();
                canvas.save();
                canvas.clipRect(0, bottom, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        float fDp;
        b2 b2Var = this.d;
        if (b2Var.P0) {
            if (b2Var.Z != 3 || b2Var.f22764r == null) {
                fDp = AndroidUtilities.dp(20.0f);
                AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
            } else {
                fDp = AndroidUtilities.dp(18.0f);
                float scaleX = b2Var.f22764r.getScaleX() * b2Var.f22764r.getWidth();
                float scaleY = b2Var.f22764r.getScaleY() * b2Var.f22764r.getHeight();
                AndroidUtilities.rectTmp.set((getWidth() - scaleX) / 2.0f, (getHeight() - scaleY) / 2.0f, (getWidth() + scaleX) / 2.0f, (getHeight() + scaleY) / 2.0f);
            }
            float fD = this.f23992b.d(b2Var.B0 != null ? 1.0f : 0.0f, false);
            Paint paint = b2Var.B0;
            if (paint != null) {
                paint.setAlpha((int) (fD * 255.0f));
                canvas.drawRoundRect(AndroidUtilities.rectTmp, fDp, fDp, b2Var.B0);
            }
            if (b2Var.C0 == null) {
                Paint paint2 = new Paint(1);
                b2Var.C0 = paint2;
                paint2.setColor(i0.b.k(-16777216, (int) (b2Var.M0 * 255.0f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRoundRect(rectF, fDp, fDp, b2Var.C0);
            int i10 = b2Var.Q0;
            Paint paint3 = this.f23993c;
            paint3.setColor(i10);
            paint3.setAlpha((int) ((((b2Var.f22774x0 - 1.0f) * fD) + 1.0f) * paint3.getAlpha()));
            canvas.drawRoundRect(rectF, fDp, fDp, paint3);
        }
        super.draw(canvas);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b2 b2Var = this.d;
        if (!b2Var.D) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        b2Var.p();
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b2 b2Var = this.d;
        int[] iArr = b2Var.f22768t0;
        if (b2Var.Z == 3) {
            int measuredWidth = ((i12 - i10) - b2Var.f22764r.getMeasuredWidth()) / 2;
            int measuredHeight = ((i13 - i11) - b2Var.f22764r.getMeasuredHeight()) / 2;
            FrameLayout frameLayout = b2Var.f22764r;
            frameLayout.layout(measuredWidth, measuredHeight, frameLayout.getMeasuredWidth() + measuredWidth, b2Var.f22764r.getMeasuredHeight() + measuredHeight);
        } else {
            v1 v1Var = b2Var.v;
            if (v1Var != null) {
                if (b2Var.f22773x == null) {
                    b2Var.f22773x = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            b2 b2Var2 = this.f23970a.d;
                            boolean z11 = false;
                            b2.a(b2Var2, 0, b2Var2.f22751f != null && b2Var2.v.getScrollY() > b2Var2.f22771w.getTop());
                            if (b2Var2.f22762p0 != null) {
                                if (b2Var2.v.getHeight() + b2Var2.v.getScrollY() < b2Var2.f22771w.getBottom()) {
                                    z11 = true;
                                }
                            }
                            b2.a(b2Var2, 1, z11);
                            b2Var2.v.invalidate();
                        }
                    };
                    v1Var.getViewTreeObserver().addOnScrollChangedListener(b2Var.f22773x);
                }
                b2Var.f22773x.onScrollChanged();
            }
        }
        getLocationOnScreen(iArr);
        Matrix matrix = b2Var.f22777z0;
        if (matrix == null || b2Var.A0 == null) {
            return;
        }
        matrix.reset();
        b2Var.f22777z0.postScale(8.0f, 8.0f);
        b2Var.f22777z0.postTranslate(-iArr[0], -iArr[1]);
        b2Var.A0.setLocalMatrix(b2Var.f22777z0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int measuredHeight2;
        int i12;
        z70 z70Var;
        float f10;
        b2 b2Var = this.d;
        int i13 = b2Var.Z;
        if (i13 == 3) {
            b2Var.f22764r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        this.f23991a = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i14 = b2Var.f22742a;
        if (i14 > 0) {
            Rect rect = b2Var.f22772w0;
            size = rect.right + i14 + rect.left;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iD = rl.d(48.0f, paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        ViewGroup viewGroup = b2Var.f22762p0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = b2Var.f22762p0.getChildAt(i15);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setMaxWidth(AndroidUtilities.dp(rl.x(24.0f, paddingLeft, 2)));
                }
            }
            b2Var.f22762p0.measure(iMakeMeasureSpec, i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b2Var.f22762p0.getLayoutParams();
            measuredHeight = paddingTop - ((b2Var.f22762p0.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin);
        } else {
            measuredHeight = paddingTop;
        }
        eh.s sVar = b2Var.f22751f;
        if (sVar != null) {
            sVar.measure(iD, i11);
        }
        FrameLayout frameLayout = b2Var.f22766s;
        if (frameLayout != null) {
            frameLayout.measure(iD, i11);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b2Var.f22766s.getLayoutParams();
            measuredHeight -= (b2Var.f22766s.getMeasuredHeight() + layoutParams2.bottomMargin) + layoutParams2.topMargin;
        }
        TextView textView = b2Var.h;
        if (textView != null) {
            textView.measure(iD, i11);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) b2Var.h.getLayoutParams();
            measuredHeight -= (b2Var.h.getMeasuredHeight() + layoutParams3.bottomMargin) + layoutParams3.topMargin;
        }
        ri0 ri0Var = b2Var.f22753g0;
        if (ri0Var != null) {
            ri0Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(b2Var.W), 1073741824));
            measuredHeight -= b2Var.f22753g0.getMeasuredHeight();
        }
        View view = b2Var.R;
        if (view != null) {
            float f11 = b2Var.K0;
            if (f11 >= 0.0f) {
                if (f11 == 0.0f) {
                    f10 = size / 936.0f;
                    f11 = 354.0f;
                } else {
                    f10 = size;
                }
                int i16 = (int) (f10 * f11);
                view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                b2Var.R.getLayoutParams().height = i16;
            } else {
                view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
            }
            measuredHeight -= b2Var.R.getMeasuredHeight();
        }
        if (i13 == 0) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) b2Var.v.getLayoutParams();
            if (b2Var.f22744b != null) {
                layoutParams4.topMargin = (b2Var.f22751f == null && b2Var.f22759n.getVisibility() == 8 && b2Var.L == null) ? AndroidUtilities.dp(16.0f) : 0;
                layoutParams4.bottomMargin = b2Var.f22762p0 == null ? AndroidUtilities.dp(8.0f) : 0;
            } else if (b2Var.L != null) {
                layoutParams4.topMargin = (b2Var.f22751f == null && b2Var.f22759n.getVisibility() == 8) ? AndroidUtilities.dp(8.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(8.0f);
            } else if (b2Var.f22759n.getVisibility() == 0) {
                layoutParams4.topMargin = b2Var.f22751f == null ? AndroidUtilities.dp(19.0f) : 0;
                layoutParams4.bottomMargin = AndroidUtilities.dp(20.0f);
            }
            int i17 = measuredHeight - (layoutParams4.bottomMargin + layoutParams4.topMargin);
            b2Var.v.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE));
            measuredHeight = i17 - b2Var.v.getMeasuredHeight();
        } else {
            FrameLayout frameLayout2 = b2Var.f22764r;
            if (frameLayout2 != null) {
                frameLayout2.measure(iD, View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) b2Var.f22764r.getLayoutParams();
                measuredHeight2 = b2Var.f22764r.getMeasuredHeight() + layoutParams5.bottomMargin;
                i12 = layoutParams5.topMargin;
            } else {
                ut utVar = b2Var.f22759n;
                if (utVar != null) {
                    utVar.measure(iD, View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
                    if (b2Var.f22759n.getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) b2Var.f22759n.getLayoutParams();
                        measuredHeight2 = b2Var.f22759n.getMeasuredHeight() + layoutParams6.bottomMargin;
                        i12 = layoutParams6.topMargin;
                    }
                }
                z70Var = b2Var.f22763q0;
                if (z70Var != null) {
                    z70Var.measure(iD, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) b2Var.f22763q0.getLayoutParams();
                    int measuredHeight3 = measuredHeight - ((b2Var.f22763q0.getMeasuredHeight() + layoutParams7.bottomMargin) + layoutParams7.topMargin);
                    b2Var.f22765r0.measure(iD, View.MeasureSpec.makeMeasureSpec(measuredHeight3, Integer.MIN_VALUE));
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) b2Var.f22765r0.getLayoutParams();
                    measuredHeight = measuredHeight3 - ((b2Var.f22765r0.getMeasuredHeight() + layoutParams8.bottomMargin) + layoutParams8.topMargin);
                }
            }
            measuredHeight -= measuredHeight2 + i12;
            z70Var = b2Var.f22763q0;
            if (z70Var != null) {
                z70Var.measure(iD, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) b2Var.f22763q0.getLayoutParams();
                int measuredHeight4 = measuredHeight - ((b2Var.f22763q0.getMeasuredHeight() + layoutParams9.bottomMargin) + layoutParams9.topMargin);
                b2Var.f22765r0.measure(iD, View.MeasureSpec.makeMeasureSpec(measuredHeight4, Integer.MIN_VALUE));
                LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) b2Var.f22765r0.getLayoutParams();
                measuredHeight = measuredHeight4 - ((b2Var.f22765r0.getMeasuredHeight() + layoutParams10.bottomMargin) + layoutParams10.topMargin);
            }
        }
        setMeasuredDimension(size, (getPaddingBottom() + (getPaddingTop() + (paddingTop - measuredHeight))) - (b2Var.S ? AndroidUtilities.dp(8.0f) : 0));
        this.f23991a = false;
        if (b2Var.H != AndroidUtilities.displaySize.x) {
            AndroidUtilities.runOnUIThread(new p(this, 6));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b2 b2Var = this.d;
        if (b2Var.D) {
            b2Var.p();
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f23991a) {
            return;
        }
        super.requestLayout();
    }
}
