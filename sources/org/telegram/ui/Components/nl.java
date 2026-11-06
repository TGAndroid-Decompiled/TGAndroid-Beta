package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class nl extends v4.c0 {
    public final ei.h f36434r;

    public nl(ei.h hVar, Context context) {
        super(context);
        this.f36434r = hVar;
    }

    @Override
    public final int k(int i7, View view) {
        int topScrollOffset;
        int k10 = super.k(i7, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f36434r.R;
        int paddingTop = chatAttachAlertPhotoLayout.E.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
