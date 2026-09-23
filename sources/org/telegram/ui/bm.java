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
    public final km f32143a;

    public bm(km kmVar) {
        this.f32143a = kmVar;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        xn xnVar = this.f32143a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            rg.k1 k1Var = new rg.k1(xnVar, i10, xnVar.i(), new rg.k(tL_premiumGiftOption), null, xnVar.f39370ea);
            k1Var.J0 = false;
            k1Var.f42297c0 = w0Var.getMessageObject().isOut();
            xnVar.showDialog(k1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = xnVar.f39632zb;
        tg.h0 h0Var = tg.h0.S0;
        tg.d0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 O0() {
        return this.f32143a.Q;
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        xn xnVar = this.f32143a.Q;
        if (xnVar.A0.N) {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        uj ujVar;
        xn xnVar = this.f32143a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        rj rjVar = xnVar.f39596x0;
        if (rjVar != null && (ujVar = xnVar.f39621z0) != null && ujVar.f42624y < 0) {
            int childCount = rjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = xnVar.f39596x0.getChildAt(childCount);
                xnVar.f39596x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            xnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        xnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        xnVar.rc(messageObject, false);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        cn cnVar;
        xn xnVar = this.f32143a.Q;
        nf.e eVar = xnVar.f39632zb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            cnVar = null;
        } else {
            cnVar = new cn(this, w0Var, 6);
        }
        xnVar.f39632zb = cnVar;
    }

    @Override
    public final long d() {
        return this.f32143a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        xn xnVar = this.f32143a.Q;
        if (xnVar.A0.N) {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        uk ukVar = this.f32143a.Q.f39606xa;
        FrameLayout frameLayout = ukVar.G;
        HashMap hashMap = ukVar.f32745f;
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
                    if (((cz) arrayList.get(i11)).f32452p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((cz) arrayList.get(i11)).f32454r.getLottieAnimation() == null || ((cz) arrayList.get(i11)).f32454r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((cz) arrayList.get(i11)).f32453q != null && document != null) {
                        i10 = i11;
                        if (((cz) arrayList.get(i11)).f32453q.f18089id == document.f18089id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    cz czVar = new cz();
                    czVar.h = true;
                    if (!czVar.f32445i) {
                        czVar.f32443f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        czVar.f32444g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    czVar.f32452p = w0Var.getMessageObject().getId();
                    czVar.f32449m = true;
                    czVar.f32454r.setAllowStartAnimation(true);
                    int f7 = dz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f18089id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f18089id), Integer.valueOf((intValue + 1) % 4));
                        czVar.f32454r.setUniqKeyPrefix(intValue + "_" + czVar.f32452p + "_");
                    }
                    czVar.f32453q = document;
                    czVar.f32454r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.l(f7, f7, "_"), null, "tgs", ukVar.f32744c, 1);
                    czVar.f32454r.setLayerNum(Integer.MAX_VALUE);
                    czVar.f32454r.setAutoRepeat(0);
                    if (czVar.f32454r.getLottieAnimation() != null) {
                        if (czVar.h) {
                            czVar.f32454r.getLottieAnimation().N(0, false, true);
                        }
                        czVar.f32454r.getLottieAnimation().start();
                    }
                    arrayList.add(czVar);
                    if (ukVar.f32746n) {
                        czVar.f32454r.onAttachedToWindow();
                        czVar.f32454r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        xn xnVar = this.f32143a.Q;
        tg.d0.T(xnVar, str, xnVar.f39632zb);
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
        xn xnVar = this.f32143a.Q;
        t12.J2(null, xnVar, xnVar.f39370ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = xnVar.getOrCreateStoryViewer();
            rj rjVar = xnVar.f39596x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (xnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(xnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(rjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f22101i.f28129q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                xnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f21509p1 != null) {
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
                            yi1Var.f39837g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = yi1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    xc1 xc1Var = new xc1(wallPaper, xnVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        xc1Var.F1 = z12;
                        xc1Var.E1 = z13;
                        xc1Var.f35819n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    xc1Var.f35824q0 = messageObject;
                    xc1Var.c1(messageObject.getDialogId());
                    xc1Var.f35780a.f35767a = xnVar.f39370ea;
                    xc1Var.f35823p1 = new yc1(xnVar, q6);
                    xnVar.presentFragment(xc1Var);
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
        if (w0Var.getMessageObject().type == 21 && !messageObject.isOutOwner()) {
            if (!messageObject.settingAvatar) {
                if (videoSize2 != null) {
                    org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(0, true, true);
                    v40Var.f28645a = xnVar;
                    v40Var.f();
                    v40Var.f28647c.f29677j0.r0(null, videoSize2, 0L);
                    v40Var.f28646b = new ci.y6(xnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], xnVar.getUserConfig().getClientUserId(), 7);
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
                photoEntry.caption = xnVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new am(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(1, xnVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                t40Var.e = z11;
                t40Var.f28088b = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.T5));
                PhotoViewer.t1().w2(t40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), xnVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), xnVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, xnVar.Fa);
        }
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        xn xnVar = this.f32143a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            xnVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19026q7));
            }
        }
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        xn xnVar = this.f32143a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return xnVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f32143a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void x1(long j3) {
        xn xnVar = this.f32143a.Q;
        int i10 = xn.Gc;
        xnVar.na(j3);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        xn xnVar = this.f32143a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || xnVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(xnVar.e)) {
            xnVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            xnVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
