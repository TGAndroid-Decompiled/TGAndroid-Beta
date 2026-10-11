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
    public final mm f37050a;

    public dm(mm mmVar) {
        this.f37050a = mmVar;
    }

    @Override
    public final void E1(long j3) {
        zn znVar = this.f37050a.Q;
        int i10 = zn.Hc;
        znVar.sa(j3);
    }

    @Override
    public final void F1(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.f37050a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || znVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(znVar.f44752e)) {
            znVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            znVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void P1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        zn znVar = this.f37050a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
            rg.l1 l1Var = new rg.l1(znVar, i10, znVar.i(), new rg.k(tL_premiumGiftOption), null, znVar.f44762ea);
            l1Var.J0 = false;
            l1Var.f47413c0 = w0Var.getMessageObject().isOut();
            znVar.showDialog(l1Var);
            return;
        }
        b(w0Var);
        of.e eVar = znVar.Ab;
        tg.f0 f0Var = tg.f0.S0;
        tg.b0.U(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.m2 T0() {
        return this.f37050a.Q;
    }

    @Override
    public final void X(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        zn znVar = this.f37050a.Q;
        if (znVar.A0.N) {
            znVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        en enVar;
        zn znVar = this.f37050a.Q;
        of.e eVar = znVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            enVar = null;
        } else {
            enVar = new en(this, w0Var, 6);
        }
        znVar.Ab = enVar;
    }

    @Override
    public final long d() {
        return this.f37050a.Q.d();
    }

    @Override
    public final void d0(org.telegram.ui.Cells.w0 w0Var) {
        zj zjVar;
        zn znVar = this.f37050a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        wj wjVar = znVar.f44989x0;
        if (wjVar != null && (zjVar = znVar.f45013z0) != null && zjVar.f47745y < 0) {
            int childCount = wjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = znVar.f44989x0.getChildAt(childCount);
                znVar.f44989x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            znVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        znVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        znVar.vc(messageObject, false);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void k0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        zn znVar = this.f37050a.Q;
        if (znVar.A0.N) {
            znVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final void m1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        yk ykVar = this.f37050a.Q.f44999xa;
        FrameLayout frameLayout = ykVar.G;
        HashMap hashMap = ykVar.f37484f;
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
                    if (((dz) arrayList.get(i11)).f37157p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((dz) arrayList.get(i11)).f37159r.getLottieAnimation() == null || ((dz) arrayList.get(i11)).f37159r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((dz) arrayList.get(i11)).f37158q != null && document != null) {
                        i10 = i11;
                        if (((dz) arrayList.get(i11)).f37158q.f20038id == document.f20038id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    dz dzVar = new dz();
                    dzVar.h = true;
                    if (!dzVar.f37150i) {
                        dzVar.f37148f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        dzVar.f37149g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    dzVar.f37157p = w0Var.getMessageObject().getId();
                    dzVar.f37154m = true;
                    dzVar.f37159r.setAllowStartAnimation(true);
                    int f7 = ez.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f20038id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f20038id), Integer.valueOf((intValue + 1) % 4));
                        dzVar.f37159r.setUniqKeyPrefix(intValue + "_" + dzVar.f37157p + "_");
                    }
                    dzVar.f37158q = document;
                    dzVar.f37159r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.l(f7, f7, "_"), null, "tgs", ykVar.f37482c, 1);
                    dzVar.f37159r.setLayerNum(Integer.MAX_VALUE);
                    dzVar.f37159r.setAutoRepeat(0);
                    if (dzVar.f37159r.getLottieAnimation() != null) {
                        if (dzVar.h) {
                            dzVar.f37159r.getLottieAnimation().N(0, false, true);
                        }
                        dzVar.f37159r.getLottieAnimation().start();
                    }
                    arrayList.add(dzVar);
                    if (ykVar.f37485n) {
                        dzVar.f37159r.onAttachedToWindow();
                        dzVar.f37159r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void n2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        zn znVar = this.f37050a.Q;
        tg.b0.U(znVar, str, znVar.Ab);
    }

    @Override
    public final void o0(org.telegram.ui.Cells.w0 w0Var) {
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
        zn znVar = this.f37050a.Q;
        t12.K2(null, znVar, znVar.f44762ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.kc orCreateStoryViewer = znVar.getOrCreateStoryViewer();
            wj wjVar = znVar.f44989x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (znVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(znVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.v9.a(wjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.J1;
            if (radialProgress2 != null && radialProgress2.f24258i.f31726q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                znVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.P0;
            if (messageObject3 != null && w0Var.O(messageObject3) && w0Var.f23640x1 != null) {
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
                            gj1Var.f38116g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = gj1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    fd1 fd1Var = new fd1(wallPaper, znVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        fd1Var.F1 = z12;
                        fd1Var.E1 = z13;
                        fd1Var.f43365n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    fd1Var.f43370q0 = messageObject;
                    fd1Var.c1(messageObject.getDialogId());
                    fd1Var.f43325a.f43310a = znVar.f44762ea;
                    fd1Var.f43369p1 = new gd1(znVar, q6);
                    znVar.presentFragment(fd1Var);
                    return;
                }
                return;
            }
            znVar.Bb();
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
                    org.telegram.ui.Components.n50 n50Var = new org.telegram.ui.Components.n50(0, true, true);
                    n50Var.f28948a = znVar;
                    n50Var.e();
                    n50Var.f28950c.f33228j0.r0(null, videoSize2, 0L);
                    n50Var.f28949b = new ci.y6(znVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], znVar.getUserConfig().getClientUserId(), 7);
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
                PhotoViewer.t1().g2(arrayList2, 0, 1, false, new cm(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.l50 l50Var = new org.telegram.ui.Components.l50(1, znVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                l50Var.f28184e = z11;
                l50Var.f28182b = znVar.getMessagesController().getUser(Long.valueOf(znVar.T5));
                PhotoViewer.t1().x2(l50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), znVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), znVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, znVar.Ga);
        }
    }

    @Override
    public final void w0(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.f37050a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            znVar.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21026q7));
            }
        }
    }

    @Override
    public final boolean x2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        zn znVar = this.f37050a.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) znVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return znVar.L7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void z2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f37050a.Q.Z7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void W0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
