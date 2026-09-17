package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class fo extends FrameLayout {
    public final eo f36465a;
    public final org.telegram.ui.ActionBar.d5 f36466b;
    public View f36467c;
    public int d;
    public boolean f36468e;

    public fo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.f36468e = true;
        this.f36466b = d5Var;
        eo eoVar = new eo(this, bundle);
        this.f36465a = eoVar;
        eoVar.Oa = true;
    }

    public void a() {
        int i10;
        eo eoVar = this.f36465a;
        if (eoVar.onFragmentCreate()) {
            this.f36467c = eoVar.fragmentView;
            eoVar.setParentLayout(this.f36466b);
            View view = this.f36467c;
            if (view == null) {
                this.f36467c = eoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    eoVar.onRemoveFromParent();
                    viewGroup.removeView(this.f36467c);
                }
            }
            uj ujVar = eoVar.f35501x0;
            if (ujVar != null && (i10 = this.d) != 0) {
                ujVar.setPadding(0, i10, 0, 0);
            }
            eoVar.pa();
            addView(this.f36467c, w7.x5.c(-1.0f, -1));
            if (this.f36468e) {
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
