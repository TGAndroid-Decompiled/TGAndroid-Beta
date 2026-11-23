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
    public final kl f47726a;

    public fl(kl klVar) {
        this.f47726a = klVar;
    }

    @Override
    public final void D(org.telegram.ui.Cells.v0 v0Var) {
        bn bnVar = this.f47726a.R;
        org.telegram.messenger.gj messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !v0Var.getMessageObject().P3() && v0Var.getMessageObject().Y4() && v0Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.getResourceProvider());
            String N0 = org.telegram.messenger.hd.N0(2131746088, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131746089, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new w0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            bnVar.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, bnVar.getResourceProvider());
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g2 G() {
        return this.f47726a.R;
    }

    @Override
    public final void Q(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i7;
        ak akVar = this.f47726a.R.Ua;
        FrameLayout frameLayout = akVar.H;
        HashMap hashMap = akVar.f50343f;
        Random random = akVar.h;
        ArrayList arrayList = akVar.G;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().L()) {
            float f10 = v0Var.getPhotoImage().O0;
            float f11 = v0Var.getPhotoImage().N0;
            if (f10 > 0.0f && f11 > 0.0f) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < arrayList.size()) {
                    if (((mx) arrayList.get(i10)).f49997p == v0Var.getMessageObject().e1()) {
                        i11++;
                        if (((mx) arrayList.get(i10)).f49999r.B() == null || ((mx) arrayList.get(i10)).f49999r.B().y()) {
                            return;
                        }
                    }
                    if (((mx) arrayList.get(i10)).f49998q != null && document != null) {
                        i7 = i10;
                        if (((mx) arrayList.get(i10)).f49998q.f28404id == document.f28404id) {
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
                    if (!mxVar.f49990i) {
                        mxVar.f49988f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        mxVar.f49989g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                    }
                    mxVar.f49997p = v0Var.getMessageObject().e1();
                    mxVar.f49994m = true;
                    mxVar.f49999r.f22659u0 = true;
                    int f12 = nx.f();
                    if (i12 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f28404id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f28404id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue);
                        sb2.append("_");
                        mxVar.f49999r.f22665w1 = a8.p0.n(mxVar.f49997p, "_", sb2);
                    }
                    mxVar.f49998q = document;
                    mxVar.f49999r.q0(org.telegram.messenger.gc.d(videoSize, document), com.google.android.gms.internal.vision.e2.j(f12, "_", f12), null, "tgs", akVar.f50341c, 1);
                    mxVar.f49999r.E0(Integer.MAX_VALUE);
                    mxVar.f49999r.W(0);
                    if (mxVar.f49999r.B() != null) {
                        if (mxVar.h) {
                            mxVar.f49999r.B().N(0, false, true);
                        }
                        mxVar.f49999r.B().start();
                    }
                    arrayList.add(mxVar);
                    if (akVar.f50344n) {
                        mxVar.f49999r.P();
                        mxVar.f49999r.H0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void V(long j3) {
        bn bnVar = this.f47726a.R;
        int i7 = bn.f45893md;
        bnVar.Qa(j3);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void a0(org.telegram.ui.Cells.v0 v0Var) {
        bn bnVar = this.f47726a.R;
        org.telegram.messenger.gj messageObject = v0Var.getMessageObject();
        if (messageObject == null || bnVar.f45987g2 == null) {
            return;
        }
        if (org.telegram.messenger.v3.p0(bnVar.f45958e)) {
            bnVar.f45987g2.n(org.telegram.messenger.gj.u1(messageObject.f24177k), true);
        } else {
            bnVar.f45987g2.n(messageObject.Y1(), true);
        }
    }

    public final void b(org.telegram.ui.Cells.v0 v0Var) {
        fm fmVar;
        bn bnVar = this.f47726a.R;
        vf.b bVar = bnVar.f45970ec;
        if (bVar != null) {
            bVar.a(true);
        }
        if (v0Var.getMessageObject() == null) {
            fmVar = null;
        } else {
            fmVar = new fm(this, v0Var, 6);
        }
        bnVar.f45970ec = fmVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i7;
        bn bnVar = this.f47726a.R;
        if (str == null) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            ug.h1 h1Var = new ug.h1(bnVar, i7, bnVar.j(), new ug.j(tL_premiumGiftOption), null, bnVar.Ba);
            h1Var.F2 = false;
            h1Var.Y1 = v0Var.getMessageObject().N3();
            bnVar.showDialog(h1Var);
            return;
        }
        b(v0Var);
        vf.b bVar = bnVar.f45970ec;
        wg.g0 g0Var = wg.g0.O2;
        wg.c0.f1(LaunchActivity.Q(), str, bVar);
    }

    @Override
    public final long d() {
        return this.f47726a.R.d();
    }

    @Override
    public final void g0(org.telegram.ui.Cells.v0 v0Var, String str) {
        b(v0Var);
        bn bnVar = this.f47726a.R;
        wg.c0.f1(bnVar, str, bnVar.f45970ec);
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void n(org.telegram.ui.Cells.v0 v0Var, int i7) {
        f0 f0Var = new f0(this, v0Var, i7, 6);
        bn bnVar = this.f47726a.R;
        if (bnVar.D0.O) {
            bnVar.Rb(false, true, true);
            org.telegram.messenger.g0.h3(f0Var, 80L);
            return;
        }
        f0Var.run();
    }

    @Override
    public final boolean s0(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z10;
        bn bnVar = this.f47726a.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return bnVar.Y7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void t(org.telegram.ui.Cells.v0 v0Var) {
        ej ejVar;
        bn bnVar = this.f47726a.R;
        org.telegram.messenger.gj messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59073y < 0) {
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
    public final void u(org.telegram.ui.Cells.v0 v0Var, int i7, int i10) {
        l2.x xVar = new l2.x(this, v0Var, i7, i10, 11);
        bn bnVar = this.f47726a.R;
        if (bnVar.D0.O) {
            bnVar.Rb(false, true, true);
            org.telegram.messenger.g0.h3(xVar, 80L);
            return;
        }
        xVar.run();
    }

    @Override
    public final void x(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z10;
        int i7;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.gj messageObject = v0Var.getMessageObject();
        PhotoViewer p12 = PhotoViewer.p1();
        bn bnVar = this.f47726a.R;
        p12.I2(null, bnVar, bnVar.Ba);
        boolean z11 = false;
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f24197p0, 640, false, null, false);
        if (v0Var.getMessageObject().D == 24) {
            fi.f9 orCreateStoryViewer = bnVar.getOrCreateStoryViewer();
            bj bjVar = bnVar.A0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.gj messageObject2 = v0Var.getMessageObject();
            if (bnVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.f24177k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.n5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.e1();
                orCreateStoryViewer.L(bnVar.getParentActivity(), messageObject2.f24177k.media.storyItem, fi.y6.a(bjVar));
            }
        } else if (v0Var.getMessageObject().D == 22) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
            RadialProgress2 radialProgress2 = v0Var.K1;
            if (radialProgress2 != null && radialProgress2.f33060i.f35153q == 3 && messageObject.e1() < 0 && (str = u12.T2) != null && TextUtils.equals(messageObject.f24177k.action.wallpaper.uploadingImage, str)) {
                u12.A();
                bnVar.jb(messageObject);
                return;
            }
            org.telegram.messenger.gj gjVar = v0Var.Q0;
            if (gjVar != null && v0Var.W(gjVar) && v0Var.f32137y1 != null) {
                TLRPC.MessageAction messageAction = messageObject.f24177k.action;
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
                    boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
                    g71 g71Var = new g71(wallPaper, bnVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        g71Var.H1 = z12;
                        g71Var.G1 = z13;
                        g71Var.f53682p1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    g71Var.f53689s0 = messageObject;
                    g71Var.h1(org.telegram.messenger.gj.B0(messageObject.f24177k));
                    g71Var.f53637a.f52955a = bnVar.Ba;
                    g71Var.f53687r1 = new h71(bnVar, q10);
                    bnVar.presentFragment(g71Var);
                    return;
                }
                return;
            }
            bnVar.ec();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.f24177k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = org.telegram.messenger.w7.x(1000, messageObject.f24177k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.f24177k.action.photo.video_sizes;
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
                if (!messageObject.f24200q) {
                    if (videoSize2 != null) {
                        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(0, true, true);
                        x30Var.f41915a = bnVar;
                        x30Var.e();
                        x30Var.f41917c.f40363e2.u0(null, videoSize2, 0L);
                        x30Var.f41916b = new bg.f0(bnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], bnVar.getUserConfig().e(), 0);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    org.telegram.messenger.gc.j(videoSize, messageObject.f24177k.action.photo);
                    org.telegram.messenger.w7 fileLoader = bnVar.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.f24177k.action.photo;
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
                    org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, I.getAbsolutePath(), 0, false, 0, 0);
                    ffVar.f28022a = bnVar.f45903a0.getFieldText();
                    if (videoSize != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ffVar.f28023b = z10;
                    arrayList3.add(ffVar);
                    PhotoViewer.p1().f2(arrayList3, 0, 1, false, new el(this, messageObject, ffVar), null);
                    if (ffVar.f28023b) {
                        PhotoViewer.p1().M2(org.telegram.messenger.hd.N0(2131744131, null));
                    } else {
                        PhotoViewer.p1().M2(org.telegram.messenger.hd.N0(2131744134, null));
                    }
                    org.telegram.ui.Components.v30 v30Var = new org.telegram.ui.Components.v30(1, bnVar.getUserConfig().f());
                    if (videoSize != null) {
                        z11 = true;
                    }
                    v30Var.f40624e = z11;
                    v30Var.f40622b = bnVar.getMessagesController().c2(Long.valueOf(bnVar.f46056l6));
                    PhotoViewer.p1().v2(v30Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.p1().c2(videoSize.location, org.telegram.messenger.gc.j(videoSize, messageObject.f24177k.action.photo), bnVar.f45956db);
                if (v0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().M2(org.telegram.messenger.hd.N0(2131744131, null));
                }
            } else if (w10 != null) {
                PhotoViewer.p1().c2(w10.location, org.telegram.messenger.gc.i(w10, messageObject.f24177k.action.photo), bnVar.f45956db);
                if (v0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().M2(org.telegram.messenger.hd.N0(2131744134, null));
                }
            } else {
                PhotoViewer.p1().e2(messageObject, null, 0L, 0L, 0L, bnVar.f45956db);
            }
        }
    }

    @Override
    public final void x0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f47726a.R.n8(v0Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void M(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
