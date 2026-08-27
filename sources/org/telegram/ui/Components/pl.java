package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;

public abstract class pl extends org.telegram.ui.st0 {

    public final ChatAttachAlertPhotoLayout f31626a;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f31626a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int H() {
        return ChatAttachAlertPhotoLayout.f26239o1.size();
    }

    @Override
    public final boolean N() {
        gi giVar = this.f31626a.f34900b;
        return giVar != null && giVar.f28646e0;
    }

    @Override
    public final int R(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        MediaController.PhotoEntry photoEntryB0 = this.f31626a.b0(i10);
        if (photoEntryB0 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.f26240p1.indexOf(Integer.valueOf(photoEntryB0.imageId));
    }

    @Override
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.f26240p1;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31626a;
        gl glVar = chatAttachAlertPhotoLayout.f26270r;
        gl glVar2 = chatAttachAlertPhotoLayout.A;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (giVar.O1 < 0 || ChatAttachAlertPhotoLayout.f26239o1.size() < giVar.O1 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
            MediaController.PhotoEntry photoEntryB0 = chatAttachAlertPhotoLayout.b0(i10);
            if (photoEntryB0 != null && !chatAttachAlertPhotoLayout.X(photoEntryB0)) {
                if (ChatAttachAlertPhotoLayout.f26239o1.size() + 1 <= ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout)) {
                    int iQ = chatAttachAlertPhotoLayout.Q(photoEntryB0, -1);
                    if (iQ == -1) {
                        iQ = ChatAttachAlertPhotoLayout.f26240p1.indexOf(Integer.valueOf(photoEntryB0.imageId));
                        z10 = true;
                    } else {
                        photoEntryB0.editedInfo = null;
                        z10 = false;
                    }
                    photoEntryB0.editedInfo = videoEditedInfo;
                    int childCount = glVar2.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = glVar2.getChildAt(i11);
                        if ((childAt instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt.getTag()).intValue() == i10) {
                            if (!(giVar.f28635b0 instanceof org.telegram.ui.rn) || !giVar.P1) {
                                ((org.telegram.ui.Cells.q5) childAt).b(-1, z10, false);
                                break;
                            }
                            ((org.telegram.ui.Cells.q5) childAt).b(iQ, z10, false);
                            break;
                        }
                    }
                    int childCount2 = glVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = glVar.getChildAt(i12);
                        if ((childAt2 instanceof org.telegram.ui.Cells.q5) && ((Integer) childAt2.getTag()).intValue() == i10) {
                            if (!(giVar.f28635b0 instanceof org.telegram.ui.rn) || !giVar.P1) {
                                ((org.telegram.ui.Cells.q5) childAt2).b(-1, z10, false);
                                break;
                            }
                            ((org.telegram.ui.Cells.q5) childAt2).b(iQ, z10, false);
                            break;
                        }
                    }
                    giVar.V1(z10 ? 1 : 2);
                    return iQ;
                }
            }
        }
        return -1;
    }

    @Override
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        this.f31626a.v0();
    }

    @Override
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.f26239o1;
    }

    @Override
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        MediaController.PhotoEntry photoEntryB0 = this.f31626a.b0(i10);
        return photoEntryB0 != null && ChatAttachAlertPhotoLayout.f26239o1.containsKey(Integer.valueOf(photoEntryB0.imageId));
    }
}
