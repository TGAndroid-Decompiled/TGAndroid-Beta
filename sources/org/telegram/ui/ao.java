package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class ao extends FrameLayout {
    public final zn f34866a;
    public final org.telegram.ui.ActionBar.c5 f34867b;
    public View f34868c;
    public int d;
    public boolean f34869e;

    public ao(Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context);
        this.f34869e = true;
        this.f34867b = c5Var;
        zn znVar = new zn(this, bundle);
        this.f34866a = znVar;
        znVar.Ma = true;
    }

    public void a() {
        int i10;
        zn znVar = this.f34866a;
        if (znVar.onFragmentCreate()) {
            this.f34868c = znVar.fragmentView;
            znVar.setParentLayout(this.f34867b);
            View view = this.f34868c;
            if (view == null) {
                this.f34868c = znVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    znVar.onRemoveFromParent();
                    viewGroup.removeView(this.f34868c);
                }
            }
            sj sjVar = znVar.f43526v0;
            if (sjVar != null && (i10 = this.d) != 0) {
                sjVar.setPadding(0, i10, 0, 0);
            }
            znVar.oa();
            addView(this.f34868c, w7.z5.c(-1.0f, -1));
            if (this.f34869e) {
                znVar.onResume();
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
