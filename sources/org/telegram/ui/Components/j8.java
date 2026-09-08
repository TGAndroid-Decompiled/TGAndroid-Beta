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
public final class j8 extends kl0 {
    public final Context f27400c;
    public ArrayList d = new ArrayList();
    public String f27401e;
    public h8 f27402f;
    public boolean h;
    public final k8 f27403n;

    public j8(k8 k8Var, Context context) {
        this.f27403n = k8Var;
        this.f27400c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f27403n.f27767v0 && c1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f27402f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27402f);
            this.f27402f = null;
        }
        if (str == null) {
            this.f27401e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        h8 h8Var = new h8(this, str, 0);
        this.f27402f = h8Var;
        dispatchQueue.postRunnable(h8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        k8 k8Var = this.f27403n;
        boolean z10 = k8Var.f27767v0;
        if (k8Var.f27748f) {
            size = this.d.size();
        } else if (k8Var.f27771x0.size() > 1) {
            size = k8Var.f27771x0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f27403n.f27767v0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        k8 k8Var = this.f27403n;
        View view = k8Var.f27746e;
        q7 q7Var = k8Var.E;
        v7 v7Var = k8Var.f27756n;
        int i10 = 0;
        if (k8Var.f27771x0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (k8Var.f27771x0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                v7Var.setVisibility(0);
                v7Var.setTranslationY(AndroidUtilities.displaySize.y);
                v7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final j8 f26346b;

                    {
                        this.f26346b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f26346b.f27403n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f26346b.f27403n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(pr.h).start();
            } else {
                v7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final j8 f26346b;

                    {
                        this.f26346b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f26346b.f27403n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f26346b.f27403n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(pr.h).withEndAction(new pg(this, 9)).start();
            }
        }
        if (k8Var.f27771x0.size() > 1) {
            q7Var.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            v7Var.setPadding(0, v7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            q7Var.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            v7Var.setPadding(0, v7Var.getPaddingTop(), 0, 0);
        }
        k8Var.v.setVisibility((k8Var.h && k8Var.f27763s.h() == 0) ? 8 : 8);
        k8Var.E0();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j8.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f27400c;
        if (i10 == 1) {
            jn jnVar = new jn(context, 10);
            jnVar.setTag(-33024);
            return new s4.c1(jnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        f6Var = ((org.telegram.ui.ActionBar.f3) this.f27403n).resourcesProvider;
        return new s4.c1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, f6Var));
    }
}
