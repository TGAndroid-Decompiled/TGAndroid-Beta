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
public final class am implements org.telegram.ui.Cells.t0 {
    public final jm f32197a;

    public am(jm jmVar) {
        this.f32197a = jmVar;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        wn wnVar = this.f32197a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            rg.k1 k1Var = new rg.k1(wnVar, i10, wnVar.i(), new rg.k(tL_premiumGiftOption), null, wnVar.f39469ea);
            k1Var.J0 = false;
            k1Var.f42630c0 = w0Var.getMessageObject().isOut();
            wnVar.showDialog(k1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = wnVar.f39731zb;
        tg.g0 g0Var = tg.g0.S0;
        tg.c0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.m2 O0() {
        return this.f32197a.Q;
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        wn wnVar = this.f32197a.Q;
        if (wnVar.A0.N) {
            wnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        uj ujVar;
        wn wnVar = this.f32197a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        rj rjVar = wnVar.f39695x0;
        if (rjVar != null && (ujVar = wnVar.f39720z0) != null && ujVar.f42957y < 0) {
            int childCount = rjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = wnVar.f39695x0.getChildAt(childCount);
                wnVar.f39695x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            wnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        wnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        wnVar.rc(messageObject, false);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        bn bnVar;
        wn wnVar = this.f32197a.Q;
        nf.e eVar = wnVar.f39731zb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            bnVar = null;
        } else {
            bnVar = new bn(this, w0Var, 6);
        }
        wnVar.f39731zb = bnVar;
    }

    @Override
    public final long d() {
        return this.f32197a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        wn wnVar = this.f32197a.Q;
        if (wnVar.A0.N) {
            wnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        uk ukVar = this.f32197a.Q.f39705xa;
        FrameLayout frameLayout = ukVar.G;
        HashMap hashMap = ukVar.f32823f;
        Random random = ukVar.h;
        ArrayList arrayList = ukVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((bz) arrayList.get(i11)).f32524p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((bz) arrayList.get(i11)).f32526r.getLottieAnimation() == null || ((bz) arrayList.get(i11)).f32526r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((bz) arrayList.get(i11)).f32525q != null && document != null) {
                        i10 = i11;
                        if (((bz) arrayList.get(i11)).f32525q.f18341id == document.f18341id) {
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
                    if (!bzVar.f32517i) {
                        bzVar.f32515f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        bzVar.f32516g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    bzVar.f32524p = w0Var.getMessageObject().getId();
                    bzVar.f32521m = true;
                    bzVar.f32526r.setAllowStartAnimation(true);
                    int f7 = cz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f18341id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f18341id), Integer.valueOf((intValue + 1) % 4));
                        bzVar.f32526r.setUniqKeyPrefix(intValue + "_" + bzVar.f32524p + "_");
                    }
                    bzVar.f32525q = document;
                    bzVar.f32526r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.l(f7, f7, "_"), null, "tgs", ukVar.f32822c, 1);
                    bzVar.f32526r.setLayerNum(Integer.MAX_VALUE);
                    bzVar.f32526r.setAutoRepeat(0);
                    if (bzVar.f32526r.getLottieAnimation() != null) {
                        if (bzVar.h) {
                            bzVar.f32526r.getLottieAnimation().N(0, false, true);
                        }
                        bzVar.f32526r.getLottieAnimation().start();
                    }
                    arrayList.add(bzVar);
                    if (ukVar.f32824n) {
                        bzVar.f32526r.onAttachedToWindow();
                        bzVar.f32526r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        wn wnVar = this.f32197a.Q;
        tg.c0.T(wnVar, str, wnVar.f39731zb);
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
        wn wnVar = this.f32197a.Q;
        t12.J2(null, wnVar, wnVar.f39469ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = wnVar.getOrCreateStoryViewer();
            rj rjVar = wnVar.f39695x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (wnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(wnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(rjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f22352i.f23570q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                wnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f21758p1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        yi1 yi1Var = new yi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = yi1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            yi1Var.f40171g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = yi1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    xc1 xc1Var = new xc1(wallPaper, wnVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        xc1Var.F1 = z12;
                        xc1Var.E1 = z13;
                        xc1Var.f36191n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    xc1Var.f36196q0 = messageObject;
                    xc1Var.c1(messageObject.getDialogId());
                    xc1Var.f36152a.f36139a = wnVar.f39469ea;
                    xc1Var.f36195p1 = new yc1(wnVar, q6);
                    wnVar.presentFragment(xc1Var);
                    return;
                }
                return;
            }
            wnVar.xb();
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
                    org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(0, true, true);
                    v40Var.f28991a = wnVar;
                    v40Var.f();
                    v40Var.f28993c.f30017j0.r0(null, videoSize2, 0L);
                    v40Var.f28992b = new ci.y6(wnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], wnVar.getUserConfig().getClientUserId(), 7);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = wnVar.getFileLoader();
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
                photoEntry.caption = wnVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new zl(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(1, wnVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                t40Var.e = z11;
                t40Var.f28404b = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.T5));
                PhotoViewer.t1().w2(t40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), wnVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), wnVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, wnVar.Fa);
        }
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        wn wnVar = this.f32197a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.getResourceProvider());
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
            wnVar.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19298q7));
            }
        }
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        wn wnVar = this.f32197a.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return wnVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f32197a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void x1(long j3) {
        wn wnVar = this.f32197a.Q;
        int i10 = wn.Gc;
        wnVar.na(j3);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        wn wnVar = this.f32197a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || wnVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(wnVar.e)) {
            wnVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            wnVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
