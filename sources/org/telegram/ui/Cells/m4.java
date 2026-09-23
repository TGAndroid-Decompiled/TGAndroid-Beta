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
    public int f20404a;
    public final int f20405b;
    public final int f20406c;
    public final TextView d;
    public final org.telegram.ui.Components.p6 e;
    public final org.telegram.ui.ActionBar.i5 f20407f;
    public int h;
    public final boolean f20408n;

    public m4(Context context) {
        this(context, org.telegram.ui.ActionBar.h6.L6, 18, 7, false, null);
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
        if (this.f20408n) {
            if (LocaleController.isRTL) {
                i10 = 5;
            }
            int i11 = i10 | 16;
            org.telegram.ui.Components.p6 p6Var = this.e;
            p6Var.setGravity(i11);
            p6Var.c(charSequence, z10, true);
            return;
        }
        if (LocaleController.isRTL) {
            i10 = 5;
        }
        TextView textView = this.d;
        textView.setGravity(i10 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.e.getDrawable().d();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.i5 getTextView2() {
        return this.f20407f;
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
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
        org.telegram.ui.ActionBar.i5 i5Var = this.f20407f;
        if (i5Var != null) {
            ((FrameLayout.LayoutParams) i5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
        }
    }

    public void setHeight(int i10) {
        this.h = i10;
        int dp = AndroidUtilities.dp(i10);
        TextView textView = this.d;
        int i11 = dp - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
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
        org.telegram.ui.ActionBar.i5 i5Var = this.f20407f;
        if (i5Var == null) {
            return;
        }
        i5Var.l(charSequence, false);
    }

    public void setTextColor(int i10) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        org.telegram.ui.Components.p6 p6Var = this.e;
        if (p6Var != null) {
            p6Var.setTextColor(i10);
        }
    }

    public void setTextSize(float f7) {
        if (this.f20408n) {
            this.e.setTextSize(AndroidUtilities.dp(f7));
            return;
        }
        this.d.setTextSize(1, f7);
    }

    public void setTopMargin(int i10) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = AndroidUtilities.dp(i10);
        setHeight(this.h);
    }

    public m4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, org.telegram.ui.ActionBar.h6.L6, 18, 7, false, d6Var);
    }

    public m4(Context context, int i10) {
        this(context, org.telegram.ui.ActionBar.h6.L6, i10, 7, false, null);
    }

    public m4(Context context, int i10, int i11, int i12, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, i11, i12, 0, z10, false, d6Var);
    }

    public m4(Context context, int i10, int i11, int i12, int i13, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 40;
        this.f20405b = i11;
        this.f20406c = i13;
        this.f20408n = z11;
        if (z11) {
            org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getContext(), false, false, false);
            this.e = p6Var;
            p6Var.setTextSize(AndroidUtilities.dp(14.0f));
            p6Var.setTypeface(AndroidUtilities.bold());
            p6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            p6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
            p6Var.setTag(Integer.valueOf(i10));
            p6Var.getDrawable().o(true, false, false);
            float f7 = i11;
            addView(p6Var, w7.x5.d(-1, this.h - i12, (LocaleController.isRTL ? 5 : 3) | 48, f7, i12, f7, z10 ? 0.0f : i13));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView.setMinHeight(AndroidUtilities.dp(this.h - i12));
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
            textView.setTag(Integer.valueOf(i10));
            float f10 = i11;
            addView(textView, w7.x5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, i12, f10, z10 ? 0.0f : i13));
        }
        if (z10) {
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(getContext());
            this.f20407f = i5Var;
            i5Var.setTextSize(13);
            i5Var.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            float f11 = i11;
            addView(i5Var, w7.x5.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f11, 21.0f, f11, i13));
        }
        WeakHashMap weakHashMap = r0.i0.f41795a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
