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
    public final lm f32809a;

    public cm(lm lmVar) {
        this.f32809a = lmVar;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        zn znVar = this.f32809a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            rg.k1 k1Var = new rg.k1(znVar, i10, znVar.i(), new rg.k(tL_premiumGiftOption), null, znVar.f40324ea);
            k1Var.J0 = false;
            k1Var.f42665c0 = w0Var.getMessageObject().isOut();
            znVar.showDialog(k1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = znVar.f40587zb;
        tg.g0 g0Var = tg.g0.S0;
        tg.c0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 P0() {
        return this.f32809a.Q;
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        zn znVar = this.f32809a.Q;
        if (znVar.A0.N) {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        xj xjVar;
        zn znVar = this.f32809a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        uj ujVar = znVar.f40551x0;
        if (ujVar != null && (xjVar = znVar.f40576z0) != null && xjVar.f42992y < 0) {
            int childCount = ujVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = znVar.f40551x0.getChildAt(childCount);
                znVar.f40551x0.getClass();
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
        zn znVar = this.f32809a.Q;
        nf.e eVar = znVar.f40587zb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            enVar = null;
        } else {
            enVar = new en(this, w0Var, 6);
        }
        znVar.f40587zb = enVar;
    }

    @Override
    public final long d() {
        return this.f32809a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void h0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        zn znVar = this.f32809a.Q;
        if (znVar.A0.N) {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
            return;
        }
        zVar.run();
    }

    @Override
    public final void h1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        xk xkVar = this.f32809a.Q.f40561xa;
        FrameLayout frameLayout = xkVar.G;
        HashMap hashMap = xkVar.f34024f;
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
                    if (((fz) arrayList.get(i11)).f33794p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((fz) arrayList.get(i11)).f33796r.getLottieAnimation() == null || ((fz) arrayList.get(i11)).f33796r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((fz) arrayList.get(i11)).f33795q != null && document != null) {
                        i10 = i11;
                        if (((fz) arrayList.get(i11)).f33795q.f18349id == document.f18349id) {
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
                    if (!fzVar.f33787i) {
                        fzVar.f33785f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        fzVar.f33786g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    fzVar.f33794p = w0Var.getMessageObject().getId();
                    fzVar.f33791m = true;
                    fzVar.f33796r.setAllowStartAnimation(true);
                    int f7 = gz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f18349id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f18349id), Integer.valueOf((intValue + 1) % 4));
                        fzVar.f33796r.setUniqKeyPrefix(intValue + "_" + fzVar.f33794p + "_");
                    }
                    fzVar.f33795q = document;
                    fzVar.f33796r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", xkVar.f34023c, 1);
                    fzVar.f33796r.setLayerNum(Integer.MAX_VALUE);
                    fzVar.f33796r.setAutoRepeat(0);
                    if (fzVar.f33796r.getLottieAnimation() != null) {
                        if (fzVar.h) {
                            fzVar.f33796r.getLottieAnimation().N(0, false, true);
                        }
                        fzVar.f33796r.getLottieAnimation().start();
                    }
                    arrayList.add(fzVar);
                    if (xkVar.f34025n) {
                        fzVar.f33796r.onAttachedToWindow();
                        fzVar.f33796r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        zn znVar = this.f32809a.Q;
        tg.c0.T(znVar, str, znVar.f40587zb);
    }

    @Override
    public final void l0(org.telegram.ui.Cells.w0 w0Var) {
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
        zn znVar = this.f32809a.Q;
        t12.J2(null, znVar, znVar.f40324ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = znVar.getOrCreateStoryViewer();
            uj ujVar = znVar.f40551x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (znVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(znVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(ujVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f22367i.f23634q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                znVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f21770p1 != null) {
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
                            fj1Var.f33692g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = fj1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    gd1 gd1Var = new gd1(wallPaper, znVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        gd1Var.F1 = z12;
                        gd1Var.E1 = z13;
                        gd1Var.f39533n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    gd1Var.f39538q0 = messageObject;
                    gd1Var.c1(messageObject.getDialogId());
                    gd1Var.f39494a.f39482a = znVar.f40324ea;
                    gd1Var.f39537p1 = new hd1(znVar, q6);
                    znVar.presentFragment(gd1Var);
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
                    u40Var.f28619a = znVar;
                    u40Var.f();
                    u40Var.f28621c.f29108j0.r0(null, videoSize2, 0L);
                    u40Var.f28620b = new ci.z6(znVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], znVar.getUserConfig().getClientUserId(), 7);
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
                s40Var.f28121b = znVar.getMessagesController().getUser(Long.valueOf(znVar.T5));
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
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        zn znVar = this.f32809a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return znVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void s0(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.f32809a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            znVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7));
            }
        }
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f32809a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void y1(long j3) {
        zn znVar = this.f32809a.Q;
        int i10 = zn.Gc;
        znVar.na(j3);
    }

    @Override
    public final void z1(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.f32809a.Q;
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
    public final void R0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
