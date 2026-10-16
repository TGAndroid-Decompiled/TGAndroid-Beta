package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class my implements org.telegram.ui.Components.h50 {
    public final yy f38085a;

    public my(yy yyVar) {
        this.f38085a = yyVar;
    }

    @Override
    public final void E(float f7) {
        org.telegram.ui.Components.sc scVar = this.f38085a.f42008e4;
        if (scVar != null) {
            ((org.telegram.ui.Components.jc) scVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i10;
        yy yyVar = this.f38085a;
        org.telegram.ui.Components.sc scVar = yyVar.f42008e4;
        if (scVar != null) {
            scVar.b();
            yyVar.f42008e4 = null;
        }
        Activity parentActivity = yyVar.getParentActivity();
        c6Var = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
        ?? pbVar = new org.telegram.ui.Components.pb(parentActivity, c6Var);
        org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(pbVar, parentActivity);
        pbVar.f25957b = icVar;
        icVar.setWillNotDraw(false);
        pbVar.addView(icVar, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(parentActivity);
        pbVar.f25958c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        icVar.addView(z9Var, w7.z5.e(28, 28, 17));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(parentActivity, false, false, false);
        pbVar.d = s6Var;
        s6Var.setTypeface(Typeface.SANS_SERIF);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        pbVar.addView(s6Var, w7.z5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        pbVar.setTextColor(pbVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        pbVar.setBackground(pbVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        if (z10) {
            z9Var.setImageBitmap(yyVar.f41992b4.f25503r);
        } else {
            z9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = yyVar.getParentActivity();
        c6Var2 = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
        org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(parentActivity2, c6Var2, true);
        qcVar.e(LocaleController.getString(R.string.ViewAction));
        qcVar.f28266a = new gj(this, 26);
        pbVar.setButton(qcVar);
        pbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        s6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.sc b10 = org.telegram.ui.Components.zc.a0(yyVar).b(pbVar, -1);
        yyVar.f42008e4 = b10;
        b10.f28813r = false;
        b10.i(false);
        org.telegram.ui.Components.sc scVar2 = yyVar.f42008e4;
        scVar2.f28814s = true;
        scVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                my myVar = my.this;
                yy yyVar = myVar.f38085a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    yyVar.f41998c4 = photoSize2.location;
                    yyVar.f42003d4 = photoSize.location;
                } else if (yyVar.f41998c4 == null) {
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
                    yyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.u1(myVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final jv0 getCloseIntoObject() {
        yy yyVar = this.f38085a;
        org.telegram.ui.Components.sc scVar = yyVar.f42008e4;
        if (scVar != null) {
            org.telegram.ui.Components.jc jcVar = (org.telegram.ui.Components.jc) scVar.e;
            jv0 jv0Var = new jv0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.z9 z9Var = jcVar.f25958c;
            org.telegram.ui.Components.z9 z9Var2 = jcVar.f25958c;
            z9Var.getLocationInWindow(iArr);
            jv0Var.f37146b = iArr[0];
            jv0Var.f37147c = iArr[1];
            jv0Var.d = yyVar.fragmentView;
            ImageReceiver imageReceiver = z9Var2.getImageReceiver();
            jv0Var.f37145a = imageReceiver;
            jv0Var.e = imageReceiver.getBitmapSafe();
            jv0Var.f37150i = 0;
            jv0Var.h = jv0Var.f37145a.getRoundRadius();
            jv0Var.f37152k = z9Var2.getScaleX();
            return jv0Var;
        }
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void P() {
    }
}
