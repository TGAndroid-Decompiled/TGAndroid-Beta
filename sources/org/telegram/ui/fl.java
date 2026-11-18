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
public final class fl implements org.telegram.ui.Cells.r0 {
    public final kl f47723a;

    public fl(kl klVar) {
        this.f47723a = klVar;
    }

    @Override
    public final void D(org.telegram.ui.Cells.u0 u0Var) {
        bn bnVar = this.f47723a.R;
        org.telegram.messenger.fj messageObject = u0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !u0Var.getMessageObject().P3() && u0Var.getMessageObject().Y4() && u0Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.getResourceProvider());
            String M0 = org.telegram.messenger.gd.M0(2131746089, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131746090, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131746126, null), new w0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            bnVar.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, bnVar.getResourceProvider());
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.h2 G() {
        return this.f47723a.R;
    }

    @Override
    public final void Q(org.telegram.ui.Cells.u0 u0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i7;
        ak akVar = this.f47723a.R.Ua;
        FrameLayout frameLayout = akVar.H;
        HashMap hashMap = akVar.f50345f;
        Random random = akVar.h;
        ArrayList arrayList = akVar.G;
        if (arrayList.size() <= 12 && u0Var.getPhotoImage().L()) {
            float f10 = u0Var.getPhotoImage().O0;
            float f11 = u0Var.getPhotoImage().N0;
            if (f10 > 0.0f && f11 > 0.0f) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < arrayList.size()) {
                    if (((mx) arrayList.get(i10)).f50004p == u0Var.getMessageObject().e1()) {
                        i11++;
                        if (((mx) arrayList.get(i10)).f50006r.B() == null || ((mx) arrayList.get(i10)).f50006r.B().y()) {
                            return;
                        }
                    }
                    if (((mx) arrayList.get(i10)).f50005q != null && document != null) {
                        i7 = i10;
                        if (((mx) arrayList.get(i10)).f50005q.f28411id == document.f28411id) {
                            i12++;
                        }
                    } else {
                        i7 = i10;
                    }
                    i10 = i7 + 1;
                }
                if (i11 < 4) {
                    mx mxVar = new mx();
                    mxVar.h = true;
                    if (!mxVar.f49997i) {
                        mxVar.f49995f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        mxVar.f49996g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                    }
                    mxVar.f50004p = u0Var.getMessageObject().e1();
                    mxVar.f50001m = true;
                    mxVar.f50006r.f22667u0 = true;
                    int f12 = nx.f();
                    if (i12 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f28411id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f28411id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue);
                        sb2.append("_");
                        mxVar.f50006r.f22673w1 = a8.p0.n(mxVar.f50004p, "_", sb2);
                    }
                    mxVar.f50005q = document;
                    mxVar.f50006r.q0(org.telegram.messenger.fc.d(videoSize, document), com.google.android.gms.internal.vision.e2.j(f12, "_", f12), null, "tgs", akVar.f50343c, 1);
                    mxVar.f50006r.E0(Integer.MAX_VALUE);
                    mxVar.f50006r.W(0);
                    if (mxVar.f50006r.B() != null) {
                        if (mxVar.h) {
                            mxVar.f50006r.B().N(0, false, true);
                        }
                        mxVar.f50006r.B().start();
                    }
                    arrayList.add(mxVar);
                    if (akVar.f50346n) {
                        mxVar.f50006r.P();
                        mxVar.f50006r.H0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void V(long j3) {
        bn bnVar = this.f47723a.R;
        int i7 = bn.f45922md;
        bnVar.Qa(j3);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void a0(org.telegram.ui.Cells.u0 u0Var) {
        bn bnVar = this.f47723a.R;
        org.telegram.messenger.fj messageObject = u0Var.getMessageObject();
        if (messageObject == null || bnVar.f46016g2 == null) {
            return;
        }
        if (org.telegram.messenger.v3.p0(bnVar.f45987e)) {
            bnVar.f46016g2.n(org.telegram.messenger.fj.u1(messageObject.f23968k), true);
        } else {
            bnVar.f46016g2.n(messageObject.Y1(), true);
        }
    }

    public final void b(org.telegram.ui.Cells.u0 u0Var) {
        fm fmVar;
        bn bnVar = this.f47723a.R;
        vf.b bVar = bnVar.f45999ec;
        if (bVar != null) {
            bVar.a(true);
        }
        if (u0Var.getMessageObject() == null) {
            fmVar = null;
        } else {
            fmVar = new fm(this, u0Var, 6);
        }
        bnVar.f45999ec = fmVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.u0 u0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i7;
        bn bnVar = this.f47723a.R;
        if (str == null) {
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            ug.i1 i1Var = new ug.i1(bnVar, i7, bnVar.j(), new ug.j(tL_premiumGiftOption), null, bnVar.Ba);
            i1Var.F2 = false;
            i1Var.Y1 = u0Var.getMessageObject().N3();
            bnVar.showDialog(i1Var);
            return;
        }
        b(u0Var);
        vf.b bVar = bnVar.f45999ec;
        wg.g0 g0Var = wg.g0.O2;
        wg.c0.f1(LaunchActivity.Q(), str, bVar);
    }

    @Override
    public final long d() {
        return this.f47723a.R.d();
    }

    @Override
    public final void g0(org.telegram.ui.Cells.u0 u0Var, String str) {
        b(u0Var);
        bn bnVar = this.f47723a.R;
        wg.c0.f1(bnVar, str, bnVar.f45999ec);
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void n(org.telegram.ui.Cells.u0 u0Var, int i7) {
        b0 b0Var = new b0(this, u0Var, i7, 7);
        bn bnVar = this.f47723a.R;
        if (bnVar.D0.O) {
            bnVar.Rb(false, true, true);
            org.telegram.messenger.g0.h3(b0Var, 80L);
            return;
        }
        b0Var.run();
    }

    @Override
    public final boolean s0(org.telegram.ui.Cells.u0 u0Var, float f10, float f11) {
        boolean z10;
        bn bnVar = this.f47723a.R;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return bnVar.Y7(u0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void t(org.telegram.ui.Cells.u0 u0Var) {
        ej ejVar;
        bn bnVar = this.f47723a.R;
        org.telegram.messenger.fj messageObject = u0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59083y < 0) {
            int childCount = bjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = bnVar.A0.getChildAt(childCount);
                bnVar.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            bnVar.h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.u0) {
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
    public final void u(org.telegram.ui.Cells.u0 u0Var, int i7, int i10) {
        l2.x xVar = new l2.x(this, u0Var, i7, i10, 11);
        bn bnVar = this.f47723a.R;
        if (bnVar.D0.O) {
            bnVar.Rb(false, true, true);
            org.telegram.messenger.g0.h3(xVar, 80L);
            return;
        }
        xVar.run();
    }

    @Override
    public final void x(org.telegram.ui.Cells.u0 u0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z10;
        int i7;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.fj messageObject = u0Var.getMessageObject();
        PhotoViewer p12 = PhotoViewer.p1();
        bn bnVar = this.f47723a.R;
        p12.I2(null, bnVar, bnVar.Ba);
        boolean z11 = false;
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f23988p0, 640, false, null, false);
        if (u0Var.getMessageObject().D == 24) {
            fi.f9 orCreateStoryViewer = bnVar.getOrCreateStoryViewer();
            bj bjVar = bnVar.A0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.fj messageObject2 = u0Var.getMessageObject();
            if (bnVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.f23968k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.n5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.e1();
                orCreateStoryViewer.L(bnVar.getParentActivity(), messageObject2.f23968k.media.storyItem, fi.y6.a(bjVar));
            }
        } else if (u0Var.getMessageObject().D == 22) {
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            RadialProgress2 radialProgress2 = u0Var.K1;
            if (radialProgress2 != null && radialProgress2.f33058i.f34340q == 3 && messageObject.e1() < 0 && (str = u12.T2) != null && TextUtils.equals(messageObject.f23968k.action.wallpaper.uploadingImage, str)) {
                u12.A();
                bnVar.jb(messageObject);
                return;
            }
            org.telegram.messenger.fj fjVar = u0Var.Q0;
            if (fjVar != null && u0Var.Y(fjVar) && u0Var.f32081y1 != null) {
                TLRPC.MessageAction messageAction = messageObject.f23968k.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        rc1 rc1Var = new rc1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = rc1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            rc1Var.f51582g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = rc1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
                    g71 g71Var = new g71(wallPaper, bnVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        g71Var.H1 = z12;
                        g71Var.G1 = z13;
                        g71Var.f53727p1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    g71Var.f53734s0 = messageObject;
                    g71Var.h1(org.telegram.messenger.fj.B0(messageObject.f23968k));
                    g71Var.f53682a.f52981a = bnVar.Ba;
                    g71Var.f53732r1 = new h71(bnVar, q10);
                    bnVar.presentFragment(g71Var);
                    return;
                }
                return;
            }
            bnVar.ec();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.f23968k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = org.telegram.messenger.w7.x(1000, messageObject.f23968k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.f23968k.action.photo.video_sizes;
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
            if (u0Var.getMessageObject().D == 21 && !messageObject.P3()) {
                if (!messageObject.f23991q) {
                    if (videoSize2 != null) {
                        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
                        u30Var.f40195a = bnVar;
                        u30Var.e();
                        u30Var.f40197c.f39670e2.u0(null, videoSize2, 0L);
                        u30Var.f40196b = new bg.f0(bnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], bnVar.getUserConfig().e(), 0);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    org.telegram.messenger.fc.j(videoSize, messageObject.f23968k.action.photo);
                    org.telegram.messenger.w7 fileLoader = bnVar.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.f23968k.action.photo;
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
                    efVar.f27848a = bnVar.f45932a0.getFieldText();
                    if (videoSize != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    efVar.f27849b = z10;
                    arrayList3.add(efVar);
                    PhotoViewer.p1().f2(arrayList3, 0, 1, false, new el(this, messageObject, efVar), null);
                    if (efVar.f27849b) {
                        PhotoViewer.p1().M2(org.telegram.messenger.gd.M0(2131744137, null));
                    } else {
                        PhotoViewer.p1().M2(org.telegram.messenger.gd.M0(2131744140, null));
                    }
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(1, bnVar.getUserConfig().f());
                    if (videoSize != null) {
                        z11 = true;
                    }
                    s30Var.f39471e = z11;
                    s30Var.f39469b = bnVar.getMessagesController().c2(Long.valueOf(bnVar.f46085l6));
                    PhotoViewer.p1().v2(s30Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.p1().c2(videoSize.location, org.telegram.messenger.fc.j(videoSize, messageObject.f23968k.action.photo), bnVar.f45985db);
                if (u0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().M2(org.telegram.messenger.gd.M0(2131744137, null));
                }
            } else if (w10 != null) {
                PhotoViewer.p1().c2(w10.location, org.telegram.messenger.fc.i(w10, messageObject.f23968k.action.photo), bnVar.f45985db);
                if (u0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().M2(org.telegram.messenger.gd.M0(2131744140, null));
                }
            } else {
                PhotoViewer.p1().e2(messageObject, null, 0L, 0L, 0L, bnVar.f45985db);
            }
        }
    }

    @Override
    public final void x0(org.telegram.ui.Cells.u0 u0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f47723a.R.n8(u0Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void M(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
