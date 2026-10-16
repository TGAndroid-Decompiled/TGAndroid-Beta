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
public final class l8 extends lm0 {
    public final Context f26634c;
    public ArrayList d = new ArrayList();
    public String e;
    public j8 f26635f;
    public boolean h;
    public final m8 f26636n;

    public l8(m8 m8Var, Context context) {
        this.f26636n = m8Var;
        this.f26634c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (this.f26636n.f26993v0 && b1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f26635f != null) {
            Utilities.searchQueue.cancelRunnable(this.f26635f);
            this.f26635f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        j8 j8Var = new j8(this, str, 0);
        this.f26635f = j8Var;
        dispatchQueue.postRunnable(j8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        m8 m8Var = this.f26636n;
        boolean z10 = m8Var.f26993v0;
        if (m8Var.f26974f) {
            size = this.d.size();
        } else if (m8Var.f26997x0.size() > 1) {
            size = m8Var.f26997x0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f26636n.f26993v0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        m8 m8Var = this.f26636n;
        View view = m8Var.e;
        s7 s7Var = m8Var.E;
        x7 x7Var = m8Var.f26982n;
        int i10 = 0;
        if (m8Var.f26997x0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (m8Var.f26997x0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                x7Var.setVisibility(0);
                x7Var.setTranslationY(AndroidUtilities.displaySize.y);
                x7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final l8 f25579b;

                    {
                        this.f25579b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.e3) this.f25579b.f26636n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.f25579b.f26636n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(es.h).start();
            } else {
                x7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final l8 f25579b;

                    {
                        this.f25579b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.e3) this.f25579b.f26636n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.f25579b.f26636n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(es.h).withEndAction(new qg(this, 9)).start();
            }
        }
        if (m8Var.f26997x0.size() > 1) {
            s7Var.setBackgroundColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            x7Var.setPadding(0, x7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            s7Var.setBackgroundColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            x7Var.setPadding(0, x7Var.getPaddingTop(), 0, 0);
        }
        m8Var.v.setVisibility((m8Var.h && m8Var.f26989s.h() == 0) ? 8 : 8);
        m8Var.E0();
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l8.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f26634c;
        if (i10 == 1) {
            xn xnVar = new xn(context, 10);
            xnVar.setTag(-33024);
            return new s4.b1(xnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        c6Var = ((org.telegram.ui.ActionBar.e3) this.f26636n).resourcesProvider;
        return new s4.b1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, c6Var));
    }
}
