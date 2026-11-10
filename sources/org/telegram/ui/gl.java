package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
public final class gl implements org.telegram.ui.Cells.q0 {
    public final ll f46111a;

    public gl(ll llVar) {
        this.f46111a = llVar;
    }

    @Override
    public final void D(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i7;
        bk bkVar = this.f46111a.Q.Sa;
        FrameLayout frameLayout = bkVar.G;
        HashMap hashMap = bkVar.f47714f;
        Random random = bkVar.h;
        ArrayList arrayList = bkVar.F;
        if (arrayList.size() <= 12 && t0Var.getPhotoImage().L()) {
            float f10 = t0Var.getPhotoImage().N0;
            float f11 = t0Var.getPhotoImage().M0;
            if (f10 > 0.0f && f11 > 0.0f) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < arrayList.size()) {
                    if (((kx) arrayList.get(i10)).f47453p == t0Var.getMessageObject().e1()) {
                        i11++;
                        if (((kx) arrayList.get(i10)).f47455r.B() == null || ((kx) arrayList.get(i10)).f47455r.B().y()) {
                            return;
                        }
                    }
                    if (((kx) arrayList.get(i10)).f47454q != null && document != null) {
                        i7 = i10;
                        if (((kx) arrayList.get(i10)).f47454q.f26966id == document.f26966id) {
                            i12++;
                        }
                    } else {
                        i7 = i10;
                    }
                    i10 = i7 + 1;
                }
                if (i11 < 4) {
                    kx kxVar = new kx();
                    kxVar.h = true;
                    if (!kxVar.f47446i) {
                        kxVar.f47444f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        kxVar.f47445g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                    }
                    kxVar.f47453p = t0Var.getMessageObject().e1();
                    kxVar.f47450m = true;
                    kxVar.f47455r.f21225t0 = true;
                    int f12 = lx.f();
                    if (i12 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f26966id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f26966id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue);
                        sb2.append("_");
                        kxVar.f47455r.f21230v1 = a8.p0.n(kxVar.f47453p, "_", sb2);
                    }
                    kxVar.f47454q = document;
                    kxVar.f47455r.q0(org.telegram.messenger.hc.d(videoSize, document), com.google.android.recaptcha.internal.a.j(f12, "_", f12), null, "tgs", bkVar.f47712c, 1);
                    kxVar.f47455r.E0(Integer.MAX_VALUE);
                    kxVar.f47455r.W(0);
                    if (kxVar.f47455r.B() != null) {
                        if (kxVar.h) {
                            kxVar.f47455r.B().N(0, false, true);
                        }
                        kxVar.f47455r.B().start();
                    }
                    arrayList.add(kxVar);
                    if (bkVar.f47715n) {
                        kxVar.f47455r.P();
                        kxVar.f47455r.H0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void E(long j3) {
        cn cnVar = this.f46111a.Q;
        int i7 = cn.f44408kd;
        cnVar.Pa(j3);
    }

    @Override
    public final void F(org.telegram.ui.Cells.t0 t0Var) {
        cn cnVar = this.f46111a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject == null || cnVar.f44490f2 == null) {
            return;
        }
        if (org.telegram.messenger.t3.p0(cnVar.f44473e)) {
            cnVar.f44490f2.n(org.telegram.messenger.ij.u1(messageObject.f23266k), true);
        } else {
            cnVar.f44490f2.n(messageObject.Y1(), true);
        }
    }

    @Override
    public final void W(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i7;
        cn cnVar = this.f46111a.Q;
        if (str == null) {
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            ug.f1 f1Var = new ug.f1(cnVar, i7, cnVar.j(), new ug.j(tL_premiumGiftOption), null, cnVar.f44750za);
            f1Var.E2 = false;
            f1Var.X1 = t0Var.getMessageObject().N3();
            cnVar.showDialog(f1Var);
            return;
        }
        c(t0Var);
        vf.b bVar = cnVar.f44459cc;
        wg.g0 g0Var = wg.g0.N2;
        wg.c0.e1(LaunchActivity.Q(), str, bVar);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f46111a.Q.b();
    }

    public final void c(org.telegram.ui.Cells.t0 t0Var) {
        gm gmVar;
        cn cnVar = this.f46111a.Q;
        vf.b bVar = cnVar.f44459cc;
        if (bVar != null) {
            bVar.a(true);
        }
        if (t0Var.getMessageObject() == null) {
            gmVar = null;
        } else {
            gmVar = new gm(this, t0Var, 6);
        }
        cnVar.f44459cc = gmVar;
    }

    @Override
    public final void c0(org.telegram.ui.Cells.t0 t0Var, String str) {
        c(t0Var);
        cn cnVar = this.f46111a.Q;
        wg.c0.e1(cnVar, str, cnVar.f44459cc);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.t0 t0Var, int i7) {
        q8 q8Var = new q8(this, t0Var, i7, 3);
        cn cnVar = this.f46111a.Q;
        if (cnVar.C0.N) {
            cnVar.Qb(false, true, true);
            org.telegram.messenger.g0.i3(q8Var, 80L);
            return;
        }
        q8Var.run();
    }

    @Override
    public final void l(org.telegram.ui.Cells.t0 t0Var) {
        fj fjVar;
        cn cnVar = this.f46111a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.K1 = true;
        cj cjVar = cnVar.f44741z0;
        if (cjVar != null && (fjVar = cnVar.B0) != null && fjVar.f57030y < 0) {
            int childCount = cjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = cnVar.f44741z0.getChildAt(childCount);
                cnVar.f44741z0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            cnVar.g9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        cnVar.g9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        cnVar.Yc(messageObject, false);
    }

    @Override
    public final void m(org.telegram.ui.Cells.t0 t0Var, int i7, int i10) {
        l2.z zVar = new l2.z(this, t0Var, i7, i10, 11);
        cn cnVar = this.f46111a.Q;
        if (cnVar.C0.N) {
            cnVar.Qb(false, true, true);
            org.telegram.messenger.g0.i3(zVar, 80L);
            return;
        }
        zVar.run();
    }

    @Override
    public final void q(org.telegram.ui.Cells.t0 t0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z9;
        int i7;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        PhotoViewer p12 = PhotoViewer.p1();
        cn cnVar = this.f46111a.Q;
        p12.H2(null, cnVar, cnVar.f44750za);
        boolean z10 = false;
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f23277n0, 640, false, null, false);
        if (t0Var.getMessageObject().D == 24) {
            di.q9 orCreateStoryViewer = cnVar.getOrCreateStoryViewer();
            cj cjVar = cnVar.f44741z0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.ij messageObject2 = t0Var.getMessageObject();
            if (cnVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.f23266k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.e1();
                orCreateStoryViewer.L(cnVar.getParentActivity(), messageObject2.f23266k.media.storyItem, di.i7.a(cjVar));
            }
        } else if (t0Var.getMessageObject().D == 22) {
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            RadialProgress2 radialProgress2 = t0Var.J1;
            if (radialProgress2 != null && radialProgress2.f31498i.f36852q == 3 && messageObject.e1() < 0 && (str = s12.Q2) != null && TextUtils.equals(messageObject.f23266k.action.wallpaper.uploadingImage, str)) {
                s12.A();
                cnVar.ib(messageObject);
                return;
            }
            org.telegram.messenger.ij ijVar = t0Var.P0;
            if (ijVar != null && t0Var.U(ijVar) && t0Var.f30378x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.f23266k.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        tc1 tc1Var = new tc1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = tc1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            tc1Var.f50239g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = tc1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
                    h71 h71Var = new h71(wallPaper, cnVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z11 = wallPaperSettings3.blur;
                        boolean z12 = wallPaperSettings3.motion;
                        h71Var.G1 = z11;
                        h71Var.F1 = z12;
                        h71Var.f51603o1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    h71Var.f51609r0 = messageObject;
                    h71Var.h1(org.telegram.messenger.ij.B0(messageObject.f23266k));
                    h71Var.f51561a.f51930a = cnVar.f44750za;
                    h71Var.f51607q1 = new i71(cnVar, q10);
                    cnVar.presentFragment(h71Var);
                    return;
                }
                return;
            }
            cnVar.dc();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.f23266k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = org.telegram.messenger.w7.x(1000, messageObject.f23266k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.f23266k.action.photo.video_sizes;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if ((arrayList2.get(i10) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList2.get(i10) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                        videoSize2 = arrayList2.get(i10);
                        break;
                    }
                }
                videoSize2 = null;
            } else {
                videoSize = null;
                videoSize2 = null;
            }
            if (t0Var.getMessageObject().D == 21 && !messageObject.P3()) {
                if (!messageObject.f23287q) {
                    if (videoSize2 != null) {
                        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
                        j30Var.f34825a = cnVar;
                        j30Var.e();
                        j30Var.f34827c.d2.u0(null, videoSize2, 0L);
                        j30Var.f34826b = new bg.e0(cnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], cnVar.getUserConfig().e(), 0);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    org.telegram.messenger.hc.j(videoSize, messageObject.f23266k.action.photo);
                    org.telegram.messenger.w7 fileLoader = cnVar.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.f23266k.action.photo;
                        fileLoader.getClass();
                        I = org.telegram.messenger.w7.I(photo);
                    } else {
                        fileLoader.getClass();
                        I = org.telegram.messenger.w7.I(videoSize);
                    }
                    File file = new File(org.telegram.messenger.w7.z(4), I.getName());
                    if (!I.exists()) {
                        if (file.exists()) {
                            I = file;
                        } else {
                            return;
                        }
                    }
                    org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, I.getAbsolutePath(), 0, false, 0, 0);
                    gfVar.f26848a = cnVar.Z.getFieldText();
                    if (videoSize != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    gfVar.f26849b = z9;
                    arrayList3.add(gfVar);
                    PhotoViewer.p1().e2(arrayList3, 0, 1, false, new fl(this, messageObject, gfVar), null);
                    if (gfVar.f26849b) {
                        PhotoViewer.p1().L2(org.telegram.messenger.id.M0(2131744372, null));
                    } else {
                        PhotoViewer.p1().L2(org.telegram.messenger.id.M0(2131744375, null));
                    }
                    org.telegram.ui.Components.h30 h30Var = new org.telegram.ui.Components.h30(1, cnVar.getUserConfig().f());
                    if (videoSize != null) {
                        z10 = true;
                    }
                    h30Var.f34153e = z10;
                    h30Var.f34151b = cnVar.getMessagesController().a2(Long.valueOf(cnVar.f44545j6));
                    PhotoViewer.p1().u2(h30Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.p1().b2(videoSize.location, org.telegram.messenger.hc.j(videoSize, messageObject.f23266k.action.photo), cnVar.f44444bb);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().L2(org.telegram.messenger.id.M0(2131744372, null));
                }
            } else if (w10 != null) {
                PhotoViewer.p1().b2(w10.location, org.telegram.messenger.hc.i(w10, messageObject.f23266k.action.photo), cnVar.f44444bb);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().L2(org.telegram.messenger.id.M0(2131744375, null));
                }
            } else {
                PhotoViewer.p1().d2(messageObject, null, 0L, 0L, 0L, cnVar.f44444bb);
            }
        }
    }

    @Override
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        boolean z9;
        cn cnVar = this.f46111a.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
        if (z9) {
            return false;
        }
        return cnVar.Y7(t0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void s(org.telegram.ui.Cells.t0 t0Var) {
        cn cnVar = this.f46111a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !t0Var.getMessageObject().P3() && t0Var.getMessageObject().Y4() && t0Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.getResourceProvider());
            String M0 = org.telegram.messenger.id.M0(2131746284, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131746285, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new w0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            cnVar.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, cnVar.getResourceProvider());
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f2 t() {
        return this.f46111a.Q;
    }

    @Override
    public final void t0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        this.f46111a.Q.m8(t0Var, reactionCount, z9, f10, f11);
    }

    @Override
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
