package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class nm extends org.telegram.ui.bu0 {
    public final ChatAttachAlertPhotoLayout f28794a;

    public nm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f28794a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f24075s1.size();
    }

    @Override
    public final boolean O() {
        ti tiVar = this.f28794a.f28238b;
        if (tiVar != null && tiVar.f30583i0) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24073q1;
        MediaController.PhotoEntry b02 = this.f28794a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f24076t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f24076t1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28794a;
        em emVar = chatAttachAlertPhotoLayout.f24110r;
        em emVar2 = chatAttachAlertPhotoLayout.E;
        ti tiVar = chatAttachAlertPhotoLayout.f28238b;
        if (tiVar.V1 < 0 || ChatAttachAlertPhotoLayout.f24075s1.size() < tiVar.V1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f24073q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f24075s1.size() + 1 <= ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.f24076t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = emVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = emVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.s5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((tiVar.f30574f0 instanceof org.telegram.ui.sn) && tiVar.W1) {
                                ((org.telegram.ui.Cells.s5) childAt).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.s5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = emVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = emVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.s5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((tiVar.f30574f0 instanceof org.telegram.ui.sn) && tiVar.W1) {
                                ((org.telegram.ui.Cells.s5) childAt2).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.s5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i13++;
                        }
                    }
                    if (!z10) {
                        i11 = 2;
                    }
                    tiVar.Z1(i11);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24073q1;
        this.f28794a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f24075s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24073q1;
        MediaController.PhotoEntry b02 = this.f28794a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f24075s1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
