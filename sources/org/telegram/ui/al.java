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
public final class al implements org.telegram.ui.Cells.q0 {
    public final fl f43794a;

    public al(fl flVar) {
        this.f43794a = flVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d2 E() {
        return this.f43794a.R;
    }

    @Override
    public final void M(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i3;
        vj vjVar = this.f43794a.R.Ra;
        FrameLayout frameLayout = vjVar.H;
        HashMap hashMap = vjVar.f45389f;
        Random random = vjVar.h;
        ArrayList arrayList = vjVar.G;
        if (arrayList.size() <= 12 && t0Var.getPhotoImage().L()) {
            float f10 = t0Var.getPhotoImage().O0;
            float f11 = t0Var.getPhotoImage().N0;
            if (f10 > 0.0f && f11 > 0.0f) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < arrayList.size()) {
                    if (((ex) arrayList.get(i10)).f45076p == t0Var.getMessageObject().f1()) {
                        i11++;
                        if (((ex) arrayList.get(i10)).f45078r.B() == null || ((ex) arrayList.get(i10)).f45078r.B().y()) {
                            return;
                        }
                    }
                    if (((ex) arrayList.get(i10)).f45077q != null && document != null) {
                        i3 = i10;
                        if (((ex) arrayList.get(i10)).f45077q.f27007id == document.f27007id) {
                            i12++;
                        }
                    } else {
                        i3 = i10;
                    }
                    i10 = i3 + 1;
                }
                if (i11 < 4) {
                    ex exVar = new ex();
                    exVar.h = true;
                    if (!exVar.f45069i) {
                        exVar.f45067f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        exVar.f45068g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                    }
                    exVar.f45076p = t0Var.getMessageObject().f1();
                    exVar.f45073m = true;
                    exVar.f45078r.f21272u0 = true;
                    int f12 = fx.f();
                    if (i12 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f27007id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f27007id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(intValue);
                        sb2.append("_");
                        exVar.f45078r.f21278w1 = a1.g.o(exVar.f45076p, "_", sb2);
                    }
                    exVar.f45077q = document;
                    exVar.f45078r.q0(org.telegram.messenger.ac.d(videoSize, document), com.google.android.recaptcha.internal.a.i(f12, "_", f12), null, "tgs", vjVar.f45387c, 1);
                    exVar.f45078r.E0(Integer.MAX_VALUE);
                    exVar.f45078r.W(0);
                    if (exVar.f45078r.B() != null) {
                        if (exVar.h) {
                            exVar.f45078r.B().N(0, false, true);
                        }
                        exVar.f45078r.B().start();
                    }
                    arrayList.add(exVar);
                    if (vjVar.f45390n) {
                        exVar.f45078r.P();
                        exVar.f45078r.H0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void W(long j10) {
        wm wmVar = this.f43794a.R;
        int i3 = wm.f51227jd;
        wmVar.Na(j10);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f43794a.R.b();
    }

    public final void c(org.telegram.ui.Cells.t0 t0Var) {
        am amVar;
        wm wmVar = this.f43794a.R;
        sf.b bVar = wmVar.f51263bc;
        if (bVar != null) {
            bVar.a(true);
        }
        if (t0Var.getMessageObject() == null) {
            amVar = null;
        } else {
            amVar = new am(this, t0Var, 6);
        }
        wmVar.f51263bc = amVar;
    }

    @Override
    public final void c0(org.telegram.ui.Cells.t0 t0Var) {
        wm wmVar = this.f43794a.R;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        if (messageObject == null || wmVar.f51323g2 == null) {
            return;
        }
        if (org.telegram.messenger.t3.p0(wmVar.f51292e)) {
            wmVar.f51323g2.n(org.telegram.messenger.zi.v1(messageObject.f26868k), true);
        } else {
            wmVar.f51323g2.n(messageObject.Z1(), true);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i3;
        wm wmVar = this.f43794a.R;
        if (str == null) {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            vg.h1 h1Var = new vg.h1(wmVar, i3, wmVar.j(), new vg.j(tL_premiumGiftOption), null, wmVar.f51557ya);
            h1Var.C2 = false;
            h1Var.V1 = t0Var.getMessageObject().O3();
            wmVar.showDialog(h1Var);
            return;
        }
        c(t0Var);
        sf.b bVar = wmVar.f51263bc;
        xg.g0 g0Var = xg.g0.L2;
        xg.c0.e1(LaunchActivity.Q(), str, bVar);
    }

    @Override
    public final void h(org.telegram.ui.Cells.t0 t0Var, int i3) {
        f4 f4Var = new f4(this, t0Var, i3, 4);
        wm wmVar = this.f43794a.R;
        if (wmVar.D0.O) {
            wmVar.Nb(false, true, true);
            org.telegram.messenger.g0.i3(f4Var, 80L);
            return;
        }
        f4Var.run();
    }

    @Override
    public final void q0(org.telegram.ui.Cells.t0 t0Var, String str) {
        c(t0Var);
        wm wmVar = this.f43794a.R;
        xg.c0.e1(wmVar, str, wmVar.f51263bc);
    }

    @Override
    public final void r(org.telegram.ui.Cells.t0 t0Var) {
        zi ziVar;
        wm wmVar = this.f43794a.R;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.K1 = true;
        wi wiVar = wmVar.A0;
        if (wiVar != null && (ziVar = wmVar.C0) != null && ziVar.f55518y < 0) {
            int childCount = wiVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = wmVar.A0.getChildAt(childCount);
                wmVar.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            wmVar.f9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        wmVar.f9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        wmVar.Vc(messageObject, false);
    }

    @Override
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        boolean z10;
        wm wmVar = this.f43794a.R;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return wmVar.X7(t0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void t(org.telegram.ui.Cells.t0 t0Var, int i3, int i10) {
        k2.a0 a0Var = new k2.a0(this, t0Var, i3, i10, 11);
        wm wmVar = this.f43794a.R;
        if (wmVar.D0.O) {
            wmVar.Nb(false, true, true);
            org.telegram.messenger.g0.i3(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final void u(org.telegram.ui.Cells.t0 t0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z10;
        int i3;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        PhotoViewer v12 = PhotoViewer.v1();
        wm wmVar = this.f43794a.R;
        v12.N2(null, wmVar, wmVar.f51557ya);
        boolean z11 = false;
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.f26878n0, 640, false, null, false);
        if (t0Var.getMessageObject().D == 24) {
            ei.r9 orCreateStoryViewer = wmVar.getOrCreateStoryViewer();
            wi wiVar = wmVar.A0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.zi messageObject2 = t0Var.getMessageObject();
            if (wmVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.f26868k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.f1();
                orCreateStoryViewer.T(wmVar.getParentActivity(), messageObject2.f26868k.media.storyItem, ei.i7.a(wiVar));
            }
        } else if (t0Var.getMessageObject().D == 22) {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
            RadialProgress2 radialProgress2 = t0Var.K1;
            if (radialProgress2 != null && radialProgress2.f31554i.f36083q == 3 && messageObject.f1() < 0 && (str = s12.R2) != null && TextUtils.equals(messageObject.f26868k.action.wallpaper.uploadingImage, str)) {
                s12.A();
                wmVar.fb(messageObject);
                return;
            }
            org.telegram.messenger.zi ziVar = t0Var.Q0;
            if (ziVar != null && t0Var.U(ziVar) && t0Var.f30441y1 != null) {
                TLRPC.MessageAction messageAction = messageObject.f26868k.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        kc1 kc1Var = new kc1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = kc1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            kc1Var.f46902g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = kc1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                    v61 v61Var = new v61(wallPaper, wmVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        v61Var.H1 = z12;
                        v61Var.G1 = z13;
                        v61Var.f47186p1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    v61Var.f47193s0 = messageObject;
                    v61Var.h1(org.telegram.messenger.zi.B0(messageObject.f26868k));
                    v61Var.f47141a.f47115a = wmVar.f51557ya;
                    v61Var.f47191r1 = new w61(wmVar, q10);
                    wmVar.presentFragment(v61Var);
                    return;
                }
                return;
            }
            wmVar.ac();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.f26868k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = org.telegram.messenger.w7.x(1000, messageObject.f26868k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.f26868k.action.photo.video_sizes;
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
                if (!messageObject.f26889q) {
                    if (videoSize2 != null) {
                        org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
                        f30Var.f33681a = wmVar;
                        f30Var.e();
                        f30Var.f33683c.f32215b2.u0(null, videoSize2, 0L);
                        f30Var.f33682b = new cg.d0(wmVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], wmVar.getUserConfig().e(), 0);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    org.telegram.messenger.ac.j(videoSize, messageObject.f26868k.action.photo);
                    org.telegram.messenger.w7 fileLoader = wmVar.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.f26868k.action.photo;
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
                    org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, I.getAbsolutePath(), 0, false, 0, 0);
                    yeVar.f25309a = wmVar.f51237a0.getFieldText();
                    if (videoSize != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yeVar.f25310b = z10;
                    arrayList3.add(yeVar);
                    PhotoViewer.v1().j2(arrayList3, 0, 1, false, new zk(this, messageObject, yeVar), null);
                    if (yeVar.f25310b) {
                        PhotoViewer.v1().R2(org.telegram.messenger.bd.M0(2131744382, null));
                    } else {
                        PhotoViewer.v1().R2(org.telegram.messenger.bd.M0(2131744385, null));
                    }
                    org.telegram.ui.Components.d30 d30Var = new org.telegram.ui.Components.d30(1, wmVar.getUserConfig().f());
                    if (videoSize != null) {
                        z11 = true;
                    }
                    d30Var.f32926e = z11;
                    d30Var.f32924b = wmVar.getMessagesController().a2(Long.valueOf(wmVar.f51376k6));
                    PhotoViewer.v1().A2(d30Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.v1().g2(videoSize.location, org.telegram.messenger.ac.j(videoSize, messageObject.f26868k.action.photo), wmVar.f51248ab);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.v1().R2(org.telegram.messenger.bd.M0(2131744382, null));
                }
            } else if (w10 != null) {
                PhotoViewer.v1().g2(w10.location, org.telegram.messenger.ac.i(w10, messageObject.f26868k.action.photo), wmVar.f51248ab);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.v1().R2(org.telegram.messenger.bd.M0(2131744385, null));
                }
            } else {
                PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, wmVar.f51248ab);
            }
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f43794a.R.l8(t0Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void x(org.telegram.ui.Cells.t0 t0Var) {
        wm wmVar = this.f43794a.R;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !t0Var.getMessageObject().Q3() && t0Var.getMessageObject().Z4() && t0Var.getMessageObject().T2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.getResourceProvider());
            String M0 = org.telegram.messenger.bd.M0(2131746292, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746293, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new x0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            wmVar.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, wmVar.getResourceProvider());
            }
        }
    }

    @Override
    public final void F(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
