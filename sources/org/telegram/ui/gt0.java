package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class gt0 extends rg.m0 {
    public final PhotoViewer f37417o2;

    public gt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, qq0 qq0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, qq0Var, d6Var);
        this.f37417o2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        ei.b4 b4Var = this.f37417o2.K1;
        if (b4Var != null) {
            return b4Var.f8784l;
        }
        return 0;
    }
}
