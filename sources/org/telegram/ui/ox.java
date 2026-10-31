package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ox implements org.telegram.ui.Components.a40 {
    public final ay f40388a;

    public ox(ay ayVar) {
        this.f40388a = ayVar;
    }

    @Override
    public final void H(float f7) {
        org.telegram.ui.Components.wb wbVar = this.f40388a.f35793d4;
        if (wbVar != null) {
            ((org.telegram.ui.Components.nb) wbVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        int i10;
        ay ayVar = this.f40388a;
        org.telegram.ui.Components.wb wbVar = ayVar.f35793d4;
        if (wbVar != null) {
            wbVar.b();
            ayVar.f35793d4 = null;
        }
        Activity parentActivity = ayVar.getParentActivity();
        p6Var = ((org.telegram.ui.ActionBar.k2) ayVar).resourceProvider;
        ?? taVar = new org.telegram.ui.Components.ta(parentActivity, p6Var);
        org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(taVar, parentActivity);
        taVar.f28735b = mbVar;
        mbVar.setWillNotDraw(false);
        taVar.addView(mbVar, w7.b6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
        taVar.f28736c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        mbVar.addView(g9Var, w7.b6.e(28, 28, 17));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(parentActivity, false, false, false);
        taVar.d = f6Var;
        f6Var.setTypeface(Typeface.SANS_SERIF);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        taVar.addView(f6Var, w7.b6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        taVar.setTextColor(taVar.getThemedColor(org.telegram.ui.ActionBar.t6.vj));
        taVar.setBackground(taVar.getThemedColor(org.telegram.ui.ActionBar.t6.tj));
        if (z10) {
            g9Var.setImageBitmap(ayVar.f35776a4.f24528r);
        } else {
            g9Var.setImageBitmap(PhotoViewer.v1().C4.n());
        }
        Activity parentActivity2 = ayVar.getParentActivity();
        p6Var2 = ((org.telegram.ui.ActionBar.k2) ayVar).resourceProvider;
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(parentActivity2, p6Var2, true);
        ubVar.e(org.telegram.messenger.cd.L0(2131743589, null));
        ubVar.f30890b = new rh(this, 24);
        taVar.setButton(ubVar);
        taVar.getButton().setVisibility(8);
        if (z11) {
            i10 = 2131742817;
        } else {
            i10 = 2131742819;
        }
        f6Var.c(org.telegram.messenger.cd.L0(i10, null), true, true);
        org.telegram.ui.Components.wb b10 = org.telegram.ui.Components.cc.a0(ayVar).b(taVar, -1);
        ayVar.f35793d4 = b10;
        b10.f32143r = false;
        b10.i(false);
        org.telegram.ui.Components.wb wbVar2 = ayVar.f35793d4;
        wbVar2.f32144s = true;
        wbVar2.j();
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.l lVar;
                ox oxVar = ox.this;
                ay ayVar = oxVar.f40388a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    ayVar.f35782b4 = photoSize2.location;
                    ayVar.f35788c4 = photoSize.location;
                } else if (ayVar.f35782b4 == null) {
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
                    ayVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new wd(oxVar, str, z10, 2));
                }
                lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                lVar.p().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final gs0 getCloseIntoObject() {
        ay ayVar = this.f40388a;
        org.telegram.ui.Components.wb wbVar = ayVar.f35793d4;
        if (wbVar != null) {
            org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) wbVar.e;
            gs0 gs0Var = new gs0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.g9 g9Var = nbVar.f28736c;
            org.telegram.ui.Components.g9 g9Var2 = nbVar.f28736c;
            g9Var.getLocationInWindow(iArr);
            gs0Var.f37628b = iArr[0];
            gs0Var.f37629c = iArr[1];
            gs0Var.d = ayVar.fragmentView;
            ImageReceiver imageReceiver = g9Var2.getImageReceiver();
            gs0Var.f37627a = imageReceiver;
            gs0Var.e = imageReceiver.p();
            gs0Var.f37632i = 0;
            gs0Var.h = gs0Var.f37627a.W0;
            gs0Var.f37634k = g9Var2.getScaleX();
            return gs0Var;
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
