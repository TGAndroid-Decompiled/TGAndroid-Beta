package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class xl extends org.telegram.ui.pt0 {
    public final ChatAttachAlertPhotoLayout f34774a;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f34774a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f26254o1.size();
    }

    @Override
    public final boolean N() {
        ni niVar = this.f34774a.f28403b;
        if (niVar != null && niVar.f31001e0) {
            return true;
        }
        return false;
    }

    @Override
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        MediaController.PhotoEntry b02 = this.f34774a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f26255p1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f26255p1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34774a;
        ol olVar = chatAttachAlertPhotoLayout.f26285r;
        ol olVar2 = chatAttachAlertPhotoLayout.A;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        if (niVar.O1 < 0 || ChatAttachAlertPhotoLayout.f26254o1.size() < niVar.O1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f26252m1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f26254o1.size() + 1 <= ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.f26255p1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = olVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = olVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.r5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((niVar.f30990b0 instanceof org.telegram.ui.tn) && niVar.P1) {
                                ((org.telegram.ui.Cells.r5) childAt).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.r5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = olVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = olVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.r5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((niVar.f30990b0 instanceof org.telegram.ui.tn) && niVar.P1) {
                                ((org.telegram.ui.Cells.r5) childAt2).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.r5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i13++;
                        }
                    }
                    if (!z10) {
                        i11 = 2;
                    }
                    niVar.V1(i11);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        this.f34774a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f26254o1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        MediaController.PhotoEntry b02 = this.f34774a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f26254o1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
