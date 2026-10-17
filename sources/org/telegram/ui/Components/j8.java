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
public final class j8 extends hm0 {
    public final Context f27438c;
    public ArrayList d = new ArrayList();
    public String e;
    public h8 f27439f;
    public boolean h;
    public final k8 f27440n;

    public j8(k8 k8Var, Context context) {
        this.f27440n = k8Var;
        this.f27438c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (this.f27440n.f27790v0 && b1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f27439f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27439f);
            this.f27439f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        h8 h8Var = new h8(this, str, 0);
        this.f27439f = h8Var;
        dispatchQueue.postRunnable(h8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        k8 k8Var = this.f27440n;
        boolean z10 = k8Var.f27790v0;
        if (k8Var.f27771f) {
            size = this.d.size();
        } else if (k8Var.f27794x0.size() > 1) {
            size = k8Var.f27794x0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f27440n.f27790v0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        k8 k8Var = this.f27440n;
        View view = k8Var.e;
        q7 q7Var = k8Var.E;
        v7 v7Var = k8Var.f27779n;
        int i10 = 0;
        if (k8Var.f27794x0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (k8Var.f27794x0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                v7Var.setVisibility(0);
                v7Var.setTranslationY(AndroidUtilities.displaySize.y);
                v7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final j8 f26497b;

                    {
                        this.f26497b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f26497b.f27440n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f26497b.f27440n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(bs.h).start();
            } else {
                v7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final j8 f26497b;

                    {
                        this.f26497b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f26497b.f27440n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f26497b.f27440n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(bs.h).withEndAction(new pg(this, 9)).start();
            }
        }
        if (k8Var.f27794x0.size() > 1) {
            q7Var.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ri));
            view.setVisibility(0);
            v7Var.setPadding(0, v7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            q7Var.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ri));
            view.setVisibility(0);
            v7Var.setPadding(0, v7Var.getPaddingTop(), 0, 0);
        }
        k8Var.v.setVisibility((k8Var.h && k8Var.f27786s.h() == 0) ? 8 : 8);
        k8Var.E0();
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j8.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f27438c;
        if (i10 == 1) {
            un unVar = new un(context, 10);
            unVar.setTag(-33024);
            return new s4.b1(unVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        d6Var = ((org.telegram.ui.ActionBar.f3) this.f27440n).resourcesProvider;
        return new s4.b1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, d6Var));
    }
}
