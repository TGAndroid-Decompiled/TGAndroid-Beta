package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jw implements org.telegram.ui.Components.i30 {
    public final ww f47025a;

    public jw(ww wwVar) {
        this.f47025a = wwVar;
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Components.cc ccVar = this.f47025a.f51532d4;
        if (ccVar != null) {
            ((org.telegram.ui.Components.tb) ccVar.f32519e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i7;
        ww wwVar = this.f47025a;
        org.telegram.ui.Components.cc ccVar = wwVar.f51532d4;
        if (ccVar != null) {
            ccVar.b();
            wwVar.f51532d4 = null;
        }
        Activity parentActivity = wwVar.getParentActivity();
        f6Var = ((org.telegram.ui.ActionBar.f2) wwVar).resourceProvider;
        ?? zaVar = new org.telegram.ui.Components.za(parentActivity, f6Var);
        org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(zaVar, parentActivity);
        zaVar.f38316b = sbVar;
        sbVar.setWillNotDraw(false);
        zaVar.addView(sbVar, c8.ha.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
        zaVar.f38317c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        sbVar.addView(l9Var, c8.ha.e(28, 28, 17));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, false, false, false);
        zaVar.d = j6Var;
        j6Var.setTypeface(Typeface.SANS_SERIF);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        zaVar.addView(j6Var, c8.ha.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        zaVar.setTextColor(zaVar.getThemedColor(org.telegram.ui.ActionBar.k6.vj));
        zaVar.setBackground(zaVar.getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        if (z9) {
            l9Var.setImageBitmap(wwVar.f51516a4.f34870r);
        } else {
            l9Var.setImageBitmap(PhotoViewer.p1().B4.n());
        }
        Activity parentActivity2 = wwVar.getParentActivity();
        f6Var2 = ((org.telegram.ui.ActionBar.f2) wwVar).resourceProvider;
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(parentActivity2, f6Var2, true);
        acVar.e(org.telegram.messenger.hd.M0(2131743564, null));
        acVar.f31748b = new bh(this, 23);
        zaVar.setButton(acVar);
        zaVar.getButton().setVisibility(8);
        if (z10) {
            i7 = 2131742793;
        } else {
            i7 = 2131742795;
        }
        j6Var.c(org.telegram.messenger.hd.M0(i7, null), true, true);
        org.telegram.ui.Components.cc b10 = org.telegram.ui.Components.hc.a0(wwVar).b(zaVar, -1);
        wwVar.f51532d4 = b10;
        b10.f32531r = false;
        b10.i(false);
        org.telegram.ui.Components.cc ccVar2 = wwVar.f51532d4;
        ccVar2.f32532s = true;
        ccVar2.j();
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z9, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                jw jwVar = jw.this;
                ww wwVar = jwVar.f47025a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    wwVar.f51522b4 = photoSize2.location;
                    wwVar.f51528c4 = photoSize.location;
                } else if (wwVar.f51522b4 == null) {
                    return;
                } else {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i7 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i7 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    wwVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.u9(jwVar, str, z9, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                kVar.q().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final vq0 getCloseIntoObject() {
        ww wwVar = this.f47025a;
        org.telegram.ui.Components.cc ccVar = wwVar.f51532d4;
        if (ccVar != null) {
            org.telegram.ui.Components.tb tbVar = (org.telegram.ui.Components.tb) ccVar.f32519e;
            vq0 vq0Var = new vq0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.l9 l9Var = tbVar.f38317c;
            org.telegram.ui.Components.l9 l9Var2 = tbVar.f38317c;
            l9Var.getLocationInWindow(iArr);
            vq0Var.f50791b = iArr[0];
            vq0Var.f50792c = iArr[1];
            vq0Var.d = wwVar.fragmentView;
            ImageReceiver imageReceiver = l9Var2.getImageReceiver();
            vq0Var.f50790a = imageReceiver;
            vq0Var.f50793e = imageReceiver.p();
            vq0Var.f50796i = 0;
            vq0Var.h = vq0Var.f50790a.W0;
            vq0Var.f50798k = l9Var2.getScaleX();
            return vq0Var;
        }
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final void T() {
    }
}
