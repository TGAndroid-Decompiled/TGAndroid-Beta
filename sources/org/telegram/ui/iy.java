package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iy implements org.telegram.ui.Components.t40 {
    public final uy f34638a;

    public iy(uy uyVar) {
        this.f34638a = uyVar;
    }

    @Override
    public final void B(float f7) {
        org.telegram.ui.Components.qc qcVar = this.f34638a.f38148d4;
        if (qcVar != null) {
            ((org.telegram.ui.Components.hc) qcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10;
        uy uyVar = this.f34638a;
        org.telegram.ui.Components.qc qcVar = uyVar.f38148d4;
        if (qcVar != null) {
            qcVar.b();
            uyVar.f38148d4 = null;
        }
        Activity parentActivity = uyVar.getParentActivity();
        e6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        ?? nbVar = new org.telegram.ui.Components.nb(parentActivity, e6Var);
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(nbVar, parentActivity);
        nbVar.f24632b = gcVar;
        gcVar.setWillNotDraw(false);
        nbVar.addView(gcVar, w7.y5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
        nbVar.f24633c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        gcVar.addView(w9Var, w7.y5.e(28, 28, 17));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(parentActivity, false, false, false);
        nbVar.d = p6Var;
        p6Var.setTypeface(Typeface.SANS_SERIF);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        nbVar.addView(p6Var, w7.y5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        nbVar.setTextColor(nbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        nbVar.setBackground(nbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z10) {
            w9Var.setImageBitmap(uyVar.f38131a4.f28559r);
        } else {
            w9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = uyVar.getParentActivity();
        e6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(parentActivity2, e6Var2, true);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        ocVar.f26906a = new cj(this, 25);
        nbVar.setButton(ocVar);
        nbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        p6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(uyVar).b(nbVar, -1);
        uyVar.f38148d4 = b10;
        b10.f27558r = false;
        b10.i(false);
        org.telegram.ui.Components.qc qcVar2 = uyVar.f38148d4;
        qcVar2.f27559s = true;
        qcVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                iy iyVar = iy.this;
                uy uyVar = iyVar.f34638a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    uyVar.f38137b4 = photoSize2.location;
                    uyVar.f38143c4 = photoSize.location;
                } else if (uyVar.f38137b4 == null) {
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
                    uyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.v1(iyVar, str, z10, 4));
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
    public final dv0 getCloseIntoObject() {
        uy uyVar = this.f34638a;
        org.telegram.ui.Components.qc qcVar = uyVar.f38148d4;
        if (qcVar != null) {
            org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
            dv0 dv0Var = new dv0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.w9 w9Var = hcVar.f24633c;
            org.telegram.ui.Components.w9 w9Var2 = hcVar.f24633c;
            w9Var.getLocationInWindow(iArr);
            dv0Var.f33093b = iArr[0];
            dv0Var.f33094c = iArr[1];
            dv0Var.d = uyVar.fragmentView;
            ImageReceiver imageReceiver = w9Var2.getImageReceiver();
            dv0Var.f33092a = imageReceiver;
            dv0Var.e = imageReceiver.getBitmapSafe();
            dv0Var.f33097i = 0;
            dv0Var.h = dv0Var.f33092a.getRoundRadius();
            dv0Var.f33099k = w9Var2.getScaleX();
            return dv0Var;
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
