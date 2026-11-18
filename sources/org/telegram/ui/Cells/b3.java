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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.k80;
public final class b3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final LinearLayout f30424a;
    public final LinearLayout f30425b;
    public final org.telegram.ui.Components.w5 f30426c;
    public final k80 d;
    public final ImageView f30427e;
    public final ImageView f30428f;
    public final org.telegram.ui.Components.q9 h;
    public final org.telegram.ui.Components.e9 f30429n;
    public boolean f30430r;

    public b3(Context context) {
        super(context);
        int i7;
        int L;
        int i10;
        int i11;
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(context, false);
        this.f30429n = e9Var;
        e9Var.setStepFactor(0.56790125f);
        e9Var.setVisibility(8);
        e9Var.setCount(0);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.h = q9Var;
        q9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30425b = linearLayout;
        linearLayout.setOrientation(1);
        if (gd.f24216a0) {
            i7 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i7 = 0;
        }
        if (gd.f24216a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        linearLayout.setPadding(i7, 0, L, 0);
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.f30426c = w5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        w5Var.setEllipsize(truncateAt);
        w5Var.setTextSize(1, 14.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        w5Var.setMaxLines(5);
        if (gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.addView(w5Var, c8.ma.p(-2, -2, 0.0f, i10 | 48));
        k80 k80Var = new k80(context, null);
        this.d = k80Var;
        k80Var.setTextSize(1, 13.0f);
        k80Var.setEllipsize(truncateAt);
        k80Var.setMaxLines(5);
        linearLayout.addView(k80Var, c8.ma.p(-1, -2, 0.0f, 48));
        ks.i(w5Var);
        ks.i(k80Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30424a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (gd.f24216a0) {
            linearLayout2.addView(linearLayout, c8.ma.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(e9Var, c8.ma.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(q9Var, c8.ma.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(q9Var, c8.ma.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(e9Var, c8.ma.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.ma.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.ma.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f30427e = imageView;
        imageView.setImageResource(2131230872);
        if (gd.f24216a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, c8.ma.d(16, 16.0f, i11 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30428f = imageView2;
        imageView2.setImageResource(2131232098);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.ma.d(36, 36.0f, (gd.f24216a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
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
        org.telegram.ui.Components.e9 e9Var = this.f30429n;
        if (min != e9Var.f34650a.f34314n) {
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
            this.f30424a.requestLayout();
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
        this.f30430r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.w5 w5Var = this.f30426c;
        w5Var.setVisibility(i7);
        w5Var.setText(charSequence);
        w5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f30427e.setVisibility(i10);
        this.f30428f.setVisibility(8);
        if (z10) {
            i11 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i11 = 0;
        }
        boolean z12 = gd.f24216a0;
        if (z12) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        if (z12) {
            i11 = 0;
        }
        this.f30425b.setPadding(i12, 0, i11, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Point point = org.telegram.messenger.g0.f24121q;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f30425b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f30428f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f30429n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f30427e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        super.setOnClickListener(new a3(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.f30427e.setVisibility(4);
        ImageView imageView = this.f30428f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i7;
        if (this.f30430r) {
            i7 = org.telegram.ui.ActionBar.n6.f29637q7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        }
        this.f30426c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.n6.f29788y6;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        k80 k80Var = this.d;
        k80Var.setTextColor(x02);
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f30427e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        ImageView imageView = this.f30428f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.b6.c(null, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.b6.f28812a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
