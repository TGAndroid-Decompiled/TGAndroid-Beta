package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class bo extends FrameLayout {
    public final ao f32924a;
    public final org.telegram.ui.ActionBar.e5 f32925b;
    public View f32926c;
    public int d;
    public boolean e;

    public bo(Context context, org.telegram.ui.ActionBar.e5 e5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f32925b = e5Var;
        ao aoVar = new ao(this, bundle);
        this.f32924a = aoVar;
        aoVar.La = true;
    }

    public void a() {
        int i10;
        ao aoVar = this.f32924a;
        if (aoVar.onFragmentCreate()) {
            this.f32926c = aoVar.fragmentView;
            aoVar.setParentLayout(this.f32925b);
            View view = this.f32926c;
            if (view == null) {
                this.f32926c = aoVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    aoVar.onRemoveFromParent();
                    viewGroup.removeView(this.f32926c);
                }
            }
            sj sjVar = aoVar.f40759u0;
            if (sjVar != null && (i10 = this.d) != 0) {
                sjVar.setPadding(0, i10, 0, 0);
            }
            aoVar.pa();
            addView(this.f32926c, k7.b6.c(-1.0f, -1));
            if (this.e) {
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

    public void b(boolean z4) {
    }
}
