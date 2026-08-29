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
public final class f8 extends il0 {
    public final Context f28345c;
    public ArrayList d = new ArrayList();
    public String f28346e;
    public d8 f28347f;
    public boolean h;
    public final g8 f28348n;

    public f8(g8 g8Var, Context context) {
        this.f28348n = g8Var;
        this.f28345c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (this.f28348n.f28798r0 && n1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f28347f != null) {
            Utilities.searchQueue.cancelRunnable(this.f28347f);
            this.f28347f = null;
        }
        if (str == null) {
            this.f28346e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        d8 d8Var = new d8(this, str, 0);
        this.f28347f = d8Var;
        dispatchQueue.postRunnable(d8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        g8 g8Var = this.f28348n;
        boolean z10 = g8Var.f28798r0;
        if (g8Var.f28784f) {
            size = this.d.size();
        } else if (g8Var.f28801t0.size() > 1) {
            size = g8Var.f28801t0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f28348n.f28798r0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        g8 g8Var = this.f28348n;
        View view = g8Var.f28782e;
        n7 n7Var = g8Var.A;
        s7 s7Var = g8Var.f28792n;
        int i10 = 0;
        if (g8Var.f28801t0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (g8Var.f28801t0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                s7Var.setVisibility(0);
                s7Var.setTranslationY(AndroidUtilities.displaySize.y);
                s7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final f8 f27366b;

                    {
                        this.f27366b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27366b.f28348n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f27366b.f28348n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(jr.h).start();
            } else {
                s7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final f8 f27366b;

                    {
                        this.f27366b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27366b.f28348n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f27366b.f28348n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(jr.h).withEndAction(new ig(this, 9)).start();
            }
        }
        if (g8Var.f28801t0.size() > 1) {
            n7Var.setBackgroundColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            s7Var.setPadding(0, s7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            n7Var.setBackgroundColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            s7Var.setPadding(0, s7Var.getPaddingTop(), 0, 0);
        }
        g8Var.v.setVisibility((g8Var.h && g8Var.f28799s.h() == 0) ? 8 : 8);
        g8Var.E0();
    }

    @Override
    public final void v(f2.n1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f8.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f28345c;
        if (i10 == 1) {
            fn fnVar = new fn(context, 8);
            fnVar.setTag(-33024);
            return new f2.n1(fnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        c6Var = ((org.telegram.ui.ActionBar.f3) this.f28348n).resourcesProvider;
        return new f2.n1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, c6Var));
    }
}
