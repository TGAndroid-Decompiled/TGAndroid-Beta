package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class fo extends FrameLayout {
    public final eo f36464a;
    public final org.telegram.ui.ActionBar.d5 f36465b;
    public View f36466c;
    public int d;
    public boolean f36467e;

    public fo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.f36467e = true;
        this.f36465b = d5Var;
        eo eoVar = new eo(this, bundle);
        this.f36464a = eoVar;
        eoVar.Oa = true;
    }

    public void a() {
        int i10;
        eo eoVar = this.f36464a;
        if (eoVar.onFragmentCreate()) {
            this.f36466c = eoVar.fragmentView;
            eoVar.setParentLayout(this.f36465b);
            View view = this.f36466c;
            if (view == null) {
                this.f36466c = eoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    eoVar.onRemoveFromParent();
                    viewGroup.removeView(this.f36466c);
                }
            }
            uj ujVar = eoVar.f35500x0;
            if (ujVar != null && (i10 = this.d) != 0) {
                ujVar.setPadding(0, i10, 0, 0);
            }
            eoVar.pa();
            addView(this.f36466c, w7.x5.c(-1.0f, -1));
            if (this.f36467e) {
                eoVar.onResume();
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

    public void setTopPadding(int i10) {
        this.d = i10;
    }

    public void b(boolean z10) {
    }
}
