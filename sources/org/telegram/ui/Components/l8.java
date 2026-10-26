package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class l8 extends lm0 {
    public final Context f30100c;
    public ArrayList d = new ArrayList();
    public String e;
    public j8 f30101f;
    public boolean h;
    public final m8 f30102n;

    public l8(m8 m8Var, Context context) {
        this.f30102n = m8Var;
        this.f30100c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (this.f30102n.f30447u0 && e1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f30101f != null) {
            Utilities.searchQueue.cancelRunnable(this.f30101f);
            this.f30101f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        j8 j8Var = new j8(this, str, 0);
        this.f30101f = j8Var;
        dispatchQueue2.postRunnable(j8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        m8 m8Var = this.f30102n;
        boolean z10 = m8Var.f30447u0;
        if (m8Var.f30429f) {
            size = this.d.size();
        } else if (m8Var.f30450w0.size() > 1) {
            size = m8Var.f30450w0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f30102n.f30447u0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        boolean z11;
        super.l();
        m8 m8Var = this.f30102n;
        View view = m8Var.e;
        s7 s7Var = m8Var.f30453y;
        x7 x7Var = m8Var.f30437n;
        int i10 = 0;
        if (m8Var.f30450w0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (m8Var.f30450w0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                x7Var.setVisibility(0);
                x7Var.setTranslationY(AndroidUtilities.displaySize.y);
                x7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final l8 f29209b;

                    {
                        this.f29209b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.k3) this.f29209b.f30102n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.k3) this.f29209b.f30102n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(ds.h).start();
            } else {
                x7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final l8 f29209b;

                    {
                        this.f29209b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.k3) this.f29209b.f30102n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.k3) this.f29209b.f30102n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(ds.h).withEndAction(new pg(this, 10)).start();
            }
        }
        if (m8Var.f30450w0.size() > 1) {
            int i11 = org.telegram.ui.ActionBar.y6.Ri;
            u6Var2 = ((org.telegram.ui.ActionBar.k3) m8Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.i(i11, s7Var, u6Var2);
            view.setVisibility(0);
            x7Var.setPadding(0, x7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            int i12 = org.telegram.ui.ActionBar.y6.Ri;
            u6Var = ((org.telegram.ui.ActionBar.k3) m8Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.i(i12, s7Var, u6Var);
            view.setVisibility(0);
            x7Var.setPadding(0, x7Var.getPaddingTop(), 0, 0);
        }
        m8Var.v.setVisibility((m8Var.h && m8Var.f30444s.h() == 0) ? 8 : 8);
        m8Var.K0();
    }

    @Override
    public final void v(s4.e1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l8.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        Context context = this.f30100c;
        if (i10 == 1) {
            vn vnVar = new vn(context, 10);
            vnVar.setTag(-33024);
            return new s4.e1(vnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        u6Var = ((org.telegram.ui.ActionBar.k3) this.f30102n).resourcesProvider;
        return new s4.e1(new org.telegram.ui.Cells.w(context, currentPlaylistIsGlobalSearch ? 1 : 0, u6Var));
    }
}
