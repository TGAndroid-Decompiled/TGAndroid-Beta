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
    public final jm f32984a;

    public bm(jm jmVar) {
        this.f32984a = jmVar;
    }

    @Override
    public final void A1(long j10) {
        xn xnVar = this.f32984a.N;
        int i10 = xn.Ec;
        xnVar.na(j10);
    }

    @Override
    public final void B1(org.telegram.ui.Cells.v0 v0Var) {
        xn xnVar = this.f32984a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || xnVar.O1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(xnVar.e)) {
            xnVar.O1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            xnVar.O1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10) {
        ah.a aVar = new ah.a(this, v0Var, i10, 27);
        xn xnVar = this.f32984a.N;
        if (xnVar.f40234x0.K) {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(aVar, 80L);
            return;
        }
        aVar.run();
    }

    @Override
    public final void L1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        xn xnVar = this.f32984a.N;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            eg.e2 e2Var = new eg.e2(xnVar, i10, xnVar.i(), new eg.n(tL_premiumGiftOption), null, xnVar.f39968ba);
            e2Var.G0 = false;
            e2Var.Z = v0Var.getMessageObject().isOut();
            xnVar.showDialog(e2Var);
            return;
        }
        c(v0Var);
        af.f fVar = xnVar.f40245xb;
        gg.i1 i1Var = gg.i1.P0;
        gg.e1.T(LaunchActivity.R(), str, fVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 Q0() {
        return this.f32984a.N;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f32984a.N.b();
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        cn cnVar;
        xn xnVar = this.f32984a.N;
        af.f fVar = xnVar.f40245xb;
        if (fVar != null) {
            fVar.a(true);
        }
        if (v0Var.getMessageObject() == null) {
            cnVar = null;
        } else {
            cnVar = new cn(this, v0Var, 6);
        }
        xnVar.f40245xb = cnVar;
    }

    @Override
    public final void c0(org.telegram.ui.Cells.v0 v0Var) {
        tj tjVar;
        xn xnVar = this.f32984a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        qj qjVar = xnVar.f40193u0;
        if (qjVar != null && (tjVar = xnVar.f40220w0) != null && tjVar.f5740y < 0) {
            int childCount = qjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = xnVar.f40193u0.getChildAt(childCount);
                xnVar.f40193u0.getClass();
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

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void i1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        uk ukVar = this.f32984a.N.f40203ua;
        FrameLayout frameLayout = ukVar.D;
        HashMap hashMap = ukVar.f33051f;
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
                    if (((az) arrayList.get(i11)).f32739p == v0Var.getMessageObject().getId()) {
                        i12++;
                        if (((az) arrayList.get(i11)).f32741r.getLottieAnimation() == null || ((az) arrayList.get(i11)).f32741r.getLottieAnimation().w()) {
                            return;
                        }
                    }
                    if (((az) arrayList.get(i11)).f32740q != null && document != null) {
                        i10 = i11;
                        if (((az) arrayList.get(i11)).f32740q.f19190id == document.f19190id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    az azVar = new az();
                    azVar.h = true;
                    if (!azVar.f32732i) {
                        azVar.f32730f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        azVar.f32731g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    azVar.f32739p = v0Var.getMessageObject().getId();
                    azVar.f32736m = true;
                    azVar.f32741r.setAllowStartAnimation(true);
                    int f10 = bz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f19190id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f19190id), Integer.valueOf((intValue + 1) % 4));
                        azVar.f32741r.setUniqKeyPrefix(intValue + "_" + azVar.f32739p + "_");
                    }
                    azVar.f32740q = document;
                    azVar.f32741r.setImage(ImageLocation.getForDocument(videoSize, document), e2.c.h(f10, "_", f10), null, "tgs", ukVar.f33050c, 1);
                    azVar.f32741r.setLayerNum(Integer.MAX_VALUE);
                    azVar.f32741r.setAutoRepeat(0);
                    if (azVar.f32741r.getLottieAnimation() != null) {
                        if (azVar.h) {
                            azVar.f32741r.getLottieAnimation().L(0, false, true);
                        }
                        azVar.f32741r.getLottieAnimation().start();
                    }
                    arrayList.add(azVar);
                    if (ukVar.f33052n) {
                        azVar.f32741r.onAttachedToWindow();
                        azVar.f32741r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        j3.b0 b0Var = new j3.b0(this, v0Var, i10, i11, 3);
        xn xnVar = this.f32984a.N;
        if (xnVar.f40234x0.K) {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(b0Var, 80L);
            return;
        }
        b0Var.run();
    }

    @Override
    public final void l2(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        xn xnVar = this.f32984a.N;
        gg.e1.T(xnVar, str, xnVar.f40245xb);
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
        xn xnVar = this.f32984a.N;
        t12.K2(null, xnVar, xnVar.f39968ba);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            nh.i9 orCreateStoryViewer = xnVar.getOrCreateStoryViewer();
            qj qjVar = xnVar.f40193u0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (xnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(xnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, nh.c7.a(qjVar));
                return;
            }
            return;
        }
        boolean z10 = false;
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.f22485y1;
            if (radialProgress2 != null && radialProgress2.f23117i.f29162q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                xnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.E0;
            if (messageObject3 != null && v0Var.K(messageObject3) && v0Var.f22455m1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        mi1 mi1Var = new mi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = mi1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            mi1Var.f36329g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = mi1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                    lc1 lc1Var = new lc1(wallPaper, xnVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z11 = wallPaperSettings3.blur;
                        boolean z12 = wallPaperSettings3.motion;
                        lc1Var.C1 = z11;
                        lc1Var.B1 = z12;
                        lc1Var.f33318k1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    lc1Var.f33322n0 = messageObject;
                    lc1Var.c1(messageObject.getDialogId());
                    lc1Var.f33287a.f33270a = xnVar.f39968ba;
                    lc1Var.f33320m1 = new mc1(xnVar, q10);
                    xnVar.presentFragment(lc1Var);
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
                    org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, true, true);
                    w40Var.f30190a = xnVar;
                    w40Var.f();
                    w40Var.f30192c.f26702g0.r0(null, videoSize2, 0L);
                    w40Var.f30191b = new d9.c(xnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], xnVar.getUserConfig().getClientUserId(), 3);
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
                org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(1, xnVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z10 = true;
                }
                u40Var.e = z10;
                u40Var.f29105b = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.Q5));
                PhotoViewer.t1().x2(u40Var);
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
    public final void t0(org.telegram.ui.Cells.v0 v0Var) {
        xn xnVar = this.f32984a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            xnVar.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
            }
        }
    }

    @Override
    public final boolean u2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z4;
        xn xnVar = this.f32984a.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        if (z4) {
            return false;
        }
        return xnVar.I7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void x2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.f32984a.N.W7(v0Var, reactionCount, z4, f10, f11);
    }

    @Override
    public final void S0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
