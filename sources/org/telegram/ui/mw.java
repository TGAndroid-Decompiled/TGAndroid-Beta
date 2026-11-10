package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mw implements org.telegram.ui.Components.i30 {
    public final zw f48063a;

    public mw(zw zwVar) {
        this.f48063a = zwVar;
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Components.bc bcVar = this.f48063a.f52581e4;
        if (bcVar != null) {
            ((org.telegram.ui.Components.sb) bcVar.f32199e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i7;
        zw zwVar = this.f48063a;
        org.telegram.ui.Components.bc bcVar = zwVar.f52581e4;
        if (bcVar != null) {
            bcVar.b();
            zwVar.f52581e4 = null;
        }
        Activity parentActivity = zwVar.getParentActivity();
        h6Var = ((org.telegram.ui.ActionBar.f2) zwVar).resourceProvider;
        ?? yaVar = new org.telegram.ui.Components.ya(parentActivity, h6Var);
        org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(yaVar, parentActivity);
        yaVar.f37913b = rbVar;
        rbVar.setWillNotDraw(false);
        yaVar.addView(rbVar, c8.ha.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
        yaVar.f37914c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        rbVar.addView(k9Var, c8.ha.e(28, 28, 17));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(parentActivity, false, false, false);
        yaVar.d = i6Var;
        i6Var.setTypeface(Typeface.SANS_SERIF);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        yaVar.addView(i6Var, c8.ha.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        yaVar.setTextColor(yaVar.getThemedColor(org.telegram.ui.ActionBar.m6.vj));
        yaVar.setBackground(yaVar.getThemedColor(org.telegram.ui.ActionBar.m6.tj));
        if (z9) {
            k9Var.setImageBitmap(zwVar.f52565b4.f34831r);
        } else {
            k9Var.setImageBitmap(PhotoViewer.p1().B4.n());
        }
        Activity parentActivity2 = zwVar.getParentActivity();
        h6Var2 = ((org.telegram.ui.ActionBar.f2) zwVar).resourceProvider;
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(parentActivity2, h6Var2, true);
        zbVar.e(org.telegram.messenger.id.M0(2131743563, null));
        zbVar.f40908b = new dh(this, 23);
        yaVar.setButton(zbVar);
        yaVar.getButton().setVisibility(8);
        if (z10) {
            i7 = 2131742792;
        } else {
            i7 = 2131742794;
        }
        i6Var.c(org.telegram.messenger.id.M0(i7, null), true, true);
        org.telegram.ui.Components.bc b10 = org.telegram.ui.Components.gc.a0(zwVar).b(yaVar, -1);
        zwVar.f52581e4 = b10;
        b10.f32211r = false;
        b10.i(false);
        org.telegram.ui.Components.bc bcVar2 = zwVar.f52581e4;
        bcVar2.f32212s = true;
        bcVar2.j();
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z9, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.l lVar;
                mw mwVar = mw.this;
                zw zwVar = mwVar.f48063a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    zwVar.f52571c4 = photoSize2.location;
                    zwVar.f52575d4 = photoSize.location;
                } else if (zwVar.f52571c4 == null) {
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
                    zwVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.u9(mwVar, str, z9, 5));
                }
                lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                lVar.s().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final zq0 getCloseIntoObject() {
        zw zwVar = this.f48063a;
        org.telegram.ui.Components.bc bcVar = zwVar.f52581e4;
        if (bcVar != null) {
            org.telegram.ui.Components.sb sbVar = (org.telegram.ui.Components.sb) bcVar.f32199e;
            zq0 zq0Var = new zq0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.k9 k9Var = sbVar.f37914c;
            org.telegram.ui.Components.k9 k9Var2 = sbVar.f37914c;
            k9Var.getLocationInWindow(iArr);
            zq0Var.f52504b = iArr[0];
            zq0Var.f52505c = iArr[1];
            zq0Var.d = zwVar.fragmentView;
            ImageReceiver imageReceiver = k9Var2.getImageReceiver();
            zq0Var.f52503a = imageReceiver;
            zq0Var.f52506e = imageReceiver.p();
            zq0Var.f52509i = 0;
            zq0Var.h = zq0Var.f52503a.W0;
            zq0Var.f52511k = k9Var2.getScaleX();
            return zq0Var;
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
