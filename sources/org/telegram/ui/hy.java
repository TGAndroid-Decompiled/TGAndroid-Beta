package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hy implements org.telegram.ui.Components.x40 {
    public final uy f37189a;

    public hy(uy uyVar) {
        this.f37189a = uyVar;
    }

    @Override
    public final void B(float f7) {
        org.telegram.ui.Components.rc rcVar = this.f37189a.f41391d4;
        if (rcVar != null) {
            ((org.telegram.ui.Components.ic) rcVar.f30335e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void I(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        uy uyVar = this.f37189a;
        org.telegram.ui.Components.rc rcVar = uyVar.f41391d4;
        if (rcVar != null) {
            rcVar.b();
            uyVar.f41391d4 = null;
        }
        Activity parentActivity = uyVar.getParentActivity();
        d6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        ?? obVar = new org.telegram.ui.Components.ob(parentActivity, d6Var);
        org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(obVar, parentActivity);
        obVar.f27353b = hcVar;
        hcVar.setWillNotDraw(false);
        obVar.addView(hcVar, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
        obVar.f27354c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        hcVar.addView(w9Var, w7.z5.e(28, 28, 17));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(parentActivity, false, false, false);
        obVar.d = p6Var;
        p6Var.setTypeface(Typeface.SANS_SERIF);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        obVar.addView(p6Var, w7.z5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        obVar.setTextColor(obVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        obVar.setBackground(obVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        if (z10) {
            w9Var.setImageBitmap(uyVar.f41374a4.f33048r);
        } else {
            w9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = uyVar.getParentActivity();
        d6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(parentActivity2, d6Var2, true);
        pcVar.e(LocaleController.getString(R.string.ViewAction));
        pcVar.f29595a = new bj(this, 23);
        obVar.setButton(pcVar);
        obVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        p6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.rc b10 = org.telegram.ui.Components.yc.a0(uyVar).b(obVar, -1);
        uyVar.f41391d4 = b10;
        b10.f30347r = false;
        b10.i(false);
        org.telegram.ui.Components.rc rcVar2 = uyVar.f41391d4;
        rcVar2.f30348s = true;
        rcVar2.j();
    }

    @Override
    public final void O(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                hy hyVar = hy.this;
                uy uyVar = hyVar.f37189a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    uyVar.f41380b4 = photoSize2.location;
                    uyVar.f41386c4 = photoSize.location;
                } else if (uyVar.f41380b4 == null) {
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
                    uyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.v1(hyVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final yu0 getCloseIntoObject() {
        uy uyVar = this.f37189a;
        org.telegram.ui.Components.rc rcVar = uyVar.f41391d4;
        if (rcVar != null) {
            org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) rcVar.f30335e;
            yu0 yu0Var = new yu0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.w9 w9Var = icVar.f27354c;
            org.telegram.ui.Components.w9 w9Var2 = icVar.f27354c;
            w9Var.getLocationInWindow(iArr);
            yu0Var.f43621b = iArr[0];
            yu0Var.f43622c = iArr[1];
            yu0Var.d = uyVar.fragmentView;
            ImageReceiver imageReceiver = w9Var2.getImageReceiver();
            yu0Var.f43620a = imageReceiver;
            yu0Var.f43623e = imageReceiver.getBitmapSafe();
            yu0Var.f43626i = 0;
            yu0Var.h = yu0Var.f43620a.getRoundRadius();
            yu0Var.f43628k = w9Var2.getScaleX();
            return yu0Var;
        }
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final void N() {
    }
}
