package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class nw implements org.telegram.ui.Components.t30 {
    public final bx f50440a;

    public nw(bx bxVar) {
        this.f50440a = bxVar;
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Components.fc fcVar = this.f50440a.f46568i4;
        if (fcVar != null) {
            ((org.telegram.ui.Components.wb) fcVar.f35087e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void P(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i7;
        bx bxVar = this.f50440a;
        org.telegram.ui.Components.fc fcVar = bxVar.f46568i4;
        if (fcVar != null) {
            fcVar.b();
            bxVar.f46568i4 = null;
        }
        Activity parentActivity = bxVar.getParentActivity();
        i6Var = ((org.telegram.ui.ActionBar.g2) bxVar).resourceProvider;
        ?? dbVar = new org.telegram.ui.Components.db(parentActivity, i6Var);
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(dbVar, parentActivity);
        dbVar.f41568b = vbVar;
        vbVar.setWillNotDraw(false);
        dbVar.addView(vbVar, c8.na.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
        dbVar.f41569c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        vbVar.addView(p9Var, c8.na.e(28, 28, 17));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(parentActivity, false, false, false);
        dbVar.d = n6Var;
        n6Var.setTypeface(Typeface.SANS_SERIF);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        dbVar.addView(n6Var, c8.na.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        dbVar.setTextColor(dbVar.getThemedColor(org.telegram.ui.ActionBar.n6.yj));
        dbVar.setBackground(dbVar.getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        if (z10) {
            p9Var.setImageBitmap(bxVar.f46553f4.f40256r);
        } else {
            p9Var.setImageBitmap(PhotoViewer.p1().C4.n());
        }
        Activity parentActivity2 = bxVar.getParentActivity();
        i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar).resourceProvider;
        org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(parentActivity2, i6Var2, true);
        dcVar.e(org.telegram.messenger.gd.N0(2131743313, null));
        dcVar.f34267b = new ch(this, 23);
        dbVar.setButton(dcVar);
        dbVar.getButton().setVisibility(8);
        if (z11) {
            i7 = 2131742521;
        } else {
            i7 = 2131742523;
        }
        n6Var.c(org.telegram.messenger.gd.N0(i7, null), true, true);
        org.telegram.ui.Components.fc b10 = org.telegram.ui.Components.kc.b0(bxVar).b(dbVar, -1);
        bxVar.f46568i4 = b10;
        b10.f35099r = false;
        b10.i(false);
        org.telegram.ui.Components.fc fcVar2 = bxVar.f46568i4;
        fcVar2.f35100s = true;
        fcVar2.j();
    }

    @Override
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                nw nwVar = nw.this;
                bx bxVar = nwVar.f50440a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    bxVar.f46558g4 = photoSize2.location;
                    bxVar.f46563h4 = photoSize.location;
                } else if (bxVar.f46558g4 == null) {
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
                    bxVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new di.o8(nwVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                kVar.s().requestLayout();
            }
        });
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        bx bxVar = this.f50440a;
        org.telegram.ui.Components.fc fcVar = bxVar.f46568i4;
        if (fcVar != null) {
            org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) fcVar.f35087e;
            wq0 wq0Var = new wq0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.p9 p9Var = wbVar.f41569c;
            org.telegram.ui.Components.p9 p9Var2 = wbVar.f41569c;
            p9Var.getLocationInWindow(iArr);
            wq0Var.f53727b = iArr[0];
            wq0Var.f53728c = iArr[1];
            wq0Var.d = bxVar.fragmentView;
            ImageReceiver imageReceiver = p9Var2.getImageReceiver();
            wq0Var.f53726a = imageReceiver;
            wq0Var.f53729e = imageReceiver.p();
            wq0Var.f53732i = 0;
            wq0Var.h = wq0Var.f53726a.X0;
            wq0Var.f53734k = p9Var2.getScaleX();
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
