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
    public final nm f33371a;

    public em(nm nmVar) {
        this.f33371a = nmVar;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        bo boVar = this.f33371a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            rg.k1 k1Var = new rg.k1(boVar, i10, boVar.i(), new rg.k(tL_premiumGiftOption), null, boVar.f32297ea);
            k1Var.J0 = false;
            k1Var.f42346c0 = w0Var.getMessageObject().isOut();
            boVar.showDialog(k1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = boVar.Ab;
        tg.h0 h0Var = tg.h0.S0;
        tg.d0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 O0() {
        return this.f33371a.Q;
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        bo boVar = this.f33371a.Q;
        if (boVar.A0.N) {
            boVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        xj xjVar;
        bo boVar = this.f33371a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        uj ujVar = boVar.f32524x0;
        if (ujVar != null && (xjVar = boVar.f32549z0) != null && xjVar.f42672y < 0) {
            int childCount = ujVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = boVar.f32524x0.getChildAt(childCount);
                boVar.f32524x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
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
        bo boVar = this.f33371a.Q;
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
        return this.f33371a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        bo boVar = this.f33371a.Q;
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
        xk xkVar = this.f33371a.Q.f32534xa;
        FrameLayout frameLayout = xkVar.G;
        HashMap hashMap = xkVar.f34050f;
        Random random = xkVar.h;
        ArrayList arrayList = xkVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((fz) arrayList.get(i11)).f33714p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((fz) arrayList.get(i11)).f33716r.getLottieAnimation() == null || ((fz) arrayList.get(i11)).f33716r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((fz) arrayList.get(i11)).f33715q != null && document != null) {
                        i10 = i11;
                        if (((fz) arrayList.get(i11)).f33715q.f18118id == document.f18118id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    fz fzVar = new fz();
                    fzVar.h = true;
                    if (!fzVar.f33707i) {
                        fzVar.f33705f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        fzVar.f33706g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    fzVar.f33714p = w0Var.getMessageObject().getId();
                    fzVar.f33711m = true;
                    fzVar.f33716r.setAllowStartAnimation(true);
                    int f7 = gz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f18118id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f18118id), Integer.valueOf((intValue + 1) % 4));
                        fzVar.f33716r.setUniqKeyPrefix(intValue + "_" + fzVar.f33714p + "_");
                    }
                    fzVar.f33715q = document;
                    fzVar.f33716r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", xkVar.f34049c, 1);
                    fzVar.f33716r.setLayerNum(Integer.MAX_VALUE);
                    fzVar.f33716r.setAutoRepeat(0);
                    if (fzVar.f33716r.getLottieAnimation() != null) {
                        if (fzVar.h) {
                            fzVar.f33716r.getLottieAnimation().N(0, false, true);
                        }
                        fzVar.f33716r.getLottieAnimation().start();
                    }
                    arrayList.add(fzVar);
                    if (xkVar.f34051n) {
                        fzVar.f33716r.onAttachedToWindow();
                        fzVar.f33716r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        bo boVar = this.f33371a.Q;
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
        bo boVar = this.f33371a.Q;
        t12.K2(null, boVar, boVar.f32297ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = boVar.getOrCreateStoryViewer();
            uj ujVar = boVar.f32524x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (boVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(boVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(ujVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f22130i.f27814q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                boVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f21538p1 != null) {
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
                            fj1Var.f33598g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = fj1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                    ed1 ed1Var = new ed1(wallPaper, boVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        ed1Var.F1 = z12;
                        ed1Var.E1 = z13;
                        ed1Var.f38552n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    ed1Var.f38557q0 = messageObject;
                    ed1Var.c1(messageObject.getDialogId());
                    ed1Var.f38513a.f38499a = boVar.f32297ea;
                    ed1Var.f38556p1 = new fd1(boVar, q6);
                    boVar.presentFragment(ed1Var);
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
                    u40Var.f28283a = boVar;
                    u40Var.f();
                    u40Var.f28285c.f28762j0.r0(null, videoSize2, 0L);
                    u40Var.f28284b = new ci.z6(boVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], boVar.getUserConfig().getClientUserId(), 7);
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
                s40Var.f27767b = boVar.getMessagesController().getUser(Long.valueOf(boVar.T5));
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
        bo boVar = this.f33371a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.getResourceProvider());
            alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
            boVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19074q7));
            }
        }
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        bo boVar = this.f33371a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return boVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f33371a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void x1(long j3) {
        bo boVar = this.f33371a.Q;
        int i10 = bo.Hc;
        boVar.na(j3);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        bo boVar = this.f33371a.Q;
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
