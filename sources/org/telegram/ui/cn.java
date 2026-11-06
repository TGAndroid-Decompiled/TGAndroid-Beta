package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class cn extends FrameLayout {
    public final bn f44857a;
    public final org.telegram.ui.ActionBar.q4 f44858b;
    public View f44859c;
    public int d;
    public boolean f44860e;

    public cn(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.f44860e = true;
        this.f44858b = q4Var;
        bn bnVar = new bn(this, bundle);
        this.f44857a = bnVar;
        bnVar.f43835ib = true;
    }

    public void a() {
        int i7;
        bn bnVar = this.f44857a;
        if (bnVar.onFragmentCreate()) {
            this.f44859c = bnVar.fragmentView;
            bnVar.setParentLayout(this.f44858b);
            View view = this.f44859c;
            if (view == null) {
                this.f44859c = bnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    bnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f44859c);
                }
            }
            aj ajVar = bnVar.f44037z0;
            if (ajVar != null && (i7 = this.d) != 0) {
                ajVar.setPadding(0, i7, 0, 0);
            }
            bnVar.Pa();
            addView(this.f44859c, c8.ha.c(-1.0f, -1));
            if (this.f44860e) {
                bnVar.onResume();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setTopPadding(int i7) {
        this.d = i7;
    }

    public void b(boolean z9) {
    }
}
