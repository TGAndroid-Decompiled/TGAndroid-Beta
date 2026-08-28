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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public class m4 extends FrameLayout {
    public int f24704a;
    public final int f24705b;
    public final int f24706c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 f24707e;
    public final org.telegram.ui.ActionBar.h5 f24708f;
    public int h;
    public final boolean f24709n;

    public m4(Context context) {
        this(context, org.telegram.ui.ActionBar.f6.L6, 18, 7, false, null);
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
        int i9 = 3;
        if (this.f24709n) {
            if (LocaleController.isRTL) {
                i9 = 5;
            }
            int i10 = i9 | 16;
            org.telegram.ui.Components.j6 j6Var = this.f24707e;
            j6Var.setGravity(i10);
            j6Var.c(charSequence, z10, true);
            return;
        }
        if (LocaleController.isRTL) {
            i9 = 5;
        }
        TextView textView = this.d;
        textView.setGravity(i9 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.f24707e.getDrawable().d();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.h5 getTextView2() {
        return this.f24708f;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void setBottomMargin(int i9) {
        float f10 = i9;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708f;
        if (h5Var != null) {
            ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
        }
    }

    public void setHeight(int i9) {
        this.h = i9;
        int dp = AndroidUtilities.dp(i9);
        TextView textView = this.d;
        int i10 = dp - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        if (textView.getMinHeight() != i10) {
            textView.setMinHeight(i10);
            requestLayout();
        }
    }

    public void setOnWidthUpdateListener(Runnable runnable) {
        this.f24707e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24708f;
        if (h5Var == null) {
            return;
        }
        h5Var.l(charSequence, false);
    }

    public void setTextColor(int i9) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i9);
        }
        org.telegram.ui.Components.j6 j6Var = this.f24707e;
        if (j6Var != null) {
            j6Var.setTextColor(i9);
        }
    }

    public void setTextSize(float f10) {
        if (this.f24709n) {
            this.f24707e.setTextSize(AndroidUtilities.dp(f10));
            return;
        }
        this.d.setTextSize(1, f10);
    }

    public void setTopMargin(int i9) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = AndroidUtilities.dp(i9);
        setHeight(this.h);
    }

    public m4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, org.telegram.ui.ActionBar.f6.L6, 18, 7, false, b6Var);
    }

    public m4(Context context, int i9) {
        this(context, org.telegram.ui.ActionBar.f6.L6, i9, 7, false, null);
    }

    public m4(Context context, int i9, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, i9, i10, i11, 0, z10, false, b6Var);
    }

    public m4(Context context, int i9, int i10, int i11, int i12, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = 40;
        this.f24705b = i10;
        this.f24706c = i12;
        this.f24709n = z11;
        if (z11) {
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, false, false);
            this.f24707e = j6Var;
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            j6Var.setTag(Integer.valueOf(i9));
            j6Var.getDrawable().o(true, false, false);
            float f10 = i10;
            addView(j6Var, g7.e6.d(-1, this.h - i11, (LocaleController.isRTL ? 5 : 3) | 48, f10, i11, f10, z10 ? 0.0f : i12));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            j3.r0.u(14.0f, 1, textView);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView.setMinHeight(AndroidUtilities.dp(this.h - i11));
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            textView.setTag(Integer.valueOf(i9));
            float f11 = i10;
            addView(textView, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f11, i11, f11, z10 ? 0.0f : i12));
        }
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f24708f = h5Var;
            h5Var.setTextSize(13);
            h5Var.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            float f12 = i10;
            addView(h5Var, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f12, 21.0f, f12, i12));
        }
        WeakHashMap weakHashMap = r0.j0.f46915a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
