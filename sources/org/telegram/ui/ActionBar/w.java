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
public final class w extends FrameLayout {
    public final ActionBarLayout E;
    public final Rect f19612a;
    public boolean f19613b;
    public int f19614c;
    public final Paint d;
    public int e;
    public boolean f19615f;
    public int h;
    public int f19616n;
    public LinearGradient f19617r;
    public final Matrix f19618s;
    public Paint v;
    public z3 f19619w;
    public boolean f19620x;
    public boolean f19621y;

    public w(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.E = actionBarLayout;
        this.f19612a = new Rect();
        this.d = new Paint();
        this.f19618s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i10) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint l02 = h6.l0(i10);
        z3 z3Var = z3.f19712c;
        if (paddingLeft > 0 && this.f19619w != z3Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), l02);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.f19619w != z3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), l02);
        }
        if (paddingBottom > 0) {
            if (this.f19619w == z3.f19710a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), l02);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.y.c(this);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w.b():void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.M0) {
            super.dispatchDraw(canvas);
            return;
        }
        y3 y3Var = actionBarLayout.f18394x;
        boolean z10 = false;
        if (y3Var != null) {
            w02 = y3Var.getInternalNavbarPaint().getColor();
        } else {
            w02 = h6.w0(null, h6.f18733a7, false);
        }
        if (this == actionBarLayout.f18392w) {
            org.telegram.ui.Components.e6 e6Var = actionBarLayout.f18355b1;
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.hasSheet()) {
                z10 = true;
            }
            float e = e6Var.e(z10);
            if (e > 0.0f) {
                a(canvas, this.f19621y, h6.l1(e, w02));
            }
        } else {
            n2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f18387s && this.f19619w != z3.f19710a) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        } else if (getChildAt(i10) instanceof k2) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                a(canvas, z10, w02);
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
        if ((!z10 && !actionBarLayout.f18351a0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.f18387s) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        n2 n2Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Drawable drawable;
        ArrayList<j2> arrayList;
        ActionBarLayout actionBarLayout = this.E;
        j2 j2Var = null;
        if (!actionBarLayout.O0.isEmpty()) {
            n2Var = (n2) org.telegram.ui.Cells.q3.g(1, actionBarLayout.O0);
        } else {
            n2Var = null;
        }
        s sVar = actionBarLayout.G;
        if (sVar != null && (arrayList = sVar.sheetsStack) != null && !arrayList.isEmpty()) {
            n2Var = actionBarLayout.G;
        }
        if (n2Var != null) {
            j2Var = n2Var.getLastSheet();
        }
        if (j2Var != null && j2Var.isFullyVisible() && j2Var.getWindowView() != view) {
            return true;
        }
        if (view instanceof k) {
            return super.drawChild(canvas, view, j3);
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
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i11 != 0 && (drawable = ActionBarLayout.f18347p1) != null) {
            int alpha = drawable.getAlpha();
            int i15 = i12 + i11;
            ActionBarLayout.f18347p1.setBounds(0, i15, getMeasuredWidth(), ActionBarLayout.f18347p1.getIntrinsicHeight() + i15);
            ActionBarLayout.f18347p1.setAlpha(i10);
            ActionBarLayout.f18347p1.draw(canvas);
            ActionBarLayout.f18347p1.setAlpha(alpha);
        }
        if (this.f19621y && this.f19620x && n2Var != null && (i13 = AndroidUtilities.navigationBarHeight) >= AndroidUtilities.dp(32.0f)) {
            int i16 = (int) (i13 * 1.33f);
            int navigationBarColor = n2Var.getNavigationBarColor();
            if (i16 != this.h || this.f19616n != navigationBarColor || this.v == null) {
                if (this.v == null) {
                    this.v = new Paint(1);
                }
                this.f19616n = navigationBarColor;
                this.h = i16;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i16, new int[]{h6.l1(0.1f, navigationBarColor), h6.l1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f19617r = linearGradient;
                this.v.setShader(linearGradient);
            }
            Matrix matrix = this.f19618s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i16);
            this.f19617r.setLocalMatrix(matrix);
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
        if (this.f19614c != 0) {
            int i10 = h6.f18789d6;
            int w02 = h6.w0(null, i10, false);
            int i11 = this.e;
            Paint paint = this.d;
            if (i11 != w02) {
                int w03 = h6.w0(null, i10, false);
                this.e = w03;
                paint.setColor(w03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f19614c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
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
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof k2)) {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin + i14, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i14);
                } else {
                    int i19 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i19, layoutParams.topMargin, childAt2.getMeasuredWidth() + i19 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f19612a;
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
        this.f19613b = z11;
        ActionBarLayout actionBarLayout = this.E;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.f18387s.f19613b && !actionBarLayout.v.f19613b) {
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
        boolean z11 = this.f19615f;
        ActionBarLayout actionBarLayout = this.E;
        if (z11 != z10 && actionBarLayout.y() && (actionBarLayout.h || actionBarLayout.f18351a0)) {
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.e = null;
            }
            actionBarLayout.l(true, false);
        }
        this.f19615f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f19612a);
        n3 n3Var = actionBarLayout.E;
        if (n3Var != null) {
            n3Var.setCurrentAccount(UserConfig.selectedAccount);
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
                if (childAt2 instanceof k2) {
                    if (actionBarLayout.v(false) <= 0 && this.f19620x) {
                        i14 = actionBarLayout.f18380n1.d;
                    } else {
                        i14 = 0;
                    }
                    measureChildWithMargins(childAt2, i10, 0, i11, i14);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                } else {
                    if (this.f19620x) {
                        i13 = actionBarLayout.f18380n1.d;
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
        if (this.f19621y != z10) {
            this.f19621y = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i10) {
        this.f19614c = i10;
        invalidate();
    }

    public void setShouldHandleBottomInsets(z3 z3Var) {
        boolean z10;
        if (this.f19619w != z3Var) {
            this.f19619w = z3Var;
            if (z3Var != z3.f19710a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f19620x = z10;
            WeakHashMap weakHashMap = r0.i0.f41795a;
            r0.y.c((View) getParent());
        }
    }
}
