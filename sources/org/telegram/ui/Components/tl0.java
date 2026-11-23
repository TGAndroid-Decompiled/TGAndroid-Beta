package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public abstract class tl0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final View f39939a;
    public final ImageView f39940b;
    public final hi.b2 f39941c;
    public final ah.i d;
    public final org.telegram.ui.ActionBar.h6 f39942e;

    public tl0(Context context, float f10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f39942e = h6Var;
        View view = new View(context);
        this.f39939a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, h6Var)));
        addView(view, c8.ma.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Q5, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f39940b = imageView2;
        imageView2.setScaleType(scaleType);
        hi.b2 b2Var = new hi.b2(3, this);
        this.f39941c = b2Var;
        imageView2.setImageDrawable(b2Var);
        b2Var.f35305f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ma.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new j70(this, 11));
        ah.i iVar = new ah.i(8, context, this);
        this.d = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.D(iVar, org.telegram.ui.ActionBar.m6.P5, h6Var);
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.R5, h6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setGravity(c8.ma.y() | 16);
        iVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.t6.l(iVar, 30, org.telegram.ui.ActionBar.m6.Di, h6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(iVar, c8.ma.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 25));
        iVar.setOnEditorActionListener(new h(this, 7));
    }

    public abstract void a(String str);

    public fq getProgressDrawable() {
        return this.f39941c;
    }

    public View getSearchBackground() {
        return this.f39939a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.f39939a;
        if (view != null) {
            try {
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, this.f39942e), view.getBackground());
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
