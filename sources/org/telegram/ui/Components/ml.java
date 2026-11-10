package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ml extends v4.c0 {
    public final ei.h f35990r;

    public ml(ei.h hVar, Context context) {
        super(context);
        this.f35990r = hVar;
    }

    @Override
    public final int k(int i7, View view) {
        int topScrollOffset;
        int k10 = super.k(i7, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f35990r.R;
        int paddingTop = chatAttachAlertPhotoLayout.E.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
