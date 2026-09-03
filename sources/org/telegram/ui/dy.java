package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dy implements org.telegram.ui.Components.x40 {
    public final py f36284a;

    public dy(py pyVar) {
        this.f36284a = pyVar;
    }

    @Override
    public final void D(float f10) {
        org.telegram.ui.Components.ic icVar = this.f36284a.f40159b4;
        if (icVar != null) {
            ((org.telegram.ui.Components.zb) icVar.f27774e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        py pyVar = this.f36284a;
        org.telegram.ui.Components.ic icVar = pyVar.f40159b4;
        if (icVar != null) {
            icVar.b();
            pyVar.f40159b4 = null;
        }
        Activity parentActivity = pyVar.getParentActivity();
        g6Var = ((org.telegram.ui.ActionBar.p2) pyVar).resourceProvider;
        ?? ebVar = new org.telegram.ui.Components.eb(parentActivity, g6Var);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(ebVar, parentActivity);
        ebVar.f33894b = ybVar;
        ybVar.setWillNotDraw(false);
        ebVar.addView(ybVar, k7.c6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
        ebVar.f33895c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ybVar.addView(p9Var, k7.c6.e(28, 28, 17));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(parentActivity, false, false, false);
        ebVar.d = k6Var;
        k6Var.setTypeface(Typeface.SANS_SERIF);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ebVar.addView(k6Var, k7.c6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        ebVar.setTextColor(ebVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        ebVar.setBackground(ebVar.getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        if (z4) {
            p9Var.setImageBitmap(pyVar.Y3.f33315r);
        } else {
            p9Var.setImageBitmap(PhotoViewer.t1().z4.getBitmap());
        }
        Activity parentActivity2 = pyVar.getParentActivity();
        g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar).resourceProvider;
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(parentActivity2, g6Var2, true);
        gcVar.e(LocaleController.getString(R.string.ViewAction));
        gcVar.f27139a = new zi(this, 25);
        ebVar.setButton(gcVar);
        ebVar.getButton().setVisibility(8);
        if (z10) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        k6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.ic b10 = org.telegram.ui.Components.qc.a0(pyVar).b(ebVar, -1);
        pyVar.f40159b4 = b10;
        b10.f27786r = false;
        b10.i(false);
        org.telegram.ui.Components.ic icVar2 = pyVar.f40159b4;
        icVar2.f27787s = true;
        icVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                dy dyVar = dy.this;
                py pyVar = dyVar.f36284a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    pyVar.Z3 = photoSize2.location;
                    pyVar.f40153a4 = photoSize.location;
                } else if (pyVar.Z3 == null) {
                    return;
                } else {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    pyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new mh.k7(dyVar, str, z4, 3));
                }
                kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final qu0 getCloseIntoObject() {
        py pyVar = this.f36284a;
        org.telegram.ui.Components.ic icVar = pyVar.f40159b4;
        if (icVar != null) {
            org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) icVar.f27774e;
            qu0 qu0Var = new qu0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.p9 p9Var = zbVar.f33895c;
            org.telegram.ui.Components.p9 p9Var2 = zbVar.f33895c;
            p9Var.getLocationInWindow(iArr);
            qu0Var.f40679b = iArr[0];
            qu0Var.f40680c = iArr[1];
            qu0Var.d = pyVar.fragmentView;
            ImageReceiver imageReceiver = p9Var2.getImageReceiver();
            qu0Var.f40678a = imageReceiver;
            qu0Var.f40681e = imageReceiver.getBitmapSafe();
            qu0Var.f40684i = 0;
            qu0Var.h = qu0Var.f40678a.getRoundRadius();
            qu0Var.f40686k = p9Var2.getScaleX();
            return qu0Var;
        }
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final void P() {
    }
}
