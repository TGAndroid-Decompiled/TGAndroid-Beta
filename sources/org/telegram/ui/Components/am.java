package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class am extends org.telegram.ui.au0 {
    public final ChatAttachAlertPhotoLayout f25291a;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f25291a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f24738p1.size();
    }

    @Override
    public final boolean N() {
        mi miVar = this.f25291a.f26546b;
        if (miVar != null && miVar.f29051f0) {
            return true;
        }
        return false;
    }

    @Override
    public final int R(int i10) {
        boolean z4 = ChatAttachAlertPhotoLayout.f24736n1;
        MediaController.PhotoEntry b02 = this.f25291a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f24739q1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f24739q1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z4;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25291a;
        ql qlVar = chatAttachAlertPhotoLayout.f24770r;
        ql qlVar2 = chatAttachAlertPhotoLayout.B;
        mi miVar = chatAttachAlertPhotoLayout.f26546b;
        if (miVar.P1 < 0 || ChatAttachAlertPhotoLayout.f24738p1.size() < miVar.P1 || x(i10)) {
            boolean z10 = ChatAttachAlertPhotoLayout.f24736n1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f24738p1.size() + 1 <= ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.f24739q1.indexOf(Integer.valueOf(b02.imageId));
                        z4 = true;
                    } else {
                        b02.editedInfo = null;
                        z4 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = qlVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = qlVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((miVar.f29040c0 instanceof org.telegram.ui.xn) && miVar.Q1) {
                                ((org.telegram.ui.Cells.t5) childAt).b(Q, z4, false);
                            } else {
                                ((org.telegram.ui.Cells.t5) childAt).b(-1, z4, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = qlVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = qlVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((miVar.f29040c0 instanceof org.telegram.ui.xn) && miVar.Q1) {
                                ((org.telegram.ui.Cells.t5) childAt2).b(Q, z4, false);
                            } else {
                                ((org.telegram.ui.Cells.t5) childAt2).b(-1, z4, false);
                            }
                        } else {
                            i13++;
                        }
                    }
                    if (!z4) {
                        i11 = 2;
                    }
                    miVar.V1(i11);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z4 = ChatAttachAlertPhotoLayout.f24736n1;
        this.f25291a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f24738p1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z4 = ChatAttachAlertPhotoLayout.f24736n1;
        MediaController.PhotoEntry b02 = this.f25291a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f24738p1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
