package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class bo extends FrameLayout {
    public final ao f36403a;
    public final org.telegram.ui.ActionBar.d5 f36404b;
    public View f36405c;
    public int d;
    public boolean f36406e;

    public bo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.f36406e = true;
        this.f36404b = d5Var;
        ao aoVar = new ao(this, bundle);
        this.f36403a = aoVar;
        aoVar.Pa = true;
    }

    public void a() {
        int i10;
        ao aoVar = this.f36403a;
        if (aoVar.onFragmentCreate()) {
            this.f36405c = aoVar.fragmentView;
            aoVar.setParentLayout(this.f36404b);
            View view = this.f36405c;
            if (view == null) {
                this.f36405c = aoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    aoVar.onRemoveFromParent();
                    viewGroup.removeView(this.f36405c);
                }
            }
            wj wjVar = aoVar.f45034x0;
            if (wjVar != null && (i10 = this.d) != 0) {
                wjVar.setPadding(0, i10, 0, 0);
            }
            aoVar.ua();
            addView(this.f36405c, w7.x5.d(-1.0f, -1));
            if (this.f36406e) {
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
