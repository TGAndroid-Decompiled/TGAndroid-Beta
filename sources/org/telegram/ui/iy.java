package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iy implements org.telegram.ui.Components.t40 {
    public final uy f34732a;

    public iy(uy uyVar) {
        this.f34732a = uyVar;
    }

    @Override
    public final void B(float f7) {
        org.telegram.ui.Components.oc ocVar = this.f34732a.f38221d4;
        if (ocVar != null) {
            ((org.telegram.ui.Components.fc) ocVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10;
        uy uyVar = this.f34732a;
        org.telegram.ui.Components.oc ocVar = uyVar.f38221d4;
        if (ocVar != null) {
            ocVar.b();
            uyVar.f38221d4 = null;
        }
        Activity parentActivity = uyVar.getParentActivity();
        e6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        ?? lbVar = new org.telegram.ui.Components.lb(parentActivity, e6Var);
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(lbVar, parentActivity);
        lbVar.f23883b = ecVar;
        ecVar.setWillNotDraw(false);
        lbVar.addView(ecVar, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(parentActivity);
        lbVar.f23884c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ecVar.addView(u9Var, w7.x5.e(28, 28, 17));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(parentActivity, false, false, false);
        lbVar.d = n6Var;
        n6Var.setTypeface(Typeface.SANS_SERIF);
        n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        lbVar.addView(n6Var, w7.x5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        lbVar.setTextColor(lbVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        lbVar.setBackground(lbVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        if (z10) {
            u9Var.setImageBitmap(uyVar.f38204a4.f28285r);
        } else {
            u9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = uyVar.getParentActivity();
        e6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(parentActivity2, e6Var2, true);
        mcVar.e(LocaleController.getString(R.string.ViewAction));
        mcVar.f26136a = new dj(this, 25);
        lbVar.setButton(mcVar);
        lbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        n6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.oc b10 = org.telegram.ui.Components.vc.a0(uyVar).b(lbVar, -1);
        uyVar.f38221d4 = b10;
        b10.f26759r = false;
        b10.i(false);
        org.telegram.ui.Components.oc ocVar2 = uyVar.f38221d4;
        ocVar2.f26760s = true;
        ocVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                iy iyVar = iy.this;
                uy uyVar = iyVar.f34732a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    uyVar.f38210b4 = photoSize2.location;
                    uyVar.f38216c4 = photoSize.location;
                } else if (uyVar.f38210b4 == null) {
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
        uy uyVar = this.f34732a;
        org.telegram.ui.Components.oc ocVar = uyVar.f38221d4;
        if (ocVar != null) {
            org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) ocVar.e;
            dv0 dv0Var = new dv0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.u9 u9Var = fcVar.f23884c;
            org.telegram.ui.Components.u9 u9Var2 = fcVar.f23884c;
            u9Var.getLocationInWindow(iArr);
            dv0Var.f33097b = iArr[0];
            dv0Var.f33098c = iArr[1];
            dv0Var.d = uyVar.fragmentView;
            ImageReceiver imageReceiver = u9Var2.getImageReceiver();
            dv0Var.f33096a = imageReceiver;
            dv0Var.e = imageReceiver.getBitmapSafe();
            dv0Var.f33101i = 0;
            dv0Var.h = dv0Var.f33096a.getRoundRadius();
            dv0Var.f33103k = u9Var2.getScaleX();
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
