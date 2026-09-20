package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iy implements org.telegram.ui.Components.t40 {
    public final uy f34697a;

    public iy(uy uyVar) {
        this.f34697a = uyVar;
    }

    @Override
    public final void B(float f7) {
        org.telegram.ui.Components.pc pcVar = this.f34697a.f38255d4;
        if (pcVar != null) {
            ((org.telegram.ui.Components.gc) pcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        uy uyVar = this.f34697a;
        org.telegram.ui.Components.pc pcVar = uyVar.f38255d4;
        if (pcVar != null) {
            pcVar.b();
            uyVar.f38255d4 = null;
        }
        Activity parentActivity = uyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        ?? mbVar = new org.telegram.ui.Components.mb(parentActivity, f6Var);
        org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(mbVar, parentActivity);
        mbVar.f24330b = fcVar;
        fcVar.setWillNotDraw(false);
        mbVar.addView(fcVar, w7.y5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(parentActivity);
        mbVar.f24331c = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        fcVar.addView(v9Var, w7.y5.e(28, 28, 17));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, false, false, false);
        mbVar.d = o6Var;
        o6Var.setTypeface(Typeface.SANS_SERIF);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        mbVar.addView(o6Var, w7.y5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        mbVar.setTextColor(mbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        mbVar.setBackground(mbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z10) {
            v9Var.setImageBitmap(uyVar.f38238a4.f28536r);
        } else {
            v9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = uyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
        org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(parentActivity2, f6Var2, true);
        ncVar.e(LocaleController.getString(R.string.ViewAction));
        ncVar.f26616a = new cj(this, 25);
        mbVar.setButton(ncVar);
        mbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        o6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.pc b10 = org.telegram.ui.Components.xc.a0(uyVar).b(mbVar, -1);
        uyVar.f38255d4 = b10;
        b10.f27260r = false;
        b10.i(false);
        org.telegram.ui.Components.pc pcVar2 = uyVar.f38255d4;
        pcVar2.f27261s = true;
        pcVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                iy iyVar = iy.this;
                uy uyVar = iyVar.f34697a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    uyVar.f38244b4 = photoSize2.location;
                    uyVar.f38250c4 = photoSize.location;
                } else if (uyVar.f38244b4 == null) {
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
        uy uyVar = this.f34697a;
        org.telegram.ui.Components.pc pcVar = uyVar.f38255d4;
        if (pcVar != null) {
            org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) pcVar.e;
            dv0 dv0Var = new dv0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.v9 v9Var = gcVar.f24331c;
            org.telegram.ui.Components.v9 v9Var2 = gcVar.f24331c;
            v9Var.getLocationInWindow(iArr);
            dv0Var.f33144b = iArr[0];
            dv0Var.f33145c = iArr[1];
            dv0Var.d = uyVar.fragmentView;
            ImageReceiver imageReceiver = v9Var2.getImageReceiver();
            dv0Var.f33143a = imageReceiver;
            dv0Var.e = imageReceiver.getBitmapSafe();
            dv0Var.f33148i = 0;
            dv0Var.h = dv0Var.f33143a.getRoundRadius();
            dv0Var.f33150k = v9Var2.getScaleX();
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
