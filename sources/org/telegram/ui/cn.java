package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class cn extends FrameLayout {
    public final bn f44837a;
    public final org.telegram.ui.ActionBar.q4 f44838b;
    public View f44839c;
    public int d;
    public boolean f44840e;

    public cn(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.f44840e = true;
        this.f44838b = q4Var;
        bn bnVar = new bn(this, bundle);
        this.f44837a = bnVar;
        bnVar.f43811ib = true;
    }

    public void a() {
        int i7;
        bn bnVar = this.f44837a;
        if (bnVar.onFragmentCreate()) {
            this.f44839c = bnVar.fragmentView;
            bnVar.setParentLayout(this.f44838b);
            View view = this.f44839c;
            if (view == null) {
                this.f44839c = bnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    bnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f44839c);
                }
            }
            aj ajVar = bnVar.f44013z0;
            if (ajVar != null && (i7 = this.d) != 0) {
                ajVar.setPadding(0, i7, 0, 0);
            }
            bnVar.Pa();
            addView(this.f44839c, c8.ha.c(-1.0f, -1));
            if (this.f44840e) {
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
