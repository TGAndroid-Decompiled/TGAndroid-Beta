package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.dd;
public class p4 extends FrameLayout {
    public int f22451a;
    public final int f22452b;
    public final int f22453c;
    public final TextView d;
    public final org.telegram.ui.Components.f6 e;
    public final org.telegram.ui.ActionBar.u5 f22454f;
    public int h;
    public final boolean f22455n;

    public p4(Context context) {
        this(context, org.telegram.ui.ActionBar.t6.L6, 20, 7, false, null);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f7 = 0.5f;
        TextView textView = this.d;
        if (arrayList != null) {
            if (z10) {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f7));
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        textView.setAlpha(f7);
    }

    public final void b(boolean z10) {
        float f7;
        super.setEnabled(z10);
        ViewPropertyAnimator animate = this.d.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).start();
    }

    public final void c(CharSequence charSequence, boolean z10) {
        int i10 = 3;
        if (this.f22455n) {
            if (dd.X) {
                i10 = 5;
            }
            int i11 = i10 | 16;
            org.telegram.ui.Components.f6 f6Var = this.e;
            f6Var.setGravity(i11);
            f6Var.c(charSequence, z10, true);
            return;
        }
        if (dd.X) {
            i10 = 5;
        }
        TextView textView = this.d;
        textView.setGravity(i10 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.e.getDrawable().c();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.u5 getTextView2() {
        return this.f22454f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo.setHeading(true);
        } else {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), true));
            }
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setBottomMargin(int i10) {
        float f7 = i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(f7);
        org.telegram.ui.ActionBar.u5 u5Var = this.f22454f;
        if (u5Var != null) {
            ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(f7);
        }
    }

    public void setHeight(int i10) {
        this.h = i10;
        int L = org.telegram.messenger.i0.L(i10);
        TextView textView = this.d;
        int i11 = L - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        if (textView.getMinHeight() != i11) {
            textView.setMinHeight(i11);
            requestLayout();
        }
    }

    public void setOnWidthUpdateListener(Runnable runnable) {
        this.e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.u5 u5Var = this.f22454f;
        if (u5Var == null) {
            return;
        }
        u5Var.l(charSequence, false);
    }

    public void setTextColor(int i10) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        org.telegram.ui.Components.f6 f6Var = this.e;
        if (f6Var != null) {
            f6Var.setTextColor(i10);
        }
    }

    public void setTextSize(float f7) {
        if (this.f22455n) {
            this.e.setTextSize(org.telegram.messenger.i0.L(f7));
            return;
        }
        this.d.setTextSize(1, f7);
    }

    public void setTopMargin(int i10) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(i10);
        setHeight(this.h);
    }

    public p4(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, org.telegram.ui.ActionBar.t6.L6, 20, 7, false, p6Var);
    }

    public p4(Context context, int i10) {
        this(context, org.telegram.ui.ActionBar.t6.L6, i10, 7, false, null);
    }

    public p4(Context context, int i10, int i11, int i12, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, i10, i11, i12, 0, z10, false, p6Var);
    }

    public p4(Context context, int i10, int i11, int i12, int i13, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = 40;
        this.f22452b = i11;
        this.f22453c = i13;
        this.f22455n = z11;
        if (z11) {
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getContext(), false, false, false);
            this.e = f6Var;
            f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
            f6Var.setTypeface(org.telegram.messenger.i0.o());
            f6Var.setGravity((dd.X ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.a7.Z(f6Var, i10, p6Var);
            f6Var.setTag(Integer.valueOf(i10));
            f6Var.getDrawable().r(true, false);
            float f7 = i11;
            addView(f6Var, w7.b6.d(-1, this.h - i12, (dd.X ? 5 : 3) | 48, f7, i12, f7, z10 ? 0.0f : i13));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            sc.e.t(textView, 1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((dd.X ? 5 : 3) | 16);
            textView.setMinHeight(org.telegram.messenger.i0.L(this.h - i12));
            org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
            textView.setTag(Integer.valueOf(i10));
            float f10 = i11;
            addView(textView, w7.b6.d(-1, -1.0f, (dd.X ? 5 : 3) | 48, f10, i12, f10, z10 ? 0.0f : i13));
        }
        if (z10) {
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
            this.f22454f = u5Var;
            u5Var.setTextSize(13);
            u5Var.setGravity((dd.X ? 3 : 5) | 48);
            float f11 = i11;
            addView(u5Var, w7.b6.d(-1, -1.0f, (dd.X ? 3 : 5) | 48, f11, 21.0f, f11, i13));
        }
        WeakHashMap weakHashMap = r0.h0.f46134a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
