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
public final class b8 extends vk0 {
    public final Context f27067c;
    public ArrayList d = new ArrayList();
    public String f27068e;
    public z7 f27069f;
    public boolean h;
    public final c8 f27070n;

    public b8(c8 c8Var, Context context) {
        this.f27070n = c8Var;
        this.f27067c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (this.f27070n.f27400r0 && q1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f27069f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27069f);
            this.f27069f = null;
        }
        if (str == null) {
            this.f27068e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        z7 z7Var = new z7(this, str, 0);
        this.f27069f = z7Var;
        dispatchQueue.postRunnable(z7Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        c8 c8Var = this.f27070n;
        boolean z10 = c8Var.f27400r0;
        if (c8Var.f27386f) {
            size = this.d.size();
        } else if (c8Var.f27403t0.size() > 1) {
            size = c8Var.f27403t0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i9) {
        if (this.f27070n.f27400r0 && i9 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        c8 c8Var = this.f27070n;
        View view = c8Var.f27384e;
        i7 i7Var = c8Var.A;
        n7 n7Var = c8Var.f27394n;
        int i9 = 0;
        if (c8Var.f27403t0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (c8Var.f27403t0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                n7Var.setVisibility(0);
                n7Var.setTranslationY(AndroidUtilities.displaySize.y);
                n7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final b8 f34879b;

                    {
                        this.f34879b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f34879b.f27070n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f34879b.f27070n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(gr.h).start();
            } else {
                n7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final b8 f34879b;

                    {
                        this.f34879b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f34879b.f27070n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f34879b.f27070n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(gr.h).withEndAction(new fg(this, 9)).start();
            }
        }
        if (c8Var.f27403t0.size() > 1) {
            i7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ri));
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            i7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ri));
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, 0);
        }
        c8Var.v.setVisibility((c8Var.h && c8Var.f27401s.h() == 0) ? 8 : 8);
        c8Var.D0();
    }

    @Override
    public final void v(f2.q1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b8.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = this.f27067c;
        if (i9 == 1) {
            an anVar = new an(context, 11);
            anVar.setTag(-33024);
            return new f2.q1(anVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        b6Var = ((org.telegram.ui.ActionBar.f3) this.f27070n).resourcesProvider;
        return new f2.q1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, b6Var));
    }
}
