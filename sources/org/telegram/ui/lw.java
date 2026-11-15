package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lw implements org.telegram.ui.Components.l30 {
    public final yw f49049a;

    public lw(yw ywVar) {
        this.f49049a = ywVar;
    }

    @Override
    public final void I(float f10) {
        org.telegram.ui.Components.xb xbVar = this.f49049a.f53677f4;
        if (xbVar != null) {
            ((org.telegram.ui.Components.ob) xbVar.f41639e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i7;
        yw ywVar = this.f49049a;
        org.telegram.ui.Components.xb xbVar = ywVar.f53677f4;
        if (xbVar != null) {
            xbVar.b();
            ywVar.f53677f4 = null;
        }
        Activity parentActivity = ywVar.getParentActivity();
        e6Var = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
        ?? vaVar = new org.telegram.ui.Components.va(parentActivity, e6Var);
        org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(vaVar, parentActivity);
        vaVar.f37910b = nbVar;
        nbVar.setWillNotDraw(false);
        vaVar.addView(nbVar, c8.ja.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity);
        vaVar.f37911c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        nbVar.addView(i9Var, c8.ja.e(28, 28, 17));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(parentActivity, false, false, false);
        vaVar.d = h6Var;
        h6Var.setTypeface(Typeface.SANS_SERIF);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        vaVar.addView(h6Var, c8.ja.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        vaVar.setTextColor(vaVar.getThemedColor(org.telegram.ui.ActionBar.j6.yj));
        vaVar.setBackground(vaVar.getThemedColor(org.telegram.ui.ActionBar.j6.wj));
        if (z10) {
            i9Var.setImageBitmap(ywVar.f53661c4.f37046r);
        } else {
            i9Var.setImageBitmap(PhotoViewer.p1().C4.n());
        }
        Activity parentActivity2 = ywVar.getParentActivity();
        e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(parentActivity2, e6Var2, true);
        vbVar.e(org.telegram.messenger.hd.M0(2131743563, null));
        vbVar.f40369b = new bh(this, 23);
        vaVar.setButton(vbVar);
        vaVar.getButton().setVisibility(8);
        if (z11) {
            i7 = 2131742792;
        } else {
            i7 = 2131742794;
        }
        h6Var.c(org.telegram.messenger.hd.M0(i7, null), true, true);
        org.telegram.ui.Components.xb b10 = org.telegram.ui.Components.cc.a0(ywVar).b(vaVar, -1);
        ywVar.f53677f4 = b10;
        b10.f41651r = false;
        b10.i(false);
        org.telegram.ui.Components.xb xbVar2 = ywVar.f53677f4;
        xbVar2.f41652s = true;
        xbVar2.j();
    }

    @Override
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                lw lwVar = lw.this;
                yw ywVar = lwVar.f49049a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    ywVar.f53665d4 = photoSize2.location;
                    ywVar.f53671e4 = photoSize.location;
                } else if (ywVar.f53665d4 == null) {
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
                    ywVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.l8(lwVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                kVar.s().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final uq0 getCloseIntoObject() {
        yw ywVar = this.f49049a;
        org.telegram.ui.Components.xb xbVar = ywVar.f53677f4;
        if (xbVar != null) {
            org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) xbVar.f41639e;
            uq0 uq0Var = new uq0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.i9 i9Var = obVar.f37911c;
            org.telegram.ui.Components.i9 i9Var2 = obVar.f37911c;
            i9Var.getLocationInWindow(iArr);
            uq0Var.f52000b = iArr[0];
            uq0Var.f52001c = iArr[1];
            uq0Var.d = ywVar.fragmentView;
            ImageReceiver imageReceiver = i9Var2.getImageReceiver();
            uq0Var.f51999a = imageReceiver;
            uq0Var.f52002e = imageReceiver.p();
            uq0Var.f52005i = 0;
            uq0Var.h = uq0Var.f51999a.X0;
            uq0Var.f52007k = i9Var2.getScaleX();
            return uq0Var;
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
    public final void U() {
    }
}
