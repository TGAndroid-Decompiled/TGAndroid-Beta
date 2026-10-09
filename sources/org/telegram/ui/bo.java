package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class bo extends FrameLayout {
    public final ao f36359a;
    public final org.telegram.ui.ActionBar.d5 f36360b;
    public View f36361c;
    public int d;
    public boolean f36362e;

    public bo(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.f36362e = true;
        this.f36360b = d5Var;
        ao aoVar = new ao(this, bundle);
        this.f36359a = aoVar;
        aoVar.Pa = true;
    }

    public void a() {
        int i10;
        ao aoVar = this.f36359a;
        if (aoVar.onFragmentCreate()) {
            this.f36361c = aoVar.fragmentView;
            aoVar.setParentLayout(this.f36360b);
            View view = this.f36361c;
            if (view == null) {
                this.f36361c = aoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    aoVar.onRemoveFromParent();
                    viewGroup.removeView(this.f36361c);
                }
            }
            wj wjVar = aoVar.f44990x0;
            if (wjVar != null && (i10 = this.d) != 0) {
                wjVar.setPadding(0, i10, 0, 0);
            }
            aoVar.ua();
            addView(this.f36361c, w7.x5.d(-1.0f, -1));
            if (this.f36362e) {
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
