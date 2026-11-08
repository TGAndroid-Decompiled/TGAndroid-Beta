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
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
public final class w extends FrameLayout {
    public boolean D;
    public final ActionBarLayout E;
    public final Rect f28670a;
    public boolean f28671b;
    public int f28672c;
    public final Paint d;
    public int f28673e;
    public boolean f28674f;
    public int h;
    public int f28675n;
    public LinearGradient f28676r;
    public final Matrix f28677s;
    public Paint f28678w;
    public o3 f28679x;
    public boolean f28680y;

    public w(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.E = actionBarLayout;
        this.f28670a = new Rect();
        this.d = new Paint();
        this.f28677s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z9, int i7) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint n02 = k6.n0(i7);
        o3 o3Var = o3.f28341c;
        if (paddingLeft > 0 && this.f28679x != o3Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), n02);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.f28679x != o3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), n02);
        }
        if (paddingBottom > 0) {
            if (this.f28679x == o3.f28339a || z9) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), n02);
            }
        }
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.f27272s1 != null && getParent() == actionBarLayout) {
            actionBarLayout.o(this, actionBarLayout.f27272s1);
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f54191a;
        r0.y.c(this);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w.b():void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x02;
        i0.b bVar;
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.S0) {
            super.dispatchDraw(canvas);
            return;
        }
        n3 n3Var = actionBarLayout.f27282y;
        boolean z9 = false;
        if (n3Var != null) {
            x02 = n3Var.getInternalNavbarPaint().getColor();
        } else {
            x02 = k6.x0(null, k6.f27796a7, false);
        }
        boolean z10 = true;
        if (this == actionBarLayout.f27280x) {
            org.telegram.ui.Components.w5 w5Var = actionBarLayout.f27250h1;
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.hasSheet()) {
                z9 = true;
            }
            float d = w5Var.d(z9);
            if (d > 0.0f) {
                a(canvas, this.D, k6.r1(d, x02));
            }
        } else {
            f2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f27270s && this.f28679x != o3.f28339a) {
                    int childCount = getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        if (getChildAt(i7) instanceof c2) {
                            break;
                        }
                    }
                }
                z10 = false;
                a(canvas, z10, x02);
                if (z10 && this.f28680y && actionBarLayout.w(false) <= 0 && (bVar = actionBarLayout.f27274t1) != null && bVar.d > 0) {
                    super.dispatchDraw(canvas);
                    canvas.drawRect(0.0f, getHeight() - actionBarLayout.f27274t1.d, getWidth(), getHeight(), k6.n0(x02));
                    return;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        motionEvent.getAction();
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.h && actionBarLayout.J == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((!z9 && !actionBarLayout.f27231a0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z9) {
                try {
                    if (this != actionBarLayout.f27270s) {
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
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
        f2 f2Var;
        int i7;
        int i10;
        int i11;
        int i12;
        Drawable drawable;
        ArrayList<b2> arrayList;
        ActionBarLayout actionBarLayout = this.E;
        b2 b2Var = null;
        if (!actionBarLayout.U0.isEmpty()) {
            f2Var = (f2) rf.b.g(1, actionBarLayout.U0);
        } else {
            f2Var = null;
        }
        s sVar = actionBarLayout.G;
        if (sVar != null && (arrayList = sVar.sheetsStack) != null && !arrayList.isEmpty()) {
            f2Var = actionBarLayout.G;
        }
        if (f2Var != null) {
            b2Var = f2Var.getLastSheet();
        }
        if (b2Var != null && b2Var.j() && b2Var.d() != view) {
            return true;
        }
        if (view instanceof k) {
            return super.drawChild(canvas, view, j3);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != view && (childAt instanceof k) && childAt.getVisibility() == 0) {
                k kVar = (k) childAt;
                if (kVar.getCastShadows() && kVar.getShadowAlpha() > 0) {
                    i10 = childAt.getMeasuredHeight();
                    i11 = (int) childAt.getY();
                    i7 = kVar.getShadowAlpha();
                }
            } else {
                i13++;
            }
        }
        i7 = 0;
        i10 = 0;
        i11 = 0;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i10 != 0 && (drawable = ActionBarLayout.f27227v1) != null) {
            int alpha = drawable.getAlpha();
            int i14 = i11 + i10;
            ActionBarLayout.f27227v1.setBounds(0, i14, getMeasuredWidth(), ActionBarLayout.f27227v1.getIntrinsicHeight() + i14);
            ActionBarLayout.f27227v1.setAlpha(i7);
            ActionBarLayout.f27227v1.draw(canvas);
            ActionBarLayout.f27227v1.setAlpha(alpha);
        }
        if (!actionBarLayout.S0 && this.D && this.f28680y && f2Var != null && f2Var.getListViewForSimpleGlass() == null && (i12 = org.telegram.messenger.g0.f22558n) >= org.telegram.messenger.g0.L(32.0f)) {
            int i15 = (int) (i12 * 1.33f);
            int navigationBarColor = f2Var.getNavigationBarColor();
            if (i15 != this.h || this.f28675n != navigationBarColor || this.f28678w == null) {
                if (this.f28678w == null) {
                    this.f28678w = new Paint(1);
                }
                this.f28675n = navigationBarColor;
                this.h = i15;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i15, new int[]{k6.r1(0.1f, navigationBarColor), k6.r1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f28676r = linearGradient;
                this.f28678w.setShader(linearGradient);
            }
            Matrix matrix = this.f28677s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i15);
            this.f28676r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i15, getWidth(), getHeight(), this.f28678w);
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
        if (this.f28672c != 0) {
            int i7 = k6.f27852d6;
            int x02 = k6.x0(null, i7, false);
            int i10 = this.f28673e;
            Paint paint = this.d;
            if (i10 != x02) {
                int x03 = k6.x0(null, i7, false);
                this.f28673e = x03;
                paint.setColor(x03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f28672c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        boolean z10 = false;
        int i15 = 0;
        while (true) {
            if (i15 < childCount) {
                View childAt = getChildAt(i15);
                if (childAt instanceof k) {
                    i13 = childAt.getMeasuredHeight();
                    childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i13);
                    break;
                }
                i15++;
            } else {
                i13 = 0;
                break;
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof k)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(2131296647) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof c2)) {
                    int i17 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i17, layoutParams.topMargin + i13, childAt2.getMeasuredWidth() + i17 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i13);
                } else {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f28670a;
        getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i14 = org.telegram.messenger.g0.f22557m;
        } else {
            i14 = 0;
        }
        if (((height - i14) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top) > 0) {
            z10 = true;
        }
        this.f28671b = z10;
        ActionBarLayout actionBarLayout = this.E;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.f27270s.f28671b && !actionBarLayout.f27278w.f28671b) {
            org.telegram.messenger.g0.r(runnable);
            actionBarLayout.d.run();
            actionBarLayout.d = null;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = this.f28674f;
        ActionBarLayout actionBarLayout = this.E;
        if (z10 != z9 && actionBarLayout.y()) {
            actionBarLayout.v();
        }
        this.f28674f = z9;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f28670a);
        d3 d3Var = actionBarLayout.E;
        if (d3Var != null) {
            d3Var.setCurrentAccount(p10.f24470s0);
        }
        int i14 = 0;
        while (true) {
            if (i14 < childCount) {
                View childAt = getChildAt(i14);
                if (childAt instanceof k) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    i11 = childAt.getMeasuredHeight();
                    break;
                }
                i14++;
            } else {
                i11 = 0;
                break;
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof k)) {
                if (childAt2 instanceof c2) {
                    if (actionBarLayout.w(false) <= 0 && this.f28680y) {
                        i13 = actionBarLayout.f27274t1.d;
                    } else {
                        i13 = 0;
                    }
                    measureChildWithMargins(childAt2, i7, 0, i10, i13);
                } else if (childAt2.getTag(2131296647) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i7, 0, i10, i11);
                } else {
                    if (this.f28680y) {
                        i12 = actionBarLayout.f27274t1.d;
                    } else {
                        i12 = 0;
                    }
                    measureChildWithMargins(childAt2, i7, 0, i10, i12);
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

    public void setDrawNavigationBar(boolean z9) {
        if (this.D != z9) {
            this.D = z9;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i7) {
        this.f28672c = i7;
        invalidate();
    }

    public void setShouldHandleBottomInsets(o3 o3Var) {
        boolean z9;
        if (this.f28679x != o3Var) {
            this.f28679x = o3Var;
            if (o3Var != o3.f28339a) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f28680y = z9;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.E;
            if (actionBarLayout.f27272s1 != null && getParent() == actionBarLayout) {
                actionBarLayout.o(this, actionBarLayout.f27272s1);
            } else if (view != null) {
                WeakHashMap weakHashMap = r0.i0.f54191a;
                r0.y.c(view);
            }
        }
    }
}
