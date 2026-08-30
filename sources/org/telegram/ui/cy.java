package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cy implements org.telegram.ui.Components.v40 {
    public final oy f33449a;

    public cy(oy oyVar) {
        this.f33449a = oyVar;
    }

    @Override
    public final void D(float f10) {
        org.telegram.ui.Components.ic icVar = this.f33449a.f37013b4;
        if (icVar != null) {
            ((org.telegram.ui.Components.zb) icVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void I(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        oy oyVar = this.f33449a;
        org.telegram.ui.Components.ic icVar = oyVar.f37013b4;
        if (icVar != null) {
            icVar.b();
            oyVar.f37013b4 = null;
        }
        Activity parentActivity = oyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.p2) oyVar).resourceProvider;
        ?? ebVar = new org.telegram.ui.Components.eb(parentActivity, f6Var);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(ebVar, parentActivity);
        ebVar.f31306b = ybVar;
        ybVar.setWillNotDraw(false);
        ebVar.addView(ybVar, k7.b6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
        ebVar.f31307c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ybVar.addView(p9Var, k7.b6.e(28, 28, 17));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(parentActivity, false, false, false);
        ebVar.d = k6Var;
        k6Var.setTypeface(Typeface.SANS_SERIF);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ebVar.addView(k6Var, k7.b6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        ebVar.setTextColor(ebVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        ebVar.setBackground(ebVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z4) {
            p9Var.setImageBitmap(oyVar.Y3.f30195r);
        } else {
            p9Var.setImageBitmap(PhotoViewer.t1().z4.getBitmap());
        }
        Activity parentActivity2 = oyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.p2) oyVar).resourceProvider;
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(parentActivity2, f6Var2, true);
        gcVar.e(LocaleController.getString(R.string.ViewAction));
        gcVar.f25097a = new zi(this, 25);
        ebVar.setButton(gcVar);
        ebVar.getButton().setVisibility(8);
        if (z10) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        k6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.ic b10 = org.telegram.ui.Components.qc.a0(oyVar).b(ebVar, -1);
        oyVar.f37013b4 = b10;
        b10.f25680r = false;
        b10.i(false);
        org.telegram.ui.Components.ic icVar2 = oyVar.f37013b4;
        icVar2.f25681s = true;
        icVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                cy cyVar = cy.this;
                oy oyVar = cyVar.f33449a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    oyVar.Z3 = photoSize2.location;
                    oyVar.f37007a4 = photoSize.location;
                } else if (oyVar.Z3 == null) {
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
                    oyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new lh.k7(cyVar, str, z4, 3));
                }
                kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final ju0 getCloseIntoObject() {
        oy oyVar = this.f33449a;
        org.telegram.ui.Components.ic icVar = oyVar.f37013b4;
        if (icVar != null) {
            org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) icVar.e;
            ju0 ju0Var = new ju0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.p9 p9Var = zbVar.f31307c;
            org.telegram.ui.Components.p9 p9Var2 = zbVar.f31307c;
            p9Var.getLocationInWindow(iArr);
            ju0Var.f35496b = iArr[0];
            ju0Var.f35497c = iArr[1];
            ju0Var.d = oyVar.fragmentView;
            ImageReceiver imageReceiver = p9Var2.getImageReceiver();
            ju0Var.f35495a = imageReceiver;
            ju0Var.e = imageReceiver.getBitmapSafe();
            ju0Var.f35500i = 0;
            ju0Var.h = ju0Var.f35495a.getRoundRadius();
            ju0Var.f35502k = p9Var2.getScaleX();
            return ju0Var;
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
