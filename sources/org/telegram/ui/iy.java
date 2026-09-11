package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iy implements org.telegram.ui.Components.t40 {
    public final uy f37453a;

    public iy(uy uyVar) {
        this.f37453a = uyVar;
    }

    @Override
    public final void C(float f7) {
        org.telegram.ui.Components.qc qcVar = this.f37453a.f41263e4;
        if (qcVar != null) {
            ((org.telegram.ui.Components.hc) qcVar.f29675e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        uy uyVar = this.f37453a;
        org.telegram.ui.Components.qc qcVar = uyVar.f41263e4;
        if (qcVar != null) {
            qcVar.b();
            uyVar.f41263e4 = null;
        }
        Activity parentActivity = uyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        ?? nbVar = new org.telegram.ui.Components.nb(parentActivity, f6Var);
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(nbVar, parentActivity);
        nbVar.f26702b = gcVar;
        gcVar.setWillNotDraw(false);
        nbVar.addView(gcVar, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(parentActivity);
        nbVar.f26703c = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        gcVar.addView(x9Var, w7.x5.e(28, 28, 17));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(parentActivity, false, false, false);
        nbVar.d = q6Var;
        q6Var.setTypeface(Typeface.SANS_SERIF);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        nbVar.addView(q6Var, w7.x5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        nbVar.setTextColor(nbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        nbVar.setBackground(nbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z10) {
            x9Var.setImageBitmap(uyVar.f41246b4.f30805r);
        } else {
            x9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = uyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(parentActivity2, f6Var2, true);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        ocVar.f29029a = new dj(this, 25);
        nbVar.setButton(ocVar);
        nbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        q6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.yc.a0(uyVar).b(nbVar, -1);
        uyVar.f41263e4 = b10;
        b10.f29687r = false;
        b10.i(false);
        org.telegram.ui.Components.qc qcVar2 = uyVar.f41263e4;
        qcVar2.f29688s = true;
        qcVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                iy iyVar = iy.this;
                uy uyVar = iyVar.f37453a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    uyVar.f41252c4 = photoSize2.location;
                    uyVar.f41257d4 = photoSize.location;
                } else if (uyVar.f41252c4 == null) {
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
                    uyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.v1(iyVar, str, z10, 4));
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
    public final cv0 getCloseIntoObject() {
        uy uyVar = this.f37453a;
        org.telegram.ui.Components.qc qcVar = uyVar.f41263e4;
        if (qcVar != null) {
            org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.f29675e;
            cv0 cv0Var = new cv0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.x9 x9Var = hcVar.f26703c;
            org.telegram.ui.Components.x9 x9Var2 = hcVar.f26703c;
            x9Var.getLocationInWindow(iArr);
            cv0Var.f35541b = iArr[0];
            cv0Var.f35542c = iArr[1];
            cv0Var.d = uyVar.fragmentView;
            ImageReceiver imageReceiver = x9Var2.getImageReceiver();
            cv0Var.f35540a = imageReceiver;
            cv0Var.f35543e = imageReceiver.getBitmapSafe();
            cv0Var.f35546i = 0;
            cv0Var.h = cv0Var.f35540a.getRoundRadius();
            cv0Var.f35548k = x9Var2.getScaleX();
            return cv0Var;
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
    public final void P() {
    }
}
