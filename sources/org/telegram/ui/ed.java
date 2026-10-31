package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ed implements Runnable {
    public final int f37017a;
    public final TLRPC.PhotoSize f37018b;
    public final TLRPC.InputFile f37019c;
    public final TLRPC.InputFile d;
    public final TLRPC.VideoSize e;
    public final TLRPC.PhotoSize f37020f;
    public final double h;
    public final String f37021n;
    public final org.telegram.ui.Components.a40 f37022r;

    public ed(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f37017a = i10;
        this.f37022r = (org.telegram.ui.Components.a40) k2Var;
        this.f37019c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f37021n = str;
        this.h = d;
        this.f37018b = photoSize;
        this.f37020f = photoSize2;
    }

    @Override
    public final void run() {
        long j10;
        int i10 = this.f37017a;
        double d = this.h;
        String str = this.f37021n;
        TLRPC.VideoSize videoSize = this.e;
        TLRPC.InputFile inputFile = this.d;
        TLRPC.InputFile inputFile2 = this.f37019c;
        TLRPC.PhotoSize photoSize = this.f37020f;
        TLRPC.PhotoSize photoSize2 = this.f37018b;
        org.telegram.ui.Components.a40 a40Var = this.f37022r;
        switch (i10) {
            case 0:
                kd kdVar = (kd) a40Var;
                if (inputFile2 == null && inputFile == null) {
                    TLRPC.FileLocation fileLocation = photoSize2.location;
                    kdVar.D = fileLocation;
                    kdVar.E = photoSize.location;
                    kdVar.f38751f.j(org.telegram.messenger.ic.e(fileLocation), "50_50", kdVar.f38771w, null);
                    kdVar.j0(true, false);
                    return;
                }
                kdVar.m0 = inputFile2;
                kdVar.f38760n0 = inputFile;
                kdVar.f38761o0 = videoSize;
                kdVar.f38762p0 = str;
                kdVar.f38763q0 = d;
                if (kdVar.f38765r0) {
                    org.telegram.ui.ActionBar.x1 x1Var = kdVar.f38770v0;
                    if (x1Var != null) {
                        try {
                            x1Var.dismiss();
                            kdVar.f38770v0 = null;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    kdVar.l0(false);
                    kdVar.f38767s0 = false;
                    kdVar.f38743a.performClick();
                }
                kdVar.j0(false, true);
                kdVar.f38759n.setImageDrawable(null);
                return;
            case 1:
                oo ooVar = (oo) a40Var;
                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                ooVar.f40340u0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.f37019c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    ag.d2 d2Var = ooVar.e;
                    org.telegram.messenger.ic e7 = org.telegram.messenger.ic.e(fileLocation2);
                    org.telegram.ui.Components.r8 r8Var = ooVar.f40335r;
                    Object obj = ooVar.C0;
                    if (obj == null) {
                        obj = ooVar.f40343w0;
                    }
                    d2Var.j(e7, "50_50", r8Var, obj);
                    ooVar.f40317b0.o(2131232046, org.telegram.messenger.cd.L0(2131752213, "ChatSetNewPhoto"), true);
                    if (ooVar.R0 == null) {
                        ooVar.R0 = new org.telegram.ui.Components.bi0(2131623965, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                    }
                    ooVar.f40317b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                    ooVar.f40317b0.e.setAnimation(ooVar.R0);
                    ooVar.r0(true, false);
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
                            j10 = inputFile3.f19807id;
                        } else if (inputFile4 != null) {
                            j10 = inputFile4.f19807id;
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
                    ooVar.getMessagesController().B(ooVar.f40341v0, null, inputFile3, inputFile4, videoSize2, d10, this.f37021n, photoSize2.location, photoSize.location, null);
                }
                if (ooVar.M0) {
                    try {
                        org.telegram.ui.ActionBar.x1 x1Var2 = ooVar.f40316b;
                        if (x1Var2 != null && x1Var2.isShowing()) {
                            ooVar.f40316b.dismiss();
                            ooVar.f40316b = null;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, true);
                    }
                    ooVar.N0 = false;
                    ooVar.f40314a.performClick();
                }
                ooVar.r0(false, true);
                return;
            case 2:
                j40 j40Var = (j40) a40Var;
                long j11 = j40Var.e;
                b50 b50Var = j40Var.f38426f;
                org.telegram.messenger.c cVar = b50Var.f36036k1;
                TLRPC.InputFile inputFile5 = this.f37019c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    j40Var.f38425c = photoSize2.location;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    j40Var.f38424b = fileLocation3;
                    org.telegram.messenger.ic e11 = org.telegram.messenger.ic.e(fileLocation3);
                    j40Var.d = e11;
                    b50Var.f36026i1.A(e11, org.telegram.messenger.ic.e(j40Var.f38425c));
                    org.telegram.messenger.i0.a4(b50Var.H1);
                    return;
                }
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                double d11 = this.h;
                String str2 = this.f37021n;
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
                    ConnectionsManager.getInstance(cVar.f14863a).sendRequest(tL_photos_uploadProfilePhoto2, new org.telegram.ui.Components.t20(13, j40Var, str2));
                    return;
                }
                org.telegram.messenger.vp.r1(cVar.f14863a).B(-j11, null, inputFile5, inputFile6, videoSize3, d11, str2, photoSize2.location, photoSize.location, new zy(j40Var, 7));
                return;
            case 3:
                c60 c60Var = (c60) a40Var;
                if (inputFile2 == null && inputFile == null && videoSize == null) {
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    c60Var.D = fileLocation4;
                    c60Var.E = photoSize.location;
                    c60Var.d.j(org.telegram.messenger.ic.e(fileLocation4), "50_50", c60Var.f36396r, null);
                    c60Var.d0(true, false);
                    return;
                }
                c60Var.F = inputFile2;
                c60Var.G = inputFile;
                c60Var.H = videoSize;
                c60Var.I = str;
                c60Var.J = d;
                if (c60Var.L) {
                    c60Var.getMessagesController().U(c60Var.f36393c.getText().toString(), c60Var.K, null, c60Var.P, c60Var.S, c60Var.U, c60Var.T, c60Var.W, c60Var);
                }
                c60Var.d0(false, true);
                c60Var.f36394f.setImageDrawable(null);
                return;
            case 4:
                ProfileActivity.i0((ProfileActivity) a40Var, this.f37019c, this.d, this.e, this.h, this.f37021n, this.f37018b, this.f37020f);
                return;
            case 5:
                e51.d0((e51) a40Var, this.f37019c, this.d, this.e, this.h, this.f37021n, this.f37018b, this.f37020f);
                return;
            default:
                yh.l lVar = (yh.l) a40Var;
                TLRPC.FileLocation fileLocation5 = photoSize2.location;
                lVar.G = fileLocation5;
                TLRPC.InputFile inputFile7 = this.f37019c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile7 == null && inputFile8 == null && videoSize4 == null) {
                    lVar.f54506x.j(org.telegram.messenger.ic.e(fileLocation5), "50_50", lVar.E, lVar.I);
                    lVar.e0(true, false);
                } else {
                    lVar.getMessagesController().B(lVar.f54500c, null, inputFile7, inputFile8, videoSize4, this.h, this.f37021n, photoSize2.location, photoSize.location, null);
                    lVar.e0(false, true);
                }
                lVar.e.f30819f3.O(true);
                return;
        }
    }

    public ed(oo ooVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f37017a = 1;
        this.f37022r = ooVar;
        this.f37018b = photoSize;
        this.f37019c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f37020f = photoSize2;
        this.h = d;
        this.f37021n = str;
    }

    public ed(org.telegram.ui.Components.a40 a40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f37017a = i10;
        this.f37022r = a40Var;
        this.f37019c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.f37021n = str;
        this.f37018b = photoSize;
        this.f37020f = photoSize2;
    }

    public ed(yh.l lVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f37017a = 6;
        this.f37022r = lVar;
        this.f37018b = photoSize;
        this.f37019c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.f37021n = str;
        this.f37020f = photoSize2;
    }
}
