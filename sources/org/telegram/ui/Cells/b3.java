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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.w70;
public final class b3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final LinearLayout f28941a;
    public final LinearLayout f28942b;
    public final org.telegram.ui.Components.p5 f28943c;
    public final w70 d;
    public final ImageView f28944e;
    public final ImageView f28945f;
    public final org.telegram.ui.Components.k9 h;
    public final org.telegram.ui.Components.y8 f28946n;
    public boolean f28947r;

    public b3(Context context) {
        super(context);
        int i7;
        int L;
        int i10;
        int i11;
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(context, false);
        this.f28946n = y8Var;
        y8Var.setStepFactor(0.56790125f);
        y8Var.setVisibility(8);
        y8Var.setCount(0);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.h = k9Var;
        k9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28942b = linearLayout;
        linearLayout.setOrientation(1);
        if (id.f23161a0) {
            i7 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i7 = 0;
        }
        if (id.f23161a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        linearLayout.setPadding(i7, 0, L, 0);
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(context);
        this.f28943c = p5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p5Var.setEllipsize(truncateAt);
        p5Var.setTextSize(1, 14.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        p5Var.setMaxLines(5);
        if (id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.addView(p5Var, c8.ha.p(-2, -2, 0.0f, i10 | 48));
        w70 w70Var = new w70(context, null);
        this.d = w70Var;
        w70Var.setTextSize(1, 13.0f);
        w70Var.setEllipsize(truncateAt);
        w70Var.setMaxLines(5);
        linearLayout.addView(w70Var, c8.ha.p(-1, -2, 0.0f, 48));
        qs.i(p5Var);
        qs.i(w70Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f28941a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (id.f23161a0) {
            linearLayout2.addView(linearLayout, c8.ha.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(y8Var, c8.ha.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(k9Var, c8.ha.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(k9Var, c8.ha.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(y8Var, c8.ha.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.ha.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.ha.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f28944e = imageView;
        imageView.setImageResource(2131230872);
        if (id.f23161a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, c8.ha.d(16, 16.0f, i11 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f28945f = imageView2;
        imageView2.setImageResource(2131232096);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.ha.d(36, 36.0f, (id.f23161a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
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
        org.telegram.ui.Components.y8 y8Var = this.f28946n;
        if (min != y8Var.f40530a.f40242n) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (min <= 1) {
            y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            y8Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            y8Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        y8Var.setCount(min);
        if (min <= 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        y8Var.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = y8Var.getLayoutParams();
        if (min <= 1) {
            L = org.telegram.messenger.g0.L(36.0f);
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(min, 1, 18, 30));
        }
        layoutParams.width = L;
        if (z9) {
            this.f28941a.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i11);
                }
                y8Var.b(i11, i7, tLObject);
            }
        }
        y8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f28947r = z10;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.p5 p5Var = this.f28943c;
        p5Var.setVisibility(i7);
        p5Var.setText(charSequence);
        p5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f28944e.setVisibility(i10);
        this.f28945f.setVisibility(8);
        if (z9) {
            i11 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i11 = 0;
        }
        boolean z11 = id.f23161a0;
        if (z11) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        if (z11) {
            i11 = 0;
        }
        this.f28942b.setPadding(i12, 0, i11, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Point point = org.telegram.messenger.g0.f22567q;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f28942b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f28945f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f28946n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f28944e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        this.f28944e.setVisibility(4);
        ImageView imageView = this.f28945f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i7;
        if (this.f28947r) {
            i7 = org.telegram.ui.ActionBar.m6.f28131q7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        }
        this.f28943c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.m6.f28282y6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        w70 w70Var = this.d;
        w70Var.setTextColor(x02);
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Uc, false));
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f28944e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        ImageView imageView = this.f28945f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.b6.c(null, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.b6.f27355a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z9) {
    }
}
