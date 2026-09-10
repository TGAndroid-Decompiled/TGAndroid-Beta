package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ky implements org.telegram.ui.Components.d50 {
    public final wy f34472a;

    public ky(wy wyVar) {
        this.f34472a = wyVar;
    }

    @Override
    public final void C(float f7) {
        org.telegram.ui.Components.pc pcVar = this.f34472a.f38435e4;
        if (pcVar != null) {
            ((org.telegram.ui.Components.gc) pcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        wy wyVar = this.f34472a;
        org.telegram.ui.Components.pc pcVar = wyVar.f38435e4;
        if (pcVar != null) {
            pcVar.b();
            wyVar.f38435e4 = null;
        }
        Activity parentActivity = wyVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.p2) wyVar).resourceProvider;
        ?? mbVar = new org.telegram.ui.Components.mb(parentActivity, f6Var);
        org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(mbVar, parentActivity);
        mbVar.f23322b = fcVar;
        fcVar.setWillNotDraw(false);
        mbVar.addView(fcVar, w7.a6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
        mbVar.f23323c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        fcVar.addView(w9Var, w7.a6.e(28, 28, 17));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, false, false, false);
        mbVar.d = o6Var;
        o6Var.setTypeface(Typeface.SANS_SERIF);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        mbVar.addView(o6Var, w7.a6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        mbVar.setTextColor(mbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        mbVar.setBackground(mbVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        if (z10) {
            w9Var.setImageBitmap(wyVar.f38419b4.f22557r);
        } else {
            w9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = wyVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.p2) wyVar).resourceProvider;
        org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(parentActivity2, f6Var2, true);
        ncVar.e(LocaleController.getString(R.string.ViewAction));
        ncVar.f25483a = new fj(this, 25);
        mbVar.setButton(ncVar);
        mbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        o6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.pc b10 = org.telegram.ui.Components.wc.a0(wyVar).b(mbVar, -1);
        wyVar.f38435e4 = b10;
        b10.f26089r = false;
        b10.i(false);
        org.telegram.ui.Components.pc pcVar2 = wyVar.f38435e4;
        pcVar2.f26090s = true;
        pcVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.l lVar;
                ky kyVar = ky.this;
                wy wyVar = kyVar.f34472a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    wyVar.f38425c4 = photoSize2.location;
                    wyVar.f38430d4 = photoSize.location;
                } else if (wyVar.f38425c4 == null) {
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
                    wyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.f2(kyVar, str, z10, 4));
                }
                lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                lVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final ev0 getCloseIntoObject() {
        wy wyVar = this.f34472a;
        org.telegram.ui.Components.pc pcVar = wyVar.f38435e4;
        if (pcVar != null) {
            org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) pcVar.e;
            ev0 ev0Var = new ev0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.w9 w9Var = gcVar.f23323c;
            org.telegram.ui.Components.w9 w9Var2 = gcVar.f23323c;
            w9Var.getLocationInWindow(iArr);
            ev0Var.f32617b = iArr[0];
            ev0Var.f32618c = iArr[1];
            ev0Var.d = wyVar.fragmentView;
            ImageReceiver imageReceiver = w9Var2.getImageReceiver();
            ev0Var.f32616a = imageReceiver;
            ev0Var.e = imageReceiver.getBitmapSafe();
            ev0Var.f32621i = 0;
            ev0Var.h = ev0Var.f32616a.getRoundRadius();
            ev0Var.f32623k = w9Var2.getScaleX();
            return ev0Var;
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
