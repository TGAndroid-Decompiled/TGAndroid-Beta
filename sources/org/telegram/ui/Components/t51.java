package org.telegram.ui.Components;

import android.os.Process;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t51 implements Runnable {
    public final int f32870a;
    public final Object f32871b;

    public t51(Object obj, int i10) {
        this.f32870a = i10;
        this.f32871b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f32870a;
        gb1 gb1Var = null;
        Object obj = this.f32871b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.vk) obj).f34968c.presentFragment(new org.telegram.ui.a31());
                return;
            case 1:
                ((b61) obj).requestLayout();
                return;
            case 2:
                ((s61) obj).f();
                return;
            case 3:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.f26349i0;
                undoView.getClass();
                try {
                    undoView.f26358f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((v71) obj).invalidateSelf();
                return;
            case 5:
                e00 e00Var = ((i81) obj).f29238b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    return;
                }
                return;
            case 6:
                t81 t81Var = (t81) obj;
                i2.j0 j0Var = t81Var.d;
                if (j0Var != null) {
                    TextureView textureView = t81Var.f32897n;
                    j0Var.F1();
                    if (textureView != null && textureView == j0Var.X) {
                        j0Var.F1();
                        j0Var.s1();
                        j0Var.x1(null);
                        j0Var.q1(0, 0);
                    }
                    t81Var.d.z1(t81Var.f32897n);
                    ArrayList arrayList = t81Var.N;
                    if (arrayList != null) {
                        t81Var.F(arrayList, t81Var.O);
                    } else if (t81Var.U) {
                        t81Var.G(t81Var.Q, t81Var.S, t81Var.R, t81Var.T);
                    } else {
                        t81Var.D(t81Var.Q, t81Var.S);
                    }
                    t81Var.C();
                    return;
                }
                return;
            case 7:
                t81 t81Var2 = ((s81) obj).f32516f;
                t81Var2.f32885a0.removeCallbacksAndMessages(null);
                t81Var2.K.onVisualizerUpdate(false, true, null);
                return;
            case 8:
                ((v81) obj).f33612g = false;
                return;
            case 9:
                ((na1) ((v50) ((org.telegram.ui.Cells.ha) obj).f24216b).f33565b).v.b();
                return;
            case 10:
                ((ja1) obj).d(false, true);
                return;
            case 11:
                gb1 gb1Var2 = (gb1) obj;
                gb1Var2.getClass();
                jb1.a(gb1Var2);
                return;
            case 12:
                ib1 ib1Var = (ib1) obj;
                int i12 = ib1Var.f29295a;
                Iterator it = jb1.f29624a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        gb1 gb1Var3 = (gb1) it.next();
                        if (gb1Var3.f28512b == i12 && gb1Var3.f28519l == ib1Var.f29296b && !gb1Var3.f28518k && gb1Var3.f28529w > 0) {
                            gb1Var = gb1Var3;
                        }
                    }
                }
                if (gb1Var == null) {
                    jb1.y();
                    return;
                }
                TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData = new TLRPC.TL_messages_getWidgetPublicData();
                tL_messages_getWidgetPublicData.peer = MessagesController.getInstance(gb1Var.f28512b).getInputPeer(gb1Var.f28513c);
                tL_messages_getWidgetPublicData.msg_id = gb1Var.d;
                tL_messages_getWidgetPublicData.hash = ib1Var.f29297c;
                ib1Var.e = ConnectionsManager.getInstance(i12).sendRequestTyped(tL_messages_getWidgetPublicData, new Object(), new d(ib1Var, 23));
                return;
            default:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                return;
        }
    }
}
