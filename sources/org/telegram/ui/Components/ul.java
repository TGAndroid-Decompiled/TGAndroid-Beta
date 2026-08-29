package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ul extends f2.k0 {
    public final mh.k f33254r;

    public ul(mh.k kVar, Context context) {
        super(context);
        this.f33254r = kVar;
    }

    @Override
    public final int k(int i10, View view) {
        int topScrollOffset;
        int k9 = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f33254r.R;
        int paddingTop = chatAttachAlertPhotoLayout.A.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k9 - (paddingTop - topScrollOffset);
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
