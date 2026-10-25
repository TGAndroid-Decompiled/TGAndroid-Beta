package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class om extends org.telegram.ui.gu0 {
    public final ChatAttachAlertPhotoLayout f31324a;

    public om(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f31324a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f26015s1.size();
    }

    @Override
    public final boolean O() {
        ti tiVar = this.f31324a.f30213b;
        if (tiVar != null && tiVar.f33027i0) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26013q1;
        MediaController.PhotoEntry b02 = this.f31324a.b0(i10);
        if (b02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f26016t1.indexOf(Integer.valueOf(b02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f26016t1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31324a;
        fm fmVar = chatAttachAlertPhotoLayout.f26050r;
        fm fmVar2 = chatAttachAlertPhotoLayout.E;
        ti tiVar = chatAttachAlertPhotoLayout.f30213b;
        if (tiVar.V1 < 0 || ChatAttachAlertPhotoLayout.f26015s1.size() < tiVar.V1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f26013q1;
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null && !chatAttachAlertPhotoLayout.X(b02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f26015s1.size() + 1 <= ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                    int Q = chatAttachAlertPhotoLayout.Q(b02, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.f26016t1.indexOf(Integer.valueOf(b02.imageId));
                        z10 = true;
                    } else {
                        b02.editedInfo = null;
                        z10 = false;
                    }
                    b02.editedInfo = videoEditedInfo;
                    int childCount = fmVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = fmVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.x5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((tiVar.f33018f0 instanceof org.telegram.ui.un) && tiVar.W1) {
                                ((org.telegram.ui.Cells.x5) childAt).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.x5) childAt).b(-1, z10, false);
                            }
                        } else {
                            i12++;
                        }
                    }
                    int childCount2 = fmVar.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount2) {
                            break;
                        }
                        View childAt2 = fmVar.getChildAt(i13);
                        if ((childAt2 instanceof org.telegram.ui.Cells.x5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if ((tiVar.f33018f0 instanceof org.telegram.ui.un) && tiVar.W1) {
                                ((org.telegram.ui.Cells.x5) childAt2).b(Q, z10, false);
                            } else {
                                ((org.telegram.ui.Cells.x5) childAt2).b(-1, z10, false);
                            }
                        } else {
                            i13++;
                        }
                    }
                    if (!z10) {
                        i11 = 2;
                    }
                    tiVar.c2(i11);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26013q1;
        this.f31324a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f26015s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26013q1;
        MediaController.PhotoEntry b02 = this.f31324a.b0(i10);
        if (b02 != null && ChatAttachAlertPhotoLayout.f26015s1.containsKey(Integer.valueOf(b02.imageId))) {
            return true;
        }
        return false;
    }
}
