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
import org.telegram.messenger.id;
public class n4 extends FrameLayout {
    public int f29626a;
    public final int f29627b;
    public final int f29628c;
    public final TextView d;
    public final org.telegram.ui.Components.i6 f29629e;
    public final org.telegram.ui.ActionBar.m5 f29630f;
    public int h;
    public final boolean f29631n;

    public n4(Context context) {
        this(context, org.telegram.ui.ActionBar.m6.L6, 20, 7, false, null);
    }

    public final void a(ArrayList arrayList, boolean z9) {
        float f10 = 0.5f;
        TextView textView = this.d;
        if (arrayList != null) {
            if (z9) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f10));
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        textView.setAlpha(f10);
    }

    public final void b(boolean z9) {
        float f10;
        super.setEnabled(z9);
        ViewPropertyAnimator animate = this.d.animate();
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
    }

    public final void c(CharSequence charSequence, boolean z9) {
        int i7 = 3;
        if (this.f29631n) {
            if (id.f23161a0) {
                i7 = 5;
            }
            int i10 = i7 | 16;
            org.telegram.ui.Components.i6 i6Var = this.f29629e;
            i6Var.setGravity(i10);
            i6Var.c(charSequence, z9, true);
            return;
        }
        if (id.f23161a0) {
            i7 = 5;
        }
        TextView textView = this.d;
        textView.setGravity(i7 | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.f29629e.getDrawable().c();
    }

    public TextView getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.m5 getTextView2() {
        return this.f29630f;
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
        org.telegram.ui.ActionBar.m5 m5Var = this.f29630f;
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
        this.f29629e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m5 m5Var = this.f29630f;
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
        org.telegram.ui.Components.i6 i6Var = this.f29629e;
        if (i6Var != null) {
            i6Var.setTextColor(i7);
        }
    }

    public void setTextSize(float f10) {
        if (this.f29631n) {
            this.f29629e.setTextSize(org.telegram.messenger.g0.L(f10));
            return;
        }
        this.d.setTextSize(1, f10);
    }

    public void setTopMargin(int i7) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(i7);
        setHeight(this.h);
    }

    public n4(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, org.telegram.ui.ActionBar.m6.L6, 20, 7, false, h6Var);
    }

    public n4(Context context, int i7) {
        this(context, org.telegram.ui.ActionBar.m6.L6, i7, 7, false, null);
    }

    public n4(Context context, int i7, int i10, int i11, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, i7, i10, i11, 0, z9, false, h6Var);
    }

    public n4(Context context, int i7, int i10, int i11, int i12, boolean z9, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = 40;
        this.f29627b = i10;
        this.f29628c = i12;
        this.f29631n = z10;
        if (z10) {
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(getContext(), false, false, false);
            this.f29629e = i6Var;
            i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            i6Var.setTypeface(org.telegram.messenger.g0.o());
            i6Var.setGravity((id.f23161a0 ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.t6.Y(i6Var, i7, h6Var);
            i6Var.setTag(Integer.valueOf(i7));
            i6Var.getDrawable().r(true, false);
            float f10 = i10;
            addView(i6Var, c8.ha.d(-1, this.h - i11, (id.f23161a0 ? 5 : 3) | 48, f10, i11, f10, z9 ? 0.0f : i12));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((id.f23161a0 ? 5 : 3) | 16);
            textView.setMinHeight(org.telegram.messenger.g0.L(this.h - i11));
            org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
            textView.setTag(Integer.valueOf(i7));
            float f11 = i10;
            addView(textView, c8.ha.d(-1, -1.0f, (id.f23161a0 ? 5 : 3) | 48, f11, i11, f11, z9 ? 0.0f : i12));
        }
        if (z9) {
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
            this.f29630f = m5Var;
            m5Var.setTextSize(13);
            m5Var.setGravity((id.f23161a0 ? 3 : 5) | 48);
            float f12 = i10;
            addView(m5Var, c8.ha.d(-1, -1.0f, (id.f23161a0 ? 3 : 5) | 48, f12, 21.0f, f12, i12));
        }
        WeakHashMap weakHashMap = r0.i0.f54202a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
