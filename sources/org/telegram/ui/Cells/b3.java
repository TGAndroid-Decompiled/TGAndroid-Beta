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
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.z70;
public final class b3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final LinearLayout f30035a;
    public final LinearLayout f30036b;
    public final org.telegram.ui.Components.o5 f30037c;
    public final z70 d;
    public final ImageView f30038e;
    public final ImageView f30039f;
    public final org.telegram.ui.Components.i9 h;
    public final org.telegram.ui.Components.w8 f30040n;
    public boolean f30041r;

    public b3(Context context) {
        super(context);
        int i7;
        int L;
        int i10;
        int i11;
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false);
        this.f30040n = w8Var;
        w8Var.setStepFactor(0.56790125f);
        w8Var.setVisibility(8);
        w8Var.setCount(0);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.h = i9Var;
        i9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30036b = linearLayout;
        linearLayout.setOrientation(1);
        if (hd.f24104a0) {
            i7 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i7 = 0;
        }
        if (hd.f24104a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        linearLayout.setPadding(i7, 0, L, 0);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.f30037c = o5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        o5Var.setEllipsize(truncateAt);
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setMaxLines(5);
        if (hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.addView(o5Var, c8.ja.p(-2, -2, 0.0f, i10 | 48));
        z70 z70Var = new z70(context, null);
        this.d = z70Var;
        z70Var.setTextSize(1, 13.0f);
        z70Var.setEllipsize(truncateAt);
        z70Var.setMaxLines(5);
        linearLayout.addView(z70Var, c8.ja.p(-1, -2, 0.0f, 48));
        ns.i(o5Var);
        ns.i(z70Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f30035a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (hd.f24104a0) {
            linearLayout2.addView(linearLayout, c8.ja.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(w8Var, c8.ja.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(i9Var, c8.ja.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(i9Var, c8.ja.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(w8Var, c8.ja.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.ja.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.ja.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f30038e = imageView;
        imageView.setImageResource(2131230872);
        if (hd.f24104a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, c8.ja.d(16, 16.0f, i11 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30039f = imageView2;
        imageView2.setImageResource(2131232097);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.ja.d(36, 36.0f, (hd.f24104a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
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
        org.telegram.ui.Components.w8 w8Var = this.f30040n;
        if (min != w8Var.f41314a.f40334n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            w8Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            w8Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        w8Var.setCount(min);
        if (min <= 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        w8Var.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = w8Var.getLayoutParams();
        if (min <= 1) {
            L = org.telegram.messenger.g0.L(36.0f);
        } else {
            L = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(min, 1, 18, 30));
        }
        layoutParams.width = L;
        if (z10) {
            this.f30035a.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i11);
                }
                w8Var.b(i11, i7, tLObject);
            }
        }
        w8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f30041r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        org.telegram.ui.Components.o5 o5Var = this.f30037c;
        o5Var.setVisibility(i7);
        o5Var.setText(charSequence);
        o5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f30038e.setVisibility(i10);
        this.f30039f.setVisibility(8);
        if (z10) {
            i11 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i11 = 0;
        }
        boolean z12 = hd.f24104a0;
        if (z12) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        if (z12) {
            i11 = 0;
        }
        this.f30036b.setPadding(i12, 0, i11, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Point point = org.telegram.messenger.g0.f23611q;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f30036b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f30039f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f30040n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f30038e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        this.f30038e.setVisibility(4);
        ImageView imageView = this.f30039f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i7;
        if (this.f30041r) {
            i7 = org.telegram.ui.ActionBar.j6.f29090q7;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.G6;
        }
        this.f30037c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.j6.f29241y6;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        z70 z70Var = this.d;
        z70Var.setTextColor(x02);
        z70Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xc, false));
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f30038e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        ImageView imageView = this.f30039f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.y5.f29895a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
