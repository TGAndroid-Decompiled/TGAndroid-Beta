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
    public final jl f46862a;

    public el(jl jlVar) {
        this.f46862a = jlVar;
    }

    @Override
    public final void C(org.telegram.ui.Cells.t0 t0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z10;
        int i7;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.gj messageObject = t0Var.getMessageObject();
        PhotoViewer p12 = PhotoViewer.p1();
        an anVar = this.f46862a.R;
        p12.I2(null, anVar, anVar.Aa);
        boolean z11 = false;
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f23837p0, 640, false, null, false);
        if (t0Var.getMessageObject().D == 24) {
            fi.i9 orCreateStoryViewer = anVar.getOrCreateStoryViewer();
            aj ajVar = anVar.A0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.gj messageObject2 = t0Var.getMessageObject();
            if (anVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.f23817k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.e1();
                orCreateStoryViewer.L(anVar.getParentActivity(), messageObject2.f23817k.media.storyItem, fi.b7.a(ajVar));
            }
        } else if (t0Var.getMessageObject().D == 22) {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
            RadialProgress2 radialProgress2 = t0Var.K1;
            if (radialProgress2 != null && radialProgress2.f32661i.f39230q == 3 && messageObject.e1() < 0 && (str = s12.R2) != null && TextUtils.equals(messageObject.f23817k.action.wallpaper.uploadingImage, str)) {
                s12.A();
                anVar.jb(messageObject);
                return;
            }
            org.telegram.messenger.gj gjVar = t0Var.Q0;
            if (gjVar != null && t0Var.X(gjVar) && t0Var.f31517y1 != null) {
                TLRPC.MessageAction messageAction = messageObject.f23817k.action;
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
                            oc1Var.f49932g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = oc1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                    c71 c71Var = new c71(wallPaper, anVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        c71Var.H1 = z12;
                        c71Var.G1 = z13;
                        c71Var.f51453p1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    c71Var.f51460s0 = messageObject;
                    c71Var.h1(org.telegram.messenger.gj.B0(messageObject.f23817k));
                    c71Var.f51408a.f51123a = anVar.Aa;
                    c71Var.f51458r1 = new d71(anVar, q10);
                    anVar.presentFragment(c71Var);
                    return;
                }
                return;
            }
            anVar.ec();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.f23817k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = org.telegram.messenger.w7.x(1000, messageObject.f23817k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.f23817k.action.photo.video_sizes;
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
                if (!messageObject.f23840q) {
                    if (videoSize2 != null) {
                        org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
                        m30Var.f37040a = anVar;
                        m30Var.e();
                        m30Var.f37042c.f36447e2.u0(null, videoSize2, 0L);
                        m30Var.f37041b = new bg.e0(anVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], anVar.getUserConfig().e(), 0);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    org.telegram.messenger.gc.j(videoSize, messageObject.f23817k.action.photo);
                    org.telegram.messenger.w7 fileLoader = anVar.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.f23817k.action.photo;
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
                    ffVar.f27707a = anVar.f45118a0.getFieldText();
                    if (videoSize != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ffVar.f27708b = z10;
                    arrayList3.add(ffVar);
                    PhotoViewer.p1().f2(arrayList3, 0, 1, false, new dl(this, messageObject, ffVar), null);
                    if (ffVar.f27708b) {
                        PhotoViewer.p1().M2(org.telegram.messenger.hd.M0(2131744372, null));
                    } else {
                        PhotoViewer.p1().M2(org.telegram.messenger.hd.M0(2131744375, null));
                    }
                    org.telegram.ui.Components.k30 k30Var = new org.telegram.ui.Components.k30(1, anVar.getUserConfig().f());
                    if (videoSize != null) {
                        z11 = true;
                    }
                    k30Var.f36271e = z11;
                    k30Var.f36269b = anVar.getMessagesController().a2(Long.valueOf(anVar.f45259k6));
                    PhotoViewer.p1().v2(k30Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.p1().c2(videoSize.location, org.telegram.messenger.gc.j(videoSize, messageObject.f23817k.action.photo), anVar.f45158cb);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().M2(org.telegram.messenger.hd.M0(2131744372, null));
                }
            } else if (w10 != null) {
                PhotoViewer.p1().c2(w10.location, org.telegram.messenger.gc.i(w10, messageObject.f23817k.action.photo), anVar.f45158cb);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().M2(org.telegram.messenger.hd.M0(2131744375, null));
                }
            } else {
                PhotoViewer.p1().e2(messageObject, null, 0L, 0L, 0L, anVar.f45158cb);
            }
        }
    }

    @Override
    public final void E(org.telegram.ui.Cells.t0 t0Var) {
        an anVar = this.f46862a.R;
        org.telegram.messenger.gj messageObject = t0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !t0Var.getMessageObject().P3() && t0Var.getMessageObject().Y4() && t0Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.getResourceProvider());
            String M0 = org.telegram.messenger.hd.M0(2131746284, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131746285, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new w0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            anVar.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, anVar.getResourceProvider());
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e2 F() {
        return this.f46862a.R;
    }

    @Override
    public final void W(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i7;
        zj zjVar = this.f46862a.R.Ta;
        FrameLayout frameLayout = zjVar.H;
        HashMap hashMap = zjVar.f48484f;
        Random random = zjVar.h;
        ArrayList arrayList = zjVar.G;
        if (arrayList.size() <= 12 && t0Var.getPhotoImage().L()) {
            float f10 = t0Var.getPhotoImage().O0;
            float f11 = t0Var.getPhotoImage().N0;
            if (f10 > 0.0f && f11 > 0.0f) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < arrayList.size()) {
                    if (((ix) arrayList.get(i10)).f48152p == t0Var.getMessageObject().e1()) {
                        i11++;
                        if (((ix) arrayList.get(i10)).f48154r.B() == null || ((ix) arrayList.get(i10)).f48154r.B().y()) {
                            return;
                        }
                    }
                    if (((ix) arrayList.get(i10)).f48153q != null && document != null) {
                        i7 = i10;
                        if (((ix) arrayList.get(i10)).f48153q.f28057id == document.f28057id) {
                            i12++;
                        }
                    } else {
                        i7 = i10;
                    }
                    i10 = i7 + 1;
                }
                if (i11 < 4) {
                    ix ixVar = new ix();
                    ixVar.h = true;
                    if (!ixVar.f48145i) {
                        ixVar.f48143f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        ixVar.f48144g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                    }
                    ixVar.f48152p = t0Var.getMessageObject().e1();
                    ixVar.f48149m = true;
                    ixVar.f48154r.f22301u0 = true;
                    int f12 = jx.f();
                    if (i12 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f28057id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f28057id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue);
                        sb2.append("_");
                        ixVar.f48154r.f22307w1 = a8.p0.n(ixVar.f48152p, "_", sb2);
                    }
                    ixVar.f48153q = document;
                    ixVar.f48154r.q0(org.telegram.messenger.gc.d(videoSize, document), com.google.android.gms.internal.vision.e2.j(f12, "_", f12), null, "tgs", zjVar.f48482c, 1);
                    ixVar.f48154r.E0(Integer.MAX_VALUE);
                    ixVar.f48154r.W(0);
                    if (ixVar.f48154r.B() != null) {
                        if (ixVar.h) {
                            ixVar.f48154r.B().N(0, false, true);
                        }
                        ixVar.f48154r.B().start();
                    }
                    arrayList.add(ixVar);
                    if (zjVar.f48485n) {
                        ixVar.f48154r.P();
                        ixVar.f48154r.H0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f46862a.R.b();
    }

    @Override
    public final void b0(long j3) {
        an anVar = this.f46862a.R;
        int i7 = an.f45108ld;
        anVar.Qa(j3);
    }

    public final void c(org.telegram.ui.Cells.t0 t0Var) {
        em emVar;
        an anVar = this.f46862a.R;
        vf.b bVar = anVar.dc;
        if (bVar != null) {
            bVar.a(true);
        }
        if (t0Var.getMessageObject() == null) {
            emVar = null;
        } else {
            emVar = new em(this, t0Var, 6);
        }
        anVar.dc = emVar;
    }

    @Override
    public final void d0(org.telegram.ui.Cells.t0 t0Var) {
        an anVar = this.f46862a.R;
        org.telegram.messenger.gj messageObject = t0Var.getMessageObject();
        if (messageObject == null || anVar.f45202g2 == null) {
            return;
        }
        if (org.telegram.messenger.t3.p0(anVar.f45173e)) {
            anVar.f45202g2.n(org.telegram.messenger.gj.u1(messageObject.f23817k), true);
        } else {
            anVar.f45202g2.n(messageObject.Y1(), true);
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i7;
        an anVar = this.f46862a.R;
        if (str == null) {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            ug.g1 g1Var = new ug.g1(anVar, i7, anVar.j(), new ug.j(tL_premiumGiftOption), null, anVar.Aa);
            g1Var.F2 = false;
            g1Var.Y1 = t0Var.getMessageObject().N3();
            anVar.showDialog(g1Var);
            return;
        }
        c(t0Var);
        vf.b bVar = anVar.dc;
        wg.e0 e0Var = wg.e0.O2;
        wg.a0.e1(LaunchActivity.Q(), str, bVar);
    }

    @Override
    public final void k0(org.telegram.ui.Cells.t0 t0Var, String str) {
        c(t0Var);
        an anVar = this.f46862a.R;
        wg.a0.e1(anVar, str, anVar.dc);
    }

    @Override
    public final void n(org.telegram.ui.Cells.t0 t0Var, int i7) {
        f0 f0Var = new f0(this, t0Var, i7, 6);
        an anVar = this.f46862a.R;
        if (anVar.D0.O) {
            anVar.Rb(false, true, true);
            org.telegram.messenger.g0.i3(f0Var, 80L);
            return;
        }
        f0Var.run();
    }

    @Override
    public final boolean p0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        boolean z10;
        an anVar = this.f46862a.R;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return anVar.Y7(t0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void q(org.telegram.ui.Cells.t0 t0Var) {
        dj djVar;
        an anVar = this.f46862a.R;
        org.telegram.messenger.gj messageObject = t0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        aj ajVar = anVar.A0;
        if (ajVar != null && (djVar = anVar.C0) != null && djVar.f58498y < 0) {
            int childCount = ajVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = anVar.A0.getChildAt(childCount);
                anVar.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            anVar.h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        anVar.h9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        anVar.Zc(messageObject, false);
    }

    @Override
    public final void v(org.telegram.ui.Cells.t0 t0Var, int i7, int i10) {
        l2.x xVar = new l2.x(this, t0Var, i7, i10, 11);
        an anVar = this.f46862a.R;
        if (anVar.D0.O) {
            anVar.Rb(false, true, true);
            org.telegram.messenger.g0.i3(xVar, 80L);
            return;
        }
        xVar.run();
    }

    @Override
    public final void x0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f46862a.R.n8(t0Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void M(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
