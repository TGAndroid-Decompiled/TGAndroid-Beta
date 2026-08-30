package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wl extends f2.j0 {
    public final oh.k f30385r;

    public wl(oh.k kVar, Context context) {
        super(context);
        this.f30385r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f30385r.R;
        int paddingTop = chatAttachAlertPhotoLayout.B.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
