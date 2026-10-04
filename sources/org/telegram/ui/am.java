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
    public final jm f34862a;

    public am(jm jmVar) {
        this.f34862a = jmVar;
    }

    @Override
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        yn ynVar = this.f34862a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            rg.m1 m1Var = new rg.m1(ynVar, i10, ynVar.i(), new rg.k(tL_premiumGiftOption), null, ynVar.f43300ca);
            m1Var.J0 = false;
            m1Var.f46188c0 = w0Var.getMessageObject().isOut();
            ynVar.showDialog(m1Var);
            return;
        }
        b(w0Var);
        nf.e eVar = ynVar.f43563xb;
        tg.g0 g0Var = tg.g0.S0;
        tg.c0.R(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final void L(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        yn ynVar = this.f34862a.Q;
        if (ynVar.f43565y0.N) {
            ynVar.kb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
            return;
        }
        s1Var.run();
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 O0() {
        return this.f34862a.Q;
    }

    @Override
    public final void Y(org.telegram.ui.Cells.w0 w0Var) {
        vj vjVar;
        yn ynVar = this.f34862a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        sj sjVar = ynVar.f43526v0;
        if (sjVar != null && (vjVar = ynVar.f43552x0) != null && vjVar.f46521y < 0) {
            int childCount = sjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = ynVar.f43526v0.getChildAt(childCount);
                ynVar.f43526v0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            ynVar.M8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        ynVar.M8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        ynVar.qc(messageObject, false);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        cn cnVar;
        yn ynVar = this.f34862a.Q;
        nf.e eVar = ynVar.f43563xb;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            cnVar = null;
        } else {
            cnVar = new cn(this, w0Var, 6);
        }
        ynVar.f43563xb = cnVar;
    }

    @Override
    public final long d() {
        return this.f34862a.Q.d();
    }

    @Override
    public final void d0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        yn ynVar = this.f34862a.Q;
        if (ynVar.f43565y0.N) {
            ynVar.kb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        uk ukVar = this.f34862a.Q.f43535va;
        FrameLayout frameLayout = ukVar.G;
        HashMap hashMap = ukVar.f36781f;
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
                    if (((fz) arrayList.get(i11)).f36444p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((fz) arrayList.get(i11)).f36446r.getLottieAnimation() == null || ((fz) arrayList.get(i11)).f36446r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((fz) arrayList.get(i11)).f36445q != null && document != null) {
                        i10 = i11;
                        if (((fz) arrayList.get(i11)).f36445q.f20044id == document.f20044id) {
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
                    if (!fzVar.f36437i) {
                        fzVar.f36435f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        fzVar.f36436g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    fzVar.f36444p = w0Var.getMessageObject().getId();
                    fzVar.f36441m = true;
                    fzVar.f36446r.setAllowStartAnimation(true);
                    int f7 = gz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f20044id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f20044id), Integer.valueOf((intValue + 1) % 4));
                        fzVar.f36446r.setUniqKeyPrefix(intValue + "_" + fzVar.f36444p + "_");
                    }
                    fzVar.f36445q = document;
                    fzVar.f36446r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", ukVar.f36779c, 1);
                    fzVar.f36446r.setLayerNum(Integer.MAX_VALUE);
                    fzVar.f36446r.setAutoRepeat(0);
                    if (fzVar.f36446r.getLottieAnimation() != null) {
                        if (fzVar.h) {
                            fzVar.f36446r.getLottieAnimation().N(0, false, true);
                        }
                        fzVar.f36446r.getLottieAnimation().start();
                    }
                    arrayList.add(fzVar);
                    if (ukVar.f36782n) {
                        fzVar.f36446r.onAttachedToWindow();
                        fzVar.f36446r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        yn ynVar = this.f34862a.Q;
        tg.c0.R(ynVar, str, ynVar.f43563xb);
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
        yn ynVar = this.f34862a.Q;
        t12.K2(null, ynVar, ynVar.f43300ca);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = ynVar.getOrCreateStoryViewer();
            sj sjVar = ynVar.f43526v0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (ynVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(ynVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(sjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.f24263i.f26777q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                ynVar.Fa(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 != null && w0Var.J(messageObject3) && w0Var.f23632p1 != null) {
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
                            yi1Var.f43237g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = yi1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                    ad1 ad1Var = new ad1(wallPaper, ynVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        ad1Var.F1 = z12;
                        ad1Var.E1 = z13;
                        ad1Var.f40072n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    ad1Var.f40077q0 = messageObject;
                    ad1Var.c1(messageObject.getDialogId());
                    ad1Var.f40032a.f40018a = ynVar.f43300ca;
                    ad1Var.f40076p1 = new bd1(ynVar, q6);
                    ynVar.presentFragment(ad1Var);
                    return;
                }
                return;
            }
            ynVar.wb();
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
                    org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
                    y40Var.f33042a = ynVar;
                    y40Var.f();
                    y40Var.f33044c.f32825j0.r0(null, videoSize2, 0L);
                    y40Var.f33043b = new ci.y6(ynVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], ynVar.getUserConfig().getClientUserId(), 7);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = ynVar.getFileLoader();
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
                photoEntry.caption = ynVar.W.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().g2(arrayList2, 0, 1, false, new zl(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(1, ynVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                w40Var.f32463e = z11;
                w40Var.f32461b = ynVar.getMessagesController().getUser(Long.valueOf(ynVar.R5));
                PhotoViewer.t1().x2(w40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), ynVar.Da);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ynVar.Da);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, ynVar.Da);
        }
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        yn ynVar = this.f34862a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.getResourceProvider());
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
            ynVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21059q7));
            }
        }
    }

    @Override
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        yn ynVar = this.f34862a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return ynVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f34862a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void x1(long j3) {
        yn ynVar = this.f34862a.Q;
        int i10 = yn.Bc;
        ynVar.ma(j3);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        yn ynVar = this.f34862a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || ynVar.P1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(ynVar.f43315e)) {
            ynVar.P1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            ynVar.P1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
