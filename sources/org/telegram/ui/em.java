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
public final class em implements org.telegram.ui.Cells.t0 {
    public final nm f33441a;

    public em(nm nmVar) {
        this.f33441a = nmVar;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        bo boVar = this.f33441a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
            rg.k1 k1Var = new rg.k1(boVar, i10, boVar.i(), new rg.k(tL_premiumGiftOption), null, boVar.f32275ea);
            k1Var.J0 = false;
            k1Var.f42368c0 = w0Var.getMessageObject().isOut();
            boVar.showDialog(k1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = boVar.Ab;
        tg.h0 h0Var = tg.h0.S0;
        tg.d0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.o2 O0() {
        return this.f33441a.Q;
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        bo boVar = this.f33441a.Q;
        if (boVar.A0.N) {
            boVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        yj yjVar;
        bo boVar = this.f33441a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        vj vjVar = boVar.f32502x0;
        if (vjVar != null && (yjVar = boVar.f32527z0) != null && yjVar.f42694y < 0) {
            int childCount = vjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = boVar.f32502x0.getChildAt(childCount);
                boVar.f32502x0.getClass();
                if (RecyclerView.S(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            boVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        boVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        boVar.rc(messageObject, false);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        gn gnVar;
        bo boVar = this.f33441a.Q;
        nf.e eVar = boVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            gnVar = null;
        } else {
            gnVar = new gn(this, w0Var, 6);
        }
        boVar.Ab = gnVar;
    }

    @Override
    public final long d() {
        return this.f33441a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        bo boVar = this.f33441a.Q;
        if (boVar.A0.N) {
            boVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
            return;
        }
        zVar.run();
    }

    @Override
    public final void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        yk ykVar = this.f33441a.Q.f32512xa;
        FrameLayout frameLayout = ykVar.G;
        HashMap hashMap = ykVar.f34719f;
        Random random = ykVar.h;
        ArrayList arrayList = ykVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((hz) arrayList.get(i11)).f34394p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((hz) arrayList.get(i11)).f34396r.getLottieAnimation() == null || ((hz) arrayList.get(i11)).f34396r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((hz) arrayList.get(i11)).f34395q != null && document != null) {
                        i10 = i11;
                        if (((hz) arrayList.get(i11)).f34395q.f18127id == document.f18127id) {
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
                    if (!hzVar.f34387i) {
                        hzVar.f34385f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        hzVar.f34386g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    hzVar.f34394p = w0Var.getMessageObject().getId();
                    hzVar.f34391m = true;
                    hzVar.f34396r.setAllowStartAnimation(true);
                    int f7 = iz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f18127id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f18127id), Integer.valueOf((intValue + 1) % 4));
                        hzVar.f34396r.setUniqKeyPrefix(intValue + "_" + hzVar.f34394p + "_");
                    }
                    hzVar.f34395q = document;
                    hzVar.f34396r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", ykVar.f34718c, 1);
                    hzVar.f34396r.setLayerNum(Integer.MAX_VALUE);
                    hzVar.f34396r.setAutoRepeat(0);
                    if (hzVar.f34396r.getLottieAnimation() != null) {
                        if (hzVar.h) {
                            hzVar.f34396r.getLottieAnimation().N(0, false, true);
                        }
                        hzVar.f34396r.getLottieAnimation().start();
                    }
                    arrayList.add(hzVar);
                    if (ykVar.f34720n) {
                        hzVar.f34396r.onAttachedToWindow();
                        hzVar.f34396r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        bo boVar = this.f33441a.Q;
        tg.d0.T(boVar, str, boVar.Ab);
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
        bo boVar = this.f33441a.Q;
        t12.K2(null, boVar, boVar.f32275ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = boVar.getOrCreateStoryViewer();
            vj vjVar = boVar.f32502x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (boVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(boVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(vjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f22140i.f27818q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                boVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f21548p1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        fj1 fj1Var = new fj1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = fj1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            fj1Var.f33708g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = fj1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    gd1 gd1Var = new gd1(wallPaper, boVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        gd1Var.F1 = z12;
                        gd1Var.E1 = z13;
                        gd1Var.f39570n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    gd1Var.f39575q0 = messageObject;
                    gd1Var.c1(messageObject.getDialogId());
                    gd1Var.f39531a.f39517a = boVar.f32275ea;
                    gd1Var.f39574p1 = new hd1(boVar, q6);
                    boVar.presentFragment(gd1Var);
                    return;
                }
                return;
            }
            boVar.xb();
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
                    org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
                    u40Var.f28272a = boVar;
                    u40Var.f();
                    u40Var.f28274c.f28754j0.r0(null, videoSize2, 0L);
                    u40Var.f28273b = new ci.z6(boVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], boVar.getUserConfig().getClientUserId(), 7);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = boVar.getFileLoader();
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
                photoEntry.caption = boVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new dm(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(1, boVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                s40Var.e = z11;
                s40Var.f27761b = boVar.getMessagesController().getUser(Long.valueOf(boVar.T5));
                PhotoViewer.t1().x2(s40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), boVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), boVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, boVar.Fa);
        }
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        bo boVar = this.f33441a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.getResourceProvider());
            alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
            boVar.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19100q7));
            }
        }
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        bo boVar = this.f33441a.Q;
        z10 = ((org.telegram.ui.ActionBar.o2) boVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return boVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f33441a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void x1(long j3) {
        bo boVar = this.f33441a.Q;
        int i10 = bo.Hc;
        boVar.na(j3);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        bo boVar = this.f33441a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || boVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(boVar.e)) {
            boVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            boVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
