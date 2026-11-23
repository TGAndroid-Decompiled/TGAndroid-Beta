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
public final class fl implements org.telegram.ui.Cells.s0 {
    public final kl f47911a;

    public fl(kl klVar) {
        this.f47911a = klVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.g2 B() {
        return this.f47911a.R;
    }

    @Override
    public final void K(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i7;
        ak akVar = this.f47911a.R.Ua;
        FrameLayout frameLayout = akVar.H;
        HashMap hashMap = akVar.f50138f;
        Random random = akVar.h;
        ArrayList arrayList = akVar.G;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().M()) {
            float f10 = v0Var.getPhotoImage().O0;
            float f11 = v0Var.getPhotoImage().N0;
            if (f10 > 0.0f && f11 > 0.0f) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < arrayList.size()) {
                    if (((lx) arrayList.get(i10)).f49865p == v0Var.getMessageObject().e1()) {
                        i11++;
                        if (((lx) arrayList.get(i10)).f49867r.C() == null || ((lx) arrayList.get(i10)).f49867r.C().y()) {
                            return;
                        }
                    }
                    if (((lx) arrayList.get(i10)).f49866q != null && document != null) {
                        i7 = i10;
                        if (((lx) arrayList.get(i10)).f49866q.f28498id == document.f28498id) {
                            i12++;
                        }
                    } else {
                        i7 = i10;
                    }
                    i10 = i7 + 1;
                }
                if (i11 < 4) {
                    lx lxVar = new lx();
                    lxVar.h = true;
                    if (!lxVar.f49858i) {
                        lxVar.f49856f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        lxVar.f49857g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                    }
                    lxVar.f49865p = v0Var.getMessageObject().e1();
                    lxVar.f49862m = true;
                    lxVar.f49867r.f22762u0 = true;
                    int f12 = mx.f();
                    if (i12 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f28498id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f28498id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue);
                        sb2.append("_");
                        lxVar.f49867r.f22768w1 = a8.p0.n(lxVar.f49865p, "_", sb2);
                    }
                    lxVar.f49866q = document;
                    lxVar.f49867r.r0(org.telegram.messenger.fc.d(videoSize, document), com.google.android.gms.internal.vision.e2.j(f12, "_", f12), null, "tgs", akVar.f50136c, 1);
                    lxVar.f49867r.F0(Integer.MAX_VALUE);
                    lxVar.f49867r.X(0);
                    if (lxVar.f49867r.C() != null) {
                        if (lxVar.h) {
                            lxVar.f49867r.C().N(0, false, true);
                        }
                        lxVar.f49867r.C().start();
                    }
                    arrayList.add(lxVar);
                    if (akVar.f50139n) {
                        lxVar.f49867r.Q();
                        lxVar.f49867r.I0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void Q(long j3) {
        bn bnVar = this.f47911a.R;
        int i7 = bn.f46108md;
        bnVar.Qa(j3);
    }

    @Override
    public final void S(org.telegram.ui.Cells.v0 v0Var) {
        bn bnVar = this.f47911a.R;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        if (messageObject == null || bnVar.f46202g2 == null) {
            return;
        }
        if (org.telegram.messenger.v3.p0(bnVar.f46173e)) {
            bnVar.f46202g2.n(org.telegram.messenger.fj.u1(messageObject.f24073k), true);
        } else {
            bnVar.f46202g2.n(messageObject.Y1(), true);
        }
    }

    @Override
    public final void T(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i7;
        bn bnVar = this.f47911a.R;
        if (str == null) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            ug.h1 h1Var = new ug.h1(bnVar, i7, bnVar.j(), new ug.j(tL_premiumGiftOption), null, bnVar.Ba);
            h1Var.F2 = false;
            h1Var.Y1 = v0Var.getMessageObject().N3();
            bnVar.showDialog(h1Var);
            return;
        }
        c(v0Var);
        vf.b bVar = bnVar.f46185ec;
        wg.f0 f0Var = wg.f0.O2;
        wg.b0.f1(LaunchActivity.Q(), str, bVar);
    }

    @Override
    public final void V(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        bn bnVar = this.f47911a.R;
        wg.b0.f1(bnVar, str, bnVar.f46185ec);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f47911a.R.b();
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        fm fmVar;
        bn bnVar = this.f47911a.R;
        vf.b bVar = bnVar.f46185ec;
        if (bVar != null) {
            bVar.a(true);
        }
        if (v0Var.getMessageObject() == null) {
            fmVar = null;
        } else {
            fmVar = new fm(this, v0Var, 6);
        }
        bnVar.f46185ec = fmVar;
    }

    @Override
    public final boolean g0(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z10;
        bn bnVar = this.f47911a.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return bnVar.Y7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void j(org.telegram.ui.Cells.v0 v0Var, int i7) {
        f0 f0Var = new f0(this, v0Var, i7, 6);
        bn bnVar = this.f47911a.R;
        if (bnVar.D0.O) {
            bnVar.Rb(false, true, true);
            org.telegram.messenger.g0.h3(f0Var, 80L);
            return;
        }
        f0Var.run();
    }

    @Override
    public final void l(org.telegram.ui.Cells.v0 v0Var) {
        ej ejVar;
        bn bnVar = this.f47911a.R;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59208y < 0) {
            int childCount = bjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = bnVar.A0.getChildAt(childCount);
                bnVar.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        if (((org.telegram.ui.Cells.r1) childAt).getCurrentMessagesGroup() == null) {
                            bnVar.h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        bnVar.h9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        bnVar.Zc(messageObject, false);
    }

    @Override
    public final void n(org.telegram.ui.Cells.v0 v0Var, int i7, int i10) {
        l2.y yVar = new l2.y(this, v0Var, i7, i10, 11);
        bn bnVar = this.f47911a.R;
        if (bnVar.D0.O) {
            bnVar.Rb(false, true, true);
            org.telegram.messenger.g0.h3(yVar, 80L);
            return;
        }
        yVar.run();
    }

    @Override
    public final void r(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z10;
        int i7;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        PhotoViewer p12 = PhotoViewer.p1();
        bn bnVar = this.f47911a.R;
        p12.J2(null, bnVar, bnVar.Ba);
        boolean z11 = false;
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f24093p0, 640, false, null, false);
        if (v0Var.getMessageObject().D == 24) {
            fi.f9 orCreateStoryViewer = bnVar.getOrCreateStoryViewer();
            bj bjVar = bnVar.A0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.fj messageObject2 = v0Var.getMessageObject();
            if (bnVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.f24073k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.n5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.e1();
                orCreateStoryViewer.L(bnVar.getParentActivity(), messageObject2.f24073k.media.storyItem, fi.y6.a(bjVar));
            }
        } else if (v0Var.getMessageObject().D == 22) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            RadialProgress2 radialProgress2 = v0Var.K1;
            if (radialProgress2 != null && radialProgress2.f33158i.f33986q == 3 && messageObject.e1() < 0 && (str = u12.T2) != null && TextUtils.equals(messageObject.f24073k.action.wallpaper.uploadingImage, str)) {
                u12.A();
                bnVar.jb(messageObject);
                return;
            }
            org.telegram.messenger.fj fjVar = v0Var.Q0;
            if (fjVar != null && v0Var.Y(fjVar) && v0Var.f32220y1 != null) {
                TLRPC.MessageAction messageAction = messageObject.f24073k.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        pc1 pc1Var = new pc1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = pc1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            pc1Var.f50984g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = pc1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
                    e71 e71Var = new e71(wallPaper, bnVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        e71Var.H1 = z12;
                        e71Var.G1 = z13;
                        e71Var.f52890p1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    e71Var.f52897s0 = messageObject;
                    e71Var.h1(org.telegram.messenger.fj.B0(messageObject.f24073k));
                    e71Var.f52845a.f52554a = bnVar.Ba;
                    e71Var.f52895r1 = new f71(bnVar, q10);
                    bnVar.presentFragment(e71Var);
                    return;
                }
                return;
            }
            bnVar.ec();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.f24073k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = org.telegram.messenger.w7.x(1000, messageObject.f24073k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.f24073k.action.photo.video_sizes;
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
            if (v0Var.getMessageObject().D == 21 && !messageObject.P3()) {
                if (!messageObject.f24096q) {
                    if (videoSize2 != null) {
                        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
                        u30Var.f40250a = bnVar;
                        u30Var.e();
                        u30Var.f40252c.f39967e2.u0(null, videoSize2, 0L);
                        u30Var.f40251b = new bg.f0(bnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], bnVar.getUserConfig().e(), 0);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    org.telegram.messenger.fc.j(videoSize, messageObject.f24073k.action.photo);
                    org.telegram.messenger.w7 fileLoader = bnVar.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.f24073k.action.photo;
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
                    org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, I.getAbsolutePath(), 0, false, 0, 0);
                    efVar.f27962a = bnVar.f46118a0.getFieldText();
                    if (videoSize != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    efVar.f27963b = z10;
                    arrayList3.add(efVar);
                    PhotoViewer.p1().g2(arrayList3, 0, 1, false, new el(this, messageObject, efVar), null);
                    if (efVar.f27963b) {
                        PhotoViewer.p1().N2(org.telegram.messenger.gd.N0(2131744127, null));
                    } else {
                        PhotoViewer.p1().N2(org.telegram.messenger.gd.N0(2131744130, null));
                    }
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(1, bnVar.getUserConfig().f());
                    if (videoSize != null) {
                        z11 = true;
                    }
                    s30Var.f39484e = z11;
                    s30Var.f39482b = bnVar.getMessagesController().c2(Long.valueOf(bnVar.f46271l6));
                    PhotoViewer.p1().w2(s30Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.p1().d2(videoSize.location, org.telegram.messenger.fc.j(videoSize, messageObject.f24073k.action.photo), bnVar.f46171db);
                if (v0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().N2(org.telegram.messenger.gd.N0(2131744127, null));
                }
            } else if (w10 != null) {
                PhotoViewer.p1().d2(w10.location, org.telegram.messenger.fc.i(w10, messageObject.f24073k.action.photo), bnVar.f46171db);
                if (v0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().N2(org.telegram.messenger.gd.N0(2131744130, null));
                }
            } else {
                PhotoViewer.p1().f2(messageObject, null, 0L, 0L, 0L, bnVar.f46171db);
            }
        }
    }

    @Override
    public final void s0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f47911a.R.n8(v0Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void w(org.telegram.ui.Cells.v0 v0Var) {
        bn bnVar = this.f47911a.R;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !v0Var.getMessageObject().P3() && v0Var.getMessageObject().Y4() && v0Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.getResourceProvider());
            String N0 = org.telegram.messenger.gd.N0(2131746088, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131746089, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131746125, null), new w0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            bnVar.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, bnVar.getResourceProvider());
            }
        }
    }

    @Override
    public final void H(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
