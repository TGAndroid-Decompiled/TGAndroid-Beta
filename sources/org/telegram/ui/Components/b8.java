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
public final class b8 extends ql0 {
    public final Context f23576c;
    public ArrayList d = new ArrayList();
    public String e;
    public z7 f23577f;
    public boolean h;
    public final c8 f23578n;

    public b8(c8 c8Var, Context context) {
        this.f23578n = c8Var;
        this.f23576c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (this.f23578n.f23863s0 && l1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f23577f != null) {
            Utilities.searchQueue.cancelRunnable(this.f23577f);
            this.f23577f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        z7 z7Var = new z7(this, str, 0);
        this.f23577f = z7Var;
        dispatchQueue.postRunnable(z7Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        c8 c8Var = this.f23578n;
        boolean z4 = c8Var.f23863s0;
        if (c8Var.f23847f) {
            size = this.d.size();
        } else if (c8Var.f23865u0.size() > 1) {
            size = c8Var.f23865u0.size();
        } else {
            return 0;
        }
        return size + (z4 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f23578n.f23863s0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z4;
        boolean z10;
        super.l();
        c8 c8Var = this.f23578n;
        View view = c8Var.e;
        j7 j7Var = c8Var.B;
        o7 o7Var = c8Var.f23855n;
        int i10 = 0;
        if (c8Var.f23865u0.size() > 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != this.h) {
            if (c8Var.f23865u0.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.h = z10;
            if (z10) {
                o7Var.setVisibility(0);
                o7Var.setTranslationY(AndroidUtilities.displaySize.y);
                o7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final b8 f30930b;

                    {
                        this.f30930b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.g3) this.f30930b.f23578n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.f30930b.f23578n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(mr.h).start();
            } else {
                o7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final b8 f30930b;

                    {
                        this.f30930b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.g3) this.f30930b.f23578n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.f30930b.f23578n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(mr.h).withEndAction(new fg(this, 9)).start();
            }
        }
        if (c8Var.f23865u0.size() > 1) {
            j7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            o7Var.setPadding(0, o7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            j7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            o7Var.setPadding(0, o7Var.getPaddingTop(), 0, 0);
        }
        c8Var.v.setVisibility((c8Var.h && c8Var.f23862s.h() == 0) ? 8 : 8);
        c8Var.E0();
    }

    @Override
    public final void v(f2.l1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b8.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f23576c;
        if (i10 == 1) {
            gn gnVar = new gn(context, 7);
            gnVar.setTag(-33024);
            return new f2.l1(gnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        f6Var = ((org.telegram.ui.ActionBar.g3) this.f23578n).resourcesProvider;
        return new f2.l1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, f6Var));
    }
}
