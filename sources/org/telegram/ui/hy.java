package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hy implements org.telegram.ui.Components.l50 {
    public final ty f38415a;

    public hy(ty tyVar) {
        this.f38415a = tyVar;
    }

    @Override
    public final void D(float f7) {
        org.telegram.ui.Components.tc tcVar = this.f38415a.f42172d4;
        if (tcVar != null) {
            ((org.telegram.ui.Components.kc) tcVar.f31126e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10;
        ty tyVar = this.f38415a;
        org.telegram.ui.Components.tc tcVar = tyVar.f42172d4;
        if (tcVar != null) {
            tcVar.b();
            tyVar.f42172d4 = null;
        }
        Activity parentActivity = tyVar.getParentActivity();
        e6Var = ((org.telegram.ui.ActionBar.n2) tyVar).resourceProvider;
        ?? qbVar = new org.telegram.ui.Components.qb(parentActivity, e6Var);
        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(qbVar, parentActivity);
        qbVar.f27930b = jcVar;
        jcVar.setWillNotDraw(false);
        qbVar.addView(jcVar, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
        qbVar.f27931c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        jcVar.addView(y9Var, w7.x5.e(28, 28, 17));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(parentActivity, false, false, false);
        qbVar.d = r6Var;
        r6Var.setTypeface(Typeface.SANS_SERIF);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        qbVar.addView(r6Var, w7.x5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        qbVar.setTextColor(qbVar.getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        qbVar.setBackground(qbVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        if (z10) {
            y9Var.setImageBitmap(tyVar.f42155a4.f28688r);
        } else {
            y9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = tyVar.getParentActivity();
        e6Var2 = ((org.telegram.ui.ActionBar.n2) tyVar).resourceProvider;
        org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc(parentActivity2, e6Var2, true);
        rcVar.e(LocaleController.getString(R.string.ViewAction));
        rcVar.f30421a = new cj(this, 26);
        qbVar.setButton(rcVar);
        qbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        r6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.tc b10 = org.telegram.ui.Components.ad.a0(tyVar).b(qbVar, -1);
        tyVar.f42172d4 = b10;
        b10.f31138r = false;
        b10.i(false);
        org.telegram.ui.Components.tc tcVar2 = tyVar.f42172d4;
        tcVar2.f31139s = true;
        tcVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                hy hyVar = hy.this;
                ty tyVar = hyVar.f38415a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    tyVar.f42161b4 = photoSize2.location;
                    tyVar.f42167c4 = photoSize.location;
                } else if (tyVar.f42161b4 == null) {
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
                    tyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.u1(hyVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                kVar.o().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final ev0 getCloseIntoObject() {
        ty tyVar = this.f38415a;
        org.telegram.ui.Components.tc tcVar = tyVar.f42172d4;
        if (tcVar != null) {
            org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) tcVar.f31126e;
            ev0 ev0Var = new ev0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.y9 y9Var = kcVar.f27931c;
            org.telegram.ui.Components.y9 y9Var2 = kcVar.f27931c;
            y9Var.getLocationInWindow(iArr);
            ev0Var.f37357b = iArr[0];
            ev0Var.f37358c = iArr[1];
            ev0Var.d = tyVar.fragmentView;
            ImageReceiver imageReceiver = y9Var2.getImageReceiver();
            ev0Var.f37356a = imageReceiver;
            ev0Var.f37359e = imageReceiver.getBitmapSafe();
            ev0Var.f37362i = 0;
            ev0Var.h = ev0Var.f37356a.getRoundRadius();
            ev0Var.f37364k = y9Var2.getScaleX();
            return ev0Var;
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
