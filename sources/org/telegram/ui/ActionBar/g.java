package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.t9;
import org.telegram.ui.di0;
import org.telegram.ui.ki0;
import org.telegram.ui.xh0;
public final class g extends AnimatorListenerAdapter {
    public final int f22958a = 0;
    public final boolean f22959b;
    public final boolean f22960c;
    public final Object d;
    public final KeyEvent.Callback f22961e;

    public g(l lVar, ArrayList arrayList, boolean z10, boolean z11) {
        this.f22961e = lVar;
        this.d = arrayList;
        this.f22959b = z10;
        this.f22960c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        jf jfVar;
        org.telegram.ui.Cells.s1 s1Var;
        ViewGroup viewGroup;
        xh0 xh0Var;
        switch (this.f22958a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                l lVar = (l) this.f22961e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z10 = this.f22959b;
                    if (i10 < size) {
                        View view = (View) arrayList.get(i10);
                        if (z10) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i10++;
                    } else {
                        if (z10 && !this.f22960c) {
                            h5 h5Var = lVar.f23618n[0];
                            if (h5Var != null) {
                                h5Var.setVisibility(8);
                            }
                            h5 h5Var2 = lVar.f23618n[1];
                            if (h5Var2 != null) {
                                h5Var2.setVisibility(8);
                            }
                        }
                        t9 t9Var = lVar.f23603f;
                        if (t9Var != null && !z10) {
                            t9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                ki0 ki0Var = (ki0) this.f22961e;
                di0 di0Var = ki0Var.G;
                boolean z11 = this.f22959b;
                if (z11) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ki0Var.A = f9;
                ki0Var.f39902x = false;
                ki0Var.f39903y = false;
                ki0Var.D.setAlpha(f9);
                if (z11) {
                    ki0Var.f39901w = false;
                    ki0Var.v = false;
                }
                jf jfVar2 = ki0Var.O;
                if (jfVar2 != null) {
                    jfVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.s1 s1Var2 = ki0Var.f39890n0;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(0);
                }
                og ogVar = ki0Var.S;
                if (ogVar != null && !ki0Var.f39896s) {
                    ogVar.setAlpha(1.0f);
                }
                if (!z11 && (xh0Var = ki0Var.T) != null) {
                    xh0Var.setAlpha(0.0f);
                }
                if (!this.f22960c && (viewGroup = ki0Var.V) != null) {
                    viewGroup.setAlpha(ki0Var.A);
                }
                di0Var.invalidate();
                di0Var.setAlpha(ki0Var.A);
                ki0Var.B.invalidate();
                ki0Var.C.invalidate();
                if (runnable != null) {
                    if (!z11 && (s1Var = ki0Var.f39890n0) != null && s1Var.isAttachedToWindow()) {
                        ki0Var.f39890n0.post(runnable);
                        return;
                    } else if (!z11 && (jfVar = ki0Var.O) != null && jfVar.isAttachedToWindow()) {
                        ki0Var.O.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public g(ki0 ki0Var, boolean z10, boolean z11, Runnable runnable) {
        this.f22961e = ki0Var;
        this.f22959b = z10;
        this.f22960c = z11;
        this.d = runnable;
    }
}
