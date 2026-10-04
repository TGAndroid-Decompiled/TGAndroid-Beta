package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class ao extends FrameLayout {
    public final zn f34865a;
    public final org.telegram.ui.ActionBar.c5 f34866b;
    public View f34867c;
    public int d;
    public boolean f34868e;

    public ao(Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context);
        this.f34868e = true;
        this.f34866b = c5Var;
        zn znVar = new zn(this, bundle);
        this.f34865a = znVar;
        znVar.Ma = true;
    }

    public void a() {
        int i10;
        zn znVar = this.f34865a;
        if (znVar.onFragmentCreate()) {
            this.f34867c = znVar.fragmentView;
            znVar.setParentLayout(this.f34866b);
            View view = this.f34867c;
            if (view == null) {
                this.f34867c = znVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    znVar.onRemoveFromParent();
                    viewGroup.removeView(this.f34867c);
                }
            }
            sj sjVar = znVar.f43525v0;
            if (sjVar != null && (i10 = this.d) != 0) {
                sjVar.setPadding(0, i10, 0, 0);
            }
            znVar.oa();
            addView(this.f34867c, w7.z5.c(-1.0f, -1));
            if (this.f34868e) {
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
