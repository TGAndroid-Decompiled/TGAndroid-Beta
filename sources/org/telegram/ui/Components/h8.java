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
public final class h8 extends km0 {
    public final Context f26895c;
    public ArrayList d = new ArrayList();
    public String e;
    public f8 f26896f;
    public boolean h;
    public final i8 f26897n;

    public h8(i8 i8Var, Context context) {
        this.f26897n = i8Var;
        this.f26895c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (this.f26897n.f27350u0 && b1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f26896f != null) {
            Utilities.searchQueue.cancelRunnable(this.f26896f);
            this.f26896f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        f8 f8Var = new f8(this, str, 0);
        this.f26896f = f8Var;
        dispatchQueue2.postRunnable(f8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        i8 i8Var = this.f26897n;
        boolean z10 = i8Var.f27350u0;
        if (i8Var.f27332f) {
            size = this.d.size();
        } else if (i8Var.f27353w0.size() > 1) {
            size = i8Var.f27353w0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f26897n.f27350u0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        boolean z11;
        super.l();
        i8 i8Var = this.f26897n;
        View view = i8Var.e;
        o7 o7Var = i8Var.f27356y;
        t7 t7Var = i8Var.f27340n;
        int i10 = 0;
        if (i8Var.f27353w0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (i8Var.f27353w0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                t7Var.setVisibility(0);
                t7Var.setTranslationY(AndroidUtilities.displaySize.y);
                t7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h8 f25982b;

                    {
                        this.f25982b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.h3) this.f25982b.f26897n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f25982b.f26897n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(zr.h).start();
            } else {
                t7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h8 f25982b;

                    {
                        this.f25982b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.h3) this.f25982b.f26897n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f25982b.f26897n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(zr.h).withEndAction(new ng(this, 10)).start();
            }
        }
        if (i8Var.f27353w0.size() > 1) {
            int i11 = org.telegram.ui.ActionBar.k6.Ri;
            g6Var2 = ((org.telegram.ui.ActionBar.h3) i8Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.i(i11, o7Var, g6Var2);
            view.setVisibility(0);
            t7Var.setPadding(0, t7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            int i12 = org.telegram.ui.ActionBar.k6.Ri;
            g6Var = ((org.telegram.ui.ActionBar.h3) i8Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.i(i12, o7Var, g6Var);
            view.setVisibility(0);
            t7Var.setPadding(0, t7Var.getPaddingTop(), 0, 0);
        }
        i8Var.v.setVisibility((i8Var.h && i8Var.f27347s.h() == 0) ? 8 : 8);
        i8Var.K0();
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h8.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.f26895c;
        if (i10 == 1) {
            sn snVar = new sn(context, 10);
            snVar.setTag(-33024);
            return new s4.b1(snVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        g6Var = ((org.telegram.ui.ActionBar.h3) this.f26897n).resourcesProvider;
        return new s4.b1(new org.telegram.ui.Cells.w(context, currentPlaylistIsGlobalSearch ? 1 : 0, g6Var));
    }
}
