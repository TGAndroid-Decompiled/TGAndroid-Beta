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
import org.telegram.ui.yh;
public class m4 extends FrameLayout {
    public int f23162a;
    public final int f23163b;
    public final int f23164c;
    public final TextView d;
    public final org.telegram.ui.Components.k6 f23165e;
    public final org.telegram.ui.ActionBar.l5 f23166f;
    public int h;
    public final boolean f23167n;

    public m4(Context context) {
        this(context, org.telegram.ui.ActionBar.k6.L6, 18, 7, false, null);
    }

    public final void a(ArrayList arrayList, boolean z4) {
        float f10 = 0.5f;
        TextView textView = this.d;
        if (arrayList != null) {
            if (z4) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f10));
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        textView.setAlpha(f10);
    }

    public final void b(boolean z4) {
        float f10;
        super.setEnabled(z4);
        ViewPropertyAnimator animate = this.d.animate();
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
    }

    public final void c(CharSequence charSequence, boolean z4) {
        int i10 = 3;
        if (this.f23167n) {
            if (LocaleController.isRTL) {
                i10 = 5;
            }
            int i11 = i10 | 16;
            org.telegram.ui.Components.k6 k6Var = this.f23165e;
            k6Var.setGravity(i11);
            k6Var.c(charSequence, z4, true);
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
        return this.f23165e.getDrawable().d();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.l5 getTextView2() {
        return this.f23166f;
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
        org.telegram.ui.ActionBar.l5 l5Var = this.f23166f;
        if (l5Var != null) {
            ((FrameLayout.LayoutParams) l5Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
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
        this.f23165e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.l5 l5Var = this.f23166f;
        if (l5Var == null) {
            return;
        }
        l5Var.l(charSequence, false);
    }

    public void setTextColor(int i10) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        org.telegram.ui.Components.k6 k6Var = this.f23165e;
        if (k6Var != null) {
            k6Var.setTextColor(i10);
        }
    }

    public void setTextSize(float f10) {
        if (this.f23167n) {
            this.f23165e.setTextSize(AndroidUtilities.dp(f10));
            return;
        }
        this.d.setTextSize(1, f10);
    }

    public void setTopMargin(int i10) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = AndroidUtilities.dp(i10);
        setHeight(this.h);
    }

    public m4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, org.telegram.ui.ActionBar.k6.L6, 18, 7, false, g6Var);
    }

    public m4(Context context, int i10) {
        this(context, org.telegram.ui.ActionBar.k6.L6, i10, 7, false, null);
    }

    public m4(Context context, int i10, int i11, int i12, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, i11, i12, 0, z4, false, g6Var);
    }

    public m4(Context context, int i10, int i11, int i12, int i13, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 40;
        this.f23163b = i11;
        this.f23164c = i13;
        this.f23167n = z10;
        if (z10) {
            org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getContext(), false, false, false);
            this.f23165e = k6Var;
            k6Var.setTextSize(AndroidUtilities.dp(14.0f));
            k6Var.setTypeface(AndroidUtilities.bold());
            k6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            k6Var.setTag(Integer.valueOf(i10));
            k6Var.getDrawable().o(true, false, false);
            float f10 = i11;
            addView(k6Var, k7.c6.d(-1, this.h - i12, (LocaleController.isRTL ? 5 : 3) | 48, f10, i12, f10, z4 ? 0.0f : i13));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            yh.p(14.0f, 1, textView);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView.setMinHeight(AndroidUtilities.dp(this.h - i12));
            textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            textView.setTag(Integer.valueOf(i10));
            float f11 = i11;
            addView(textView, k7.c6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f11, i12, f11, z4 ? 0.0f : i13));
        }
        if (z4) {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            this.f23166f = l5Var;
            l5Var.setTextSize(13);
            l5Var.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            float f12 = i11;
            addView(l5Var, k7.c6.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f12, 21.0f, f12, i13));
        }
        WeakHashMap weakHashMap = r0.j0.f46469a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
