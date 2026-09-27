package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class em extends org.telegram.ui.ou0 {
    public final ChatAttachAlertPhotoLayout f24088a;

    public em(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f24088a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f22125s1.size();
    }

    @Override
    public final boolean N() {
        wi wiVar = this.f24088a.f27104b;
        if (wiVar != null && wiVar.f29971i0) {
            return true;
        }
        return false;
    }

    @Override
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f22123q1;
        MediaController.PhotoEntry b02 = this.f24088a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f22126t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f22126t1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24088a;
        vl vlVar = chatAttachAlertPhotoLayout.f22160r;
        vl vlVar2 = chatAttachAlertPhotoLayout.E;
        wi wiVar = chatAttachAlertPhotoLayout.f27104b;
        if (wiVar.S1 < 0 || ChatAttachAlertPhotoLayout.f22125s1.size() < wiVar.S1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f22123q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f22125s1.size() + 1 <= ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.f22126t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = vlVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = vlVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((wiVar.f29962f0 instanceof org.telegram.ui.xn) && wiVar.T1) {
                                ((org.telegram.ui.Cells.t5) childAt).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.t5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = vlVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = vlVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((wiVar.f29962f0 instanceof org.telegram.ui.xn) && wiVar.T1) {
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
                    wiVar.S1(i11);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22123q1;
        this.f24088a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f22125s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f22123q1;
        MediaController.PhotoEntry b02 = this.f24088a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f22125s1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
