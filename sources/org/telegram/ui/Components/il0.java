package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public abstract class il0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final View f34738a;
    public final ImageView f34739b;
    public final gi.b2 f34740c;
    public final bh.g d;
    public final org.telegram.ui.ActionBar.e6 f34741e;

    public il0(Context context, float f10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f34741e = e6Var;
        View view = new View(context);
        this.f34738a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, e6Var)));
        addView(view, b8.mf.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232735);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Q5, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, b8.mf.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f34739b = imageView2;
        imageView2.setScaleType(scaleType);
        gi.b2 b2Var = new gi.b2(3, this);
        this.f34740c = b2Var;
        imageView2.setImageDrawable(b2Var);
        b2Var.f36919f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, b8.mf.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new ga0(this, 9));
        bh.g gVar = new bh.g(8, context, this);
        this.d = gVar;
        gVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.E(gVar, org.telegram.ui.ActionBar.k6.P5, e6Var);
        org.telegram.ui.ActionBar.r6.V(gVar, org.telegram.ui.ActionBar.k6.R5, e6Var);
        gVar.setBackgroundDrawable(null);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setMaxLines(1);
        gVar.setLines(1);
        gVar.setSingleLine(true);
        gVar.setGravity(b8.mf.y() | 16);
        gVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.r6.m(gVar, 30, org.telegram.ui.ActionBar.k6.Ai, e6Var);
        gVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        gVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(gVar, b8.mf.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        gVar.addTextChangedListener(new bh.h(this, 22));
        gVar.setOnEditorActionListener(new s0(this, 6));
    }

    public abstract void a(String str);

    public op getProgressDrawable() {
        return this.f34740c;
    }

    public View getSearchBackground() {
        return this.f34738a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.f34738a;
        if (view != null) {
            try {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.f34741e), view.getBackground());
                view.invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
