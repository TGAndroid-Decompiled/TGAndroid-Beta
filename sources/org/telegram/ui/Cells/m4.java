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
    public int f22448a;
    public final int f22449b;
    public final int f22450c;
    public final TextView d;
    public final org.telegram.ui.Components.r6 f22451e;
    public final org.telegram.ui.ActionBar.h5 f22452f;
    public int h;
    public final boolean f22453n;

    public m4(Context context) {
        this(context, org.telegram.ui.ActionBar.h6.L6, 20, 7, false, null);
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
        if (this.f22453n) {
            if (LocaleController.isRTL) {
                i10 = 5;
            }
            int i11 = i10 | 16;
            org.telegram.ui.Components.r6 r6Var = this.f22451e;
            r6Var.setGravity(i11);
            r6Var.c(charSequence, z10, true);
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
        return this.f22451e.getDrawable().c();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.h5 getTextView2() {
        return this.f22452f;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f22452f;
        if (h5Var != null) {
            ((FrameLayout.LayoutParams) h5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f7);
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
        this.f22451e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f22452f;
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
        org.telegram.ui.Components.r6 r6Var = this.f22451e;
        if (r6Var != null) {
            r6Var.setTextColor(i10);
        }
    }

    public void setTextSize(float f7) {
        if (this.f22453n) {
            this.f22451e.setTextSize(AndroidUtilities.dp(f7));
            return;
        }
        this.d.setTextSize(1, f7);
    }

    public void setTopMargin(int i10) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = AndroidUtilities.dp(i10);
        setHeight(this.h);
    }

    public m4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, org.telegram.ui.ActionBar.h6.L6, 20, 7, false, d6Var);
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
        this.f22449b = i11;
        this.f22450c = i13;
        this.f22453n = z11;
        if (z11) {
            org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(getContext(), false, false, false);
            this.f22451e = r6Var;
            r6Var.setTextSize(AndroidUtilities.dp(14.0f));
            r6Var.setTypeface(AndroidUtilities.bold());
            r6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            r6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
            r6Var.setTag(Integer.valueOf(i10));
            r6Var.getDrawable().r(true, false);
            float f7 = i11;
            addView(r6Var, w7.x5.a(this.h - i12, f7, i12, f7, z10 ? 0.0f : i13, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView.setMinHeight(AndroidUtilities.dp(this.h - i12));
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
            textView.setTag(Integer.valueOf(i10));
            float f10 = i11;
            addView(textView, w7.x5.a(-1.0f, f10, i12, f10, z10 ? 0.0f : i13, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        }
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f22452f = h5Var;
            h5Var.setTextSize(13);
            h5Var.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            float f11 = i11;
            addView(h5Var, w7.x5.a(-1.0f, f11, 21.0f, f11, i13, -1, (LocaleController.isRTL ? 3 : 5) | 48));
        }
        WeakHashMap weakHashMap = r0.i0.f46856a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
