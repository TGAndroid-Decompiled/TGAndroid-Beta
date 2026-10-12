package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class go extends FrameLayout {
    public final fo f38105a;
    public final org.telegram.ui.ActionBar.b5 f38106b;
    public View f38107c;
    public int d;
    public boolean f38108e;

    public go(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.f38108e = true;
        this.f38106b = b5Var;
        fo foVar = new fo(this, bundle);
        this.f38105a = foVar;
        foVar.Pa = true;
    }

    public void a() {
        int i10;
        fo foVar = this.f38105a;
        if (foVar.onFragmentCreate()) {
            this.f38107c = foVar.fragmentView;
            foVar.setParentLayout(this.f38106b);
            View view = this.f38107c;
            if (view == null) {
                this.f38107c = foVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    foVar.onRemoveFromParent();
                    viewGroup.removeView(this.f38107c);
                }
            }
            ak akVar = foVar.f37478x0;
            if (akVar != null && (i10 = this.d) != 0) {
                akVar.setPadding(0, i10, 0, 0);
            }
            foVar.ua();
            addView(this.f38107c, w7.w5.d(-1.0f, -1));
            if (this.f38108e) {
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
