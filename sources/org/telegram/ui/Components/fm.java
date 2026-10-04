package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class fm extends org.telegram.ui.ou0 {
    public final ChatAttachAlertPhotoLayout f26513a;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f26513a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f24020s1.size();
    }

    @Override
    public final boolean N() {
        xi xiVar = this.f26513a.f29643b;
        if (xiVar != null && xiVar.f32822i0) {
            return true;
        }
        return false;
    }

    @Override
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24018q1;
        MediaController.PhotoEntry b02 = this.f26513a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f24021t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f24021t1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26513a;
        wl wlVar = chatAttachAlertPhotoLayout.f24055r;
        wl wlVar2 = chatAttachAlertPhotoLayout.E;
        xi xiVar = chatAttachAlertPhotoLayout.f29643b;
        if (xiVar.S1 < 0 || ChatAttachAlertPhotoLayout.f24020s1.size() < xiVar.S1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f24018q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.W(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f24020s1.size() + 1 <= ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout)) {
                    int O = chatAttachAlertPhotoLayout.O(b02, -1);
                    if (O == -1) {
                        O = ChatAttachAlertPhotoLayout.f24021t1.indexOf(Integer.valueOf(b02.imageId));
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
                            if ((xiVar.f32813f0 instanceof org.telegram.ui.yn) && xiVar.T1) {
                                ((org.telegram.ui.Cells.t5) childAt).b(O, z10, false);
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
                            if ((xiVar.f32813f0 instanceof org.telegram.ui.yn) && xiVar.T1) {
                                ((org.telegram.ui.Cells.t5) childAt2).b(O, z10, false);
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
                    xiVar.S1(i11);
                    return O;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24018q1;
        this.f26513a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f24020s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f24018q1;
        MediaController.PhotoEntry b02 = this.f26513a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f24020s1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
