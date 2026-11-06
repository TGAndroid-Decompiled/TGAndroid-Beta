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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.w70;
public final class b3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final LinearLayout f28923a;
    public final LinearLayout f28924b;
    public final org.telegram.ui.Components.q5 f28925c;
    public final w70 d;
    public final ImageView f28926e;
    public final ImageView f28927f;
    public final org.telegram.ui.Components.l9 h;
    public final org.telegram.ui.Components.z8 f28928n;
    public boolean f28929r;

    public b3(Context context) {
        super(context);
        int i7;
        int L;
        int i10;
        int i11;
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(context, false);
        this.f28928n = z8Var;
        z8Var.setStepFactor(0.56790125f);
        z8Var.setVisibility(8);
        z8Var.setCount(0);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.h = l9Var;
        l9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28924b = linearLayout;
        linearLayout.setOrientation(1);
        if (hd.f22878a0) {
            i7 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i7 = 0;
        }
        if (hd.f22878a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        linearLayout.setPadding(i7, 0, L, 0);
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.f28925c = q5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        q5Var.setEllipsize(truncateAt);
        q5Var.setTextSize(1, 14.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        q5Var.setMaxLines(5);
        if (hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.addView(q5Var, c8.ha.p(-2, -2, 0.0f, i10 | 48));
        w70 w70Var = new w70(context, null);
        this.d = w70Var;
        w70Var.setTextSize(1, 13.0f);
        w70Var.setEllipsize(truncateAt);
        w70Var.setMaxLines(5);
        linearLayout.addView(w70Var, c8.ha.p(-1, -2, 0.0f, 48));
        qs.i(q5Var);
        qs.i(w70Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f28923a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (hd.f22878a0) {
            linearLayout2.addView(linearLayout, c8.ha.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(z8Var, c8.ha.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(l9Var, c8.ha.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(l9Var, c8.ha.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(z8Var, c8.ha.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.ha.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.ha.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f28926e = imageView;
        imageView.setImageResource(2131230872);
        if (hd.f22878a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, c8.ha.d(16, 16.0f, i11 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f28927f = imageView2;
        imageView2.setImageResource(2131232096);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.ha.d(36, 36.0f, (hd.f22878a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i7, ArrayList arrayList) {
        int size;
        boolean z9;
        int i10;
        int L;
        TLObject tLObject;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        int min = Math.min(3, size);
        org.telegram.ui.Components.z8 z8Var = this.f28928n;
        if (min != z8Var.f40906a.f40587n) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (min <= 1) {
            z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            z8Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            z8Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        z8Var.setCount(min);
        if (min <= 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        z8Var.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = z8Var.getLayoutParams();
        if (min <= 1) {
            L = org.telegram.messenger.g0.L(36.0f);
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(min, 1, 18, 30));
        }
        layoutParams.width = L;
        if (z9) {
            this.f28923a.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i11);
                }
                z8Var.b(i11, i7, tLObject);
            }
        }
        z8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f28929r = z10;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.q5 q5Var = this.f28925c;
        q5Var.setVisibility(i7);
        q5Var.setText(charSequence);
        q5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f28926e.setVisibility(i10);
        this.f28927f.setVisibility(8);
        if (z9) {
            i11 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i11 = 0;
        }
        boolean z11 = hd.f22878a0;
        if (z11) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        if (z11) {
            i11 = 0;
        }
        this.f28924b.setPadding(i12, 0, i11, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Point point = org.telegram.messenger.g0.f22544q;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f28924b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f28927f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f28928n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f28926e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        this.f28926e.setVisibility(4);
        ImageView imageView = this.f28927f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i7;
        if (this.f28929r) {
            i7 = org.telegram.ui.ActionBar.k6.f28090q7;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.G6;
        }
        this.f28925c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.k6.f28241y6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        w70 w70Var = this.d;
        w70Var.setTextColor(x02);
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f28926e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        ImageView imageView = this.f28927f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.z5.c(null, org.telegram.ui.ActionBar.z5.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.z5.f28833a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z9) {
    }
}
