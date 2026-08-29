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
public final class x extends FrameLayout {
    public final ActionBarLayout A;
    public final Rect f23947a;
    public boolean f23948b;
    public int f23949c;
    public final Paint d;
    public int f23950e;
    public boolean f23951f;
    public int h;
    public int f23952n;
    public LinearGradient f23953r;
    public final Matrix f23954s;
    public Paint v;
    public y3 f23955w;
    public boolean f23956x;
    public boolean f23957y;

    public x(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.A = actionBarLayout;
        this.f23947a = new Rect();
        this.d = new Paint();
        this.f23954s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i10) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint l02 = g6.l0(i10);
        y3 y3Var = y3.f23984c;
        if (paddingLeft > 0 && this.f23955w != y3Var) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), l02);
        } else {
            canvas2 = canvas;
        }
        if (paddingRight > 0 && this.f23955w != y3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), l02);
        }
        if (paddingBottom > 0) {
            if (this.f23955w == y3.f23982a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), l02);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.z.c(this);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.x.b():void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        ActionBarLayout actionBarLayout = this.A;
        if (actionBarLayout.I0) {
            super.dispatchDraw(canvas);
            return;
        }
        x3 x3Var = actionBarLayout.f22698x;
        boolean z10 = false;
        if (x3Var != null) {
            w02 = x3Var.getInternalNavbarPaint().getColor();
        } else {
            w02 = g6.w0(null, g6.f23009a7, false);
        }
        if (this == actionBarLayout.f22696w) {
            org.telegram.ui.Components.d6 d6Var = actionBarLayout.X0;
            s sVar = actionBarLayout.C;
            if (sVar != null && sVar.hasSheet()) {
                z10 = true;
            }
            float e10 = d6Var.e(z10);
            if (e10 > 0.0f) {
                a(canvas, this.f23957y, g6.l1(e10, w02));
            }
        } else {
            o2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f22691s && this.f23955w != y3.f23982a) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        } else if (getChildAt(i10) instanceof l2) {
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
        ActionBarLayout actionBarLayout = this.A;
        if (actionBarLayout.h && actionBarLayout.F == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 && !actionBarLayout.T) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.f22691s) {
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
        o2 o2Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Drawable drawable;
        ArrayList<k2> arrayList;
        ActionBarLayout actionBarLayout = this.A;
        k2 k2Var = null;
        if (!actionBarLayout.K0.isEmpty()) {
            o2Var = (o2) j7.l1.j(1, actionBarLayout.K0);
        } else {
            o2Var = null;
        }
        s sVar = actionBarLayout.C;
        if (sVar != null && (arrayList = sVar.sheetsStack) != null && !arrayList.isEmpty()) {
            o2Var = actionBarLayout.C;
        }
        if (o2Var != null) {
            k2Var = o2Var.getLastSheet();
        }
        if (k2Var != null && k2Var.isFullyVisible() && k2Var.getWindowView() != view) {
            return true;
        }
        if (view instanceof l) {
            return super.drawChild(canvas, view, j10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt != view && (childAt instanceof l) && childAt.getVisibility() == 0) {
                l lVar = (l) childAt;
                if (lVar.getCastShadows() && lVar.getShadowAlpha() > 0) {
                    i11 = childAt.getMeasuredHeight();
                    i12 = (int) childAt.getY();
                    i10 = lVar.getShadowAlpha();
                }
            } else {
                i14++;
            }
        }
        i10 = 0;
        i11 = 0;
        i12 = 0;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i11 != 0 && (drawable = ActionBarLayout.l1) != null) {
            int alpha = drawable.getAlpha();
            int i15 = i12 + i11;
            ActionBarLayout.l1.setBounds(0, i15, getMeasuredWidth(), ActionBarLayout.l1.getIntrinsicHeight() + i15);
            ActionBarLayout.l1.setAlpha(i10);
            ActionBarLayout.l1.draw(canvas);
            ActionBarLayout.l1.setAlpha(alpha);
        }
        if (this.f23957y && this.f23956x && o2Var != null && (i13 = AndroidUtilities.navigationBarHeight) >= AndroidUtilities.dp(32.0f)) {
            int i16 = (int) (i13 * 1.33f);
            int navigationBarColor = o2Var.getNavigationBarColor();
            if (i16 != this.h || this.f23952n != navigationBarColor || this.v == null) {
                if (this.v == null) {
                    this.v = new Paint(1);
                }
                this.f23952n = navigationBarColor;
                this.h = i16;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i16, new int[]{g6.l1(0.1f, navigationBarColor), g6.l1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f23953r = linearGradient;
                this.v.setShader(linearGradient);
            }
            Matrix matrix = this.f23954s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i16);
            this.f23953r.setLocalMatrix(matrix);
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
        if (this.f23949c != 0) {
            int i10 = g6.f23062d6;
            int w02 = g6.w0(null, i10, false);
            int i11 = this.f23950e;
            Paint paint = this.d;
            if (i11 != w02) {
                int w03 = g6.w0(null, i10, false);
                this.f23950e = w03;
                paint.setColor(w03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f23949c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
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
                if (childAt instanceof l) {
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
            if (!(childAt2 instanceof l)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) == null && !childAt2.getFitsSystemWindows() && !(childAt2 instanceof l2)) {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin + i14, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i14);
                } else {
                    int i19 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i19, layoutParams.topMargin, childAt2.getMeasuredWidth() + i19 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f23947a;
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
        this.f23948b = z11;
        ActionBarLayout actionBarLayout = this.A;
        Runnable runnable = actionBarLayout.d;
        if (runnable != null && !actionBarLayout.f22691s.f23948b && !actionBarLayout.v.f23948b) {
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
        boolean z11 = this.f23951f;
        ActionBarLayout actionBarLayout = this.A;
        if (z11 != z10 && actionBarLayout.y() && (actionBarLayout.h || actionBarLayout.T)) {
            Runnable runnable = actionBarLayout.f22667e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.f22667e = null;
            }
            actionBarLayout.l(true, false);
        }
        this.f23951f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f23947a);
        m3 m3Var = actionBarLayout.A;
        if (m3Var != null) {
            m3Var.setCurrentAccount(UserConfig.selectedAccount);
        }
        int i15 = 0;
        while (true) {
            if (i15 < childCount) {
                View childAt = getChildAt(i15);
                if (childAt instanceof l) {
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
            if (!(childAt2 instanceof l)) {
                if (childAt2 instanceof l2) {
                    if (actionBarLayout.v(false) <= 0 && this.f23956x) {
                        i14 = actionBarLayout.f22680j1.d;
                    } else {
                        i14 = 0;
                    }
                    measureChildWithMargins(childAt2, i10, 0, i11, i14);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) == null && !childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                } else {
                    if (this.f23956x) {
                        i13 = actionBarLayout.f22680j1.d;
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
        if (this.f23957y != z10) {
            this.f23957y = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i10) {
        this.f23949c = i10;
        invalidate();
    }

    public void setShouldHandleBottomInsets(y3 y3Var) {
        boolean z10;
        if (this.f23955w != y3Var) {
            this.f23955w = y3Var;
            if (y3Var != y3.f23982a) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f23956x = z10;
            WeakHashMap weakHashMap = r0.j0.f46829a;
            r0.z.c((View) getParent());
        }
    }
}
