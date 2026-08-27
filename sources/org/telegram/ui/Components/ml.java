package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

public final class ml extends f2.l0 {

    public final kh.l f30696r;

    public ml(kh.l lVar, Context context) {
        super(context);
        this.f30696r = lVar;
    }

    @Override
    public final int k(int i10, View view) {
        int iK = super.k(i10, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f30696r.R;
        return iK - (chatAttachAlertPhotoLayout.A.getPaddingTop() - chatAttachAlertPhotoLayout.getTopScrollOffset());
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
