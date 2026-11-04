package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ml extends u4.c0 {
    public final fi.g f36184r;

    public ml(fi.g gVar, Context context) {
        super(context);
        this.f36184r = gVar;
    }

    @Override
    public final int k(int i3, View view) {
        int topScrollOffset;
        int k10 = super.k(i3, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f36184r.R;
        int paddingTop = chatAttachAlertPhotoLayout.F.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
