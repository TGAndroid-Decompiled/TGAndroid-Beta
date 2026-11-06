package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class cn extends FrameLayout {
    public final bn f44858a;
    public final org.telegram.ui.ActionBar.q4 f44859b;
    public View f44860c;
    public int d;
    public boolean f44861e;

    public cn(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.f44861e = true;
        this.f44859b = q4Var;
        bn bnVar = new bn(this, bundle);
        this.f44858a = bnVar;
        bnVar.f43836ib = true;
    }

    public void a() {
        int i7;
        bn bnVar = this.f44858a;
        if (bnVar.onFragmentCreate()) {
            this.f44860c = bnVar.fragmentView;
            bnVar.setParentLayout(this.f44859b);
            View view = this.f44860c;
            if (view == null) {
                this.f44860c = bnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    bnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f44860c);
                }
            }
            aj ajVar = bnVar.f44038z0;
            if (ajVar != null && (i7 = this.d) != 0) {
                ajVar.setPadding(0, i7, 0, 0);
            }
            bnVar.Pa();
            addView(this.f44860c, c8.ha.c(-1.0f, -1));
            if (this.f44861e) {
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
