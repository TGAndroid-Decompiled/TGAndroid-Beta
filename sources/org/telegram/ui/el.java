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
public final class el implements org.telegram.ui.Cells.q0 {
    public final jl f45372a;

    public el(jl jlVar) {
        this.f45372a = jlVar;
    }

    @Override
    public final void D(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i7;
        zj zjVar = this.f45372a.Q.Qa;
        FrameLayout frameLayout = zjVar.G;
        HashMap hashMap = zjVar.f46763f;
        Random random = zjVar.h;
        ArrayList arrayList = zjVar.F;
        if (arrayList.size() <= 12 && t0Var.getPhotoImage().L()) {
            float f10 = t0Var.getPhotoImage().N0;
            float f11 = t0Var.getPhotoImage().M0;
            if (f10 > 0.0f && f11 > 0.0f) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < arrayList.size()) {
                    if (((hx) arrayList.get(i10)).f46517p == t0Var.getMessageObject().f1()) {
                        i11++;
                        if (((hx) arrayList.get(i10)).f46519r.B() == null || ((hx) arrayList.get(i10)).f46519r.B().y()) {
                            return;
                        }
                    }
                    if (((hx) arrayList.get(i10)).f46518q != null && document != null) {
                        i7 = i10;
                        if (((hx) arrayList.get(i10)).f46518q.f26959id == document.f26959id) {
                            i12++;
                        }
                    } else {
                        i7 = i10;
                    }
                    i10 = i7 + 1;
                }
                if (i11 < 4) {
                    hx hxVar = new hx();
                    hxVar.h = true;
                    if (!hxVar.f46510i) {
                        hxVar.f46508f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        hxVar.f46509g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                    }
                    hxVar.f46517p = t0Var.getMessageObject().f1();
                    hxVar.f46514m = true;
                    hxVar.f46519r.f21217t0 = true;
                    int f12 = ix.f();
                    if (i12 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f26959id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f26959id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue);
                        sb2.append("_");
                        hxVar.f46519r.f21222v1 = a8.p0.n(hxVar.f46517p, "_", sb2);
                    }
                    hxVar.f46518q = document;
                    hxVar.f46519r.q0(org.telegram.messenger.hc.d(videoSize, document), com.google.android.recaptcha.internal.a.j(f12, "_", f12), null, "tgs", zjVar.f46761c, 1);
                    hxVar.f46519r.E0(Integer.MAX_VALUE);
                    hxVar.f46519r.W(0);
                    if (hxVar.f46519r.B() != null) {
                        if (hxVar.h) {
                            hxVar.f46519r.B().N(0, false, true);
                        }
                        hxVar.f46519r.B().start();
                    }
                    arrayList.add(hxVar);
                    if (zjVar.f46764n) {
                        hxVar.f46519r.P();
                        hxVar.f46519r.H0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void E(long j3) {
        an anVar = this.f45372a.Q;
        int i7 = an.f43706id;
        anVar.Na(j3);
    }

    @Override
    public final void F(org.telegram.ui.Cells.t0 t0Var) {
        an anVar = this.f45372a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject == null || anVar.f43788f2 == null) {
            return;
        }
        if (org.telegram.messenger.t3.p0(anVar.f43771e)) {
            anVar.f43788f2.n(org.telegram.messenger.ij.v1(messageObject.f23244k), true);
        } else {
            anVar.f43788f2.n(messageObject.Z1(), true);
        }
    }

    @Override
    public final void W(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i7;
        an anVar = this.f45372a.Q;
        if (str == null) {
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            ug.f1 f1Var = new ug.f1(anVar, i7, anVar.j(), new ug.j(tL_premiumGiftOption), null, anVar.f44022xa);
            f1Var.B2 = false;
            f1Var.U1 = t0Var.getMessageObject().O3();
            anVar.showDialog(f1Var);
            return;
        }
        c(t0Var);
        vf.b bVar = anVar.f43728ac;
        wg.g0 g0Var = wg.g0.K2;
        wg.c0.e1(LaunchActivity.Q(), str, bVar);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f45372a.Q.b();
    }

    public final void c(org.telegram.ui.Cells.t0 t0Var) {
        em emVar;
        an anVar = this.f45372a.Q;
        vf.b bVar = anVar.f43728ac;
        if (bVar != null) {
            bVar.a(true);
        }
        if (t0Var.getMessageObject() == null) {
            emVar = null;
        } else {
            emVar = new em(this, t0Var, 6);
        }
        anVar.f43728ac = emVar;
    }

    @Override
    public final void c0(org.telegram.ui.Cells.t0 t0Var, String str) {
        c(t0Var);
        an anVar = this.f45372a.Q;
        wg.c0.e1(anVar, str, anVar.f43728ac);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void i(org.telegram.ui.Cells.t0 t0Var, int i7) {
        q8 q8Var = new q8(this, t0Var, i7, 3);
        an anVar = this.f45372a.Q;
        if (anVar.C0.N) {
            anVar.Nb(false, true, true);
            org.telegram.messenger.g0.i3(q8Var, 80L);
            return;
        }
        q8Var.run();
    }

    @Override
    public final void l(org.telegram.ui.Cells.t0 t0Var) {
        dj djVar;
        an anVar = this.f45372a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.K1 = true;
        aj ajVar = anVar.f44037z0;
        if (ajVar != null && (djVar = anVar.B0) != null && djVar.f56929y < 0) {
            int childCount = ajVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = anVar.f44037z0.getChildAt(childCount);
                anVar.f44037z0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            anVar.f9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        anVar.f9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        anVar.Vc(messageObject, false);
    }

    @Override
    public final void m(org.telegram.ui.Cells.t0 t0Var, int i7, int i10) {
        l2.a0 a0Var = new l2.a0(this, t0Var, i7, i10, 11);
        an anVar = this.f45372a.Q;
        if (anVar.C0.N) {
            anVar.Nb(false, true, true);
            org.telegram.messenger.g0.i3(a0Var, 80L);
            return;
        }
        a0Var.run();
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
        an anVar = this.f45372a.Q;
        p12.H2(null, anVar, anVar.f44022xa);
        boolean z10 = false;
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f23255n0, 640, false, null, false);
        if (t0Var.getMessageObject().D == 24) {
            di.p9 orCreateStoryViewer = anVar.getOrCreateStoryViewer();
            aj ajVar = anVar.f44037z0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.ij messageObject2 = t0Var.getMessageObject();
            if (anVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.f23244k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.f1();
                orCreateStoryViewer.L(anVar.getParentActivity(), messageObject2.f23244k.media.storyItem, di.h7.a(ajVar));
            }
        } else if (t0Var.getMessageObject().D == 22) {
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            RadialProgress2 radialProgress2 = t0Var.J1;
            if (radialProgress2 != null && radialProgress2.f31478i.f36830q == 3 && messageObject.f1() < 0 && (str = s12.Q2) != null && TextUtils.equals(messageObject.f23244k.action.wallpaper.uploadingImage, str)) {
                s12.A();
                anVar.fb(messageObject);
                return;
            }
            org.telegram.messenger.ij ijVar = t0Var.P0;
            if (ijVar != null && t0Var.U(ijVar) && t0Var.f30359x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.f23244k.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        oc1 oc1Var = new oc1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = oc1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            oc1Var.f48376g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = oc1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                    e71 e71Var = new e71(wallPaper, anVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z11 = wallPaperSettings3.blur;
                        boolean z12 = wallPaperSettings3.motion;
                        e71Var.G1 = z11;
                        e71Var.F1 = z12;
                        e71Var.f50307o1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    e71Var.f50313r0 = messageObject;
                    e71Var.h1(org.telegram.messenger.ij.B0(messageObject.f23244k));
                    e71Var.f50265a.f50583a = anVar.f44022xa;
                    e71Var.f50311q1 = new f71(anVar, q10);
                    anVar.presentFragment(e71Var);
                    return;
                }
                return;
            }
            anVar.ac();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.f23244k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = org.telegram.messenger.w7.x(1000, messageObject.f23244k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.f23244k.action.photo.video_sizes;
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
            if (t0Var.getMessageObject().D == 21 && !messageObject.Q3()) {
                if (!messageObject.f23265q) {
                    if (videoSize2 != null) {
                        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
                        j30Var.f34858a = anVar;
                        j30Var.e();
                        j30Var.f34860c.f32924a2.u0(null, videoSize2, 0L);
                        j30Var.f34859b = new bg.e0(anVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], anVar.getUserConfig().e(), 0);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    org.telegram.messenger.hc.j(videoSize, messageObject.f23244k.action.photo);
                    org.telegram.messenger.w7 fileLoader = anVar.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.f23244k.action.photo;
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
                    gfVar.f26823a = anVar.Z.getFieldText();
                    if (videoSize != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    gfVar.f26824b = z9;
                    arrayList3.add(gfVar);
                    PhotoViewer.p1().e2(arrayList3, 0, 1, false, new dl(this, messageObject, gfVar), null);
                    if (gfVar.f26824b) {
                        PhotoViewer.p1().L2(org.telegram.messenger.hd.M0(2131744373, null));
                    } else {
                        PhotoViewer.p1().L2(org.telegram.messenger.hd.M0(2131744376, null));
                    }
                    org.telegram.ui.Components.h30 h30Var = new org.telegram.ui.Components.h30(1, anVar.getUserConfig().f());
                    if (videoSize != null) {
                        z10 = true;
                    }
                    h30Var.f34168e = z10;
                    h30Var.f34166b = anVar.getMessagesController().a2(Long.valueOf(anVar.f43842j6));
                    PhotoViewer.p1().u2(h30Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.p1().b2(videoSize.location, org.telegram.messenger.hc.j(videoSize, messageObject.f23244k.action.photo), anVar.Za);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().L2(org.telegram.messenger.hd.M0(2131744373, null));
                }
            } else if (w10 != null) {
                PhotoViewer.p1().b2(w10.location, org.telegram.messenger.hc.i(w10, messageObject.f23244k.action.photo), anVar.Za);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().L2(org.telegram.messenger.hd.M0(2131744376, null));
                }
            } else {
                PhotoViewer.p1().d2(messageObject, null, 0L, 0L, 0L, anVar.Za);
            }
        }
    }

    @Override
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        boolean z9;
        an anVar = this.f45372a.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        if (z9) {
            return false;
        }
        return anVar.X7(t0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void s(org.telegram.ui.Cells.t0 t0Var) {
        an anVar = this.f45372a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !t0Var.getMessageObject().Q3() && t0Var.getMessageObject().Z4() && t0Var.getMessageObject().T2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.getResourceProvider());
            String M0 = org.telegram.messenger.hd.M0(2131746283, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746284, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new w0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            anVar.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, anVar.getResourceProvider());
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f2 t() {
        return this.f45372a.Q;
    }

    @Override
    public final void t0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        this.f45372a.Q.l8(t0Var, reactionCount, z9, f10, f11);
    }

    @Override
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
