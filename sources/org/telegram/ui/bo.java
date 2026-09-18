package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class bo extends FrameLayout {
    public final ao f32418a;
    public final org.telegram.ui.ActionBar.d5 f32419b;
    public View f32420c;
    public int d;
    public boolean e;

    public bo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f32419b = d5Var;
        ao aoVar = new ao(this, bundle);
        this.f32418a = aoVar;
        aoVar.Oa = true;
    }

    public void a() {
        int i10;
        ao aoVar = this.f32418a;
        if (aoVar.onFragmentCreate()) {
            this.f32420c = aoVar.fragmentView;
            aoVar.setParentLayout(this.f32419b);
            View view = this.f32420c;
            if (view == null) {
                this.f32420c = aoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    aoVar.onRemoveFromParent();
                    viewGroup.removeView(this.f32420c);
                }
            }
            tj tjVar = aoVar.f40488x0;
            if (tjVar != null && (i10 = this.d) != 0) {
                tjVar.setPadding(0, i10, 0, 0);
            }
            aoVar.pa();
            addView(this.f32420c, w7.y5.c(-1.0f, -1));
            if (this.e) {
                aoVar.onResume();
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
