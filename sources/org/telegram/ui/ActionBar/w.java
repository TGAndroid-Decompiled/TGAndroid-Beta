package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.b10;
public final class w extends FrameLayout {
    public final ActionBarLayout E;
    public final Rect f23164a;
    public boolean f23165b;
    public int f23166c;
    public final Paint d;
    public int e;
    public boolean f23167f;
    public int h;
    public int f23168n;
    public LinearGradient f23169r;
    public final Matrix f23170s;
    public Paint v;
    public e4 f23171w;
    public boolean f23172x;
    public boolean f23173y;

    public w(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.E = actionBarLayout;
        this.f23164a = new Rect();
        this.d = new Paint();
        this.f23170s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i10) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint m0 = y6.m0(i10);
        e4 e4Var = e4.f22604c;
        if (paddingLeft > 0 && this.f23171w != e4Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), m0);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.f23171w != e4Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), m0);
        }
        if (paddingBottom > 0) {
            if (this.f23171w == e4.f22602a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), m0);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.f22345s1 != null && getParent() == actionBarLayout) {
            actionBarLayout.o(this, actionBarLayout.f22345s1);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.y.c(this);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w.b():void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x02;
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.S0) {
            super.dispatchDraw(canvas);
            return;
        }
        d4 d4Var = actionBarLayout.f22353x;
        boolean z10 = false;
        if (d4Var != null) {
            x02 = d4Var.getInternalNavbarPaint().getColor();
        } else {
            x02 = y6.x0(null, y6.f23299a7, false);
        }
        if (this == actionBarLayout.f22351w) {
            org.telegram.ui.Components.h6 h6Var = actionBarLayout.f22322h1;
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.hasSheet()) {
                z10 = true;
            }
            float e = h6Var.e(z10);
            if (e > 0.0f) {
                a(canvas, this.f23173y, y6.o1(e, x02));
            }
        } else {
            r2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f22343s && this.f23171w != e4.f22602a) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        } else if (getChildAt(i10) instanceof o2) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                a(canvas, z10, x02);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        motionEvent.getAction();
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.h && actionBarLayout.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !actionBarLayout.f22304a0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.f22343s) {
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r2 r2Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Drawable drawable;
        ArrayList<n2> arrayList;
        ActionBarLayout actionBarLayout = this.E;
        n2 n2Var = null;
        if (!actionBarLayout.U0.isEmpty()) {
            r2Var = (r2) b10.h(1, actionBarLayout.U0);
        } else {
            r2Var = null;
        }
        s sVar = actionBarLayout.G;
        if (sVar != null && (arrayList = sVar.sheetsStack) != null && !arrayList.isEmpty()) {
            r2Var = actionBarLayout.G;
        }
        if (r2Var != null) {
            n2Var = r2Var.getLastSheet();
        }
        if (n2Var != null && n2Var.isFullyVisible() && n2Var.getWindowView() != view) {
            return true;
        }
        if (view instanceof k) {
            return super.drawChild(canvas, view, j10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt != view && (childAt instanceof k) && childAt.getVisibility() == 0) {
                k kVar = (k) childAt;
                if (kVar.getCastShadows() && kVar.getShadowAlpha() > 0) {
                    i11 = childAt.getMeasuredHeight();
                    i12 = (int) childAt.getY();
                    i10 = kVar.getShadowAlpha();
                }
            } else {
                i14++;
            }
        }
        i10 = 0;
        i11 = 0;
        i12 = 0;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i11 != 0 && (drawable = ActionBarLayout.f22300v1) != null) {
            int alpha = drawable.getAlpha();
            int i15 = i12 + i11;
            ActionBarLayout.f22300v1.setBounds(0, i15, getMeasuredWidth(), ActionBarLayout.f22300v1.getIntrinsicHeight() + i15);
            ActionBarLayout.f22300v1.setAlpha(i10);
            ActionBarLayout.f22300v1.draw(canvas);
            ActionBarLayout.f22300v1.setAlpha(alpha);
        }
        if (this.f23173y && this.f23172x && r2Var != null && r2Var.getListViewForSimpleGlass() == null && (i13 = AndroidUtilities.navigationBarHeight) >= AndroidUtilities.dp(32.0f)) {
            int i16 = (int) (i13 * 1.33f);
            int navigationBarColor = r2Var.getNavigationBarColor();
            if (i16 != this.h || this.f23168n != navigationBarColor || this.v == null) {
                if (this.v == null) {
                    this.v = new Paint(1);
                }
                this.f23168n = navigationBarColor;
                this.h = i16;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i16, new int[]{y6.o1(0.1f, navigationBarColor), y6.o1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f23169r = linearGradient;
                this.v.setShader(linearGradient);
            }
            Matrix matrix = this.f23170s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i16);
            this.f23169r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i16, getWidth(), getHeight(), this.v);
        }
        return drawChild;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f23166c != 0) {
            int i10 = y6.f23356d6;
            int x02 = y6.x0(null, i10, false);
            int i11 = this.e;
            Paint paint = this.d;
            if (i11 != x02) {
                int x03 = y6.x0(null, i10, false);
                this.e = x03;
                paint.setColor(x03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f23166c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        boolean z11 = false;
        int i16 = 0;
        while (true) {
            if (i16 < childCount) {
                View childAt = getChildAt(i16);
                if (childAt instanceof k) {
                    i14 = childAt.getMeasuredHeight();
                    childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i14);
                    break;
                }
                i16++;
            } else {
                i14 = 0;
                break;
            }
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (!(childAt2 instanceof k)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof o2)) {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin + i14, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i14);
                } else {
                    int i19 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i19, layoutParams.topMargin, childAt2.getMeasuredWidth() + i19 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f23164a;
        getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i15 = AndroidUtilities.statusBarHeight;
        } else {
            i15 = 0;
        }
        if (((height - i15) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top) > 0) {
            z11 = true;
        }
        this.f23165b = z11;
        ActionBarLayout actionBarLayout = this.E;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.f22343s.f23165b && !actionBarLayout.v.f23165b) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            actionBarLayout.d.run();
            actionBarLayout.d = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f23167f;
        ActionBarLayout actionBarLayout = this.E;
        if (z11 != z10 && actionBarLayout.x() && (actionBarLayout.h || actionBarLayout.f22304a0)) {
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.e = null;
            }
            actionBarLayout.l(true, false);
        }
        this.f23167f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f23164a);
        s3 s3Var = actionBarLayout.E;
        if (s3Var != null) {
            s3Var.setCurrentAccount(UserConfig.selectedAccount);
        }
        int i15 = 0;
        while (true) {
            if (i15 < childCount) {
                View childAt = getChildAt(i15);
                if (childAt instanceof k) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    i12 = childAt.getMeasuredHeight();
                    break;
                }
                i15++;
            } else {
                i12 = 0;
                break;
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof k)) {
                if (childAt2 instanceof o2) {
                    if (actionBarLayout.v(false) <= 0 && this.f23172x) {
                        i14 = actionBarLayout.f22347t1.d;
                    } else {
                        i14 = 0;
                    }
                    measureChildWithMargins(childAt2, i10, 0, i11, i14);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                } else {
                    if (this.f23172x) {
                        i13 = actionBarLayout.f22347t1.d;
                    } else {
                        i13 = 0;
                    }
                    measureChildWithMargins(childAt2, i10, 0, i11, i13);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        b();
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        b();
    }

    public void setDrawNavigationBar(boolean z10) {
        if (this.f23173y != z10) {
            this.f23173y = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i10) {
        this.f23166c = i10;
        invalidate();
    }

    public void setShouldHandleBottomInsets(e4 e4Var) {
        boolean z10;
        if (this.f23171w != e4Var) {
            this.f23171w = e4Var;
            if (e4Var != e4.f22602a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f23172x = z10;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.E;
            if (actionBarLayout.f22345s1 != null && getParent() == actionBarLayout) {
                actionBarLayout.o(this, actionBarLayout.f22345s1);
            } else if (view != null) {
                WeakHashMap weakHashMap = r0.i0.f47108a;
                r0.y.c(view);
            }
        }
    }
}
