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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
public final class gm implements org.telegram.ui.Cells.t0 {
    public final pm f33136a;

    public gm(pm pmVar) {
        this.f33136a = pmVar;
    }

    @Override
    public final void H1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        eo eoVar = this.f33136a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            qg.m1 m1Var = new qg.m1(eoVar, i10, eoVar.i(), new qg.k(tL_premiumGiftOption), null, eoVar.f32316ea);
            m1Var.J0 = false;
            m1Var.f40814c0 = w0Var.getMessageObject().isOut();
            eoVar.showDialog(m1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = eoVar.Ab;
        sg.h0 h0Var = sg.h0.S0;
        sg.c0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 O0() {
        return this.f33136a.Q;
    }

    @Override
    public final void V(org.telegram.ui.Cells.w0 w0Var, int i10) {
        bi.g3 g3Var = new bi.g3(this, w0Var, i10, 27);
        eo eoVar = this.f33136a.Q;
        if (eoVar.A0.N) {
            eoVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(g3Var, 80L);
            return;
        }
        g3Var.run();
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void a0(org.telegram.ui.Cells.w0 w0Var) {
        zj zjVar;
        eo eoVar = this.f33136a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        wj wjVar = eoVar.f32542x0;
        if (wjVar != null && (zjVar = eoVar.f32567z0) != null && zjVar.f41607y < 0) {
            int childCount = wjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = eoVar.f32542x0.getChildAt(childCount);
                eoVar.f32542x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            eoVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        eoVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        eoVar.rc(messageObject, false);
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        in inVar;
        eo eoVar = this.f33136a.Q;
        nf.e eVar = eoVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            inVar = null;
        } else {
            inVar = new in(this, w0Var, 6);
        }
        eoVar.Ab = inVar;
    }

    @Override
    public final long d() {
        return this.f33136a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void f1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        zk zkVar = this.f33136a.Q.f32552xa;
        FrameLayout frameLayout = zkVar.G;
        HashMap hashMap = zkVar.f33818f;
        Random random = zkVar.h;
        ArrayList arrayList = zkVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((hz) arrayList.get(i11)).f33499p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((hz) arrayList.get(i11)).f33501r.getLottieAnimation() == null || ((hz) arrayList.get(i11)).f33501r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((hz) arrayList.get(i11)).f33500q != null && document != null) {
                        i10 = i11;
                        if (((hz) arrayList.get(i11)).f33500q.f17201id == document.f17201id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    hz hzVar = new hz();
                    hzVar.h = true;
                    if (!hzVar.f33492i) {
                        hzVar.f33490f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        hzVar.f33491g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    hzVar.f33499p = w0Var.getMessageObject().getId();
                    hzVar.f33496m = true;
                    hzVar.f33501r.setAllowStartAnimation(true);
                    int f7 = iz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f17201id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f17201id), Integer.valueOf((intValue + 1) % 4));
                        hzVar.f33501r.setUniqKeyPrefix(intValue + "_" + hzVar.f33499p + "_");
                    }
                    hzVar.f33500q = document;
                    hzVar.f33501r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", zkVar.f33817c, 1);
                    hzVar.f33501r.setLayerNum(Integer.MAX_VALUE);
                    hzVar.f33501r.setAutoRepeat(0);
                    if (hzVar.f33501r.getLottieAnimation() != null) {
                        if (hzVar.h) {
                            hzVar.f33501r.getLottieAnimation().N(0, false, true);
                        }
                        hzVar.f33501r.getLottieAnimation().start();
                    }
                    arrayList.add(hzVar);
                    if (zkVar.f33819n) {
                        hzVar.f33501r.onAttachedToWindow();
                        hzVar.f33501r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void f2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        eo eoVar = this.f33136a.Q;
        sg.c0.T(eoVar, str, eoVar.Ab);
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        eo eoVar = this.f33136a.Q;
        if (eoVar.A0.N) {
            eoVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
            return;
        }
        zVar.run();
    }

    @Override
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File pathToAttach;
        boolean z10;
        int i10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = w0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        eo eoVar = this.f33136a.Q;
        t12.K2(null, eoVar, eoVar.f32316ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            zh.u7 orCreateStoryViewer = eoVar.getOrCreateStoryViewer();
            wj wjVar = eoVar.f32542x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (eoVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(eoVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, zh.s5.a(wjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f21215i.f22080q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                eoVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f20623p1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        kj1 kj1Var = new kj1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = kj1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            kj1Var.f34403g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = kj1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    jd1 jd1Var = new jd1(wallPaper, eoVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        jd1Var.F1 = z12;
                        jd1Var.E1 = z13;
                        jd1Var.f30953n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    jd1Var.f30958q0 = messageObject;
                    jd1Var.c1(messageObject.getDialogId());
                    jd1Var.f30914a.f30901a = eoVar.f32316ea;
                    jd1Var.f30957p1 = new kd1(eoVar, q6);
                    eoVar.presentFragment(jd1Var);
                    return;
                }
                return;
            }
            eoVar.xb();
            return;
        }
        ArrayList<TLRPC.VideoSize> arrayList = messageObject.messageOwner.action.photo.video_sizes;
        if (arrayList != null && !arrayList.isEmpty()) {
            videoSize = FileLoader.getClosestVideoSizeWithSize(messageObject.messageOwner.action.photo.video_sizes, 1000);
            videoSize2 = FileLoader.getEmojiMarkup(messageObject.messageOwner.action.photo.video_sizes);
        } else {
            videoSize = null;
            videoSize2 = null;
        }
        if (w0Var.getMessageObject().type == 21 && !messageObject.isOutOwner()) {
            if (!messageObject.settingAvatar) {
                if (videoSize2 != null) {
                    org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
                    e50Var.f22552a = eoVar;
                    e50Var.f();
                    e50Var.f22554c.f29378j0.r0(null, videoSize2, 0L);
                    e50Var.f22553b = new bi.a8(eoVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], eoVar.getUserConfig().getClientUserId(), 7);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = eoVar.getFileLoader();
                if (videoSize == null) {
                    pathToAttach = fileLoader.getPathToAttach(messageObject.messageOwner.action.photo);
                } else {
                    pathToAttach = fileLoader.getPathToAttach(videoSize);
                }
                File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
                if (!pathToAttach.exists()) {
                    if (file.exists()) {
                        pathToAttach = file;
                    } else {
                        return;
                    }
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.caption = eoVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new fm(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(1, eoVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                c50Var.e = z11;
                c50Var.f21990b = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.T5));
                PhotoViewer.t1().x2(c50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), eoVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), eoVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, eoVar.Fa);
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        eo eoVar = this.f33136a.Q;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return eoVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        eo eoVar = this.f33136a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.getResourceProvider());
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            eoVar.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
            }
        }
    }

    @Override
    public final void s2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f33136a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void w1(long j3) {
        eo eoVar = this.f33136a.Q;
        int i10 = eo.Hc;
        eoVar.na(j3);
    }

    @Override
    public final void x1(org.telegram.ui.Cells.w0 w0Var) {
        eo eoVar = this.f33136a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || eoVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(eoVar.e)) {
            eoVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            eoVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
