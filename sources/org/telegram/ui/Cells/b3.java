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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.s70;
public final class b3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final LinearLayout f28982a;
    public final LinearLayout f28983b;
    public final org.telegram.ui.Components.o5 f28984c;
    public final s70 d;
    public final ImageView f28985e;
    public final ImageView f28986f;
    public final org.telegram.ui.Components.k9 h;
    public final org.telegram.ui.Components.x8 f28987n;
    public boolean f28988r;

    public b3(Context context) {
        super(context);
        int i3;
        int L;
        int i10;
        int i11;
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(context, false);
        this.f28987n = x8Var;
        x8Var.setStepFactor(0.56790125f);
        x8Var.setVisibility(8);
        x8Var.setCount(0);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.h = k9Var;
        k9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28983b = linearLayout;
        linearLayout.setOrientation(1);
        if (bd.f21784a0) {
            i3 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i3 = 0;
        }
        if (bd.f21784a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        linearLayout.setPadding(i3, 0, L, 0);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.f28984c = o5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        o5Var.setEllipsize(truncateAt);
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setMaxLines(5);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.addView(o5Var, mf.p(-2, -2, 0.0f, i10 | 48));
        s70 s70Var = new s70(context, null);
        this.d = s70Var;
        s70Var.setTextSize(1, 13.0f);
        s70Var.setEllipsize(truncateAt);
        s70Var.setMaxLines(5);
        linearLayout.addView(s70Var, mf.p(-1, -2, 0.0f, 48));
        hs.i(o5Var);
        hs.i(s70Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f28982a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (bd.f21784a0) {
            linearLayout2.addView(linearLayout, mf.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(x8Var, mf.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(k9Var, mf.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(k9Var, mf.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(x8Var, mf.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, mf.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, mf.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f28985e = imageView;
        imageView.setImageResource(2131230872);
        if (bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, mf.d(16, 16.0f, i11 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f28986f = imageView2;
        imageView2.setImageResource(2131232096);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, mf.d(36, 36.0f, (bd.f21784a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i3, ArrayList arrayList) {
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
        org.telegram.ui.Components.x8 x8Var = this.f28987n;
        if (min != x8Var.f40266a.f39958n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            x8Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            x8Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        x8Var.setCount(min);
        if (min <= 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        x8Var.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = x8Var.getLayoutParams();
        if (min <= 1) {
            L = org.telegram.messenger.g0.L(36.0f);
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(min, 1, 18, 30));
        }
        layoutParams.width = L;
        if (z10) {
            this.f28982a.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i11);
                }
                x8Var.b(i11, i3, tLObject);
            }
        }
        x8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i3;
        int i10;
        int i11;
        int i12;
        this.f28988r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        org.telegram.ui.Components.o5 o5Var = this.f28984c;
        o5Var.setVisibility(i3);
        o5Var.setText(charSequence);
        o5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f28985e.setVisibility(i10);
        this.f28986f.setVisibility(8);
        if (z10) {
            i11 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i11 = 0;
        }
        boolean z12 = bd.f21784a0;
        if (z12) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        if (z12) {
            i11 = 0;
        }
        this.f28983b.setPadding(i12, 0, i11, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        Point point = org.telegram.messenger.g0.f22608q;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f28983b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f28986f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f28987n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f28985e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        this.f28985e.setVisibility(4);
        ImageView imageView = this.f28986f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i3;
        if (this.f28988r) {
            i3 = org.telegram.ui.ActionBar.k6.f28122q7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.G6;
        }
        this.f28984c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int i10 = org.telegram.ui.ActionBar.k6.f28273y6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        s70 s70Var = this.d;
        s70Var.setTextColor(x02);
        s70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f28985e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        ImageView imageView = this.f28986f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.y5.f28879a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
