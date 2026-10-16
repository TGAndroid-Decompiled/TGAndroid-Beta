package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class ho extends FrameLayout {
    public final go f36617a;
    public final org.telegram.ui.ActionBar.b5 f36618b;
    public View f36619c;
    public int d;
    public boolean e;

    public ho(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f36618b = b5Var;
        go goVar = new go(this, bundle);
        this.f36617a = goVar;
        goVar.Pa = true;
    }

    public void a() {
        int i10;
        go goVar = this.f36617a;
        if (goVar.onFragmentCreate()) {
            this.f36619c = goVar.fragmentView;
            goVar.setParentLayout(this.f36618b);
            View view = this.f36619c;
            if (view == null) {
                this.f36619c = goVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    goVar.onRemoveFromParent();
                    viewGroup.removeView(this.f36619c);
                }
            }
            ak akVar = goVar.f35861x0;
            if (akVar != null && (i10 = this.d) != 0) {
                akVar.setPadding(0, i10, 0, 0);
            }
            goVar.ua();
            addView(this.f36619c, w7.z5.d(-1.0f, -1));
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
