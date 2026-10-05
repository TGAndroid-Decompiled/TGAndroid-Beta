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
public final class i8 extends yl0 {
    public final Context f27418c;
    public ArrayList d = new ArrayList();
    public String f27419e;
    public g8 f27420f;
    public boolean h;
    public final j8 f27421n;

    public i8(j8 j8Var, Context context) {
        this.f27421n = j8Var;
        this.f27418c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f27421n.f27727v0 && c1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f27420f != null) {
            Utilities.searchQueue.cancelRunnable(this.f27420f);
            this.f27420f = null;
        }
        if (str == null) {
            this.f27419e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        g8 g8Var = new g8(this, str, 0);
        this.f27420f = g8Var;
        dispatchQueue.postRunnable(g8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        j8 j8Var = this.f27421n;
        boolean z10 = j8Var.f27727v0;
        if (j8Var.f27708f) {
            size = this.d.size();
        } else if (j8Var.f27731x0.size() > 1) {
            size = j8Var.f27731x0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f27421n.f27727v0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        j8 j8Var = this.f27421n;
        View view = j8Var.f27706e;
        p7 p7Var = j8Var.E;
        u7 u7Var = j8Var.f27716n;
        int i10 = 0;
        if (j8Var.f27731x0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (j8Var.f27731x0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                u7Var.setVisibility(0);
                u7Var.setTranslationY(AndroidUtilities.displaySize.y);
                u7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final i8 f26426b;

                    {
                        this.f26426b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f26426b.f27421n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f26426b.f27421n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(tr.h).start();
            } else {
                u7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final i8 f26426b;

                    {
                        this.f26426b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f26426b.f27421n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f26426b.f27421n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(tr.h).withEndAction(new qg(this, 9)).start();
            }
        }
        if (j8Var.f27731x0.size() > 1) {
            p7Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ri));
            view.setVisibility(0);
            u7Var.setPadding(0, u7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            p7Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ri));
            view.setVisibility(0);
            u7Var.setPadding(0, u7Var.getPaddingTop(), 0, 0);
        }
        j8Var.v.setVisibility((j8Var.h && j8Var.f27723s.h() == 0) ? 8 : 8);
        j8Var.E0();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i8.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f27418c;
        if (i10 == 1) {
            nn nnVar = new nn(context, 10);
            nnVar.setTag(-33024);
            return new s4.c1(nnVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        d6Var = ((org.telegram.ui.ActionBar.f3) this.f27421n).resourcesProvider;
        return new s4.c1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, d6Var));
    }
}
