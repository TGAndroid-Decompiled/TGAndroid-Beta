package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class dn extends FrameLayout {
    public final cn f47010a;
    public final org.telegram.ui.ActionBar.r4 f47011b;
    public View f47012c;
    public int d;
    public boolean f47013e;

    public dn(Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context);
        this.f47013e = true;
        this.f47011b = r4Var;
        cn cnVar = new cn(this, bundle);
        this.f47010a = cnVar;
        cnVar.mb = true;
    }

    public void a() {
        int i7;
        cn cnVar = this.f47010a;
        if (cnVar.onFragmentCreate()) {
            this.f47012c = cnVar.fragmentView;
            cnVar.setParentLayout(this.f47011b);
            View view = this.f47012c;
            if (view == null) {
                this.f47012c = cnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    cnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f47012c);
                }
            }
            bj bjVar = cnVar.A0;
            if (bjVar != null && (i7 = this.d) != 0) {
                bjVar.setPadding(0, i7, 0, 0);
            }
            cnVar.Sa();
            addView(this.f47012c, c8.ma.c(-1.0f, -1));
            if (this.f47013e) {
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
