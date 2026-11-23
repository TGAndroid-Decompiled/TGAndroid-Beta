package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class dn extends FrameLayout {
    public final cn f46973a;
    public final org.telegram.ui.ActionBar.r4 f46974b;
    public View f46975c;
    public int d;
    public boolean f46976e;

    public dn(Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context);
        this.f46976e = true;
        this.f46974b = r4Var;
        cn cnVar = new cn(this, bundle);
        this.f46973a = cnVar;
        cnVar.mb = true;
    }

    public void a() {
        int i7;
        cn cnVar = this.f46973a;
        if (cnVar.onFragmentCreate()) {
            this.f46975c = cnVar.fragmentView;
            cnVar.setParentLayout(this.f46974b);
            View view = this.f46975c;
            if (view == null) {
                this.f46975c = cnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    cnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f46975c);
                }
            }
            bj bjVar = cnVar.A0;
            if (bjVar != null && (i7 = this.d) != 0) {
                bjVar.setPadding(0, i7, 0, 0);
            }
            cnVar.Sa();
            addView(this.f46975c, c8.na.c(-1.0f, -1));
            if (this.f46976e) {
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
