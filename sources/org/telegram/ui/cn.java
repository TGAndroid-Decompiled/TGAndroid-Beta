package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class cn extends FrameLayout {
    public final bn f44862a;
    public final org.telegram.ui.ActionBar.q4 f44863b;
    public View f44864c;
    public int d;
    public boolean f44865e;

    public cn(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.f44865e = true;
        this.f44863b = q4Var;
        bn bnVar = new bn(this, bundle);
        this.f44862a = bnVar;
        bnVar.f43841ib = true;
    }

    public void a() {
        int i7;
        bn bnVar = this.f44862a;
        if (bnVar.onFragmentCreate()) {
            this.f44864c = bnVar.fragmentView;
            bnVar.setParentLayout(this.f44863b);
            View view = this.f44864c;
            if (view == null) {
                this.f44864c = bnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    bnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f44864c);
                }
            }
            aj ajVar = bnVar.f44043z0;
            if (ajVar != null && (i7 = this.d) != 0) {
                ajVar.setPadding(0, i7, 0, 0);
            }
            bnVar.Pa();
            addView(this.f44864c, c8.ha.c(-1.0f, -1));
            if (this.f44865e) {
                bnVar.onResume();
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
