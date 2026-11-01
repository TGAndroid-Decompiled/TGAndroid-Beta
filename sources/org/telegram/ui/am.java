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
public final class am implements org.telegram.ui.Cells.q0 {
    public final fm f35805a;

    public am(fm fmVar) {
        this.f35805a = fmVar;
    }

    @Override
    public final void E(org.telegram.ui.Cells.s0 s0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, s0Var, i10, i11, 11);
        un unVar = this.f35805a.Q;
        if (unVar.C0.N) {
            unVar.Ib(false, true, true);
            org.telegram.messenger.i0.h3(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final void E0(long j10) {
        un unVar = this.f35805a.Q;
        int i10 = un.f41979bd;
        unVar.Ia(j10);
    }

    @Override
    public final void F(org.telegram.ui.Cells.s0 s0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z10;
        int i10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.kj messageObject = s0Var.getMessageObject();
        PhotoViewer v12 = PhotoViewer.v1();
        un unVar = this.f35805a.Q;
        v12.N2(null, unVar, unVar.f42288xa);
        boolean z11 = false;
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(messageObject.f16701n0, 640, false, null, false);
        if (s0Var.getMessageObject().D == 24) {
            th.o7 orCreateStoryViewer = unVar.getOrCreateStoryViewer();
            vj vjVar = unVar.f42303z0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.kj messageObject2 = s0Var.getMessageObject();
            if (unVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.f16690k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.o5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.f1();
                orCreateStoryViewer.U(unVar.getParentActivity(), messageObject2.f16690k.media.storyItem, th.n5.a(vjVar));
            }
        } else if (s0Var.getMessageObject().D == 22) {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
            RadialProgress2 radialProgress2 = s0Var.J1;
            if (radialProgress2 != null && radialProgress2.f24129i.f27048q == 3 && messageObject.f1() < 0 && (str = r12.Q2) != null && TextUtils.equals(messageObject.f16690k.action.wallpaper.uploadingImage, str)) {
                r12.A();
                unVar.ab(messageObject);
                return;
            }
            org.telegram.messenger.kj kjVar = s0Var.P0;
            if (kjVar != null && s0Var.V(kjVar) && s0Var.f22960x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.f16690k.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        ke1 ke1Var = new ke1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.i0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = ke1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            ke1Var.f38863g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = ke1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
                    u81 u81Var = new u81(wallPaper, unVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        u81Var.G1 = z12;
                        u81Var.F1 = z13;
                        u81Var.f38754o1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    u81Var.f38760r0 = messageObject;
                    u81Var.h1(org.telegram.messenger.kj.B0(messageObject.f16690k));
                    u81Var.f38712a.f39139a = unVar.f42288xa;
                    u81Var.f38758q1 = new v81(unVar, q6);
                    unVar.presentFragment(u81Var);
                    return;
                }
                return;
            }
            unVar.Vb();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.f16690k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = org.telegram.messenger.b8.x(1000, messageObject.f16690k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.f16690k.action.photo.video_sizes;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if ((arrayList2.get(i11) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList2.get(i11) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                        videoSize2 = arrayList2.get(i11);
                        break;
                    }
                }
                videoSize2 = null;
            } else {
                videoSize = null;
                videoSize2 = null;
            }
            if (s0Var.getMessageObject().D == 21 && !messageObject.P3()) {
                if (!messageObject.f16712q) {
                    if (videoSize2 != null) {
                        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
                        b40Var.f24618a = unVar;
                        b40Var.e();
                        b40Var.f24620c.a2.s0(null, videoSize2, 0L);
                        b40Var.f24619b = new dg(unVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], unVar.getUserConfig().e(), 4);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    org.telegram.messenger.jc.j(videoSize, messageObject.f16690k.action.photo);
                    org.telegram.messenger.b8 fileLoader = unVar.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.f16690k.action.photo;
                        fileLoader.getClass();
                        I = org.telegram.messenger.b8.I(photo);
                    } else {
                        fileLoader.getClass();
                        I = org.telegram.messenger.b8.I(videoSize);
                    }
                    File file = new File(org.telegram.messenger.b8.z(4), I.getName());
                    if (!I.exists()) {
                        if (file.exists()) {
                            I = file;
                        } else {
                            return;
                        }
                    }
                    org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, I.getAbsolutePath(), 0, false, 0, 0);
                    ffVar.f14602a = unVar.Z.getFieldText();
                    if (videoSize != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ffVar.f14603b = z10;
                    arrayList3.add(ffVar);
                    PhotoViewer.v1().j2(arrayList3, 0, 1, false, new zl(this, messageObject, ffVar), null);
                    if (ffVar.f14603b) {
                        PhotoViewer.v1().R2(org.telegram.messenger.dd.L0(2131744398, null));
                    } else {
                        PhotoViewer.v1().R2(org.telegram.messenger.dd.L0(2131744401, null));
                    }
                    org.telegram.ui.Components.z30 z30Var = new org.telegram.ui.Components.z30(1, unVar.getUserConfig().f());
                    if (videoSize != null) {
                        z11 = true;
                    }
                    z30Var.e = z11;
                    z30Var.f32984b = unVar.getMessagesController().Z1(Long.valueOf(unVar.f42108j6));
                    PhotoViewer.v1().A2(z30Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.v1().g2(videoSize.location, org.telegram.messenger.jc.j(videoSize, messageObject.f16690k.action.photo), unVar.Za);
                if (s0Var.getMessageObject().D == 21) {
                    PhotoViewer.v1().R2(org.telegram.messenger.dd.L0(2131744398, null));
                }
            } else if (w9 != null) {
                PhotoViewer.v1().g2(w9.location, org.telegram.messenger.jc.i(w9, messageObject.f16690k.action.photo), unVar.Za);
                if (s0Var.getMessageObject().D == 21) {
                    PhotoViewer.v1().R2(org.telegram.messenger.dd.L0(2131744401, null));
                }
            } else {
                PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, unVar.Za);
            }
        }
    }

    @Override
    public final void G0(org.telegram.ui.Cells.s0 s0Var) {
        un unVar = this.f35805a.Q;
        org.telegram.messenger.kj messageObject = s0Var.getMessageObject();
        if (messageObject == null || unVar.f42057f2 == null) {
            return;
        }
        if (org.telegram.messenger.w3.p0(unVar.e)) {
            unVar.f42057f2.n(org.telegram.messenger.kj.v1(messageObject.f16690k), true);
        } else {
            unVar.f42057f2.n(messageObject.Z1(), true);
        }
    }

    @Override
    public final void I(org.telegram.ui.Cells.s0 s0Var) {
        un unVar = this.f35805a.Q;
        org.telegram.messenger.kj messageObject = s0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !s0Var.getMessageObject().P3() && s0Var.getMessageObject().Y4() && s0Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.getResourceProvider());
            String L0 = org.telegram.messenger.dd.L0(2131746299, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131746300, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new y0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            unVar.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, unVar.getResourceProvider());
            }
        }
    }

    @Override
    public final void M1(org.telegram.ui.Cells.s0 s0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f35805a.Q.i8(s0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void R0(org.telegram.ui.Cells.s0 s0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        un unVar = this.f35805a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            kg.v1 v1Var = new kg.v1(unVar, i10, unVar.j(), new kg.m(tL_premiumGiftOption), null, unVar.f42288xa);
            v1Var.B2 = false;
            v1Var.U1 = s0Var.getMessageObject().N3();
            unVar.showDialog(v1Var);
            return;
        }
        c(s0Var);
        gf.e eVar = unVar.Wb;
        mg.c1 c1Var = mg.c1.K2;
        mg.y0.e1(LaunchActivity.Q(), str, eVar);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f35805a.Q.b();
    }

    public final void c(org.telegram.ui.Cells.s0 s0Var) {
        ym ymVar;
        un unVar = this.f35805a.Q;
        gf.e eVar = unVar.Wb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (s0Var.getMessageObject() == null) {
            ymVar = null;
        } else {
            ymVar = new ym(this, s0Var, 6);
        }
        unVar.Wb = ymVar;
    }

    @Override
    public final void e1(org.telegram.ui.Cells.s0 s0Var, String str) {
        c(s0Var);
        un unVar = this.f35805a.Q;
        mg.y0.e1(unVar, str, unVar.Wb);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.k2 h0() {
        return this.f35805a.Q;
    }

    @Override
    public final boolean i1(org.telegram.ui.Cells.s0 s0Var, float f7, float f10) {
        boolean z10;
        un unVar = this.f35805a.Q;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return unVar.U7(s0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void r(org.telegram.ui.Cells.s0 s0Var, int i10) {
        ag.o0 o0Var = new ag.o0(this, s0Var, i10, 20);
        un unVar = this.f35805a.Q;
        if (unVar.C0.N) {
            unVar.Ib(false, true, true);
            org.telegram.messenger.i0.h3(o0Var, 80L);
            return;
        }
        o0Var.run();
    }

    @Override
    public final void t0(org.telegram.ui.Cells.s0 s0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        vk vkVar = this.f35805a.Q.Qa;
        FrameLayout frameLayout = vkVar.G;
        HashMap hashMap = vkVar.f39019f;
        Random random = vkVar.h;
        ArrayList arrayList = vkVar.F;
        if (arrayList.size() <= 12 && s0Var.getPhotoImage().L()) {
            float f7 = s0Var.getPhotoImage().N0;
            float f10 = s0Var.getPhotoImage().M0;
            if (f7 > 0.0f && f10 > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((jy) arrayList.get(i11)).f38590p == s0Var.getMessageObject().f1()) {
                        i12++;
                        if (((jy) arrayList.get(i11)).f38592r.B() == null || ((jy) arrayList.get(i11)).f38592r.B().y()) {
                            return;
                        }
                    }
                    if (((jy) arrayList.get(i11)).f38591q != null && document != null) {
                        i10 = i11;
                        if (((jy) arrayList.get(i11)).f38591q.f19800id == document.f19800id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    jy jyVar = new jy();
                    jyVar.h = true;
                    if (!jyVar.f38583i) {
                        jyVar.f38581f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        jyVar.f38582g = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                    }
                    jyVar.f38590p = s0Var.getMessageObject().f1();
                    jyVar.f38587m = true;
                    jyVar.f38592r.f14409t0 = true;
                    int f11 = ky.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f19800id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f19800id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue);
                        sb2.append("_");
                        jyVar.f38592r.f14414v1 = a1.g.p(sb2, jyVar.f38590p, "_");
                    }
                    jyVar.f38591q = document;
                    jyVar.f38592r.q0(org.telegram.messenger.jc.d(videoSize, document), a1.g.i(f11, f11, "_"), null, "tgs", vkVar.f39018c, 1);
                    jyVar.f38592r.E0(Integer.MAX_VALUE);
                    jyVar.f38592r.W(0);
                    if (jyVar.f38592r.B() != null) {
                        if (jyVar.h) {
                            jyVar.f38592r.B().N(0, false, true);
                        }
                        jyVar.f38592r.B().start();
                    }
                    arrayList.add(jyVar);
                    if (vkVar.f39020n) {
                        jyVar.f38592r.P();
                        jyVar.f38592r.H0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void w(org.telegram.ui.Cells.s0 s0Var) {
        yj yjVar;
        un unVar = this.f35805a.Q;
        org.telegram.messenger.kj messageObject = s0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.K1 = true;
        vj vjVar = unVar.f42303z0;
        if (vjVar != null && (yjVar = unVar.B0) != null && yjVar.f47888y < 0) {
            int childCount = vjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = unVar.f42303z0.getChildAt(childCount);
                unVar.f42303z0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            unVar.c9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        unVar.c9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        unVar.Qc(messageObject, false);
    }

    @Override
    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
