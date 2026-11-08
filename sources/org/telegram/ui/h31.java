package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class h31 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f46208a;
    public final org.telegram.ui.Components.w8 f46209b;
    public final org.telegram.ui.Components.l9 f46210c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView f46211e;
    public final ImageView f46212f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f46213n;
    public int f46214r;

    public h31(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f46208a = f6Var;
        setOrientation(0);
        this.f46209b = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f46210c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 7, k5Var, false);
        this.f46213n = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 7, k5Var, false);
        k5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.f46211e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView, d02, N, null, f6Var);
        ImageView imageView = new ImageView(context);
        this.f46212f = imageView;
        imageView.setImageResource(2131232059);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28017m6, f6Var, PorterDuff.Mode.SRC_IN);
        if (org.telegram.messenger.id.f23157a0) {
            k5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, c8.ha.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(k5Var, c8.ha.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(l9Var, c8.ha.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        k5Var.setGravity(19);
        addView(l9Var, c8.ha.t(28, 28, 19, 18, 0, 18, 0));
        addView(k5Var, c8.ha.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, c8.ha.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28045ni));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h31.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f46208a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setTextColor(w02);
        TextView textView = this.f46211e;
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28017m6, f6Var);
        int i10 = this.f46214r;
        ImageView imageView = this.f46212f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.f46214r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f28045ni;
        this.f46213n.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i11, f6Var)));
        try {
            org.telegram.ui.Components.g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i11, f6Var)));
                k5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
