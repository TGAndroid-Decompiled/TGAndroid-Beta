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
    public final km f32390a;

    public bm(km kmVar) {
        this.f32390a = kmVar;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        xn xnVar = this.f32390a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
            rg.k1 k1Var = new rg.k1(xnVar, i10, xnVar.i(), new rg.k(tL_premiumGiftOption), null, xnVar.f39750ea);
            k1Var.J0 = false;
            k1Var.f42675c0 = w0Var.getMessageObject().isOut();
            xnVar.showDialog(k1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = xnVar.f40013zb;
        tg.g0 g0Var = tg.g0.S0;
        tg.c0.T(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.o2 O0() {
        return this.f32390a.Q;
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        xn xnVar = this.f32390a.Q;
        if (xnVar.A0.N) {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        wj wjVar;
        xn xnVar = this.f32390a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        tj tjVar = xnVar.f39977x0;
        if (tjVar != null && (wjVar = xnVar.f40002z0) != null && wjVar.f43002y < 0) {
            int childCount = tjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = xnVar.f39977x0.getChildAt(childCount);
                xnVar.f39977x0.getClass();
                if (RecyclerView.S(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
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
        xn xnVar = this.f32390a.Q;
        nf.e eVar = xnVar.f40013zb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            cnVar = null;
        } else {
            cnVar = new cn(this, w0Var, 6);
        }
        xnVar.f40013zb = cnVar;
    }

    @Override
    public final long d() {
        return this.f32390a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        xn xnVar = this.f32390a.Q;
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
        wk wkVar = this.f32390a.Q.f39987xa;
        FrameLayout frameLayout = wkVar.G;
        HashMap hashMap = wkVar.f33660f;
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
                    if (((ez) arrayList.get(i11)).f33364p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((ez) arrayList.get(i11)).f33366r.getLottieAnimation() == null || ((ez) arrayList.get(i11)).f33366r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((ez) arrayList.get(i11)).f33365q != null && document != null) {
                        i10 = i11;
                        if (((ez) arrayList.get(i11)).f33365q.f18335id == document.f18335id) {
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
                    if (!ezVar.f33357i) {
                        ezVar.f33355f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        ezVar.f33356g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    ezVar.f33364p = w0Var.getMessageObject().getId();
                    ezVar.f33361m = true;
                    ezVar.f33366r.setAllowStartAnimation(true);
                    int f7 = fz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f18335id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f18335id), Integer.valueOf((intValue + 1) % 4));
                        ezVar.f33366r.setUniqKeyPrefix(intValue + "_" + ezVar.f33364p + "_");
                    }
                    ezVar.f33365q = document;
                    ezVar.f33366r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", wkVar.f33659c, 1);
                    ezVar.f33366r.setLayerNum(Integer.MAX_VALUE);
                    ezVar.f33366r.setAutoRepeat(0);
                    if (ezVar.f33366r.getLottieAnimation() != null) {
                        if (ezVar.h) {
                            ezVar.f33366r.getLottieAnimation().N(0, false, true);
                        }
                        ezVar.f33366r.getLottieAnimation().start();
                    }
                    arrayList.add(ezVar);
                    if (wkVar.f33661n) {
                        ezVar.f33366r.onAttachedToWindow();
                        ezVar.f33366r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        xn xnVar = this.f32390a.Q;
        tg.c0.T(xnVar, str, xnVar.f40013zb);
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
        xn xnVar = this.f32390a.Q;
        t12.J2(null, xnVar, xnVar.f39750ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = xnVar.getOrCreateStoryViewer();
            tj tjVar = xnVar.f39977x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (xnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(xnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(tjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f22355i.f24241q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                xnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.L(messageObject3) && w0Var.f21761p1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        wi1 wi1Var = new wi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = wi1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            wi1Var.f39356g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = wi1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                    yc1 yc1Var = new yc1(wallPaper, xnVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        yc1Var.F1 = z12;
                        yc1Var.E1 = z13;
                        yc1Var.f36429n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    yc1Var.f36434q0 = messageObject;
                    yc1Var.c1(messageObject.getDialogId());
                    yc1Var.f36390a.f36377a = xnVar.f39750ea;
                    yc1Var.f36433p1 = new zc1(xnVar, q6);
                    xnVar.presentFragment(yc1Var);
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
                    org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(0, true, true);
                    x40Var.f30246a = xnVar;
                    x40Var.f();
                    x40Var.f30248c.f29974j0.r0(null, videoSize2, 0L);
                    x40Var.f30247b = new ci.y6(xnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], xnVar.getUserConfig().getClientUserId(), 7);
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
                org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(1, xnVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                v40Var.e = z11;
                v40Var.f29028b = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.T5));
                PhotoViewer.t1().w2(v40Var);
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
        xn xnVar = this.f32390a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            xnVar.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
            }
        }
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        xn xnVar = this.f32390a.Q;
        z10 = ((org.telegram.ui.ActionBar.o2) xnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return xnVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f32390a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void x1(long j3) {
        xn xnVar = this.f32390a.Q;
        int i10 = xn.Gc;
        xnVar.na(j3);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        xn xnVar = this.f32390a.Q;
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
