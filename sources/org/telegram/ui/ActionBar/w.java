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
    public final ActionBarLayout A;

    public final Rect f23919a;

    public boolean f23920b;

    public int f23921c;
    public final Paint d;

    public int f23922e;

    public boolean f23923f;
    public int h;

    public int f23924n;

    public LinearGradient f23925r;

    public final Matrix f23926s;
    public Paint v;

    public y3 f23927w;

    public boolean f23928x;

    public boolean f23929y;

    public w(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.A = actionBarLayout;
        this.f23919a = new Rect();
        this.d = new Paint();
        this.f23926s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i10) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint paintL0 = g6.l0(i10);
        y3 y3Var = y3.f23973c;
        if (paddingLeft <= 0 || this.f23927w == y3Var) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), paintL0);
        }
        if (paddingRight > 0 && this.f23927w != y3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), paintL0);
        }
        if (paddingBottom > 0) {
            if (this.f23927w == y3.f23971a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), paintL0);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.z.c(this);
    }

    public final void b() {
        try {
            int childCount = getChildCount();
            int i10 = childCount - 1;
            while (true) {
                if (i10 < 0) {
                    i10 = -1;
                    break;
                }
                View childAt = getChildAt(i10);
                if ((childAt instanceof k2) && childAt.getVisibility() == 0) {
                    break;
                } else {
                    i10--;
                }
            }
            int i11 = 0;
            while (i11 < childCount) {
                View childAt2 = getChildAt(i11);
                if (childAt2 != null) {
                    int i12 = (i10 == -1 || i11 == i10) ? 0 : 4;
                    if (childAt2.getImportantForAccessibility() != i12) {
                        childAt2.setImportantForAccessibility(i12);
                    }
                }
                i11++;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.A;
        if (actionBarLayout.I0) {
            super.dispatchDraw(canvas);
            return;
        }
        x3 x3Var = actionBarLayout.f22686x;
        boolean z10 = false;
        int color = x3Var != null ? x3Var.getInternalNavbarPaint().getColor() : g6.w0(null, g6.f22999a7, false);
        if (this == actionBarLayout.f22684w) {
            org.telegram.ui.Components.y5 y5Var = actionBarLayout.X0;
            r rVar = actionBarLayout.C;
            if (rVar != null && rVar.hasSheet()) {
                z10 = true;
            }
            float fE = y5Var.e(z10);
            if (fE > 0.0f) {
                a(canvas, this.f23929y, g6.l1(fE, color));
            }
        } else {
            n2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.f22679s && this.f23927w != y3.f23971a) {
                    int childCount = getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        if (getChildAt(i10) instanceof k2) {
                            z10 = true;
                            break;
                        }
                    }
                }
                a(canvas, z10, color);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        ActionBarLayout actionBarLayout = this.A;
        boolean z10 = actionBarLayout.h && actionBarLayout.F == null;
        if ((!z10 && !actionBarLayout.T) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.f22679s) {
                        if (super.dispatchTouchEvent(motionEvent)) {
                            return true;
                        }
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            } else if (super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int shadowAlpha;
        int measuredHeight;
        int y10;
        int i10;
        Drawable drawable;
        ArrayList<j2> arrayList;
        ActionBarLayout actionBarLayout = this.A;
        n2 n2Var = !actionBarLayout.K0.isEmpty() ? (n2) i0.a.j(1, actionBarLayout.K0) : null;
        r rVar = actionBarLayout.C;
        if (rVar != null && (arrayList = rVar.sheetsStack) != null && !arrayList.isEmpty()) {
            n2Var = actionBarLayout.C;
        }
        j2 lastSheet = n2Var != null ? n2Var.getLastSheet() : null;
        if (lastSheet != null && lastSheet.isFullyVisible() && lastSheet.getWindowView() != view) {
            return true;
        }
        if (view instanceof k) {
            return super.drawChild(canvas, view, j10);
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 < childCount) {
                View childAt = getChildAt(i11);
                if (childAt != view && (childAt instanceof k) && childAt.getVisibility() == 0) {
                    k kVar = (k) childAt;
                    if (kVar.getCastShadows() && kVar.getShadowAlpha() > 0) {
                        measuredHeight = childAt.getMeasuredHeight();
                        y10 = (int) childAt.getY();
                        shadowAlpha = kVar.getShadowAlpha();
                        break;
                    }
                    break;
                }
                i11++;
            }
            shadowAlpha = 0;
            measuredHeight = 0;
            y10 = 0;
            break;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (measuredHeight != 0 && (drawable = ActionBarLayout.l1) != null) {
            int alpha = drawable.getAlpha();
            int i12 = y10 + measuredHeight;
            ActionBarLayout.l1.setBounds(0, i12, getMeasuredWidth(), ActionBarLayout.l1.getIntrinsicHeight() + i12);
            ActionBarLayout.l1.setAlpha(shadowAlpha);
            ActionBarLayout.l1.draw(canvas);
            ActionBarLayout.l1.setAlpha(alpha);
        }
        if (this.f23929y && this.f23928x && n2Var != null && (i10 = AndroidUtilities.navigationBarHeight) >= AndroidUtilities.dp(32.0f)) {
            int i13 = (int) (i10 * 1.33f);
            int navigationBarColor = n2Var.getNavigationBarColor();
            if (i13 != this.h || this.f23924n != navigationBarColor || this.v == null) {
                if (this.v == null) {
                    this.v = new Paint(1);
                }
                this.f23924n = navigationBarColor;
                this.h = i13;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i13, new int[]{g6.l1(0.1f, navigationBarColor), g6.l1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.f23925r = linearGradient;
                this.v.setShader(linearGradient);
            }
            Matrix matrix = this.f23926s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i13);
            this.f23925r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i13, getWidth(), getHeight(), this.v);
        }
        return zDrawChild;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f23921c != 0) {
            int i10 = g6.f23053d6;
            int iW0 = g6.w0(null, i10, false);
            int i11 = this.f23922e;
            Paint paint = this.d;
            if (i11 != iW0) {
                int iW1 = g6.w0(null, i10, false);
                this.f23922e = iW1;
                paint.setColor(iW1);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.f23921c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                measuredHeight = 0;
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt instanceof k) {
                measuredHeight = childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, measuredHeight);
                break;
            }
            i14++;
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof k)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows() || (childAt2 instanceof k2)) {
                    int i16 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i16, layoutParams.topMargin, childAt2.getMeasuredWidth() + i16 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                } else {
                    int i17 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i17, layoutParams.topMargin + measuredHeight, childAt2.getMeasuredWidth() + i17 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + measuredHeight);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.f23919a;
        getWindowVisibleDisplayFrame(rect);
        this.f23920b = ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top) > 0;
        ActionBarLayout actionBarLayout = this.A;
        Runnable runnable = actionBarLayout.d;
        if (runnable == null || actionBarLayout.f22679s.f23920b || actionBarLayout.v.f23920b) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        actionBarLayout.d.run();
        actionBarLayout.d = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        boolean z11 = this.f23923f;
        ActionBarLayout actionBarLayout = this.A;
        if (z11 != z10 && actionBarLayout.y() && (actionBarLayout.h || actionBarLayout.T)) {
            Runnable runnable = actionBarLayout.f22655e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.f22655e = null;
            }
            actionBarLayout.l(true, false);
        }
        this.f23923f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.f23919a);
        m3 m3Var = actionBarLayout.A;
        if (m3Var != null) {
            m3Var.setCurrentAccount(UserConfig.selectedAccount);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                measuredHeight = 0;
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof k) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                measuredHeight = childAt.getMeasuredHeight();
                break;
            }
            i12++;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (!(childAt2 instanceof k)) {
                if (childAt2 instanceof k2) {
                    measureChildWithMargins(childAt2, i10, 0, i11, (actionBarLayout.v(false) > 0 || !this.f23928x) ? 0 : actionBarLayout.f22668j1.d);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, this.f23928x ? actionBarLayout.f22668j1.d : 0);
                } else {
                    measureChildWithMargins(childAt2, i10, 0, i11, measuredHeight);
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
        if (this.f23929y != z10) {
            this.f23929y = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i10) {
        this.f23921c = i10;
        invalidate();
    }

    public void setShouldHandleBottomInsets(y3 y3Var) {
        if (this.f23927w != y3Var) {
            this.f23927w = y3Var;
            this.f23928x = y3Var != y3.f23971a;
            View view = (View) getParent();
            WeakHashMap weakHashMap = r0.j0.f46605a;
            r0.z.c(view);
        }
    }
}
