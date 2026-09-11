package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class fo extends FrameLayout {
    public final eo f36437a;
    public final org.telegram.ui.ActionBar.d5 f36438b;
    public View f36439c;
    public int d;
    public boolean f36440e;

    public fo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.f36440e = true;
        this.f36438b = d5Var;
        eo eoVar = new eo(this, bundle);
        this.f36437a = eoVar;
        eoVar.Oa = true;
    }

    public void a() {
        int i10;
        eo eoVar = this.f36437a;
        if (eoVar.onFragmentCreate()) {
            this.f36439c = eoVar.fragmentView;
            eoVar.setParentLayout(this.f36438b);
            View view = this.f36439c;
            if (view == null) {
                this.f36439c = eoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    eoVar.onRemoveFromParent();
                    viewGroup.removeView(this.f36439c);
                }
            }
            uj ujVar = eoVar.f35473x0;
            if (ujVar != null && (i10 = this.d) != 0) {
                ujVar.setPadding(0, i10, 0, 0);
            }
            eoVar.pa();
            addView(this.f36439c, w7.x5.c(-1.0f, -1));
            if (this.f36440e) {
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
