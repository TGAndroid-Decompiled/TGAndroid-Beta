package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public abstract class el0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final View f33290a;
    public final ImageView f33291b;
    public final fi.c2 f33292c;
    public final ah.i d;
    public final org.telegram.ui.ActionBar.h6 f33293e;

    public el0(Context context, float f10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f33293e = h6Var;
        View view = new View(context);
        this.f33290a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, h6Var)));
        addView(view, c8.ha.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232737);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Q5, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f33291b = imageView2;
        imageView2.setScaleType(scaleType);
        fi.c2 c2Var = new fi.c2(3, this);
        this.f33292c = c2Var;
        imageView2.setImageDrawable(c2Var);
        c2Var.f36659f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ha.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new la0(this, 8));
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
        iVar.setGravity(c8.ha.y() | 16);
        iVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.t6.l(iVar, 30, org.telegram.ui.ActionBar.m6.Ai, h6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(iVar, c8.ha.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 22));
        iVar.setOnEditorActionListener(new s0(this, 6));
    }

    public abstract void a(String str);

    public op getProgressDrawable() {
        return this.f33292c;
    }

    public View getSearchBackground() {
        return this.f33290a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.f33290a;
        if (view != null) {
            try {
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, this.f33293e), view.getBackground());
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
