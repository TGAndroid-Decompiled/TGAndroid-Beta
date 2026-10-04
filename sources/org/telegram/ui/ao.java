package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class ao extends FrameLayout {
    public final zn f34871a;
    public final org.telegram.ui.ActionBar.c5 f34872b;
    public View f34873c;
    public int d;
    public boolean f34874e;

    public ao(Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context);
        this.f34874e = true;
        this.f34872b = c5Var;
        zn znVar = new zn(this, bundle);
        this.f34871a = znVar;
        znVar.Ma = true;
    }

    public void a() {
        int i10;
        zn znVar = this.f34871a;
        if (znVar.onFragmentCreate()) {
            this.f34873c = znVar.fragmentView;
            znVar.setParentLayout(this.f34872b);
            View view = this.f34873c;
            if (view == null) {
                this.f34873c = znVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    znVar.onRemoveFromParent();
                    viewGroup.removeView(this.f34873c);
                }
            }
            sj sjVar = znVar.f43533v0;
            if (sjVar != null && (i10 = this.d) != 0) {
                sjVar.setPadding(0, i10, 0, 0);
            }
            znVar.oa();
            addView(this.f34873c, w7.z5.c(-1.0f, -1));
            if (this.f34874e) {
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
