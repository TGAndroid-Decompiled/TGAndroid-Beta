package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ky implements org.telegram.ui.Components.t40 {
    public final wy f35380a;

    public ky(wy wyVar) {
        this.f35380a = wyVar;
    }

    @Override
    public final void B(float f7) {
        org.telegram.ui.Components.oc ocVar = this.f35380a.f39220d4;
        if (ocVar != null) {
            ((org.telegram.ui.Components.fc) ocVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        wy wyVar = this.f35380a;
        org.telegram.ui.Components.oc ocVar = wyVar.f39220d4;
        if (ocVar != null) {
            ocVar.b();
            wyVar.f39220d4 = null;
        }
        Activity parentActivity = wyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.o2) wyVar).resourceProvider;
        ?? lbVar = new org.telegram.ui.Components.lb(parentActivity, f6Var);
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(lbVar, parentActivity);
        lbVar.f23866b = ecVar;
        ecVar.setWillNotDraw(false);
        lbVar.addView(ecVar, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(parentActivity);
        lbVar.f23867c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ecVar.addView(u9Var, w7.x5.e(28, 28, 17));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(parentActivity, false, false, false);
        lbVar.d = n6Var;
        n6Var.setTypeface(Typeface.SANS_SERIF);
        n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        lbVar.addView(n6Var, w7.x5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        lbVar.setTextColor(lbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        lbVar.setBackground(lbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z10) {
            u9Var.setImageBitmap(wyVar.f39203a4.f28280r);
        } else {
            u9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = wyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.o2) wyVar).resourceProvider;
        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(parentActivity2, f6Var2, true);
        mcVar.e(LocaleController.getString(R.string.ViewAction));
        mcVar.f26125a = new ej(this, 25);
        lbVar.setButton(mcVar);
        lbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        n6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.oc b10 = org.telegram.ui.Components.vc.a0(wyVar).b(lbVar, -1);
        wyVar.f39220d4 = b10;
        b10.f26713r = false;
        b10.i(false);
        org.telegram.ui.Components.oc ocVar2 = wyVar.f39220d4;
        ocVar2.f26714s = true;
        ocVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                ky kyVar = ky.this;
                wy wyVar = kyVar.f35380a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    wyVar.f39209b4 = photoSize2.location;
                    wyVar.f39215c4 = photoSize.location;
                } else if (wyVar.f39209b4 == null) {
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
                    wyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.v1(kyVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final fv0 getCloseIntoObject() {
        wy wyVar = this.f35380a;
        org.telegram.ui.Components.oc ocVar = wyVar.f39220d4;
        if (ocVar != null) {
            org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) ocVar.e;
            fv0 fv0Var = new fv0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.u9 u9Var = fcVar.f23867c;
            org.telegram.ui.Components.u9 u9Var2 = fcVar.f23867c;
            u9Var.getLocationInWindow(iArr);
            fv0Var.f33768b = iArr[0];
            fv0Var.f33769c = iArr[1];
            fv0Var.d = wyVar.fragmentView;
            ImageReceiver imageReceiver = u9Var2.getImageReceiver();
            fv0Var.f33767a = imageReceiver;
            fv0Var.e = imageReceiver.getBitmapSafe();
            fv0Var.f33772i = 0;
            fv0Var.h = fv0Var.f33767a.getRoundRadius();
            fv0Var.f33774k = u9Var2.getScaleX();
            return fv0Var;
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
