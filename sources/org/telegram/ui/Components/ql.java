package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ql extends f2.n0 {
    public final jh.k f31985r;

    public ql(jh.k kVar, Context context) {
        super(context);
        this.f31985r = kVar;
    }

    @Override
    public final int k(int i9, View view) {
        int topScrollOffset;
        int k10 = super.k(i9, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f31985r.R;
        int paddingTop = chatAttachAlertPhotoLayout.A.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i9) {
        return super.m(i9) * 2;
    }
}
