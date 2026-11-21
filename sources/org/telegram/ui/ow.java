package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ow implements org.telegram.ui.Components.w30 {
    public final cx f50660a;

    public ow(cx cxVar) {
        this.f50660a = cxVar;
    }

    @Override
    public final void I(float f10) {
        org.telegram.ui.Components.gc gcVar = this.f50660a.f46738i4;
        if (gcVar != null) {
            ((org.telegram.ui.Components.xb) gcVar.f35504e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i7;
        cx cxVar = this.f50660a;
        org.telegram.ui.Components.gc gcVar = cxVar.f46738i4;
        if (gcVar != null) {
            gcVar.b();
            cxVar.f46738i4 = null;
        }
        Activity parentActivity = cxVar.getParentActivity();
        h6Var = ((org.telegram.ui.ActionBar.g2) cxVar).resourceProvider;
        ?? ebVar = new org.telegram.ui.Components.eb(parentActivity, h6Var);
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(ebVar, parentActivity);
        ebVar.f42039b = wbVar;
        wbVar.setWillNotDraw(false);
        ebVar.addView(wbVar, c8.ma.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity);
        ebVar.f42040c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        wbVar.addView(q9Var, c8.ma.e(28, 28, 17));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, false, false, false);
        ebVar.d = o6Var;
        o6Var.setTypeface(Typeface.SANS_SERIF);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ebVar.addView(o6Var, c8.ma.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        ebVar.setTextColor(ebVar.getThemedColor(org.telegram.ui.ActionBar.m6.yj));
        ebVar.setBackground(ebVar.getThemedColor(org.telegram.ui.ActionBar.m6.wj));
        if (z10) {
            q9Var.setImageBitmap(cxVar.f46723f4.f41972r);
        } else {
            q9Var.setImageBitmap(PhotoViewer.p1().C4.n());
        }
        Activity parentActivity2 = cxVar.getParentActivity();
        h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar).resourceProvider;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(parentActivity2, h6Var2, true);
        ecVar.e(org.telegram.messenger.gd.N0(2131743320, null));
        ecVar.f34727b = new bh(this, 23);
        ebVar.setButton(ecVar);
        ebVar.getButton().setVisibility(8);
        if (z11) {
            i7 = 2131742528;
        } else {
            i7 = 2131742530;
        }
        o6Var.c(org.telegram.messenger.gd.N0(i7, null), true, true);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(cxVar).b(ebVar, -1);
        cxVar.f46738i4 = b10;
        b10.f35516r = false;
        b10.i(false);
        org.telegram.ui.Components.gc gcVar2 = cxVar.f46738i4;
        gcVar2.f35517s = true;
        gcVar2.j();
    }

    @Override
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                ow owVar = ow.this;
                cx cxVar = owVar.f50660a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    cxVar.f46728g4 = photoSize2.location;
                    cxVar.f46733h4 = photoSize.location;
                } else if (cxVar.f46728g4 == null) {
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
                    cxVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.o8(owVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                kVar.s().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        cx cxVar = this.f50660a;
        org.telegram.ui.Components.gc gcVar = cxVar.f46738i4;
        if (gcVar != null) {
            org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) gcVar.f35504e;
            wq0 wq0Var = new wq0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.q9 q9Var = xbVar.f42040c;
            org.telegram.ui.Components.q9 q9Var2 = xbVar.f42040c;
            q9Var.getLocationInWindow(iArr);
            wq0Var.f53494b = iArr[0];
            wq0Var.f53495c = iArr[1];
            wq0Var.d = cxVar.fragmentView;
            ImageReceiver imageReceiver = q9Var2.getImageReceiver();
            wq0Var.f53493a = imageReceiver;
            wq0Var.f53496e = imageReceiver.p();
            wq0Var.f53499i = 0;
            wq0Var.h = wq0Var.f53493a.X0;
            wq0Var.f53501k = q9Var2.getScaleX();
            return wq0Var;
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
