package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ey implements org.telegram.ui.Components.w40 {
    public final qy f33878a;

    public ey(qy qyVar) {
        this.f33878a = qyVar;
    }

    @Override
    public final void D(float f10) {
        org.telegram.ui.Components.ic icVar = this.f33878a.f37531b4;
        if (icVar != null) {
            ((org.telegram.ui.Components.zb) icVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        qy qyVar = this.f33878a;
        org.telegram.ui.Components.ic icVar = qyVar.f37531b4;
        if (icVar != null) {
            icVar.b();
            qyVar.f37531b4 = null;
        }
        Activity parentActivity = qyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.p2) qyVar).resourceProvider;
        ?? ebVar = new org.telegram.ui.Components.eb(parentActivity, f6Var);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(ebVar, parentActivity);
        ebVar.f31325b = ybVar;
        ybVar.setWillNotDraw(false);
        ebVar.addView(ybVar, k7.b6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
        ebVar.f31326c = p9Var;
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
            p9Var.setImageBitmap(qyVar.Y3.f30471r);
        } else {
            p9Var.setImageBitmap(PhotoViewer.t1().z4.getBitmap());
        }
        Activity parentActivity2 = qyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar).resourceProvider;
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(parentActivity2, f6Var2, true);
        gcVar.e(LocaleController.getString(R.string.ViewAction));
        gcVar.f25112a = new bj(this, 25);
        ebVar.setButton(gcVar);
        ebVar.getButton().setVisibility(8);
        if (z10) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        k6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.ic b10 = org.telegram.ui.Components.qc.a0(qyVar).b(ebVar, -1);
        qyVar.f37531b4 = b10;
        b10.f25679r = false;
        b10.i(false);
        org.telegram.ui.Components.ic icVar2 = qyVar.f37531b4;
        icVar2.f25680s = true;
        icVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                ey eyVar = ey.this;
                qy qyVar = eyVar.f33878a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    qyVar.Z3 = photoSize2.location;
                    qyVar.f37525a4 = photoSize.location;
                } else if (qyVar.Z3 == null) {
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
                    qyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new lh.k7(eyVar, str, z4, 3));
                }
                kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
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
        qy qyVar = this.f33878a;
        org.telegram.ui.Components.ic icVar = qyVar.f37531b4;
        if (icVar != null) {
            org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) icVar.e;
            qu0 qu0Var = new qu0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.p9 p9Var = zbVar.f31326c;
            org.telegram.ui.Components.p9 p9Var2 = zbVar.f31326c;
            p9Var.getLocationInWindow(iArr);
            qu0Var.f37488b = iArr[0];
            qu0Var.f37489c = iArr[1];
            qu0Var.d = qyVar.fragmentView;
            ImageReceiver imageReceiver = p9Var2.getImageReceiver();
            qu0Var.f37487a = imageReceiver;
            qu0Var.e = imageReceiver.getBitmapSafe();
            qu0Var.f37492i = 0;
            qu0Var.h = qu0Var.f37487a.getRoundRadius();
            qu0Var.f37494k = p9Var2.getScaleX();
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
