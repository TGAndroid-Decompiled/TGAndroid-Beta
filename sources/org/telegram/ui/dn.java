package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class dn extends FrameLayout {
    public final cn f47013a;
    public final org.telegram.ui.ActionBar.r4 f47014b;
    public View f47015c;
    public int d;
    public boolean f47016e;

    public dn(Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context);
        this.f47016e = true;
        this.f47014b = r4Var;
        cn cnVar = new cn(this, bundle);
        this.f47013a = cnVar;
        cnVar.mb = true;
    }

    public void a() {
        int i7;
        cn cnVar = this.f47013a;
        if (cnVar.onFragmentCreate()) {
            this.f47015c = cnVar.fragmentView;
            cnVar.setParentLayout(this.f47014b);
            View view = this.f47015c;
            if (view == null) {
                this.f47015c = cnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    cnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f47015c);
                }
            }
            bj bjVar = cnVar.A0;
            if (bjVar != null && (i7 = this.d) != 0) {
                bjVar.setPadding(0, i7, 0, 0);
            }
            cnVar.Sa();
            addView(this.f47015c, c8.ma.c(-1.0f, -1));
            if (this.f47016e) {
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
