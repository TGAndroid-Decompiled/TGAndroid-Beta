package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.m80;
public final class c3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final LinearLayout f30467a;
    public final LinearLayout f30468b;
    public final org.telegram.ui.Components.x5 f30469c;
    public final m80 d;
    public final ImageView f30470e;
    public final ImageView f30471f;
    public final org.telegram.ui.Components.q9 h;
    public final org.telegram.ui.Components.e9 f30472n;
    public boolean f30473r;

    public c3(Context context) {
        super(context);
        int i7;
        int L;
        int i10;
        int i11;
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(context, false);
        this.f30472n = e9Var;
        e9Var.setStepFactor(0.56790125f);
        e9Var.setVisibility(8);
        e9Var.setCount(0);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.h = q9Var;
        q9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30468b = linearLayout;
        linearLayout.setOrientation(1);
        if (hd.f24408a0) {
            i7 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i7 = 0;
        }
        if (hd.f24408a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        linearLayout.setPadding(i7, 0, L, 0);
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f30469c = x5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        x5Var.setEllipsize(truncateAt);
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setMaxLines(5);
        if (hd.f24408a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.addView(x5Var, c8.na.p(-2, -2, 0.0f, i10 | 48));
        m80 m80Var = new m80(context, null);
        this.d = m80Var;
        m80Var.setTextSize(1, 13.0f);
        m80Var.setEllipsize(truncateAt);
        m80Var.setMaxLines(5);
        linearLayout.addView(m80Var, c8.na.p(-1, -2, 0.0f, 48));
        ls.i(x5Var);
        ls.i(m80Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30467a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (hd.f24408a0) {
            linearLayout2.addView(linearLayout, c8.na.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(e9Var, c8.na.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(q9Var, c8.na.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(q9Var, c8.na.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(e9Var, c8.na.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.na.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.na.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f30470e = imageView;
        imageView.setImageResource(2131230872);
        if (hd.f24408a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, c8.na.d(16, 16.0f, i11 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30471f = imageView2;
        imageView2.setImageResource(2131232098);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.na.d(36, 36.0f, (hd.f24408a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i7, ArrayList arrayList) {
        int size;
        boolean z10;
        int i10;
        int L;
        TLObject tLObject;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        int min = Math.min(3, size);
        org.telegram.ui.Components.e9 e9Var = this.f30472n;
        if (min != e9Var.f34690a.f34398n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            e9Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            e9Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        e9Var.setCount(min);
        if (min <= 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        e9Var.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = e9Var.getLayoutParams();
        if (min <= 1) {
            L = org.telegram.messenger.g0.L(36.0f);
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(min, 1, 18, 30));
        }
        layoutParams.width = L;
        if (z10) {
            this.f30467a.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i11);
                }
                e9Var.b(i11, i7, tLObject);
            }
        }
        e9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f30473r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.x5 x5Var = this.f30469c;
        x5Var.setVisibility(i7);
        x5Var.setText(charSequence);
        x5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f30470e.setVisibility(i10);
        this.f30471f.setVisibility(8);
        if (z10) {
            i11 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i11 = 0;
        }
        boolean z12 = hd.f24408a0;
        if (z12) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        if (z12) {
            i11 = 0;
        }
        this.f30468b.setPadding(i12, 0, i11, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Point point = org.telegram.messenger.g0.f24010q;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f30468b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f30471f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f30472n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f30470e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new b3(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.f30470e.setVisibility(4);
        ImageView imageView = this.f30471f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i7;
        if (this.f30473r) {
            i7 = org.telegram.ui.ActionBar.m6.f29588q7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        }
        this.f30469c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.m6.f29739y6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        m80 m80Var = this.d;
        m80Var.setTextColor(x02);
        m80Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xc, false));
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f30470e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        ImageView imageView = this.f30471f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.a6.c(null, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.a6.f28762a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
