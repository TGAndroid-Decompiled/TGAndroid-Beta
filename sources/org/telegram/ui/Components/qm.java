package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class qm extends org.telegram.ui.av0 {
    public final ChatAttachAlertPhotoLayout f28644a;

    public qm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f28644a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f23020s1.size();
    }

    @Override
    public final boolean N() {
        vi viVar = this.f28644a.f27671b;
        if (viVar != null && viVar.f30010i0) {
            return true;
        }
        return false;
    }

    @Override
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        MediaController.PhotoEntry b02 = this.f28644a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f23021t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f23021t1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28644a;
        hm hmVar = chatAttachAlertPhotoLayout.f23055r;
        hm hmVar2 = chatAttachAlertPhotoLayout.E;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        if (viVar.V1 < 0 || ChatAttachAlertPhotoLayout.f23020s1.size() < viVar.V1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f23018q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f23020s1.size() + 1 <= ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.f23021t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = hmVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = hmVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((viVar.f30001f0 instanceof org.telegram.ui.fo) && viVar.W1) {
                                ((org.telegram.ui.Cells.t5) childAt).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.t5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = hmVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = hmVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((viVar.f30001f0 instanceof org.telegram.ui.fo) && viVar.W1) {
                                ((org.telegram.ui.Cells.t5) childAt2).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.t5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i13++;
                        }
                    }
                    if (!z10) {
                        i11 = 2;
                    }
                    viVar.Z1(i11);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        this.f28644a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f23020s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        MediaController.PhotoEntry b02 = this.f28644a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f23020s1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
