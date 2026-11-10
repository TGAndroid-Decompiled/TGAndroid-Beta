package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class en extends FrameLayout {
    public final dn f45407a;
    public final org.telegram.ui.ActionBar.r4 f45408b;
    public View f45409c;
    public int d;
    public boolean f45410e;

    public en(Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context);
        this.f45410e = true;
        this.f45408b = r4Var;
        dn dnVar = new dn(this, bundle);
        this.f45407a = dnVar;
        dnVar.kb = true;
    }

    public void a() {
        int i7;
        dn dnVar = this.f45407a;
        if (dnVar.onFragmentCreate()) {
            this.f45409c = dnVar.fragmentView;
            dnVar.setParentLayout(this.f45408b);
            View view = this.f45409c;
            if (view == null) {
                this.f45409c = dnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    dnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f45409c);
                }
            }
            cj cjVar = dnVar.f44741z0;
            if (cjVar != null && (i7 = this.d) != 0) {
                cjVar.setPadding(0, i7, 0, 0);
            }
            dnVar.Ra();
            addView(this.f45409c, c8.ha.c(-1.0f, -1));
            if (this.f45410e) {
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
