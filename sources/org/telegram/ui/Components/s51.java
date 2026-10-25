package org.telegram.ui.Components;

import android.os.Process;
import android.view.TextureView;
import java.util.ArrayList;
public final class s51 implements Runnable {
    public final int f32436a;
    public final Object f32437b;

    public s51(Object obj, int i10) {
        this.f32436a = i10;
        this.f32437b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f32436a;
        Object obj = this.f32437b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.tk) obj).f34631c.presentFragment(new org.telegram.ui.y21());
                return;
            case 1:
                ((a61) obj).requestLayout();
                return;
            case 2:
                ((r61) obj).f();
                return;
            case 3:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.f26345i0;
                undoView.getClass();
                try {
                    undoView.f26354f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((u71) obj).invalidateSelf();
                return;
            case 5:
                e00 e00Var = ((h81) obj).f28860b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 6:
                s81 s81Var = (s81) obj;
                i2.j0 j0Var = s81Var.d;
                if (j0Var != null) {
                    TextureView textureView = s81Var.f32468n;
                    j0Var.F1();
                    if (textureView != null && textureView == j0Var.X) {
                        j0Var.F1();
                        j0Var.s1();
                        j0Var.x1(null);
                        j0Var.q1(0, 0);
                    }
                    s81Var.d.z1(s81Var.f32468n);
                    ArrayList arrayList = s81Var.N;
                    if (arrayList != null) {
                        s81Var.F(arrayList, s81Var.O);
                    } else if (s81Var.U) {
                        s81Var.G(s81Var.Q, s81Var.S, s81Var.R, s81Var.T);
                    } else {
                        s81Var.D(s81Var.Q, s81Var.S);
                    }
                    s81Var.C();
                    return;
                }
                return;
            case 7:
                s81 s81Var2 = ((r81) obj).f32163f;
                s81Var2.f32456a0.removeCallbacksAndMessages(null);
                s81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 8:
                ((u81) obj).f33294g = false;
                return;
            case 9:
                ((ma1) ((v50) ((org.telegram.ui.Cells.ha) obj).f24212b).f33568b).v.b();
                return;
            case 10:
                ((ia1) obj).d(false, true);
                return;
            case 11:
                db1 db1Var = (db1) obj;
                db1Var.getClass();
                fb1.a(db1Var);
                return;
            default:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                return;
        }
    }
}
