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
public final class b8 extends sl0 {
    public final Context f25513c;
    public ArrayList d = new ArrayList();
    public String f25514e;
    public z7 f25515f;
    public boolean h;
    public final c8 f25516n;

    public b8(c8 c8Var, Context context) {
        this.f25516n = c8Var;
        this.f25513c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (this.f25516n.f25851s0 && m1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f25515f != null) {
            Utilities.searchQueue.cancelRunnable(this.f25515f);
            this.f25515f = null;
        }
        if (str == null) {
            this.f25514e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        z7 z7Var = new z7(this, str, 0);
        this.f25515f = z7Var;
        dispatchQueue.postRunnable(z7Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        c8 c8Var = this.f25516n;
        boolean z4 = c8Var.f25851s0;
        if (c8Var.f25835f) {
            size = this.d.size();
        } else if (c8Var.f25853u0.size() > 1) {
            size = c8Var.f25853u0.size();
        } else {
            return 0;
        }
        return size + (z4 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f25516n.f25851s0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z4;
        boolean z10;
        super.l();
        c8 c8Var = this.f25516n;
        View view = c8Var.f25833e;
        j7 j7Var = c8Var.B;
        o7 o7Var = c8Var.f25843n;
        int i10 = 0;
        if (c8Var.f25853u0.size() > 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != this.h) {
            if (c8Var.f25853u0.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.h = z10;
            if (z10) {
                o7Var.setVisibility(0);
                o7Var.setTranslationY(AndroidUtilities.displaySize.y);
                o7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final b8 f33392b;

                    {
                        this.f33392b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.h3) this.f33392b.f25516n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f33392b.f25516n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(pr.h).start();
            } else {
                o7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final b8 f33392b;

                    {
                        this.f33392b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.h3) this.f33392b.f25516n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f33392b.f25516n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(pr.h).withEndAction(new fg(this, 9)).start();
            }
        }
        if (c8Var.f25853u0.size() > 1) {
            j7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ri));
            view.setVisibility(0);
            o7Var.setPadding(0, o7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            j7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ri));
            view.setVisibility(0);
            o7Var.setPadding(0, o7Var.getPaddingTop(), 0, 0);
        }
        c8Var.v.setVisibility((c8Var.h && c8Var.f25850s.h() == 0) ? 8 : 8);
        c8Var.E0();
    }

    @Override
    public final void v(f2.m1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b8.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.f25513c;
        if (i10 == 1) {
            jn jnVar = new jn(context, 7);
            jnVar.setTag(-33024);
            return new f2.m1(jnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        g6Var = ((org.telegram.ui.ActionBar.h3) this.f25516n).resourcesProvider;
        return new f2.m1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, g6Var));
    }
}
