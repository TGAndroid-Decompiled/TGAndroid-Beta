package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.o9;
import org.telegram.ui.ei0;
import org.telegram.ui.li0;
import org.telegram.ui.yh0;
public final class f extends AnimatorListenerAdapter {
    public final int f22923a = 0;
    public final boolean f22924b;
    public final boolean f22925c;
    public final Object d;
    public final KeyEvent.Callback f22926e;

    public f(k kVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f22926e = kVar;
        this.d = arrayList;
        this.f22924b = z10;
        this.f22925c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        ff ffVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        yh0 yh0Var;
        switch (this.f22923a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.f22926e;
                int i9 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f22924b;
                    if (i9 < size) {
                        View view = (View) arrayList.get(i9);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i9++;
                    } else {
                        if (z10 && !this.f22925c) {
                            h5 h5Var = kVar.f23583n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = kVar.f23583n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        o9 o9Var = kVar.f23568f;
                        if (o9Var != null && !z10) {
                            o9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                li0 li0Var = (li0) this.f22926e;
                ei0 ei0Var = li0Var.G;
                boolean z11 = this.f22924b;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                li0Var.A = f10;
                li0Var.f40177x = false;
                li0Var.f40178y = false;
                li0Var.D.setAlpha(f10);
                if (z11) {
                    li0Var.f40176w = false;
                    li0Var.v = false;
                }
                ff ffVar2 = li0Var.O;
                if (ffVar2 != null) {
                    ffVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = li0Var.f40165n0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                lg lgVar = li0Var.S;
                if (lgVar != null && !li0Var.f40171s) {
                    lgVar.setAlpha(1.0f);
                }
                if (!z11 && (yh0Var = li0Var.T) != null) {
                    yh0Var.setAlpha(0.0f);
                }
                if (!this.f22925c && (viewGroup = li0Var.V) != null) {
                    viewGroup.setAlpha(li0Var.A);
                }
                ei0Var.invalidate();
                ei0Var.setAlpha(li0Var.A);
                li0Var.B.invalidate();
                li0Var.C.invalidate();
                if (runnable != null) {
                    if (!z11 && (t1Var = li0Var.f40165n0) != null && t1Var.isAttachedToWindow()) {
                        li0Var.f40165n0.post(runnable);
                        return;
                    } else if (!z11 && (ffVar = li0Var.O) != null && ffVar.isAttachedToWindow()) {
                        li0Var.O.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(li0 li0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f22926e = li0Var;
        this.f22924b = z10;
        this.f22925c = z11;
        this.d = runnable;
    }
}
