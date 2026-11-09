package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class en extends FrameLayout {
    public final dn f45471a;
    public final org.telegram.ui.ActionBar.q4 f45472b;
    public View f45473c;
    public int d;
    public boolean f45474e;

    public en(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.f45474e = true;
        this.f45472b = q4Var;
        dn dnVar = new dn(this, bundle);
        this.f45471a = dnVar;
        dnVar.kb = true;
    }

    public void a() {
        int i7;
        dn dnVar = this.f45471a;
        if (dnVar.onFragmentCreate()) {
            this.f45473c = dnVar.fragmentView;
            dnVar.setParentLayout(this.f45472b);
            View view = this.f45473c;
            if (view == null) {
                this.f45473c = dnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    dnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f45473c);
                }
            }
            cj cjVar = dnVar.f44700z0;
            if (cjVar != null && (i7 = this.d) != 0) {
                cjVar.setPadding(0, i7, 0, 0);
            }
            dnVar.Ra();
            addView(this.f45473c, c8.ha.c(-1.0f, -1));
            if (this.f45474e) {
                dnVar.onResume();
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

    public void setTopPadding(int i7) {
        this.d = i7;
    }

    public void b(boolean z9) {
    }
}
