package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public abstract class jl0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final View f36027a;
    public final ImageView f36028b;
    public final hi.b2 f36029c;
    public final ah.i d;
    public final org.telegram.ui.ActionBar.e6 f36030e;

    public jl0(Context context, float f10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f36030e = e6Var;
        View view = new View(context);
        this.f36027a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.O5, e6Var)));
        addView(view, c8.ja.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232738);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Q5, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ja.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f36028b = imageView2;
        imageView2.setScaleType(scaleType);
        hi.b2 b2Var = new hi.b2(3, this);
        this.f36029c = b2Var;
        imageView2.setImageDrawable(b2Var);
        b2Var.f41421f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ja.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new y60(this, 9));
        ah.i iVar = new ah.i(8, context, this);
        this.d = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.D(iVar, org.telegram.ui.ActionBar.j6.P5, e6Var);
        org.telegram.ui.ActionBar.q6.U(iVar, org.telegram.ui.ActionBar.j6.R5, e6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setGravity(c8.ja.y() | 16);
        iVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.q6.l(iVar, 30, org.telegram.ui.ActionBar.j6.Di, e6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(iVar, c8.ja.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 24));
        iVar.setOnEditorActionListener(new q0(this, 6));
    }

    public abstract void a(String str);

    public wp getProgressDrawable() {
        return this.f36029c;
    }

    public View getSearchBackground() {
        return this.f36027a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.f36027a;
        if (view != null) {
            try {
                org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.O5, this.f36030e), view.getBackground());
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
