package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public abstract class om extends org.telegram.ui.iu0 {
    public final ChatAttachAlertPhotoLayout f31342a;

    public om(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f31342a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f26019s1.size();
    }

    @Override
    public final boolean O() {
        ti tiVar = this.f31342a.f30254b;
        if (tiVar != null && tiVar.f32999i0) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26017q1;
        MediaController.PhotoEntry c02 = this.f31342a.c0(i10);
        if (c02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f26020t1.indexOf(Integer.valueOf(c02.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f26020t1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31342a;
        fm fmVar = chatAttachAlertPhotoLayout.f26054r;
        fm fmVar2 = chatAttachAlertPhotoLayout.E;
        ti tiVar = chatAttachAlertPhotoLayout.f30254b;
        if (tiVar.V1 < 0 || ChatAttachAlertPhotoLayout.f26019s1.size() < tiVar.V1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f26017q1;
            MediaController.PhotoEntry c02 = chatAttachAlertPhotoLayout.c0(i10);
            if (c02 != null && !chatAttachAlertPhotoLayout.Y(c02)) {
                int i11 = 1;
                if (ChatAttachAlertPhotoLayout.f26019s1.size() + 1 <= ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                    int R = chatAttachAlertPhotoLayout.R(c02, -1);
                    if (R == -1) {
                        R = ChatAttachAlertPhotoLayout.f26020t1.indexOf(Integer.valueOf(c02.imageId));
                        z10 = true;
                    } else {
                        c02.editedInfo = null;
                        z10 = false;
                    }
                    c02.editedInfo = videoEditedInfo;
                    int childCount = fmVar2.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount) {
                            break;
                        }
                        View childAt = fmVar2.getChildAt(i12);
                        if ((childAt instanceof org.telegram.ui.Cells.x5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if ((tiVar.f32990f0 instanceof org.telegram.ui.wn) && tiVar.W1) {
                                ((org.telegram.ui.Cells.x5) childAt).b(R, z10, false);
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
                            if ((tiVar.f32990f0 instanceof org.telegram.ui.wn) && tiVar.W1) {
                                ((org.telegram.ui.Cells.x5) childAt2).b(R, z10, false);
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
                    tiVar.d2(i11);
                    return R;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26017q1;
        this.f31342a.w0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f26019s1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26017q1;
        MediaController.PhotoEntry c02 = this.f31342a.c0(i10);
        if (c02 != null && ChatAttachAlertPhotoLayout.f26019s1.containsKey(Integer.valueOf(c02.imageId))) {
            return true;
        }
        return false;
    }
}
