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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.p80;
public final class d3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final LinearLayout f21809a;
    public final LinearLayout f21810b;
    public final org.telegram.ui.Components.n5 f21811c;
    public final p80 d;
    public final ImageView e;
    public final ImageView f21812f;
    public final org.telegram.ui.Components.g9 h;
    public final org.telegram.ui.Components.u8 f21813n;
    public boolean f21814r;

    public d3(Context context) {
        super(context);
        int i10;
        int L;
        int i11;
        int i12;
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(7.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.f21813n = u8Var;
        u8Var.setStepFactor(0.56790125f);
        u8Var.setVisibility(8);
        u8Var.setCount(0);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.h = g9Var;
        g9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f21810b = linearLayout;
        linearLayout.setOrientation(1);
        if (cd.X) {
            i10 = org.telegram.messenger.i0.L(24.0f);
        } else {
            i10 = 0;
        }
        if (cd.X) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(24.0f);
        }
        linearLayout.setPadding(i10, 0, L, 0);
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.f21811c = n5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        n5Var.setEllipsize(truncateAt);
        n5Var.setTextSize(1, 14.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        n5Var.setMaxLines(5);
        if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.addView(n5Var, w7.b6.p(-2, -2, 0.0f, i11 | 48));
        p80 p80Var = new p80(context, null);
        this.d = p80Var;
        p80Var.setTextSize(1, 13.0f);
        p80Var.setEllipsize(truncateAt);
        p80Var.setMaxLines(5);
        linearLayout.addView(p80Var, w7.b6.p(-1, -2, 0.0f, 48));
        zs.i(n5Var);
        zs.i(p80Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f21809a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (cd.X) {
            linearLayout2.addView(linearLayout, w7.b6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(u8Var, w7.b6.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(g9Var, w7.b6.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(g9Var, w7.b6.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(u8Var, w7.b6.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, w7.b6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, w7.b6.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131230872);
        if (cd.X) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, w7.b6.d(16, 16.0f, i12 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f21812f = imageView2;
        imageView2.setImageResource(2131232095);
        imageView2.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        addView(imageView2, w7.b6.d(36, 36.0f, (cd.X ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i10, ArrayList arrayList) {
        int size;
        boolean z10;
        int i11;
        int L;
        TLObject tLObject;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        int min = Math.min(3, size);
        org.telegram.ui.Components.u8 u8Var = this.f21813n;
        if (min != u8Var.f30863a.f30489n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(22.0f));
            u8Var.setSize(org.telegram.messenger.i0.L(36.0f));
        } else {
            u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(20.0f));
            u8Var.setSize(org.telegram.messenger.i0.L(30.0f));
        }
        u8Var.setCount(min);
        if (min <= 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        u8Var.setVisibility(i11);
        ViewGroup.LayoutParams layoutParams = u8Var.getLayoutParams();
        if (min <= 1) {
            L = org.telegram.messenger.i0.L(36.0f);
        } else {
            L = org.telegram.messenger.i0.L(i0.a.e(min, 1, 18, 30));
        }
        layoutParams.width = L;
        if (z10) {
            this.f21809a.requestLayout();
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i12);
                }
                u8Var.b(i12, i10, tLObject);
            }
        }
        u8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f21814r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.n5 n5Var = this.f21811c;
        n5Var.setVisibility(i10);
        n5Var.setText(charSequence);
        n5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.e.setVisibility(i11);
        this.f21812f.setVisibility(8);
        if (z10) {
            i12 = org.telegram.messenger.i0.L(24.0f);
        } else {
            i12 = 0;
        }
        boolean z12 = cd.X;
        if (z12) {
            i13 = i12;
        } else {
            i13 = 0;
        }
        if (z12) {
            i12 = 0;
        }
        this.f21810b.setPadding(i13, 0, i12, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Point point = org.telegram.messenger.i0.f16026q;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f21810b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f21812f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f21813n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        super.setOnClickListener(new c3(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f21812f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i10;
        if (this.f21814r) {
            i10 = org.telegram.ui.ActionBar.t6.f21170q7;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        }
        this.f21811c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.t6.f21311y6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        p80 p80Var = this.d;
        p80Var.setTextColor(x02);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        ImageView imageView = this.f21812f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.c(null, org.telegram.ui.ActionBar.j6.b(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.j6.f20446a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
