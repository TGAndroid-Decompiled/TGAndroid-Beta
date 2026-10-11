package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gy implements org.telegram.ui.Components.m50 {
    public final sy f38210a;

    public gy(sy syVar) {
        this.f38210a = syVar;
    }

    @Override
    public final void D(float f7) {
        org.telegram.ui.Components.sc scVar = this.f38210a.f41939d4;
        if (scVar != null) {
            ((org.telegram.ui.Components.jc) scVar.f30829e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        sy syVar = this.f38210a;
        org.telegram.ui.Components.sc scVar = syVar.f41939d4;
        if (scVar != null) {
            scVar.b();
            syVar.f41939d4 = null;
        }
        Activity parentActivity = syVar.getParentActivity();
        d6Var = ((org.telegram.ui.ActionBar.m2) syVar).resourceProvider;
        ?? pbVar = new org.telegram.ui.Components.pb(parentActivity, d6Var);
        org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(pbVar, parentActivity);
        pbVar.f27706b = icVar;
        icVar.setWillNotDraw(false);
        pbVar.addView(icVar, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
        pbVar.f27707c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        icVar.addView(y9Var, w7.x5.e(28, 28, 17));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(parentActivity, false, false, false);
        pbVar.d = r6Var;
        r6Var.setTypeface(Typeface.SANS_SERIF);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        pbVar.addView(r6Var, w7.x5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        pbVar.setTextColor(pbVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        pbVar.setBackground(pbVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        if (z10) {
            y9Var.setImageBitmap(syVar.f41922a4.f29030r);
        } else {
            y9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = syVar.getParentActivity();
        d6Var2 = ((org.telegram.ui.ActionBar.m2) syVar).resourceProvider;
        org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(parentActivity2, d6Var2, true);
        qcVar.e(LocaleController.getString(R.string.ViewAction));
        qcVar.f30224a = new cj(this, 26);
        pbVar.setButton(qcVar);
        pbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        r6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.sc b10 = org.telegram.ui.Components.ad.a0(syVar).b(pbVar, -1);
        syVar.f41939d4 = b10;
        b10.f30841r = false;
        b10.i(false);
        org.telegram.ui.Components.sc scVar2 = syVar.f41939d4;
        scVar2.f30842s = true;
        scVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                gy gyVar = gy.this;
                sy syVar = gyVar.f38210a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    syVar.f41928b4 = photoSize2.location;
                    syVar.f41934c4 = photoSize.location;
                } else if (syVar.f41928b4 == null) {
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
                    syVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.u1(gyVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                kVar.o().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final dv0 getCloseIntoObject() {
        sy syVar = this.f38210a;
        org.telegram.ui.Components.sc scVar = syVar.f41939d4;
        if (scVar != null) {
            org.telegram.ui.Components.jc jcVar = (org.telegram.ui.Components.jc) scVar.f30829e;
            dv0 dv0Var = new dv0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.y9 y9Var = jcVar.f27707c;
            org.telegram.ui.Components.y9 y9Var2 = jcVar.f27707c;
            y9Var.getLocationInWindow(iArr);
            dv0Var.f37148b = iArr[0];
            dv0Var.f37149c = iArr[1];
            dv0Var.d = syVar.fragmentView;
            ImageReceiver imageReceiver = y9Var2.getImageReceiver();
            dv0Var.f37147a = imageReceiver;
            dv0Var.f37150e = imageReceiver.getBitmapSafe();
            dv0Var.f37153i = 0;
            dv0Var.h = dv0Var.f37147a.getRoundRadius();
            dv0Var.f37155k = y9Var2.getScaleX();
            return dv0Var;
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
