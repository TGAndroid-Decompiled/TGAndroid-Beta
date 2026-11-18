package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public abstract class rl0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final View f39172a;
    public final ImageView f39173b;
    public final hi.c2 f39174c;
    public final ah.i d;
    public final org.telegram.ui.ActionBar.i6 f39175e;

    public rl0(Context context, float f10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f39175e = i6Var;
        View view = new View(context);
        this.f39172a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.O5, i6Var)));
        addView(view, c8.ma.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Q5, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f39173b = imageView2;
        imageView2.setScaleType(scaleType);
        hi.c2 c2Var = new hi.c2(3, this);
        this.f39174c = c2Var;
        imageView2.setImageDrawable(c2Var);
        c2Var.f34485f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ma.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new h70(this, 10));
        ah.i iVar = new ah.i(8, context, this);
        this.d = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.D(iVar, org.telegram.ui.ActionBar.n6.P5, i6Var);
        org.telegram.ui.ActionBar.u6.U(iVar, org.telegram.ui.ActionBar.n6.R5, i6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setGravity(c8.ma.y() | 16);
        iVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.u6.l(iVar, 30, org.telegram.ui.ActionBar.n6.Di, i6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(iVar, c8.ma.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 25));
        iVar.setOnEditorActionListener(new g(this, 7));
    }

    public abstract void a(String str);

    public dq getProgressDrawable() {
        return this.f39174c;
    }

    public View getSearchBackground() {
        return this.f39172a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.f39172a;
        if (view != null) {
            try {
                org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.O5, this.f39175e), view.getBackground());
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
