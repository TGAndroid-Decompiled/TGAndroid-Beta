package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public abstract class im0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final View f27126a;
    public final ImageView f27127b;
    public final org.telegram.ui.ActionBar.h0 f27128c;
    public final org.telegram.ui.ActionBar.n0 d;
    public final org.telegram.ui.ActionBar.p6 e;

    public im0(Context context, float f7, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = p6Var;
        View view = new View(context);
        this.f27126a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(18.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.O5, p6Var)));
        addView(view, w7.b6.i(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232734);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Q5, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.i(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f27127b = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.h0 h0Var = new org.telegram.ui.ActionBar.h0(2, this);
        this.f27128c = h0Var;
        imageView2.setImageDrawable(h0Var);
        h0Var.f31866f = org.telegram.messenger.i0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.b6.i(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new db0(this, 9));
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 5);
        this.d = n0Var;
        n0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.E(n0Var, org.telegram.ui.ActionBar.t6.P5, p6Var);
        org.telegram.ui.ActionBar.a7.V(n0Var, org.telegram.ui.ActionBar.t6.R5, p6Var);
        n0Var.setBackgroundDrawable(null);
        n0Var.setPadding(0, 0, 0, 0);
        n0Var.setMaxLines(1);
        n0Var.setLines(1);
        n0Var.setSingleLine(true);
        n0Var.setGravity(w7.b6.y() | 16);
        n0Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.a7.m(n0Var, 30, org.telegram.ui.ActionBar.t6.Ai, p6Var);
        n0Var.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        n0Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(n0Var, w7.b6.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        n0Var.addTextChangedListener(new ag.a1(this, 17));
        n0Var.setOnEditorActionListener(new t0(this, 6));
    }

    public abstract void a(String str);

    public vp getProgressDrawable() {
        return this.f27128c;
    }

    public View getSearchBackground() {
        return this.f27126a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.f27126a;
        if (view != null) {
            try {
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.O5, this.e), view.getBackground());
                view.invalidate();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
