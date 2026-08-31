package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ht0 extends eg.c1 {
    public final PhotoViewer f37617l2;

    public ht0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, oq0 oq0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, oq0Var, g6Var);
        this.f37617l2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        qh.i3 i3Var = this.f37617l2.H1;
        if (i3Var != null) {
            return i3Var.f45418l;
        }
        return 0;
    }
}
