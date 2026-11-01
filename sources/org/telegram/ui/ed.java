package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ed implements Runnable {
    public final int f36795a;
    public final TLRPC.PhotoSize f36796b;
    public final TLRPC.InputFile f36797c;
    public final TLRPC.InputFile d;
    public final TLRPC.VideoSize e;
    public final TLRPC.PhotoSize f36798f;
    public final double h;
    public final String f36799n;
    public final org.telegram.ui.Components.a40 f36800r;

    public ed(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f36795a = i10;
        this.f36800r = (org.telegram.ui.Components.a40) k2Var;
        this.f36797c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f36799n = str;
        this.h = d;
        this.f36796b = photoSize;
        this.f36798f = photoSize2;
    }

    @Override
    public final void run() {
        long j10;
        int i10 = this.f36795a;
        double d = this.h;
        String str = this.f36799n;
        TLRPC.VideoSize videoSize = this.e;
        TLRPC.InputFile inputFile = this.d;
        TLRPC.InputFile inputFile2 = this.f36797c;
        TLRPC.PhotoSize photoSize = this.f36798f;
        TLRPC.PhotoSize photoSize2 = this.f36796b;
        org.telegram.ui.Components.a40 a40Var = this.f36800r;
        switch (i10) {
            case 0:
                kd kdVar = (kd) a40Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation = photoSize2.location;
                    kdVar.D = fileLocation;
                    kdVar.E = photoSize.location;
                    kdVar.f38814f.j(org.telegram.messenger.jc.e(fileLocation), "50_50", kdVar.f38834w, null);
                    kdVar.k0(true, false);
                    return;
                }
                kdVar.m0 = inputFile2;
                kdVar.f38823n0 = inputFile;
                kdVar.f38824o0 = videoSize;
                kdVar.f38825p0 = str;
                kdVar.f38826q0 = d;
                if (kdVar.f38828r0) {
                    org.telegram.ui.ActionBar.x1 x1Var = kdVar.f38833v0;
                    if (x1Var != null) {
                        try {
                            x1Var.dismiss();
                            kdVar.f38833v0 = null;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    kdVar.m0(false);
                    kdVar.f38830s0 = false;
                    kdVar.f38806a.performClick();
                }
                kdVar.k0(false, true);
                kdVar.f38822n.setImageDrawable(null);
                return;
            case 1:
                oo ooVar = (oo) a40Var;
                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                ooVar.f40229u0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.f36797c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    ag.d2 d2Var = ooVar.e;
                    org.telegram.messenger.jc e7 = org.telegram.messenger.jc.e(fileLocation2);
                    org.telegram.ui.Components.r8 r8Var = ooVar.f40224r;
                    Object obj = ooVar.C0;
                    if (obj == null) {
                        obj = ooVar.f40232w0;
                    }
                    d2Var.j(e7, "50_50", r8Var, obj);
                    ooVar.f40206b0.o(2131232046, org.telegram.messenger.dd.L0(2131752213, "ChatSetNewPhoto"), true);
                    if (ooVar.R0 == null) {
                        ooVar.R0 = new org.telegram.ui.Components.ci0(2131623965, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                    }
                    ooVar.f40206b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                    ooVar.f40206b0.e.setAnimation(ooVar.R0);
                    ooVar.s0(true, false);
                    return;
                }
                int i11 = (ooVar.B0 > 0L ? 1 : (ooVar.B0 == 0L ? 0 : -1));
                double d10 = this.h;
                if (i11 != 0) {
                    TLRPC.User user = ooVar.C0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = ooVar.C0.photo;
                        if (inputFile3 != null) {
                            j10 = inputFile3.f19808id;
                        } else if (inputFile4 != null) {
                            j10 = inputFile4.f19808id;
                        } else {
                            j10 = 0;
                        }
                        userProfilePhoto.photo_id = j10;
                        userProfilePhoto.photo_big = photoSize.location;
                        userProfilePhoto.photo_small = photoSize2.location;
                        ooVar.getMessagesController().U3(ooVar.C0, true, false);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i12 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d10;
                        tL_photos_uploadProfilePhoto.flags = i12 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = ooVar.getMessagesController().p1(ooVar.C0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    ooVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new fo(ooVar, 1));
                } else {
                    ooVar.getMessagesController().B(ooVar.f40230v0, null, inputFile3, inputFile4, videoSize2, d10, this.f36799n, photoSize2.location, photoSize.location, null);
                }
                if (ooVar.M0) {
                    try {
                        org.telegram.ui.ActionBar.x1 x1Var2 = ooVar.f40205b;
                        if (x1Var2 != null && x1Var2.isShowing()) {
                            ooVar.f40205b.dismiss();
                            ooVar.f40205b = null;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, true);
                    }
                    ooVar.N0 = false;
                    ooVar.f40203a.performClick();
                }
                ooVar.s0(false, true);
                return;
            case 2:
                i40 i40Var = (i40) a40Var;
                long j11 = i40Var.e;
                a50 a50Var = i40Var.f37936f;
                org.telegram.messenger.c cVar = a50Var.f35620k1;
                TLRPC.InputFile inputFile5 = this.f36797c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    i40Var.f37935c = photoSize2.location;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    i40Var.f37934b = fileLocation3;
                    org.telegram.messenger.jc e11 = org.telegram.messenger.jc.e(fileLocation3);
                    i40Var.d = e11;
                    a50Var.f35610i1.A(e11, org.telegram.messenger.jc.e(i40Var.f37935c));
                    org.telegram.messenger.i0.a4(a50Var.H1);
                    return;
                }
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d11 = this.h;
                String str2 = this.f36799n;
                if (i13 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile5;
                        tL_photos_uploadProfilePhoto2.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile6;
                        int i14 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d11;
                        tL_photos_uploadProfilePhoto2.flags = i14 | 6;
                    }
                    if (videoSize3 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize3;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    ConnectionsManager.getInstance(cVar.f15043a).sendRequest(tL_photos_uploadProfilePhoto2, new org.telegram.ui.Components.t20(13, i40Var, str2));
                    return;
                }
                org.telegram.messenger.wp.r1(cVar.f15043a).B(-j11, null, inputFile5, inputFile6, videoSize3, d11, str2, photoSize2.location, photoSize.location, new yy(i40Var, 7));
                return;
            case 3:
                b60 b60Var = (b60) a40Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    b60Var.D = fileLocation4;
                    b60Var.E = photoSize.location;
                    b60Var.d.j(org.telegram.messenger.jc.e(fileLocation4), "50_50", b60Var.f35958r, null);
                    b60Var.e0(true, false);
                    return;
                }
                b60Var.F = inputFile2;
                b60Var.G = inputFile;
                b60Var.H = videoSize;
                b60Var.I = str;
                b60Var.J = d;
                if (b60Var.L) {
                    b60Var.getMessagesController().U(b60Var.f35955c.getText().toString(), b60Var.K, null, b60Var.P, b60Var.S, b60Var.U, b60Var.T, b60Var.W, b60Var);
                }
                b60Var.e0(false, true);
                b60Var.f35956f.setImageDrawable(null);
                return;
            case 4:
                ProfileActivity.j0((ProfileActivity) a40Var, this.f36797c, this.d, this.e, this.h, this.f36799n, this.f36796b, this.f36798f);
                return;
            case 5:
                c51.e0((c51) a40Var, this.f36797c, this.d, this.e, this.h, this.f36799n, this.f36796b, this.f36798f);
                return;
            default:
                yh.l lVar = (yh.l) a40Var;
                TLRPC.FileLocation fileLocation5 = photoSize2.location;
                lVar.G = fileLocation5;
                TLRPC.InputFile inputFile7 = this.f36797c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    lVar.f54510x.j(org.telegram.messenger.jc.e(fileLocation5), "50_50", lVar.E, lVar.I);
                    lVar.f0(true, false);
                } else {
                    lVar.getMessagesController().B(lVar.f54504c, null, inputFile7, inputFile8, videoSize4, this.h, this.f36799n, photoSize2.location, photoSize.location, null);
                    lVar.f0(false, true);
                }
                lVar.e.f31183f3.O(true);
                return;
        }
    }

    public ed(oo ooVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f36795a = 1;
        this.f36800r = ooVar;
        this.f36796b = photoSize;
        this.f36797c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f36798f = photoSize2;
        this.h = d;
        this.f36799n = str;
    }

    public ed(org.telegram.ui.Components.a40 a40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f36795a = i10;
        this.f36800r = a40Var;
        this.f36797c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.f36799n = str;
        this.f36796b = photoSize;
        this.f36798f = photoSize2;
    }

    public ed(yh.l lVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f36795a = 6;
        this.f36800r = lVar;
        this.f36796b = photoSize;
        this.f36797c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.f36799n = str;
        this.f36798f = photoSize2;
    }
}
