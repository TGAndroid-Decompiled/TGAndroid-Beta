package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class go extends FrameLayout {
    public final fo f33142a;
    public final org.telegram.ui.ActionBar.f5 f33143b;
    public View f33144c;
    public int d;
    public boolean e;

    public go(Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f33143b = f5Var;
        fo foVar = new fo(this, bundle);
        this.f33142a = foVar;
        foVar.Oa = true;
    }

    public void a() {
        int i10;
        fo foVar = this.f33142a;
        if (foVar.onFragmentCreate()) {
            this.f33144c = foVar.fragmentView;
            foVar.setParentLayout(this.f33143b);
            View view = this.f33144c;
            if (view == null) {
                this.f33144c = foVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    foVar.onRemoveFromParent();
                    viewGroup.removeView(this.f33144c);
                }
            }
            wj wjVar = foVar.f32542x0;
            if (wjVar != null && (i10 = this.d) != 0) {
                wjVar.setPadding(0, i10, 0, 0);
            }
            foVar.pa();
            addView(this.f33144c, w7.a6.c(-1.0f, -1));
            if (this.e) {
                foVar.onResume();
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
