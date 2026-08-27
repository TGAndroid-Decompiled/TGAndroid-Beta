package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public class j4 extends FrameLayout {

    public int f24525a;

    public final int f24526b;

    public final int f24527c;
    public final TextView d;

    public final org.telegram.ui.Components.j6 f24528e;

    public final org.telegram.ui.ActionBar.h5 f24529f;
    public int h;

    public final boolean f24530n;

    public j4(Context context) {
        this(context, org.telegram.ui.ActionBar.g6.L6, 18, 7, false, null);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        TextView textView = this.d;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.5f));
        } else {
            textView.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public final void b(boolean z10) {
        super.setEnabled(z10);
        this.d.animate().alpha(z10 ? 1.0f : 0.5f).start();
    }

    public final void c(CharSequence charSequence, boolean z10) {
        if (this.f24530n) {
            int i10 = (LocaleController.isRTL ? 5 : 3) | 16;
            org.telegram.ui.Components.j6 j6Var = this.f24528e;
            j6Var.setGravity(i10);
            j6Var.c(charSequence, z10, true);
            return;
        }
        int i11 = LocaleController.isRTL ? 5 : 3;
        TextView textView = this.d;
        textView.setGravity(i11 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.f24528e.getDrawable().d();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.h5 getTextView2() {
        return this.f24529f;
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
        float f10 = i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24529f;
        if (h5Var != null) {
            ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
        }
    }

    public void setHeight(int i10) {
        this.h = i10;
        int iDp = AndroidUtilities.dp(i10);
        TextView textView = this.d;
        int i11 = iDp - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        if (textView.getMinHeight() != i11) {
            textView.setMinHeight(i11);
            requestLayout();
        }
    }

    public void setOnWidthUpdateListener(Runnable runnable) {
        this.f24528e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24529f;
        if (h5Var == null) {
            return;
        }
        h5Var.l(charSequence, false);
    }

    public void setTextColor(int i10) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        org.telegram.ui.Components.j6 j6Var = this.f24528e;
        if (j6Var != null) {
            j6Var.setTextColor(i10);
        }
    }

    public void setTextSize(float f10) {
        if (!this.f24530n) {
            this.d.setTextSize(1, f10);
        } else {
            this.f24528e.setTextSize(AndroidUtilities.dp(f10));
        }
    }

    public void setTopMargin(int i10) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = AndroidUtilities.dp(i10);
        setHeight(this.h);
    }

    public j4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, org.telegram.ui.ActionBar.g6.L6, 18, 7, false, c6Var);
    }

    public j4(Context context, int i10) {
        this(context, org.telegram.ui.ActionBar.g6.L6, i10, 7, false, null);
    }

    public j4(Context context, int i10, int i11, int i12, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, i11, i12, 0, z10, false, c6Var);
    }

    public j4(Context context, int i10, int i11, int i12, int i13, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = 40;
        this.f24526b = i11;
        this.f24527c = i13;
        this.f24530n = z11;
        if (z11) {
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, false, false);
            this.f24528e = j6Var;
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            j6Var.setTag(Integer.valueOf(i10));
            j6Var.getDrawable().o(true, false, false);
            float f10 = i11;
            addView(j6Var, h7.z5.d(-1, this.h - i12, (LocaleController.isRTL ? 5 : 3) | 48, f10, i12, f10, z10 ? 0.0f : i13));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            pa.m(14.0f, 1, textView);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView.setMinHeight(AndroidUtilities.dp(this.h - i12));
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            textView.setTag(Integer.valueOf(i10));
            float f11 = i11;
            addView(textView, h7.z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f11, i12, f11, z10 ? 0.0f : i13));
        }
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f24529f = h5Var;
            h5Var.setTextSize(13);
            h5Var.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            float f12 = i11;
            addView(h5Var, h7.z5.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f12, 21.0f, f12, i13));
        }
        WeakHashMap weakHashMap = r0.j0.f46605a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
