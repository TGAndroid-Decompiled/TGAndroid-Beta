package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class tl extends org.telegram.ui.rt0 {
    public final ChatAttachAlertPhotoLayout f32718a;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f32718a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f26243o1.size();
    }

    @Override
    public final boolean N() {
        ki kiVar = this.f32718a.f27493b;
        if (kiVar != null && kiVar.f30110e0) {
            return true;
        }
        return false;
    }

    @Override
    public final int R(int i9) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        MediaController.PhotoEntry a02 = this.f32718a.a0(i9);
        if (a02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f26244p1.indexOf(Integer.valueOf(a02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f26244p1;
    }

    @Override
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32718a;
        kl klVar = chatAttachAlertPhotoLayout.f26274r;
        kl klVar2 = chatAttachAlertPhotoLayout.A;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        if (kiVar.O1 < 0 || ChatAttachAlertPhotoLayout.f26243o1.size() < kiVar.O1 || x(i9)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
            MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(i9);
            if (a02 != null && !chatAttachAlertPhotoLayout.W(a02)) {
                int i10 = 1;
                if (ChatAttachAlertPhotoLayout.f26243o1.size() + 1 <= ChatAttachAlertPhotoLayout.M(chatAttachAlertPhotoLayout)) {
                    int P = chatAttachAlertPhotoLayout.P(a02, -1);
                    if (P == -1) {
                        P = ChatAttachAlertPhotoLayout.f26244p1.indexOf(Integer.valueOf(a02.imageId));
                        z10 = true;
                    } else {
                        a02.editedInfo = null;
                        z10 = false;
                    }
                    a02.editedInfo = videoEditedInfo;
                    int childCount = klVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = klVar2.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt.getTag()).intValue() == i9) {
                            if ((kiVar.f30099b0 instanceof org.telegram.ui.qn) && kiVar.P1) {
                                ((org.telegram.ui.Cells.t5) childAt).b(P, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.t5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i11++;
                        }
                    }
                    int childCount2 = klVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = klVar.getChildAt(i12);
                        if ((childAt2 instanceof org.telegram.ui.Cells.t5) && ((Integer) childAt2.getTag()).intValue() == i9) {
                            if ((kiVar.f30099b0 instanceof org.telegram.ui.qn) && kiVar.P1) {
                                ((org.telegram.ui.Cells.t5) childAt2).b(P, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.t5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        i10 = 2;
                    }
                    kiVar.V1(i10);
                    return P;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        this.f32718a.u0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f26243o1;
    }

    @Override
    public final boolean x(int i9) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        MediaController.PhotoEntry a02 = this.f32718a.a0(i9);
        if (a02 != null && ChatAttachAlertPhotoLayout.f26243o1.containsKey(Integer.valueOf(a02.imageId))) {
            return true;
        }
        return false;
    }
}
