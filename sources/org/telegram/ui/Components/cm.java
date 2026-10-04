package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class cm extends s4.d0 {
    public final bi.l f25421r;

    public cm(bi.l lVar, Context context) {
        super(context);
        this.f25421r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f25421r.R;
        int paddingTop = chatAttachAlertPhotoLayout.E.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
