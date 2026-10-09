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
        if (ChatObject.isMonoForum(znVar.f44753e)) {
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
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            rg.l1 l1Var = new rg.l1(znVar, i10, znVar.i(), new rg.k(tL_premiumGiftOption), null, znVar.f44763ea);
            l1Var.J0 = false;
            l1Var.f47323c0 = w0Var.getMessageObject().isOut();
            znVar.showDialog(l1Var);
            return;
        }
        b(w0Var);
        of.e eVar = znVar.Ab;
        tg.g0 g0Var = tg.g0.S0;
        tg.c0.U(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 T0() {
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
        wj wjVar = znVar.f44990x0;
        if (wjVar != null && (zjVar = znVar.f45014z0) != null && zjVar.f47655y < 0) {
            int childCount = wjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = znVar.f44990x0.getChildAt(childCount);
                znVar.f44990x0.getClass();
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
        yk ykVar = this.f37050a.Q.f45000xa;
        FrameLayout frameLayout = ykVar.G;
        HashMap hashMap = ykVar.f37723f;
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
                    if (((ez) arrayList.get(i11)).f37400p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((ez) arrayList.get(i11)).f37402r.getLottieAnimation() == null || ((ez) arrayList.get(i11)).f37402r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((ez) arrayList.get(i11)).f37401q != null && document != null) {
                        i10 = i11;
                        if (((ez) arrayList.get(i11)).f37401q.f20044id == document.f20044id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    ez ezVar = new ez();
                    ezVar.h = true;
                    if (!ezVar.f37393i) {
                        ezVar.f37391f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        ezVar.f37392g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    ezVar.f37400p = w0Var.getMessageObject().getId();
                    ezVar.f37397m = true;
                    ezVar.f37402r.setAllowStartAnimation(true);
                    int f7 = fz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f20044id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f20044id), Integer.valueOf((intValue + 1) % 4));
                        ezVar.f37402r.setUniqKeyPrefix(intValue + "_" + ezVar.f37400p + "_");
                    }
                    ezVar.f37401q = document;
                    ezVar.f37402r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.l(f7, f7, "_"), null, "tgs", ykVar.f37721c, 1);
                    ezVar.f37402r.setLayerNum(Integer.MAX_VALUE);
                    ezVar.f37402r.setAutoRepeat(0);
                    if (ezVar.f37402r.getLottieAnimation() != null) {
                        if (ezVar.h) {
                            ezVar.f37402r.getLottieAnimation().N(0, false, true);
                        }
                        ezVar.f37402r.getLottieAnimation().start();
                    }
                    arrayList.add(ezVar);
                    if (ykVar.f37724n) {
                        ezVar.f37402r.onAttachedToWindow();
                        ezVar.f37402r.setParentView(frameLayout);
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
        tg.c0.U(znVar, str, znVar.Ab);
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
        t12.K2(null, znVar, znVar.f44763ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.kc orCreateStoryViewer = znVar.getOrCreateStoryViewer();
            wj wjVar = znVar.f44990x0;
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
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.J1;
            if (radialProgress2 != null && radialProgress2.f24266i.f31421q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                znVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.P0;
            if (messageObject3 != null && w0Var.O(messageObject3) && w0Var.f23648x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        ij1 ij1Var = new ij1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = ij1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            ij1Var.f38680g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = ij1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                    gd1 gd1Var = new gd1(wallPaper, znVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        gd1Var.F1 = z12;
                        gd1Var.E1 = z13;
                        gd1Var.f43977n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    gd1Var.f43982q0 = messageObject;
                    gd1Var.c1(messageObject.getDialogId());
                    gd1Var.f43937a.f43922a = znVar.f44763ea;
                    gd1Var.f43981p1 = new hd1(znVar, q6);
                    znVar.presentFragment(gd1Var);
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
                    org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(0, true, true);
                    m50Var.f28682a = znVar;
                    m50Var.e();
                    m50Var.f28684c.f33240j0.r0(null, videoSize2, 0L);
                    m50Var.f28683b = new ci.y6(znVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], znVar.getUserConfig().getClientUserId(), 7);
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
                org.telegram.ui.Components.k50 k50Var = new org.telegram.ui.Components.k50(1, znVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                k50Var.f27850e = z11;
                k50Var.f27848b = znVar.getMessagesController().getUser(Long.valueOf(znVar.T5));
                PhotoViewer.t1().x2(k50Var);
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
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
            znVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21037q7));
            }
        }
    }

    @Override
    public final boolean x2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        zn znVar = this.f37050a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
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
