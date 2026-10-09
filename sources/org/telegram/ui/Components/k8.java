package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class k8 extends pm0 {
    public final Context f27869c;
    public ArrayList d = new ArrayList();
    public String f27870e;
    public i8 f27871f;
    public boolean h;
    public final l8 f27872n;

    public k8(l8 l8Var, Context context) {
        this.f27872n = l8Var;
        this.f27869c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (this.f27872n.f28358v0 && d1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f27871f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27871f);
            this.f27871f = null;
        }
        if (str == null) {
            this.f27870e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        i8 i8Var = new i8(this, str, 0);
        this.f27871f = i8Var;
        dispatchQueue.postRunnable(i8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        l8 l8Var = this.f27872n;
        boolean z10 = l8Var.f28358v0;
        if (l8Var.f28339f) {
            size = this.d.size();
        } else if (l8Var.f28362x0.size() > 1) {
            size = l8Var.f28362x0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f27872n.f28358v0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        l8 l8Var = this.f27872n;
        View view = l8Var.f28337e;
        r7 r7Var = l8Var.E;
        w7 w7Var = l8Var.f28347n;
        int i10 = 0;
        if (l8Var.f28362x0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (l8Var.f28362x0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                w7Var.setVisibility(0);
                w7Var.setTranslationY(AndroidUtilities.displaySize.y);
                w7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final k8 f26989b;

                    {
                        this.f26989b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f26989b.f27872n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f26989b.f27872n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(hs.h).start();
            } else {
                w7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final k8 f26989b;

                    {
                        this.f26989b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f26989b.f27872n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f26989b.f27872n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(hs.h).withEndAction(new rg(this, 9)).start();
            }
        }
        if (l8Var.f28362x0.size() > 1) {
            r7Var.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ri));
            view.setVisibility(0);
            w7Var.setPadding(0, w7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            r7Var.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ri));
            view.setVisibility(0);
            w7Var.setPadding(0, w7Var.getPaddingTop(), 0, 0);
        }
        l8Var.v.setVisibility((l8Var.h && l8Var.f28354s.h() == 0) ? 8 : 8);
        l8Var.E0();
    }

    @Override
    public final void v(s4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k8.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f27869c;
        if (i10 == 1) {
            ao aoVar = new ao(context, 10);
            aoVar.setTag(-33024);
            return new s4.d1(aoVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        e6Var = ((org.telegram.ui.ActionBar.f3) this.f27872n).resourcesProvider;
        return new s4.d1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, e6Var));
    }
}
