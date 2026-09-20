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
public final class h8 extends ul0 {
    public final Context f24563c;
    public ArrayList d = new ArrayList();
    public String e;
    public f8 f24564f;
    public boolean h;
    public final i8 f24565n;

    public h8(i8 i8Var, Context context) {
        this.f24565n = i8Var;
        this.f24563c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f24565n.f24935v0 && c1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f24564f != null) {
            Utilities.searchQueue.cancelRunnable(this.f24564f);
            this.f24564f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        f8 f8Var = new f8(this, str, 0);
        this.f24564f = f8Var;
        dispatchQueue.postRunnable(f8Var, 300L);
    }

    @Override
    public final int h() {
        int size;
        i8 i8Var = this.f24565n;
        boolean z10 = i8Var.f24935v0;
        if (i8Var.f24916f) {
            size = this.d.size();
        } else if (i8Var.f24939x0.size() > 1) {
            size = i8Var.f24939x0.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (this.f24565n.f24935v0 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        boolean z10;
        boolean z11;
        super.l();
        i8 i8Var = this.f24565n;
        View view = i8Var.e;
        o7 o7Var = i8Var.E;
        t7 t7Var = i8Var.f24924n;
        int i10 = 0;
        if (i8Var.f24939x0.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (i8Var.f24939x0.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                t7Var.setVisibility(0);
                t7Var.setTranslationY(AndroidUtilities.displaySize.y);
                t7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h8 f23767b;

                    {
                        this.f23767b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f23767b.f24565n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f23767b.f24565n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(qr.h).start();
            } else {
                t7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h8 f23767b;

                    {
                        this.f23767b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (r2) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.f23767b.f24565n).containerView;
                                viewGroup.invalidate();
                                return;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f23767b.f24565n).containerView;
                                viewGroup2.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(qr.h).withEndAction(new og(this, 9)).start();
            }
        }
        if (i8Var.f24939x0.size() > 1) {
            o7Var.setBackgroundColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            t7Var.setPadding(0, t7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            o7Var.setBackgroundColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            t7Var.setPadding(0, t7Var.getPaddingTop(), 0, 0);
        }
        i8Var.v.setVisibility((i8Var.h && i8Var.f24931s.h() == 0) ? 8 : 8);
        i8Var.E0();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h8.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f24563c;
        if (i10 == 1) {
            kn knVar = new kn(context, 10);
            knVar.setTag(-33024);
            return new s4.c1(knVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        f6Var = ((org.telegram.ui.ActionBar.f3) this.f24565n).resourcesProvider;
        return new s4.c1(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, f6Var));
    }
}
