package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class mt0 extends eg.c1 {
    public final PhotoViewer f39068l2;

    public mt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, tq0 tq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, tq0Var, g6Var);
        this.f39068l2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        qh.h3 h3Var = this.f39068l2.H1;
        if (h3Var != null) {
            return h3Var.f45400l;
        }
        return 0;
    }
}
