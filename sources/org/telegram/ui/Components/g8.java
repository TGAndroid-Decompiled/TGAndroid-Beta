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
public final class g8 extends ll0 {
    public final Context f24109c;
    public ArrayList d = new ArrayList();
    public String e;
    public e8 f24110f;
    public boolean h;
    public final h8 f24111n;

    public g8(h8 h8Var, Context context) {
        this.f24111n = h8Var;
        this.f24109c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f24111n.f24569v0 && c1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f24110f != null) {
            Utilities.searchQueue.cancelRunnable(this.f24110f);
            this.f24110f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        e8 e8Var = new e8(this, str, 0);
        this.f24110f = e8Var;
        dispatchQueue.postRunnable(e8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        h8 h8Var = this.f24111n;
        boolean z10 = h8Var.f24569v0;
        if (h8Var.f24550f) {
            size = this.d.size();
        } else if (h8Var.f24573x0.size() > 1) {
            size = h8Var.f24573x0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f24111n.f24569v0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        h8 h8Var = this.f24111n;
        View view = h8Var.e;
        n7 n7Var = h8Var.E;
        s7 s7Var = h8Var.f24558n;
        int i10 = 0;
        if (h8Var.f24573x0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (h8Var.f24573x0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                s7Var.setVisibility(0);
                s7Var.setTranslationY(AndroidUtilities.displaySize.y);
                s7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g8 f23228b;

                    {
                        this.f23228b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.g3) this.f23228b.f24111n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.f23228b.f24111n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(qr.h).start();
            } else {
                s7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final g8 f23228b;

                    {
                        this.f23228b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.g3) this.f23228b.f24111n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.f23228b.f24111n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(qr.h).withEndAction(new ng(this, 9)).start();
            }
        }
        if (h8Var.f24573x0.size() > 1) {
            n7Var.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            s7Var.setPadding(0, s7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            n7Var.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            s7Var.setPadding(0, s7Var.getPaddingTop(), 0, 0);
        }
        h8Var.v.setVisibility((h8Var.h && h8Var.f24565s.h() == 0) ? 8 : 8);
        h8Var.E0();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g8.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f24109c;
        if (i10 == 1) {
            kn knVar = new kn(context, 10);
            knVar.setTag(-33024);
            return new s4.c1(knVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        f6Var = ((org.telegram.ui.ActionBar.g3) this.f24111n).resourcesProvider;
        return new s4.c1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, f6Var));
    }
}
