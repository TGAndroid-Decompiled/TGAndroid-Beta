package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class cu0 extends qg.m0 {
    public final PhotoViewer f36519o2;

    public cu0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, kr0 kr0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, kr0Var, c6Var);
        this.f36519o2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        ci.h4 h4Var = this.f36519o2.K1;
        if (h4Var != null) {
            return h4Var.f5165l;
        }
        return 0;
    }
}
