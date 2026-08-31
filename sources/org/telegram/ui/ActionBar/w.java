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
import org.telegram.ui.yh;
public final class w extends FrameLayout {
    public final ActionBarLayout B;
    public final Rect f22331a;
    public boolean f22332b;
    public int f22333c;
    public final Paint d;
    public int f22334e;
    public boolean f22335f;
    public int h;
    public int f22336n;
    public LinearGradient f22337r;
    public final Matrix f22338s;
    public Paint v;
    public a4 f22339w;
    public boolean f22340x;
    public boolean f22341y;

    public w(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.B = actionBarLayout;
        this.f22331a = new Rect();
        this.d = new Paint();
        this.f22338s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z4, int i10) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint l02 = k6.l0(i10);
        a4 a4Var = a4.f21182c;
        if (paddingLeft > 0 && this.f22339w != a4Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), l02);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.f22339w != a4Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), l02);
        }
        if (paddingBottom > 0) {
            if (this.f22339w == a4.f21180a || z4) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), l02);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.z.c(this);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w.b():void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        ActionBarLayout actionBarLayout = this.B;
        if (actionBarLayout.J0) {
            super.dispatchDraw(canvas);
            return;
        }
        z3 z3Var = actionBarLayout.f21150x;
        boolean z4 = false;
        if (z3Var != null) {
            w02 = z3Var.getInternalNavbarPaint().getColor();
        } else {
            w02 = k6.w0(null, k6.f21605a7, false);
        }
        if (this == actionBarLayout.f21148w) {
            org.telegram.ui.Components.z5 z5Var = actionBarLayout.Y0;
            r rVar = actionBarLayout.D;
            if (rVar != null && rVar.hasSheet()) {
                z4 = true;
            }
            float e6 = z5Var.e(z4);
            if (e6 > 0.0f) {
                a(canvas, this.f22341y, k6.l1(e6, w02));
            }
        } else {
            p2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f21143s && this.f22339w != a4.f21180a) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        } else if (getChildAt(i10) instanceof m2) {
                            z4 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                a(canvas, z4, w02);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        motionEvent.getAction();
        ActionBarLayout actionBarLayout = this.B;
        if (actionBarLayout.h && actionBarLayout.G == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((!z4 && !actionBarLayout.U) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z4) {
                try {
                    if (this != actionBarLayout.f21143s) {
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
        p2 p2Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Drawable drawable;
        ArrayList<l2> arrayList;
        ActionBarLayout actionBarLayout = this.B;
        l2 l2Var = null;
        if (!actionBarLayout.L0.isEmpty()) {
            p2Var = (p2) yh.j(1, actionBarLayout.L0);
        } else {
            p2Var = null;
        }
        r rVar = actionBarLayout.D;
        if (rVar != null && (arrayList = rVar.sheetsStack) != null && !arrayList.isEmpty()) {
            p2Var = actionBarLayout.D;
        }
        if (p2Var != null) {
            l2Var = p2Var.getLastSheet();
        }
        if (l2Var != null && l2Var.isFullyVisible() && l2Var.getWindowView() != view) {
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
        if (i11 != 0 && (drawable = ActionBarLayout.f21105m1) != null) {
            int alpha = drawable.getAlpha();
            int i15 = i12 + i11;
            ActionBarLayout.f21105m1.setBounds(0, i15, getMeasuredWidth(), ActionBarLayout.f21105m1.getIntrinsicHeight() + i15);
            ActionBarLayout.f21105m1.setAlpha(i10);
            ActionBarLayout.f21105m1.draw(canvas);
            ActionBarLayout.f21105m1.setAlpha(alpha);
        }
        if (this.f22341y && this.f22340x && p2Var != null && (i13 = AndroidUtilities.navigationBarHeight) >= AndroidUtilities.dp(32.0f)) {
            int i16 = (int) (i13 * 1.33f);
            int navigationBarColor = p2Var.getNavigationBarColor();
            if (i16 != this.h || this.f22336n != navigationBarColor || this.v == null) {
                if (this.v == null) {
                    this.v = new Paint(1);
                }
                this.f22336n = navigationBarColor;
                this.h = i16;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i16, new int[]{k6.l1(0.1f, navigationBarColor), k6.l1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f22337r = linearGradient;
                this.v.setShader(linearGradient);
            }
            Matrix matrix = this.f22338s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i16);
            this.f22337r.setLocalMatrix(matrix);
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
        if (this.f22333c != 0) {
            int i10 = k6.f21659d6;
            int w02 = k6.w0(null, i10, false);
            int i11 = this.f22334e;
            Paint paint = this.d;
            if (i11 != w02) {
                int w03 = k6.w0(null, i10, false);
                this.f22334e = w03;
                paint.setColor(w03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f22333c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        boolean z10 = false;
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
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof m2)) {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin + i14, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i14);
                } else {
                    int i19 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i19, layoutParams.topMargin, childAt2.getMeasuredWidth() + i19 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f22331a;
        getWindowVisibleDisplayFrame(rect);
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i15 = AndroidUtilities.statusBarHeight;
        } else {
            i15 = 0;
        }
        if (((height - i15) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top) > 0) {
            z10 = true;
        }
        this.f22332b = z10;
        ActionBarLayout actionBarLayout = this.B;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.f21143s.f22332b && !actionBarLayout.v.f22332b) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            actionBarLayout.d.run();
            actionBarLayout.d = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = this.f22335f;
        ActionBarLayout actionBarLayout = this.B;
        if (z10 != z4 && actionBarLayout.y() && (actionBarLayout.h || actionBarLayout.U)) {
            Runnable runnable = actionBarLayout.f21119e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.f21119e = null;
            }
            actionBarLayout.l(true, false);
        }
        this.f22335f = z4;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f22331a);
        o3 o3Var = actionBarLayout.B;
        if (o3Var != null) {
            o3Var.setCurrentAccount(UserConfig.selectedAccount);
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
                if (childAt2 instanceof m2) {
                    if (actionBarLayout.v(false) <= 0 && this.f22340x) {
                        i14 = actionBarLayout.f21134k1.d;
                    } else {
                        i14 = 0;
                    }
                    measureChildWithMargins(childAt2, i10, 0, i11, i14);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                } else {
                    if (this.f22340x) {
                        i13 = actionBarLayout.f21134k1.d;
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

    public void setDrawNavigationBar(boolean z4) {
        if (this.f22341y != z4) {
            this.f22341y = z4;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i10) {
        this.f22333c = i10;
        invalidate();
    }

    public void setShouldHandleBottomInsets(a4 a4Var) {
        boolean z4;
        if (this.f22339w != a4Var) {
            this.f22339w = a4Var;
            if (a4Var != a4.f21180a) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f22340x = z4;
            WeakHashMap weakHashMap = r0.j0.f46438a;
            r0.z.c((View) getParent());
        }
    }
}
