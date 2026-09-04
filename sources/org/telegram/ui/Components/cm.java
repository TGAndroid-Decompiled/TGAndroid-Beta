package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class cm extends org.telegram.ui.su0 {
    public final ChatAttachAlertPhotoLayout f25028a;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f25028a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f23833s1.size();
    }

    @Override
    public final boolean N() {
        vi viVar = this.f25028a.f28753b;
        if (viVar != null && viVar.f31288i0) {
            return true;
        }
        return false;
    }

    @Override
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23831q1;
        MediaController.PhotoEntry b02 = this.f25028a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f23834t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f23834t1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25028a;
        tl tlVar = chatAttachAlertPhotoLayout.f23868r;
        tl tlVar2 = chatAttachAlertPhotoLayout.E;
        vi viVar = chatAttachAlertPhotoLayout.f28753b;
        if (viVar.S1 < 0 || ChatAttachAlertPhotoLayout.f23833s1.size() < viVar.S1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f23831q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f23833s1.size() + 1 <= ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.f23834t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = tlVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = tlVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.s5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((viVar.f31279f0 instanceof org.telegram.ui.co) && viVar.T1) {
                                ((org.telegram.ui.Cells.s5) childAt).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.s5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = tlVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = tlVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.s5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((viVar.f31279f0 instanceof org.telegram.ui.co) && viVar.T1) {
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
                    viVar.V1(i11);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23831q1;
        this.f25028a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f23833s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f23831q1;
        MediaController.PhotoEntry b02 = this.f25028a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f23833s1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
