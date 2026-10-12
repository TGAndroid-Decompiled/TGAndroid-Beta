package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class ho extends FrameLayout {
    public final go f36887a;
    public final org.telegram.ui.ActionBar.b5 f36888b;
    public View f36889c;
    public int d;
    public boolean e;

    public ho(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f36888b = b5Var;
        go goVar = new go(this, bundle);
        this.f36887a = goVar;
        goVar.Pa = true;
    }

    public void a() {
        int i10;
        go goVar = this.f36887a;
        if (goVar.onFragmentCreate()) {
            this.f36889c = goVar.fragmentView;
            goVar.setParentLayout(this.f36888b);
            View view = this.f36889c;
            if (view == null) {
                this.f36889c = goVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    goVar.onRemoveFromParent();
                    viewGroup.removeView(this.f36889c);
                }
            }
            ak akVar = goVar.f36160x0;
            if (akVar != null && (i10 = this.d) != 0) {
                akVar.setPadding(0, i10, 0, 0);
            }
            goVar.ua();
            addView(this.f36889c, w7.a6.d(-1.0f, -1));
            if (this.e) {
                goVar.onResume();
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
