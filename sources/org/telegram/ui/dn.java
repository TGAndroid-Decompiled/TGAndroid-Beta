package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class dn extends FrameLayout {
    public final cn f47021a;
    public final org.telegram.ui.ActionBar.s4 f47022b;
    public View f47023c;
    public int d;
    public boolean f47024e;

    public dn(Context context, org.telegram.ui.ActionBar.s4 s4Var, Bundle bundle) {
        super(context);
        this.f47024e = true;
        this.f47022b = s4Var;
        cn cnVar = new cn(this, bundle);
        this.f47021a = cnVar;
        cnVar.mb = true;
    }

    public void a() {
        int i7;
        cn cnVar = this.f47021a;
        if (cnVar.onFragmentCreate()) {
            this.f47023c = cnVar.fragmentView;
            cnVar.setParentLayout(this.f47022b);
            View view = this.f47023c;
            if (view == null) {
                this.f47023c = cnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    cnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f47023c);
                }
            }
            bj bjVar = cnVar.A0;
            if (bjVar != null && (i7 = this.d) != 0) {
                bjVar.setPadding(0, i7, 0, 0);
            }
            cnVar.Sa();
            addView(this.f47023c, c8.ma.c(-1.0f, -1));
            if (this.f47024e) {
                cnVar.onResume();
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

    public void b(boolean z10) {
    }
}
