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
import org.telegram.ui.Components.p9;
import org.telegram.ui.fi0;
import org.telegram.ui.li0;
import org.telegram.ui.si0;
public final class f extends AnimatorListenerAdapter {
    public final int f19671a = 0;
    public final boolean f19672b;
    public final boolean f19673c;
    public final Object d;
    public final KeyEvent.Callback e;

    public f(k kVar, ArrayList arrayList, boolean z4, boolean z10) {
        this.e = kVar;
        this.d = arrayList;
        this.f19672b = z4;
        this.f19673c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        ff ffVar;
        org.telegram.ui.Cells.t1 t1Var;
        ViewGroup viewGroup;
        fi0 fi0Var;
        switch (this.f19671a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                k kVar = (k) this.e;
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    boolean z4 = this.f19672b;
                    if (i10 < size) {
                        View view = (View) arrayList.get(i10);
                        if (z4) {
                            view.setVisibility(4);
                            view.setAlpha(0.0f);
                        } else {
                            view.setAlpha(1.0f);
                        }
                        i10++;
                    } else {
                        if (z4 && !this.f19673c) {
                            k5 k5Var = kVar.f20334n[0];
                            if (k5Var != null) {
                                k5Var.setVisibility(8);
                            }
                            k5 k5Var2 = kVar.f20334n[1];
                            if (k5Var2 != null) {
                                k5Var2.setVisibility(8);
                            }
                        }
                        p9 p9Var = kVar.f20319f;
                        if (p9Var != null && !z4) {
                            p9Var.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                Runnable runnable = (Runnable) this.d;
                si0 si0Var = (si0) this.e;
                li0 li0Var = si0Var.H;
                boolean z10 = this.f19672b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                si0Var.B = f10;
                si0Var.f38380x = false;
                si0Var.f38381y = false;
                si0Var.E.setAlpha(f10);
                if (z10) {
                    si0Var.f38378w = false;
                    si0Var.v = false;
                }
                ff ffVar2 = si0Var.P;
                if (ffVar2 != null) {
                    ffVar2.setAlpha(1.0f);
                }
                org.telegram.ui.Cells.t1 t1Var2 = si0Var.f38368o0;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(0);
                }
                lg lgVar = si0Var.T;
                if (lgVar != null && !si0Var.f38373s) {
                    lgVar.setAlpha(1.0f);
                }
                if (!z10 && (fi0Var = si0Var.U) != null) {
                    fi0Var.setAlpha(0.0f);
                }
                if (!this.f19673c && (viewGroup = si0Var.W) != null) {
                    viewGroup.setAlpha(si0Var.B);
                }
                li0Var.invalidate();
                li0Var.setAlpha(si0Var.B);
                si0Var.C.invalidate();
                si0Var.D.invalidate();
                if (runnable != null) {
                    if (!z10 && (t1Var = si0Var.f38368o0) != null && t1Var.isAttachedToWindow()) {
                        si0Var.f38368o0.post(runnable);
                        return;
                    } else if (!z10 && (ffVar = si0Var.P) != null && ffVar.isAttachedToWindow()) {
                        si0Var.P.post(runnable);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
                return;
        }
    }

    public f(si0 si0Var, boolean z4, boolean z10, Runnable runnable) {
        this.e = si0Var;
        this.f19672b = z4;
        this.f19673c = z10;
        this.d = runnable;
    }
}
