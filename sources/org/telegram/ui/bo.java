package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class bo extends FrameLayout {
    public final ao f32521a;
    public final org.telegram.ui.ActionBar.d5 f32522b;
    public View f32523c;
    public int d;
    public boolean e;

    public bo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f32522b = d5Var;
        ao aoVar = new ao(this, bundle);
        this.f32521a = aoVar;
        aoVar.Oa = true;
    }

    public void a() {
        int i10;
        ao aoVar = this.f32521a;
        if (aoVar.onFragmentCreate()) {
            this.f32523c = aoVar.fragmentView;
            aoVar.setParentLayout(this.f32522b);
            View view = this.f32523c;
            if (view == null) {
                this.f32523c = aoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    aoVar.onRemoveFromParent();
                    viewGroup.removeView(this.f32523c);
                }
            }
            uj ujVar = aoVar.f40551x0;
            if (ujVar != null && (i10 = this.d) != 0) {
                ujVar.setPadding(0, i10, 0, 0);
            }
            aoVar.pa();
            addView(this.f32523c, w7.y5.c(-1.0f, -1));
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
