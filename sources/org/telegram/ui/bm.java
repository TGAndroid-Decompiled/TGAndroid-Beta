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
public final class bm implements org.telegram.ui.Cells.t0 {
    public final jm f35554a;

    public bm(jm jmVar) {
        this.f35554a = jmVar;
    }

    @Override
    public final boolean A2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z4;
        xn xnVar = this.f35554a.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        if (z4) {
            return false;
        }
        return xnVar.I7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void D2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.f35554a.N.W7(v0Var, reactionCount, z4, f10, f11);
    }

    @Override
    public final void E1(long j10) {
        xn xnVar = this.f35554a.N;
        int i10 = xn.Ec;
        xnVar.na(j10);
    }

    @Override
    public final void F1(org.telegram.ui.Cells.v0 v0Var) {
        xn xnVar = this.f35554a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || xnVar.O1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(xnVar.f43165e)) {
            xnVar.O1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            xnVar.O1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void I(org.telegram.ui.Cells.v0 v0Var, int i10) {
        bh.a aVar = new bh.a(this, v0Var, i10, 27);
        xn xnVar = this.f35554a.N;
        if (xnVar.f43403x0.K) {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(aVar, 80L);
            return;
        }
        aVar.run();
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        xn xnVar = this.f35554a.N;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            fg.d2 d2Var = new fg.d2(xnVar, i10, xnVar.i(), new fg.n(tL_premiumGiftOption), null, xnVar.f43136ba);
            d2Var.G0 = false;
            d2Var.Z = v0Var.getMessageObject().isOut();
            xnVar.showDialog(d2Var);
            return;
        }
        c(v0Var);
        af.f fVar = xnVar.f43414xb;
        hg.i1 i1Var = hg.i1.P0;
        hg.e1.T(LaunchActivity.R(), str, fVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 T0() {
        return this.f35554a.N;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f35554a.N.b();
    }

    @Override
    public final void b0(org.telegram.ui.Cells.v0 v0Var) {
        tj tjVar;
        xn xnVar = this.f35554a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        qj qjVar = xnVar.f43362u0;
        if (qjVar != null && (tjVar = xnVar.f43389w0) != null && tjVar.f5825y < 0) {
            int childCount = qjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = xnVar.f43362u0.getChildAt(childCount);
                xnVar.f43362u0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            xnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        xnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        xnVar.rc(messageObject, false);
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        cn cnVar;
        xn xnVar = this.f35554a.N;
        af.f fVar = xnVar.f43414xb;
        if (fVar != null) {
            fVar.a(true);
        }
        if (v0Var.getMessageObject() == null) {
            cnVar = null;
        } else {
            cnVar = new cn(this, v0Var, 6);
        }
        xnVar.f43414xb = cnVar;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        j3.b0 b0Var = new j3.b0(this, v0Var, i10, i11, 3);
        xn xnVar = this.f35554a.N;
        if (xnVar.f43403x0.K) {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(b0Var, 80L);
            return;
        }
        b0Var.run();
    }

    @Override
    public final void l1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        uk ukVar = this.f35554a.N.f43372ua;
        FrameLayout frameLayout = ukVar.D;
        HashMap hashMap = ukVar.f35940f;
        Random random = ukVar.h;
        ArrayList arrayList = ukVar.C;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = v0Var.getPhotoImage().getImageHeight();
            float imageWidth = v0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((bz) arrayList.get(i11)).f35626p == v0Var.getMessageObject().getId()) {
                        i12++;
                        if (((bz) arrayList.get(i11)).f35628r.getLottieAnimation() == null || ((bz) arrayList.get(i11)).f35628r.getLottieAnimation().w()) {
                            return;
                        }
                    }
                    if (((bz) arrayList.get(i11)).f35627q != null && document != null) {
                        i10 = i11;
                        if (((bz) arrayList.get(i11)).f35627q.f20849id == document.f20849id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    bz bzVar = new bz();
                    bzVar.h = true;
                    if (!bzVar.f35619i) {
                        bzVar.f35617f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        bzVar.f35618g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    bzVar.f35626p = v0Var.getMessageObject().getId();
                    bzVar.f35623m = true;
                    bzVar.f35628r.setAllowStartAnimation(true);
                    int f10 = cz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f20849id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f20849id), Integer.valueOf((intValue + 1) % 4));
                        bzVar.f35628r.setUniqKeyPrefix(intValue + "_" + bzVar.f35626p + "_");
                    }
                    bzVar.f35627q = document;
                    bzVar.f35628r.setImage(ImageLocation.getForDocument(videoSize, document), e2.c.h(f10, "_", f10), null, "tgs", ukVar.f35938c, 1);
                    bzVar.f35628r.setLayerNum(Integer.MAX_VALUE);
                    bzVar.f35628r.setAutoRepeat(0);
                    if (bzVar.f35628r.getLottieAnimation() != null) {
                        if (bzVar.h) {
                            bzVar.f35628r.getLottieAnimation().L(0, false, true);
                        }
                        bzVar.f35628r.getLottieAnimation().start();
                    }
                    arrayList.add(bzVar);
                    if (ukVar.f35941n) {
                        bzVar.f35628r.onAttachedToWindow();
                        bzVar.f35628r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void m0(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File pathToAttach;
        boolean z4;
        int i10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        xn xnVar = this.f35554a.N;
        t12.K2(null, xnVar, xnVar.f43136ba);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            oh.i9 orCreateStoryViewer = xnVar.getOrCreateStoryViewer();
            qj qjVar = xnVar.f43362u0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (xnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(xnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, oh.c7.a(qjVar));
                return;
            }
            return;
        }
        boolean z10 = false;
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.f24297y1;
            if (radialProgress2 != null && radialProgress2.f24972i.f32701q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                xnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.E0;
            if (messageObject3 != null && v0Var.K(messageObject3) && v0Var.f24267m1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        pi1 pi1Var = new pi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = pi1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            pi1Var.f40061g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = pi1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                    nc1 nc1Var = new nc1(wallPaper, xnVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z11 = wallPaperSettings3.blur;
                        boolean z12 = wallPaperSettings3.motion;
                        nc1Var.C1 = z11;
                        nc1Var.B1 = z12;
                        nc1Var.f36518k1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    nc1Var.f36522n0 = messageObject;
                    nc1Var.c1(messageObject.getDialogId());
                    nc1Var.f36486a.f36188a = xnVar.f43136ba;
                    nc1Var.f36520m1 = new oc1(xnVar, q10);
                    xnVar.presentFragment(nc1Var);
                    return;
                }
                return;
            }
            xnVar.xb();
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
        if (v0Var.getMessageObject().type == 21 && !messageObject.isOutOwner()) {
            if (!messageObject.settingAvatar) {
                if (videoSize2 != null) {
                    org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
                    y40Var.f33294a = xnVar;
                    y40Var.f();
                    y40Var.f33296c.f29054g0.r0(null, videoSize2, 0L);
                    y40Var.f33295b = new d9.c(xnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], xnVar.getUserConfig().getClientUserId(), 3);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = xnVar.getFileLoader();
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
                photoEntry.caption = xnVar.V.getFieldText();
                if (videoSize != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                photoEntry.isVideo = z4;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new am(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(1, xnVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z10 = true;
                }
                w40Var.f32643e = z10;
                w40Var.f32641b = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.Q5));
                PhotoViewer.t1().x2(w40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), xnVar.Ca);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), xnVar.Ca);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, xnVar.Ca);
        }
    }

    @Override
    public final void r2(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        xn xnVar = this.f35554a.N;
        hg.e1.T(xnVar, str, xnVar.f43414xb);
    }

    @Override
    public final void t0(org.telegram.ui.Cells.v0 v0Var) {
        xn xnVar = this.f35554a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            xnVar.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
            }
        }
    }

    @Override
    public final void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
