package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class vl extends f2.j0 {
    public final oh.k f29504r;

    public vl(oh.k kVar, Context context) {
        super(context);
        this.f29504r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k10 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f29504r.R;
        int paddingTop = chatAttachAlertPhotoLayout.B.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k10 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
