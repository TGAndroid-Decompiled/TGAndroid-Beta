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
public final class dm implements org.telegram.ui.Cells.t0 {
    public final lm f33499a;

    public dm(lm lmVar) {
        this.f33499a = lmVar;
    }

    @Override
    public final void C1(long j10) {
        zn znVar = this.f33499a.N;
        int i10 = zn.Ec;
        znVar.na(j10);
    }

    @Override
    public final void D1(org.telegram.ui.Cells.v0 v0Var) {
        zn znVar = this.f33499a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || znVar.O1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(znVar.e)) {
            znVar.O1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            znVar.O1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void N1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        zn znVar = this.f33499a.N;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            eg.e2 e2Var = new eg.e2(znVar, i10, znVar.i(), new eg.n(tL_premiumGiftOption), null, znVar.f40534ba);
            e2Var.G0 = false;
            e2Var.Z = v0Var.getMessageObject().isOut();
            znVar.showDialog(e2Var);
            return;
        }
        b(v0Var);
        ze.c cVar = znVar.f40811xb;
        gg.i1 i1Var = gg.i1.P0;
        gg.e1.T(LaunchActivity.R(), str, cVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 T0() {
        return this.f33499a.N;
    }

    @Override
    public final void V(org.telegram.ui.Cells.v0 v0Var, int i10) {
        ah.a aVar = new ah.a(this, v0Var, i10, 27);
        zn znVar = this.f33499a.N;
        if (znVar.f40800x0.K) {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(aVar, 80L);
            return;
        }
        aVar.run();
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.v0 v0Var) {
        en enVar;
        zn znVar = this.f33499a.N;
        ze.c cVar = znVar.f40811xb;
        if (cVar != null) {
            cVar.a(true);
        }
        if (v0Var.getMessageObject() == null) {
            enVar = null;
        } else {
            enVar = new en(this, v0Var, 6);
        }
        znVar.f40811xb = enVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.v0 v0Var) {
        vj vjVar;
        zn znVar = this.f33499a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        sj sjVar = znVar.f40759u0;
        if (sjVar != null && (vjVar = znVar.f40786w0) != null && vjVar.f5729y < 0) {
            int childCount = sjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = znVar.f40759u0.getChildAt(childCount);
                znVar.f40759u0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            znVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
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
    public final long d() {
        return this.f33499a.N.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        j3.b0 b0Var = new j3.b0(this, v0Var, i10, i11, 3);
        zn znVar = this.f33499a.N;
        if (znVar.f40800x0.K) {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(b0Var, 80L);
            return;
        }
        b0Var.run();
    }

    @Override
    public final void l1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        wk wkVar = this.f33499a.N.f40769ua;
        FrameLayout frameLayout = wkVar.D;
        HashMap hashMap = wkVar.f33560f;
        Random random = wkVar.h;
        ArrayList arrayList = wkVar.C;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = v0Var.getPhotoImage().getImageHeight();
            float imageWidth = v0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((cz) arrayList.get(i11)).f33271p == v0Var.getMessageObject().getId()) {
                        i12++;
                        if (((cz) arrayList.get(i11)).f33273r.getLottieAnimation() == null || ((cz) arrayList.get(i11)).f33273r.getLottieAnimation().w()) {
                            return;
                        }
                    }
                    if (((cz) arrayList.get(i11)).f33272q != null && document != null) {
                        i10 = i11;
                        if (((cz) arrayList.get(i11)).f33272q.f19165id == document.f19165id) {
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
                    if (!czVar.f33264i) {
                        czVar.f33262f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        czVar.f33263g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    czVar.f33271p = v0Var.getMessageObject().getId();
                    czVar.f33268m = true;
                    czVar.f33273r.setAllowStartAnimation(true);
                    int f10 = dz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f19165id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f19165id), Integer.valueOf((intValue + 1) % 4));
                        czVar.f33273r.setUniqKeyPrefix(intValue + "_" + czVar.f33271p + "_");
                    }
                    czVar.f33272q = document;
                    czVar.f33273r.setImage(ImageLocation.getForDocument(videoSize, document), e2.c.h(f10, "_", f10), null, "tgs", wkVar.f33559c, 1);
                    czVar.f33273r.setLayerNum(Integer.MAX_VALUE);
                    czVar.f33273r.setAutoRepeat(0);
                    if (czVar.f33273r.getLottieAnimation() != null) {
                        if (czVar.h) {
                            czVar.f33273r.getLottieAnimation().L(0, false, true);
                        }
                        czVar.f33273r.getLottieAnimation().start();
                    }
                    arrayList.add(czVar);
                    if (wkVar.f33561n) {
                        czVar.f33273r.onAttachedToWindow();
                        czVar.f33273r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void m2(org.telegram.ui.Cells.v0 v0Var, String str) {
        b(v0Var);
        zn znVar = this.f33499a.N;
        gg.e1.T(znVar, str, znVar.f40811xb);
    }

    @Override
    public final void o0(org.telegram.ui.Cells.v0 v0Var) {
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
        zn znVar = this.f33499a.N;
        t12.K2(null, znVar, znVar.f40534ba);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            nh.i9 orCreateStoryViewer = znVar.getOrCreateStoryViewer();
            sj sjVar = znVar.f40759u0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (znVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(znVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, nh.c7.a(sjVar));
                return;
            }
            return;
        }
        boolean z10 = false;
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.f22453y1;
            if (radialProgress2 != null && radialProgress2.f23090i.f29432q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                znVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.E0;
            if (messageObject3 != null && v0Var.K(messageObject3) && v0Var.f22423m1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        ui1 ui1Var = new ui1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = ui1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            ui1Var.f38861g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = ui1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                    sc1 sc1Var = new sc1(wallPaper, znVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z11 = wallPaperSettings3.blur;
                        boolean z12 = wallPaperSettings3.motion;
                        sc1Var.C1 = z11;
                        sc1Var.B1 = z12;
                        sc1Var.f35210k1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    sc1Var.f35214n0 = messageObject;
                    sc1Var.c1(messageObject.getDialogId());
                    sc1Var.f35179a.f35166a = znVar.f40534ba;
                    sc1Var.f35212m1 = new tc1(znVar, q10);
                    znVar.presentFragment(sc1Var);
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
        if (v0Var.getMessageObject().type == 21 && !messageObject.isOutOwner()) {
            if (!messageObject.settingAvatar) {
                if (videoSize2 != null) {
                    org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(0, true, true);
                    x40Var.f30466a = znVar;
                    x40Var.f();
                    x40Var.f30468c.f26698g0.r0(null, videoSize2, 0L);
                    x40Var.f30467b = new d9.c(znVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], znVar.getUserConfig().getClientUserId(), 3);
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
                photoEntry.caption = znVar.V.getFieldText();
                if (videoSize != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                photoEntry.isVideo = z4;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new cm(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(1, znVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z10 = true;
                }
                v40Var.e = z10;
                v40Var.f29379b = znVar.getMessagesController().getUser(Long.valueOf(znVar.Q5));
                PhotoViewer.t1().x2(v40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), znVar.Ca);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), znVar.Ca);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, znVar.Ca);
        }
    }

    @Override
    public final void w0(org.telegram.ui.Cells.v0 v0Var) {
        zn znVar = this.f33499a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            znVar.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
            }
        }
    }

    @Override
    public final boolean w2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z4;
        zn znVar = this.f33499a.N;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        if (z4) {
            return false;
        }
        return znVar.I7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void y2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.f33499a.N.W7(v0Var, reactionCount, z4, f10, f11);
    }

    @Override
    public final void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
