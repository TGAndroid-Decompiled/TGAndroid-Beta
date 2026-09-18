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
public final class cm implements org.telegram.ui.Cells.t0 {
    public final lm f32716a;

    public cm(lm lmVar) {
        this.f32716a = lmVar;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        zn znVar = this.f32716a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            rg.k1 k1Var = new rg.k1(znVar, i10, znVar.i(), new rg.k(tL_premiumGiftOption), null, znVar.f40261ea);
            k1Var.J0 = false;
            k1Var.f42600c0 = w0Var.getMessageObject().isOut();
            znVar.showDialog(k1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = znVar.f40524zb;
        tg.g0 g0Var = tg.g0.S0;
        tg.c0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 O0() {
        return this.f32716a.Q;
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        zn znVar = this.f32716a.Q;
        if (znVar.A0.N) {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        wj wjVar;
        zn znVar = this.f32716a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        tj tjVar = znVar.f40488x0;
        if (tjVar != null && (wjVar = znVar.f40513z0) != null && wjVar.f42926y < 0) {
            int childCount = tjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = znVar.f40488x0.getChildAt(childCount);
                znVar.f40488x0.getClass();
                if (RecyclerView.S(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            znVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        znVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        znVar.rc(messageObject, false);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        en enVar;
        zn znVar = this.f32716a.Q;
        nf.e eVar = znVar.f40524zb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            enVar = null;
        } else {
            enVar = new en(this, w0Var, 6);
        }
        znVar.f40524zb = enVar;
    }

    @Override
    public final long d() {
        return this.f32716a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        zn znVar = this.f32716a.Q;
        if (znVar.A0.N) {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
            return;
        }
        zVar.run();
    }

    @Override
    public final void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        wk wkVar = this.f32716a.Q.f40498xa;
        FrameLayout frameLayout = wkVar.G;
        HashMap hashMap = wkVar.f33972f;
        Random random = wkVar.h;
        ArrayList arrayList = wkVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((fz) arrayList.get(i11)).f33655p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((fz) arrayList.get(i11)).f33657r.getLottieAnimation() == null || ((fz) arrayList.get(i11)).f33657r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((fz) arrayList.get(i11)).f33656q != null && document != null) {
                        i10 = i11;
                        if (((fz) arrayList.get(i11)).f33656q.f18302id == document.f18302id) {
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
                    if (!fzVar.f33648i) {
                        fzVar.f33646f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        fzVar.f33647g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    fzVar.f33655p = w0Var.getMessageObject().getId();
                    fzVar.f33652m = true;
                    fzVar.f33657r.setAllowStartAnimation(true);
                    int f7 = gz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f18302id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f18302id), Integer.valueOf((intValue + 1) % 4));
                        fzVar.f33657r.setUniqKeyPrefix(intValue + "_" + fzVar.f33655p + "_");
                    }
                    fzVar.f33656q = document;
                    fzVar.f33657r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", wkVar.f33971c, 1);
                    fzVar.f33657r.setLayerNum(Integer.MAX_VALUE);
                    fzVar.f33657r.setAutoRepeat(0);
                    if (fzVar.f33657r.getLottieAnimation() != null) {
                        if (fzVar.h) {
                            fzVar.f33657r.getLottieAnimation().N(0, false, true);
                        }
                        fzVar.f33657r.getLottieAnimation().start();
                    }
                    arrayList.add(fzVar);
                    if (wkVar.f33973n) {
                        fzVar.f33657r.onAttachedToWindow();
                        fzVar.f33657r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        zn znVar = this.f32716a.Q;
        tg.c0.T(znVar, str, znVar.f40524zb);
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
        zn znVar = this.f32716a.Q;
        t12.J2(null, znVar, znVar.f40261ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = znVar.getOrCreateStoryViewer();
            tj tjVar = znVar.f40488x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (znVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(znVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(tjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f22316i.f22931q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                znVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f21723p1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        ej1 ej1Var = new ej1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = ej1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            ej1Var.f33297g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = ej1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    ed1 ed1Var = new ed1(wallPaper, znVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        ed1Var.F1 = z12;
                        ed1Var.E1 = z13;
                        ed1Var.f38506n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    ed1Var.f38511q0 = messageObject;
                    ed1Var.c1(messageObject.getDialogId());
                    ed1Var.f38467a.f38453a = znVar.f40261ea;
                    ed1Var.f38510p1 = new fd1(znVar, q6);
                    znVar.presentFragment(ed1Var);
                    return;
                }
                return;
            }
            znVar.xb();
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
                    u40Var.f28554a = znVar;
                    u40Var.f();
                    u40Var.f28556c.f29033j0.r0(null, videoSize2, 0L);
                    u40Var.f28555b = new ci.z6(znVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], znVar.getUserConfig().getClientUserId(), 7);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = znVar.getFileLoader();
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
                photoEntry.caption = znVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new bm(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(1, znVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                s40Var.e = z11;
                s40Var.f28048b = znVar.getMessagesController().getUser(Long.valueOf(znVar.T5));
                PhotoViewer.t1().w2(s40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), znVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), znVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, znVar.Fa);
        }
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.f32716a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
            alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
            znVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19301q7));
            }
        }
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        zn znVar = this.f32716a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return znVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f32716a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void x1(long j3) {
        zn znVar = this.f32716a.Q;
        int i10 = zn.Gc;
        znVar.na(j3);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.f32716a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || znVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(znVar.e)) {
            znVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            znVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
