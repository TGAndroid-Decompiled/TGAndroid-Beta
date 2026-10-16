package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class mm extends s4.c0 {
    public final ci.k f27122r;

    public mm(ci.k kVar, Context context) {
        super(context);
        this.f27122r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f27122r.R;
        int paddingTop = chatAttachAlertPhotoLayout.E.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
