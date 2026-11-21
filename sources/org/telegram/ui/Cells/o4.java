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
import org.telegram.messenger.gd;
public class o4 extends FrameLayout {
    public int f31201a;
    public final int f31202b;
    public final int f31203c;
    public final TextView d;
    public final org.telegram.ui.Components.o6 f31204e;
    public final org.telegram.ui.ActionBar.m5 f31205f;
    public int h;
    public final boolean f31206n;

    public o4(Context context) {
        this(context, org.telegram.ui.ActionBar.m6.L6, 20, 7, false, null);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10 = 0.5f;
        TextView textView = this.d;
        if (arrayList != null) {
            if (z10) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f10));
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        textView.setAlpha(f10);
    }

    public final void b(boolean z10) {
        float f10;
        super.setEnabled(z10);
        ViewPropertyAnimator animate = this.d.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
    }

    public final void c(CharSequence charSequence, boolean z10) {
        int i7 = 3;
        if (this.f31206n) {
            if (gd.f24241a0) {
                i7 = 5;
            }
            int i10 = i7 | 16;
            org.telegram.ui.Components.o6 o6Var = this.f31204e;
            o6Var.setGravity(i10);
            o6Var.c(charSequence, z10, true);
            return;
        }
        if (gd.f24241a0) {
            i7 = 5;
        }
        TextView textView = this.d;
        textView.setGravity(i7 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.f31204e.getDrawable().c();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.m5 getTextView2() {
        return this.f31205f;
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setBottomMargin(int i7) {
        float f10 = i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
        org.telegram.ui.ActionBar.m5 m5Var = this.f31205f;
        if (m5Var != null) {
            ((FrameLayout.LayoutParams) m5Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
        }
    }

    public void setHeight(int i7) {
        this.h = i7;
        int L = org.telegram.messenger.g0.L(i7);
        TextView textView = this.d;
        int i10 = L - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        if (textView.getMinHeight() != i10) {
            textView.setMinHeight(i10);
            requestLayout();
        }
    }

    public void setOnWidthUpdateListener(Runnable runnable) {
        this.f31204e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f31205f;
        if (m5Var == null) {
            return;
        }
        m5Var.l(charSequence, false);
    }

    public void setTextColor(int i7) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i7);
        }
        org.telegram.ui.Components.o6 o6Var = this.f31204e;
        if (o6Var != null) {
            o6Var.setTextColor(i7);
        }
    }

    public void setTextSize(float f10) {
        if (this.f31206n) {
            this.f31204e.setTextSize(org.telegram.messenger.g0.L(f10));
            return;
        }
        this.d.setTextSize(1, f10);
    }

    public void setTopMargin(int i7) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(i7);
        setHeight(this.h);
    }

    public o4(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, org.telegram.ui.ActionBar.m6.L6, 20, 7, false, h6Var);
    }

    public o4(Context context, int i7) {
        this(context, org.telegram.ui.ActionBar.m6.L6, i7, 7, false, null);
    }

    public o4(Context context, int i7, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, i7, i10, i11, 0, z10, false, h6Var);
    }

    public o4(Context context, int i7, int i10, int i11, int i12, boolean z10, boolean z11, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = 40;
        this.f31202b = i10;
        this.f31203c = i12;
        this.f31206n = z11;
        if (z11) {
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), false, false, false);
            this.f31204e = o6Var;
            o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            o6Var.setTypeface(org.telegram.messenger.g0.o());
            o6Var.setGravity((gd.f24241a0 ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.t6.Y(o6Var, i7, h6Var);
            o6Var.setTag(Integer.valueOf(i7));
            o6Var.getDrawable().r(true, false);
            float f10 = i10;
            addView(o6Var, c8.ma.d(-1, this.h - i11, (gd.f24241a0 ? 5 : 3) | 48, f10, i11, f10, z10 ? 0.0f : i12));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            i5.c.x(textView, 1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((gd.f24241a0 ? 5 : 3) | 16);
            textView.setMinHeight(org.telegram.messenger.g0.L(this.h - i11));
            org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
            textView.setTag(Integer.valueOf(i7));
            float f11 = i10;
            addView(textView, c8.ma.d(-1, -1.0f, (gd.f24241a0 ? 5 : 3) | 48, f11, i11, f11, z10 ? 0.0f : i12));
        }
        if (z10) {
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
            this.f31205f = m5Var;
            m5Var.setTextSize(13);
            m5Var.setGravity((gd.f24241a0 ? 3 : 5) | 48);
            float f12 = i10;
            addView(m5Var, c8.ma.d(-1, -1.0f, (gd.f24241a0 ? 3 : 5) | 48, f12, 21.0f, f12, i12));
        }
        WeakHashMap weakHashMap = r0.i0.f56285a;
        new r0.v(2131296686, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
