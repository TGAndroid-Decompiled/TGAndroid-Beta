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
import org.telegram.messenger.hd;
public class n4 extends FrameLayout {
    public int f30729a;
    public final int f30730b;
    public final int f30731c;
    public final TextView d;
    public final org.telegram.ui.Components.h6 f30732e;
    public final org.telegram.ui.ActionBar.j5 f30733f;
    public int h;
    public final boolean f30734n;

    public n4(Context context) {
        this(context, org.telegram.ui.ActionBar.j6.L6, 20, 7, false, null);
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
        if (this.f30734n) {
            if (hd.f24104a0) {
                i7 = 5;
            }
            int i10 = i7 | 16;
            org.telegram.ui.Components.h6 h6Var = this.f30732e;
            h6Var.setGravity(i10);
            h6Var.c(charSequence, z10, true);
            return;
        }
        if (hd.f24104a0) {
            i7 = 5;
        }
        TextView textView = this.d;
        textView.setGravity(i7 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.f30732e.getDrawable().c();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.j5 getTextView2() {
        return this.f30733f;
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
        org.telegram.ui.ActionBar.j5 j5Var = this.f30733f;
        if (j5Var != null) {
            ((FrameLayout.LayoutParams) j5Var.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(f10);
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
        this.f30732e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f30733f;
        if (j5Var == null) {
            return;
        }
        j5Var.l(charSequence, false);
    }

    public void setTextColor(int i7) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i7);
        }
        org.telegram.ui.Components.h6 h6Var = this.f30732e;
        if (h6Var != null) {
            h6Var.setTextColor(i7);
        }
    }

    public void setTextSize(float f10) {
        if (this.f30734n) {
            this.f30732e.setTextSize(org.telegram.messenger.g0.L(f10));
            return;
        }
        this.d.setTextSize(1, f10);
    }

    public void setTopMargin(int i7) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(i7);
        setHeight(this.h);
    }

    public n4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, org.telegram.ui.ActionBar.j6.L6, 20, 7, false, e6Var);
    }

    public n4(Context context, int i7) {
        this(context, org.telegram.ui.ActionBar.j6.L6, i7, 7, false, null);
    }

    public n4(Context context, int i7, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i7, i10, i11, 0, z10, false, e6Var);
    }

    public n4(Context context, int i7, int i10, int i11, int i12, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 40;
        this.f30730b = i10;
        this.f30731c = i12;
        this.f30734n = z11;
        if (z11) {
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), false, false, false);
            this.f30732e = h6Var;
            h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            h6Var.setTypeface(org.telegram.messenger.g0.o());
            h6Var.setGravity((hd.f24104a0 ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.q6.Y(h6Var, i7, e6Var);
            h6Var.setTag(Integer.valueOf(i7));
            h6Var.getDrawable().r(true, false);
            float f10 = i10;
            addView(h6Var, c8.ja.d(-1, this.h - i11, (hd.f24104a0 ? 5 : 3) | 48, f10, i11, f10, z10 ? 0.0f : i12));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            i5.c.v(textView, 1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((hd.f24104a0 ? 5 : 3) | 16);
            textView.setMinHeight(org.telegram.messenger.g0.L(this.h - i11));
            org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
            textView.setTag(Integer.valueOf(i7));
            float f11 = i10;
            addView(textView, c8.ja.d(-1, -1.0f, (hd.f24104a0 ? 5 : 3) | 48, f11, i11, f11, z10 ? 0.0f : i12));
        }
        if (z10) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            this.f30733f = j5Var;
            j5Var.setTextSize(13);
            j5Var.setGravity((hd.f24104a0 ? 3 : 5) | 48);
            float f12 = i10;
            addView(j5Var, c8.ja.d(-1, -1.0f, (hd.f24104a0 ? 3 : 5) | 48, f12, 21.0f, f12, i12));
        }
        WeakHashMap weakHashMap = r0.i0.f55671a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
