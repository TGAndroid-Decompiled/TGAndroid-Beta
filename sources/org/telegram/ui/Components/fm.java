package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class fm extends org.telegram.ui.lu0 {
    public final ChatAttachAlertPhotoLayout f24315a;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f24315a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f22144s1.size();
    }

    @Override
    public final boolean N() {
        xi xiVar = this.f24315a.f27362b;
        if (xiVar != null && xiVar.f30279i0) {
            return true;
        }
        return false;
    }

    @Override
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f22142q1;
        MediaController.PhotoEntry b02 = this.f24315a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f22145t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f22145t1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24315a;
        wl wlVar = chatAttachAlertPhotoLayout.f22179r;
        wl wlVar2 = chatAttachAlertPhotoLayout.E;
        xi xiVar = chatAttachAlertPhotoLayout.f27362b;
        if (xiVar.S1 < 0 || ChatAttachAlertPhotoLayout.f22144s1.size() < xiVar.S1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f22142q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f22144s1.size() + 1 <= ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.f22145t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = wlVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = wlVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((xiVar.f30270f0 instanceof org.telegram.ui.wn) && xiVar.T1) {
                                ((org.telegram.ui.Cells.t5) childAt).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.t5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = wlVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = wlVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((xiVar.f30270f0 instanceof org.telegram.ui.wn) && xiVar.T1) {
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
                    xiVar.V1(i11);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22142q1;
        this.f24315a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f22144s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f22142q1;
        MediaController.PhotoEntry b02 = this.f24315a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f22144s1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
