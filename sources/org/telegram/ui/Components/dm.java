package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dm extends v4.c0 {
    public final gi.g f34487r;

    public dm(gi.g gVar, Context context) {
        super(context);
        this.f34487r = gVar;
    }

    @Override
    public final int k(int i7, View view) {
        int topScrollOffset;
        int k10 = super.k(i7, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f34487r.R;
        int paddingTop = chatAttachAlertPhotoLayout.F.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
