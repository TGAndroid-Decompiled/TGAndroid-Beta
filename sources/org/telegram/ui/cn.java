package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class cn extends FrameLayout {
    public final bn f46179a;
    public final org.telegram.ui.ActionBar.o4 f46180b;
    public View f46181c;
    public int d;
    public boolean f46182e;

    public cn(Context context, org.telegram.ui.ActionBar.o4 o4Var, Bundle bundle) {
        super(context);
        this.f46182e = true;
        this.f46180b = o4Var;
        bn bnVar = new bn(this, bundle);
        this.f46179a = bnVar;
        bnVar.f45275lb = true;
    }

    public void a() {
        int i7;
        bn bnVar = this.f46179a;
        if (bnVar.onFragmentCreate()) {
            this.f46181c = bnVar.fragmentView;
            bnVar.setParentLayout(this.f46180b);
            View view = this.f46181c;
            if (view == null) {
                this.f46181c = bnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    bnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f46181c);
                }
            }
            aj ajVar = bnVar.A0;
            if (ajVar != null && (i7 = this.d) != 0) {
                ajVar.setPadding(0, i7, 0, 0);
            }
            bnVar.Sa();
            addView(this.f46181c, c8.ja.c(-1.0f, -1));
            if (this.f46182e) {
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

    public void b(boolean z10) {
    }
}
