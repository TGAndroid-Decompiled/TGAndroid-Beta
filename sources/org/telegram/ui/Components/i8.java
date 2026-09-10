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
public final class i8 extends ul0 {
    public final Context f23921c;
    public ArrayList d = new ArrayList();
    public String e;
    public g8 f23922f;
    public boolean h;
    public final j8 f23923n;

    public i8(j8 j8Var, Context context) {
        this.f23923n = j8Var;
        this.f23921c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f23923n.f24302v0 && c1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f23922f != null) {
            Utilities.searchQueue.cancelRunnable(this.f23922f);
            this.f23922f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        g8 g8Var = new g8(this, str, 0);
        this.f23922f = g8Var;
        dispatchQueue.postRunnable(g8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        j8 j8Var = this.f23923n;
        boolean z10 = j8Var.f24302v0;
        if (j8Var.f24283f) {
            size = this.d.size();
        } else if (j8Var.f24306x0.size() > 1) {
            size = j8Var.f24306x0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f23923n.f24302v0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        j8 j8Var = this.f23923n;
        View view = j8Var.e;
        p7 p7Var = j8Var.E;
        u7 u7Var = j8Var.f24291n;
        int i10 = 0;
        if (j8Var.f24306x0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (j8Var.f24306x0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                u7Var.setVisibility(0);
                u7Var.setTranslationY(AndroidUtilities.displaySize.y);
                u7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final i8 f22925b;

                    {
                        this.f22925b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.h3) this.f22925b.f23923n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f22925b.f23923n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(wr.h).start();
            } else {
                u7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final i8 f22925b;

                    {
                        this.f22925b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.h3) this.f22925b.f23923n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f22925b.f23923n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(wr.h).withEndAction(new rg(this, 9)).start();
            }
        }
        if (j8Var.f24306x0.size() > 1) {
            p7Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            u7Var.setPadding(0, u7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            p7Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            u7Var.setPadding(0, u7Var.getPaddingTop(), 0, 0);
        }
        j8Var.v.setVisibility((j8Var.h && j8Var.f24298s.h() == 0) ? 8 : 8);
        j8Var.E0();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f23921c;
        if (i10 == 1) {
            qn qnVar = new qn(context, 9);
            qnVar.setTag(-33024);
            return new s4.c1(qnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        f6Var = ((org.telegram.ui.ActionBar.h3) this.f23923n).resourcesProvider;
        return new s4.c1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, f6Var));
    }
}
