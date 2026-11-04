package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class gw implements org.telegram.ui.Components.e30 {
    public final uw f45723a;

    public gw(uw uwVar) {
        this.f45723a = uwVar;
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Components.ac acVar = this.f45723a.f50228e4;
        if (acVar != null) {
            ((org.telegram.ui.Components.rb) acVar.f31788e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i3;
        uw uwVar = this.f45723a;
        org.telegram.ui.Components.ac acVar = uwVar.f50228e4;
        if (acVar != null) {
            acVar.b();
            uwVar.f50228e4 = null;
        }
        Activity parentActivity = uwVar.getParentActivity();
        e6Var = ((org.telegram.ui.ActionBar.d2) uwVar).resourceProvider;
        ?? yaVar = new org.telegram.ui.Components.ya(parentActivity, e6Var);
        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(yaVar, parentActivity);
        yaVar.f37698b = qbVar;
        qbVar.setWillNotDraw(false);
        yaVar.addView(qbVar, b8.mf.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
        yaVar.f37699c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        qbVar.addView(k9Var, b8.mf.e(28, 28, 17));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(parentActivity, false, false, false);
        yaVar.d = h6Var;
        h6Var.setTypeface(Typeface.SANS_SERIF);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        yaVar.addView(h6Var, b8.mf.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        yaVar.setTextColor(yaVar.getThemedColor(org.telegram.ui.ActionBar.k6.vj));
        yaVar.setBackground(yaVar.getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        if (z10) {
            k9Var.setImageBitmap(uwVar.f50212b4.f33687r);
        } else {
            k9Var.setImageBitmap(PhotoViewer.v1().D4.n());
        }
        Activity parentActivity2 = uwVar.getParentActivity();
        e6Var2 = ((org.telegram.ui.ActionBar.d2) uwVar).resourceProvider;
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(parentActivity2, e6Var2, true);
        ybVar.e(org.telegram.messenger.bd.M0(2131743573, null));
        ybVar.f40672b = new xg(this, 23);
        yaVar.setButton(ybVar);
        yaVar.getButton().setVisibility(8);
        if (z11) {
            i3 = 2131742802;
        } else {
            i3 = 2131742804;
        }
        h6Var.c(org.telegram.messenger.bd.M0(i3, null), true, true);
        org.telegram.ui.Components.ac b10 = org.telegram.ui.Components.fc.a0(uwVar).b(yaVar, -1);
        uwVar.f50228e4 = b10;
        b10.f31800r = false;
        b10.i(false);
        org.telegram.ui.Components.ac acVar2 = uwVar.f50228e4;
        acVar2.f31801s = true;
        acVar2.j();
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                gw gwVar = gw.this;
                uw uwVar = gwVar.f45723a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    uwVar.f50217c4 = photoSize2.location;
                    uwVar.f50222d4 = photoSize.location;
                } else if (uwVar.f50217c4 == null) {
                    return;
                } else {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i3 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i3 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    uwVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.t8(gwVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                kVar.q().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final mq0 getCloseIntoObject() {
        uw uwVar = this.f45723a;
        org.telegram.ui.Components.ac acVar = uwVar.f50228e4;
        if (acVar != null) {
            org.telegram.ui.Components.rb rbVar = (org.telegram.ui.Components.rb) acVar.f31788e;
            mq0 mq0Var = new mq0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.k9 k9Var = rbVar.f37699c;
            org.telegram.ui.Components.k9 k9Var2 = rbVar.f37699c;
            k9Var.getLocationInWindow(iArr);
            mq0Var.f47752b = iArr[0];
            mq0Var.f47753c = iArr[1];
            mq0Var.d = uwVar.fragmentView;
            ImageReceiver imageReceiver = k9Var2.getImageReceiver();
            mq0Var.f47751a = imageReceiver;
            mq0Var.f47754e = imageReceiver.p();
            mq0Var.f47757i = 0;
            mq0Var.h = mq0Var.f47751a.X0;
            mq0Var.f47759k = k9Var2.getScaleX();
            return mq0Var;
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
