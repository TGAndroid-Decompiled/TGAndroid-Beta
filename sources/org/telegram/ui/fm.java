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
public final class fm implements org.telegram.ui.Cells.t0 {
    public final om f36432a;

    public fm(om omVar) {
        this.f36432a = omVar;
    }

    @Override
    public final void C1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        co coVar = this.f36432a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            sg.o1 o1Var = new sg.o1(coVar, i10, coVar.i(), new sg.k(tL_premiumGiftOption), null, coVar.f35247ea);
            o1Var.J0 = false;
            o1Var.f46196c0 = w0Var.getMessageObject().isOut();
            coVar.showDialog(o1Var);
            return;
        }
        b(w0Var);
        of.e eVar = coVar.Ab;
        ug.h0 h0Var = ug.h0.S0;
        ug.d0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final void K(org.telegram.ui.Cells.w0 w0Var, int i10) {
        dm dmVar = new dm(this, w0Var, i10, 0);
        co coVar = this.f36432a.Q;
        if (coVar.A0.N) {
            coVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(dmVar, 80L);
            return;
        }
        dmVar.run();
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 K0() {
        return this.f36432a.Q;
    }

    @Override
    public final void X(org.telegram.ui.Cells.w0 w0Var) {
        xj xjVar;
        co coVar = this.f36432a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        uj ujVar = coVar.f35473x0;
        if (ujVar != null && (xjVar = coVar.f35498z0) != null && xjVar.f45735y < 0) {
            int childCount = ujVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = coVar.f35473x0.getChildAt(childCount);
                coVar.f35473x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            coVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        coVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        coVar.rc(messageObject, false);
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        co coVar = this.f36432a.Q;
        ug.d0.T(coVar, str, coVar.Ab);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        hn hnVar;
        co coVar = this.f36432a.Q;
        of.e eVar = coVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            hnVar = null;
        } else {
            hnVar = new hn(this, w0Var, 6);
        }
        coVar.Ab = hnVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        co coVar = this.f36432a.Q;
        if (coVar.A0.N) {
            coVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final void b1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        xk xkVar = this.f36432a.Q.f35483xa;
        FrameLayout frameLayout = xkVar.G;
        HashMap hashMap = xkVar.f36816f;
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
                    if (((fz) arrayList.get(i11)).f36509p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((fz) arrayList.get(i11)).f36511r.getLottieAnimation() == null || ((fz) arrayList.get(i11)).f36511r.getLottieAnimation().w()) {
                            return;
                        }
                    }
                    if (((fz) arrayList.get(i11)).f36510q != null && document != null) {
                        i10 = i11;
                        if (((fz) arrayList.get(i11)).f36510q.f19875id == document.f19875id) {
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
                    if (!fzVar.f36502i) {
                        fzVar.f36500f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        fzVar.f36501g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    fzVar.f36509p = w0Var.getMessageObject().getId();
                    fzVar.f36506m = true;
                    fzVar.f36511r.setAllowStartAnimation(true);
                    int f7 = gz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f19875id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f19875id), Integer.valueOf((intValue + 1) % 4));
                        fzVar.f36511r.setUniqKeyPrefix(intValue + "_" + fzVar.f36509p + "_");
                    }
                    fzVar.f36510q = document;
                    fzVar.f36511r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", xkVar.f36814c, 1);
                    fzVar.f36511r.setLayerNum(Integer.MAX_VALUE);
                    fzVar.f36511r.setAutoRepeat(0);
                    if (fzVar.f36511r.getLottieAnimation() != null) {
                        if (fzVar.h) {
                            fzVar.f36511r.getLottieAnimation().L(0, false, true);
                        }
                        fzVar.f36511r.getLottieAnimation().start();
                    }
                    arrayList.add(fzVar);
                    if (xkVar.f36817n) {
                        fzVar.f36511r.onAttachedToWindow();
                        fzVar.f36511r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final long d() {
        return this.f36432a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void i0(org.telegram.ui.Cells.w0 w0Var) {
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
        co coVar = this.f36432a.Q;
        t12.K2(null, coVar, coVar.f35247ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            bi.pb orCreateStoryViewer = coVar.getOrCreateStoryViewer();
            uj ujVar = coVar.f35473x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (coVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(coVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, bi.d9.a(ujVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f24076i.f30573q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                coVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f23438p1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        gj1 gj1Var = new gj1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = gj1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            gj1Var.f36702g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = gj1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    fd1 fd1Var = new fd1(wallPaper, coVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        fd1Var.F1 = z12;
                        fd1Var.E1 = z13;
                        fd1Var.f41954n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    fd1Var.f41959q0 = messageObject;
                    fd1Var.c1(messageObject.getDialogId());
                    fd1Var.f41914a.f41898a = coVar.f35247ea;
                    fd1Var.f41958p1 = new gd1(coVar, q6);
                    coVar.presentFragment(fd1Var);
                    return;
                }
                return;
            }
            coVar.xb();
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
                    u40Var.f30799a = coVar;
                    u40Var.f();
                    u40Var.f30801c.f31291j0.r0(null, videoSize2, 0L);
                    u40Var.f30800b = new di.y6(coVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], coVar.getUserConfig().getClientUserId(), 7);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = coVar.getFileLoader();
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
                photoEntry.caption = coVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new em(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(1, coVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                s40Var.f30189e = z11;
                s40Var.f30187b = coVar.getMessagesController().getUser(Long.valueOf(coVar.T5));
                PhotoViewer.t1().x2(s40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), coVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), coVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, coVar.Fa);
        }
    }

    @Override
    public final boolean j2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        co coVar = this.f36432a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return coVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void l2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f36432a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void q0(org.telegram.ui.Cells.w0 w0Var) {
        co coVar = this.f36432a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.getResourceProvider());
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            coVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20898q7));
            }
        }
    }

    @Override
    public final void r1(long j3) {
        co coVar = this.f36432a.Q;
        int i10 = co.Hc;
        coVar.na(j3);
    }

    @Override
    public final void s1(org.telegram.ui.Cells.w0 w0Var) {
        co coVar = this.f36432a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || coVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(coVar.f35237e)) {
            coVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            coVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void M0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
