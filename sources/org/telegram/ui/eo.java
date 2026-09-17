package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class eo extends FrameLayout {
    public final co f33444a;
    public final org.telegram.ui.ActionBar.e5 f33445b;
    public View f33446c;
    public int d;
    public boolean e;

    public eo(Context context, org.telegram.ui.ActionBar.e5 e5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f33445b = e5Var;
        co coVar = new co(this, bundle);
        this.f33444a = coVar;
        coVar.Oa = true;
    }

    public void a() {
        int i10;
        co coVar = this.f33444a;
        if (coVar.onFragmentCreate()) {
            this.f33446c = coVar.fragmentView;
            coVar.setParentLayout(this.f33445b);
            View view = this.f33446c;
            if (view == null) {
                this.f33446c = coVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    coVar.onRemoveFromParent();
                    viewGroup.removeView(this.f33446c);
                }
            }
            vj vjVar = coVar.f32502x0;
            if (vjVar != null && (i10 = this.d) != 0) {
                vjVar.setPadding(0, i10, 0, 0);
            }
            coVar.pa();
            addView(this.f33446c, w7.x5.c(-1.0f, -1));
            if (this.e) {
                coVar.onResume();
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
