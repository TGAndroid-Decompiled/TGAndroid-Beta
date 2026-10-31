package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class q10 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.ik0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.i1 {
    public final int f40836a;
    public final b50 f40837b;

    public q10(b50 b50Var, int i10) {
        this.f40836a = i10;
        this.f40837b = b50Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int keyboardHeight;
        r0.g1 g1Var = j1Var.f46132a;
        i0.c f7 = g1Var.f(647);
        i0.c f10 = g1Var.f(8);
        b50 b50Var = this.f40837b;
        g30 g30Var = b50Var.f36099y1;
        if (!g30Var.N && !g30Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = g30Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = b50Var.S3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (g30Var.getEmojiView() != null) {
            g30Var.getEmojiView().setBottomInset(f7.d);
        }
        if (b50Var.J4) {
            ViewGroup viewGroup = b50Var.f21586b;
            int i10 = b50Var.f21615t0;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = b50Var.f21586b;
            int i11 = b50Var.f21615t0;
            viewGroup2.setPadding(f7.f7765a + i11, f7.f7766b, i11 + f7.f7767c, f7.d);
        }
        b50Var.f21586b.requestLayout();
        if (max == 0 && !g30Var.N && !g30Var.e && !g30Var.O) {
            g30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.mj0 mj0Var = b50Var.B1;
            if (mj0Var == null) {
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                mj0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.mj0 mj0Var2 = new org.telegram.ui.Components.mj0(1, b50Var.f21583a, b50Var.getContext(), Q, b50Var.I0);
                    b50Var.B1 = mj0Var2;
                    mj0Var2.setDelegate(new e40(b50Var));
                    b50Var.f21586b.addView(b50Var.B1, w7.b6.e(-2, 52, 81));
                    b50Var.B1.p(null, null, false);
                    b50Var.f36095x1.bringToFront();
                    b50Var.f36091w1.bringToFront();
                    mj0Var = b50Var.B1;
                }
            }
            b50Var.B1 = mj0Var;
        }
        g30Var.K(f10.d, false);
        b50Var.f36080t3.j(j1Var);
        return r0.j1.f46131b;
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f40836a) {
            case 1:
                b50 b50Var = this.f40837b;
                if (b50Var.I1(view)) {
                    try {
                        b50Var.H1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                b50 b50Var2 = this.f40837b;
                if (!b50Var2.t1()) {
                    if (view instanceof org.telegram.ui.Components.voip.k) {
                        return b50Var2.I1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.h4) {
                        b50Var2.L1();
                        org.telegram.ui.Components.ei0 ei0Var = ((org.telegram.ui.Cells.h4) view).f21980f;
                        if (ei0Var.isEnabled()) {
                            ei0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void k(int i10) {
        this.f40837b.F1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void r(KeyEvent keyEvent) {
        b50 b50Var;
        c40 c40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (c40Var = (b50Var = this.f40837b).W4) != null && c40Var.isShowing()) {
            b50Var.W4.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        s4.c1 K;
        b50 b50Var = this.f40837b;
        u20 u20Var = b50Var.f36008d4;
        y20 y20Var = b50Var.R3;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) b50Var.R2.f18239p.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!y20Var.f31712b) {
                    if (b50Var.f36032j2) {
                        arrayList = b50Var.f36084u2;
                    } else {
                        arrayList = b50Var.R2.f18231g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = b50Var.H1.K(indexOf + b50Var.G1.d)) != null) {
                        View view = K.f47898a;
                        if (view instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == b50Var.O4 && !b50Var.f36004c4) {
                                b50Var.f21586b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < u20Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) u20Var.getChildAt(i11);
                        if (org.telegram.messenger.jj.C1(y10Var.getParticipant().peer) == org.telegram.messenger.jj.C1(groupCallParticipant.peer)) {
                            y10Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                y20Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }
}
