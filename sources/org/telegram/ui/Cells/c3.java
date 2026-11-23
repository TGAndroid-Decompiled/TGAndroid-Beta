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
import org.telegram.ui.Components.j80;
public final class c3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final LinearLayout f30552a;
    public final LinearLayout f30553b;
    public final org.telegram.ui.Components.w5 f30554c;
    public final j80 d;
    public final ImageView f30555e;
    public final ImageView f30556f;
    public final org.telegram.ui.Components.p9 h;
    public final org.telegram.ui.Components.d9 f30557n;
    public boolean f30558r;

    public c3(Context context) {
        super(context);
        int i7;
        int L;
        int i10;
        int i11;
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.f30557n = d9Var;
        d9Var.setStepFactor(0.56790125f);
        d9Var.setVisibility(8);
        d9Var.setCount(0);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.h = p9Var;
        p9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30553b = linearLayout;
        linearLayout.setOrientation(1);
        if (gd.f24314a0) {
            i7 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i7 = 0;
        }
        if (gd.f24314a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        linearLayout.setPadding(i7, 0, L, 0);
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.f30554c = w5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        w5Var.setEllipsize(truncateAt);
        w5Var.setTextSize(1, 14.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        w5Var.setMaxLines(5);
        if (gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.addView(w5Var, c8.na.p(-2, -2, 0.0f, i10 | 48));
        j80 j80Var = new j80(context, null);
        this.d = j80Var;
        j80Var.setTextSize(1, 13.0f);
        j80Var.setEllipsize(truncateAt);
        j80Var.setMaxLines(5);
        linearLayout.addView(j80Var, c8.na.p(-1, -2, 0.0f, 48));
        ks.i(w5Var);
        ks.i(j80Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30552a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (gd.f24314a0) {
            linearLayout2.addView(linearLayout, c8.na.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(d9Var, c8.na.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(p9Var, c8.na.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(p9Var, c8.na.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(d9Var, c8.na.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.na.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.na.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f30555e = imageView;
        imageView.setImageResource(2131230872);
        if (gd.f24314a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, c8.na.d(16, 16.0f, i11 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30556f = imageView2;
        imageView2.setImageResource(2131232101);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.na.d(36, 36.0f, (gd.f24314a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
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
        org.telegram.ui.Components.d9 d9Var = this.f30557n;
        if (min != d9Var.f34245a.f33960n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            d9Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            d9Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        d9Var.setCount(min);
        if (min <= 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        d9Var.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = d9Var.getLayoutParams();
        if (min <= 1) {
            L = org.telegram.messenger.g0.L(36.0f);
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(min, 1, 18, 30));
        }
        layoutParams.width = L;
        if (z10) {
            this.f30552a.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i11);
                }
                d9Var.b(i11, i7, tLObject);
            }
        }
        d9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f30558r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.w5 w5Var = this.f30554c;
        w5Var.setVisibility(i7);
        w5Var.setText(charSequence);
        w5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f30555e.setVisibility(i10);
        this.f30556f.setVisibility(8);
        if (z10) {
            i11 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i11 = 0;
        }
        boolean z12 = gd.f24314a0;
        if (z12) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        if (z12) {
            i11 = 0;
        }
        this.f30553b.setPadding(i12, 0, i11, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Point point = org.telegram.messenger.g0.f24226q;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f30553b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f30556f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f30557n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f30555e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        this.f30555e.setVisibility(4);
        ImageView imageView = this.f30556f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i7;
        if (this.f30558r) {
            i7 = org.telegram.ui.ActionBar.n6.f29692q7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        }
        this.f30554c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.n6.f29843y6;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        j80 j80Var = this.d;
        j80Var.setTextColor(x02);
        j80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f30555e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        ImageView imageView = this.f30556f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.b6.c(null, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.b6.f28874a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
