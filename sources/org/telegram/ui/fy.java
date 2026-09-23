package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fy implements org.telegram.ui.Components.u40 {
    public final ry f33393a;

    public fy(ry ryVar) {
        this.f33393a = ryVar;
    }

    @Override
    public final void B(float f7) {
        org.telegram.ui.Components.qc qcVar = this.f33393a.f36977d4;
        if (qcVar != null) {
            ((org.telegram.ui.Components.hc) qcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        ry ryVar = this.f33393a;
        org.telegram.ui.Components.qc qcVar = ryVar.f36977d4;
        if (qcVar != null) {
            qcVar.b();
            ryVar.f36977d4 = null;
        }
        Activity parentActivity = ryVar.getParentActivity();
        d6Var = ((org.telegram.ui.ActionBar.n2) ryVar).resourceProvider;
        ?? nbVar = new org.telegram.ui.Components.nb(parentActivity, d6Var);
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(nbVar, parentActivity);
        nbVar.f24629b = gcVar;
        gcVar.setWillNotDraw(false);
        nbVar.addView(gcVar, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
        nbVar.f24630c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        gcVar.addView(w9Var, w7.x5.e(28, 28, 17));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(parentActivity, false, false, false);
        nbVar.d = p6Var;
        p6Var.setTypeface(Typeface.SANS_SERIF);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        nbVar.addView(p6Var, w7.x5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        nbVar.setTextColor(nbVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        nbVar.setBackground(nbVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        if (z10) {
            w9Var.setImageBitmap(ryVar.f36960a4.f28650r);
        } else {
            w9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = ryVar.getParentActivity();
        d6Var2 = ((org.telegram.ui.ActionBar.n2) ryVar).resourceProvider;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(parentActivity2, d6Var2, true);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        ocVar.f26716a = new aj(this, 25);
        nbVar.setButton(ocVar);
        nbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        p6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(ryVar).b(nbVar, -1);
        ryVar.f36977d4 = b10;
        b10.f27314r = false;
        b10.i(false);
        org.telegram.ui.Components.qc qcVar2 = ryVar.f36977d4;
        qcVar2.f27315s = true;
        qcVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                fy fyVar = fy.this;
                ry ryVar = fyVar.f33393a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    ryVar.f36966b4 = photoSize2.location;
                    ryVar.f36972c4 = photoSize.location;
                } else if (ryVar.f36966b4 == null) {
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
                    ryVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.v1(fyVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final wu0 getCloseIntoObject() {
        ry ryVar = this.f33393a;
        org.telegram.ui.Components.qc qcVar = ryVar.f36977d4;
        if (qcVar != null) {
            org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
            wu0 wu0Var = new wu0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.w9 w9Var = hcVar.f24630c;
            org.telegram.ui.Components.w9 w9Var2 = hcVar.f24630c;
            w9Var.getLocationInWindow(iArr);
            wu0Var.f39095b = iArr[0];
            wu0Var.f39096c = iArr[1];
            wu0Var.d = ryVar.fragmentView;
            ImageReceiver imageReceiver = w9Var2.getImageReceiver();
            wu0Var.f39094a = imageReceiver;
            wu0Var.e = imageReceiver.getBitmapSafe();
            wu0Var.f39099i = 0;
            wu0Var.h = wu0Var.f39094a.getRoundRadius();
            wu0Var.f39101k = w9Var2.getScaleX();
            return wu0Var;
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
