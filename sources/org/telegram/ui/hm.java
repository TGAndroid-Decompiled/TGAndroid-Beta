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
public final class hm implements org.telegram.ui.Cells.t0 {
    public final qm f38467a;

    public hm(qm qmVar) {
        this.f38467a = qmVar;
    }

    @Override
    public final void B2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f38467a.Q.Z7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void E1(long j3) {
        eo eoVar = this.f38467a.Q;
        int i10 = eo.Hc;
        eoVar.sa(j3);
    }

    @Override
    public final void F1(org.telegram.ui.Cells.w0 w0Var) {
        eo eoVar = this.f38467a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || eoVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(eoVar.f37246e)) {
            eoVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            eoVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void P1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        eo eoVar = this.f38467a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
            rg.l1 l1Var = new rg.l1(eoVar, i10, eoVar.i(), new rg.k(tL_premiumGiftOption), null, eoVar.f37256ea);
            l1Var.J0 = false;
            l1Var.f47545c0 = w0Var.getMessageObject().isOut();
            eoVar.showDialog(l1Var);
            return;
        }
        b(w0Var);
        of.e eVar = eoVar.Ab;
        tg.g0 g0Var = tg.g0.S0;
        tg.c0.U(LaunchActivity.R(), str, eVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.m2 T0() {
        return this.f38467a.Q;
    }

    @Override
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        eo eoVar = this.f38467a.Q;
        if (eoVar.A0.N) {
            eoVar.pb(false, true, true);
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
        in inVar;
        eo eoVar = this.f38467a.Q;
        of.e eVar = eoVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            inVar = null;
        } else {
            inVar = new in(this, w0Var, 6);
        }
        eoVar.Ab = inVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
        dk dkVar;
        eo eoVar = this.f38467a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        ak akVar = eoVar.f37483x0;
        if (akVar != null && (dkVar = eoVar.f37507z0) != null && dkVar.f47894y < 0) {
            int childCount = akVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = eoVar.f37483x0.getChildAt(childCount);
                eoVar.f37483x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            eoVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        eoVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        eoVar.vc(messageObject, false);
    }

    @Override
    public final long d() {
        return this.f38467a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void i0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        eo eoVar = this.f38467a.Q;
        if (eoVar.A0.N) {
            eoVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final void m1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        cl clVar = this.f38467a.Q.f37493xa;
        FrameLayout frameLayout = clVar.G;
        HashMap hashMap = clVar.f38568f;
        Random random = clVar.h;
        ArrayList arrayList = clVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((gz) arrayList.get(i11)).f38191p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((gz) arrayList.get(i11)).f38193r.getLottieAnimation() == null || ((gz) arrayList.get(i11)).f38193r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((gz) arrayList.get(i11)).f38192q != null && document != null) {
                        i10 = i11;
                        if (((gz) arrayList.get(i11)).f38192q.f19809id == document.f19809id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    gz gzVar = new gz();
                    gzVar.h = true;
                    if (!gzVar.f38184i) {
                        gzVar.f38182f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        gzVar.f38183g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    gzVar.f38191p = w0Var.getMessageObject().getId();
                    gzVar.f38188m = true;
                    gzVar.f38193r.setAllowStartAnimation(true);
                    int f7 = hz.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f19809id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f19809id), Integer.valueOf((intValue + 1) % 4));
                        gzVar.f38193r.setUniqKeyPrefix(intValue + "_" + gzVar.f38191p + "_");
                    }
                    gzVar.f38192q = document;
                    gzVar.f38193r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.l(f7, f7, "_"), null, "tgs", clVar.f38566c, 1);
                    gzVar.f38193r.setLayerNum(Integer.MAX_VALUE);
                    gzVar.f38193r.setAutoRepeat(0);
                    if (gzVar.f38193r.getLottieAnimation() != null) {
                        if (gzVar.h) {
                            gzVar.f38193r.getLottieAnimation().N(0, false, true);
                        }
                        gzVar.f38193r.getLottieAnimation().start();
                    }
                    arrayList.add(gzVar);
                    if (clVar.f38569n) {
                        gzVar.f38193r.onAttachedToWindow();
                        gzVar.f38193r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void n0(org.telegram.ui.Cells.w0 w0Var) {
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
        eo eoVar = this.f38467a.Q;
        t12.K2(null, eoVar, eoVar.f37256ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.kc orCreateStoryViewer = eoVar.getOrCreateStoryViewer();
            ak akVar = eoVar.f37483x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (eoVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(eoVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.v9.a(akVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.J1;
            if (radialProgress2 != null && radialProgress2.f24044i.f33024q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                eoVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.P0;
            if (messageObject3 != null && w0Var.O(messageObject3) && w0Var.f23411x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        jj1 jj1Var = new jj1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = jj1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            jj1Var.f39232g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = jj1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    id1 id1Var = new id1(wallPaper, eoVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        id1Var.F1 = z12;
                        id1Var.E1 = z13;
                        id1Var.f44774n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    id1Var.f44779q0 = messageObject;
                    id1Var.c1(messageObject.getDialogId());
                    id1Var.f44734a.f44719a = eoVar.f37256ea;
                    id1Var.f44778p1 = new jd1(eoVar, q6);
                    eoVar.presentFragment(id1Var);
                    return;
                }
                return;
            }
            eoVar.Bb();
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
                    org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(0, true, true);
                    p50Var.f29381a = eoVar;
                    p50Var.e();
                    p50Var.f29383c.f24350j0.r0(null, videoSize2, 0L);
                    p50Var.f29382b = new ci.y6(eoVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], eoVar.getUserConfig().getClientUserId(), 7);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = eoVar.getFileLoader();
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
                photoEntry.caption = eoVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().g2(arrayList2, 0, 1, false, new gm(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.n50 n50Var = new org.telegram.ui.Components.n50(1, eoVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                n50Var.f28726e = z11;
                n50Var.f28724b = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.T5));
                PhotoViewer.t1().x2(n50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), eoVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), eoVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, eoVar.Ga);
        }
    }

    @Override
    public final void n2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        eo eoVar = this.f38467a.Q;
        tg.c0.U(eoVar, str, eoVar.Ab);
    }

    @Override
    public final void v0(org.telegram.ui.Cells.w0 w0Var) {
        eo eoVar = this.f38467a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.getResourceProvider());
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
            eoVar.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7));
            }
        }
    }

    @Override
    public final boolean y2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        eo eoVar = this.f38467a.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) eoVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return eoVar.L7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
